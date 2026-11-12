/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import java.util.Comparator;
import net.minecraft.entity.c;

public class ai
implements Comparator<c> {
    private final c cyZ;

    public ai(c c2) {
        this.cyZ = c2;
    }

    public int b(c c2, c c3) {
        double d2;
        double d3 = this.cyZ.T(c2);
        return d3 < (d2 = this.cyZ.T(c3)) ? -1 : (d3 > d2 ? 1 : 0);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((c)object, (c)object2);
    }
}

