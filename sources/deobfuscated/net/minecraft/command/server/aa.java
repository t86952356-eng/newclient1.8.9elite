/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.EnumSet;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.b;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.network.play.server.j;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.bt;

public class aa
extends a {
    @Override
    public String RX() {
        return "tp";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.tp.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        c c2;
        if (stringArray.length < 1) {
            throw new bo("commands.tp.usage", new Object[0]);
        }
        int n2 = 0;
        if (stringArray.length != 2 && stringArray.length != 4 && stringArray.length != 6) {
            c2 = aa.b(aw2);
        } else {
            c2 = aa.b(aw2, stringArray[0]);
            n2 = 1;
        }
        if (stringArray.length != 1 && stringArray.length != 2) {
            if (stringArray.length < n2 + 3) {
                throw new bo("commands.tp.usage", new Object[0]);
            }
            if (c2.baU != null) {
                int n3 = n2 + 1;
                b b2 = aa.a(c2.gW, stringArray[n2], true);
                b b3 = aa.a(c2.gX, stringArray[n3++], 0, 0, false);
                b b4 = aa.a(c2.gY, stringArray[n3++], true);
                b b5 = aa.a(c2.pl, stringArray.length > n3 ? stringArray[n3++] : "~", false);
                b b6 = aa.a(c2.pm, stringArray.length > n3 ? stringArray[n3] : "~", false);
                if (c2 instanceof e) {
                    EnumSet<j> enumSet = EnumSet.noneOf(j.class);
                    if (b2.RW()) {
                        enumSet.add(j.dcn);
                    }
                    if (b3.RW()) {
                        enumSet.add(j.dco);
                    }
                    if (b4.RW()) {
                        enumSet.add(j.dcp);
                    }
                    if (b6.RW()) {
                        enumSet.add(j.dcr);
                    }
                    if (b5.RW()) {
                        enumSet.add(j.dcq);
                    }
                    float f2 = (float)b5.RV();
                    if (!b5.RW()) {
                        f2 = bt.bN(f2);
                    }
                    float f3 = (float)b6.RV();
                    if (!b6.RW()) {
                        f3 = bt.bN(f3);
                    }
                    if (f3 > 90.0f || f3 < -90.0f) {
                        f3 = bt.bN(180.0f - f3);
                        f2 = bt.bN(f2 + 180.0f);
                    }
                    c2.D(null);
                    ((e)c2).cIX.a(b2.RV(), b3.RV(), b4.RV(), f2, f3, enumSet);
                    c2.aR(f2);
                } else {
                    float f4 = (float)bt.aJ(b5.RU());
                    float f5 = (float)bt.aJ(b6.RU());
                    if (f5 > 90.0f || f5 < -90.0f) {
                        f5 = bt.bN(180.0f - f5);
                        f4 = bt.bN(f4 + 180.0f);
                    }
                    c2.b(b2.RU(), b3.RU(), b4.RU(), f4, f5);
                    c2.aR(f4);
                }
                aa.a(aw2, (au)this, "commands.tp.success.coordinates", c2.xU(), b2.RU(), b3.RU(), b4.RU());
            }
        } else {
            c c3 = aa.b(aw2, stringArray[stringArray.length - 1]);
            if (c3.baU != c2.baU) {
                throw new n("commands.tp.notSameDimension", new Object[0]);
            }
            c2.D(null);
            if (c2 instanceof e) {
                ((e)c2).cIX.f(c3.gW, c3.gX, c3.gY, c3.pl, c3.pm);
            } else {
                c2.b(c3.gW, c3.gX, c3.gY, c3.pl, c3.pm);
            }
            aa.a(aw2, (au)this, "commands.tp.success", c2.xU(), c3.xU());
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length != 1 && stringArray.length != 2 ? null : aa.a(stringArray, MinecraftServer.afs().Sa());
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

