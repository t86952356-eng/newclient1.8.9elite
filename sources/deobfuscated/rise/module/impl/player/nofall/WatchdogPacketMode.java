/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.bd;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.j;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.e;
import net.minecraft.util.b;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.exploit.Disabler;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.NoFall;
import rise.module.impl.player.Scaffold;
import rise.value.BooleanValue;

public class WatchdogPacketMode
extends Mode<NoFall> {
    public final BooleanValue ajE = new BooleanValue("Prediction", (Mode<?>)this, (Boolean)false);
    @EventLink
    public final Listener<PreMotionEvent> ajF = preMotionEvent -> {
        boolean bl2 = false;
        for (int i2 = 0; i2 <= 200; ++i2) {
            j j2 = aik.aER.bgF;
            b b2 = new b(WatchdogPacketMode.aER.bgK.gW, WatchdogPacketMode.aER.bgK.gX - (double)i2, WatchdogPacketMode.aER.bgK.gY);
            Block block = j2.L(b2).df();
            if (block != Blocks.cLc || WatchdogPacketMode.aER.bgK.aO) {
                bl2 = false;
                break;
            }
            bl2 = true;
        }
        if (!(!((double)bd.cY > 3.1 + WatchdogPacketMode.aER.bgK.ue) || bl2 || this.e(Scaffold.class).isEnabled() || this.e(LongJump.class).isEnabled() || this.e(Flight.class).isEnabled() && ((Boolean)this.ajE.wD()).booleanValue() || this.e(Speed.class).isEnabled() && ((Boolean)this.ajE.wD()).booleanValue())) {
            if (!((Boolean)this.e(Disabler.class).wu.wD()).booleanValue() || !this.e(Disabler.class).isEnabled()) {
                preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-13);
            }
            ahn.m(new e(true));
            WatchdogPacketMode.aER.bgC.dAp = 0.5f;
            bd.cY = 0.0f;
        } else if (!(!((double)bd.cY > 3.1 + WatchdogPacketMode.aER.bgK.ue) || this.e(Scaffold.class).isEnabled() || this.e(Flight.class).isEnabled() && ((Boolean)this.ajE.wD()).booleanValue() || this.e(LongJump.class).isEnabled() && ((Mode)Client.a.g().c(LongJump.class).DD.wD()).getName().equals("Watchdog 2"))) {
            if (!bl2 || this.e(LongJump.class).isEnabled() && ((Mode)Client.a.g().c(LongJump.class).DD.wD()).getName().equals("Watchdog Fire Ball 2")) {
                if (!((Boolean)this.e(Disabler.class).wu.wD()).booleanValue() || !this.e(Disabler.class).isEnabled()) {
                    preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-13);
                }
                ahn.m(new e(true));
                WatchdogPacketMode.aER.bgC.dAp = 0.5f;
                bd.cY = 0.0f;
            }
        } else if (((Mode)Client.a.g().c(LongJump.class).DD.wD()).getName().equals("Watchdog 2") && this.e(LongJump.class).isEnabled() && (double)bd.cY > 4.0 + WatchdogPacketMode.aER.bgK.ue) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-13);
            ahn.m(new e(true));
            WatchdogPacketMode.aER.bgC.dAp = 0.5f;
            bd.cY = 0.0f;
        }
        if ((double)bd.cY > 3.1 + WatchdogPacketMode.aER.bgK.ue && !bl2 && this.e(Speed.class).isEnabled() && ((Boolean)this.ajE.wD()).booleanValue() && (!((Boolean)this.e(Disabler.class).wu.wD()).booleanValue() || !this.e(Disabler.class).isEnabled())) {
            preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-13);
            ahn.m(new e(true));
            WatchdogPacketMode.aER.bgC.dAp = 0.5f;
            bd.cY = 0.0f;
        }
    };

    public WatchdogPacketMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

