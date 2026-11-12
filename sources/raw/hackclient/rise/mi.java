/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.en;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.go;
import hackclient.rise.tr;
import java.util.UUID;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ah;
import net.minecraft.network.play.server.ai;
import net.minecraft.util.b;

@gl(aliases={"module.movement.sprint.name"}, description="module.movement.sprint.description", category=gj.MOVEMENT)
public class mi
extends gi {
    private float jp;
    private float jq;
    public static int Ek;
    private boolean dk;
    private boolean El;
    private b Em;
    private int En;
    public static boolean Eo;
    public static boolean Ep;
    private final aki Eq = new aki("Legit", (gi)this, (Boolean)true);
    private final aki Er = new aki("Watchdog Prediction", (gi)this, (Boolean)false);
    @dm(cH=2)
    public final dk<eo> Es = eo2 -> {
        if (!((Boolean)this.Er.wD()).booleanValue() || mi.aER.aIY.chq.Re() || Ek < 12 && go.nQ || ain.vN() == -1 || this.e(tr.class).kq() && Ek < 12) {
            mi.aER.aIY.chs.ay(true);
            Ek = 0;
            Eo = false;
        }
        if (mi.aER.bgK.crx == 2 && !go.nQ && ((Boolean)this.Er.wD()).booleanValue()) {
            mi.aER.aIY.chs.ay(false);
        }
        if (!((Boolean)this.Eq.wD()).booleanValue() && !((Boolean)this.Er.wD()).booleanValue()) {
            mi.aER.bgK.bkD = aii.isMoving();
            aii.preventDiagonalSpeed();
            mi.aER.bgK.setSprinting((Boolean)this.Eq.wD() == false && aii.isMoving() && !mi.aER.bgK.crR && !mi.aER.bgK.isSneaking() && !mi.aER.bgK.isUsingItem());
        }
        if (((Boolean)this.Er.wD()).booleanValue()) {
            if (Ek < 12 && mi.aER.bgK.crx > 3 && mi.aER.bgK.cuW > 0.0f && !go.nQ && ain.vN() != -1 && !this.e(tr.class).kq()) {
                mi.aER.bgK.cHV.cJE = ain.vN();
                if (++Ek > 1) {
                    mi.aER.aIY.chu.ay(true);
                }
            } else if (!mi.aER.aIY.chq.Re() && mi.aER.bgK.cuW > 0.0f && !go.nQ) {
                mi.aER.aIY.chu.ay(false);
            }
        }
    };
    @dm
    dk<ed> Et = ed2 -> {
        if (Ek == 15) {
            // empty if block
        }
    };
    @dm
    dk<en> Eu = en2 -> {};
    @dm
    dk<ei> Ev = ei2 -> {};
    @dm
    public final dk<fh> Ew = fh2 -> {
        ah ah2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof ah && (ah2 = (ah)aj2).getEntityId() == mi.aER.bgK.getEntityId()) {
            for (ai ai2 : ah2.ahb()) {
                for (a a2 : ai2.ahe()) {
                    if (a2.Xo().equals(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D")) || mi.aER.bgK.isSprinting()) continue;
                }
            }
        }
    };
    @dm
    dk<dz> yv = dz2 -> {
        this.jp = dz2.getForward();
        this.jq = dz2.getStrafe();
    };
    @dm
    dk<ej> dq = ej2 -> {
        if (mi.aER.bgK == null || mi.aER.bgF == null) {
            return;
        }
        if (mi.aER.bgK.crx <= 1) {
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
        mi.aER.bgK.setSprinting(mi.aER.aIY.chs.Re());
        mi.aER.bgK.bkD = false;
        Eo = false;
        Ek = 0;
        Ep = false;
        this.El = true;
        mi.aER.aIY.chu.ay(false);
    }
}

