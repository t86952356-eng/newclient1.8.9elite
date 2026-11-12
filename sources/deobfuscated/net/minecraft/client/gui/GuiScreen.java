/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.gui;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import hackclient.rise.agg;
import hackclient.rise.aha;
import hackclient.rise.ahg;
import hackclient.rise.cg;
import hackclient.rise.ds;
import hackclient.rise.dt;
import hackclient.rise.du;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ae;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cv;
import net.minecraft.client.gui.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.event.d;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.stats.a;
import net.minecraft.stats.f;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.t;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import rise.Client;
import rise.util.InstanceAccess;

public abstract class GuiScreen
extends b
implements InstanceAccess,
cv {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Set<String> PROTOCOLS = Sets.newHashSet((Object[])new String[]{"http", "https"});
    private static final Splitter NEWLINE_SPLITTER = Splitter.on((char)'\n');
    protected RenderItem itemRender;
    public int width;
    public int height;
    protected List<c> buttonList = Lists.newArrayList();
    protected List<ae> labelList = Lists.newArrayList();
    public boolean allowUserInput;
    protected agg fontRendererObj;
    private c selectedButton;
    private int eventButton;
    private long lastMouseEvent;
    private int touchValue;
    private URI clickedLinkURI;

    public void drawScreen(int n2, int n3, float f2) {
        int n4;
        for (n4 = 0; n4 < this.buttonList.size(); ++n4) {
            this.buttonList.get(n4).drawButton(aER, n2, n3);
        }
        for (n4 = 0; n4 < this.labelList.size(); ++n4) {
            this.labelList.get(n4).a(aER, n2, n3);
        }
    }

    protected void keyTyped(char c2, int n2) {
        if (n2 == 1) {
            aER.a((GuiScreen)null);
            if (GuiScreen.aER.bgR == null) {
                aER.AK();
            }
        }
    }

    public static String getClipboardString() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)transferable.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return "";
    }

    public static void setClipboardString(String string) {
        if (!StringUtils.isEmpty((CharSequence)string)) {
            try {
                StringSelection stringSelection = new StringSelection(string);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    protected void renderToolTip(co co2, int n2, int n3) {
        List<String> list = co2.d(GuiScreen.aER.bgK, GuiScreen.aER.aIY.cgL);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (i2 == 0) {
                list.set(i2, String.valueOf((Object)co2.aep().cVf) + list.get(i2));
                continue;
            }
            list.set(i2, String.valueOf((Object)an.dvS) + list.get(i2));
        }
        this.drawHoveringText(list, n2, n3);
    }

    protected void drawCreativeTabHoveringText(String string, int n2, int n3) {
        this.drawHoveringText(Collections.singletonList(string), n2, n3);
    }

    protected void drawHoveringText(List<String> list, int n2, int n3) {
        if (!list.isEmpty()) {
            int n4;
            GlStateManager.JT();
            RenderHelper.Lf();
            GlStateManager.JA();
            GlStateManager.JD();
            int n5 = 0;
            for (String string : list) {
                if (string == null || (n4 = GuiScreen.aER.fontRendererObj.bQ(string)) <= n5) continue;
                n5 = n4;
            }
            int n6 = n2 + 12;
            int n7 = n3 - 12;
            n4 = 8;
            if (list.size() > 1) {
                n4 += 2 + (list.size() - 1) * 10;
            }
            if (n6 + n5 > this.width) {
                n6 -= 28 + n5;
            }
            if (n7 + n4 + 6 > this.height) {
                n7 = this.height - n4 - 6;
            }
            zLevel = 300.0f;
            this.itemRender.zLevel = 300.0f;
            int n8 = -267386864;
            this.drawGradientRect(n6 - 3, n7 - 4, n6 + n5 + 3, n7 - 3, -267386864, -267386864);
            this.drawGradientRect(n6 - 3, n7 + n4 + 3, n6 + n5 + 3, n7 + n4 + 4, -267386864, -267386864);
            this.drawGradientRect(n6 - 3, n7 - 3, n6 + n5 + 3, n7 + n4 + 3, -267386864, -267386864);
            this.drawGradientRect(n6 - 4, n7 - 3, n6 - 3, n7 + n4 + 3, -267386864, -267386864);
            this.drawGradientRect(n6 + n5 + 3, n7 - 3, n6 + n5 + 4, n7 + n4 + 3, -267386864, -267386864);
            int n9 = 0x505000FF;
            int n10 = 1344798847;
            this.drawGradientRect(n6 - 3, n7 - 3 + 1, n6 - 3 + 1, n7 + n4 + 3 - 1, 0x505000FF, 1344798847);
            this.drawGradientRect(n6 + n5 + 2, n7 - 3 + 1, n6 + n5 + 3, n7 + n4 + 3 - 1, 0x505000FF, 1344798847);
            this.drawGradientRect(n6 - 3, n7 - 3, n6 + n5 + 3, n7 - 3 + 1, 0x505000FF, 0x505000FF);
            this.drawGradientRect(n6 - 3, n7 + n4 + 2, n6 + n5 + 3, n7 + n4 + 3, 1344798847, 1344798847);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                String string = list.get(i2);
                this.fontRendererObj.b(string, n6, n7, -1);
                if (i2 == 0) {
                    n7 += 2;
                }
                n7 += 10;
            }
            zLevel = 0.0f;
            this.itemRender.zLevel = 0.0f;
            GlStateManager.Jz();
            GlStateManager.JE();
            RenderHelper.Lg();
            GlStateManager.JS();
        }
    }

    public void handleComponentHover(ba ba2, int n2, int n3) {
        if (ba2 != null && ba2.arp().arC() != null) {
            block21: {
                net.minecraft.event.c c2 = ba2.arp().arC();
                if (c2.acW() == d.cKW) {
                    co co2 = null;
                    try {
                        n n4 = net.minecraft.nbt.b.ez(c2.acX().arq());
                        if (n4 != null) {
                            co2 = co.s(n4);
                        }
                    }
                    catch (net.minecraft.nbt.i i2) {
                        // empty catch block
                    }
                    if (co2 != null) {
                        this.renderToolTip(co2, n2, n3);
                    } else {
                        this.drawCreativeTabHoveringText(String.valueOf((Object)an.dvX) + "Invalid Item!", n2, n3);
                    }
                } else if (c2.acW() == d.cKX) {
                    if (GuiScreen.aER.aIY.cgL) {
                        try {
                            n n5 = net.minecraft.nbt.b.ez(c2.acX().arq());
                            if (n5 != null) {
                                ArrayList arrayList = Lists.newArrayList();
                                n n6 = n5;
                                arrayList.add(n6.eK("name"));
                                if (n6.C("type", 8)) {
                                    String string = n6.eK("type");
                                    arrayList.add("Type: " + string + " (" + net.minecraft.entity.n.ed(string) + ")");
                                }
                                arrayList.add(n6.eK("id"));
                                this.drawHoveringText(arrayList, n2, n3);
                                break block21;
                            }
                            this.drawCreativeTabHoveringText(String.valueOf((Object)an.dvX) + "Invalid Entity!", n2, n3);
                        }
                        catch (net.minecraft.nbt.i i3) {
                            this.drawCreativeTabHoveringText(String.valueOf((Object)an.dvX) + "Invalid Entity!", n2, n3);
                        }
                    }
                } else if (c2.acW() == d.cKU) {
                    this.drawHoveringText(NEWLINE_SPLITTER.splitToList((CharSequence)c2.acX().getFormattedText()), n2, n3);
                } else if (c2.acW() == d.cKV) {
                    f f2 = net.minecraft.stats.n.fU(c2.acX().arq());
                    if (f2 != null) {
                        ba ba3 = f2.app();
                        t t2 = new t("stats.tooltip.type." + (f2.apo() ? "achievement" : "statistic"), new Object[0]);
                        t2.arp().g(true);
                        String string = f2 instanceof a ? ((a)f2).getDescription() : null;
                        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{ba3.getFormattedText(), t2.getFormattedText()});
                        if (string != null) {
                            arrayList.addAll(this.fontRendererObj.m(string, 150));
                        }
                        this.drawHoveringText(arrayList, n2, n3);
                    } else {
                        this.drawCreativeTabHoveringText(String.valueOf((Object)an.dvX) + "Invalid statistic/achievement!", n2, n3);
                    }
                }
            }
            GlStateManager.JA();
        }
    }

    protected void setText(String string, boolean bl2) {
    }

    public boolean handleComponentClick(ba ba2) {
        if (ba2 != null) {
            net.minecraft.event.a a2 = ba2.arp().arB();
            if (GuiScreen.isShiftKeyDown()) {
                if (ba2.arp().arD() != null) {
                    this.setText(ba2.arp().arD(), false);
                }
            } else if (a2 != null) {
                block19: {
                    if (a2.acS() == net.minecraft.event.b.cKI) {
                        if (!GuiScreen.aER.aIY.cgB) {
                            return false;
                        }
                        try {
                            URI uRI = new URI(a2.SN());
                            String string = uRI.getScheme();
                            if (string == null) {
                                throw new URISyntaxException(a2.SN(), "Missing protocol");
                            }
                            if (!PROTOCOLS.contains(string.toLowerCase())) {
                                throw new URISyntaxException(a2.SN(), "Unsupported protocol: " + string.toLowerCase());
                            }
                            if (GuiScreen.aER.aIY.cgC) {
                                this.clickedLinkURI = uRI;
                                aER.a(new i((cv)this, a2.SN(), 31102009, false));
                                break block19;
                            }
                            this.openWebLink(uRI);
                        }
                        catch (URISyntaxException uRISyntaxException) {
                            LOGGER.error("Can't open url for " + String.valueOf(a2), (Throwable)uRISyntaxException);
                        }
                    } else if (a2.acS() == net.minecraft.event.b.cKJ) {
                        URI uRI = new File(a2.SN()).toURI();
                        this.openWebLink(uRI);
                    } else if (a2.acS() == net.minecraft.event.b.cKM) {
                        this.setText(a2.SN(), true);
                    } else if (a2.acS() == net.minecraft.event.b.cKK) {
                        this.sendChatMessage(a2.SN(), false);
                    } else {
                        LOGGER.error("Don't know how to handle " + String.valueOf(a2));
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void sendChatMessage(String string) {
        this.sendChatMessage(string, true);
    }

    public void sendChatMessage(String string, boolean bl2) {
        if (bl2) {
            GuiScreen.aER.bha.Ey().cO(string);
        }
        GuiScreen.aER.bgK.sendChatMessage(string);
    }

    protected void mouseClicked(int n2, int n3, int n4) {
        ds ds2 = new ds(n2, n3, n4);
        Client.a.e().d(ds2);
        if (n4 == 0) {
            for (int i2 = 0; i2 < this.buttonList.size(); ++i2) {
                c c2 = this.buttonList.get(i2);
                if (!c2.mousePressed(aER, n2, n3)) continue;
                this.selectedButton = c2;
                c2.playPressSound(aER.Bx());
                this.actionPerformed(c2);
            }
        }
    }

    protected void mouseReleased(int n2, int n3, int n4) {
        du du2 = new du();
        Client.a.e().d(du2);
        if (this.selectedButton != null && n4 == 0) {
            this.selectedButton.mouseReleased(n2, n3);
            this.selectedButton = null;
        }
    }

    protected void mouseClickMove(int n2, int n3, int n4, long l2) {
    }

    protected void actionPerformed(c c2) {
    }

    public void setWorldAndResolution(Minecraft minecraft, int n2, int n3) {
        this.itemRender = minecraft.BG();
        this.fontRendererObj = minecraft.fontRendererObj;
        this.width = n2;
        this.height = n3;
        this.buttonList.clear();
        this.initGui();
    }

    public void func_183500_a(int n2, int n3) {
        this.width = n2;
        this.height = n3;
    }

    public void initGui() {
    }

    public void handleInput() {
        if (Mouse.isCreated()) {
            while (Mouse.next()) {
                this.handleMouseInput();
            }
        }
        if (Keyboard.isCreated()) {
            while (Keyboard.next()) {
                this.handleKeyboardInput();
            }
        }
    }

    public void handleMouseInput() {
        int n2 = Mouse.getEventX() * this.width / GuiScreen.aER.bgz;
        int n3 = this.height - Mouse.getEventY() * this.height / GuiScreen.aER.bgA - 1;
        int n4 = Mouse.getEventButton();
        if (Mouse.getEventButtonState()) {
            if (GuiScreen.aER.aIY.cgO && this.touchValue++ > 0) {
                return;
            }
            this.eventButton = n4;
            this.lastMouseEvent = Minecraft.Bj();
            this.mouseClicked(n2, n3, this.eventButton);
        } else if (n4 != -1) {
            if (GuiScreen.aER.aIY.cgO && --this.touchValue > 0) {
                return;
            }
            this.eventButton = -1;
            this.mouseReleased(n2, n3, n4);
        } else if (this.eventButton != -1 && this.lastMouseEvent > 0L) {
            long l2 = Minecraft.Bj() - this.lastMouseEvent;
            this.mouseClickMove(n2, n3, this.eventButton, l2);
        }
    }

    public void handleKeyboardInput() {
        if (Keyboard.getEventKeyState()) {
            if (Keyboard.getEventKey() == 25 && GuiScreen.isCtrlKeyDown() && GuiScreen.isShiftKeyDown()) {
                if (!Keyboard.isRepeatEvent()) {
                    boolean bl2 = aha.uQ();
                    if (aER != null) {
                        if (GuiScreen.aER.bgF != null) {
                            if (GuiScreen.aER.bgK != null) {
                                cg.a(ahg.cf("module.render.chat.pinyin_ime"), ahg.cf(bl2 ? "ui.chat.pinyin_ime.hint.on" : "ui.chat.pinyin_ime.hint.off"), 1500);
                            }
                        }
                    }
                }
                return;
            }
            this.keyTyped(Keyboard.getEventCharacter(), Keyboard.getEventKey());
            Client.a.e().d(new dt(Keyboard.getEventKey(), Keyboard.getEventCharacter(), this));
        }
        aER.Bz();
    }

    public void updateScreen() {
    }

    public void onGuiClosed() {
    }

    public void drawDefaultBackground() {
        this.drawWorldBackground(0);
    }

    public void drawWorldBackground(int n2) {
        if (GuiScreen.aER.bgF != null) {
            this.drawGradientRect(0, 0, this.width, this.height, -1072689136, -804253680);
        } else {
            this.drawBackground(n2);
        }
    }

    public void drawBackground(int n2) {
        GlStateManager.JA();
        GlStateManager.JG();
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        aER.Bq().a(optionsBackground);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        worldRenderer.F(0.0, this.height, 0.0).r(0.0, (float)this.height / 32.0f + (float)n2).s(64, 64, 64, 255).Lx();
        worldRenderer.F(this.width, this.height, 0.0).r((float)this.width / 32.0f, (float)this.height / 32.0f + (float)n2).s(64, 64, 64, 255).Lx();
        worldRenderer.F(this.width, 0.0, 0.0).r((float)this.width / 32.0f, n2).s(64, 64, 64, 255).Lx();
        worldRenderer.F(0.0, 0.0, 0.0).r(0.0, n2).s(64, 64, 64, 255).Lx();
        tessellator.pZ();
    }

    public boolean doesGuiPauseGame() {
        return true;
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        if (n2 == 31102009) {
            if (bl2) {
                this.openWebLink(this.clickedLinkURI);
            }
            this.clickedLinkURI = null;
            aER.a(this);
        }
    }

    private void openWebLink(URI uRI) {
        try {
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod("browse", URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            LOGGER.error("Couldn't open link", throwable);
        }
    }

    public static boolean isCtrlKeyDown() {
        return Minecraft.bgl ? Keyboard.isKeyDown((int)219) || Keyboard.isKeyDown((int)220) : Keyboard.isKeyDown((int)29) || Keyboard.isKeyDown((int)157);
    }

    public static boolean isShiftKeyDown() {
        return Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54);
    }

    public static boolean isAltKeyDown() {
        return Keyboard.isKeyDown((int)56) || Keyboard.isKeyDown((int)184);
    }

    public static boolean isKeyComboCtrlX(int n2) {
        return n2 == 45 && GuiScreen.isCtrlKeyDown() && !GuiScreen.isShiftKeyDown() && !GuiScreen.isAltKeyDown();
    }

    public static boolean isKeyComboCtrlV(int n2) {
        return n2 == 47 && GuiScreen.isCtrlKeyDown() && !GuiScreen.isShiftKeyDown() && !GuiScreen.isAltKeyDown();
    }

    public static boolean isKeyComboCtrlC(int n2) {
        return n2 == 46 && GuiScreen.isCtrlKeyDown() && !GuiScreen.isShiftKeyDown() && !GuiScreen.isAltKeyDown();
    }

    public static boolean isKeyComboCtrlA(int n2) {
        return n2 == 30 && GuiScreen.isCtrlKeyDown() && !GuiScreen.isShiftKeyDown() && !GuiScreen.isAltKeyDown();
    }

    public void onResize(Minecraft minecraft, int n2, int n3) {
        this.setWorldAndResolution(minecraft, n2, n3);
    }
}

