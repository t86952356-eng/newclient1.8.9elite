/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.nbt.s;
import net.minecraft.nbt.v;

public class cn {
    protected final float dzM;
    protected final float dzN;
    protected final float dzO;

    public cn(float f2, float f3, float f4) {
        this.dzM = f2;
        this.dzN = f3;
        this.dzO = f4;
    }

    public cn(v v2) {
        this.dzM = v2.gl(0);
        this.dzN = v2.gl(1);
        this.dzO = v2.gl(2);
    }

    public v atC() {
        v v2 = new v();
        v2.a(new s(this.dzM));
        v2.a(new s(this.dzN));
        v2.a(new s(this.dzO));
        return v2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof cn)) {
            return false;
        }
        cn cn2 = (cn)object;
        return this.dzM == cn2.dzM && this.dzN == cn2.dzN && this.dzO == cn2.dzO;
    }

    public float getX() {
        return this.dzM;
    }

    public float getY() {
        return this.dzN;
    }

    public float getZ() {
        return this.dzO;
    }
}

