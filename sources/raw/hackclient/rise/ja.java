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
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bi;
import hackclient.rise.bm;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.go;
import hackclient.rise.hf;
import hackclient.rise.lw;
import hackclient.rise.lz;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.a;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.bn;
import net.minecraft.network.play.server.bo;
import net.minecraft.network.play.server.bq;
import net.minecraft.network.play.server.br;
import net.minecraft.network.play.server.t;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.z;
import net.minecraft.network.status.server.b;

public class ja
extends akg<hf> {
    public final akq vy = new akq("Velocity to let through", this, (Number)0.3, (Number)0, (Number)0.6, (Number)0.01);
    private final aki vz = new aki("Prevent Ghosting", (akg<?>)this, (Boolean)true);
    public static boolean dj = false;
    public static boolean tt;
    private int tR;
    private final ArrayList<aj<?>> vA = new ArrayList();
    private float ub;
    private double vB;
    private double vC;
    private boolean gD;
    private int dE;
    @dm(cH=2)
    public final dk<fh> vD = fh2 -> {
        if (tt || this.e(lz.class).isEnabled() && ja.aER.bgK.tR < 29 || this.e(lw.class).isEnabled() || ja.aER.bgK.aRg < 50) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class, a.class, z.class, v.class}, aj3, n2)) {
            case 0: {
                t t2 = (t)aj3;
                if (t2.getEntityID() != ja.aER.bgK.getEntityId() || fh2.isCancelled()) break;
                if (t2.getEntityID() == ja.aER.bgK.getEntityId() && t2.dcS > 0 || ja.aER.bgK.ae <= 14 || ja.aER.bgK.crx <= 1) {
                    this.gD = true;
                }
                if (ja.aER.bgK.aO || ja.aER.bgK.Zz <= 4) break;
                dj = true;
                double d2 = (double)t2.agN() / 8000.0;
                double d3 = (double)t2.agP() / 8000.0;
                this.ub = (float)Math.toDegrees(Math.atan2(d3, d2));
                if (this.ub < -180.0f) {
                    this.ub += 360.0f;
                }
                if (this.ub > 180.0f) {
                    this.ub -= 360.0f;
                }
                this.vA.add(t2);
                fh2.cF();
                this.vB = d2;
                this.vC = d3;
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!dj) break;
                fh2.cF();
                this.vA.add(bc2);
                break;
            }
            case 2: {
                a a2 = (a)aj3;
                if (!dj) break;
                fh2.cF();
                this.vA.add(a2);
                break;
            }
            case 3: {
                z z2 = (z)aj3;
                break;
            }
            case 4: {
                v v2 = (v)aj3;
                break;
            }
            default: {
                if (fh2.dq() instanceof bn || fh2.dq() instanceof bo || fh2.dq() instanceof bq || fh2.dq() instanceof br) {
                    return;
                }
                aj<?> aj4 = fh2.dq();
                String string = aj4.getClass().getName();
                if (!dj || !string.startsWith("net.minecraft.network.play.server.")) break;
                fh2.cF();
                this.vA.add(aj4);
            }
        }
    };
    @dm
    public final dk<ej> vE = ej2 -> {
        List<r> list;
        if (dj) {
            // empty if block
        }
        if (bm.enabled) {
            dj = true;
        }
        if ((list = bv.f(7.0)).isEmpty()) {
            return;
        }
    };
    @dm
    public final dk<ej> vF = ej2 -> {
        if (!dj || ja.aER.bgK.aO) {
            // empty if block
        }
        if (((akg)this.e(go.class).lV.wD()).getName().equals("Watchdog 1.8") && !ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13) && bi.dx != null && bi.dx.contains("hypixel") && ja.aER.bgK.aRg % 5 == 0) {
            afl.b("don't use this velocity with this autoblock instead use legit or any other mode", new Object[0]);
        }
        if (dj || ja.aER.bgK.Zz == 1) {
            float f2 = ja.aER.bgK.pl % 360.0f;
            if (f2 < -180.0f) {
                f2 += 360.0f;
            }
            if (f2 > 180.0f) {
                f2 -= 360.0f;
            }
            float f3 = Math.abs(f2 - this.ub);
            float f4 = 15.0f;
            if (ja.aER.bgK.aO || Math.random() > 0.98 && ((Boolean)this.vz.wD()).booleanValue()) {
                if (ja.aER.bgK.tR <= 3 || !ja.aER.aIY.chq.Re() || !((Boolean)this.vz.wD()).booleanValue() || Math.hypot(ja.aER.bgK.csu, ja.aER.bgK.csw) < ((Number)this.vy.wD()).doubleValue()) {
                    // empty if block
                }
                tt = true;
                dj = false;
                this.vA.stream().filter(aj2 -> !(aj2 instanceof b)).forEach(ahn::q);
                this.vA.clear();
                tt = false;
            } else if (f3 <= f4 || f3 >= 360.0f - f4) {
                tt = true;
                dj = false;
                this.vA.stream().filter(aj2 -> !(aj2 instanceof b)).forEach(ahn::q);
                this.vA.clear();
                tt = false;
                this.tR = 0;
            } else if (ja.aER.bgK.tR > 13) {
                tt = true;
                dj = false;
                this.vA.stream().filter(aj2 -> !(aj2 instanceof b)).forEach(ahn::q);
                this.vA.clear();
                tt = false;
            }
        }
    };
    @dm
    public final dk<ed> vG = ed2 -> ++this.dE;
    @dm
    public final dk<dz> vH = dz2 -> {
        if (this.gD) {
            if (!ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_12_1) || !ja.aER.bgK.cuU) {
                dz2.setJump(true);
            }
            this.gD = false;
        }
        if (dj || tt) {
            this.gD = false;
        }
        if (dj || tt) {
            // empty if block
        }
    };

    public ja(String string, hf hf2) {
        super(string, hf2);
    }
}

