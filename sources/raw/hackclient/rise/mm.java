/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ahi;
import hackclient.rise.ais;
import hackclient.rise.aix;
import hackclient.rise.akd;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fg;
import hackclient.rise.fs;
import hackclient.rise.ft;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.go;
import hackclient.rise.lw;
import hackclient.rise.mh;
import hackclient.rise.tn;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.movement.targetstrafe.name"}, description="module.movement.targetstrafe.description", category=gj.MOVEMENT)
public class mm
extends gi {
    private final akq EM = new akq("Range", this, (Number)1, (Number)0.2, (Number)6, (Number)0.1);
    private final aki EN = new aki("Hold Jump", (gi)this, (Boolean)true);
    private final aki EO = new aki("Hold Jump Speed or Flight only", (gi)this, (Boolean)true, () -> (Boolean)this.EN.wD() == false);
    private final aki EP = new aki("Auto third person camera", (gi)this, (Boolean)false);
    private final aki EQ = new aki("Circle", (gi)this, (Boolean)true);
    private final aki ER = new aki("Glow", (gi)this, (Boolean)false);
    private final akq ES = new akq("Dots", this, (Number)1, (Number)1, (Number)20, (Number)1);
    private final akq ET = new akq("Thickness", this, (Number)1.5, (Number)1, (Number)10, (Number)0.5);
    private final aki EU = new aki("Behind", (gi)this, (Boolean)false);
    private float gZ;
    private r jE;
    private boolean cp;
    private boolean EV;
    private boolean dj;
    private boolean EW = false;
    @dm(cH=1)
    public final dk<fg> EX = fg2 -> {
        this.EW = false;
        mm.aER.aIY.chP = 0;
    };
    @dm(cH=1)
    public final dk<fs> EY = fs2 -> {
        if (this.jE == null) {
            if (mm.aER.aIY.chP == 1 && this.EW) {
                this.EW = false;
                mm.aER.aIY.chP = 0;
            }
            return;
        }
        if (((Boolean)this.EP.wD()).booleanValue()) {
            mm.aER.aIY.chP = 1;
            this.EW = true;
        }
    };
    @dm(cH=3)
    public final dk<ed> EZ = ed2 -> {
        if (this.jE != null && this.dj) {
            ed2.setYaw(this.gZ);
        }
    };
    @dm(cH=3)
    public final dk<eo> Fa = eo2 -> {
        if (this.jE != null && this.dj) {
            eo2.setYaw(this.gZ);
        }
    };
    @dm(cH=3)
    public final dk<ej> Fb = ej2 -> {
        tn tn2 = this.e(tn.class);
        go go2 = this.e(go.class);
        if (tn2 == null || tn2.isEnabled() || go2 == null || !go2.isEnabled()) {
            this.dj = false;
            this.jE = null;
            return;
        }
        this.dj = true;
        mh mh2 = this.e(mh.class);
        lw lw2 = this.e(lw.class);
        if (((Boolean)this.EN.wD()).booleanValue() && !mm.aER.aIY.chq.Re() || ((Boolean)this.EO.wD()).booleanValue() && (mh2 == null || !mh2.isEnabled()) && (lw2 == null || !lw2.isEnabled())) {
            this.jE = null;
            return;
        }
        if (!(((Boolean)this.EN.wD()).booleanValue() || mh2 != null && mh2.isEnabled() || lw2 != null && lw2.isEnabled())) {
            this.jE = null;
            return;
        }
        List<r> list = bv.f(((Number)this.EM.wD()).doubleValue() + 6.0);
        if (list.isEmpty()) {
            this.jE = null;
            return;
        }
        if (((Boolean)this.EP.wD()).booleanValue()) {
            mm.aER.aIY.chP = 1;
            this.EW = true;
        }
        this.jE = list.get(0);
        if (this.jE == null) {
            return;
        }
        boolean bl2 = mm.aER.aIY.chn.Re();
        boolean bl3 = mm.aER.aIY.chp.Re();
        if (bl2 && !bl3) {
            this.cp = true;
        } else if (bl3 && !bl2) {
            this.cp = false;
        }
        this.gZ = (Boolean)this.EU.wD() != false ? this.jE.pl + 180.0f : aix.y(this.jE).getX() + (float)(135 * (this.cp ? -1 : 1));
        double d2 = ((Number)this.EM.wD()).doubleValue() + Math.random() / 100.0;
        double d3 = (double)(-bt.bx((float)Math.toRadians(this.gZ))) * d2 + this.jE.gW;
        double d4 = (double)bt.bB((float)Math.toRadians(this.gZ)) * d2 + this.jE.gY;
        mm.aER.bgK.pp = this.gZ = aix.d(new akd(d3, this.jE.gX, d4)).getX();
    };
    @dm(cH=1)
    public final dk<ft> Fc = ft2 -> {
        if (((Boolean)this.EQ.wD()).booleanValue() && this.jE != null && this.dj) {
            this.j(ft2.getPartialTicks());
        }
    };

    @Override
    public void onEnable() {
        this.EW = false;
    }

    private void j(float f2) {
        double d2 = ahi.l(this.jE.gW, this.jE.csh, f2) - mm.aER.BF().bVG;
        double d3 = ahi.l(this.jE.gX, this.jE.csi, f2) - mm.aER.BF().bVH;
        double d4 = ahi.l(this.jE.gY, this.jE.csj, f2) - mm.aER.BF().bVI;
        GlStateManager.JV();
        GlStateManager.JO();
        GlStateManager.tQ();
        GlStateManager.Jy();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.JD();
        GL11.glPointSize((float)((Number)this.ET.wD()).floatValue());
        GL11.glEnable((int)2832);
        GL11.glHint((int)3153, (int)4354);
        GL11.glBegin((int)0);
        ais.d(this.rP().rT());
        double d5 = ((Number)this.EM.wD()).doubleValue();
        double d6 = Math.PI * 2;
        for (int i2 = 0; i2 < 360; i2 += ((Number)this.ES.wD()).intValue()) {
            double d7 = (double)i2 * d6 / 360.0;
            double d8 = d2 + Math.sin(d7) * d5;
            double d9 = d4 + Math.cos(d7) * d5;
            GL11.glVertex3d((double)d8, (double)d3, (double)d9);
        }
        GL11.glEnd();
        GL11.glDisable((int)2832);
        GlStateManager.JE();
        GlStateManager.tR();
        GlStateManager.tL();
        GlStateManager.JN();
        GlStateManager.JW();
        this.b(gg.kT).c(() -> {
            if (((Boolean)this.ER.wD()).booleanValue()) {
                GlStateManager.JV();
                GlStateManager.JO();
                GlStateManager.tQ();
                GlStateManager.Jy();
                GlStateManager.h(770, 771, 1, 0);
                GlStateManager.JD();
                GL11.glPointSize((float)(((Number)this.ET.wD()).floatValue() + 2.0f));
                GL11.glEnable((int)2832);
                GL11.glHint((int)3153, (int)4354);
                GL11.glBegin((int)0);
                ais.d(this.rP().rT());
                for (int i2 = 0; i2 < 360; i2 += ((Number)this.ES.wD()).intValue()) {
                    double d7 = (double)i2 * d6 / 360.0;
                    double d8 = d2 + Math.sin(d7) * d5;
                    double d9 = d4 + Math.cos(d7) * d5;
                    GL11.glVertex3d((double)d8, (double)d3, (double)d9);
                }
                GL11.glEnd();
                GL11.glDisable((int)2832);
                GlStateManager.JE();
                GlStateManager.tL();
                GlStateManager.JN();
                GlStateManager.JW();
            }
        });
    }
}

