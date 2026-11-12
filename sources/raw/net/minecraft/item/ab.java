/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import java.util.Random;
import net.minecraft.entity.c;
import net.minecraft.entity.item.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cn;
import net.minecraft.world.w;

public class ab
extends d {
    public ab() {
        this.d(net.minecraft.creativetab.a.cpy);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        double d2;
        double d3;
        b b3;
        if (ao2 == ao.dwq) {
            return false;
        }
        boolean bl2 = w2.L(b2).df().a(w2, b2);
        b b4 = b3 = bl2 ? b2 : b2.x(ao2);
        if (!a2.a(b3, ao2, co2)) {
            return false;
        }
        b b5 = b3.aqX();
        boolean bl3 = !w2.aG(b3) && !w2.L(b3).df().a(w2, b3);
        if (bl3 |= !w2.aG(b5) && !w2.L(b5).df().a(w2, b5)) {
            return false;
        }
        double d4 = b3.wt();
        List<c> list = w2.b((c)null, net.minecraft.util.a.h(d4, d3 = (double)b3.wu(), d2 = (double)b3.wx(), d4 + 1.0, d3 + 2.0, d2 + 1.0));
        if (list.size() > 0) {
            return false;
        }
        if (!w2.dDw) {
            w2.aL(b3);
            w2.aL(b5);
            a a3 = new a(w2, d4 + 0.5, d3, d2 + 0.5);
            float f5 = (float)bt.bL((bt.bN(a2.pl - 180.0f) + 22.5f) / 45.0f) * 45.0f;
            a3.b(d4 + 0.5, d3, d2 + 0.5, f5, 0.0f);
            this.a(a3, w2.dDk);
            n n2 = co2.aek();
            if (n2 != null && n2.C("EntityTag", 10)) {
                n n3 = new n();
                a3.k(n3);
                n3.w(n2.eN("EntityTag"));
                a3.a(n3);
            }
            w2.G(a3);
        }
        --co2.cWZ;
        return true;
    }

    private void a(a a2, Random random) {
        cn cn2 = a2.XU();
        float f2 = random.nextFloat() * 5.0f;
        float f3 = random.nextFloat() * 20.0f - 10.0f;
        cn cn3 = new cn(cn2.getX() + f2, cn2.getY() + f3, cn2.getZ());
        a2.a(cn3);
        cn2 = a2.XV();
        f2 = random.nextFloat() * 10.0f - 5.0f;
        cn3 = new cn(cn2.getX(), cn2.getY() + f2, cn2.getZ());
        a2.b(cn3);
    }
}

