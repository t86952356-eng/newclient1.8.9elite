/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.ax;
import net.minecraft.client.model.az;
import net.minecraft.client.renderer.WorldRenderer;

public class j {
    private final ax[] byU;
    private final az[] byV;
    public final float byW;
    public final float byX;
    public final float byY;
    public final float byZ;
    public final float bza;
    public final float bzb;
    public String bzc;

    public j(ag ag2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5) {
        this(ag2, n2, n3, f2, f3, f4, n4, n5, n6, f5, ag2.bBK);
    }

    public j(ag ag2, int[][] nArray, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean bl2) {
        this.byW = f2;
        this.byX = f3;
        this.byY = f4;
        this.byZ = f2 + f5;
        this.bza = f3 + f6;
        this.bzb = f4 + f7;
        this.byU = new ax[8];
        this.byV = new az[6];
        float f9 = f2 + f5;
        float f10 = f3 + f6;
        float f11 = f4 + f7;
        f2 -= f8;
        f3 -= f8;
        f4 -= f8;
        f9 += f8;
        f10 += f8;
        f11 += f8;
        if (bl2) {
            float f12 = f9;
            f9 = f2;
            f2 = f12;
        }
        ax ax2 = new ax(f2, f3, f4, 0.0f, 0.0f);
        ax ax3 = new ax(f9, f3, f4, 0.0f, 8.0f);
        ax ax4 = new ax(f9, f10, f4, 8.0f, 8.0f);
        ax ax5 = new ax(f2, f10, f4, 8.0f, 0.0f);
        ax ax6 = new ax(f2, f3, f11, 0.0f, 0.0f);
        ax ax7 = new ax(f9, f3, f11, 0.0f, 8.0f);
        ax ax8 = new ax(f9, f10, f11, 8.0f, 8.0f);
        ax ax9 = new ax(f2, f10, f11, 8.0f, 0.0f);
        this.byU[0] = ax2;
        this.byU[1] = ax3;
        this.byU[2] = ax4;
        this.byU[3] = ax5;
        this.byU[4] = ax6;
        this.byU[5] = ax7;
        this.byU[6] = ax8;
        this.byU[7] = ax9;
        this.byV[0] = this.a(new ax[]{ax7, ax3, ax4, ax8}, nArray[4], false, ag2.bBy, ag2.bBz);
        this.byV[1] = this.a(new ax[]{ax2, ax6, ax9, ax5}, nArray[5], false, ag2.bBy, ag2.bBz);
        this.byV[2] = this.a(new ax[]{ax7, ax6, ax2, ax3}, nArray[1], true, ag2.bBy, ag2.bBz);
        this.byV[3] = this.a(new ax[]{ax4, ax5, ax9, ax8}, nArray[0], true, ag2.bBy, ag2.bBz);
        this.byV[4] = this.a(new ax[]{ax3, ax2, ax5, ax4}, nArray[2], false, ag2.bBy, ag2.bBz);
        this.byV[5] = this.a(new ax[]{ax6, ax7, ax8, ax9}, nArray[3], false, ag2.bBy, ag2.bBz);
        if (bl2) {
            for (az az2 : this.byV) {
                az2.Hi();
            }
        }
    }

    private az a(ax[] axArray, int[] nArray, boolean bl2, float f2, float f3) {
        return nArray == null ? null : (bl2 ? new az(axArray, nArray[2], nArray[3], nArray[0], nArray[1], f2, f3) : new az(axArray, nArray[0], nArray[1], nArray[2], nArray[3], f2, f3));
    }

    public j(ag ag2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5, boolean bl2) {
        this.byW = f2;
        this.byX = f3;
        this.byY = f4;
        this.byZ = f2 + (float)n4;
        this.bza = f3 + (float)n5;
        this.bzb = f4 + (float)n6;
        this.byU = new ax[8];
        this.byV = new az[6];
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        float f8 = f4 + (float)n6;
        f2 -= f5;
        f3 -= f5;
        f4 -= f5;
        f6 += f5;
        f7 += f5;
        f8 += f5;
        if (bl2) {
            float f9 = f6;
            f6 = f2;
            f2 = f9;
        }
        ax ax2 = new ax(f2, f3, f4, 0.0f, 0.0f);
        ax ax3 = new ax(f6, f3, f4, 0.0f, 8.0f);
        ax ax4 = new ax(f6, f7, f4, 8.0f, 8.0f);
        ax ax5 = new ax(f2, f7, f4, 8.0f, 0.0f);
        ax ax6 = new ax(f2, f3, f8, 0.0f, 0.0f);
        ax ax7 = new ax(f6, f3, f8, 0.0f, 8.0f);
        ax ax8 = new ax(f6, f7, f8, 8.0f, 8.0f);
        ax ax9 = new ax(f2, f7, f8, 8.0f, 0.0f);
        this.byU[0] = ax2;
        this.byU[1] = ax3;
        this.byU[2] = ax4;
        this.byU[3] = ax5;
        this.byU[4] = ax6;
        this.byU[5] = ax7;
        this.byU[6] = ax8;
        this.byU[7] = ax9;
        this.byV[0] = new az(new ax[]{ax7, ax3, ax4, ax8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n6, n3 + n6 + n5, ag2.bBy, ag2.bBz);
        this.byV[1] = new az(new ax[]{ax2, ax6, ax9, ax5}, n2, n3 + n6, n2 + n6, n3 + n6 + n5, ag2.bBy, ag2.bBz);
        this.byV[2] = new az(new ax[]{ax7, ax6, ax2, ax3}, n2 + n6, n3, n2 + n6 + n4, n3 + n6, ag2.bBy, ag2.bBz);
        this.byV[3] = new az(new ax[]{ax4, ax5, ax9, ax8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n4, n3, ag2.bBy, ag2.bBz);
        this.byV[4] = new az(new ax[]{ax3, ax2, ax5, ax4}, n2 + n6, n3 + n6, n2 + n6 + n4, n3 + n6 + n5, ag2.bBy, ag2.bBz);
        this.byV[5] = new az(new ax[]{ax6, ax7, ax8, ax9}, n2 + n6 + n4 + n6, n3 + n6, n2 + n6 + n4 + n6 + n4, n3 + n6 + n5, ag2.bBy, ag2.bBz);
        if (bl2) {
            for (int i2 = 0; i2 < this.byV.length; ++i2) {
                this.byV[i2].Hi();
            }
        }
    }

    public void a(WorldRenderer worldRenderer, float f2) {
        for (int i2 = 0; i2 < this.byV.length; ++i2) {
            az az2 = this.byV[i2];
            if (az2 == null) continue;
            az2.b(worldRenderer, f2);
        }
    }

    public j cW(String string) {
        this.bzc = string;
        return this;
    }
}

