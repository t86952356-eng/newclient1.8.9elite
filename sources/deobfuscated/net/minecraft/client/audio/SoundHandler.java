/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.client.audio;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundEventAccessor;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.SoundHandler$1;
import net.minecraft.client.audio.SoundHandler$2;
import net.minecraft.client.audio.SoundList;
import net.minecraft.client.audio.SoundList$SoundEntry;
import net.minecraft.client.audio.SoundList$SoundEntry$Type;
import net.minecraft.client.audio.SoundListSerializer;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.client.audio.SoundPoolEntry;
import net.minecraft.client.audio.SoundRegistry;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.settings.a;
import net.minecraft.util.bi;
import net.minecraft.util.cm;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SoundHandler
implements IResourceManagerReloadListener,
bi {
    private static final Logger bjd = LogManager.getLogger();
    private static final Gson bje = new GsonBuilder().registerTypeAdapter(SoundList.class, (Object)new SoundListSerializer()).create();
    private static final ParameterizedType bjf = new SoundHandler$1();
    public static final SoundPoolEntry bjg = new SoundPoolEntry(new cm("meta:missing_sound"), 0.0, 0.0, false);
    private final SoundRegistry bjh = new SoundRegistry();
    private final SoundManager bji;
    private final IResourceManager bjj;

    public SoundHandler(IResourceManager iResourceManager, a a2) {
        this.bjj = iResourceManager;
        this.bji = new SoundManager(this, a2);
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        this.bji.CM();
        this.bjh.CY();
        for (String string : iResourceManager.Ph()) {
            try {
                for (IResource iResource : iResourceManager.w(new cm(string, "sounds.json"))) {
                    try {
                        Map<String, SoundList> map = this.c(iResource.getInputStream());
                        for (Map.Entry<String, SoundList> entry : map.entrySet()) {
                            this.a(new cm(string, entry.getKey()), entry.getValue());
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        bjd.warn("Invalid sounds.json", (Throwable)runtimeException);
                    }
                }
            }
            catch (IOException iOException) {
            }
        }
    }

    protected Map<String, SoundList> c(InputStream inputStream) {
        Map map;
        try {
            map = (Map)bje.fromJson((Reader)new InputStreamReader(inputStream), (Type)bjf);
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        return map;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(cm cm2, SoundList soundList) {
        SoundEventAccessorComposite soundEventAccessorComposite;
        boolean bl2;
        boolean bl3 = bl2 = !this.bjh.containsKey(cm2);
        if (!bl2 && !soundList.CE()) {
            soundEventAccessorComposite = (SoundEventAccessorComposite)this.bjh.w(cm2);
        } else {
            if (!bl2) {
                bjd.debug("Replaced sound event location {}", new Object[]{cm2});
            }
            soundEventAccessorComposite = new SoundEventAccessorComposite(cm2, 1.0, 1.0, soundList.Cy());
            this.bjh.a(soundEventAccessorComposite);
        }
        block10: for (SoundList$SoundEntry soundList$SoundEntry : soundList.CD()) {
            String string = soundList$SoundEntry.CF();
            cm cm3 = new cm(string);
            String string2 = string.contains(":") ? cm3.atB() : cm2.atB();
            soundEventAccessorComposite.a(switch (soundList$SoundEntry.CJ()) {
                case SoundList$SoundEntry$Type.bjt -> {
                    cm var11_11 = new cm(string2, "sounds/" + cm3.atA() + ".ogg");
                    InputStream var12_12 = null;
                    try {
                        var12_12 = this.bjj.v(var11_11).getInputStream();
                    }
                    catch (FileNotFoundException var13_14) {
                        bjd.warn("File {} does not exist, cannot add it to event {}", new Object[]{var11_11, cm2});
                        IOUtils.closeQuietly((InputStream)var12_12);
                        continue block10;
                    }
                    catch (IOException var13_15) {
                        bjd.warn("Could not load sound file " + String.valueOf(var11_11) + ", cannot add it to event " + String.valueOf(cm2), (Throwable)var13_15);
                        {
                            catch (Throwable var14_16) {
                                IOUtils.closeQuietly(var12_12);
                                throw var14_16;
                            }
                        }
                        IOUtils.closeQuietly((InputStream)var12_12);
                        continue block10;
                    }
                    IOUtils.closeQuietly((InputStream)var12_12);
                    yield new SoundEventAccessor(new SoundPoolEntry(var11_11, soundList$SoundEntry.CH(), soundList$SoundEntry.CG(), soundList$SoundEntry.CK()), soundList$SoundEntry.CI());
                }
                case SoundList$SoundEntry$Type.bju -> new SoundHandler$2(this, string2, soundList$SoundEntry);
                default -> throw new IllegalStateException("IN YOU FACE");
            });
        }
    }

    public SoundEventAccessorComposite d(cm cm2) {
        return (SoundEventAccessorComposite)this.bjh.w(cm2);
    }

    public void a(ISound iSound) {
        this.bji.a(iSound);
    }

    public void a(ISound iSound, int n2) {
        this.bji.a(iSound, n2);
    }

    public void b(net.minecraft.entity.player.a a2, float f2) {
        this.bji.b(a2, f2);
    }

    public void Cz() {
        this.bji.CR();
    }

    public void CA() {
        this.bji.CP();
    }

    public void CB() {
        this.bji.CO();
    }

    @Override
    public void jA() {
        this.bji.CQ();
    }

    public void CC() {
        this.bji.CS();
    }

    public void a(SoundCategory soundCategory, float f2) {
        if (soundCategory == SoundCategory.biH && f2 <= 0.0f) {
            this.CA();
        }
        this.bji.b(soundCategory, f2);
    }

    public void b(ISound iSound) {
        this.bji.b(iSound);
    }

    public SoundEventAccessorComposite a(SoundCategory ... soundCategoryArray) {
        ArrayList arrayList = Lists.newArrayList();
        for (cm cm2 : this.bjh.aty()) {
            SoundEventAccessorComposite soundEventAccessorComposite = (SoundEventAccessorComposite)this.bjh.w(cm2);
            if (!ArrayUtils.contains((Object[])soundCategoryArray, (Object)((Object)soundEventAccessorComposite.Cy()))) continue;
            arrayList.add(soundEventAccessorComposite);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (SoundEventAccessorComposite)arrayList.get(new Random().nextInt(arrayList.size()));
    }

    public boolean c(ISound iSound) {
        return this.bji.c(iSound);
    }
}

