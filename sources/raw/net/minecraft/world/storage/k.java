/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.storage;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.nbt.a;
import net.minecraft.nbt.n;
import net.minecraft.util.be;
import net.minecraft.world.storage.c;
import net.minecraft.world.storage.d;
import net.minecraft.world.storage.j;
import net.minecraft.world.storage.l;
import net.minecraft.world.storage.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class k
implements c {
    private static final Logger dTG = LogManager.getLogger();
    protected final File dTH;

    public k(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        this.dTH = file;
    }

    @Override
    public String getName() {
        return "Old Format";
    }

    @Override
    public List<j> axT() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < 5; ++i2) {
            String string = "World" + (i2 + 1);
            o o2 = this.gK(string);
            if (o2 == null) continue;
            arrayList.add(new j(string, "", o2.azs(), o2.ajY(), o2.If(), false, o2.azv(), o2.awD()));
        }
        return arrayList;
    }

    @Override
    public void axV() {
    }

    @Override
    public o gK(String string) {
        File file = new File(this.dTH, string);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                n n2 = a.f(new FileInputStream(file2));
                n n3 = n2.eN("Data");
                return new o(n3);
            }
            catch (Exception exception) {
                dTG.error("Exception reading " + String.valueOf(file2), (Throwable)exception);
            }
        }
        if ((file2 = new File(file, "level.dat_old")).exists()) {
            try {
                n n4 = a.f(new FileInputStream(file2));
                n n5 = n4.eN("Data");
                return new o(n5);
            }
            catch (Exception exception) {
                dTG.error("Exception reading " + String.valueOf(file2), (Throwable)exception);
            }
        }
        return null;
    }

    @Override
    public void Z(String string, String string2) {
        File file;
        File file2 = new File(this.dTH, string);
        if (file2.exists() && (file = new File(file2, "level.dat")).exists()) {
            try {
                n n2 = a.f(new FileInputStream(file));
                n n3 = n2.eN("Data");
                n3.R("LevelName", string2);
                a.a(n2, new FileOutputStream(file));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public boolean gL(String string) {
        File file = new File(this.dTH, string);
        if (file.exists()) {
            return false;
        }
        try {
            file.mkdir();
            file.delete();
            return true;
        }
        catch (Throwable throwable) {
            dTG.warn("Couldn't make new level", throwable);
            return false;
        }
    }

    @Override
    public boolean gM(String string) {
        File file = new File(this.dTH, string);
        if (!file.exists()) {
            return true;
        }
        dTG.info("Deleting level " + string);
        for (int i2 = 1; i2 <= 5; ++i2) {
            dTG.info("Attempt " + i2 + "...");
            if (k.a(file.listFiles())) break;
            dTG.warn("Unsuccessful in deleting contents.");
            if (i2 >= 5) continue;
            try {
                Thread.sleep(500L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return file.delete();
    }

    protected static boolean a(File[] fileArray) {
        for (int i2 = 0; i2 < fileArray.length; ++i2) {
            File file = fileArray[i2];
            dTG.debug("Deleting " + String.valueOf(file));
            if (file.isDirectory() && !k.a(file.listFiles())) {
                dTG.warn("Couldn't delete directory " + String.valueOf(file));
                return false;
            }
            if (file.delete()) continue;
            dTG.warn("Couldn't delete file " + String.valueOf(file));
            return false;
        }
        return true;
    }

    @Override
    public d q(String string, boolean bl2) {
        return new l(this.dTH, string, bl2);
    }

    @Override
    public boolean gF(String string) {
        return false;
    }

    @Override
    public boolean gG(String string) {
        return false;
    }

    @Override
    public boolean b(String string, be be2) {
        return false;
    }

    @Override
    public boolean gN(String string) {
        File file = new File(this.dTH, string);
        return file.isDirectory();
    }
}

