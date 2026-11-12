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
import hackclient.rise.aik;
import hackclient.rise.ait;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bv;
import hackclient.rise.bx;
import hackclient.rise.cj;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.gg;
import hackclient.rise.to;
import hackclient.rise.xs;
import java.awt.Color;
import java.util.List;
import javax.vecmath.Vector4d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.r;

public class zs
extends akg<xs> {
    private final aki aue = new aki("Show Team Tag", (akg<?>)this, (Boolean)false);
    private final aki auf = new aki("Show Target Tag", (akg<?>)this, (Boolean)false);
    private final aki aug = new aki("Show Friend Tag", (akg<?>)this, (Boolean)false);
    private final aki auh = new aki("Shortened Tags", (akg<?>)this, (Boolean)false);
    @dm
    public final dk<fs> aui = fs2 -> {
        agg agg2 = zs.aER.fontRendererObj;
        GlStateManager.JV();
        List<r> list = bv.b((Boolean)((xs)this.wy()).apJ.wD(), (Boolean)((xs)this.wy()).apK.wD(), (Boolean)((xs)this.wy()).apL.wD(), (Boolean)((xs)this.wy()).apM.wD(), (Boolean)((xs)this.wy()).apN.wD(), true);
        if (zs.aER.aIY.chP != 0 && ((Boolean)((xs)this.wy()).apJ.wD()).booleanValue()) {
            list.add(zs.aER.bgK);
        }
        for (r r2 : list) {
            to to2 = this.e(to.class);
            float f2 = to2 != null && to2.isEnabled() ? to.B(r2) : r2.getHealth();
            String string = r2.xW().getFormattedText() + " \u00a77[\u00a74\u2764" + Math.round(f2) + "\u00a77]";
            if (((Boolean)this.aue.wD()).booleanValue() && aik.D(r2)) {
                string = "\u00a7a\u00a7l" + ((Boolean)this.auh.wD() != false ? "[TM]" : "[TEAM]") + "\u00a7r " + string;
            }
            if (((Boolean)this.auf.wD()).booleanValue() && bx.n(r2.xU())) {
                string = "\u00a74\u00a7l" + ((Boolean)this.auh.wD() != false ? "[T]" : "[TARGET]") + "\u00a7r " + string;
            }
            if (((Boolean)this.aug.wD()).booleanValue() && bx.isFriend(r2.xU())) {
                string = "\u00a7b\u00a7l" + ((Boolean)this.auh.wD() != false ? "[F]" : "[FRIEND]") + "\u00a7r " + string;
            }
            r2.Tr();
            Vector4d vector4d = cj.e(r2);
            if (vector4d == null) continue;
            float f3 = 2.0f;
            int n2 = 8;
            float f4 = ((agf)agg2).bQ(string);
            float f5 = (float)(vector4d.x + (vector4d.z - vector4d.x) / 2.0);
            float f6 = (float)vector4d.y - (float)n2;
            String string2 = string;
            this.b(gg.kV).c(() -> {
                double d2 = f5 - f4 / 2.0f - f3;
                double d3 = f6 - f3 - 3.0f;
                double d4 = f4 + f3 * 2.0f;
                double d5 = (float)n2 + f3 * 2.0f;
                this.rP();
                ait.d(d2, d3, d4, d5, ady.sa());
                float f6 = f5 - f4 / 2.0f;
                agg2.b(string2, f6 + 0.5f, f6 - 2.0f, Color.WHITE.getRGB());
            });
        }
        GlStateManager.JW();
    };

    public zs(String string, xs xs2) {
        super(string, xs2);
    }
}

