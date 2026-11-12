/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.d;
import net.minecraft.client.model.r;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.e;
import net.optifine.entity.model.g;
import net.optifine.entity.model.l;

public class y
extends l {
    public y() {
        super(e.class, "enderman", 0.5f);
    }

    @Override
    public d aCn() {
        return new r(0.0f);
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderEnderman renderEnderman = new RenderEnderman(renderManager);
        renderEnderman.bWL = d2;
        renderEnderman.bUm = f2;
        return renderEnderman;
    }
}

