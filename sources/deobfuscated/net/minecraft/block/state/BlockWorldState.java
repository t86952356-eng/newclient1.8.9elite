/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block.state;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockWorldState {
    private final w bfD;
    private final b bfE;
    private final boolean bfF;
    private IBlockState aZh;
    private d bfG;
    private boolean bfH;

    public BlockWorldState(w w2, b b2, boolean bl2) {
        this.bfD = w2;
        this.bfE = b2;
        this.bfF = bl2;
    }

    public IBlockState yU() {
        if (this.aZh == null && (this.bfF || this.bfD.aJ(this.bfE))) {
            this.aZh = this.bfD.L(this.bfE);
        }
        return this.aZh;
    }

    public d Aa() {
        if (this.bfG == null && !this.bfH) {
            this.bfG = this.bfD.K(this.bfE);
            this.bfH = true;
        }
        return this.bfG;
    }

    public b Ab() {
        return this.bfE;
    }

    public static Predicate<BlockWorldState> a(Predicate<IBlockState> predicate) {
        return blockWorldState -> blockWorldState != null && predicate.apply((Object)blockWorldState.yU());
    }
}

