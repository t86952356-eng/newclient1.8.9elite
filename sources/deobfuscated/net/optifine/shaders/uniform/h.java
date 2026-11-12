/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net.optifine.shaders.uniform;

import net.optifine.shaders.uniform.n;
import org.lwjgl.opengl.ARBShaderObjects;

public class h
extends n {
    private int[] eKr;
    private static final int eKs = Integer.MIN_VALUE;

    public h(String string) {
        super(string);
        this.aHy();
    }

    public void km(int n2) {
        int n3 = this.RK();
        int n4 = this.eKr[n3];
        if (n2 != n4) {
            this.eKr[n3] = n2;
            int n5 = this.aIO();
            if (n5 >= 0) {
                ARBShaderObjects.glUniform1iARB((int)n5, (int)n2);
                this.aIQ();
            }
        }
    }

    public int aHt() {
        int n2 = this.RK();
        int n3 = this.eKr[n2];
        return n3;
    }

    @Override
    protected void kq(int n2) {
        if (n2 >= this.eKr.length) {
            int[] nArray = this.eKr;
            int[] nArray2 = new int[n2 + 10];
            System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
            for (int i2 = nArray.length; i2 < nArray2.length; ++i2) {
                nArray2[i2] = Integer.MIN_VALUE;
            }
            this.eKr = nArray2;
        }
    }

    @Override
    protected void aHy() {
        this.eKr = new int[]{Integer.MIN_VALUE};
    }
}

