/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.cm;
import hackclient.rise.cn;
import java.awt.Color;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.player.a;
import rise.Client;
import rise.module.impl.render.ESP;
import rise.util.InstanceAccess;

public class cq
extends cm
implements InstanceAccess {
    public cq(cn cn2) {
        super(cn2);
    }

    @Override
    public void cp() {
        boolean bl2 = (Boolean)Client.a.g().c(ESP.class).anS.wD();
        float f2 = cq.aER.bgC.bWY;
        for (a a2 : cq.aER.bgF.dCY) {
            Color color;
            Render<a> render = aER.BF().O(a2);
            if (aER.BF() == null || render == null || a2 == cq.aER.bgK && cq.aER.aIY.chP == 0 || !ait.x(a2) || a2.csb) continue;
            Color color2 = color = a2.cus > 0 ? Color.RED : ais.a(this.a(a2), Color.WHITE, 0.4);
            if (color.getAlpha() <= 0) continue;
            double d2 = a2.crF + (a2.gW - a2.crF) * (double)f2;
            double d3 = a2.crG + (a2.gX - a2.crG) * (double)f2;
            double d4 = a2.crH + (a2.gY - a2.crH) * (double)f2;
            float f3 = a2.crM + (a2.pl - a2.crM) * f2;
            if (bl2) {
                RendererLivingEntity.f(color);
            }
            aER.BF();
            aER.BF();
            aER.BF();
            render.a(a2, d2 - RenderManager.bVA, d3 - RenderManager.bVB, d4 - RenderManager.bVC, f3, f2);
            if (bl2) {
                RendererLivingEntity.ND();
            }
            a2.Tq();
        }
        RenderHelper.Lf();
        cq.aER.bgT.Jj();
    }
}

