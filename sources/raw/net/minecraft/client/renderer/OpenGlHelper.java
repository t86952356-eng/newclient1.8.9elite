/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBCopyBuffer
 *  org.lwjgl.opengl.ARBFramebufferObject
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.ARBVertexBufferObject
 *  org.lwjgl.opengl.ARBVertexShader
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.EXTBlendFuncSeparate
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL31
 *  org.lwjgl.opengl.GLContext
 *  oshi.SystemInfo
 *  oshi.hardware.Processor
 */
package net.minecraft.client.renderer;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import net.minecraft.client.d;
import net.minecraft.client.settings.c;
import net.minecraft.src.a;
import org.lwjgl.opengl.ARBCopyBuffer;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GLContext;
import oshi.SystemInfo;
import oshi.hardware.Processor;

public class OpenGlHelper {
    public static boolean bMo;
    public static boolean bMp;
    public static int bMq;
    public static int bMr;
    public static int bMs;
    public static int bMt;
    public static int bMu;
    public static int bMv;
    public static int bMw;
    public static int bMx;
    public static int bMy;
    private static int bMz;
    public static boolean bMA;
    private static boolean bMB;
    private static boolean bMC;
    public static int bMD;
    public static int bME;
    public static int bMF;
    public static int bMG;
    private static boolean bMH;
    public static int bMI;
    public static int bMJ;
    public static int bMK;
    private static boolean bML;
    public static int bMM;
    public static int bMN;
    public static int bMO;
    public static int bMP;
    public static int bMQ;
    public static int bMR;
    public static int bMS;
    public static int bMT;
    public static int bMU;
    public static int bMV;
    public static int bMW;
    public static int bMX;
    public static int bMY;
    public static int bMZ;
    public static int bNa;
    public static int bNb;
    public static int bNc;
    public static int bNd;
    public static int bNe;
    private static boolean bNf;
    public static boolean bNg;
    public static boolean bNh;
    public static boolean bNi;
    private static String bNj;
    private static String bNk;
    public static boolean bNl;
    public static boolean bNm;
    private static boolean bNn;
    public static int bNo;
    public static int bNp;
    public static float bNq;
    public static float bNr;
    public static boolean bNs;
    public static boolean bNt;
    public static int bNu;
    public static int bNv;
    public static final int bNw = 7;
    public static final int bNx = 4;

