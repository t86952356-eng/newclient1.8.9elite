/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aec;
import hackclient.rise.akd;
import net.minecraft.client.Minecraft;
import net.minecraft.util.bt;
import net.minecraft.util.cw;
import rise.util.math.Vector2f;

public class hh {
    public final aec<cw<Vector2f, akd>> rh = new aec(10);

    public void a(Vector2f vector2f, akd akd2, int n2) {
        if (n2 < this.rh.size()) {
            return;
        }
        for (int i2 = 0; i2 < n2 - this.rh.size(); ++i2) {
            this.rh.add(null);
        }
        this.rh.add(new cw<Vector2f, akd>(vector2f, akd2));
    }

    public Vector2f gy() {
        Minecraft minecraft = Minecraft.getMinecraft();
        cw cw2 = (cw)this.rh.getFirst();
        this.rh.removeFirst();
        Vector2f vector2f = (Vector2f)cw2.wi();
        akd akd2 = (akd)cw2.wj();
        double d2 = Math.hypot(akd2.getX(), akd2.getZ());
        float f2 = (float)(bt.y(akd2.getZ(), akd2.getX()) * 57.2957763671875) - 90.0f;
        float f3 = (float)(-(bt.y(akd2.getY(), d2) * 57.2957763671875));
        Vector2f vector2f2 = new Vector2f(f2, f3);
        Vector2f vector2f3 = new Vector2f(vector2f2.getX() + vector2f.getX(), bt.I(vector2f2.getY(), -90.0f, 90.0f));
        return new Vector2f(bt.bN(vector2f3.getX() - minecraft.bgK.pl), vector2f3.getY() - minecraft.bgK.pm);
    }
}

