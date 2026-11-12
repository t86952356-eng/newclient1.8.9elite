/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

import net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing;

class ItemModelGenerator$Span {
    private final ItemModelGenerator.SpanFacing bRu;
    private int bRv;
    private int bRw;
    private final int bRx;

    public ItemModelGenerator$Span(ItemModelGenerator.SpanFacing spanFacing, int n2, int n3) {
        this.bRu = spanFacing;
        this.bRv = n2;
        this.bRw = n2;
        this.bRx = n3;
    }

    public void ds(int n2) {
        if (n2 < this.bRv) {
            this.bRv = n2;
        } else if (n2 > this.bRw) {
            this.bRw = n2;
        }
    }

    public ItemModelGenerator.SpanFacing Mh() {
        return this.bRu;
    }

    public int Mi() {
        return this.bRv;
    }

    public int Mj() {
        return this.bRw;
    }

    public int Mk() {
        return this.bRx;
    }
}

