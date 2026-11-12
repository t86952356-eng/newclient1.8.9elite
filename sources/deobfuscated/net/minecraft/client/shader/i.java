/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.util.vector.Matrix4f
 */
package net.minecraft.client.shader;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

public class i {
    private static final Logger cnl = LogManager.getLogger();
    private int cnm;
    private final int cnn;
    private final int cno;
    private final IntBuffer cnp;
    private final FloatBuffer cnq;
    private final String cnr;
    private boolean aCw;
    private final h cns;

    public i(String string, int n2, int n3, h h2) {
        this.cnr = string;
        this.cnn = n3;
        this.cno = n2;
        this.cns = h2;
        if (n2 <= 3) {
            this.cnp = BufferUtils.createIntBuffer((int)n3);
            this.cnq = null;
        } else {
            this.cnp = null;
            this.cnq = BufferUtils.createFloatBuffer((int)n3);
        }
        this.cnm = -1;
        this.Lw();
    }

    private void Lw() {
        this.aCw = true;
        if (this.cns != null) {
            this.cns.Lw();
        }
    }

    public static int dG(String string) {
        int n2 = -1;
        if (string.equals("int")) {
            n2 = 0;
        } else if (string.equals("float")) {
            n2 = 4;
        } else if (string.startsWith("matrix")) {
            if (string.endsWith("2x2")) {
                n2 = 8;
            } else if (string.endsWith("3x3")) {
                n2 = 9;
            } else if (string.endsWith("4x4")) {
                n2 = 10;
            }
        }
        return n2;
    }

    public void ed(int n2) {
        this.cnm = n2;
    }

    public String RA() {
        return this.cnr;
    }

    public void aN(float f2) {
        this.cnq.position(0);
        this.cnq.put(0, f2);
        this.Lw();
    }

    public void n(float f2, float f3) {
        this.cnq.position(0);
        this.cnq.put(0, f2);
        this.cnq.put(1, f3);
        this.Lw();
    }

    public void r(float f2, float f3, float f4) {
        this.cnq.position(0);
        this.cnq.put(0, f2);
        this.cnq.put(1, f3);
        this.cnq.put(2, f4);
        this.Lw();
    }

    public void j(float f2, float f3, float f4, float f5) {
        this.cnq.position(0);
        this.cnq.put(f2);
        this.cnq.put(f3);
        this.cnq.put(f4);
        this.cnq.put(f5);
        this.cnq.flip();
        this.Lw();
    }

    public void k(float f2, float f3, float f4, float f5) {
        this.cnq.position(0);
        if (this.cno >= 4) {
            this.cnq.put(0, f2);
        }
        if (this.cno >= 5) {
            this.cnq.put(1, f3);
        }
        if (this.cno >= 6) {
            this.cnq.put(2, f4);
        }
        if (this.cno >= 7) {
            this.cnq.put(3, f5);
        }
        this.Lw();
    }

    public void u(int n2, int n3, int n4, int n5) {
        this.cnp.position(0);
        if (this.cno >= 0) {
            this.cnp.put(0, n2);
        }
        if (this.cno >= 1) {
            this.cnp.put(1, n3);
        }
        if (this.cno >= 2) {
            this.cnp.put(2, n4);
        }
        if (this.cno >= 3) {
            this.cnp.put(3, n5);
        }
        this.Lw();
    }

    public void d(float[] fArray) {
        if (fArray.length < this.cnn) {
            cnl.warn("Uniform.set called with a too-small value array (expected " + this.cnn + ", got " + fArray.length + "). Ignoring.");
        } else {
            this.cnq.position(0);
            this.cnq.put(fArray);
            this.cnq.position(0);
            this.Lw();
        }
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.cnq.position(0);
        this.cnq.put(0, f2);
        this.cnq.put(1, f3);
        this.cnq.put(2, f4);
        this.cnq.put(3, f5);
        this.cnq.put(4, f6);
        this.cnq.put(5, f7);
        this.cnq.put(6, f8);
        this.cnq.put(7, f9);
        this.cnq.put(8, f10);
        this.cnq.put(9, f11);
        this.cnq.put(10, f12);
        this.cnq.put(11, f13);
        this.cnq.put(12, f14);
        this.cnq.put(13, f15);
        this.cnq.put(14, f16);
        this.cnq.put(15, f17);
        this.Lw();
    }

    public void b(Matrix4f matrix4f) {
        this.a(matrix4f.m00, matrix4f.m01, matrix4f.m02, matrix4f.m03, matrix4f.m10, matrix4f.m11, matrix4f.m12, matrix4f.m13, matrix4f.m20, matrix4f.m21, matrix4f.m22, matrix4f.m23, matrix4f.m30, matrix4f.m31, matrix4f.m32, matrix4f.m33);
    }

    public void RL() {
        if (!this.aCw) {
            // empty if block
        }
        this.aCw = false;
        if (this.cno <= 3) {
            this.RM();
        } else if (this.cno <= 7) {
            this.RN();
        } else {
            if (this.cno > 10) {
                cnl.warn("Uniform.upload called, but type value (" + this.cno + ") is not a valid type. Ignoring.");
                return;
            }
            this.RO();
        }
    }

    private void RM() {
        switch (this.cno) {
            case 0: {
                OpenGlHelper.a(this.cnm, this.cnp);
                break;
            }
            case 1: {
                OpenGlHelper.b(this.cnm, this.cnp);
                break;
            }
            case 2: {
                OpenGlHelper.c(this.cnm, this.cnp);
                break;
            }
            case 3: {
                OpenGlHelper.d(this.cnm, this.cnp);
                break;
            }
            default: {
                cnl.warn("Uniform.upload called, but count value (" + this.cnn + ") is  not in the range of 1 to 4. Ignoring.");
            }
        }
    }

    private void RN() {
        switch (this.cno) {
            case 4: {
                OpenGlHelper.b(this.cnm, this.cnq);
                break;
            }
            case 5: {
                OpenGlHelper.c(this.cnm, this.cnq);
                break;
            }
            case 6: {
                OpenGlHelper.d(this.cnm, this.cnq);
                break;
            }
            case 7: {
                OpenGlHelper.e(this.cnm, this.cnq);
                break;
            }
            default: {
                cnl.warn("Uniform.upload called, but count value (" + this.cnn + ") is not in the range of 1 to 4. Ignoring.");
            }
        }
    }

    private void RO() {
        switch (this.cno) {
            case 8: {
                OpenGlHelper.a(this.cnm, true, this.cnq);
                break;
            }
            case 9: {
                OpenGlHelper.b(this.cnm, true, this.cnq);
                break;
            }
            case 10: {
                OpenGlHelper.c(this.cnm, true, this.cnq);
            }
        }
    }
}

