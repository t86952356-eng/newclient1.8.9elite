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
 */
package net.minecraft.client.shader;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.a;
import net.minecraft.client.shader.c;
import net.minecraft.client.shader.e;
import net.minecraft.client.shader.f;
import net.minecraft.client.shader.g;
import net.minecraft.client.shader.i;
import net.minecraft.client.util.b;
import net.minecraft.util.bn;
import net.minecraft.util.cm;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h {
    private static final Logger cmR = LogManager.getLogger();
    private static final c cmS = new c();
    private static h cmT = null;
    private static int cmU = -1;
    private static boolean cmV = true;
    private final Map<String, Object> cmW = Maps.newHashMap();
    private final List<String> cmX = Lists.newArrayList();
    private final List<Integer> cmY = Lists.newArrayList();
    private final List<i> cmZ = Lists.newArrayList();
    private final List<Integer> cna = Lists.newArrayList();
    private final Map<String, i> cnb = Maps.newHashMap();
    private final int cnc;
    private final String cnd;
    private final boolean cne;
    private boolean cnf;
    private final net.minecraft.client.util.a cng;
    private final List<Integer> cnh;
    private final List<String> cni;
    private final f cnj;
    private final f cnk;

    public h(IResourceManager iResourceManager, String string) {
        JsonParser jsonParser = new JsonParser();
        cm cm2 = new cm("shaders/program/" + string + ".json");
        this.cnd = string;
        InputStream inputStream = null;
        try {
            JsonArray jsonArray;
            JsonArray jsonArray2;
            inputStream = iResourceManager.v(cm2).getInputStream();
            JsonObject jsonObject = jsonParser.parse(IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8)).getAsJsonObject();
            String string2 = bn.m(jsonObject, "vertex");
            String string3 = bn.m(jsonObject, "fragment");
            JsonArray jsonArray3 = bn.a(jsonObject, "samplers", null);
            if (jsonArray3 != null) {
                int n2 = 0;
                for (Object object : jsonArray3) {
                    try {
                        this.c((JsonElement)object);
                    }
                    catch (Exception exception) {
                        b b2 = b.a(exception);
                        b2.dJ("samplers[" + n2 + "]");
                        throw b2;
                    }
                    ++n2;
                }
            }
            if ((jsonArray2 = bn.a(jsonObject, "attributes", null)) != null) {
                int n3 = 0;
                this.cnh = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                this.cni = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                for (JsonElement object : jsonArray2) {
                    try {
                        this.cni.add(bn.a(object, "attribute"));
                    }
                    catch (Exception exception) {
                        b b3 = b.a(exception);
                        b3.dJ("attributes[" + n3 + "]");
                        throw b3;
                    }
                    ++n3;
                }
            } else {
                this.cnh = null;
                this.cni = null;
            }
            if ((jsonArray = bn.a(jsonObject, "uniforms", null)) != null) {
                int n4 = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.d(jsonElement);
                    }
                    catch (Exception exception) {
                        b b4 = b.a(exception);
                        b4.dJ("uniforms[" + n4 + "]");
                        throw b4;
                    }
                    ++n4;
                }
            }
            this.cng = net.minecraft.client.util.a.w(bn.a(jsonObject, "blend", null));
            this.cne = bn.a(jsonObject, "cull", true);
            this.cnj = f.a(iResourceManager, g.cmK, string2);
            this.cnk = f.a(iResourceManager, g.cmL, string3);
            this.cnc = e.Rx().Ry();
            e.Rx().b(this);
            this.RH();
            if (this.cni != null) {
                for (String string4 : this.cni) {
                    int n2 = OpenGlHelper.b(this.cnc, string4);
                    this.cnh.add(n2);
                }
            }
        }
        catch (Exception exception) {
            try {
                b b5 = b.a(exception);
                b5.dK(cm2.atA());
                throw b5;
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(inputStream);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
        this.Lw();
    }

    public void Rq() {
        e.Rx().a(this);
    }

    public void RF() {
        OpenGlHelper.cY(0);
        cmU = -1;
        cmT = null;
        cmV = true;
        for (int i2 = 0; i2 < this.cmY.size(); ++i2) {
            if (this.cmW.get(this.cmX.get(i2)) == null) continue;
            GlStateManager.cN(OpenGlHelper.bMI + i2);
            GlStateManager.ap(0);
        }
    }

    public void RG() {
        this.cnf = false;
        cmT = this;
        this.cng.RP();
        if (this.cnc != cmU) {
            OpenGlHelper.cY(this.cnc);
            cmU = this.cnc;
        }
        if (this.cne) {
            GlStateManager.JH();
        } else {
            GlStateManager.JI();
        }
        for (int i2 = 0; i2 < this.cmY.size(); ++i2) {
            if (this.cmW.get(this.cmX.get(i2)) == null) continue;
            GlStateManager.cN(OpenGlHelper.bMI + i2);
            GlStateManager.JN();
            Object object = this.cmW.get(this.cmX.get(i2));
            int n2 = -1;
            if (object instanceof a) {
                n2 = ((a)object).cmg;
            } else if (object instanceof ITextureObject) {
                n2 = ((ITextureObject)object).Ll();
            } else if (object instanceof Integer) {
                n2 = (Integer)object;
            }
            if (n2 == -1) continue;
            GlStateManager.ap(n2);
            OpenGlHelper.V(OpenGlHelper.a(this.cnc, this.cmX.get(i2)), i2);
        }
        for (i i2 : this.cmZ) {
            i2.RL();
        }
    }

    public void Lw() {
        this.cnf = true;
    }

    public i dE(String string) {
        return this.cnb.containsKey(string) ? this.cnb.get(string) : null;
    }

    public i dF(String string) {
        return this.cnb.containsKey(string) ? this.cnb.get(string) : cmS;
    }

    private void RH() {
        int n2 = 0;
        int n3 = 0;
        while (n2 < this.cmX.size()) {
            String object = this.cmX.get(n2);
            int n4 = OpenGlHelper.a(this.cnc, object);
            if (n4 == -1) {
                cmR.warn("Shader " + this.cnd + "could not find sampler named " + object + " in the specified shader program.");
                this.cmW.remove(object);
                this.cmX.remove(n3);
                --n3;
            } else {
                this.cmY.add(n4);
            }
            ++n2;
            ++n3;
        }
        for (i i2 : this.cmZ) {
            String string = i2.RA();
            int n5 = OpenGlHelper.a(this.cnc, string);
            if (n5 == -1) {
                cmR.warn("Could not find uniform named " + string + " in the specified shader program.");
                continue;
            }
            this.cna.add(n5);
            i2.ed(n5);
            this.cnb.put(string, i2);
        }
    }

    private void c(JsonElement jsonElement) {
        JsonObject jsonObject = bn.e(jsonElement, "sampler");
        String string = bn.m(jsonObject, "name");
        if (!bn.h(jsonObject, "file")) {
            this.cmW.put(string, null);
            this.cmX.add(string);
        } else {
            this.cmX.add(string);
        }
    }

    public void a(String string, Object object) {
        this.cmW.remove(string);
        this.cmW.put(string, object);
        this.Lw();
    }

    private void d(JsonElement jsonElement) {
        Object object2;
        JsonObject jsonObject = bn.e(jsonElement, "uniform");
        String string = bn.m(jsonObject, "name");
        int n2 = i.dG(bn.m(jsonObject, "type"));
        int n3 = bn.p(jsonObject, "count");
        float[] fArray = new float[Math.max(n3, 16)];
        JsonArray jsonArray = bn.r(jsonObject, "values");
        if (jsonArray.size() != n3 && jsonArray.size() > 1) {
            throw new b("Invalid amount of values specified (expected " + n3 + ", found " + jsonArray.size() + ")");
        }
        int n4 = 0;
        for (Object object2 : jsonArray) {
            try {
                fArray[n4] = bn.c((JsonElement)object2, "value");
            }
            catch (Exception exception) {
                b b2 = b.a(exception);
                b2.dJ("values[" + n4 + "]");
                throw b2;
            }
            ++n4;
        }
        if (n3 > 1 && jsonArray.size() == 1) {
            while (n4 < n3) {
                fArray[n4] = fArray[0];
                ++n4;
            }
        }
        int n5 = n3 > 1 && n3 <= 4 && n2 < 8 ? n3 - 1 : 0;
        object2 = new i(string, n2 + n5, n3, this);
        if (n2 <= 3) {
            ((i)object2).u((int)fArray[0], (int)fArray[1], (int)fArray[2], (int)fArray[3]);
        } else if (n2 <= 7) {
            ((i)object2).k(fArray[0], fArray[1], fArray[2], fArray[3]);
        } else {
            ((i)object2).d(fArray);
        }
        this.cmZ.add((i)object2);
    }

    public f RI() {
        return this.cnj;
    }

    public f RJ() {
        return this.cnk;
    }

    public int RK() {
        return this.cnc;
    }
}

