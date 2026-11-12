/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import java.util.Iterator;
import java.util.List;
import net.minecraft.client.model.ah;
import net.minecraft.client.model.ai;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.client.renderer.entity.layers.LayerSheepWool;
import net.minecraft.entity.passive.u;
import net.minecraft.src.a;
import net.optifine.entity.model.ap;
import net.optifine.entity.model.g;

public class as
extends ap {
    public as() {
        super(u.class, "sheep_wool", 0.7f);
    }

    @Override
    public d aCn() {
        return new ah();
    }

    @Override
    public g a(d d2, float f2) {
        LayerSheepWool layerSheepWool;
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        Render render = renderManager.Nx().get(u.class);
        if (!(render instanceof RenderSheep)) {
            a.warn("Not a RenderSheep: " + String.valueOf(render));
            return null;
        }
        if (render.Np() == null) {
            render = new RenderSheep(renderManager, new ai(), 0.7f);
        }
        RenderSheep renderSheep = (RenderSheep)render;
        List list = renderSheep.NG();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            layerSheepWool = iterator.next();
            if (!(layerSheepWool instanceof LayerSheepWool)) continue;
            iterator.remove();
        }
        layerSheepWool = new LayerSheepWool(renderSheep);
        layerSheepWool.bXS = (ah)d2;
        renderSheep.a(layerSheepWool);
        return renderSheep;
    }
}

