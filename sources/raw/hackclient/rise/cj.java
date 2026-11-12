/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4d
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.util.glu.GLU
 */
package hackclient.rise;

import hackclient.rise.ahd;
import hackclient.rise.akd;
import hackclient.rise.am;
import hackclient.rise.ck;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.vecmath.Vector4d;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.util.a;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.glu.GLU;

public class cj
extends am
implements ahd {
    private static final HashMap<c, ck> hK = new HashMap();
    private static HashMap<c, ck> hL = new HashMap();
    @dm(cH=0)
    public final dk<fs> hM = fs2 -> aNC.execute(() -> {
        HashMap<c, ck> hashMap = new HashMap<c, ck>();
        HashMap<c, ck> hashMap2 = hK;
        synchronized (hashMap2) {
            for (Map.Entry<c, ck> entry : hK.entrySet()) {
                ck ck2 = entry.getValue();
                ck2.hN = this.f(entry.getKey());
                hashMap.put(entry.getKey(), ck2);
            }
            hK.clear();
        }
        hL = hashMap;
    });

    public static Vector4d e(c c2) {
        ck ck2;
        if (c2 == null) {
            return null;
        }
        if (!hK.containsKey(c2)) {
            hK.put(c2, new ck());
        }
        if ((ck2 = hL.get(c2)) == null) {
            return null;
        }
        return ck2.cm();
    }

    private akd a(int n2, double d2, double d3, double d4) {
        if (GLU.gluProject((float)((float)d2), (float)((float)d3), (float)((float)d4), (FloatBuffer)ActiveRenderInfo.bHm, (FloatBuffer)ActiveRenderInfo.bHn, (IntBuffer)ActiveRenderInfo.bHl, (FloatBuffer)ActiveRenderInfo.bHo)) {
            return new akd(ActiveRenderInfo.bHo.get(0) / (float)n2, ((float)Display.getHeight() - ActiveRenderInfo.bHo.get(1)) / (float)n2, ActiveRenderInfo.bHo.get(2));
        }
        return null;
    }

    public Vector4d f(c c2) {
        aER.BF();
        double d2 = RenderManager.bVA;
        aER.BF();
        double d3 = RenderManager.bVB;
        aER.BF();
        double d4 = RenderManager.bVC;
        double d5 = c2.csh + (c2.gW - c2.csh) * (double)cj.aER.bgC.bWY - d2;
        double d6 = c2.csi + (c2.gX - c2.csi) * (double)cj.aER.bgC.bWY - d3;
        double d7 = c2.csj + (c2.gY - c2.csj) * (double)cj.aER.bgC.bWY - d4;
        double d8 = ((double)c2.width + 0.14) / 2.0;
        double d9 = (double)c2.height + (c2.isSneaking() ? -0.1 : 0.2) + 0.01;
        a a2 = new a(d5 - d8, d6, d7 - d8, d5 + d8, d6 + d9, d7 + d8);
        List<akd> list = Arrays.asList(new akd(a2.dtH, a2.dtI, a2.dtJ), new akd(a2.dtH, a2.dtL, a2.dtJ), new akd(a2.dtK, a2.dtI, a2.dtJ), new akd(a2.dtK, a2.dtL, a2.dtJ), new akd(a2.dtH, a2.dtI, a2.dtM), new akd(a2.dtH, a2.dtL, a2.dtM), new akd(a2.dtK, a2.dtI, a2.dtM), new akd(a2.dtK, a2.dtL, a2.dtM));
        Vector4d vector4d = null;
        for (akd akd2 : list) {
            akd2 = this.a(cj.aER.jY.getScaleFactor(), akd2.getX(), akd2.getY(), akd2.getZ());
            if (akd2 == null || !(akd2.getZ() >= 0.0) || !(akd2.getZ() < 1.0)) continue;
            if (vector4d == null) {
                vector4d = new Vector4d(akd2.getX(), akd2.getY(), akd2.getZ(), 0.0);
            }
            vector4d = new Vector4d(Math.min(akd2.getX(), vector4d.x), Math.min(akd2.getY(), vector4d.y), Math.max(akd2.getX(), vector4d.z), Math.max(akd2.getY(), vector4d.w));
        }
        return vector4d;
    }
}

