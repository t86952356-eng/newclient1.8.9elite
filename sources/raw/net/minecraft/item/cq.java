/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net.minecraft.item;

import com.google.common.collect.Multimap;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.aj;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.v;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class cq
extends d {
    private final Set<Block> cXn;
    protected float cVA = 4.0f;
    public final float cXo;
    protected v cXp;

    protected cq(float f2, v v2, Set<Block> set) {
        this.cXp = v2;
        this.cXn = set;
        this.cVn = 1;
        this.fW(v2.adG());
        this.cVA = v2.adH();
        this.cXo = f2 + v2.adI();
        this.d(net.minecraft.creativetab.a.cpE);
    }

    @Override
    public float a(co co2, Block block) {
        return this.cXn.contains(block) ? this.cVA : 1.0f;
    }

    @Override
    public boolean a(co co2, r r2, r r3) {
        co2.b(2, r3);
        return true;
    }

    @Override
    public boolean a(co co2, w w2, Block block, b b2, r r2) {
        if ((double)block.b(w2, b2) != 0.0) {
            co2.b(1, r2);
        }
        return true;
    }

    @Override
    public boolean adw() {
        return true;
    }

    public v adY() {
        return this.cXp;
    }

    @Override
    public int adC() {
        return this.cXp.adK();
    }

    public String aex() {
        return this.cXp.toString();
    }

    @Override
    public boolean b(co co2, co co3) {
        return this.cXp.adL() == co3.bP() || super.b(co2, co3);
    }

    @Override
    public Multimap<String, a> adF() {
        Multimap<String, a> multimap = super.adF();
        multimap.put((Object)aj.cwq.Xs(), (Object)new a(cVk, "Tool modifier", this.cXo, 0));
        return multimap;
    }
}

