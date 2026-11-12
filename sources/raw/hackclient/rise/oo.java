/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.lz;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.k;

public class oo
extends akg<lz> {
    public akp lI = new akp("Mode", this).a(new akg[]{new aks("Custom")}).a(new akg[]{new aks("Hypixel")}).co("Hypixel");
    private final akq Lh = new akq("Height", this, (Number)1, (Number)0.42, (Number)9, (Number)0.1, () -> !((akg)this.lI.wD()).getName().equals("Custom"));
    private final akq Li = new akq("Speed", this, (Number)1, (Number)0.1, (Number)3, (Number)0.1, () -> !((akg)this.lI.wD()).getName().equals("Custom"));
    private int hQ;
    private double xv = 0.0;
    private float Lj;
    @dm
    public final dk<ej> Lk = ej2 -> {
        switch (((akg)this.lI.wD()).getName()) {
            case "Hypixel": {
                if (oo.aER.bgK.cus == 10) {
                    this.Lj = oo.aER.bgK.pl;
                    oo.aER.bgK.ue = 1.5;
                    this.xv = 1.4;
                }
                if (oo.aER.bgK.cus == 9) {
                    this.xv = 2.0 - Math.random() / 100.0;
                }
                if (oo.aER.bgK.ae > 11) break;
                aii.a(this.xv, this.Lj);
                this.xv -= this.xv / 249.9 + Math.random() / 100.0;
                break;
            }
            case "Custom": {
                if (oo.aER.bgK.ae > 1) break;
                oo.aER.bgK.ue = ((Number)this.Lh.wD()).doubleValue();
                aii.strafe(((Number)this.Li.wD()).doubleValue());
            }
        }
        int n2 = ain.e(Items.cRP);
        if (oo.aER.bgK.crx == 1) {
            aii.stop();
        }
        if (n2 == -1) {
            return;
        }
        ++this.hQ;
        this.d(bu.class);
        bu.setSlot(n2);
        if (this.hQ == 2) {
            this.d(bu.class);
            ahn.m(new k(bu.bO()));
        }
        bs.a(new akb(oo.aER.bgK.pl, 90.0f), 10.0, cb.gG);
    };

    public oo(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onEnable() {
        this.hQ = 0;
        if (((akg)this.lI.wD()).getName().equals("Hypixel")) {
            afl.b("Don't enable on bridges, the ac falses, also make sure you take the velocity when on the ground.", new Object[0]);
        }
    }
}

