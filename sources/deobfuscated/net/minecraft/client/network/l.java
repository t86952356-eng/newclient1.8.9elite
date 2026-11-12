/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 */
package net.minecraft.client.network;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.cv;
import net.minecraft.client.multiplayer.g;
import net.minecraft.client.multiplayer.h;
import net.minecraft.client.network.k;
import net.minecraft.client.network.m;
import net.minecraft.network.play.client.ad;
import net.minecraft.network.play.client.ae;

class l
implements cv {
    final /* synthetic */ k bFd;

    l(k k2) {
        this.bFd = k2;
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        this.bFd.bFc.bEO = Minecraft.getMinecraft();
        if (bl2) {
            if (this.bFd.bFc.bEO.Be() != null) {
                this.bFd.bFc.bEO.Be().a(g.bDS);
            }
            this.bFd.bFc.bEL.B(new ad(this.bFd.bFa, ae.dbZ));
            Futures.addCallback(this.bFd.bFc.bEO.Bs().L(this.bFd.bFb, this.bFd.bFa), (FutureCallback)new m(this));
        } else {
            if (this.bFd.bFc.bEO.Be() != null) {
                this.bFd.bFc.bEO.Be().a(g.bDT);
            }
            this.bFd.bFc.bEL.B(new ad(this.bFd.bFa, ae.dbX));
        }
        h.f(this.bFd.bFc.bEO.Be());
        this.bFd.bFc.bEO.a((GuiScreen)null);
    }
}

