/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akc;
import hackclient.rise.akd;
import hackclient.rise.ake;
import rise.util.math.Vector2f;

final class sh {
    ake Wa;
    akc Wb;

    public sh(akd akd2, Vector2f vector2f) {
        this.Wa = new ake((int)akd2.x, (int)akd2.y, (int)akd2.z);
        this.Wb = new akc((int)(vector2f.getX() / 15.0f), (int)(vector2f.getY() / 20.0f));
    }

    private String hS() {
        return this.Wa.alM + " " + this.Wa.alN + " " + this.Wa.aRr + " " + this.Wb.alM + " " + this.Wb.alN;
    }
}

