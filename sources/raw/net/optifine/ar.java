/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBDebugOutput
 *  org.lwjgl.opengl.ARBDebugOutputCallback
 *  org.lwjgl.opengl.ARBDebugOutputCallback$Handler
 *  org.lwjgl.opengl.ContextAttribs
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.opengl.PixelFormat
 */
package net.optifine;

import net.minecraft.src.a;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.ARBDebugOutputCallback;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;

public class ar
implements ARBDebugOutputCallback.Handler {
    public static void aBr() {
        boolean bl2 = GLContext.getCapabilities().GL_ARB_debug_output;
        ContextAttribs contextAttribs = new ContextAttribs().withDebug(true);
        Display.create((PixelFormat)new PixelFormat().withDepthBits(24), (ContextAttribs)contextAttribs);
        ARBDebugOutput.glDebugMessageCallbackARB((ARBDebugOutputCallback)new ARBDebugOutputCallback((ARBDebugOutputCallback.Handler)new ar()));
        ARBDebugOutput.glDebugMessageControlARB((int)4352, (int)4352, (int)4352, null, (boolean)true);
        GL11.glEnable((int)33346);
    }

    public void handleMessage(int n2, int n3, int n4, int n5, String string) {
        if (!(string.contains("glBindFramebuffer") || string.contains("Wide lines") || string.contains("shader recompiled"))) {
            a.fN("[LWJGL] source: " + this.jj(n2) + ", type: " + this.jk(n3) + ", id: " + n4 + ", severity: " + this.jl(n5) + ", message: " + string);
            new Throwable("StackTrace").printStackTrace();
        }
    }

    public String jj(int n2) {
        switch (n2) {
            case 33350: {
                return "API";
            }
            case 33351: {
                return "WIN";
            }
            case 33352: {
                return "SHADER";
            }
            case 33353: {
                return "EXT";
            }
            case 33354: {
                return "APP";
            }
            case 33355: {
                return "OTHER";
            }
        }
        return this.jm(n2);
    }

    public String jk(int n2) {
        switch (n2) {
            case 33356: {
                return "ERROR";
            }
            case 33357: {
                return "DEPRECATED";
            }
            case 33358: {
                return "UNDEFINED";
            }
            case 33359: {
                return "PORTABILITY";
            }
            case 33360: {
                return "PERFORMANCE";
            }
            case 33361: {
                return "OTHER";
            }
        }
        return this.jm(n2);
    }

    public String jl(int n2) {
        switch (n2) {
            case 37190: {
                return "HIGH";
            }
            case 37191: {
                return "MEDIUM";
            }
            case 37192: {
                return "LOW";
            }
        }
        return this.jm(n2);
    }

    private String jm(int n2) {
        return "Unknown (0x" + Integer.toHexString(n2).toUpperCase() + ")";
    }
}

