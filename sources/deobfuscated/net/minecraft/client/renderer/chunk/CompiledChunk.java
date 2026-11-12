/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer.chunk;

import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.List;
import net.minecraft.client.renderer.WorldRenderer$State;
import net.minecraft.client.renderer.chunk.CompiledChunk$1;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.chunk.SetVisibility;
import net.minecraft.tileentity.d;
import net.minecraft.util.ao;
import net.minecraft.util.av;

public class CompiledChunk {
    public static final CompiledChunk bTe = new CompiledChunk$1();
    private final boolean[] bTf = new boolean[RenderChunk.bTA.length];
    private final boolean[] bTg = new boolean[RenderChunk.bTA.length];
    private boolean empty = true;
    private final List<d> bTi = Lists.newArrayList();
    private SetVisibility bTj = new SetVisibility();
    private WorldRenderer$State bTk;
    private final BitSet[] bTl = new BitSet[RenderChunk.bTA.length];

    public boolean isEmpty() {
        return this.empty;
    }

    protected void e(av av2) {
        this.empty = false;
        this.bTf[av2.ordinal()] = true;
    }

    public boolean f(av av2) {
        return !this.bTf[av2.ordinal()];
    }

    public void g(av av2) {
        this.bTg[av2.ordinal()] = true;
    }

    public boolean h(av av2) {
        return this.bTg[av2.ordinal()];
    }

    public List<d> MR() {
        return this.bTi;
    }

    public void a(d d2) {
        this.bTi.add(d2);
    }

    public boolean b(ao ao2, ao ao3) {
        return this.bTj.b(ao2, ao3);
    }

    public void a(SetVisibility setVisibility) {
        this.bTj = setVisibility;
    }

    public WorldRenderer$State MS() {
        return this.bTk;
    }

    public void b(WorldRenderer$State worldRenderer$State) {
        this.bTk = worldRenderer$State;
    }

    public BitSet i(av av2) {
        return this.bTl[av2.ordinal()];
    }

    public void a(av av2, BitSet bitSet) {
        this.bTl[av2.ordinal()] = bitSet;
    }
}

