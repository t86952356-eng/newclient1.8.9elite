/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.entity.ai.attributes;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;
import java.util.UUID;
import net.minecraft.util.bt;
import org.apache.commons.lang3.Validate;

public class a {
    private final double cAz;
    private final int cAA;
    private final String cAB;
    private final UUID cAC;
    private boolean cAD = true;

    public a(String string, double d2, int n2) {
        this(bt.h((Random)ThreadLocalRandom.current()), string, d2, n2);
    }

    public a(UUID uUID, String string, double d2, int n2) {
        this.cAC = uUID;
        this.cAB = string;
        this.cAz = d2;
        this.cAA = n2;
        Validate.notEmpty((CharSequence)string, (String)"Modifier name cannot be empty", (Object[])new Object[0]);
        Validate.inclusiveBetween((long)0L, (long)2L, (long)n2, (String)"Invalid operation");
    }

    public UUID Xo() {
        return this.cAC;
    }

    public String getName() {
        return this.cAB;
    }

    public int Xp() {
        return this.cAA;
    }

    public double Xq() {
        return this.cAz;
    }

    public boolean Xr() {
        return this.cAD;
    }

    public a aM(boolean bl2) {
        this.cAD = bl2;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            a a2 = (a)object;
            if (this.cAC != null) {
                return this.cAC.equals(a2.cAC);
            }
            return a2.cAC == null;
        }
        return false;
    }

    public int hashCode() {
        return this.cAC != null ? this.cAC.hashCode() : 0;
    }

    public String toString() {
        return "AttributeModifier{amount=" + this.cAz + ", operation=" + this.cAA + ", name='" + this.cAB + "', id=" + String.valueOf(this.cAC) + ", serialize=" + this.cAD + "}";
    }
}

