/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.abq;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.akk;
import hackclient.rise.gi;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class akj
extends akh<Number> {
    private final Number aRD;
    private final Number aRE;
    private final Number aRF;
    private Number aRG;
    private Number aRH;

    public akj(String string, gi gi2, Number number, Number number2, Number number3, Number number4, Number number5) {
        super(string, gi2, number);
        this.aRF = number5;
        this.aRD = number3;
        this.aRE = number4;
        this.aRG = number2;
        this.aRH = number2;
    }

    public akj(String string, akg<?> akg2, Number number, Number number2, Number number3, Number number4, Number number5) {
        super(string, akg2, number);
        this.aRF = number5;
        this.aRD = number3;
        this.aRE = number4;
        this.aRG = number2;
        this.aRH = number2;
    }

    public akj(String string, gi gi2, Number number, Number number2, Number number3, Number number4, Number number5, BooleanSupplier booleanSupplier) {
        super(string, gi2, number, booleanSupplier);
        this.aRF = number5;
        this.aRD = number3;
        this.aRE = number4;
        this.aRG = number2;
        this.aRH = number2;
    }

    public akj(String string, akg<?> akg2, Number number, Number number2, Number number3, Number number4, Number number5, BooleanSupplier booleanSupplier) {
        super(string, akg2, number, booleanSupplier);
        this.aRF = number5;
        this.aRD = number3;
        this.aRE = number4;
        this.aRG = number2;
        this.aRH = number2;
    }

    @Override
    public List<akh<?>> wz() {
        return null;
    }

    public Number wK() {
        long l2;
        long l3;
        long l4 = ((Number)this.wD()).longValue();
        if (l4 == (l3 = this.wP().longValue())) {
            return l4;
        }
        if (l4 > l3) {
            l2 = l4;
            l4 = l3;
            l3 = l2;
        }
        l2 = (long)((double)l4 + (double)(l3 - l4) * Math.random() * Math.random());
        return new akk(this, l2);
    }

    public abq wL() {
        return new abq(this);
    }

    @Generated
    public Number wM() {
        return this.aRD;
    }

    @Generated
    public Number wN() {
        return this.aRE;
    }

    @Generated
    public Number wO() {
        return this.aRF;
    }

    @Generated
    public Number wP() {
        return this.aRG;
    }

    @Generated
    public Number wQ() {
        return this.aRH;
    }

    @Generated
    public void a(Number number) {
        this.aRG = number;
    }

    @Generated
    public void b(Number number) {
        this.aRH = number;
    }

    @Override
    public /* synthetic */ abo wA() {
        return this.wL();
    }
}

