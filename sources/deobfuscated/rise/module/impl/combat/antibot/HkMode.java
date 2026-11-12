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

public final class HkMode
extends Mode<AntiBot> {
    @EventLink
    public final Listener<PreMotionEvent> rs = preMotionEvent -> HkMode.aER.bgF.dCY.forEach(a2 -> {
        String string = a2.xW().arq();
        if (!HkMode.r(string)) {
            afl.c("Detected bot (invalid colour start): " + string, new Object[0]);
            Client.a.x().b(this, (c)a2);
        }
    });

    public HkMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    public static boolean r(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        return string.matches("^\u00a7[0-9a-fk-or].*");
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

