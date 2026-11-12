/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.gui;

import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import hackclient.rise.agg;
import hackclient.rise.bf;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.bj;
import net.minecraft.client.gui.z;
import net.minecraft.client.network.h;
import net.minecraft.client.network.o;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.f;
import net.minecraft.scoreboard.c;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.world.ao;

public class bi
extends b {
    public static final Ordering<o> bqO = Ordering.from((Comparator)new bj());
    private final Minecraft bqP;
    private final z bqQ;
    private ba bqR;
    private ba bqS;
    private long bqT;
    private boolean bqU;

    public bi(Minecraft minecraft, z z2) {
        this.bqP = minecraft;
        this.bqQ = z2;
    }

    public String a(o o2) {
        String string = o2.xW() != null ? o2.xW().getFormattedText() : net.minecraft.scoreboard.h.a(o2.Ii(), o2.Ie().getName());
        return bf.c(string, o2.Ie().getName());
    }

    public void ad(boolean bl2) {
        if (bl2 && !this.bqU) {
            this.bqT = Minecraft.Bj();
        }
        this.bqU = bl2;
    }

    public void a(int n2, i i2, g g2) {
        int n3;
        boolean bl2;
        int n4;
        int n5;
        h h2 = this.bqP.bgK.bkd;
        List list = bqO.sortedCopy(h2.Id());
        int n6 = 0;
        int n7 = 0;
        for (o o2 : list) {
            n5 = this.bqP.fontRendererObj.bQ(this.a(o2));
            n6 = Math.max(n6, n5);
            if (g2 == null || g2.aki() == c.djz) continue;
            n5 = this.bqP.fontRendererObj.bQ(" " + i2.b(o2.Ie().getName(), g2).akm());
            n7 = Math.max(n7, n5);
        }
        list = list.subList(0, Math.min(list.size(), 80));
        int n8 = n4 = list.size();
        n5 = 1;
        while (n8 > 20) {
            n8 = (n4 + ++n5 - 1) / n5;
        }
        boolean bl3 = bl2 = this.bqP.Bf() || this.bqP.AU().dr().afd();
        int n9 = g2 != null ? (g2.aki() == c.djz ? 90 : n7) : 0;
        int n10 = Math.min(n5 * ((bl2 ? 9 : 0) + n6 + n9 + 13), n2 - 50) / n5;
        int n11 = n2 / 2 - (n10 * n5 + (n5 - 1) * 5) / 2;
        int n12 = 10;
        int n13 = n10 * n5 + (n5 - 1) * 5;
        List<String> list2 = null;
        List<String> list3 = null;
        if (this.bqS != null) {
            list2 = this.bqP.fontRendererObj.m(this.bqS.getFormattedText(), n2 - 50);
            for (String string : list2) {
                n13 = Math.max(n13, this.bqP.fontRendererObj.bQ(string));
            }
        }
        if (this.bqR != null) {
            list3 = this.bqP.fontRendererObj.m(this.bqR.getFormattedText(), n2 - 50);
            for (String string : list3) {
                n13 = Math.max(n13, this.bqP.fontRendererObj.bQ(string));
            }
        }
        if (list2 != null) {
            agg cfr_ignored_0 = this.bqP.fontRendererObj;
            bi.drawRect(n2 / 2 - n13 / 2 - 1, n12 - 1, n2 / 2 + n13 / 2 + 1, n12 + list2.size() * agg.aIF, Integer.MIN_VALUE);
            for (String string : list2) {
                n3 = this.bqP.fontRendererObj.bQ(string);
                this.bqP.fontRendererObj.b(string, n2 / 2 - n3 / 2, n12, -1);
                agg cfr_ignored_1 = this.bqP.fontRendererObj;
                n12 += agg.aIF;
            }
            ++n12;
        }
        bi.drawRect(n2 / 2 - n13 / 2 - 1, n12 - 1, n2 / 2 + n13 / 2 + 1, n12 + n8 * 9, Integer.MIN_VALUE);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n14 = i3 / n8;
            n3 = i3 % n8;
            int n15 = n11 + n14 * n10 + n14 * 5;
            int n16 = n12 + n3 * 9;
            bi.drawRect(n15, n16, n15 + n10, n16 + 8, 0x20FFFFFF);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.tL();
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            if (i3 < list.size()) {
                int n17;
                int n18;
                o o3 = (o)list.get(i3);
                Object object = this.a(o3);
                GameProfile gameProfile = o3.Ie();
                if (bl2) {
                    a a2 = this.bqP.bgF.n(gameProfile.getId());
                    n18 = a2 != null && a2.c(f.cJq) && (gameProfile.getName().equals("Dinnerbone") || gameProfile.getName().equals("Grumm")) ? 1 : 0;
                    this.bqP.Bq().a(o3.Dd());
                    int n19 = 8 + (n18 != 0 ? 8 : 0);
                    int n20 = 8 * (n18 != 0 ? -1 : 1);
                    b.drawScaledCustomSizeModalRect(n15, n16, 8.0f, n19, 8.0f, n20, 8.0, 8.0, 64.0f, 64.0f);
                    if (a2 != null && a2.c(f.cJw)) {
                        int n21 = 8 + (n18 != 0 ? 8 : 0);
                        int n22 = 8 * (n18 != 0 ? -1 : 1);
                        b.drawScaledCustomSizeModalRect(n15, n16, 40.0f, n21, 8.0f, n22, 8.0, 8.0, 64.0f, 64.0f);
                    }
                    n15 += 9;
                }
                if (o3.If() == ao.dEA) {
                    object = String.valueOf((Object)an.dwg) + (String)object;
                    this.bqP.fontRendererObj.b((String)object, n15, (float)n16 + 1.0f, -1862270977);
                } else {
                    this.bqP.fontRendererObj.b((String)object, n15, (float)n16 + 1.0f, -1);
                }
                if (g2 != null && o3.If() != ao.dEA && (n18 = (n17 = n15 + n6 + 1) + n9) - n17 > 5) {
                    this.a(g2, n16, gameProfile.getName(), n17, n18, o3);
                }
                this.a(n10, n15 - (bl2 ? 9 : 0), n16, o3);
            }
            bf.aZ();
        }
        if (list3 != null) {
            n12 = n12 + n8 * 9 + 1;
            agg cfr_ignored_2 = this.bqP.fontRendererObj;
            bi.drawRect(n2 / 2 - n13 / 2 - 1, n12 - 1, n2 / 2 + n13 / 2 + 1, n12 + list3.size() * agg.aIF, Integer.MIN_VALUE);
            for (String string : list3) {
                n3 = this.bqP.fontRendererObj.bQ(string);
                this.bqP.fontRendererObj.b(string, n2 / 2 - n3 / 2, n12, -1);
                agg cfr_ignored_3 = this.bqP.fontRendererObj;
                n12 += agg.aIF;
            }
        }
    }

    protected void a(int n2, int n3, int n4, o o2) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        this.bqP.Bq().a(icons);
        boolean bl2 = false;
        int n5 = 0;
        n5 = o2.Ig() < 0 ? 5 : (o2.Ig() < 150 ? 0 : (o2.Ig() < 300 ? 1 : (o2.Ig() < 600 ? 2 : (o2.Ig() < 1000 ? 3 : 4))));
        zLevel += 100.0f;
        this.drawTexturedModalRect((float)(n3 + n2 - 11), n4, 0, 176 + n5 * 8, 10, 8);
        zLevel -= 100.0f;
    }

    private void a(g g2, int n2, String string, int n3, int n4, o o2) {
        int n5 = g2.SD().b(string, g2).akm();
        if (g2.aki() == c.djz) {
            boolean bl2;
            this.bqP.Bq().a(icons);
            if (this.bqT == o2.Io()) {
                if (n5 < o2.Ik()) {
                    o2.p(Minecraft.Bj());
                    o2.q(this.bqQ.Ez() + 20);
                } else if (n5 > o2.Ik()) {
                    o2.p(Minecraft.Bj());
                    o2.q(this.bqQ.Ez() + 10);
                }
            }
            if (Minecraft.Bj() - o2.Im() > 1000L || this.bqT != o2.Io()) {
                o2.cq(n5);
                o2.cr(n5);
                o2.p(Minecraft.Bj());
            }
            o2.r(this.bqT);
            o2.cq(n5);
            int n6 = bt.bM((float)Math.max(n5, o2.Il()) / 2.0f);
            int n7 = Math.max(bt.bM(n5 / 2), Math.max(bt.bM(o2.Il() / 2), 10));
            boolean bl3 = bl2 = o2.In() > (long)this.bqQ.Ez() && (o2.In() - (long)this.bqQ.Ez()) / 3L % 2L == 1L;
            if (n6 > 0) {
                float f2 = Math.min((float)(n4 - n3 - 4) / (float)n7, 9.0f);
                if (f2 > 3.0f) {
                    int n8;
                    for (n8 = n6; n8 < n7; ++n8) {
                        this.drawTexturedModalRect((float)n3 + (float)n8 * f2, (float)n2, bl2 ? 25 : 16, 0, 9, 9);
                    }
                    for (n8 = 0; n8 < n6; ++n8) {
                        this.drawTexturedModalRect((float)n3 + (float)n8 * f2, (float)n2, bl2 ? 25 : 16, 0, 9, 9);
                        if (bl2) {
                            if (n8 * 2 + 1 < o2.Il()) {
                                this.drawTexturedModalRect((float)n3 + (float)n8 * f2, (float)n2, 70, 0, 9, 9);
                            }
                            if (n8 * 2 + 1 == o2.Il()) {
                                this.drawTexturedModalRect((float)n3 + (float)n8 * f2, (float)n2, 79, 0, 9, 9);
                            }
                        }
                        if (n8 * 2 + 1 < n5) {
                            this.drawTexturedModalRect((float)n3 + (float)n8 * f2, (float)n2, n8 >= 10 ? 160 : 52, 0, 9, 9);
                        }
                        if (n8 * 2 + 1 != n5) continue;
                        this.drawTexturedModalRect((float)n3 + (float)n8 * f2, (float)n2, n8 >= 10 ? 169 : 61, 0, 9, 9);
                    }
                } else {
                    float f3 = bt.I((float)n5 / 20.0f, 0.0f, 1.0f);
                    int n9 = (int)((1.0f - f3) * 255.0f) << 16 | (int)(f3 * 255.0f) << 8;
                    String string2 = "" + (float)n5 / 2.0f;
                    if (n4 - this.bqP.fontRendererObj.bQ(string2 + "hp") >= n3) {
                        string2 = string2 + "hp";
                    }
                    this.bqP.fontRendererObj.b(string2, (n4 + n3) / 2 - this.bqP.fontRendererObj.bQ(string2) / 2, n2, n9);
                }
            }
        } else {
            String string3 = String.valueOf((Object)an.dvZ) + n5;
            this.bqP.fontRendererObj.b(string3, n4 - this.bqP.fontRendererObj.bQ(string3), n2, 0xFFFFFF);
        }
    }

    public void d(ba ba2) {
        this.bqR = ba2;
    }

    public void e(ba ba2) {
        this.bqS = ba2;
    }

    public void Fy() {
        this.bqS = null;
        this.bqR = null;
    }
}

