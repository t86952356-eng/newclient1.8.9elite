/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model.anim;

import net.optifine.entity.model.anim.a;
import net.optifine.entity.model.anim.e;
import net.optifine.expr.d;
import net.optifine.expr.o;
import net.optifine.expr.u;

public class g {
    private final String egP;
    private final String egQ;
    private e egR;
    private o egS;

    public boolean a(a a2) {
        this.egR = a2.hZ(this.egP);
        if (this.egR == null) {
            net.minecraft.src.a.warn("Model variable not found: " + this.egP);
            return false;
        }
        try {
            d d2 = new d(a2);
            this.egS = d2.j_if(this.egQ);
            return true;
        }
        catch (u u2) {
            net.minecraft.src.a.warn("Error parsing expression: " + this.egQ);
            net.minecraft.src.a.warn(u2.getClass().getName() + ": " + u2.getMessage());
            return false;
        }
    }

    public g(String string, String string2) {
        this.egP = string;
        this.egQ = string2;
    }

    public void jA() {
        float f2 = this.egS.aCr();
        this.egR.cf(f2);
    }
}

