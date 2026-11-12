/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class d {
    private int dQE = 18;
    private int dQF = 128;
    private int dQG = 18;
    private int cDF = 0;
    private int cDG = 0;
    private int eMv = 0;
    private byte[][][] eMz = null;
    private byte[] eMA = null;
    private int eMy = 0;

    public d(int n2, int n3, int n4) {
        this.dQE = n2;
        this.dQF = n3;
        this.dQG = n4;
        this.eMz = new byte[n2][n3][n4];
        this.aIE();
    }

    public void aIE() {
        for (int i2 = 0; i2 < this.dQE; ++i2) {
            byte[][] byArray = this.eMz[i2];
            for (int i3 = 0; i3 < this.dQF; ++i3) {
                byte[] byArray2 = byArray[i3];
                for (int i4 = 0; i4 < this.dQG; ++i4) {
                    byArray2[i4] = -1;
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

    public byte ao(int n2, int n3, int n4) {
        try {
            this.eMA = this.eMz[n2 - this.cDF][n3 - this.cDG];
            this.eMy = n4 - this.eMv;
            return this.eMA[this.eMy];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            arrayIndexOutOfBoundsException.printStackTrace();
            return -1;
        }
    }

    public void d(byte by2) {
        try {
            this.eMA[this.eMy] = by2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

