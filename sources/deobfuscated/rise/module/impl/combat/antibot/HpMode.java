/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package rise.module.impl.combat.antibot;

import hackclient.rise.r;
import net.minecraft.entity.c;
import net.minecraft.util.cf;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.AntiBot;

public final class HpMode
extends Mode<AntiBot> {
    private boolean ji;
    @EventLink
    public final Listener<PreMotionEvent> rz = preMotionEvent -> {
        if (Mouse.isButtonDown((int)2) || Keyboard.isKeyDown((int)29) && HpMode.aER.aIY.chw.Re()) {
            if (this.ji) {
                return;
            }
            this.ji = true;
            if (HpMode.aER.bhc.dzu == cf.dzz) {
                c c2;
                r r2 = Client.a.x();
                if (r2.a(this, c2 = HpMode.aER.bhc.dzw)) {
                    Client.a.x().c(this, c2);
                } else {
                    Client.a.x().b(this, c2);
                }
            }
        } else {
            this.ji = false;
        }
    };

    public HpMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

