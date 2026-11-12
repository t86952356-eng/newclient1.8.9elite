/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import java.util.Calendar;
import net.minecraft.block.BlockChest;
import net.minecraft.client.model.k;
import net.minecraft.client.model.x;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.util.cm;

public class TileEntityChestRenderer
extends TileEntitySpecialRenderer<m> {
    private static final cm caw = new cm("textures/entity/chest/trapped_double.png");
    private static final cm cax = new cm("textures/entity/chest/christmas_double.png");
    private static final cm cay = new cm("textures/entity/chest/normal_double.png");
    private static final cm caz = new cm("textures/entity/chest/trapped.png");
    private static final cm caA = new cm("textures/entity/chest/christmas.png");
    private static final cm caB = new cm("textures/entity/chest/normal.png");
    private final k caC = new k();
    private final k caD = new x();
    private boolean caE;

    public TileEntityChestRenderer() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.caE = true;
        }
    }

    @Override
    public void a(m m2, double d2, double d3, double d4, float f2, int n2) {
        Object object;
        int n3;
        GlStateManager.JE();
        GlStateManager.cJ(515);
        GlStateManager.an(true);
        if (!m2.apO()) {
            n3 = 0;
        } else {
            object = m2.ahl();
            n3 = m2.zg();
            if (object instanceof BlockChest && n3 == 0) {
                ((BlockChest)object).i(m2.de(), m2.Ab(), m2.de().L(m2.Ab()));
                n3 = m2.zg();
            }
            m2.aqt();
        }
        if (m2.dsy == null && m2.dsA == null) {
            float f3;
            if (m2.dsz == null && m2.dsB == null) {
                object = this.caC;
                if (n2 >= 0) {
                    this.a(cbs[n2]);
                    GlStateManager.cR(5890);
                    GlStateManager.JV();
                    GlStateManager.i(4.0f, 4.0f, 1.0f);
                    GlStateManager.j(0.0625f, 0.0625f, 0.0625f);
                    GlStateManager.cR(5888);
                } else if (this.caE) {
                    this.a(caA);
                } else if (m2.aqu() == 1) {
                    this.a(caz);
                } else {
                    this.a(caB);
                }
            } else {
                object = this.caD;
                if (n2 >= 0) {
                    this.a(cbs[n2]);
                    GlStateManager.cR(5890);
                    GlStateManager.JV();
                    GlStateManager.i(8.0f, 4.0f, 1.0f);
                    GlStateManager.j(0.0625f, 0.0625f, 0.0625f);
                    GlStateManager.cR(5888);
                } else if (this.caE) {
                    this.a(cax);
                } else if (m2.aqu() == 1) {
                    this.a(caw);
                } else {
                    this.a(cay);
                }
            }
            GlStateManager.JV();
            GlStateManager.JS();
            if (n2 < 0) {
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            }
            GlStateManager.j((float)d2, (float)d3 + 1.0f, (float)d4 + 1.0f);
            GlStateManager.i(1.0f, -1.0f, -1.0f);
            GlStateManager.j(0.5f, 0.5f, 0.5f);
            int n4 = 0;
            if (n3 == 2) {
                n4 = 180;
            }
            if (n3 == 3) {
                n4 = 0;
            }
            if (n3 == 4) {
                n4 = 90;
            }
            if (n3 == 5) {
                n4 = -90;
            }
            if (n3 == 2 && m2.dsz != null) {
                GlStateManager.j(1.0f, 0.0f, 0.0f);
            }
            if (n3 == 5 && m2.dsB != null) {
                GlStateManager.j(0.0f, 0.0f, -1.0f);
            }
            GlStateManager.d(n4, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(-0.5f, -0.5f, -0.5f);
            float f4 = m2.dsD + (m2.dsC - m2.dsD) * f2;
            if (m2.dsy != null && (f3 = m2.dsy.dsD + (m2.dsy.dsC - m2.dsy.dsD) * f2) > f4) {
                f4 = f3;
            }
            if (m2.dsA != null && (f3 = m2.dsA.dsD + (m2.dsA.dsC - m2.dsA.dsD) * f2) > f4) {
                f4 = f3;
            }
            f4 = 1.0f - f4;
            f4 = 1.0f - f4 * f4 * f4;
            ((k)object).bzd.bBF = -(f4 * (float)Math.PI / 2.0f);
            ((k)object).GZ();
            GlStateManager.JT();
            GlStateManager.JW();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            if (n2 >= 0) {
                GlStateManager.cR(5890);
                GlStateManager.JW();
                GlStateManager.cR(5888);
            }
        }
    }

    @Override
    public void b(m m2, double d2, double d3, double d4, float f2, int n2) {
        Object object;
        int n3;
        GlStateManager.JE();
        if (!m2.apO()) {
            n3 = 0;
        } else {
            object = m2.ahl();
            n3 = m2.zg();
            if (object instanceof BlockChest && n3 == 0) {
                ((BlockChest)object).i(m2.de(), m2.Ab(), m2.de().L(m2.Ab()));
                n3 = m2.zg();
            }
            m2.aqt();
        }
        if (m2.dsy == null && m2.dsA == null) {
            float f3;
            if (m2.dsz == null && m2.dsB == null) {
                object = this.caC;
                if (n2 >= 0) {
                    this.a(cbs[n2]);
                    GlStateManager.cR(5890);
                    GlStateManager.JV();
                    GlStateManager.i(4.0f, 4.0f, 1.0f);
                    GlStateManager.j(0.0625f, 0.0625f, 0.0625f);
                    GlStateManager.cR(5888);
                } else if (this.caE) {
                    this.a(caA);
                } else if (m2.aqu() == 1) {
                    this.a(caz);
                } else {
                    this.a(caB);
                }
            } else {
                object = this.caD;
                if (n2 >= 0) {
                    this.a(cbs[n2]);
                    GlStateManager.cR(5890);
                    GlStateManager.JV();
                    GlStateManager.i(8.0f, 4.0f, 1.0f);
                    GlStateManager.j(0.0625f, 0.0625f, 0.0625f);
                    GlStateManager.cR(5888);
                } else if (this.caE) {
                    this.a(cax);
                } else if (m2.aqu() == 1) {
                    this.a(caw);
                } else {
                    this.a(cay);
                }
            }
            GlStateManager.JV();
            GlStateManager.JS();
            if (n2 < 0) {
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            }
            GlStateManager.j((float)d2, (float)d3 + 1.0f, (float)d4 + 1.0f);
            GlStateManager.i(1.0f, -1.0f, -1.0f);
            GlStateManager.j(0.5f, 0.5f, 0.5f);
            int n4 = 0;
            if (n3 == 2) {
                n4 = 180;
            }
            if (n3 == 3) {
                n4 = 0;
            }
            if (n3 == 4) {
                n4 = 90;
            }
            if (n3 == 5) {
                n4 = -90;
            }
            if (n3 == 2 && m2.dsz != null) {
                GlStateManager.j(1.0f, 0.0f, 0.0f);
            }
            if (n3 == 5 && m2.dsB != null) {
                GlStateManager.j(0.0f, 0.0f, -1.0f);
            }
            GlStateManager.d(n4, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(-0.5f, -0.5f, -0.5f);
            float f4 = m2.dsD + (m2.dsC - m2.dsD) * f2;
            if (m2.dsy != null && (f3 = m2.dsy.dsD + (m2.dsy.dsC - m2.dsy.dsD) * f2) > f4) {
                f4 = f3;
            }
            if (m2.dsA != null && (f3 = m2.dsA.dsD + (m2.dsA.dsC - m2.dsA.dsD) * f2) > f4) {
                f4 = f3;
            }
            f4 = 1.0f - f4;
            f4 = 1.0f - f4 * f4 * f4;
            ((k)object).bzd.bBF = -(f4 * (float)Math.PI / 2.0f);
            ((k)object).GZ();
            GlStateManager.JT();
            GlStateManager.JW();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            if (n2 >= 0) {
                GlStateManager.cR(5890);
                GlStateManager.JW();
                GlStateManager.cR(5888);
            }
        }
    }

    @Override
    public /* synthetic */ void a(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((m)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((m)d2, d3, d4, d5, f2, n2);
    }
}

