/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.chunk.storage;

import com.google.common.collect.Lists;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.chunk.storage.k;

public class j {
    private static final byte[] dJN = new byte[4096];
    private final File dJO;
    private RandomAccessFile dJP;
    private final int[] dJQ = new int[1024];
    private final int[] dJR = new int[1024];
    private List<Boolean> dJS;
    private int dJT;
    private long dJU;

    public j(File file) {
        this.dJO = file;
        this.dJT = 0;
        try {
            int n2;
            int n3;
            int n4;
            if (file.exists()) {
                this.dJU = file.lastModified();
            }
            this.dJP = new RandomAccessFile(file, "rw");
            if (this.dJP.length() < 4096L) {
                for (n4 = 0; n4 < 1024; ++n4) {
                    this.dJP.writeInt(0);
                }
                for (n4 = 0; n4 < 1024; ++n4) {
                    this.dJP.writeInt(0);
                }
                this.dJT += 8192;
            }
            if ((this.dJP.length() & 0xFFFL) != 0L) {
                n4 = 0;
                while ((long)n4 < (this.dJP.length() & 0xFFFL)) {
                    this.dJP.write(0);
                    ++n4;
                }
            }
            n4 = (int)this.dJP.length() / 4096;
            this.dJS = Lists.newArrayListWithCapacity((int)n4);
            for (n3 = 0; n3 < n4; ++n3) {
                this.dJS.add(true);
            }
            this.dJS.set(0, false);
            this.dJS.set(1, false);
            this.dJP.seek(0L);
            for (n3 = 0; n3 < 1024; ++n3) {
                this.dJQ[n3] = n2 = this.dJP.readInt();
                if (n2 == 0 || (n2 >> 8) + (n2 & 0xFF) > this.dJS.size()) continue;
                for (int i2 = 0; i2 < (n2 & 0xFF); ++i2) {
                    this.dJS.set((n2 >> 8) + i2, false);
                }
            }
            for (n3 = 0; n3 < 1024; ++n3) {
                this.dJR[n3] = n2 = this.dJP.readInt();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public synchronized DataInputStream aZ(int n2, int n3) {
        if (this.bb(n2, n3)) {
            return null;
        }
        try {
            int n4 = this.bc(n2, n3);
            if (n4 == 0) {
                return null;
            }
            int n5 = n4 >> 8;
            int n6 = n4 & 0xFF;
            if (n5 + n6 > this.dJS.size()) {
                return null;
            }
            this.dJP.seek(n5 * 4096);
            int n7 = this.dJP.readInt();
            if (n7 > 4096 * n6) {
                return null;
            }
            if (n7 <= 0) {
                return null;
            }
            byte by2 = this.dJP.readByte();
            if (by2 == 1) {
                byte[] byArray = new byte[n7 - 1];
                this.dJP.read(byArray);
                return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(byArray))));
            }
            if (by2 == 2) {
                byte[] byArray = new byte[n7 - 1];
                this.dJP.read(byArray);
                return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(byArray))));
            }
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public DataOutputStream ba(int n2, int n3) {
        return this.bb(n2, n3) ? null : new DataOutputStream(new DeflaterOutputStream(new k(this, n2, n3)));
    }

    protected synchronized void a(int n2, int n3, byte[] byArray, int n4) {
        try {
            int n5 = this.bc(n2, n3);
            int n6 = n5 >> 8;
            int n7 = n5 & 0xFF;
            int n8 = (n4 + 5) / 4096 + 1;
            if (n8 >= 256) {
                return;
            }
            if (n6 != 0 && n7 == n8) {
                this.a(n6, byArray, n4);
            } else {
                int n9;
                int n10;
                for (n10 = 0; n10 < n7; ++n10) {
                    this.dJS.set(n6 + n10, true);
                }
                n10 = this.dJS.indexOf(true);
                int n11 = 0;
                if (n10 != -1) {
                    for (n9 = n10; n9 < this.dJS.size(); ++n9) {
                        if (n11 != 0) {
                            n11 = this.dJS.get(n9).booleanValue() ? ++n11 : 0;
                        } else if (this.dJS.get(n9).booleanValue()) {
                            n10 = n9;
                            n11 = 1;
                        }
                        if (n11 >= n8) break;
                    }
                }
                if (n11 >= n8) {
                    n6 = n10;
                    this.aa(n2, n3, n10 << 8 | n8);
                    for (n9 = 0; n9 < n8; ++n9) {
                        this.dJS.set(n6 + n9, false);
                    }
                    this.a(n6, byArray, n4);
                } else {
                    this.dJP.seek(this.dJP.length());
                    n6 = this.dJS.size();
                    for (n9 = 0; n9 < n8; ++n9) {
                        this.dJP.write(dJN);
                        this.dJS.add(false);
                    }
                    this.dJT += 4096 * n8;
                    this.a(n6, byArray, n4);
                    this.aa(n2, n3, n6 << 8 | n8);
                }
            }
            this.ab(n2, n3, (int)(MinecraftServer.alN() / 1000L));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void a(int n2, byte[] byArray, int n3) {
        this.dJP.seek(n2 * 4096);
        this.dJP.writeInt(n3 + 1);
        this.dJP.writeByte(2);
        this.dJP.write(byArray, 0, n3);
    }

    private boolean bb(int n2, int n3) {
        return n2 < 0 || n2 >= 32 || n3 < 0 || n3 >= 32;
    }

    private int bc(int n2, int n3) {
        return this.dJQ[n2 + n3 * 32];
    }

    public boolean bd(int n2, int n3) {
        return this.bc(n2, n3) != 0;
    }

    private void aa(int n2, int n3, int n4) {
        this.dJQ[n2 + n3 * 32] = n4;
        this.dJP.seek((n2 + n3 * 32) * 4);
        this.dJP.writeInt(n4);
    }

    private void ab(int n2, int n3, int n4) {
        this.dJR[n2 + n3 * 32] = n4;
        this.dJP.seek(4096 + (n2 + n3 * 32) * 4);
        this.dJP.writeInt(n4);
    }

    public void close() {
        if (this.dJP != null) {
            this.dJP.close();
        }
    }
}

