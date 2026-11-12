/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.b;
import net.minecraft.inventory.z;
import net.minecraft.item.co;

public class a
implements z {
    private final Minecraft bvJ;

    public a(Minecraft minecraft) {
        this.bvJ = minecraft;
    }

    @Override
    public void a(b b2, List<co> list) {
    }

    @Override
    public void a(b b2, int n2, co co2) {
        this.bvJ.bgu.a(co2, n2);
    }

    @Override
    public void a(b b2, int n2, int n3) {
    }

    @Override
    public void a(b b2, ab ab2) {
    }
}

