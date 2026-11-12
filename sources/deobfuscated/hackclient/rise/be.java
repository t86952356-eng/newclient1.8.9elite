/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.entity.n;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.item.co;
import net.minecraft.util.cr;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;

public final class be
extends am {
    private static boolean da;
    @EventLink(cH=4)
    public final Listener<PreMotionEvent> db = preMotionEvent -> {
        da = false;
        if (be.aER.bgR instanceof h) {
            b b2 = be.aER.bgK.cHY;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            for (ak ak2 : b2.cSK) {
                String string;
                co co2;
                if (!ak2.GJ() || n4++ > 26 || (co2 = ak2.ls()) == null) continue;
                String string2 = co2.getDisplayName();
                String string3 = this.b(co2);
                String string4 = string2.toLowerCase().replace(" ", "");
                n2 = string4.contains(string = string3.toLowerCase().replace(" ", "")) ? (int)((double)n2 - 0.1) : ++n2;
                ++n3;
            }
            da = (float)n2 / (float)n3 > 0.5f;
        }
    };

    public static boolean aY() {
        return da;
    }

    private String b(co co2) {
        Object object = cr.gm(co2.xB() + ".name").trim();
        String string = n.eF(co2.yc());
        if (string != null) {
            object = (String)object + " " + cr.gm("entity." + string + ".name");
        }
        return object;
    }
}

