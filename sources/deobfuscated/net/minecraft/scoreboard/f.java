/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.scoreboard;

import java.util.List;
import net.minecraft.entity.player.a;
import net.minecraft.scoreboard.c;
import net.minecraft.scoreboard.e;
import net.minecraft.util.bt;

public class f
extends e {
    public f(String string) {
        super(string);
    }

    @Override
    public int H(List<a> list) {
        float f2 = 0.0f;
        for (a a2 : list) {
            f2 += a2.getHealth() + a2.Wi();
        }
        if (list.size() > 0) {
            f2 /= (float)list.size();
        }
        return bt.bM(f2);
    }

    @Override
    public boolean akh() {
        return true;
    }

    @Override
    public c aki() {
        return c.djz;
    }
}

