/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ft;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.ConcurrentModificationException;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.w;

@gl(aliases={"module.render.chestesp.name"}, description="module.render.chestesp.description", category=gj.RENDER)
public final class wx
extends gi {
    @dm
    public final dk<ft> anL = ft2 -> {
        Runnable runnable = () -> {
            try {
                wx.aER.bgF.dCU.forEach(d2 -> {
                    if (d2 instanceof m || d2 instanceof w) {
                        RendererLivingEntity.f(this.rP().rQ());
                        TileEntityRendererDispatcher.caV.b((d)d2, ft2.getPartialTicks());
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

