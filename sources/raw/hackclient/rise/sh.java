/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akb;
import hackclient.rise.akc;
import hackclient.rise.akd;
import hackclient.rise.ake;

final class sh {
    ake Wa;
    akc Wb;

    public sh(akd akd2, akb akb2) {
        this.Wa = new ake((int)akd2.x, (int)akd2.y, (int)akd2.z);
        this.Wb = new akc((int)(akb2.getX() / 15.0f), (int)(akb2.getY() / 20.0f));
    }

    private String hS() {
        return this.Wa.alM + " " + this.Wa.alN + " " + this.Wa.aRr + " " + this.Wb.alM + " " + this.Wb.alN;
    }
}

