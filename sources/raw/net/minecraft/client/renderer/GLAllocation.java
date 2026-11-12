/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
package net.minecraft.client.renderer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class GLAllocation {
    public static synchronized int cC(int n2) {
        int n3 = GL11.glGenLists((int)n2);
        if (n3 == 0) {
            int n4 = GL11.glGetError();
            String string = "No error code reported";
            if (n4 != 0) {
                string = GLU.gluErrorString((int)n4);
            }
            throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + n2 + ", GL error (" + n4 + "): " + string);
        }
        return n3;
    }

    public static synchronized void N(int n2, int n3) {
        GL11.glDeleteLists((int)n2, (int)n3);
    }

    public static synchronized void cD(int n2) {
        GL11.glDeleteLists((int)n2, (int)1);
    }

    public static synchronized ByteBuffer cE(int n2) {
        return ByteBuffer.allocateDirect(n2).order(ByteOrder.nativeOrder());
    }

    public static IntBuffer cF(int n2) {
        return GLAllocation.cE(n2 << 2).asIntBuffer();
    }

    public static FloatBuffer cG(int n2) {
        return GLAllocation.cE(n2 << 2).asFloatBuffer();
    }
}

