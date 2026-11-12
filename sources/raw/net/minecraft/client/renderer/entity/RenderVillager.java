/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ar;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.z;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderVillager
extends RenderLiving<z> {
    private static final cm bWq = new cm("textures/entity/villager/villager.png");
    private static final cm bWr = new cm("textures/entity/villager/farmer.png");
    private static final cm bWs = new cm("textures/entity/villager/librarian.png");
    private static final cm bWt = new cm("textures/entity/villager/priest.png");
    private static final cm bWu = new cm("textures/entity/villager/smith.png");
    private static final cm bWv = new cm("textures/entity/villager/butcher.png");

    public RenderVillager(RenderManager renderManager) {
        super(renderManager, new ar(0.0f), 0.5f);
        this.a(new LayerCustomHead(this.NC().bCG));
    }

    public ar NC() {
        return (ar)super.Nk();
    }

    protected cm a(z z2) {
        switch (z2.abq()) {
            case 0: {
                return bWr;
            }
            case 1: {
                return bWs;
            }
            case 2: {
                return bWt;
            }
            case 3: {
                return bWu;
            }
            case 4: {
                return bWv;
            }
        }
        return bWq;
    }

    @Override
    protected void a(z z2, float f2) {
        float f3 = 0.9375f;
        if (z2.Ux() < 0) {
            f3 = (float)((double)f3 * 0.5);
            this.bUm = 0.25f;
        } else {
            this.bUm = 0.5f;
        }
        GlStateManager.i(f3, f3, f3);
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((z)r2, f2);
    }

    @Override
    public /* synthetic */ d Nk() {
        return this.NC();
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((z)c2);
    }
}

