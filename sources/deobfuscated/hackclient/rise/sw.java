/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import java.util.function.Function;
import lombok.Generated;
import net.minecraft.util.bt;

public final class sw
extends Enum<sw> {
    public static final /* enum */ sw ZZ = new sw(doubleArray -> doubleArray[0] - doubleArray[1]);
    public static final /* enum */ sw aaa = new sw(doubleArray -> Math.sqrt(Math.pow(doubleArray[0], 2.0) + Math.pow(doubleArray[1], 2.0)));
    public static final /* enum */ sw aab = new sw(doubleArray -> bt.aJ(doubleArray[0] - doubleArray[1]));
    private final Function<Double[], Double> aac;
    private static final /* synthetic */ sw[] aad;

    public static sw[] values() {
        return (sw[])aad.clone();
    }

    public static sw valueOf(String string) {
        return Enum.valueOf(sw.class, string);
    }

    public double a(Double ... doubleArray) {
        return this.aac.apply(doubleArray);
    }

    @Generated
    private sw(Function<Double[], Double> function) {
        this.aac = function;
    }

    private static /* synthetic */ sw[] it() {
        return new sw[]{ZZ, aaa, aab};
    }

    static {
        aad = sw.it();
    }
}

