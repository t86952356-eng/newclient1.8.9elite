/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.Comparator;
import net.optifine.ad;

class af
implements Comparator {
    af() {
    }

    public int compare(Object object, Object object2) {
        ad ad2 = (ad)object;
        ad ad3 = (ad)object2;
        return ad2.eaB != ad3.eaB ? ad2.eaB - ad3.eaB : (ad2.biW != ad3.biW ? ad3.biW - ad2.biW : (!ad2.bZI.equals(ad3.bZI) ? ad2.bZI.compareTo(ad3.bZI) : ad2.gK.compareTo(ad3.gK)));
    }
}

