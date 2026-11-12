/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  lombok.Generated
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.a;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cr;
import net.minecraft.client.gui.cz;
import net.minecraft.client.gui.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.c;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.s;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rise.Client;
import rise.module.impl.render.UnlimitedChat;

public class ar
extends b {
    private static final Logger bpV = LogManager.getLogger();
    protected final Minecraft bpW;
    private final List<String> bpX = Lists.newArrayList();
    public final List<a> bpY = Lists.newArrayList();
    public final List<a> bpZ = Lists.newArrayList();
    public int bqa;
    public boolean bqb;

    public ar(Minecraft minecraft) {
        this.bpW = minecraft;
    }

    public void bD(int n2) {
        if (this.bpW.aIY.cgz != c.cIJ) {
            int n3 = this.nd();
            boolean bl2 = false;
            int n4 = 0;
            int n5 = this.bpZ.size();
            float f2 = this.bpW.aIY.cgD * 0.9f + 0.1f;
            if (n5 > 0) {
                int n6;
                int n7;
                int n8;
                if (this.EV()) {
                    bl2 = true;
                }
                float f3 = this.EY();
                int n9 = bt.bM((float)this.EW() / f3);
                GlStateManager.JV();
                GlStateManager.j(2.0f, 20.0f, 0.0f);
                GlStateManager.i(f3, f3, 1.0f);
                for (n8 = 0; n8 + this.bqa < this.bpZ.size() && n8 < n3; ++n8) {
                    a a2 = this.bpZ.get(n8 + this.bqa);
                    if (a2 == null || (n7 = n2 - a2.DN()) >= 200 && !bl2) continue;
                    double d2 = (double)n7 / 200.0;
                    d2 = 1.0 - d2;
                    d2 *= 10.0;
                    d2 = bt.ah(d2, 0.0, 1.0);
                    d2 *= d2;
                    n6 = (int)(255.0 * d2);
                    if (bl2) {
                        n6 = 255;
                    }
                    n6 = (int)((float)n6 * f2);
                    ++n4;
                    if (n6 <= 3) continue;
                    int n10 = -n8 * 9;
                    ar.drawRect(0, n10 - 9, n9 + 4, n10, 0x7F000000);
                }
                if (bl2) {
                    agg cfr_ignored_0 = this.bpW.fontRendererObj;
                    n8 = agg.aIF;
                    GlStateManager.j(-3.0f, 0.0f, 0.0f);
                    int n11 = n5 * n8 + n5;
                    n7 = n4 * n8 + n4;
                    int n12 = this.bqa * n7 / n5;
                    int n13 = n7 * n7 / n11;
                    if (n11 != n7) {
                        n6 = this.bqb ? 0xCC3333 : 0x3333AA;
                        ar.drawRect(0, -n12, 2, -n12 - n13, n6);
                        ar.drawRect(2, -n12, 1, -n12 - n13, 0xCCCCCC);
                    }
                }
                GlStateManager.JW();
            }
        }
    }

    public void bE(int n2) {
        if (this.bpW.aIY.cgz != c.cIJ) {
            int n3 = this.nd();
            boolean bl2 = false;
            int n4 = this.bpZ.size();
            float f2 = this.bpW.aIY.cgD * 0.9f + 0.1f;
            if (n4 > 0) {
                if (this.EV()) {
                    bl2 = true;
                }
                float f3 = this.EY();
                GlStateManager.JV();
                GlStateManager.j(2.0f, 20.0f, 0.0f);
                GlStateManager.i(f3, f3, 1.0f);
                for (int i2 = 0; i2 + this.bqa < this.bpZ.size() && i2 < n3; ++i2) {
                    int n5;
                    a a2 = this.bpZ.get(i2 + this.bqa);
                    if (a2 == null || (n5 = n2 - a2.DN()) >= 200 && !bl2) continue;
                    double d2 = (double)n5 / 200.0;
                    d2 = 1.0 - d2;
                    d2 *= 10.0;
                    d2 = bt.ah(d2, 0.0, 1.0);
                    d2 *= d2;
                    int n6 = (int)(255.0 * d2);
                    if (bl2) {
                        n6 = 255;
                    }
                    if ((n6 = (int)((float)n6 * f2)) <= 4) continue;
                    int n7 = -i2 * 9;
                    String string = a2.DM().getFormattedText();
                    GlStateManager.tQ();
                    this.bpW.fontRendererObj.b(string, 0.0, n7 - 7, 0xFFFFFF);
                    GlStateManager.Jy();
                }
                GlStateManager.JW();
            }
        }
    }

    public void ER() {
        this.bpZ.clear();
        this.bpY.clear();
        this.bpX.clear();
    }

    public void c(ba ba2) {
        this.a(ba2, 0);
    }

    public void a(ba ba2, int n2) {
        this.a(ba2, n2, this.bpW.bha.Ez(), false);
        bpV.info("[CHAT] " + ba2.arq());
    }

    public void a(ba ba2, int n2, int n3, boolean bl2) {
        int n4;
        if (n2 != 0) {
            this.bF(n2);
        }
        int n5 = bt.bL((float)this.EW() / this.EY());
        List<ba> list = cr.a(ba2, n5, this.bpW.fontRendererObj, false, false);
        boolean bl3 = this.EV();
        for (ba ba3 : list) {
            if (bl3 && this.bqa > 0) {
                this.bqb = true;
                this.scroll(1);
            }
            this.bpZ.add(0, new a(n3, ba3, n2));
        }
        UnlimitedChat unlimitedChat = Client.a.g().c(UnlimitedChat.class);
        int n6 = n4 = unlimitedChat == null || !unlimitedChat.isEnabled() ? 200 : 10000;
        while (this.bpZ.size() > n4) {
            this.bpZ.remove(this.bpZ.size() - 1);
        }
        if (!bl2) {
            this.bpY.add(0, new a(n3, ba2, n2));
            while (this.bpY.size() > n4) {
                this.bpY.remove(this.bpY.size() - 1);
            }
        }
    }

    public void ES() {
        this.bpZ.clear();
        this.EU();
        for (int i2 = this.bpY.size() - 1; i2 >= 0; --i2) {
            a a2 = this.bpY.get(i2);
            this.a(a2.DM(), a2.DO(), a2.DN(), true);
        }
    }

    public List<String> ET() {
        return this.bpX;
    }

    public void cO(String string) {
        if (this.bpX.isEmpty() || !this.bpX.get(this.bpX.size() - 1).equals(string)) {
            this.bpX.add(string);
        }
    }

    public void EU() {
        this.bqa = 0;
        this.bqb = false;
    }

    public void scroll(int n2) {
        this.bqa += n2;
        int n3 = this.bpZ.size();
        if (this.bqa > n3 - this.nd()) {
            this.bqa = n3 - this.nd();
        }
        if (this.bqa <= 0) {
            this.bqa = 0;
            this.bqb = false;
        }
    }

    public ba w(int n2, int n3) {
        if (!this.EV()) {
            return null;
        }
        cz cz2 = new cz(this.bpW);
        int n4 = cz2.getScaleFactor();
        float f2 = this.EY();
        int n5 = n2 / n4 - 3;
        int n6 = n3 / n4 - 27;
        n5 = bt.bL((float)n5 / f2);
        n6 = bt.bL((float)n6 / f2);
        if (n5 >= 0 && n6 >= 0) {
            int n7 = Math.min(this.nd(), this.bpZ.size());
            if (n5 <= bt.bL((float)this.EW() / this.EY())) {
                agg cfr_ignored_0 = this.bpW.fontRendererObj;
                if (n6 < agg.aIF * n7 + n7) {
                    agg cfr_ignored_1 = this.bpW.fontRendererObj;
                    int n8 = n6 / agg.aIF + this.bqa;
                    if (n8 >= 0 && n8 < this.bpZ.size()) {
                        a a2 = this.bpZ.get(n8);
                        int n9 = 0;
                        for (ba ba2 : a2.DM()) {
                            if (!(ba2 instanceof s) || (n9 += this.bpW.fontRendererObj.bQ(cr.h(((s)ba2).arr(), false))) <= n5) continue;
                            return ba2;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public boolean EV() {
        return this.bpW.bgR instanceof f;
    }

    public void bF(int n2) {
        a a2;
        Iterator<a> iterator = this.bpZ.iterator();
        while (iterator.hasNext()) {
            a2 = iterator.next();
            if (a2.DO() != n2) continue;
            iterator.remove();
        }
        iterator = this.bpY.iterator();
        while (iterator.hasNext()) {
            a2 = iterator.next();
            if (a2.DO() != n2) continue;
            iterator.remove();
            break;
        }
    }

    public int EW() {
        return ar.T(this.bpW.aIY.cgT);
    }

    public int EX() {
        return ar.U(this.EV() ? this.bpW.aIY.cgV : this.bpW.aIY.cgU);
    }

    public float EY() {
        return this.bpW.aIY.cgS;
    }

    public static int T(float f2) {
        int n2 = 320;
        int n3 = 40;
        return bt.bL(f2 * 280.0f + 40.0f);
    }

    public static int U(float f2) {
        int n2 = 180;
        int n3 = 20;
        return bt.bL(f2 * 160.0f + 20.0f);
    }

    public int nd() {
        return this.EX() / 9;
    }

    @Generated
    public List<a> EZ() {
        return this.bpY;
    }
}

