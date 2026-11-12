/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.player;

import hackclient.rise.aks;
import hackclient.rise.c;
import lombok.Generated;
import net.minecraft.client.entity.b;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.other.cheatdetector.name"}, description="module.other.cheatdetector.description", category=Category.PLAYER)
public final class CheatDetector
extends Module {
    private final c Uk = new c();
    public ModeValue Ul = new ModeValue("Alert Type", this).a(new Mode[]{new aks("ClientSide")}).a(new Mode[]{new aks("ServerSide")}).co("ClientSide");
    @EventLink
    public final Listener<PreMotionEvent> Um = preMotionEvent -> Client.a.n().F();
    @EventLink
    public final Listener<PacketReceiveEvent> Un = packetReceiveEvent -> Client.a.n().M.values().forEach(m2 -> {
        if (m2 == null) {
            return;
        }
        try {
            m2.a(packetReceiveEvent.dq());
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
    });

    @Override
    public void onDisable() {
        Client.a.n().M.clear();
    }

    @Override
    public void onEnable() {
        if (CheatDetector.aER.bgF == null) {
            return;
        }
        Client.a.n().M.clear();
        CheatDetector.aER.bgF.dCY.forEach(a2 -> {
            if (a2 instanceof b && a2 != CheatDetector.aER.bgK) {
                Client.a.n().H().b((b)a2);
            }
        });
    }

    @Generated
    public c I() {
        return this.Uk;
    }
}

