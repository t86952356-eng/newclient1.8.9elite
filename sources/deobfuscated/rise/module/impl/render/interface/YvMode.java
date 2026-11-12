/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.interface;

import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.agg;
import hackclient.rise.ait;
import hackclient.rise.akr;
import hackclient.rise.bl;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.yw;
import hackclient.rise.yx;
import hackclient.rise.zf;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.client.Minecraft;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.render.Interface;
import rise.util.Language;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;
import rise.value.ModeValue;

public class YvMode
extends Mode<Interface> {
    private final ModeValue atb = new yw(this, "ArrayList Color Mode", this);
    private final ModeValue atc = new yx(this, "ArrayList Alignment", this);
    private final BooleanValue atd = new BooleanValue("Arraylist Side Bar", (Mode<?>)this, (Boolean)false);
    private final BooleanValue ate = new BooleanValue("Arraylist Background", (Mode<?>)this, (Boolean)false);
    private final BooleanValue atf = new BooleanValue("Show Fps", (Mode<?>)this, (Boolean)false);
    private final BooleanValue atg = new BooleanValue("Show Time", (Mode<?>)this, (Boolean)false);
    private final BooleanValue ath = new BooleanValue("Show Ping", (Mode<?>)this, (Boolean)false);
    private final BooleanValue ati = new BooleanValue("Show Coordinates", (Mode<?>)this, (Boolean)true);
    private final akr atj = new akr("Custom Client Name", (Mode<?>)this, "Rise");
    @EventLink
    public final Listener<Render2DEvent> atk = render2DEvent -> {
        if (aER == null || YvMode.aER.aIY.bJS || YvMode.aER.bgF == null || YvMode.aER.bgK == null) {
            return;
        }
        agg agg2 = Client.a.d() == Language.aNJ ? gb.ks.a(18, gd.kG) : YvMode.aER.fontRendererObj;
        int n2 = 0;
        Color[] colorArray = new Color[]{new Color(91, 206, 250), new Color(245, 169, 184), Color.WHITE, new Color(245, 169, 184)};
        int n3 = 0;
        ((Interface)this.wy()).n(((agf)agg2).tF() + 2.0f);
        ((Interface)this.wy()).a(agg2);
        ((Interface)this.wy()).o(3.0f);
        double d2 = YvMode.aER.jY.getScaledHeight() - 10;
        String string = String.valueOf(Math.round(YvMode.aER.bgK.gW));
        String string2 = String.valueOf(Math.round(YvMode.aER.bgK.gX));
        String string3 = String.valueOf(Math.round(YvMode.aER.bgK.gY));
        for (zf zf2 : ((Interface)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            boolean bl2 = !zf2.getTag().isEmpty() && (Boolean)((Interface)this.wy()).aoI.wD() != false;
            double d3 = zf2.nH().getX();
            double d4 = zf2.nH().getY();
            if (((Mode)this.atc.wD()).getName().equals("Left")) {
                d4 = zf2.nH().getY() + (double)((agf)agg2).tF() + 2.0;
                d3 = (Boolean)this.atd.wD() != false ? (double)(3.0f + zf2.atQ - 8.0f) : (double)(3.0f + zf2.atQ - 10.0f);
            }
            Color color = zf2.nM();
            Color color2 = this.rP().rQ();
            switch (((Mode)this.atb.wD()).getName()) {
                case "Fade": {
                    color2 = this.rP().j(new Vector2d(0.0, zf2.nH().getY()));
                    break;
                }
                case "Rainbow": {
                    color2 = new Color(YvMode.R(500 * n2 / 6));
                    break;
                }
                case "Trans": {
                    color = colorArray[n3];
                }
            }
            if (((Boolean)this.ate.wD()).booleanValue()) {
                ait.d(d3 - 2.0, d4 - 2.0, zf2.atS + zf2.atT + 4.0f, ((Interface)this.wy()).aoZ, ady.sa());
            }
            if (((Boolean)this.atd.wD()).booleanValue()) {
                if (((Mode)this.atc.wD()).getName().equals("Left")) {
                    ait.d(d3 - (double)((Boolean)this.ate.wD() != false ? 2 : 3), d4 - 2.0, 1.0, ((Interface)this.wy()).aoZ, color2);
                } else {
                    ait.d(d3 + (double)(zf2.atS + zf2.atT) + 2.0, d4 - 2.0, 1.0, ((Interface)this.wy()).aoZ, color2);
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
        int n4 = ((Mode)this.atb.wD()).getName().equals("Rainbow") ? YvMode.R(1000) : this.rP().rQ().getRGB();
        ((agf)agg2).b(this.nD(), 3.0, 3.0, n4);
        if (((Boolean)this.ati.wD()).booleanValue()) {
            ((agf)agg2).b("X:\u00a77 " + string, 3.0, d2 - (double)(YvMode.aER.fontRendererObj.tF() * 2.0f), n4);
            ((agf)agg2).b("Y:\u00a77 " + string2, 3.0, d2 - (double)YvMode.aER.fontRendererObj.tF(), n4);
            ((agf)agg2).b("Z:\u00a77 " + string3, 3.0, d2, n4);
        }
    };
    @EventLink
    public final Listener<TickEvent> atl = tickEvent -> aNC.execute(() -> {
        for (zf zf2 : ((Interface)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            agg agg2 = Client.a.d() == Language.aNJ ? gb.ks.a(18, gd.kG) : YvMode.aER.fontRendererObj;
            zf2.y(!zf2.getTag().isEmpty() && (Boolean)((Interface)this.wy()).aoI.wD() != false);
            String string = ((Boolean)((Interface)this.wy()).aoJ.wD() != false ? zf2.nN().toLowerCase() : zf2.nN()).replace((Boolean)((Interface)this.wy()).lY().wD() != false ? " " : "", "");
            String string2 = ((Boolean)((Interface)this.wy()).aoJ.wD() != false ? zf2.getTag().toLowerCase() : zf2.getTag()).replace((Boolean)((Interface)this.wy()).lY().wD() != false ? " " : "", "");
            zf2.t(((agf)agg2).bQ(string));
            zf2.u(zf2.nQ() ? (float)(((agf)agg2).bQ(string2) + 3) : 0.0f);
            zf2.ap(string);
            zf2.aq(string2);
        }
    });

    public YvMode(String string, Interface interface_) {
        super(string, interface_);
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
                string2 = string2 + " [\u00a7f" + Minecraft.BI() + " FPS\u00a77]";
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

