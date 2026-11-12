/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.texture;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.client.renderer.texture.ITickableTextureObject;
import net.minecraft.client.renderer.texture.LayeredColorMaskTexture;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.crash.i;
import net.minecraft.src.a;
import net.minecraft.util.cl;
import net.minecraft.util.cm;
import net.optifine.ac;
import net.optifine.aq;
import net.optifine.bd;
import net.optifine.shaders.ak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextureManager
implements ITickable,
IResourceManagerReloadListener {
    private static final Logger bZw = LogManager.getLogger();
    private final Map<cm, ITextureObject> bZx = Maps.newHashMap();
    private final List<ITickable> bZy = Lists.newArrayList();
    public final Map<String, Integer> bZz = Maps.newHashMap();
    private final IResourceManager bZA;

    public TextureManager(IResourceManager iResourceManager) {
        this.bZA = iResourceManager;
    }

    public void a(cm cm2) {
        if (a.aou()) {
            cm2 = bd.I(cm2);
        }
        if (a.ape()) {
            cm2 = ac.I(cm2);
        }
        ITextureObject iTextureObject = this.bZx.get(cm2);
        if (aq.bd()) {
            iTextureObject = aq.a(iTextureObject, this.bZx);
        }
        if (iTextureObject == null) {
            iTextureObject = new SimpleTexture(cm2);
            this.a(cm2, iTextureObject);
        }
        if (a.aoG()) {
            ak.b(iTextureObject);
        } else {
            TextureUtil.ap(iTextureObject.Ll());
        }
    }

    public void dz(int n2) {
        TextureUtil.ap(n2);
    }

    public boolean a(cm cm2, ITickableTextureObject iTickableTextureObject) {
        if (this.a(cm2, (ITextureObject)iTickableTextureObject)) {
            this.bZy.add(iTickableTextureObject);
            return true;
        }
        return false;
    }

    public boolean a(cm cm2, ITextureObject iTextureObject) {
        boolean bl2 = true;
        try {
            iTextureObject.b(this.bZA);
        }
        catch (IOException iOException) {
            bZw.warn("Failed to load texture: " + String.valueOf(cm2), (Throwable)iOException);
            iTextureObject = TextureUtil.cac;
            this.bZx.put(cm2, iTextureObject);
            bl2 = false;
        }
        catch (Throwable throwable) {
            ITextureObject iTextureObject2 = iTextureObject;
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Registering texture");
            i i2 = a2.dY("Resource location being registered");
            i2.b("Resource location", cm2);
            i2.a("Texture object class", () -> iTextureObject2.getClass().getName());
            throw new cl(a2);
        }
        this.bZx.put(cm2, iTextureObject);
        return bl2;
    }

    public ITextureObject k(cm cm2) {
        return this.bZx.get(cm2);
    }

    public cm a(String string, DynamicTexture dynamicTexture) {
        Integer n2;
        if (string.equals("logo")) {
            dynamicTexture = a.a(dynamicTexture);
        }
        n2 = (n2 = this.bZz.get(string)) == null ? Integer.valueOf(1) : Integer.valueOf(n2 + 1);
        this.bZz.put(string, n2);
        cm cm2 = new cm(String.format("dynamic/%s_%d", string, n2));
        this.a(cm2, (ITextureObject)dynamicTexture);
        return cm2;
    }

    @Override
    public void tick() {
        for (ITickable iTickable : this.bZy) {
            iTickable.tick();
        }
    }

    public void l(cm cm2) {
        ITextureObject iTextureObject = this.k(cm2);
        if (iTextureObject != null) {
            this.bZx.remove(cm2);
            TextureUtil.cO(iTextureObject.Ll());
        }
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        Object object;
        a.fN("*** Reloading textures ***");
        a.fO("Resource packs: " + a.anP());
        Iterator<cm> iterator = this.bZx.keySet().iterator();
        while (iterator.hasNext()) {
            cm cm2 = iterator.next();
            String string = cm2.atA();
            if (!string.startsWith("mcpatcher/") && !string.startsWith("optifine/") && !aq.K(cm2)) continue;
            object = this.bZx.get(cm2);
            if (object instanceof AbstractTexture) {
                AbstractTexture abstractTexture = (AbstractTexture)object;
                abstractTexture.NJ();
            }
            iterator.remove();
        }
        aq.jA();
        for (Object e2 : new HashSet<Map.Entry<cm, ITextureObject>>(this.bZx.entrySet())) {
            object = (Map.Entry)e2;
            this.a((cm)object.getKey(), (ITextureObject)object.getValue());
        }
    }

    public void Or() {
        Iterator<Map.Entry<cm, ITextureObject>> iterator = new HashSet<Map.Entry<cm, ITextureObject>>(this.bZx.entrySet()).iterator();
        while (iterator.hasNext()) {
            Map.Entry<cm, ITextureObject> entry;
            Map.Entry<cm, ITextureObject> entry2 = entry = iterator.next();
            cm cm2 = entry2.getKey();
            ITextureObject iTextureObject = entry2.getValue();
            if (!(iTextureObject instanceof LayeredColorMaskTexture)) continue;
            this.a(cm2, iTextureObject);
        }
    }
}

