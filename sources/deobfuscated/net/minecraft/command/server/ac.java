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
import net.minecraft.command.ax;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.tileentity.d;
import net.minecraft.world.w;

public class ac
extends a {
    @Override
    public String RX() {
        return "testforblock";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.testforblock.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        int n2;
        Block block;
        Object object;
        w w2;
        if (stringArray.length < 4) {
            throw new bo("commands.testforblock.usage", new Object[0]);
        }
        aw2.a(ad.cog, 0);
        net.minecraft.util.b b2 = ac.a(aw2, stringArray, 0, false);
        Block block2 = Block.cq(stringArray[3]);
        if (block2 == null) {
            throw new ax("commands.setblock.notFound", stringArray[3]);
        }
        int n3 = -1;
        if (stringArray.length >= 5) {
            n3 = ac.h(stringArray[4], -1, 15);
        }
        if (!(w2 = aw2.Se()).aJ(b2)) {
            throw new n("commands.testforblock.outOfWorld", new Object[0]);
        }
        net.minecraft.nbt.n n4 = new net.minecraft.nbt.n();
        boolean bl2 = false;
        if (stringArray.length >= 6 && block2.xj()) {
            object = ac.a(aw2, stringArray, 5).arq();
            try {
                n4 = b.ez((String)object);
                bl2 = true;
            }
            catch (i i2) {
                throw new n("commands.setblock.tagError", i2.getMessage());
            }
        }
        if ((block = (object = w2.L(b2)).df()) != block2) {
            throw new n("commands.testforblock.failed.tile", b2.wt(), b2.wu(), b2.wx(), block.xA(), block2.xA());
        }
        if (n3 > -1 && (n2 = object.df().c((IBlockState)object)) != n3) {
            throw new n("commands.testforblock.failed.data", b2.wt(), b2.wu(), b2.wx(), n2, n3);
        }
        if (bl2) {
            d d2 = w2.K(b2);
            if (d2 == null) {
                throw new n("commands.testforblock.failed.tileEntity", b2.wt(), b2.wu(), b2.wx());
            }
            net.minecraft.nbt.n n5 = new net.minecraft.nbt.n();
            d2.b(n5);
            if (!aa.a(n4, n5, true)) {
                throw new n("commands.testforblock.failed.nbt", b2.wt(), b2.wu(), b2.wx());
            }
        }
        aw2.a(ad.cog, 1);
        ac.a(aw2, (au)this, "commands.testforblock.success", b2.wt(), b2.wu(), b2.wx());
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length > 0 && stringArray.length <= 3 ? ac.a(stringArray, 0, b2) : (stringArray.length == 4 ? ac.a(stringArray, Block.aRV.aty()) : null);
    }
}

