/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class c {
    private int dQE = 18;
    private int dQF = 128;
    private int dQG = 18;
    private int cDF = 0;
    private int cDG = 0;
    private int eMv = 0;
    private int[][][] eMw = null;
    private int[] eMx = null;
    private int eMy = 0;

    public c(int n2, int n3, int n4) {
        this.dQE = n2;
        this.dQF = n3;
        this.dQG = n4;
        this.eMw = new int[n2][n3][n4];
        this.aIE();
    }

    public void aIE() {
        for (int i2 = 0; i2 < this.dQE; ++i2) {
            int[][] nArray = this.eMw[i2];
            for (int i3 = 0; i3 < this.dQF; ++i3) {
                int[] nArray2 = nArray[i3];
                for (int i4 = 0; i4 < this.dQG; ++i4) {
                    nArray2[i4] = -1;
                }
            }
        }
    }

    public void aa(int n2, int n3, int n4) {
        this.cDF = n2;
        this.cDG = n3;
        this.eMv = n4;
        this.aIE();
    }

    public int T(int n2, int n3, int n4) {
        try {
            this.eMx = this.eMw[n2 - this.cDF][n3 - this.cDG];
            this.eMy = n4 - this.eMv;
            return this.eMx[this.eMy];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            arrayIndexOutOfBoundsException.printStackTrace();
            return -1;
        }
    }

    public void ks(int n2) {
        try {
            this.eMx[this.eMy] = n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

