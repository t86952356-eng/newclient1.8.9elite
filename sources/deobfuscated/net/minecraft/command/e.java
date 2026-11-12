/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.command;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.f;
import net.minecraft.command.n;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.s;

public class e
extends a {
    @Override
    public String RX() {
        return "clone";
    }

    @Override
    public int RS() {
        return 2;
    }

    @Override
    public String c(aw aw2) {
        return "commands.clone.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(aw aw2, String[] stringArray) {
        Object object;
        if (stringArray.length < 9) {
            throw new bo("commands.clone.usage", new Object[0]);
        }
        aw2.a(ad.cog, 0);
        b b2 = e.a(aw2, stringArray, 0, false);
        b b3 = e.a(aw2, stringArray, 3, false);
        b b4 = e.a(aw2, stringArray, 6, false);
        w w2 = new w(b2, b3);
        w w3 = new w(b4, b4.b(w2.ayK()));
        int n2 = w2.ayL() * w2.ayM() * w2.ayN();
        if (n2 > 32768) {
            throw new n("commands.clone.tooManyBlocks", n2, 32768);
        }
        boolean bl2 = false;
        Block block = null;
        int n3 = -1;
        if ((stringArray.length < 11 || !stringArray[10].equals("force") && !stringArray[10].equals("move")) && w2.b(w3)) {
            throw new n("commands.clone.noOverlap", new Object[0]);
        }
        if (stringArray.length >= 11 && stringArray[10].equals("move")) {
            bl2 = true;
        }
        if (w2.dQC < 0 || w2.dQF >= 256 || w3.dQC < 0 || w3.dQF >= 256) throw new n("commands.clone.outOfWorld", new Object[0]);
        net.minecraft.world.w w4 = aw2.Se();
        if (!w4.a(w2) || !w4.a(w3)) throw new n("commands.clone.outOfWorld", new Object[0]);
        boolean bl3 = false;
        if (stringArray.length >= 10) {
            if (stringArray[9].equals("masked")) {
                bl3 = true;
            } else if (stringArray[9].equals("filtered")) {
                if (stringArray.length < 12) {
                    throw new bo("commands.clone.usage", new Object[0]);
                }
                block = e.g(aw2, stringArray[11]);
                if (stringArray.length >= 13) {
                    n3 = e.h(stringArray[12], 0, 15);
                }
            }
        }
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        LinkedList linkedList = Lists.newLinkedList();
        b b5 = new b(w3.dQB - w2.dQB, w3.dQC - w2.dQC, w3.dQD - w2.dQD);
        for (int i2 = w2.dQD; i2 <= w2.dQG; ++i2) {
            for (int i3 = w2.dQC; i3 <= w2.dQF; ++i3) {
                for (int i4 = w2.dQB; i4 <= w2.dQE; ++i4) {
                    Iterator iterator = new b(i4, i3, i2);
                    b b6 = ((b)((Object)iterator)).b(b5);
                    object = w4.L((b)((Object)iterator));
                    if (bl3 && object.df() == Blocks.cLc || block != null && (object.df() != block || n3 >= 0 && object.df().c((IBlockState)object) != n3)) continue;
                    d d2 = w4.K((b)((Object)iterator));
                    if (d2 != null) {
                        net.minecraft.nbt.n n4 = new net.minecraft.nbt.n();
                        d2.b(n4);
                        arrayList2.add(new f(b6, (IBlockState)object, n4));
                        linkedList.addLast(iterator);
                        continue;
                    }
                    if (!object.df().isFullBlock() && !object.df().xf()) {
                        arrayList3.add(new f(b6, (IBlockState)object, null));
                        linkedList.addFirst(iterator);
                        continue;
                    }
                    arrayList.add(new f(b6, (IBlockState)object, null));
                    linkedList.addLast(iterator);
                }
            }
        }
        if (bl2) {
            for (b b7 : linkedList) {
                d d3 = w4.K(b7);
                if (d3 instanceof ab) {
                    ((ab)((Object)d3)).clear();
                }
                w4.a(b7, Blocks.cOx.xM(), 2);
            }
            for (b b8 : linkedList) {
                w4.a(b8, Blocks.cLc.xM(), 3);
            }
        }
        ArrayList arrayList4 = Lists.newArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        List list = Lists.reverse((List)arrayList4);
        for (Iterator iterator : list) {
            d d4 = w4.K(((f)((Object)iterator)).cnJ);
            if (d4 instanceof ab) {
                ((ab)((Object)d4)).clear();
            }
            w4.a(((f)((Object)iterator)).cnJ, Blocks.cOx.xM(), 2);
        }
        n2 = 0;
        for (Iterator iterator : arrayList4) {
            if (!w4.a(((f)((Object)iterator)).cnJ, ((f)((Object)iterator)).cnK, 2)) continue;
            ++n2;
        }
        for (Iterator iterator : arrayList2) {
            d d5 = w4.K(((f)((Object)iterator)).cnJ);
            if (((f)((Object)iterator)).cnL != null && d5 != null) {
                ((f)((Object)iterator)).cnL.B("x", ((f)((Object)iterator)).cnJ.wt());
                ((f)((Object)iterator)).cnL.B("y", ((f)((Object)iterator)).cnJ.wu());
                ((f)((Object)iterator)).cnL.B("z", ((f)((Object)iterator)).cnJ.wx());
                d5.a(((f)((Object)iterator)).cnL);
                d5.Lw();
            }
            w4.a(((f)((Object)iterator)).cnJ, ((f)((Object)iterator)).cnK, 2);
        }
        for (Iterator iterator : list) {
            w4.b(((f)((Object)iterator)).cnJ, ((f)((Object)iterator)).cnK.df());
        }
        List<s> list2 = w4.b(w2, false);
        if (list2 != null) {
            for (s s2 : list2) {
                if (!w2.k(s2.dCC)) continue;
                object = s2.dCC.b(b5);
                w4.b((b)object, s2.df(), (int)(s2.dCD - w4.avH().azq()), s2.hH);
            }
        }
        if (n2 <= 0) {
            throw new n("commands.clone.failed", new Object[0]);
        }
        aw2.a(ad.cog, n2);
        e.a(aw2, (au)this, "commands.clone.success", n2);
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length > 0 && stringArray.length <= 3 ? e.a(stringArray, 0, b2) : (stringArray.length > 3 && stringArray.length <= 6 ? e.a(stringArray, 3, b2) : (stringArray.length > 6 && stringArray.length <= 9 ? e.a(stringArray, 6, b2) : (stringArray.length == 10 ? e.a(stringArray, "replace", "masked", "filtered") : (stringArray.length == 11 ? e.a(stringArray, "normal", "force", "move") : (stringArray.length == 12 && "filtered".equals(stringArray[9]) ? e.a(stringArray, Block.aRV.aty()) : null)))));
    }
}

