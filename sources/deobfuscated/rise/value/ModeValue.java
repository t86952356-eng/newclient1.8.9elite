/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.value;

import hackclient.rise.ako;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import rise.module.Mode;
import rise.module.Module;
import rise.value.Value;

public class ModeValue
extends ako<Mode<?>> {
    private final List<Mode<?>> aRQ = new ArrayList();

    public ModeValue(String string, Module module) {
        super(string, module);
    }

    public ModeValue(String string, Mode<?> mode) {
        super(string, mode);
    }

    public ModeValue(String string, Module module, BooleanSupplier booleanSupplier) {
        super(string, module, booleanSupplier);
    }

    public ModeValue(String string, Mode<?> mode, BooleanSupplier booleanSupplier) {
        super(string, mode, booleanSupplier);
    }

    @Override
    public void c(Mode<?> mode) {
        if (this.wF() != null && (!(this.wF() instanceof Module) || ((Module)this.wF()).isEnabled())) {
            ((Mode)this.wD()).unregister();
            this.n(mode);
            ((Mode)this.wD()).a();
        } else {
            this.n(mode);
        }
    }

    public ModeValue a(Mode<?> ... modeArray) {
        if (modeArray == null) {
            return this;
        }
        this.aRQ.addAll(Arrays.asList(modeArray));
        return this;
    }

    public ModeValue co(String string) {
        this.n(this.aRQ.stream().filter(mode -> mode.getName().equalsIgnoreCase(string)).findFirst().orElse(this.aRQ.get(0)));
        this.o((Mode)this.wD());
        this.aRQ.forEach(mode -> mode.getValues().forEach(value -> value.b(() -> mode != this.wD())));
        return this;
    }

    public void cp(String string) {
        this.n(this.aRQ.stream().filter(mode -> mode.getName().equalsIgnoreCase(string)).findFirst().orElse(this.aRQ.get(0)));
    }

    @Override
    public List<Value<?>> wz() {
        ArrayList arrayList = new ArrayList();
        for (Mode<?> mode : this.wU()) {
            arrayList.addAll(mode.getValues());
        }
        return arrayList;
    }

    @Override
    @Generated
    public List<Mode<?>> wU() {
        return this.aRQ;
    }
}

