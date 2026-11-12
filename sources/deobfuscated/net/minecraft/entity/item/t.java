/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.entity.item;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.entity.c;
import net.minecraft.entity.item.u;
import net.minecraft.entity.l;
import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class t
extends l {
    public u cDa;

    public t(w w2) {
        super(w2);
    }

    public t(w w2, b b2, ao ao2) {
        super(w2, b2);
        ArrayList arrayList = Lists.newArrayList();
        u[] uArray = u.values();
        int n2 = uArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            u u2;
            this.cDa = u2 = uArray[i2];
            this.t(ao2);
            if (!this.UK()) continue;
            arrayList.add(u2);
        }
        if (!arrayList.isEmpty()) {
            this.cDa = (u)((Object)arrayList.get(this.ta.nextInt(arrayList.size())));
        }
        this.t(ao2);
    }

    public t(w w2, b b2, ao ao2, String string) {
        this(w2, b2, ao2);
        for (u u2 : u.values()) {
            if (!u2.cDC.equals(string)) continue;
            this.cDa = u2;
            break;
        }
        this.t(ao2);
    }

    @Override
    public void d(n n2) {
        n2.R("Motive", this.cDa.cDC);
        super.d(n2);
    }

    @Override
    public void e(n n2) {
        String string = n2.eK("Motive");
        for (u u2 : u.values()) {
            if (!u2.cDC.equals(string)) continue;
            this.cDa = u2;
        }
        if (this.cDa == null) {
            this.cDa = u.cDb;
        }
        super.e(n2);
    }

    @Override
    public int UL() {
        return this.cDa.cDD;
    }

    @Override
    public int UM() {
        return this.cDa.cDE;
    }

    @Override
    public void ab(c c2) {
        if (this.baU.Si().gw("doEntityDrops")) {
            if (c2 instanceof a) {
                a a2 = (a)c2;
                if (a2.cIt.cJM) {
                    return;
                }
            }
            this.a(new co(Items.cQr), 0.0f);
        }
    }

    @Override
    public void b(double d2, double d3, double d4, float f2, float f3) {
        b b2 = this.ctx.ag(d2 - this.gW, d3 - this.gX, d4 - this.gY);
        this.setPosition(b2.wt(), b2.wu(), b2.wx());
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        b b2 = this.ctx.ag(d2 - this.gW, d3 - this.gX, d4 - this.gY);
        this.setPosition(b2.wt(), b2.wu(), b2.wx());
    }
}

