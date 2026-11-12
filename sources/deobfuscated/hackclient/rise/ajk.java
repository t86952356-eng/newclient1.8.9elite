/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 */
package hackclient.rise;

import hackclient.rise.aja;
import hackclient.rise.ajb;
import hackclient.rise.ajc;
import hackclient.rise.ajd;
import java.util.List;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.a;
import org.lwjgl.opengl.Display;

public class ajk
extends aja {
    private final ajb aQV = new ajb("main_menu/background.frag", "vertex.vsh");
    private a aQK;

    public ajk() {
        this.aQK = new a(ajk.aER.bgz, ajk.aER.bgA, true);
    }

    @Override
    public void a(ajc ajc2, float f2, List<Runnable> list) {
        if (!Display.isVisible()) {
            return;
        }
        if (ajc2 == ajc.aQF) {
            this.jA();
            int n2 = this.aQV.wd();
            cz cz2 = new cz(aER);
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            GlStateManager.Jy();
            aER.Aw().az(true);
            this.aQV.rJ();
            ajd.a(n2, "resolution", (float)ajk.aER.bgz, (float)ajk.aER.bgA);
            ajd.a(n2, "time", (float)(System.currentTimeMillis() - aER.BM()) / 1000.0f);
            ajb.wc();
            ajb.stop();
        }
    }

    @Override
    public void jA() {
        this.c(true);
        if (ajk.aER.bgz != this.aQK.cmc || ajk.aER.bgA != this.aQK.cmd) {
            this.aQK.Rk();
            this.aQK = new a(ajk.aER.bgz, ajk.aER.bgA, true);
        } else {
            this.aQK.Rp();
        }
    }
}

