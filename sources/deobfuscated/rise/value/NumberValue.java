/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.value;

import hackclient.rise.abw;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import rise.module.Mode;
import rise.module.Module;
import rise.ui.clickgui.value.ValueComponent;
import rise.value.Value;

public class NumberValue
extends Value<Number> {
    private final Number aRR;
    private final Number aRS;
    private final Number aRT;

    public NumberValue(String string, Module module, Number number, Number number2, Number number3, Number number4) {
        super(string, module, number);
        this.aRT = number4;
        this.aRR = number2;
        this.aRS = number3;
    }

    public NumberValue(String string, Mode<?> mode, Number number, Number number2, Number number3, Number number4) {
        super(string, mode, number);
        this.aRT = number4;
        this.aRR = number2;
        this.aRS = number3;
    }

    public NumberValue(String string, Module module, Number number, Number number2, Number number3, Number number4, BooleanSupplier booleanSupplier) {
        super(string, module, number, booleanSupplier);
        this.aRT = number4;
        this.aRR = number2;
        this.aRS = number3;
    }

    public NumberValue(String string, Mode<?> mode, Number number, Number number2, Number number3, Number number4, BooleanSupplier booleanSupplier) {
        super(string, mode, number, booleanSupplier);
        this.aRT = number4;
        this.aRR = number2;
        this.aRS = number3;
    }

    @Override
    public List<Value<?>> wz() {
        return null;
    }

    public abw wV() {
        return new abw(this);
    }

    @Generated
    public Number wM() {
        return this.aRR;
    }

    @Generated
    public Number wN() {
        return this.aRS;
    }

    @Generated
    public Number wO() {
        return this.aRT;
    }

    @Override
    public /* synthetic */ ValueComponent wA() {
        return this.wV();
    }
}

