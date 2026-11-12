/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 */
package net.optifine.shaders;

import com.google.common.base.Joiner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.src.a;
import net.optifine.shaders.m;
import net.optifine.util.aj;

public class ae
implements m {
    protected File ewo;
    protected ZipFile ewp;
    protected String ewq;

    public ae(String string, File file) {
        this.ewo = file;
        this.ewp = null;
        this.ewq = "";
    }

    @Override
    public void close() {
        if (this.ewp != null) {
            try {
                this.ewp.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.ewp = null;
        }
    }

    @Override
    public InputStream iz(String string) {
        try {
            ZipEntry zipEntry;
            String string2;
            if (this.ewp == null) {
                this.ewp = new ZipFile(this.ewo);
                this.ewq = this.a(this.ewp);
            }
            if ((string2 = aj.ax(string, "/")).contains("..")) {
                string2 = this.iJ(string2);
            }
            return (zipEntry = this.ewp.getEntry(this.ewq + string2)) == null ? null : this.ewp.getInputStream(zipEntry);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private String iJ(String string) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        String[] stringArray = a.V(string, "/");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (string2.equals("..")) {
                if (arrayDeque.isEmpty()) {
                    return "";
                }
                arrayDeque.removeLast();
                continue;
            }
            arrayDeque.add(string2);
        }
        String string3 = Joiner.on((char)'/').join(arrayDeque);
        return string3;
    }

    private String a(ZipFile zipFile) {
        ZipEntry zipEntry = zipFile.getEntry("shaders/");
        if (zipEntry != null && zipEntry.isDirectory()) {
            return "";
        }
        Pattern pattern = Pattern.compile("([^/]+/)shaders/");
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        while (enumeration.hasMoreElements()) {
            String string;
            ZipEntry zipEntry2 = enumeration.nextElement();
            String string2 = zipEntry2.getName();
            Matcher matcher = pattern.matcher(string2);
            if (!matcher.matches() || (string = matcher.group(1)) == null) continue;
            if (string.equals("shaders/")) {
                return "";
            }
            return string;
        }
        return "";
    }

    @Override
    public boolean iA(String string) {
        try {
            String string2;
            ZipEntry zipEntry;
            if (this.ewp == null) {
                this.ewp = new ZipFile(this.ewo);
                this.ewq = this.a(this.ewp);
            }
            return (zipEntry = this.ewp.getEntry(this.ewq + (string2 = aj.ax(string, "/")))) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public String getName() {
        return this.ewo.getName();
    }
}

