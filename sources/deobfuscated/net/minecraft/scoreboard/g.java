/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.scoreboard;

import net.minecraft.scoreboard.b;
import net.minecraft.scoreboard.c;
import net.minecraft.scoreboard.i;

public class g {
    private final i djL;
    private final String name;
    private final b djN;
    private c djO;
    private String displayName;

    public g(i i2, String string, b b2) {
        this.djL = i2;
        this.name = string;
        this.djN = b2;
        this.displayName = string;
        this.djO = b2.aki();
    }

    public i SD() {
        return this.djL;
    }

    public String getName() {
        return this.name;
    }

    public b akp() {
        return this.djN;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void ap(String string) {
        this.displayName = string;
        this.djL.e(this);
    }

    public c aki() {
        return this.djO;
    }

    public void a(c c2) {
        this.djO = c2;
        this.djL.e(this);
    }
}

