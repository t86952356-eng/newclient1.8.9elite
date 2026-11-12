/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  io.netty.util.internal.ThreadLocalRandom
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemException
 *  paulscode.sound.SoundSystemLogger
 *  paulscode.sound.libraries.LibraryLWJGLOpenAL
 */
package net.minecraft.client.audio;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import io.netty.util.internal.ThreadLocalRandom;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.audio.CodecMonoToStereo;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.ITickableSound;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundManager$1;
import net.minecraft.client.audio.SoundManager$2;
import net.minecraft.client.audio.SoundManager$SoundSystemStarterThread;
import net.minecraft.client.audio.SoundPoolEntry;
import net.minecraft.client.settings.a;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class SoundManager {
    private static final Marker bjx = MarkerManager.getMarker((String)"SOUNDS");
    private static final Logger bjy = LogManager.getLogger();
    private final SoundHandler bjz;
    private final a bjA;
    private SoundManager$SoundSystemStarterThread bjB;
    private boolean loaded;
    private int bjC = 0;
    private final Map<String, ISound> bjD = HashBiMap.create();
    private final Map<ISound, String> bjE = ((BiMap)this.bjD).inverse();
    private final Map<ISound, SoundPoolEntry> bjF = Maps.newHashMap();
    private final Multimap<SoundCategory, String> bjG = HashMultimap.create();
    private final List<ITickableSound> bjH = Lists.newArrayList();
    private final Map<ISound, Integer> bjI = Maps.newHashMap();
    private final Map<String, Integer> bjJ = Maps.newHashMap();

    public SoundManager(SoundHandler soundHandler, a a2) {
        this.bjz = soundHandler;
        this.bjA = a2;
        try {
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec((String)"ogg", CodecMonoToStereo.class);
        }
        catch (SoundSystemException soundSystemException) {
            bjy.error(bjx, "Error linking with the LibraryJavaSound plug-in", (Throwable)soundSystemException);
        }
    }

    public void CM() {
        this.CO();
        this.CN();
    }

    private synchronized void CN() {
        if (!this.loaded) {
            try {
                new Thread(() -> {
                    SoundSystemConfig.setLogger((SoundSystemLogger)new SoundManager$1(this));
                    this.bjB = new SoundManager$SoundSystemStarterThread(this);
                    this.loaded = true;
                    this.bjB.setMasterVolume(this.bjA.d(SoundCategory.biH));
                    bjy.info(bjx, "Sound engine started");
                }, "Sound Library Loader").start();
            }
            catch (RuntimeException runtimeException) {
                bjy.error(bjx, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
                this.bjA.a(SoundCategory.biH, 0.0f);
                this.bjA.QK();
            }
        }
    }

    private float b(SoundCategory soundCategory) {
        return soundCategory != null && soundCategory != SoundCategory.biH ? this.bjA.d(soundCategory) : 1.0f;
    }

    public void b(SoundCategory soundCategory, float f2) {
        if (this.loaded) {
            if (soundCategory == SoundCategory.biH) {
                this.bjB.setMasterVolume(f2);
            } else {
                for (String string : this.bjG.get((Object)soundCategory)) {
                    ISound iSound = this.bjD.get(string);
                    float f3 = this.a(iSound, this.bjF.get(iSound), soundCategory);
                    if (f3 <= 0.0f) {
                        this.b(iSound);
                        continue;
                    }
                    this.bjB.setVolume(string, f3);
                }
            }
        }
    }

    public void CO() {
        if (this.loaded) {
            this.CP();
            this.bjB.cleanup();
            this.loaded = false;
        }
    }

    public void CP() {
        if (this.loaded) {
            for (String string : this.bjD.keySet()) {
                this.bjB.stop(string);
            }
            this.bjD.clear();
            this.bjI.clear();
            this.bjH.clear();
            this.bjG.clear();
            this.bjF.clear();
            this.bjJ.clear();
        }
    }

    public void CQ() {
        ISound iSound;
        Map.Entry<ISound, Integer> entry;
        ++this.bjC;
        for (ITickableSound iterator2 : this.bjH) {
            iterator2.jA();
            if (iterator2.Cn()) {
                this.b(iterator2);
                continue;
            }
            entry = this.bjE.get(iterator2);
            this.bjB.setVolume((String)((Object)entry), this.a(iterator2, this.bjF.get(iterator2), this.bjz.d(iterator2.Cc()).Cy()));
            this.bjB.setPitch((String)((Object)entry), this.a((ISound)iterator2, this.bjF.get(iterator2)));
            this.bjB.setPosition((String)((Object)entry), iterator2.Cf(), iterator2.Cg(), iterator2.Ch());
        }
        Iterator<Object> iterator3 = this.bjD.entrySet().iterator();
        try {
            while (iterator3.hasNext()) {
                int n2;
                Map.Entry entry2 = (Map.Entry)iterator3.next();
                entry = (String)entry2.getKey();
                iSound = (ISound)entry2.getValue();
                if (this.bjB.playing((String)((Object)entry)) || (n2 = this.bjJ.get(entry).intValue()) > this.bjC) continue;
                int n3 = iSound.Ce();
                if (iSound.Cd() && n3 > 0) {
                    this.bjI.put(iSound, this.bjC + n3);
                }
                iterator3.remove();
                bjy.debug(bjx, "Removed channel {} because it's not playing anymore", new Object[]{entry});
                this.bjB.removeSource((String)((Object)entry));
                this.bjJ.remove(entry);
                this.bjF.remove(iSound);
                try {
                    this.bjG.remove((Object)this.bjz.d(iSound.Cc()).Cy(), (Object)entry);
                }
                catch (RuntimeException runtimeException) {
                    // empty catch block
                }
                if (!(iSound instanceof ITickableSound)) continue;
                this.bjH.remove(iSound);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        Iterator<Map.Entry<ISound, Integer>> iterator = this.bjI.entrySet().iterator();
        while (iterator.hasNext()) {
            entry = iterator.next();
            if (this.bjC < (Integer)entry.getValue()) continue;
            iSound = (ISound)entry.getKey();
            if (iSound instanceof ITickableSound) {
                ((ITickableSound)iSound).jA();
            }
            this.a(iSound);
            iterator.remove();
        }
    }

    public boolean c(ISound iSound) {
        if (!this.loaded) {
            return false;
        }
        String string = this.bjE.get(iSound);
        return string != null && (this.bjB.playing(string) || this.bjJ.containsKey(string) && this.bjJ.get(string) <= this.bjC);
    }

    public void b(ISound iSound) {
        String string;
        if (this.loaded && (string = this.bjE.get(iSound)) != null) {
            this.bjB.stop(string);
        }
    }

    public void a(ISound iSound) {
        if (this.loaded) {
            if (this.bjB.getMasterVolume() <= 0.0f) {
                bjy.debug(bjx, "Skipped playing soundEvent: {}, master volume was zero", new Object[]{iSound.Cc()});
            } else {
                SoundEventAccessorComposite soundEventAccessorComposite = this.bjz.d(iSound.Cc());
                if (soundEventAccessorComposite == null) {
                    bjy.warn(bjx, "Unable to play unknown soundEvent: {}", new Object[]{iSound.Cc()});
                } else {
                    SoundPoolEntry soundPoolEntry = soundEventAccessorComposite.Cw();
                    if (soundPoolEntry != SoundHandler.bjg) {
                        float f2 = iSound.getVolume();
                        float f3 = 16.0f;
                        if (f2 > 1.0f) {
                            f3 *= f2;
                        }
                        SoundCategory soundCategory = soundEventAccessorComposite.Cy();
                        float f4 = this.a(iSound, soundPoolEntry, soundCategory);
                        double d2 = this.a(iSound, soundPoolEntry);
                        cm cm2 = soundPoolEntry.CU();
                        if (f4 == 0.0f) {
                            bjy.debug(bjx, "Skipped playing sound {}, volume was zero.", new Object[]{cm2});
                        } else {
                            boolean bl2 = iSound.Cd() && iSound.Ce() == 0;
                            String string = bt.h((Random)ThreadLocalRandom.current()).toString();
                            if (soundPoolEntry.CW()) {
                                this.bjB.newStreamingSource(false, string, SoundManager.e(cm2), cm2.toString(), bl2, iSound.Cf(), iSound.Cg(), iSound.Ch(), iSound.Ci().Cj(), f3);
                            } else {
                                this.bjB.newSource(false, string, SoundManager.e(cm2), cm2.toString(), bl2, iSound.Cf(), iSound.Cg(), iSound.Ch(), iSound.Ci().Cj(), f3);
                            }
                            bjy.debug(bjx, "Playing sound {} for event {} as channel {}", new Object[]{soundPoolEntry.CU(), soundEventAccessorComposite.Cx(), string});
                            this.bjB.setPitch(string, (float)d2);
                            this.bjB.setVolume(string, f4);
                            this.bjB.play(string);
                            this.bjJ.put(string, this.bjC + 20);
                            this.bjD.put(string, iSound);
                            this.bjF.put(iSound, soundPoolEntry);
                            if (soundCategory != SoundCategory.biH) {
                                this.bjG.put((Object)soundCategory, (Object)string);
                            }
                            if (iSound instanceof ITickableSound) {
                                this.bjH.add((ITickableSound)iSound);
                            }
                        }
                    }
                }
            }
        }
    }

    private float a(ISound iSound, SoundPoolEntry soundPoolEntry) {
        return (float)bt.ah((double)iSound.getPitch() * soundPoolEntry.ax(), 0.5, 2.0);
    }

    private float a(ISound iSound, SoundPoolEntry soundPoolEntry, SoundCategory soundCategory) {
        return (float)bt.ah((double)iSound.getVolume() * soundPoolEntry.CV(), 0.0, 1.0) * this.b(soundCategory);
    }

    public void CR() {
        for (String string : this.bjD.keySet()) {
            bjy.debug(bjx, "Pausing channel {}", new Object[]{string});
            this.bjB.pause(string);
        }
    }

    public void CS() {
        for (String string : this.bjD.keySet()) {
            bjy.debug(bjx, "Resuming channel {}", new Object[]{string});
            this.bjB.play(string);
        }
    }

    public void a(ISound iSound, int n2) {
        this.bjI.put(iSound, this.bjC + n2);
    }

    private static URL e(cm cm2) {
        String string = String.format("%s:%s:%s", "mcsounddomain", cm2.atB(), cm2.atA());
        SoundManager$2 soundManager$2 = new SoundManager$2(cm2);
        try {
            return new URL(null, string, soundManager$2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }

    public void b(net.minecraft.entity.player.a a2, float f2) {
        if (this.loaded && a2 != null) {
            float f3 = a2.crO + (a2.pm - a2.crO) * f2;
            float f4 = a2.crM + (a2.pl - a2.crM) * f2;
            double d2 = a2.crF + (a2.gW - a2.crF) * (double)f2;
            double d3 = a2.crG + (a2.gX - a2.crG) * (double)f2 + (double)a2.getEyeHeight();
            double d4 = a2.crH + (a2.gY - a2.crH) * (double)f2;
            float f5 = bt.bB((f4 + 90.0f) * ((float)Math.PI / 180));
            float f6 = bt.bx((f4 + 90.0f) * ((float)Math.PI / 180));
            float f7 = bt.bB(-f3 * ((float)Math.PI / 180));
            float f8 = bt.bx(-f3 * ((float)Math.PI / 180));
            float f9 = bt.bB((-f3 + 90.0f) * ((float)Math.PI / 180));
            float f10 = bt.bx((-f3 + 90.0f) * ((float)Math.PI / 180));
            float f11 = f5 * f7;
            float f12 = f6 * f7;
            float f13 = f5 * f9;
            float f14 = f6 * f9;
            this.bjB.setListenerPosition((float)d2, (float)d3, (float)d4);
            this.bjB.setListenerOrientation(f11, f8, f12, f13, f10, f14);
        }
    }
}

