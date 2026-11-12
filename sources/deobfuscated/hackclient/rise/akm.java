/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abt;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import rise.module.Mode;
import rise.module.Module;
import rise.ui.clickgui.value.ValueComponent;
import rise.value.Value;

public class akm
extends Value<Supplier<Double>> {
    public akm(String string, Module module) {
        super(string, module, null);
    }

    public akm(String string, Mode<?> mode) {
        super(string, mode, null);
    }

    public akm(String string, Module module, BooleanSupplier booleanSupplier) {
        super(string, module, null, booleanSupplier);
    }

    public akm(String string, Mode<?> mode, BooleanSupplier booleanSupplier) {
        super(string, mode, null, booleanSupplier);
    }

    @Override
    public List<Value<?>> wz() {
        return null;
    }

    public abt wS() {
        return new abt(this);
    }

    @Override
    public /* synthetic */ ValueComponent wA() {
        return this.wS();
    }
}

