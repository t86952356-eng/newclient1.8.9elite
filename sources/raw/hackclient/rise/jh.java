/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import hackclient.rise.ait;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ea;
import hackclient.rise.ft;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.c;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.l;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.s;
import net.minecraft.tileentity.t;
import net.minecraft.tileentity.w;
import net.minecraft.tileentity.y;
import net.minecraft.tileentity.z;
import net.minecraft.util.a;
import net.minecraft.util.ah;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.exploit.ghosthand.name"}, description="module.exploit.ghosthand.description", category=gj.EXPLOIT)
public final class jh
extends gi {
    private final akq wQ = new akq("Range", this, (Number)5.6, (Number)1, (Number)6, (Number)0.1);
    @dm
    public final dk<ea> wR = ea2 -> {
        if (jh.aER.bgK == null || jh.aER.bgF == null) {
            return;
        }
        ce ce2 = this.l(((Number)this.wQ.wD()).doubleValue());
        if (ce2 != null) {
            jh.aER.bhc = ce2;
        }
    };
    @dm
    public final dk<ft> wS = ft2 -> {
        if (jh.aER.bgK == null || jh.aER.bgF == null) {
            return;
        }
        ce ce2 = this.l(((Number)this.wQ.wD()).doubleValue());
        if (ce2 == null) {
            return;
        }
        if (ce2.dzu == cf.dzy && ce2.dg() != null) {
            b b2 = ce2.dg();
            this.c(new a(b2, b2.C(1, 1, 1)));
            this.b(gg.kT).c(() -> this.c(new a(b2, b2.C(1, 1, 1))));
        }
    };

    private ce l(double d2) {
        Object object;
        if (jh.aER.bhc != null && jh.aER.bhc.dzu == cf.dzy && this.b((b)(object = jh.aER.bhc.dg()))) {
            return this.c((b)object);
        }
        if (jh.aER.bhc != null && jh.aER.bhc.dzu == cf.dzz && this.m(jh.aER.bhc.dzw)) {
            return jh.aER.bhc;
        }
        object = jh.aER.bgK.aQ(1.0f);
        da da2 = jh.aER.bgK.O(1.0f);
        da da3 = ((da)object).al(da2.dAG * d2, da2.dAH * d2, da2.dAI * d2);
        ce ce2 = this.a((da)object, da3, d2);
        b b2 = null;
        ce ce3 = null;
        double d3 = 0.1;
        for (double d4 = 0.0; d4 <= d2; d4 += 0.1) {
            da da4 = ((da)object).al(da2.dAG * d4, da2.dAH * d4, da2.dAI * d4);
            b b3 = new b(da4);
            if (b3.equals(b2)) continue;
            b2 = b3;
            if (!this.b(b3)) continue;
            ce3 = this.c(b3);
            break;
        }
        if (ce2 != null && ce2.dzw != null && !(ce2.dzw instanceof net.minecraft.entity.player.a) && (ce3 == null || ((da)object).x(ce2.daS) <= ((da)object).x(ce3.daS))) {
            return ce2;
        }
        if (ce3 != null) {
            return ce3;
        }
        return ce2;
    }

    private ce a(da da2, da da3, double d2) {
        float f2 = 0.2f;
        List<c> list = jh.aER.bgF.a((c)jh.aER.bgK, jh.aER.bgK.Us().ac(da3.dAG - da2.dAG, da3.dAH - da2.dAH, da3.dAI - da2.dAI).ad(1.0, 1.0, 1.0), (Predicate<? super c>)Predicates.and(ah.dvJ, c2 -> c2 != null && c2.TO()));
        ce ce2 = null;
        double d3 = d2;
        ce ce3 = null;
        double d4 = d2;
        for (c c3 : list) {
            if (!this.m(c3)) continue;
            float f3 = c3.TX() + 0.2f;
            a a2 = c3.Us().ad(f3, f3, f3);
            ce ce4 = a2.c(da2, da3);
            if (ce4 == null && !a2.o(da2)) continue;
            da da4 = ce4 != null ? ce4.daS : da2;
            double d5 = da2.x(da4);
            ce ce5 = new ce(c3, da4);
            if (c3 instanceof net.minecraft.entity.player.a) {
                if (!(d5 < d4)) continue;
                d4 = d5;
                ce3 = ce5;
                continue;
            }
            if (!(d5 < d3)) continue;
            d3 = d5;
            ce2 = ce5;
        }
        return ce2 != null ? ce2 : ce3;
    }

    private boolean m(c c2) {
        return c2 != null && c2 != jh.aER.bgK && c2.TS() && c2.TO();
    }

    private boolean b(b b2) {
        d d2 = jh.aER.bgF.K(b2);
        return d2 instanceof m || d2 instanceof w || d2 instanceof s || d2 instanceof t || d2 instanceof z || d2 instanceof y || d2 instanceof l;
    }

    private ce c(b b2) {
        return new ce(new da(b2).al(0.5, 0.5, 0.5), ao.dwr, b2);
    }

    private void c(a a2) {
        double d2 = jh.aER.BF().bVG;
        double d3 = jh.aER.BF().bVH;
        double d4 = jh.aER.BF().bVI;
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GlStateManager.JD();
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)1.0f);
        ait.e(this.rP().rQ());
        RenderGlobal.j(a2.ad(0.002, 0.002, 0.002).ae(-d2, -d3, -d4));
        GL11.glDepthMask((boolean)true);
        GlStateManager.JE();
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
    }
}

