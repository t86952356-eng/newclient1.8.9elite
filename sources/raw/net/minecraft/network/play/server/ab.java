/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.world.w;

public class ab
implements aj<a> {
    private int crw;
    private byte dcZ;

    public ab() {
    }

    public ab(c c2, byte by2) {
        this.crw = c2.getEntityId();
        this.dcZ = by2;
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.readInt();
        this.dcZ = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.crw);
        ak2.writeByte(this.dcZ);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public c l(w w2) {
        return w2.cn(this.crw);
    }

    public byte getOpCode() {
        return this.dcZ;
    }
}

