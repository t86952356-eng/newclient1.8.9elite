/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer.block.statemap;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;

public class StateMap$Builder {
    private IProperty<?> bSj;
    private String bSk;
    private final List<IProperty<?>> bSm = Lists.newArrayList();

    public StateMap$Builder d(IProperty<?> iProperty) {
        this.bSj = iProperty;
        return this;
    }

    public StateMap$Builder dn(String string) {
        this.bSk = string;
        return this;
    }

    public StateMap$Builder a(IProperty<?> ... iPropertyArray) {
        Collections.addAll(this.bSm, iPropertyArray);
        return this;
    }

    public StateMap MC() {
        return new StateMap(this.bSj, this.bSk, this.bSm);
    }
}

