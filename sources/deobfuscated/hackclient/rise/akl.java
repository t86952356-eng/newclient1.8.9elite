/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abr;
import java.awt.Color;
import java.util.List;
import java.util.function.BooleanSupplier;
import rise.module.Mode;
import rise.module.Module;
import rise.ui.clickgui.value.ValueComponent;
import rise.value.Value;

public class akl
extends Value<Color> {
    public akl(String string, Module module, Color color) {
        super(string, module, color);
    }

    public akl(String string, Mode<?> mode, Color color) {
        super(string, mode, color);
    }

    public akl(String string, Module module, Color color, BooleanSupplier booleanSupplier) {
        super(string, module, color, booleanSupplier);
    }

    public akl(String string, Mode<?> mode, Color color, BooleanSupplier booleanSupplier) {
        super(string, mode, color, booleanSupplier);
    }

    @Override
    public List<Value<?>> wz() {
        return null;
    }

    public abr wR() {
        return new abr(this);
    }

    @Override
    public /* synthetic */ ValueComponent wA() {
        return this.wR();
    }
}

