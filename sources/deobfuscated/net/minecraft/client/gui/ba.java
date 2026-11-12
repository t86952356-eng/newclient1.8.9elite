/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ae;
import net.minecraft.client.gui.ah;
import net.minecraft.client.gui.ai;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.bb;
import net.minecraft.client.gui.bc;
import net.minecraft.client.gui.bd;
import net.minecraft.client.gui.be;
import net.minecraft.client.gui.bf;
import net.minecraft.client.gui.bg;
import net.minecraft.client.gui.bh;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cj;
import net.minecraft.client.gui.cq;
import net.minecraft.util.bj;

public class ba
extends ai {
    private final List<bd> bqu = Lists.newArrayList();
    private final bj<b> bqv = new bj();
    private final List<cq> bqw = Lists.newArrayList();
    private final bf[][] bqx;
    private int bqy;
    private final bg bqz;
    private b bqA;

    public ba(Minecraft minecraft, int n2, int n3, int n4, int n5, int n6, bg bg2, bf[] ... bfArray) {
        super(minecraft, n2, n3, n4, n5, n6);
        this.bqz = bg2;
        this.bqx = bfArray;
        this.field_148163_i = false;
        this.Fg();
        this.Fh();
    }

    private void Fg() {
        for (bf[] bfArray : this.bqx) {
            for (int i2 = 0; i2 < bfArray.length; i2 += 2) {
                bf bf2 = bfArray[i2];
                bf bf3 = i2 < bfArray.length - 1 ? bfArray[i2 + 1] : null;
                b b2 = this.a(bf2, 0, bf3 == null);
                b b3 = this.a(bf3, 160, bf2 == null);
                bd bd2 = new bd(b2, b3);
                this.bqu.add(bd2);
                if (bf2 != null && b2 != null) {
                    this.bqv.c(bf2.Fr(), b2);
                    if (b2 instanceof cq) {
                        this.bqw.add((cq)b2);
                    }
                }
                if (bf3 == null || b3 == null) continue;
                this.bqv.c(bf3.Fr(), b3);
                if (!(b3 instanceof cq)) continue;
                this.bqw.add((cq)b3);
            }
        }
    }

    private void Fh() {
        this.bqu.clear();
        for (int i2 = 0; i2 < this.bqx[this.bqy].length; i2 += 2) {
            bf bf2 = this.bqx[this.bqy][i2];
            bf bf3 = i2 < this.bqx[this.bqy].length - 1 ? this.bqx[this.bqy][i2 + 1] : null;
            b b2 = this.bqv.hE(bf2.Fr());
            b b3 = bf3 != null ? this.bqv.hE(bf3.Fr()) : null;
            bd bd2 = new bd(b2, b3);
            this.bqu.add(bd2);
        }
    }

    public void bH(int n2) {
        if (n2 != this.bqy) {
            int n3 = this.bqy;
            this.bqy = n2;
            this.Fh();
            this.x(n3, n2);
            this.amountScrolled = 0.0f;
        }
    }

    public int Fi() {
        return this.bqy;
    }

    public int Fj() {
        return this.bqx.length;
    }

    public b Fk() {
        return this.bqA;
    }

    public void Fl() {
        if (this.bqy > 0) {
            this.bH(this.bqy - 1);
        }
    }

    public void Fm() {
        if (this.bqy < this.bqx.length - 1) {
            this.bH(this.bqy + 1);
        }
    }

    public b bI(int n2) {
        return this.bqv.hE(n2);
    }

    private void x(int n2, int n3) {
        for (bf bf2 : this.bqx[n2]) {
            if (bf2 == null) continue;
            this.a(this.bqv.hE(bf2.Fr()), false);
        }
        for (bf bf2 : this.bqx[n3]) {
            if (bf2 == null) continue;
            this.a(this.bqv.hE(bf2.Fr()), true);
        }
    }

    private void a(b b2, boolean bl2) {
        if (b2 instanceof c) {
            ((c)b2).visible = bl2;
        } else if (b2 instanceof cq) {
            ((cq)b2).M(bl2);
        } else if (b2 instanceof ae) {
            ((ae)b2).visible = bl2;
        }
    }

    private b a(bf bf2, int n2, boolean bl2) {
        return bf2 instanceof bh ? this.a(this.width / 2 - 155 + n2, 0, (bh)bf2) : (bf2 instanceof bc ? this.a(this.width / 2 - 155 + n2, 0, (bc)bf2) : (bf2 instanceof bb ? this.a(this.width / 2 - 155 + n2, 0, (bb)bf2) : (bf2 instanceof be ? this.a(this.width / 2 - 155 + n2, 0, (be)bf2, bl2) : null)));
    }

    public void ac(boolean bl2) {
        for (bd bd2 : this.bqu) {
            if (bd2.bqE instanceof c) {
                ((c)bd2.bqE).enabled = bl2;
            }
            if (!(bd2.bqF instanceof c)) continue;
            ((c)bd2.bqF).enabled = bl2;
        }
    }

    @Override
    public boolean mouseClicked(int n2, int n3, int n4) {
        boolean bl2 = super.mouseClicked(n2, n3, n4);
        int n5 = this.getSlotIndexFromScreenCoords(n2, n3);
        if (n5 >= 0) {
            bd bd2 = this.bJ(n5);
            if (this.bqA != bd2.bqG && this.bqA != null && this.bqA instanceof cq) {
                ((cq)this.bqA).ag(false);
            }
            this.bqA = bd2.bqG;
        }
        return bl2;
    }

    private cj a(int n2, int n3, bh bh2) {
        cj cj2 = new cj(this.bqz, bh2.Fr(), n2, n3, bh2.Fs(), bh2.Fv(), bh2.Fw(), bh2.Fx(), bh2.Fu());
        cj2.visible = bh2.Ft();
        return cj2;
    }

    private ah a(int n2, int n3, bc bc2) {
        ah ah2 = new ah(this.bqz, bc2.Fr(), n2, n3, bc2.Fs(), bc2.Fo());
        ah2.visible = bc2.Ft();
        return ah2;
    }

    private cq a(int n2, int n3, bb bb2) {
        cq cq2 = new cq(bb2.Fr(), this.mc.fontRendererObj, n2, n3, 150, 20);
        cq2.bX(bb2.Fs());
        cq2.a(this.bqz);
        cq2.M(bb2.Ft());
        cq2.b(bb2.Fn());
        return cq2;
    }

    private ae a(int n2, int n3, be be2, boolean bl2) {
        ae ae2 = bl2 ? new ae(this.mc.fontRendererObj, be2.Fr(), n2, n3, this.width - n2 * 2, 20, -1) : new ae(this.mc.fontRendererObj, be2.Fr(), n2, n3, 150, 20, -1);
        ae2.visible = be2.Ft();
        ae2.cM(be2.Fs());
        ae2.EE();
        return ae2;
    }

    public void c(char c2, int n2) {
        block1: {
            int n3;
            block2: {
                cq cq2;
                block3: {
                    int n4;
                    block4: {
                        if (!(this.bqA instanceof cq)) break block1;
                        cq2 = (cq)this.bqA;
                        if (GuiScreen.isKeyComboCtrlV(n2)) break block2;
                        if (n2 != 15) break block3;
                        cq2.ag(false);
                        int n5 = this.bqw.indexOf(this.bqA);
                        n5 = GuiScreen.isShiftKeyDown() ? (n5 == 0 ? this.bqw.size() - 1 : --n5) : (n5 == this.bqw.size() - 1 ? 0 : ++n5);
                        this.bqA = this.bqw.get(n5);
                        cq2 = (cq)this.bqA;
                        cq2.ag(true);
                        int n6 = cq2.yPosition + this.slotHeight;
                        n4 = cq2.yPosition;
                        if (n6 <= this.bottom) break block4;
                        this.amountScrolled += (float)(n6 - this.bottom);
                        break block1;
                    }
                    if (n4 >= this.top) break block1;
                    this.amountScrolled = n4;
                    break block1;
                }
                cq2.f(c2, n2);
                break block1;
            }
            String string = GuiScreen.getClipboardString();
            String[] stringArray = string.split(";");
            int n7 = n3 = this.bqw.indexOf(this.bqA);
            for (String string2 : stringArray) {
                this.bqw.get(n7).bX(string2);
                n7 = n7 == this.bqw.size() - 1 ? 0 : ++n7;
                if (n7 == n3) break;
            }
        }
    }

    public bd bJ(int n2) {
        return this.bqu.get(n2);
    }

    @Override
    public int getSize() {
        return this.bqu.size();
    }

    @Override
    public int getListWidth() {
        return 400;
    }

    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + 32;
    }

    @Override
    public /* synthetic */ aj bB(int n2) {
        return this.bJ(n2);
    }
}

