/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.ua;
import net.minecraft.block.Block;
import net.minecraft.client.settings.a;
import net.minecraft.util.b;

public class uu
extends akg<ua> {
    private boolean aiI;
    private boolean aji;
    @dm
    public final dk<ei> ajj = ei2 -> {
        if (this.aji) {
            uu.aER.aIY.chq.ay(true);
        }
        if (this.aiI) {
            uu.aER.bgK.ue = 0.0;
            ei2.setOnGround(false);
            ei2.setPosY(ei2.getPosY() - (double)0.098f);
            uu.aER.bgK.Q(uu.aER.bgK.gW, ei2.getPosY(), uu.aER.bgK.gY);
            return;
        }
        if (uu.aER.bgK.ue > 0.0 || bd.cY <= 3.0f) {
            return;
        }
        Block block = aik.u(new b(ei2.getPosX(), ei2.getPosY() + uu.aER.bgK.ue, ei2.getPosZ()));
        if (block.xb().zw()) {
            bd.cY = 0.0f;
            this.aiI = true;
            this.aji = true;
            uu.aER.aIY.chq.ay(true);
        }
    };
    @dm(cH=-1)
    public final dk<dz> ajk = dz2 -> {
        if (this.aji) {
            dz2.setJump(true);
        }
    };
    @dm(cH=-1)
    public final dk<ed> ajl = ed2 -> {
        if (this.aji && !this.aiI && !ed2.isCancelled()) {
            this.kR();
        }
    };
    @dm
    public final dk<fd> ajm = fd2 -> {
        this.aiI = false;
    };

    public uu(String string, ua ua2) {
        super(string, ua2);
    }

    @Override
    public void onEnable() {
        this.aiI = false;
        this.aji = false;
    }

    @Override
    public void onDisable() {
        this.aiI = false;
        this.kR();
    }

    private void kR() {
        this.aji = false;
        uu.aER.aIY.chq.ay(a.a(uu.aER.aIY.chq));
    }
}

