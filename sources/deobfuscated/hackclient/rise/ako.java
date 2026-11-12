/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import rise.module.Mode;
import rise.module.Module;
import rise.ui.clickgui.value.ValueComponent;
import rise.value.Value;

public class ako<T>
extends Value<T> {
    private final List<T> aRP = new ArrayList<T>();

    public ako(String string, Module module) {
        super(string, module, null);
    }

    public ako(String string, Mode<?> mode) {
        super(string, mode, null);
    }

    public ako(String string, Module module, BooleanSupplier booleanSupplier) {
        super(string, module, null, booleanSupplier);
    }

    public ako(String string, Mode<?> mode, BooleanSupplier booleanSupplier) {
        super(string, mode, null, booleanSupplier);
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
    public List<Value<?>> wz() {
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
    public /* synthetic */ ValueComponent wA() {
        return this.wT();
    }
}

