/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.aif;
import hackclient.rise.aig;
import hackclient.rise.aih;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.inventory.b;
import net.minecraft.item.ai;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.cq;
import net.minecraft.item.d;
import net.minecraft.item.y;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.player.manager.name", "Manager"}, description="module.player.manager.description", category=Category.PLAYER)
public final class InventoryManager_ty
extends Module {
    @EventLink
    public final Listener<PreUpdateEvent> afi = preUpdateEvent -> {
        b b2 = InventoryManager_ty.aER.bgK.cHX;
        if (InventoryManager_ty.aER.bgR instanceof q && InventoryManager_ty.aER.bgK.cHY == b2) {
            int n2;
            int n3 = -1;
            int n4 = -1;
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            int[] nArray = new int[3];
            int[] nArray2 = new int[4];
            Arrays.fill(nArray2, -1);
            Arrays.fill(nArray, -1);
            for (n2 = 5; n2 < 45; ++n2) {
                co co2 = b2.fM(n2).ls();
                if (co2 == null || co2.bP() == null) continue;
                if (co2.bP() instanceof cp) {
                    if (aih.b(co2, b2)) {
                        n3 = n2;
                    }
                } else if (co2.bP() instanceof ai) {
                    if (aih.c(co2, b2)) {
                        n4 = n2;
                    }
                } else {
                    d d2 = co2.bP();
                    if (d2 instanceof cq) {
                        cq cq2 = (cq)d2;
                        int n5 = aih.d(cq2);
                        if (aih.b(co2, b2, n5)) {
                            nArray[n5] = n2;
                        }
                    } else {
                        d2 = co2.bP();
                        if (d2 instanceof y) {
                            y y2 = (y)d2;
                            if (aih.a(co2, b2, y2.cVH)) {
                                nArray2[y2.cVH] = n2;
                            }
                        }
                    }
                }
                if (aih.a(co2, b2)) continue;
                arrayList.add(n2);
            }
            boolean bl2 = true;
            for (n2 = 0; n2 < nArray2.length; ++n2) {
                int n6 = nArray2[n2];
                int n7 = n2 + 5;
                if (n6 == -1 || n6 == n7 || b2.fM(n7).ls() != null || !bl2) continue;
                aif.a(aER, b2.cSL, n6, 0, aig.aOS);
                return;
            }
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                int n8 = (Integer)iterator.next();
                if (!bl2) continue;
                aif.a(aER, b2.cSL, n8, 1, aig.aOV);
                return;
            }
            int n9 = 36;
            if (n3 != -1) {
                if (n3 != n9 && bl2) {
                    aif.a(aER, b2.cSL, n3, n9 - 36, aig.aOT);
                    return;
                }
                ++n9;
            }
            if (n4 != -1) {
                if (n4 != n9 && bl2) {
                    aif.a(aER, b2.cSL, n4, n9 - 36, aig.aOT);
                    return;
                }
                ++n9;
            }
            for (int n10 : nArray) {
                if (n10 == -1) continue;
                if (n10 != n9 && bl2) {
                    aif.a(aER, b2.cSL, n10, n9 - 36, aig.aOT);
                    return;
                }
                ++n9;
            }
        }
    };
}

