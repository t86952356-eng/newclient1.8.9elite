/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package hackclient.rise;

import net.minecraft.client.shader.a;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import rise.util.InstanceAccess;

public class aiv
implements InstanceAccess {
    private static void b(a a2) {
        GL30.glDeleteRenderbuffers((int)a2.cmh);
        int n2 = GL30.glGenRenderbuffers();
        GL30.glBindRenderbuffer((int)36161, (int)n2);
        GL30.glRenderbufferStorage((int)36161, (int)34041, (int)aiv.aER.bgz, (int)aiv.aER.bgA);
        GL30.glFramebufferRenderbuffer((int)36160, (int)36128, (int)36161, (int)n2);
        GL30.glFramebufferRenderbuffer((int)36160, (int)36096, (int)36161, (int)n2);
    }

    public static void c(a a2) {
        if (a2 != null && a2.cmh > -1) {
            aiv.b(a2);
            a2.cmh = -1;
        }
    }

    public static void vZ() {
        aiv.d(aER.Aw());
    }

    public static void d(a a2) {
        a2.az(false);
        aiv.c(a2);
        GL11.glClear((int)1280);
        GL11.glEnable((int)2960);
    }

    public static void wa() {
        GL11.glStencilFunc((int)519, (int)1, (int)1);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
    }

    public static void aD(int n2) {
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glStencilFunc((int)514, (int)n2, (int)1);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
    }

    public static void wb() {
        GL11.glDisable((int)2960);
    }
}

