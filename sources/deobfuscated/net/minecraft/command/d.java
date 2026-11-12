/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.n;
import net.minecraft.entity.player.e;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.t;

public class d
extends a {
    @Override
    public String RX() {
        return "clear";
    }

    @Override
    public String c(aw aw2) {
        return "commands.clear.usage";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        e e2 = stringArray.length == 0 ? d.b(aw2) : d.a(aw2, stringArray[0]);
        net.minecraft.item.d d2 = stringArray.length >= 2 ? d.f(aw2, stringArray[1]) : null;
        int n2 = stringArray.length >= 3 ? d.x(stringArray[2], -1) : -1;
        int n3 = stringArray.length >= 4 ? d.x(stringArray[3], -1) : -1;
        net.minecraft.nbt.n n4 = null;
        if (stringArray.length >= 5) {
            try {
                n4 = b.ez(d.c(stringArray, 4));
            }
            catch (i i2) {
                throw new n("commands.clear.tagError", i2.getMessage());
            }
        }
        if (stringArray.length >= 2 && d2 == null) {
            throw new n("commands.clear.failure", e2.xU());
        }
        int n5 = e2.cHV.a(d2, n2, n3, n4);
        e2.cHX.adc();
        if (!e2.cIt.cJM) {
            e2.acn();
        }
        aw2.a(ad.coi, n5);
        if (n5 == 0) {
            throw new n("commands.clear.failure", e2.xU());
        }
        if (n3 == 0) {
            aw2.a(new t("commands.clear.testing", e2.xU(), n5));
        } else {
            d.a(aw2, (au)this, "commands.clear.success", e2.xU(), n5);
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length == 1 ? d.a(stringArray, this.RY()) : (stringArray.length == 2 ? d.a(stringArray, net.minecraft.item.d.cVi.aty()) : null);
    }

    protected String[] RY() {
        return MinecraftServer.afs().Sa();
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

