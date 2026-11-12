/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public class ajt {
    private final int size;
    private final float[] aRf;

    public ajt(int n2) {
        this.size = n2;
        this.aRf = new float[n2];
    }

    public void vg() {
        int n2;
        float f2 = (float)this.size / 2.0f;
        float f3 = 0.0f;
        for (n2 = 0; n2 < this.size; ++n2) {
            float f4 = (float)n2 / f2;
            this.aRf[n2] = 1.0f / (Math.abs(f2) * 2.5066283f) * (float)Math.exp(-0.5 * (double)f4 * (double)f4);
            f3 += n2 > 0 ? this.aRf[n2] * 2.0f : this.aRf[0];
        }
        n2 = 0;
        while (n2 < this.size) {
            int n3 = n2++;
            this.aRf[n3] = this.aRf[n3] / f3;
        }
    }

    public int getSize() {
        return this.size;
    }

    public float[] wh() {
        return this.aRf;
    }
}

