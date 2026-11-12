/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aha;
import hackclient.rise.ahg;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dx;
import hackclient.rise.dy;
import hackclient.rise.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.d;
import net.minecraft.client.gui.bp;
import org.lwjgl.input.Keyboard;

public class q {
    @dm(cH=0)
    public final dk<dx> bl = dx2 -> {
        if (dx2.isCancelled()) {
            return;
        }
        if (dx2.cO() == 25 && bp.isCtrlKeyDown() && bp.isShiftKeyDown()) {
            if (Keyboard.isRepeatEvent()) {
                dx2.cF();
                return;
            }
            boolean bl2 = aha.uQ();
            if (d.AZ() != null && d.AZ().bgF != null && d.AZ().bgK != null) {
                cg.a(ahg.cf("module.render.chat.pinyin_ime"), ahg.cf(bl2 ? "ui.chat.pinyin_ime.hint.on" : "ui.chat.pinyin_ime.hint.off"), 1500);
            }
            dx2.cF();
            return;
        }
        if (dx2.cQ() != null) {
            return;
        }
        this.aP().stream().filter(p2 -> p2.getKey() == dx2.cO()).forEach(p::onKey);
    };
    @dm(cH=0)
    public final dk<dy> bm = dy2 -> {
        if (d.AZ().bgR != null) {
            return;
        }
        int n2 = dy2.cW() - 100;
        this.aP().stream().filter(p2 -> p2.getKey() == n2).forEach(p::onKey);
    };

    public void init() {
        a.a.e().b(this);
    }

    public List<p> aP() {
        ArrayList<p> arrayList = new ArrayList<p>();
        arrayList.addAll(a.a.g().ef());
        arrayList.addAll(a.a.p());
        return arrayList;
    }

    public <T extends p> T a(String string) {
        p p3 = this.aP().stream().filter(p2 -> Arrays.stream(p2.getAliases()).anyMatch(string2 -> string2.replace(" ", "").equalsIgnoreCase(string.replace(" ", "")))).findAny().orElse(null);
        return (T)p3;
    }
}

