/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.gg;
import java.util.ConcurrentModificationException;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.w;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.render.chestesp.name"}, description="module.render.chestesp.description", category=Category.RENDER)
public final class ChestESP
extends Module {
    @EventLink
    public final Listener<Render3DEvent> anL = render3DEvent -> {
        Runnable runnable = () -> {
            try {
                ChestESP.aER.bgF.dCU.forEach(d2 -> {
                    if (d2 instanceof m || d2 instanceof w) {
                        RendererLivingEntity.f(this.rP().rQ());
                        TileEntityRendererDispatcher.caV.b((d)d2, render3DEvent.getPartialTicks());
                        RendererLivingEntity.ND();
                    }
                });
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                // empty catch block
            }
        };
        this.b(gg.kT).c(runnable);
    };
}

