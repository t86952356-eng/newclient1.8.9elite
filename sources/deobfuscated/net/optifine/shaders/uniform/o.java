/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net.optifine.shaders.uniform;

import java.nio.FloatBuffer;
import net.optifine.shaders.uniform.n;
import org.lwjgl.opengl.ARBShaderObjects;

public class o
extends n {
    private boolean eKE;
    private FloatBuffer eKF;

    public o(String string) {
        super(string);
    }

    public void a(boolean bl2, FloatBuffer floatBuffer) {
        this.eKE = bl2;
        this.eKF = floatBuffer;
        int n2 = this.aIO();
        if (n2 >= 0) {
            ARBShaderObjects.glUniformMatrix4ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
            this.aIQ();
        }
    }

    public float bT(int n2, int n3) {
        if (this.eKF == null) {
            return 0.0f;
        }
        int n4 = this.eKE ? n3 * 4 + n2 : n2 * 4 + n3;
        float f2 = this.eKF.get(n4);
        return f2;
    }

    @Override
    protected void kq(int n2) {
    }

    @Override
    protected void aHy() {
        this.eKF = null;
    }
}

