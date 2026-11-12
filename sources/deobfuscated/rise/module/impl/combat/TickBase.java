/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.combat;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akd;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.bl;
import hackclient.rise.bm;
import hackclient.rise.bv;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import org.lwjgl.opengl.GL11;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.Render3DEvent;
import rise.event.impl.TickEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.combat.tickbase.name"}, description="module.combat.legitreach.description", category=Category.COMBAT)
public final class TickBase
extends Module {
    private ModeValue lI = new ModeValue("Mode", this).a(new Mode[]{new aks("Post")}).co("Legit");
    private akd qL = new akd(0.0, 0.0, 0.0);
    private int qM = 0;
    private int qN;
    private int qO;
    @EventLink
    Listener<TickEvent> cA = tickEvent -> {
        switch (((Mode)this.lI.wD()).getName()) {
            case "Post": {
                List<r> list;
                if (TickBase.aER.bgK.aRg <= 20) {
                    TickBase.aER.bgC.dAp = 0.5f;
                }
                --this.qM;
                if (this.qN > 0) {
                    if (this.qO > 0) {
                        --this.qO;
                    } else {
                        tickEvent.cF();
                        TickBase.aER.bgC.cancel();
                        --this.qN;
                    }
                }
                if ((list = bv.f(6.0)).isEmpty()) {
                    return;
                }
                r r2 = list.get(0);
                this.qL = this.k(r2);
                if (!(TickBase.aER.bgK.getDistance(this.qL.x, this.qL.y, this.qL.z) < 8.0) || !(aik.v(r2) > 3.0) || this.qM >= 0) break;
                int n2 = this.j(r2);
                if (n2 == -1) {
                    return;
                }
                TickBase.aER.bgC.In += n2;
                this.qN += n2;
                this.qO += n2 + 5;
                this.qM = 10;
                break;
            }
            case "Legit": {
                r r3 = bv.e(8.0);
                if (r3 == null || bb.a(false, true, false, false, false) || !(this.qL.g(r3.TN()) >= TickBase.aER.bgK.TN().g(r3.TN()))) break;
                bm.blink();
            }
        }
    };
    @EventLink
    Listener<PacketSendEvent> bC = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (!packetSendEvent.isCancelled() && aj2 instanceof e) {
            this.qL = new akd(((e)aj2).getX(), ((e)aj2).getY(), ((e)aj2).getZ());
        }
    };
    @EventLink
    Listener<Render3DEvent> hf = render3DEvent -> {
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
        akd akd2 = new akd(TickBase.aER.bgK.gW, TickBase.aER.bgK.gX, TickBase.aER.bgK.gY);
        for (n2 = 0; n2 < n3 && c2.getDistance(akd2.x, akd2.y, akd2.z) > 4.4; ++n2) {
            akd2 = aii.a(akd2, new akd(TickBase.aER.bgK.ud, 0.0, TickBase.aER.bgK.uf), (float)Math.toDegrees(aii.direction()), new Vector2f(TickBase.aER.bgK.cuV, TickBase.aER.bgK.cuW));
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
            akd2 = aii.a(akd2, new akd(d2, 0.0, d3), c2.pl, new Vector2f(0.0f, (float)bl2));
            ++n2;
        }
        return akd2;
    }
}

