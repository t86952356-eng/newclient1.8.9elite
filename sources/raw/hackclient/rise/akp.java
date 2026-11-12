/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.ako;
import hackclient.rise.gi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class akp
extends ako<akg<?>> {
    private final List<akg<?>> aRQ = new ArrayList();

    public akp(String string, gi gi2) {
        super(string, gi2);
    }

    public akp(String string, akg<?> akg2) {
        super(string, akg2);
    }

    public akp(String string, gi gi2, BooleanSupplier booleanSupplier) {
        super(string, gi2, booleanSupplier);
    }

    public akp(String string, akg<?> akg2, BooleanSupplier booleanSupplier) {
        super(string, akg2, booleanSupplier);
    }

    @Override
    public void c(akg<?> akg2) {
        if (this.wF() != null && (!(this.wF() instanceof gi) || ((gi)this.wF()).isEnabled())) {
            ((akg)this.wD()).unregister();
            this.n(akg2);
            ((akg)this.wD()).a();
        } else {
            this.n(akg2);
        }
    }

    public akp a(akg<?> ... akgArray) {
        if (akgArray == null) {
            return this;
        }
        this.aRQ.addAll(Arrays.asList(akgArray));
        return this;
    }

    public akp co(String string) {
        this.n(this.aRQ.stream().filter(akg2 -> akg2.getName().equalsIgnoreCase(string)).findFirst().orElse(this.aRQ.get(0)));
        this.o((akg)this.wD());
        this.aRQ.forEach(akg2 -> akg2.getValues().forEach(akh2 -> akh2.b(() -> akg2 != this.wD())));
        return this;
    }

    public void cp(String string) {
        this.n(this.aRQ.stream().filter(akg2 -> akg2.getName().equalsIgnoreCase(string)).findFirst().orElse(this.aRQ.get(0)));
    }

    @Override
    public List<akh<?>> wz() {
        ArrayList arrayList = new ArrayList();
        for (akg<?> akg2 : this.wU()) {
            arrayList.addAll(akg2.getValues());
        }
        return arrayList;
    }

    @Override
    @Generated
    public List<akg<?>> wU() {
        return this.aRQ;
    }
}

