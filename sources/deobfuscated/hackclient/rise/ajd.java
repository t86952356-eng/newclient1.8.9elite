/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package hackclient.rise;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL20;

public class ajd {
    public static void a(int n2, String string, FloatBuffer floatBuffer) {
        GL20.glUniform1((int)ajd.b(n2, string), (FloatBuffer)floatBuffer);
    }

    public static void a(int n2, String string, int n3) {
        GL20.glUniform1i((int)ajd.b(n2, string), (int)n3);
    }

    public static void a(int n2, String string, int n3, int n4) {
        GL20.glUniform2i((int)ajd.b(n2, string), (int)n3, (int)n4);
    }

    public static void a(int n2, String string, float f2) {
        GL20.glUniform1f((int)ajd.b(n2, string), (float)f2);
    }

    public static void a(int n2, String string, float f2, float f3) {
        GL20.glUniform2f((int)ajd.b(n2, string), (float)f2, (float)f3);
    }

    public static void a(int n2, String string, float f2, float f3, float f4) {
        GL20.glUniform3f((int)ajd.b(n2, string), (float)f2, (float)f3, (float)f4);
    }

    public static void a(int n2, String string, float f2, float f3, float f4, float f5) {
        GL20.glUniform4f((int)ajd.b(n2, string), (float)f2, (float)f3, (float)f4, (float)f5);
    }

    private static int b(int n2, String string) {
        return GL20.glGetUniformLocation((int)n2, (CharSequence)string);
    }
}

