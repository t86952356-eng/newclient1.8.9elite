/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.model;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.model.ay;
import net.minecraft.client.model.d;
import net.minecraft.client.model.j;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.shaders.ah;
import org.lwjgl.opengl.GL11;

public class ag {
    public float bBy = 64.0f;
    public float bBz = 32.0f;
    private int bBA;
    private int bBB;
    public float bBC;
    public float bBD;
    public float bBE;
    public float bBF;
    public float bBG;
    public float bBH;
    private boolean bBI;
    private int bBJ;
    public boolean bBK;
    public boolean bBL = true;
    public boolean bBM;
    public List<j> bBN;
    public List<ag> bBO;
    public final String bBP;
    private final d bBQ;
    public float bBR;
    public float bBS;
    public float bBT;
    public List bBU = new ArrayList();
    public boolean bBV = false;
    public float bBW = 1.0f;
    public float bBX = 1.0f;
    public float bBY = 1.0f;
    private int bBZ;
    private cm bCa = null;
    private String aFK = null;
    private net.optifine.entity.model.anim.d bCb;
    private final RenderGlobal bCc = a.anR();

    public ag(d d2, String string) {
        this.bBN = Lists.newArrayList();
        this.bBQ = d2;
        d2.byq.add(this);
        this.bBP = string;
        this.D(d2.bys, d2.byt);
    }

    public ag(d d2) {
        this(d2, null);
    }

    public ag(d d2, int n2, int n3) {
        this(d2);
        this.C(n2, n3);
    }

    public void a(ag ag2) {
        if (this.bBO == null) {
            this.bBO = Lists.newArrayList();
        }
        this.bBO.add(ag2);
    }

    public ag C(int n2, int n3) {
        this.bBA = n2;
        this.bBB = n3;
        return this;
    }

    public ag a(String object, float f2, float f3, float f4, int n2, int n3, int n4) {
        object = this.bBP + "." + (String)object;
        ay ay2 = this.bBQ.cV((String)object);
        this.C(ay2.bDc, ay2.bDd);
        this.bBN.add(new j(this, this.bBA, this.bBB, f2, f3, f4, n2, n3, n4, 0.0f).cW((String)object));
        return this;
    }

    public ag a(float f2, float f3, float f4, int n2, int n3, int n4) {
        this.bBN.add(new j(this, this.bBA, this.bBB, f2, f3, f4, n2, n3, n4, 0.0f));
        return this;
    }

    public ag a(float f2, float f3, float f4, int n2, int n3, int n4, boolean bl2) {
        this.bBN.add(new j(this, this.bBA, this.bBB, f2, f3, f4, n2, n3, n4, 0.0f, bl2));
        return this;
    }

    public void a(float f2, float f3, float f4, int n2, int n3, int n4, float f5) {
        this.bBN.add(new j(this, this.bBA, this.bBB, f2, f3, f4, n2, n3, n4, f5));
    }

    public void g(float f2, float f3, float f4) {
        this.bBC = f2;
        this.bBD = f3;
        this.bBE = f4;
    }

