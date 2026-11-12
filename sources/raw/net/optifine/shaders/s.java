/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.nio.IntBuffer;
import java.util.Arrays;
import net.optifine.render.e;
import net.optifine.render.f;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.i;
import net.optifine.shaders.u;

public class s {
    private final int evy;
    private final String evz;
    private final u evA;
    private final s evB;
    private e evC;
    private f evD;
    private i evE;
    private final Boolean[] evF = new Boolean[8];
    private int id;
    private int evG;
    private String evH;
    private IntBuffer evI;
    private IntBuffer evJ;
    private int evK;
    private int evL;
    private final boolean[] evM = new boolean[8];

    public s(int n2, String string, u u2, s s2) {
        this.evy = n2;
        this.evz = string;
        this.evA = u2;
        this.evB = s2;
    }

    public s(int n2, String string, u u2, boolean bl2) {
        this.evy = n2;
        this.evz = string;
        this.evA = u2;
        this.evB = bl2 ? this : null;
    }

    public void aEx() {
        this.evC = null;
        this.evD = null;
        this.evE = null;
        Arrays.fill((Object[])this.evF, null);
    }

    public void aEy() {
        this.id = 0;
        this.evG = 0;
    }

    public void aEz() {
        this.evH = null;
        this.evK = 0;
        this.evL = 0;
        if (this.evJ == null) {
            this.evJ = ah.jS(8);
        }
    }

    public void a(s s2) {
        this.id = s2.getId();
        this.evC = s2.aEI();
        this.evD = s2.aEJ();
        this.evE = s2.aEK();
        System.arraycopy(s2.aEL(), 0, this.evF, 0, this.evF.length);
        this.evH = s2.aED();
        this.evI = s2.aEE();
        this.evK = s2.aEG();
        this.evL = s2.aEH();
        System.arraycopy(s2.aEM(), 0, this.evM, 0, this.evM.length);
    }

    public int OY() {
        return this.evy;
    }

    public String getName() {
        return this.evz;
    }

    public u aEA() {
        return this.evA;
    }

    public s aEB() {
        return this.evB;
    }

    public int getId() {
        return this.id;
    }

    public int aEC() {
        return this.evG;
    }

    public String aED() {
        return this.evH;
    }

    public IntBuffer aEE() {
        return this.evI;
    }

    public IntBuffer aEF() {
        return this.evJ;
    }

    public int aEG() {
        return this.evK;
    }

    public int aEH() {
        return this.evL;
    }

    public e aEI() {
        return this.evC;
    }

    public f aEJ() {
        return this.evD;
    }

    public i aEK() {
        return this.evE;
    }

    public Boolean[] aEL() {
        return this.evF;
    }

    public boolean[] aEM() {
        return this.evM;
    }

    public void k(int n2) {
        this.id = n2;
    }

    public void jO(int n2) {
        this.evG = n2;
    }

    public void iB(String string) {
        this.evH = string;
    }

    public void c(IntBuffer intBuffer) {
        this.evI = intBuffer;
    }

    public void jP(int n2) {
        this.evK = n2;
    }

    public void jQ(int n2) {
        this.evL = n2;
    }

    public void c(e e2) {
        this.evC = e2;
    }

    public void c(f f2) {
        this.evD = f2;
    }

    public void a(i i2) {
        this.evE = i2;
    }

    public String aEN() {
        if (this.id == 0) {
            return "none";
        }
        s s2 = this;
        while (s2.aEC() != this.id) {
            if (s2.aEB() == null || s2.aEB() == s2) {
                return "unknown";
            }
            s2 = s2.aEB();
        }
        return s2.getName();
    }

    public String toString() {
        return "name: " + this.evz + ", id: " + this.id + ", ref: " + this.evG + ", real: " + this.aEN();
    }
}

