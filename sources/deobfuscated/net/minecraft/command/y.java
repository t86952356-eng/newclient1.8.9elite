/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.da;
import net.minecraft.world.ai;
import net.minecraft.world.w;

public class y
extends a {
    @Override
    public String RX() {
        return "particle";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.particle.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 8) {
            throw new bo("commands.particle.usage", new Object[0]);
        }
        boolean bl2 = false;
        as as2 = null;
        for (as as3 : as.values()) {
            if (as3.atb()) {
                if (!stringArray[0].startsWith(as3.asX())) continue;
                bl2 = true;
                as2 = as3;
                break;
            }
            if (!stringArray[0].equals(as3.asX())) continue;
            bl2 = true;
            as2 = as3;
            break;
        }
        if (!bl2) {
            throw new n("commands.particle.notFound", stringArray[0]);
        }
        String string = stringArray[0];
        da da2 = aw2.Sd();
        double d2 = (float)y.b(da2.dAG, stringArray[1], true);
        double d3 = (float)y.b(da2.dAH, stringArray[2], true);
        double d4 = (float)y.b(da2.dAI, stringArray[3], true);
        double d5 = (float)y.dO(stringArray[4]);
        double d6 = (float)y.dO(stringArray[5]);
        double d7 = (float)y.dO(stringArray[6]);
        double d8 = (float)y.dO(stringArray[7]);
        int n2 = 0;
        if (stringArray.length > 8) {
            n2 = y.x(stringArray[8], 0);
        }
        boolean bl3 = stringArray.length > 9 && "force".equals(stringArray[9]);
        w w2 = aw2.Se();
        if (w2 instanceof ai) {
            ai ai2 = (ai)w2;
            int[] nArray = new int[as2.asZ()];
            if (as2.atb()) {
                String[] stringArray2 = stringArray[0].split("_", 3);
                for (int i2 = 1; i2 < stringArray2.length; ++i2) {
                    try {
                        nArray[i2 - 1] = Integer.parseInt(stringArray2[i2]);
                        continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new n("commands.particle.notFound", stringArray[0]);
                    }
                }
            }
            ai2.a(as2, bl3, d2, d3, d4, n2, d5, d6, d7, d8, nArray);
            y.a(aw2, (au)this, "commands.particle.success", string, Math.max(n2, 1));
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? y.a(stringArray, as.asW()) : (stringArray.length > 1 && stringArray.length <= 4 ? y.a(stringArray, 1, b2) : (stringArray.length == 10 ? y.a(stringArray, "normal", "force") : null));
    }
}

