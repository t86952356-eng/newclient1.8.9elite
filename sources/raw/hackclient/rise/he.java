/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.bl;
import hackclient.rise.bm;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.fi;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.combat.tickbase.name"}, description="module.combat.legitreach.description", category=gj.COMBAT)
public final class he
extends gi {
    private akp lI = new akp("Mode", this).a(new akg[]{new aks("Post")}).co("Legit");
    private akd qL = new akd(0.0, 0.0, 0.0);
    private int qM = 0;
    private int qN;
    private int qO;
    @dm
    dk<fe> cA = fe2 -> {
        switch (((akg)this.lI.wD()).getName()) {
            case "Post": {
                List<r> list;
                if (he.aER.bgK.aRg <= 20) {
                    he.aER.bgC.dAp = 0.5f;
                }
                --this.qM;
                if (this.qN > 0) {
                    if (this.qO > 0) {
                        --this.qO;
                    } else {
                        fe2.cF();
                        he.aER.bgC.cancel();
                        --this.qN;
                    }
                }
                if ((list = bv.f(6.0)).isEmpty()) {
                    return;
                }
                r r2 = list.get(0);
                this.qL = this.k(r2);
                if (!(he.aER.bgK.getDistance(this.qL.x, this.qL.y, this.qL.z) < 8.0) || !(aik.v(r2) > 3.0) || this.qM >= 0) break;
                int n2 = this.j(r2);
                if (n2 == -1) {
                    return;
                }
                he.aER.bgC.In += n2;
                this.qN += n2;
                this.qO += n2 + 5;
                this.qM = 10;
                break;
            }
            case "Legit": {
                r r3 = bv.e(8.0);
                if (r3 == null || bb.a(false, true, false, false, false) || !(this.qL.g(r3.TN()) >= he.aER.bgK.TN().g(r3.TN()))) break;
                bm.blink();
            }
        }
    };
    @dm
    dk<fi> bC = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (!fi2.isCancelled() && aj2 instanceof e) {
            this.qL = new akd(((e)aj2).getX(), ((e)aj2).getY(), ((e)aj2).getZ());
        }
    };
    @dm
    dk<ft> hf = ft2 -> {
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GL11.glDepthMask((boolean)false);
        double d2 = 0.14;
        ait.e(ais.d(this.rP().rQ(), 50));
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GL11.glDepthMask((boolean)true);
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
    };

    int j(c c2) {
        int n2;
        int n3 = 10;
        akd akd2 = new akd(he.aER.bgK.gW, he.aER.bgK.gX, he.aER.bgK.gY);
        for (n2 = 0; n2 < n3 && c2.getDistance(akd2.x, akd2.y, akd2.z) > 4.4; ++n2) {
            akd2 = aii.a(akd2, new akd(he.aER.bgK.ud, 0.0, he.aER.bgK.uf), (float)Math.toDegrees(aii.direction()), new akb(he.aER.bgK.cuV, he.aER.bgK.cuW));
        }
        return n2 == n3 ? -1 : n2;
    }

    akd k(c c2) {
        akd akd2 = new akd(c2.gW, c2.gX, c2.gY);
        int n2 = 0;
        while ((long)n2 <= bl.getPing() / 50L) {
            double d2 = c2.gW - c2.csh;
            double d3 = c2.gY - c2.csj;
            boolean bl2 = d3 != 0.0 || d2 != 0.0;
            akd2 = aii.a(akd2, new akd(d2, 0.0, d3), c2.pl, new akb(0.0f, (float)bl2));
            ++n2;
        }
        return akd2;
    }
}

