/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.akg;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.fi;
import hackclient.rise.go;
import hackclient.rise.lz;
import hackclient.rise.mo;
import hackclient.rise.ti;
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.r;
import net.minecraft.network.play.client.z;

public final class cy
extends am {
    public static double il = 0.0;
    private boolean im;
    @dm(cH=0)
    public final dk<fi> in = fi2 -> {
        aj<b> aj2;
        aj<?> aj3;
        mo mo2 = this.e(mo.class);
        if (cy.aER.bgK.aRg < 2) {
            il = 0.0;
        }
        if ((ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8) || "Bloxd".equals(((akg)mo2.Fe.wD()).getName()) && mo2.isEnabled() && !this.e(lz.class).isEnabled()) && (aj3 = fi2.dq()) instanceof e) {
            aj2 = (e)aj3;
            if ("Bloxd".equals(((akg)mo2.Fe.wD()).getName()) && mo2.isEnabled() && !this.e(lz.class).isEnabled() && !((e)aj2).isMoving() && cy.aER.bgK.Zz > 2) {
                il += 1.0;
                fi2.cF();
            }
            il -= (double)cy.aER.bgC.dAp - 1.6;
            if (!((e)aj2).isMoving() && !((e)aj2).isRotating() && ((e)aj2).aO == this.im) {
                fi2.cF();
            }
            this.im = ((e)aj2).aO;
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
            aj3 = fi2.dq();
            if (!(aj3 instanceof i) || ((i)(aj2 = (i)aj3)).afW() != j.dba && ((i)aj2).afW() != j.daZ && ((i)aj2).afW() != j.dbb && ((i)aj2).afW() != j.dbe || ti.acw != null) {
                // empty if block
            }
            if (ti.acw == null || !((Boolean)this.e(ti.class).acp.wD()).booleanValue()) {
                // empty if block
            }
            if (aj3 instanceof r || aj3 instanceof z && ((z)aj3).agh() == aa.dbR || aj3 instanceof q) {
                // empty if block
            }
            if (!(aj3 instanceof c) || ((c)(aj2 = (c)aj3)).afQ() != d.daU || il < 10.0 && !this.e(go.class).isEnabled() || !(il < 1.0) || this.e(go.class).isEnabled()) {
                // empty if block
            }
        }
    };
    @dm
    public final dk<ej> io = ej2 -> {
        if (!this.e(go.class).isEnabled() ? il < 10.0 : il < 1.0) {
            // empty if block
        }
    };
}

