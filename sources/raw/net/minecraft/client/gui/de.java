/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import java.net.UnknownHostException;
import net.minecraft.client.gui.dd;
import net.minecraft.util.an;

class de
implements Runnable {
    final /* synthetic */ dd buE;

    de(dd dd2) {
        this.buE = dd2;
    }

    @Override
    public void run() {
        try {
            this.buE.bux.EP().a(this.buE.buz, -1);
        }
        catch (UnknownHostException unknownHostException) {
            this.buE.buz.bDK = -1L;
            this.buE.buz.bDJ = String.valueOf((Object)an.dvP) + "Can't resolve hostname";
        }
        catch (Exception exception) {
            this.buE.buz.bDK = -1L;
            this.buE.buz.bDJ = String.valueOf((Object)an.dvP) + "Can't connect to server.";
        }
    }
}

