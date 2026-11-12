/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.es;
import hackclient.rise.fg;
import hackclient.rise.fi;
import hackclient.rise.jg;
import hackclient.rise.lw;
import hackclient.rise.lz;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.BlockStairs;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.util.a;

public class jw
extends akg<jg> {
    private final akq xN = new akq("Ticks", this, (Number)5, (Number)1, (Number)20, (Number)1);
    public List<aj<?>> xO = new ArrayList();
    @dm
    public final dk<fi> xP = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof e) {
            e e2 = (e)aj2;
            if (jw.aER.bgK.Zz > 3) {
                // empty if block
            }
        }
    };
    @dm(cH=4)
    public final dk<ej> xQ = ej2 -> {
        if (aik.p(0.0, -1.0, 0.0) != Blocks.cLc) {
            // empty if block
        }
        if (jw.aER.bgK.aO) {
            // empty if block
        }
    };
    @dm
    public final dk<ei> xR = ei2 -> {
        if (Math.abs(jw.aER.bgK.gX - (double)Math.round(jw.aER.bgK.gX)) > 0.03 && jw.aER.bgK.aO && !(aik.o(jw.aER.bgK.gW, jw.aER.bgK.gX - 0.5, jw.aER.bgK.gY) instanceof BlockStairs)) {
            jw.aER.bgK.jump();
        }
        if (ei2.isOnGround() || jw.aER.bgK.aO || this.e(lw.class).isEnabled() || this.e(lz.class).isEnabled() || jw.aER.bgK.ue == -0.0784000015258789 && Math.abs(jw.aER.bgK.gX - Math.floor(jw.aER.bgK.gX)) < 1.0E-6) {
            ei2.setPosY(ei2.getPosY() + 0.001);
        }
    };
    @dm(cH=4)
    public final dk<ej> xS = ej2 -> {
        if (jw.aER.bgK.aRg < 2) {
            cg.a("Watchdog Fly Disabler", "once you're in the game kill yourself and land on the ground while spectating, then you'll be able to highjump and speed", 5000);
        }
    };
    @dm
    public final dk<fg> xT = fg2 -> afl.b("once you're in the game kill yourself and land on the ground while spectating, then you'll be able to highjump and speed", new Object[0]);
    @dm
    public final dk<es> xU = es2 -> {
        a a2 = es2.dh();
        if (a2 != null) {
            // empty if block
        }
    };

    public jw(String string, jg jg2) {
        super(string, jg2);
    }

    @Override
    public void onEnable() {
        jw.aER.bgK.setPosition(jw.aER.bgK.gW, jw.aER.bgK.gX + 0.001, jw.aER.bgK.gY);
        if (!((Boolean)((jg)this.wy()).wJ.wD()).booleanValue()) {
            return;
        }
    }

    @Override
    public void onDisable() {
        if (!((Boolean)((jg)this.wy()).wJ.wD()).booleanValue()) {
            return;
        }
    }
}

