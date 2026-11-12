/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import net.minecraft.client.gui.cs;
import net.minecraft.client.gui.f;
import net.minecraft.src.a;
import net.optifine.shaders.ah;

public class c
extends f {
    private static final String ejC = "/reloadShaders";
    private static final String ejD = "/reloadChunks";

    public c(f f2) {
        super(cs.a(f2));
    }

    @Override
    public void sendChatMessage(String string) {
        if (this.ik(string)) {
            c.aER.bha.Ey().cO(string);
        } else {
            super.sendChatMessage(string);
        }
    }

    private boolean ik(String string) {
        if (string == null) {
            return false;
        }
        if ((string = string.trim()).equals(ejC)) {
            if (a.aoG()) {
                ah.aFx();
                ah.aEZ();
            }
            return true;
        }
        if (string.equals(ejD)) {
            c.aER.bgG.KI();
            return true;
        }
        return false;
    }
}

