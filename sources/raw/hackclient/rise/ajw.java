/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public class ajw<A, B, C> {
    private A aRh;
    private B aRi;
    private C aRj;

    public ajw(A a2, B b2, C c2) {
        this.aRh = a2;
        this.aRi = b2;
        this.aRj = c2;
    }

    public A wi() {
        return this.aRh;
    }

    public void j(A a2) {
        this.aRh = a2;
    }

    public B wj() {
        return this.aRi;
    }

    public void k(B b2) {
        this.aRi = b2;
    }

    public C wk() {
        return this.aRj;
    }

    public void l(C c2) {
        this.aRj = c2;
    }

    public String toString() {
        return this.wi().toString() + " " + String.valueOf(this.wj()) + " " + String.valueOf(this.wk());
    }
}

