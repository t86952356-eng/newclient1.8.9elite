/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.renderer.block.statemap;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.DefaultStateMapper;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.resources.model.ModelResourceLocation;

public class BlockStateMapper {
    private final Map<Block, IStateMapper> bSh = Maps.newIdentityHashMap();
    private final Set<Block> bSi = Sets.newIdentityHashSet();

    public void b(Block block, IStateMapper iStateMapper) {
        this.bSh.put(block, iStateMapper);
    }

    public void a(Block ... blockArray) {
        Collections.addAll(this.bSi, blockArray);
    }

    public Map<IBlockState, ModelResourceLocation> MB() {
        IdentityHashMap identityHashMap = Maps.newIdentityHashMap();
        for (Block block : Block.aRV) {
            if (this.bSi.contains(block)) continue;
            identityHashMap.putAll(((IStateMapper)Objects.firstNonNull((Object)this.bSh.get(block), (Object)new DefaultStateMapper())).B(block));
        }
        return identityHashMap;
    }
}

