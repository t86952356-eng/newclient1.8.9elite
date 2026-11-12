/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.gui.inventory;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.achievement.b;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.gui.inventory.a;
import net.minecraft.client.gui.inventory.k;
import net.minecraft.client.gui.inventory.l;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.g;
import net.minecraft.init.Items;
import net.minecraft.inventory.ad;
import net.minecraft.inventory.ak;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.an;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class j
extends InventoryEffectRenderer {
    private static final cm bwH = new cm("textures/gui/container/creative_inventory/tabs.png");
    private static final ad bwI = new ad("tmp", true, 45);
    private static int bwJ = net.minecraft.creativetab.a.cpx.SO();
    private float bwK;
    private boolean bwL;
    private boolean bwM;
    private cq bwN;
    private List<ak> bwO;
    private ak bwP;
    private boolean bwQ;
    private a bwR;

    public j(net.minecraft.entity.player.a a2) {
        super(new k(a2));
        a2.cHY = this.bwi;
        this.allowUserInput = true;
        this.bwh = 136;
        this.bwg = 195;
    }

    @Override
    public void updateScreen() {
        if (!j.aER.bgu.Hx()) {
            aER.a(new q(j.aER.bgK));
        }
        this.GE();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void a(ak ak2, int n2, int n3, int n4) {
        this.bwQ = true;
        boolean bl2 = n4 == 1;
        int n5 = n4 = n2 == -999 && n4 == 0 ? 4 : n4;
        if (ak2 == null && bwJ != net.minecraft.creativetab.a.cpI.SO() && n4 != 5) {
            g g2 = j.aER.bgK.cHV;
            if (g2.bO() == null) return;
            if (n3 == 0) {
                j.aER.bgK.d(g2.bO(), true);
                j.aER.bgu.K(g2.bO());
                g2.e((co)null);
            }
            if (n3 != 1) return;
            co co2 = g2.bO().ge(1);
            j.aER.bgK.d(co2, true);
            j.aER.bgu.K(co2);
            if (g2.bO().cWZ != 0) return;
            g2.e((co)null);
            return;
        }
        if (ak2 == this.bwP && bl2) {
            int n6 = 0;
            while (n6 < j.aER.bgK.cHX.adb().size()) {
                j.aER.bgu.a(null, n6);
                ++n6;
            }
            return;
        }
        if (bwJ == net.minecraft.creativetab.a.cpI.SO()) {
            if (ak2 == this.bwP) {
                j.aER.bgK.cHV.e((co)null);
                return;
            }
            if (n4 == 4 && ak2 != null && ak2.GJ()) {
                co co3 = ak2.cf(n3 == 0 ? 1 : ak2.ls().aeb());
                j.aER.bgK.d(co3, true);
                j.aER.bgu.K(co3);
                return;
            }
            if (n4 == 4) {
                if (j.aER.bgK.cHV.bO() != null) {
                    j.aER.bgK.d(j.aER.bgK.cHV.bO(), true);
                    j.aER.bgu.K(j.aER.bgK.cHV.bO());
                    j.aER.bgK.cHV.e((co)null);
                    return;
                }
            }
            j.aER.bgK.cHX.a(ak2 == null ? n2 : ((l)ak2).bwT.cUk, n3, n4, (net.minecraft.entity.player.a)j.aER.bgK);
            j.aER.bgK.cHX.adc();
            return;
        }
        if (n4 != 5 && ak2.cUj == bwI) {
            g g3 = j.aER.bgK.cHV;
            co co4 = g3.bO();
            co co5 = ak2.ls();
            if (n4 == 2) {
                if (co5 == null) return;
                if (n3 < 0) return;
                if (n3 >= 9) return;
                co co6 = co5.aeg();
                co6.cWZ = co6.aeb();
                j.aER.bgK.cHV.g(n3, co6);
                j.aER.bgK.cHX.adc();
                return;
            }
            if (n4 == 3) {
                if (g3.bO() != null) return;
                if (!ak2.GJ()) return;
                co co7 = ak2.ls().aeg();
                co7.cWZ = co7.aeb();
                g3.e(co7);
                return;
            }
            if (n4 == 4) {
                if (co5 == null) return;
                co co8 = co5.aeg();
                co8.cWZ = n3 == 0 ? 1 : co8.aeb();
                j.aER.bgK.d(co8, true);
                j.aER.bgu.K(co8);
                return;
            }
            if (co4 != null && co5 != null && co4.aJ(co5)) {
                if (n3 == 0) {
                    if (bl2) {
                        co4.cWZ = co4.aeb();
                        return;
                    }
                    if (co4.cWZ >= co4.aeb()) return;
                    ++co4.cWZ;
                    return;
                }
                if (co4.cWZ <= 1) {
                    g3.e((co)null);
                    return;
                }
                --co4.cWZ;
                return;
            }
            if (co5 != null && co4 == null) {
                g3.e(co.aK(co5));
                co4 = g3.bO();
                if (!bl2) return;
                co4.cWZ = co4.aeb();
                return;
            }
            g3.e((co)null);
            return;
        }
        this.bwi.a(ak2 == null ? n2 : ak2.cUk, n3, n4, (net.minecraft.entity.player.a)j.aER.bgK);
        if (net.minecraft.inventory.b.fO(n3) != 2) {
            if (ak2 == null) return;
            co co9 = this.bwi.fM(ak2.cUk).ls();
            j.aER.bgu.a(co9, ak2.cUk - this.bwi.cSK.size() + 9 + 36);
            return;
        }
        int n7 = 0;
        while (n7 < 9) {
            j.aER.bgu.a(this.bwi.fM(45 + n7).ls(), 36 + n7);
            ++n7;
        }
    }

    @Override
    protected void GE() {
        int n2 = this.bwj;
        super.GE();
        if (this.bwN != null && this.bwj != n2) {
            this.bwN.xPosition = this.bwj + 82;
        }
    }

    @Override
    public void initGui() {
        if (j.aER.bgu.Hx()) {
            super.initGui();
            this.buttonList.clear();
            Keyboard.enableRepeatEvents((boolean)true);
            this.bwN = new cq(0, this.fontRendererObj, this.bwj + 82, this.bwk + 6, 89, agg.aIF);
            this.bwN.bV(15);
            this.bwN.af(false);
            this.bwN.M(false);
            this.bwN.bW(0xFFFFFF);
            int n2 = bwJ;
            bwJ = -1;
            this.b(net.minecraft.creativetab.a.cpw[n2]);
            this.bwR = new a(aER);
            j.aER.bgK.cHX.a(this.bwR);
        } else {
            aER.a(new q(j.aER.bgK));
        }
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        if (j.aER.bgK != null) {
            if (j.aER.bgK.cHV != null) {
                j.aER.bgK.cHX.b(this.bwR);
            }
        }
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (bwJ != net.minecraft.creativetab.a.cpC.SO()) {
            if (net.minecraft.client.settings.a.a(j.aER.aIY.chy)) {
                this.b(net.minecraft.creativetab.a.cpC);
            } else {
                super.keyTyped(c2, n2);
            }
        } else {
            if (this.bwQ) {
                this.bwQ = false;
                this.bwN.bX("");
            }
            if (!this.ce(n2)) {
                if (this.bwN.f(c2, n2)) {
                    this.GF();
                } else {
                    super.keyTyped(c2, n2);
                }
            }
        }
    }

    private void GF() {
        k k2 = (k)this.bwi;
        k2.bwS.clear();
        for (d d2 : d.cVi) {
            if (d2 == null || d2.adD() == null) continue;
            d2.b(d2, null, k2.bwS);
        }
        for (net.minecraft.enchantment.a a2 : net.minecraft.enchantment.a.cpV) {
            if (a2 == null || a2.cqy == null) continue;
            Items.cSh.a(a2, k2.bwS);
        }
        Iterator<co> iterator = k2.bwS.iterator();
        String string = this.bwN.getText().toLowerCase();
        while (iterator.hasNext()) {
            co co2 = (co)iterator.next();
            boolean bl2 = false;
            for (String string2 : co2.d(j.aER.bgK, j.aER.aIY.cgL)) {
                if (!an.ge(string2).toLowerCase().contains(string)) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            iterator.remove();
        }
        this.bwK = 0.0f;
        k2.W(0.0f);
    }

    @Override
    protected void s(int n2, int n3) {
        net.minecraft.creativetab.a a2 = net.minecraft.creativetab.a.cpw[bwJ];
        if (a2.ST()) {
            GlStateManager.tR();
            this.fontRendererObj.a(I18n.a(a2.cD(), new Object[0]), 8.0, 6.0, 0x404040);
        }
    }

    @Override
    public void mouseClicked(int n2, int n3, int n4) {
        if (n4 == 0) {
            int n5 = n2 - this.bwj;
            int n6 = n3 - this.bwk;
            for (net.minecraft.creativetab.a a2 : net.minecraft.creativetab.a.cpw) {
                if (!this.a(a2, n5, n6)) continue;
                return;
            }
        }
        super.mouseClicked(n2, n3, n4);
    }

    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        if (n4 == 0) {
            int n5 = n2 - this.bwj;
            int n6 = n3 - this.bwk;
            for (net.minecraft.creativetab.a a2 : net.minecraft.creativetab.a.cpw) {
                if (!this.a(a2, n5, n6)) continue;
                this.b(a2);
                return;
            }
        }
        super.mouseReleased(n2, n3, n4);
    }

    private boolean GG() {
        return bwJ != net.minecraft.creativetab.a.cpI.SO() && net.minecraft.creativetab.a.cpw[bwJ].SV() && ((k)this.bwi).GI();
    }

    private void b(net.minecraft.creativetab.a a2) {
        int n2 = bwJ;
        bwJ = a2.SO();
        k k2 = (k)this.bwi;
        this.bww.clear();
        k2.bwS.clear();
        a2.c(k2.bwS);
        if (a2 == net.minecraft.creativetab.a.cpI) {
            net.minecraft.inventory.b b2 = j.aER.bgK.cHX;
            if (this.bwO == null) {
                this.bwO = k2.cSK;
            }
            k2.cSK = Lists.newArrayList();
            for (int i2 = 0; i2 < b2.cSK.size(); ++i2) {
                int n3;
                int n4;
                int n5;
                l l2 = new l(this, b2.cSK.get(i2), i2);
                k2.cSK.add(l2);
                if (i2 >= 5 && i2 < 9) {
                    n5 = i2 - 5;
                    n4 = n5 / 2;
                    n3 = n5 % 2;
                    l2.cUl = 9 + n4 * 54;
                    l2.cUm = 6 + n3 * 27;
                    continue;
                }
                if (i2 >= 0 && i2 < 5) {
                    l2.cUm = -2000;
                    l2.cUl = -2000;
                    continue;
                }
                if (i2 >= b2.cSK.size()) continue;
                n5 = i2 - 9;
                n4 = n5 % 9;
                n3 = n5 / 9;
                l2.cUl = 9 + n4 * 18;
                l2.cUm = i2 >= 36 ? 112 : 54 + n3 * 18;
            }
            this.bwP = new ak(bwI, 0, 173, 112);
            k2.cSK.add(this.bwP);
        } else if (n2 == net.minecraft.creativetab.a.cpI.SO()) {
            k2.cSK = this.bwO;
            this.bwO = null;
        }
        if (this.bwN != null) {
            if (a2 == net.minecraft.creativetab.a.cpC) {
                this.bwN.M(true);
                this.bwN.ah(false);
                this.bwN.ag(true);
                this.bwN.bX("");
                this.GF();
            } else {
                this.bwN.M(false);
                this.bwN.ah(true);
                this.bwN.ag(false);
            }
        }
        this.bwK = 0.0f;
        k2.W(0.0f);
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        int n2 = Mouse.getEventDWheel();
        if (n2 != 0 && this.GG()) {
            int n3 = ((k)this.bwi).bwS.size() / 9 - 5;
            if (n2 > 0) {
                n2 = 1;
            }
            if (n2 < 0) {
                n2 = -1;
            }
            this.bwK = (float)((double)this.bwK - (double)n2 / (double)n3);
            this.bwK = bt.I(this.bwK, 0.0f, 1.0f);
            ((k)this.bwi).W(this.bwK);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        boolean bl2 = Mouse.isButtonDown((int)0);
        int n4 = this.bwj;
        int n5 = this.bwk;
        int n6 = n4 + 175;
        int n7 = n5 + 18;
        int n8 = n6 + 14;
        int n9 = n7 + 112;
        if (!this.bwM && bl2 && n2 >= n6 && n3 >= n7 && n2 < n8 && n3 < n9) {
            this.bwL = this.GG();
        }
        if (!bl2) {
            this.bwL = false;
        }
        this.bwM = bl2;
        if (this.bwL) {
            this.bwK = ((float)(n3 - n7) - 7.5f) / ((float)(n9 - n7) - 15.0f);
            this.bwK = bt.I(this.bwK, 0.0f, 1.0f);
            ((k)this.bwi).W(this.bwK);
        }
        super.drawScreen(n2, n3, f2);
        for (net.minecraft.creativetab.a a2 : net.minecraft.creativetab.a.cpw) {
            if (this.b(a2, n2, n3)) break;
        }
        if (this.bwP != null && bwJ == net.minecraft.creativetab.a.cpI.SO() && this.c(this.bwP.cUl, this.bwP.cUm, 16, 16, n2, n3)) {
            this.drawCreativeTabHoveringText(I18n.a("inventory.binSlot", new Object[0]), n2, n3);
        }
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JA();
    }

    @Override
    protected void renderToolTip(co co2, int n2, int n3) {
        if (bwJ == net.minecraft.creativetab.a.cpC.SO()) {
            Map<Integer, Integer> map;
            List<String> list = co2.d(j.aER.bgK, j.aER.aIY.cgL);
            net.minecraft.creativetab.a a2 = co2.bP().adD();
            if (a2 == null && co2.bP() == Items.cSh && (map = net.minecraft.enchantment.l.U(co2)).size() == 1) {
                net.minecraft.enchantment.a a3 = net.minecraft.enchantment.a.eh(map.keySet().iterator().next());
                for (net.minecraft.creativetab.a a4 : net.minecraft.creativetab.a.cpw) {
                    if (!a4.a(a3.cqy)) continue;
                    a2 = a4;
                    break;
                }
            }
            if (a2 != null) {
                list.add(1, String.valueOf((Object)an.dwd) + String.valueOf((Object)an.dvU) + I18n.a(a2.cD(), new Object[0]));
            }
            for (int i2 = 0; i2 < list.size(); ++i2) {
                if (i2 == 0) {
                    list.set(i2, String.valueOf((Object)co2.aep().cVf) + list.get(i2));
                    continue;
                }
                list.set(i2, String.valueOf((Object)an.dvS) + list.get(i2));
            }
            this.drawHoveringText(list, n2, n3);
        } else {
            super.renderToolTip(co2, n2, n3);
        }
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        RenderHelper.Lh();
        net.minecraft.creativetab.a a2 = net.minecraft.creativetab.a.cpw[bwJ];
        for (net.minecraft.creativetab.a a3 : net.minecraft.creativetab.a.cpw) {
            aER.Bq().a(bwH);
            if (a3.SO() == bwJ) continue;
            this.c(a3);
        }
        aER.Bq().a(new cm("textures/gui/container/creative_inventory/tab_" + a2.SS()));
        this.drawTexturedModalRect((float)this.bwj, this.bwk, 0, 0, this.bwg, this.bwh);
        this.bwN.Gf();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        int n4 = this.bwj + 175;
        int n5 = this.bwk + 18;
        int n6 = n5 + 112;
        aER.Bq().a(bwH);
        if (a2.SV()) {
            this.drawTexturedModalRect((float)n4, n5 + (int)((float)(n6 - n5 - 17) * this.bwK), 232 + (this.GG() ? 0 : 12), 0, 12, 15);
        }
        this.c(a2);
        if (a2 == net.minecraft.creativetab.a.cpI) {
            q.a(this.bwj + 43, this.bwk + 45, 20, this.bwj + 43 - n2, this.bwk + 45 - 30 - n3, j.aER.bgK);
        }
    }

    protected boolean a(net.minecraft.creativetab.a a2, int n2, int n3) {
        int n4 = a2.SX();
        int n5 = 28 * n4;
        int n6 = 0;
        if (n4 == 5) {
            n5 = this.bwg - 28 + 2;
        } else if (n4 > 0) {
            n5 += n4;
        }
        n6 = a2.SY() ? (n6 -= 32) : (n6 += this.bwh);
        if (a2.SO() == 12) {
            n5 = this.bwg - 55;
        }
        return n2 >= n5 && n2 <= n5 + 28 && n3 >= n6 && n3 <= n6 + 32;
    }

    protected boolean b(net.minecraft.creativetab.a a2, int n2, int n3) {
        int n4 = a2.SX();
        int n5 = 28 * n4;
        int n6 = 0;
        if (n4 == 5) {
            n5 = this.bwg - 28 + 2;
        } else if (n4 > 0) {
            n5 += n4;
        }
        n6 = a2.SY() ? (n6 -= 32) : (n6 += this.bwh);
        if (a2.SO() == 12) {
            n5 = this.bwg - 55;
        }
        if (this.c(n5 + 3, n6 + 3, 23, 27, n2, n3)) {
            this.drawCreativeTabHoveringText(I18n.a(a2.cD(), new Object[0]), n2, n3);
            return true;
        }
        return false;
    }

    protected void c(net.minecraft.creativetab.a a2) {
        boolean bl2 = a2.SO() == bwJ;
        boolean bl3 = a2.SY();
        int n2 = a2.SX();
        int n3 = n2 * 28;
        int n4 = 0;
        int n5 = this.bwj + 28 * n2;
        int n6 = this.bwk;
        int n7 = 32;
        if (bl2) {
            n4 += 32;
        }
        if (n2 == 5) {
            n5 = this.bwj + this.bwg - 28;
        }
        if (n2 == 6) {
            n5 += n2;
        }
        if (bl3) {
            n6 -= 28;
        } else {
            n4 += 64;
            n6 += this.bwh - 4;
        }
        if (a2.SO() == 12) {
            n5 = this.bwj + this.bwg - 55;
            n3 += 56;
        }
        GlStateManager.JA();
        this.drawTexturedModalRect((float)n5, n6, n3, n4, 28, 32);
        zLevel = 100.0f;
        this.itemRender.zLevel = 100.0f;
        n6 = n6 + 8 + (bl3 ? 1 : -1);
        GlStateManager.Jz();
        GlStateManager.JS();
        co co2 = a2.SQ();
        this.itemRender.b(co2, n5 += 6, n6);
        this.itemRender.a(this.fontRendererObj, co2, n5, n6);
        GlStateManager.JA();
        this.itemRender.zLevel = 0.0f;
        zLevel = 0.0f;
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 0) {
            aER.a(new b(this, j.aER.bgK.Dx()));
        }
        if (c2.id == 1) {
            aER.a(new net.minecraft.client.gui.achievement.c(this, j.aER.bgK.Dx()));
        }
    }

    public int GH() {
        return bwJ;
    }
}

