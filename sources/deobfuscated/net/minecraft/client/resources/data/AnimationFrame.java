/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.data;

public class AnimationFrame {
    private final int ceu;
    private final int cev;

    public AnimationFrame(int n2) {
        this(n2, -1);
    }

    public AnimationFrame(int n2, int n3) {
        this.ceu = n2;
        this.cev = n3;
    }

    public boolean PV() {
        return this.cev == -1;
    }

    public int PW() {
        return this.cev;
    }

    public int PX() {
        return this.ceu;
    }
}

