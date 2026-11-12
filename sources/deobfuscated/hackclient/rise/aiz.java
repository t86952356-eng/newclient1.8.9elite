/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package hackclient.rise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.cz;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.cm;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import rise.util.InstanceAccess;

public class aiz
implements InstanceAccess {
    private static final IResourceManager aQC = aER.Br();

    public static int H(String string, String string2) {
        String string3 = aiz.cm(string);
        String string4 = aiz.cm(string2);
        if (string == null || string2 == null) {
            System.out.println("An error occurred whilst creating shader");
            System.out.println("Fragment: " + string3 == null);
            System.out.println("Vertex: " + string4 == null);
            return -1;
        }
        int n2 = GL20.glCreateShader((int)35632);
        int n3 = GL20.glCreateShader((int)35633);
        GL20.glShaderSource((int)n2, (CharSequence)string3);
        GL20.glShaderSource((int)n3, (CharSequence)string4);
        GL20.glCompileShader((int)n2);
        GL20.glCompileShader((int)n3);
        if (!aiz.aE(n2)) {
            return -1;
        }
        if (!aiz.aE(n3)) {
            return -1;
        }
        int n4 = GL20.glCreateProgram();
        GL20.glAttachShader((int)n4, (int)n2);
        GL20.glAttachShader((int)n4, (int)n3);
        GL20.glValidateProgram((int)n4);
        GL20.glLinkProgram((int)n4);
        GL20.glDeleteShader((int)n2);
        GL20.glDeleteShader((int)n3);
        return n4;
    }

    private static boolean aE(int n2) {
        boolean bl2;
        boolean bl3 = bl2 = GL20.glGetShaderi((int)n2, (int)35713) == 1;
        if (bl2) {
            return true;
        }
        String string = GL20.glGetShaderInfoLog((int)n2, (int)8192);
        System.out.println("\nError while compiling shader: ");
        System.out.println("-------------------------------");
        System.out.println(string);
        return false;
    }

    public static String cm(String string) {
        try {
            InputStream inputStream = aQC.v(new cm("rise/shader/" + string)).getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            Object object = "";
            try {
                String string2;
                while ((string2 = bufferedReader.readLine()) != null) {
                    object = (String)object + string2 + System.lineSeparator();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            return object;
        }
        catch (IOException | NullPointerException exception) {
            System.out.println("An error occurred while getting a shader resource");
            exception.printStackTrace();
            return null;
        }
    }

    public static void c(cz cz2) {
        if (Minecraft.getMinecraft().aIY.ciV) {
            return;
        }
        float f2 = (float)cz2.Gq();
        float f3 = (float)cz2.Gr();
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)0.0f, (float)0.0f);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)0.0f, (float)f3);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex2f((float)f2, (float)f3);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex2f((float)f2, (float)0.0f);
        GL11.glEnd();
    }
}

