/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.awt.image.BufferedImage;
import java.util.Arrays;

public class yh {
    private static final int arN = 300;
    private static final int arO = 200;
    private final String arP;
    private final int arQ;
    private final int arR;
    private final long arS;
    private volatile BufferedImage[] arT;
    private volatile int[] arU = new int[0];
    private volatile int[] arV = new int[]{100};
    private volatile int arW;
    private volatile int arX;
    private volatile boolean loaded;
    private volatile boolean arY;
    private volatile boolean arZ;
    private volatile long asa = System.currentTimeMillis();

    public yh(String string, int n2, int n3) {
        this.arP = string;
        this.arQ = n2;
        this.arR = n3;
        this.arS = System.currentTimeMillis();
    }

    public String np() {
        return this.arP;
    }

    public int nq() {
        return this.arQ;
    }

    public int nr() {
        return this.arR;
    }

    public long ns() {
        return this.arS;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public boolean nt() {
        return this.arY;
    }

    public int[] nu() {
        return this.arU;
    }

    public synchronized void b(BufferedImage bufferedImage) {
        this.a(new BufferedImage[]{bufferedImage}, new int[]{100});
    }

    public synchronized void a(BufferedImage[] bufferedImageArray, int[] nArray) {
        this.arT = bufferedImageArray;
        this.arW = bufferedImageArray[0].getWidth();
        this.arX = bufferedImageArray[0].getHeight();
        this.loaded = true;
        this.arY = false;
        this.arZ = true;
        this.arU = new int[bufferedImageArray.length];
        Arrays.fill(this.arU, -1);
        this.arV = nArray == null || nArray.length != bufferedImageArray.length ? new int[bufferedImageArray.length] : nArray;
        for (int i2 = 0; i2 < this.arV.length; ++i2) {
            if (this.arV[i2] > 0) continue;
            this.arV[i2] = 100;
        }
        this.asa = System.currentTimeMillis();
    }

    public synchronized boolean nv() {
        return this.arZ && this.arT != null && this.arU.length > 0 && this.arU[0] < 0;
    }

    public synchronized BufferedImage[] nw() {
        return this.arT;
    }

    public synchronized void a(int[] nArray) {
        this.arU = nArray;
        this.arZ = false;
        this.arT = null;
    }

    public synchronized void nx() {
        this.arY = true;
        this.loaded = false;
        this.arZ = false;
        this.arT = null;
        this.arU = new int[0];
    }

    public int ny() {
        int n2;
        int[] nArray = this.arU;
        if (nArray == null || nArray.length == 0) {
            return -1;
        }
        if (nArray.length == 1) {
            return nArray[0];
        }
        int[] nArray2 = this.arV;
        int n3 = 0;
        int[] nArray3 = nArray2;
        int n4 = nArray3.length;
        for (n2 = 0; n2 < n4; ++n2) {
            int n5 = nArray3[n2];
            n3 += Math.max(n5, 20);
        }
        if (n3 <= 0) {
            return nArray[0];
        }
        long l2 = (System.currentTimeMillis() - this.asa) % (long)n3;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            if ((l2 -= (long)Math.max(nArray2[n2], 20)) >= 0L) continue;
            return nArray[n2];
        }
        return nArray[0];
    }

    public int q(float f2) {
        if (this.arW <= 0 || this.arX <= 0) {
            return Math.min((int)f2, 300);
        }
        float f3 = Math.min(f2, 300.0f);
        float f4 = (float)this.arW / (float)this.arX;
        int n2 = Math.min(this.arW, (int)f3);
        int n3 = Math.max(1, Math.round((float)n2 / f4));
        if (n3 > 200) {
            n3 = 200;
            n2 = Math.max(1, Math.round((float)n3 * f4));
        }
        return Math.max(1, n2);
    }

    public int r(float f2) {
        if (this.arW <= 0 || this.arX <= 0) {
            return 0;
        }
        float f3 = (float)this.arW / (float)this.arX;
        int n2 = Math.min(this.arW, Math.min((int)f2, 300));
        int n3 = Math.max(1, Math.round((float)n2 / f3));
        return Math.min(n3, 200);
    }
}

