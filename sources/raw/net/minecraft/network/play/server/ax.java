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
    private int cSL;
    private String dee;
    private ba def;
    private int deg;
    private int crw;

    public ax() {
    }

    public ax(int n2, String string, ba ba2) {
        this(n2, string, ba2, 0);
    }

    public ax(int n2, String string, ba ba2, int n3) {
        this.cSL = n2;
        this.dee = string;
        this.def = ba2;
        this.deg = n3;
    }

    public ax(int n2, String string, ba ba2, int n3, int n4) {
        this(n2, string, ba2, n3);
        this.crw = n4;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.cSL = ak2.readUnsignedByte();
        this.dee = ak2.gs(32);
        this.def = ak2.afv();
        this.deg = ak2.readUnsignedByte();
        if (this.dee.equals("EntityHorse")) {
            this.crw = ak2.readInt();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.cSL);
        ak2.eS(this.dee);
        ak2.j(this.def);
        ak2.writeByte(this.deg);
        if (this.dee.equals("EntityHorse")) {
            ak2.writeInt(this.crw);
        }
    }

    public int getWindowId() {
        return this.cSL;
    }

    public String getGuiId() {
        return this.dee;
    }

    public ba ahB() {
        return this.def;
    }

    public int getSlotCount() {
        return this.deg;
    }

    public int getEntityId() {
        return this.crw;
    }

    public boolean hasSlots() {
        return this.deg > 0;
    }
}

