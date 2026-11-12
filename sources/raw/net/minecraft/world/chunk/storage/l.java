/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.world.chunk.storage;

import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import net.minecraft.world.chunk.storage.j;

public class l {
    private static final Map<File, j> dJY = Maps.newHashMap();

    public static synchronized j a(File file, int n2, int n3) {
        File file2 = new File(file, "region");
        File file3 = new File(file2, "r." + (n2 >> 5) + "." + (n3 >> 5) + ".mca");
        j j2 = dJY.get(file3);
        if (j2 != null) {
            return j2;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (dJY.size() >= 256) {
            l.ayd();
        }
        j j3 = new j(file3);
        dJY.put(file3, j3);
        return j3;
    }

    public static synchronized void ayd() {
        for (j j2 : dJY.values()) {
            try {
                if (j2 == null) continue;
                j2.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        dJY.clear();
    }

    public static DataInputStream b(File file, int n2, int n3) {
        j j2 = l.a(file, n2, n3);
        return j2.aZ(n2 & 0x1F, n3 & 0x1F);
    }

    public static DataOutputStream c(File file, int n2, int n3) {
        j j2 = l.a(file, n2, n3);
        return j2.ba(n2 & 0x1F, n3 & 0x1F);
    }
}

