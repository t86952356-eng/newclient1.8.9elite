/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.Lists
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType$1;
import net.minecraft.util.bg;

public final class BlockFlower$EnumFlowerType
extends Enum<BlockFlower$EnumFlowerType>
implements bg {
    public static final /* enum */ BlockFlower$EnumFlowerType aVa = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUXX, 0, "dandelion");
    public static final /* enum */ BlockFlower$EnumFlowerType aVb = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 0, "poppy");
    public static final /* enum */ BlockFlower$EnumFlowerType aVc = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 1, "blue_orchid", "blueOrchid");
    public static final /* enum */ BlockFlower$EnumFlowerType aVd = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 2, "allium");
    public static final /* enum */ BlockFlower$EnumFlowerType aVe = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 3, "houstonia");
    public static final /* enum */ BlockFlower$EnumFlowerType aVf = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 4, "red_tulip", "tulipRed");
    public static final /* enum */ BlockFlower$EnumFlowerType aVg = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 5, "orange_tulip", "tulipOrange");
    public static final /* enum */ BlockFlower$EnumFlowerType aVh = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 6, "white_tulip", "tulipWhite");
    public static final /* enum */ BlockFlower$EnumFlowerType aVi = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 7, "pink_tulip", "tulipPink");
    public static final /* enum */ BlockFlower$EnumFlowerType aVj = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.aUY, 8, "oxeye_daisy", "oxeyeDaisy");
    private static final BlockFlower$EnumFlowerType[][] aVk;
    private final BlockFlower$EnumFlowerColor aVl;
    private final int aVm;
    private final String name;
    private final String aVo;
    private static final /* synthetic */ BlockFlower$EnumFlowerType[] aVp;

    public static BlockFlower$EnumFlowerType[] values() {
        return (BlockFlower$EnumFlowerType[])aVp.clone();
    }

    public static BlockFlower$EnumFlowerType valueOf(String string) {
        return Enum.valueOf(BlockFlower$EnumFlowerType.class, string);
    }

    private BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor, int n3, String string2) {
        this(blockFlower$EnumFlowerColor, n3, string2, string2);
    }

    private BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor, int n3, String string2, String string3) {
        this.aVl = blockFlower$EnumFlowerColor;
        this.aVm = n3;
        this.name = string2;
        this.aVo = string3;
    }

    public BlockFlower$EnumFlowerColor yp() {
        return this.aVl;
    }

    public int yi() {
        return this.aVm;
    }

    public static BlockFlower$EnumFlowerType a(BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor, int n2) {
        BlockFlower$EnumFlowerType[] blockFlower$EnumFlowerTypeArray = aVk[blockFlower$EnumFlowerColor.ordinal()];
        if (n2 < 0 || n2 >= blockFlower$EnumFlowerTypeArray.length) {
            n2 = 0;
        }
        return blockFlower$EnumFlowerTypeArray[n2];
    }

    public static BlockFlower$EnumFlowerType[] a(BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor) {
        return aVk[blockFlower$EnumFlowerColor.ordinal()];
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String xB() {
        return this.aVo;
    }

    private static /* synthetic */ BlockFlower$EnumFlowerType[] yt() {
        return new BlockFlower$EnumFlowerType[]{aVa, aVb, aVc, aVd, aVe, aVf, aVg, aVh, aVi, aVj};
    }

    static {
        aVp = BlockFlower$EnumFlowerType.yt();
        aVk = new BlockFlower$EnumFlowerType[BlockFlower$EnumFlowerColor.values().length][];
        for (BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor : BlockFlower$EnumFlowerColor.values()) {
            Collection collection = Collections2.filter((Collection)Lists.newArrayList((Object[])BlockFlower$EnumFlowerType.values()), (Predicate)new BlockFlower$EnumFlowerType$1(blockFlower$EnumFlowerColor));
            BlockFlower$EnumFlowerType.aVk[blockFlower$EnumFlowerColor.ordinal()] = collection.toArray(new BlockFlower$EnumFlowerType[0]);
        }
    }
}

