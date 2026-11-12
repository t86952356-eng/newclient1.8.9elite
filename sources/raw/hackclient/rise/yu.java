/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.agf;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.xi;
import hackclient.rise.zf;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;

public final class yu
extends akg<xi> {
    private final aki asV = new aki("Font", (akg<?>)this, (Boolean)true);
    private static final agf asW = gb.kt.dM();
    private static final double asX = asW.tF() + 2.0f;
    private static final int asY = 1;
    @dm
    public final dk<fs> asZ = fs2 -> {
        List<zf> list = ((xi)this.wy()).mc();
        for (zf zf2 : list) {
            float f2 = (Boolean)this.asV.wD() != false ? 11.0f : 10.0f;
            ((xi)this.wy()).n(yu.aER.fontRendererObj.tF() + 3.0f);
            if (((xi)this.wy()).aoZ != f2) {
                // empty if block
            }
            ((xi)this.wy()).o(3.0f);
            double d2 = zf2.nH().getX() - 1.0 - 2.0;
            double d3 = zf2.nH().getY() + 1.0;
            double d4 = zf2.atS + zf2.atT + 2.0f + 3.0f;
            this.b(gg.kU).c(() -> ait.d(d2 - 1.0, d3 - 2.0, d4, asX + 1.0, new Color(0, 0, 0, 255)));
            this.b(gg.kT).c(() -> ait.d(d2 - 1.0, d3 - 2.0, d4, asX + 1.0, new Color(0, 0, 0, 255)));
            this.b(gg.kV, 1).c(() -> {
                ait.d(d2 - 1.0, d3 - 2.0, d4, asX + 1.0, new Color(0, 0, 0, 110));
                ait.d(d2 + (double)zf2.atS + (double)zf2.atT + 4.0, d3 - 2.0, 1.0, asX + 1.0, this.rP().j(new aka(zf2.nH().getX(), zf2.nH().getY() / 1.5)));
                this.a(zf2, d2 + 1.0, d3, this.rP().j(new aka(zf2.nH().getX(), zf2.nH().getY() / 1.5)).getRGB());
            });
        }
        this.b(gg.kV).c(() -> {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            String string = simpleDateFormat.format(date);
            String string2 = a.b + " Client | 6.9.9 | " + yu.aER.bgK.xU() + " | " + string;
            ait.c(2.0, 3.0, (double)(((Boolean)this.asV.wD() != false ? 0 : 8) + this.nC().bQ(string2)), 15.0, 4.0, new Color(0, 0, 0, 100));
            GlStateManager.JX();
            int n2 = 0;
            for (int i2 = 0; i2 < string2.length(); ++i2) {
                char c2 = string2.charAt(i2);
                this.nC().b(String.valueOf(c2), 6 + n2, 8.0, this.rP().j(new aka(i2, i2)).getRGB());
                n2 += this.nC().bQ(String.valueOf(c2));
            }
        });
        this.b(gg.kU).c(() -> {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            String string = simpleDateFormat.format(date);
            String string2 = a.b + " Client | 6.9.9 | " + yu.aER.bgK.xU() + " | " + string;
            ait.c(2.0, 3.0, (double)(((Boolean)this.asV.wD() != false ? 0 : 8) + this.nC().bQ(string2)), 15.0, 4.0, new Color(0, 0, 0, 255));
        });
        this.b(gg.kT).c(() -> {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            String string = simpleDateFormat.format(date);
            String string2 = a.b + " Client | 6.9.9 | " + yu.aER.bgK.xU() + " | " + string;
            ait.c(2.0, 3.0, (double)(((Boolean)this.asV.wD() != false ? 0 : 8) + this.nC().bQ(string2) - 1), 15.0, 5.0, new Color(0, 0, 0, 255));
        });
    };
    @dm
    public final dk<fe> ata = fe2 -> {
        for (zf zf2 : ((xi)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            zf2.y(!zf2.getTag().isEmpty() && (Boolean)((xi)this.wy()).aoI.wD() != false);
            String string = ((Boolean)((xi)this.wy()).aoJ.wD() != false ? zf2.nN().toLowerCase() : zf2.nN()).replace((Boolean)((xi)this.wy()).lY().wD() != false ? " " : "", "");
            String string2 = ((Boolean)((xi)this.wy()).aoJ.wD() != false ? zf2.getTag().toLowerCase() : zf2.getTag()).replace((Boolean)((xi)this.wy()).lY().wD() != false ? " " : "", "");
            zf2.t(this.nC().bQ(string));
            zf2.u(zf2.nQ() ? (float)(this.nC().bQ(string2) + 1 + 3) : 1.0f);
            zf2.ap(string);
            zf2.aq(string2);
        }
    };

    public yu(String string, xi xi2) {
        super(string, xi2);
    }

    private agf nC() {
        return (Boolean)this.asV.wD() != false ? gb.ks.a(24, gd.kG) : gb.kt.dM();
    }

    private void a(zf zf2, double d2, double d3, int n2) {
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        this.nC().b(zf2.getDisplayName(), d2, d3, n2);
        if (zf2.nQ()) {
            this.nC().b(zf2.nP(), d2 + (double)zf2.nK() + 1.0 + 3.0, d3, -3355444);
        }
        GlStateManager.tR();
    }
}

