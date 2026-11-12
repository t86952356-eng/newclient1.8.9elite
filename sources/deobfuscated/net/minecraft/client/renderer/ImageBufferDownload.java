/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import net.minecraft.client.renderer.IImageBuffer;

public class ImageBufferDownload
implements IImageBuffer {
    private int[] bLY;
    private int arW;
    private int arX;

    @Override
    public BufferedImage d(BufferedImage bufferedImage) {
        if (bufferedImage == null) {
            return null;
        }
        this.arW = 64;
        this.arX = 64;
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int n4 = 1;
        while (this.arW < n2 || this.arX < n3) {
            this.arW *= 2;
            this.arX *= 2;
            n4 *= 2;
        }
        BufferedImage bufferedImage2 = new BufferedImage(this.arW, this.arX, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        if (bufferedImage.getHeight() == 32 * n4) {
            graphics.drawImage(bufferedImage2, 24 * n4, 48 * n4, 20 * n4, 52 * n4, 4 * n4, 16 * n4, 8 * n4, 20 * n4, null);
            graphics.drawImage(bufferedImage2, 28 * n4, 48 * n4, 24 * n4, 52 * n4, 8 * n4, 16 * n4, 12 * n4, 20 * n4, null);
            graphics.drawImage(bufferedImage2, 20 * n4, 52 * n4, 16 * n4, 64 * n4, 8 * n4, 20 * n4, 12 * n4, 32 * n4, null);
            graphics.drawImage(bufferedImage2, 24 * n4, 52 * n4, 20 * n4, 64 * n4, 4 * n4, 20 * n4, 8 * n4, 32 * n4, null);
            graphics.drawImage(bufferedImage2, 28 * n4, 52 * n4, 24 * n4, 64 * n4, 0 * n4, 20 * n4, 4 * n4, 32 * n4, null);
            graphics.drawImage(bufferedImage2, 32 * n4, 52 * n4, 28 * n4, 64 * n4, 12 * n4, 20 * n4, 16 * n4, 32 * n4, null);
            graphics.drawImage(bufferedImage2, 40 * n4, 48 * n4, 36 * n4, 52 * n4, 44 * n4, 16 * n4, 48 * n4, 20 * n4, null);
            graphics.drawImage(bufferedImage2, 44 * n4, 48 * n4, 40 * n4, 52 * n4, 48 * n4, 16 * n4, 52 * n4, 20 * n4, null);
            graphics.drawImage(bufferedImage2, 36 * n4, 52 * n4, 32 * n4, 64 * n4, 48 * n4, 20 * n4, 52 * n4, 32 * n4, null);
            graphics.drawImage(bufferedImage2, 40 * n4, 52 * n4, 36 * n4, 64 * n4, 44 * n4, 20 * n4, 48 * n4, 32 * n4, null);
            graphics.drawImage(bufferedImage2, 44 * n4, 52 * n4, 40 * n4, 64 * n4, 40 * n4, 20 * n4, 44 * n4, 32 * n4, null);
            graphics.drawImage(bufferedImage2, 48 * n4, 52 * n4, 44 * n4, 64 * n4, 52 * n4, 20 * n4, 56 * n4, 32 * n4, null);
        }
        graphics.dispose();
        this.bLY = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
        this.l(0 * n4, 0 * n4, 32 * n4, 16 * n4);
        this.k(32 * n4, 0 * n4, 64 * n4, 32 * n4);
        this.l(0 * n4, 16 * n4, 64 * n4, 32 * n4);
        this.k(0 * n4, 32 * n4, 16 * n4, 48 * n4);
        this.k(16 * n4, 32 * n4, 40 * n4, 48 * n4);
        this.k(40 * n4, 32 * n4, 56 * n4, 48 * n4);
        this.k(0 * n4, 48 * n4, 16 * n4, 64 * n4);
        this.l(16 * n4, 48 * n4, 48 * n4, 64 * n4);
        this.k(48 * n4, 48 * n4, 64 * n4, 64 * n4);
        return bufferedImage2;
    }

    @Override
    public void Ki() {
    }

    private void k(int n2, int n3, int n4, int n5) {
        if (!this.m(n2, n3, n4, n5)) {
            for (int i2 = n2; i2 < n4; ++i2) {
                for (int i3 = n3; i3 < n5; ++i3) {
                    int n6 = i2 + i3 * this.arW;
                    this.bLY[n6] = this.bLY[n6] & 0xFFFFFF;
                }
            }
        }
    }

    private void l(int n2, int n3, int n4, int n5) {
        for (int i2 = n2; i2 < n4; ++i2) {
            for (int i3 = n3; i3 < n5; ++i3) {
                int n6 = i2 + i3 * this.arW;
                this.bLY[n6] = this.bLY[n6] | 0xFF000000;
            }
        }
    }

    private boolean m(int n2, int n3, int n4, int n5) {
        for (int i2 = n2; i2 < n4; ++i2) {
            for (int i3 = n3; i3 < n5; ++i3) {
                int n6 = this.bLY[i2 + i3 * this.arW];
                if ((n6 >> 24 & 0xFF) >= 128) continue;
                return true;
            }
        }
        return false;
    }
}

