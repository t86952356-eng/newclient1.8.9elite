/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.em;
import hackclient.rise.mc;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;

public class pk
extends akg<mc> {
    private final akq NR = new akq("Amount", this, (Number)2, (Number)2, (Number)5, (Number)1);
    @dm
    public final dk<em> NS = em2 -> {
        if (pk.aER.bgK.crx % ((Number)this.NR.wD()).intValue() != 0 && pk.aER.bgK.aO) {
            if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pk.aER.bgK.isUsingItem() && pk.aER.bgK.Vk().bP() instanceof bg) {
                em2.cF();
            }
            if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pk.aER.bgK.isUsingItem() && pk.aER.bgK.Vk().bP() instanceof by) {
                em2.cF();
            }
            if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pk.aER.bgK.isUsingItem() && pk.aER.bgK.Vk().bP() instanceof cp) {
                em2.cF();
            }
            if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pk.aER.bgK.isUsingItem() && pk.aER.bgK.Vk().bP() instanceof ai) {
                em2.cF();
            }
        }
    };

    public pk(String string, mc mc2) {
        super(string, mc2);
    }
}

