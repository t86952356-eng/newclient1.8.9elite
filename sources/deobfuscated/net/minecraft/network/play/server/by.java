/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.bz;
import net.minecraft.world.border.c;

public class by
implements aj<a> {
    private bz dfn;
    private int ans;
    private double dfo;
    private double dfp;
    private double dfq;
    private double dfr;
    private long dfs;
    private int dft;
    private int dfu;

    public by() {
    }

    public by(c c2, bz bz2) {
        this.dfn = bz2;
        this.dfo = c2.getCenterX();
        this.dfp = c2.getCenterZ();
        this.dfr = c2.axq();
        this.dfq = c2.getTargetSize();
        this.dfs = c2.getTimeUntilTarget();
        this.ans = c2.getSize();
        this.dfu = c2.getWarningDistance();
        this.dft = c2.getWarningTime();
    }

    @Override
    public void a(ak ak2) {
        this.dfn = ak2.k(bz.class);
        switch (this.dfn.ordinal()) {
            case 0: {
                this.dfq = ak2.readDouble();
                break;
            }
            case 1: {
                this.dfr = ak2.readDouble();
                this.dfq = ak2.readDouble();
                this.dfs = ak2.afx();
                break;
            }
            case 2: {
                this.dfo = ak2.readDouble();
                this.dfp = ak2.readDouble();
                break;
            }
            case 5: {
                this.dfu = ak2.afw();
                break;
            }
            case 4: {
                this.dft = ak2.afw();
                break;
            }
            case 3: {
                this.dfo = ak2.readDouble();
                this.dfp = ak2.readDouble();
                this.dfr = ak2.readDouble();
                this.dfq = ak2.readDouble();
                this.dfs = ak2.afx();
                this.ans = ak2.afw();
                this.dfu = ak2.afw();
                this.dft = ak2.afw();
            }
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.b(this.dfn);
        switch (this.dfn.ordinal()) {
            case 0: {
                ak2.writeDouble(this.dfq);
                break;
            }
            case 1: {
                ak2.writeDouble(this.dfr);
                ak2.writeDouble(this.dfq);
                ak2.w(this.dfs);
                break;
            }
            case 2: {
                ak2.writeDouble(this.dfo);
                ak2.writeDouble(this.dfp);
                break;
            }
            case 5: {
                ak2.gr(this.dfu);
                break;
            }
            case 4: {
                ak2.gr(this.dft);
                break;
            }
            case 3: {
                ak2.writeDouble(this.dfo);
                ak2.writeDouble(this.dfp);
                ak2.writeDouble(this.dfr);
                ak2.writeDouble(this.dfq);
                ak2.w(this.dfs);
                ak2.gr(this.ans);
                ak2.gr(this.dfu);
                ak2.gr(this.dft);
            }
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(c c2) {
        switch (this.dfn.ordinal()) {
            case 0: {
                c2.aN(this.dfq);
                break;
            }
            case 1: {
                c2.a(this.dfr, this.dfq, this.dfs);
                break;
            }
            case 2: {
                c2.C(this.dfo, this.dfp);
                break;
            }
            case 5: {
                c2.ir(this.dfu);
                break;
            }
            case 4: {
                c2.iq(this.dft);
                break;
            }
            case 3: {
                c2.C(this.dfo, this.dfp);
                if (this.dfs > 0L) {
                    c2.a(this.dfr, this.dfq, this.dfs);
                } else {
                    c2.aN(this.dfq);
                }
                c2.ip(this.ans);
                c2.ir(this.dfu);
                c2.iq(this.dft);
            }
        }
    }
}

