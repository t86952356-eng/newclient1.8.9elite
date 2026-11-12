/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net.optifine.shaders.uniform;

import net.optifine.shaders.uniform.n;
import org.lwjgl.opengl.ARBShaderObjects;

public class g
extends n {
    private float[] eKp;
    private static final float eKq = -3.4028235E38f;

    public g(String string) {
        super(string);
        this.aHy();
    }

    public void cf(float f2) {
        int n2 = this.RK();
        float f3 = this.eKp[n2];
        if (f2 != f3) {
            this.eKp[n2] = f2;
            int n3 = this.aIO();
            if (n3 >= 0) {
                ARBShaderObjects.glUniform1fARB((int)n3, (float)f2);
                this.aIQ();
            }
        }
    }

    public float getValue() {
        int n2 = this.RK();
        float f2 = this.eKp[n2];
        return f2;
    }

    @Override
    protected void kq(int n2) {
        if (n2 >= this.eKp.length) {
            float[] fArray = this.eKp;
            float[] fArray2 = new float[n2 + 10];
            System.arraycopy(fArray, 0, fArray2, 0, fArray.length);
            for (int i2 = fArray.length; i2 < fArray2.length; ++i2) {
                fArray2[i2] = -3.4028235E38f;
            }
            this.eKp = fArray2;
        }
    }

    @Override
    protected void aHy() {
        this.eKp = new float[]{-3.4028235E38f};
    }
}

