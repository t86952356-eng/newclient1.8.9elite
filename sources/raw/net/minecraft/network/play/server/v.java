/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package net.minecraft.network.play.server;

import lombok.Generated;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.world.w;

public class v
implements aj<a> {
    public int crw;
    public byte dcV;
    public byte dcW;
    public byte dcX;
    public byte dcy;
    public byte dcz;
    public boolean aO;
    public boolean dcY;

    public v() {
    }

    public v(int n2) {
        this.crw = n2;
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String toString() {
        return "Entity_" + super.toString();
    }

    public c l(w w2) {
        return w2.cn(this.crw);
    }

    public byte agR() {
        return this.dcV;
    }

    public byte agS() {
        return this.dcW;
    }

    public byte agT() {
        return this.dcX;
    }

    public byte agx() {
        return this.dcy;
    }

    public byte agy() {
        return this.dcz;
    }

    public boolean agU() {
        return this.dcY;
    }

    public boolean agV() {
        return this.aO;
    }

    @Generated
    public int getEntityId() {
        return this.crw;
    }

    @Generated
    public boolean agW() {
        return this.dcY;
    }
}

