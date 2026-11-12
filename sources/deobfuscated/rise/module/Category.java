/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module;

import hackclient.rise.aca;
import hackclient.rise.acc;
import hackclient.rise.acd;
import hackclient.rise.ach;
import hackclient.rise.aci;
import hackclient.rise.acj;
import hackclient.rise.agf;
import hackclient.rise.gb;
import lombok.Generated;

public final class Category
extends Enum<Category> {
    public static final /* enum */ Category ld = new Category("category.search", gb.kv.o(17), "U", 1, new aci());
    public static final /* enum */ Category le = new Category("category.combat", gb.ku.o(17), "a", 2, new acc());
    public static final /* enum */ Category lf = new Category("category.movement", gb.ku.o(17), "b", 3, new acc());
    public static final /* enum */ Category lg = new Category("category.player", gb.ku.o(17), "c", 4, new acc());
    public static final /* enum */ Category lh = new Category("category.render", gb.ku.o(17), "g", 5, new acc());
    public static final /* enum */ Category li = new Category("category.exploit", gb.ku.o(17), "a", 6, new acc());
    public static final /* enum */ Category lj = new Category("category.ghost", gb.ku.o(17), "f", 7, new acc());
    public static final /* enum */ Category lk = new Category("category.script", gb.kv.o(17), "m", 7, new acd());
    public static final /* enum */ Category ll = new Category("category.themes", gb.kv.o(17), "U", 10, new acj());
    public static final /* enum */ Category lm = new Category("category.language", gb.kv.o(17), "U", 10, new ach());
    private final String name;
    private final String lo;
    private final int lp;
    private final agf lq;
    public final aca lr;
    private static final /* synthetic */ Category[] ls;

    public static Category[] values() {
        return (Category[])ls.clone();
    }

    public static Category valueOf(String string) {
        return Enum.valueOf(Category.class, string);
    }

    private Category(String string2, agf agf2, String string3, int n3, aca aca2) {
        this.name = string2;
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
        return this.name;
    }

    @Generated
    public int ed() {
        return this.lp;
    }

    private static /* synthetic */ Category[] ee() {
        return new Category[]{ld, le, lf, lg, lh, li, lj, lk, ll, lm};
    }

    static {
        ls = Category.ee();
    }
}

