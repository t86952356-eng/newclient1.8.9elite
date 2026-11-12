/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.nbt.s;
import net.minecraft.nbt.v;

public class cn {
    protected final float x;
    protected final float y;
    protected final float z;

    public cn(float f2, float f3, float f4) {
        this.x = f2;
        this.y = f3;
        this.z = f4;
    }

    public cn(v v2) {
        this.x = v2.gl(0);
        this.y = v2.gl(1);
        this.z = v2.gl(2);
    }

    public v atC() {
        v v2 = new v();
        v2.a(new s(this.x));
        v2.a(new s(this.y));
        v2.a(new s(this.z));
        return v2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof cn)) {
            return false;
        }
        cn cn2 = (cn)object;
        return this.x == cn2.x && this.y == cn2.y && this.z == cn2.z;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }
}

