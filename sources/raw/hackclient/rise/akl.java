/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abr;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.gi;
import java.awt.Color;
import java.util.List;
import java.util.function.BooleanSupplier;

public class akl
extends akh<Color> {
    public akl(String string, gi gi2, Color color) {
        super(string, gi2, color);
    }

    public akl(String string, akg<?> akg2, Color color) {
        super(string, akg2, color);
    }

    public akl(String string, gi gi2, Color color, BooleanSupplier booleanSupplier) {
        super(string, gi2, color, booleanSupplier);
    }

    public akl(String string, akg<?> akg2, Color color, BooleanSupplier booleanSupplier) {
        super(string, akg2, color, booleanSupplier);
    }

    @Override
    public List<akh<?>> wz() {
        return null;
    }

    public abr wR() {
        return new abr(this);
    }

    @Override
    public /* synthetic */ abo wA() {
        return this.wR();
    }
}

