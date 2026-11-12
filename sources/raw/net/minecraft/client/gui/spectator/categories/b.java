/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Ordering
 */
package net.minecraft.client.gui.spectator.categories;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.d;
import net.minecraft.client.gui.cp;
import net.minecraft.client.gui.spectator.categories.c;
import net.minecraft.client.gui.spectator.e;
import net.minecraft.client.gui.spectator.f;
import net.minecraft.client.network.o;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.world.ao;

public class b
implements net.minecraft.client.gui.spectator.b,
net.minecraft.client.gui.spectator.d {
    private static final Ordering<o> bxE = Ordering.from((Comparator)new c());
    private final List<net.minecraft.client.gui.spectator.b> bxF = Lists.newArrayList();

    public b() {
        this(bxE.sortedCopy(d.AZ().AU().Id()));
    }

    public b(Collection<o> collection) {
        for (o o2 : bxE.sortedCopy(collection)) {
            if (o2.If() == ao.dEA) continue;
            this.bxF.add(new e(o2.Ie()));
        }
    }

    @Override
    public List<net.minecraft.client.gui.spectator.b> GN() {
        return this.bxF;
    }

    @Override
    public ba GO() {
        return new s("Select a player to teleport to");
    }

    @Override
    public void b(f f2) {
        f2.a(this);
    }

    @Override
    public ba GP() {
        return new s("Teleport to player");
    }

    @Override
    public void a(float f2, int n2) {
        d.AZ().Bq().a(cp.bti);
        net.minecraft.client.gui.b.drawModalRectWithCustomSizedTexture(0.0f, 0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
    }

    @Override
    public boolean GQ() {
        return !this.bxF.isEmpty();
    }
}

