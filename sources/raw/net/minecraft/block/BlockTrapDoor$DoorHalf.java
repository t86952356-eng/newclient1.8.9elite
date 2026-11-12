/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockTrapDoor$DoorHalf
extends Enum<BlockTrapDoor$DoorHalf>
implements bg {
    public static final /* enum */ BlockTrapDoor$DoorHalf bcL = new BlockTrapDoor$DoorHalf("top");
    public static final /* enum */ BlockTrapDoor$DoorHalf bcM = new BlockTrapDoor$DoorHalf("bottom");
    private final String bcN;
    private static final /* synthetic */ BlockTrapDoor$DoorHalf[] bcO;

    public static BlockTrapDoor$DoorHalf[] values() {
        return (BlockTrapDoor$DoorHalf[])bcO.clone();
    }

    public static BlockTrapDoor$DoorHalf valueOf(String string) {
        return Enum.valueOf(BlockTrapDoor$DoorHalf.class, string);
    }

    private BlockTrapDoor$DoorHalf(String string2) {
        this.bcN = string2;
    }

    public String toString() {
        return this.bcN;
    }

    @Override
    public String getName() {
        return this.bcN;
    }

    private static /* synthetic */ BlockTrapDoor$DoorHalf[] zt() {
        return new BlockTrapDoor$DoorHalf[]{bcL, bcM};
    }

    static {
        bcO = BlockTrapDoor$DoorHalf.zt();
    }
}

