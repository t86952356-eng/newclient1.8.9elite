/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class u
implements aj<b> {
    private int windowId;
    private int button;

    public u() {
    }

    public u(int n2, int n3) {
        this.windowId = n2;
        this.button = n3;
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.windowId = ak2.readByte();
        this.button = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.windowId);
        ak2.writeByte(this.button);
    }

    public int getWindowId() {
        return this.windowId;
    }

    public int getButton() {
        return this.button;
    }
}

