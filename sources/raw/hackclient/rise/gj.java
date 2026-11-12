/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aca;
import hackclient.rise.acc;
import hackclient.rise.acd;
import hackclient.rise.ach;
import hackclient.rise.aci;
import hackclient.rise.acj;
import hackclient.rise.agf;
import hackclient.rise.gb;
import lombok.Generated;

public final class gj
extends Enum<gj> {
    public static final /* enum */ gj ld = new gj("category.search", gb.kv.o(17), "U", 1, new aci());
    public static final /* enum */ gj le = new gj("category.combat", gb.ku.o(17), "a", 2, new acc());
    public static final /* enum */ gj lf = new gj("category.movement", gb.ku.o(17), "b", 3, new acc());
    public static final /* enum */ gj lg = new gj("category.player", gb.ku.o(17), "c", 4, new acc());
    public static final /* enum */ gj lh = new gj("category.render", gb.ku.o(17), "g", 5, new acc());
    public static final /* enum */ gj li = new gj("category.exploit", gb.ku.o(17), "a", 6, new acc());
    public static final /* enum */ gj lj = new gj("category.ghost", gb.ku.o(17), "f", 7, new acc());
    public static final /* enum */ gj lk = new gj("category.script", gb.kv.o(17), "m", 7, new acd());
    public static final /* enum */ gj ll = new gj("category.themes", gb.kv.o(17), "U", 10, new acj());
    public static final /* enum */ gj lm = new gj("category.language", gb.kv.o(17), "U", 10, new ach());
    private final String ln;
    private final String lo;
    private final int lp;
    private final agf lq;
    public final aca lr;
    private static final /* synthetic */ gj[] ls;

    public static gj[] values() {
        return (gj[])ls.clone();
    }

    public static gj valueOf(String string) {
        return Enum.valueOf(gj.class, string);
    }

    private gj(String string2, agf agf2, String string3, int n3, aca aca2) {
        this.ln = string2;
        this.lo = string3;
        this.lp = n3;
        this.lr = aca2;
        this.lq = agf2;
    }

    @Generated
    public String ea() {
        return this.lo;
    }

    @Generated
    public agf eb() {
        return this.lq;
    }

    @Generated
    public aca ec() {
        return this.lr;
    }

    @Generated
    public String getName() {
        return this.ln;
    }

    @Generated
    public int ed() {
        return this.lp;
    }

    private static /* synthetic */ gj[] ee() {
        return new gj[]{ld, le, lf, lg, lh, li, lj, lk, ll, lm};
    }

    static {
        ls = gj.ee();
    }
}

