/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL12
 */
package net.optifine.shaders;

import java.nio.ByteBuffer;
import net.optifine.shaders.l;
import net.optifine.texture.a;
import net.optifine.texture.b;
import net.optifine.texture.c;
import net.optifine.texture.d;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class f
implements l {
    private final d euL;
    private final int euM;
    private int ebT;

    public f(d d2, a a2, int n2, int n3, int n4, b b2, c c2, ByteBuffer byteBuffer, int n5) {
        this.euL = d2;
        this.euM = n5;
        this.ebT = GL11.glGenTextures();
        GL11.glBindTexture((int)this.aEt(), (int)this.ebT);
        switch (d2) {
            case eMn: {
                GL11.glTexImage1D((int)3552, (int)0, (int)a2.getId(), (int)n2, (int)0, (int)b2.getId(), (int)c2.getId(), (ByteBuffer)byteBuffer);
                GL11.glTexParameteri((int)3552, (int)10242, (int)33071);
                GL11.glTexParameteri((int)3552, (int)10240, (int)9729);
                GL11.glTexParameteri((int)3552, (int)10241, (int)9729);
                break;
            }
            case eMo: {
                GL11.glTexImage2D((int)3553, (int)0, (int)a2.getId(), (int)n2, (int)n3, (int)0, (int)b2.getId(), (int)c2.getId(), (ByteBuffer)byteBuffer);
                GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
                GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                break;
            }
            case eMp: {
                GL12.glTexImage3D((int)32879, (int)0, (int)a2.getId(), (int)n2, (int)n3, (int)n4, (int)0, (int)b2.getId(), (int)c2.getId(), (ByteBuffer)byteBuffer);
                GL11.glTexParameteri((int)32879, (int)10242, (int)33071);
                GL11.glTexParameteri((int)32879, (int)10243, (int)33071);
                GL11.glTexParameteri((int)32879, (int)32882, (int)33071);
                GL11.glTexParameteri((int)32879, (int)10240, (int)9729);
                GL11.glTexParameteri((int)32879, (int)10241, (int)9729);
                break;
            }
            case eMq: {
                GL11.glTexImage2D((int)34037, (int)0, (int)a2.getId(), (int)n2, (int)n3, (int)0, (int)b2.getId(), (int)c2.getId(), (ByteBuffer)byteBuffer);
                GL11.glTexParameteri((int)34037, (int)10242, (int)33071);
                GL11.glTexParameteri((int)34037, (int)10243, (int)33071);
                GL11.glTexParameteri((int)34037, (int)10240, (int)9729);
                GL11.glTexParameteri((int)34037, (int)10241, (int)9729);
            }
        }
        GL11.glBindTexture((int)this.aEt(), (int)0);
    }

    @Override
    public int aEt() {
        return this.euL.getId();
    }

    @Override
    public int aEr() {
        return this.ebT;
    }

    @Override
    public int aEp() {
        return this.euM;
    }

    @Override
    public void aEs() {
        if (this.ebT > 0) {
            GL11.glDeleteTextures((int)this.ebT);
            this.ebT = 0;
        }
    }
}

