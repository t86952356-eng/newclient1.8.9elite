/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.world.ao;
import net.minecraft.world.ap;
import net.minecraft.world.f;

public class b
implements aj<a> {
    private int entityId;
    private boolean hardcoreMode;
    private ao bFi;
    private int dimension;
    private f chN;
    private int maxPlayers;
    private ap dcc;
    private boolean reducedDebugInfo;

    public b() {
    }

    public b(int n2, ao ao2, boolean bl2, int n3, f f2, int n4, ap ap2, boolean bl3) {
        this.entityId = n2;
        this.dimension = n3;
        this.chN = f2;
        this.bFi = ao2;
        this.maxPlayers = n4;
        this.hardcoreMode = bl2;
        this.dcc = ap2;
        this.reducedDebugInfo = bl3;
    }

    @Override
    public void a(ak ak2) {
        this.entityId = ak2.readInt();
        int n2 = ak2.readUnsignedByte();
        this.hardcoreMode = (n2 & 8) == 8;
        this.bFi = ao.ii(n2 &= 0xFFFFFFF7);
        this.dimension = ak2.readByte();
        this.chN = f.ib(ak2.readUnsignedByte());
        this.maxPlayers = ak2.readUnsignedByte();
        this.dcc = ap.gD(ak2.gs(16));
        if (this.dcc == null) {
            this.dcc = ap.dED;
        }
        this.reducedDebugInfo = ak2.readBoolean();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.entityId);
        int n2 = this.bFi.awE();
        if (this.hardcoreMode) {
            n2 |= 8;
        }
        ak2.writeByte(n2);
        ak2.writeByte(this.dimension);
        ak2.writeByte(this.chN.auZ());
        ak2.writeByte(this.maxPlayers);
        ak2.eS(this.dcc.awI());
        ak2.writeBoolean(this.reducedDebugInfo);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityId() {
        return this.entityId;
    }

    public boolean isHardcoreMode() {
        return this.hardcoreMode;
    }

    public ao If() {
        return this.bFi;
    }

    public int getDimension() {
        return this.dimension;
    }

    public f agm() {
        return this.chN;
    }

    public int getMaxPlayers() {
        return this.maxPlayers;
    }

    public ap agn() {
        return this.dcc;
    }

    public boolean isReducedDebugInfo() {
        return this.reducedDebugInfo;
    }
}

