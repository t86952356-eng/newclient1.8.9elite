/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.Display
 */
package hackclient.rise;

import hackclient.rise.aja;
import hackclient.rise.ajb;
import hackclient.rise.ajc;
import hackclient.rise.ajd;
import hackclient.rise.ajt;
import hackclient.rise.xi;
import java.nio.FloatBuffer;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.a;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;

public class aji
extends aja {
    private final ajb aQP = new ajb("blur.frag", "vertex.vsh");
    private a aQI;
    private a aQM;
    private ajt aQN;
    public static final int aQQ = 12;
    public static final float aQR = 3.0f;
    int aQS;
    float aQT;
    private xi amO;

    public aji() {
        this.aQI = new a(aji.aER.bgz, aji.aER.bgA, true);
        this.aQM = new a(aji.aER.bgz, aji.aER.bgA, true);
        this.aQN = new ajt(0);
        this.aQS = 12;
        this.aQT = 3.0f;
    }

    @Override
    public void a(ajc ajc2, float f2, List<Runnable> list) {
        if (!Display.isVisible()) {
            return;
        }
        if (this.amO == null) {
            this.amO = this.e(xi.class);
        }
        int n2 = this.amO != null ? this.amO.lP() : 12;
        float f3 = this.amO != null ? this.amO.lQ() : 3.0f;
        boolean bl2 = System.getProperty("os.name").toLowerCase().contains("mac");
        switch (ajc2) {
            case aQE: {
                this.aQI.az(true);
                list.forEach(Runnable::run);
                aER.Aw().az(true);
                break;
            }
            case aQF: {
                this.aQI.az(true);
                list.forEach(Runnable::run);
                int n3 = this.aQP.wd();
                this.aQM.az(true);
                this.aQP.rJ();
                if (this.aQN.getSize() != n2) {
                    this.aQN = new ajt(n2);
                    this.aQN.vg();
                    FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)n2);
                    floatBuffer.put(this.aQN.wh());
                    floatBuffer.flip();
                    ajd.a(n3, "u_radius", (float)n2);
                    ajd.a(n3, "u_kernel", floatBuffer);
                    ajd.a(n3, "u_diffuse_sampler", 0);
                    ajd.a(n3, "u_other_sampler", bl2 ? 2 : 20);
                }
                ajd.a(n3, "u_texel_size", 1.0f / (float)aji.aER.bgz, 1.0f / (float)aji.aER.bgA);
                ajd.a(n3, "u_direction", f3, 0.0f);
                GlStateManager.tQ();
                GlStateManager.h(770, 771, 1, 0);
                GlStateManager.e(516, 0.0f);
                aER.Aw().Rm();
                ajb.wc();
                aER.Aw().az(true);
                ajd.a(n3, "u_direction", 0.0f, f3);
                this.aQM.Rm();
                GlStateManager.cN(bl2 ? 33986 : 34004);
                this.aQI.Rm();
                GlStateManager.cN(33984);
                ajb.wc();
                GlStateManager.cN(bl2 ? 33986 : 34004);
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
        this.c(false);
        int n2 = aji.aER.bgz;
        int n3 = aji.aER.bgA;
        if (this.aQI.ah(n2, n3)) {
            this.aQI.Rk();
            this.aQI = new a(aji.aER.bgz, aji.aER.bgA, true);
        } else {
            this.aQI.Rp();
        }
        if (this.aQM.ah(n2, n3)) {
            this.aQM.Rk();
            this.aQM = new a(aji.aER.bgz, aji.aER.bgA, true);
        } else {
            this.aQM.Rp();
        }
        this.aQI.i(0.0f, 0.0f, 0.0f, 0.0f);
        this.aQM.i(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Generated
    public void aF(int n2) {
        this.aQS = n2;
    }

    @Generated
    public int wf() {
        return this.aQS;
    }

    @Generated
    public float wg() {
        return this.aQT;
    }

    @Generated
    public void I(float f2) {
        this.aQT = f2;
    }
}

