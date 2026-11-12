/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.e;
import net.minecraft.util.cm;

public class g
extends i {
    private static final cm bvY = new cm("textures/gui/container/brewing_stand.png");
    private final net.minecraft.entity.player.g bvZ;
    private final ab bwa;

    public g(net.minecraft.entity.player.g g2, ab ab2) {
        super(new e(g2, ab2));
        this.bvZ = g2;
        this.bwa = ab2;
    }

    @Override
    protected void s(int n2, int n3) {
        String string = this.bwa.xW().arq();
        this.fontRendererObj.a(string, (double)(this.bwg / 2 - this.fontRendererObj.bQ(string) / 2), 6.0, 0x404040);
        this.fontRendererObj.a(this.bvZ.xW().arq(), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bvY);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
        int n6 = this.bwa.cx(0);
        if (n6 > 0) {
            int n7 = (int)(28.0f * (1.0f - (float)n6 / 400.0f));
            if (n7 > 0) {
                this.drawTexturedModalRect((float)(n4 + 97), n5 + 16, 176, 0, 9, n7);
            }
            int n8 = n6 / 2 % 7;
            switch (n8) {
                case 0: {
                    n7 = 29;
                    break;
                }
                case 1: {
                    n7 = 24;
                    break;
                }
                case 2: {
                    n7 = 20;
                    break;
                }
                case 3: {
                    n7 = 16;
                    break;
                }
                case 4: {
                    n7 = 11;
                    break;
                }
                case 5: {
                    n7 = 6;
                    break;
                }
                case 6: {
                    n7 = 0;
                }
            }
            if (n7 > 0) {
                this.drawTexturedModalRect((float)(n4 + 65), n5 + 14 + 29 - n7, 185, 29 - n7, 12, n7);
            }
        }
    }
}

