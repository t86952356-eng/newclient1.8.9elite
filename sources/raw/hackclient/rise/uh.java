/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.lw;
import hackclient.rise.ua;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.f;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class uh
extends akg<ua> {
    private boolean Tw;
    @dm(cH=0)
    public final dk<ej> aic = ej2 -> {
        Object object;
        Object object2;
        boolean bl2 = false;
        if (this.e(lw.class).isEnabled()) {
            return;
        }
        for (int i2 = 0; i2 <= 200; ++i2) {
            object2 = aik.aER.bgF;
            object = new b(uh.aER.bgK.gW, uh.aER.bgK.gX - (double)i2, uh.aER.bgK.gY);
            Block block = ((w)object2).L((b)object).df();
            if (block != Blocks.cLc || uh.aER.bgK.aO) {
                bl2 = false;
                break;
            }
            bl2 = true;
        }
        if (uh.aER.bgK.csf > 3.0f && !bl2) {
            uh.aER.bgC.dAp = 0.5f;
            da da2 = uh.aER.bgK.aQ(1.0f);
            object = uh.aER.bgF.a(da2, (da)(object2 = new da(da2.dAG, 0.0, da2.dAI)), false, false, false);
            if (object != null && ((ce)object).dzu == cf.dzy && ((ce)object).daS != null) {
                ahn.m(new f(uh.aER.bgK.gW, ((ce)object).daS.dAH, uh.aER.bgK.gY, true));
                uh.aER.bgK.csf = 0.0f;
            }
        }
    };

    public uh(String string, ua ua2) {
        super(string, ua2);
    }
}

