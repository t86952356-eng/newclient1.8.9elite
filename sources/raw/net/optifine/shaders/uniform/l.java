/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net.optifine.shaders.uniform;

import net.optifine.shaders.uniform.n;
import org.lwjgl.opengl.ARBShaderObjects;

public class l
extends n {
    private float[][] eKt;
    private static final float eKy = -3.4028235E38f;

    public l(String string) {
        super(string);
        this.aHy();
    }

    public void p(float f2, float f3, float f4, float f5) {
        int n2 = this.RK();
        float[] fArray = this.eKt[n2];
        if (fArray[0] != f2 || fArray[1] != f3 || fArray[2] != f4 || fArray[3] != f5) {
            fArray[0] = f2;
            fArray[1] = f3;
            fArray[2] = f4;
            fArray[3] = f5;
            int n3 = this.aIO();
            if (n3 >= 0) {
                ARBShaderObjects.glUniform4fARB((int)n3, (float)f2, (float)f3, (float)f4, (float)f5);
                this.aIQ();
            }
        }
    }

    public float[] aIL() {
        int n2 = this.RK();
        float[] fArray = this.eKt[n2];
        return fArray;
    }

    @Override
    protected void kq(int n2) {
        if (n2 >= this.eKt.length) {
            float[][] fArray = this.eKt;
            float[][] fArrayArray = new float[n2 + 10][];
            System.arraycopy(fArray, 0, fArrayArray, 0, fArray.length);
            this.eKt = fArrayArray;
        }
        if (this.eKt[n2] == null) {
            this.eKt[n2] = new float[]{-3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f};
        }
    }

    @Override
    protected void aHy() {
        this.eKt = new float[][]{{-3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f}};
    }
}

