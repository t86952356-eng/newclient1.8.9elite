/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.gen.structure.w;

public class g
extends a {
    @Override
    public String RX() {
        return "testforblocks";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.compare.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 9) {
            throw new bo("commands.compare.usage", new Object[0]);
        }
        aw2.a(ad.cog, 0);
        b b2 = g.a(aw2, stringArray, 0, false);
        b b3 = g.a(aw2, stringArray, 3, false);
        b b4 = g.a(aw2, stringArray, 6, false);
        w w2 = new w(b2, b3);
        w w3 = new w(b4, b4.b(w2.ayK()));
        int n2 = w2.ayL() * w2.ayM() * w2.ayN();
        if (n2 > 524288) {
            throw new n("commands.compare.tooManyBlocks", n2, 524288);
        }
        if (w2.dQC < 0 || w2.dQF >= 256 || w3.dQC < 0 || w3.dQF >= 256) throw new n("commands.compare.outOfWorld", new Object[0]);
        net.minecraft.world.w w4 = aw2.Se();
        if (!w4.a(w2) || !w4.a(w3)) throw new n("commands.compare.outOfWorld", new Object[0]);
        boolean bl2 = stringArray.length > 9 && stringArray[9].equals("masked");
        n2 = 0;
        b b5 = new b(w3.dQB - w2.dQB, w3.dQC - w2.dQC, w3.dQD - w2.dQD);
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        net.minecraft.util.g g3 = new net.minecraft.util.g();
        for (int i2 = w2.dQD; i2 <= w2.dQG; ++i2) {
            for (int i3 = w2.dQC; i3 <= w2.dQF; ++i3) {
                for (int i4 = w2.dQB; i4 <= w2.dQE; ++i4) {
                    g2.E(i4, i3, i2);
                    g3.E(i4 + b5.wt(), i3 + b5.wu(), i2 + b5.wx());
                    boolean bl3 = false;
                    IBlockState iBlockState = w4.L(g2);
                    if (bl2 && iBlockState.df() == Blocks.cLc) continue;
                    if (iBlockState == w4.L(g3)) {
                        d d2 = w4.K(g2);
                        d d3 = w4.K(g3);
                        if (d2 != null && d3 != null) {
                            net.minecraft.nbt.n n3 = new net.minecraft.nbt.n();
                            d2.b(n3);
                            n3.eP("x");
                            n3.eP("y");
                            n3.eP("z");
                            net.minecraft.nbt.n n4 = new net.minecraft.nbt.n();
                            d3.b(n4);
                            n4.eP("x");
                            n4.eP("y");
                            n4.eP("z");
                            if (!n3.equals(n4)) {
                                bl3 = true;
                            }
                        } else if (d2 != null) {
                            bl3 = true;
                        }
                    } else {
                        bl3 = true;
                    }
                    ++n2;
                    if (!bl3) continue;
                    throw new n("commands.compare.failed", new Object[0]);
                }
            }
        }
        aw2.a(ad.cog, n2);
        g.a(aw2, (au)this, "commands.compare.success", n2);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length > 0 && stringArray.length <= 3 ? g.a(stringArray, 0, b2) : (stringArray.length > 3 && stringArray.length <= 6 ? g.a(stringArray, 3, b2) : (stringArray.length > 6 && stringArray.length <= 9 ? g.a(stringArray, 6, b2) : (stringArray.length == 10 ? g.a(stringArray, "masked", "all") : null)));
    }
}

