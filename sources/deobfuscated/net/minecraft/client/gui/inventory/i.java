/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui.inventory;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.settings.d;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.item.co;
import net.minecraft.util.an;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import org.lwjgl.input.Keyboard;

public abstract class i
extends GuiScreen {
    public static final cm bwf = new cm("textures/gui/container/inventory.png");
    protected int bwg = 176;
    protected int bwh = 166;
    public b bwi;
    protected int bwj;
    protected int bwk;
    private ak bwl;
    private ak bwm;
    private boolean bwn;
    private co bwo;
    private int bwp;
    private int bwq;
    private ak bwr;
    private long bws;
    private co bwt;
    private ak bwu;
    private long bwv;
    protected final Set<ak> bww = Sets.newHashSet();
    protected boolean bwx;
    private int bwy;
    private int bwz;
    private boolean bwA;
    private int bwB;
    private long bwC;
    private ak bwD;
    private int bwE;
    private boolean bwF;
    private co bwG;

    public i(b b2) {
        this.bwi = b2;
        this.bwA = true;
    }

    @Override
    public void initGui() {
        super.initGui();
        i.aER.bgK.cHY = this.bwi;
        this.bwj = (this.width - this.bwg) / 2;
        this.bwk = (this.height - this.bwh) / 2;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        int n4;
        int n5;
        Object object;
        this.drawDefaultBackground();
        int n6 = this.bwj;
        int n7 = this.bwk;
        this.b(f2, n2, n3);
        GlStateManager.JT();
        RenderHelper.Lf();
        GlStateManager.JA();
        GlStateManager.JD();
        super.drawScreen(n2, n3, f2);
        RenderHelper.Lh();
        GlStateManager.JV();
        GlStateManager.j(n6, n7, 0.0f);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JS();
        this.bwl = null;
        int n8 = 240;
        int n9 = 240;
        OpenGlHelper.a(OpenGlHelper.bMJ, 240.0f, 240.0f);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i2 = 0; i2 < this.bwi.cSK.size(); ++i2) {
            object = this.bwi.cSK.get(i2);
            this.a((ak)object);
            if (!this.a((ak)object, n2, n3) || !((ak)object).adh()) continue;
            this.bwl = object;
            GlStateManager.JA();
            GlStateManager.JD();
            n5 = ((ak)object).cUl;
            n4 = ((ak)object).cUm;
            GlStateManager.a(true, true, true, false);
            this.drawGradientRect(n5, n4, n5 + 16, n4 + 16, -2130706433, -2130706433);
            GlStateManager.a(true, true, true, true);
            GlStateManager.Jz();
            GlStateManager.JE();
        }
        RenderHelper.Lf();
        this.s(n2, n3);
        RenderHelper.Lh();
        g g2 = i.aER.bgK.cHV;
        Object object2 = object = this.bwo == null ? g2.bO() : this.bwo;
        if (object != null) {
            n5 = 8;
            n4 = this.bwo == null ? 8 : 16;
            String string = null;
            if (this.bwo != null && this.bwn) {
                object = ((co)object).aeg();
                ((co)object).cWZ = bt.bM((float)((co)object).cWZ / 2.0f);
            } else if (this.bwx && this.bww.size() > 1) {
                object = ((co)object).aeg();
                ((co)object).cWZ = this.bwB;
                if (((co)object).cWZ == 0) {
                    string = String.valueOf((Object)an.dvZ) + "0";
                }
            }
            this.a((co)object, n2 - n6 - 8, n3 - n7 - n4, string);
        }
        if (this.bwt != null) {
            float f3 = (float)(Minecraft.Bj() - this.bws) / 100.0f;
            if (f3 >= 1.0f) {
                f3 = 1.0f;
                this.bwt = null;
            }
            n4 = this.bwr.cUl - this.bwp;
            int n10 = this.bwr.cUm - this.bwq;
            int n11 = this.bwp + (int)((float)n4 * f3);
            int n12 = this.bwq + (int)((float)n10 * f3);
            this.a(this.bwt, n11, n12, null);
        }
        GlStateManager.JW();
        if (g2.bO() == null && this.bwl != null && this.bwl.GJ()) {
            co co2 = this.bwl.ls();
            this.renderToolTip(co2, n2, n3);
        }
        GlStateManager.Jz();
        GlStateManager.JE();
        RenderHelper.Lg();
    }

    private void a(co co2, int n2, int n3, String string) {
        GlStateManager.j(0.0f, 0.0f, 32.0f);
        zLevel = 200.0f;
        this.itemRender.zLevel = 200.0f;
        this.itemRender.b(co2, n2, n3);
        this.itemRender.a(this.fontRendererObj, co2, n2, n3 - (this.bwo == null ? 0 : 8), string);
        zLevel = 0.0f;
        this.itemRender.zLevel = 0.0f;
    }

    protected void s(int n2, int n3) {
    }

    protected abstract void b(float var1, int var2, int var3);

    private void a(ak ak2) {
        String string;
        int n2 = ak2.cUl;
        int n3 = ak2.cUm;
        co co2 = ak2.ls();
        boolean bl2 = false;
        boolean bl3 = ak2 == this.bwm && this.bwo != null && !this.bwn;
        co co3 = i.aER.bgK.cHV.bO();
        String string2 = null;
        if (ak2 == this.bwm && this.bwo != null && this.bwn && co2 != null) {
            co2 = co2.aeg();
            co2.cWZ /= 2;
        } else if (this.bwx && this.bww.contains(ak2) && co3 != null) {
            if (this.bww.size() == 1) {
                return;
            }
            if (b.a(ak2, co3, true) && this.bwi.b(ak2)) {
                co2 = co3.aeg();
                bl2 = true;
                b.a(this.bww, this.bwy, co2, ak2.ls() == null ? 0 : ak2.ls().cWZ);
                if (co2.cWZ > co2.aeb()) {
                    string2 = String.valueOf((Object)an.dvZ) + co2.aeb();
                    co2.cWZ = co2.aeb();
                }
                if (co2.cWZ > ak2.J(co2)) {
                    string2 = String.valueOf((Object)an.dvZ) + ak2.J(co2);
                    co2.cWZ = ak2.J(co2);
                }
            } else {
                this.bww.remove(ak2);
                this.GD();
            }
        }
        zLevel = 100.0f;
        this.itemRender.zLevel = 100.0f;
        if (co2 == null && (string = ak2.GM()) != null) {
            TextureAtlasSprite textureAtlasSprite = aER.Bu().dq(string);
            GlStateManager.JA();
            aER.Bq().a(TextureMap.bZE);
            this.drawTexturedModalRect(n2, n3, textureAtlasSprite, 16, 16);
            GlStateManager.Jz();
            bl3 = true;
        }
        if (!bl3) {
            if (bl2) {
                i.drawRect(n2, n3, n2 + 16, n3 + 16, -2130706433);
            }
            GlStateManager.JE();
            this.itemRender.b(co2, n2, n3);
            this.itemRender.a(this.fontRendererObj, co2, n2, n3, string2);
        }
        this.itemRender.zLevel = 0.0f;
        zLevel = 0.0f;
    }

    private void GD() {
        co co2 = i.aER.bgK.cHV.bO();
        if (co2 != null && this.bwx) {
            this.bwB = co2.cWZ;
            for (ak ak2 : this.bww) {
                co co3 = co2.aeg();
                int n2 = ak2.ls() == null ? 0 : ak2.ls().cWZ;
                b.a(this.bww, this.bwy, co3, n2);
                if (co3.cWZ > co3.aeb()) {
                    co3.cWZ = co3.aeb();
                }
                if (co3.cWZ > ak2.J(co3)) {
                    co3.cWZ = ak2.J(co3);
                }
                this.bwB -= co3.cWZ - n2;
            }
        }
    }

    private ak B(int n2, int n3) {
        for (int i2 = 0; i2 < this.bwi.cSK.size(); ++i2) {
            ak ak2 = this.bwi.cSK.get(i2);
            if (!this.a(ak2, n2, n3)) continue;
            return ak2;
        }
        return null;
    }

    @Override
    public void mouseClicked(int n2, int n3, int n4) {
        if (n4 >= 3) {
            int n5 = -100 + n4;
            int n6 = 0;
            for (d d2 : i.aER.aIY.chK) {
                if (d2.cO() == n5) {
                    if (i.aER.bgK.cHV.bO() == null && this.bwl != null) {
                        for (int i2 = 0; i2 < 9; ++i2) {
                            if (n6 != i2) continue;
                            this.a(this.bwl, this.bwl.cUk, i2, 2);
                        }
                    }
                }
                ++n6;
            }
            return;
        }
        super.mouseClicked(n2, n3, n4);
        boolean bl2 = n4 == i.aER.aIY.chx.cO() + 100;
        ak ak2 = this.B(n2, n3);
        long l2 = Minecraft.Bj();
        this.bwF = this.bwD == ak2 && l2 - this.bwC < 250L && this.bwE == n4;
        this.bwA = false;
        if (n4 == 0 || n4 == 1 || bl2) {
            int n7 = this.bwj;
            int n8 = this.bwk;
            boolean bl3 = n2 < n7 || n3 < n8 || n2 >= n7 + this.bwg || n3 >= n8 + this.bwh;
            int n9 = -1;
            if (ak2 != null) {
                n9 = ak2.cUk;
            }
            if (bl3) {
                n9 = -999;
            }
            if (i.aER.aIY.cgO && bl3) {
                if (i.aER.bgK.cHV.bO() == null) {
                    aER.a((GuiScreen)null);
                    return;
                }
            }
            if (n9 != -1) {
                if (i.aER.aIY.cgO) {
                    if (ak2 != null && ak2.GJ()) {
                        this.bwm = ak2;
                        this.bwo = null;
                        this.bwn = n4 == 1;
                    } else {
                        this.bwm = null;
                    }
                } else if (!this.bwx) {
                    if (i.aER.bgK.cHV.bO() == null) {
                        if (n4 == i.aER.aIY.chx.cO() + 100) {
                            this.a(ak2, n9, n4, 3);
                        } else {
                            boolean bl4 = n9 != -999 && (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54));
                            int n10 = 0;
                            if (bl4) {
                                this.bwG = ak2 != null && ak2.GJ() ? ak2.ls() : null;
                                n10 = 1;
                            } else if (n9 == -999) {
                                n10 = 4;
                            }
                            this.a(ak2, n9, n4, n10);
                        }
                        this.bwA = true;
                    } else {
                        this.bwx = true;
                        this.bwz = n4;
                        this.bww.clear();
                        if (n4 == 0) {
                            this.bwy = 0;
                        } else if (n4 == 1) {
                            this.bwy = 1;
                        } else if (n4 == i.aER.aIY.chx.cO() + 100) {
                            this.bwy = 2;
                        }
                    }
                }
            }
        }
        this.bwD = ak2;
        this.bwC = l2;
        this.bwE = n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void mouseClickMove(int n2, int n3, int n4, long l2) {
        ak ak2 = this.B(n2, n3);
        co co2 = i.aER.bgK.cHV.bO();
        if (this.bwm != null) {
            if (i.aER.aIY.cgO) {
                if (n4 != 0) {
                    if (n4 != 1) return;
                }
                if (this.bwo == null) {
                    if (ak2 == this.bwm) return;
                    if (this.bwm.ls() == null) return;
                    this.bwo = this.bwm.ls().aeg();
                    return;
                }
                if (this.bwo.cWZ <= 1) return;
                if (ak2 == null) return;
                if (!b.a(ak2, this.bwo, false)) return;
                long l3 = Minecraft.Bj();
                if (this.bwu == ak2) {
                    if (l3 - this.bwv <= 500L) return;
                    this.a(this.bwm, this.bwm.cUk, 0, 0);
                    this.a(ak2, ak2.cUk, 1, 0);
                    this.a(this.bwm, this.bwm.cUk, 0, 0);
                    this.bwv = l3 + 750L;
                    --this.bwo.cWZ;
                    return;
                }
                this.bwu = ak2;
                this.bwv = l3;
                return;
            }
        }
        if (!this.bwx) return;
        if (ak2 == null) return;
        if (co2 == null) return;
        if (co2.cWZ <= this.bww.size()) return;
        if (!b.a(ak2, co2, true)) return;
        if (!ak2.H(co2)) return;
        if (!this.bwi.b(ak2)) return;
        this.bww.add(ak2);
        this.GD();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        block25: {
            int n5;
            ak ak2;
            block26: {
                int n6;
                int n7;
                block24: {
                    ak2 = this.B(n2, n3);
                    n7 = this.bwj;
                    n6 = this.bwk;
                    boolean bl2 = n2 < n7 || n3 < n6 || n2 >= n7 + this.bwg || n3 >= n6 + this.bwh;
                    n5 = -1;
                    if (ak2 != null) {
                        n5 = ak2.cUk;
                    }
                    if (bl2) {
                        n5 = -999;
                    }
                    if (!this.bwF || ak2 == null || n4 != 0 || !this.bwi.a(null, ak2)) break block24;
                    if (i.isShiftKeyDown()) {
                        if (ak2 != null && ak2.cUj != null && this.bwG != null) {
                            for (ak ak3 : this.bwi.cSK) {
                                if (ak3 == null) continue;
                                if (!ak3.G(i.aER.bgK) || !ak3.GJ() || ak3.cUj != ak2.cUj || !b.a(ak3, this.bwG, true)) continue;
                                this.a(ak3, ak3.cUk, n4, 1);
                            }
                        }
                    } else {
                        this.a(ak2, n5, n4, 6);
                    }
                    this.bwF = false;
                    this.bwC = 0L;
                    break block25;
                }
                if (this.bwx && this.bwz != n4) {
                    this.bwx = false;
                    this.bww.clear();
                    this.bwA = true;
                    return;
                }
                if (this.bwA) {
                    this.bwA = false;
                    return;
                }
                if (this.bwm == null) break block26;
                if (!i.aER.aIY.cgO) break block26;
                if (n4 == 0 || n4 == 1) {
                    if (this.bwo == null && ak2 != this.bwm) {
                        this.bwo = this.bwm.ls();
                    }
                    boolean bl3 = b.a(ak2, this.bwo, false);
                    if (n5 != -1 && this.bwo != null && bl3) {
                        this.a(this.bwm, this.bwm.cUk, n4, 0);
                        this.a(ak2, n5, 0, 0);
                        if (i.aER.bgK.cHV.bO() != null) {
                            this.a(this.bwm, this.bwm.cUk, n4, 0);
                            this.bwp = n2 - n7;
                            this.bwq = n3 - n6;
                            this.bwr = this.bwm;
                            this.bwt = this.bwo;
                            this.bws = Minecraft.Bj();
                        } else {
                            this.bwt = null;
                        }
                    } else if (this.bwo != null) {
                        this.bwp = n2 - n7;
                        this.bwq = n3 - n6;
                        this.bwr = this.bwm;
                        this.bwt = this.bwo;
                        this.bws = Minecraft.Bj();
                    }
                    this.bwo = null;
                    this.bwm = null;
                }
                break block25;
            }
            if (this.bwx && !this.bww.isEmpty()) {
                this.a(null, -999, b.ar(0, this.bwy), 5);
                for (ak ak4 : this.bww) {
                    this.a(ak4, ak4.cUk, b.ar(1, this.bwy), 5);
                }
                this.a(null, -999, b.ar(2, this.bwy), 5);
            } else if (i.aER.bgK.cHV.bO() != null) {
                if (n4 == i.aER.aIY.chx.cO() + 100) {
                    this.a(ak2, n5, n4, 3);
                } else {
                    boolean bl4;
                    boolean bl5 = bl4 = n5 != -999 && (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54));
                    if (bl4) {
                        this.bwG = ak2 != null && ak2.GJ() ? ak2.ls() : null;
                    }
                    this.a(ak2, n5, n4, bl4 ? 1 : 0);
                }
            }
        }
        if (i.aER.bgK.cHV.bO() == null) {
            this.bwC = 0L;
        }
        this.bwx = false;
    }

    private boolean a(ak ak2, int n2, int n3) {
        return this.c(ak2.cUl, ak2.cUm, 16, 16, n2, n3);
    }

    protected boolean c(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = this.bwj;
        int n9 = this.bwk;
        return (n6 -= n8) >= n2 - 1 && n6 < n2 + n4 + 1 && (n7 -= n9) >= n3 - 1 && n7 < n3 + n5 + 1;
    }

    protected void a(ak ak2, int n2, int n3, int n4) {
        if (ak2 != null) {
            n2 = ak2.cUk;
        }
        i.aER.bgu.a(this.bwi.cSL, n2, n3, n4, i.aER.bgK);
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        block8: {
            block7: {
                if (n2 == 1) break block7;
                if (n2 != i.aER.aIY.cht.cO()) break block8;
            }
            i.aER.bgK.Dq();
        }
        this.ce(n2);
        if (this.bwl != null && this.bwl.GJ()) {
            if (n2 == i.aER.aIY.chx.cO()) {
                this.a(this.bwl, this.bwl.cUk, 0, 3);
            } else if (n2 == i.aER.aIY.chv.cO()) {
                this.a(this.bwl, this.bwl.cUk, i.isCtrlKeyDown() ? 1 : 0, 4);
            }
        }
    }

    protected boolean ce(int n2) {
        if (i.aER.bgK.cHV.bO() == null && this.bwl != null) {
            for (int i2 = 0; i2 < 9; ++i2) {
                if (n2 != i.aER.aIY.chK[i2].cO()) continue;
                this.a(this.bwl, this.bwl.cUk, i2, 2);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onGuiClosed() {
        if (i.aER.bgK != null) {
            this.bwi.E(i.aER.bgK);
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void updateScreen() {
        block3: {
            block2: {
                super.updateScreen();
                if (!i.aER.bgK.TS()) break block2;
                if (!i.aER.bgK.csb) break block3;
            }
            i.aER.bgK.Dq();
        }
    }
}

