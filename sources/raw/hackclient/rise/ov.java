/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.lz;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.i;

public final class ov
extends akg<lz> {
    private boolean LV;
    private int hV;
    @dm
    public final dk<ei> LW = ei2 -> {
        ++this.hV;
        if (!(ov.aER.bgK.csf > 0.0f) || this.hV % 2 != 0 || (double)ov.aER.bgK.csf < 2.2) {
            // empty if block
        }
        switch (this.hV) {
            case 1: {
                ov.aER.bgK.jump();
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                ov.aER.bgK.ud *= 1.3;
                ov.aER.bgK.uf *= 1.3;
                break;
            }
            case 5: {
                ov.aER.bgK.ud *= 1.05;
                ov.aER.bgK.uf *= 1.05;
                break;
            }
            case 10: {
                ov.aER.bgK.ue = 2.0;
                break;
            }
            case 11: {
                ov.aER.bgK.ue += 0.04;
                break;
            }
            case 40: {
                afl.b(ov.aER.bgK.ue, new Object[0]);
                ov.aER.bgK.ue = -0.09800000190735147;
                break;
            }
            case 62: {
                afl.b(ov.aER.bgK.ue, new Object[0]);
                ei2.setOnGround(true);
                ov.aER.bgK.aO = true;
                ov.aER.bgK.jump();
                break;
            }
            case 74: {
                break;
            }
        }
        if (ov.aER.bgK.ue < -1.53 && ov.aER.bgK.ue > -1.54) {
            ei2.setOnGround(true);
            ov.aER.bgK.aO = true;
            ov.aER.bgK.jump();
        }
        if (ov.aER.bgK.ue < -0.51 && ov.aER.bgK.ue > -0.52) {
            afl.b("if near void and the ghost block handler is on this may flag", new Object[0]);
            ov.aER.bgK.ue = 2.0;
        }
    };
    @dm
    public final dk<fh> LX = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i && this.LV) {
            fh2.cF();
            this.LV = false;
        }
    };

    public ov(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        if (!ov.aER.bgK.aO) {
            this.toggle();
        }
        this.LV = false;
        this.hV = 0;
    }
}

