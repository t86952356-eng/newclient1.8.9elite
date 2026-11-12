/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.ak;
import net.minecraft.world.chunk.storage.g;
import rip.vantage.network.handler.c;

public class aj
implements net.minecraft.network.aj<a> {
    private int ddn;
    private int ddo;
    private ak ddp;
    private boolean ddq;
    private final c ddr = rip.vantage.network.core.a.aKQ().aKZ();

    public aj() {
    }

    public aj(int n2, int n3) {
        this.ddn = n2;
        this.ddo = n3;
        this.ddq = true;
        this.ddp = new ak();
        this.ddp.dds = 0;
        this.ddp.asD = new byte[0];
    }

    public aj(net.minecraft.world.chunk.a a2, boolean bl2, int n2) {
        this.ddn = a2.dIK;
        this.ddo = a2.dIL;
        this.ddq = bl2;
        this.ddp = aj.a(a2, bl2, !a2.de().dDl.awf(), n2);
    }

    @Override
    public void a(net.minecraft.network.ak ak2) {
        this.ddn = ak2.readInt();
        this.ddo = ak2.readInt();
        this.ddq = ak2.readBoolean();
        this.ddp = new ak();
        this.ddp.dds = ak2.readShort();
        this.ddp.asD = ak2.aft();
    }

    @Override
    public void b(net.minecraft.network.ak ak2) {
        ak2.writeInt(this.ddn);
        ak2.writeInt(this.ddo);
        ak2.writeBoolean(this.ddq);
        ak2.writeShort((short)(this.ddp.dds & 0xFFFF));
        ak2.k(this.ddp.asD);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public byte[] ahf() {
        return this.ddp.asD;
    }

    protected static int b(int n2, boolean bl2, boolean bl3) {
        int n3 = n2 * 2 * 16 * 16 * 16;
        int n4 = n2 * 16 * 16 * 16 / 2;
        int n5 = bl2 ? n2 * 16 * 16 * 16 / 2 : 0;
        int n6 = bl3 ? 256 : 0;
        return n3 + n4 + n5 + n6;
    }

    public static ak a(net.minecraft.world.chunk.a a2, boolean bl2, boolean bl3, int n2) {
        int n3;
        g[] gArray = a2.axw();
        ak ak2 = new ak();
        ArrayList arrayList = Lists.newArrayList();
        for (n3 = 0; n3 < gArray.length; ++n3) {
            g g2 = gArray[n3];
            if (g2 == null || bl2 && g2.isEmpty() || (n2 & 1 << n3) == 0) continue;
            ak2.dds |= 1 << n3;
            arrayList.add(g2);
        }
        ak2.asD = new byte[aj.b(Integer.bitCount(ak2.dds), bl3, bl2)];
        n3 = 0;
        for (g g3 : arrayList) {
            char[] cArray;
            for (char c2 : cArray = g3.axZ()) {
                ak2.asD[n3++] = (byte)(c2 & 0xFF);
                ak2.asD[n3++] = (byte)(c2 >> 8 & 0xFF);
            }
        }
        for (g g3 : arrayList) {
            n3 = aj.a(g3.aya().axQ(), ak2.asD, n3);
        }
        if (bl3) {
            for (g g3 : arrayList) {
                n3 = aj.a(g3.ayb().axQ(), ak2.asD, n3);
            }
        }
        if (bl2) {
            aj.a(a2.axD(), ak2.asD, n3);
        }
        return ak2;
    }

    private static int a(byte[] byArray, byte[] byArray2, int n2) {
        System.arraycopy(byArray, 0, byArray2, n2, byArray.length);
        return n2 + byArray.length;
    }

    public int getChunkX() {
        return this.ddn;
    }

    public int getChunkZ() {
        return this.ddo;
    }

    public int ahg() {
        return this.ddp.dds;
    }

    public boolean ahh() {
        return this.ddq;
    }
}

