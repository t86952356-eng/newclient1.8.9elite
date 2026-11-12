/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bm;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.fh;
import hackclient.rise.fs;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.go;
import hackclient.rise.hq;
import hackclient.rise.in;
import hackclient.rise.ja;
import hackclient.rise.jc;
import hackclient.rise.mh;
import hackclient.rise.ot;
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

@gl(aliases={"module.combat.legitreach.name", "Back Track"}, description="module.combat.legitreach.description", category=gj.COMBAT)
public final class gx
extends gi {
    public static a pQ;
    public akq pR = new akq("Max Ping Spoof", this, (Number)1000, (Number)50, (Number)10000, (Number)1);
    public aki pS = new aki("Render Real Location", (gi)this, (Boolean)true);
    public aki pT = new aki("Watchdog Mode", (gi)this, (Boolean)false);
    private da pU = new da(0.0, 0.0, 0.0);
    private final afj pV = new afj(afk.aGW, 50L);
    private final afj pW = new afj(afk.aGW, 50L);
    private final afj pX = new afj(afk.aGW, 50L);
    public c pY;
    public boolean pZ;
    @dm
    public final dk<eg> qa = eg2 -> {
        boolean bl2;
        mh mh2;
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
        boolean bl4 = bl3 = (mh2 = this.e(mh.class)).isEnabled() && mh2.hl().wD() instanceof ot && (Boolean)((ot)mh2.hl().wD()).PL.wD() != false;
        if (this.pY == null || !gx.aER.bgK.cup && !this.e(go.class).isEnabled() || bl3 || jc.dj || ja.dj || in.dj || hq.dj) {
            return;
        }
        double d2 = (double)this.pY.width / 2.0;
        double d3 = this.pY.height;
        pQ = new a(this.pU.dAG - d2, this.pU.dAH, this.pU.dAI - d2, this.pU.dAG + d2, this.pU.dAH + d3, this.pU.dAI + d2);
        double d4 = this.pU.N(gx.aER.bgK);
        double d5 = this.pY.S(gx.aER.bgK);
        boolean bl5 = ((Boolean)this.pT.wD()).booleanValue() ? d4 > d5 && d4 > 2.5 && d4 < 4.4 && !jc.dj && !ja.dj && !in.dj && !hq.dj && gx.aER.bgK.ae > 2 : (bl2 = d4 > d5 && d4 > 2.5 && d4 < 6.0 && !ja.dj && !in.dj && !hq.dj);
        if (bl2) {
            bm.a(((Number)this.pR.wD()).intValue(), true, true, false, true);
        } else {
            bm.disable();
            bm.dispatch();
        }
    };
    @dm
    public final dk<fh> qb = fh2 -> {
        z z2;
        aj<?> aj2 = fh2.dq();
        if (this.pY == null) {
            return;
        }
        if (aj2 instanceof v) {
            v v2 = (v)aj2;
            if (v2.crw == this.pY.getEntityId()) {
                this.pU.dAG += (double)v2.agR() / 32.0;
                this.pU.dAH += (double)v2.agS() / 32.0;
                this.pU.dAI += (double)v2.agT() / 32.0;
            }
        } else if (aj2 instanceof z && (z2 = (z)aj2).getEntityId() == this.pY.getEntityId()) {
            this.pU = new da((double)z2.wt() / 32.0, (double)z2.wu() / 32.0, (double)z2.wx() / 32.0);
        }
    };
    @dm
    public final dk<fs> qc = fs2 -> {
        boolean bl2;
        if (this.pY == null || gx.aER.bgK == null) {
            return;
        }
        double d2 = this.pU.N(gx.aER.bgK);
        double d3 = this.pY.S(gx.aER.bgK);
        boolean bl3 = ((Boolean)this.pT.wD()).booleanValue() ? d2 > d3 && d2 > 2.8 && d2 < 4.4 && !jc.dj : (bl2 = d2 > d3 && d2 > 2.5 && d2 < 6.0);
        if (gx.aER.bgK.cup && bl2 && d2 > 3.0 && ((Boolean)this.pT.wD()).booleanValue()) {
            gx.aER.fontRendererObj.b("Reach: " + d2, (double)gx.aER.jY.getScaledWidth() / 2.0, (double)gx.aER.jY.getScaledHeight() / 2.0 + 20.0, -1);
        }
    };
    @dm
    public final dk<ft> qd = ft2 -> {
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
        ait.g(gx.aER.bgK.Us().ae(-gx.aER.bgK.gW, -gx.aER.bgK.gX, -gx.aER.bgK.gY).ae(this.pV.sV(), this.pW.sV(), this.pX.sV()).ad(d2, d2, d2));
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GL11.glDepthMask((boolean)true);
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
    };
}

