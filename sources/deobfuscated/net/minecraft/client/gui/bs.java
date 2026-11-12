/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonParseException
 *  io.netty.buffer.Unpooled
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import hackclient.rise.agg;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.bt;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cr;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.event.a;
import net.minecraft.event.b;
import net.minecraft.init.Items;
import net.minecraft.item.as;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.nbt.z;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.ab;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.util.cm;
import net.minecraft.util.l;
import net.minecraft.util.s;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bs
extends GuiScreen {
    private static final Logger brk = LogManager.getLogger();
    private static final cm brl = new cm("textures/gui/book.png");
    private final net.minecraft.entity.player.a brm;
    private final co brn;
    private final boolean bro;
    private boolean brp;
    private boolean brq;
    private int brr;
    private final int brs = 192;
    private final int brt = 192;
    private int bru = 1;
    private int brv;
    private v brw;
    private String brx = "";
    private List<ba> bry;
    private int brz = -1;
    private bt brA;
    private bt brB;
    private c brC;
    private c brD;
    private c brE;
    private c brF;

    public bs(net.minecraft.entity.player.a a2, co co2, boolean bl2) {
        this.brm = a2;
        this.brn = co2;
        this.bro = bl2;
        if (co2.aej()) {
            n n2 = co2.aek();
            this.brw = n2.D("pages", 8);
            if (this.brw != null) {
                this.brw = (v)this.brw.aeG();
                this.bru = this.brw.aeS();
                if (this.bru < 1) {
                    this.bru = 1;
                }
            }
        }
        if (this.brw == null && bl2) {
            this.brw = new v();
            this.brw.a(new z(""));
            this.bru = 1;
        }
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        ++this.brr;
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        if (this.bro) {
            int n2 = this.width / 2 - 100;
            Objects.requireNonNull(this);
            this.brD = new c(3, n2, 4 + 192, 98, 20, I18n.a("book.signButton", new Object[0]));
            this.buttonList.add(this.brD);
            int n3 = this.width / 2 + 2;
            Objects.requireNonNull(this);
            this.brC = new c(0, n3, 4 + 192, 98, 20, I18n.a("gui.done", new Object[0]));
            this.buttonList.add(this.brC);
            int n4 = this.width / 2 - 100;
            Objects.requireNonNull(this);
            this.brE = new c(5, n4, 4 + 192, 98, 20, I18n.a("book.finalizeButton", new Object[0]));
            this.buttonList.add(this.brE);
            int n5 = this.width / 2 + 2;
            Objects.requireNonNull(this);
            this.brF = new c(4, n5, 4 + 192, 98, 20, I18n.a("gui.cancel", new Object[0]));
            this.buttonList.add(this.brF);
        } else {
            int n6 = this.width / 2 - 100;
            Objects.requireNonNull(this);
            this.brC = new c(0, n6, 4 + 192, 200, 20, I18n.a("gui.done", new Object[0]));
            this.buttonList.add(this.brC);
        }
        Objects.requireNonNull(this);
        int n7 = (this.width - 192) / 2;
        int n8 = 2;
        this.brA = new bt(1, n7 + 120, 156, true);
        this.buttonList.add(this.brA);
        this.brB = new bt(2, n7 + 38, 156, false);
        this.buttonList.add(this.brB);
        this.FC();
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    private void FC() {
        this.brA.visible = !this.brq && (this.brv < this.bru - 1 || this.bro);
        this.brB.visible = !this.brq && this.brv > 0;
        boolean bl2 = this.brC.visible = !this.bro || !this.brq;
        if (this.bro) {
            this.brD.visible = !this.brq;
            this.brF.visible = this.brq;
            this.brE.visible = this.brq;
            this.brE.enabled = this.brx.trim().length() > 0;
        }
    }

    private void ae(boolean bl2) {
        if (this.bro && this.brp && this.brw != null) {
            Object object;
            while (this.brw.aeS() > 1 && ((String)(object = this.brw.gm(this.brw.aeS() - 1))).length() == 0) {
                this.brw.gh(this.brw.aeS() - 1);
            }
            if (this.brn.aej()) {
                object = this.brn.aek();
                ((n)object).b("pages", this.brw);
            } else {
                this.brn.a("pages", this.brw);
            }
            object = "MC|BEdit";
            if (bl2) {
                object = "MC|BSign";
                this.brn.a("author", new z(this.brm.xU()));
                this.brn.a("title", new z(this.brx.trim()));
                for (int i2 = 0; i2 < this.brw.aeS(); ++i2) {
                    String string = this.brw.gm(i2);
                    s s2 = new s(string);
                    string = bb.q(s2);
                    this.brw.a(i2, new z(string));
                }
                this.brn.r(Items.cRR);
            }
            ak ak2 = new ak(Unpooled.buffer());
            ak2.aO(this.brn);
            aER.AU().u(new ab((String)object, ak2));
        }
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 0) {
                aER.a((GuiScreen)null);
                this.ae(false);
            } else if (c2.id == 3 && this.bro) {
                this.brq = true;
            } else if (c2.id == 1) {
                if (this.brv < this.bru - 1) {
                    ++this.brv;
                } else if (this.bro) {
                    this.FD();
                    if (this.brv < this.bru - 1) {
                        ++this.brv;
                    }
                }
            } else if (c2.id == 2) {
                if (this.brv > 0) {
                    --this.brv;
                }
            } else if (c2.id == 5 && this.brq) {
                this.ae(true);
                aER.a((GuiScreen)null);
            } else if (c2.id == 4 && this.brq) {
                this.brq = false;
            }
            this.FC();
        }
    }

    private void FD() {
        if (this.brw != null && this.brw.aeS() < 50) {
            this.brw.a(new z(""));
            ++this.bru;
            this.brp = true;
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        super.keyTyped(c2, n2);
        if (this.bro) {
            if (this.brq) {
                this.e(c2, n2);
            } else {
                this.d(c2, n2);
            }
        }
    }

    private void d(char c2, int n2) {
        if (GuiScreen.isKeyComboCtrlV(n2)) {
            this.cR(GuiScreen.getClipboardString());
        } else {
            switch (n2) {
                case 14: {
                    String string = this.FE();
                    if (string.length() > 0) {
                        this.cQ(string.substring(0, string.length() - 1));
                    }
                    return;
                }
                case 28: 
                case 156: {
                    this.cR("\n");
                    return;
                }
            }
            if (l.o(c2)) {
                this.cR(Character.toString(c2));
            }
        }
    }

    private void e(char c2, int n2) {
        switch (n2) {
            case 14: {
                if (!this.brx.isEmpty()) {
                    this.brx = this.brx.substring(0, this.brx.length() - 1);
                    this.FC();
                }
                return;
            }
            case 28: 
            case 156: {
                if (!this.brx.isEmpty()) {
                    this.ae(true);
                    aER.a((GuiScreen)null);
                }
                return;
            }
        }
        if (this.brx.length() < 16 && l.o(c2)) {
            this.brx = this.brx + c2;
            this.FC();
            this.brp = true;
        }
    }

    private String FE() {
        return this.brw != null && this.brv >= 0 && this.brv < this.brw.aeS() ? this.brw.gm(this.brv) : "";
    }

    private void cQ(String string) {
        if (this.brw != null && this.brv >= 0 && this.brv < this.brw.aeS()) {
            this.brw.a(this.brv, new z(string));
            this.brp = true;
        }
    }

    private void cR(String string) {
        String string2 = this.FE();
        String string3 = string2 + string;
        int n2 = this.fontRendererObj.l(string3 + String.valueOf((Object)an.dvL) + "_", 118);
        if (n2 <= 128 && string3.length() < 256) {
            this.cQ(string3);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(brl);
        Objects.requireNonNull(this);
        int n4 = (this.width - 192) / 2;
        int n5 = 2;
        float f3 = n4;
        Objects.requireNonNull(this);
        Objects.requireNonNull(this);
        this.drawTexturedModalRect(f3, 2, 0, 0, 192, 192);
        if (this.brq) {
            Object object = this.brx;
            if (this.bro) {
                object = this.brr / 6 % 2 == 0 ? (String)object + String.valueOf((Object)an.dvL) + "_" : (String)object + String.valueOf((Object)an.dvS) + "_";
            }
            String string = I18n.a("book.editTitle", new Object[0]);
            int n6 = this.fontRendererObj.bQ(string);
            this.fontRendererObj.a(string, (double)(n4 + 36 + (116 - n6) / 2), 34.0, 0);
            int n7 = this.fontRendererObj.bQ((String)object);
            this.fontRendererObj.a((String)object, (double)(n4 + 36 + (116 - n7) / 2), 50.0, 0);
            String string2 = I18n.a("book.byAuthor", this.brm.xU());
            int n8 = this.fontRendererObj.bQ(string2);
            this.fontRendererObj.a(String.valueOf((Object)an.dvT) + string2, (double)(n4 + 36 + (116 - n8) / 2), 60.0, 0);
            String string3 = I18n.a("book.finalizeWarning", new Object[0]);
            this.fontRendererObj.a(string3, n4 + 36, 82, 116, 0);
        } else {
            String string = I18n.a("book.pageIndicator", this.brv + 1, this.bru);
            Object object = "";
            if (this.brw != null && this.brv >= 0 && this.brv < this.brw.aeS()) {
                object = this.brw.gm(this.brv);
            }
            if (this.bro) {
                object = this.fontRendererObj.tK() ? (String)object + "_" : (this.brr / 6 % 2 == 0 ? (String)object + String.valueOf((Object)an.dvL) + "_" : (String)object + String.valueOf((Object)an.dvS) + "_");
            } else if (this.brz != this.brv) {
                if (as.r(this.brn.aek())) {
                    try {
                        var8_11 = bb.gi((String)object);
                        this.bry = var8_11 != null ? cr.a(var8_11, 116, this.fontRendererObj, true, true) : null;
                    }
                    catch (JsonParseException jsonParseException) {
                        this.bry = null;
                    }
                } else {
                    var8_11 = new s(String.valueOf((Object)an.dvP) + "* Invalid book tag *");
                    this.bry = Lists.newArrayList((Iterable)var8_11);
                }
                this.brz = this.brv;
            }
            int n9 = this.fontRendererObj.bQ(string);
            Objects.requireNonNull(this);
            this.fontRendererObj.a(string, (double)(n4 - n9 + 192 - 44), 18.0, 0);
            if (this.bry == null) {
                this.fontRendererObj.a((String)object, n4 + 36, 34, 116, 0);
            } else {
                int n10 = Math.min(128 / agg.aIF, this.bry.size());
                for (int i2 = 0; i2 < n10; ++i2) {
                    ba ba2 = this.bry.get(i2);
                    this.fontRendererObj.a(ba2.arq(), (double)(n4 + 36), (double)(34 + i2 * agg.aIF), 0);
                }
                ba ba3 = this.y(n2, n3);
                if (ba3 != null) {
                    this.handleComponentHover(ba3, n2, n3);
                }
            }
        }
        super.drawScreen(n2, n3, f2);
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        ba ba2;
        if (n4 == 0 && this.handleComponentClick(ba2 = this.y(n2, n3))) {
            return;
        }
        super.mouseClicked(n2, n3, n4);
    }

    @Override
    public boolean handleComponentClick(ba ba2) {
        a a2;
        a a3 = a2 = ba2 == null ? null : ba2.arp().arB();
        if (a2 == null) {
            return false;
        }
        if (a2.acS() == b.cKN) {
            String string = a2.SN();
            try {
                int n2 = Integer.parseInt(string) - 1;
                if (n2 >= 0 && n2 < this.bru && n2 != this.brv) {
                    this.brv = n2;
                    this.FC();
                    return true;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return false;
        }
        boolean bl2 = super.handleComponentClick(ba2);
        if (bl2 && a2.acS() == b.cKK) {
            aER.a((GuiScreen)null);
        }
        return bl2;
    }

    public ba y(int n2, int n3) {
        if (this.bry == null) {
            return null;
        }
        Objects.requireNonNull(this);
        int n4 = n2 - (this.width - 192) / 2 - 36;
        int n5 = n3 - 2 - 16 - 16;
        if (n4 >= 0 && n5 >= 0) {
            int n6 = Math.min(128 / agg.aIF, this.bry.size());
            if (n4 <= 116) {
                agg cfr_ignored_0 = bs.aER.fontRendererObj;
                if (n5 < agg.aIF * n6 + n6) {
                    agg cfr_ignored_1 = bs.aER.fontRendererObj;
                    int n7 = n5 / agg.aIF;
                    if (n7 >= 0 && n7 < this.bry.size()) {
                        ba ba2 = this.bry.get(n7);
                        int n8 = 0;
                        for (ba ba3 : ba2) {
                            if (!(ba3 instanceof s)) continue;
                            if ((n8 += bs.aER.fontRendererObj.bQ(((s)ba3).arr())) <= n4) continue;
                            return ba3;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}

