/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.util;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.util.aa;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.t;

public class ab
implements Serializable {
    private final List<aa> duS = Lists.newArrayList();
    private final r duT;
    private int duU;
    private int duV;
    private int duW;
    private boolean duX;
    private boolean duY;
    private String duZ;

    public ab(r r2) {
        this.duT = r2;
    }

    public void arO() {
        this.arT();
        if (this.duT.isOnLadder()) {
            Block block = this.duT.baU.L(new b(this.duT.gW, this.duT.Us().dtI, this.duT.gY)).df();
            if (block == Blocks.cMw) {
                this.duZ = "ladder";
            } else if (block == Blocks.cNp) {
                this.duZ = "vines";
            }
        } else if (this.duT.isInWater()) {
            this.duZ = "water";
        }
    }

    public void a(ad ad2, float f2, float f3) {
        this.aX();
        this.arO();
        aa aa2 = new aa(ad2, this.duT.aRg, f2, f3, this.duZ, this.duT.csf);
        this.duS.add(aa2);
        this.duU = this.duT.aRg;
        this.duY = true;
        if (aa2.arK() && !this.duX && this.duT.TS()) {
            this.duX = true;
            this.duW = this.duV = this.duT.aRg;
            this.duT.Wj();
        }
    }

    public ba arP() {
        ba ba2;
        if (this.duS.size() == 0) {
            return new t("death.attack.generic", this.duT.xW());
        }
        aa aa2 = this.arR();
        aa aa3 = this.duS.get(this.duS.size() - 1);
        ba ba3 = aa3.arM();
        c c2 = aa3.arI().dk();
        if (aa2 != null && aa3.arI() == ad.dvj) {
            ba ba4 = aa2.arM();
            if (aa2.arI() != ad.dvj && aa2.arI() != ad.dvk) {
                if (!(ba4 == null || ba3 != null && ba4.equals(ba3))) {
                    co co2;
                    c c3 = aa2.arI().dk();
                    co co3 = co2 = c3 instanceof r ? ((r)c3).Vk() : null;
                    ba2 = co2 != null && co2.aen() ? new t("death.fell.assist.item", this.duT.xW(), ba4, co2.DM()) : new t("death.fell.assist", this.duT.xW(), ba4);
                } else if (ba3 != null) {
                    co co4;
                    co co5 = co4 = c2 instanceof r ? ((r)c2).Vk() : null;
                    ba2 = co4 != null && co4.aen() ? new t("death.fell.finish.item", this.duT.xW(), ba3, co4.DM()) : new t("death.fell.finish", this.duT.xW(), ba3);
                } else {
                    ba2 = new t("death.fell.killer", this.duT.xW());
                }
            } else {
                ba2 = new t("death.fell.accident." + this.a(aa2), this.duT.xW());
            }
        } else {
            ba2 = aa3.arI().ad(this.duT);
        }
        return ba2;
    }

    public r arQ() {
        r r2 = null;
        a a2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (aa aa2 : this.duS) {
            if (aa2.arI().dk() instanceof a && (a2 == null || aa2.arJ() > f3)) {
                f3 = aa2.arJ();
                a2 = (a)aa2.arI().dk();
            }
            if (!(aa2.arI().dk() instanceof r) || r2 != null && !(aa2.arJ() > f2)) continue;
            f2 = aa2.arJ();
            r2 = (r)aa2.arI().dk();
        }
        if (a2 != null && f3 >= f2 / 3.0f) {
            return a2;
        }
        return r2;
    }

    private aa arR() {
        aa aa2 = null;
        aa aa3 = null;
        boolean bl2 = false;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < this.duS.size(); ++i2) {
            aa aa4;
            aa aa5 = this.duS.get(i2);
            aa aa6 = aa4 = i2 > 0 ? this.duS.get(i2 - 1) : null;
            if ((aa5.arI() == ad.dvj || aa5.arI() == ad.dvk) && aa5.arN() > 0.0f && (aa2 == null || aa5.arN() > f2)) {
                aa2 = i2 > 0 ? aa4 : aa5;
                f2 = aa5.arN();
            }
            if (aa5.arL() == null || aa3 != null && !(aa5.arJ() > 0.0f)) continue;
            aa3 = aa5;
        }
        if (f2 > 5.0f && aa2 != null) {
            return aa2;
        }
        return null;
    }

    private String a(aa aa2) {
        return aa2.arL() == null ? "generic" : aa2.arL();
    }

    public int arS() {
        return this.duX ? this.duT.aRg - this.duV : this.duW - this.duV;
    }

    private void arT() {
        this.duZ = null;
    }

    public void aX() {
        int n2;
        int n3 = n2 = this.duX ? 300 : 100;
        if (this.duY && (!this.duT.TS() || this.duT.aRg - this.duU > n2)) {
            boolean bl2 = this.duX;
            this.duY = false;
            this.duX = false;
            this.duW = this.duT.aRg;
            if (bl2) {
                this.duT.Wk();
            }
            this.duS.clear();
        }
    }

    public r arU() {
        return this.duT;
    }
}

