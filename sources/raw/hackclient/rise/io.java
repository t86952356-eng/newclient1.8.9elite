/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.hf;
import java.util.Random;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;

public final class io
extends akg<hf> {
    private final aki um = new aki("Full Rotation Fix", (akg<?>)this, (Boolean)true);
    private final aki un = new aki("Fake S08", (akg<?>)this, (Boolean)true);
    private final aki uo = new aki("Cancel Velocity", (akg<?>)this, (Boolean)true);
    private final akq up = new akq("Rotation Noise", this, (Number)0.001, (Number)0.0, (Number)0.1, (Number)0.001);
    private final aki uq = new aki("Debug Log", (akg<?>)this, (Boolean)false);
    private final Random ur = new Random();
    @dm
    public final dk<fi> us = fi2 -> {
        e e2;
        if (io.aER.bgK == null || io.aER.bgF == null) {
            return;
        }
        aj<?> aj2 = fi2.dq();
        if (((Boolean)this.um.wD()).booleanValue() && aj2 instanceof e && (e2 = (e)aj2).afV()) {
            float f2 = e2.getYaw();
            float f3 = e2.getPitch();
            if (this.h(f2) || this.h(f3)) {
                float f4 = ((Number)this.up.wD()).floatValue();
                e e3 = e2.isMoving() ? new h(e2.afS(), e2.afT(), e2.afU(), f2, f3, e2.isOnGround()) : new g(f2 += (float)(this.ur.nextBoolean() ? 1 : -1) * f4, f3 += (float)(this.ur.nextBoolean() ? 1 : -1) * f4, e2.isOnGround());
                fi2.e(e3);
                this.debug("Full rotation bypass");
            }
        }
    };
    @dm
    public final dk<fh> ut = fh2 -> {
        aj<a> aj2;
        if (io.aER.bgK == null || io.aER.bgF == null) {
            return;
        }
        aj<?> aj3 = fh2.dq();
        if (((Boolean)this.un.wD()).booleanValue() && aj3 instanceof i) {
            aj2 = (i)aj3;
            io.aER.bgK.setPosition(((i)aj2).getX(), ((i)aj2).getY(), ((i)aj2).getZ());
            io.aER.bgK.ud = 0.0;
            io.aER.bgK.ue = 0.0;
            io.aER.bgK.uf = 0.0;
            fh2.setCancelled(true);
            this.debug("Fake S08");
        }
        if (((Boolean)this.uo.wD()).booleanValue() && aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == io.aER.bgK.getEntityId()) {
            fh2.setCancelled(true);
            this.debug("Velocity cancelled");
        }
    };

    public io(String string, hf hf2) {
        super(string, hf2);
    }

    private boolean h(float f2) {
        float f3 = Math.abs(f2 % 90.0f);
        return f3 < 0.01f || f3 > 89.99f;
    }

    private void debug(String string) {
        if (((Boolean)this.uq.wD()).booleanValue()) {
            afl.b("\u00a78[\u00a7cGrimVelocity2\u00a78] \u00a77" + string, new Object[0]);
        }
    }
}

