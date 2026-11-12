/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.server.management;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.entity.player.e;
import net.minecraft.network.play.server.aj;
import net.minecraft.network.play.server.al;
import net.minecraft.network.play.server.an;
import net.minecraft.server.management.PlayerManager;
import net.minecraft.tileentity.d;
import net.minecraft.world.b;
import net.minecraft.world.chunk.a;

class PlayerManager$PlayerInstance {
    private final List<e> dme = Lists.newArrayList();
    private final b dmf;
    private final short[] dmg = new short[64];
    private int dmh;
    private int dmi;
    private long dmj;
    final /* synthetic */ PlayerManager dmk;

    public PlayerManager$PlayerInstance(PlayerManager playerManager, int n2, int n3) {
        this.dmk = playerManager;
        this.dmf = new b(n2, n3);
        playerManager.amk().dEb.G(n2, n3);
    }

    public void k(e e2) {
        if (this.dme.contains(e2)) {
            PlayerManager.dlU.debug("Failed to add player. {} already is in chunk {}, {}", new Object[]{e2, this.dmf.dBK, this.dmf.dBL});
        } else {
            if (this.dme.isEmpty()) {
                this.dmj = this.dmk.dlV.getTotalWorldTime();
            }
            this.dme.add(e2);
            e2.cJc.add(this.dmf);
        }
    }

    public void m(e e2) {
        if (this.dme.contains(e2)) {
            a a2 = this.dmk.dlV.aL(this.dmf.dBK, this.dmf.dBL);
            if (a2.axB()) {
                e2.cIX.B(new aj(a2, true, 0));
            }
            this.dme.remove(e2);
            e2.cJc.remove(this.dmf);
            if (this.dme.isEmpty()) {
                long l2 = (long)this.dmf.dBK + Integer.MAX_VALUE | (long)this.dmf.dBL + Integer.MAX_VALUE << 32;
                this.a(a2);
                this.dmk.dlX.E(l2);
                this.dmk.dlZ.remove(this);
                if (this.dmh > 0) {
                    this.dmk.dlY.remove(this);
                }
                this.dmk.amk().dEb.bf(this.dmf.dBK, this.dmf.dBL);
            }
        }
    }

    public void amm() {
        this.a(this.dmk.dlV.aL(this.dmf.dBK, this.dmf.dBL));
    }

    private void a(a a2) {
        a2.N(a2.axO() + this.dmk.dlV.getTotalWorldTime() - this.dmj);
        this.dmj = this.dmk.dlV.getTotalWorldTime();
    }

    public void z(int n2, int n3, int n4) {
        if (this.dmh == 0) {
            this.dmk.dlY.add(this);
        }
        this.dmi |= 1 << (n3 >> 4);
        if (this.dmh < 64) {
            short s2 = (short)(n2 << 12 | n4 << 8 | n3);
            for (int i2 = 0; i2 < this.dmh; ++i2) {
                if (this.dmg[i2] != s2) continue;
                return;
            }
            this.dmg[this.dmh++] = s2;
        }
    }

    public void G(net.minecraft.network.aj aj2) {
        for (int i2 = 0; i2 < this.dme.size(); ++i2) {
            e e2 = this.dme.get(i2);
            if (e2.cJc.contains(this.dmf)) continue;
            e2.cIX.B(aj2);
        }
    }

    public void Dm() {
        if (this.dmh != 0) {
            if (this.dmh == 1) {
                int n2 = (this.dmg[0] >> 12 & 0xF) + this.dmf.dBK * 16;
                int n3 = this.dmg[0] & 0xFF;
                int n4 = (this.dmg[0] >> 8 & 0xF) + this.dmf.dBL * 16;
                net.minecraft.util.b b2 = new net.minecraft.util.b(n2, n3, n4);
                this.G(new an(this.dmk.dlV, b2));
                if (this.dmk.dlV.L(b2).df().xj()) {
                    this.e(this.dmk.dlV.K(b2));
                }
            } else if (this.dmh != 64) {
                this.G(new al(this.dmh, this.dmg, this.dmk.dlV.aL(this.dmf.dBK, this.dmf.dBL)));
                for (int i2 = 0; i2 < this.dmh; ++i2) {
                    int n5 = (this.dmg[i2] >> 12 & 0xF) + this.dmf.dBK * 16;
                    int n6 = this.dmg[i2] & 0xFF;
                    int n7 = (this.dmg[i2] >> 8 & 0xF) + this.dmf.dBL * 16;
                    net.minecraft.util.b b3 = new net.minecraft.util.b(n5, n6, n7);
                    if (!this.dmk.dlV.L(b3).df().xj()) continue;
                    this.e(this.dmk.dlV.K(b3));
                }
            } else {
                int n8 = this.dmf.dBK * 16;
                int n9 = this.dmf.dBL * 16;
                this.G(new aj(this.dmk.dlV.aL(this.dmf.dBK, this.dmf.dBL), false, this.dmi));
                for (int i3 = 0; i3 < 16; ++i3) {
                    if ((this.dmi & 1 << i3) == 0) continue;
                    int n10 = i3 << 4;
                    List<d> list = this.dmk.dlV.h(n8, n10, n9, n8 + 16, n10 + 16, n9 + 16);
                    for (int i4 = 0; i4 < list.size(); ++i4) {
                        this.e(list.get(i4));
                    }
                }
            }
            this.dmh = 0;
            this.dmi = 0;
        }
    }

    private void e(d d2) {
        net.minecraft.network.aj aj2;
        if (d2 != null && (aj2 = d2.apQ()) != null) {
            this.G(aj2);
        }
    }
}

