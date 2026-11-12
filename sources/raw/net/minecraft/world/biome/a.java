/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.biome;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.bq;
import net.minecraft.world.biome.aj;
import net.minecraft.world.biome.b;
import net.minecraft.world.biome.j;

public class a {
    private final aj dEQ;
    private long dER;
    private final bq<b> dES = new bq();
    private final List<b> dET = Lists.newArrayList();

    public a(aj aj2) {
        this.dEQ = aj2;
    }

    public b aQ(int n2, int n3) {
        long l2 = (long)(n2 >>= 4) & 0xFFFFFFFFL | ((long)(n3 >>= 4) & 0xFFFFFFFFL) << 32;
        b b2 = this.dES.B(l2);
        if (b2 == null) {
            b2 = new b(this, n2, n3);
            this.dES.a(l2, b2);
            this.dET.add(b2);
        }
        b2.dEX = MinecraftServer.alN();
        return b2;
    }

    public j a(int n2, int n3, j j2) {
        j j3 = this.aQ(n2, n3).aS(n2, n3);
        return j3 == null ? j2 : j3;
    }

    public void ss() {
        long l2 = MinecraftServer.alN();
        long l3 = l2 - this.dER;
        if (l3 > 7500L || l3 < 0L) {
            this.dER = l2;
            for (int i2 = 0; i2 < this.dET.size(); ++i2) {
                b b2 = this.dET.get(i2);
                long l4 = l2 - b2.dEX;
                if (l4 <= 30000L && l4 >= 0L) continue;
                this.dET.remove(i2--);
                long l5 = (long)b2.xPosition & 0xFFFFFFFFL | ((long)b2.dEW & 0xFFFFFFFFL) << 32;
                this.dES.E(l5);
            }
        }
    }

    public j[] aR(int n2, int n3) {
        return this.aQ((int)n2, (int)n3).dEV;
    }
}

