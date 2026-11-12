/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.server.management;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import net.minecraft.entity.player.e;
import net.minecraft.server.management.PlayerManager$PlayerInstance;
import net.minecraft.src.a;
import net.minecraft.util.bq;
import net.minecraft.util.bt;
import net.minecraft.world.ac;
import net.minecraft.world.ai;
import net.minecraft.world.b;
import net.optifine.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerManager {
    private static final Logger dlU = LogManager.getLogger();
    private final ai dlV;
    private final List<e> dlW = Lists.newArrayList();
    private final bq<PlayerManager$PlayerInstance> dlX = new bq();
    private final List<PlayerManager$PlayerInstance> dlY = Lists.newArrayList();
    private final List<PlayerManager$PlayerInstance> dlZ = Lists.newArrayList();
    private int dma;
    private long dmb;
    private final int[][] dmc = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private final Map<e, Set<b>> dmd = new HashMap<e, Set<b>>();

    public PlayerManager(ai ai2) {
        this.dlV = ai2;
        this.hd(ai2.awt().alE().amz());
    }

    public ai amk() {
        return this.dlV;
    }

    public void aml() {
        ac ac2;
        Set<Map.Entry<e, Set<b>>> set = this.dmd.entrySet();
        Iterator<Map.Entry<e, Set<b>>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<e, Set<b>> entry = iterator.next();
            Set<b> set2 = entry.getValue();
            if (set2.isEmpty()) continue;
            e e2 = entry.getKey();
            if (e2.baU != this.dlV) {
                iterator.remove();
                continue;
            }
            int n2 = this.dma / 3 + 1;
            if (!a.aoN()) {
                n2 = this.dma * 2 + 1;
            }
            for (b b2 : this.a(set2, e2, n2)) {
                PlayerManager$PlayerInstance playerManager$PlayerInstance = this.d(b2.dBK, b2.dBL, true);
                playerManager$PlayerInstance.k(e2);
                set2.remove(b2);
            }
        }
        long l2 = this.dlV.getTotalWorldTime();
        if (l2 - this.dmb > 8000L) {
            this.dmb = l2;
            for (var5_7 = 0; var5_7 < this.dlZ.size(); ++var5_7) {
                PlayerManager$PlayerInstance playerManager$PlayerInstance = this.dlZ.get(var5_7);
                playerManager$PlayerInstance.Dm();
                playerManager$PlayerInstance.amm();
            }
        } else {
            for (var5_7 = 0; var5_7 < this.dlY.size(); ++var5_7) {
                PlayerManager$PlayerInstance playerManager$PlayerInstance = this.dlY.get(var5_7);
                playerManager$PlayerInstance.Dm();
            }
        }
        this.dlY.clear();
        if (this.dlW.isEmpty() && !(ac2 = this.dlV.dDl).avX()) {
            this.dlV.dEb.ayg();
        }
    }

    public boolean aB(int n2, int n3) {
        long l2 = (long)n2 + Integer.MAX_VALUE | (long)n3 + Integer.MAX_VALUE << 32;
        return this.dlX.B(l2) != null;
    }

    private PlayerManager$PlayerInstance d(int n2, int n3, boolean bl2) {
        long l2 = (long)n2 + Integer.MAX_VALUE | (long)n3 + Integer.MAX_VALUE << 32;
        PlayerManager$PlayerInstance playerManager$PlayerInstance = this.dlX.B(l2);
        if (playerManager$PlayerInstance == null && bl2) {
            playerManager$PlayerInstance = new PlayerManager$PlayerInstance(this, n2, n3);
            this.dlX.a(l2, playerManager$PlayerInstance);
            this.dlZ.add(playerManager$PlayerInstance);
        }
        return playerManager$PlayerInstance;
    }

    public void P(net.minecraft.util.b b2) {
        int n2;
        int n3 = b2.wt() >> 4;
        PlayerManager$PlayerInstance playerManager$PlayerInstance = this.d(n3, n2 = b2.wx() >> 4, false);
        if (playerManager$PlayerInstance != null) {
            playerManager$PlayerInstance.z(b2.wt() & 0xF, b2.wu(), b2.wx() & 0xF);
        }
    }

    public void k(e e2) {
        int n2 = (int)e2.gW >> 4;
        int n3 = (int)e2.gY >> 4;
        e2.cJa = e2.gW;
        e2.cJb = e2.gY;
        int n4 = Math.min(this.dma, 8);
        int n5 = n2 - n4;
        int n6 = n2 + n4;
        int n7 = n3 - n4;
        int n8 = n3 + n4;
        Set<b> set = this.o(e2);
        for (int i2 = n2 - this.dma; i2 <= n2 + this.dma; ++i2) {
            for (int i3 = n3 - this.dma; i3 <= n3 + this.dma; ++i3) {
                if (i2 >= n5 && i2 <= n6 && i3 >= n7 && i3 <= n8) {
                    this.d(i2, i3, true).k(e2);
                    continue;
                }
                set.add(new b(i2, i3));
            }
        }
        this.dlW.add(e2);
        this.l(e2);
    }

    public void l(e e2) {
        int n2;
        ArrayList arrayList = Lists.newArrayList(e2.cJc);
        int n3 = 0;
        int n4 = this.dma;
        int n5 = (int)e2.gW >> 4;
        int n6 = (int)e2.gY >> 4;
        int n7 = 0;
        int n8 = 0;
        b b2 = this.d((int)n5, (int)n6, (boolean)true).dmf;
        e2.cJc.clear();
        if (arrayList.contains(b2)) {
            e2.cJc.add(b2);
        }
        for (n2 = 1; n2 <= n4 * 2; ++n2) {
            for (int i2 = 0; i2 < 2; ++i2) {
                int[] nArray = this.dmc[n3++ % 4];
                for (int i3 = 0; i3 < n2; ++i3) {
                    b2 = this.d((int)(n5 + (n7 += nArray[0])), (int)(n6 + (n8 += nArray[1])), (boolean)true).dmf;
                    if (!arrayList.contains(b2)) continue;
                    e2.cJc.add(b2);
                }
            }
        }
        n3 %= 4;
        for (n2 = 0; n2 < n4 * 2; ++n2) {
            b2 = this.d((int)(n5 + (n7 += this.dmc[n3][0])), (int)(n6 + (n8 += this.dmc[n3][1])), (boolean)true).dmf;
            if (!arrayList.contains(b2)) continue;
            e2.cJc.add(b2);
        }
    }

    public void m(e e2) {
        this.dmd.remove(e2);
        int n2 = (int)e2.cJa >> 4;
        int n3 = (int)e2.cJb >> 4;
        for (int i2 = n2 - this.dma; i2 <= n2 + this.dma; ++i2) {
            for (int i3 = n3 - this.dma; i3 <= n3 + this.dma; ++i3) {
                PlayerManager$PlayerInstance playerManager$PlayerInstance = this.d(i2, i3, false);
                if (playerManager$PlayerInstance == null) continue;
                playerManager$PlayerInstance.m(e2);
            }
        }
        this.dlW.remove(e2);
    }

    private boolean d(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 - n4;
        int n8 = n3 - n5;
        return n7 >= -n6 && n7 <= n6 && n8 >= -n6 && n8 <= n6;
    }

    public void n(e e2) {
        int n2 = (int)e2.gW >> 4;
        int n3 = (int)e2.gY >> 4;
        double d2 = e2.cJa - e2.gW;
        double d3 = e2.cJb - e2.gY;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 >= 64.0) {
            int n4 = (int)e2.cJa >> 4;
            int n5 = (int)e2.cJb >> 4;
            int n6 = this.dma;
            int n7 = n2 - n4;
            int n8 = n3 - n5;
            if (n7 != 0 || n8 != 0) {
                Set<b> set = this.o(e2);
                for (int i2 = n2 - n6; i2 <= n2 + n6; ++i2) {
                    for (int i3 = n3 - n6; i3 <= n3 + n6; ++i3) {
                        if (!this.d(i2, i3, n4, n5, n6)) {
                            if (a.aoN()) {
                                set.add(new b(i2, i3));
                            } else {
                                this.d(i2, i3, true).k(e2);
                            }
                        }
                        if (this.d(i2 - n7, i3 - n8, n2, n3, n6)) continue;
                        set.remove(new b(i2 - n7, i3 - n8));
                        PlayerManager$PlayerInstance playerManager$PlayerInstance = this.d(i2 - n7, i3 - n8, false);
                        if (playerManager$PlayerInstance == null) continue;
                        playerManager$PlayerInstance.m(e2);
                    }
                }
                this.l(e2);
                e2.cJa = e2.gW;
                e2.cJb = e2.gY;
            }
        }
    }

    public boolean a(e e2, int n2, int n3) {
        PlayerManager$PlayerInstance playerManager$PlayerInstance = this.d(n2, n3, false);
        return playerManager$PlayerInstance != null && playerManager$PlayerInstance.dme.contains(e2) && !e2.cJc.contains(playerManager$PlayerInstance.dmf);
    }

    public void hd(int n2) {
        if ((n2 = bt.F(n2, 3, 64)) != this.dma) {
            int n3 = n2 - this.dma;
            for (e e2 : Lists.newArrayList(this.dlW)) {
                PlayerManager$PlayerInstance playerManager$PlayerInstance;
                int n4;
                int n5;
                int n6 = (int)e2.gW >> 4;
                int n7 = (int)e2.gY >> 4;
                Set<b> set = this.o(e2);
                if (n3 > 0) {
                    for (n5 = n6 - n2; n5 <= n6 + n2; ++n5) {
                        for (n4 = n7 - n2; n4 <= n7 + n2; ++n4) {
                            if (a.aoN()) {
                                set.add(new b(n5, n4));
                                continue;
                            }
                            playerManager$PlayerInstance = this.d(n5, n4, true);
                            if (playerManager$PlayerInstance.dme.contains(e2)) continue;
                            playerManager$PlayerInstance.k(e2);
                        }
                    }
                    continue;
                }
                for (n5 = n6 - this.dma; n5 <= n6 + this.dma; ++n5) {
                    for (n4 = n7 - this.dma; n4 <= n7 + this.dma; ++n4) {
                        if (this.d(n5, n4, n6, n7, n2)) continue;
                        set.remove(new b(n5, n4));
                        playerManager$PlayerInstance = this.d(n5, n4, true);
                        if (playerManager$PlayerInstance == null) continue;
                        playerManager$PlayerInstance.m(e2);
                    }
                }
            }
            this.dma = n2;
        }
    }

    public static int he(int n2) {
        return n2 * 16 - 16;
    }

    private PriorityQueue<b> a(Set<b> set, e e2, int n2) {
        float f2;
        for (f2 = e2.pl + 90.0f; f2 <= -180.0f; f2 += 360.0f) {
        }
        while (f2 > 180.0f) {
            f2 -= 360.0f;
        }
        double d2 = (double)f2 * (Math.PI / 180);
        double d3 = e2.pm;
        double d4 = d3 * (Math.PI / 180);
        g g2 = new g(e2.csH, e2.csJ, d2, d4);
        Comparator<b> comparator = Collections.reverseOrder(g2);
        PriorityQueue<b> priorityQueue = new PriorityQueue<b>(n2, comparator);
        for (b b2 : set) {
            if (priorityQueue.size() < n2) {
                priorityQueue.add(b2);
                continue;
            }
            b b3 = priorityQueue.peek();
            if (g2.a(b2, b3) >= 0) continue;
            priorityQueue.remove();
            priorityQueue.add(b2);
        }
        return priorityQueue;
    }

    private Set<b> o(e e2) {
        Set<b> set = this.dmd.get(e2);
        if (set != null) {
            return set;
        }
        int n2 = Math.min(this.dma, 8);
        int n3 = this.dma * 2 + 1;
        int n4 = n2 * 2 + 1;
        int n5 = n3 * n3 - n4 * n4;
        n5 = Math.max(n5, 16);
        HashSet<b> hashSet = new HashSet<b>(n5);
        this.dmd.put(e2, hashSet);
        return hashSet;
    }
}

