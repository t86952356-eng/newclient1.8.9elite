/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.aby;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.gi;
import java.util.List;
import java.util.function.BooleanSupplier;

public class akr
extends akh<String> {
    public akr(String string, gi gi2, String string2) {
        super(string, gi2, string2);
    }

    public akr(String string, akg<?> akg2, String string2) {
        super(string, akg2, string2);
    }

    public akr(String string, gi gi2, String string2, BooleanSupplier booleanSupplier) {
        super(string, gi2, string2, booleanSupplier);
    }

    public akr(String string, akg<?> akg2, String string2, BooleanSupplier booleanSupplier) {
        super(string, akg2, string2, booleanSupplier);
    }

    @Override
    public List<akh<?>> wz() {
        return null;
    }

    public aby wW() {
        return new aby(this);
    }

    @Override
    public /* synthetic */ abo wA() {
        return this.wW();
    }
}

