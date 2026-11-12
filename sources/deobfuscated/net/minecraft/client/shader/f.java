/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.BufferUtils
 */
package net.minecraft.client.shader;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.g;
import net.minecraft.client.shader.h;
import net.minecraft.client.util.b;
import net.minecraft.util.cm;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class f {
    private final g cmG;
    private final String cmH;
    private final int cmI;
    private int cmJ = 0;

    private f(g g2, int n2, String string) {
        this.cmG = g2;
        this.cmI = n2;
        this.cmH = string;
    }

    public void c(h h2) {
        ++this.cmJ;
        OpenGlHelper.R(h2.RK(), this.cmI);
    }

    public void a(h h2) {
        --this.cmJ;
        if (this.cmJ <= 0) {
            OpenGlHelper.cV(this.cmI);
            this.cmG.RD().remove(this.cmH);
        }
    }

    public String Rz() {
        return this.cmH;
    }

    public static f a(IResourceManager iResourceManager, g g2, String string) {
        f f2 = g2.RD().get(string);
        if (f2 == null) {
            cm cm2 = new cm("shaders/program/" + string + g2.RB());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(iResourceManager.v(cm2).getInputStream());
            byte[] byArray = f.a(bufferedInputStream);
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)byArray.length);
            byteBuffer.put(byArray);
            byteBuffer.position(0);
            int n2 = OpenGlHelper.cW(g2.RC());
            OpenGlHelper.a(n2, byteBuffer);
            OpenGlHelper.cX(n2);
            if (OpenGlHelper.S(n2, OpenGlHelper.bME) == 0) {
                String string2 = StringUtils.trim((String)OpenGlHelper.T(n2, 32768));
                b b2 = new b("Couldn't compile " + g2.RA() + " program: " + string2);
                b2.dK(cm2.atA());
                throw b2;
            }
            f2 = new f(g2, n2, string);
            g2.RD().put(string, f2);
        }
        return f2;
    }

    protected static byte[] a(BufferedInputStream bufferedInputStream) {
        byte[] byArray;
        try {
            byArray = IOUtils.toByteArray((InputStream)bufferedInputStream);
        }
        finally {
            bufferedInputStream.close();
        }
        return byArray;
    }
}

