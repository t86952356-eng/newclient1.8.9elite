/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.value;

import hackclient.rise.abp;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import rise.module.Mode;
import rise.module.Module;
import rise.ui.clickgui.value.ValueComponent;
import rise.value.Value;

public class BooleanValue
extends Value<Boolean> {
    private final Mode<?> aRC;

    public BooleanValue(String string, Module module, Boolean bl2) {
        super(string, module, bl2);
        this.aRC = null;
    }

    public BooleanValue(String string, Mode<?> mode, Boolean bl2) {
        super(string, mode, bl2);
        this.aRC = null;
    }

    public BooleanValue(String string, Module module, Boolean bl2, BooleanSupplier booleanSupplier) {
        super(string, module, bl2, booleanSupplier);
        this.aRC = null;
    }

    public BooleanValue(String string, Mode<?> mode, Boolean bl2, BooleanSupplier booleanSupplier) {
        super(string, mode, bl2, booleanSupplier);
        this.aRC = null;
    }

    public BooleanValue(String string, Module module, Boolean bl2, Mode<?> mode) {
        super(string, module, bl2);
        this.aRC = mode;
        this.wJ().getValues().forEach(value -> value.a(() -> (Boolean)this.wD() == false));
    }

    public BooleanValue(String string, Mode<?> mode, Boolean bl2, Mode<?> mode2) {
        super(string, mode, bl2);
        this.aRC = mode2;
    }

    public BooleanValue(String string, Module module, Boolean bl2, BooleanSupplier booleanSupplier, Mode<?> mode) {
        super(string, module, bl2, booleanSupplier);
        this.aRC = mode;
    }

    public BooleanValue(String string, Mode<?> mode, Boolean bl2, BooleanSupplier booleanSupplier, Mode<?> mode2) {
        super(string, mode, bl2, booleanSupplier);
        this.aRC = mode2;
    }

    public void c(Boolean bl2) {
        super.n(bl2);
        if (this.aRC != null && this.wF() != null && ((Module)this.wF()).isEnabled()) {
            if (((Boolean)this.wD()).booleanValue()) {
                this.aRC.a();
            } else {
                this.aRC.unregister();
            }
        }
    }

    @Override
    public List<Value<?>> wz() {
        if (this.wJ() == null) {
            return null;
        }
        return this.wJ().getValues();
    }

    @Override
    public void m(Object object) {
        if (this.aRC != null && this.wF() != null) {
            this.aRC.onDisable();
            this.aRC.unregister();
        }
        super.m(object);
        if (this.aRC != null && this.wF() != null && ((Module)this.wF()).isEnabled() && ((Boolean)this.wD()).booleanValue()) {
            if (((Boolean)this.wD()).booleanValue()) {
                this.aRC.a();
                this.aRC.onEnable();
            } else {
                this.aRC.onDisable();
            }
        }
    }

    public abp wI() {
        return new abp(this);
    }

    @Generated
    public Mode<?> wJ() {
        return this.aRC;
    }

    @Override
    public /* synthetic */ ValueComponent wA() {
        return this.wI();
    }

    @Override
    public /* synthetic */ void n(Object object) {
        this.c((Boolean)object);
    }
}

