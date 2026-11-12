/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.Random;

public class ae {
    private static final ae dvA = new ae();
    private final Random dvB = new Random();
    private final String[] dvC = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");

    public static ae asr() {
        return dvA;
    }

    public String ass() {
        int n2 = this.dvB.nextInt(2) + 3;
        Object object = "";
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                object = (String)object + " ";
            }
            object = (String)object + this.dvC[this.dvB.nextInt(this.dvC.length)];
        }
        return object;
    }

    public void y(long l2) {
        this.dvB.setSeed(l2);
    }
}

