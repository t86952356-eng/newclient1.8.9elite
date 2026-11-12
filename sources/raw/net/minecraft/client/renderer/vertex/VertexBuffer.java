/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.vertex;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.optifine.render.h;
import net.optifine.render.i;
import org.lwjgl.opengl.GL11;

public class VertexBuffer {
    private int cbS;
    private final VertexFormat cbT;
    private int akW;
    private i cbU;
    private h cbV;
    private int bPX;

    public VertexBuffer(VertexFormat vertexFormat) {
        this.cbT = vertexFormat;
        this.cbS = OpenGlHelper.Ku();
    }

    public void OI() {
        OpenGlHelper.W(OpenGlHelper.bNo, this.cbS);
    }

    public void a(ByteBuffer byteBuffer) {
        if (this.cbU != null) {
            this.cbU.a(byteBuffer, this.cbV);
        } else {
            this.OI();
            OpenGlHelper.a(OpenGlHelper.bNo, byteBuffer, 35044);
            this.OJ();
            this.akW = byteBuffer.limit() / this.cbT.OT();
        }
    }

    public void dO(int n2) {
        if (this.bPX > 0) {
            n2 = this.bPX;
        }
        if (this.cbU != null) {
            this.cbU.a(n2, this.cbV);
        } else {
            GL11.glDrawArrays((int)n2, (int)0, (int)this.akW);
        }
    }

    public void OJ() {
        OpenGlHelper.W(OpenGlHelper.bNo, 0);
    }

    public void OK() {
        if (this.cbS >= 0) {
            OpenGlHelper.db(this.cbS);
            this.cbS = -1;
        }
    }

    public void a(i i2) {
        if (i2 != null) {
            this.OK();
            this.cbU = i2;
            this.cbV = new h();
        }
    }

    public i OL() {
        return this.cbU;
    }

    public h OM() {
        return this.cbV;
    }

    public int LD() {
        return this.bPX;
    }

    public void dP(int n2) {
        this.bPX = n2;
    }
}

