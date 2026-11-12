/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

final class ws {
    final int ans;
    final double[] ant;
    final double[] anu;
    int anv = 0;
    boolean anw = false;

    ws(int n2) {
        this.ans = n2;
        this.ant = new double[n2];
        this.anu = new double[n2];
    }

    void h(double d2, double d3) {
        this.ant[this.anv] = d2;
        this.anu[this.anv] = d3;
        ++this.anv;
        if (this.anv >= this.ans) {
            this.anv = 0;
            this.anw = true;
        }
    }

    void clear() {
        this.anv = 0;
        this.anw = false;
    }

    int lD() {
        return this.anw ? this.ans : this.anv;
    }

    double O(int n2) {
        int n3 = this.Q(n2);
        return this.ant[n3];
    }

    double P(int n2) {
        int n3 = this.Q(n2);
        return this.anu[n3];
    }

    int Q(int n2) {
        int n3;
        int n4 = n3 = this.anw ? this.ans : this.anv;
        if (n3 <= 0) {
            return 0;
        }
        int n5 = (this.anv - 1 + this.ans) % this.ans;
        int n6 = (n5 - (n3 - 1 - n2) + this.ans) % this.ans;
        return n6;
    }
}

