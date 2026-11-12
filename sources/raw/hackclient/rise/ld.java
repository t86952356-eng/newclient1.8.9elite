/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.eq;
import hackclient.rise.fg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.go;
import hackclient.rise.le;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.l;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.potion.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

@gl(aliases={"KB Displacement", "Manual KB Displacement"}, description="Silently steers your post-hit server yaw toward nearby hazards for manual fights.", category=gj.GHOST)
public final class ld
extends gi {
    private final akq Bn = new akq("Rotation Speed", this, (Number)8, (Number)1, (Number)20, (Number)1);
    private final akq Bo = new akq("Tracking Range", this, (Number)6.0, (Number)3.0, (Number)8.0, (Number)0.1);
    private final aki Bp = new aki("Debug", (gi)this, (Boolean)false);
    private r Bq;
    private le Br;
    private int Bs;
    private String Bt = "";
    private int Bu = -1;
    @dm
    public final dk<fg> Bv = fg2 -> this.gQ();
    @dm
    public final dk<eq> Bw = eq2 -> {
        go go2 = this.e(go.class);
        if (go2 != null && go2.isEnabled()) {
            return;
        }
        if (eq2.isCancelled() || eq2.dc() == null) {
            return;
        }
        this.Bq = eq2.dc();
        this.Bs = 2;
        this.a("armed", null, this.Bq);
    };
    @dm
    public final dk<ej> Bx = ej2 -> {
        if (this.Bq == null) {
            return;
        }
        if (this.Bs > 0) {
            --this.Bs;
        }
        if (!this.x(this.Bq)) {
            this.a("rejected:no-target", null, this.Bq);
            this.gQ();
            return;
        }
        if (!this.eT()) {
            this.a("rejected:no-kb-source", null, this.Bq);
            return;
        }
        if (this.Bq.cus <= 0 && this.Bs <= 0) {
            this.a("rejected:hurt-time-ended", null, this.Bq);
            this.gQ();
            return;
        }
        if (this.h(this.Bq)) {
            this.a("rejected:crit-priority", null, this.Bq);
            return;
        }
        this.Br = this.y(this.Bq);
        if (this.Br == null) {
            this.a("rejected:no-plan", null, this.Bq);
            return;
        }
        akb akb2 = aix.a(this.Bq, true, ((Number)this.Bo.wD()).doubleValue());
        akb akb3 = new akb(this.Br.Bz, akb2.getY());
        bs.a(akb3, ((Number)this.Bn.wD()).doubleValue(), cb.gH, null, true);
        this.f(akb3);
        this.a("applied", this.Br, this.Bq);
    };

    @Override
    public void onEnable() {
        this.gQ();
    }

    @Override
    public void onDisable() {
        this.gQ();
    }

    private void gQ() {
        this.Bq = null;
        this.Br = null;
        this.Bs = 0;
        this.Bt = "";
        this.Bu = -1;
    }

    private boolean x(r r2) {
        return r2 != null && !r2.csb && ld.aER.bgK != null && ld.aER.bgF != null && (double)ld.aER.bgK.S(r2) <= ((Number)this.Bo.wD()).doubleValue() + 1.0;
    }

    private boolean eT() {
        return ld.aER.bgK != null && (ld.aER.bgK.isSprinting() || l.I(ld.aER.bgK) > 0);
    }

    private boolean g(r r2) {
        return r2 != null && ld.aER.bgK.csf > 0.0f && !ld.aER.bgK.aO && !ld.aER.bgK.isOnLadder() && !ld.aER.bgK.isInWater() && !ld.aER.bgK.a(a.dgK) && ld.aER.bgK.crC == null;
    }

    private boolean h(r r2) {
        return this.g(r2) && ld.aER.bgK.ue < 0.0;
    }

    private le y(r r2) {
        net.minecraft.util.a a2 = r2.Us();
        le le2 = null;
        block0: for (int i2 = 0; i2 < 32; ++i2) {
            double d2 = Math.PI * 2 * (double)i2 / 32.0;
            double d3 = -Math.sin(d2);
            double d4 = Math.cos(d2);
            for (double d5 = 0.8; d5 <= 5.0; d5 += 0.35) {
                net.minecraft.util.a a3 = a2.ae(d3 * d5, 0.0, d4 * d5);
                le le3 = this.b(r2, a3, d3, d4, d5);
                if (le3 != null && (le2 == null || le3.BC > le2.BC)) {
                    le2 = le3;
                }
                if (!ld.aER.bgF.a((c)r2, a3.af(0.02, 0.0, 0.02)).isEmpty()) continue block0;
            }
        }
        return le2 != null && le2.BC >= 45.0 ? le2 : null;
    }

    private le b(r r2, net.minecraft.util.a a2, double d2, double d3, double d4) {
        net.minecraft.util.a a3 = a2.af(0.05, 0.0, 0.05);
        net.minecraft.util.a a4 = a3.ae(0.0, -0.35, 0.0);
        String string = null;
        double d5 = Double.NEGATIVE_INFINITY;
        if (this.a(a3, Material.bew) || this.a(a4, Material.bew)) {
            string = "Lava";
            d5 = 150.0 - d4 * 8.0;
        } else if (this.a(a3, BlockWeb.class) || this.a(a4, BlockWeb.class)) {
            string = "Web";
            d5 = 125.0 - d4 * 7.0;
        } else if (this.b(a3) || this.b(a4)) {
            string = "Fire";
            d5 = 100.0 - d4 * 7.0;
        } else if (this.a(a3, Blocks.cMM) || this.a(a4, Blocks.cMM)) {
            string = "Cactus";
            d5 = 96.0 - d4 * 6.0;
        } else {
            double d6 = this.a(a4, 24);
            if (d6 < 0.0) {
                string = a4.dtI <= 8.0 ? "Void" : "Deep Drop";
                d5 = (a4.dtI <= 8.0 ? 145.0 : 108.0) - d4 * 7.0;
            } else if (d6 >= 4.0) {
                string = "Ditch";
                d5 = 88.0 + Math.min(d6, 10.0) * 3.5 - d4 * 6.0;
            } else if (this.a(a3, Material.bev) || this.a(a4, Material.bev)) {
                string = "Water";
                d5 = 58.0 + Math.max(0.0, d6) * 2.0 - d4 * 5.0;
            }
        }
        if (string == null) {
            return null;
        }
        float f2 = (float)Math.toDegrees(Math.atan2(d3, d2)) - 90.0f;
        float f3 = aix.a(r2, true, ((Number)this.Bo.wD()).doubleValue()).getY();
        return new le(r2.getEntityId(), f2, f3, d4, d5, string);
    }

    private double a(net.minecraft.util.a a2, int n2) {
        double d2 = 1.0E-4;
        int n3 = bt.aF(a2.dtH + 1.0E-4);
        int n4 = bt.aF(a2.dtK - 1.0E-4);
        int n5 = bt.aF(a2.dtJ + 1.0E-4);
        int n6 = bt.aF(a2.dtM - 1.0E-4);
        int n7 = bt.aF(a2.dtI) - 1;
        int n8 = Math.max(0, n7 - n2);
        double d3 = Double.POSITIVE_INFINITY;
        for (int i2 = n3; i2 <= n4; ++i2) {
            for (int i3 = n5; i3 <= n6; ++i3) {
                boolean bl2 = false;
                for (int i4 = n7; i4 >= n8; --i4) {
                    b b2 = new b(i2, i4, i3);
                    IBlockState iBlockState = ld.aER.bgF.L(b2);
                    net.minecraft.util.a a3 = iBlockState.df().a((w)ld.aER.bgF, b2, iBlockState);
                    if (a3 == null) continue;
                    double d4 = Math.max(0.0, a2.dtI - a3.dtL);
                    d3 = Math.min(d3, d4);
                    bl2 = true;
                    break;
                }
                if (bl2) continue;
                return -1.0;
            }
        }
        return d3 == Double.POSITIVE_INFINITY ? -1.0 : d3;
    }

    private boolean a(net.minecraft.util.a a2, Material material) {
        return this.a(a2, (Block block) -> block.xb() == material);
    }

    private boolean a(net.minecraft.util.a a2, Class<? extends Block> clazz) {
        return this.a(a2, clazz::isInstance);
    }

    private boolean a(net.minecraft.util.a a2, Block block) {
        return this.a(a2, (Block block2) -> block2 == block);
    }

    private boolean b(net.minecraft.util.a a2) {
        return this.a(a2, (Block block) -> block == Blocks.cMd || block == Blocks.cLm || block == Blocks.cLn);
    }

    private boolean a(net.minecraft.util.a a2, Predicate<Block> predicate) {
        double d2 = 1.0E-4;
        int n2 = bt.aF(a2.dtH + 1.0E-4);
        int n3 = bt.aF(a2.dtK - 1.0E-4);
        int n4 = bt.aF(a2.dtI + 1.0E-4);
        int n5 = bt.aF(a2.dtL - 1.0E-4);
        int n6 = bt.aF(a2.dtJ + 1.0E-4);
        int n7 = bt.aF(a2.dtM - 1.0E-4);
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                for (int i4 = n6; i4 <= n7; ++i4) {
                    Block block = ld.aER.bgF.L(new b(i2, i3, i4)).df();
                    if (!predicate.test(block)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private void f(akb akb2) {
        if (akb2 == null) {
            return;
        }
        float f2 = ld.aER.bgK.pl + bt.bN(akb2.getX() - ld.aER.bgK.pl);
    }

    private void a(String string, le le2, r r2) {
        String string2;
        if (!((Boolean)this.Bp.wD()).booleanValue() || ld.aER.bgK == null) {
            return;
        }
        String string3 = le2 == null ? String.format("%s hurt=%d", string, r2 == null ? -1 : r2.cus) : (string2 = String.format("%s %s score=%.1f yaw=%.1f pitch=%.1f dist=%.2f hurt=%d", string, le2.BD, le2.BC, Float.valueOf(le2.Bz), Float.valueOf(le2.BA), le2.BB, r2 == null ? -1 : r2.cus));
        if (string2.equals(this.Bt) && ld.aER.bgK.aRg - this.Bu < 8) {
            return;
        }
        this.Bt = string2;
        this.Bu = ld.aER.bgK.aRg;
        afl.c(afl.getPrefix() + "[KB Module] " + string2, new Object[0]);
    }
}

