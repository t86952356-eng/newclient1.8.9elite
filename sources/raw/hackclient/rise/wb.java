/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tn;
import net.minecraft.item.co;

public class wb
extends akg<tn> {
    @dm
    public final dk<ei> akS = ei2 -> {
        if (wb.aER.aIY.chq.Re() && aik.ay(2) && wb.aER.bgK.tR > 3) {
            co co2 = wb.aER.bgK.cHV.cJC[wb.aER.bgK.cHV.cJE];
            if (co2 == null || co2.cWZ > 2) {
                // empty if block
            }
            if (!aii.isMoving()) {
                ei2.setOnGround(true);
                wb.aER.bgK.aO = true;
                wb.aER.bgK.ue = 0.5;
                if (wb.aER.bgK.aRg % 2 == 0) {
                    ei2.setPosX(ei2.getPosX() + 0.1);
                }
            }
        }
    };

    public wb(String string, tn tn2) {
        super(string, tn2);
    }
}

