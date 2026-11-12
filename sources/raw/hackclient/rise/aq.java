/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.adg;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.fs;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.az;
import net.minecraft.network.play.server.ba;
import net.minecraft.network.play.server.c;
import net.minecraft.network.play.server.o;
import rip.vantage.commons.util.time.a;

public class aq
extends am {
    private boolean bI;
    private boolean bJ;
    private boolean bK;
    private int bL;
    private float bM;
    public final a bN = new a();
    @dm
    public final dk<ei> bO = ei2 -> {
        if (aq.aER.bgK.aRg % 100 == 0 || this.bK || aq.aER.aIY.chz.Re() != this.bI || aq.aER.aIY.bJS != this.bJ || aq.aER.bgK.aRg <= 10 || this.bL > 0) {
            adg.aCw = true;
            this.bI = aq.aER.aIY.chz.Re();
            this.bJ = aq.aER.aIY.bJS;
            this.bK = false;
        }
        if (this.bM != aq.aER.bgK.getHealth()) {
            this.bL = 3;
            this.bM = aq.aER.bgK.getHealth();
        }
        --this.bL;
    };
    @dm
    public final dk<fs> bP = fs2 -> {
        if (aq.aER.bgR != null) {
            this.bK = true;
            adg.aCw = true;
        }
    };
    @dm
    public final dk<fh> bQ = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof c || aj2 instanceof ba || aj2 instanceof az) {
            this.bN.aX();
            this.bK = true;
        }
        if (aj2 instanceof o) {
            this.bL = 5;
        }
    };
}

