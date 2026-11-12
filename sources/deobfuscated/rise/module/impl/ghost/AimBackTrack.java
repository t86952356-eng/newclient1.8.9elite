/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import hackclient.rise.aec;
import hackclient.rise.aei;
import hackclient.rise.afl;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.m;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.ghost.Reach;
import rise.util.math.Vector2f;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.aimbacktrack.name"}, description="module.ghost.aimbacktract.description", category=Category.GHOST)
public class AimBackTrack
extends Module {
    private final NumberValue AA = new NumberValue("Rotation Backtrack Amount", this, (Number)1, (Number)1, (Number)20, (Number)1);
    private aec<Vector2f> AB = new aec(1);
    private boolean pw;
    private int AC;
    @EventLink
    public final Listener<PreMotionEvent> AD = preMotionEvent -> {
        if (this.AC != ((Number)this.AA.wD()).intValue()) {
            this.AB = new aec(((Number)this.AA.wD()).intValue());
            this.AC = ((Number)this.AA.wD()).intValue();
        }
        this.AB.add(new Vector2f(preMotionEvent.getYaw(), preMotionEvent.getPitch()));
        this.pw = false;
    };
    @EventLink
    public final Listener<PacketSendEvent> AE = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof m && AimBackTrack.aER.bhc.dzu == cf.dzx) {
            for (Vector2f vector2f : this.AB) {
                Reach reach = this.e(Reach.class);
                ce ce2 = aei.c(vector2f, reach.isEnabled() ? 3.0 + ((Number)reach.BQ.wD()).doubleValue() : 3.0);
                if (ce2.dzw == null || this.pw || !(ce2.dzw instanceof r)) continue;
                AttackEvent attackEvent = new AttackEvent((r)ce2.dzw);
                Client.a.e().d(attackEvent);
                if (attackEvent.isCancelled()) {
                    return;
                }
                AimBackTrack.aER.bgu.a(AimBackTrack.aER.bgK, ce2.dzw);
            }
        }
    };
    @EventLink
    public final Listener<AttackEvent> AF = attackEvent -> {
        if (this.pw) {
            attackEvent.cF();
        }
        this.pw = true;
    };

    @Override
    public void onEnable() {
        afl.b("this is a blatant module", new Object[0]);
    }
}

