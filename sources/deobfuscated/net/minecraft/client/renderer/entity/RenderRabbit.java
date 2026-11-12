/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.l;
import net.minecraft.util.an;
import net.minecraft.util.cm;

public class RenderRabbit
extends RenderLiving<l> {
    private static final cm bVY = new cm("textures/entity/rabbit/brown.png");
    private static final cm bVZ = new cm("textures/entity/rabbit/white.png");
    private static final cm bWa = new cm("textures/entity/rabbit/black.png");
    private static final cm bWb = new cm("textures/entity/rabbit/gold.png");
    private static final cm bWc = new cm("textures/entity/rabbit/salt.png");
    private static final cm bWd = new cm("textures/entity/rabbit/white_splotched.png");
    private static final cm bWe = new cm("textures/entity/rabbit/toast.png");
    private static final cm bWf = new cm("textures/entity/rabbit/caerbannog.png");

    public RenderRabbit(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
    }

    protected cm a(l l2) {
        String string = an.ge(l2.xU());
        if (string != null && string.equals("Toast")) {
            return bWe;
        }
        switch (l2.aaY()) {
            default: {
                return bVY;
            }
            case 1: {
                return bVZ;
            }
            case 2: {
                return bWa;
            }
            case 3: {
                return bWd;
            }
            case 4: {
                return bWb;
            }
            case 5: {
                return bWc;
            }
            case 99: 
        }
        return bWf;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((l)c2);
    }
}

