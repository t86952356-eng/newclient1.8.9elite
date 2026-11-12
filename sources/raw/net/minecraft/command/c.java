/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.tileentity.d;
import net.minecraft.world.w;

public class c
extends a {
    @Override
    public String RX() {
        return "blockdata";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.blockdata.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        net.minecraft.nbt.n n2;
        if (stringArray.length < 4) {
            throw new bo("commands.blockdata.usage", new Object[0]);
        }
        aw2.a(ad.cog, 0);
        net.minecraft.util.b b2 = c.a(aw2, stringArray, 0, false);
        w w2 = aw2.Se();
        if (!w2.aJ(b2)) {
            throw new n("commands.blockdata.outOfWorld", new Object[0]);
        }
        d d2 = w2.K(b2);
        if (d2 == null) {
            throw new n("commands.blockdata.notValid", new Object[0]);
        }
        net.minecraft.nbt.n n3 = new net.minecraft.nbt.n();
        d2.b(n3);
        net.minecraft.nbt.n n4 = (net.minecraft.nbt.n)n3.aeG();
        try {
            n2 = b.ez(c.a(aw2, stringArray, 3).arq());
        }
        catch (i i2) {
            throw new n("commands.blockdata.tagError", i2.getMessage());
        }
        n3.w(n2);
        n3.B("x", b2.wt());
        n3.B("y", b2.wu());
        n3.B("z", b2.wx());
        if (n3.equals(n4)) {
            throw new n("commands.blockdata.failed", n3.toString());
        }
        d2.a(n3);
        d2.Lw();
        w2.P(b2);
        aw2.a(ad.cog, 1);
        c.a(aw2, (au)this, "commands.blockdata.success", n3.toString());
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length > 0 && stringArray.length <= 3 ? c.a(stringArray, 0, b2) : null;
    }
}

