/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.entity.player.i;

public final class ao
extends Enum<ao> {
    public static final /* enum */ ao dEw = new ao(-1, "");
    public static final /* enum */ ao dEx = new ao(0, "survival");
    public static final /* enum */ ao dEy = new ao(1, "creative");
    public static final /* enum */ ao dEz = new ao(2, "adventure");
    public static final /* enum */ ao dEA = new ao(3, "spectator");
    int id;
    String name;
    private static final /* synthetic */ ao[] dEB;

    public static ao[] values() {
        return (ao[])dEB.clone();
    }

    public static ao valueOf(String string) {
        return Enum.valueOf(ao.class, string);
    }

    private ao(int n3, String string2) {
        this.id = n3;
        this.name = string2;
    }

    public int awE() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void a(i i2) {
        if (this == dEy) {
            i2.cJL = true;
            i2.cJM = true;
            i2.cJJ = true;
        } else if (this == dEA) {
            i2.cJL = true;
            i2.cJM = false;
            i2.cJJ = true;
            i2.cJK = true;
        } else {
            i2.cJL = false;
            i2.cJM = false;
            i2.cJJ = false;
            i2.cJK = false;
        }
        i2.cJN = !this.awF();
    }

    public boolean awF() {
        return this == dEz || this == dEA;
    }

    public boolean amh() {
        return this == dEy;
    }

    public boolean awG() {
        return this == dEx || this == dEz;
    }

    public static ao ii(int n2) {
        for (ao ao2 : ao.values()) {
            if (ao2.id != n2) continue;
            return ao2;
        }
        return dEx;
    }

    public static ao gC(String string) {
        for (ao ao2 : ao.values()) {
            if (!ao2.name.equals(string)) continue;
            return ao2;
        }
        return dEx;
    }

    private static /* synthetic */ ao[] awH() {
        return new ao[]{dEw, dEx, dEy, dEz, dEA};
    }

    static {
        dEB = ao.awH();
    }
}

