/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model.anim;

import net.minecraft.client.model.ag;
import net.optifine.entity.model.anim.f;
import net.optifine.expr.o;

public class e
implements o {
    private final String egx;
    private final ag egy;
    private final f egz;

    public e(String string, ag ag2, f f2) {
        this.egx = string;
        this.egy = ag2;
        this.egz = f2;
    }

    @Override
    public net.optifine.expr.f aCq() {
        return net.optifine.expr.f.ehO;
    }

    @Override
    public float aCr() {
        return this.getValue();
    }

    public float getValue() {
        return this.egz.d(this.egy);
    }

    public void cf(float f2) {
        this.egz.a(this.egy, f2);
    }

    public String toString() {
        return this.egx;
    }
}

