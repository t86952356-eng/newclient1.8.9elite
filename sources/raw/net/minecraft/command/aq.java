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
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.t;
import net.minecraft.world.border.c;

public class aq
extends a {
    @Override
    public String RX() {
        return "worldborder";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.worldborder.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 1) {
            throw new bo("commands.worldborder.usage", new Object[0]);
        }
        c c2 = this.Sv();
        if (stringArray[0].equals("set")) {
            long l2;
            if (stringArray.length != 2 && stringArray.length != 3) {
                throw new bo("commands.worldborder.set.usage", new Object[0]);
            }
            double d2 = c2.getTargetSize();
            double d3 = aq.a(stringArray[1], 1.0, 6.0E7);
            long l3 = l2 = stringArray.length > 2 ? aq.a(stringArray[2], 0L, 9223372036854775L) * 1000L : 0L;
            if (l2 > 0L) {
                c2.a(d2, d3, l2);
                if (d2 > d3) {
                    aq.a(aw2, (au)this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", d3), String.format("%.1f", d2), Long.toString(l2 / 1000L));
                } else {
                    aq.a(aw2, (au)this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", d3), String.format("%.1f", d2), Long.toString(l2 / 1000L));
                }
            } else {
                c2.aN(d3);
                aq.a(aw2, (au)this, "commands.worldborder.set.success", String.format("%.1f", d3), String.format("%.1f", d2));
            }
        } else if (stringArray[0].equals("add")) {
            if (stringArray.length != 2 && stringArray.length != 3) {
                throw new bo("commands.worldborder.add.usage", new Object[0]);
            }
            double d4 = c2.axq();
            double d5 = d4 + aq.a(stringArray[1], -d4, 6.0E7 - d4);
            long l4 = c2.getTimeUntilTarget() + (stringArray.length > 2 ? aq.a(stringArray[2], 0L, 9223372036854775L) * 1000L : 0L);
            if (l4 > 0L) {
                c2.a(d4, d5, l4);
                if (d4 > d5) {
                    aq.a(aw2, (au)this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", d5), String.format("%.1f", d4), Long.toString(l4 / 1000L));
                } else {
                    aq.a(aw2, (au)this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", d5), String.format("%.1f", d4), Long.toString(l4 / 1000L));
                }
            } else {
                c2.aN(d5);
                aq.a(aw2, (au)this, "commands.worldborder.set.success", String.format("%.1f", d5), String.format("%.1f", d4));
            }
        } else if (stringArray[0].equals("center")) {
            if (stringArray.length != 3) {
                throw new bo("commands.worldborder.center.usage", new Object[0]);
            }
            b b2 = aw2.yl();
            double d6 = aq.b((double)b2.wt() + 0.5, stringArray[1], true);
            double d7 = aq.b((double)b2.wx() + 0.5, stringArray[2], true);
            c2.C(d6, d7);
            aq.a(aw2, (au)this, "commands.worldborder.center.success", d6, d7);
        } else if (stringArray[0].equals("damage")) {
            if (stringArray.length < 2) {
                throw new bo("commands.worldborder.damage.usage", new Object[0]);
            }
            if (stringArray[1].equals("buffer")) {
                if (stringArray.length != 3) {
                    throw new bo("commands.worldborder.damage.buffer.usage", new Object[0]);
                }
                double d8 = aq.a(stringArray[2], 0.0);
                double d9 = c2.axs();
                c2.aO(d8);
                aq.a(aw2, (au)this, "commands.worldborder.damage.buffer.success", String.format("%.1f", d8), String.format("%.1f", d9));
            } else if (stringArray[1].equals("amount")) {
                if (stringArray.length != 3) {
                    throw new bo("commands.worldborder.damage.amount.usage", new Object[0]);
                }
                double d10 = aq.a(stringArray[2], 0.0);
                double d11 = c2.axt();
                c2.aP(d10);
                aq.a(aw2, (au)this, "commands.worldborder.damage.amount.success", String.format("%.2f", d10), String.format("%.2f", d11));
            }
        } else if (stringArray[0].equals("warning")) {
            if (stringArray.length < 2) {
                throw new bo("commands.worldborder.warning.usage", new Object[0]);
            }
            int n2 = aq.x(stringArray[2], 0);
            if (stringArray[1].equals("time")) {
                if (stringArray.length != 3) {
                    throw new bo("commands.worldborder.warning.time.usage", new Object[0]);
                }
                int n3 = c2.getWarningTime();
                c2.iq(n2);
                aq.a(aw2, (au)this, "commands.worldborder.warning.time.success", n2, n3);
            } else if (stringArray[1].equals("distance")) {
                if (stringArray.length != 3) {
                    throw new bo("commands.worldborder.warning.distance.usage", new Object[0]);
                }
                int n4 = c2.getWarningDistance();
                c2.ir(n2);
                aq.a(aw2, (au)this, "commands.worldborder.warning.distance.success", n2, n4);
            }
        } else {
            if (!stringArray[0].equals("get")) {
                throw new bo("commands.worldborder.usage", new Object[0]);
            }
            double d12 = c2.axq();
            aw2.a(ad.coj, bt.aF(d12 + 0.5));
            aw2.a(new t("commands.worldborder.get.success", String.format("%.0f", d12)));
        }
    }

    protected c Sv() {
        return MinecraftServer.afs().dkG[0].Sv();
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? aq.a(stringArray, "set", "center", "damage", "warning", "add", "get") : (stringArray.length == 2 && stringArray[0].equals("damage") ? aq.a(stringArray, "buffer", "amount") : (stringArray.length >= 2 && stringArray.length <= 3 && stringArray[0].equals("center") ? aq.b(stringArray, 1, b2) : (stringArray.length == 2 && stringArray[0].equals("warning") ? aq.a(stringArray, "time", "distance") : null)));
    }
}

