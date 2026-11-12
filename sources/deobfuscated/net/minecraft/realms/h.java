/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import net.minecraft.network.r;
import net.minecraft.realms.b;
import net.minecraft.realms.i;
import net.minecraft.realms.n;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h {
    private static final Logger div = LogManager.getLogger();
    private final n diw;
    private volatile boolean dix = false;
    private r diy;

    public h(n n2) {
        this.diw = n2;
    }

    public void v(String string, int n2) {
        b.bX(true);
        new i(this, "Realms-connect-task", string, n2).start();
    }

    public void ajQ() {
        this.dix = true;
    }

    public void tick() {
        if (this.diy != null) {
            if (this.diy.afe()) {
                this.diy.afa();
            } else {
                this.diy.afj();
            }
        }
    }
}

