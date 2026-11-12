/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.c;

public class as
extends c {
    private final net.minecraft.client.settings.c bqc;

    public as(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, null, string);
    }

    public as(int n2, int n3, int n4, int n5, int n6, String string) {
        super(n2, n3, n4, n5, n6, string);
        this.bqc = null;
    }

    public as(int n2, int n3, int n4, net.minecraft.client.settings.c c2, String string) {
        super(n2, n3, n4, 150, 20, string);
        this.bqc = c2;
    }

    public net.minecraft.client.settings.c Fa() {
        return this.bqc;
    }
}

