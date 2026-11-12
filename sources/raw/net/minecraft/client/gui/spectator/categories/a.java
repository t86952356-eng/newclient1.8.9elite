/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
package net.minecraft.client.gui.spectator.categories;

import com.google.common.base.Objects;
import java.util.List;
import net.minecraft.client.gui.spectator.b;
import net.minecraft.client.gui.spectator.d;
import net.minecraft.client.gui.spectator.f;

public class a {
    private final d bxB;
    private final List<b> bxC;
    private final int bxD;

    public a(d d2, List<b> list, int n2) {
        this.bxB = d2;
        this.bxC = list;
        this.bxD = n2;
    }

    public b ck(int n2) {
        return n2 >= 0 && n2 < this.bxC.size() ? (b)Objects.firstNonNull((Object)this.bxC.get(n2), (Object)f.bxt) : f.bxt;
    }

    public int GX() {
        return this.bxD;
    }
}

