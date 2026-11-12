/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.player;

import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.util.cm;
import net.optifine.player.b;

public class a
extends ImageBufferDownload {
    private net.minecraft.client.entity.a elT;
    private final cm elU;
    private boolean bjT;

    public a(net.minecraft.client.entity.a a2, cm cm2) {
        this.elT = a2;
        this.elU = cm2;
    }

    @Override
    public BufferedImage d(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = b.f(bufferedImage);
        this.bjT = b.a(bufferedImage, bufferedImage2);
        return bufferedImage2;
    }

    @Override
    public void Ki() {
        if (this.elT != null) {
            this.elT.f(this.elU);
            this.elT.U(this.bjT);
        }
        this.hu();
    }

    public void hu() {
        this.elT = null;
    }

    public boolean Dk() {
        return this.bjT;
    }
}

