/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;

public class aj
extends d {
    public ag bCe = new ag(this, 0, 0);
    public ag bCf;

    public aj() {
        this.bCe.a(-12.0f, -14.0f, -1.0f, 24, 12, 2, 0.0f);
        this.bCf = new ag(this, 0, 14);
        this.bCf.a(-1.0f, -2.0f, -1.0f, 2, 14, 2, 0.0f);
    }

    public void Hh() {
        this.bCe.aa(0.0625f);
        this.bCf.aa(0.0625f);
    }
}

