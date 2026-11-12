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
import java.util.List;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.a;
import org.lwjgl.opengl.Display;

public class ajf
extends aja {
    private final ajb aQJ = new ajb("baw.frag", "vertex.vsh");
    private a aQK;

    public ajf() {
        this.aQK = new a(ajf.aER.bgz, ajf.aER.bgA, true);
    }

    @Override
    public void a(ajc ajc2, float f2, List<Runnable> list) {
        if (!Display.isVisible()) {
            return;
        }
        if (ajc2 == ajc.aQF) {
            this.jA();
            int n2 = this.aQJ.wd();
            cz cz2 = new cz(aER);
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            GlStateManager.Jy();
            aER.Aw().az(true);
            this.aQJ.rJ();
            ajb.wc();
            ajb.stop();
        }
    }

    @Override
    public void jA() {
        this.c(true);
        if (ajf.aER.bgz != this.aQK.cmc || ajf.aER.bgA != this.aQK.cmd) {
            this.aQK.Rk();
            this.aQK = new a(ajf.aER.bgz, ajf.aER.bgA, true);
        } else {
            this.aQK.Rp();
        }
    }
}

