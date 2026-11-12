/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.bi;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.mp;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;
import net.minecraft.util.b;

public class rj
extends akg<mp> {
    private double Tv = 0.42;
    private boolean Tw;
    @dm
    public final dk<ei> Tx = ei2 -> {
        if (rj.aER.bgK == null) {
            return;
        }
        if (rj.aER.bgK.ue < 0.0) {
            this.Tw = true;
        }
        if (this.Tw) {
            float f2;
            float f3 = rj.aER.bgK.pl;
            float f4 = rj.aER.bgK.bkr.cuW;
            if (f4 != 0.0f) {
                f3 += f4 < 0.0f ? 180.0f : 0.0f;
                float f5 = f4 = f4 < 0.0f ? -0.5f : 0.5f;
            }
            if ((f2 = rj.aER.bgK.bkr.dzs) != 0.0f) {
                f3 += (f2 < 0.0f ? 90.0f : -90.0f) * f4;
            }
            double d2 = Math.toRadians(f3);
            double d3 = 1.0E-8;
            ei2.setYaw(f3);
            if (!Objects.equals(bi.dy, "35565") && !Objects.equals(bi.dx, "testnet.hypixel.net")) {
                ei2.setPosX(ei2.getPosX() - Math.sin(d2) * 1.0E-8);
                ei2.setPosZ(ei2.getPosZ() + Math.cos(d2) * 1.0E-8);
            }
            this.Tw = false;
        }
        if (rj.aER.bgK.crR && rj.aER.bgK.aO && !rj.aER.aIY.chq.Re()) {
            rj.aER.bgK.jump();
        }
    };
    @dm
    public final dk<dz> Ty = dz2 -> {
        if (rj.aER.bgK.crR) {
            dz2.setStrafe(0.0f);
        }
    };
    @dm
    public final dk<eo> Tz = eo2 -> {
        if (rj.aER.bgK == null) {
            return;
        }
        if (rj.aER.bgK.tR != 5 || aii.speed() == 0.0) {
            // empty if block
        }
        if (rj.aER.bgK.tR != 6 || aii.speed() == 0.0) {
            // empty if block
        }
        if (!rj.aER.bgK.crR || !rj.aER.aIY.chq.Re() || !(this.Tv > 0.42) || rj.aER.bgK.aO) {
            // empty if block
        }
    };
    @dm
    public final dk<es> TA = es2 -> {
        if (rj.aER.bgK == null) {
            return;
        }
        b b2 = es2.dg();
        if (b2 == null) {
            return;
        }
        Block block = es2.df();
        if (!(block instanceof BlockAir)) {
            return;
        }
        if ((double)b2.wu() >= rj.aER.bgK.gX) {
            return;
        }
        if (!rj.aER.bgK.crR) {
            return;
        }
        if (rj.aER.bgK.isOnLadder()) {
            return;
        }
        double d2 = (double)((int)rj.aER.bgK.gX) - 1.0;
        a a2 = a.h(0.0, 0.0, 0.0, 1.0, 1.0, 1.0).ae(rj.aER.bgK.gW, d2, rj.aER.bgK.gY);
        double d3 = 1.0E-7;
        a2 = a2.ad(-1.0E-7, 0.0, -1.0E-7);
        es2.a(a2);
    };

    public rj(String string, mp mp2) {
        super(string, mp2);
    }

    @Override
    public void onEnable() {
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8) && bi.dx != null && bi.dx.contains("hypixel")) {
            afl.b("this will only work 1.8 on hypixel", new Object[0]);
        } else {
            afl.b("don't move horizontally while you spider and only spider on full blocks", new Object[0]);
        }
        this.Tw = false;
    }

    @Override
    public void onDisable() {
        rj.aER.bgC.dAp = 1.0f;
        this.Tw = false;
    }
}

