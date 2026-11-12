/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net.optifine.shaders.uniform;

import net.optifine.shaders.uniform.n;
import org.lwjgl.opengl.ARBShaderObjects;

public class j
extends n {
    private int[][] eKv;
    private static final int eKw = Integer.MIN_VALUE;

    public j(String string) {
        super(string);
        this.aHy();
    }

    public void bS(int n2, int n3) {
        int n4 = this.RK();
        int[] nArray = this.eKv[n4];
        if (nArray[0] != n2 || nArray[1] != n3) {
            nArray[0] = n2;
            nArray[1] = n3;
            int n5 = this.aIO();
            if (n5 >= 0) {
                ARBShaderObjects.glUniform2iARB((int)n5, (int)n2, (int)n3);
                this.aIQ();
            }
        }
    }

    public int[] aIM() {
        int n2 = this.RK();
        int[] nArray = this.eKv[n2];
        return nArray;
    }

    @Override
    protected void kq(int n2) {
        if (n2 >= this.eKv.length) {
            int[][] nArray = this.eKv;
            int[][] nArrayArray = new int[n2 + 10][];
            System.arraycopy(nArray, 0, nArrayArray, 0, nArray.length);
            this.eKv = nArrayArray;
        }
        if (this.eKv[n2] == null) {
            this.eKv[n2] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        }
    }

    @Override
    protected void aHy() {
        this.eKv = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE}};
    }
}

