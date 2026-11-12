/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.util.UUID;
import net.minecraft.util.cm;

public class DefaultPlayerSkin {
    private static final cm ccF = new cm("textures/entity/steve.png");
    private static final cm ccG = new cm("textures/entity/alex.png");

    public static cm Pg() {
        return ccF;
    }

    public static cm e(UUID uUID) {
        return DefaultPlayerSkin.g(uUID) ? ccG : ccF;
    }

    public static String f(UUID uUID) {
        return DefaultPlayerSkin.g(uUID) ? "slim" : "default";
    }

    private static boolean g(UUID uUID) {
        return (uUID.hashCode() & 1) == 1;
    }
}

