/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.util.concurrent.Callable;

class k
implements Callable<String> {
    final /* synthetic */ int cpq;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    k(int n2) {
        this.cpq = n2;
    }

    public String HV() {
        if (this.cpq < 0) {
            return "Unknown? (Got " + this.cpq + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(this.cpq)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", this.cpq, string);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

