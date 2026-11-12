/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.em;
import hackclient.rise.mc;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;

public class pl
extends akg<mc> {
    @dm
    public final dk<em> NT = em2 -> {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pl.aER.bgK.isUsingItem() && pl.aER.bgK.Vk().bP() instanceof bg) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pl.aER.bgK.isUsingItem() && pl.aER.bgK.Vk().bP() instanceof by) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pl.aER.bgK.isUsingItem() && pl.aER.bgK.Vk().bP() instanceof cp) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pl.aER.bgK.isUsingItem() && pl.aER.bgK.Vk().bP() instanceof ai) {
            em2.cF();
        }
    };

    public pl(String string, mc mc2) {
        super(string, mc2);
    }
}

