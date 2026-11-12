/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.scoreboard;

import java.util.List;
import net.minecraft.entity.player.a;
import net.minecraft.scoreboard.b;
import net.minecraft.scoreboard.c;

public class e
implements b {
    private final String name;

    public e(String string) {
        this.name = string;
        b.djp.put(string, this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int H(List<a> list) {
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

