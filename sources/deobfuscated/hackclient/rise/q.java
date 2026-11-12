/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.aha;
import hackclient.rise.ahg;
import hackclient.rise.cg;
import hackclient.rise.dy;
import hackclient.rise.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.KeyboardInputEvent;

public class q {
    @EventLink(cH=0)
    public final Listener<KeyboardInputEvent> bl = keyboardInputEvent -> {
        if (keyboardInputEvent.isCancelled()) {
            return;
        }
        if (keyboardInputEvent.cO() == 25 && GuiScreen.isCtrlKeyDown() && GuiScreen.isShiftKeyDown()) {
            if (Keyboard.isRepeatEvent()) {
                keyboardInputEvent.cF();
                return;
            }
            boolean bl2 = aha.uQ();
            if (Minecraft.getMinecraft() != null && Minecraft.getMinecraft().bgF != null && Minecraft.getMinecraft().bgK != null) {
                cg.a(ahg.cf("module.render.chat.pinyin_ime"), ahg.cf(bl2 ? "ui.chat.pinyin_ime.hint.on" : "ui.chat.pinyin_ime.hint.off"), 1500);
            }
            keyboardInputEvent.cF();
            return;
        }
        if (keyboardInputEvent.cQ() != null) {
            return;
        }
        this.aP().stream().filter(p2 -> p2.getKey() == keyboardInputEvent.cO()).forEach(p::onKey);
    };
    @EventLink(cH=0)
    public final Listener<dy> bm = dy2 -> {
        if (Minecraft.getMinecraft().bgR != null) {
            return;
        }
        int n2 = dy2.cW() - 100;
        this.aP().stream().filter(p2 -> p2.getKey() == n2).forEach(p::onKey);
    };

    public void init() {
        Client.a.e().b(this);
    }

    public List<p> aP() {
        ArrayList<p> arrayList = new ArrayList<p>();
        arrayList.addAll(Client.a.g().ef());
        arrayList.addAll(Client.a.p());
        return arrayList;
    }

    public <T extends p> T a(String string) {
        p p3 = this.aP().stream().filter(p2 -> Arrays.stream(p2.getAliases()).anyMatch(string2 -> string2.replace(" ", "").equalsIgnoreCase(string.replace(" ", "")))).findAny().orElse(null);
        return (T)p3;
    }
}

