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
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.server.MinecraftServer;

public class t
extends a {
    @Override
    public String RX() {
        return "give";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.give.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        boolean bl2;
        if (stringArray.length < 2) {
            throw new bo("commands.give.usage", new Object[0]);
        }
        e e2 = t.a(aw2, stringArray[0]);
        d d2 = t.f(aw2, stringArray[1]);
        int n2 = stringArray.length >= 3 ? t.h(stringArray[2], 1, 64) : 1;
        int n3 = stringArray.length >= 4 ? t.dM(stringArray[3]) : 0;
        co co2 = new co(d2, n2, n3);
        if (stringArray.length >= 5) {
            String string = t.a(aw2, stringArray, 4).arq();
            try {
                co2.u(b.ez(string));
            }
            catch (i i2) {
                throw new n("commands.give.tagError", i2.getMessage());
            }
        }
        if (bl2 = e2.cHV.ah(co2)) {
            e2.baU.a((c)e2, "random.pop", 0.2f, ((e2.VB().nextFloat() - e2.VB().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            e2.cHX.adc();
        }
        if (bl2 && co2.cWZ <= 0) {
            co2.cWZ = 1;
            aw2.a(ad.coi, n2);
            net.minecraft.entity.item.i i3 = e2.d(co2, false);
            if (i3 != null) {
                i3.Ys();
            }
        } else {
            aw2.a(ad.coi, n2 - co2.cWZ);
            net.minecraft.entity.item.i i4 = e2.d(co2, false);
            if (i4 != null) {
                i4.Yo();
                i4.ei(e2.xU());
            }
        }
        t.a(aw2, (au)this, "commands.give.success", co2.DM(), n2, e2.xU());
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length == 1 ? t.a(stringArray, this.Sj()) : (stringArray.length == 2 ? t.a(stringArray, d.cVi.aty()) : null);
    }

    protected String[] Sj() {
        return MinecraftServer.afs().Sa();
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

