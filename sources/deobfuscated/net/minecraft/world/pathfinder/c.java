/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.pathfinder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.pathfinding.h;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.g;
import net.minecraft.world.l;
import net.minecraft.world.pathfinder.a;

public class c
extends a {
    private boolean dTb;
    private boolean dTc;
    private boolean dTd;
    private boolean dTe;
    private boolean dTf;

    @Override
    public void a(l l2, net.minecraft.entity.c c2) {
        super.a(l2, c2);
        this.dTf = this.dTd;
    }

    @Override
    public void azm() {
        super.azm();
        this.dTd = this.dTf;
    }

    @Override
    public h aF(net.minecraft.entity.c c2) {
        int n2;
        if (this.dTe && c2.isInWater()) {
            n2 = (int)c2.Us().dtI;
            g g2 = new g(bt.aF(c2.gW), n2, bt.aF(c2.gY));
            Block block = this.dSW.L(g2).df();
            while (block == Blocks.cLk || block == Blocks.cLl) {
                g2.E(bt.aF(c2.gW), ++n2, bt.aF(c2.gY));
                block = this.dSW.L(g2).df();
            }
            this.dTd = false;
        } else {
            n2 = bt.aF(c2.Us().dtI + 0.5);
        }
        return this.ag(bt.aF(c2.Us().dtH), n2, bt.aF(c2.Us().dtJ));
    }

    @Override
    public h b(net.minecraft.entity.c c2, double d2, double d3, double d4) {
        return this.ag(bt.aF(d2 - (double)(c2.width / 2.0f)), bt.aF(d3), bt.aF(d4 - (double)(c2.width / 2.0f)));
    }

    @Override
    public int a(h[] hArray, net.minecraft.entity.c c2, h h2, h h3, float f2) {
        int n2 = 0;
        int n3 = 0;
        if (this.c(c2, h2.dgk, h2.dgl + 1, h2.dgm) == 1) {
            n3 = 1;
        }
        h h4 = this.a(c2, h2.dgk, h2.dgl, h2.dgm + 1, n3);
        h h5 = this.a(c2, h2.dgk - 1, h2.dgl, h2.dgm, n3);
        h h6 = this.a(c2, h2.dgk + 1, h2.dgl, h2.dgm, n3);
        h h7 = this.a(c2, h2.dgk, h2.dgl, h2.dgm - 1, n3);
        if (h4 != null && !h4.dgs && h4.b(h3) < f2) {
            hArray[n2++] = h4;
        }
        if (h5 != null && !h5.dgs && h5.b(h3) < f2) {
            hArray[n2++] = h5;
        }
        if (h6 != null && !h6.dgs && h6.b(h3) < f2) {
            hArray[n2++] = h6;
        }
        if (h7 != null && !h7.dgs && h7.b(h3) < f2) {
            hArray[n2++] = h7;
        }
        return n2;
    }

    private h a(net.minecraft.entity.c c2, int n2, int n3, int n4, int n5) {
        h h2 = null;
        int n6 = this.c(c2, n2, n3, n4);
        if (n6 == 2) {
            return this.ag(n2, n3, n4);
        }
        if (n6 == 1) {
            h2 = this.ag(n2, n3, n4);
        }
        if (h2 == null && n5 > 0 && n6 != -3 && n6 != -4 && this.c(c2, n2, n3 + n5, n4) == 1) {
            h2 = this.ag(n2, n3 + n5, n4);
            n3 += n5;
        }
        if (h2 != null) {
            int n7 = 0;
            int n8 = 0;
            while (n3 > 0) {
                n8 = this.c(c2, n2, n3 - 1, n4);
                if (this.dTd && n8 == -1) {
                    return null;
                }
                if (n8 != 1) break;
                if (n7++ >= c2.Ug()) {
                    return null;
                }
                if (--n3 <= 0) {
                    return null;
                }
                h2 = this.ag(n2, n3, n4);
            }
            if (n8 == -2) {
                return null;
            }
        }
        return h2;
    }

    private int c(net.minecraft.entity.c c2, int n2, int n3, int n4) {
        return c.a(this.dSW, c2, n2, n3, n4, this.dSY, this.dSZ, this.dTa, this.dTd, this.dTc, this.dTb);
    }

    public static int a(l l2, net.minecraft.entity.c c2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, boolean bl3, boolean bl4) {
        boolean bl5 = false;
        b b2 = new b(c2);
        g g2 = new g();
        for (int i2 = n2; i2 < n2 + n5; ++i2) {
            for (int i3 = n3; i3 < n3 + n6; ++i3) {
                for (int i4 = n4; i4 < n4 + n7; ++i4) {
                    g2.E(i2, i3, i4);
                    Block block = l2.L(g2).df();
                    if (block.xb() == Material.beo) continue;
                    if (block != Blocks.cNf && block != Blocks.cOy) {
                        if (block != Blocks.cLk && block != Blocks.cLl) {
                            if (!bl4 && block instanceof BlockDoor && block.xb() == Material.ber) {
                                return 0;
                            }
                        } else {
                            if (bl2) {
                                return -1;
                            }
                            bl5 = true;
                        }
                    } else {
                        bl5 = true;
                    }
                    if (c2.baU.L(g2).df() instanceof BlockRailBase) {
                        if (c2.baU.L(b2).df() instanceof BlockRailBase || c2.baU.L(b2.aqY()).df() instanceof BlockRailBase) continue;
                        return -3;
                    }
                    if (block.a(l2, (b)g2) || bl3 && block instanceof BlockDoor && block.xb() == Material.ber) continue;
                    if (block instanceof BlockFence || block instanceof BlockFenceGate || block instanceof BlockWall) {
                        return -3;
                    }
                    if (block == Blocks.cNf || block == Blocks.cOy) {
                        return -4;
                    }
                    Material material = block.xb();
                    if (material != Material.bew) {
                        return 0;
                    }
                    if (c2.isInLava()) continue;
                    return -2;
                }
            }
        }
        return bl5 ? 2 : 1;
    }

    public void bS(boolean bl2) {
        this.dTb = bl2;
    }

    public void bR(boolean bl2) {
        this.dTc = bl2;
    }

    public void bQ(boolean bl2) {
        this.dTd = bl2;
    }

    public void bT(boolean bl2) {
        this.dTe = bl2;
    }

    public boolean aiS() {
        return this.dTb;
    }

    public boolean aiT() {
        return this.dTe;
    }

    public boolean aiR() {
        return this.dTd;
    }
}

