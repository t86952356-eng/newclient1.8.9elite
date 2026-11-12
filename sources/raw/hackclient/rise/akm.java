/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abt;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.gi;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class akm
extends akh<Supplier<Double>> {
    public akm(String string, gi gi2) {
        super(string, gi2, null);
    }

    public akm(String string, akg<?> akg2) {
        super(string, akg2, null);
    }

    public akm(String string, gi gi2, BooleanSupplier booleanSupplier) {
        super(string, gi2, null, booleanSupplier);
    }

    public akm(String string, akg<?> akg2, BooleanSupplier booleanSupplier) {
        super(string, akg2, null, booleanSupplier);
    }

    @Override
    public List<akh<?>> wz() {
        return null;
    }

    public abt wS() {
        return new abt(this);
    }

    @Override
    public /* synthetic */ abo wA() {
        return this.wS();
    }
}

