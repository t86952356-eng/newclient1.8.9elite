/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.antivoid;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akd;
import hackclient.rise.bc;
import hackclient.rise.bd;
import hackclient.rise.bm;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.j;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.a;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.s;
import net.minecraft.util.b;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.longjump.Watchdog2Mode;
import rise.module.impl.player.AntiVoid;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2f;
import rise.value.NumberValue;

public class WatchdogMode
extends Mode<AntiVoid> {
    private akd Ft;
    private akd EC;
    private boolean aiD;
    private boolean aiE;
    private int aiF;
    private boolean bh;
    private final NumberValue aiG = new NumberValue("Distance", this, (Number)3, (Number)0, (Number)10, (Number)0.1);
    @EventLink(cH=1)
    public final Listener<MoveEvent> aiH = moveEvent -> {
        if (WatchdogMode.aER.bgK.aRg <= 75) {
            return;
        }
        if (this.e(Flight.class).isEnabled()) {
            return;
        }
        boolean bl2 = false;
        this.bh = aii.enoughMovementForSprinting();
        int n2 = 0;
        while ((double)n2 <= ((Number)this.aiG.wD()).doubleValue() * 40.0) {
            j j2 = aik.aER.bgF;
            akd akd2 = aii.a(WatchdogMode.aER.bgK, new Vector2f(WatchdogMode.aER.bgK.cuV, WatchdogMode.aER.bgK.cuW), n2, true);
            b b2 = new b(akd2.x, akd2.y - (double)n2, akd2.z);
            Block block = j2.L(b2).df();
            if (block != Blocks.cLc || WatchdogMode.aER.bgK.aO) {
                bl2 = false;
                break;
            }
            bl2 = true;
            ++n2;
        }
        if (bl2) {
            ++this.aiF;
        } else if (WatchdogMode.aER.bgK.aO) {
            this.aiF = 0;
        }
        if (!(!bl2 || this.Ft == null || this.EC == null || !((double)this.aiF < 30.0 + ((Number)this.aiG.wD()).doubleValue() * 30.0) || this.e(LongJump.class).isEnabled() && (((Mode)Client.a.g().c(LongJump.class).DD.wD()).getName().equals("Watchdog Fire Ball") || ((Mode)Client.a.g().c(LongJump.class).DD.wD()).getName().equals("Watchdog Fire Ball 2")) || this.e(LongJump.class).isEnabled() && Watchdog2Mode.Mk || this.e(Flight.class).isEnabled() || WatchdogMode.aER.bgK.cHV.fi(0) != null && WatchdogMode.aER.bgK.cHV.fi(0).bP() == Items.cQU || this.e(Scaffold.class).isEnabled())) {
            if (!this.aiE) {
                this.aiD = true;
                bm.blink();
                bc.a(s.class, a.class, net.minecraft.network.play.client.b.class);
                if ((double)bd.cY > ((Number)this.aiG.wD()).doubleValue() || this.aiE) {
                    ahn.n(new f(this.Ft.x, this.Ft.y - -0.09800000190735147, this.Ft.z, false));
                    bc.cQ.clear();
                    bd.cY = 0.0f;
                    this.aiE = true;
                }
            } else {
                bm.dispatch();
            }
        } else {
            this.aiE = false;
            if (this.aiD) {
                bm.dispatch();
                this.aiD = false;
            }
            this.EC = new akd(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.ue, WatchdogMode.aER.bgK.uf);
            this.Ft = new akd(WatchdogMode.aER.bgK.gW, WatchdogMode.aER.bgK.gX, WatchdogMode.aER.bgK.gY);
        }
    };

    public WatchdogMode(String string, AntiVoid antiVoid) {
        super(string, antiVoid);
    }
}

