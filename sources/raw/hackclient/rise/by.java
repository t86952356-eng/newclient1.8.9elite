/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.bz;
import lombok.Generated;
import net.minecraft.util.cm;

public class by {
    private bz gp;
    private String gq;
    private String gr;
    private String[] gs;
    private cm[] gt;
    private boolean gu = false;
    private int gv = 0;

    public by(String string) {
        this.gr = string;
    }

    public cm bS() {
        return this.gt[this.gv % this.gt.length];
    }

    public boolean bT() {
        return this.gs.length != 0;
    }

    public void a(bz bz2) {
        this.gp = bz2;
    }

    public void o(String string) {
        this.gq = string;
    }

    public String bU() {
        return this.gp.bU();
    }

    public bz bV() {
        return this.gp;
    }

    @Generated
    public String bW() {
        return this.gq;
    }

    @Generated
    public String bX() {
        return this.gr;
    }

    @Generated
    public String[] bY() {
        return this.gs;
    }

    @Generated
    public void b(String[] stringArray) {
        this.gs = stringArray;
    }

    @Generated
    public cm[] bZ() {
        return this.gt;
    }

    @Generated
    public void a(cm[] cmArray) {
        this.gt = cmArray;
    }

    @Generated
    public boolean ca() {
        return this.gu;
    }

    @Generated
    public void e(boolean bl2) {
        this.gu = bl2;
    }

    @Generated
    public int cb() {
        return this.gv;
    }

    @Generated
    public void j(int n2) {
        this.gv = n2;
    }
}

