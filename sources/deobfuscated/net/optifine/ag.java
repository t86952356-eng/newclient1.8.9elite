/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.Comparator;
import net.minecraft.src.a;
import net.optifine.ad;

public class ag
implements Comparator {
    public int compare(Object object, Object object2) {
        ad ad2 = (ad)object;
        ad ad3 = (ad)object2;
        return ad2.biW != ad3.biW ? ad3.biW - ad2.biW : (!a.a((Object)ad2.bZI, (Object)ad3.bZI) ? ad2.bZI.compareTo(ad3.bZI) : ad2.gK.compareTo(ad3.gK));
    }
}

