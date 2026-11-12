/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.tileentity.d;

public class w
extends a {
    @Override
    public String RX() {
        return "setblock";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.setblock.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        d d2;
        IBlockState iBlockState;
        Object object;
        net.minecraft.world.w w2;
        if (stringArray.length < 4) {
            throw new bo("commands.setblock.usage", new Object[0]);
        }
        aw2.a(ad.cog, 0);
        net.minecraft.util.b b2 = w.a(aw2, stringArray, 0, false);
        Block block = a.g(aw2, stringArray[3]);
        int n2 = 0;
        if (stringArray.length >= 5) {
            n2 = w.h(stringArray[4], 0, 15);
        }
        if (!(w2 = aw2.Se()).aJ(b2)) {
            throw new n("commands.setblock.outOfWorld", new Object[0]);
        }
        net.minecraft.nbt.n n3 = new net.minecraft.nbt.n();
        boolean bl2 = false;
        if (stringArray.length >= 7 && block.xj()) {
            object = w.a(aw2, stringArray, 6).arq();
            try {
                n3 = b.ez((String)object);
                bl2 = true;
            }
            catch (i i2) {
                throw new n("commands.setblock.tagError", i2.getMessage());
            }
        }
        if (stringArray.length >= 6) {
            if (stringArray[5].equals("destroy")) {
                w2.c(b2, true);
                if (block == Blocks.cLc) {
                    w.a(aw2, (au)this, "commands.setblock.success", new Object[0]);
                    return;
                }
            } else if (stringArray[5].equals("keep") && !w2.aG(b2)) {
                throw new n("commands.setblock.noChange", new Object[0]);
            }
        }
        if ((object = w2.K(b2)) != null) {
            if (object instanceof ab) {
                ((ab)object).clear();
            }
            w2.a(b2, Blocks.cLc.xM(), block == Blocks.cLc ? 2 : 4);
        }
        if (!w2.a(b2, iBlockState = block.aM(n2), 2)) {
            throw new n("commands.setblock.noChange", new Object[0]);
        }
        if (bl2 && (d2 = w2.K(b2)) != null) {
            n3.B("x", b2.wt());
            n3.B("y", b2.wu());
            n3.B("z", b2.wx());
            d2.a(n3);
        }
        w2.b(b2, iBlockState.df());
        aw2.a(ad.cog, 1);
        w.a(aw2, (au)this, "commands.setblock.success", new Object[0]);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length > 0 && stringArray.length <= 3 ? w.a(stringArray, 0, b2) : (stringArray.length == 4 ? w.a(stringArray, Block.aRV.aty()) : (stringArray.length == 6 ? w.a(stringArray, "replace", "destroy", "keep") : null));
    }
}

