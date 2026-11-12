/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.openjdk.nashorn.api.scripting.JSObject
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.API;
import com.alan.clients.script.api.wrapper.impl.ScriptItemStack;
import com.alan.clients.script.api.wrapper.impl.ScriptMCFontRenderer;
import com.alan.clients.script.api.wrapper.impl.ScriptRiseFontRenderer;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector3d;
import hackclient.rise.a;
import hackclient.rise.ady;
import hackclient.rise.aea;
import hackclient.rise.agi;
import hackclient.rise.ait;
import hackclient.rise.cl;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import javax.script.ScriptException;
import net.minecraft.client.renderer.entity.RenderManager;
import org.openjdk.nashorn.api.scripting.JSObject;

public class RenderAPI
extends API
implements aea {
    public ScriptVector3d getCameraPosition() {
        MC.BF();
        MC.BF();
        MC.BF();
        return new ScriptVector3d(RenderManager.bVA, RenderManager.bVB, RenderManager.bVC);
    }

    public static Color intArrayToColor(int[] nArray) {
        int[] nArray2 = Arrays.stream(nArray).map(n2 -> Math.min(n2, 255)).toArray();
        return new Color(nArray2[0], nArray2[1], nArray2[2], nArray2.length >= 4 ? nArray2[3] : 255);
    }

    public void rectangle(double d2, double d3, double d4, double d5, int[] nArray) {
        try {
            ait.d(d2, d3, d4, d5, RenderAPI.intArrayToColor(nArray));
        }
        catch (Exception exception) {
            throw new ScriptException("Not enough elements in the array!");
        }
    }

    public void rectangle(double d2, double d3, double d4, double d5) {
        ait.rectangle(d2, d3, d4, d5);
    }

    public void rainbowRectangle(double d2, double d3, double d4, double d5) {
        ait.rainbowRectangle(d2, d3, d4, d5);
    }

    public void roundedRectangle(double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        ait.c(d2, d3, d4, d5, d6, RenderAPI.intArrayToColor(nArray));
    }

    public void roundedOutlineRectangle(double d2, double d3, double d4, double d5, double d6, double d7, int[] nArray) {
        ait.a(d2, d3, d4, d5, d6, d7, RenderAPI.intArrayToColor(nArray));
    }

    public void centeredRectangle(double d2, double d3, double d4, double d5, int[] nArray) {
        try {
            ait.d(d2 - d4 / 2.0, d3 - d5 / 2.0, d4, d5, RenderAPI.intArrayToColor(nArray));
        }
        catch (Exception exception) {
            throw new ScriptException("Not enough elements in the array!");
        }
    }

    public void centeredRectangle(double d2, double d3, double d4, double d5) {
        ait.rectangle(d2 - d4 / 2.0, d3 - d5 / 2.0, d4, d5);
    }

    public void smoothCamera() {
        cl.cn();
    }

    public void renderItemIcon(double d2, double d3, int n2, ScriptItemStack scriptItemStack) {
        ait.a(d2, d3, n2, scriptItemStack.getWrapped());
    }

    public void drawLine3D(double d2, double d3, double d4, double d5, double d6, double d7, int[] nArray, float f2) {
        ait.a(d2, d3, d4, d5, d6, d7, RenderAPI.intArrayToColor(nArray), f2);
    }

    public void drawLine3D(ScriptVector3d scriptVector3d, ScriptVector3d scriptVector3d2, int[] nArray, float f2) {
        this.drawLine3D(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ(), scriptVector3d2.getX(), scriptVector3d2.getY(), scriptVector3d2.getZ(), nArray, f2);
    }

    public ScriptMCFontRenderer getMinecraftFontRenderer() {
        return new ScriptMCFontRenderer(RenderAPI.MC.fontRendererObj);
    }

    public ScriptRiseFontRenderer getMainFontRenderer(int n2) {
        return new ScriptRiseFontRenderer((agi)gb.ks.a(n2, gd.kG));
    }

    public ScriptRiseFontRenderer getMainFontRendererBold(int n2) {
        return new ScriptRiseFontRenderer((agi)gb.ks.a(n2, gd.kH));
    }

    public ScriptRiseFontRenderer getMainFontRendererMedium(int n2) {
        return new ScriptRiseFontRenderer((agi)gb.ks.a(n2, gd.kF));
    }

    public ScriptRiseFontRenderer getMainFontRendererLight(int n2) {
        return new ScriptRiseFontRenderer((agi)gb.ks.a(n2, gd.kE));
    }

    public ScriptRiseFontRenderer getCustomFontRenderer(String string, int n2, boolean bl2) {
        return new ScriptRiseFontRenderer(new agi(new Font(string, 0, n2), bl2));
    }

    public ScriptRiseFontRenderer getCustomFontRendererBold(String string, int n2, boolean bl2) {
        return new ScriptRiseFontRenderer(new agi(new Font(string, 1, n2), bl2));
    }

    public ScriptRiseFontRenderer getCustomFontRendererItalic(String string, int n2, boolean bl2) {
        return new ScriptRiseFontRenderer(new agi(new Font(string, 2, n2), bl2));
    }

    public ScriptRiseFontRenderer getCustomFontRendererBoldItalic(String string, int n2, boolean bl2) {
        return new ScriptRiseFontRenderer(new agi(new Font(string, 3, n2), bl2));
    }

    public float getEyeHeight() {
        return RenderAPI.MC.bgK.getEyeHeight();
    }

    public int[] getThemeColor() {
        int[] nArray = new int[4];
        Color color = a.a.k().rP().rQ();
        nArray[0] = color.getRed();
        nArray[1] = color.getGreen();
        nArray[2] = color.getBlue();
        nArray[3] = color.getAlpha();
        return nArray;
    }

    public int[] getSecondaryColor() {
        int[] nArray = new int[4];
        Color color = a.a.k().rP().rR();
        nArray[0] = color.getRed();
        nArray[1] = color.getGreen();
        nArray[2] = color.getBlue();
        nArray[3] = color.getAlpha();
        return nArray;
    }

    public void blur(JSObject jSObject) {
        if (!jSObject.isFunction()) {
            throw new ScriptException("Not a function!");
        }
        this.b(gg.kU).c(() -> jSObject.call(null, new Object[0]));
    }

    public void postBloom(JSObject jSObject) {
        this.bloom(jSObject);
    }

    public void bloom(JSObject jSObject) {
        if (!jSObject.isFunction()) {
            throw new ScriptException("Not a function!");
        }
        this.b(gg.kT).c(() -> jSObject.call(null, new Object[0]));
    }

    public int[] getBackgroundShade() {
        this.rP();
        Color color = ady.sa();
        return new int[]{color.getRed(), color.getBlue(), color.getGreen(), color.getAlpha()};
    }

    public int[] getDropShadow() {
        Color color = this.rP().rU();
        return new int[]{color.getRed(), color.getBlue(), color.getGreen(), color.getAlpha()};
    }
}

