/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer.texture;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.renderer.texture.Stitcher$Holder;

public class Stitcher$Slot {
    private final int bYL;
    private final int bYM;
    private final int bYN;
    private final int bYO;
    private List<Stitcher$Slot> bYP;
    private Stitcher$Holder bPs;

    public Stitcher$Slot(int n2, int n3, int n4, int n5) {
        this.bYL = n2;
        this.bYM = n3;
        this.bYN = n4;
        this.bYO = n5;
    }

    public Stitcher$Holder NT() {
        return this.bPs;
    }

    public int NU() {
        return this.bYL;
    }

    public int NV() {
        return this.bYM;
    }

    public boolean d(Stitcher$Holder stitcher$Holder) {
        if (this.bPs != null) {
            return false;
        }
        int n2 = stitcher$Holder.getWidth();
        int n3 = stitcher$Holder.getHeight();
        if (n2 <= this.bYN && n3 <= this.bYO) {
            if (n2 == this.bYN && n3 == this.bYO) {
                this.bPs = stitcher$Holder;
                return true;
            }
            if (this.bYP == null) {
                this.bYP = Lists.newArrayListWithCapacity((int)1);
                this.bYP.add(new Stitcher$Slot(this.bYL, this.bYM, n2, n3));
                int n4 = this.bYN - n2;
                int n5 = this.bYO - n3;
                if (n5 > 0 && n4 > 0) {
                    int n6;
                    int n7 = Math.max(this.bYO, n4);
                    if (n7 >= (n6 = Math.max(this.bYN, n5))) {
                        this.bYP.add(new Stitcher$Slot(this.bYL, this.bYM + n3, n2, n5));
                        this.bYP.add(new Stitcher$Slot(this.bYL + n2, this.bYM, n4, this.bYO));
                    } else {
                        this.bYP.add(new Stitcher$Slot(this.bYL + n2, this.bYM, n4, n3));
                        this.bYP.add(new Stitcher$Slot(this.bYL, this.bYM + n3, this.bYN, n5));
                    }
                } else if (n4 == 0) {
                    this.bYP.add(new Stitcher$Slot(this.bYL, this.bYM + n3, n2, n5));
                } else if (n5 == 0) {
                    this.bYP.add(new Stitcher$Slot(this.bYL + n2, this.bYM, n4, n3));
                }
            }
            for (Stitcher$Slot stitcher$Slot : this.bYP) {
                if (!stitcher$Slot.d(stitcher$Holder)) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    public void t(List<Stitcher$Slot> list) {
        if (this.bPs != null) {
            list.add(this);
        } else if (this.bYP != null) {
            for (Stitcher$Slot stitcher$Slot : this.bYP) {
                stitcher$Slot.t(list);
            }
        }
    }

    public String toString() {
        return "Slot{originX=" + this.bYL + ", originY=" + this.bYM + ", width=" + this.bYN + ", height=" + this.bYO + ", texture=" + String.valueOf(this.bPs) + ", subSlots=" + String.valueOf(this.bYP) + "}";
    }
}

