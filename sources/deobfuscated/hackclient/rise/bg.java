/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.ain;
import hackclient.rise.am;
import hackclient.rise.bb;
import hackclient.rise.bh;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.util.math.Vector2f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bg
extends am {
    public static boolean dj;
    private static boolean dk;
    private static int dl;
    private static int dm;
    public static bh dn;
    @EventLink(cH=0)
    public final Listener<PreMotionEvent> do = preMotionEvent -> {
        block32: {
            block34: {
                block33: {
                    if (!dj) break block32;
                    int n2 = ain.e(Items.cPj);
                    int n3 = ain.e(Items.cQV);
                    int n4 = ain.e(Items.cQM);
                    int n5 = ain.e(Items.cQH);
                    int n6 = ain.e(Items.cQT);
                    if (n2 != -1 && this.ba()) {
                        this.d(bu.class);
                        bu.setSlot(n2);
                        dn = bh.ds;
                    } else if (n3 != -1) {
                        this.d(bu.class);
                        bu.setSlot(n3);
                        dn = bh.dt;
                    } else if (n4 != -1) {
                        this.d(bu.class);
                        bu.setSlot(n4);
                        dn = bh.du;
                    } else if (n5 != -1) {
                        this.d(bu.class);
                        bu.setSlot(n5);
                        dn = bh.dv;
                    } else if (n6 != -1) {
                        this.d(bu.class);
                        bu.setSlot(n6);
                        dn = bh.dv;
                    }
                    if (bb.a(true, false, false, false, true)) {
                        dm = 0;
                    }
                    if (bb.a(true, false, false, false, true)) break block32;
                    ++dm;
                    if (dn == null) break block33;
                    block0 : switch (dn.ordinal()) {
                        case 0: {
                            switch (dm) {
                                case 3: {
                                    this.d(bu.class);
                                    ahn.m(new k(bu.bO()));
                                    break block0;
                                }
                                case 7: {
                                    ahn.m(new i(j.dbe, b.dtN, ao.dwq));
                                    break block0;
                                }
                                case 40: {
                                    dj = false;
                                }
                            }
                            break;
                        }
                        case 1: {
                            switch (dm) {
                                case 3: {
                                    this.d(bu.class);
                                    ahn.m(new k(bu.bO()));
                                    break;
                                }
                                case 95: {
                                    dj = false;
                                }
                            }
                            if (bg.aER.bgK.cus == 9) {
                                this.d(bu.class);
                                ahn.m(new k(bu.bO()));
                                break;
                            }
                            break block34;
                        }
                        case 2: {
                            if (dm == 3) {
                                this.d(bu.class);
                                ahn.m(new k(bu.bO()));
                                break;
                            }
                            break block34;
                        }
                        case 3: {
                            switch (dm) {
                                case 3: 
                                case 4: 
                                case 5: 
                                case 6: {
                                    this.d(bu.class);
                                    ahn.m(new k(bu.bO()));
                                    break block0;
                                }
                                case 100: {
                                    dj = false;
                                }
                            }
                            break;
                        }
                        default: {
                            dj = false;
                            break;
                        }
                    }
                    break block34;
                }
                dj = false;
            }
            if (bg.aER.bgK.cus == 9) {
                dj = false;
            }
            dk = true;
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> dp = moveInputEvent -> {
        if (dk && dj) {
            moveInputEvent.setForward(0.0f);
            moveInputEvent.setStrafe(0.0f);
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> dq = preUpdateEvent -> {
        if (dj) {
            bs.a(new Vector2f(bg.aER.bgK.pl, -90.0f), ahj.l(8.0, 10.0), cb.gH);
        }
    };
    @EventLink(cH=0)
    public final Listener<PacketReceiveEvent> dr = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            if (t2.getEntityID() == bg.aER.bgK.getEntityId()) {
                dj = false;
            }
        } else if (aj2 instanceof ar) {
            dj = false;
        }
    };

    public static void damage(boolean bl2) {
        dj = true;
        dk = bl2;
        dl = bg.aER.bgK.cHV.cJE;
        dm = 0;
        dn = null;
    }

    public boolean ba() {
        for (int i2 = 0; i2 < bg.aER.bgK.cHV.cJC.length; ++i2) {
            co co2 = bg.aER.bgK.cHV.cJC[i2];
            if (co2 == null || !co2.bP().xB().contains("arrow")) continue;
            return true;
        }
        return false;
    }
}

