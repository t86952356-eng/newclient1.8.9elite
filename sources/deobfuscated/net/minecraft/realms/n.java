/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.util.UUIDTypeAdapter
 */
package net.minecraft.realms;

import com.mojang.util.UUIDTypeAdapter;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.a;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.ca;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.co;
import net.minecraft.realms.c;
import net.minecraft.realms.f;
import net.minecraft.realms.k;
import net.minecraft.util.cm;

public class n {
    public static final int SKIN_HEAD_U = 8;
    public static final int SKIN_HEAD_V = 8;
    public static final int SKIN_HEAD_WIDTH = 8;
    public static final int SKIN_HEAD_HEIGHT = 8;
    public static final int SKIN_HAT_U = 40;
    public static final int SKIN_HAT_V = 8;
    public static final int SKIN_HAT_WIDTH = 8;
    public static final int SKIN_HAT_HEIGHT = 8;
    public static final int SKIN_TEX_WIDTH = 64;
    public static final int SKIN_TEX_HEIGHT = 64;
    protected Minecraft minecraft;
    public int width;
    public int height;
    private final ca proxy = new ca(this);

    public ca getProxy() {
        return this.proxy;
    }

    public void init() {
    }

    public void init(Minecraft minecraft, int n2, int n3) {
    }

    public void drawCenteredString(String string, int n2, int n3, int n4) {
        this.proxy.a(string, n2, n3, n4);
    }

    public void drawString(String string, int n2, int n3, int n4) {
        this.drawString(string, n2, n3, n4, true);
    }

    public void drawString(String string, int n2, int n3, int n4, boolean bl2) {
        this.proxy.b(string, n2, n3, n4, false);
    }

    public void blit(float f2, int n2, int n3, int n4, int n5, int n6) {
        this.proxy.drawTexturedModalRect(f2, n2, n3, n4, n5, n6);
    }

    public static void blit(int n2, int n3, float f2, float f3, int n4, int n5, int n6, int n7, float f4, float f5) {
        b.drawScaledCustomSizeModalRect(n2, n3, f2, f3, n4, n5, n6, n7, f4, f5);
    }

    public static void blit(int n2, int n3, float f2, float f3, int n4, int n5, float f4, float f5) {
        b.drawModalRectWithCustomSizedTexture(n2, n3, f2, f3, n4, n5, f4, f5);
    }

    public void fillGradient(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.proxy.drawGradientRect(n2, n3, n4, n5, n6, n7);
    }

    public void renderBackground() {
        this.proxy.drawDefaultBackground();
    }

    public boolean isPauseScreen() {
        return this.proxy.doesGuiPauseGame();
    }

    public void renderBackground(int n2) {
        this.proxy.drawWorldBackground(n2);
    }

    public void render(int n2, int n3, float f2) {
        for (int i2 = 0; i2 < this.proxy.FK().size(); ++i2) {
            this.proxy.FK().get(i2).render(n2, n3);
        }
    }

    public void renderTooltip(co co2, int n2, int n3) {
        this.proxy.renderToolTip(co2, n2, n3);
    }

    public void renderTooltip(String string, int n2, int n3) {
        this.proxy.drawCreativeTabHoveringText(string, n2, n3);
    }

    public void renderTooltip(List<String> list, int n2, int n3) {
        this.proxy.drawHoveringText(list, n2, n3);
    }

    public static void bindFace(String string, String string2) {
        cm cm2 = a.cE(string2);
        if (cm2 == null) {
            cm2 = DefaultPlayerSkin.e(UUIDTypeAdapter.fromString((String)string));
        }
        a.a(cm2, string2);
        Minecraft.getMinecraft().Bq().a(cm2);
    }

    public static void bind(String string) {
        cm cm2 = new cm(string);
        Minecraft.getMinecraft().Bq().a(cm2);
    }

    public void tick() {
    }

    public int width() {
        return this.proxy.width;
    }

    public int height() {
        return this.proxy.height;
    }

    public int fontLineHeight() {
        return this.proxy.FI();
    }

    public int fontWidth(String string) {
        return this.proxy.cS(string);
    }

    public void fontDrawShadow(String string, int n2, int n3, int n4) {
        this.proxy.b(string, n2, n3, n4);
    }

    public List<String> fontSplit(String string, int n2) {
        return this.proxy.u(string, n2);
    }

    public void buttonClicked(f f2) {
    }

    public static f newButton(int n2, int n3, int n4, String string) {
        return new f(n2, n3, n4, string);
    }

    public static f newButton(int n2, int n3, int n4, int n5, int n6, String string) {
        return new f(n2, n3, n4, n5, n6, string);
    }

    public void buttonsClear() {
        this.proxy.FJ();
    }

    public void buttonsAdd(f f2) {
        this.proxy.a(f2);
    }

    public List<f> buttons() {
        return this.proxy.FK();
    }

    public void buttonsRemove(f f2) {
        this.proxy.b(f2);
    }

    public k newEditBox(int n2, int n3, int n4, int n5, int n6) {
        return new k(n2, n3, n4, n5, n6);
    }

    public void mouseClicked(int n2, int n3, int n4) {
    }

    public void mouseEvent() {
    }

    public void keyboardEvent() {
    }

    public void mouseReleased(int n2, int n3, int n4) {
    }

    public void mouseDragged(int n2, int n3, int n4, long l2) {
    }

    public void keyPressed(char c2, int n2) {
    }

    public void confirmResult(boolean bl2, int n2) {
    }

    public static String getLocalizedString(String string) {
        return I18n.a(string, new Object[0]);
    }

    public static String getLocalizedString(String string, Object ... objectArray) {
        return I18n.a(string, objectArray);
    }

    public c getLevelStorageSource() {
        return new c(Minecraft.getMinecraft().AB());
    }

    public void removed() {
    }
}

