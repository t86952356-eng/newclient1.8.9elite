/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.en;
import java.util.UUID;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ah;
import net.minecraft.network.play.server.ai;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.KillAura;
import rise.module.impl.player.InventoryManager;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.movement.sprint.name"}, description="module.movement.sprint.description", category=Category.MOVEMENT)
public class Sprint
extends Module {
    private float jp;
    private float jq;
    public static int Ek;
    private boolean dk;
    private boolean El;
    private b Em;
    private int En;
    public static boolean Eo;
    public static boolean Ep;
    private final BooleanValue Eq = new BooleanValue("Legit", (Module)this, (Boolean)true);
    private final BooleanValue Er = new BooleanValue("Watchdog Prediction", (Module)this, (Boolean)false);
    @EventLink(cH=2)
    public final Listener<StrafeEvent> Es = strafeEvent -> {
        if (!((Boolean)this.Er.wD()).booleanValue() || Sprint.aER.aIY.chq.Re() || Ek < 12 && KillAura.nQ || ain.vN() == -1 || this.e(InventoryManager.class).kq() && Ek < 12) {
            Sprint.aER.aIY.chs.ay(true);
            Ek = 0;
            Eo = false;
        }
        if (Sprint.aER.bgK.crx == 2 && !KillAura.nQ && ((Boolean)this.Er.wD()).booleanValue()) {
            Sprint.aER.aIY.chs.ay(false);
        }
        if (!((Boolean)this.Eq.wD()).booleanValue() && !((Boolean)this.Er.wD()).booleanValue()) {
            Sprint.aER.bgK.bkD = aii.isMoving();
            aii.preventDiagonalSpeed();
            Sprint.aER.bgK.setSprinting((Boolean)this.Eq.wD() == false && aii.isMoving() && !Sprint.aER.bgK.crR && !Sprint.aER.bgK.isSneaking() && !Sprint.aER.bgK.isUsingItem());
        }
        if (((Boolean)this.Er.wD()).booleanValue()) {
            if (Ek < 12 && Sprint.aER.bgK.crx > 3 && Sprint.aER.bgK.cuW > 0.0f && !KillAura.nQ && ain.vN() != -1 && !this.e(InventoryManager.class).kq()) {
                Sprint.aER.bgK.cHV.cJE = ain.vN();
                if (++Ek > 1) {
                    Sprint.aER.aIY.chu.ay(true);
                }
            } else if (!Sprint.aER.aIY.chq.Re() && Sprint.aER.bgK.cuW > 0.0f && !KillAura.nQ) {
                Sprint.aER.aIY.chu.ay(false);
            }
        }
    };
    @EventLink
    Listener<JumpEvent> Et = jumpEvent -> {
        if (Ek == 15) {
            // empty if block
        }
    };
    @EventLink
    Listener<en> Eu = en2 -> {};
    @EventLink
    Listener<PreMotionEvent> Ev = preMotionEvent -> {};
    @EventLink
    public final Listener<PacketReceiveEvent> Ew = packetReceiveEvent -> {
        ah ah2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof ah && (ah2 = (ah)aj2).getEntityId() == Sprint.aER.bgK.getEntityId()) {
            for (ai ai2 : ah2.ahb()) {
                for (a a2 : ai2.ahe()) {
                    if (a2.Xo().equals(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D")) || Sprint.aER.bgK.isSprinting()) continue;
                }
            }
        }
    };
    @EventLink
    Listener<MoveInputEvent> yv = moveInputEvent -> {
        this.jp = moveInputEvent.getForward();
        this.jq = moveInputEvent.getStrafe();
    };
    @EventLink
    Listener<PreUpdateEvent> dq = preUpdateEvent -> {
        if (Sprint.aER.bgK == null || Sprint.aER.bgF == null) {
            return;
        }
        if (Sprint.aER.bgK.crx <= 1) {
            // empty if block
        }
    };

    @Override
    public void onEnable() {
        afl.b("don't start on an edge when enabling", new Object[0]);
        Eo = false;
        Ep = false;
        this.El = true;
        Ek = 0;
    }

    @Override
    public void onDisable() {
        Sprint.aER.bgK.setSprinting(Sprint.aER.aIY.chs.Re());
        Sprint.aER.bgK.bkD = false;
        Eo = false;
        Ek = 0;
        Ep = false;
        this.El = true;
        Sprint.aER.aIY.chu.ay(false);
    }
}

