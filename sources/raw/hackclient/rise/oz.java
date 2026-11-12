/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.lz;
import net.minecraft.init.Items;
import net.minecraft.item.az;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.server.t;
import rip.vantage.commons.util.time.a;

public class oz
extends akg<lz> {
    public final aki MO = new aki("Boost", (akg<?>)this, (Boolean)true);
    private int qI = -1;
    private int hV = -1;
    private boolean Jb;
    public static boolean Jc;
    private boolean Jd;
    private int Je;
    private boolean Jf;
    private boolean MH;
    a bN = new a();
    @dm
    public final dk<fi> MP = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof k && ((k)fi2.dq()).ls() != null && ((k)fi2.dq()).ls().bP() instanceof az) {
            this.Jf = true;
            if (oz.aER.bgK.aO) {
                oz.aER.bgK.jump();
            }
        }
    };
    @dm
    public final dk<fh> MQ = fh2 -> {
        if (oz.aER.bgK == null || oz.aER.bgF == null) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t) {
            if (((t)fh2.dq()).getEntityID() != oz.aER.bgK.getEntityId()) {
                return;
            }
            if (this.Jf) {
                this.hV = 0;
                this.Jb = true;
                this.Jf = false;
                Jc = true;
            }
        }
    };
    @dm(cH=0)
    public final dk<ei> MR = ei2 -> {
        if (oz.aER.bgK == null || oz.aER.bgF == null) {
            return;
        }
        if (oz.aER.bgK.cus == 10) {
            oz.aER.bgK.ue = 1.1f;
        }
        if (oz.aER.bgK.ae <= 80 && oz.aER.bgK.ae >= 1 && (oz.aER.bgK.ae % 1 == 0 || oz.aER.bgK.ae <= 15)) {
            oz.aER.bgK.ue += (double)0.028f;
        }
        if (oz.aER.bgK.ae == 28) {
            if (((Boolean)this.MO.wD()).booleanValue()) {
                // empty if block
            }
            oz.aER.bgK.ue = 0.16f;
        }
        if (oz.aER.bgK.ae == 33) {
            oz.aER.bgK.ue = -0.082f;
        }
        if (oz.aER.bgK.ae == 27) {
            // empty if block
        }
        if (oz.aER.bgK.ae == 22) {
            // empty if block
        }
        if (oz.aER.bgK.ae >= 35 && oz.aER.bgK.ae <= 50) {
            aii.strafe();
        }
        if (oz.aER.bgK.ae >= 3 && oz.aER.bgK.ae <= 50) {
            aii.strafe();
        }
        if (this.Je == 0) {
            ei2.setYaw(oz.aER.bgK.pl - 180.0f);
            ei2.setPitch(89.0f);
            int n2 = this.hx();
            if (n2 != -1 && n2 != oz.aER.bgK.cHV.cJE) {
                this.qI = oz.aER.bgK.cHV.cJE;
                if (oz.aER.bgK.crx > 1) {
                    oz.aER.bgK.cHV.cJE = n2;
                }
            }
        }
        if (this.Je == 1) {
            if (!this.Jd) {
                ahn.m(new k(oz.aER.bgK.Vk()));
                this.Jd = true;
            }
        } else if (this.Je == 2 && this.qI != -1) {
            oz.aER.bgK.cHV.cJE = this.qI;
            this.qI = -1;
        }
        if (this.hV > 1) {
            this.toggle();
            return;
        }
        if (this.Jb) {
            Jc = true;
            this.hy();
            ++this.hV;
        }
        if (this.Je < 3) {
            ++this.Je;
        }
        if (this.Jb) {
            if (this.hV > 1) {
                this.Jb = false;
                Jc = false;
                this.hV = 0;
                return;
            }
            Jc = true;
            ++this.hV;
            this.hy();
        }
    };
    @dm
    public final dk<eo> MS = eo2 -> {
        if (oz.aER.bgK.ae <= 70 && oz.aER.bgK.ae >= 1 && (oz.aER.bgK.ae % 1 == 0 || oz.aER.bgK.ae <= 15)) {
            oz.aER.bgK.ud *= 1.0003;
            oz.aER.bgK.uf *= 1.0003;
        }
        if (oz.aER.bgK.cus == 10) {
            // empty if block
        }
        if (oz.aER.bgK.ae == 1) {
            oz.aER.bgK.ud *= 1.15;
            oz.aER.bgK.uf *= 1.15;
            oz.aER.bgK.ue = 1.33;
        }
        if (oz.aER.bgK.ae == 15) {
            oz.aER.bgK.ue = 0.39;
        }
        if (oz.aER.bgK.ae == 22) {
            oz.aER.bgK.ue = 0.05;
        }
        if (oz.aER.bgK.ae == 23) {
            oz.aER.bgK.ue = 0.005;
        }
        if (oz.aER.bgK.ae == 24) {
            oz.aER.bgK.ue += 0.01;
            afl.c(oz.aER.bgK.ue, new Object[0]);
        }
        if (oz.aER.bgK.ae == 25) {
            oz.aER.bgK.ue += 0.015;
            afl.c(oz.aER.bgK.ue, new Object[0]);
        }
        if (oz.aER.bgK.ae == 26) {
            oz.aER.bgK.ue += 0.015;
            afl.c(oz.aER.bgK.ue, new Object[0]);
        }
        if (oz.aER.bgK.ae == 33) {
            oz.aER.bgK.ue += 0.015;
        }
        if (oz.aER.bgK.ae == 35) {
            oz.aER.bgK.ue += 0.015;
            afl.c(oz.aER.bgK.ue, new Object[0]);
        }
        if (oz.aER.bgK.ae == 38) {
            oz.aER.bgK.ue += 0.03;
            afl.c(oz.aER.bgK.ue, new Object[0]);
        }
        if (oz.aER.bgK.cus == 8) {
            oz.aER.bgK.ud *= 1.02;
            oz.aER.bgK.uf *= 1.02;
        }
        if (oz.aER.bgK.cus == 7) {
            oz.aER.bgK.ud *= 1.0004;
            oz.aER.bgK.uf *= 1.0004;
        }
        if (oz.aER.bgK.cus == 6) {
            oz.aER.bgK.ud *= 1.0004;
            oz.aER.bgK.uf *= 1.0004;
        }
        if (oz.aER.bgK.cus == 5) {
            oz.aER.bgK.ud *= 1.0004;
            oz.aER.bgK.uf *= 1.0004;
        }
        if (oz.aER.bgK.cus <= 4 && oz.aER.bgK.cus != 0) {
            oz.aER.bgK.ud *= 1.0004;
            oz.aER.bgK.uf *= 1.0004;
        }
    };

    public oz(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onDisable() {
        if (oz.aER.bgK.aO) {
            aii.stop();
        }
        if (this.qI != -1) {
            oz.aER.bgK.cHV.cJE = this.qI;
        }
        this.qI = -1;
        this.hV = -1;
        this.Jd = false;
        Jc = false;
        this.Jb = false;
        this.Je = 0;
    }

    @Override
    public void onEnable() {
        if (this.hx() == -1) {
            afl.b("Could not find Fireball", new Object[0]);
            this.toggle();
            return;
        }
        Jc = true;
        this.Je = 0;
    }

    private void hy() {
        aii.strafe(1.768f);
    }

    private int hx() {
        int n2 = -1;
        for (int i2 = 0; i2 < 9; ++i2) {
            co co2 = oz.aER.bgK.cHV.fi(i2);
            if (co2 == null || co2.bP() != Items.cRP) continue;
            n2 = i2;
            break;
        }
        return n2;
    }
}

