/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 */
package net.minecraft.client.gui.inventory;

import io.netty.buffer.Unpooled;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.inventory.d;
import net.minecraft.client.gui.inventory.e;
import net.minecraft.client.gui.inventory.f;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.g;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.ab;
import net.minecraft.tileentity.j;
import net.minecraft.util.cm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b
extends i {
    private static final Logger bvK = LogManager.getLogger();
    private static final cm bvL = new cm("textures/gui/container/beacon.png");
    private final net.minecraft.inventory.ab bvM;
    private e bvN;
    private boolean bvO;

    public b(g g2, net.minecraft.inventory.ab ab2) {
        super(new net.minecraft.inventory.c(g2, ab2));
        this.bvM = ab2;
        this.bwg = 230;
        this.bwh = 219;
    }

    @Override
    public void initGui() {
        super.initGui();
        this.bvN = new e(this, -1, this.bwj + 164, this.bwk + 107);
        this.buttonList.add(this.bvN);
        this.buttonList.add(new d(this, -2, this.bwj + 190, this.bwk + 107));
        this.bvO = true;
        this.bvN.enabled = false;
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        int n2 = this.bvM.cx(0);
        int n3 = this.bvM.cx(1);
        int n4 = this.bvM.cx(2);
        if (this.bvO && n2 >= 0) {
            f f2;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            this.bvO = false;
            for (n9 = 0; n9 <= 2; ++n9) {
                n8 = j.dsh[n9].length;
                n7 = n8 * 22 + (n8 - 1) * 2;
                for (n6 = 0; n6 < n8; ++n6) {
                    n5 = j.dsh[n9][n6].id;
                    f2 = new f(this, n9 << 8 | n5, this.bwj + 76 + n6 * 24 - n7 / 2, this.bwk + 22 + n9 * 25, n5, n9);
                    this.buttonList.add(f2);
                    if (n9 >= n2) {
                        f2.enabled = false;
                        continue;
                    }
                    if (n5 != n3) continue;
                    f2.aj(true);
                }
            }
            n9 = 3;
            n8 = j.dsh[3].length + 1;
            n7 = n8 * 22 + (n8 - 1) * 2;
            for (n6 = 0; n6 < n8 - 1; ++n6) {
                n5 = j.dsh[3][n6].id;
                f2 = new f(this, 0x300 | n5, this.bwj + 167 + n6 * 24 - n7 / 2, this.bwk + 47, n5, 3);
                this.buttonList.add(f2);
                if (3 >= n2) {
                    f2.enabled = false;
                    continue;
                }
                if (n5 != n4) continue;
                f2.aj(true);
            }
            if (n3 > 0) {
                f f3 = new f(this, 0x300 | n3, this.bwj + 167 + (n8 - 1) * 24 - n7 / 2, this.bwk + 47, n3, 3);
                this.buttonList.add(f3);
                if (3 >= n2) {
                    f3.enabled = false;
                } else if (n3 == n4) {
                    f3.aj(true);
                }
            }
        }
        this.bvN.enabled = this.bvM.fi(0) != null && n3 > 0;
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == -2) {
            aER.a((GuiScreen)null);
        } else if (c2.id == -1) {
            String string = "MC|Beacon";
            ak ak2 = new ak(Unpooled.buffer());
            ak2.writeInt(this.bvM.cx(1));
            ak2.writeInt(this.bvM.cx(2));
            aER.AU().u(new ab("MC|Beacon", ak2));
            aER.a((GuiScreen)null);
        } else if (c2 instanceof f) {
            if (((f)c2).GC()) {
                return;
            }
            int n2 = c2.id;
            int n3 = n2 & 0xFF;
            int n4 = n2 >> 8;
            if (n4 < 3) {
                this.bvM.K(1, n3);
            } else {
                this.bvM.K(2, n3);
            }
            this.buttonList.clear();
            this.initGui();
            this.updateScreen();
        }
    }

    @Override
    protected void s(int n2, int n3) {
        RenderHelper.Lf();
        this.drawCenteredString(this.fontRendererObj, I18n.a("tile.beacon.primary", new Object[0]), 62, 10, 0xE0E0E0);
        this.drawCenteredString(this.fontRendererObj, I18n.a("tile.beacon.secondary", new Object[0]), 169, 10, 0xE0E0E0);
        for (c c2 : this.buttonList) {
            if (!c2.isMouseOver()) continue;
            c2.drawButtonForegroundLayer(n2 - this.bwj, n3 - this.bwk);
            break;
        }
        RenderHelper.Lh();
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bvL);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
        this.itemRender.zLevel = 100.0f;
        this.itemRender.b(new co(Items.cRS), n4 + 42, n5 + 109);
        this.itemRender.b(new co(Items.cPm), n4 + 42 + 22, n5 + 109);
        this.itemRender.b(new co(Items.cPo), n4 + 42 + 44, n5 + 109);
        this.itemRender.b(new co(Items.cPn), n4 + 42 + 66, n5 + 109);
        this.itemRender.zLevel = 0.0f;
    }

    static /* synthetic */ void a(b b2, String string, int n2, int n3) {
        b2.drawCreativeTabHoveringText(string, n2, n3);
    }

    static /* synthetic */ void b(b b2, String string, int n2, int n3) {
        b2.drawCreativeTabHoveringText(string, n2, n3);
    }

    static /* synthetic */ void c(b b2, String string, int n2, int n3) {
        b2.drawCreativeTabHoveringText(string, n2, n3);
    }
}

