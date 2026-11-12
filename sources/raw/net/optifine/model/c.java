/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.init.Blocks;

public class c {
    private final List<BakedQuad> elr = new ArrayList<BakedQuad>();
    private final List<IBlockState> els = new ArrayList<IBlockState>();
    private final List<BakedQuad> elt = Arrays.asList(new BakedQuad[1]);

    public void a(BakedQuad bakedQuad, IBlockState iBlockState) {
        if (bakedQuad != null) {
            this.elr.add(bakedQuad);
            this.els.add(iBlockState);
        }
    }

    public int size() {
        return this.elr.size();
    }

    public BakedQuad jz(int n2) {
        return this.elr.get(n2);
    }

    public IBlockState is(int n2) {
        return n2 >= 0 && n2 < this.els.size() ? this.els.get(n2) : Blocks.cLc.xM();
    }

    public List<BakedQuad> c(BakedQuad bakedQuad) {
        this.elt.set(0, bakedQuad);
        return this.elt;
    }

    public void clear() {
        this.elr.clear();
        this.els.clear();
    }
}

