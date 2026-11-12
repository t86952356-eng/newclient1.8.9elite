/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.antibot;

import hackclient.rise.afl;
import net.minecraft.entity.c;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.AntiBot;

public final class HsMode
extends Mode<AntiBot> {
    @EventLink
    public final Listener<PreMotionEvent> rB = preMotionEvent -> HsMode.aER.bgF.dCY.forEach(a2 -> {
        String string = a2.xW().arq();
        String string2 = HsMode.s(string);
        long l2 = string.chars().filter(n2 -> n2 == 167).count();
        if (l2 >= 8L && string.contains("\u00a7\u0000\u00a7\u0000\u00a7\u0000\u00a7\u0000")) {
            if (HsMode.aER.bgK.Zz == 10) {
                afl.c("Detected bot by formatting pattern: " + string, new Object[0]);
            }
            Client.a.x().b(this, (c)a2);
        }
    });

    public HsMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    public static String s(String string) {
        if (string == null) {
            return null;
        }
        string = string.replaceAll("\u00a7.", "");
        return string.replaceAll("\\p{Cntrl}", "").trim();
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

