/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.scoreboard;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import net.minecraft.scoreboard.i;
import net.minecraft.scoreboard.l;
import net.minecraft.scoreboard.m;
import net.minecraft.util.an;

public class h
extends l {
    private final i djP;
    private final String djQ;
    private final Set<String> djR = Sets.newHashSet();
    private String djS;
    private String djT = "";
    private String djU = "";
    private boolean djV = true;
    private boolean djW = true;
    private m djX = m.dkm;
    private m djY = m.dkm;
    private an djZ = an.dwh;

    public h(i i2, String string) {
        this.djP = i2;
        this.djQ = string;
        this.djS = string;
    }

    @Override
    public String akq() {
        return this.djQ;
    }

    public String ahW() {
        return this.djS;
    }

    public void fl(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.djS = string;
        this.djP.c(this);
    }

    @Override
    public Collection<String> akr() {
        return this.djR;
    }

    public String aks() {
        return this.djT;
    }

    public void fm(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.djT = string;
        this.djP.c(this);
    }

    public String akt() {
        return this.djU;
    }

    public void fn(String string) {
        this.djU = string;
        this.djP.c(this);
    }

    @Override
    public String formatString(String string) {
        return this.aks() + string + this.akt();
    }

    public static String a(l l2, String string) {
        return l2 == null ? string : l2.formatString(string);
    }

    @Override
    public boolean aku() {
        return this.djV;
    }

    public void cb(boolean bl2) {
        this.djV = bl2;
        this.djP.c(this);
    }

    @Override
    public boolean akv() {
        return this.djW;
    }

    public void cc(boolean bl2) {
        this.djW = bl2;
        this.djP.c(this);
    }

    @Override
    public m akw() {
        return this.djX;
    }

    @Override
    public m akx() {
        return this.djY;
    }

    public void a(m m2) {
        this.djX = m2;
        this.djP.c(this);
    }

    public void b(m m2) {
        this.djY = m2;
        this.djP.c(this);
    }

    public int aky() {
        int n2 = 0;
        if (this.aku()) {
            n2 |= 1;
        }
        if (this.akv()) {
            n2 |= 2;
        }
        return n2;
    }

    public void gX(int n2) {
        this.cb((n2 & 1) > 0);
        this.cc((n2 & 2) > 0);
    }

    public void a(an an2) {
        this.djZ = an2;
    }

    public an akz() {
        return this.djZ;
    }
}

