/*
 * Decompiled with CFR 0.152.
 */
package de.florianmichael.viamcp.gui;

import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.viamcp.gui.GuiProtocolSelector$SlotList;
import de.florianmichael.viamcp.protocolinfo.ProtocolInfo;
import hackclient.rise.agg;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.an;

public class GuiProtocolSelector
extends GuiScreen {
    private final GuiScreen parent;
    public GuiProtocolSelector$SlotList list;

    public GuiProtocolSelector(GuiScreen guiScreen) {
        this.parent = guiScreen;
    }

    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.add(new c(1, this.width / 2 - 100, this.height - 25, 200, 20, "Back"));
        this.list = new GuiProtocolSelector$SlotList(this, aER, this.width, this.height, 32, this.height - 32);
    }

    @Override
    protected void actionPerformed(c c2) {
        this.list.actionPerformed(c2);
        if (c2.id == 1) {
            aER.a(this.parent);
        }
    }

    @Override
    public void handleMouseInput() {
        this.list.handleMouseInput();
        super.handleMouseInput();
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.list.drawScreen(n2, n3, f2);
        GlStateManager.JV();
        GlStateManager.B(2.0, 2.0, 2.0);
        String string = String.valueOf((Object)an.dwd) + "ViaMCP";
        this.drawString(this.fontRendererObj, string, (this.width - 4) / 4, 5, -1);
        GlStateManager.JW();
        this.drawString(this.fontRendererObj, "by EnZaXD/Flori2007", 1, 1, -1);
        this.drawString(this.fontRendererObj, "Discord: EnZaXD#6257", 1, 11, -1);
        ProtocolInfo protocolInfo = ProtocolInfo.fromProtocolVersion(ViaLoadingBase.getInstance().getTargetVersion());
        String string2 = "Version: " + ViaLoadingBase.getInstance().getTargetVersion().getName() + (String)(protocolInfo != null ? " - " + protocolInfo.getName() : "");
        String string3 = protocolInfo != null ? "Released: " + protocolInfo.getReleaseDate() : "";
        int n4 = (5 + agg.aIF) * 2 + 2;
        this.drawString(this.fontRendererObj, String.valueOf((Object)an.dvS) + String.valueOf((Object)an.dwd) + "Version Information", (this.width - 4) / 2, n4, -1);
        this.drawString(this.fontRendererObj, string2, 4, n4 + agg.aIF, -1);
        this.drawString(this.fontRendererObj, string3, 4, n4 + agg.aIF * 2, -1);
        super.drawScreen(n2, n3, f2);
    }
}

