/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net.optifine.shaders.uniform;

import net.optifine.shaders.uniform.n;
import org.lwjgl.opengl.ARBShaderObjects;

public class k
extends n {
    private float[][] eKt;
    private static final float eKx = -3.4028235E38f;

    public k(String string) {
        super(string);
        this.aHy();
    }

    public void O(float f2, float f3, float f4) {
        int n2 = this.RK();
        float[] fArray = this.eKt[n2];
        if (fArray[0] != f2 || fArray[1] != f3 || fArray[2] != f4) {
            fArray[0] = f2;
            fArray[1] = f3;
            fArray[2] = f4;
            int n3 = this.aIO();
            if (n3 >= 0) {
                ARBShaderObjects.glUniform3fARB((int)n3, (float)f2, (float)f3, (float)f4);
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
            this.eKt[n2] = new float[]{-3.4028235E38f, -3.4028235E38f, -3.4028235E38f};
        }
    }

    @Override
    protected void aHy() {
        this.eKt = new float[][]{{-3.4028235E38f, -3.4028235E38f, -3.4028235E38f}};
    }
}

