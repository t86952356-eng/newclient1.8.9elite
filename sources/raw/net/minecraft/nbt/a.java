/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import net.minecraft.crash.i;
import net.minecraft.nbt.g;
import net.minecraft.nbt.j;
import net.minecraft.nbt.n;
import net.minecraft.nbt.r;
import net.minecraft.util.cl;

public class a {
    public static n f(InputStream inputStream) {
        n n2;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));){
            n2 = a.a(dataInputStream, j.cYm);
        }
        return n2;
    }

    public static void a(n n2, OutputStream outputStream) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));){
            a.a(n2, (DataOutput)dataOutputStream);
        }
    }

    public static void a(n n2, File file) {
        File file2 = new File(file.getAbsolutePath() + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        a.b(n2, file2);
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            throw new IOException("Failed to delete " + String.valueOf(file));
        }
        file2.renameTo(file);
    }

    public static void b(n n2, File file) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
            a.a(n2, (DataOutput)dataOutputStream);
        }
    }

    public static n h(File file) {
        n n2;
        if (!file.exists()) {
            return null;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
            n2 = a.a(dataInputStream, j.cYm);
        }
        return n2;
    }

    public static n a(DataInputStream dataInputStream) {
        return a.a(dataInputStream, j.cYm);
    }

    public static n a(DataInput dataInput, j j2) {
        g g2 = a.a(dataInput, 0, j2);
        if (g2 instanceof n) {
            return (n)g2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(n n2, DataOutput dataOutput) {
        a.a((g)n2, dataOutput);
    }

    private static void a(g g2, DataOutput dataOutput) {
        dataOutput.writeByte(g2.aeF());
        if (g2.aeF() != 0) {
            dataOutput.writeUTF("");
            g2.a(dataOutput);
        }
    }

    private static g a(DataInput dataInput, int n2, j j2) {
        byte by2 = dataInput.readByte();
        if (by2 == 0) {
            return new r();
        }
        dataInput.readUTF();
        g g2 = g.b(by2);
        try {
            g2.b(dataInput, n2, j2);
            return g2;
        }
        catch (IOException iOException) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(iOException, "Loading NBT data");
            i i2 = a2.dY("NBT Tag");
            i2.b("Tag name", "[UNNAMED TAG]");
            i2.b("Tag type", by2);
            throw new cl(a2);
        }
    }
}

