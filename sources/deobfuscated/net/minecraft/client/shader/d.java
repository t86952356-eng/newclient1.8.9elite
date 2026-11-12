/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 */
package net.minecraft.client.shader;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.a;
import net.minecraft.client.shader.b;
import net.minecraft.client.shader.i;
import net.minecraft.util.bn;
import net.minecraft.util.cm;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

public class d {
    private final a cmu;
    private final IResourceManager cmv;
    private final String cmw;
    private final List<b> cmx = Lists.newArrayList();
    private final Map<String, a> cmy = Maps.newHashMap();
    private final List<a> cmz = Lists.newArrayList();
    private Matrix4f cmr;
    private int cmA;
    private int cmB;
    private float cmC;
    private float cmD;

    public d(TextureManager textureManager, IResourceManager iResourceManager, a a2, cm cm2) {
        this.cmv = iResourceManager;
        this.cmu = a2;
        this.cmC = 0.0f;
        this.cmD = 0.0f;
        this.cmA = a2.cmc;
        this.cmB = a2.cmd;
        this.cmw = cm2.toString();
        this.Ru();
        this.a(textureManager, cm2);
    }

    public void a(TextureManager textureManager, cm cm2) {
        InputStream inputStream;
        block11: {
            JsonParser jsonParser = new JsonParser();
            inputStream = null;
            try {
                int n2;
                JsonArray jsonArray;
                IResource iResource = this.cmv.v(cm2);
                inputStream = iResource.getInputStream();
                JsonObject jsonObject = jsonParser.parse(IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8)).getAsJsonObject();
                if (bn.j(jsonObject, "targets")) {
                    jsonArray = jsonObject.getAsJsonArray("targets");
                    n2 = 0;
                    for (JsonElement jsonElement : jsonArray) {
                        try {
                            this.a(jsonElement);
                        }
                        catch (Exception exception) {
                            net.minecraft.client.util.b b2 = net.minecraft.client.util.b.a(exception);
                            b2.dJ("targets[" + n2 + "]");
                            throw b2;
                        }
                        ++n2;
                    }
                }
                if (!bn.j(jsonObject, "passes")) break block11;
                jsonArray = jsonObject.getAsJsonArray("passes");
                n2 = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.a(textureManager, jsonElement);
                    }
                    catch (Exception exception) {
                        net.minecraft.client.util.b b3 = net.minecraft.client.util.b.a(exception);
                        b3.dJ("passes[" + n2 + "]");
                        throw b3;
                    }
                    ++n2;
                }
            }
            catch (Exception exception) {
                try {
                    net.minecraft.client.util.b b4 = net.minecraft.client.util.b.a(exception);
                    b4.dK(cm2.atA());
                    throw b4;
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(inputStream);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
    }

    private void a(JsonElement jsonElement) {
        if (bn.f(jsonElement)) {
            this.g(jsonElement.getAsString(), this.cmA, this.cmB);
        } else {
            JsonObject jsonObject = bn.e(jsonElement, "target");
            String string = bn.m(jsonObject, "name");
            int n2 = bn.a(jsonObject, "width", this.cmA);
            int n3 = bn.a(jsonObject, "height", this.cmB);
            if (this.cmy.containsKey(string)) {
                throw new net.minecraft.client.util.b(string + " is already defined");
            }
            this.g(string, n2, n3);
        }
    }

    private void a(TextureManager textureManager, JsonElement jsonElement) {
        JsonArray jsonArray;
        Object object;
        JsonObject jsonObject = bn.e(jsonElement, "pass");
        String string = bn.m(jsonObject, "name");
        String string2 = bn.m(jsonObject, "intarget");
        String string3 = bn.m(jsonObject, "outtarget");
        a a2 = this.dD(string2);
        a a3 = this.dD(string3);
        if (a2 == null) {
            throw new net.minecraft.client.util.b("Input target '" + string2 + "' does not exist");
        }
        if (a3 == null) {
            throw new net.minecraft.client.util.b("Output target '" + string3 + "' does not exist");
        }
        b b2 = this.a(string, a2, a3);
        JsonArray jsonArray2 = bn.a(jsonObject, "auxtargets", null);
        if (jsonArray2 != null) {
            int n2 = 0;
            for (Object object2 : jsonArray2) {
                block15: {
                    Object object3;
                    try {
                        JsonObject jsonObject2 = bn.e((JsonElement)object2, "auxtarget");
                        object3 = bn.m(jsonObject2, "name");
                        object = bn.m(jsonObject2, "id");
                        a a4 = this.dD((String)object);
                        if (a4 == null) {
                            cm cm2 = new cm("textures/effect/" + (String)object + ".png");
                            try {
                                this.cmv.v(cm2);
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                throw new net.minecraft.client.util.b("Render target or texture '" + (String)object + "' does not exist");
                            }
                            textureManager.a(cm2);
                            ITextureObject iTextureObject = textureManager.k(cm2);
                            int n3 = bn.p(jsonObject2, "width");
                            int n4 = bn.p(jsonObject2, "height");
                            boolean bl2 = bn.n(jsonObject2, "bilinear");
                            if (bl2) {
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                            } else {
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
                            }
                            b2.a((String)object3, iTextureObject.Ll(), n3, n4);
                            break block15;
                        }
                        b2.a((String)object3, a4, a4.cma, a4.cmb);
                    }
                    catch (Exception exception) {
                        object3 = net.minecraft.client.util.b.a(exception);
                        ((net.minecraft.client.util.b)object3).dJ("auxtargets[" + n2 + "]");
                        throw object3;
                    }
                }
                ++n2;
            }
        }
        if ((jsonArray = bn.a(jsonObject, "uniforms", null)) != null) {
            int n5 = 0;
            for (JsonObject jsonObject2 : jsonArray) {
                try {
                    this.b((JsonElement)jsonObject2);
                }
                catch (Exception exception) {
                    object = net.minecraft.client.util.b.a(exception);
                    ((net.minecraft.client.util.b)object).dJ("uniforms[" + n5 + "]");
                    throw object;
                }
                ++n5;
            }
        }
    }

    private void b(JsonElement jsonElement) {
        JsonObject jsonObject = bn.e(jsonElement, "uniform");
        String string = bn.m(jsonObject, "name");
        i i2 = this.cmx.get(this.cmx.size() - 1).Rs().dE(string);
        if (i2 == null) {
            throw new net.minecraft.client.util.b("Uniform '" + string + "' does not exist");
        }
        float[] fArray = new float[4];
        int n2 = 0;
        for (JsonElement jsonElement2 : bn.r(jsonObject, "values")) {
            try {
                fArray[n2] = bn.c(jsonElement2, "value");
            }
            catch (Exception exception) {
                net.minecraft.client.util.b b2 = net.minecraft.client.util.b.a(exception);
                b2.dJ("values[" + n2 + "]");
                throw b2;
            }
            ++n2;
        }
        switch (n2) {
            default: {
                break;
            }
            case 1: {
                i2.aN(fArray[0]);
                break;
            }
            case 2: {
                i2.n(fArray[0], fArray[1]);
                break;
            }
            case 3: {
                i2.r(fArray[0], fArray[1], fArray[2]);
                break;
            }
            case 4: {
                i2.j(fArray[0], fArray[1], fArray[2], fArray[3]);
            }
        }
    }

    public a dC(String string) {
        return this.cmy.get(string);
    }

    public void g(String string, int n2, int n3) {
        a a2 = new a(n2, n3, true);
        a2.i(0.0f, 0.0f, 0.0f, 0.0f);
        this.cmy.put(string, a2);
        if (n2 == this.cmA && n3 == this.cmB) {
            this.cmz.add(a2);
        }
    }

    public void Rt() {
        for (a object : this.cmy.values()) {
            object.Rk();
        }
        for (b b2 : this.cmx) {
            b2.Rq();
        }
        this.cmx.clear();
    }

    public b a(String string, a a2, a a3) {
        b b2 = new b(this.cmv, string, a2, a3);
        this.cmx.add(this.cmx.size(), b2);
        return b2;
    }

    private void Ru() {
        this.cmr = new Matrix4f();
        this.cmr.setIdentity();
        this.cmr.m00 = 2.0f / (float)this.cmu.cma;
        this.cmr.m11 = 2.0f / (float)(-this.cmu.cmb);
        this.cmr.m22 = -0.0020001999f;
        this.cmr.m33 = 1.0f;
        this.cmr.m03 = -1.0f;
        this.cmr.m13 = 1.0f;
        this.cmr.m23 = -1.0001999f;
    }

    public void al(int n2, int n3) {
        this.cmA = this.cmu.cma;
        this.cmB = this.cmu.cmb;
        this.Ru();
        for (b object : this.cmx) {
            object.a(this.cmr);
        }
        for (a a2 : this.cmz) {
            a2.ai(n2, n3);
        }
    }

    public void aO(float f2) {
        if (f2 < this.cmD) {
            this.cmC += 1.0f - this.cmD;
            this.cmC += f2;
        } else {
            this.cmC += f2 - this.cmD;
        }
        this.cmD = f2;
        while (this.cmC > 20.0f) {
            this.cmC -= 20.0f;
        }
        for (b b2 : this.cmx) {
            b2.aM(this.cmC / 20.0f);
        }
    }

    public final String Rv() {
        return this.cmw;
    }

    private a dD(String string) {
        return string == null ? null : (string.equals("minecraft:main") ? this.cmu : this.cmy.get(string));
    }
}

