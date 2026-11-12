/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import net.minecraft.client.gui.at;
import net.minecraft.client.settings.c;
import net.optifine.gui.m;

public class g
extends at
implements m {
    private c ejM = null;

    public g(int n2, int n3, int n4, c c2) {
        super(n2, n3, n4, c2);
        this.ejM = c2;
    }

    @Override
    public c aCJ() {
        return this.ejM;
    }
}

