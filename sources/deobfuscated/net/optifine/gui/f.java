/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import net.minecraft.client.gui.as;
import net.minecraft.client.settings.c;
import net.optifine.gui.m;

public class f
extends as
implements m {
    private c ejM = null;

    public f(int n2, int n3, int n4, c c2, String string) {
        super(n2, n3, n4, c2, string);
        this.ejM = c2;
    }

    @Override
    public c aCJ() {
        return this.ejM;
    }
}

