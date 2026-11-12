/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bb;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.lw;
import hackclient.rise.lz;
import hackclient.rise.mh;
import hackclient.rise.tn;
import hackclient.rise.vr;
import hackclient.rise.wd;
import java.util.Random;
import lombok.Generated;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.item.cp;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.server.an;
import net.minecraft.util.bt;

public class vn
extends akg<tn> {
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
    public final aki akk = new aki("Place Extra blocks", (akg<?>)this, (Boolean)false);
    private final vr akl;
    @dm(cH=3)
    public final dk<ei> akm = ei2 -> {
        double d2;
        float f2;
        float f3;
        ((tn)this.wy()).aho = 1;
        if (!(Math.abs(vn.aER.bgK.ue) < 0.1) || vn.aER.bgK.tR < 2) {
            // empty if block
        }
        boolean bl2 = Math.abs((f3 = bt.bN(f2 = vn.aER.bgK.pl)) % 90.0f) <= 10.0f || Math.abs(f3 % 90.0f) >= 80.0f;
        double d3 = bt.aJ(Math.toDegrees(aii.direction()));
        if (Math.abs(d3 - (d2 = bt.aJ(Math.toDegrees(Math.atan2(vn.aER.bgK.uf, vn.aER.bgK.ud)) - 90.0))) < 5.0 && vn.aER.bgK.Zz > 7 && !vn.aER.aIY.chu.Re() && !vn.aER.aIY.chr.Re()) {
            if (!(vn.aER.bgK.crx <= 2 || vn.aER.aIY.chq.Re() || a.a.g().c(mh.class).isEnabled() || vn.aER.bgK.a(net.minecraft.potion.a.dgw) || vn.aER.bgK.Zz <= 7)) {
                aii.strafe();
                if (bl2) {
                    vn.aER.bgK.uf *= 1.1225;
                    vn.aER.bgK.ud *= 1.1225;
                } else {
                    vn.aER.bgK.uf *= 1.129;
                    vn.aER.bgK.ud *= 1.129;
                }
            } else if (vn.aER.bgK.crx > 2 && !vn.aER.aIY.chq.Re() && !a.a.g().c(mh.class).isEnabled() && vn.aER.bgK.a(net.minecraft.potion.a.dgw) && vn.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 >= 2 && vn.aER.bgK.Zz > 7) {
                aii.strafe();
                vn.aER.bgK.uf *= 1.1055;
                vn.aER.bgK.ud *= 1.1055;
            } else if (vn.aER.bgK.crx > 2 && !vn.aER.aIY.chq.Re() && !a.a.g().c(mh.class).isEnabled() && vn.aER.bgK.a(net.minecraft.potion.a.dgw) && vn.aER.bgK.b((net.minecraft.potion.a)net.minecraft.potion.a.dgw).dhk + 1 == 1 && vn.aER.bgK.Zz > 7) {
                aii.strafe();
                vn.aER.bgK.uf *= 1.098;
                vn.aER.bgK.ud *= 1.098;
            }
        }
        if (vn.aER.aIY.chr.Re()) {
            return;
        }
        int n2 = vn.aER.bgK.aRg;
        int n3 = this.aka;
        if (!this.e(lw.class).isEnabled() && !this.e(lz.class).isEnabled() && !bb.a(true, true, false, true, false) && Math.random() > 0.5 && akh && aii.isMoving() && !(vn.aER.bgK.Vk().bP() instanceof cp)) {
            Random random = new Random();
            float f4 = random.nextFloat();
            float f5 = random.nextFloat();
            akh = false;
        }
        if ((this.ake == -1 || n2 - this.ake < 4) && this.ake == -1) {
            this.ake = n2;
        }
        if (vn.aER.bgK.aO) {
            aii.strafe();
        }
        if (this.gD && !vn.aER.aIY.chq.Re()) {
            wd.ala = vn.aER.bgK.pl;
            wd.qH = 17;
            wd.hV = 0;
            aii.stop();
            this.gD = false;
            bs.a(new akb((float)((double)vn.aER.bgK.pl + (Math.random() - 0.5) * 3.0), 90.0f), 10.0, cb.gH);
            if (!(aik.o(vn.aER.bgK.gW, vn.aER.bgK.aI - 2.0, vn.aER.bgK.gX) instanceof BlockAir)) {
                ((tn)this.wy()).Ms = vn.aER.bgK.aI - 1.0;
            }
        }
        if (vn.aER.aIY.chq.Re()) {
            this.gD = true;
        }
    };
    @dm(cH=2)
    public final dk<ej> akn = ej2 -> {
        boolean bl2;
        block17: {
            block16: {
                boolean bl3 = bl2 = vn.aER.bgK.aI == ((tn)this.wy()).Ms;
                if (!((Boolean)this.akk.wD()).booleanValue()) {
                    bl2 = true;
                }
                this.d(bu.class);
                if (bu.bO() != null && vn.aER.bgK.gX > ((tn)this.wy()).Ms && vn.aER.bgK.gX + aii.predictedMotion(vn.aER.bgK.ue, 2) < ((tn)this.wy()).Ms + 1.0 && (!this.akd || akf) && a.a.g().c(mh.class).isEnabled() && !((akg)this.e(tn.class).agx.wD()).getName().equals("Auto Jump")) break block16;
                this.d(bu.class);
                if (bu.bO() == null || !(vn.aER.bgK.gX > ((tn)this.wy()).Ms) || !(vn.aER.bgK.gX + aii.predictedMotion(vn.aER.bgK.ue, 2) < ((tn)this.wy()).Ms + 1.0) || !((akg)this.e(tn.class).agx.wD()).getName().equals("Auto Jump")) break block17;
            }
            this.d(bu.class);
            bu.setSlot(ain.vM());
        }
        if (a.a.g().c(mh.class).isEnabled()) {
            bl2 = false;
        }
        if (this.akd) {
            bl2 = true;
        }
        if (vn.aER.bgK.tR > 8) {
            this.akd = false;
        }
        if ((aik.ad(2.0) || aik.ad(1.0) || aik.ad(0.0) || aik.ad(3.0) || vn.aER.aIY.chq.Rg() || vn.aER.bgK.a(net.minecraft.potion.a.dgw) || this.gD) && vn.aER.bgK.crx < 1) {
            vn.aER.bgK.crP = false;
        }
        if (vn.aER.aIY.chq.Rg() && vn.aER.bgK.aO && !this.gD && (akg || ((akg)this.e(tn.class).agx.wD()).getName().equals("Auto Jump")) && !a.a.g().c(mh.class).isEnabled()) {
            akg = false;
            aii.strafe(aii.vs() * 0.9);
            if (((akg)this.e(tn.class).agx.wD()).getName().equals("Auto Jump")) {
                aii.strafe(aii.getAllowedHorizontalDistance() - 0.001);
            }
        }
        if (vn.aER.bgK.tR == 4 && !vn.aER.aIY.chq.Re() && !a.a.g().c(mh.class).isEnabled() && !bl2 && ((akg)this.e(tn.class).agx.wD()).getName().equals("Auto Jump")) {
            vn.aER.bgK.ue -= 0.19;
        }
        if (vn.aER.bgK.tR == 1 && !vn.aER.aIY.chq.Re()) {
            aii.strafe();
        }
        if (aik.p(0.0, vn.aER.bgK.ue, 0.0) != Blocks.cLc && vn.aER.bgK.tR > 2) {
            aii.strafe();
        }
        if (bl2 && !vn.aER.aIY.chq.Re() && !vn.aER.bgK.aO && !this.e(mh.class).isEnabled() && ((Boolean)this.akk.wD()).booleanValue() || !bl2 || vn.aER.aIY.chq.Re() || vn.aER.bgK.aO || ((Boolean)this.akk.wD()).booleanValue()) {
            // empty if block
        }
        if (bl2 && vn.aER.bgK.aO && !vn.aER.aIY.chq.Re()) {
            ++this.akj;
        }
        if (!bl2) {
            this.akj = 0;
        }
    };
    @dm
    public final dk<fh> ako = fh2 -> {
        if (fh2.dq() instanceof an) {
            akh = true;
            ++this.aka;
        }
    };
    @dm
    public final dk<eo> akp = eo2 -> {
        if (!((akg)this.e(tn.class).agx.wD()).getName().equals("Auto Jump") && vn.aER.bgK.aO && this.akd && akf && !a.a.g().c(mh.class).isEnabled() && !vn.aER.aIY.chq.Re()) {
            akf = false;
        }
    };

    public vn(String string, tn tn2) {
        super(string, tn2);
        this.akl = new vr(tn2);
    }

    @Override
    public void onEnable() {
        akh = false;
        aki = false;
        if (!((akg)this.e(tn.class).agx.wD()).getName().equals("Auto Jump")) {
            if (vn.aER.bgK.crx > 9) {
                akf = true;
                this.akd = true;
            }
        } else {
            vn.aER.bgK.crP = false;
        }
        akg = true;
        this.gD = false;
        if (!vn.aER.bgK.aO && !vn.aER.aIY.chq.Re()) {
            vn.aER.bgK.ud *= 0.0;
            vn.aER.bgK.uf *= 0.0;
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
        vn.aER.bgK.crP = false;
        akf = false;
        this.akd = false;
        if (vn.aER.bgK.Zz < 20) {
            // empty if block
        }
        boolean bl3 = bl2 = Math.abs((f3 = bt.bN(f2 = vn.aER.bgK.pl)) % 90.0f) <= 10.0f || Math.abs(f3 % 90.0f) >= 80.0f;
        if (bl2) {
            if (vn.aER.bgK.crx > 2 && vn.aER.bgK.aRg % 3 == 1) {
                vn.aER.bgC.dAp = 0.5f;
                ahn.m(new e(vn.aER.bgK.aO));
            } else if (vn.aER.bgK.crx > 2 && vn.aER.bgK.aRg % 3 == 2) {
                vn.aER.bgC.dAp = 0.33f;
                ahn.m(new e(vn.aER.bgK.aO));
                ahn.m(new e(vn.aER.bgK.aO));
            } else if (vn.aER.bgK.crx > 2) {
                vn.aER.bgC.dAp = 0.5f;
                ahn.m(new e(vn.aER.bgK.aO));
            }
        } else if (vn.aER.bgK.crx > 2) {
            vn.aER.bgC.dAp = 0.33f;
            ahn.m(new e(vn.aER.bgK.aO));
            ahn.m(new e(vn.aER.bgK.aO));
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

