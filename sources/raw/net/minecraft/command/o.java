/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.a;
import net.minecraft.command.av;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.command.p;
import net.minecraft.entity.c;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class o
extends a {
    @Override
    public String RX() {
        return "execute";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.execute.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        Object object;
        if (stringArray.length < 5) {
            throw new bo("commands.execute.usage", new Object[0]);
        }
        c c2 = o.a(aw2, stringArray[0], c.class);
        double d2 = o.b(c2.gW, stringArray[1], false);
        double d3 = o.b(c2.gX, stringArray[2], false);
        double d4 = o.b(c2.gY, stringArray[3], false);
        b b2 = new b(d2, d3, d4);
        int n2 = 4;
        if ("detect".equals(stringArray[4]) && stringArray.length > 10) {
            object = c2.Se();
            double d5 = o.b(d2, stringArray[5], false);
            double d6 = o.b(d3, stringArray[6], false);
            double d7 = o.b(d4, stringArray[7], false);
            Block block = o.g(aw2, stringArray[8]);
            int n3 = o.h(stringArray[9], -1, 15);
            b b3 = new b(d5, d6, d7);
            IBlockState iBlockState = ((w)object).L(b3);
            if (iBlockState.df() != block || n3 >= 0 && iBlockState.df().c(iBlockState) != n3) {
                throw new n("commands.execute.failed", "detect", c2.xU());
            }
            n2 = 10;
        }
        object = o.c(stringArray, n2);
        p p2 = new p(this, c2, aw2, b2, d2, d3, d4);
        av av2 = MinecraftServer.afs().ali();
        try {
            int n4 = av2.i(p2, (String)object);
            if (n4 < 1) {
                throw new n("commands.execute.allInvocationsFailed", object);
            }
        }
        catch (Throwable throwable) {
            throw new n("commands.execute.failed", object, c2.xU());
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? o.a(stringArray, MinecraftServer.afs().Sa()) : (stringArray.length > 1 && stringArray.length <= 4 ? o.a(stringArray, 1, b2) : (stringArray.length > 5 && stringArray.length <= 8 && "detect".equals(stringArray[4]) ? o.a(stringArray, 5, b2) : (stringArray.length == 9 && "detect".equals(stringArray[4]) ? o.a(stringArray, Block.aRV.aty()) : null)));
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

