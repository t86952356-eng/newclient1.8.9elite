/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public class yf {
    public final int arc;
    public final float ard;

    public yf(int n2, float f2) {
        this.arc = n2;
        this.ard = f2;
    }

    public float mD() {
        return (float)this.arc * this.ard * 2.0f;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof yf)) {
            return false;
        }
        yf yf2 = (yf)object;
        return this.arc == yf2.arc && Float.compare(yf2.ard, this.ard) == 0;
    }

    public int hashCode() {
        int n2 = this.arc;
        n2 = 31 * n2 + (this.ard != 0.0f ? Float.floatToIntBits(this.ard) : 0);
        return n2;
    }
}

