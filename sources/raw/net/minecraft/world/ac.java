/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import hackclient.rise.akg;
import hackclient.rise.we;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.world.ad;
import net.minecraft.world.ae;
import net.minecraft.world.ag;
import net.minecraft.world.ap;
import net.minecraft.world.biome.aj;
import net.minecraft.world.biome.ak;
import net.minecraft.world.chunk.h;
import net.minecraft.world.gen.a;
import net.minecraft.world.gen.c;
import net.minecraft.world.gen.d;
import net.minecraft.world.gen.j;
import net.minecraft.world.w;

public abstract class ac {
    public static final float[] dDK = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    protected w baU;
    private ap dDL;
    private String dDM;
    protected aj dDN;
    protected boolean dDO;
    protected boolean dDP;
    protected final float[] dDQ = new float[16];
    protected int dDR;
    private final float[] dDS = new float[4];

    public final void p(w w2) {
        this.baU = w2;
        this.dDL = w2.avH().awC();
        this.dDM = w2.avH().azM();
        this.avU();
        this.avT();
    }

    protected void avT() {
        float f2 = 0.0f;
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f3 = 1.0f - (float)i2 / 15.0f;
            this.dDQ[i2] = (1.0f - f3) / (f3 * 3.0f + 1.0f) * 1.0f + 0.0f;
        }
    }

    protected void avU() {
        ap ap2 = this.baU.avH().awC();
        if (ap2 == ap.dEE) {
            j j2 = j.gJ(this.baU.avH().azM());
            this.dDN = new ak(net.minecraft.world.biome.j.a(j2.ayj(), net.minecraft.world.biome.j.dGT), 0.5f);
        } else {
            this.dDN = ap2 == ap.dEI ? new ak(net.minecraft.world.biome.j.dGg, 0.0f) : new aj(this.baU);
        }
    }

    public h avV() {
        return this.dDL == ap.dEE ? new c(this.baU, this.baU.avD(), this.baU.avH().awB(), this.dDM) : (this.dDL == ap.dEI ? new a(this.baU) : new d(this.baU, this.baU.avD(), this.baU.avH().awB(), this.dDM));
    }

    public boolean aO(int n2, int n3) {
        return this.baU.aH(new b(n2, 0, n3)) == Blocks.cLe;
    }

    public float a(long l2, float f2) {
        int n2 = (int)(l2 % 24000L);
        float f3 = ((float)n2 + f2) / 24000.0f - 0.25f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        f3 = 1.0f - (float)((Math.cos((double)f3 * Math.PI) + 1.0) / 2.0);
        f3 += (f3 - f3) / 3.0f;
        return f3;
    }

    public int J(long l2) {
        return (int)(l2 / 24000L % 8L + 8L) % 8;
    }

    public boolean avW() {
        return true;
    }

    public float[] z(float f2, float f3) {
        float f4 = 0.4f;
        float f5 = bt.bB(f2 * (float)Math.PI * 2.0f) - 0.0f;
        float f6 = -0.0f;
        if (f5 >= -0.4f && f5 <= 0.4f) {
            float f7 = (f5 - -0.0f) / 0.4f * 0.5f + 0.5f;
            float f8 = 1.0f - (1.0f - bt.bx(f7 * (float)Math.PI)) * 0.99f;
            f8 *= f8;
            this.dDS[0] = f7 * 0.3f + 0.7f;
            this.dDS[1] = f7 * f7 * 0.7f + 0.2f;
            this.dDS[2] = f7 * f7 * 0.0f + 0.2f;
            this.dDS[3] = f8;
            return this.dDS;
        }
        return null;
    }

    public da A(float f2, float f3) {
        float f4 = bt.bB(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f4 = bt.I(f4, 0.0f, 1.0f);
        float f5 = 0.7529412f;
        float f6 = 0.84705883f;
        float f7 = 1.0f;
        we we2 = hackclient.rise.a.a.g().c(we.class);
        if (we2 != null && we2.isEnabled() && ((akg)we2.kY().wD()).getName().equals("Nether Particles")) {
            f5 = 0.85f;
            f6 = 0.68f;
            f7 = 0.62f;
        } else {
            f5 *= f4 * 0.94f + 0.06f;
            f6 *= f4 * 0.94f + 0.06f;
            f7 *= f4 * 0.91f + 0.09f;
        }
        return new da(f5, f6, f7);
    }

    public boolean avX() {
        return true;
    }

    public static ac ig(int n2) {
        return n2 == -1 ? new ae() : (n2 == 0 ? new ag() : (n2 == 1 ? new ad() : null));
    }

    public float avY() {
        return 128.0f;
    }

    public boolean avZ() {
        return true;
    }

    public b awa() {
        return null;
    }

    public int awb() {
        return this.dDL == ap.dEE ? 4 : this.baU.avB() + 1;
    }

    public double awc() {
        return this.dDL == ap.dEE ? 1.0 : 0.03125;
    }

    public boolean aP(int n2, int n3) {
        return false;
    }

    public abstract String getDimensionName();

    public abstract String awd();

    public aj avp() {
        return this.dDN;
    }

    public boolean awe() {
        return this.dDO;
    }

    public boolean awf() {
        return this.dDP;
    }

    public float[] awg() {
        return this.dDQ;
    }

    public int getDimensionId() {
        return this.dDR;
    }

    public net.minecraft.world.border.c Sv() {
        return new net.minecraft.world.border.c();
    }
}

