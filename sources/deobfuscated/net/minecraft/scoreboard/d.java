/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package net.minecraft.scoreboard;

import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import net.minecraft.entity.player.a;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;

public class d {
    public static final Comparator<d> djD = (d2, d3) -> -(d2.akm() > d3.akm() ? 1 : (d2.akm() < d3.akm() ? -1 : d3.getPlayerName().compareToIgnoreCase(d2.getPlayerName())));
    private final i djE;
    private final g djF;
    private String playerName;
    private int djH;
    private boolean djI;
    private boolean djJ;

    public d(i i2, g g2, String string) {
        this.djE = i2;
        this.djF = g2;
        this.playerName = string;
        this.djJ = true;
    }

    public void gU(int n2) {
        if (this.djF.akp().akh()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.gW(this.akm() + n2);
    }

    public void gV(int n2) {
        if (this.djF.akp().akh()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.gW(this.akm() - n2);
    }

    public void akl() {
        if (this.djF.akp().akh()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.gU(1);
    }

    public int akm() {
        return this.djH;
    }

    public void gW(int n2) {
        int n3 = this.djH;
        this.djH = n2;
        if (n3 != n2 || this.djJ) {
            this.djJ = false;
            this.ako().e(this);
        }
    }

    public g akn() {
        return this.djF;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public i ako() {
        return this.djE;
    }

    public boolean IH() {
        return this.djI;
    }

    public void ca(boolean bl2) {
        this.djI = bl2;
    }

    public void I(List<a> list) {
        this.gW(this.djF.akp().H(list));
    }

    @Generated
    public void fk(String string) {
        this.playerName = string;
    }
}

