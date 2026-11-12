/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package hackclient.rise;

import com.google.gson.Gson;
import hackclient.rise.a;
import hackclient.rise.abf;
import hackclient.rise.ady;
import hackclient.rise.am;
import hackclient.rise.ge;
import hackclient.rise.gf;
import hackclient.rise.gg;
import hackclient.rise.gi;
import net.minecraft.client.d;

public interface aea {
    public static final d aER = d.AZ();

    default public a sd() {
        return a.a;
    }

    default public gf u() {
        return this.sd().u();
    }

    default public abf v() {
        return this.sd().v();
    }

    default public ge b(gg gg2) {
        return this.u().a(gg2);
    }

    default public ge b(gg gg2, int n2) {
        return this.u().a(gg2, n2);
    }

    default public <T extends am> T d(Class<T> clazz) {
        return this.sd().h().b(clazz);
    }

    default public ady rP() {
        return this.sd().k().rP();
    }

    default public <T extends gi> T e(Class<T> clazz) {
        return this.sd().g().c(clazz);
    }

    default public Gson A() {
        return this.sd().A();
    }

    default public d se() {
        return d.AZ();
    }
}

