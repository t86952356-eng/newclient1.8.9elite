/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockFlowerPot$EnumFlowerType
extends Enum<BlockFlowerPot$EnumFlowerType>
implements bg {
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVv = new BlockFlowerPot$EnumFlowerType("empty");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVw = new BlockFlowerPot$EnumFlowerType("rose");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVx = new BlockFlowerPot$EnumFlowerType("blue_orchid");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVy = new BlockFlowerPot$EnumFlowerType("allium");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVz = new BlockFlowerPot$EnumFlowerType("houstonia");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVA = new BlockFlowerPot$EnumFlowerType("red_tulip");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVB = new BlockFlowerPot$EnumFlowerType("orange_tulip");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVC = new BlockFlowerPot$EnumFlowerType("white_tulip");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVD = new BlockFlowerPot$EnumFlowerType("pink_tulip");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVE = new BlockFlowerPot$EnumFlowerType("oxeye_daisy");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVF = new BlockFlowerPot$EnumFlowerType("dandelion");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVG = new BlockFlowerPot$EnumFlowerType("oak_sapling");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVH = new BlockFlowerPot$EnumFlowerType("spruce_sapling");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVI = new BlockFlowerPot$EnumFlowerType("birch_sapling");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVJ = new BlockFlowerPot$EnumFlowerType("jungle_sapling");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVK = new BlockFlowerPot$EnumFlowerType("acacia_sapling");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVL = new BlockFlowerPot$EnumFlowerType("dark_oak_sapling");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVM = new BlockFlowerPot$EnumFlowerType("mushroom_red");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVN = new BlockFlowerPot$EnumFlowerType("mushroom_brown");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVO = new BlockFlowerPot$EnumFlowerType("dead_bush");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVP = new BlockFlowerPot$EnumFlowerType("fern");
    public static final /* enum */ BlockFlowerPot$EnumFlowerType aVQ = new BlockFlowerPot$EnumFlowerType("cactus");
    private final String aVR;
    private static final /* synthetic */ BlockFlowerPot$EnumFlowerType[] aVS;

    public static BlockFlowerPot$EnumFlowerType[] values() {
        return (BlockFlowerPot$EnumFlowerType[])aVS.clone();
    }

    public static BlockFlowerPot$EnumFlowerType valueOf(String string) {
        return Enum.valueOf(BlockFlowerPot$EnumFlowerType.class, string);
    }

    private BlockFlowerPot$EnumFlowerType(String string2) {
        this.aVR = string2;
    }

    public String toString() {
        return this.aVR;
    }

    @Override
    public String getName() {
        return this.aVR;
    }

    private static /* synthetic */ BlockFlowerPot$EnumFlowerType[] yu() {
        return new BlockFlowerPot$EnumFlowerType[]{aVv, aVw, aVx, aVy, aVz, aVA, aVB, aVC, aVD, aVE, aVF, aVG, aVH, aVI, aVJ, aVK, aVL, aVM, aVN, aVO, aVP, aVQ};
    }

    static {
        aVS = BlockFlowerPot$EnumFlowerType.yu();
    }
}

