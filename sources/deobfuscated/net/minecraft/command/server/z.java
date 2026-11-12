/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class z
extends a {
    @Override
    public String RX() {
        return "summon";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.summon.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        w w2;
        if (stringArray.length < 1) {
            throw new bo("commands.summon.usage", new Object[0]);
        }
        String string = stringArray[0];
        net.minecraft.util.b b2 = aw2.yl();
        da da2 = aw2.Sd();
        double d2 = da2.dAG;
        double d3 = da2.dAH;
        double d4 = da2.dAI;
        if (stringArray.length >= 4) {
            d2 = z.b(d2, stringArray[1], true);
            d3 = z.b(d3, stringArray[2], false);
            d4 = z.b(d4, stringArray[3], true);
            b2 = new net.minecraft.util.b(d2, d3, d4);
        }
        if (!(w2 = aw2.Se()).aJ(b2)) {
            throw new n("commands.summon.outOfWorld", new Object[0]);
        }
        if ("LightningBolt".equals(string)) {
            w2.ay(new net.minecraft.entity.effect.a(w2, d2, d3, d4));
            z.a(aw2, (au)this, "commands.summon.success", new Object[0]);
        } else {
            Object object;
            net.minecraft.nbt.n n2 = new net.minecraft.nbt.n();
            boolean bl2 = false;
            if (stringArray.length >= 5) {
                object = z.a(aw2, stringArray, 4);
                try {
                    n2 = b.ez(object.arq());
                    bl2 = true;
                }
                catch (i i2) {
                    throw new n("commands.summon.tagError", i2.getMessage());
                }
            }
            n2.R("id", string);
            try {
                object = net.minecraft.entity.n.a(n2, w2);
            }
            catch (RuntimeException runtimeException) {
                throw new n("commands.summon.failed", new Object[0]);
            }
            if (object == null) {
                throw new n("commands.summon.failed", new Object[0]);
            }
            ((c)object).b(d2, d3, d4, ((c)object).pl, ((c)object).pm);
            if (!bl2 && object instanceof p) {
                ((p)object).a(w2.bg(new net.minecraft.util.b((c)object)), null);
            }
            w2.G((c)object);
            Object object2 = object;
            net.minecraft.nbt.n n3 = n2;
            while (object2 != null && n3.C("Riding", 10)) {
                c c2 = net.minecraft.entity.n.a(n3.eN("Riding"), w2);
                if (c2 != null) {
                    c2.b(d2, d3, d4, c2.pl, c2.pm);
                    w2.G(c2);
                    ((c)object2).D(c2);
                }
                object2 = c2;
                n3 = n3.eN("Riding");
            }
            z.a(aw2, (au)this, "commands.summon.success", new Object[0]);
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length == 1 ? z.a(stringArray, net.minecraft.entity.n.UP()) : (stringArray.length > 1 && stringArray.length <= 4 ? z.a(stringArray, 1, b2) : null);
    }
}

