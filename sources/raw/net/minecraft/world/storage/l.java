/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import net.minecraft.nbt.a;
import net.minecraft.nbt.n;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.ac;
import net.minecraft.world.chunk.storage.h;
import net.minecraft.world.r;
import net.minecraft.world.storage.b;
import net.minecraft.world.storage.d;
import net.minecraft.world.storage.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class l
implements b,
d {
    private static final Logger dTI = LogManager.getLogger();
    private final File dTJ;
    private final File dTK;
    private final File dTL;
    private final long dTM = MinecraftServer.alN();
    private final String dTN;

    public l(File file, String string, boolean bl2) {
        this.dTJ = new File(file, string);
        this.dTJ.mkdirs();
        this.dTK = new File(this.dTJ, "playerdata");
        this.dTL = new File(this.dTJ, "data");
        this.dTL.mkdirs();
        this.dTN = string;
        if (bl2) {
            this.dTK.mkdirs();
        }
        this.azH();
    }

    private void azH() {
        try {
            File file = new File(this.dTJ, "session.lock");
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
                dataOutputStream.writeLong(this.dTM);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }

    @Override
    public File azz() {
        return this.dTJ;
    }

    @Override
    public void avC() {
        try {
            File file = new File(this.dTJ, "session.lock");
            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
                if (dataInputStream.readLong() != this.dTM) {
                    throw new r("The save is being accessed from another location, aborting");
                }
            }
        }
        catch (IOException iOException) {
            throw new r("Failed to check session lock, aborting");
        }
    }

    @Override
    public h b(ac ac2) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }

    @Override
    public o azx() {
        File file = new File(this.dTJ, "level.dat");
        if (file.exists()) {
            try {
                n n2 = a.f(new FileInputStream(file));
                n n3 = n2.eN("Data");
                return new o(n3);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if ((file = new File(this.dTJ, "level.dat_old")).exists()) {
            try {
                n n4 = a.f(new FileInputStream(file));
                n n5 = n4.eN("Data");
                return new o(n5);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void a(o o2, n n2) {
        n n3 = o2.P(n2);
        n n4 = new n();
        n4.b("Data", n3);
        try {
            File file = new File(this.dTJ, "level.dat_new");
            File file2 = new File(this.dTJ, "level.dat_old");
            File file3 = new File(this.dTJ, "level.dat");
            a.a(n4, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void b(o o2) {
        n n2 = o2.Uv();
        n n3 = new n();
        n3.b("Data", n2);
        try {
            File file = new File(this.dTJ, "level.dat_new");
            File file2 = new File(this.dTJ, "level.dat_old");
            File file3 = new File(this.dTJ, "level.dat");
            a.a(n3, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void O(net.minecraft.entity.player.a a2) {
        try {
            n n2 = new n();
            a2.b(n2);
            File file = new File(this.dTK, a2.Ul().toString() + ".dat.tmp");
            File file2 = new File(this.dTK, a2.Ul().toString() + ".dat");
            a.a(n2, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception exception) {
            dTI.warn("Failed to save player data for " + a2.xU());
        }
    }

    @Override
    public n P(net.minecraft.entity.player.a a2) {
        n n2 = null;
        try {
            File file = new File(this.dTK, a2.Ul().toString() + ".dat");
            if (file.exists() && file.isFile()) {
                n2 = a.f(new FileInputStream(file));
            }
        }
        catch (Exception exception) {
            dTI.warn("Failed to load player data for " + a2.xU());
        }
        if (n2 != null) {
            a2.a(n2);
        }
        return n2;
    }

    @Override
    public b azy() {
        return this;
    }

    @Override
    public String[] amy() {
        String[] stringArray = this.dTK.list();
        if (stringArray == null) {
            stringArray = new String[]{};
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (!stringArray[i2].endsWith(".dat")) continue;
            stringArray[i2] = stringArray[i2].substring(0, stringArray[i2].length() - 4);
        }
        return stringArray;
    }

    @Override
    public void bf() {
    }

    @Override
    public File gO(String string) {
        return new File(this.dTL, string + ".dat");
    }

    @Override
    public String azA() {
        return this.dTN;
    }
}

