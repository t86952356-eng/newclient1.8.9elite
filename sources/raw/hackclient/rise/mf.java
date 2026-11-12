/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;

@gl(aliases={"module.movement.snaptap.name", "Null Move", "SOCD", "Null Binds"}, description="module.movement.snaptap.description", category=gj.MOVEMENT)
public class mf
extends gi {
    private boolean DW;
    private boolean DX;
    private boolean DY;
    private boolean DZ;
    private long Ea;
    private long Eb;
    private long Ec;
    private long Ed;
    @dm
    public final dk<dz> Ee = dz2 -> {
        boolean bl2 = mf.aER.aIY.chm.Re();
        boolean bl3 = mf.aER.aIY.cho.Re();
        boolean bl4 = mf.aER.aIY.chn.Re();
        boolean bl5 = mf.aER.aIY.chp.Re();
        long l2 = System.currentTimeMillis();
        if (bl2 && !this.DW) {
            this.Ea = l2;
        }
        if (bl3 && !this.DX) {
            this.Eb = l2;
        }
        if (bl4 && !this.DY) {
            this.Ec = l2;
        }
        if (bl5 && !this.DZ) {
            this.Ed = l2;
        }
        if (bl2 && bl3) {
            if (this.Ea != this.Eb) {
                dz2.setForward(this.Ea > this.Eb ? 1.0f : -1.0f);
            } else {
                dz2.setForward(0.0f);
            }
        } else if (bl2) {
            dz2.setForward(1.0f);
        } else if (bl3) {
            dz2.setForward(-1.0f);
        }
        if (bl4 && bl5) {
            if (this.Ec != this.Ed) {
                dz2.setStrafe(this.Ec > this.Ed ? 1.0f : -1.0f);
            } else {
                dz2.setStrafe(0.0f);
            }
        } else if (bl4) {
            dz2.setStrafe(1.0f);
        } else if (bl5) {
            dz2.setStrafe(-1.0f);
        }
        this.DW = bl2;
        this.DX = bl3;
        this.DY = bl4;
        this.DZ = bl5;
    };

    @Override
    public void onDisable() {
        this.DW = false;
        this.DX = false;
        this.DY = false;
        this.DZ = false;
        this.Ea = 0L;
        this.Eb = 0L;
        this.Ec = 0L;
        this.Ed = 0L;
    }
}

