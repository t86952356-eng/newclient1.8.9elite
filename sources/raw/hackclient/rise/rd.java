/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

final class rd {
    double x;
    double y;
    double z;

    rd(double d2, double d3, double d4) {
        this.d(d2, d3, d4);
    }

    rd a(rd rd2) {
        this.x += rd2.x;
        this.y += rd2.y;
        this.z += rd2.z;
        return this;
    }

    rd p(double d2) {
        this.x *= d2;
        this.y *= d2;
        this.z *= d2;
        return this;
    }

    rd d(double d2, double d3, double d4) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
        return this;
    }
}

