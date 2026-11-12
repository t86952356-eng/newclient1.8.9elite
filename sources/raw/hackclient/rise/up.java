/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.ua;
import net.minecraft.block.Block;
import net.minecraft.util.b;

public class up
extends akg<ua> {
    private boolean aiI;
    @dm
    public final dk<ei> aiJ = ei2 -> {
        if (this.aiI) {
            up.aER.bgK.ue = 0.0;
            ei2.setOnGround(false);
            ei2.setPosY(ei2.getPosY() - (double)0.098f);
            up.aER.bgK.Q(up.aER.bgK.gW, ei2.getPosY(), up.aER.bgK.gY);
            return;
        }
        if (up.aER.bgK.ue > 0.0 || bd.cY <= 3.0f) {
            return;
        }
        Block block = aik.u(new b(ei2.getPosX(), ei2.getPosY() + up.aER.bgK.ue, ei2.getPosZ()));
        if (block.xb().zw()) {
            bd.cY = 0.0f;
            this.aiI = true;
        }
    };
    @dm
    public final dk<fd> aiK = fd2 -> {
        this.aiI = false;
    };

    public up(String string, ua ua2) {
        super(string, ua2);
    }
}

