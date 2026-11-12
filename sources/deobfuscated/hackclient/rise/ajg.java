/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.Display
 */
package hackclient.rise;

import hackclient.rise.aja;
import hackclient.rise.ajb;
import hackclient.rise.ajc;
import hackclient.rise.ajd;
import hackclient.rise.ajt;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.shader.a;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import rise.module.impl.render.Interface;

public class ajg
extends aja {
    private final ajb aQL = new ajb("bloom.frag", "vertex.vsh");
    private a aQI;
    private a aQM;
    private ajt aQN;
    private Interface amO;

    public ajg() {
        this.aQI = new a(ajg.aER.bgz, ajg.aER.bgA, true);
        this.aQM = new a(ajg.aER.bgz, ajg.aER.bgA, true);
        this.aQN = new ajt(0);
    }

    @Override
    public void a(ajc ajc2, float f2, List<Runnable> list) {
        if (!Display.isVisible()) {
            return;
        }
        boolean bl2 = System.getProperty("os.name").toLowerCase().contains("mac");
        switch (ajc2) {
            case aQE: {
                RendererLivingEntity.bWP = 0.0f;
                RendererLivingEntity.bWQ = 0.0f;
                this.aQI.az(true);
                for (Runnable runnable : list) {
                    runnable.run();
                }
                aER.Aw().az(true);
                RendererLivingEntity.bWP = 64.0f;
                RendererLivingEntity.bWQ = 32.0f;
                RenderHelper.Lf();
                ajg.aER.bgT.Jj();
                break;
            }
            case aQF: {
                this.aQI.az(true);
                for (Runnable runnable : list) {
                    runnable.run();
                }
                if (this.amO == null) {
                    this.amO = this.e(Interface.class);
                }
                int n2 = this.amO != null ? this.amO.lR() : 14;
                float f3 = this.amO != null ? this.amO.lS() : 2.0f;
                int n3 = this.aQL.wd();
                this.aQM.az(true);
                this.aQL.rJ();
                if (this.aQN.getSize() != n2) {
                    this.aQN = new ajt(n2);
                    this.aQN.vg();
                    FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)n2);
                    floatBuffer.put(this.aQN.wh());
                    floatBuffer.flip();
                    ajd.a(n3, "u_radius", (float)n2);
                    ajd.a(n3, "u_kernel", floatBuffer);
                    ajd.a(n3, "u_diffuse_sampler", 0);
                    ajd.a(n3, "u_other_sampler", bl2 ? 3 : 16);
                }
                ajd.a(n3, "u_texel_size", 1.0f / (float)ajg.aER.bgz, 1.0f / (float)ajg.aER.bgA);
                ajd.a(n3, "u_direction", f3, 0.0f);
                GlStateManager.tQ();
                GlStateManager.P(1, 770);
                GlStateManager.e(516, 0.0f);
                this.aQI.Rm();
                ajb.wc();
                aER.Aw().az(true);
                GlStateManager.P(770, 771);
                ajd.a(n3, "u_direction", 0.0f, f3);
                this.aQM.Rm();
                GlStateManager.cN(bl2 ? 33987 : 34000);
                this.aQI.Rm();
                GlStateManager.cN(33984);
                ajb.wc();
                GlStateManager.cN(bl2 ? 33987 : 34000);
                this.aQI.Rn();
                GlStateManager.cN(33984);
                GlStateManager.tR();
                ajb.stop();
                break;
            }
        }
    }

    @Override
    public void jA() {
        int n2 = ajg.aER.bgz;
        int n3 = ajg.aER.bgA;
        if (this.aQI.ah(n2, n3)) {
            this.aQI.Rk();
            this.aQI = new a(ajg.aER.bgz, ajg.aER.bgA, true);
        } else {
            this.aQI.Rp();
        }
        if (this.aQM.ah(n2, n3)) {
            this.aQM.Rk();
            this.aQM = new a(ajg.aER.bgz, ajg.aER.bgA, true);
        } else {
            this.aQM.Rp();
        }
        this.aQI.i(0.0f, 0.0f, 0.0f, 0.0f);
        this.aQM.i(0.0f, 0.0f, 0.0f, 0.0f);
    }
}

