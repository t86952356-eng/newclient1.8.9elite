/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.aik;
import hackclient.rise.bd;
import hackclient.rise.fd;
import net.minecraft.block.Block;
import net.minecraft.client.settings.a;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class HeypixelMode
extends Mode<NoFall> {
    private boolean aiI;
    private boolean aji;
    @EventLink
    public final Listener<PreMotionEvent> ajj = preMotionEvent -> {
        if (this.aji) {
            HeypixelMode.aER.aIY.chq.ay(true);
        }
        if (this.aiI) {
            HeypixelMode.aER.bgK.ue = 0.0;
            preMotionEvent.setOnGround(false);
            preMotionEvent.setPosY(preMotionEvent.getPosY() - (double)0.098f);
            HeypixelMode.aER.bgK.Q(HeypixelMode.aER.bgK.gW, preMotionEvent.getPosY(), HeypixelMode.aER.bgK.gY);
            return;
        }
        if (HeypixelMode.aER.bgK.ue > 0.0 || bd.cY <= 3.0f) {
            return;
        }
        Block block = aik.u(new b(preMotionEvent.getPosX(), preMotionEvent.getPosY() + HeypixelMode.aER.bgK.ue, preMotionEvent.getPosZ()));
        if (block.xb().zw()) {
            bd.cY = 0.0f;
            this.aiI = true;
            this.aji = true;
            HeypixelMode.aER.aIY.chq.ay(true);
        }
    };
    @EventLink(cH=-1)
    public final Listener<MoveInputEvent> ajk = moveInputEvent -> {
        if (this.aji) {
            moveInputEvent.setJump(true);
        }
    };
    @EventLink(cH=-1)
    public final Listener<JumpEvent> ajl = jumpEvent -> {
        if (this.aji && !this.aiI && !jumpEvent.isCancelled()) {
            this.kR();
        }
    };
    @EventLink
    public final Listener<fd> ajm = fd2 -> {
        this.aiI = false;
    };

    public HeypixelMode(String string, NoFall noFall) {
        super(string, noFall);
    }

    @Override
    public void onEnable() {
        this.aiI = false;
        this.aji = false;
    }

    @Override
    public void onDisable() {
        this.aiI = false;
        this.kR();
    }

    private void kR() {
        this.aji = false;
        HeypixelMode.aER.aIY.chq.ay(a.a(HeypixelMode.aER.aIY.chq));
    }
}

