/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.biome;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.crash.i;
import net.minecraft.util.b;
import net.minecraft.util.cl;
import net.minecraft.world.ap;
import net.minecraft.world.biome.a;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.layer.x;
import net.minecraft.world.w;

public class aj {
    private net.minecraft.world.gen.layer.a dIj;
    private net.minecraft.world.gen.layer.a dIk;
    private final a dIl = new a(this);
    private final List<j> dIm = Lists.newArrayList();
    private String dIn = "";

    protected aj() {
        this.dIm.add(j.dGj);
        this.dIm.add(j.dGg);
        this.dIm.add(j.dGk);
        this.dIm.add(j.dGy);
        this.dIm.add(j.dGx);
        this.dIm.add(j.dGA);
        this.dIm.add(j.dGB);
    }

    public aj(long l2, ap ap2, String string) {
        this();
        this.dIn = string;
        net.minecraft.world.gen.layer.a[] aArray = net.minecraft.world.gen.layer.a.a(l2, ap2, string);
        this.dIj = aArray[0];
        this.dIk = aArray[1];
    }

    public aj(w w2) {
        this(w2.avD(), w2.avH().awC(), w2.avH().azM());
    }

    public List<j> axj() {
        return this.dIm;
    }

    public j bl(b b2) {
        return this.b(b2, null);
    }

    public j b(b b2, j j2) {
        return this.dIl.a(b2.wt(), b2.wx(), j2);
    }

    public float[] a(float[] fArray, int n2, int n3, int n4, int n5) {
        x.ayB();
        if (fArray == null || fArray.length < n4 * n5) {
            fArray = new float[n4 * n5];
        }
        int[] nArray = this.dIk.B(n2, n3, n4, n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            try {
                float f2 = (float)j.a(nArray[i2], j.dGT).axa() / 65536.0f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                fArray[i2] = f2;
                continue;
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Invalid Biome id");
                i i3 = a2.dY("DownfallBlock");
                i3.b("biome id", i2);
                i3.b("downfalls[] size", fArray.length);
                i3.b("x", n2);
                i3.b("z", n3);
                i3.b("w", n4);
                i3.b("h", n5);
                throw new cl(a2);
            }
        }
        return fArray;
    }

    public float g(float f2, int n2) {
        return f2;
    }

    public j[] a(j[] jArray, int n2, int n3, int n4, int n5) {
        x.ayB();
        if (jArray == null || jArray.length < n4 * n5) {
            jArray = new j[n4 * n5];
        }
        int[] nArray = this.dIj.B(n2, n3, n4, n5);
        try {
            for (int i2 = 0; i2 < n4 * n5; ++i2) {
                jArray[i2] = j.a(nArray[i2], j.dGT);
            }
            return jArray;
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Invalid Biome id");
            i i3 = a2.dY("RawBiomeBlock");
            i3.b("biomes[] size", jArray.length);
            i3.b("x", n2);
            i3.b("z", n3);
            i3.b("w", n4);
            i3.b("h", n5);
            throw new cl(a2);
        }
    }

    public j[] b(j[] jArray, int n2, int n3, int n4, int n5) {
        return this.a(jArray, n2, n3, n4, n5, true);
    }

    public j[] a(j[] jArray, int n2, int n3, int n4, int n5, boolean bl2) {
        x.ayB();
        if (jArray == null || jArray.length < n4 * n5) {
            jArray = new j[n4 * n5];
        }
        if (bl2 && n4 == 16 && n5 == 16 && (n2 & 0xF) == 0 && (n3 & 0xF) == 0) {
            j[] jArray2 = this.dIl.aR(n2, n3);
            System.arraycopy(jArray2, 0, jArray, 0, n4 * n5);
            return jArray;
        }
        int[] nArray = this.dIk.B(n2, n3, n4, n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            jArray[i2] = j.a(nArray[i2], j.dGT);
        }
        return jArray;
    }

    public boolean a(int n2, int n3, int n4, List<j> list) {
        x.ayB();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] nArray = this.dIj.B(n5, n6, n9, n10);
        try {
            for (int i2 = 0; i2 < n9 * n10; ++i2) {
                j j2 = j.io(nArray[i2]);
                if (list.contains(j2)) continue;
                return false;
            }
            return true;
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Invalid Biome id");
            i i3 = a2.dY("Layer");
            i3.b("Layer", this.dIj.toString());
            i3.b("x", n2);
            i3.b("z", n3);
            i3.b("radius", n4);
            i3.b("allowed", list);
            throw new cl(a2);
        }
    }

    public b a(int n2, int n3, int n4, List<j> list, Random random) {
        x.ayB();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] nArray = this.dIj.B(n5, n6, n9, n10);
        b b2 = null;
        int n11 = 0;
        for (int i2 = 0; i2 < n9 * n10; ++i2) {
            int n12 = n5 + i2 % n9 << 2;
            int n13 = n6 + i2 / n9 << 2;
            j j2 = j.io(nArray[i2]);
            if (!list.contains(j2) || b2 != null && random.nextInt(n11 + 1) != 0) continue;
            b2 = new b(n12, 0, n13);
            ++n11;
        }
        return b2;
    }

    public void ss() {
        this.dIl.ss();
    }
}

