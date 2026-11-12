/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.ba;
import net.minecraft.util.p;

public class o
extends p {
    private final String dum;

    public o(String string) {
        this.dum = string;
    }

    public String arm() {
        return this.dum;
    }

    @Override
    public String arj() {
        return this.dum;
    }

    public o arn() {
        o o2 = new o(this.dum);
        o2.a(this.arp().arG());
        for (ba ba2 : this.aro()) {
            o2.n(ba2.arl());
        }
        return o2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof o)) {
            return false;
        }
        o o2 = (o)object;
        return this.dum.equals(o2.dum) && super.equals(object);
    }

    @Override
    public String toString() {
        return "SelectorComponent{pattern='" + this.dum + "', siblings=" + String.valueOf(this.dun) + ", style=" + String.valueOf(this.arp()) + "}";
    }

    @Override
    public /* synthetic */ ba arl() {
        return this.arn();
    }
}

