/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.event;

import net.minecraft.event.b;

public class a {
    private final b cKG;
    private final String cKH;

    public a(b b2, String string) {
        this.cKG = b2;
        this.cKH = string;
    }

    public b acS() {
        return this.cKG;
    }

    public String SN() {
        return this.cKH;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            a a2 = (a)object;
            if (this.cKG != a2.cKG) {
                return false;
            }
            if (this.cKH != null) {
                return this.cKH.equals(a2.cKH);
            }
            return a2.cKH == null;
        }
        return false;
    }

    public String toString() {
        return "ClickEvent{action=" + String.valueOf((Object)this.cKG) + ", value='" + this.cKH + "'}";
    }

    public int hashCode() {
        int n2 = this.cKG.hashCode();
        n2 = 31 * n2 + (this.cKH != null ? this.cKH.hashCode() : 0);
        return n2;
    }
}

