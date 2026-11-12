/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.ahy;
import hackclient.rise.aib;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import rise.util.InstanceAccess;

public final class ahx
implements InstanceAccess {
    public static List<aib> a(aib aib2, aib aib3, boolean bl2) {
        return ahx.a(aib2, aib3, bl2, 9.5);
    }

    public static List<aib> a(aib aib2, aib aib3, boolean bl2, double d2) {
        b b2 = new b(aib2.vn());
        IBlockState iBlockState = ahx.aER.bgF.L(b2);
        if (iBlockState == null) {
            return null;
        }
        Block block = iBlockState.df();
        if (block == null) {
            return null;
        }
        if (!ahx.g(block)) {
            aib2 = aib2.n(0.0, 1.0, 0.0);
        }
        ahy ahy2 = new ahy(aib2, aib3);
        ahy2.vg();
        int n2 = 0;
        aib aib4 = null;
        aib aib5 = null;
        ArrayList<aib> arrayList = new ArrayList<aib>();
        ArrayList<aib> arrayList2 = ahy2.vf();
        for (aib aib6 : arrayList2) {
            if (n2 == 0 || n2 == arrayList2.size() - 1) {
                arrayList.add(aib6.n(0.5, 0.0, 0.5));
                aib5 = aib6;
            } else {
                boolean bl3 = true;
                if (aib6.c(aib5) > d2 * d2) {
                    bl3 = false;
                } else {
                    double d3 = Math.min(aib5.getX(), aib6.getX());
                    double d4 = Math.min(aib5.getY(), aib6.getY());
                    double d5 = Math.min(aib5.getZ(), aib6.getZ());
                    double d6 = Math.max(aib5.getX(), aib6.getX());
                    double d7 = Math.max(aib5.getY(), aib6.getY());
                    double d8 = Math.max(aib5.getZ(), aib6.getZ());
                    int n3 = (int)d3;
                    block1: while ((double)n3 <= d6) {
                        int n4 = (int)d4;
                        while ((double)n4 <= d7) {
                            int n5 = (int)d5;
                            while ((double)n5 <= d8) {
                                if (!ahy.a(n3, n4, n5, false)) {
                                    bl3 = false;
                                    break block1;
                                }
                                ++n5;
                            }
                            ++n4;
                        }
                        ++n3;
                    }
                }
                if (!bl3) {
                    arrayList.add(aib4.n(0.5, 0.0, 0.5));
                    aib5 = aib4;
                }
            }
            aib4 = aib6;
            ++n2;
        }
        if (bl2) {
            arrayList.add(aib3);
        }
        return arrayList;
    }

    private static boolean g(Block block) {
        Material material = block.xb();
        return material == Material.beo || material == Material.bey || material == Material.bez || block == Blocks.cMw || block == Blocks.cLl || block == Blocks.cLk || block == Blocks.cMz || block == Blocks.cMp;
    }

    @Generated
    private ahx() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

