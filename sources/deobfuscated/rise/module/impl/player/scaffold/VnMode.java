/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.bb;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.vr;
import java.util.Random;
import lombok.Generated;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.item.cp;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.server.an;
import net.minecraft.potion.a;
import net.minecraft.util.bt;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.Scaffold;
import rise.module.impl.player.scaffold.WdMode;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;

public class VnMode
extends Mode<Scaffold> {
    private boolean HJ = false;
    private boolean gD = false;
    private boolean akd = false;
    private int ake = -1;
    public static boolean akf = false;
    public static boolean akg = false;
    public static boolean akh = false;
    public static boolean aki = false;
    private int akj = 0;
    private int aka;
    public final BooleanValue akk = new BooleanValue("Place Extra blocks", (Mode<?>)this, (Boolean)false);
    private final vr akl;
    @EventLink(cH=3)
    public final Listener<PreMotionEvent> akm = preMotionEvent -> {
        double d2;
        float f2;
        float f3;
        ((Scaffold)this.wy()).aho = 1;
        if (!(Math.abs(VnMode.aER.bgK.ue) < 0.1) || VnMode.aER.bgK.tR < 2) {
            // empty if block
        }
        boolean bl2 = Math.abs((f3 = bt.bN(f2 = VnMode.aER.bgK.pl)) % 90.0f) <= 10.0f || Math.abs(f3 % 90.0f) >= 80.0f;
        double d3 = bt.aJ(Math.toDegrees(aii.direction()));
        if (Math.abs(d3 - (d2 = bt.aJ(Math.toDegrees(Math.atan2(VnMode.aER.bgK.uf, VnMode.aER.bgK.ud)) - 90.0))) < 5.0 && VnMode.aER.bgK.Zz > 7 && !VnMode.aER.aIY.chu.Re() && !VnMode.aER.aIY.chr.Re()) {
            if (!(VnMode.aER.bgK.crx <= 2 || VnMode.aER.aIY.chq.Re() || Client.a.g().c(Speed.class).isEnabled() || VnMode.aER.bgK.a(a.dgw) || VnMode.aER.bgK.Zz <= 7)) {
                aii.strafe();
                if (bl2) {
                    VnMode.aER.bgK.uf *= 1.1225;
                    VnMode.aER.bgK.ud *= 1.1225;
                } else {
                    VnMode.aER.bgK.uf *= 1.129;
                    VnMode.aER.bgK.ud *= 1.129;
                }
            } else if (VnMode.aER.bgK.crx > 2 && !VnMode.aER.aIY.chq.Re() && !Client.a.g().c(Speed.class).isEnabled() && VnMode.aER.bgK.a(a.dgw) && VnMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2 && VnMode.aER.bgK.Zz > 7) {
                aii.strafe();
                VnMode.aER.bgK.uf *= 1.1055;
                VnMode.aER.bgK.ud *= 1.1055;
            } else if (VnMode.aER.bgK.crx > 2 && !VnMode.aER.aIY.chq.Re() && !Client.a.g().c(Speed.class).isEnabled() && VnMode.aER.bgK.a(a.dgw) && VnMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1 && VnMode.aER.bgK.Zz > 7) {
                aii.strafe();
                VnMode.aER.bgK.uf *= 1.098;
                VnMode.aER.bgK.ud *= 1.098;
            }
        }
        if (VnMode.aER.aIY.chr.Re()) {
            return;
        }
        int n2 = VnMode.aER.bgK.aRg;
        int n3 = this.aka;
        if (!this.e(Flight.class).isEnabled() && !this.e(LongJump.class).isEnabled() && !bb.a(true, true, false, true, false) && Math.random() > 0.5 && akh && aii.isMoving() && !(VnMode.aER.bgK.Vk().bP() instanceof cp)) {
            Random random = new Random();
            float f4 = random.nextFloat();
            float f5 = random.nextFloat();
            akh = false;
        }
        if ((this.ake == -1 || n2 - this.ake < 4) && this.ake == -1) {
            this.ake = n2;
        }
        if (VnMode.aER.bgK.aO) {
            aii.strafe();
        }
        if (this.gD && !VnMode.aER.aIY.chq.Re()) {
            WdMode.ala = VnMode.aER.bgK.pl;
            WdMode.qH = 17;
            WdMode.hV = 0;
            aii.stop();
            this.gD = false;
            bs.a(new Vector2f((float)((double)VnMode.aER.bgK.pl + (Math.random() - 0.5) * 3.0), 90.0f), 10.0, cb.gH);
            if (!(aik.o(VnMode.aER.bgK.gW, VnMode.aER.bgK.aI - 2.0, VnMode.aER.bgK.gX) instanceof BlockAir)) {
                ((Scaffold)this.wy()).Ms = VnMode.aER.bgK.aI - 1.0;
            }
        }
        if (VnMode.aER.aIY.chq.Re()) {
            this.gD = true;
        }
    };
    @EventLink(cH=2)
    public final Listener<PreUpdateEvent> akn = preUpdateEvent -> {
        boolean bl2;
        block17: {
            block16: {
                boolean bl3 = bl2 = VnMode.aER.bgK.aI == ((Scaffold)this.wy()).Ms;
                if (!((Boolean)this.akk.wD()).booleanValue()) {
                    bl2 = true;
                }
                this.d(bu.class);
                if (bu.bO() != null && VnMode.aER.bgK.gX > ((Scaffold)this.wy()).Ms && VnMode.aER.bgK.gX + aii.predictedMotion(VnMode.aER.bgK.ue, 2) < ((Scaffold)this.wy()).Ms + 1.0 && (!this.akd || akf) && Client.a.g().c(Speed.class).isEnabled() && !((Mode)this.e(Scaffold.class).agx.wD()).getName().equals("Auto Jump")) break block16;
                this.d(bu.class);
                if (bu.bO() == null || !(VnMode.aER.bgK.gX > ((Scaffold)this.wy()).Ms) || !(VnMode.aER.bgK.gX + aii.predictedMotion(VnMode.aER.bgK.ue, 2) < ((Scaffold)this.wy()).Ms + 1.0) || !((Mode)this.e(Scaffold.class).agx.wD()).getName().equals("Auto Jump")) break block17;
            }
            this.d(bu.class);
            bu.setSlot(ain.vM());
        }
        if (Client.a.g().c(Speed.class).isEnabled()) {
            bl2 = false;
        }
        if (this.akd) {
            bl2 = true;
        }
        if (VnMode.aER.bgK.tR > 8) {
            this.akd = false;
        }
        if ((aik.ad(2.0) || aik.ad(1.0) || aik.ad(0.0) || aik.ad(3.0) || VnMode.aER.aIY.chq.Rg() || VnMode.aER.bgK.a(a.dgw) || this.gD) && VnMode.aER.bgK.crx < 1) {
            VnMode.aER.bgK.crP = false;
        }
        if (VnMode.aER.aIY.chq.Rg() && VnMode.aER.bgK.aO && !this.gD && (akg || ((Mode)this.e(Scaffold.class).agx.wD()).getName().equals("Auto Jump")) && !Client.a.g().c(Speed.class).isEnabled()) {
            akg = false;
            aii.strafe(aii.vs() * 0.9);
            if (((Mode)this.e(Scaffold.class).agx.wD()).getName().equals("Auto Jump")) {
                aii.strafe(aii.getAllowedHorizontalDistance() - 0.001);
            }
        }
        if (VnMode.aER.bgK.tR == 4 && !VnMode.aER.aIY.chq.Re() && !Client.a.g().c(Speed.class).isEnabled() && !bl2 && ((Mode)this.e(Scaffold.class).agx.wD()).getName().equals("Auto Jump")) {
            VnMode.aER.bgK.ue -= 0.19;
        }
        if (VnMode.aER.bgK.tR == 1 && !VnMode.aER.aIY.chq.Re()) {
            aii.strafe();
        }
        if (aik.p(0.0, VnMode.aER.bgK.ue, 0.0) != Blocks.cLc && VnMode.aER.bgK.tR > 2) {
            aii.strafe();
        }
        if (bl2 && !VnMode.aER.aIY.chq.Re() && !VnMode.aER.bgK.aO && !this.e(Speed.class).isEnabled() && ((Boolean)this.akk.wD()).booleanValue() || !bl2 || VnMode.aER.aIY.chq.Re() || VnMode.aER.bgK.aO || ((Boolean)this.akk.wD()).booleanValue()) {
            // empty if block
        }
        if (bl2 && VnMode.aER.bgK.aO && !VnMode.aER.aIY.chq.Re()) {
            ++this.akj;
        }
        if (!bl2) {
            this.akj = 0;
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> ako = packetReceiveEvent -> {
        if (packetReceiveEvent.dq() instanceof an) {
            akh = true;
            ++this.aka;
        }
    };
    @EventLink
    public final Listener<StrafeEvent> akp = strafeEvent -> {
        if (!((Mode)this.e(Scaffold.class).agx.wD()).getName().equals("Auto Jump") && VnMode.aER.bgK.aO && this.akd && akf && !Client.a.g().c(Speed.class).isEnabled() && !VnMode.aER.aIY.chq.Re()) {
            akf = false;
        }
    };

    public VnMode(String string, Scaffold scaffold) {
        super(string, scaffold);
        this.akl = new vr(scaffold);
    }

    @Override
    public void onEnable() {
        akh = false;
        aki = false;
        if (!((Mode)this.e(Scaffold.class).agx.wD()).getName().equals("Auto Jump")) {
            if (VnMode.aER.bgK.crx > 9) {
                akf = true;
                this.akd = true;
            }
        } else {
            VnMode.aER.bgK.crP = false;
        }
        akg = true;
        this.gD = false;
        if (!VnMode.aER.bgK.aO && !VnMode.aER.aIY.chq.Re()) {
            VnMode.aER.bgK.ud *= 0.0;
            VnMode.aER.bgK.uf *= 0.0;
        }
        this.ake = -1;
        this.aka = 0;
        akg = true;
    }

    @Override
    public void onDisable() {
        float f2;
        float f3;
        boolean bl2;
        this.HJ = false;
        akh = false;
        VnMode.aER.bgK.crP = false;
        akf = false;
        this.akd = false;
        if (VnMode.aER.bgK.Zz < 20) {
            // empty if block
        }
        boolean bl3 = bl2 = Math.abs((f3 = bt.bN(f2 = VnMode.aER.bgK.pl)) % 90.0f) <= 10.0f || Math.abs(f3 % 90.0f) >= 80.0f;
        if (bl2) {
            if (VnMode.aER.bgK.crx > 2 && VnMode.aER.bgK.aRg % 3 == 1) {
                VnMode.aER.bgC.dAp = 0.5f;
                ahn.m(new e(VnMode.aER.bgK.aO));
            } else if (VnMode.aER.bgK.crx > 2 && VnMode.aER.bgK.aRg % 3 == 2) {
                VnMode.aER.bgC.dAp = 0.33f;
                ahn.m(new e(VnMode.aER.bgK.aO));
                ahn.m(new e(VnMode.aER.bgK.aO));
            } else if (VnMode.aER.bgK.crx > 2) {
                VnMode.aER.bgC.dAp = 0.5f;
                ahn.m(new e(VnMode.aER.bgK.aO));
            }
        } else if (VnMode.aER.bgK.crx > 2) {
            VnMode.aER.bgC.dAp = 0.33f;
            ahn.m(new e(VnMode.aER.bgK.aO));
            ahn.m(new e(VnMode.aER.bgK.aO));
        }
        akg = false;
        if (this.gD) {
            // empty if block
        }
        bm.dispatch();
    }

    @Generated
    public vr kS() {
        return this.akl;
    }
}

