/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.shader;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.h;
import net.minecraft.client.util.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e {
    private static final Logger cmE = LogManager.getLogger();
    private static e cmF;

    public static void Rw() {
        cmF = new e();
    }

    public static e Rx() {
        return cmF;
    }

    public void a(h h2) {
        h2.RJ().a(h2);
        h2.RI().a(h2);
        OpenGlHelper.cZ(h2.RK());
    }

    public int Ry() {
        int n2 = OpenGlHelper.Kt();
        if (n2 <= 0) {
            throw new b("Could not create shader program (returned program ID " + n2 + ")");
        }
        return n2;
    }

    public void b(h h2) {
        h2.RJ().c(h2);
        h2.RI().c(h2);
        OpenGlHelper.da(h2.RK());
        int n2 = OpenGlHelper.Q(h2.RK(), OpenGlHelper.bMD);
        if (n2 == 0) {
            cmE.warn("Error encountered when linking program containing VS " + h2.RI().Rz() + " and FS " + h2.RJ().Rz() + ". Log output:");
            cmE.warn(OpenGlHelper.U(h2.RK(), 32768));
        }
    }
}

