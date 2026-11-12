/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui.spectator;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.gui.spectator.b;
import net.minecraft.client.gui.spectator.categories.d;
import net.minecraft.util.ba;
import net.minecraft.util.s;

public class a
implements net.minecraft.client.gui.spectator.d {
    private final List<b> bxm = Lists.newArrayList();

    public a() {
        this.bxm.add(new net.minecraft.client.gui.spectator.categories.b());
        this.bxm.add(new d());
    }

    @Override
    public List<b> GN() {
        return this.bxm;
    }

    @Override
    public ba GO() {
        return new s("Press a key to select a command, and again to use it.");
    }
}

