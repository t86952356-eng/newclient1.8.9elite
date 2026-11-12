/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class av
implements aj<a> {
    public static final String[] deb = new String[]{"tile.bed.notValid"};
    private int gameState;
    private float ded;

    public av() {
    }

    public av(int n2, float f2) {
        this.gameState = n2;
        this.ded = f2;
    }

    @Override
    public void a(ak ak2) {
        this.gameState = ak2.readUnsignedByte();
        this.ded = ak2.readFloat();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.gameState);
        ak2.writeFloat(this.ded);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getGameState() {
        return this.gameState;
    }

    public float ahv() {
        return this.ded;
    }
}

