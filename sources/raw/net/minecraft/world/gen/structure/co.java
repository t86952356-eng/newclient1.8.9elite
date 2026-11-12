/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cj;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class co
extends cj {
    @Override
    public void a(y y2, List<y> list, Random random) {
        if (this.dQJ != ao.dws && this.dQJ != ao.dwv) {
            this.b((cr)y2, list, random, 1, 1);
        } else {
            this.c((cr)y2, list, random, 1, 1);
        }
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 4, 4, 4, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 1, 1, 0);
        if (this.dQJ != ao.dws && this.dQJ != ao.dwv) {
            this.a(w2, w3, 0, 1, 1, 0, 3, 3, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        } else {
            this.a(w2, w3, 4, 1, 1, 4, 3, 3, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        return true;
    }
}

