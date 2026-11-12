/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public abstract class BlockContainer
extends Block
implements ITileEntityProvider {
    protected BlockContainer(Material material) {
        this(material, material.zK());
    }

    protected BlockContainer(Material material, MapColor mapColor) {
        super(material, mapColor);
        this.aSu = true;
    }

    protected boolean d(w w2, b b2, ao ao2) {
        return w2.L(b2.x(ao2)).df().xb() == Material.beO;
    }

    protected boolean v(w w2, b b2) {
        return this.d(w2, b2, ao.dws) || this.d(w2, b2, ao.dwt) || this.d(w2, b2, ao.dwu) || this.d(w2, b2, ao.dwv);
    }

    @Override
    public int xg() {
        return -1;
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        super.d(w2, b2, iBlockState);
        w2.aU(b2);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, int n2, int n3) {
        super.a(w2, b2, iBlockState, n2, n3);
        d d2 = w2.K(b2);
        return d2 != null && d2.aC(n2, n3);
    }
}

