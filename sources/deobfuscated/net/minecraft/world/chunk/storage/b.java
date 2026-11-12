/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.world.chunk.storage;

import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.nbt.a;
import net.minecraft.nbt.n;
import net.minecraft.util.be;
import net.minecraft.world.ap;
import net.minecraft.world.biome.aj;
import net.minecraft.world.biome.ak;
import net.minecraft.world.chunk.storage.c;
import net.minecraft.world.chunk.storage.d;
import net.minecraft.world.chunk.storage.e;
import net.minecraft.world.chunk.storage.f;
import net.minecraft.world.chunk.storage.j;
import net.minecraft.world.chunk.storage.l;
import net.minecraft.world.storage.k;
import net.minecraft.world.storage.o;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b
extends k {
    private static final Logger dJr = LogManager.getLogger();

    public b(File file) {
        super(file);
    }

    @Override
    public String getName() {
        return "Anvil";
    }

    @Override
    public List<net.minecraft.world.storage.j> axT() {
        if (this.dTH != null && this.dTH.exists() && this.dTH.isDirectory()) {
            File[] fileArray;
            ArrayList arrayList = Lists.newArrayList();
            for (File file : fileArray = this.dTH.listFiles()) {
                String string;
                o o2;
                if (!file.isDirectory() || (o2 = this.gK(string = file.getName())) == null || o2.axU() != 19132 && o2.axU() != 19133) continue;
                boolean bl2 = o2.axU() != this.axU();
                String string2 = o2.aln();
                if (StringUtils.isEmpty((CharSequence)string2)) {
                    string2 = string;
                }
                long l2 = 0L;
                arrayList.add(new net.minecraft.world.storage.j(string, string2, o2.azs(), 0L, o2.If(), bl2, o2.azv(), o2.awD()));
            }
            return arrayList;
        }
        throw new net.minecraft.client.a("Unable to read or access folder where game worlds are saved!");
    }

    protected int axU() {
        return 19133;
    }

    @Override
    public void axV() {
        l.ayd();
    }

    @Override
    public net.minecraft.world.storage.d q(String string, boolean bl2) {
        return new d(this.dTH, string, bl2);
    }

    @Override
    public boolean gF(String string) {
        o o2 = this.gK(string);
        return o2 != null && o2.axU() == 19132;
    }

    @Override
    public boolean gG(String string) {
        o o2 = this.gK(string);
        return o2 != null && o2.axU() != this.axU();
    }

    @Override
    public boolean b(String string, be be2) {
        be2.bv(0);
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        File file = new File(this.dTH, string);
        File file2 = new File(file, "DIM-1");
        File file3 = new File(file, "DIM1");
        dJr.info("Scanning folders...");
        this.a(file, arrayList);
        if (file2.exists()) {
            this.a(file2, arrayList2);
        }
        if (file3.exists()) {
            this.a(file3, arrayList3);
        }
        int n2 = arrayList.size() + arrayList2.size() + arrayList3.size();
        dJr.info("Total conversion count is " + n2);
        o o2 = this.gK(string);
        aj aj2 = null;
        aj2 = o2.awC() == ap.dEE ? new ak(net.minecraft.world.biome.j.dGg, 0.5f) : new aj(o2.avD(), o2.awC(), o2.azM());
        this.a(new File(file, "region"), arrayList, aj2, 0, n2, be2);
        this.a(new File(file2, "region"), arrayList2, (aj)new ak(net.minecraft.world.biome.j.dGn, 0.0f), arrayList.size(), n2, be2);
        this.a(new File(file3, "region"), arrayList3, (aj)new ak(net.minecraft.world.biome.j.dGo, 0.0f), arrayList.size() + arrayList2.size(), n2, be2);
        o2.iP(19133);
        if (o2.awC() == ap.dEJ) {
            o2.a(ap.dED);
        }
        this.gH(string);
        net.minecraft.world.storage.d d2 = this.q(string, false);
        d2.b(o2);
        return true;
    }

    private void gH(String string) {
        File file = new File(this.dTH, string);
        if (!file.exists()) {
            dJr.warn("Unable to create level.dat_mcr backup");
        } else {
            File file2 = new File(file, "level.dat");
            if (!file2.exists()) {
                dJr.warn("Unable to create level.dat_mcr backup");
            } else {
                File file3 = new File(file, "level.dat_mcr");
                if (!file2.renameTo(file3)) {
                    dJr.warn("Unable to create level.dat_mcr backup");
                }
            }
        }
    }

    private void a(File file, Iterable<File> iterable, aj aj2, int n2, int n3, be be2) {
        for (File file2 : iterable) {
            this.a(file, file2, aj2, n2, n3, be2);
            int n4 = (int)Math.round(100.0 * (double)(++n2) / (double)n3);
            be2.bv(n4);
        }
    }

    private void a(File file, File file2, aj aj2, int n2, int n3, be be2) {
        try {
            String string = file2.getName();
            j j2 = new j(file2);
            j j3 = new j(new File(file, string.substring(0, string.length() - ".mcr".length()) + ".mca"));
            for (int i2 = 0; i2 < 32; ++i2) {
                int n4;
                for (n4 = 0; n4 < 32; ++n4) {
                    if (!j2.bd(i2, n4) || j3.bd(i2, n4)) continue;
                    DataInputStream dataInputStream = j2.aZ(i2, n4);
                    if (dataInputStream == null) {
                        dJr.warn("Failed to fetch input stream");
                        continue;
                    }
                    n n5 = a.a(dataInputStream);
                    dataInputStream.close();
                    n n6 = n5.eN("Level");
                    f f2 = e.M(n6);
                    n n7 = new n();
                    n n8 = new n();
                    n7.b("Level", n8);
                    e.a(f2, n8, aj2);
                    DataOutputStream dataOutputStream = j3.ba(i2, n4);
                    a.a(n7, (DataOutput)dataOutputStream);
                    dataOutputStream.close();
                }
                n4 = (int)Math.round(100.0 * (double)(n2 * 1024) / (double)(n3 * 1024));
                int n9 = (int)Math.round(100.0 * (double)((i2 + 1) * 32 + n2 * 1024) / (double)(n3 * 1024));
                if (n9 <= n4) continue;
                be2.bv(n9);
            }
            j2.close();
            j3.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void a(File file, Collection<File> collection) {
        File file2 = new File(file, "region");
        File[] fileArray = file2.listFiles(new c(this));
        if (fileArray != null) {
            Collections.addAll(collection, fileArray);
        }
    }
}

