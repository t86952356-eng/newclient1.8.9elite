/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.ba;

public class ax
implements aj<a> {
    private int windowId;
    private String guiId;
    private ba def;
    private int slotCount;
    private int entityId;

    public ax() {
    }

    public ax(int n2, String string, ba ba2) {
        this(n2, string, ba2, 0);
    }

    public ax(int n2, String string, ba ba2, int n3) {
        this.windowId = n2;
        this.guiId = string;
        this.def = ba2;
        this.slotCount = n3;
    }

    public ax(int n2, String string, ba ba2, int n3, int n4) {
        this(n2, string, ba2, n3);
        this.entityId = n4;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.windowId = ak2.readUnsignedByte();
        this.guiId = ak2.gs(32);
        this.def = ak2.afv();
        this.slotCount = ak2.readUnsignedByte();
        if (this.guiId.equals("EntityHorse")) {
            this.entityId = ak2.readInt();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.windowId);
        ak2.eS(this.guiId);
        ak2.j(this.def);
        ak2.writeByte(this.slotCount);
        if (this.guiId.equals("EntityHorse")) {
            ak2.writeInt(this.entityId);
        }
    }

    public int getWindowId() {
        return this.windowId;
    }

    public String getGuiId() {
        return this.guiId;
    }

    public ba ahB() {
        return this.def;
    }

    public int getSlotCount() {
        return this.slotCount;
    }

    public int getEntityId() {
        return this.entityId;
    }

    public boolean hasSlots() {
        return this.slotCount > 0;
    }
}

