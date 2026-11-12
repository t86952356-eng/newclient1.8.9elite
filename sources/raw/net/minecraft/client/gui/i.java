/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cu;
import net.minecraft.client.gui.cv;
import net.minecraft.client.resources.I18n;

public class i
extends cu {
    private final String bli;
    private final String blj;
    private final String blk;
    private boolean bll = true;

    public i(cv cv2, String string, int n2, boolean bl2) {
        super(cv2, I18n.a(bl2 ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), string, n2);
        this.btR = I18n.a(bl2 ? "chat.link.open" : "gui.yes", new Object[0]);
        this.btS = I18n.a(bl2 ? "gui.cancel" : "gui.no", new Object[0]);
        this.blj = I18n.a("chat.copy", new Object[0]);
        this.bli = I18n.a("chat.link.warning", new Object[0]);
        this.blk = string;
    }

    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.clear();
        this.buttonList.add(new c(0, this.width / 2 - 50 - 105, this.height / 6 + 96, 100, 20, this.btR));
        this.buttonList.add(new c(2, this.width / 2 - 50, this.height / 6 + 96, 100, 20, this.blj));
        this.buttonList.add(new c(1, this.width / 2 - 50 + 105, this.height / 6 + 96, 100, 20, this.btS));
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 2) {
            this.DZ();
        }
        this.btN.confirmClicked(c2.id == 0, this.btT);
    }

    public void DZ() {
        i.setClipboardString(this.blk);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        super.drawScreen(n2, n3, f2);
        if (this.bll) {
            this.drawCenteredString(this.fontRendererObj, this.bli, this.width / 2, 110, 0xFFCCCC);
        }
    }

    public void Ea() {
        this.bll = false;
    }
}

