/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import net.minecraft.world.storage.j;

public class l
implements Comparable<l> {
    private final j diV;

    public l(j j2) {
        this.diV = j2;
    }

    public int ajR() {
        return this.diV.azF().awE();
    }

    public String ajS() {
        return this.diV.azD();
    }

    public boolean ajT() {
        return this.diV.azG();
    }

    public boolean ajU() {
        return this.diV.azv();
    }

    public boolean ajV() {
        return this.diV.azE();
    }

    public String ajW() {
        return this.diV.getDisplayName();
    }

    public long ajX() {
        return this.diV.azs();
    }

    public int a(j j2) {
        return this.diV.a(j2);
    }

    public long ajY() {
        return this.diV.ajY();
    }

    public int a(l l2) {
        return this.diV.azs() < l2.ajX() ? 1 : (this.diV.azs() > l2.ajX() ? -1 : this.diV.azD().compareTo(l2.ajS()));
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((l)object);
    }
}

