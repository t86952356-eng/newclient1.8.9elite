/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.tileentity.d;
import net.minecraft.util.bi;

public class r
extends d
implements bi {
    @Override
    public void jA() {
        if (this.baU != null && !this.baU.dDw && this.baU.getTotalWorldTime() % 20L == 0L) {
            this.aUy = this.ahl();
            if (this.aUy instanceof BlockDaylightDetector) {
                ((BlockDaylightDetector)this.aUy).w(this.baU, this.aZf);
            }
        }
    }
}

