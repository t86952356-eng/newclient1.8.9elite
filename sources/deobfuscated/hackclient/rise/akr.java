/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aby;
import java.util.List;
import java.util.function.BooleanSupplier;
import rise.module.Mode;
import rise.module.Module;
import rise.ui.clickgui.value.ValueComponent;
import rise.value.Value;

public class akr
extends Value<String> {
    public akr(String string, Module module, String string2) {
        super(string, module, string2);
    }

    public akr(String string, Mode<?> mode, String string2) {
        super(string, mode, string2);
    }

    public akr(String string, Module module, String string2, BooleanSupplier booleanSupplier) {
        super(string, module, string2, booleanSupplier);
    }

    public akr(String string, Mode<?> mode, String string2, BooleanSupplier booleanSupplier) {
        super(string, mode, string2, booleanSupplier);
    }

    @Override
    public List<Value<?>> wz() {
        return null;
    }

    public aby wW() {
        return new aby(this);
    }

    @Override
    public /* synthetic */ ValueComponent wA() {
        return this.wW();
    }
}

