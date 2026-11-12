/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.gui.achievement;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.achievement.c;
import net.minecraft.client.gui.cl;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.co;
import net.minecraft.stats.f;
import net.minecraft.stats.l;
import net.minecraft.util.cm;
import org.lwjgl.input.Mouse;

abstract class d
extends cl {
    protected int bvu;
    protected List<l> bvv;
    protected Comparator<l> bvw;
    protected int bvx;
    protected int bvy;
    final /* synthetic */ c bvz;

    protected d(c c2, net.minecraft.client.d d2) {
        this.bvz = c2;
        super(d2, c2.width, c2.height, 32, c2.height - 64, 20);
        this.bvu = -1;
        this.bvx = -1;
        this.setShowSelectionBox(false);
        this.setHasListHeader(true, 20);
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean isSelected(int n2) {
        return false;
    }

    @Override
    protected void drawBackground() {
        this.bvz.drawDefaultBackground();
    }

    @Override
    protected void drawListHeader(int n2, int n3, Tessellator tessellator) {
        if (!Mouse.isButtonDown((int)0)) {
            this.bvu = -1;
        }
        if (this.bvu == 0) {
            this.bvz.f(n2 + 115 - 18, n3 + 1, 0, 0);
        } else {
            this.bvz.f(n2 + 115 - 18, n3 + 1, 0, 18);
        }
        if (this.bvu == 1) {
            this.bvz.f(n2 + 165 - 18, n3 + 1, 0, 0);
        } else {
            this.bvz.f(n2 + 165 - 18, n3 + 1, 0, 18);
        }
        if (this.bvu == 2) {
            this.bvz.f(n2 + 215 - 18, n3 + 1, 0, 0);
        } else {
            this.bvz.f(n2 + 215 - 18, n3 + 1, 0, 18);
        }
        if (this.bvx != -1) {
            int n4 = 79;
            int n5 = 18;
            if (this.bvx == 1) {
                n4 = 129;
            } else if (this.bvx == 2) {
                n4 = 179;
            }
            if (this.bvy == 1) {
                n5 = 36;
            }
            this.bvz.f(n2 + n4, n3 + 1, n5, 0);
        }
    }

    @Override
    protected void func_148132_a(int n2, int n3) {
        this.bvu = -1;
        if (n2 >= 79 && n2 < 115) {
            this.bvu = 0;
        } else if (n2 >= 129 && n2 < 165) {
            this.bvu = 1;
        } else if (n2 >= 179 && n2 < 215) {
            this.bvu = 2;
        }
        if (this.bvu >= 0) {
            this.cd(this.bvu);
            this.mc.Bx().a(PositionedSoundRecord.a(new cm("gui.button.press"), 1.0f));
        }
    }

    @Override
    protected final int getSize() {
        return this.bvv.size();
    }

    protected final l cb(int n2) {
        return this.bvv.get(n2);
    }

    protected abstract String cc(int var1);

    protected void a(f f2, int n2, int n3, boolean bl2) {
        if (f2 != null) {
            String string = f2.hj(this.bvz.bvq.c(f2));
            this.bvz.drawString(c.a(this.bvz), string, n2 - c.b(this.bvz).bQ(string), n3 + 5, bl2 ? 0xFFFFFF : 0x909090);
        } else {
            String string = "-";
            this.bvz.drawString(c.c(this.bvz), "-", n2 - c.d(this.bvz).bQ("-"), n3 + 5, bl2 ? 0xFFFFFF : 0x909090);
        }
    }

    @Override
    protected void func_148142_b(int n2, int n3) {
        if (n3 >= this.top && n3 <= this.bottom) {
            int n4 = this.getSlotIndexFromScreenCoords(n2, n3);
            int n5 = this.width / 2 - 92 - 16;
            if (n4 >= 0) {
                if (n2 < n5 + 40 || n2 > n5 + 40 + 20) {
                    return;
                }
                l l2 = this.cb(n4);
                this.a(l2, n2, n3);
            } else {
                String string = "";
                if (n2 >= n5 + 115 - 18 && n2 <= n5 + 115) {
                    string = this.cc(0);
                } else if (n2 >= n5 + 165 - 18 && n2 <= n5 + 165) {
                    string = this.cc(1);
                } else {
                    if (n2 < n5 + 215 - 18 || n2 > n5 + 215) {
                        return;
                    }
                    string = this.cc(2);
                }
                string = I18n.a(string, new Object[0]).trim();
                if (string.length() > 0) {
                    int n6 = n2 + 12;
                    int n7 = n3 - 12;
                    int n8 = c.e(this.bvz).bQ(string);
                    c.a(this.bvz, n6 - 3, n7 - 3, n6 + n8 + 3, n7 + 8 + 3, -1073741824, -1073741824);
                    c.f(this.bvz).b(string, n6, n7, -1);
                }
            }
        }
    }

    protected void a(l l2, int n2, int n3) {
        net.minecraft.item.d d2;
        co co2;
        String string;
        String string2;
        if (l2 != null && (string2 = I18n.a((string = (co2 = new co(d2 = l2.apw())).xB()) + ".name", new Object[0]).trim()).length() > 0) {
            int n4 = n2 + 12;
            int n5 = n3 - 12;
            int n6 = c.g(this.bvz).bQ(string2);
            c.b(this.bvz, n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
            c.h(this.bvz).b(string2, n4, n5, -1);
        }
    }

    protected void cd(int n2) {
        if (n2 != this.bvx) {
            this.bvx = n2;
            this.bvy = -1;
        } else if (this.bvy == -1) {
            this.bvy = 1;
        } else {
            this.bvx = -1;
            this.bvy = 0;
        }
        Collections.sort(this.bvv, this.bvw);
    }
}

