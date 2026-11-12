/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.value;

import hackclient.rise.ahe;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import lombok.Generated;
import rise.module.Mode;
import rise.module.Module;
import rise.ui.clickgui.value.ValueComponent;

public abstract class Value<T> {
    private final String name;
    public BooleanSupplier aRw;
    public BooleanSupplier aRx;
    private T aRy;
    private boolean visible;
    private ahe aRz;
    private Consumer<T> aRA;
    private T aRB;

    public Value(String string, Module module, T t2) {
        this.name = string;
        this.aRw = null;
        this.aRz = module;
        this.aRB = t2;
        this.n(t2);
        module.getValues().add(this);
    }

    public Value(String string, Mode<?> mode, T t2) {
        this.name = string;
        this.aRw = null;
        this.aRB = t2;
        this.aRz = mode;
        this.n(t2);
        mode.getValues().add(this);
    }

    public Value(String string, Module module, T t2, BooleanSupplier booleanSupplier) {
        this.name = string;
        this.aRw = booleanSupplier;
        this.aRz = module;
        this.aRB = t2;
        this.n(t2);
        module.getValues().add(this);
    }

    public Value(String string, Mode<?> mode, T t2, BooleanSupplier booleanSupplier) {
        this.name = string;
        this.aRw = booleanSupplier;
        this.aRB = t2;
        this.n(t2);
        mode.getValues().add(this);
    }

    public void m(Object object) {
        if (this.aRA != null) {
            this.aRA.accept(object);
        }
        this.aRy = object;
    }

    public void n(T t2) {
        if (this.aRA != null) {
            this.aRA.accept(t2);
        }
        this.aRy = t2;
    }

    public abstract List<Value<?>> wz();

    public void o(T t2) {
        this.aRB = t2;
    }

    public ValueComponent wA() {
        return null;
    }

    public String toString() {
        return this.getName();
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public BooleanSupplier wB() {
        return this.aRw;
    }

    @Generated
    public BooleanSupplier wC() {
        return this.aRx;
    }

    @Generated
    public T wD() {
        return this.aRy;
    }

    @Generated
    public boolean wE() {
        return this.visible;
    }

    @Generated
    public ahe wF() {
        return this.aRz;
    }

    @Generated
    public Consumer<T> wG() {
        return this.aRA;
    }

    @Generated
    public T wH() {
        return this.aRB;
    }

    @Generated
    public void a(BooleanSupplier booleanSupplier) {
        this.aRw = booleanSupplier;
    }

    @Generated
    public void b(BooleanSupplier booleanSupplier) {
        this.aRx = booleanSupplier;
    }

    @Generated
    public void M(boolean bl2) {
        this.visible = bl2;
    }

    @Generated
    public void a(ahe ahe2) {
        this.aRz = ahe2;
    }

    @Generated
    public void c(Consumer<T> consumer) {
        this.aRA = consumer;
    }
}

