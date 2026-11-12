/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abw;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.gi;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class akq
extends akh<Number> {
    private final Number aRR;
    private final Number aRS;
    private final Number aRT;

    public akq(String string, gi gi2, Number number, Number number2, Number number3, Number number4) {
        super(string, gi2, number);
        this.aRT = number4;
        this.aRR = number2;
        this.aRS = number3;
    }

    public akq(String string, akg<?> akg2, Number number, Number number2, Number number3, Number number4) {
        super(string, akg2, number);
        this.aRT = number4;
        this.aRR = number2;
        this.aRS = number3;
    }

    public akq(String string, gi gi2, Number number, Number number2, Number number3, Number number4, BooleanSupplier booleanSupplier) {
        super(string, gi2, number, booleanSupplier);
        this.aRT = number4;
        this.aRR = number2;
        this.aRS = number3;
    }

    public akq(String string, akg<?> akg2, Number number, Number number2, Number number3, Number number4, BooleanSupplier booleanSupplier) {
        super(string, akg2, number, booleanSupplier);
        this.aRT = number4;
        this.aRR = number2;
        this.aRS = number3;
    }

    @Override
    public List<akh<?>> wz() {
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
    public /* synthetic */ abo wA() {
        return this.wV();
    }
}

