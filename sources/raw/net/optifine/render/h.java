/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

import net.optifine.util.v;

public class h {
    private int deS = -1;
    private int ans = 0;
    private final v<h> eul = new v<h>(this);

    public int getPosition() {
        return this.deS;
    }

    public int getSize() {
        return this.ans;
    }

    public int aEh() {
        return this.deS + this.ans;
    }

    public void setPosition(int n2) {
        this.deS = n2;
    }

    public void ip(int n2) {
        this.ans = n2;
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
        return this.deS + "/" + this.ans + "/" + (this.deS + this.ans);
    }
}

