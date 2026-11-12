/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import net.minecraft.block.Block;

public class ScriptBlock
extends ScriptWrapper<Block> {
    public ScriptBlock(Block block) {
        super(block);
    }

    public int getId() {
        return Block.i((Block)this.wrapped);
    }

    public String getName() {
        return ((Block)this.wrapped).xA();
    }

    public boolean isOpaque() {
        return ((Block)this.wrapped).xk();
    }

    public boolean isFullBlock() {
        return ((Block)this.wrapped).isFullBlock();
    }
}

