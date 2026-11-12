/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4d
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.agg;
import hackclient.rise.ait;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bv;
import hackclient.rise.cj;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.to;
import hackclient.rise.xs;
import java.awt.Color;
import java.util.List;
import javax.vecmath.Vector4d;
import net.minecraft.entity.r;
import net.minecraft.potion.a;

public class zt
extends akg<xs> {
    private final aki auj = new aki("Show Health", (akg<?>)this, (Boolean)true);
    private final aki auk = new aki("Overlays (Bloom/Blur)", (akg<?>)this, (Boolean)true);
    private final agf aul = gb.ks.a(14, gd.kE);
    @dm
    public final dk<fs> aum = fs2 -> {
        List<r> list = bv.b((Boolean)((xs)this.wy()).apJ.wD(), (Boolean)((xs)this.wy()).apK.wD(), (Boolean)((xs)this.wy()).apL.wD(), (Boolean)((xs)this.wy()).apM.wD(), (Boolean)((xs)this.wy()).apN.wD(), true);
        if (zt.aER.aIY.chP != 0) {
            list.add(zt.aER.bgK);
        }
        for (r r2 : list) {
            Color color;
            if (!ait.x(r2)) continue;
            r2.Tr();
            Vector4d vector4d = cj.e(r2);
            if (vector4d == null) continue;
            String string = r2.xU();
            double d2 = ((xs)this.wy()).a(string, gb.ks.a(17, gd.kE));
            to to2 = this.e(to.class);
            float f2 = to2 != null && to2.isEnabled() ? to.B(r2) : r2.getHealth();
            double d3 = vector4d.x + (vector4d.z - vector4d.x) / 2.0;
            double d4 = vector4d.y - 2.0;
            double d5 = 2.0;
            int n2 = 2;
            double d6 = (double)(gb.ks.a(17, gd.kE).tF() - 2.0f + ((Boolean)this.auj.wD() != false ? this.aul.tF() : 0.0f)) + 4.0;
            double d7 = d4 - d6 + 1.0;
            boolean bl2 = r2.a(a.dgA);
            Color color2 = new Color(255, 30, 30, 235);
            Color color3 = bl2 ? color2 : Color.BLACK;
            this.rP();
            Color color4 = ady.sa();
            Color color5 = new Color(255, 40, 40, color4.getAlpha());
            Color color6 = color = bl2 ? zt.a(color4, color5, 0.35f) : color4;
            if (((Boolean)this.auk.wD()).booleanValue()) {
                this.b(gg.kT).c(() -> ait.c(d3 - 2.0 - d2 / 2.0 + 0.5, d7 + 0.5, d2 + 4.0 - 1.0, d6 - 1.0, this.rP().pB(), color3));
            }
            this.b(gg.kV).c(() -> {
                ait.c(d3 - 2.0 - d2 / 2.0, d7, d2 + 4.0, d6, this.rP().pB() - 1, color);
                gb.ks.a(17, gd.kE).c(string, d3 - 0.5, d7 - 0.5 + 4.0, this.rP().rQ().getRGB());
                if (((Boolean)this.auj.wD()).booleanValue()) {
                    this.aul.c(String.valueOf((int)f2), d3, d4 + 5.0 - 2.0 - (double)agg.aIF, Color.WHITE.getRGB());
                }
            });
            if (!((Boolean)this.auk.wD()).booleanValue()) continue;
            this.b(gg.kU).c(() -> ait.c(d3 - 2.0 - d2 / 2.0, d7, d2 + 4.0, d6, this.rP().pB(), color3));
        }
    };

    public zt(String string, xs xs2) {
        super(string, xs2);
    }

    private static Color a(Color color, Color color2, float f2) {
        f2 = Math.max(0.0f, Math.min(1.0f, f2));
        int n2 = (int)((float)color.getRed() + (float)(color2.getRed() - color.getRed()) * f2);
        int n3 = (int)((float)color.getGreen() + (float)(color2.getGreen() - color.getGreen()) * f2);
        int n4 = (int)((float)color.getBlue() + (float)(color2.getBlue() - color.getBlue()) * f2);
        int n5 = (int)((float)color.getAlpha() + (float)(color2.getAlpha() - color.getAlpha()) * f2);
        return new Color(n2, n3, n4, n5);
    }
}

