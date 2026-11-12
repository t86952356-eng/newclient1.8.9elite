/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ek;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.fe;
import hackclient.rise.md;
import net.minecraft.block.BlockLiquid;

public class po
extends akg<md> {
    private int Od = 1;
    @dm
    public final dk<fe> Oe = fe2 -> {
        if (po.aER.bgK == null || po.aER.bgF == null) {
            return;
        }
        switch (this.Od) {
            case 1: {
                if (po.aER.aIY.chq.Re() && !po.aER.bgF.aG(po.aER.bgK.yl())) {
                    po.aER.bgK.ue = 0.42;
                    ++this.Od;
                }
                po.aER.bgK.aO = true;
                break;
            }
            case 2: {
                po.aER.bgK.ue = 0.33;
                ++this.Od;
                break;
            }
            case 3: {
                po.aER.bgK.ue = 0.25;
                ++this.Od;
                break;
            }
        }
        if (this.Od > 3 || this.Od == 0) {
            this.Od = 1;
        }
        po.aER.bgK.csp = true;
    };
    @dm
    public final dk<eo> Of = eo2 -> {
        if (po.aER.bgK == null) {
            return;
        }
        if (po.aER.bgK.isSneaking()) {
            eo2.setSpeed(0.179);
        }
    };
    @dm
    public final dk<es> Og = es2 -> {
        if (po.aER.bgK == null) {
            return;
        }
        if (es2.df() instanceof BlockLiquid) {
            return;
        }
        if ((double)es2.dg().wu() >= po.aER.bgK.gX) {
            es2.a(null);
        }
    };
    @dm
    public final dk<ek> Oh = ek2 -> ek2.cF();

    public po(String string, md md2) {
        super(string, md2);
    }

    @Override
    public void onEnable() {
        this.Od = 1;
        if (po.aER.bgK != null) {
            po.aER.bgK.ue = 0.0;
        }
    }

    @Override
    public void onDisable() {
        if (po.aER.bgK != null) {
            po.aER.bgK.csp = false;
        }
        this.Od = 1;
    }
}

