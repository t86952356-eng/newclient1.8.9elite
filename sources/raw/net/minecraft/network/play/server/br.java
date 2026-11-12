/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.util.Collection;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.scoreboard.h;
import net.minecraft.scoreboard.m;

public class br
implements aj<a> {
    private String deU = "";
    private String deV = "";
    private String deW = "";
    private String deX = "";
    private String deY;
    private int deZ;
    private final Collection<String> dfa;
    private int dfb;
    private int dfc;

    public br() {
        this.deY = m.dkm.dkr;
        this.deZ = -1;
        this.dfa = Lists.newArrayList();
    }

    public br(h h2, int n2) {
        this.deY = m.dkm.dkr;
        this.deZ = -1;
        this.dfa = Lists.newArrayList();
        this.deU = h2.akq();
        this.dfb = n2;
        if (n2 == 0 || n2 == 2) {
            this.deV = h2.ahW();
            this.deW = h2.aks();
            this.deX = h2.akt();
            this.dfc = h2.aky();
            this.deY = h2.akw().dkr;
            this.deZ = h2.akz().asv();
        }
        if (n2 == 0) {
            this.dfa.addAll(h2.akr());
        }
    }

    public br(h h2, Collection<String> collection, int n2) {
        this.deY = m.dkm.dkr;
        this.deZ = -1;
        this.dfa = Lists.newArrayList();
        if (n2 != 3 && n2 != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.dfb = n2;
        this.deU = h2.akq();
        this.dfa.addAll(collection);
    }

    @Override
    public void a(ak ak2) {
        this.deU = ak2.gs(16);
        this.dfb = ak2.readByte();
        if (this.dfb == 0 || this.dfb == 2) {
            this.deV = ak2.gs(32);
            this.deW = ak2.gs(16);
            this.deX = ak2.gs(16);
            this.dfc = ak2.readByte();
            this.deY = ak2.gs(32);
            this.deZ = ak2.readByte();
        }
        if (this.dfb == 0 || this.dfb == 3 || this.dfb == 4) {
            int n2 = ak2.afw();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.dfa.add(ak2.gs(40));
            }
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.deU);
        ak2.writeByte(this.dfb);
        if (this.dfb == 0 || this.dfb == 2) {
            ak2.eS(this.deV);
            ak2.eS(this.deW);
            ak2.eS(this.deX);
            ak2.writeByte(this.dfc);
            ak2.eS(this.deY);
            ak2.writeByte(this.deZ);
        }
        if (this.dfb == 0 || this.dfb == 3 || this.dfb == 4) {
            ak2.gr(this.dfa.size());
            for (String string : this.dfa) {
                ak2.eS(string);
            }
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String ahW() {
        return this.aid();
    }

    public String getDisplayName() {
        return this.aie();
    }

    public String ahX() {
        return this.aif();
    }

    public String ahY() {
        return this.aig();
    }

    public Collection<String> ahZ() {
        return this.aih();
    }

    public int getAction() {
        return this.aii();
    }

    public int aia() {
        return this.aij();
    }

    public int aib() {
        return this.aik();
    }

    public String aic() {
        return this.ail();
    }

    public String aid() {
        return this.deU;
    }

    public String aie() {
        return this.deV;
    }

    public String aif() {
        return this.deW;
    }

    public String aig() {
        return this.deX;
    }

    public Collection<String> aih() {
        return this.dfa;
    }

    public int aii() {
        return this.dfb;
    }

    public int aij() {
        return this.dfc;
    }

    public int aik() {
        return this.deZ;
    }

    public String ail() {
        return this.deY;
    }
}

