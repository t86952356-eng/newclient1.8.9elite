/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.bu;
import net.minecraft.entity.n;
import net.minecraft.item.co;
import net.minecraft.util.cr;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;

public final class bt
extends am {
    private static boolean fU;
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> fV = preUpdateEvent -> {
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            co co2 = bu.bO();
            fU = !bt.d(co2).contains(co2.getDisplayName());
        } else {
            fU = false;
        }
    };

    public static boolean bM() {
        return fU;
    }

    public static boolean c(co co2) {
        if (co2 == null) {
            return false;
        }
        if (co2 == bt.aER.bgK.cHV.bO()) {
            return bt.bM();
        }
        return !bt.d(co2).contains(co2.getDisplayName());
    }

    public static boolean a(co co2, boolean bl2) {
        if (co2 == null) {
            return false;
        }
        if (co2 == bt.aER.bgK.cHV.bO()) {
            return bt.bM();
        }
        if (bl2) {
            return !bt.d(co2).contains(co2.getDisplayName());
        }
        return false;
    }

    public static boolean h(int n2) {
        return bt.c(bt.aER.bgK.cHV.fi(n2));
    }

    public static boolean a(int n2, boolean bl2) {
        return bt.a(bt.aER.bgK.cHV.fi(n2), bl2);
    }

    public static String d(co co2) {
        Object object = cr.gm(co2.xB() + ".name").trim();
        String string = n.eF(co2.yc());
        if (string != null) {
            object = (String)object + " " + cr.gm("entity." + string + ".name");
        }
        return object;
    }
}

