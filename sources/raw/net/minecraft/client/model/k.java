/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;

public class k
extends d {
    public ag bzd = new ag(this, 0, 0).D(64, 64);
    public ag bze;
    public ag bzf;

    public k() {
        this.bzd.a(0.0f, -5.0f, -14.0f, 14, 5, 14, 0.0f);
        this.bzd.bBC = 1.0f;
        this.bzd.bBD = 7.0f;
        this.bzd.bBE = 15.0f;
        this.bzf = new ag(this, 0, 0).D(64, 64);
        this.bzf.a(-1.0f, -2.0f, -15.0f, 2, 4, 1, 0.0f);
        this.bzf.bBC = 8.0f;
        this.bzf.bBD = 7.0f;
        this.bzf.bBE = 15.0f;
        this.bze = new ag(this, 0, 19).D(64, 64);
        this.bze.a(0.0f, 0.0f, 0.0f, 14, 10, 14, 0.0f);
        this.bze.bBC = 1.0f;
        this.bze.bBD = 6.0f;
        this.bze.bBE = 1.0f;
    }

    public void GZ() {
        this.bzf.bBF = this.bzd.bBF;
        this.bzd.aa(0.0625f);
        this.bzf.aa(0.0625f);
        this.bze.aa(0.0625f);
    }
}

