/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net.optifine.shaders.uniform;

import java.util.Arrays;
import net.optifine.shaders.ah;
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class n {
    private final String name;
    private int cnc = 0;
    private int[] eKB = new int[]{-1};
    private static final int eKC = -1;
    private static final int eKD = Integer.MIN_VALUE;

    public n(String string) {
        this.name = string;
    }

    public void kp(int n2) {
        if (this.cnc != n2) {
            this.cnc = n2;
            this.aIN();
            this.kq(n2);
        }
    }

    private void aIN() {
        if (this.cnc >= this.eKB.length) {
            int[] nArray = new int[this.cnc * 2];
            Arrays.fill(nArray, Integer.MIN_VALUE);
            System.arraycopy(this.eKB, 0, nArray, 0, this.eKB.length);
            this.eKB = nArray;
        }
    }

    protected abstract void kq(int var1);

    public String getName() {
        return this.name;
    }

    public int RK() {
        return this.cnc;
    }

    public int aIO() {
        if (this.cnc <= 0) {
            return -1;
        }
        int n2 = this.eKB[this.cnc];
        if (n2 == Integer.MIN_VALUE) {
            this.eKB[this.cnc] = n2 = ARBShaderObjects.glGetUniformLocationARB((int)this.cnc, (CharSequence)this.name);
        }
        return n2;
    }

    public boolean aIP() {
        return this.aIO() >= 0;
    }

    public void disable() {
        this.eKB[this.cnc] = -1;
    }

    public void aX() {
        this.cnc = 0;
        this.eKB = new int[]{-1};
        this.aHy();
    }

    protected abstract void aHy();

    protected void aIQ() {
        if (ah.iQ(this.name) != 0) {
            this.disable();
        }
    }

    public String toString() {
        return this.name;
    }
}

