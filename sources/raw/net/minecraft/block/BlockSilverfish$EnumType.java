/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockSilverfish$EnumType$1;
import net.minecraft.block.BlockSilverfish$EnumType$2;
import net.minecraft.block.BlockSilverfish$EnumType$3;
import net.minecraft.block.BlockSilverfish$EnumType$4;
import net.minecraft.block.BlockSilverfish$EnumType$5;
import net.minecraft.block.BlockSilverfish$EnumType$6;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.bg;

public abstract sealed class BlockSilverfish$EnumType
extends Enum<BlockSilverfish$EnumType>
implements bg
permits BlockSilverfish$EnumType$1, BlockSilverfish$EnumType$2, BlockSilverfish$EnumType$3, BlockSilverfish$EnumType$4, BlockSilverfish$EnumType$5, BlockSilverfish$EnumType$6 {
    public static final /* enum */ BlockSilverfish$EnumType bax = new BlockSilverfish$EnumType$1(0, "stone");
    public static final /* enum */ BlockSilverfish$EnumType bay = new BlockSilverfish$EnumType$2(1, "cobblestone", "cobble");
    public static final /* enum */ BlockSilverfish$EnumType baz = new BlockSilverfish$EnumType$3(2, "stone_brick", "brick");
    public static final /* enum */ BlockSilverfish$EnumType baA = new BlockSilverfish$EnumType$4(3, "mossy_brick", "mossybrick");
    public static final /* enum */ BlockSilverfish$EnumType baB = new BlockSilverfish$EnumType$5(4, "cracked_brick", "crackedbrick");
    public static final /* enum */ BlockSilverfish$EnumType baC = new BlockSilverfish$EnumType$6(5, "chiseled_brick", "chiseledbrick");
    private static final BlockSilverfish$EnumType[] baD;
    private final int baE;
    private final String baF;
    private final String baG;
    private static final /* synthetic */ BlockSilverfish$EnumType[] baH;

    public static BlockSilverfish$EnumType[] values() {
        return (BlockSilverfish$EnumType[])baH.clone();
    }

    public static BlockSilverfish$EnumType valueOf(String string) {
        return Enum.valueOf(BlockSilverfish$EnumType.class, string);
    }

    private BlockSilverfish$EnumType(int n3, String string2) {
        this(n3, string2, string2);
    }

    private BlockSilverfish$EnumType(int n3, String string2, String string3) {
        this.baE = n3;
        this.baF = string2;
        this.baG = string3;
    }

    public int yc() {
        return this.baE;
    }

    public String toString() {
        return this.baF;
    }

    public static BlockSilverfish$EnumType bl(int n2) {
        if (n2 < 0 || n2 >= baD.length) {
            n2 = 0;
        }
        return baD[n2];
    }

    @Override
    public String getName() {
        return this.baF;
    }

    public String xB() {
        return this.baG;
    }

    public abstract IBlockState za();

    public static BlockSilverfish$EnumType x(IBlockState iBlockState) {
        for (BlockSilverfish$EnumType blockSilverfish$EnumType : BlockSilverfish$EnumType.values()) {
            if (iBlockState != blockSilverfish$EnumType.za()) continue;
            return blockSilverfish$EnumType;
        }
        return bax;
    }

    private static /* synthetic */ BlockSilverfish$EnumType[] zb() {
        return new BlockSilverfish$EnumType[]{bax, bay, baz, baA, baB, baC};
    }

    static {
        baH = BlockSilverfish$EnumType.zb();
        baD = new BlockSilverfish$EnumType[BlockSilverfish$EnumType.values().length];
        BlockSilverfish$EnumType[] blockSilverfish$EnumTypeArray = BlockSilverfish$EnumType.values();
        int n2 = blockSilverfish$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockSilverfish$EnumType blockSilverfish$EnumType;
            BlockSilverfish$EnumType.baD[blockSilverfish$EnumType.yc()] = blockSilverfish$EnumType = blockSilverfish$EnumTypeArray[i2];
        }
    }
}

