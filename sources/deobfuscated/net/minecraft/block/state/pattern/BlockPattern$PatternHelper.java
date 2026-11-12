/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.cache.LoadingCache
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Objects;
import com.google.common.cache.LoadingCache;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.util.ao;
import net.minecraft.util.b;

public class BlockPattern$PatternHelper {
    private final b bfP;
    private final ao bfQ;
    private final ao bfR;
    private final LoadingCache<b, BlockWorldState> bfS;
    private final int bfT;
    private final int bfU;
    private final int bfV;

    public BlockPattern$PatternHelper(b b2, ao ao2, ao ao3, LoadingCache<b, BlockWorldState> loadingCache, int n2, int n3, int n4) {
        this.bfP = b2;
        this.bfQ = ao2;
        this.bfR = ao3;
        this.bfS = loadingCache;
        this.bfT = n2;
        this.bfU = n3;
        this.bfV = n4;
    }

    public b Ae() {
        return this.bfP;
    }

    public ao Af() {
        return this.bfQ;
    }

    public ao Ag() {
        return this.bfR;
    }

    public int Ah() {
        return this.bfT;
    }

    public int Ai() {
        return this.bfU;
    }

    public BlockWorldState n(int n2, int n3, int n4) {
        return (BlockWorldState)this.bfS.getUnchecked((Object)BlockPattern.a(this.bfP, this.Af(), this.Ag(), n2, n3, n4));
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("up", (Object)this.bfR).add("forwards", (Object)this.bfQ).add("frontTopLeft", (Object)this.bfP).toString();
    }
}

