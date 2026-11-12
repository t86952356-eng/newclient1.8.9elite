/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net.minecraft.item;

import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.aj;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.v;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class cp
extends d {
    public final float cXl;
    private final v cXm;

    public cp(v v2) {
        this.cXm = v2;
        this.cVn = 1;
        this.fW(v2.adG());
        this.d(net.minecraft.creativetab.a.cpF);
        this.cXl = 4.0f + v2.adI();
    }

    public float adI() {
        return this.cXm.adI();
    }

    @Override
    public float a(co co2, Block block) {
        if (block == Blocks.cLI) {
            return 15.0f;
        }
        Material material = block.xb();
        return material != Material.bey && material != Material.bez && material != Material.beJ && material != Material.bex && material != Material.beQ ? 1.0f : 1.5f;
    }

    @Override
    public boolean a(co co2, r r2, r r3) {
        co2.b(1, r3);
        return true;
    }

    @Override
    public boolean a(co co2, w w2, Block block, b b2, r r2) {
        if ((double)block.b(w2, b2) != 0.0) {
            co2.b(2, r2);
        }
        return true;
    }

    @Override
    public boolean adw() {
        return true;
    }

    @Override
    public a ap(co co2) {
        return a.cUz;
    }

    @Override
    public int aq(co co2) {
        return 72000;
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        a2.c(co2, this.aq(co2));
        return co2;
    }

    @Override
    public boolean F(Block block) {
        return block == Blocks.cLI;
    }

    @Override
    public int adC() {
        return this.cXm.adK();
    }

    public String aex() {
        return this.cXm.toString();
    }

    @Override
    public boolean b(co co2, co co3) {
        return this.cXm.adL() == co3.bP() || super.b(co2, co3);
    }

    @Override
    public Multimap<String, net.minecraft.entity.ai.attributes.a> adF() {
        Multimap<String, net.minecraft.entity.ai.attributes.a> multimap = super.adF();
        multimap.put((Object)aj.cwq.Xs(), (Object)new net.minecraft.entity.ai.attributes.a(cVk, "Weapon modifier", this.cXl, 0));
        return multimap;
    }
}

