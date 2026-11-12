/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fe;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.md;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;

public class pp
extends akg<md> {
    private final List<aj<?>> Oi = new ArrayList();
    private final akp Oj = new akp("Release Mode", this).a(new akg[]{new aks("Simple")}).a(new akg[]{new aks("Double")}).a(new akg[]{new aks("Desync")}).a(new akg[]{new aks("None")}).co("Simple");
    private final akq Ok = new akq("Semi Packets", this, (Number)2, (Number)1, (Number)15, (Number)1);
    private boolean Ol;
    private boolean Om;
    @dm
    public final dk<fi> On = fi2 -> {
        if (pp.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof e) {
            this.Oi.add(aj2);
            fi2.cF();
        }
    };
    @dm
    public final dk<fe> Oo = fe2 -> {
        if (pp.aER.bgK == null || pp.aER.bgF == null) {
            return;
        }
        boolean bl2 = aik.vz();
        if (!this.Ol && bl2) {
            double d2 = pp.aER.bgK.gW;
            double d3 = pp.aER.bgK.gX;
            double d4 = pp.aER.bgK.gY;
            float f2 = pp.aER.bgK.pl;
            float f3 = pp.aER.bgK.pm;
            boolean bl3 = pp.aER.bgK.aO;
            for (int i2 = 0; i2 < ((Number)this.Ok.wD()).intValue(); ++i2) {
                ahn.n(new h(d2, d3, d4, f2, f3, bl3));
            }
            this.Ol = true;
            return;
        }
        if (this.Ol && !bl2) {
            this.Om = true;
            this.toggle();
        }
    };
    @dm
    public final dk<ei> Op = ei2 -> {};
    @dm
    public final dk<fh> Oq = fh2 -> {
        if (fh2.dq() instanceof i) {
            // empty if block
        }
    };

    public pp(String string, md md2) {
        super(string, md2);
    }

    @Override
    public void onEnable() {
        this.Oi.clear();
        this.Ol = false;
        this.Om = false;
    }

    @Override
    public void onDisable() {
        if (!this.Om && this.Ol) {
            if (!((akg)this.Oj.wD()).getName().equals("None")) {
                this.A(((akg)this.Oj.wD()).getName());
            } else {
                ahn.n(new h(pp.aER.bgK.gW, pp.aER.bgK.gX, pp.aER.bgK.gY, pp.aER.bgK.pl, pp.aER.bgK.pm, pp.aER.bgK.aO));
            }
        }
        if (pp.aER.bgK != null && !this.Oi.isEmpty()) {
            this.Oi.forEach(ahn::n);
            this.Oi.clear();
        }
    }

    private void A(String string) {
        double d2 = pp.aER.bgK.gW;
        double d3 = pp.aER.bgK.gX;
        double d4 = pp.aER.bgK.gY;
        float f2 = pp.aER.bgK.pl;
        float f3 = pp.aER.bgK.pm;
        switch (string.toLowerCase()) {
            case "simple": {
                ahn.n(new h(d2 - 5000.0, d3, d4 - 5000.0, f2, f3, false));
                ahn.n(new h(d2, d3, d4, f2, f3, pp.aER.bgK.aO));
                break;
            }
            case "double": {
                ahn.n(new h(d2 - 5000.0, d3, d4 - 5000.0, f2, f3, false));
                ahn.n(new h(d2 + 5000.0, d3, d4 + 5000.0, f2, f3, false));
                ahn.n(new h(d2, d3, d4, f2, f3, pp.aER.bgK.aO));
                break;
            }
            case "desync": {
                ahn.n(new h(d2, d3 + 0.0625, d4, f2, f3, false));
                ahn.n(new h(d2, d3, d4, f2, f3, false));
                ahn.n(new h(d2, d3 + 0.03125, d4, f2, f3, true));
                ahn.n(new h(d2, d3, d4, f2, f3, pp.aER.bgK.aO));
                break;
            }
        }
    }
}

