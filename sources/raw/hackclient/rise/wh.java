/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.fv;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.wi;
import hackclient.rise.ye;
import hackclient.rise.yf;
import java.util.Random;
import java.util.Vector;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.bg;
import net.minecraft.item.co;
import net.minecraft.potion.a;
import net.minecraft.potion.d;
import net.minecraft.util.aw;

@gl(aliases={"module.render.appleskin.name"}, description="module.render.appleskin.description", category=gj.RENDER)
public class wh
extends gi {
    private final akq alE = new akq("Max Flash Alpha", this, (Number)0.65, (Number)0, (Number)1, (Number)0.05);
    public final Vector<wi> alF = new Vector();
    private final Random alG = new Random();
    private float alH;
    private float alI;
    private byte alJ = 1;
    @dm
    public final dk<fv> alK = fv2 -> {
        boolean bl2;
        cz cz2 = fv2.dx();
        aw aw2 = wh.aER.bgK.abY();
        int n2 = cz2.getScaledWidth() / 2 + 91;
        int n3 = cz2.getScaledHeight() - 39;
        this.b(n2, 0, wh.aER.bha.bnB);
        this.a(0.0f, aw2.getSaturationLevel(), 0, aw2.getFoodLevel(), n2, n3, 1.0f);
        co co2 = wh.aER.bgK.Vk();
        boolean bl3 = bl2 = co2 != null && co2.bP() instanceof bg;
        if (!bl2) {
            this.ld();
            return;
        }
        yf yf2 = ye.t(co2);
        int n4 = yf2.arc;
        float f2 = yf2.mD();
        int n5 = aw2.getFoodLevel() + n4;
        float f3 = aw2.getSaturationLevel() + f2;
        float f4 = f3 > (float)n5 ? (float)n5 - aw2.getSaturationLevel() : f2;
        this.a(n4, aw2.getFoodLevel(), n2, n3, this.alI, ye.u(co2));
        this.a(f4, aw2.getSaturationLevel(), n4, aw2.getFoodLevel(), n2, n3, this.alI);
    };
    @dm
    public final dk<fe> alL = fe2 -> {
        this.alH += (float)this.alJ * 0.125f;
        if (this.alH >= 1.5f) {
            this.alJ = (byte)-1;
        } else if (this.alH <= -0.5f) {
            this.alJ = 1;
        }
        this.alI = Math.max(0.0f, Math.min(1.0f, this.alH)) * Math.min(1.0f, ((Number)this.alE.wD()).floatValue());
    };

    private void b(int n2, int n3, int n4) {
        boolean bl2;
        this.alG.setSeed((long)n4 * 312871L);
        int n5 = 10;
        aw aw2 = wh.aER.bgK.abY();
        float f2 = aw2.getSaturationLevel();
        int n6 = aw2.getFoodLevel();
        boolean bl3 = bl2 = f2 <= 0.0f && wh.aER.bha.bnB % (n6 * 3 + 1) == 0;
        if (this.alF.size() != 10) {
            this.alF.setSize(10);
        }
        for (int i2 = 0; i2 < 10; ++i2) {
            wi wi2;
            int n7 = n2 - i2 * 8 - 9;
            int n8 = n3;
            if (bl2) {
                n8 += this.alG.nextInt(3) - 1;
            }
            if ((wi2 = this.alF.get(i2)) == null) {
                wi2 = new wi();
                this.alF.set(i2, wi2);
            }
            wi2.alM = n7 - n2;
            wi2.alN = n8;
        }
    }

    private void a(float f2, float f3, int n2, int n3, int n4, int n5, float f4) {
        if (f3 + f2 < 0.0f) {
            return;
        }
        GlStateManager.tQ();
        GlStateManager.e(1.0f, 1.0f, 1.0f, f4);
        GlStateManager.P(770, 771);
        float f5 = Math.max(0.0f, Math.min(20.0f, f3 + f2));
        int n6 = Math.max(0, Math.min(20, n3 + n2));
        int n7 = 0;
        int n8 = (int)Math.ceil(f5 / 2.0f);
        if (f2 != 0.0f) {
            n7 = (int)Math.max(f3 / 2.0f, 0.0f);
        }
        int n9 = 16;
        int n10 = 9;
        for (int i2 = n7; i2 < n8; ++i2) {
            wi wi2 = this.alF.get(i2);
            if (wi2 == null) continue;
            int n11 = n4 + wi2.alM;
            int n12 = n5 + wi2.alN;
            int n13 = 27;
            int n14 = 52;
            int n15 = 25;
            for (d d2 : wh.aER.bgK.VL()) {
                if (d2.aje() != a.dgM.getId()) continue;
                n14 += 36;
                break;
            }
            int n16 = n11;
            int n17 = 9;
            if (i2 * 2 + 1 == (int)f5) {
                int n18 = 4;
                n16 += 4;
                n15 += 4;
                n17 -= 4;
            }
            if (i2 * 2 + 1 == n6) {
                n14 += 9;
            }
            GlStateManager.e(0.75f, 0.65f, 0.0f, f4);
            wh.aER.bha.drawTexturedModalRect((float)n16, n12, n15, 27, n17, 9);
            if (f5 > (float)n6) continue;
            GlStateManager.e(1.0f, 1.0f, 1.0f, f4);
            wh.aER.bha.drawTexturedModalRect((float)n11, n12, n14, 27, 9, 9);
        }
        GlStateManager.tR();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void a(int n2, int n3, int n4, int n5, float f2, boolean bl2) {
        if (n2 <= 0) {
            return;
        }
        GlStateManager.tQ();
        GlStateManager.e(1.0f, 1.0f, 1.0f, f2);
        GlStateManager.P(770, 771);
        int n6 = Math.max(0, Math.min(20, n3 + n2));
        int n7 = Math.max(0, n3 / 2);
        int n8 = (int)Math.ceil((float)n6 / 2.0f);
        int n9 = 16;
        int n10 = 9;
        for (int i2 = n7; i2 < n8; ++i2) {
            wi wi2 = this.alF.get(i2);
            if (wi2 == null) continue;
            int n11 = n4 + wi2.alM;
            int n12 = n5 + wi2.alN;
            int n13 = 27;
            int n14 = 52;
            int n15 = 25;
            if (bl2) {
                n14 += 36;
                n15 += 108;
            }
            if (i2 * 2 + 1 == n6) {
                n14 += 9;
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, f2 * 0.25f);
            wh.aER.bha.drawTexturedModalRect((float)n11, n12, n15, 27, 9, 9);
            GlStateManager.e(1.0f, 1.0f, 1.0f, f2);
            wh.aER.bha.drawTexturedModalRect((float)n11, n12, n14, 27, 9, 9);
        }
        GlStateManager.tR();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void ld() {
        this.alH = 0.0f;
        this.alI = 0.0f;
        this.alJ = 1;
    }
}

