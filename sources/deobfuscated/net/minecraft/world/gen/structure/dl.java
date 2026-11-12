/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockTorch;
import net.minecraft.init.Blocks;
import net.minecraft.item.b;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class dl
extends dm {
    public dl() {
    }

    public dl(dk dk2, int n2, Random random, w w2, ao ao2) {
        super(dk2, n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    public static w b(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2) {
        w w2 = w.a(n2, n3, n4, 0, 0, 0, 3, 4, 2, ao2);
        return y.a(list, w2) != null ? null : w2;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.dSR < 0) {
            this.dSR = this.b(w2, w3);
            if (this.dSR < 0) {
                return true;
            }
            this.dQI.ad(0, this.dSR - this.dQI.dQF + 4 - 1, 0);
        }
        this.a(w2, w3, 0, 0, 0, 2, 3, 1, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, Blocks.cMQ.xM(), 1, 0, 0, w3);
        this.a(w2, Blocks.cMQ.xM(), 1, 1, 0, w3);
        this.a(w2, Blocks.cMQ.xM(), 1, 2, 0, w3);
        this.a(w2, Blocks.cLN.aM(b.cUC.ado()), 1, 3, 0, w3);
        boolean bl2 = this.dQJ == ao.dwv || this.dQJ == ao.dws;
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ.asD()), bl2 ? 2 : 0, 3, 0, w3);
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ), 1, 3, 1, w3);
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ.asG()), bl2 ? 0 : 2, 3, 0, w3);
        this.a(w2, Blocks.cMc.xM().a(BlockTorch.bcF, this.dQJ.asC()), 1, 3, -1, w3);
        return true;
    }
}

