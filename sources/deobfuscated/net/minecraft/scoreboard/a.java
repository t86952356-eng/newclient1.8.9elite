/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.scoreboard;

import java.util.List;
import net.minecraft.scoreboard.b;
import net.minecraft.scoreboard.c;
import net.minecraft.util.an;

public class a
implements b {
    private final String name;

    public a(String string, an an2) {
        this.name = string + an2.asy();
        b.djp.put(this.name, this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int H(List<net.minecraft.entity.player.a> list) {
        return 0;
    }

    @Override
    public boolean akh() {
        return false;
    }

    @Override
    public c aki() {
        return c.djy;
    }
}

