/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package net.optifine.shaders;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.GlStateManager;
import net.optifine.shaders.l;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class k
implements l {
    private int euT = GL11.glGenTextures();
    private final int euU = 15;

    public k(int n2, int n3) {
        byte[] byArray = this.bK(n2, n3);
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.flip();
        GlStateManager.ap(this.euT);
        GL11.glTexImage2D((int)3553, (int)0, (int)6407, (int)n2, (int)n3, (int)0, (int)6407, (int)5121, (ByteBuffer)byteBuffer);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GlStateManager.ap(0);
    }

    public int awE() {
        return this.euT;
    }

    @Override
    public void aEs() {
        GlStateManager.cO(this.euT);
        this.euT = 0;
    }

    private int jM(int n2) {
        n2 ^= n2 << 13;
        n2 ^= n2 >> 17;
        n2 ^= n2 << 5;
        return n2;
    }

    private byte al(int n2, int n3, int n4) {
        int n5 = (this.jM(n2) + this.jM(n3 * 19)) * this.jM(n4 * 23) - n4;
        return (byte)(this.jM(n5) % 128);
    }

    private byte[] bK(int n2, int n3) {
        byte[] byArray = new byte[n2 * n3 * 3];
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            for (int i3 = 0; i3 < n2; ++i3) {
                for (int i4 = 1; i4 < 4; ++i4) {
                    byArray[n4++] = this.al(i3, i2, i4);
                }
            }
        }
        return byArray;
    }

    @Override
    public int aEr() {
        return this.euT;
    }

    @Override
    public int aEp() {
        return this.euU;
    }

    @Override
    public int aEt() {
        return 3553;
    }
}

