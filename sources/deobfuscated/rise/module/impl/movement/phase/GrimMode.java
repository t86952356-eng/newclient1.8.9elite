/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.phase;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.aks;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.movement.Phase;
import rise.value.ModeValue;
import rise.value.NumberValue;

public class GrimMode
extends Mode<Phase> {
    private final List<aj<?>> Oi = new ArrayList();
    private final ModeValue Oj = new ModeValue("Release Mode", this).a(new Mode[]{new aks("Simple")}).a(new Mode[]{new aks("Double")}).a(new Mode[]{new aks("Desync")}).a(new Mode[]{new aks("None")}).co("Simple");
    private final NumberValue Ok = new NumberValue("Semi Packets", this, (Number)2, (Number)1, (Number)15, (Number)1);
    private boolean Ol;
    private boolean Om;
    @EventLink
    public final Listener<PacketSendEvent> On = packetSendEvent -> {
        if (GrimMode.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof e) {
            this.Oi.add(aj2);
            packetSendEvent.cF();
        }
    };
    @EventLink
    public final Listener<TickEvent> Oo = tickEvent -> {
        if (GrimMode.aER.bgK == null || GrimMode.aER.bgF == null) {
            return;
        }
        boolean bl2 = aik.vz();
        if (!this.Ol && bl2) {
            double d2 = GrimMode.aER.bgK.gW;
            double d3 = GrimMode.aER.bgK.gX;
            double d4 = GrimMode.aER.bgK.gY;
            float f2 = GrimMode.aER.bgK.pl;
            float f3 = GrimMode.aER.bgK.pm;
            boolean bl3 = GrimMode.aER.bgK.aO;
            for (int i2 = 0; i2 < ((Number)this.Ok.wD()).intValue(); ++i2) {
                ahn.n(new h(d2, d3, d4, f2, f3, bl3));
            }
            this.Ol = true;
            return;
        }
        if (this.Ol && !bl2) {
            this.Om = true;
            this.toggle();
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Op = preMotionEvent -> {};
    @EventLink
    public final Listener<PacketReceiveEvent> Oq = packetReceiveEvent -> {
        if (packetReceiveEvent.dq() instanceof i) {
            // empty if block
        }
    };

    public GrimMode(String string, Phase phase) {
        super(string, phase);
    }

    @Override
    public void onEnable() {
        this.Oi.clear();
        this.Ol = false;
        this.Om = false;
    }

    @Override
    public void onDisable() {
        if (!this.Om && this.Ol) {
            if (!((Mode)this.Oj.wD()).getName().equals("None")) {
                this.A(((Mode)this.Oj.wD()).getName());
            } else {
                ahn.n(new h(GrimMode.aER.bgK.gW, GrimMode.aER.bgK.gX, GrimMode.aER.bgK.gY, GrimMode.aER.bgK.pl, GrimMode.aER.bgK.pm, GrimMode.aER.bgK.aO));
            }
        }
        if (GrimMode.aER.bgK != null && !this.Oi.isEmpty()) {
            this.Oi.forEach(ahn::n);
            this.Oi.clear();
        }
    }

    private void A(String string) {
        double d2 = GrimMode.aER.bgK.gW;
        double d3 = GrimMode.aER.bgK.gX;
        double d4 = GrimMode.aER.bgK.gY;
        float f2 = GrimMode.aER.bgK.pl;
        float f3 = GrimMode.aER.bgK.pm;
        switch (string.toLowerCase()) {
            case "simple": {
                ahn.n(new h(d2 - 5000.0, d3, d4 - 5000.0, f2, f3, false));
                ahn.n(new h(d2, d3, d4, f2, f3, GrimMode.aER.bgK.aO));
                break;
            }
            case "double": {
                ahn.n(new h(d2 - 5000.0, d3, d4 - 5000.0, f2, f3, false));
                ahn.n(new h(d2 + 5000.0, d3, d4 + 5000.0, f2, f3, false));
                ahn.n(new h(d2, d3, d4, f2, f3, GrimMode.aER.bgK.aO));
                break;
            }
            case "desync": {
                ahn.n(new h(d2, d3 + 0.0625, d4, f2, f3, false));
                ahn.n(new h(d2, d3, d4, f2, f3, false));
                ahn.n(new h(d2, d3 + 0.03125, d4, f2, f3, true));
                ahn.n(new h(d2, d3, d4, f2, f3, GrimMode.aER.bgK.aO));
                break;
            }
        }
    }
}

