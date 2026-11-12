/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class r
implements aj<b> {
    private int windowId;
    private int slotId;
    private int usedButton;
    private short actionNumber;
    private co dbC;
    private int mode;

    public r() {
    }

    public r(int n2, int n3, int n4, int n5, co co2, short s2) {
        this.windowId = n2;
        this.slotId = n3;
        this.usedButton = n4;
        this.dbC = co2 != null ? co2.aeg() : null;
        this.actionNumber = s2;
        this.mode = n5;
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.windowId = ak2.readByte();
        this.slotId = ak2.readShort();
        this.usedButton = ak2.readByte();
        this.actionNumber = ak2.readShort();
        this.mode = ak2.readByte();
        this.dbC = ak2.afA();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.windowId);
        ak2.writeShort(this.slotId);
        ak2.writeByte(this.usedButton);
        ak2.writeShort(this.actionNumber);
        ak2.writeByte(this.mode);
        ak2.aO(this.dbC);
    }

    public int getWindowId() {
        return this.windowId;
    }

    public int getSlotId() {
        return this.slotId;
    }

    public int getUsedButton() {
        return this.usedButton;
    }

    public short getActionNumber() {
        return this.actionNumber;
    }

    public co agd() {
        return this.dbC;
    }

    public int getMode() {
        return this.mode;
    }
}

