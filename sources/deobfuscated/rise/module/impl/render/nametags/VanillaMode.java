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
import rise.module.impl.render.NameTags;
import rise.value.BooleanValue;

public class VanillaMode
extends Mode<NameTags> {
    private final BooleanValue aun = new BooleanValue("Show Team Tag", (Mode<?>)this, (Boolean)false);
    private final BooleanValue auo = new BooleanValue("Show Target Tag", (Mode<?>)this, (Boolean)false);
    private final BooleanValue aup = new BooleanValue("Show Friend Tag", (Mode<?>)this, (Boolean)false);
    private final BooleanValue auq = new BooleanValue("Shortened Tags", (Mode<?>)this, (Boolean)false);
    @EventLink
    public final Listener<Render2DEvent> aur = render2DEvent -> {
        agg agg2 = VanillaMode.aER.fontRendererObj;
        GlStateManager.JV();
        List<r> list = bv.b((Boolean)((NameTags)this.wy()).apJ.wD(), (Boolean)((NameTags)this.wy()).apK.wD(), (Boolean)((NameTags)this.wy()).apL.wD(), (Boolean)((NameTags)this.wy()).apM.wD(), (Boolean)((NameTags)this.wy()).apN.wD(), true);
        if (VanillaMode.aER.aIY.chP != 0) {
            list.add(VanillaMode.aER.bgK);
        }
        for (r r2 : list) {
            Object object = r2.xW().arq();
            if (((Boolean)this.aun.wD()).booleanValue() && aik.D(r2)) {
                object = "\u00a7a\u00a7l" + ((Boolean)this.auq.wD() != false ? "[TM]" : "[TEAM]") + "\u00a7r " + (String)object;
            }
            if (((Boolean)this.auo.wD()).booleanValue() && bx.n(r2.xU())) {
                object = "\u00a74\u00a7l" + ((Boolean)this.auq.wD() != false ? "[T]" : "[TARGET]") + "\u00a7r " + (String)object;
            }
            if (((Boolean)this.aup.wD()).booleanValue() && bx.isFriend(r2.xU())) {
                object = "\u00a7b\u00a7l" + ((Boolean)this.auq.wD() != false ? "[F]" : "[FRIEND]") + "\u00a7r " + (String)object;
            }
            r2.Tr();
            Vector4d vector4d = cj.e(r2);
            if (vector4d == null) continue;
            float f2 = 2.0f;
            int n2 = 8;
            float f3 = ((NameTags)this.wy()).a((String)object, agg2);
            float f4 = (float)(vector4d.x + (vector4d.z - vector4d.x) / 2.0);
            float f5 = (float)vector4d.y - (float)n2;
            this.b(gg.kT).c(() -> ait.d(f4 - f3 / 2.0f - f2, f5 - f2 - 3.0f, f3 + f2 * 2.0f, (float)n2 + f2 * 2.0f, this.rP().rU()));
            this.b(gg.kU).c(() -> ait.d(f4 - f3 / 2.0f - f2, f5 - f2 - 3.0f, f3 + f2 * 2.0f, (float)n2 + f2 * 2.0f, Color.BLACK));
            Object object2 = object;
            this.b(gg.kV).c(() -> this.b(f4, f3, f2, f5, n2, agg2, (String)object2));
        }
        GlStateManager.JW();
    };

    public VanillaMode(String string, NameTags nameTags) {
        super(string, nameTags);
    }

    private /* synthetic */ void b(float f2, float f3, float f4, float f5, int n2, agf agf2, String string) {
        double d2 = f2 - f3 / 2.0f - f4;
        double d3 = f5 - f4 - 3.0f;
        double d4 = f3 + f4 * 2.0f;
        double d5 = (float)n2 + f4 * 2.0f;
        this.rP();
        ait.d(d2, d3, d4, d5, ady.sa());
        float f6 = f2 - f3 / 2.0f;
        agf2.b(string, f6 + 0.5f, f5 - 2.0f, Color.WHITE.getRGB());
    }
}

