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
import java.nio.FloatBuffer;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.a;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import rise.module.impl.render.Interface;

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
    private Interface amO;

    public aji() {
        /* ANDROID/VANILLA PORT NOTE (blur removal): no framebuffers are allocated. */
        this.aQS = 12;
        this.aQT = 3.0f;
    }

    /*
     * ANDROID/VANILLA PORT NOTE (blur removal):
     * The original implementation rendered the queued Runnables into an
     * offscreen framebuffer and composited them back through a two-pass
     * gaussian shader (blur.frag). Blur has been permanently removed for the
     * Android (Gl4ES) client version: the layer now draws its content
     * directly to the screen with no framebuffer and no shader pass.
     */
    @Override
    public void a(ajc ajc2, float f2, List<Runnable> list) {
        if (!Display.isVisible()) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            list.forEach(Runnable::run);
        }
    }

    /*
     * ANDROID/VANILLA PORT NOTE (blur removal):
     * Resize hook is intentionally empty; no blur framebuffers are created.
     */
    @Override
    public void jA() {
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

