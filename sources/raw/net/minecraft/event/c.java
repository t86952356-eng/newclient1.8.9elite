/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.event;

import net.minecraft.event.d;
import net.minecraft.util.ba;

public class c {
    private final d cKS;
    private final ba cKT;

    public c(d d2, ba ba2) {
        this.cKS = d2;
        this.cKT = ba2;
    }

    public d acW() {
        return this.cKS;
    }

    public ba acX() {
        return this.cKT;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            c c2 = (c)object;
            if (this.cKS != c2.cKS) {
                return false;
            }
            if (this.cKT != null) {
                return this.cKT.equals(c2.cKT);
            }
            return c2.cKT == null;
        }
        return false;
    }

    public String toString() {
        return "HoverEvent{action=" + String.valueOf((Object)this.cKS) + ", value='" + String.valueOf(this.cKT) + "'}";
    }

    public int hashCode() {
        int n2 = this.cKS.hashCode();
        n2 = 31 * n2 + (this.cKT != null ? this.cKT.hashCode() : 0);
        return n2;
    }
}

