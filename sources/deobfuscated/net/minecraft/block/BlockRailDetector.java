/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailDetector$1;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.item.k;
import net.minecraft.entity.t;
import net.minecraft.inventory.ab;
import net.minecraft.util.a;
import net.minecraft.util.ah;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockRailDetector
extends BlockRailBase {
    public static final PropertyEnum<BlockRailBase$EnumRailDirection> aZl = PropertyEnum.a("shape", BlockRailBase$EnumRailDirection.class, new BlockRailDetector$1());
    public static final PropertyBool aZm = PropertyBool.cs("powered");

    public BlockRailDetector() {
        super(true);
        this.h(this.aSG.zS().a(aZm, false).a(aZl, BlockRailBase$EnumRailDirection.aYQ));
        this.O(true);
    }

    @Override
    public int c(w w2) {
        return 20;
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        if (!w2.dDw && !iBlockState.b(aZm).booleanValue()) {
            this.w(w2, b2, iBlockState);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Random random) {
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if (!w2.dDw && iBlockState.b(aZm).booleanValue()) {
            this.w(w2, b2, iBlockState);
        }
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(aZm) != false ? 15 : 0;
    }

    @Override
    public int b(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(aZm) == false ? 0 : (ao2 == ao.dwr ? 15 : 0);
    }

    private void w(w w2, b b2, IBlockState iBlockState) {
        boolean bl2 = iBlockState.b(aZm);
        boolean bl3 = false;
        List<k> list = this.a(w2, b2, k.class, new Predicate[0]);
        if (!list.isEmpty()) {
            bl3 = true;
        }
        if (bl3 && !bl2) {
            w2.a(b2, iBlockState.a(aZm, true), 3);
            w2.c(b2, this);
            w2.c(b2.aqY(), this);
            w2.f(b2, b2);
        }
        if (!bl3 && bl2) {
            w2.a(b2, iBlockState.a(aZm, false), 3);
            w2.c(b2, this);
            w2.c(b2.aqY(), this);
            w2.f(b2, b2);
        }
        if (bl3) {
            w2.a(b2, (Block)this, this.c(w2));
        }
        w2.f(b2, this);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        super.c(w2, b2, iBlockState);
        this.w(w2, b2, iBlockState);
    }

    @Override
    public IProperty<BlockRailBase$EnumRailDirection> yP() {
        return aZl;
    }

    @Override
    public boolean xJ() {
        return true;
    }

    @Override
    public int h(w w2, b b2) {
        if (w2.L(b2).b(aZm).booleanValue()) {
            List<t> list = this.a(w2, b2, t.class, new Predicate[0]);
            if (!list.isEmpty()) {
                return list.get(0).Wo().Sw();
            }
            List<k> list2 = this.a(w2, b2, k.class, ah.dvI);
            if (!list2.isEmpty()) {
                return net.minecraft.inventory.b.c((ab)((Object)list2.get(0)));
            }
        }
        return 0;
    }

    protected <T extends k> List<T> a(w w2, b b2, Class<T> clazz, Predicate<c> ... predicateArray) {
        a a2 = this.C(b2);
        return predicateArray.length != 1 ? w2.a(clazz, a2) : w2.a(clazz, a2, predicateArray[0]);
    }

    private a C(b b2) {
        float f2 = 0.2f;
        return new a((float)b2.wt() + 0.2f, b2.wu(), (float)b2.wx() + 0.2f, (float)(b2.wt() + 1) - 0.2f, (float)(b2.wu() + 1) - 0.2f, (float)(b2.wx() + 1) - 0.2f);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aZl, BlockRailBase$EnumRailDirection.bg(n2 & 7)).a(aZm, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aZl).yc();
        if (iBlockState.b(aZm).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aZl, aZm);
    }
}

