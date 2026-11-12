/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.ax;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.player.e;
import net.minecraft.item.co;
import net.minecraft.nbt.v;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;

public class l
extends a {
    @Override
    public String RX() {
        return "enchant";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.enchant.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        v v2;
        Object object;
        int n2;
        if (stringArray.length < 2) {
            throw new bo("commands.enchant.usage", new Object[0]);
        }
        e e2 = l.a(aw2, stringArray[0]);
        aw2.a(ad.coi, 0);
        try {
            n2 = l.x(stringArray[1], 0);
        }
        catch (ax ax2) {
            object = net.minecraft.enchantment.a.ea(stringArray[1]);
            if (object == null) {
                throw ax2;
            }
            n2 = ((net.minecraft.enchantment.a)object).cqw;
        }
        int n3 = 1;
        object = e2.abO();
        if (object == null) {
            throw new n("commands.enchant.noItem", new Object[0]);
        }
        net.minecraft.enchantment.a a2 = net.minecraft.enchantment.a.eh(n2);
        if (a2 == null) {
            throw new ax("commands.enchant.notFound", n2);
        }
        if (!a2.T((co)object)) {
            throw new n("commands.enchant.cantEnchant", new Object[0]);
        }
        if (stringArray.length >= 3) {
            n3 = l.h(stringArray[2], a2.Td(), a2.Te());
        }
        if (((co)object).aej() && (v2 = ((co)object).ael()) != null) {
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                net.minecraft.enchantment.a a3;
                short s2 = v2.gi(i2).eF("id");
                if (net.minecraft.enchantment.a.eh(s2) == null || (a3 = net.minecraft.enchantment.a.eh(s2)).a(a2)) continue;
                throw new n("commands.enchant.cantCombine", a2.ek(n3), a3.ek(v2.gi(i2).eF("lvl")));
            }
        }
        ((co)object).b(a2, n3);
        l.a(aw2, (au)this, "commands.enchant.success", new Object[0]);
        aw2.a(ad.coi, 1);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? l.a(stringArray, this.Sb()) : (stringArray.length == 2 ? l.a(stringArray, net.minecraft.enchantment.a.Tc()) : null);
    }

    protected String[] Sb() {
        return MinecraftServer.afs().Sa();
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

