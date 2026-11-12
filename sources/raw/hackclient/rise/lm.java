/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akj;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.kx;

public class lm
extends akg<kx> {
    private final akj Cf = new akj("Drag Click Length", this, (Number)17, (Number)18, (Number)1, (Number)50, (Number)1);
    private final akj Cg = new akj("Delay Between Dragging", this, (Number)6, (Number)6, (Number)1, (Number)20, (Number)1);
    private int Ch;
    private int Ci;
    @dm
    public final dk<fe> Cj = fe2 -> {
        if (lm.aER.aIY.chw.Re()) {
            if (this.Ch < 0) {
                --this.Ci;
                if (this.Ci < 0) {
                    this.Ci = this.Cg.wK().intValue();
                    this.Ch = this.Cf.wK().intValue();
                }
            } else if (Math.random() < 0.95) {
                --this.Ch;
                aik.h(0, true);
            }
        }
    };

    public lm(String string, kx kx2) {
        super(string, kx2);
    }
}

