/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import net.optifine.shaders.m;
import net.optifine.util.aj;

public class ac
implements m {
    protected File ewo;

    public ac(String string, File file) {
        this.ewo = file;
    }

    @Override
    public void close() {
    }

    @Override
    public InputStream iz(String string) {
        try {
            String string2 = aj.j(string, "/", "/");
            File file = new File(this.ewo, string2);
            return !file.exists() ? null : new BufferedInputStream(new FileInputStream(file));
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public boolean iA(String string) {
        File file = new File(this.ewo, string.substring(1));
        return file.exists() && file.isDirectory();
    }

    @Override
    public String getName() {
        return this.ewo.getName();
    }
}

