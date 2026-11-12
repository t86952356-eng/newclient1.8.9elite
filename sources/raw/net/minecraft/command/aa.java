/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.command;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.ax;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.db;
import net.minecraft.world.w;

public class aa
extends a {
    private static final Map<String, Integer> cnZ;

    @Override
    public String RX() {
        return "replaceitem";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.replaceitem.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        Object object;
        d d2;
        int n2;
        boolean bl2;
        if (stringArray.length < 1) {
            throw new bo("commands.replaceitem.usage", new Object[0]);
        }
        if (stringArray[0].equals("entity")) {
            bl2 = false;
        } else {
            if (!stringArray[0].equals("block")) {
                throw new bo("commands.replaceitem.usage", new Object[0]);
            }
            bl2 = true;
        }
        if (bl2) {
            if (stringArray.length < 6) {
                throw new bo("commands.replaceitem.block.usage", new Object[0]);
            }
            n2 = 4;
        } else {
            if (stringArray.length < 4) {
                throw new bo("commands.replaceitem.entity.usage", new Object[0]);
            }
            n2 = 2;
        }
        int n3 = this.dR(stringArray[n2++]);
        try {
            d2 = aa.f(aw2, stringArray[n2]);
        }
        catch (ax ax2) {
            if (Block.cq(stringArray[n2]) != Blocks.cLc) {
                throw ax2;
            }
            d2 = null;
        }
        int n4 = stringArray.length > ++n2 ? aa.h(stringArray[n2++], 1, 64) : 1;
        int n5 = stringArray.length > n2 ? aa.dM(stringArray[n2++]) : 0;
        co co2 = new co(d2, n4, n5);
        if (stringArray.length > n2) {
            object = aa.a(aw2, stringArray, n2).arq();
            try {
                co2.u(b.ez((String)object));
            }
            catch (i i2) {
                throw new n("commands.replaceitem.tagError", i2.getMessage());
            }
        }
        if (co2.bP() == null) {
            co2 = null;
        }
        if (bl2) {
            aw2.a(ad.coi, 0);
            object = aa.a(aw2, stringArray, 1, false);
            w w2 = aw2.Se();
            net.minecraft.tileentity.d d3 = w2.K((net.minecraft.util.b)object);
            if (d3 == null || !(d3 instanceof ab)) {
                throw new n("commands.replaceitem.noContainer", ((db)object).wt(), ((db)object).wu(), ((db)object).wx());
            }
            ab ab2 = (ab)((Object)d3);
            if (n3 >= 0 && n3 < ab2.YI()) {
                ab2.g(n3, co2);
            }
        } else {
            object = aa.b(aw2, stringArray[1]);
            aw2.a(ad.coi, 0);
            if (object instanceof net.minecraft.entity.player.a) {
                ((net.minecraft.entity.player.a)object).cHX.adc();
            }
            if (!((c)object).f(n3, co2)) {
                throw new n("commands.replaceitem.failed", n3, n4, co2 == null ? "Air" : co2.DM());
            }
            if (object instanceof net.minecraft.entity.player.a) {
                ((net.minecraft.entity.player.a)object).cHX.adc();
            }
        }
        aw2.a(ad.coi, n4);
        aa.a(aw2, (au)this, "commands.replaceitem.success", n3, n4, co2 == null ? "Air" : co2.DM());
    }

    private int dR(String string) {
        if (!cnZ.containsKey(string)) {
            throw new n("commands.generic.parameter.invalid", string);
        }
        return cnZ.get(string);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length == 1 ? aa.a(stringArray, "entity", "block") : (stringArray.length == 2 && stringArray[0].equals("entity") ? aa.a(stringArray, this.Sl()) : (stringArray.length >= 2 && stringArray.length <= 4 && stringArray[0].equals("block") ? aa.a(stringArray, 1, b2) : (!(stringArray.length == 3 && stringArray[0].equals("entity") || stringArray.length == 5 && stringArray[0].equals("block")) ? (!(stringArray.length == 4 && stringArray[0].equals("entity") || stringArray.length == 6 && stringArray[0].equals("block")) ? null : aa.a(stringArray, d.cVi.aty())) : aa.a(stringArray, cnZ.keySet()))));
    }

    protected String[] Sl() {
        return MinecraftServer.afs().Sa();
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return stringArray.length > 0 && stringArray[0].equals("entity") && n2 == 1;
    }

    static {
        int n2;
        cnZ = Maps.newHashMap();
        for (n2 = 0; n2 < 54; ++n2) {
            cnZ.put("slot.container." + n2, n2);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            cnZ.put("slot.hotbar." + n2, n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            cnZ.put("slot.inventory." + n2, 9 + n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            cnZ.put("slot.enderchest." + n2, 200 + n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            cnZ.put("slot.villager." + n2, 300 + n2);
        }
        for (n2 = 0; n2 < 15; ++n2) {
            cnZ.put("slot.horse." + n2, 500 + n2);
        }
        cnZ.put("slot.weapon", 99);
        cnZ.put("slot.armor.head", 103);
        cnZ.put("slot.armor.chest", 102);
        cnZ.put("slot.armor.legs", 101);
        cnZ.put("slot.armor.feet", 100);
        cnZ.put("slot.horse.saddle", 400);
        cnZ.put("slot.horse.armor", 401);
        cnZ.put("slot.horse.chest", 499);
    }
}

