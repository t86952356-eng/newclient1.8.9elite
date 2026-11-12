/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.optifine;

import java.nio.ByteBuffer;
import java.util.Properties;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.bi;
import net.optifine.bl;
import net.optifine.util.ak;
import org.lwjgl.opengl.GL11;

public class bk {
    private String eeH = null;
    private String eeI = null;
    cm eeJ = null;
    private int eeK = -1;
    private int eeL = 0;
    private int eeM = 0;
    private int cex = 0;
    private int cey = 0;
    private bl[] eeN = null;
    private int eeO = 0;
    private boolean ceA = false;
    private int eeP = 0;
    private ByteBuffer eeQ = null;
    byte[] eeR = null;
    private ByteBuffer eeS = null;
    private boolean dj = true;
    private boolean amA = true;

    public bk(String string, byte[] byArray, String string2, cm cm2, int n2, int n3, int n4, int n5, Properties properties) {
        this.eeH = string;
        this.eeI = string2;
        this.eeJ = cm2;
        this.eeL = n2;
        this.eeM = n3;
        this.cex = n4;
        this.cey = n5;
        int n6 = n4 * n5 * 4;
        if (byArray.length % n6 != 0) {
            a.warn("Invalid animated texture length: " + byArray.length + ", frameWidth: " + n4 + ", frameHeight: " + n5);
        }
        this.eeR = byArray;
        int n7 = byArray.length / n6;
        if (properties.get("tile.0") != null) {
            int n8 = 0;
            while (properties.get("tile." + n8) != null) {
                n7 = n8 + 1;
                ++n8;
            }
        }
        String string3 = (String)properties.get("duration");
        int n9 = Math.max(a.x(string3, 1), 1);
        this.eeN = new bl[n7];
        for (int i2 = 0; i2 < this.eeN.length; ++i2) {
            bl bl2;
            String string4 = (String)properties.get("tile." + i2);
            int n10 = a.x(string4, i2);
            String string5 = (String)properties.get("duration." + i2);
            int n11 = Math.max(a.x(string5, n9), 1);
            this.eeN[i2] = bl2 = new bl(n10, n11);
        }
        this.ceA = a.p(properties.getProperty("interpolate"), false);
        this.eeP = a.x(properties.getProperty("skip"), 0);
        if (this.ceA) {
            this.eeQ = GLAllocation.cE(n6);
        }
    }

    public boolean aBN() {
        bl bl2 = this.aBO();
        if (bl2 == null) {
            return false;
        }
        ++bl2.tS;
        if (bl2.tS < bl2.cGO) {
            return this.ceA;
        }
        bl2.tS = 0;
        ++this.eeO;
        if (this.eeO >= this.eeN.length) {
            this.eeO = 0;
        }
        return true;
    }

    public bl aBO() {
        return this.jr(this.eeO);
    }

    public bl jr(int n2) {
        if (this.eeN.length <= 0) {
            return null;
        }
        if (n2 < 0 || n2 >= this.eeN.length) {
            n2 = 0;
        }
        bl bl2 = this.eeN[n2];
        return bl2;
    }

    public int Of() {
        return this.eeN.length;
    }

    public void aBP() {
        if (this.amA) {
            if (this.eeK < 0) {
                ITextureObject iTextureObject = ak.k(this.eeJ);
                if (iTextureObject == null) {
                    this.amA = false;
                    return;
                }
                this.eeK = iTextureObject.Ll();
            }
            if (this.eeS == null) {
                this.eeS = GLAllocation.cE(this.eeR.length);
                this.eeS.put(this.eeR);
                this.eeS.flip();
                this.eeR = null;
            }
            boolean bl2 = this.dj = !bi.bd() || bi.jq(this.eeK);
            if (this.aBN() && this.dj) {
                int n2;
                int n3 = this.cex * this.cey * 4;
                bl bl3 = this.aBO();
                if (bl3 != null && (n2 = n3 * bl3.Ho) + n3 <= this.eeS.limit()) {
                    if (this.ceA && bl3.tS > 0) {
                        if (this.eeP <= 1 || bl3.tS % this.eeP == 0) {
                            bl bl4 = this.jr(this.eeO + 1);
                            double d2 = 1.0 * (double)bl3.tS / (double)bl3.cGO;
                            this.a(bl3, bl4, d2);
                        }
                    } else {
                        this.eeS.position(n2);
                        GlStateManager.ap(this.eeK);
                        GL11.glTexSubImage2D((int)3553, (int)0, (int)this.eeL, (int)this.eeM, (int)this.cex, (int)this.cey, (int)6408, (int)5121, (ByteBuffer)this.eeS);
                    }
                }
            }
        }
    }

    private void a(bl bl2, bl bl3, double d2) {
        int n2;
        int n3 = this.cex * this.cey * 4;
        int n4 = n3 * bl2.Ho;
        if (n4 + n3 <= this.eeS.limit() && (n2 = n3 * bl3.Ho) + n3 <= this.eeS.limit()) {
            this.eeQ.clear();
            for (int i2 = 0; i2 < n3; ++i2) {
                int n5 = this.eeS.get(n4 + i2) & 0xFF;
                int n6 = this.eeS.get(n2 + i2) & 0xFF;
                int n7 = this.b(n5, n6, d2);
                byte by2 = (byte)n7;
                this.eeQ.put(by2);
            }
            this.eeQ.flip();
            GlStateManager.ap(this.eeK);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)this.eeL, (int)this.eeM, (int)this.cex, (int)this.cey, (int)6408, (int)5121, (ByteBuffer)this.eeQ);
        }
    }

    private int b(int n2, int n3, double d2) {
        return (int)((double)n2 * (1.0 - d2) + (double)n3 * d2);
    }

    public String aBQ() {
        return this.eeH;
    }

    public String aBR() {
        return this.eeI;
    }

    public cm aBS() {
        return this.eeJ;
    }

    public boolean bd() {
        return this.dj;
    }
}

