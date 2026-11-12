/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.agg;
import hackclient.rise.ahf;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akr;
import hackclient.rise.bl;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.xi;
import hackclient.rise.yw;
import hackclient.rise.yx;
import hackclient.rise.zf;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.client.d;

public class yv
extends akg<xi> {
    private final akp atb = new yw(this, "ArrayList Color Mode", this);
    private final akp atc = new yx(this, "ArrayList Alignment", this);
    private final aki atd = new aki("Arraylist Side Bar", (akg<?>)this, (Boolean)false);
    private final aki ate = new aki("Arraylist Background", (akg<?>)this, (Boolean)false);
    private final aki atf = new aki("Show Fps", (akg<?>)this, (Boolean)false);
    private final aki atg = new aki("Show Time", (akg<?>)this, (Boolean)false);
    private final aki ath = new aki("Show Ping", (akg<?>)this, (Boolean)false);
    private final aki ati = new aki("Show Coordinates", (akg<?>)this, (Boolean)true);
    private final akr atj = new akr("Custom Client Name", (akg<?>)this, "Rise");
    @dm
    public final dk<fs> atk = fs2 -> {
        if (aER == null || yv.aER.aIY.bJS || yv.aER.bgF == null || yv.aER.bgK == null) {
            return;
        }
        agg agg2 = a.a.d() == ahf.aNJ ? gb.ks.a(18, gd.kG) : yv.aER.fontRendererObj;
        int n2 = 0;
        Color[] colorArray = new Color[]{new Color(91, 206, 250), new Color(245, 169, 184), Color.WHITE, new Color(245, 169, 184)};
        int n3 = 0;
        ((xi)this.wy()).n(((agf)agg2).tF() + 2.0f);
        ((xi)this.wy()).a(agg2);
        ((xi)this.wy()).o(3.0f);
        double d2 = yv.aER.jY.getScaledHeight() - 10;
        String string = String.valueOf(Math.round(yv.aER.bgK.gW));
        String string2 = String.valueOf(Math.round(yv.aER.bgK.gX));
        String string3 = String.valueOf(Math.round(yv.aER.bgK.gY));
        for (zf zf2 : ((xi)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            boolean bl2 = !zf2.getTag().isEmpty() && (Boolean)((xi)this.wy()).aoI.wD() != false;
            double d3 = zf2.nH().getX();
            double d4 = zf2.nH().getY();
            if (((akg)this.atc.wD()).getName().equals("Left")) {
                d4 = zf2.nH().getY() + (double)((agf)agg2).tF() + 2.0;
                d3 = (Boolean)this.atd.wD() != false ? (double)(3.0f + zf2.atQ - 8.0f) : (double)(3.0f + zf2.atQ - 10.0f);
            }
            Color color = zf2.nM();
            Color color2 = this.rP().rQ();
            switch (((akg)this.atb.wD()).getName()) {
                case "Fade": {
                    color2 = this.rP().j(new aka(0.0, zf2.nH().getY()));
                    break;
                }
                case "Rainbow": {
                    color2 = new Color(yv.R(500 * n2 / 6));
                    break;
                }
                case "Trans": {
                    color = colorArray[n3];
                }
            }
            if (((Boolean)this.ate.wD()).booleanValue()) {
                ait.d(d3 - 2.0, d4 - 2.0, zf2.atS + zf2.atT + 4.0f, ((xi)this.wy()).aoZ, ady.sa());
            }
            if (((Boolean)this.atd.wD()).booleanValue()) {
                if (((akg)this.atc.wD()).getName().equals("Left")) {
                    ait.d(d3 - (double)((Boolean)this.ate.wD() != false ? 2 : 3), d4 - 2.0, 1.0, ((xi)this.wy()).aoZ, color2);
                } else {
                    ait.d(d3 + (double)(zf2.atS + zf2.atT) + 2.0, d4 - 2.0, 1.0, ((xi)this.wy()).aoZ, color2);
                }
            }
            ((agf)agg2).b(zf2.getDisplayName(), d3, d4, color.getRGB());
            ++n2;
            n3 = (n3 + 1) % colorArray.length;
            if (bl2) {
                ((agf)agg2).b(zf2.nP(), d3 + (double)zf2.nK() + 3.0, d4, -3355444);
            }
            zf2.b(color2);
        }
        int n4 = ((akg)this.atb.wD()).getName().equals("Rainbow") ? yv.R(1000) : this.rP().rQ().getRGB();
        ((agf)agg2).b(this.nD(), 3.0, 3.0, n4);
        if (((Boolean)this.ati.wD()).booleanValue()) {
            ((agf)agg2).b("X:\u00a77 " + string, 3.0, d2 - (double)(yv.aER.fontRendererObj.tF() * 2.0f), n4);
            ((agf)agg2).b("Y:\u00a77 " + string2, 3.0, d2 - (double)yv.aER.fontRendererObj.tF(), n4);
            ((agf)agg2).b("Z:\u00a77 " + string3, 3.0, d2, n4);
        }
    };
    @dm
    public final dk<fe> atl = fe2 -> aNC.execute(() -> {
        for (zf zf2 : ((xi)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            agg agg2 = a.a.d() == ahf.aNJ ? gb.ks.a(18, gd.kG) : yv.aER.fontRendererObj;
            zf2.y(!zf2.getTag().isEmpty() && (Boolean)((xi)this.wy()).aoI.wD() != false);
            String string = ((Boolean)((xi)this.wy()).aoJ.wD() != false ? zf2.nN().toLowerCase() : zf2.nN()).replace((Boolean)((xi)this.wy()).lY().wD() != false ? " " : "", "");
            String string2 = ((Boolean)((xi)this.wy()).aoJ.wD() != false ? zf2.getTag().toLowerCase() : zf2.getTag()).replace((Boolean)((xi)this.wy()).lY().wD() != false ? " " : "", "");
            zf2.t(((agf)agg2).bQ(string));
            zf2.u(zf2.nQ() ? (float)(((agf)agg2).bQ(string2) + 3) : 0.0f);
            zf2.ap(string);
            zf2.aq(string2);
        }
    });

    public yv(String string, xi xi2) {
        super(string, xi2);
    }

    private static int R(int n2) {
        double d2 = Math.ceil((double)(System.currentTimeMillis() + (long)n2) / 10.0);
        return Color.getHSBColor((float)((d2 %= 360.0) / 360.0), 0.6f, 1.0f).getRGB();
    }

    private String nD() {
        if (!((String)this.atj.wD()).isEmpty()) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a");
            String string = simpleDateFormat.format(date);
            String string2 = ((String)this.atj.wD()).charAt(0) + "\u00a77" + ((String)this.atj.wD()).substring(1);
            if (((Boolean)this.atg.wD()).booleanValue()) {
                string2 = string2 + " [\u00a7f" + string + "\u00a77]";
            }
            if (((Boolean)this.atf.wD()).booleanValue()) {
                string2 = string2 + " [\u00a7f" + d.BI() + " FPS\u00a77]";
            }
            if (((Boolean)this.ath.wD()).booleanValue()) {
                string2 = string2 + " [\u00a7f" + bl.getPing() + "ms\u00a77]";
            }
            return string2;
        }
        this.atj.n("Rise");
        return null;
    }
}

