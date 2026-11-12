/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.util.ArrayList;
import java.util.HashSet;
import net.optifine.config.j;

public class a {
    private final int eut;
    private final j[] euu;

    public a(int n2, j[] jArray) {
        this.eut = n2;
        this.euu = jArray;
    }

    public int aEn() {
        return this.eut;
    }

    public boolean bH(int n2, int n3) {
        for (int i2 = 0; i2 < this.euu.length; ++i2) {
            j j2 = this.euu[i2];
            if (!j2.bH(n2, n3)) continue;
            return true;
        }
        return false;
    }

    public int[] aAy() {
        Object object;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i2 = 0; i2 < this.euu.length; ++i2) {
            object = this.euu[i2];
            int n2 = ((j)object).zW();
            hashSet.add(n2);
        }
        Integer[] integerArray = hashSet.toArray(new Integer[hashSet.size()]);
        object = net.minecraft.src.a.a(integerArray);
        return object;
    }

    public j[] jG(int n2) {
        ArrayList<j> arrayList = new ArrayList<j>();
        for (int i2 = 0; i2 < this.euu.length; ++i2) {
            j j2 = this.euu[i2];
            if (j2.zW() != n2) continue;
            arrayList.add(j2);
        }
        j[] jArray = arrayList.toArray(new j[arrayList.size()]);
        return jArray;
    }

    public String toString() {
        return "block." + this.eut + "=" + net.minecraft.src.a.c(this.euu);
    }
}

