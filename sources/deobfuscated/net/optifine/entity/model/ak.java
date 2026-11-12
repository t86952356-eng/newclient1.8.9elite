/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderTntMinecart;
import net.minecraft.entity.item.s;
import net.minecraft.src.a;
import net.optifine.entity.model.ai;
import net.optifine.entity.model.g;

public class ak
extends ai {
    public ak() {
        super(s.class, "tnt_minecart", 0.5f);
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderTntMinecart renderTntMinecart = new RenderTntMinecart(renderManager);
        if (!net.optifine.reflect.g.esx.aDA()) {
            a.warn("Field not found: RenderMinecart.modelMinecart");
            return null;
        }
        net.optifine.reflect.g.a((Object)renderTntMinecart, net.optifine.reflect.g.esx, (Object)d2);
        renderTntMinecart.bUm = f2;
        return renderTntMinecart;
    }
}

