/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.stats;

import net.minecraft.block.Block;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.b;
import net.minecraft.stats.c;
import net.minecraft.stats.f;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.bc;
import net.minecraft.util.cr;
import net.minecraft.util.t;

public class a
extends f {
    public final int dos;
    public final int dot;
    public final a dou;
    private final String dov;
    private c dow;
    public final co dox;
    private boolean doy;

    public a(String string, String string2, int n2, int n3, d d2, a a2) {
        this(string, string2, n2, n3, new co(d2), a2);
    }

    public a(String string, String string2, int n2, int n3, Block block, a a2) {
        this(string, string2, n2, n3, new co(block), a2);
    }

    public a(String string, String string2, int n2, int n3, co co2, a a2) {
        super(string, new t("achievement." + string2, new Object[0]));
        this.dox = co2;
        this.dov = "achievement." + string2 + ".desc";
        this.dos = n2;
        this.dot = n3;
        if (n2 < b.doz) {
            b.doz = n2;
        }
        if (n3 < b.doA) {
            b.doA = n3;
        }
        if (n2 > b.doB) {
            b.doB = n2;
        }
        if (n3 > b.doC) {
            b.doC = n3;
        }
        this.dou = a2;
    }

    public a apl() {
        this.dpp = true;
        return this;
    }

    public a apm() {
        this.doy = true;
        return this;
    }

    public a apn() {
        super.apr();
        b.doD.add(this);
        return this;
    }

    @Override
    public boolean apo() {
        return true;
    }

    @Override
    public ba app() {
        ba ba2 = super.app();
        ba2.arp().b(this.apq() ? an.dvQ : an.dvV);
        return ba2;
    }

    public a m(Class<? extends bc> clazz) {
        return (a)super.n(clazz);
    }

    public String getDescription() {
        return this.dow != null ? this.dow.formatString(cr.gm(this.dov)) : cr.gm(this.dov);
    }

    public a a(c c2) {
        this.dow = c2;
        return this;
    }

    public boolean apq() {
        return this.doy;
    }

    public /* synthetic */ f n(Class clazz) {
        return this.m(clazz);
    }

    @Override
    public /* synthetic */ f apr() {
        return this.apn();
    }

    @Override
    public /* synthetic */ f aps() {
        return this.apl();
    }
}

