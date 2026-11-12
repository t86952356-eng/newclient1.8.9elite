/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.resources.data;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.resources.data.AnimationFrame;
import net.minecraft.client.resources.data.IMetadataSection;

public class AnimationMetadataSection
implements IMetadataSection {
    private final List<AnimationFrame> cew;
    private final int cex;
    private final int cey;
    private final int cez;
    private final boolean ceA;

    public AnimationMetadataSection(List<AnimationFrame> list, int n2, int n3, int n4, boolean bl2) {
        this.cew = list;
        this.cex = n2;
        this.cey = n3;
        this.cez = n4;
        this.ceA = bl2;
    }

    public int PY() {
        return this.cey;
    }

    public int PZ() {
        return this.cex;
    }

    public int Of() {
        return this.cew.size();
    }

    public int PW() {
        return this.cez;
    }

    public boolean Qa() {
        return this.ceA;
    }

    private AnimationFrame dU(int n2) {
        return this.cew.get(n2);
    }

    public int dV(int n2) {
        AnimationFrame animationFrame = this.dU(n2);
        return animationFrame.PV() ? this.cez : animationFrame.PW();
    }

    public boolean dW(int n2) {
        return !this.cew.get(n2).PV();
    }

    public int dX(int n2) {
        return this.cew.get(n2).PX();
    }

    public Set<Integer> Qb() {
        HashSet hashSet = Sets.newHashSet();
        for (AnimationFrame animationFrame : this.cew) {
            hashSet.add(animationFrame.PX());
        }
        return hashSet;
    }
}

