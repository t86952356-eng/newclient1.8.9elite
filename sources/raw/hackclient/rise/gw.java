/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.a;
import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.bi;
import hackclient.rise.bm;
import hackclient.rise.bv;
import hackclient.rise.ci;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fg;
import hackclient.rise.fi;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.ja;
import hackclient.rise.tn;
import java.awt.Color;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.entity.b;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.util.bt;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.combat.lagbreak.name", "Lag Range", "Fake Lag"}, description="module.combat.lagbreak.description", category=gj.COMBAT)
public class gw
extends gi {
    public int ps;
    public int pt;
    private static final int pu = 6;
    private b pv;
    private boolean pw;
    private int px;
    private int py;
    private int pz;
    private float pA;
    private float pB;
    private float pC;
    private final akq pD = new akq("Max Lag Ticks", this, (Number)9, (Number)1, (Number)40, (Number)1);
    private final akq pE = new akq("Range", this, (Number)10, (Number)8, (Number)15, (Number)0.1);
    private final akq pF = new akq("Minimum Range", this, (Number)0, (Number)0, (Number)3, (Number)0.1);
    private final akp pG = new akp("Visual Mode", this).a(new akg[]{new aks("Percentage")}).a(new akg[]{new aks("Circle")}).a(new akg[]{new aks("Text")}).co("Percentage");
    private final akq pH = new akq("Circle Radius", this, (Number)16, (Number)8, (Number)40, (Number)1, () -> !this.gm());
    private final akq pI = new akq("Circle Thickness", this, (Number)1.5, (Number)0.5, (Number)5, (Number)0.1, () -> !this.gm());
    private final aki pJ = new aki("Dispatch On Attack", (gi)this, (Boolean)true);
    private final aki pK = new aki("Dispatch On Hurtime", (gi)this, (Boolean)false);
    @dm
    public final dk<ej> pL = ej2 -> {
        if (gw.aER.aIY.chu.Re()) {
            this.gl();
            return;
        }
        if (this.pt > 0) {
            bm.blink();
        }
        if (this.pt > 0 || this.py > 0) {
            float f2 = this.go();
            if (((akg)this.pG.wD()).getName().equals("Percentage")) {
                ci.a(f2, 0.75f, false, true, 10);
            } else if (this.gm()) {
                this.g(f2);
            }
        }
    };
    @dm
    public final dk<ei> pM = ei2 -> {
        r r2;
        if (gw.aER.aIY.chu.Re()) {
            this.gl();
            return;
        }
        if (gw.aER.bgK == null || gw.aER.bgF == null) {
            return;
        }
        this.pt = gw.aER.bgK.aRg - this.px - 1;
        if (this.pt > 0 && this.py > 0) {
            this.py = 0;
            this.pA = 0.0f;
            this.pz = 0;
            ci.cl();
        }
        boolean bl2 = (r2 = this.k(((Number)this.pE.wD()).doubleValue())) != null && aik.v(r2) <= 3.0 + aii.speed() / 2.0;
        boolean bl3 = r2 != null && aik.v(r2) <= 5.0 && this.a(r2, 12.0f, 20.0f);
        int n2 = r2 != null ? (int)ahj.l(9.0, 16.0) : (int)ahj.l(10.0, 18.0);
        boolean bl4 = false;
        if (this.pt >= ((Number)this.pD.wD()).intValue() || this.e(tn.class).isEnabled() || gw.aER.aIY.chu.Re() || !aii.isMoving() || r2 == null || aik.v(r2) > ((Number)this.pE.wD()).doubleValue() || ja.dj || gw.aER.bgK.Zz < 2) {
            bl4 = true;
        }
        if (!((Boolean)this.pJ.wD()).booleanValue()) {
            if (!bl4 && bl2) {
                bl4 = true;
            }
            if (!bl4 && this.pt >= n2 && !bl3) {
                bl4 = true;
            }
        }
        if (bl4) {
            this.gk();
        }
        if (r2 != null && aik.v(r2) < ((Number)this.pF.wD()).doubleValue()) {
            this.gk();
        }
        if (gw.aER.bgK.ae < 2 && ((Boolean)this.pK.wD()).booleanValue()) {
            this.gk();
        }
        if (this.pw) {
            this.gk();
            this.pw = false;
        }
    };
    @dm(cH=1)
    public final dk<fi> pN = fi2 -> {
        if (!((Boolean)this.pJ.wD()).booleanValue() || this.pt <= 0 || gw.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof c && ((c)aj2).afQ() == d.daU) {
            this.pw = true;
        }
    };
    @dm
    public final dk<fg> pO = fg2 -> {
        this.gi();
        this.py = 0;
        this.pz = 0;
        this.pA = 0.0f;
        if (gw.aER.bgK != null) {
            this.px = gw.aER.bgK.aRg;
        }
    };
    @dm
    public final dk<fs> pP = fs2 -> {
        if (gw.aER.aIY.chu.Re()) {
            this.gl();
            return;
        }
        if (this.pt > 0 || this.py > 0) {
            String string;
            float f2 = this.go();
            switch (string = ((akg)this.pG.wD()).getName()) {
                case "Percentage": {
                    ci.a(f2, 0.75f, false, true, 10);
                    break;
                }
                case "Circle": {
                    this.a((fs)fs2, f2);
                    break;
                }
                case "Text": {
                    this.gp();
                }
            }
            if (this.py > 0 && gw.aER.bgK != null && this.pz != gw.aER.bgK.aRg) {
                this.pz = gw.aER.bgK.aRg;
                --this.py;
            }
        }
    };

    @Override
    public void onEnable() {
        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13) || bi.dx == null || bi.dx.contains("hypixel")) {
            // empty if block
        }
        this.gi();
        this.py = 0;
        this.pz = 0;
        this.pA = 0.0f;
        this.pC = this.pB = ((Number)this.pH.wD()).floatValue();
        if (gw.aER.bgK != null) {
            this.px = gw.aER.bgK.aRg;
        }
    }

    @Override
    public void onDisable() {
        this.gj();
        bm.dispatch();
    }

    public boolean bd() {
        return this.pt > 0;
    }

    private void gi() {
        if (gw.aER.bgK == null) {
            return;
        }
    }

    private void gj() {
        if (this.pv != null) {
            a.a.x().c(this, this.pv);
            gw.aER.bgF.co(this.pv.getEntityId());
            this.pv = null;
        }
    }

    private void gk() {
        if (this.pt > 0) {
            this.pA = this.gn();
            this.py = 6;
            this.pz = 0;
        }
        bm.dispatch();
        bm.disable();
        if (gw.aER.bgK != null) {
            this.px = gw.aER.bgK.aRg;
        }
        this.pt = 0;
        this.gj();
    }

    private void gl() {
        if (this.pt > 0) {
            bm.dispatch();
            bm.disable();
        }
        this.py = 0;
        this.pA = 0.0f;
        this.pz = 0;
        this.pt = 0;
        this.pw = false;
        if (gw.aER.bgK != null) {
            this.px = gw.aER.bgK.aRg;
        }
        ci.stop();
    }

    private boolean gm() {
        return ((akg)this.pG.wD()).getName().equals("Circle");
    }

    private float gn() {
        int n2 = Math.max(1, ((Number)this.pD.wD()).intValue() - 1);
        return bt.I((float)this.pt / (float)n2, 0.0f, 1.0f);
    }

    private float go() {
        if (this.py <= 0) {
            return this.pt > 0 ? this.gn() : 0.0f;
        }
        float f2 = 1.0f - (float)(this.py - 1) / 6.0f;
        float f3 = 1.0f - (float)Math.pow(1.0f - f2, 3.0);
        return bt.I(this.pA + (1.0f - this.pA) * f3, 0.0f, 1.0f);
    }

    private void gp() {
        float f2 = (float)gw.aER.jY.getScaledWidth() / 2.0f;
        float f3 = (float)gw.aER.jY.getScaledHeight() / 2.0f;
        int n2 = this.rP().rQ().getRGB();
        int n3 = new Color(0, 0, 0, 200).getRGB();
        gb.ks.a(17, gd.kE).c("Blinking: " + this.pt, f2 + 1.0f, f3 + 10.0f + 1.0f, n3);
        gb.ks.a(17, gd.kE).c("Blinking: " + this.pt, f2, f3 + 10.0f, n2);
    }

    private void a(fs fs2, float f2) {
        int n2 = fs2.dx().getScaledWidth();
        int n3 = fs2.dx().getScaledHeight();
        float f3 = (float)n2 / 2.0f;
        float f4 = (float)n3 / 2.0f;
        float f5 = ahj.e(this.pC, this.pB, gw.aER.bgC.bWY);
        double d2 = 360.0 * (double)f2;
        double d3 = 270.0 + d2;
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GlStateManager.tQ();
        GlStateManager.h(770, 771, 1, 0);
        GL11.glLineWidth((float)((Number)this.pI.wD()).floatValue());
        this.a(f3, f4, f5, 270.0, d3, this.rP().rQ(), 1.0f);
        GlStateManager.tR();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopMatrix();
        GlStateManager.JX();
    }

    private void g(float f2) {
        float f3 = ((Number)this.pH.wD()).floatValue() + f2 * 5.0f;
        this.pC = this.pB;
        this.pB = ahj.e(this.pB, f3, 0.35f);
    }

    private void a(float f2, float f3, float f4, double d2, double d3, Color color, float f5) {
        GL11.glBegin((int)3);
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)f5);
        double d4 = d2 <= d3 ? 0.75 : -0.75;
        double d5 = d2;
        while (d4 > 0.0 ? d5 <= d3 : d5 >= d3) {
            double d6 = Math.toRadians(d5);
            float f6 = f2 + (float)(Math.cos(d6) * (double)f4);
            float f7 = f3 + (float)(Math.sin(d6) * (double)f4);
            GL11.glVertex2f((float)f6, (float)f7);
            d5 += d4;
        }
        d5 = Math.toRadians(d3);
        GL11.glVertex2f((float)(f2 + (float)(Math.cos(d5) * (double)f4)), (float)(f3 + (float)(Math.sin(d5) * (double)f4)));
        GL11.glEnd();
    }

    private r k(double d2) {
        try {
            List<r> list = bv.f(d2);
            if (list == null || list.isEmpty()) {
                return null;
            }
            list.sort(Comparator.comparingDouble(r2 -> aik.v(r2)));
            return list.get(0);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private boolean a(r r2, float f2, float f3) {
        double d2 = gw.aER.bgK.gW - r2.gW;
        double d3 = gw.aER.bgK.gY - r2.gY;
        double d4 = gw.aER.bgK.gX + (double)gw.aER.bgK.getEyeHeight() - (r2.gX + (double)r2.getEyeHeight());
        double d5 = Math.sqrt(d2 * d2 + d3 * d3);
        float f4 = (float)(Math.toDegrees(Math.atan2(d3, d2)) - 90.0);
        float f5 = (float)(-Math.toDegrees(Math.atan2(d4, d5)));
        float f6 = Math.abs(bt.bN(r2.pl - f4));
        float f7 = Math.abs(bt.bN(r2.pm - f5));
        return f6 <= f2 && f7 <= f3;
    }
}

