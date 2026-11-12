/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.block.state;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockPistonStructureHelper {
    private final w bfk;
    private final b bfl;
    private final b bfm;
    private final ao bfn;
    private final List<b> bfo = Lists.newArrayList();
    private final List<b> bfp = Lists.newArrayList();

    public BlockPistonStructureHelper(w w2, b b2, ao ao2, boolean bl2) {
        this.bfk = w2;
        this.bfl = b2;
        if (bl2) {
            this.bfn = ao2;
            this.bfm = b2.x(ao2);
        } else {
            this.bfn = ao2.asC();
            this.bfm = b2.d(ao2, 2);
        }
    }

    public boolean zN() {
        this.bfo.clear();
        this.bfp.clear();
        Block block = this.bfk.L(this.bfm).df();
        if (!BlockPistonBase.a(block, this.bfk, this.bfm, this.bfn, false)) {
            if (block.xE() != 1) {
                return false;
            }
            this.bfp.add(this.bfm);
            return true;
        }
        if (!this.D(this.bfm)) {
            return false;
        }
        for (b b2 : this.bfo) {
            if (this.bfk.L(b2).df() != Blocks.cOG || this.E(b2)) continue;
            return false;
        }
        return true;
    }

    private boolean D(b b2) {
        int n2;
        b b3;
        Block block = this.bfk.L(b2).df();
        if (block.xb() == Material.beo) {
            return true;
        }
        if (!BlockPistonBase.a(block, this.bfk, b2, this.bfn, false)) {
            return true;
        }
        if (b2.equals(this.bfl)) {
            return true;
        }
        if (this.bfo.contains(b2)) {
            return true;
        }
        int n3 = 1;
        if (n3 + this.bfo.size() > 12) {
            return false;
        }
        while (block == Blocks.cOG && (block = this.bfk.L(b3 = b2.d(this.bfn.asC(), n3)).df()).xb() != Material.beo && BlockPistonBase.a(block, this.bfk, b3, this.bfn, false) && !b3.equals(this.bfl)) {
            if (++n3 + this.bfo.size() <= 12) continue;
            return false;
        }
        int n4 = 0;
        for (n2 = n3 - 1; n2 >= 0; --n2) {
            this.bfo.add(b2.d(this.bfn.asC(), n2));
            ++n4;
        }
        n2 = 1;
        while (true) {
            b b4;
            int n5;
            if ((n5 = this.bfo.indexOf(b4 = b2.d(this.bfn, n2))) > -1) {
                this.p(n4, n5);
                for (int i2 = 0; i2 <= n5 + n4; ++i2) {
                    b b5 = this.bfo.get(i2);
                    if (this.bfk.L(b5).df() != Blocks.cOG || this.E(b5)) continue;
                    return false;
                }
                return true;
            }
            block = this.bfk.L(b4).df();
            if (block.xb() == Material.beo) {
                return true;
            }
            if (!BlockPistonBase.a(block, this.bfk, b4, this.bfn, true) || b4.equals(this.bfl)) {
                return false;
            }
            if (block.xE() == 1) {
                this.bfp.add(b4);
                return true;
            }
            if (this.bfo.size() >= 12) {
                return false;
            }
            this.bfo.add(b4);
            ++n4;
            ++n2;
        }
    }

    private void p(int n2, int n3) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        arrayList.addAll(this.bfo.subList(0, n3));
        arrayList2.addAll(this.bfo.subList(this.bfo.size() - n2, this.bfo.size()));
        arrayList3.addAll(this.bfo.subList(n3, this.bfo.size() - n2));
        this.bfo.clear();
        this.bfo.addAll(arrayList);
        this.bfo.addAll(arrayList2);
        this.bfo.addAll(arrayList3);
    }

    private boolean E(b b2) {
        for (ao ao2 : ao.values()) {
            if (ao2.asL() == this.bfn.asL() || this.D(b2.x(ao2))) continue;
            return false;
        }
        return true;
    }

    public List<b> zO() {
        return this.bfo;
    }

    public List<b> zP() {
        return this.bfp;
    }
}

