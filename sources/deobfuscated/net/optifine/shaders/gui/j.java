/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.gui;

import net.minecraft.client.gui.cv;
import net.optifine.shaders.gui.i;

class j
implements cv {
    final /* synthetic */ int eII;
    final /* synthetic */ i eIJ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    j(i i2, int n2) {
        this.eIJ = i2;
        this.eII = n2;
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        if (bl2) {
            this.eIJ.ko(this.eII);
        }
        i.a(this.eIJ).a(this.eIJ.eIH);
    }
}

