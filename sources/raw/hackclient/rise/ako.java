/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abu;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.gi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class ako<T>
extends akh<T> {
    private final List<T> aRP = new ArrayList<T>();

    public ako(String string, gi gi2) {
        super(string, gi2, null);
    }

    public ako(String string, akg<?> akg2) {
        super(string, akg2, null);
    }

    public ako(String string, gi gi2, BooleanSupplier booleanSupplier) {
        super(string, gi2, null, booleanSupplier);
    }

    public ako(String string, akg<?> akg2, BooleanSupplier booleanSupplier) {
        super(string, akg2, null, booleanSupplier);
    }

    public ako<T> a(T ... TArray) {
        if (TArray == null) {
            return this;
        }
        this.aRP.addAll(Arrays.asList(TArray));
        return this;
    }

    public ako<T> aJ(int n2) {
        this.n(this.aRP.get(n2));
        return this;
    }

    public ako<T> p(T t2) {
        this.n(t2);
        return this;
    }

    @Override
    public List<akh<?>> wz() {
        return null;
    }

    public abu wT() {
        return new abu(this);
    }

    @Generated
    public List<T> wU() {
        return this.aRP;
    }

    @Override
    public /* synthetic */ abo wA() {
        return this.wT();
    }
}

