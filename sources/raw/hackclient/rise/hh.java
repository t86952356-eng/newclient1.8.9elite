/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aec;
import hackclient.rise.akb;
import hackclient.rise.akd;
import net.minecraft.client.d;
import net.minecraft.util.bt;
import net.minecraft.util.cw;

public class hh {
    public final aec<cw<akb, akd>> rh = new aec(10);

    public void a(akb akb2, akd akd2, int n2) {
        if (n2 < this.rh.size()) {
            return;
        }
        for (int i2 = 0; i2 < n2 - this.rh.size(); ++i2) {
            this.rh.add(null);
        }
        this.rh.add(new cw<akb, akd>(akb2, akd2));
    }

    public akb gy() {
        d d2 = d.AZ();
        cw cw2 = (cw)this.rh.getFirst();
        this.rh.removeFirst();
        akb akb2 = (akb)cw2.wi();
        akd akd2 = (akd)cw2.wj();
        double d3 = Math.hypot(akd2.getX(), akd2.getZ());
        float f2 = (float)(bt.y(akd2.getZ(), akd2.getX()) * 57.2957763671875) - 90.0f;
        float f3 = (float)(-(bt.y(akd2.getY(), d3) * 57.2957763671875));
        akb akb3 = new akb(f2, f3);
        akb akb4 = new akb(akb3.getX() + akb2.getX(), bt.I(akb3.getY(), -90.0f, 90.0f));
        return new akb(bt.bN(akb4.getX() - d2.bgK.pl), akb4.getY() - d2.bgK.pm);
    }
}

