/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.agf;
import hackclient.rise.ahf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.xi;
import hackclient.rise.zf;
import java.awt.Color;
import net.minecraft.util.cm;

public class zd
extends akg<xi> {
    private agf ky;
    private final cm atL = new cm("rise/logo/wurst.png");
    @dm
    public final dk<fs> atM = fs2 -> {
        if (aER == null || zd.aER.aIY.bJS || zd.aER.bgF == null || zd.aER.bgK == null) {
            return;
        }
        ((xi)this.wy()).n(this.ky.tF() + 1.0f);
        ((xi)this.wy()).a(this.ky);
        ((xi)this.wy()).o(4.0f);
        for (zf zf2 : ((xi)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            double d2 = zf2.nH().getX();
            double d3 = zf2.nH().getY();
            Color color = Color.WHITE;
            this.ky.b(zf2.nN(), d2, d3, color.getRGB());
        }
        ait.d(0.0, 10.0, 185.0, 12.0, ais.d(Color.WHITE, 100));
        ait.a(this.atL, 2.0, 5.5, 89.17646789550781, 22.58823585510254);
        this.ky.a("v6 MC 1.8.9", 95.0, 14.0, Color.BLACK.getRGB());
    };
    @dm
    public final dk<fe> atN = fe2 -> aNC.execute(() -> {
        for (zf zf2 : ((xi)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            String string = zf2.nN();
            zf2.t(this.ky.bQ(string));
            zf2.u(0.0f);
            zf2.an("");
        }
    });

    public zd(String string, xi xi2) {
        super(string, xi2);
        this.ky = a.a.d() == ahf.aNJ ? gb.ks.a(18, gd.kG) : zd.aER.fontRendererObj;
    }
}

