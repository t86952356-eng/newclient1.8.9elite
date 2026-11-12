/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.io.File;
import java.io.FileFilter;

class ResourcePackRepository$1
implements FileFilter {
    ResourcePackRepository$1() {
    }

    @Override
    public boolean accept(File file) {
        boolean bl2 = file.isFile() && file.getName().endsWith(".zip");
        boolean bl3 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
        return bl2 || bl3;
    }
}

