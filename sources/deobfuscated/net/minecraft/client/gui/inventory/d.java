/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.gui.inventory.b;
import net.minecraft.client.gui.inventory.c;
import net.minecraft.client.resources.I18n;

class d
extends c {
    final /* synthetic */ b bvT;

    public d(b b2, int n2, int n3, int n4) {
        this.bvT = b2;
        super(n2, n3, n4, b.bvL, 112, 220);
    }

    @Override
    public void drawButtonForegroundLayer(int n2, int n3) {
        b.a(this.bvT, I18n.a("gui.cancel", new Object[0]), n2, n3);
    }
}