    public void aa(float f2) {
        if (!this.bBM && this.bBL) {
            this.Hf();
            if (!this.bBI) {
                this.ad(f2);
            }
            int n2 = 0;
            if (this.bCa != null && !this.bCc.bPd) {
                if (this.bCc.bPe) {
                    return;
                }
                n2 = GlStateManager.Kc();
                a.Bq().a(this.bCa);
            }
            if (this.bCb != null) {
                this.bCb.jA();
            }
            boolean bl2 = this.bBW != 1.0f || this.bBX != 1.0f || this.bBY != 1.0f;
            GlStateManager.j(this.bBR, this.bBS, this.bBT);
            if (this.bBF == 0.0f && this.bBG == 0.0f && this.bBH == 0.0f) {
                if (this.bBC == 0.0f && this.bBD == 0.0f && this.bBE == 0.0f) {
                    if (bl2) {
                        GlStateManager.i(this.bBW, this.bBX, this.bBY);
                    }
                    GlStateManager.cU(this.bBJ);
                    if (this.bBO != null) {
                        for (int i2 = 0; i2 < this.bBO.size(); ++i2) {
                            this.bBO.get(i2).aa(f2);
                        }
                    }
                    if (bl2) {
                        GlStateManager.i(1.0f / this.bBW, 1.0f / this.bBX, 1.0f / this.bBY);
                    }
                } else {
                    GlStateManager.j(this.bBC * f2, this.bBD * f2, this.bBE * f2);
                    if (bl2) {
                        GlStateManager.i(this.bBW, this.bBX, this.bBY);
                    }
                    GlStateManager.cU(this.bBJ);
                    if (this.bBO != null) {
                        for (int i3 = 0; i3 < this.bBO.size(); ++i3) {
                            this.bBO.get(i3).aa(f2);
                        }
                    }
                    if (bl2) {
                        GlStateManager.i(1.0f / this.bBW, 1.0f / this.bBX, 1.0f / this.bBY);
                    }
                    GlStateManager.j(-this.bBC * f2, -this.bBD * f2, -this.bBE * f2);
                }
            } else {
                GlStateManager.JV();
                GlStateManager.j(this.bBC * f2, this.bBD * f2, this.bBE * f2);
                if (this.bBH != 0.0f) {
                    GlStateManager.d(this.bBH * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (this.bBG != 0.0f) {
                    GlStateManager.d(this.bBG * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (this.bBF != 0.0f) {
                    GlStateManager.d(this.bBF * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
                if (bl2) {
                    GlStateManager.i(this.bBW, this.bBX, this.bBY);
                }
                GlStateManager.cU(this.bBJ);
                if (this.bBO != null) {
                    for (int i4 = 0; i4 < this.bBO.size(); ++i4) {
                        this.bBO.get(i4).aa(f2);
                    }
                }
                GlStateManager.JW();
            }
            GlStateManager.j(-this.bBR, -this.bBS, -this.bBT);
            if (n2 != 0) {
                GlStateManager.ap(n2);
            }
        }
    }

    public void ab(float f2) {
        if (!this.bBM && this.bBL) {
            this.Hf();
            if (!this.bBI) {
                this.ad(f2);
            }
            int n2 = 0;
            if (this.bCa != null && !this.bCc.bPd) {
                if (this.bCc.bPe) {
                    return;
                }
                n2 = GlStateManager.Kc();
                a.Bq().a(this.bCa);
            }
            if (this.bCb != null) {
                this.bCb.jA();
            }
            boolean bl2 = this.bBW != 1.0f || this.bBX != 1.0f || this.bBY != 1.0f;
            GlStateManager.JV();
            GlStateManager.j(this.bBC * f2, this.bBD * f2, this.bBE * f2);
            if (this.bBG != 0.0f) {
                GlStateManager.d(this.bBG * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.bBF != 0.0f) {
                GlStateManager.d(this.bBF * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            if (this.bBH != 0.0f) {
                GlStateManager.d(this.bBH * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            if (bl2) {
                GlStateManager.i(this.bBW, this.bBX, this.bBY);
            }
            GlStateManager.cU(this.bBJ);
            if (this.bBO != null) {
                for (int i2 = 0; i2 < this.bBO.size(); ++i2) {
                    this.bBO.get(i2).aa(f2);
                }
            }
            GlStateManager.JW();
            if (n2 != 0) {
                GlStateManager.ap(n2);
            }
        }
    }

    public void ac(float f2) {
        if (!this.bBM && this.bBL) {
            this.Hf();
            if (!this.bBI) {
                this.ad(f2);
            }
            if (this.bBF == 0.0f && this.bBG == 0.0f && this.bBH == 0.0f) {
                if (this.bBC != 0.0f || this.bBD != 0.0f || this.bBE != 0.0f) {
                    GlStateManager.j(this.bBC * f2, this.bBD * f2, this.bBE * f2);
                }
            } else {
                GlStateManager.j(this.bBC * f2, this.bBD * f2, this.bBE * f2);
                if (this.bBH != 0.0f) {
                    GlStateManager.d(this.bBH * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (this.bBG != 0.0f) {
                    GlStateManager.d(this.bBG * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (this.bBF != 0.0f) {
                    GlStateManager.d(this.bBF * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    private void ad(float f2) {
        int n2;
        if (this.bBJ == 0) {
            this.bBJ = GLAllocation.cC(1);
        }
        GL11.glNewList((int)this.bBJ, (int)4864);
        WorldRenderer worldRenderer = Tessellator.Li().Lj();
        for (n2 = 0; n2 < this.bBN.size(); ++n2) {
            this.bBN.get(n2).a(worldRenderer, f2);
        }
        for (n2 = 0; n2 < this.bBU.size(); ++n2) {
            net.optifine.model.d d2 = (net.optifine.model.d)this.bBU.get(n2);
            d2.a(Tessellator.Li(), f2);
        }
        GL11.glEndList();
        this.bBI = true;
    }

    public ag D(int n2, int n3) {
        this.bBy = n2;
        this.bBz = n3;
        return this;
    }

    public void b(float f2, float f3, float f4, int n2, int n3, int n4, float f5) {
        this.bBU.add(new net.optifine.model.d(this, this.bBA, this.bBB, f2, f3, f4, n2, n3, n4, f5));
    }

    public boolean Hd() {
        return this.bBI;
    }

    public int He() {
        return this.bBJ;
    }

    private void Hf() {
        if (this.bBZ != ah.exV) {
            this.bBI = false;
            this.bBZ = ah.exV;
        }
    }

    public cm Hg() {
        return this.bCa;
    }

    public void g(cm cm2) {
        this.bCa = cm2;
    }

    public String tn() {
        return this.aFK;
    }

    public void cX(String string) {
        this.aFK = string;
    }

    public void a(int[][] nArray, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.bBN.add(new j(this, nArray, f2, f3, f4, f5, f6, f7, f8, this.bBK));
    }

    public ag cY(String string) {
        if (string == null) {
            return null;
        }
        if (this.bBO != null) {
            for (int i2 = 0; i2 < this.bBO.size(); ++i2) {
                ag ag2 = this.bBO.get(i2);
                if (!string.equals(ag2.tn())) continue;
                return ag2;
            }
        }
        return null;
    }

    public ag cZ(String string) {
        if (string == null) {
            return null;
        }
        ag ag2 = this.cY(string);
        if (ag2 != null) {
            return ag2;
        }
        if (this.bBO != null) {
            for (int i2 = 0; i2 < this.bBO.size(); ++i2) {
                ag ag3 = this.bBO.get(i2);
                ag ag4 = ag3.cZ(string);
                if (ag4 == null) continue;
                return ag4;
            }
        }
        return null;
    }

    public void a(net.optifine.entity.model.anim.d d2) {
        this.bCb = d2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id: ").append(this.aFK).append(", boxes: ").append(this.bBN != null ? Integer.valueOf(this.bBN.size()) : null).append(", submodels: ").append(this.bBO != null ? Integer.valueOf(this.bBO.size()) : null);
        return stringBuffer.toString();
    }
}

