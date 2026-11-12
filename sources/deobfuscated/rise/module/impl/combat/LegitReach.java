/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.combat;

import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.bm;
import hackclient.rise.bv;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.z;
import net.minecraft.util.a;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.Render2DEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.KillAura;
import rise.module.impl.combat.velocity.GrimMode;
import rise.module.impl.combat.velocity.GrimReduceMode;
import rise.module.impl.combat.velocity.WatchdogMode;
import rise.module.impl.combat.velocity.WatchdogPredictionMode;
import rise.module.impl.movement.Speed;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.combat.legitreach.name", "Back Track"}, description="module.combat.legitreach.description", category=Category.COMBAT)
public final class LegitReach
extends Module {
    public static a pQ;
    public NumberValue pR = new NumberValue("Max Ping Spoof", this, (Number)1000, (Number)50, (Number)10000, (Number)1);
    public BooleanValue pS = new BooleanValue("Render Real Location", (Module)this, (Boolean)true);
    public BooleanValue pT = new BooleanValue("Watchdog Mode", (Module)this, (Boolean)false);
    private da pU = new da(0.0, 0.0, 0.0);
    private final afj pV = new afj(afk.aGW, 50L);
    private final afj pW = new afj(afk.aGW, 50L);
    private final afj pX = new afj(afk.aGW, 50L);
    public c pY;
    public boolean pZ;
    @EventLink
    public final Listener<PostMotionEvent> qa = postMotionEvent -> {
        boolean bl2;
        Speed speed;
        boolean bl3;
        List<r> list = bv.f(9.0);
        if (list.isEmpty()) {
            this.pZ = true;
            this.pY = null;
            return;
        }
        c c2 = list.get(0);
        if (c2 != this.pY) {
            this.pY = c2;
            this.pU.dAG = c2.gW;
            this.pU.dAH = c2.gX;
            this.pU.dAI = c2.gY;
        }
        boolean bl4 = bl3 = (speed = this.e(Speed.class)).isEnabled() && speed.hl().wD() instanceof rise.module.impl.movement.speed.GrimMode && (Boolean)((rise.module.impl.movement.speed.GrimMode)speed.hl().wD()).PL.wD() != false;
        if (this.pY == null || !LegitReach.aER.bgK.cup && !this.e(KillAura.class).isEnabled() || bl3 || WatchdogMode.dj || WatchdogPredictionMode.dj || GrimMode.dj || GrimReduceMode.dj) {
            return;
        }
        double d2 = (double)this.pY.width / 2.0;
        double d3 = this.pY.height;
        pQ = new a(this.pU.dAG - d2, this.pU.dAH, this.pU.dAI - d2, this.pU.dAG + d2, this.pU.dAH + d3, this.pU.dAI + d2);
        double d4 = this.pU.N(LegitReach.aER.bgK);
        double d5 = this.pY.S(LegitReach.aER.bgK);
        boolean bl5 = ((Boolean)this.pT.wD()).booleanValue() ? d4 > d5 && d4 > 2.5 && d4 < 4.4 && !WatchdogMode.dj && !WatchdogPredictionMode.dj && !GrimMode.dj && !GrimReduceMode.dj && LegitReach.aER.bgK.ae > 2 : (bl2 = d4 > d5 && d4 > 2.5 && d4 < 6.0 && !WatchdogPredictionMode.dj && !GrimMode.dj && !GrimReduceMode.dj);
        if (bl2) {
            bm.a(((Number)this.pR.wD()).intValue(), true, true, false, true);
        } else {
            bm.disable();
            bm.dispatch();
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> qb = packetReceiveEvent -> {
        z z2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (this.pY == null) {
            return;
        }
        if (aj2 instanceof v) {
            v v2 = (v)aj2;
            if (v2.entityId == this.pY.getEntityId()) {
                this.pU.dAG += (double)v2.agR() / 32.0;
                this.pU.dAH += (double)v2.agS() / 32.0;
                this.pU.dAI += (double)v2.agT() / 32.0;
            }
        } else if (aj2 instanceof z && (z2 = (z)aj2).getEntityId() == this.pY.getEntityId()) {
            this.pU = new da((double)z2.wt() / 32.0, (double)z2.wu() / 32.0, (double)z2.wx() / 32.0);
        }
    };
    @EventLink
    public final Listener<Render2DEvent> qc = render2DEvent -> {
        boolean bl2;
        if (this.pY == null || LegitReach.aER.bgK == null) {
            return;
        }
        double d2 = this.pU.N(LegitReach.aER.bgK);
        double d3 = this.pY.S(LegitReach.aER.bgK);
        boolean bl3 = ((Boolean)this.pT.wD()).booleanValue() ? d2 > d3 && d2 > 2.8 && d2 < 4.4 && !WatchdogMode.dj : (bl2 = d2 > d3 && d2 > 2.5 && d2 < 6.0);
        if (LegitReach.aER.bgK.cup && bl2 && d2 > 3.0 && ((Boolean)this.pT.wD()).booleanValue()) {
            LegitReach.aER.fontRendererObj.b("Reach: " + d2, (double)LegitReach.aER.jY.getScaledWidth() / 2.0, (double)LegitReach.aER.jY.getScaledHeight() / 2.0 + 20.0, -1);
        }
    };
    @EventLink
    public final Listener<Render3DEvent> qd = render3DEvent -> {
        if (this.pY == null || !((Boolean)this.pS.wD()).booleanValue()) {
            return;
        }
        if (((Boolean)this.pT.wD()).booleanValue()) {
            this.pV.h(0L);
            this.pW.h(0L);
            this.pX.h(0L);
        } else {
            this.pV.h(150L);
            this.pW.h(150L);
            this.pX.h(150L);
        }
        this.pV.Q(this.pU.dAG);
        this.pW.Q(this.pU.dAH);
        this.pX.Q(this.pU.dAI);
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GL11.glDepthMask((boolean)false);
        double d2 = 0.14;
        ait.e(ais.d(this.rP().rQ(), 50));
        ait.g(LegitReach.aER.bgK.Us().ae(-LegitReach.aER.bgK.gW, -LegitReach.aER.bgK.gX, -LegitReach.aER.bgK.gY).ae(this.pV.sV(), this.pW.sV(), this.pX.sV()).ad(d2, d2, d2));
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GL11.glDepthMask((boolean)true);
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
    };
}

