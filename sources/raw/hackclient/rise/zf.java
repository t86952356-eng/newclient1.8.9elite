/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.wy;
import hackclient.rise.xi;
import java.awt.Color;
import lombok.Generated;

public final class zf {
    public gi cg;
    public aka aqy = new aka(5000.0, 0.0);
    public aka atP = new aka(5000.0, 0.0);
    public float atQ;
    public String atR = "";
    public float atS = 0.0f;
    public float atT;
    public Color anq = Color.WHITE;
    public String atU = "";
    public boolean atV = false;
    public String atW = "";
    public String atX = "";
    public boolean atY;

    public float nG() {
        return this.atS + this.atT;
    }

    public zf(gi gi2) {
        this.cg = gi2;
    }

    public boolean a(xi xi2) {
        if (this.dl() instanceof wy) {
            return false;
        }
        if (!this.dl().getModuleInfo().allowDisable()) {
            return false;
        }
        switch (((akg)xi2.lV().wD()).getName()) {
            case "All": {
                return true;
            }
            case "Exclude render": {
                return !this.dl().getModuleInfo().category().equals((Object)gj.lh);
            }
            case "Only bound": {
                return this.dl().getKey() != 0;
            }
        }
        return true;
    }

    @Generated
    public gi dl() {
        return this.cg;
    }

    @Generated
    public aka nH() {
        return this.aqy;
    }

    @Generated
    public aka nI() {
        return this.atP;
    }

    @Generated
    public float nJ() {
        return this.atQ;
    }

    @Generated
    public String getTag() {
        return this.atR;
    }

    @Generated
    public float nK() {
        return this.atS;
    }

    @Generated
    public float nL() {
        return this.atT;
    }

    @Generated
    public Color nM() {
        return this.anq;
    }

    @Generated
    public String nN() {
        return this.atU;
    }

    @Generated
    public boolean nO() {
        return this.atV;
    }

    @Generated
    public String getDisplayName() {
        return this.atW;
    }

    @Generated
    public String nP() {
        return this.atX;
    }

    @Generated
    public boolean nQ() {
        return this.atY;
    }

    @Generated
    public void k(gi gi2) {
        this.cg = gi2;
    }

    @Generated
    public void h(aka aka2) {
        this.aqy = aka2;
    }

    @Generated
    public void i(aka aka2) {
        this.atP = aka2;
    }

    @Generated
    public void s(float f2) {
        this.atQ = f2;
    }

    @Generated
    public void an(String string) {
        this.atR = string;
    }

    @Generated
    public void t(float f2) {
        this.atS = f2;
    }

    @Generated
    public void u(float f2) {
        this.atT = f2;
    }

    @Generated
    public void b(Color color) {
        this.anq = color;
    }

    @Generated
    public void ao(String string) {
        this.atU = string;
    }

    @Generated
    public void x(boolean bl2) {
        this.atV = bl2;
    }

    @Generated
    public void ap(String string) {
        this.atW = string;
    }

    @Generated
    public void aq(String string) {
        this.atX = string;
    }

    @Generated
    public void y(boolean bl2) {
        this.atY = bl2;
    }
}

