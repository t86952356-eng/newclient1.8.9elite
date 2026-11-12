/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.fd;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class MatrixMode
extends Mode<Velocity> {
    @EventLink
    public /* synthetic */ Listener<fd> uM;
    @EventLink(cH=0)
    public /* synthetic */ Listener<PacketReceiveEvent> uK;
    @EventLink
    public /* synthetic */ Listener<StrafeEvent> uL;
    private static /* synthetic */ int[] q0OOOoo00o0;
    private static /* synthetic */ int Oo0o00000O00;
    private static /* synthetic */ boolean oO00O0OO0ooO;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MatrixMode(String string, Velocity velocity) {
        int n2 = -1689474337;
        if (n2 != n2) {
            throw null;
        }
        super(string, velocity);
        this.uK = this::c;
        this.uL = this::b;
        this.uM = fd2 -> {
            int n2 = -449499960;
            if (n2 != n2) {
                throw null;
            }
            if (fd2.getPosY() < MatrixMode.aER.bgK.gX - Double.longBitsToDouble(0xF4DD88021EBFF9EEL ^ 0xB4DD88021EBFF9EEL)) {
                // empty if block
            }
            int n3 = 1680527523;
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void o0Oo000O0oO() {
        int n2 = 1843738338;
        if (n2 != n2) {
            int cfr_ignored_0 = 0xA & 1;
        }
        q0OOOoo00o0 = new int[0x748E ^ 0x74AC];
        int n3 = 1705236561;
        block10: while (true) {
            switch (n3) {
                case 1577980482: {
                    MatrixMode.q0OOOoo00o0[0xB1DC ^ 0xB1C5] = 0xFFFF4E3A ^ 0xB1C5;
                    MatrixMode.q0OOOoo00o0[0xA5A4 ^ 0xA5BA] = 0x1E889DE5 ^ 0xA5BA;
                    n3 = 579139471;
                    continue block10;
                }
                case 579139471: {
                    MatrixMode.q0OOOoo00o0[0x1079D ^ 0x1078C] = 0x1078D ^ 0x1078C;
                    MatrixMode.q0OOOoo00o0[0xEABE ^ 0xEAA4] = 0xCE0C9644 ^ 0xEAA4;
                    MatrixMode.q0OOOoo00o0[0x500F ^ 0x5012] = 0xFFFFAFC5 ^ 0x5012;
                    MatrixMode.q0OOOoo00o0[0x27FE ^ 0x27FC] = 0x27FF ^ 0x27FC;
                    MatrixMode.q0OOOoo00o0[0x4AC1 ^ 0x4AD6] = 0x4986 ^ 0x4AD6;
                    MatrixMode.q0OOOoo00o0[0xDFFE ^ 0xDFF5] = 0xDE75 ^ 0xDFF5;
                    MatrixMode.q0OOOoo00o0[0x5A59 ^ 0x5A5E] = 0x5A0B ^ 0x5A5E;
                    MatrixMode.q0OOOoo00o0[0xCA63 ^ 0xCA76] = 0xFFFF3589 ^ 0xCA76;
                    MatrixMode.q0OOOoo00o0[0xFB3D ^ 0xFB35] = 0xFB2A ^ 0xFB35;
                    n3 = 2055992920;
                    continue block10;
                }
                case 2055992920: {
                    MatrixMode.q0OOOoo00o0[0xFAAA ^ 0xFAAA] = 0xC540FAAA ^ 0xFAAA;
                    MatrixMode.q0OOOoo00o0[0xCD7E ^ 0xCD77] = 0xCD76 ^ 0xCD77;
                    MatrixMode.q0OOOoo00o0[0x10DD0 ^ 0x10DCB] = 0x10DC8 ^ 0x10DCB;
                    MatrixMode.q0OOOoo00o0[0xD43E ^ 0xD41E] = 0xFFFF2BE3 ^ 0xD41E;
                    MatrixMode.q0OOOoo00o0[0xE58A ^ 0xE586] = 0xE59B ^ 0xE586;
                    MatrixMode.q0OOOoo00o0[0x3C7C ^ 0x3C7A] = 0xF8122398 ^ 0x3C7A;
                    MatrixMode.q0OOOoo00o0[0x7444 ^ 0x744A] = 0x7455 ^ 0x744A;
                    n3 = 329107166;
                    continue block10;
                }
                case 329107166: {
                    MatrixMode.q0OOOoo00o0[0xD336 ^ 0xD326] = 0xD339 ^ 0xD326;
                    return;
                }
                default: {
                    MatrixMode.q0OOOoo00o0[0x3332 ^ 0x333F] = 0x333C ^ 0x333F;
                    n3 = 94352068;
                    continue block10;
                }
                case 94352068: {
                    MatrixMode.q0OOOoo00o0[0x86FD ^ 0x86F7] = 0x8686 ^ 0x86F7;
                    n3 = 1117538845;
                    continue block10;
                }
                case 1117538845: {
                    MatrixMode.q0OOOoo00o0[0xA1EC ^ 0xA1FE] = 0xA1E9 ^ 0xA1FE;
                    MatrixMode.q0OOOoo00o0[0xA138 ^ 0xA12B] = 0xA122 ^ 0xA12B;
                    n3 = -831893850;
                    continue block10;
                }
                case -831893850: {
                    MatrixMode.q0OOOoo00o0[0xDE35 ^ 0xDE23] = 0xDE6C ^ 0xDE23;
                    MatrixMode.q0OOOoo00o0[0xD5DE ^ 0xD5DB] = 0xD5D6 ^ 0xD5DB;
                    MatrixMode.q0OOOoo00o0[0xD0BA ^ 0xD0A6] = 0xD0BB ^ 0xD0A6;
                    MatrixMode.q0OOOoo00o0[0xCB37 ^ 0xCB38] = 0xCB39 ^ 0xCB38;
                    MatrixMode.q0OOOoo00o0[0x1DF1 ^ 0x1DD0] = 0xFFFFE25D ^ 0x1DD0;
                    MatrixMode.q0OOOoo00o0[0xDC27 ^ 0xDC33] = 0xFFFF239C ^ 0xDC33;
                    MatrixMode.q0OOOoo00o0[0x10A46 ^ 0x10A59] = 0x10A34 ^ 0x10A59;
                    MatrixMode.q0OOOoo00o0[0xA031 ^ 0xA035] = 0xA026 ^ 0xA035;
                    n3 = -1979279245;
                    continue block10;
                }
                case -1979279245: 
            }
            MatrixMode.q0OOOoo00o0[0xABB8 ^ 0xABA0] = 0x8C13F9BD ^ 0xABA0;
            MatrixMode.q0OOOoo00o0[0xE590 ^ 0xE593] = 0xE58E ^ 0xE593;
            MatrixMode.q0OOOoo00o0[0x5CEA ^ 0x5CEB] = 0x5CD6 ^ 0x5CEB;
            n3 = 1577980482;
        }
    }

    static {
        MatrixMode.o0Oo000O0oO();
        int n2 = -1178855671;
    }
}

