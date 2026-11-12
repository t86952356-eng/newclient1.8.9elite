/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.aq;
import net.minecraft.client.network.b;
import net.minecraft.client.resources.I18n;

public class db
implements aj {
    private final aq buo;
    protected final d bup;
    protected final b buq;
    private long bur = 0L;

    protected db(aq aq2, b b2) {
        this.buo = aq2;
        this.buq = b2;
        this.bup = d.AZ();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        this.bup.fontRendererObj.a(I18n.a("lanServer.title", new Object[0]), (double)(n3 + 32 + 3), (double)(n4 + 1), 0xFFFFFF);
        this.bup.fontRendererObj.a(this.buq.HW(), (double)(n3 + 32 + 3), (double)(n4 + 12), 0x808080);
        if (this.bup.aIY.cgK) {
            this.bup.fontRendererObj.a(I18n.a("selectServer.hiddenAddress", new Object[0]), (double)(n3 + 32 + 3), (double)(n4 + 12 + 11), 0x303030);
        } else {
            this.bup.fontRendererObj.a(this.buq.HX(), (double)(n3 + 32 + 3), (double)(n4 + 12 + 11), 0x303030);
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.buo.bC(n2);
        if (d.Bj() - this.bur < 250L) {
            this.buo.EO();
        }
        this.bur = d.Bj();
        return false;
    }

    @Override
    public void o(int n2, int n3, int n4) {
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public b Gs() {
        return this.buq;
    }
}

