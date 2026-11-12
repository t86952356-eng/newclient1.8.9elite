/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Map;
import net.minecraft.util.bt;
import net.minecraft.world.gen.structure.ah;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.o;

public class h
extends o {
    private double dPY = 0.004;

    public h() {
    }

    @Override
    public String ayE() {
        return "Mineshaft";
    }

    public h(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!entry.getKey().equals("chance")) continue;
            this.dPY = bt.d(entry.getValue(), this.dPY);
        }
    }

    @Override
    protected boolean bk(int n2, int n3) {
        return this.ta.nextDouble() < this.dPY && this.ta.nextInt(80) < Math.max(Math.abs(n2), Math.abs(n3));
    }

    @Override
    protected cb bl(int n2, int n3) {
        return new ah(this.baU, this.ta, n2, n3);
    }
}

