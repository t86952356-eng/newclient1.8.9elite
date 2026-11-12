/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import hackclient.rise.eh;
import hackclient.rise.fd;
import net.minecraft.client.Minecraft;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.f;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class WatchdogPredictionMode
extends Mode<Flight> {
    @EventLink
    public /* synthetic */ Listener<PacketSendEvent> FN;
    @EventLink
    public /* synthetic */ Listener<PacketReceiveEvent> FM;
    @EventLink
    public /* synthetic */ Listener<fd> FK;
    @EventLink
    public /* synthetic */ Listener<eh> FL;
    @EventLink
    public /* synthetic */ Listener<PreMotionEvent> yu;
    @EventLink
    public /* synthetic */ Listener<fd> FO;
    private static /* synthetic */ int[] q0OOOoo00o0;
    public /* synthetic */ boolean ys;
    private static /* synthetic */ int Oo0o00000O00;
    private static /* synthetic */ boolean oO00O0OO0ooO;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void o0Oo000O0oO() {
        int n2 = 1493781306;
        if (n2 != n2) {
            int cfr_ignored_0 = 0x59 & 1;
        }
        q0OOOoo00o0 = new int[0xB394 ^ 0xB3D5];
        WatchdogPredictionMode.q0OOOoo00o0[0xE716 ^ 0xE708] = 0xE719 ^ 0xE708;
        WatchdogPredictionMode.q0OOOoo00o0[0xB73 ^ 0xB48] = 0xB49 ^ 0xB48;
        int n3 = 1794534320;
        block17: while (true) {
            switch (n3) {
                case 1298425788: {
                    WatchdogPredictionMode.q0OOOoo00o0[0x7FDC ^ 0x7FC6] = 0x7E1F ^ 0x7FC6;
                    WatchdogPredictionMode.q0OOOoo00o0[0x76CD ^ 0x76FF] = 0x76C8 ^ 0x76FF;
                    WatchdogPredictionMode.q0OOOoo00o0[0xA4A1 ^ 0xA4AC] = 0xA4AD ^ 0xA4AC;
                    WatchdogPredictionMode.q0OOOoo00o0[0xAA0D ^ 0xAA11] = 0xBA2E21B2 ^ 0xAA11;
                    WatchdogPredictionMode.q0OOOoo00o0[0xD6F8 ^ 0xD6F0] = 0x486757BB ^ 0xD6F0;
                    WatchdogPredictionMode.q0OOOoo00o0[0x4BA9 ^ 0x4BBC] = 0x10C4BBC ^ 0x4BBC;
                    n3 = -1143746735;
                    continue block17;
                }
                case -1143746735: {
                    WatchdogPredictionMode.q0OOOoo00o0[0x1B8 ^ 0x192] = 0x185 ^ 0x192;
                    WatchdogPredictionMode.q0OOOoo00o0[0xE591 ^ 0xE581] = 0xFFFF1A1A ^ 0xE581;
                    WatchdogPredictionMode.q0OOOoo00o0[0x9D68 ^ 0x9D6D] = 0x9D49 ^ 0x9D6D;
                    n3 = -846124542;
                    continue block17;
                }
                case -846124542: {
                    WatchdogPredictionMode.q0OOOoo00o0[0xF362 ^ 0xF35E] = 0xF341 ^ 0xF35E;
                    WatchdogPredictionMode.q0OOOoo00o0[0x8448 ^ 0x8463] = 0xFFFF7B82 ^ 0x8463;
                    WatchdogPredictionMode.q0OOOoo00o0[0x5906 ^ 0x5910] = 0x591F ^ 0x5910;
                    WatchdogPredictionMode.q0OOOoo00o0[0xFFF1 ^ 0xFFDD] = 0xAAAA5552 ^ 0xFFDD;
                    WatchdogPredictionMode.q0OOOoo00o0[0x237F ^ 0x236E] = 0x237B ^ 0x236E;
                    n3 = 1762903012;
                    continue block17;
                }
                case 1762903012: {
                    WatchdogPredictionMode.q0OOOoo00o0[0x6E69 ^ 0x6E49] = 0x6E4A ^ 0x6E49;
                    WatchdogPredictionMode.q0OOOoo00o0[0x5549 ^ 0x554B] = 0x5548 ^ 0x554B;
                    WatchdogPredictionMode.q0OOOoo00o0[0xAB0B ^ 0xAB3C] = 0xAB2F ^ 0xAB3C;
                    WatchdogPredictionMode.q0OOOoo00o0[0xF040 ^ 0xF052] = 0xF059 ^ 0xF052;
                    n3 = 1329831260;
                    continue block17;
                }
                case 1329831260: {
                    WatchdogPredictionMode.q0OOOoo00o0[0x3283 ^ 0x32AE] = 0xFFFFCD79 ^ 0x32AE;
                    WatchdogPredictionMode.q0OOOoo00o0[0x2050 ^ 0x207E] = 0x207D ^ 0x207E;
                    WatchdogPredictionMode.q0OOOoo00o0[0x2B9A ^ 0x2B82] = 0x2BF9 ^ 0x2B82;
                    n3 = 1398590278;
                    continue block17;
                }
                case 1398590278: {
                    return;
                }
                default: {
                    WatchdogPredictionMode.q0OOOoo00o0[0xDF1A ^ 0xDF3B] = 0xDF26 ^ 0xDF3B;
                    WatchdogPredictionMode.q0OOOoo00o0[0xF8B6 ^ 0xF880] = 0x7880 ^ 0xF880;
                    n3 = -131496889;
                    continue block17;
                }
                case -131496889: {
                    WatchdogPredictionMode.q0OOOoo00o0[0xC94D ^ 0xC975] = 0xC978 ^ 0xC975;
                    n3 = 1030439736;
                    continue block17;
                }
                case 1030439736: {
                    WatchdogPredictionMode.q0OOOoo00o0[0x443F ^ 0x4438] = 0x446B ^ 0x4438;
                    WatchdogPredictionMode.q0OOOoo00o0[0xCD79 ^ 0xCD7F] = 0xCD50 ^ 0xCD7F;
                    n3 = -2053430217;
                    continue block17;
                }
                case -2053430217: {
                    WatchdogPredictionMode.q0OOOoo00o0[0xF2C6 ^ 0xF2C2] = 0xF2C5 ^ 0xF2C2;
                    WatchdogPredictionMode.q0OOOoo00o0[0x9ECD ^ 0x9ED9] = 0xFFFF614C ^ 0x9ED9;
                    WatchdogPredictionMode.q0OOOoo00o0[0xCA1A ^ 0xCA14] = 0xFFFF359B ^ 0xCA14;
                    WatchdogPredictionMode.q0OOOoo00o0[0xC802 ^ 0xC80B] = 0xFFFF3796 ^ 0xC80B;
                    WatchdogPredictionMode.q0OOOoo00o0[0xA5C6 ^ 0xA5E0] = 0xA5FF ^ 0xA5E0;
                    WatchdogPredictionMode.q0OOOoo00o0[0x7C5 ^ 0x7DA] = 0x7D5 ^ 0x7DA;
                    WatchdogPredictionMode.q0OOOoo00o0[0xA68E ^ 0xA6BA] = 0xA6BB ^ 0xA6BA;
                    WatchdogPredictionMode.q0OOOoo00o0[0x5084 ^ 0x50A3] = 0x50B0 ^ 0x50A3;
                    WatchdogPredictionMode.q0OOOoo00o0[0x416D ^ 0x417E] = 0xFFFFBEED ^ 0x417E;
                    WatchdogPredictionMode.q0OOOoo00o0[0xA0FD ^ 0xA0F2] = 0xA0F2 ^ 0xA0F2;
                    WatchdogPredictionMode.q0OOOoo00o0[0xEC2B ^ 0xEC28] = 0xEC31 ^ 0xEC28;
                    WatchdogPredictionMode.q0OOOoo00o0[0xF864 ^ 0xF857] = 0xF840 ^ 0xF857;
                    WatchdogPredictionMode.q0OOOoo00o0[0xD387 ^ 0xD39A] = 0x166139A ^ 0xD39A;
                    n3 = -981647653;
                    continue block17;
                }
                case -981647653: {
                    WatchdogPredictionMode.q0OOOoo00o0[0xFF70 ^ 0xFF58] = 0xFFFF3EA7 ^ 0xFF58;
                    WatchdogPredictionMode.q0OOOoo00o0[0xD3CE ^ 0xD3E1] = 0xD3FC ^ 0xD3E1;
                    WatchdogPredictionMode.q0OOOoo00o0[0xE0E8 ^ 0xE0E9] = 0xE0F4 ^ 0xE0E9;
                    WatchdogPredictionMode.q0OOOoo00o0[0x5F33 ^ 0x5F1A] = 0x5F13 ^ 0x5F1A;
                    WatchdogPredictionMode.q0OOOoo00o0[0x43A1 ^ 0x43B6] = 0x43A7 ^ 0x43B6;
                    WatchdogPredictionMode.q0OOOoo00o0[0xD60F ^ 0xD64F] = 0x259320D4 ^ 0xD64F;
                    n3 = -71541016;
                    continue block17;
                }
                case -71541016: {
                    WatchdogPredictionMode.q0OOOoo00o0[0x52A1 ^ 0x52BA] = 0xFFFFAD3D ^ 0x52BA;
                    WatchdogPredictionMode.q0OOOoo00o0[0x91A5 ^ 0x91AF] = 0x91A2 ^ 0x91AF;
                    WatchdogPredictionMode.q0OOOoo00o0[0x1044B ^ 0x10469] = 0xFFFEFBEC ^ 0x10469;
                    n3 = 1013617586;
                    continue block17;
                }
                case 1013617586: {
                    WatchdogPredictionMode.q0OOOoo00o0[0x76A3 ^ 0x7680] = 0xC18FEA99 ^ 0x7680;
                    n3 = -1915773412;
                    continue block17;
                }
                case -1915773412: {
                    WatchdogPredictionMode.q0OOOoo00o0[0x7E2C ^ 0x7E13] = 0x7E64 ^ 0x7E13;
                    WatchdogPredictionMode.q0OOOoo00o0[0x490D ^ 0x493C] = 0x80004972 ^ 0x493C;
                    WatchdogPredictionMode.q0OOOoo00o0[0x7C5B ^ 0x7C42] = 0x7C57 ^ 0x7C42;
                    WatchdogPredictionMode.q0OOOoo00o0[0x776F ^ 0x774A] = 0x7725 ^ 0x774A;
                    n3 = 559266459;
                    continue block17;
                }
                case 559266459: {
                    WatchdogPredictionMode.q0OOOoo00o0[0xCA6D ^ 0xCA49] = 0xD798967 ^ 0xCA49;
                    WatchdogPredictionMode.q0OOOoo00o0[0xE76A ^ 0xE753] = 0xE750 ^ 0xE753;
                    WatchdogPredictionMode.q0OOOoo00o0[0xACAF ^ 0xAC92] = 0x8113F09E ^ 0xAC92;
                    n3 = -177754736;
                    continue block17;
                }
                case -177754736: 
            }
            WatchdogPredictionMode.q0OOOoo00o0[0xE910 ^ 0xE92E] = 0xE945 ^ 0xE92E;
            WatchdogPredictionMode.q0OOOoo00o0[0x5C98 ^ 0x5CA2] = 0x5CBF ^ 0x5CA2;
            WatchdogPredictionMode.q0OOOoo00o0[0x203C ^ 0x2030] = 0x202F ^ 0x2030;
            WatchdogPredictionMode.q0OOOoo00o0[0x178C ^ 0x1787] = 0x1794 ^ 0x1787;
            WatchdogPredictionMode.q0OOOoo00o0[0xFF94 ^ 0xFFA4] = 0xFFA7 ^ 0xFFA4;
            WatchdogPredictionMode.q0OOOoo00o0[0x9634 ^ 0x9634] = 0x9634 ^ 0x9634;
            WatchdogPredictionMode.q0OOOoo00o0[0x61E9 ^ 0x61DC] = 0x61C3 ^ 0x61DC;
            n3 = 1298425788;
        }
    }

    static {
        WatchdogPredictionMode.o0Oo000O0oO();
    }

    /*
     * Enabled aggressive block sorting
     */
    public WatchdogPredictionMode(String string, Flight flight) {
        int n2 = 2117278992;
        if (n2 != n2) {
        }
        super(string, flight);
        this.FK = fd2 -> {
            this.ys = this.ys;
        };
        this.FL = this::a;
        this.FM = this::a;
        this.yu = preMotionEvent -> {
            long l2;
            int n2 = 1728837187;
            if (n2 != n2) {
            }
            Object[] objectArray = new Object[14];
            long[] lArray = new long[14];
            if (WatchdogPredictionMode.aER.bgK.aRg % -(q0OOOoo00o0[19] - q0OOOoo00o0[20]) == 0 && this.ys) {
                int n3 = 575845543;
                lArray[7] = l2 = Double.doubleToRawLongBits(aii.direction());
                lArray[13] = l2 = Double.doubleToRawLongBits(-bt.bx((float)Double.longBitsToDouble(lArray[7])) * 100.0f);
                lArray[3] = l2 = Double.doubleToRawLongBits(bt.bB((float)Double.longBitsToDouble(lArray[7])) * 100.0f);
                preMotionEvent.setPosY(preMotionEvent.getPosY() + Double.longBitsToDouble(0x5B794FADFD7E059CL ^ 0x1B204FADFD7E059CL));
                int n4 = 794793927;
                objectArray[0] = Minecraft.getMinecraft().bgF;
                lArray[2] = l2 = 3253234858424172129L;
                int n5 = q0OOOoo00o0[21];
                long l3 = lArray[2];
                lArray[2] = l2 = l3 ^ ((long)Minecraft.getMinecraft().bgF.Ho() << (n5 << q0OOOoo00o0[22] | n5 >>> q0OOOoo00o0[23]) - q0OOOoo00o0[24] + q0OOOoo00o0[25] ^ l3) & -1L << (q0OOOoo00o0[26] + q0OOOoo00o0[27]) * q0OOOoo00o0[28];
            }
            objectArray[7] = Minecraft.getMinecraft().bgF;
            lArray[4] = l2 = 5595454799759352106L;
            int n6 = q0OOOoo00o0[29];
            int n7 = n6 >>> q0OOOoo00o0[30] | n6 << q0OOOoo00o0[31];
            long l4 = lArray[4];
            lArray[4] = l2 = l4 ^ ((long)Minecraft.getMinecraft().bgF.Ho() << ((n7 << q0OOOoo00o0[32] | n7 >>> q0OOOoo00o0[33]) + q0OOOoo00o0[34]) * q0OOOoo00o0[35] ^ l4) & -1L << ((q0OOOoo00o0[36] ^ q0OOOoo00o0[37]) + q0OOOoo00o0[38]) * q0OOOoo00o0[39];
        };
        this.FN = packetSendEvent -> {
            int n2 = 1771444149;
            if (n2 != n2) {
                throw null;
            }
            Object[] objectArray = new Object[3];
            objectArray[1] = packetSendEvent.dq();
            if ((aj)objectArray[1] instanceof f) {
                objectArray[0] = (f)((aj)objectArray[1]);
            }
        };
        this.FO = fd2 -> {};
    }
}

