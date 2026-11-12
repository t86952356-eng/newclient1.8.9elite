/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.gui.inventory.b;
import net.minecraft.client.gui.inventory.c;
import net.minecraft.client.resources.I18n;

class e
extends c {
    final /* synthetic */ b bvU;

    public e(b b2, int n2, int n3, int n4) {
        this.bvU = b2;
        super(n2, n3, n4, b.bvL, 90, 220);
    }

    @Override
    public void drawButtonForegroundLayer(int n2, int n3) {
        b.b(this.bvU, I18n.a("gui.done", new Object[0]), n2, n3);
    }
}

