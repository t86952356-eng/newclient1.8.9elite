/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui.inventory;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.gui.inventory.j;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.item.co;

class k
extends b {
    public List<co> bwS = Lists.newArrayList();

    public k(a a2) {
        int n2;
        g g2 = a2.cHV;
        for (n2 = 0; n2 < 5; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.c(new ak(j.bwI, n2 * 9 + i2, 9 + i2 * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.c(new ak(g2, n2, 9 + n2 * 18, 112));
        }
        this.W(0.0f);
    }

    @Override
    public boolean i(a a2) {
        return true;
    }

    public void W(float f2) {
        int n2 = (this.bwS.size() + 9 - 1) / 9 - 5;
        int n3 = (int)((double)(f2 * (float)n2) + 0.5);
        if (n3 < 0) {
            n3 = 0;
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 9; ++i3) {
                int n4 = i3 + (i2 + n3) * 9;
                if (n4 >= 0 && n4 < this.bwS.size()) {
                    j.bwI.g(i3 + i2 * 9, this.bwS.get(n4));
                    continue;
                }
                j.bwI.g(i3 + i2 * 9, null);
            }
        }
    }

    public boolean GI() {
        return this.bwS.size() > 45;
    }

    @Override
    protected void a(int n2, int n3, boolean bl2, a a2) {
    }

    @Override
    public co a(a a2, int n2) {
        ak ak2;
        if (n2 >= this.cSK.size() - 9 && n2 < this.cSK.size() && (ak2 = (ak)this.cSK.get(n2)) != null && ak2.GJ()) {
            ak2.I(null);
        }
        return null;
    }

    @Override
    public boolean a(co co2, ak ak2) {
        return ak2.cUm > 90;
    }

    @Override
    public boolean b(ak ak2) {
        return ak2.cUj instanceof g || ak2.cUm > 90 && ak2.cUl <= 162;
    }
}

