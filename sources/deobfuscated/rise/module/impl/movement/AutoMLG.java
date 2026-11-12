/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.aei;
import hackclient.rise.ahn;
import hackclient.rise.ain;
import hackclient.rise.aix;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.cg;
import hackclient.rise.lt;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.m;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.world.w;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.movement.automlg.name"}, description="module.movement.automlg.description", category=Category.MOVEMENT)
public class AutoMLG
extends Module {
    private final NumberValue CA = new NumberValue("Fall Distance", this, (Number)4.0, (Number)3.0, (Number)20.0, (Number)0.5);
    private final NumberValue CB = new NumberValue("Pickup Delay", this, (Number)4, (Number)1, (Number)20, (Number)1);
    private final BooleanValue CC = new BooleanValue("Auto Pickup", (Module)this, (Boolean)true);
    private final BooleanValue CD = new BooleanValue("Auto Disable", (Module)this, (Boolean)false);
    private lt CE = lt.CJ;
    private int CF = -1;
    private int qH;
    private b CG;
    @EventLink(cH=3)
    public final Listener<PreUpdateEvent> CH = preUpdateEvent -> {
        if (AutoMLG.aER.bgK == null || AutoMLG.aER.bgF == null || AutoMLG.aER.bgK.csb) {
            return;
        }
        if (this.CE != lt.CJ && this.CF != -1) {
            bu.b(this.CF, true);
        }
        switch (this.CE.ordinal()) {
            case 0: {
                this.gV();
                break;
            }
            case 1: {
                this.gW();
                break;
            }
            case 2: {
                this.gX();
                break;
            }
            case 3: {
                this.gY();
            }
        }
    };

    @Override
    public void onEnable() {
        this.gS();
    }

    @Override
    public void onDisable() {
        this.CE = lt.CJ;
        this.CF = -1;
        this.CG = null;
    }

    private void gS() {
        this.CE = lt.CJ;
        this.CF = -1;
        this.qH = 0;
        this.CG = null;
    }

    private boolean o(double d2) {
        a a2 = AutoMLG.aER.bgK.Us().ae(0.0, d2, 0.0);
        return !AutoMLG.aER.bgF.a((c)AutoMLG.aER.bgK, a2).isEmpty();
    }

    private da a(b b2, ao ao2, ce ce2) {
        da da2 = new da((double)b2.wt() + Math.random(), (double)b2.wu() + Math.random(), (double)b2.wx() + Math.random());
        switch (ao2) {
            case dwq: {
                da2.dAH = b2.wu();
                break;
            }
            case dwr: {
                da2.dAH = b2.wu() + 1;
                break;
            }
            case dws: {
                da2.dAI = b2.wx();
                break;
            }
            case dwt: {
                da2.dAI = b2.wx() + 1;
                break;
            }
            case dwu: {
                da2.dAG = b2.wt();
                break;
            }
            case dwv: {
                da2.dAG = b2.wt() + 1;
            }
        }
        if (ce2 != null && ce2.daS != null && ce2.dg() != null && ce2.dg().equals(b2) && ce2.dzv == ao2) {
            da2 = ce2.daS;
        }
        return da2;
    }

    private b d(ce ce2) {
        if (ce2 == null || ce2.dg() == null || ce2.dzv == null) {
            return null;
        }
        b b2 = ce2.dg();
        b b3 = b2.x(ce2.dzv);
        Block block = AutoMLG.aER.bgF.L(b3).df();
        if (block.a((w)AutoMLG.aER.bgF, b3) || block.xb().zv()) {
            return b3;
        }
        return b2;
    }

    private boolean e(b b2) {
        if (b2 == null) {
            return false;
        }
        IBlockState iBlockState = AutoMLG.aER.bgF.L(b2);
        Block block = iBlockState.df();
        return (block == Blocks.cLl || block == Blocks.cLk) && block instanceof BlockLiquid && iBlockState.b(BlockLiquid.aWV) == 0;
    }

    private b gT() {
        b b2 = new b(AutoMLG.aER.bgK);
        b b3 = null;
        double d2 = Double.MAX_VALUE;
        for (int i2 = -3; i2 <= 3; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                for (int i4 = -3; i4 <= 3; ++i4) {
                    double d3;
                    b b4 = b2.C(i2, i3, i4);
                    if (!this.e(b4) || !((d3 = AutoMLG.aER.bgK.M((double)b4.wt() + 0.5, (double)b4.wu() + 0.5, (double)b4.wx() + 0.5)) < d2)) continue;
                    d2 = d3;
                    b3 = b4;
                }
            }
        }
        return b3;
    }

    private b gU() {
        if (this.e(this.CG)) {
            return this.CG;
        }
        b b2 = this.gT();
        if (b2 != null) {
            this.CG = b2;
        }
        return this.CG;
    }

    private boolean a(co co2, b b2) {
        if (co2 == null || co2.bP() != Items.cQA || b2 == null) {
            return false;
        }
        Vector2f vector2f = aix.h(new da((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5));
        float f2 = AutoMLG.aER.bgK.pl;
        float f3 = AutoMLG.aER.bgK.pm;
        AutoMLG.aER.bgK.pl = vector2f.x;
        AutoMLG.aER.bgK.pm = vector2f.y;
        boolean bl2 = AutoMLG.aER.bgu.a((net.minecraft.entity.player.a)AutoMLG.aER.bgK, AutoMLG.aER.bgF, co2);
        AutoMLG.aER.bgK.pl = f2;
        AutoMLG.aER.bgK.pm = f3;
        if (bl2) {
            AutoMLG.aER.bhl = 0;
        }
        return bl2;
    }

    private void gV() {
        if (AutoMLG.aER.bgK.csf < ((Number)this.CA.wD()).floatValue() || AutoMLG.aER.bgK.ue >= 0.0 || AutoMLG.aER.bgK.isInWater() || AutoMLG.aER.bgK.isInLava() || AutoMLG.aER.bgK.aO || AutoMLG.aER.bgK.cIt.cJK) {
            return;
        }
        int n2 = ain.e(Items.cQB);
        if (n2 == -1) {
            return;
        }
        this.CF = n2;
        bu.b(this.CF, true);
        this.CE = lt.CK;
        this.qH = 0;
    }

    private void gW() {
        ++this.qH;
        if (AutoMLG.aER.bgK.aO || AutoMLG.aER.bgK.isInWater() || AutoMLG.aER.bgK.csb || this.qH > 100) {
            cg.e("Auto MLG", "Failed - couldn't place water in time");
            this.gS();
            return;
        }
        if (AutoMLG.aER.bgK.ue > 0.5) {
            this.gS();
            return;
        }
        co co2 = bu.bO();
        if (co2 == null || co2.bP() != Items.cQB) {
            cg.e("Auto MLG", "Failed - no water bucket in hand");
            this.gS();
            return;
        }
        bs.a(new Vector2f(AutoMLG.aER.bgK.pl, 90.0f), 10.0, cb.gH);
        double d2 = Math.max(AutoMLG.aER.bgK.ue * 2.0, -4.5);
        if (!this.o(d2)) {
            return;
        }
        ce ce2 = aei.c(bs.fk, AutoMLG.aER.bgu.Hr());
        if (ce2 == null || ce2.dzu != cf.dzy || ce2.dzv == null || ce2.dg() == null || (double)ce2.dg().wu() >= AutoMLG.aER.bgK.gX) {
            return;
        }
        da da2 = this.a(ce2.dg(), ce2.dzv, ce2);
        co co3 = bu.bO();
        if (co3 == null || co3.bP() != Items.cQB) {
            cg.e("Auto MLG", "Failed - no water bucket in hand");
            this.gS();
            return;
        }
        boolean bl2 = false;
        ahn.m(new m());
        if (!bl2) {
            ahn.m(new k(co3));
            bl2 = true;
        }
        if (bl2) {
            this.CG = this.d(ce2);
            AutoMLG.aER.bhl = 0;
            this.CE = lt.CL;
            this.qH = 0;
        }
    }

    private void gX() {
        ++this.qH;
        bs.a(new Vector2f(AutoMLG.aER.bgK.pl, 90.0f), 10.0, cb.gH);
        if (AutoMLG.aER.bgK.aO || AutoMLG.aER.bgK.isInWater()) {
            if (((Boolean)this.CC.wD()).booleanValue()) {
                this.CE = lt.CM;
                this.qH = 0;
            } else {
                cg.e("Auto MLG", "Water placed successfully!");
                this.gS();
                if (((Boolean)this.CD.wD()).booleanValue()) {
                    this.toggle();
                }
            }
            return;
        }
        if (this.qH > 60) {
            cg.e("Auto MLG", "Failed - landing timed out");
            this.gS();
        }
    }

    private void gY() {
        co co2;
        ++this.qH;
        co co3 = bu.bO();
        if (co3 != null && co3.bP() == Items.cQB) {
            cg.e("Auto MLG", "MLG successful!");
            this.gS();
            if (((Boolean)this.CD.wD()).booleanValue()) {
                this.toggle();
            }
            return;
        }
        b b2 = this.gU();
        if (b2 != null) {
            bs.a(aix.h(new da((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5)), 30.0, cb.gH);
        } else {
            bs.a(new Vector2f(AutoMLG.aER.bgK.pl, 90.0f), 10.0, cb.gH);
        }
        if (this.qH >= ((Number)this.CB.wD()).intValue() && (co2 = bu.bO()) != null && co2.bP() == Items.cQA && b2 != null && this.a(co2, b2)) {
            ahn.m(new m());
            cg.e("Auto MLG", "MLG successful!");
            this.gS();
            if (((Boolean)this.CD.wD()).booleanValue()) {
                this.toggle();
            }
        }
        if (this.qH > ((Number)this.CB.wD()).intValue() + 40) {
            cg.e("Auto MLG", "Pickup timed out, resetting");
            this.gS();
        }
    }
}

