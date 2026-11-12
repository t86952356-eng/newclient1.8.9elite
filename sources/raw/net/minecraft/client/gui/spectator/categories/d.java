/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui.spectator.categories;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.gui.cp;
import net.minecraft.client.gui.spectator.b;
import net.minecraft.client.gui.spectator.categories.e;
import net.minecraft.client.gui.spectator.f;
import net.minecraft.scoreboard.h;
import net.minecraft.util.ba;
import net.minecraft.util.s;

public class d
implements b,
net.minecraft.client.gui.spectator.d {
    private final List<b> bxG = Lists.newArrayList();

    public d() {
        net.minecraft.client.d d2 = net.minecraft.client.d.AZ();
        for (h h2 : d2.bgF.SD().akE()) {
            this.bxG.add(new e(this, h2));
        }
    }

    @Override
    public List<b> GN() {
        return this.bxG;
    }

    @Override
    public ba GO() {
        return new s("Select a team to teleport to");
    }

    @Override
    public void b(f f2) {
        f2.a(this);
    }

    @Override
    public ba GP() {
        return new s("Teleport to team member");
    }

    @Override
    public void a(float f2, int n2) {
        net.minecraft.client.d.AZ().Bq().a(cp.bti);
        net.minecraft.client.gui.b.drawModalRectWithCustomSizedTexture(0.0f, 0.0f, 16.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
    }

    @Override
    public boolean GQ() {
        for (b b2 : this.bxG) {
            if (!b2.GQ()) continue;
            return true;
        }
        return false;
    }
}

