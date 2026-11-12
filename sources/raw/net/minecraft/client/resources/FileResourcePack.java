/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.resources;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.ResourcePackFileNotFoundException;

public class FileResourcePack
extends AbstractResourcePack
implements Closeable {
    public static final Splitter ccP = Splitter.on((char)'/').omitEmptyStrings().limit(3);
    private ZipFile ccQ;

    public FileResourcePack(File file) {
        super(file);
    }

    private ZipFile Pi() {
        if (this.ccQ == null) {
            this.ccQ = new ZipFile(this.ccE);
        }
        return this.ccQ;
    }

    @Override
    protected InputStream du(String string) {
        ZipFile zipFile = this.Pi();
        ZipEntry zipEntry = zipFile.getEntry(string);
        if (zipEntry == null) {
            throw new ResourcePackFileNotFoundException(this.ccE, string);
        }
        return zipFile.getInputStream(zipEntry);
    }

    @Override
    public boolean dv(String string) {
        try {
            return this.Pi().getEntry(string) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public Set<String> Ph() {
        ZipFile zipFile;
        try {
            zipFile = this.Pi();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        HashSet hashSet = Sets.newHashSet();
        while (enumeration.hasMoreElements()) {
            ArrayList arrayList;
            ZipEntry zipEntry = enumeration.nextElement();
            String string = zipEntry.getName();
            if (!string.startsWith("assets/") || (arrayList = Lists.newArrayList((Iterable)ccP.split((CharSequence)string))).size() <= 1) continue;
            String string2 = (String)arrayList.get(1);
            if (!string2.equals(string2.toLowerCase())) {
                this.dw(string2);
                continue;
            }
            hashSet.add(string2);
        }
        return hashSet;
    }

    protected void finalize() {
        this.close();
        super.finalize();
    }

    @Override
    public void close() {
        if (this.ccQ != null) {
            this.ccQ.close();
            this.ccQ = null;
        }
    }
}

