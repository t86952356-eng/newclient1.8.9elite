/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.SettableFuture
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.comparator.LastModifiedFileComparator
 *  org.apache.commons.io.filefilter.IOFileFilter
 *  org.apache.commons.io.filefilter.TrueFileFilter
 */
package net.minecraft.client.resources;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.cd;
import net.minecraft.client.resources.FileResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.ResourcePackRepository$1;
import net.minecraft.client.resources.ResourcePackRepository$2;
import net.minecraft.client.resources.ResourcePackRepository$3;
import net.minecraft.client.resources.ResourcePackRepository$Entry;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.client.settings.a;
import net.minecraft.util.ay;
import net.minecraft.util.be;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResourcePackRepository {
    private static final Logger cdu = LogManager.getLogger();
    private static final FileFilter cdv = new ResourcePackRepository$1();
    private final File cdw;
    public final IResourcePack cdx;
    private final File cdy;
    public final IMetadataSerializer cdz;
    private IResourcePack cdA;
    private final ReentrantLock cdB = new ReentrantLock();
    private ListenableFuture<Object> cdC;
    private List<ResourcePackRepository$Entry> cdD = Lists.newArrayList();
    public List<ResourcePackRepository$Entry> cdE = Lists.newArrayList();

    public ResourcePackRepository(File file, File file2, IResourcePack iResourcePack, IMetadataSerializer iMetadataSerializer, a a2) {
        this.cdw = file;
        this.cdy = file2;
        this.cdx = iResourcePack;
        this.cdz = iMetadataSerializer;
        this.PF();
        this.PH();
        Iterator<String> iterator = a2.ccK.iterator();
        block0: while (iterator.hasNext()) {
            String string = iterator.next();
            for (ResourcePackRepository$Entry resourcePackRepository$Entry : this.cdD) {
                if (!resourcePackRepository$Entry.Pm().equals(string)) continue;
                if (resourcePackRepository$Entry.PS() == 1 || a2.cgy.contains(resourcePackRepository$Entry.Pm())) {
                    this.cdE.add(resourcePackRepository$Entry);
                    continue block0;
                }
                iterator.remove();
                cdu.warn("Removed selected resource pack {} because it's no longer compatible", new Object[]{resourcePackRepository$Entry.Pm()});
            }
        }
    }

    private void PF() {
        if (this.cdw.exists()) {
            if (!(this.cdw.isDirectory() || this.cdw.delete() && this.cdw.mkdirs())) {
                cdu.warn("Unable to recreate resourcepack folder, it exists but is not a directory: " + String.valueOf(this.cdw));
            }
        } else if (!this.cdw.mkdirs()) {
            cdu.warn("Unable to create resourcepack folder: " + String.valueOf(this.cdw));
        }
    }

    private List<File> PG() {
        return this.cdw.isDirectory() ? Arrays.asList(this.cdw.listFiles(cdv)) : Collections.emptyList();
    }

    public void PH() {
        ArrayList arrayList = Lists.newArrayList();
        for (File object : this.PG()) {
            ResourcePackRepository$Entry resourcePackRepository$Entry = new ResourcePackRepository$Entry(this, object);
            if (!this.cdD.contains(resourcePackRepository$Entry)) {
                try {
                    resourcePackRepository$Entry.PO();
                    arrayList.add(resourcePackRepository$Entry);
                }
                catch (Exception exception) {
                    arrayList.remove(resourcePackRepository$Entry);
                }
                continue;
            }
            int n2 = this.cdD.indexOf(resourcePackRepository$Entry);
            if (n2 <= -1 || n2 >= this.cdD.size()) continue;
            arrayList.add(this.cdD.get(n2));
        }
        this.cdD.removeAll(arrayList);
        for (ResourcePackRepository$Entry resourcePackRepository$Entry : this.cdD) {
            resourcePackRepository$Entry.PP();
        }
        this.cdD = arrayList;
    }

    public List<ResourcePackRepository$Entry> PI() {
        return ImmutableList.copyOf(this.cdD);
    }

    public List<ResourcePackRepository$Entry> PJ() {
        return ImmutableList.copyOf(this.cdE);
    }

    public void y(List<ResourcePackRepository$Entry> list) {
        this.cdE.clear();
        this.cdE.addAll(list);
    }

    public File PK() {
        return this.cdw;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture<Object> L(String string, String string2) {
        String string3 = string2.matches("^[a-f0-9]{40}$") ? string2 : "legacy";
        File file = new File(this.cdy, string3);
        this.cdB.lock();
        try {
            ListenableFuture<Object> listenableFuture;
            ListenableFuture<Object> listenableFuture2;
            Object object;
            this.PN();
            if (file.exists() && string2.length() == 40) {
                block8: {
                    ListenableFuture<Object> listenableFuture3;
                    ListenableFuture<Object> listenableFuture4;
                    object = Hashing.sha1().hashBytes(Files.toByteArray((File)file)).toString();
                    if (!((String)object).equals(string2)) break block8;
                    ListenableFuture<Object> listenableFuture5 = listenableFuture4 = (listenableFuture3 = this.f(file));
                    return listenableFuture5;
                }
                try {
                    cdu.warn("File " + String.valueOf(file) + " had wrong hash (expected " + string2 + ", found " + (String)object + "). Deleting it.");
                    FileUtils.deleteQuietly((File)file);
                }
                catch (IOException iOException) {
                    cdu.warn("File " + String.valueOf(file) + " couldn't be hashed. Deleting it.", (Throwable)iOException);
                    FileUtils.deleteQuietly((File)file);
                }
            }
            this.PL();
            object = new cd();
            Map<String, String> map = Minecraft.BK();
            Minecraft minecraft = Minecraft.getMinecraft();
            Futures.getUnchecked(minecraft.f(new ResourcePackRepository$2(this, minecraft, (cd)object)));
            SettableFuture settableFuture = SettableFuture.create();
            this.cdC = ay.a(file, string, map, 0x3200000, (be)object, minecraft.Bp());
            Futures.addCallback(this.cdC, (FutureCallback)new ResourcePackRepository$3(this, file, settableFuture));
            ListenableFuture<Object> listenableFuture6 = listenableFuture2 = (listenableFuture = this.cdC);
            return listenableFuture6;
        }
        finally {
            this.cdB.unlock();
        }
    }

    private void PL() {
        ArrayList arrayList = Lists.newArrayList((Iterable)FileUtils.listFiles((File)this.cdy, (IOFileFilter)TrueFileFilter.TRUE, null));
        Collections.sort(arrayList, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        int n2 = 0;
        for (File file : arrayList) {
            if (n2++ < 10) continue;
            cdu.info("Deleting old server resource pack " + file.getName());
            FileUtils.deleteQuietly((File)file);
        }
    }

    public ListenableFuture<Object> f(File file) {
        this.cdA = new FileResourcePack(file);
        return Minecraft.getMinecraft().Ba();
    }

    public IResourcePack PM() {
        return this.cdA;
    }

    public void PN() {
        this.cdB.lock();
        try {
            if (this.cdC != null) {
                this.cdC.cancel(true);
            }
            this.cdC = null;
            if (this.cdA != null) {
                this.cdA = null;
                Minecraft.getMinecraft().Ba();
            }
        }
        finally {
            this.cdB.unlock();
        }
    }
}

