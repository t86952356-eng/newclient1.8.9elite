/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.player.inventory;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ad;
import net.minecraft.inventory.b;
import net.minecraft.util.ba;
import net.minecraft.world.n;
import net.minecraft.world.q;

public class a
extends ad
implements n {
    private final String bHh;
    private final Map<Integer, Integer> bHi = Maps.newHashMap();

    public a(String string, ba ba2, int n2) {
        super(ba2, n2);
        this.bHh = string;
    }

    @Override
    public int cx(int n2) {
        return this.bHi.containsKey(n2) ? this.bHi.get(n2) : 0;
    }

    @Override
    public void K(int n2, int n3) {
        this.bHi.put(n2, n3);
    }

    @Override
    public int IG() {
        return this.bHi.size();
    }

    @Override
    public boolean IH() {
        return false;
    }

    @Override
    public void a(q q2) {
    }

    @Override
    public q II() {
        return q.dCy;
    }

    @Override
    public String xX() {
        return this.bHh;
    }

    @Override
    public b a(g g2, net.minecraft.entity.player.a a2) {
        throw new UnsupportedOperationException();
    }
}

