/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.gen.structure.cx;
import net.minecraft.world.gen.structure.dj;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class dh
extends dj {
    private int dSG;

    public dh() {
    }

    public dh(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
        this.dSG = Math.max(w2.ayL(), w2.ayN());
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.B("Length", this.dSG);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSG = n2.eG("Length");
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        y y3;
        int n2;
        boolean bl2 = false;
        for (n2 = random.nextInt(5); n2 < this.dSG - 8; n2 += 2 + random.nextInt(5)) {
            y3 = this.a((dk)y2, list, random, 0, n2);
            if (y3 == null) continue;
            n2 += Math.max(y3.dQI.ayL(), y3.dQI.ayN());
            bl2 = true;
        }
        for (n2 = random.nextInt(5); n2 < this.dSG - 8; n2 += 2 + random.nextInt(5)) {
            y3 = this.b((dk)y2, list, random, 0, n2);
            if (y3 == null) continue;
            n2 += Math.max(y3.dQI.ayL(), y3.dQI.ayN());
            bl2 = true;
        }
        if (bl2 && random.nextInt(3) > 0 && this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    cx.c((dk)y2, list, random, this.dQI.dQB - 1, this.dQI.dQC, this.dQI.dQD, ao.dwu, this.ayS());
                    break;
                }
                case dwt: {
                    cx.c((dk)y2, list, random, this.dQI.dQB - 1, this.dQI.dQC, this.dQI.dQG - 2, ao.dwu, this.ayS());
                    break;
                }
                case dwu: {
                    cx.c((dk)y2, list, random, this.dQI.dQB, this.dQI.dQC, this.dQI.dQD - 1, ao.dws, this.ayS());
                    break;
                }
                case dwv: {
                    cx.c((dk)y2, list, random, this.dQI.dQE - 2, this.dQI.dQC, this.dQI.dQD - 1, ao.dws, this.ayS());
                }
            }
        }
        if (bl2 && random.nextInt(3) > 0 && this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    cx.c((dk)y2, list, random, this.dQI.dQE + 1, this.dQI.dQC, this.dQI.dQD, ao.dwv, this.ayS());
                    break;
                }
                case dwt: {
                    cx.c((dk)y2, list, random, this.dQI.dQE + 1, this.dQI.dQC, this.dQI.dQG - 2, ao.dwv, this.ayS());
                    break;
                }
                case dwu: {
                    cx.c((dk)y2, list, random, this.dQI.dQB, this.dQI.dQC, this.dQI.dQG + 1, ao.dwt, this.ayS());
                    break;
                }
                case dwv: {
                    cx.c((dk)y2, list, random, this.dQI.dQE - 2, this.dQI.dQC, this.dQI.dQG + 1, ao.dwt, this.ayS());
                }
            }
        }
    }

    public static w a(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2) {
        for (int i2 = 7 * bt.b(random, 3, 5); i2 >= 7; i2 -= 7) {
            w w2 = w.a(n2, n3, n4, 0, 0, 0, 3, 3, i2, ao2);
            if (y.a(list, w2) != null) continue;
            return w2;
        }
        return null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        IBlockState iBlockState = this.F(Blocks.cLp.xM());
        IBlockState iBlockState2 = this.F(Blocks.cLg.xM());
        for (int i2 = this.dQI.dQB; i2 <= this.dQI.dQE; ++i2) {
            for (int i3 = this.dQI.dQD; i3 <= this.dQI.dQG; ++i3) {
                b b2 = new b(i2, 64, i3);
                if (!w3.k(b2)) continue;
                b2 = w2.aT(b2).aqY();
                w2.a(b2, iBlockState, 2);
                w2.a(b2.aqY(), iBlockState2, 2);
            }
        }
        return true;
    }
}

