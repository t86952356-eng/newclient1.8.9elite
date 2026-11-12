/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server.management;

import hackclient.rise.aea;
import hackclient.rise.bu;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.e;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.network.play.server.an;
import net.minecraft.network.play.server.bi;
import net.minecraft.network.play.server.bj;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.util.b;
import net.minecraft.world.ai;
import net.minecraft.world.ao;
import net.minecraft.world.n;
import net.minecraft.world.w;

public class ItemInWorldManager
implements aea {
    public w cxM;
    public e dlK;
    private ao bFi = ao.dEw;
    private boolean dlL;
    private int dlM;
    private b dlN = b.dtN;
    private int dlO;
    private boolean dlP;
    private b dlQ = b.dtN;
    private int dlR;
    private int dlS = -1;

    public ItemInWorldManager(w w2) {
        this.cxM = w2;
    }

    public void a(ao ao2) {
        this.bFi = ao2;
        ao2.a(this.dlK.cIt);
        this.dlK.Ds();
        this.dlK.cIY.alE().H(new bi(bj.dez, this.dlK));
    }

    public ao If() {
        return this.bFi;
    }

    public boolean amg() {
        return this.bFi.awG();
    }

    public boolean amh() {
        return this.bFi.amh();
    }

    public void b(ao ao2) {
        if (this.bFi == ao.dEw) {
            this.bFi = ao2;
        }
        this.a(this.bFi);
    }

    public void ami() {
        ++this.dlO;
        if (this.dlP) {
            int n2 = this.dlO - this.dlR;
            Block block = this.cxM.L(this.dlQ).df();
            if (block.xb() == Material.beo) {
                this.dlP = false;
            } else {
                float f2 = block.a(this.dlK, this.dlK.baU, this.dlQ) * (float)(n2 + 1);
                int n3 = (int)(f2 * 10.0f);
                if (n3 != this.dlS) {
                    this.cxM.b(this.dlK.getEntityId(), this.dlQ, n3);
                    this.dlS = n3;
                }
                if (f2 >= 1.0f) {
                    this.dlP = false;
                    this.ao(this.dlQ);
                }
            }
        } else if (this.dlL) {
            Block block = this.cxM.L(this.dlN).df();
            if (block.xb() == Material.beo) {
                this.cxM.b(this.dlK.getEntityId(), this.dlN, -1);
                this.dlS = -1;
                this.dlL = false;
            } else {
                int n4 = this.dlO - this.dlM;
                float f3 = block.a(this.dlK, this.dlK.baU, this.dlQ) * (float)(n4 + 1);
                int n5 = (int)(f3 * 10.0f);
                if (n5 != this.dlS) {
                    this.cxM.b(this.dlK.getEntityId(), this.dlN, n5);
                    this.dlS = n5;
                }
            }
        }
    }

    public void h(b b2, net.minecraft.util.ao ao2) {
        if (this.amh()) {
            if (!this.cxM.a(null, b2, ao2)) {
                this.ao(b2);
            }
        } else {
            Block block = this.cxM.L(b2).df();
            if (this.bFi.awF()) {
                if (this.bFi == ao.dEA) {
                    return;
                }
                if (!this.dlK.aca()) {
                    co co2 = this.dlK.abO();
                    if (co2 == null) {
                        return;
                    }
                    if (!co2.K(block)) {
                        return;
                    }
                }
            }
            this.cxM.a(null, b2, ao2);
            this.dlM = this.dlO;
            float f2 = 1.0f;
            if (block.xb() != Material.beo) {
                block.a(this.cxM, b2, this.dlK);
                f2 = block.a(this.dlK, this.dlK.baU, b2);
            }
            if (block.xb() != Material.beo && f2 >= 1.0f) {
                this.ao(b2);
            } else {
                this.dlL = true;
                this.dlN = b2;
                int n2 = (int)(f2 * 10.0f);
                this.cxM.b(this.dlK.getEntityId(), b2, n2);
                this.dlS = n2;
            }
        }
    }

    public void am(b b2) {
        if (b2.equals(this.dlN)) {
            int n2 = this.dlO - this.dlM;
            Block block = this.cxM.L(b2).df();
            if (block.xb() != Material.beo) {
                float f2 = block.a(this.dlK, this.dlK.baU, b2) * (float)(n2 + 1);
                if (f2 >= 0.7f) {
                    this.dlL = false;
                    this.cxM.b(this.dlK.getEntityId(), b2, -1);
                    this.ao(b2);
                } else if (!this.dlP) {
                    this.dlL = false;
                    this.dlP = true;
                    this.dlQ = b2;
                    this.dlR = this.dlM;
                }
            }
        }
    }

    public void amj() {
        this.dlL = false;
        this.cxM.b(this.dlK.getEntityId(), this.dlN, -1);
    }

    private boolean an(b b2) {
        IBlockState iBlockState = this.cxM.L(b2);
        iBlockState.df().a(this.cxM, b2, iBlockState, this.dlK);
        boolean bl2 = this.cxM.aL(b2);
        if (bl2) {
            iBlockState.df().b(this.cxM, b2, iBlockState);
        }
        return bl2;
    }

    public boolean ao(b b2) {
        if (this.bFi.amh() && this.dlK.Vk() != null && this.dlK.Vk().bP() instanceof cp) {
            return false;
        }
        IBlockState iBlockState = this.cxM.L(b2);
        d d2 = this.cxM.K(b2);
        if (this.bFi.awF()) {
            if (this.bFi == ao.dEA) {
                return false;
            }
            if (!this.dlK.aca()) {
                co co2 = this.dlK.abO();
                if (co2 == null) {
                    return false;
                }
                if (!co2.K(iBlockState.df())) {
                    return false;
                }
            }
        }
        this.cxM.b(this.dlK, 2001, b2, Block.a(iBlockState));
        boolean bl2 = this.an(b2);
        if (this.amh()) {
            this.dlK.cIX.B(new an(this.cxM, b2));
        } else {
            co co3 = this.dlK.abO();
            boolean bl3 = this.dlK.F(iBlockState.df());
            if (co3 != null) {
                co3.a(this.cxM, iBlockState.df(), b2, this.dlK);
                if (co3.cWZ == 0) {
                    this.dlK.abP();
                }
            }
            if (bl2 && bl3) {
                iBlockState.df().a(this.cxM, this.dlK, b2, iBlockState, d2);
            }
        }
        return bl2;
    }

    public boolean b(a a2, w w2, co co2) {
        if (this.bFi == ao.dEA) {
            return false;
        }
        int n2 = co2.cWZ;
        int n3 = co2.yc();
        co co3 = co2.a(w2, a2);
        if (co3 != co2 || co3 != null && (co3.cWZ != n2 || co3.aeh() > 0 || co3.yc() != n3)) {
            co[] coArray = a2.cHV.cJC;
            this.d(bu.class);
            coArray[bu.bQ()] = co3;
            if (this.amh()) {
                co3.cWZ = n2;
                if (co3.aed()) {
                    co3.gf(n3);
                }
            }
            if (co3.cWZ == 0) {
                co[] coArray2 = a2.cHV.cJC;
                this.d(bu.class);
                coArray2[bu.bQ()] = null;
            }
            if (!a2.isUsingItem()) {
                ((e)a2).d(a2.cHX);
            }
            return true;
        }
        return false;
    }

    public boolean a(a a2, w w2, co co2, b b2, net.minecraft.util.ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState;
        if (this.bFi == ao.dEA) {
            d d2 = w2.K(b2);
            if (d2 instanceof n) {
                Block block = w2.L(b2).df();
                n n2 = (n)((Object)d2);
                if (n2 instanceof m && block instanceof BlockChest) {
                    n2 = ((BlockChest)block).r(w2, b2);
                }
                if (n2 != null) {
                    a2.a(n2);
                    return true;
                }
            } else if (d2 instanceof ab) {
                a2.a((ab)((Object)d2));
                return true;
            }
            return false;
        }
        if ((!a2.isSneaking() || a2.Vk() == null) && (iBlockState = w2.L(b2)).df().a(w2, b2, iBlockState, a2, ao2, f2, f3, f4)) {
            return true;
        }
        if (co2 == null) {
            return false;
        }
        if (this.amh()) {
            int n3 = co2.yc();
            int n4 = co2.cWZ;
            boolean bl2 = co2.a(a2, w2, b2, ao2, f2, f3, f4);
            co2.gf(n3);
            co2.cWZ = n4;
            return bl2;
        }
        return co2.a(a2, w2, b2, ao2, f2, f3, f4);
    }

    public void e(ai ai2) {
        this.cxM = ai2;
    }
}

