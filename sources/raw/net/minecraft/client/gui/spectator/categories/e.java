/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui.spectator.categories;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.List;
import java.util.Random;
import net.minecraft.client.entity.a;
import net.minecraft.client.gui.spectator.b;
import net.minecraft.client.gui.spectator.categories.d;
import net.minecraft.client.gui.spectator.f;
import net.minecraft.client.network.o;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.scoreboard.h;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.util.s;

class e
implements b {
    private final h bxH;
    private final cm bxI;
    private final List<o> bxJ;

    public e(d d2, h h2) {
        this.bxH = h2;
        this.bxJ = Lists.newArrayList();
        for (String string : h2.akr()) {
            o o2 = net.minecraft.client.d.AZ().AU().df(string);
            if (o2 == null) continue;
            this.bxJ.add(o2);
        }
        if (!this.bxJ.isEmpty()) {
            String string = this.bxJ.get(new Random().nextInt(this.bxJ.size())).Ie().getName();
            this.bxI = a.cE(string);
            a.a(this.bxI, string);
        } else {
            this.bxI = DefaultPlayerSkin.Pg();
        }
    }

    @Override
    public void b(f f2) {
        f2.a(new net.minecraft.client.gui.spectator.categories.b(this.bxJ));
    }

    @Override
    public ba GP() {
        return new s(this.bxH.ahW());
    }

    @Override
    public void a(float f2, int n2) {
        int n3 = -1;
        String string = agg.bT(this.bxH.aks());
        if (string.length() >= 2) {
            n3 = net.minecraft.client.d.AZ().fontRendererObj.f(string.charAt(1));
        }
        if (n3 >= 0) {
            float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f;
            float f4 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            float f5 = (float)(n3 & 0xFF) / 255.0f;
            net.minecraft.client.gui.b.drawRect(1, 1, 15, 15, bt.J(f3 * f2, f4 * f2, f5 * f2) | n2 << 24);
        }
        net.minecraft.client.d.AZ().Bq().a(this.bxI);
        GlStateManager.e(f2, f2, f2, (float)n2 / 255.0f);
        net.minecraft.client.gui.b.drawScaledCustomSizeModalRect(2.0, 2.0, 8.0f, 8.0f, 8.0f, 8.0f, 12.0, 12.0, 64.0f, 64.0f);
        net.minecraft.client.gui.b.drawScaledCustomSizeModalRect(2.0, 2.0, 40.0f, 8.0f, 8.0f, 8.0f, 12.0, 12.0, 64.0f, 64.0f);
    }

    @Override
    public boolean GQ() {
        return !this.bxJ.isEmpty();
    }
}

