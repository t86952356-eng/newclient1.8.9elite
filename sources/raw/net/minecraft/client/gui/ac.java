/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.agg;
import net.minecraft.client.gui.ab;
import net.minecraft.client.gui.aj;
import net.minecraft.client.resources.I18n;

public class ac
implements aj {
    private final String bob;
    private final int boc;
    final /* synthetic */ ab bod;

    public ac(ab ab2, String string) {
        this.bod = ab2;
        this.bob = I18n.a(string, new Object[0]);
        this.boc = ab2.bnY.fontRendererObj.bQ(this.bob);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        agg cfr_ignored_0 = this.bod.bnY.fontRendererObj;
        this.bod.bnY.fontRendererObj.a(this.bob, (double)(this.bod.bnY.bgR.width / 2 - this.boc / 2), (double)(n4 + n6 - agg.aIF - 1), 0xFFFFFF);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void o(int n2, int n3, int n4) {
    }
}