    public static void Kq() {
        String string;
        Object object;
        a.amN();
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        bMH = contextCapabilities.GL_ARB_multitexture && !contextCapabilities.OpenGL13;
        bML = contextCapabilities.GL_ARB_texture_env_combine && !contextCapabilities.OpenGL13;
        bNs = contextCapabilities.OpenGL31;
        if (bNs) {
            bNu = 36662;
            bNv = 36663;
        } else {
            bNu = 36662;
            bNv = 36663;
        }
        boolean bl2 = bNs || contextCapabilities.GL_ARB_copy_buffer;
        boolean bl3 = contextCapabilities.OpenGL14;
        boolean bl4 = bNt = bl2 && bl3;
        if (!bNt) {
            object = new ArrayList<String>();
            if (!bl2) {
                object.add("OpenGL 1.3, ARB_copy_buffer");
            }
            if (!bl3) {
                object.add("OpenGL 1.4");
            }
            string = "VboRegions not supported, missing: " + a.J(object);
            a.fN(string);
            bNj = bNj + string + "\n";
        }
        if (bMH) {
            bNj = bNj + "Using ARB_multitexture.\n";
            bMI = 33984;
            bMJ = 33985;
            bMK = 33986;
        } else {
            bNj = bNj + "Using GL 1.3 multitexturing.\n";
            bMI = 33984;
            bMJ = 33985;
            bMK = 33986;
        }
        if (bML) {
            bNj = bNj + "Using ARB_texture_env_combine.\n";
            bMM = 34160;
            bMN = 34165;
            bMO = 34167;
            bMP = 34166;
            bMQ = 34168;
            bMR = 34161;
            bMS = 34176;
            bMT = 34177;
            bMU = 34178;
            bMV = 34192;
            bMW = 34193;
            bMX = 34194;
            bMY = 34162;
            bMZ = 34184;
            bNa = 34185;
            bNb = 34186;
            bNc = 34200;
            bNd = 34201;
            bNe = 34202;
        } else {
            bNj = bNj + "Using GL 1.3 texture combiners.\n";
            bMM = 34160;
            bMN = 34165;
            bMO = 34167;
            bMP = 34166;
            bMQ = 34168;
            bMR = 34161;
            bMS = 34176;
            bMT = 34177;
            bMU = 34178;
            bMV = 34192;
            bMW = 34193;
            bMX = 34194;
            bMY = 34162;
            bMZ = 34184;
            bNa = 34185;
            bNb = 34186;
            bNc = 34200;
            bNd = 34201;
            bNe = 34202;
        }
        bNg = contextCapabilities.GL_EXT_blend_func_separate && !contextCapabilities.OpenGL14;
        bNf = contextCapabilities.OpenGL14 || contextCapabilities.GL_EXT_blend_func_separate;
        boolean bl5 = bMA = bNf && (contextCapabilities.GL_ARB_framebuffer_object || contextCapabilities.GL_EXT_framebuffer_object || contextCapabilities.OpenGL30);
        if (bMA) {
            bNj = bNj + "Using framebuffer objects because ";
            if (contextCapabilities.OpenGL30) {
                bNj = bNj + "OpenGL 3.0 is supported and separate blending is supported.\n";
                bMz = 0;
                bMq = 36160;
                bMr = 36161;
                bMs = 36064;
                bMt = 36096;
                bMu = 36053;
                bMv = 36054;
                bMw = 36055;
                bMx = 36059;
                bMy = 36060;
            } else if (contextCapabilities.GL_ARB_framebuffer_object) {
                bNj = bNj + "ARB_framebuffer_object is supported and separate blending is supported.\n";
                bMz = 1;
                bMq = 36160;
                bMr = 36161;
                bMs = 36064;
                bMt = 36096;
                bMu = 36053;
                bMw = 36055;
                bMv = 36054;
                bMx = 36059;
                bMy = 36060;
            } else if (contextCapabilities.GL_EXT_framebuffer_object) {
                bNj = bNj + "EXT_framebuffer_object is supported.\n";
                bMz = 2;
                bMq = 36160;
                bMr = 36161;
                bMs = 36064;
                bMt = 36096;
                bMu = 36053;
                bMw = 36055;
                bMv = 36054;
                bMx = 36059;
                bMy = 36060;
            }
        } else {
            bNj = bNj + "Not using framebuffer objects because ";
            bNj = bNj + "OpenGL 1.4 is " + (contextCapabilities.OpenGL14 ? "" : "not ") + "supported, ";
            bNj = bNj + "EXT_blend_func_separate is " + (contextCapabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
            bNj = bNj + "OpenGL 3.0 is " + (contextCapabilities.OpenGL30 ? "" : "not ") + "supported, ";
            bNj = bNj + "ARB_framebuffer_object is " + (contextCapabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
            bNj = bNj + "EXT_framebuffer_object is " + (contextCapabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
        }
        bNh = contextCapabilities.OpenGL21;
        bMB = bNh || contextCapabilities.GL_ARB_vertex_shader && contextCapabilities.GL_ARB_fragment_shader && contextCapabilities.GL_ARB_shader_objects;
        bNj = bNj + "Shaders are " + (bMB ? "" : "not ") + "available because ";
        if (bMB) {
            if (contextCapabilities.OpenGL21) {
                bNj = bNj + "OpenGL 2.1 is supported.\n";
                bMC = false;
                bMD = 35714;
                bME = 35713;
                bMF = 35633;
                bMG = 35632;
            } else {
                bNj = bNj + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
                bMC = true;
                bMD = 35714;
                bME = 35713;
                bMF = 35633;
                bMG = 35632;
            }
        } else {
            bNj = bNj + "OpenGL 2.1 is " + (contextCapabilities.OpenGL21 ? "" : "not ") + "supported, ";
            bNj = bNj + "ARB_shader_objects is " + (contextCapabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
            bNj = bNj + "ARB_vertex_shader is " + (contextCapabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
            bNj = bNj + "ARB_fragment_shader is " + (contextCapabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
        }
        bNi = bMA && bMB;
        object = GL11.glGetString((int)7936).toLowerCase();
        bMo = ((String)object).contains("nvidia");
        bNn = !contextCapabilities.OpenGL15 && contextCapabilities.GL_ARB_vertex_buffer_object;
        bNl = contextCapabilities.OpenGL15 || bNn;
        bNj = bNj + "VBOs are " + (bNl ? "" : "not ") + "available because ";
        if (bNl) {
            if (bNn) {
                bNj = bNj + "ARB_vertex_buffer_object is supported.\n";
                bNp = 35044;
                bNo = 34962;
            } else {
                bNj = bNj + "OpenGL 1.5 is supported.\n";
                bNp = 35044;
                bNo = 34962;
            }
        }
        if (bMp = ((String)object).contains("ati")) {
            if (bNl) {
                bNm = true;
            } else {
                c.cjO.aH(16.0f);
            }
        }
        try {
            string = new SystemInfo().getHardware().getProcessors();
            bNk = String.format("%dx %s", ((Processor[])string).length, string[0]).replaceAll("\\s+", " ");
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static boolean Kr() {
        return bNi;
    }

    public static String Ks() {
        return bNj;
    }

    public static int Q(int n2, int n3) {
        return bMC ? ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)n3) : GL20.glGetProgrami((int)n2, (int)n3);
    }

    public static void R(int n2, int n3) {
        if (bMC) {
            ARBShaderObjects.glAttachObjectARB((int)n2, (int)n3);
        } else {
            GL20.glAttachShader((int)n2, (int)n3);
        }
    }

    public static void cV(int n2) {
        if (bMC) {
            ARBShaderObjects.glDeleteObjectARB((int)n2);
        } else {
            GL20.glDeleteShader((int)n2);
        }
    }

    public static int cW(int n2) {
        return bMC ? ARBShaderObjects.glCreateShaderObjectARB((int)n2) : GL20.glCreateShader((int)n2);
    }

    public static void a(int n2, ByteBuffer byteBuffer) {
        if (bMC) {
            ARBShaderObjects.glShaderSourceARB((int)n2, (ByteBuffer)byteBuffer);
        } else {
            GL20.glShaderSource((int)n2, (ByteBuffer)byteBuffer);
        }
    }

    public static void cX(int n2) {
        if (bMC) {
            ARBShaderObjects.glCompileShaderARB((int)n2);
        } else {
            GL20.glCompileShader((int)n2);
        }
    }

    public static int S(int n2, int n3) {
        return bMC ? ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)n3) : GL20.glGetShaderi((int)n2, (int)n3);
    }

    public static String T(int n2, int n3) {
        return bMC ? ARBShaderObjects.glGetInfoLogARB((int)n2, (int)n3) : GL20.glGetShaderInfoLog((int)n2, (int)n3);
    }

    public static String U(int n2, int n3) {
        return bMC ? ARBShaderObjects.glGetInfoLogARB((int)n2, (int)n3) : GL20.glGetProgramInfoLog((int)n2, (int)n3);
    }

    public static void cY(int n2) {
        if (bMC) {
            ARBShaderObjects.glUseProgramObjectARB((int)n2);
        } else {
            GL20.glUseProgram((int)n2);
        }
    }

    public static int Kt() {
        return bMC ? ARBShaderObjects.glCreateProgramObjectARB() : GL20.glCreateProgram();
    }

    public static void cZ(int n2) {
        if (bMC) {
            ARBShaderObjects.glDeleteObjectARB((int)n2);
        } else {
            GL20.glDeleteProgram((int)n2);
        }
    }

    public static void da(int n2) {
        if (bMC) {
            ARBShaderObjects.glLinkProgramARB((int)n2);
        } else {
            GL20.glLinkProgram((int)n2);
        }
    }

    public static int a(int n2, CharSequence charSequence) {
        return bMC ? ARBShaderObjects.glGetUniformLocationARB((int)n2, (CharSequence)charSequence) : GL20.glGetUniformLocation((int)n2, (CharSequence)charSequence);
    }

    public static void a(int n2, IntBuffer intBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniform1ARB((int)n2, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform1((int)n2, (IntBuffer)intBuffer);
        }
    }

    public static void V(int n2, int n3) {
        if (bMC) {
            ARBShaderObjects.glUniform1iARB((int)n2, (int)n3);
        } else {
            GL20.glUniform1i((int)n2, (int)n3);
        }
    }

    public static void b(int n2, FloatBuffer floatBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniform1ARB((int)n2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform1((int)n2, (FloatBuffer)floatBuffer);
        }
    }

    public static void b(int n2, IntBuffer intBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniform2ARB((int)n2, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform2((int)n2, (IntBuffer)intBuffer);
        }
    }

    public static void c(int n2, FloatBuffer floatBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniform2ARB((int)n2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform2((int)n2, (FloatBuffer)floatBuffer);
        }
    }

    public static void c(int n2, IntBuffer intBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniform3ARB((int)n2, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform3((int)n2, (IntBuffer)intBuffer);
        }
    }

    public static void d(int n2, FloatBuffer floatBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniform3ARB((int)n2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform3((int)n2, (FloatBuffer)floatBuffer);
        }
    }

    public static void d(int n2, IntBuffer intBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniform4ARB((int)n2, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform4((int)n2, (IntBuffer)intBuffer);
        }
    }

    public static void e(int n2, FloatBuffer floatBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniform4ARB((int)n2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform4((int)n2, (FloatBuffer)floatBuffer);
        }
    }

    public static void a(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniformMatrix2ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix2((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    public static void b(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniformMatrix3ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix3((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    public static void c(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (bMC) {
            ARBShaderObjects.glUniformMatrix4ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix4((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    public static int b(int n2, CharSequence charSequence) {
        return bMC ? ARBVertexShader.glGetAttribLocationARB((int)n2, (CharSequence)charSequence) : GL20.glGetAttribLocation((int)n2, (CharSequence)charSequence);
    }

    public static int Ku() {
        return bNn ? ARBVertexBufferObject.glGenBuffersARB() : GL15.glGenBuffers();
    }

    public static void W(int n2, int n3) {
        if (bNn) {
            ARBVertexBufferObject.glBindBufferARB((int)n2, (int)n3);
        } else {
            GL15.glBindBuffer((int)n2, (int)n3);
        }
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        if (bNn) {
            ARBVertexBufferObject.glBufferDataARB((int)n2, (ByteBuffer)byteBuffer, (int)n3);
        } else {
            GL15.glBufferData((int)n2, (ByteBuffer)byteBuffer, (int)n3);
        }
    }

    public static void db(int n2) {
        if (bNn) {
            ARBVertexBufferObject.glDeleteBuffersARB((int)n2);
        } else {
            GL15.glDeleteBuffers((int)n2);
        }
    }

    public static boolean Kv() {
        return !a.LE() && (!a.apg() || bNt) && bNl && d.AZ().aIY.cgH;
    }

    public static void X(int n2, int n3) {
        if (bMA) {
            switch (bMz) {
                case 0: {
                    GL30.glBindFramebuffer((int)n2, (int)n3);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindFramebuffer((int)n2, (int)n3);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindFramebufferEXT((int)n2, (int)n3);
                }
            }
        }
    }

    public static void Y(int n2, int n3) {
        if (bMA) {
            switch (bMz) {
                case 0: {
                    GL30.glBindRenderbuffer((int)n2, (int)n3);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindRenderbuffer((int)n2, (int)n3);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindRenderbufferEXT((int)n2, (int)n3);
                }
            }
        }
    }

    public static void dc(int n2) {
        if (bMA) {
            switch (bMz) {
                case 0: {
                    GL30.glDeleteRenderbuffers((int)n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteRenderbuffers((int)n2);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteRenderbuffersEXT((int)n2);
                }
            }
        }
    }

    public static void dd(int n2) {
        if (bMA) {
            switch (bMz) {
                case 0: {
                    GL30.glDeleteFramebuffers((int)n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteFramebuffers((int)n2);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteFramebuffersEXT((int)n2);
                }
            }
        }
    }

    public static int Kw() {
        if (!bMA) {
            return -1;
        }
        switch (bMz) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
        }
        return -1;
    }

    public static int Kx() {
        if (!bMA) {
            return -1;
        }
        switch (bMz) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
        }
        return -1;
    }

    public static void n(int n2, int n3, int n4, int n5) {
        if (bMA) {
            switch (bMz) {
                case 0: {
                    GL30.glRenderbufferStorage((int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glRenderbufferStorage((int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glRenderbufferStorageEXT((int)n2, (int)n3, (int)n4, (int)n5);
                }
            }
        }
    }

    public static void o(int n2, int n3, int n4, int n5) {
        if (bMA) {
            switch (bMz) {
                case 0: {
                    GL30.glFramebufferRenderbuffer((int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferRenderbuffer((int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferRenderbufferEXT((int)n2, (int)n3, (int)n4, (int)n5);
                }
            }
        }
    }

    public static int de(int n2) {
        if (!bMA) {
            return -1;
        }
        switch (bMz) {
            case 0: {
                return GL30.glCheckFramebufferStatus((int)n2);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus((int)n2);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT((int)n2);
            }
        }
        return -1;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        if (bMA) {
            switch (bMz) {
                case 0: {
                    GL30.glFramebufferTexture2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferTexture2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)n2, (int)n3, (int)n4, (int)n5, (int)n6);
                }
            }
        }
    }

    public static void cN(int n2) {
        if (bMH) {
            ARBMultitexture.glActiveTextureARB((int)n2);
        } else {
            GL13.glActiveTexture((int)n2);
        }
    }

    public static void df(int n2) {
        if (bMH) {
            ARBMultitexture.glClientActiveTextureARB((int)n2);
        } else {
            GL13.glClientActiveTexture((int)n2);
        }
    }

    public static void a(int n2, float f2, float f3) {
        if (bMH) {
            ARBMultitexture.glMultiTexCoord2fARB((int)n2, (float)f2, (float)f3);
        } else {
            GL13.glMultiTexCoord2f((int)n2, (float)f2, (float)f3);
        }
        if (n2 == bMJ) {
            bNq = f2;
            bNr = f3;
        }
    }

    public static void p(int n2, int n3, int n4, int n5) {
        if (bNf) {
            if (bNg) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT((int)n2, (int)n3, (int)n4, (int)n5);
            } else {
                GL14.glBlendFuncSeparate((int)n2, (int)n3, (int)n4, (int)n5);
            }
        } else {
            GL11.glBlendFunc((int)n2, (int)n3);
        }
    }

    public static boolean Ky() {
        return !a.aoi() && bMA && d.AZ().aIY.cgu;
    }

    public static void a(int n2, long l2, int n3) {
        if (bNn) {
            ARBVertexBufferObject.glBufferDataARB((int)n2, (long)l2, (int)n3);
        } else {
            GL15.glBufferData((int)n2, (long)l2, (int)n3);
        }
    }

    public static void a(int n2, long l2, ByteBuffer byteBuffer) {
        if (bNn) {
            ARBVertexBufferObject.glBufferSubDataARB((int)n2, (long)l2, (ByteBuffer)byteBuffer);
        } else {
            GL15.glBufferSubData((int)n2, (long)l2, (ByteBuffer)byteBuffer);
        }
    }

    public static void a(int n2, int n3, long l2, long l3, long l4) {
        if (bNs) {
            GL31.glCopyBufferSubData((int)n2, (int)n3, (long)l2, (long)l3, (long)l4);
        } else {
            ARBCopyBuffer.glCopyBufferSubData((int)n2, (int)n3, (long)l2, (long)l3, (long)l4);
        }
    }

    public static String Kz() {
        return bNk == null ? "<unknown>" : bNk;
    }

    static {
        bNj = "";
        bNq = 0.0f;
        bNr = 0.0f;
    }
}

