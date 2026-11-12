/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.boss;

import net.minecraft.entity.boss.f;

public final class a {
    public static float cAW;
    public static int cAX;
    public static String cAY;
    public static boolean cAZ;

    public static void a(f f2, boolean bl2) {
        cAW = f2.getHealth() / f2.getMaxHealth();
        cAX = 100;
        cAY = f2.xW().getFormattedText();
        cAZ = bl2;
    }
}

