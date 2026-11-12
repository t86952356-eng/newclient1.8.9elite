/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4d
 */
package rise.module.impl.render.nametags;

import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.agg;
import hackclient.rise.aik;
import hackclient.rise.ait;
import hackclient.rise.bv;
import hackclient.rise.bx;
import hackclient.rise.cj;
import hackclient.rise.gg;
import java.awt.Color;
import java.util.List;
import javax.vecmath.Vector4d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.r;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Mode;
import rise.module.impl.player.HealthBypass;
import rise.module.impl.render.NameTags;
import rise.value.BooleanValue;

public class ClassicMode
extends Mode<NameTags> {
    private final BooleanValue aue = new BooleanValue("Show Team Tag", (Mode<?>)this, (Boolean)false);
    private final BooleanValue auf = new BooleanValue("Show Target Tag", (Mode<?>)this, (Boolean)false);
    private final BooleanValue aug = new BooleanValue("Show Friend Tag", (Mode<?>)this, (Boolean)false);
    private final BooleanValue auh = new BooleanValue("Shortened Tags", (Mode<?>)this, (Boolean)false);
    @EventLink
    public final Listener<Render2DEvent> aui = render2DEvent -> {
        agg agg2 = ClassicMode.aER.fontRendererObj;
        GlStateManager.JV();
        List<r> list = bv.b((Boolean)((NameTags)this.wy()).apJ.wD(), (Boolean)((NameTags)this.wy()).apK.wD(), (Boolean)((NameTags)this.wy()).apL.wD(), (Boolean)((NameTags)this.wy()).apM.wD(), (Boolean)((NameTags)this.wy()).apN.wD(), true);
        if (ClassicMode.aER.aIY.chP != 0 && ((Boolean)((NameTags)this.wy()).apJ.wD()).booleanValue()) {
            list.add(ClassicMode.aER.bgK);
        }
        for (r r2 : list) {
            HealthBypass healthBypass = this.e(HealthBypass.class);
            float f2 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(r2) : r2.getHealth();
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

    public ClassicMode(String string, NameTags nameTags) {
        super(string, nameTags);
    }
}

