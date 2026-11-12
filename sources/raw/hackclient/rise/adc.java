/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class adc
extends Record {
    private final String aCq;
    private final String[] aCr;
    private final String aCs;

    private adc(String string, String[] stringArray, String string2) {
        this.aCq = string;
        this.aCr = stringArray;
        this.aCs = string2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{adc.class, "alias;args;normalizedQuery", "aCq", "aCr", "aCs"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{adc.class, "alias;args;normalizedQuery", "aCq", "aCr", "aCs"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{adc.class, "alias;args;normalizedQuery", "aCq", "aCr", "aCs"}, this, object);
    }

    public String rz() {
        return this.aCq;
    }

    public String[] rA() {
        return this.aCr;
    }

    public String rB() {
        return this.aCs;
    }
}

