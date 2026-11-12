/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.client.gui;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import hackclient.rise.agg;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.bg;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.bt;
import net.minecraft.util.l;

public class cq
extends b {
    private final int id;
    private final agg btn;
    public int xPosition;
    public int yPosition;
    private final int bto;
    private final int btp;
    private String text = "";
    private int btq = 32;
    private int btr;
    private boolean bts = true;
    private boolean btt = true;
    private boolean btu;
    private boolean aqI = true;
    private int btv;
    private int btw;
    private int btx;
    private int bty = 0xE0E0E0;
    private int btz = 0x707070;
    private boolean visible = true;
    private bg btA;
    private Predicate<String> btB = Predicates.alwaysTrue();

    public cq(int n2, agg agg2, int n3, int n4, int n5, int n6) {
        this.id = n2;
        this.btn = agg2;
        this.xPosition = n3;
        this.yPosition = n4;
        this.bto = n5;
        this.btp = n6;
    }

    public void a(bg bg2) {
        this.btA = bg2;
    }

    public void Gb() {
        ++this.btr;
    }

    public void bX(String string) {
        if (this.btB.apply((Object)string)) {
            this.text = string.length() > this.btq ? string.substring(0, this.btq) : string;
            this.Ge();
        }
    }

    public String getText() {
        return this.text;
    }

    public String Gc() {
        int n2 = Math.min(this.btw, this.btx);
        int n3 = Math.max(this.btw, this.btx);
        return this.text.substring(n2, n3);
    }

    public void b(Predicate<String> predicate) {
        this.btB = predicate;
    }

    public void cT(String string) {
        Object object = "";
        String string2 = l.fZ(string);
        int n2 = Math.min(this.btw, this.btx);
        int n3 = Math.max(this.btw, this.btx);
        int n4 = this.btq - this.text.length() - (n2 - n3);
        int n5 = 0;
        if (this.text.length() > 0) {
            object = (String)object + this.text.substring(0, n2);
        }
        if (n4 < string2.length()) {
            object = (String)object + string2.substring(0, n4);
            n5 = n4;
        } else {
            object = (String)object + string2;
            n5 = string2.length();
        }
        if (this.text.length() > 0 && n3 < this.text.length()) {
            object = (String)object + this.text.substring(n3);
        }
        if (this.btB.apply(object)) {
            this.text = object;
            this.bT(n2 - this.btx + n5);
            if (this.btA != null) {
                this.btA.d(this.id, this.text);
            }
        }
    }

    public void bQ(int n2) {
        if (this.text.length() != 0) {
            if (this.btx != this.btw) {
                this.cT("");
            } else {
                this.bR(this.bS(n2) - this.btw);
            }
        }
    }

    public void bR(int n2) {
        if (this.text.length() != 0) {
            if (this.btx != this.btw) {
                this.cT("");
            } else {
                boolean bl2 = n2 < 0;
                int n3 = bl2 ? this.btw + n2 : this.btw;
                int n4 = bl2 ? this.btw : this.btw + n2;
                Object object = "";
                if (n3 >= 0) {
                    object = this.text.substring(0, n3);
                }
                if (n4 < this.text.length()) {
                    object = (String)object + this.text.substring(n4);
                }
                if (this.btB.apply(object)) {
                    this.text = object;
                    if (bl2) {
                        this.bT(n2);
                    }
                    if (this.btA != null) {
                        this.btA.d(this.id, this.text);
                    }
                }
            }
        }
    }

    public int getId() {
        return this.id;
    }

    public int bS(int n2) {
        return this.z(n2, this.Gh());
    }

    public int z(int n2, int n3) {
        return this.a(n2, n3, true);
    }

    public int a(int n2, int n3, boolean bl2) {
        int n4 = n3;
        boolean bl3 = n2 < 0;
        int n5 = Math.abs(n2);
        for (int i2 = 0; i2 < n5; ++i2) {
            if (!bl3) {
                int n6 = this.text.length();
                if ((n4 = this.text.indexOf(32, n4)) == -1) {
                    n4 = n6;
                    continue;
                }
                while (bl2 && n4 < n6 && this.text.charAt(n4) == ' ') {
                    ++n4;
                }
                continue;
            }
            while (bl2 && n4 > 0 && this.text.charAt(n4 - 1) == ' ') {
                --n4;
            }
            while (n4 > 0 && this.text.charAt(n4 - 1) != ' ') {
                --n4;
            }
        }
        return n4;
    }

    public void bT(int n2) {
        this.bU(this.btx + n2);
    }

    public void bU(int n2) {
        this.btw = n2;
        int n3 = this.text.length();
        this.btw = bt.F(this.btw, 0, n3);
        this.bY(this.btw);
    }

    public void Gd() {
        this.bU(0);
    }

    public void Ge() {
        this.bU(this.text.length());
    }

    public boolean f(char c2, int n2) {
        if (!this.btu) {
            return false;
        }
        if (GuiScreen.isKeyComboCtrlA(n2)) {
            this.Ge();
            this.bY(0);
            return true;
        }
        if (GuiScreen.isKeyComboCtrlC(n2)) {
            GuiScreen.setClipboardString(this.Gc());
            return true;
        }
        if (GuiScreen.isKeyComboCtrlV(n2)) {
            if (this.aqI) {
                this.cT(GuiScreen.getClipboardString());
            }
            return true;
        }
        if (GuiScreen.isKeyComboCtrlX(n2)) {
            GuiScreen.setClipboardString(this.Gc());
            if (this.aqI) {
                this.cT("");
            }
            return true;
        }
        switch (n2) {
            case 14: {
                if (GuiScreen.isCtrlKeyDown()) {
                    if (this.aqI) {
                        this.bQ(-1);
                    }
                } else if (this.aqI) {
                    this.bR(-1);
                }
                return true;
            }
            case 199: {
                if (GuiScreen.isShiftKeyDown()) {
                    this.bY(0);
                } else {
                    this.Gd();
                }
                return true;
            }
            case 203: {
                if (GuiScreen.isShiftKeyDown()) {
                    if (GuiScreen.isCtrlKeyDown()) {
                        this.bY(this.z(-1, this.Gk()));
                    } else {
                        this.bY(this.Gk() - 1);
                    }
                } else if (GuiScreen.isCtrlKeyDown()) {
                    this.bU(this.bS(-1));
                } else {
                    this.bT(-1);
                }
                return true;
            }
            case 205: {
                if (GuiScreen.isShiftKeyDown()) {
                    if (GuiScreen.isCtrlKeyDown()) {
                        this.bY(this.z(1, this.Gk()));
                    } else {
                        this.bY(this.Gk() + 1);
                    }
                } else if (GuiScreen.isCtrlKeyDown()) {
                    this.bU(this.bS(1));
                } else {
                    this.bT(1);
                }
                return true;
            }
            case 207: {
                if (GuiScreen.isShiftKeyDown()) {
                    this.bY(this.text.length());
                } else {
                    this.Ge();
                }
                return true;
            }
            case 211: {
                if (GuiScreen.isCtrlKeyDown()) {
                    if (this.aqI) {
                        this.bQ(1);
                    }
                } else if (this.aqI) {
                    this.bR(1);
                }
                return true;
            }
        }
        if (l.o(c2)) {
            if (this.aqI) {
                this.cT(Character.toString(c2));
            }
            return true;
        }
        return false;
    }

    public void mouseClicked(int n2, int n3, int n4) {
        boolean bl2;
        boolean bl3 = bl2 = n2 >= this.xPosition && n2 < this.xPosition + this.bto && n3 >= this.yPosition && n3 < this.yPosition + this.btp;
        if (this.btt) {
            this.ag(bl2);
        }
        if (this.btu && bl2 && n4 == 0) {
            int n5 = n2 - this.xPosition;
            if (this.bts) {
                n5 -= 4;
            }
            String string = this.btn.k(this.text.substring(this.btv), this.getWidth());
            this.bU(this.btn.k(string, n5).length() + this.btv);
        }
    }

    public void Gf() {
        if (this.Gl()) {
            if (this.Gi()) {
                cq.drawRect(this.xPosition - 1, this.yPosition - 1, this.xPosition + this.bto + 1, this.yPosition + this.btp + 1, -6250336);
                cq.drawRect(this.xPosition, this.yPosition, this.xPosition + this.bto, this.yPosition + this.btp, -16777216);
            }
            int n2 = this.aqI ? this.bty : this.btz;
            int n3 = this.btw - this.btv;
            int n4 = this.btx - this.btv;
            String string = this.btn.k(this.text.substring(this.btv), this.getWidth());
            boolean bl2 = n3 >= 0 && n3 <= string.length();
            boolean bl3 = this.btu && this.btr / 6 % 2 == 0 && bl2;
            int n5 = this.bts ? this.xPosition + 4 : this.xPosition;
            int n6 = this.bts ? this.yPosition + (this.btp - 8) / 2 : this.yPosition;
            int n7 = n5;
            if (n4 > string.length()) {
                n4 = string.length();
            }
            if (string.length() > 0) {
                String string2 = bl2 ? string.substring(0, n3) : string;
                n7 = this.btn.b(string2, n5, (float)n6 + 1.0f, n2);
            }
            boolean bl4 = this.btw < this.text.length() || this.text.length() >= this.Gg();
            int n8 = n7;
            if (!bl2) {
                n8 = n3 > 0 ? n5 + this.bto : n5;
            } else if (bl4) {
                n8 = n7 - 1;
                --n7;
            }
            if (string.length() > 0 && bl2 && n3 < string.length()) {
                n7 = this.btn.b(string.substring(n3), n7, (float)n6 + 1.0f, n2);
            }
            if (bl3) {
                if (bl4) {
                    b.drawRect(n8, n6 - 1, n8 + 1, n6 + 1 + agg.aIF, -3092272);
                } else {
                    this.btn.b("_", n8, (float)n6 + 1.0f, n2);
                }
            }
            if (n4 != n3) {
                int n9 = n5 + this.btn.bQ(string.substring(0, n4));
                this.e(n8, n6 - 1, n9 - 1, n6 + 1 + agg.aIF);
            }
        }
    }

    private void e(int n2, int n3, int n4, int n5) {
        int n6;
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        if (n3 < n5) {
            n6 = n3;
            n3 = n5;
            n5 = n6;
        }
        if (n4 > this.xPosition + this.bto) {
            n4 = this.xPosition + this.bto;
        }
        if (n2 > this.xPosition + this.bto) {
            n2 = this.xPosition + this.bto;
        }
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        GlStateManager.e(0.0f, 0.0f, 255.0f, 255.0f);
        GlStateManager.JO();
        GlStateManager.JL();
        GlStateManager.cM(5387);
        worldRenderer.a(7, DefaultVertexFormats.cbE);
        worldRenderer.F(n2, n5, 0.0).Lx();
        worldRenderer.F(n4, n5, 0.0).Lx();
        worldRenderer.F(n4, n3, 0.0).Lx();
        worldRenderer.F(n2, n3, 0.0).Lx();
        tessellator.pZ();
        GlStateManager.JM();
        GlStateManager.JN();
    }

    public void bV(int n2) {
        this.btq = n2;
        if (this.text.length() > n2) {
            this.text = this.text.substring(0, n2);
        }
    }

    public int Gg() {
        return this.btq;
    }

    public int Gh() {
        return this.btw;
    }

    public boolean Gi() {
        return this.bts;
    }

    public void af(boolean bl2) {
        this.bts = bl2;
    }

    public void bW(int n2) {
        this.bty = n2;
    }

    public void bX(int n2) {
        this.btz = n2;
    }

    public void ag(boolean bl2) {
        if (bl2 && !this.btu) {
            this.btr = 0;
        }
        this.btu = bl2;
    }

    public boolean Gj() {
        return this.btu;
    }

    public void setEnabled(boolean bl2) {
        this.aqI = bl2;
    }

    public int Gk() {
        return this.btx;
    }

    public int getWidth() {
        return this.Gi() ? this.bto - 8 : this.bto;
    }

    public void bY(int n2) {
        int n3 = this.text.length();
        if (n2 > n3) {
            n2 = n3;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        this.btx = n2;
        if (this.btn != null) {
            if (this.btv > n3) {
                this.btv = n3;
            }
            int n4 = this.getWidth();
            String string = this.btn.k(this.text.substring(this.btv), n4);
            int n5 = string.length() + this.btv;
            if (n2 == this.btv) {
                this.btv -= this.btn.a(this.text, n4, true).length();
            }
            if (n2 > n5) {
                this.btv += n2 - n5;
            } else if (n2 <= this.btv) {
                this.btv -= this.btv - n2;
            }
            this.btv = bt.F(this.btv, 0, n3);
        }
    }

    public void ah(boolean bl2) {
        this.btt = bl2;
    }

    public boolean Gl() {
        return this.visible;
    }

    public void M(boolean bl2) {
        this.visible = bl2;
    }
}

