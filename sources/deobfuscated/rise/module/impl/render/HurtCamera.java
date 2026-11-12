/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.abs;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.render.hurtcamera.name"}, description="module.render.hurtcamera.description", category=Category.RENDER)
public final class HurtCamera
extends Module {
    public final NumberValue aoC = new NumberValue("Intensity", this, (Number)1, (Number)0, (Number)1, (Number)0.1);
    @EventLink
    public final Listener<PacketReceiveEvent> aoD = packetReceiveEvent -> {
        t t2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == HurtCamera.aER.bgK.getEntityId()) {
            double d2 = (double)t2.dcR / 8000.0;
            double d3 = (double)t2.dcT / 8000.0;
            HurtCamera.aER.bgK.cuu = (float)(bt.y(d2, d3) * 180.0 / abs.aHM - (double)HurtCamera.aER.bgK.pl);
        }
    };

    @Override
    public void onDisable() {
        HurtCamera.aER.bgK.cuu = 0.0f;
    }
}

