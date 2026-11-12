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
    private void a(cm cm2, SoundList soundList) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }{ /* RISE-PORT STUB: initializer unrestored */ }
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

    public SoundEventAccessorComposite d(cm cm2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    public void a(ISound iSound) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public void a(ISound iSound, int n2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public void b(net.minecraft.entity.player.a a2, float f2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public void Cz() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public void CA() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public void CB() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    @Override
    public void jA() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public void CC() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public void a(SoundCategory soundCategory, float f2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public void b(ISound iSound) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public SoundEventAccessorComposite a(SoundCategory ... soundCategoryArray) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    public boolean c(ISound iSound) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return false;
    }
}

