/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;

public class c
extends d {
    public ag byl;
    public ag bym;
    public ag byn;

    public c() {
        this.bys = 64;
        this.byt = 64;
        this.byl = new ag(this, 0, 0);
        this.byl.a(-10.0f, 0.0f, -2.0f, 20, 40, 1, 0.0f);
        this.bym = new ag(this, 44, 0);
        this.bym.a(-1.0f, -30.0f, -1.0f, 2, 42, 2, 0.0f);
        this.byn = new ag(this, 0, 42);
        this.byn.a(-10.0f, -32.0f, -1.0f, 20, 2, 2, 0.0f);
    }

    public void GY() {
        this.byl.bBD = -32.0f;
        this.byl.aa(0.0625f);
        this.bym.aa(0.0625f);
        this.byn.aa(0.0625f);
    }
}

