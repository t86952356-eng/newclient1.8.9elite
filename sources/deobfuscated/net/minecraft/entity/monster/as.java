/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.entity.ab;
import net.minecraft.potion.a;

public class as
implements ab {
    public int cFk;

    public void c(Random random) {
        int n2 = random.nextInt(5);
        if (n2 <= 1) {
            this.cFk = a.dgw.id;
        } else if (n2 <= 2) {
            this.cFk = a.dgA.id;
        } else if (n2 <= 3) {
            this.cFk = a.dgF.id;
        } else if (n2 <= 4) {
            this.cFk = a.dgJ.id;
        }
    }
}

