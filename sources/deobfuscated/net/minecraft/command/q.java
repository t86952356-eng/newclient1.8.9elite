/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.command;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.nbt.b;
import net.minecraft.nbt.i;
import net.minecraft.tileentity.d;
import net.minecraft.world.w;

public class q
extends a {
    @Override
    public String RX() {
        return "fill";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.fill.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        int n2;
        block24: {
            block19: {
                Object object;
                int n3;
                if (stringArray.length < 7) {
                    throw new bo("commands.fill.usage", new Object[0]);
                }
                aw2.a(ad.cog, 0);
                net.minecraft.util.b b2 = q.a(aw2, stringArray, 0, false);
                net.minecraft.util.b b3 = q.a(aw2, stringArray, 3, false);
                Block block = a.g(aw2, stringArray[6]);
                int n4 = 0;
                if (stringArray.length >= 8) {
                    n4 = q.h(stringArray[7], 0, 15);
                }
                net.minecraft.util.b b4 = new net.minecraft.util.b(Math.min(b2.wt(), b3.wt()), Math.min(b2.wu(), b3.wu()), Math.min(b2.wx(), b3.wx()));
                net.minecraft.util.b b5 = new net.minecraft.util.b(Math.max(b2.wt(), b3.wt()), Math.max(b2.wu(), b3.wu()), Math.max(b2.wx(), b3.wx()));
                n2 = (b5.wt() - b4.wt() + 1) * (b5.wu() - b4.wu() + 1) * (b5.wx() - b4.wx() + 1);
                if (n2 > 32768) {
                    throw new n("commands.fill.tooManyBlocks", n2, 32768);
                }
                if (b4.wu() < 0 || b5.wu() >= 256) break block19;
                w w2 = aw2.Se();
                for (int i2 = b4.wx(); i2 < b5.wx() + 16; i2 += 16) {
                    for (n3 = b4.wt(); n3 < b5.wt() + 16; n3 += 16) {
                        if (w2.aJ(new net.minecraft.util.b(n3, b5.wu() - b4.wu(), i2))) continue;
                        throw new n("commands.fill.outOfWorld", new Object[0]);
                    }
                }
                net.minecraft.nbt.n n5 = new net.minecraft.nbt.n();
                n3 = 0;
                if (stringArray.length >= 10 && block.xj()) {
                    object = q.a(aw2, stringArray, 9).arq();
                    try {
                        n5 = b.ez((String)object);
                        n3 = 1;
                    }
                    catch (i i3) {
                        throw new n("commands.fill.tagError", i3.getMessage());
                    }
                }
                object = Lists.newArrayList();
                n2 = 0;
                for (int i4 = b4.wx(); i4 <= b5.wx(); ++i4) {
                    for (int i5 = b4.wu(); i5 <= b5.wu(); ++i5) {
                        for (int i6 = b4.wt(); i6 <= b5.wt(); ++i6) {
                            d d2;
                            IBlockState iBlockState;
                            Object object2;
                            net.minecraft.util.b b6;
                            block20: {
                                block21: {
                                    block23: {
                                        block22: {
                                            b6 = new net.minecraft.util.b(i6, i5, i4);
                                            if (stringArray.length < 9) break block20;
                                            if (stringArray[8].equals("outline") || stringArray[8].equals("hollow")) break block21;
                                            if (!stringArray[8].equals("destroy")) break block22;
                                            w2.c(b6, true);
                                            break block20;
                                        }
                                        if (!stringArray[8].equals("keep")) break block23;
                                        if (!w2.aG(b6)) {
                                            continue;
                                        }
                                        break block20;
                                    }
                                    if (!stringArray[8].equals("replace") || block.xj()) break block20;
                                    if (stringArray.length > 9) {
                                        object2 = a.g(aw2, stringArray[9]);
                                        if (w2.L(b6).df() != object2) continue;
                                    }
                                    if (stringArray.length <= 10) break block20;
                                    int n6 = a.dM(stringArray[10]);
                                    iBlockState = w2.L(b6);
                                    if (iBlockState.df().c(iBlockState) != n6) {
                                        continue;
                                    }
                                    break block20;
                                }
                                if (i6 != b4.wt() && i6 != b5.wt() && i5 != b4.wu() && i5 != b5.wu() && i4 != b4.wx() && i4 != b5.wx()) {
                                    if (!stringArray[8].equals("hollow")) continue;
                                    w2.a(b6, Blocks.cLc.xM(), 2);
                                    object.add(b6);
                                    continue;
                                }
                            }
                            if ((object2 = w2.K(b6)) != null) {
                                if (object2 instanceof ab) {
                                    ((ab)object2).clear();
                                }
                                w2.a(b6, Blocks.cOx.xM(), block == Blocks.cOx ? 2 : 4);
                            }
                            if (!w2.a(b6, iBlockState = block.aM(n4), 2)) continue;
                            object.add(b6);
                            ++n2;
                            if (n3 == 0 || (d2 = w2.K(b6)) == null) continue;
                            n5.B("x", b6.wt());
                            n5.B("y", b6.wu());
                            n5.B("z", b6.wx());
                            d2.a(n5);
                        }
                    }
                }
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    net.minecraft.util.b b7 = (net.minecraft.util.b)iterator.next();
                    Block block2 = w2.L(b7).df();
                    w2.b(b7, block2);
                }
                if (n2 <= 0) {
                    throw new n("commands.fill.failed", new Object[0]);
                }
                break block24;
            }
            throw new n("commands.fill.outOfWorld", new Object[0]);
        }
        aw2.a(ad.cog, n2);
        q.a(aw2, (au)this, "commands.fill.success", n2);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return stringArray.length > 0 && stringArray.length <= 3 ? q.a(stringArray, 0, b2) : (stringArray.length > 3 && stringArray.length <= 6 ? q.a(stringArray, 3, b2) : (stringArray.length == 7 ? q.a(stringArray, Block.aRV.aty()) : (stringArray.length == 9 ? q.a(stringArray, "replace", "destroy", "keep", "hollow", "outline") : (stringArray.length == 10 && "replace".equals(stringArray[8]) ? q.a(stringArray, Block.aRV.aty()) : null))));
    }
}

