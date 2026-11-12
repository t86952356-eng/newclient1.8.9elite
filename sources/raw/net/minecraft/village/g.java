/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.village;

import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.player.a;
import net.minecraft.entity.q;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.village.c;
import net.minecraft.world.t;
import net.minecraft.world.w;

public class g {
    private final w dBz;
    private boolean dBA;
    private int dBB = -1;
    private int dBC;
    private int dBD;
    private c dBE;
    private int dBF;
    private int dBG;
    private int dBH;

    public g(w w2) {
        this.dBz = w2;
    }

    public void tick() {
        if (this.dBz.avr()) {
            this.dBB = 0;
        } else if (this.dBB != 2) {
            if (this.dBB == 0) {
                float f2 = this.dBz.bT(0.0f);
                if ((double)f2 < 0.5 || (double)f2 > 0.501) {
                    return;
                }
                this.dBB = this.dBz.dDk.nextInt(10) == 0 ? 1 : 2;
                this.dBA = false;
                if (this.dBB == 2) {
                    return;
                }
            }
            if (this.dBB != -1) {
                if (!this.dBA) {
                    if (!this.auL()) {
                        return;
                    }
                    this.dBA = true;
                }
                if (this.dBD > 0) {
                    --this.dBD;
                } else {
                    this.dBD = 2;
                    if (this.dBC > 0) {
                        this.auM();
                        --this.dBC;
                    } else {
                        this.dBB = 2;
                    }
                }
            }
        }
    }

    private boolean auL() {
        List<a> list = this.dBz.dCY;
        Iterator<a> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return false;
            }
            a a2 = iterator.next();
            if (a2.CZ()) continue;
            this.dBE = this.dBz.avS().e(new b(a2), 1);
            if (this.dBE == null || this.dBE.auo() < 10 || this.dBE.aup() < 20 || this.dBE.auq() < 20) continue;
            b b2 = this.dBE.aum();
            float f2 = this.dBE.aun();
            boolean bl2 = false;
            for (int i2 = 0; i2 < 10; ++i2) {
                float f3 = this.dBz.dDk.nextFloat() * (float)Math.PI * 2.0f;
                this.dBF = b2.wt() + (int)((double)(bt.bB(f3) * f2) * 0.9);
                this.dBG = b2.wu();
                this.dBH = b2.wx() + (int)((double)(bt.bx(f3) * f2) * 0.9);
                bl2 = false;
                for (c c2 : this.dBz.avS().auz()) {
                    if (c2 == this.dBE || !c2.ar(new b(this.dBF, this.dBG, this.dBH))) continue;
                    bl2 = true;
                    break;
                }
                if (!bl2) break;
            }
            if (bl2) {
                return false;
            }
            da da2 = this.aE(new b(this.dBF, this.dBG, this.dBH));
            if (da2 != null) break;
        }
        this.dBD = 0;
        this.dBC = 20;
        return true;
    }

    private boolean auM() {
        au au2;
        da da2 = this.aE(new b(this.dBF, this.dBG, this.dBH));
        if (da2 == null) {
            return false;
        }
        try {
            au2 = new au(this.dBz);
            au2.a(this.dBz.bg(new b(au2)), null);
            au2.bl(false);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        au2.b(da2.dAG, da2.dAH, da2.dAI, this.dBz.dDk.nextFloat() * 360.0f, 0.0f);
        this.dBz.G(au2);
        b b2 = this.dBE.aum();
        au2.c(b2, this.dBE.aun());
        return true;
    }

    private da aE(b b2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            b b3 = b2.C(this.dBz.dDk.nextInt(16) - 8, this.dBz.dDk.nextInt(6) - 3, this.dBz.dDk.nextInt(16) - 8);
            if (!this.dBE.ar(b3) || !t.a(q.cuf, this.dBz, b3)) continue;
            return new da(b3.wt(), b3.wu(), b3.wx());
        }
        return null;
    }
}

