/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.render;

import hackclient.rise.akd;
import hackclient.rise.dh;
import hackclient.rise.es;
import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.n;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.render.freecam.name"}, description="module.render.freecam.description", category=Category.RENDER)
public final class FreeCam
extends Module {
    private final NumberValue aob = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    private akd Ft;
    private akd aoc;
    private Vector2f ka;
    private boolean sprinting;
    @EventLink
    public final Listener<es> aod = dh::cF;
    @EventLink
    public final Listener<PacketSendEvent> aoe = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof m || aj2 instanceof e || aj2 instanceof c || aj2 instanceof n || aj2 instanceof k || aj2 instanceof i || aj2 instanceof i) {
            packetSendEvent.cF();
        }
    };
    @EventLink
    public final Listener<StrafeEvent> aof = strafeEvent -> {
        float f2 = ((Number)this.aob.wD()).floatValue();
        strafeEvent.setSpeed(f2);
    };
    @EventLink
    public final Listener<PreMotionEvent> aog = preMotionEvent -> {
        float f2 = ((Number)this.aob.wD()).floatValue();
        FreeCam.aER.bgK.ue = 0.0 + (FreeCam.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (FreeCam.aER.aIY.chr.Re() ? (double)f2 : 0.0);
    };
    @EventLink
    public final Listener<MoveInputEvent> aoh = moveInputEvent -> moveInputEvent.setSneak(false);

    @Override
    public void onEnable() {
        this.Ft = new akd(FreeCam.aER.bgK.gW, FreeCam.aER.bgK.gX, FreeCam.aER.bgK.gY);
        this.aoc = new akd(FreeCam.aER.bgK.ud, FreeCam.aER.bgK.ue, FreeCam.aER.bgK.uf);
        this.ka = new Vector2f(FreeCam.aER.bgK.pl, FreeCam.aER.bgK.pm);
        this.sprinting = FreeCam.aER.aIY.chs.Re();
    }

    @Override
    public void onDisable() {
        FreeCam.aER.bgK.setPosition(this.Ft.getX(), this.Ft.getY(), this.Ft.getZ());
        FreeCam.aER.bgK.pl = this.ka.getX();
        FreeCam.aER.bgK.pm = this.ka.getY();
        FreeCam.aER.bgK.ud = this.aoc.getX();
        FreeCam.aER.bgK.ue = this.aoc.getY();
        FreeCam.aER.bgK.uf = this.aoc.getZ();
        FreeCam.aER.aIY.chs.ay(this.sprinting);
    }

    @Generated
    public NumberValue jV() {
        return this.aob;
    }

    @Generated
    public akd lF() {
        return this.Ft;
    }

    @Generated
    public akd lG() {
        return this.aoc;
    }

    @Generated
    public Vector2f dy() {
        return this.ka;
    }

    @Generated
    public boolean isSprinting() {
        return this.sprinting;
    }

    @Generated
    public Listener<es> lH() {
        return this.aod;
    }

    @Generated
    public Listener<PacketSendEvent> lI() {
        return this.aoe;
    }

    @Generated
    public Listener<StrafeEvent> lJ() {
        return this.aof;
    }

    @Generated
    public Listener<PreMotionEvent> lb() {
        return this.aog;
    }

    @Generated
    public Listener<MoveInputEvent> lK() {
        return this.aoh;
    }
}

