/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import hackclient.rise.a;
import hackclient.rise.rl;
import java.util.Collection;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.b;
import net.minecraft.potion.d;

public abstract class InventoryEffectRenderer
extends i {
    private boolean bLZ;

    public InventoryEffectRenderer(b b2) {
        super(b2);
    }

    @Override
    public void initGui() {
        super.initGui();
        this.GE();
    }

    protected void GE() {
        if (!InventoryEffectRenderer.aER.bgK.VL().isEmpty()) {
            this.bwj = 160 + (this.width - this.bwg - 200) / 2;
            this.bLZ = true;
        } else {
            this.bwj = (this.width - this.bwg) / 2;
            this.bLZ = false;
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        super.drawScreen(n2, n3, f2);
        if (this.bLZ) {
            this.Kj();
        }
    }

    private void Kj() {
        int n2 = this.bwj - 124;
        int n3 = this.bwk;
        int n4 = 166;
        Collection<d> collection = InventoryEffectRenderer.aER.bgK.VL();
        if (!collection.isEmpty()) {
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JA();
            int n5 = 33;
            if (collection.size() > 5) {
                n5 = 132 / (collection.size() - 1);
            }
            for (d d2 : InventoryEffectRenderer.aER.bgK.VL()) {
                try {
                    net.minecraft.potion.a a2 = net.minecraft.potion.a.dgt[d2.aje()];
                    GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                    aER.Bq().a(bwf);
                    this.drawTexturedModalRect((float)n2, n3, 0, 166, 140, 32);
                    if (a2.aiX()) {
                        int n6 = a2.aiY();
                        this.drawTexturedModalRect((float)(n2 + 6), n3 + 7, 0 + n6 % 8 * 18, 198 + n6 / 8 * 18, 18, 18);
                    }
                    Object object = I18n.a(a2.getName(), new Object[0]);
                    if (d2.ajf() == 1) {
                        object = (String)object + " " + I18n.a("enchantment.level.2", new Object[0]);
                    } else if (d2.ajf() == 2) {
                        object = (String)object + " " + I18n.a("enchantment.level.3", new Object[0]);
                    } else if (d2.ajf() == 3) {
                        object = (String)object + " " + I18n.a("enchantment.level.4", new Object[0]);
                    }
                    this.fontRendererObj.b((String)object, n2 + 10 + 18, n3 + 6, 0xFFFFFF);
                    String string = net.minecraft.potion.a.f(d2);
                    this.fontRendererObj.b(string, n2 + 10 + 18, n3 + 6 + 10, 0x7F7F7F);
                    n3 += n5;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    if (a.a.g().c(rl.class).isEnabled()) continue;
                    System.out.println("Potion crasher detected, exiting to prevent detection.");
                    aER.AJ();
                }
            }
        }
    }
}

