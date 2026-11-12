/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class bb
implements aj<a> {
    private int windowId;
    private int dej;
    private int dek;

    public bb() {
    }

    public bb(int n2, int n3, int n4) {
        this.windowId = n2;
        this.dej = n3;
        this.dek = n4;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.windowId = ak2.readUnsignedByte();
        this.dej = ak2.readShort();
        this.dek = ak2.readShort();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.windowId);
        ak2.writeShort(this.dej);
        ak2.writeShort(this.dek);
    }

    public int getWindowId() {
        return this.windowId;
    }

    public int ahH() {
        return this.dej;
    }

    public int ahI() {
        return this.dek;
    }
}

