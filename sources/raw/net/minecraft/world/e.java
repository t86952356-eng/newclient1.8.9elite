/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.util.bt;
import net.minecraft.world.f;

public class e {
    private final f dBP;
    private final float dBQ;

    public e(f f2, long l2, long l3, float f3) {
        this.dBP = f2;
        this.dBQ = this.a(f2, l2, l3, f3);
    }

    public float auXX() {
        return this.dBQ;
    }

    public float auY() {
        return this.dBQ < 2.0f ? 0.0f : (this.dBQ > 4.0f ? 1.0f : (this.dBQ - 2.0f) / 2.0f);
    }

    private float a(f f2, long l2, long l3, float f3) {
        if (f2 == f.dBR) {
            return 0.0f;
        }
        boolean bl2 = f2 == f.dBU;
        float f4 = 0.75f;
        float f5 = bt.I(((float)l2 + -72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        f4 += f5;
        float f6 = 0.0f;
        f6 += bt.I((float)l3 / 3600000.0f, 0.0f, 1.0f) * (bl2 ? 1.0f : 0.75f);
        f6 += bt.I(f3 * 0.25f, 0.0f, f5);
        if (f2 == f.dBS) {
            f6 *= 0.5f;
        }
        return (float)f2.auZ() * (f4 += f6);
    }
}

