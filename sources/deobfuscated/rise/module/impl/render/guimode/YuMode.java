/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.guimode;

import hackclient.rise.agf;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.zf;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.render.Interface;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;

public final class YuMode
extends Mode<Interface> {
    private final BooleanValue asV = new BooleanValue("Font", (Mode<?>)this, (Boolean)true);
    private static final agf asW = gb.kt.dM();
    private static final double asX = asW.tF() + 2.0f;
    private static final int asY = 1;
    @EventLink
    public final Listener<Render2DEvent> asZ = render2DEvent -> {
        List<zf> list = ((Interface)this.wy()).mc();
        for (zf zf2 : list) {
            float f2 = (Boolean)this.asV.wD() != false ? 11.0f : 10.0f;
            ((Interface)this.wy()).n(YuMode.aER.fontRendererObj.tF() + 3.0f);
            if (((Interface)this.wy()).aoZ != f2) {
                // empty if block
            }
            ((Interface)this.wy()).o(3.0f);
            double d2 = zf2.nH().getX() - 1.0 - 2.0;
            double d3 = zf2.nH().getY() + 1.0;
            double d4 = zf2.atS + zf2.atT + 2.0f + 3.0f;
            this.b(gg.kU).c(() -> ait.d(d2 - 1.0, d3 - 2.0, d4, asX + 1.0, new Color(0, 0, 0, 255)));
            this.b(gg.kT).c(() -> ait.d(d2 - 1.0, d3 - 2.0, d4, asX + 1.0, new Color(0, 0, 0, 255)));
            this.b(gg.kV, 1).c(() -> {
                ait.d(d2 - 1.0, d3 - 2.0, d4, asX + 1.0, new Color(0, 0, 0, 110));
                ait.d(d2 + (double)zf2.atS + (double)zf2.atT + 4.0, d3 - 2.0, 1.0, asX + 1.0, this.rP().j(new Vector2d(zf2.nH().getX(), zf2.nH().getY() / 1.5)));
                this.a(zf2, d2 + 1.0, d3, this.rP().j(new Vector2d(zf2.nH().getX(), zf2.nH().getY() / 1.5)).getRGB());
            });
        }
        this.b(gg.kV).c(() -> {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            String string = simpleDateFormat.format(date);
            String string2 = Client.b + " Client | 6.9.9 | " + YuMode.aER.bgK.xU() + " | " + string;
            ait.c(2.0, 3.0, (double)(((Boolean)this.asV.wD() != false ? 0 : 8) + this.nC().bQ(string2)), 15.0, 4.0, new Color(0, 0, 0, 100));
            GlStateManager.JX();
            int n2 = 0;
            for (int i2 = 0; i2 < string2.length(); ++i2) {
                char c2 = string2.charAt(i2);
                this.nC().b(String.valueOf(c2), 6 + n2, 8.0, this.rP().j(new Vector2d(i2, i2)).getRGB());
                n2 += this.nC().bQ(String.valueOf(c2));
            }
        });
        this.b(gg.kU).c(() -> {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            String string = simpleDateFormat.format(date);
            String string2 = Client.b + " Client | 6.9.9 | " + YuMode.aER.bgK.xU() + " | " + string;
            ait.c(2.0, 3.0, (double)(((Boolean)this.asV.wD() != false ? 0 : 8) + this.nC().bQ(string2)), 15.0, 4.0, new Color(0, 0, 0, 255));
        });
        this.b(gg.kT).c(() -> {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            String string = simpleDateFormat.format(date);
            String string2 = Client.b + " Client | 6.9.9 | " + YuMode.aER.bgK.xU() + " | " + string;
            ait.c(2.0, 3.0, (double)(((Boolean)this.asV.wD() != false ? 0 : 8) + this.nC().bQ(string2) - 1), 15.0, 5.0, new Color(0, 0, 0, 255));
        });
    };
    @EventLink
    public final Listener<TickEvent> ata = tickEvent -> {
        for (zf zf2 : ((Interface)this.wy()).mc()) {
            if (zf2.atQ == 0.0f) continue;
            zf2.y(!zf2.getTag().isEmpty() && (Boolean)((Interface)this.wy()).aoI.wD() != false);
            String string = ((Boolean)((Interface)this.wy()).aoJ.wD() != false ? zf2.nN().toLowerCase() : zf2.nN()).replace((Boolean)((Interface)this.wy()).lY().wD() != false ? " " : "", "");
            String string2 = ((Boolean)((Interface)this.wy()).aoJ.wD() != false ? zf2.getTag().toLowerCase() : zf2.getTag()).replace((Boolean)((Interface)this.wy()).lY().wD() != false ? " " : "", "");
            zf2.t(this.nC().bQ(string));
            zf2.u(zf2.nQ() ? (float)(this.nC().bQ(string2) + 1 + 3) : 1.0f);
            zf2.ap(string);
            zf2.aq(string2);
        }
    };

    public YuMode(String string, Interface interface_) {
        super(string, interface_);
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

