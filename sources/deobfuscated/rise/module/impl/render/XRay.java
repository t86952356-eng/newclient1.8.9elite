/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.render;

import hackclient.rise.ais;
import hackclient.rise.ait;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import org.lwjgl.opengl.GL11;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"XRay", "X-Ray", "Ore ESP"}, description="Shows ores through walls with ESP and tracers", category=Category.RENDER)
public final class XRay
extends Module {
    public static int aqH;
    public static boolean aqI;
    public static List<Integer> aqJ;
    public static List<b> aqK;
    private final a aqL = new a();
    private final NumberValue aqM = new NumberValue("Opacity", this, (Number)160, (Number)0, (Number)255, (Number)1);
    private final NumberValue aqN = new NumberValue("World Opacity", this, (Number)50, (Number)0, (Number)255, (Number)1);
    private final BooleanValue aqO = new BooleanValue("ESP", (Module)this, (Boolean)true);
    private final BooleanValue aqP = new BooleanValue("Tracers", (Module)this, (Boolean)true);
    private final BooleanValue aqQ = new BooleanValue("Diamond", (Module)this, (Boolean)true);
    private final BooleanValue aqR = new BooleanValue("Redstone", (Module)this, (Boolean)false);
    private final BooleanValue aqS = new BooleanValue("Emerald", (Module)this, (Boolean)false);
    private final BooleanValue aqT = new BooleanValue("Lapis", (Module)this, (Boolean)false);
    private final BooleanValue aqU = new BooleanValue("Iron", (Module)this, (Boolean)false);
    private final BooleanValue aqV = new BooleanValue("Coal", (Module)this, (Boolean)false);
    private final BooleanValue aqW = new BooleanValue("Gold", (Module)this, (Boolean)false);
    private final NumberValue aqX = new NumberValue("Distance", this, (Number)42, (Number)16, (Number)64, (Number)1);
    private final BooleanValue aqY = new BooleanValue("Chunk Update", (Module)this, (Boolean)false);
    private final NumberValue aqZ = new NumberValue("Update Delay", this, (Number)10.0, (Number)1.0, (Number)30.0, (Number)0.5);
    @EventLink
    public final Listener<PreUpdateEvent> ara = preUpdateEvent -> {
        if (aqH != ((Number)this.aqM.wD()).intValue()) {
            XRay.aER.bgG.KI();
            aqH = ((Number)this.aqM.wD()).intValue();
        } else if (((Boolean)this.aqY.wD()).booleanValue() && this.aqL.T(((Number)this.aqZ.wD()).longValue() * 1000L)) {
            XRay.aER.bgG.KI();
            this.aqL.aX();
        }
        this.my();
    };
    @EventLink
    public final Listener<Render3DEvent> arb = render3DEvent -> {
        if (((Boolean)this.aqO.wD()).booleanValue() || ((Boolean)this.aqP.wD()).booleanValue()) {
            for (b b2 : aqK) {
                Block block = XRay.aER.bgF.L(b2).df();
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
        XRay.aER.bgG.KI();
        aqI = bl2;
    }

    private void my() {
        if (XRay.aER.bgK == null || XRay.aER.bgF == null) {
            return;
        }
        aqK.clear();
        int n2 = ((Number)this.aqX.wD()).intValue();
        b b2 = new b(XRay.aER.bgK.gW, XRay.aER.bgK.gX, XRay.aER.bgK.gY);
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    b b3 = b2.C(i2, i3, i4);
                    Block block = XRay.aER.bgF.L(b3).df();
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
        double d2 = (double)b2.wt() - XRay.aER.BF().bVG;
        double d3 = (double)b2.wu() - XRay.aER.BF().bVH;
        double d4 = (double)b2.wx() - XRay.aER.BF().bVI;
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
        double d2 = (double)b2.wt() + 0.5 - XRay.aER.BF().bVG;
        double d3 = (double)b2.wu() + 0.5 - XRay.aER.BF().bVH;
        double d4 = (double)b2.wx() + 0.5 - XRay.aER.BF().bVI;
        double d5 = XRay.aER.bgK.csh + (XRay.aER.bgK.gW - XRay.aER.bgK.csh) * (double)XRay.aER.bgC.bWY - XRay.aER.BF().bVG;
        double d6 = XRay.aER.bgK.csi + (XRay.aER.bgK.gX - XRay.aER.bgK.csi) * (double)XRay.aER.bgC.bWY - XRay.aER.BF().bVH + (double)XRay.aER.bgK.getEyeHeight();
        double d7 = XRay.aER.bgK.csj + (XRay.aER.bgK.gY - XRay.aER.bgK.csj) * (double)XRay.aER.bgC.bWY - XRay.aER.BF().bVI;
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
        XRay xRay = Client.a.g().c(XRay.class);
        return xRay != null && (Boolean)xRay.aqO.wD() != false;
    }

    public static int mA() {
        XRay xRay = Client.a.g().c(XRay.class);
        return xRay != null ? ((Number)xRay.aqX.wD()).intValue() : 42;
    }

    public static boolean mB() {
        XRay xRay = Client.a.g().c(XRay.class);
        return xRay != null && xRay.isEnabled();
    }

    public static float mC() {
        XRay xRay = Client.a.g().c(XRay.class);
        if (xRay != null && xRay.isEnabled()) {
            return ((Number)xRay.aqN.wD()).floatValue() / 255.0f;
        }
        return 1.0f;
    }

    static {
        aqJ = Arrays.asList(10, 11, 8, 9, 14, 15, 16, 21, 41, 42, 46, 48, 52, 56, 57, 61, 62, 73, 74, 84, 89, 103, 116, 117, 118, 120, 129, 133, 137, 145, 152, 153, 154);
        aqK = new CopyOnWriteArrayList<b>();
    }
}

