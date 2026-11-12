/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;
import net.minecraft.client.renderer.chunk.SetVisibility;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bl;

public class VisGraph {
    private static final int bTQ = (int)Math.pow(16.0, 0.0);
    private static final int bTR = (int)Math.pow(16.0, 1.0);
    private static final int bTS = (int)Math.pow(16.0, 2.0);
    private final BitSet bTT = new BitSet(4096);
    private static final int[] bTU = new int[1352];
    private int bTV = 4096;

    public void W(b b2) {
        this.bTT.set(VisGraph.X(b2), true);
        --this.bTV;
    }

    private static int X(b b2) {
        return VisGraph.w(b2.wt() & 0xF, b2.wu() & 0xF, b2.wx() & 0xF);
    }

    private static int w(int n2, int n3, int n4) {
        return n2 << 0 | n3 << 8 | n4 << 4;
    }

    public SetVisibility Nh() {
        SetVisibility setVisibility = new SetVisibility();
        if (4096 - this.bTV < 256) {
            setVisibility.aq(true);
        } else if (this.bTV == 0) {
            setVisibility.aq(false);
        } else {
            for (int n2 : bTU) {
                if (this.bTT.get(n2)) continue;
                setVisibility.a(this.dy(n2));
            }
        }
        return setVisibility;
    }

    public Set<ao> Y(b b2) {
        return this.dy(VisGraph.X(b2));
    }

    private Set<ao> dy(int n2) {
        EnumSet<ao> enumSet = EnumSet.noneOf(ao.class);
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(384);
        arrayDeque.add(bl.hK(n2));
        this.bTT.set(n2, true);
        while (!arrayDeque.isEmpty()) {
            int n3 = (Integer)arrayDeque.poll();
            this.a(n3, enumSet);
            for (ao ao2 : ao.dwD) {
                int n4 = this.a(n3, ao2);
                if (n4 < 0 || this.bTT.get(n4)) continue;
                this.bTT.set(n4, true);
                arrayDeque.add(bl.hK(n4));
            }
        }
        return enumSet;
    }

    private void a(int n2, Set<ao> set) {
        int n3 = n2 >> 0 & 0xF;
        if (n3 == 0) {
            set.add(ao.dwu);
        } else if (n3 == 15) {
            set.add(ao.dwv);
        }
        int n4 = n2 >> 8 & 0xF;
        if (n4 == 0) {
            set.add(ao.dwq);
        } else if (n4 == 15) {
            set.add(ao.dwr);
        }
        int n5 = n2 >> 4 & 0xF;
        if (n5 == 0) {
            set.add(ao.dws);
        } else if (n5 == 15) {
            set.add(ao.dwt);
        }
    }

    private int a(int n2, ao ao2) {
        switch (ao2) {
            case dwq: {
                if ((n2 >> 8 & 0xF) == 0) {
                    return -1;
                }
                return n2 - bTS;
            }
            case dwr: {
                if ((n2 >> 8 & 0xF) == 15) {
                    return -1;
                }
                return n2 + bTS;
            }
            case dws: {
                if ((n2 >> 4 & 0xF) == 0) {
                    return -1;
                }
                return n2 - bTR;
            }
            case dwt: {
                if ((n2 >> 4 & 0xF) == 15) {
                    return -1;
                }
                return n2 + bTR;
            }
            case dwu: {
                if ((n2 >> 0 & 0xF) == 0) {
                    return -1;
                }
                return n2 - bTQ;
            }
            case dwv: {
                if ((n2 >> 0 & 0xF) == 15) {
                    return -1;
                }
                return n2 + bTQ;
            }
        }
        return -1;
    }

    static {
        boolean bl2 = false;
        int n2 = 15;
        int n3 = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    if (i2 != 0 && i2 != 15 && i3 != 0 && i3 != 15 && i4 != 0 && i4 != 15) continue;
                    VisGraph.bTU[n3++] = VisGraph.w(i2, i3, i4);
                }
            }
        }
    }
}

