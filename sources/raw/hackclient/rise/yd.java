/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import org.lwjgl.opengl.GL11;

@gl(aliases={"XRay", "X-Ray", "Ore ESP"}, description="Shows ores through walls with ESP and tracers", category=gj.RENDER)
public final class yd
extends gi {
    public static int aqH;
    public static boolean aqI;
    public static List<Integer> aqJ;
    public static List<b> aqK;
    private final rip.vantage.commons.util.time.a aqL = new rip.vantage.commons.util.time.a();
    private final akq aqM = new akq("Opacity", this, (Number)160, (Number)0, (Number)255, (Number)1);
    private final akq aqN = new akq("World Opacity", this, (Number)50, (Number)0, (Number)255, (Number)1);
    private final aki aqO = new aki("ESP", (gi)this, (Boolean)true);
    private final aki aqP = new aki("Tracers", (gi)this, (Boolean)true);
    private final aki aqQ = new aki("Diamond", (gi)this, (Boolean)true);
    private final aki aqR = new aki("Redstone", (gi)this, (Boolean)false);
    private final aki aqS = new aki("Emerald", (gi)this, (Boolean)false);
    private final aki aqT = new aki("Lapis", (gi)this, (Boolean)false);
    private final aki aqU = new aki("Iron", (gi)this, (Boolean)false);
    private final aki aqV = new aki("Coal", (gi)this, (Boolean)false);
    private final aki aqW = new aki("Gold", (gi)this, (Boolean)false);
    private final akq aqX = new akq("Distance", this, (Number)42, (Number)16, (Number)64, (Number)1);
    private final aki aqY = new aki("Chunk Update", (gi)this, (Boolean)false);
    private final akq aqZ = new akq("Update Delay", this, (Number)10.0, (Number)1.0, (Number)30.0, (Number)0.5);
    @dm
    public final dk<ej> ara = ej2 -> {
        if (aqH != ((Number)this.aqM.wD()).intValue()) {
            yd.aER.bgG.KI();
            aqH = ((Number)this.aqM.wD()).intValue();
        } else if (((Boolean)this.aqY.wD()).booleanValue() && this.aqL.T(((Number)this.aqZ.wD()).longValue() * 1000L)) {
            yd.aER.bgG.KI();
            this.aqL.aX();
        }
        this.my();
    };
    @dm
    public final dk<ft> arb = ft2 -> {
        if (((Boolean)this.aqO.wD()).booleanValue() || ((Boolean)this.aqP.wD()).booleanValue()) {
            for (b b2 : aqK) {
                Block block = yd.aER.bgF.L(b2).df();
                Color color = this.f(block);
                if (color == null) continue;
                this.a(b2, color.getRed(), color.getGreen(), color.getBlue());
            }
        }
    };

    @Override
    public void onEnable() {
        this.w(true);
    }

    @Override
    public void onDisable() {
        this.w(false);
        this.aqL.aX();
    }

    private void w(boolean bl2) {
        aqK.clear();
        yd.aER.bgG.KI();
        aqI = bl2;
    }

    private void my() {
        if (yd.aER.bgK == null || yd.aER.bgF == null) {
            return;
        }
        aqK.clear();
        int n2 = ((Number)this.aqX.wD()).intValue();
        b b2 = new b(yd.aER.bgK.gW, yd.aER.bgK.gX, yd.aER.bgK.gY);
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    b b3 = b2.C(i2, i3, i4);
                    Block block = yd.aER.bgF.L(b3).df();
                    if (!this.e(block)) continue;
                    aqK.add(b3);
                }
            }
        }
    }

    private boolean e(Block block) {
        if (((Boolean)this.aqQ.wD()).booleanValue() && block == Blocks.cMi) {
            return true;
        }
        if (((Boolean)this.aqU.wD()).booleanValue() && block == Blocks.cLr) {
            return true;
        }
        if (((Boolean)this.aqW.wD()).booleanValue() && block == Blocks.cLq) {
            return true;
        }
        if (((Boolean)this.aqT.wD()).booleanValue() && block == Blocks.cLz) {
            return true;
        }
        if (((Boolean)this.aqR.wD()).booleanValue() && (block == Blocks.cME || block == Blocks.cMF)) {
            return true;
        }
        if (((Boolean)this.aqV.wD()).booleanValue() && block == Blocks.cLs) {
            return true;
        }
        return (Boolean)this.aqS.wD() != false && block == Blocks.cNR;
    }

    private Color f(Block block) {
        if (block == Blocks.cMi) {
            return new Color(0, 255, 255);
        }
        if (block == Blocks.cLr) {
            return new Color(225, 225, 225);
        }
        if (block == Blocks.cLz) {
            return new Color(0, 0, 255);
        }
        if (block == Blocks.cME || block == Blocks.cMF) {
            return new Color(255, 0, 0);
        }
        if (block == Blocks.cLs) {
            return new Color(64, 64, 64);
        }
        if (block == Blocks.cNR) {
            return new Color(0, 255, 0);
        }
        if (block == Blocks.cLq) {
            return new Color(255, 255, 0);
        }
        return null;
    }

    private void a(b b2, int n2, int n3, int n4) {
        int n5 = ((Number)this.aqM.wD()).intValue();
        Color color = new Color(n2, n3, n4, n5);
        if (((Boolean)this.aqO.wD()).booleanValue()) {
            this.a(b2, color);
        }
        if (((Boolean)this.aqP.wD()).booleanValue()) {
            this.b(b2, color);
        }
    }

    private void a(b b2, Color color) {
        double d2 = (double)b2.wt() - yd.aER.BF().bVG;
        double d3 = (double)b2.wu() - yd.aER.BF().bVH;
        double d4 = (double)b2.wx() - yd.aER.BF().bVI;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2884);
        ais.d(color);
        this.e(new net.minecraft.util.a(d2, d3, d4, d2 + 1.0, d3 + 1.0, d4 + 1.0));
        GL11.glEnable((int)2884);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    private void b(b b2, Color color) {
        double d2 = (double)b2.wt() + 0.5 - yd.aER.BF().bVG;
        double d3 = (double)b2.wu() + 0.5 - yd.aER.BF().bVH;
        double d4 = (double)b2.wx() + 0.5 - yd.aER.BF().bVI;
        double d5 = yd.aER.bgK.csh + (yd.aER.bgK.gW - yd.aER.bgK.csh) * (double)yd.aER.bgC.bWY - yd.aER.BF().bVG;
        double d6 = yd.aER.bgK.csi + (yd.aER.bgK.gX - yd.aER.bgK.csi) * (double)yd.aER.bgC.bWY - yd.aER.BF().bVH + (double)yd.aER.bgK.getEyeHeight();
        double d7 = yd.aER.bgK.csj + (yd.aER.bgK.gY - yd.aER.bgK.csj) * (double)yd.aER.bgC.bWY - yd.aER.BF().bVI;
        ait.a(d5, d6, d7, d2, d3, d4, color, 2.0f);
    }

    private void e(net.minecraft.util.a a2) {
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtI, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtI, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtI, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtI, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtL, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtL, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtL, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtL, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtI, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtI, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtL, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtL, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtI, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtI, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtL, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtL, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtI, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtI, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtL, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtH, (double)a2.dtL, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtI, (double)a2.dtM);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtI, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtL, (double)a2.dtJ);
        GL11.glVertex3d((double)a2.dtK, (double)a2.dtL, (double)a2.dtM);
        GL11.glEnd();
    }

    public static boolean mz() {
        yd yd2 = a.a.g().c(yd.class);
        return yd2 != null && (Boolean)yd2.aqO.wD() != false;
    }

    public static int mA() {
        yd yd2 = a.a.g().c(yd.class);
        return yd2 != null ? ((Number)yd2.aqX.wD()).intValue() : 42;
    }

    public static boolean mB() {
        yd yd2 = a.a.g().c(yd.class);
        return yd2 != null && yd2.isEnabled();
    }

    public static float mC() {
        yd yd2 = a.a.g().c(yd.class);
        if (yd2 != null && yd2.isEnabled()) {
            return ((Number)yd2.aqN.wD()).floatValue() / 255.0f;
        }
        return 1.0f;
    }

    static {
        aqJ = Arrays.asList(10, 11, 8, 9, 14, 15, 16, 21, 41, 42, 46, 48, 52, 56, 57, 61, 62, 73, 74, 84, 89, 103, 116, 117, 118, 120, 129, 133, 137, 145, 152, 153, 154);
        aqK = new CopyOnWriteArrayList<b>();
    }
}

