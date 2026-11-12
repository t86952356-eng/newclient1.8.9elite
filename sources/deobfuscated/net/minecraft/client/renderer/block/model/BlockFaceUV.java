/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BlockFaceUV {
    public float[] bQy;
    public final int bQz;

    public BlockFaceUV(float[] fArray, int n2) {
        this.bQy = fArray;
        this.bQz = n2;
    }

    public float dn(int n2) {
        if (this.bQy == null) {
            throw new NullPointerException("uvs");
        }
        int n3 = this.dp(n2);
        return n3 != 0 && n3 != 1 ? this.bQy[2] : this.bQy[0];
    }

    public float j_do(int n2) {
        if (this.bQy == null) {
            throw new NullPointerException("uvs");
        }
        int n3 = this.dp(n2);
        return n3 != 0 && n3 != 3 ? this.bQy[3] : this.bQy[1];
    }

    private int dp(int n2) {
        return (n2 + this.bQz / 90) % 4;
    }

    public int dq(int n2) {
        return (n2 + (4 - this.bQz / 90)) % 4;
    }

    public void b(float[] fArray) {
        if (this.bQy == null) {
            this.bQy = fArray;
        }
    }
}

