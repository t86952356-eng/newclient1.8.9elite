/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package rise.module.impl.movement.jesus;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.es;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Jesus;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class WatchdogMode
extends Mode<Jesus> {
    @EventLink(cH=0)
    public /* synthetic */ Listener<PacketReceiveEvent> KY;
    private static /* synthetic */ int[] 0OOOoo00o0;
    @EventLink
    public /* synthetic */ Listener<PreMotionEvent> KW;
    @EventLink
    public /* synthetic */ Listener<StrafeEvent> KX;
    public /* synthetic */ Boolean KU;
    @EventLink
    public /* synthetic */ Listener<es> KV;
    private static /* synthetic */ int Oo0o00000O00;
    private static /* synthetic */ boolean oO00O0OO0ooO;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ void d(StrafeEvent var0) {
        var3_1 = -743229815;
        if (var3_1 != var3_1) {
            WatchdogMode.Oo0o00000O00 = var3_1 = 1702305948;
        }
        if ((var3_1 = -313263012) != var3_1) {
            63 & 1;
        }
        if ((var3_1 = 1394283884) != var3_1) {
            var3_1 = 2072290593;
        }
        var1_2 = 478550602;
        if (true) ** GOTO lbl17
        block5: while (true) {
            if (WatchdogMode.aER.bgK.csz) {
                var1_2 = -831715010;
            } else lbl-1000:
            // 2 sources

            {
                return;
            }
lbl17:
            // 2 sources

            block7: while (true) {
                switch (var1_2) {
                    case -831715010: {
                        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13)) ** GOTO lbl-1000
                        aii.strafe(Double.longBitsToDouble(-393836306816688532L ^ -4228944052627060378L));
                        return;
                    }
                    default: {
                        if (aik.vA()) {
                            v0 = -(WatchdogMode.0OOOoo00o0[10] ^ WatchdogMode.0OOOoo00o0[11]);
                            if (WatchdogMode.aER.bgK.ae > (v0 << WatchdogMode.0OOOoo00o0[12] | v0 >>> WatchdogMode.0OOOoo00o0[13]) && !WatchdogMode.aER.bgK.csz) {
                                if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13)) {
                                    var0.setSpeed(Double.longBitsToDouble(307110836442302285L ^ 4289976619983970724L));
                                    continue block5;
                                }
                                var0.setSpeed(Double.longBitsToDouble(-2426890669947046762L ^ -2192541121938830003L));
                                continue block5;
                            }
                        }
                        var1_2 = -179772890;
                        continue block7;
                    }
                    case -179772890: {
                        if (!aik.vA()) continue block5;
                        var1_2 = -1502605869;
                        continue block7;
                    }
                    case -1502605869: 
                }
                break;
            }
            v1 = -WatchdogMode.0OOOoo00o0[14] ^ WatchdogMode.0OOOoo00o0[15];
            if (WatchdogMode.aER.bgK.ae <= -(v1 >>> WatchdogMode.0OOOoo00o0[16] | v1 << WatchdogMode.0OOOoo00o0[17])) continue;
            aii.strafe();
        }
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ void f(PreMotionEvent var0) {
        var3_1 = -1450201538;
        if (var3_1 == var3_1) ** GOTO lbl25
        63 & 1;
        ** GOTO lbl25
lbl6:
        // 1 sources

        while (true) {
            v0 = Double.longBitsToDouble(3677973418795618047L ^ 917266847217503999L);
            ** GOTO lbl11
lbl9:
            // 1 sources

            while (true) {
                v0 = Double.longBitsToDouble(3802922961582836160L ^ 821363360454883684L);
lbl11:
                // 2 sources

                var0.setPosY(v1 - v0);
                v2 = WatchdogMode.0OOOoo00o0[25] ^ WatchdogMode.0OOOoo00o0[26];
                var0.setOnGround((boolean)(v2 << WatchdogMode.0OOOoo00o0[27] | v2 >>> WatchdogMode.0OOOoo00o0[28]));
                block7: while (true) {
                    continue;
lbl16:
                    // 1 sources

                    return;
                    var1_2 = 679157493;
                    block9: while (true) {
                        switch (var1_2) {
                            case 1516908027: {
                                continue block7;
                            }
                            case 679157493: {
                                ** continue;
                            }
lbl25:
                            // 2 sources

                            if (!aik.vA()) continue block7;
                            var1_2 = 1822967452;
                            continue block9;
                            default: {
                                if (!WatchdogMode.aER.bgK.csz) ** break;
                                continue block7;
                                v3 = WatchdogMode.0OOOoo00o0[18];
                                WatchdogMode.aER.bgK.aO = (v3 << WatchdogMode.0OOOoo00o0[19] | v3 >>> WatchdogMode.0OOOoo00o0[20]) * WatchdogMode.0OOOoo00o0[21];
                                var1_2 = -2015009435;
                                continue block9;
                            }
                            case -2015009435: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
        v1 = var0.getPosY();
        ** while (WatchdogMode.aER.bgK.aRg % (WatchdogMode.0OOOoo00o0[22] ^ WatchdogMode.0OOOoo00o0[23] ^ WatchdogMode.0OOOoo00o0[24]) != 0)
lbl38:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public WatchdogMode(String string, Jesus jesus) {
        int n2 = -1675536132;
        if (n2 != n2) {
            int cfr_ignored_0 = 0x5C & 1;
        }
        super(string, jesus);
        this.KU = ((0OOOoo00o0[0] ^ 0OOOoo00o0[1]) - 0OOOoo00o0[2] ^ 0OOOoo00o0[3]) * 0OOOoo00o0[4];
        this.KV = this::a;
        this.KW = WatchdogMode::f;
        this.KX = WatchdogMode::d;
        this.KY = packetReceiveEvent -> {
            int n2 = 1459712025;
            if (n2 != n2) {
                int cfr_ignored_1 = 85 + 18;
            }
            if ((n2 = -776268035) != n2) {
                int cfr_ignored_2 = 0x57 & 1;
            }
            Object[] objectArray = new Object[4];
            objectArray[2] = packetReceiveEvent.dq();
            int n3 = 1313496590;
            boolean bl2 = true;
            block6: while (true) {
                if (!bl2 || (bl2 = false) || !true) {
                    n3 = 593014903;
                }
                block7: while (true) {
                    switch (n3) {
                        case 593014903: {
                            objectArray[3] = (t)((aj)objectArray[2]);
                            if (((t)objectArray[3]).getEntityID() != WatchdogMode.aER.bgK.getEntityId()) break block6;
                            int n4 = 0OOOoo00o0[5] ^ 0OOOoo00o0[6];
                            ((t)objectArray[3]).dcS = (n4 << 0OOOoo00o0[7] | n4 >>> 0OOOoo00o0[8]) + 0OOOoo00o0[9];
                            packetReceiveEvent.cF();
                            return;
                        }
                        default: {
                            if ((aj)objectArray[2] instanceof t && this.KU.booleanValue()) continue block6;
                            if (!((aj)objectArray[2] instanceof t)) break block6;
                            n3 = 1319806018;
                            continue block7;
                        }
                        case 1319806018: {
                            if (aik.vA()) continue block6;
                            n3 = 714904918;
                            continue block7;
                        }
                        case 714904918: {
                            if (!WatchdogMode.aER.bgK.csz) break block6;
                            continue block6;
                        }
                    }
                    break;
                }
                break;
            }
        };
    }

    static {
        WatchdogMode.o0Oo000O0oO();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void o0Oo000O0oO() {
        int n2 = -804652638;
        if (n2 != n2) {
            int cfr_ignored_0 = 28 + 96;
        }
        int n3 = 514307772;
        block15: while (true) {
            switch (n3) {
                case 595943254: {
                    WatchdogMode.0OOOoo00o0[0xD8D5 ^ 0xD8FB] = 0xD8A6 ^ 0xD8FB;
                    WatchdogMode.0OOOoo00o0[0x10A0C ^ 0x10A19] = 0xFFFEF582 ^ 0x10A19;
                    WatchdogMode.0OOOoo00o0[0x2EDE ^ 0x2E90] = 0x2E91 ^ 0x2E90;
                    WatchdogMode.0OOOoo00o0[0xE6C2 ^ 0xE6E9] = 0xE6F2 ^ 0xE6E9;
                    WatchdogMode.0OOOoo00o0[0x8C87 ^ 0x8C9E] = 0x8CC3 ^ 0x8C9E;
                    WatchdogMode.0OOOoo00o0[0xC088 ^ 0xC0B3] = 0x164208EA ^ 0xC0B3;
                    n3 = 178971307;
                    continue block15;
                }
                case 178971307: {
                    WatchdogMode.0OOOoo00o0[0xEAB9 ^ 0xEAEA] = 0xFFFF150D ^ 0xEAEA;
                    WatchdogMode.0OOOoo00o0[0x10B99 ^ 0x10BAB] = 0xA9409D9C ^ 0x10BAB;
                    WatchdogMode.0OOOoo00o0[0x29A ^ 0x298] = 0xFFFFFD51 ^ 0x298;
                    WatchdogMode.0OOOoo00o0[0xFCA6 ^ 0xFC9A] = 0xFFFF032D ^ 0xFC9A;
                    WatchdogMode.0OOOoo00o0[0x2E9C ^ 0x2E8F] = 0x2E80 ^ 0x2E8F;
                    WatchdogMode.0OOOoo00o0[0xC63D ^ 0xC619] = 0xC60C ^ 0xC619;
                    WatchdogMode.0OOOoo00o0[0x107B3 ^ 0x107AF] = 0x107A2 ^ 0x107AF;
                    WatchdogMode.0OOOoo00o0[0xDBC0 ^ 0xDB8D] = 0xDB92 ^ 0xDB8D;
                    WatchdogMode.0OOOoo00o0[0xA785 ^ 0xA79B] = 0xA798 ^ 0xA79B;
                    WatchdogMode.0OOOoo00o0[0x20C4 ^ 0x20DC] = 0xFFFFDF45 ^ 0x20DC;
                    WatchdogMode.0OOOoo00o0[0xBFF1 ^ 0xBFC7] = 0xBFE8 ^ 0xBFC7;
                    WatchdogMode.0OOOoo00o0[0x1DA5 ^ 0x1DBA] = 0xFFFFE24D ^ 0x1DBA;
                    WatchdogMode.0OOOoo00o0[0xE59A ^ 0xE5B0] = 0xE5BF ^ 0xE5B0;
                    WatchdogMode.0OOOoo00o0[0xD2B3 ^ 0xD2BD] = 0xD2BD ^ 0xD2BD;
                    WatchdogMode.0OOOoo00o0[0xA1EC ^ 0xA1E7] = 0xFFFF5E18 ^ 0xA1E7;
                    WatchdogMode.0OOOoo00o0[0x30D ^ 0x31F] = 0x9D270485 ^ 0x31F;
                    WatchdogMode.0OOOoo00o0[0x31AE ^ 0x31EC] = 0x3181 ^ 0x31EC;
                    WatchdogMode.0OOOoo00o0[0x6249 ^ 0x6203] = 0x620E ^ 0x6203;
                    n3 = -630582223;
                    continue block15;
                }
                case -630582223: {
                    WatchdogMode.0OOOoo00o0[0xAA6C ^ 0xAA71] = 0xC71CDBA1 ^ 0xAA71;
                    WatchdogMode.0OOOoo00o0[0x62B5 ^ 0x62E5] = 0xFFFF9D1A ^ 0x62E5;
                    WatchdogMode.0OOOoo00o0[0x693F ^ 0x6919] = 0xFFFF96E6 ^ 0x6919;
                    WatchdogMode.0OOOoo00o0[0x78E8 ^ 0x78CF] = 0x7890 ^ 0x78CF;
                    WatchdogMode.0OOOoo00o0[0x69 ^ 0x73] = 0x2E ^ 0x73;
                    n3 = -1072891522;
                    continue block15;
                }
                case -1072891522: {
                    WatchdogMode.0OOOoo00o0[0x51B9 ^ 0x51A9] = 0x51A8 ^ 0x51A9;
                    n3 = 182337388;
                    continue block15;
                }
                case 182337388: {
                    WatchdogMode.0OOOoo00o0[0x7402 ^ 0x744D] = 0x744D ^ 0x744D;
                    WatchdogMode.0OOOoo00o0[0x7832 ^ 0x787E] = 0xFFFF87B1 ^ 0x787E;
                    WatchdogMode.0OOOoo00o0[0xA8C8 ^ 0xA8CF] = 0xA8D0 ^ 0xA8CF;
                    WatchdogMode.0OOOoo00o0[0x8684 ^ 0x86B3] = 0x86A6 ^ 0x86B3;
                    WatchdogMode.0OOOoo00o0[0x424F ^ 0x4242] = 0x424F ^ 0x4242;
                    WatchdogMode.0OOOoo00o0[0x1011B ^ 0x1015A] = 0xDCFCCE87 ^ 0x1015A;
                    WatchdogMode.0OOOoo00o0[0xEF7C ^ 0xEF5D] = 0xFFFF177D ^ 0xEF5D;
                    n3 = -2074077821;
                    continue block15;
                }
                case -2074077821: {
                    WatchdogMode.0OOOoo00o0[0xF344 ^ 0xF368] = 0xF36D ^ 0xF368;
                    WatchdogMode.0OOOoo00o0[0x5FF8 ^ 0x5FB0] = 0x5FD5 ^ 0x5FB0;
                    n3 = 185359769;
                    continue block15;
                }
                case 185359769: {
                    WatchdogMode.0OOOoo00o0[0x71C7 ^ 0x7187] = 0xFFFF8E78 ^ 0x7187;
                    WatchdogMode.0OOOoo00o0[0x108E5 ^ 0x108ED] = 0x108EC ^ 0x108ED;
                    WatchdogMode.0OOOoo00o0[0xCF8D ^ 0xCFA4] = 0xCFB5 ^ 0xCFA4;
                    WatchdogMode.0OOOoo00o0[0x8136 ^ 0x8120] = 0x812E ^ 0x8120;
                    n3 = 2065751346;
                    continue block15;
                }
                case 2065751346: {
                    WatchdogMode.0OOOoo00o0[0x1B11 ^ 0x1B21] = 0x1B3E ^ 0x1B21;
                    n3 = 693621278;
                    continue block15;
                }
                case 693621278: {
                    WatchdogMode.0OOOoo00o0[0x96FE ^ 0x96C3] = 0xDFC7E93C ^ 0x96C3;
                    WatchdogMode.0OOOoo00o0[0x5F3 ^ 0x5C0] = 0xFFFFFA73 ^ 0x5C0;
                    WatchdogMode.0OOOoo00o0[0xA563 ^ 0xA55D] = 0xA552 ^ 0xA55D;
                    WatchdogMode.0OOOoo00o0[0x5C74 ^ 0x5C78] = 0x5C6B ^ 0x5C78;
                    WatchdogMode.0OOOoo00o0[0x6EF0 ^ 0x6EB9] = 0x6EAA ^ 0x6EB9;
                    n3 = -736003919;
                    continue block15;
                }
                case -736003919: {
                    WatchdogMode.0OOOoo00o0[0x5ACC ^ 0x5A8A] = 0x914C4127 ^ 0x5A8A;
                    WatchdogMode.0OOOoo00o0[0xEC7A ^ 0xEC3D] = 0x713A6 ^ 0xEC3D;
                    WatchdogMode.0OOOoo00o0[0xC929 ^ 0xC901] = 0x4901 ^ 0xC901;
                    WatchdogMode.0OOOoo00o0[0xE7DD ^ 0xE7CA] = 0xFFFF185F ^ 0xE7CA;
                    WatchdogMode.0OOOoo00o0[0x9563 ^ 0x9577] = 0x9566 ^ 0x9577;
                    WatchdogMode.0OOOoo00o0[0xAC4B ^ 0xAC00] = 0xAC21 ^ 0xAC00;
                    WatchdogMode.0OOOoo00o0[0x3D0 ^ 0x3CB] = 0x3D8 ^ 0x3CB;
                    n3 = 1729631406;
                    continue block15;
                }
                case 1729631406: {
                    WatchdogMode.0OOOoo00o0[0x1874 ^ 0x1841] = 0xF540186F ^ 0x1841;
                    return;
                }
                default: {
                    0OOOoo00o0 = new int[0xE708 ^ 0xE75C];
                    WatchdogMode.0OOOoo00o0[0xE061 ^ 0xE067] = 0xFFFF1F98 ^ 0xE067;
                    WatchdogMode.0OOOoo00o0[0x9446 ^ 0x946B] = 0x9406 ^ 0x946B;
                    WatchdogMode.0OOOoo00o0[0xC070 ^ 0xC075] = 0xC019 ^ 0xC075;
                    WatchdogMode.0OOOoo00o0[0x3CC6 ^ 0x3CC7] = 0xFFFFC338 ^ 0x3CC7;
                    WatchdogMode.0OOOoo00o0[0xF187 ^ 0xF196] = 0xF189 ^ 0xF196;
                    n3 = 406145279;
                    continue block15;
                }
                case 406145279: {
                    WatchdogMode.0OOOoo00o0[0x4BA4 ^ 0x4BA7] = 0xFFFFB458 ^ 0x4BA7;
                    WatchdogMode.0OOOoo00o0[0x534B ^ 0x5372] = 0xFFFFACFB ^ 0x5372;
                    n3 = 280863466;
                    continue block15;
                }
                case 280863466: 
            }
            WatchdogMode.0OOOoo00o0[0x154E ^ 0x154E] = 0x1579 ^ 0x154E;
            WatchdogMode.0OOOoo00o0[0x1FBD ^ 0x1FFE] = 0x777768D6 ^ 0x1FFE;
            WatchdogMode.0OOOoo00o0[0xE65B ^ 0xE678] = 0xD3ED ^ 0xE678;
            WatchdogMode.0OOOoo00o0[0x9A98 ^ 0x9ADD] = 0xFFFF652C ^ 0x9ADD;
            WatchdogMode.0OOOoo00o0[0xDD06 ^ 0xDD02] = 0xB823330B ^ 0xDD02;
            WatchdogMode.0OOOoo00o0[0x3DFA ^ 0x3DCB] = 0x6517 ^ 0x3DCB;
            WatchdogMode.0OOOoo00o0[0x7B54 ^ 0x7B6B] = 0x7B7A ^ 0x7B6B;
            WatchdogMode.0OOOoo00o0[0xD5F2 ^ 0xD5DD] = 0xD5DC ^ 0xD5DD;
            WatchdogMode.0OOOoo00o0[0xDBBC ^ 0xDBB6] = 0x1E449 ^ 0xDBB6;
            WatchdogMode.0OOOoo00o0[0x964A ^ 0x9672] = 0x9679 ^ 0x9672;
            WatchdogMode.0OOOoo00o0[0xCFD1 ^ 0xCFF4] = 0x72D79C49 ^ 0xCFF4;
            WatchdogMode.0OOOoo00o0[0xA617 ^ 0xA61E] = 0xA629 ^ 0xA61E;
            WatchdogMode.0OOOoo00o0[0x2078 ^ 0x202A] = 0x207F ^ 0x202A;
            WatchdogMode.0OOOoo00o0[0x1943 ^ 0x1961] = 0xBEFBF6DE ^ 0x1961;
            WatchdogMode.0OOOoo00o0[0x37A4 ^ 0x3784] = 0x72D76439 ^ 0x3784;
            WatchdogMode.0OOOoo00o0[0x5FAD ^ 0x5F99] = 0xFFFFA028 ^ 0x5F99;
            WatchdogMode.0OOOoo00o0[0x3DBC ^ 0x3DF8] = 0x3DA5 ^ 0x3DF8;
            WatchdogMode.0OOOoo00o0[0xF333 ^ 0xF362] = 0xFFFF0CA6 ^ 0xF362;
            WatchdogMode.0OOOoo00o0[0x45A5 ^ 0x459F] = 0x4CF0 ^ 0x459F;
            WatchdogMode.0OOOoo00o0[0xD014 ^ 0xD01B] = 0xFFFF2FE4 ^ 0xD01B;
            n3 = 595943254;
        }
    }
}

