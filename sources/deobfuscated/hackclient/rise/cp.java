/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.cm;
import hackclient.rise.cn;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.r;
import net.minecraft.util.a;
import org.lwjgl.opengl.GL11;
import rise.util.InstanceAccess;

public class cp
extends cm
implements InstanceAccess {
    int hV = 255;

    public cp(cn cn2) {
        super(cn2);
    }

    public cp(r r2, cn cn2) {
        super(cn2);
        this.by = r2;
    }

    @Override
    public void cp() {
        r r2 = (r)this.by;
        if (aER.BF() == null || r2 == null) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glLineWidth((float)1.8f);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GlStateManager.an(true);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        float f2 = cp.aER.bgC.bWY;
        double d2 = this.by.csh + (this.by.gW - this.by.csh) * (double)f2;
        double d3 = this.by.csi + (this.by.gX - this.by.csi) * (double)f2;
        double d4 = this.by.csj + (this.by.gY - this.by.csj) * (double)f2;
        float f3 = this.by.width / 1.15f;
        float f4 = this.by.height + (this.by.isSneaking() ? -0.2f : 0.1f);
        boolean bl2 = false;
        if (r2.cus > 0) {
            bl2 = true;
            this.hV = 0;
            if (r2.cus <= 10) {
                bl2 = true;
            }
        }
        if (this.hV <= 23) {
            bl2 = true;
        }
        ++this.hV;
        Color color = bl2 ? Color.red : this.rP().rQ();
        ait.e(ais.d(color, 60));
        ait.g(new a(d2 - (double)f3 + 0.1, d3 + (double)f4 + 0.1, d4 - (double)f3 + 0.1, d2 + (double)f3 - 0.1, d3, d4 + (double)f3 - 0.1));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
        ait.e(Color.WHITE);
    }
}

