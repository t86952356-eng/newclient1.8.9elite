/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ahn;
import hackclient.rise.ahx;
import hackclient.rise.aib;
import hackclient.rise.aix;
import hackclient.rise.akd;
import hackclient.rise.aks;
import hackclient.rise.be;
import hackclient.rise.fg;
import java.util.Collections;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.entity.player.i;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.w;
import net.minecraft.network.play.server.c;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.other.nuker.name"}, description="module.other.nuker.description", category=Category.PLAYER)
public final class Nuker
extends Module {
    private final ModeValue Vx = new ModeValue("Mode", this).a(new Mode[]{new aks("Nearby")}).a(new Mode[]{new aks("Teleport")}).co("Nearby");
    private final NumberValue Vy = new NumberValue("Delay", this, (Number)150, (Number)0, (Number)5000, (Number)50);
    private final NumberValue Vz = new NumberValue("Range", this, (Number)4, (Number)1, (Number)6, (Number)0.5);
    private final BooleanValue VA = new BooleanValue("Rotations", (Module)this, (Boolean)false);
    private final BooleanValue VB = new BooleanValue("Scatter", (Module)this, (Boolean)false);
    private final BooleanValue VC = new BooleanValue("Swing", (Module)this, (Boolean)false);
    private final a VD = new a();
    @EventLink
    public final Listener<PreMotionEvent> VE = preMotionEvent -> {
        if (be.aY()) {
            return;
        }
        double d2 = ((Number)this.Vz.wD()).doubleValue();
        switch (((Mode)this.Vx.wD()).getName()) {
            case "Nearby": {
                if (!this.VD.T(((Number)this.Vy.wD()).longValue())) break;
                new Thread(() -> this.b(d2, preMotionEvent.getPosX(), preMotionEvent.getPosY(), preMotionEvent.getPosZ())).start();
                this.VD.aX();
                break;
            }
            case "Teleport": {
                if (!Nuker.aER.aIY.chu.Re() || !this.VD.T(((Number)this.Vy.wD()).longValue())) break;
                b b2 = Nuker.aER.bgK.b(999.0, 1.0f).dg();
                if (Nuker.aER.bgF.L(b2).df() instanceof BlockAir) {
                    return;
                }
                if (Nuker.aER.bgK.cIt.cJL && !Nuker.aER.bgK.cIt.cJK) {
                    i i2 = Nuker.aER.bgK.cIt;
                    i2.cJK = true;
                    ahn.n(new w(i2));
                }
                new Thread(() -> {
                    List<aib> list = ahx.a(new aib(preMotionEvent.getPosX(), preMotionEvent.getPosY(), preMotionEvent.getPosZ()), new aib(b2.wt(), b2.wu(), b2.wx()), false);
                    if (list == null) {
                        return;
                    }
                    for (aib aib2 : list) {
                        ahn.n(new f(aib2.getX(), aib2.getY(), aib2.getZ(), false));
                    }
                    this.b(d2, b2.wt(), b2.wu(), b2.wx());
                    Collections.reverse(list);
                    for (aib aib2 : list) {
                        ahn.n(new f(aib2.getX(), aib2.getY(), aib2.getZ(), false));
                    }
                }).start();
                this.VD.aX();
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> VF = packetReceiveEvent -> {
        c c2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof c && !(c2 = (c)aj2).isChat() && c2.DM().arq().equals("You can't build outside the plot!")) {
            packetReceiveEvent.cF();
        }
    };
    @EventLink
    public final Listener<fg> VG = fg2 -> this.toggle();

    private void b(double d2, double d3, double d4, double d5) {
        for (double d6 = -d2; d6 < d2; d6 += 1.0) {
            for (double d7 = d2; d7 > -d2; d7 -= 1.0) {
                for (double d8 = -d2; d8 < d2; d8 += 1.0) {
                    b b2;
                    Block block;
                    if (((Boolean)this.VB.wD()).booleanValue() && (Nuker.aER.bgK.aRg % 2 == 0 ? d6 : d8) % 2.0 != 0.0 || (block = Nuker.aER.bgF.L(b2 = new b(d3 + d6, d4 + d7, d5 + d8)).df()) instanceof BlockAir) continue;
                    if (((Boolean)this.VA.wD()).booleanValue()) {
                        Vector2f vector2f = aix.d(new akd(b2.wt(), b2.wu(), b2.wx()));
                        ahn.n(new g(vector2f.x, vector2f.y, false));
                    }
                    ahn.n(new net.minecraft.network.play.client.i(j.daZ, b2, ao.dwr));
                    if (!((Boolean)this.VC.wD()).booleanValue()) continue;
                    Nuker.aER.bgK.swingItem();
                }
            }
        }
    }
}

