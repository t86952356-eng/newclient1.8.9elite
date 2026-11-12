/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockRailBase$Rail {
    private final w aZe;
    private final b aZf;
    private final BlockRailBase aZg;
    private IBlockState aZh;
    private final boolean aZi;
    private final List<b> aZj = Lists.newArrayList();
    final /* synthetic */ BlockRailBase aZk;

    public BlockRailBase$Rail(BlockRailBase blockRailBase, w w2, b b2, IBlockState iBlockState) {
        this.aZk = blockRailBase;
        this.aZe = w2;
        this.aZf = b2;
        this.aZh = iBlockState;
        this.aZg = (BlockRailBase)iBlockState.df();
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = iBlockState.b(blockRailBase.yP());
        this.aZi = this.aZg.aYP;
        this.a(blockRailBase$EnumRailDirection);
    }

    private void a(BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection) {
        this.aZj.clear();
        switch (blockRailBase$EnumRailDirection.ordinal()) {
            case 0: {
                this.aZj.add(this.aZf.aqZ());
                this.aZj.add(this.aZf.ara());
                break;
            }
            case 1: {
                this.aZj.add(this.aZf.arb());
                this.aZj.add(this.aZf.arc());
                break;
            }
            case 2: {
                this.aZj.add(this.aZf.arb());
                this.aZj.add(this.aZf.arc().aqX());
                break;
            }
            case 3: {
                this.aZj.add(this.aZf.arb().aqX());
                this.aZj.add(this.aZf.arc());
                break;
            }
            case 4: {
                this.aZj.add(this.aZf.aqZ().aqX());
                this.aZj.add(this.aZf.ara());
                break;
            }
            case 5: {
                this.aZj.add(this.aZf.aqZ());
                this.aZj.add(this.aZf.ara().aqX());
                break;
            }
            case 6: {
                this.aZj.add(this.aZf.arc());
                this.aZj.add(this.aZf.ara());
                break;
            }
            case 7: {
                this.aZj.add(this.aZf.arb());
                this.aZj.add(this.aZf.ara());
                break;
            }
            case 8: {
                this.aZj.add(this.aZf.arb());
                this.aZj.add(this.aZf.aqZ());
                break;
            }
            case 9: {
                this.aZj.add(this.aZf.arc());
                this.aZj.add(this.aZf.aqZ());
            }
        }
    }

    private void yS() {
        for (int i2 = 0; i2 < this.aZj.size(); ++i2) {
            BlockRailBase$Rail blockRailBase$Rail = this.z(this.aZj.get(i2));
            if (blockRailBase$Rail != null && blockRailBase$Rail.a(this)) {
                this.aZj.set(i2, blockRailBase$Rail.aZf);
                continue;
            }
            this.aZj.remove(i2--);
        }
    }

    private boolean y(b b2) {
        return BlockRailBase.P(this.aZe, b2) || BlockRailBase.P(this.aZe, b2.aqX()) || BlockRailBase.P(this.aZe, b2.aqY());
    }

    private BlockRailBase$Rail z(b b2) {
        BlockRailBase$Rail blockRailBase$Rail;
        IBlockState iBlockState = this.aZe.L(b2);
        if (BlockRailBase.p(iBlockState)) {
            BlockRailBase blockRailBase = this.aZk;
            Objects.requireNonNull(blockRailBase);
            return new BlockRailBase$Rail(blockRailBase, this.aZe, b2, iBlockState);
        }
        b b3 = b2.aqX();
        iBlockState = this.aZe.L(b3);
        if (BlockRailBase.p(iBlockState)) {
            BlockRailBase blockRailBase = this.aZk;
            Objects.requireNonNull(blockRailBase);
            return new BlockRailBase$Rail(blockRailBase, this.aZe, b3, iBlockState);
        }
        b3 = b2.aqY();
        iBlockState = this.aZe.L(b3);
        if (BlockRailBase.p(iBlockState)) {
            BlockRailBase blockRailBase = this.aZk;
            Objects.requireNonNull(blockRailBase);
            blockRailBase$Rail = new BlockRailBase$Rail(blockRailBase, this.aZe, b3, iBlockState);
        } else {
            blockRailBase$Rail = null;
        }
        return blockRailBase$Rail;
    }

    private boolean a(BlockRailBase$Rail blockRailBase$Rail) {
        return this.A(blockRailBase$Rail.aZf);
    }

    private boolean A(b b2) {
        for (int i2 = 0; i2 < this.aZj.size(); ++i2) {
            b b3 = this.aZj.get(i2);
            if (b3.wt() != b2.wt() || b3.wx() != b2.wx()) continue;
            return true;
        }
        return false;
    }

    protected int yT() {
        int n2 = 0;
        for (ao ao2 : ar.dwT) {
            if (!this.y(this.aZf.x(ao2))) continue;
            ++n2;
        }
        return n2;
    }

    private boolean b(BlockRailBase$Rail blockRailBase$Rail) {
        return this.a(blockRailBase$Rail) || this.aZj.size() != 2;
    }

    private void c(BlockRailBase$Rail blockRailBase$Rail) {
        this.aZj.add(blockRailBase$Rail.aZf);
        b b2 = this.aZf.aqZ();
        b b3 = this.aZf.ara();
        b b4 = this.aZf.arb();
        b b5 = this.aZf.arc();
        boolean bl2 = this.A(b2);
        boolean bl3 = this.A(b3);
        boolean bl4 = this.A(b4);
        boolean bl5 = this.A(b5);
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = null;
        if (bl2 || bl3) {
            blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYQ;
        }
        if (bl4 || bl5) {
            blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYR;
        }
        if (!this.aZi) {
            if (bl3 && bl5 && !bl2 && !bl4) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYW;
            }
            if (bl3 && bl4 && !bl2 && !bl5) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYX;
            }
            if (bl2 && bl4 && !bl3 && !bl5) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYY;
            }
            if (bl2 && bl5 && !bl3 && !bl4) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYZ;
            }
        }
        if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYQ) {
            if (BlockRailBase.P(this.aZe, b2.aqX())) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYU;
            }
            if (BlockRailBase.P(this.aZe, b3.aqX())) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYV;
            }
        }
        if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYR) {
            if (BlockRailBase.P(this.aZe, b5.aqX())) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYS;
            }
            if (BlockRailBase.P(this.aZe, b4.aqX())) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYT;
            }
        }
        if (blockRailBase$EnumRailDirection == null) {
            blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYQ;
        }
        this.aZh = this.aZh.a(this.aZg.yP(), blockRailBase$EnumRailDirection);
        this.aZe.a(this.aZf, this.aZh, 3);
    }

    private boolean B(b b2) {
        BlockRailBase$Rail blockRailBase$Rail = this.z(b2);
        if (blockRailBase$Rail == null) {
            return false;
        }
        blockRailBase$Rail.yS();
        return blockRailBase$Rail.b(this);
    }

    public BlockRailBase$Rail c(boolean bl2, boolean bl3) {
        b b2 = this.aZf.aqZ();
        b b3 = this.aZf.ara();
        b b4 = this.aZf.arb();
        b b5 = this.aZf.arc();
        boolean bl4 = this.B(b2);
        boolean bl5 = this.B(b3);
        boolean bl6 = this.B(b4);
        boolean bl7 = this.B(b5);
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = null;
        if ((bl4 || bl5) && !bl6 && !bl7) {
            blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYQ;
        }
        if ((bl6 || bl7) && !bl4 && !bl5) {
            blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYR;
        }
        if (!this.aZi) {
            if (bl5 && bl7 && !bl4 && !bl6) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYW;
            }
            if (bl5 && bl6 && !bl4 && !bl7) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYX;
            }
            if (bl4 && bl6 && !bl5 && !bl7) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYY;
            }
            if (bl4 && bl7 && !bl5 && !bl6) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYZ;
            }
        }
        if (blockRailBase$EnumRailDirection == null) {
            if (bl4 || bl5) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYQ;
            }
            if (bl6 || bl7) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYR;
            }
            if (!this.aZi) {
                if (bl2) {
                    if (bl5 && bl7) {
                        blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYW;
                    }
                    if (bl6 && bl5) {
                        blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYX;
                    }
                    if (bl7 && bl4) {
                        blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYZ;
                    }
                    if (bl4 && bl6) {
                        blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYY;
                    }
                } else {
                    if (bl4 && bl6) {
                        blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYY;
                    }
                    if (bl7 && bl4) {
                        blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYZ;
                    }
                    if (bl6 && bl5) {
                        blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYX;
                    }
                    if (bl5 && bl7) {
                        blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYW;
                    }
                }
            }
        }
        if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYQ) {
            if (BlockRailBase.P(this.aZe, b2.aqX())) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYU;
            }
            if (BlockRailBase.P(this.aZe, b3.aqX())) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYV;
            }
        }
        if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.aYR) {
            if (BlockRailBase.P(this.aZe, b5.aqX())) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYS;
            }
            if (BlockRailBase.P(this.aZe, b4.aqX())) {
                blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYT;
            }
        }
        if (blockRailBase$EnumRailDirection == null) {
            blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.aYQ;
        }
        this.a(blockRailBase$EnumRailDirection);
        this.aZh = this.aZh.a(this.aZg.yP(), blockRailBase$EnumRailDirection);
        if (bl3 || this.aZe.L(this.aZf) != this.aZh) {
            this.aZe.a(this.aZf, this.aZh, 3);
            for (int i2 = 0; i2 < this.aZj.size(); ++i2) {
                BlockRailBase$Rail blockRailBase$Rail = this.z(this.aZj.get(i2));
                if (blockRailBase$Rail == null) continue;
                blockRailBase$Rail.yS();
                if (!blockRailBase$Rail.b(this)) continue;
                blockRailBase$Rail.c(this);
            }
        }
        return this;
    }

    public IBlockState yU() {
        return this.aZh;
    }
}

