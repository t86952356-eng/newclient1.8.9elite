/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.nbt.n;

public class q {
    public static final q dCy = new q("");
    private final String dCz;

    public q(String string) {
        this.dCz = string;
    }

    public boolean isEmpty() {
        return this.dCz == null || this.dCz.isEmpty();
    }

    public String avn() {
        return this.dCz;
    }

    public void K(n n2) {
        n2.R("Lock", this.dCz);
    }

    public static q L(n n2) {
        if (n2.C("Lock", 8)) {
            String string = n2.eK("Lock");
            return new q(string);
        }
        return dCy;
    }
}

