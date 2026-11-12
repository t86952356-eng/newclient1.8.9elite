/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.commons.io.filefilter.DirectoryFileFilter
 */
package net.minecraft.client.resources;

import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.resources.AbstractResourcePack;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

public class FolderResourcePack
extends AbstractResourcePack {
    public FolderResourcePack(File file) {
        super(file);
    }

    @Override
    protected InputStream du(String string) {
        return new BufferedInputStream(new FileInputStream(new File(this.ccE, string)));
    }

    @Override
    protected boolean dv(String string) {
        return new File(this.ccE, string).isFile();
    }

    @Override
    public Set<String> Ph() {
        HashSet hashSet = Sets.newHashSet();
        File file = new File(this.ccE, "assets/");
        if (file.isDirectory()) {
            for (File file2 : file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY)) {
                String string = FolderResourcePack.a(file, file2);
                if (!string.equals(string.toLowerCase())) {
                    this.dw(string);
                    continue;
                }
                hashSet.add(string.substring(0, string.length() - 1));
            }
        }
        return hashSet;
    }
}

