/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk.storage;

import java.io.File;
import java.io.FilenameFilter;
import net.minecraft.world.chunk.storage.b;

class c
implements FilenameFilter {
    c(b b2) {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".mcr");
    }
}

