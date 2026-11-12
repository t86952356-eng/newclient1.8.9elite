/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package de.florianmichael.viamcp.gui;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.viamcp.gui.GuiProtocolSelector;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.cl;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.an;

class GuiProtocolSelector$SlotList
extends cl {
    final /* synthetic */ GuiProtocolSelector this$0;

    public GuiProtocolSelector$SlotList(GuiProtocolSelector guiProtocolSelector, Minecraft minecraft, int n2, int n3, int n4, int n5) {
        this.this$0 = guiProtocolSelector;
        super(minecraft, n2, n3, n4 + 30, n5, 18);
    }

    @Override
    protected int getSize() {
        return ViaLoadingBase.getProtocols().size();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        ProtocolVersion protocolVersion = ViaLoadingBase.getProtocols().get(n2);
        ViaLoadingBase.getInstance().reload(protocolVersion);
    }

    @Override
    protected boolean isSelected(int n2) {
        return false;
    }

    @Override
    protected void drawBackground() {
        this.this$0.drawDefaultBackground();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.this$0.drawCenteredString(this.mc.fontRendererObj, (String)(ViaLoadingBase.PROTOCOLS.indexOf(ViaLoadingBase.getInstance().getTargetVersion()) == n2 ? an.dvV.toString() + String.valueOf((Object)an.dwd) : an.dvS.toString()) + ViaLoadingBase.getProtocols().get(n2).getName(), this.width / 2, n4 + 2, -1);
        GlStateManager.JV();
        GlStateManager.B(0.5, 0.5, 0.5);
        this.this$0.drawCenteredString(this.mc.fontRendererObj, "PVN: " + ViaLoadingBase.getProtocols().get(n2).getVersion(), this.width, (n4 + 2) * 2 + 20, -1);
        GlStateManager.JW();
    }
}

