/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.util.b;
import net.minecraft.world.biome.aj;
import net.minecraft.world.biome.j;

public class ak
extends aj {
    private final j dIo;
    private final float dIp;

    public ak(j j2, float f2) {
        this.dIo = j2;
        this.dIp = f2;
    }

    @Override
    public j bl(b b2) {
        return this.dIo;
    }

    @Override
    public j[] a(j[] jArray, int n2, int n3, int n4, int n5) {
        if (jArray == null || jArray.length < n4 * n5) {
            jArray = new j[n4 * n5];
        }
        Arrays.fill(jArray, 0, n4 * n5, this.dIo);
        return jArray;
    }

    @Override
    public float[] a(float[] fArray, int n2, int n3, int n4, int n5) {
        if (fArray == null || fArray.length < n4 * n5) {
            fArray = new float[n4 * n5];
        }
        Arrays.fill(fArray, 0, n4 * n5, this.dIp);
        return fArray;
    }

    @Override
    public j[] b(j[] jArray, int n2, int n3, int n4, int n5) {
        if (jArray == null || jArray.length < n4 * n5) {
            jArray = new j[n4 * n5];
        }
        Arrays.fill(jArray, 0, n4 * n5, this.dIo);
        return jArray;
    }

    @Override
    public j[] a(j[] jArray, int n2, int n3, int n4, int n5, boolean bl2) {
        return this.b(jArray, n2, n3, n4, n5);
    }

    @Override
    public b a(int n2, int n3, int n4, List<j> list, Random random) {
        return list.contains(this.dIo) ? new b(n2 - n4 + random.nextInt(n4 * 2 + 1), 0, n3 - n4 + random.nextInt(n4 * 2 + 1)) : null;
    }

    @Override
    public boolean a(int n2, int n3, int n4, List<j> list) {
        return list.contains(this.dIo);
    }
}

