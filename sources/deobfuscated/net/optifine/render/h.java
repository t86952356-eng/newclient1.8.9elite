/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

import net.optifine.util.v;

public class h {
    private int position = -1;
    private int size = 0;
    private final v<h> eul = new v<h>(this);

    public int getPosition() {
        return this.position;
    }

    public int getSize() {
        return this.size;
    }

    public int aEh() {
        return this.position + this.size;
    }

    public void setPosition(int n2) {
        this.position = n2;
    }

    public void ip(int n2) {
        this.size = n2;
    }

    public v<h> aEi() {
        return this.eul;
    }

    public h aEj() {
        v<h> v2 = this.eul.aJk();
        return v2 == null ? null : v2.aJj();
    }

    public h aEk() {
        v<h> v2 = this.eul.aJl();
        return v2 == null ? null : v2.aJj();
    }

    public String toString() {
        return this.position + "/" + this.size + "/" + (this.position + this.size);
    }
}

