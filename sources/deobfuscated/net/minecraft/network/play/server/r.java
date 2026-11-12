/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.item.t;
import net.minecraft.entity.item.u;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;

public class r
implements aj<a> {
    private int entityID;
    private b aca;
    private ao aWT;
    private String title;

    public r() {
    }

    public r(t t2) {
        this.entityID = t2.getEntityId();
        this.aca = t2.UN();
        this.aWT = t2.cty;
        this.title = t2.cDa.cDC;
    }

    @Override
    public void a(ak ak2) {
        this.entityID = ak2.afw();
        this.title = ak2.gs(u.cDB);
        this.aca = ak2.afu();
        this.aWT = ao.hz(ak2.readUnsignedByte());
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityID);
        ak2.eS(this.title);
        ak2.ak(this.aca);
        ak2.writeByte(this.aWT.asA());
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityID() {
        return this.entityID;
    }

    public b yl() {
        return this.aca;
    }

    public ao yx() {
        return this.aWT;
    }

    public String getTitle() {
        return this.title;
    }
}

