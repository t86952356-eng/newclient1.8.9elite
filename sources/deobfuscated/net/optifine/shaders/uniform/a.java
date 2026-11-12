/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import net.optifine.expr.l;
import net.optifine.shaders.uniform.n;
import net.optifine.shaders.uniform.r;
import net.optifine.shaders.w;

public class a {
    private final String name;
    private final r eIL;
    private final l eIM;
    private final n eIN;

    public a(String string, r r2, l l2) {
        this.name = string;
        this.eIL = r2;
        this.eIM = l2;
        this.eIN = r2.jY(string);
    }

    public void kp(int n2) {
        this.eIN.kp(n2);
    }

    public void jA() {
        if (this.eIN.aIP()) {
            try {
                this.eIL.a(this.eIM, this.eIN);
            }
            catch (RuntimeException runtimeException) {
                w.iG("Error updating custom uniform: " + this.eIN.getName());
                w.iG(runtimeException.getClass().getName() + ": " + runtimeException.getMessage());
                this.eIN.disable();
                w.iG("Custom uniform disabled: " + this.eIN.getName());
            }
        }
    }

    public void aX() {
        this.eIN.aX();
    }

    public String getName() {
        return this.name;
    }

    public r aIB() {
        return this.eIL;
    }

    public l aIC() {
        return this.eIM;
    }

    public n aID() {
        return this.eIN;
    }

    public String toString() {
        return this.eIL.name().toLowerCase() + " " + this.name;
    }
}

