/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import net.minecraft.util.ba;
import net.minecraft.util.t;

public final class g
extends Enum<g> {
    public static final /* enum */ g bDS = new g("enabled");
    public static final /* enum */ g bDT = new g("disabled");
    public static final /* enum */ g bDU = new g("prompt");
    private final ba bDV;
    private static final /* synthetic */ g[] bDW;

    public static g[] values() {
        return (g[])bDW.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private g(String string2) {
        this.bDV = new t("addServer.resourcePack." + string2, new Object[0]);
    }

    public ba HH() {
        return this.bDV;
    }

    private static /* synthetic */ g[] HI() {
        return new g[]{bDS, bDT, bDU};
    }

    static {
        bDW = g.HI();
    }
}

