/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.ba;
import net.minecraft.util.p;

public class s
extends p {
    public String Yg;

    public s(String string) {
        this.Yg = string;
    }

    public String arr() {
        return this.Yg;
    }

    @Override
    public String arj() {
        return this.Yg;
    }

    public s ars() {
        s s2 = new s(this.Yg);
        s2.a(this.arp().arG());
        for (ba ba2 : this.aro()) {
            s2.n(ba2.arl());
        }
        return s2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        return this.Yg.equals(s2.arr()) && super.equals(object);
    }

    @Override
    public String toString() {
        return "TextComponent{text='" + this.Yg + "', siblings=" + String.valueOf(this.dun) + ", style=" + String.valueOf(this.arp()) + "}";
    }

    @Override
    public /* synthetic */ ba arl() {
        return this.ars();
    }
}

