/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.util.List;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.aj;
import net.minecraft.network.play.server.ak;

public class aq
implements net.minecraft.network.aj<a> {
    private int[] ddB;
    private int[] ddC;
    private ak[] ddD;
    private boolean ddE;

    public aq() {
    }

    public aq(List<net.minecraft.world.chunk.a> list) {
        int n2 = list.size();
        this.ddB = new int[n2];
        this.ddC = new int[n2];
        this.ddD = new ak[n2];
        this.ddE = !list.get((int)0).de().dDl.awf();
        for (int i2 = 0; i2 < n2; ++i2) {
            net.minecraft.world.chunk.a a2 = list.get(i2);
            ak ak2 = aj.a(a2, true, this.ddE, 65535);
            this.ddB[i2] = a2.dIK;
            this.ddC[i2] = a2.dIL;
            this.ddD[i2] = ak2;
        }
    }

    @Override
    public void a(net.minecraft.network.ak ak2) {
        int n2;
        this.ddE = ak2.readBoolean();
        int n3 = ak2.afw();
        this.ddB = new int[n3];
        this.ddC = new int[n3];
        this.ddD = new ak[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.ddB[n2] = ak2.readInt();
            this.ddC[n2] = ak2.readInt();
            this.ddD[n2] = new ak();
            this.ddD[n2].dds = ak2.readShort() & 0xFFFF;
            this.ddD[n2].asD = new byte[aj.b(Integer.bitCount(this.ddD[n2].dds), this.ddE, true)];
        }
        for (n2 = 0; n2 < n3; ++n2) {
            ak2.readBytes(this.ddD[n2].asD);
        }
    }

    @Override
    public void b(net.minecraft.network.ak ak2) {
        int n2;
        ak2.writeBoolean(this.ddE);
        ak2.gr(this.ddD.length);
        for (n2 = 0; n2 < this.ddB.length; ++n2) {
            ak2.writeInt(this.ddB[n2]);
            ak2.writeInt(this.ddC[n2]);
            ak2.writeShort((short)(this.ddD[n2].dds & 0xFFFF));
        }
        for (n2 = 0; n2 < this.ddB.length; ++n2) {
            ak2.writeBytes(this.ddD[n2].asD);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int gA(int n2) {
        return this.ddB[n2];
    }

    public int gB(int n2) {
        return this.ddC[n2];
    }

    public int getChunkCount() {
        return this.ddB.length;
    }

    public byte[] gC(int n2) {
        return this.ddD[n2].asD;
    }

    public int gD(int n2) {
        return this.ddD[n2].dds;
    }
}

