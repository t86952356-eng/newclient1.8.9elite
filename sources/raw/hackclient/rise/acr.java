/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.p;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class acr
extends Record {
    private final p aBP;
    private final String aBQ;
    private final String aBR;
    private final String aBS;

    private acr(p p2, String string, String string2, String string3) {
        this.aBP = p2;
        this.aBQ = string;
        this.aBR = string2;
        this.aBS = string3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{acr.class, "bindable;canonicalInsertToken;subtitle;meta", "aBP", "aBQ", "aBR", "aBS"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{acr.class, "bindable;canonicalInsertToken;subtitle;meta", "aBP", "aBQ", "aBR", "aBS"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{acr.class, "bindable;canonicalInsertToken;subtitle;meta", "aBP", "aBQ", "aBR", "aBS"}, this, object);
    }

    public p rv() {
        return this.aBP;
    }

    public String rw() {
        return this.aBQ;
    }

    public String rx() {
        return this.aBR;
    }

    public String ry() {
        return this.aBS;
    }
}

