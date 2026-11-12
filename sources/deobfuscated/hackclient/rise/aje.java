/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.opengl.Display
 */
package hackclient.rise;

import hackclient.rise.aja;
import hackclient.rise.ajb;
import hackclient.rise.ajc;
import hackclient.rise.ajd;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.a;
import org.lwjgl.opengl.Display;

public class aje
extends aja {
    private final ajb aQH = new ajb("alpha.frag", "vertex.vsh");
    private a aQI;
    private float apt;

    public aje() {
        this.aQI = new a(aje.aER.bgz, aje.aER.bgA, true);
    }

    @Override
    public void a(ajc ajc2, float f2, List<Runnable> list) {
        if (!Display.isVisible()) {
            return;
        }
        if (ajc2 == ajc.aQF) {
            this.jA();
            this.c(true);
            if (this.bd()) {
                this.aQI.az(true);
                list.forEach(Runnable::run);
                aER.Aw().az(true);
                int n2 = this.aQH.wd();
                this.aQH.rJ();
                ajd.a(n2, "u_diffuse_sampler", 0);
                ajd.a(n2, "u_alpha", this.apt);
                GlStateManager.tQ();
                GlStateManager.P(770, 771);
                GlStateManager.e(516, 0.0f);
                this.aQI.Rm();
                ajb.wc();
                GlStateManager.tR();
                ajb.stop();
            }
        }
    }

    @Override
    public void jA() {
        if (aje.aER.bgz != this.aQI.cmc || aje.aER.bgA != this.aQI.cmd) {
            this.aQI.Rk();
            this.aQI = new a(aje.aER.bgz, aje.aER.bgA, true);
        } else {
            this.aQI.Rp();
        }
        this.aQI.i(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Generated
    public void p(float f2) {
        this.apt = f2;
    }
}

