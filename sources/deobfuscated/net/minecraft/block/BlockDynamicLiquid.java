/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.EnumSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockDynamicLiquid
extends BlockLiquid {
    int aUt;

    protected BlockDynamicLiquid(Material material) {
        super(material);
    }

    private void n(w w2, b b2, IBlockState iBlockState) {
        w2.a(b2, BlockDynamicLiquid.b(this.aSD).xM().a(aWV, iBlockState.b(aWV)), 2);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        int n2 = iBlockState.b(aWV);
        int n3 = 1;
        if (this.aSD == Material.bew && !w2.dDl.awe()) {
            n3 = 2;
        }
        int n4 = this.c(w2);
        if (n2 > 0) {
            int n5 = -100;
            this.aUt = 0;
            for (ao ao2 : ar.dwT) {
                n5 = this.c(w2, b2.x(ao2), n5);
            }
            int n6 = n5 + n3;
            if (n6 >= 8 || n5 < 0) {
                n6 = -1;
            }
            if (this.k(w2, b2.aqX()) >= 0) {
                int n7 = this.k(w2, b2.aqX());
                n6 = n7 >= 8 ? n7 : n7 + 8;
            }
            if (this.aUt >= 2 && this.aSD == Material.bev) {
                IBlockState iBlockState2 = w2.L(b2.aqY());
                if (iBlockState2.df().xb().zw()) {
                    n6 = 0;
                } else if (iBlockState2.df().xb() == this.aSD && iBlockState2.b(aWV) == 0) {
                    n6 = 0;
                }
            }
            if (this.aSD == Material.bew && n2 < 8 && n6 < 8 && n6 > n2 && random.nextInt(4) != 0) {
                n4 *= 4;
            }
            if (n6 == n2) {
                this.n(w2, b2, iBlockState);
            } else {
                n2 = n6;
                if (n6 < 0) {
                    w2.aL(b2);
                } else {
                    iBlockState = iBlockState.a(aWV, n6);
                    w2.a(b2, iBlockState, 2);
                    w2.a(b2, (Block)this, n4);
                    w2.c(b2, this);
                }
            }
        } else {
            this.n(w2, b2, iBlockState);
        }
        IBlockState iBlockState3 = w2.L(b2.aqY());
        if (this.p(w2, b2.aqY(), iBlockState3)) {
            if (this.aSD == Material.bew && w2.L(b2.aqY()).df().xb() == Material.bev) {
                w2.d(b2.aqY(), Blocks.cLd.xM());
                this.K(w2, b2.aqY());
                return;
            }
            if (n2 >= 8) {
                this.d(w2, b2.aqY(), iBlockState3, n2);
            } else {
                this.d(w2, b2.aqY(), iBlockState3, n2 + 8);
            }
        } else if (n2 >= 0 && (n2 == 0 || this.o(w2, b2.aqY(), iBlockState3))) {
            Set<ao> set = this.A(w2, b2);
            int n8 = n2 + n3;
            if (n2 >= 8) {
                n8 = 1;
            }
            if (n8 >= 8) {
                return;
            }
            for (ao ao3 : set) {
                this.d(w2, b2.x(ao3), w2.L(b2.x(ao3)), n8);
            }
        }
    }

    private void d(w w2, b b2, IBlockState iBlockState, int n2) {
        if (this.p(w2, b2, iBlockState)) {
            if (iBlockState.df() != Blocks.cLc) {
                if (this.aSD == Material.bew) {
                    this.K(w2, b2);
                } else {
                    iBlockState.df().a(w2, b2, iBlockState, 0);
                }
            }
            w2.a(b2, this.xM().a(aWV, n2), 3);
        }
    }

    private int a(w w2, b b2, int n2, ao ao2) {
        int n3 = 1000;
        for (ao ao3 : ar.dwT) {
            int n4;
            IBlockState iBlockState;
            b b3;
            if (ao3 == ao2 || this.o(w2, b3 = b2.x(ao3), iBlockState = w2.L(b3)) || iBlockState.df().xb() == this.aSD && iBlockState.b(aWV) <= 0) continue;
            if (!this.o(w2, b3.aqY(), iBlockState)) {
                return n2;
            }
            if (n2 >= 4 || (n4 = this.a(w2, b3, n2 + 1, ao3.asC())) >= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    private Set<ao> A(w w2, b b2) {
        int n2 = 1000;
        EnumSet<ao> enumSet = EnumSet.noneOf(ao.class);
        for (ao ao2 : ar.dwT) {
            IBlockState iBlockState;
            b b3 = b2.x(ao2);
            if (this.o(w2, b3, iBlockState = w2.L(b3)) || iBlockState.df().xb() == this.aSD && iBlockState.b(aWV) <= 0) continue;
            int n3 = this.o(w2, b3.aqY(), w2.L(b3.aqY())) ? this.a(w2, b3, 1, ao2.asC()) : 0;
            if (n3 < n2) {
                enumSet.clear();
            }
            if (n3 > n2) continue;
            enumSet.add(ao2);
            n2 = n3;
        }
        return enumSet;
    }

    private boolean o(w w2, b b2, IBlockState iBlockState) {
        Block block = w2.L(b2).df();
        return block instanceof BlockDoor || block == Blocks.cMp || block == Blocks.cMw || block == Blocks.cMO || block.aSD == Material.beS || block.aSD.zy();
    }

    protected int c(w w2, b b2, int n2) {
        int n3 = this.k(w2, b2);
        if (n3 < 0) {
            return n2;
        }
        if (n3 == 0) {
            ++this.aUt;
        }
        if (n3 >= 8) {
            n3 = 0;
        }
        return n2 >= 0 && n3 >= n2 ? n2 : n3;
    }

    private boolean p(w w2, b b2, IBlockState iBlockState) {
        Material material = iBlockState.df().xb();
        return material != this.aSD && material != Material.bew && !this.o(w2, b2, iBlockState);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        if (!this.u(w2, b2, iBlockState)) {
            w2.a(b2, (Block)this, this.c(w2));
        }
    }
}

