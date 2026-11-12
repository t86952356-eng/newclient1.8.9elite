/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4d
 */
package hackclient.rise;

import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.bv;
import hackclient.rise.cj;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.to;
import java.awt.Color;
import java.util.List;
import javax.vecmath.Vector4d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

@gl(aliases={"module.render.2desp.name"}, description="module.render.projectionesp.description", category=gj.RENDER)
public class xv
extends gi {
    private final akp apT = new akp("Box", this).a(new akg[]{new aks("Normal")}).a(new akg[]{new aks("CS")}).a(new akg[]{new aks("None")}).co("Normal");
    private final akp apU = new akp("Health Bar Mode", this).a(new akg[]{new aks("Health")}).a(new akg[]{new aks("Standard")}).a(new akg[]{new aks("Gradient")}).a(new akg[]{new aks("None")}).co("Health");
    private final aki apV = new aki("Armor Bar", (gi)this, (Boolean)false);
    private final aki apW = new aki("Targets", (gi)this, (Boolean)false);
    private final aki apX = new aki("Player", (gi)this, (Boolean)true, () -> (Boolean)this.apW.wD() == false);
    private final aki apY = new aki("Invisibles", (gi)this, (Boolean)false, () -> (Boolean)this.apW.wD() == false);
    private final aki apZ = new aki("Animals", (gi)this, (Boolean)false, () -> (Boolean)this.apW.wD() == false);
    private final aki aqa = new aki("Mobs", (gi)this, (Boolean)false, () -> (Boolean)this.apW.wD() == false);
    private final aki aqb = new aki("Player Teammates", (gi)this, (Boolean)true, () -> (Boolean)this.apW.wD() == false);
    private final aki aqc = new aki("Glow", (gi)this, (Boolean)false);
    @dm
    public final dk<fs> aqd = fs2 -> {
        List<r> list = bv.b((Boolean)this.apX.wD(), (Boolean)this.apY.wD(), (Boolean)this.apZ.wD(), (Boolean)this.aqa.wD(), (Boolean)this.aqb.wD(), true);
        if (xv.aER.aIY.chP != 0) {
            list.add(xv.aER.bgK);
        }
        for (r r2 : list) {
            float f2;
            float f3;
            Vector4d vector4d;
            if (aER.BF() == null || !ait.x(r2) || r2.csb || r2.isInvisible() || (vector4d = cj.e(r2)) == null) continue;
            double d2 = vector4d.x;
            double d3 = vector4d.y;
            double d4 = vector4d.z;
            double d5 = vector4d.w;
            double d6 = d4 - d2;
            double d7 = d5 - d3;
            aka aka2 = new aka(0.0, 0.0);
            aka aka3 = new aka(0.0, 500.0);
            Color color = this.rP().j(aka2);
            Color color2 = this.rP().j(aka3);
            Color color3 = Color.BLACK;
            switch (((akg)this.apT.wD()).getName()) {
                case "Normal": {
                    ait.d(d2 - 0.5, d3 + 1.0, 1.5, d7 - 1.5, color3);
                    ait.d(d2 - 0.5, d3 - 0.5, d6 + 1.5, 1.5, color3);
                    ait.d(d4 - 0.5, d3 + 1.0, 1.5, d7, color3);
                    ait.d(d2 - 0.5, d5 - 0.5, d6, 1.5, color3);
                    ait.c(d2, d3 + 0.5, 0.5, d7 - 0.5, color, color2);
                    ait.c(d2, d3, d6, 0.5, color, color2);
                    ait.c(d4, d3, 0.5, d7, color, color2);
                    ait.c(d2, d5, d6 + 0.5, 0.5, color, color2);
                    this.b(gg.kT).c(() -> {
                        GlStateManager.JV();
                        if (((Boolean)this.aqc.wD()).booleanValue()) {
                            ait.c(d2, d3 + 0.5, 0.5, d7 - 0.5, color, color2);
                            ait.c(d2, d3, d6, 0.5, color, color2);
                            ait.c(d4, d3, 0.5, d7, color, color2);
                            ait.c(d2, d5, d6 + 0.5, 0.5, color, color2);
                        }
                        GlStateManager.JW();
                    });
                    break;
                }
                case "CS": {
                    f3 = (float)(d6 / 4.0);
                    f2 = (float)(d7 / 4.0);
                    ait.d(d2 - 0.5, d3 + 1.0, 1.5, f2, color3);
                    ait.d(d2 - 0.5, d5 - (double)f2 - 0.5, 1.5, f2, color3);
                    ait.d(d2 - 0.5, d3 - 0.5, f3 + 1.0f, 1.5, color3);
                    ait.d(d4 - (double)f3 - 0.5, d3 - 0.5, f3 + 1.5f, 1.5, color3);
                    ait.d(d4 - 0.5, d3 + 1.0, 1.5, f2, color3);
                    ait.d(d4 - 0.5, d5 - (double)f2 - 0.5, 1.5, f2, color3);
                    ait.d(d2 - 0.5, d5 - 0.5, f3 + 1.0f, 1.5, color3);
                    ait.d(d4 - (double)f3 - 0.5, d5 - 0.5, f3 + 1.5f, 1.5, color3);
                    ait.d(d2, d3 + 0.5, 0.5, f2, color2);
                    ait.d(d2, d5 - (double)f2, 0.5, f2, color2);
                    ait.d(d2, d3, f3, 0.5, color2);
                    ait.d(d4 - (double)f3, d3, f3, 0.5, color2);
                    ait.d(d4, d3, 0.5, f2 + 0.5f, color2);
                    ait.d(d4, d5 - (double)f2, 0.5, f2 + 0.5f, color2);
                    ait.d(d2, d5, f3, 0.5, color2);
                    ait.d(d4 - (double)f3, d5, f3, 0.5, color2);
                    this.b(gg.kT).c(() -> {
                        GlStateManager.JV();
                        if (((Boolean)this.aqc.wD()).booleanValue()) {
                            ait.d(d2, d3 + 0.5, 0.5, f2, color2);
                            ait.d(d2, d5 - (double)f2, 0.5, f2, color2);
                            ait.d(d2, d3, f3, 0.5, color2);
                            ait.d(d4 - (double)f3, d3, f3, 0.5, color2);
                            ait.d(d4, d3, 0.5, f2 + 0.5f, color2);
                            ait.d(d4, d5 - (double)f2, 0.5, f2 + 0.5f, color2);
                            ait.d(d2, d5, f3, 0.5, color2);
                            ait.d(d4 - (double)f3, d5, f3, 0.5, color2);
                        }
                        GlStateManager.JW();
                    });
                    break;
                }
            }
            if (!(r2 instanceof r)) continue;
            Object object = r2;
            to to2 = this.e(to.class);
            float f4 = f3 = to2 != null && to2.isEnabled() ? to.B((r)object) : ((r)object).getHealth();
            if (!((akg)this.apU.wD()).getName().equals("None")) {
                Color color4 = new Color(0, 0, 0, 180);
                ait.d(d2 - 2.5, d3 - 0.5, 1.5, d7 + 1.5, color4);
                float f5 = bt.I(f3 / ((r)object).getMaxHealth(), 0.0f, 1.0f);
                double d8 = (d5 - d3 - 2.0) * (double)(1.0f - f5);
                switch (((akg)this.apU.wD()).getName()) {
                    case "Health": {
                        int n2 = Color.HSBtoRGB(f3 / ((r)object).getMaxHealth() / 3.0f, 1.0f, 1.0f);
                        ait.d(d2 - 2.0, d3 + d8, 0.5, d5 - d3 - d8 + 0.5, new Color(n2));
                        this.b(gg.kT).c(() -> {
                            if (((Boolean)this.aqc.wD()).booleanValue()) {
                                GlStateManager.JV();
                                ait.d(d2 - 2.0, d3 + d8, 2.0, d5 - d3 - d8 + 0.5, new Color(n2));
                                GlStateManager.JW();
                            }
                        });
                        break;
                    }
                    case "Standard": {
                        ait.d(d2 - 2.0, d3 + d8, 0.5, d5 - d3 - d8 + 0.5, this.rP().j(aka2));
                        this.b(gg.kT).c(() -> {
                            if (((Boolean)this.aqc.wD()).booleanValue()) {
                                GlStateManager.JV();
                                ait.d(d2 - 2.0, d3 + d8, 2.0, d5 - d3 - d8 + 0.5, this.rP().j(aka2));
                                GlStateManager.JW();
                            }
                        });
                        break;
                    }
                    case "Gradient": {
                        Color color5 = new Color(ais.a(this.rP().rQ(), this.rP().rR(), f5).getRGB());
                        ait.a(d2 - 2.0, d3 + d8, 0.5, d5 - d3 - d8 + 0.5, color5, this.rP().rR());
                        this.b(gg.kT).c(() -> {
                            if (((Boolean)this.aqc.wD()).booleanValue()) {
                                GlStateManager.JV();
                                ait.a(d2 - 2.0, d3 + d8, 2.0, d5 - d3 - d8 + 0.5, color5, this.rP().rR());
                                GlStateManager.JW();
                            }
                        });
                    }
                }
            }
            if (!((Boolean)this.apV.wD()).booleanValue() || !((f2 = (float)((r)object).VQ() / 20.0f) > 0.0f)) continue;
            ait.d(d2 - 0.5, d5 + 1.5, d4 - d2 + 1.5, 1.5, new Color(0, 0, 0, 180));
            ait.c(d2, d5 + 2.0, (d6 + 0.5) * (double)f2, 0.5, this.rP().rQ(), ais.a(this.rP().rQ(), this.rP().rR(), f2));
            this.b(gg.kT).c(() -> {
                if (((Boolean)this.aqc.wD()).booleanValue()) {
                    GlStateManager.JV();
                    ait.d(d2 - 0.5, d5 + 1.5, d4 - d2 + 1.5, 1.5, new Color(0, 0, 0, 180));
                    ait.c(d2, d5 + 2.0, (d6 + 2.0) * (double)f2, 0.5, this.rP().rQ(), ais.a(this.rP().rQ(), this.rP().rR(), f2));
                    GlStateManager.JW();
                }
            });
        }
    };
}

