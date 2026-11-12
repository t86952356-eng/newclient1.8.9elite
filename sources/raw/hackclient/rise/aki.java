/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abp;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.gi;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class aki
extends akh<Boolean> {
    private final akg<?> aRC;

    public aki(String string, gi gi2, Boolean bl2) {
        super(string, gi2, bl2);
        this.aRC = null;
    }

    public aki(String string, akg<?> akg2, Boolean bl2) {
        super(string, akg2, bl2);
        this.aRC = null;
    }

    public aki(String string, gi gi2, Boolean bl2, BooleanSupplier booleanSupplier) {
        super(string, gi2, bl2, booleanSupplier);
        this.aRC = null;
    }

    public aki(String string, akg<?> akg2, Boolean bl2, BooleanSupplier booleanSupplier) {
        super(string, akg2, bl2, booleanSupplier);
        this.aRC = null;
    }

    public aki(String string, gi gi2, Boolean bl2, akg<?> akg2) {
        super(string, gi2, bl2);
        this.aRC = akg2;
        this.wJ().getValues().forEach(akh2 -> akh2.a(() -> (Boolean)this.wD() == false));
    }

    public aki(String string, akg<?> akg2, Boolean bl2, akg<?> akg3) {
        super(string, akg2, bl2);
        this.aRC = akg3;
    }

    public aki(String string, gi gi2, Boolean bl2, BooleanSupplier booleanSupplier, akg<?> akg2) {
        super(string, gi2, bl2, booleanSupplier);
        this.aRC = akg2;
    }

    public aki(String string, akg<?> akg2, Boolean bl2, BooleanSupplier booleanSupplier, akg<?> akg3) {
        super(string, akg2, bl2, booleanSupplier);
        this.aRC = akg3;
    }

    public void c(Boolean bl2) {
        super.n(bl2);
        if (this.aRC != null && this.wF() != null && ((gi)this.wF()).isEnabled()) {
            if (((Boolean)this.wD()).booleanValue()) {
                this.aRC.a();
            } else {
                this.aRC.unregister();
            }
        }
    }

    @Override
    public List<akh<?>> wz() {
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
        if (this.aRC != null && this.wF() != null && ((gi)this.wF()).isEnabled() && ((Boolean)this.wD()).booleanValue()) {
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
    public akg<?> wJ() {
        return this.aRC;
    }

    @Override
    public /* synthetic */ abo wA() {
        return this.wI();
    }

    @Override
    public /* synthetic */ void n(Object object) {
        this.c((Boolean)object);
    }
}

