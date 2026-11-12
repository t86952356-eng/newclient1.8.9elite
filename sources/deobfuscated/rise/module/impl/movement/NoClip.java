/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dh;
import hackclient.rise.ek;
import hackclient.rise.es;
import net.minecraft.block.BlockAir;
import net.minecraft.client.entity.c;
import net.minecraft.client.multiplayer.d;
import net.minecraft.client.multiplayer.j;
import net.minecraft.util.a;
import net.minecraft.util.cf;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.movement.noclip.name"}, description="module.movement.noclip.description", category=Category.MOVEMENT)
public class NoClip
extends Module {
    private final BooleanValue DI = new BooleanValue("Block", (Module)this, (Boolean)false);
    @EventLink
    public final Listener<es> DJ = es2 -> {
        if (aik.vz()) {
            es2.a(null);
            if (!(es2.df() instanceof BlockAir) && !NoClip.aER.aIY.chr.Re()) {
                double d2 = es2.dg().wt();
                double d3 = es2.dg().wu();
                double d4 = es2.dg().wx();
                if (d3 < NoClip.aER.bgK.gX) {
                    es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
                }
            }
        }
    };
    @EventLink
    public final Listener<ek> DK = dh::cF;
    @EventLink
    public final Listener<PreUpdateEvent> DL = preUpdateEvent -> {
        NoClip.aER.bgK.csp = true;
        if (((Boolean)this.DI.wD()).booleanValue()) {
            int n2 = ain.vM();
            if (n2 == -1 || aik.vz()) {
                return;
            }
            this.d(bu.class);
            bu.setSlot(n2);
            bs.a(new Vector2f(NoClip.aER.bgK.pl, 90.0f), 2.0 + Math.random(), cb.gH);
            if (bs.fk.y >= 89.0f && NoClip.aER.bhc.dzu == cf.dzy && NoClip.aER.bgK.gX == (double)NoClip.aER.bhc.dg().aqX().wu()) {
                d d2 = NoClip.aER.bgu;
                c c2 = NoClip.aER.bgK;
                j j2 = NoClip.aER.bgF;
                this.d(bu.class);
                d2.a(c2, j2, bu.bO(), NoClip.aER.bhc.dg(), NoClip.aER.bhc.dzv, NoClip.aER.bhc.daS);
                NoClip.aER.bgK.swingItem();
            }
        }
    };

    @Override
    public void onDisable() {
        NoClip.aER.bgK.csp = false;
    }
}

