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
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.shader.a;
import org.lwjgl.opengl.Display;

public class ajl
extends aja {
    private final ajb aQW = new ajb("outline.frag", "vertex.vsh");
    private a aQI;

    public ajl() {
        this.aQI = new a(ajl.aER.bgz, ajl.aER.bgA, true);
    }

    @Override
    public void a(ajc ajc2, float f2, List<Runnable> list) {
        if (!Display.isVisible()) {
            return;
        }
        switch (ajc2) {
            case aQE: {
                this.jA();
                this.c(!list.isEmpty());
                if (!this.bd()) break;
                RendererLivingEntity.bWP = 0.0f;
                RendererLivingEntity.bWQ = 0.0f;
                this.aQI.az(true);
                list.forEach(Runnable::run);
                aER.Aw().az(true);
                RendererLivingEntity.bWP = 64.0f;
                RendererLivingEntity.bWQ = 32.0f;
                RenderHelper.Lf();
                ajl.aER.bgT.Jj();
                break;
            }
            case aQF: {
                this.c(this.bd() || !list.isEmpty());
                if (!this.bd()) break;
                this.aQI.az(true);
                list.forEach(Runnable::run);
                boolean bl2 = true;
                int n2 = this.aQW.wd();
                aER.Aw().az(true);
                this.aQW.rJ();
                ajd.a(n2, "u_texture", 0);
                ajd.a(n2, "u_radius", 1.0f);
                ajd.a(n2, "u_texel_size", 1.0f / (float)ajl.aER.bgz, 1.0f / (float)ajl.aER.bgA);
                GlStateManager.tQ();
                GlStateManager.h(770, 771, 1, 0);
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
        this.c(false);
        if (ajl.aER.bgz != this.aQI.cmc || ajl.aER.bgA != this.aQI.cmd) {
            this.aQI.Rk();
            this.aQI = new a(ajl.aER.bgz, ajl.aER.bgA, true);
        } else {
            this.aQI.Rp();
        }
    }
}

