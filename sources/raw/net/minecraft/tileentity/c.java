/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.entity.item.m;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.b;
import net.minecraft.util.df;

public class c
extends df {
    private final n dqZ;
    private final String dra;

    public c(b b2, n n2) {
        this(b2, n2.eN("Properties"), n2.eK("Type"), n2.eG("Weight"));
    }

    public c(b b2, n n2, String string) {
        this(b2, n2, string, 1);
    }

    private c(b b2, n n2, String string, int n3) {
        super(n3);
        if (string.equals("Minecart")) {
            string = n2 != null ? m.fh(n2.eG("Type")).getName() : "MinecartRideable";
        }
        this.dqZ = n2;
        this.dra = string;
    }

    public n apN() {
        n n2 = new n();
        n2.b("Properties", this.dqZ);
        n2.R("Type", this.dra);
        n2.B("Weight", this.dAR);
        return n2;
    }
}

