/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.agg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.aj;
import net.minecraft.client.resources.I18n;

public class dc
implements aj {
    private final Minecraft bus = Minecraft.getMinecraft();

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        agg cfr_ignored_0 = this.bus.fontRendererObj;
        int n9 = n4 + n6 / 2 - agg.aIF / 2;
        this.bus.fontRendererObj.a(I18n.a("lanServer.scanning", new Object[0]), (double)(this.bus.bgR.width / 2 - this.bus.fontRendererObj.bQ(I18n.a("lanServer.scanning", new Object[0])) / 2), (double)n9, 0xFFFFFF);
        String string = switch ((int)(Minecraft.Bj() / 300L % 4L)) {
            default -> "O o o";
            case 1, 3 -> "o O o";
            case 2 -> "o o O";
        };
        agg cfr_ignored_1 = this.bus.fontRendererObj;
        this.bus.fontRendererObj.a(string, (double)(this.bus.bgR.width / 2 - this.bus.fontRendererObj.bQ(string) / 2), (double)(n9 + agg.aIF), 0x808080);
    }

    @Override
    public void o(int n2, int n3, int n4) {
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }
}

