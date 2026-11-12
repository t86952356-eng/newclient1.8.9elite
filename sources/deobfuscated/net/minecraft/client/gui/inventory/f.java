/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.gui.inventory.b;
import net.minecraft.client.gui.inventory.c;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.resources.I18n;
import net.minecraft.potion.a;

class f
extends c {
    private final int bvV;
    private final int bvW;
    final /* synthetic */ b bvX;

    public f(b b2, int n2, int n3, int n4, int n5, int n6) {
        this.bvX = b2;
        super(n2, n3, n4, i.bwf, 0 + a.dgt[n5].aiY() % 8 * 18, 198 + a.dgt[n5].aiY() / 8 * 18);
        this.bvV = n5;
        this.bvW = n6;
    }

    @Override
    public void drawButtonForegroundLayer(int n2, int n3) {
        Object object = I18n.a(a.dgt[this.bvV].getName(), new Object[0]);
        if (this.bvW >= 3 && this.bvV != a.dgF.id) {
            object = (String)object + " II";
        }
        b.c(this.bvX, (String)object, n2, n3);
    }
}

