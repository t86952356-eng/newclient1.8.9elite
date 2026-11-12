/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.movement;

import hackclient.rise.ahi;
import hackclient.rise.ais;
import hackclient.rise.aix;
import hackclient.rise.akd;
import hackclient.rise.bv;
import hackclient.rise.fg;
import hackclient.rise.gg;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import org.lwjgl.opengl.GL11;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;
import rise.event.impl.Render3DEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.Scaffold;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.movement.targetstrafe.name"}, description="module.movement.targetstrafe.description", category=Category.MOVEMENT)
public class TargetStrafe
extends Module {
    private final NumberValue EM = new NumberValue("Range", this, (Number)1, (Number)0.2, (Number)6, (Number)0.1);
    private final BooleanValue EN = new BooleanValue("Hold Jump", (Module)this, (Boolean)true);
    private final BooleanValue EO = new BooleanValue("Hold Jump Speed or Flight only", (Module)this, (Boolean)true, () -> (Boolean)this.EN.wD() == false);
    private final BooleanValue EP = new BooleanValue("Auto third person camera", (Module)this, (Boolean)false);
    private final BooleanValue EQ = new BooleanValue("Circle", (Module)this, (Boolean)true);
    private final BooleanValue ER = new BooleanValue("Glow", (Module)this, (Boolean)false);
    private final NumberValue ES = new NumberValue("Dots", this, (Number)1, (Number)1, (Number)20, (Number)1);
    private final NumberValue ET = new NumberValue("Thickness", this, (Number)1.5, (Number)1, (Number)10, (Number)0.5);
    private final BooleanValue EU = new BooleanValue("Behind", (Module)this, (Boolean)false);
    private float gZ;
    private r jE;
    private boolean cp;
    private boolean EV;
    private boolean dj;
    private boolean EW = false;
    @EventLink(cH=1)
    public final Listener<fg> EX = fg2 -> {
        this.EW = false;
        TargetStrafe.aER.aIY.chP = 0;
    };
    @EventLink(cH=1)
    public final Listener<Render2DEvent> EY = render2DEvent -> {
        if (this.jE == null) {
            if (TargetStrafe.aER.aIY.chP == 1 && this.EW) {
                this.EW = false;
                TargetStrafe.aER.aIY.chP = 0;
            }
            return;
        }
        if (((Boolean)this.EP.wD()).booleanValue()) {
            TargetStrafe.aER.aIY.chP = 1;
            this.EW = true;
        }
    };
    @EventLink(cH=3)
    public final Listener<JumpEvent> EZ = jumpEvent -> {
        if (this.jE != null && this.dj) {
            jumpEvent.setYaw(this.gZ);
        }
    };
    @EventLink(cH=3)
    public final Listener<StrafeEvent> Fa = strafeEvent -> {
        if (this.jE != null && this.dj) {
            strafeEvent.setYaw(this.gZ);
        }
    };
    @EventLink(cH=3)
    public final Listener<PreUpdateEvent> Fb = preUpdateEvent -> {
        Scaffold scaffold = this.e(Scaffold.class);
        KillAura killAura = this.e(KillAura.class);
        if (scaffold == null || scaffold.isEnabled() || killAura == null || !killAura.isEnabled()) {
            this.dj = false;
            this.jE = null;
            return;
        }
        this.dj = true;
        Speed speed = this.e(Speed.class);
        Flight flight = this.e(Flight.class);
        if (((Boolean)this.EN.wD()).booleanValue() && !TargetStrafe.aER.aIY.chq.Re() || ((Boolean)this.EO.wD()).booleanValue() && (speed == null || !speed.isEnabled()) && (flight == null || !flight.isEnabled())) {
            this.jE = null;
            return;
        }
        if (!(((Boolean)this.EN.wD()).booleanValue() || speed != null && speed.isEnabled() || flight != null && flight.isEnabled())) {
            this.jE = null;
            return;
        }
        List<r> list = bv.f(((Number)this.EM.wD()).doubleValue() + 6.0);
        if (list.isEmpty()) {
            this.jE = null;
            return;
        }
        if (((Boolean)this.EP.wD()).booleanValue()) {
            TargetStrafe.aER.aIY.chP = 1;
            this.EW = true;
        }
        this.jE = list.get(0);
        if (this.jE == null) {
            return;
        }
        boolean bl2 = TargetStrafe.aER.aIY.chn.Re();
        boolean bl3 = TargetStrafe.aER.aIY.chp.Re();
        if (bl2 && !bl3) {
            this.cp = true;
        } else if (bl3 && !bl2) {
            this.cp = false;
        }
        this.gZ = (Boolean)this.EU.wD() != false ? this.jE.pl + 180.0f : aix.y(this.jE).getX() + (float)(135 * (this.cp ? -1 : 1));
        double d2 = ((Number)this.EM.wD()).doubleValue() + Math.random() / 100.0;
        double d3 = (double)(-bt.bx((float)Math.toRadians(this.gZ))) * d2 + this.jE.gW;
        double d4 = (double)bt.bB((float)Math.toRadians(this.gZ)) * d2 + this.jE.gY;
        TargetStrafe.aER.bgK.pp = this.gZ = aix.d(new akd(d3, this.jE.gX, d4)).getX();
    };
    @EventLink(cH=1)
    public final Listener<Render3DEvent> Fc = render3DEvent -> {
        if (((Boolean)this.EQ.wD()).booleanValue() && this.jE != null && this.dj) {
            this.j(render3DEvent.getPartialTicks());
        }
    };

    @Override
    public void onEnable() {
        this.EW = false;
    }

    private void j(float f2) {
        double d2 = ahi.l(this.jE.gW, this.jE.csh, f2) - TargetStrafe.aER.BF().bVG;
        double d3 = ahi.l(this.jE.gX, this.jE.csi, f2) - TargetStrafe.aER.BF().bVH;
        double d4 = ahi.l(this.jE.gY, this.jE.csj, f2) - TargetStrafe.aER.BF().bVI;
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

