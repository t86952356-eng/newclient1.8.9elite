/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;

public class aiq {
    private long aPY;
    private long aPZ;
    private final String name;

    public aiq(String string) {
        this.rJ();
        this.name = string;
    }

    public void rJ() {
        this.aPY = System.nanoTime();
    }

    public void vO() {
        this.aPZ += System.nanoTime() - this.aPY;
    }

    public void aX() {
        this.aPZ = 0L;
    }

    @Generated
    public long vP() {
        return this.aPZ;
    }

    @Generated
    public String getName() {
        return this.name;
    }
}

