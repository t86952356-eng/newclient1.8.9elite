/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.fg;
import hackclient.rise.zg;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.network.play.server.c;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class zl
extends zg {
    public volatile /* synthetic */ boolean awq;
    public static /* synthetic */ String[] oo000o00Oo00;
    public static /* synthetic */ int awm;
    @EventLink
    public /* synthetic */ Listener<PacketReceiveEvent> awu;
    public static /* synthetic */ String Oo0o00000O00;
    public static /* synthetic */ String awk;
    public volatile /* synthetic */ Object awo;
    public static /* synthetic */ String awl;
    public static /* synthetic */ String q0oOOoOo0O00O;
    public static /* synthetic */ String oO00O0OO0ooO;
    public volatile /* synthetic */ boolean awj;
    public static /* synthetic */ Object[] ooo00oo0Ooo0;
    public static /* synthetic */ Object[] O0OoOO0OOOOO;
    private static /* synthetic */ int[] o0000000O000;
    public volatile /* synthetic */ int awt;
    public volatile /* synthetic */ int aws;
    public static /* synthetic */ String q0OOOoo00o0;
    public volatile /* synthetic */ Object awr;
    public static /* synthetic */ String[] oOo00Oo0OOo0;
    public volatile /* synthetic */ Object awp;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ int awn;
    public static /* synthetic */ Object o0o000o0O0o0;
    @EventLink
    public /* synthetic */ Listener<fg> awv;
    private static /* synthetic */ int oO000O00OO00;
    private static /* synthetic */ boolean ooO00oO0OoO0;

    /*
     * Enabled aggressive block sorting
     */
    public zl() {
        int n2 = -164161595;
        if (n2 != n2) {
        }
        int n3 = o0000000O000[0];
        int n4 = -((n3 << o0000000O000[1] | n3 >>> o0000000O000[2]) ^ o0000000O000[3]);
        this.awt = n4 >>> o0000000O000[4] | n4 << o0000000O000[5];
        this.awu = packetReceiveEvent -> {
            int n2 = -182363783;
            if (n2 != n2) {
            }
            if ((n2 = 868722208) != n2) {
                n2 = 1014535880;
            }
            if ((n2 = 1674296947) != n2) {
                n2 = 13;
            }
            if ((n2 = 329640208) != n2) {
                int cfr_ignored_1 = 2 + 7;
            }
            Object[] objectArray = new Object[5];
            int n3 = -1866124889;
            if (!(packetReceiveEvent.dq() instanceof c)) return;
            if (aER == null || zl.aER.bgF == null) {
                return;
            }
            objectArray[1] = (c)packetReceiveEvent.dq();
            Object object = objectArray[2] = ((c)objectArray[1]).DM() != null ? ((c)objectArray[1]).DM().arq() : "";
            if ((String)objectArray[2] == null) return;
            int n4 = -226442714;
            block7: while (true) {
                int n5 = 0;
                block8: do {
                    switch (n5 == 0 ? n4 : n5) {
                        default: {
                            String string = (String)objectArray[2];
                            String string2 = q0OOOoo00o0;
                            if (string2 == null) {
                                int n6 = o0000000O000[132] * o0000000O000[133];
                                int n7 = o0000000O000[138];
                                int n8 = n7 >>> o0000000O000[139] | n7 << o0000000O000[140];
                                int n9 = n8 << o0000000O000[141] | n8 >>> o0000000O000[142];
                                string2 = (String)O0OoOO0OOOOO[((n6 >>> o0000000O000[134] | n6 << o0000000O000[135]) ^ o0000000O000[136]) - o0000000O000[137]] + (String)O0OoOO0OOOOO[n9 << o0000000O000[143] | n9 >>> o0000000O000[144]];
                            }
                            n5 = -1231623719;
                            if (string.contains(string2)) continue block8;
                            n4 = -1686507524;
                            continue block7;
                        }
                        case -1686507524: {
                            String string = (String)objectArray[2];
                            String string3 = Oo0o00000O00;
                            if (string3 == null) {
                                int n10 = o0000000O000[148];
                                string3 = (String)O0OoOO0OOOOO[o0000000O000[145] * o0000000O000[146] ^ o0000000O000[147]] + (String)O0OoOO0OOOOO[(n10 << o0000000O000[149] | n10 >>> o0000000O000[150]) ^ o0000000O000[151] ^ o0000000O000[152]];
                            }
                            if (!string.contains(string3)) return;
                        }
                        case -1231623719: {
                            n4 = 2014984841;
                            continue block7;
                        }
                        case 2014984841: {
                            n4 = 915220291;
                            continue block7;
                        }
                        case 915220291: {
                            this.awp = zl.aER.bgF;
                            int n11 = -(o0000000O000[153] * o0000000O000[154]);
                            int n12 = n11 >>> o0000000O000[155] | n11 << o0000000O000[156];
                            this.awq = n12 >>> o0000000O000[157] | n12 << o0000000O000[158];
                            this.oh();
                        }
                    }
                    return;
                } while (true);
                break;
            }
        };
        this.awv = fg2 -> {
            int n2 = -2085742243;
            if (n2 != n2) {
                int cfr_ignored_0 = 70 + 47;
            }
            if (!this.awq) {
                this.awp = null;
                this.awq = -(-o0000000O000[129] - o0000000O000[130]) ^ o0000000O000[131];
                this.oh();
                return;
            }
            this.awp = aER != null ? zl.aER.bgF : null;
            int n3 = 520814401;
            block4: while (true) {
                switch (n3) {
                    case -1660475481: {
                        this.oh();
                        n3 = 145521154;
                        continue block4;
                    }
                    case 145521154: {
                        return;
                    }
                }
                int n4 = -(-(o0000000O000[125] * o0000000O000[126]));
                this.awq = n4 >>> o0000000O000[127] | n4 << o0000000O000[128];
                n3 = -1660475481;
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = 201672958;
        if (n2 != n2) {
        }
        o0000000O000 = new int[0xCC8C ^ 0xCD1C];
        zl.o0000000O000[0x9806 ^ 0x9828] = 0x9861 ^ 0x9828;
        zl.o0000000O000[0xF51F ^ 0xF560] = 0xF571 ^ 0xF560;
        zl.o0000000O000[0x6519 ^ 0x6564] = 0x6564 ^ 0x6564;
        zl.o0000000O000[0x10E5 ^ 0x1063] = 0x107C ^ 0x1063;
        int n3 = 2007010054;
        block84: while (true) {
            switch (n3) {
                case 985665336: {
                    zl.o0000000O000[0x8458 ^ 0x84ED] = 0x84ED ^ 0x84ED;
                    zl.o0000000O000[0x8398 ^ 0x83B5] = 0x838E ^ 0x83B5;
                    zl.o0000000O000[0x59CD ^ 0x5924] = 0xFFFFA6DB ^ 0x5924;
                    n3 = 1939065665;
                    continue block84;
                }
                case 1939065665: {
                    zl.o0000000O000[0x8AB7 ^ 0x8B39] = 0xFFFFF122 ^ 0x8B39;
                    n3 = -1596785765;
                    continue block84;
                }
                case -1596785765: {
                    zl.o0000000O000[0xF47F ^ 0xF45D] = 0xF446 ^ 0xF45D;
                    n3 = 1198881479;
                    continue block84;
                }
                case 1198881479: {
                    zl.o0000000O000[0x4F37 ^ 0x4E2F] = 0xFFFFB1A6 ^ 0x4E2F;
                    zl.o0000000O000[0x396C ^ 0x385E] = 0x3851 ^ 0x385E;
                    n3 = -1631649414;
                    continue block84;
                }
                case -1631649414: {
                    zl.o0000000O000[0x7A66 ^ 0x7B08] = 0x5F5B ^ 0x7B08;
                    zl.o0000000O000[0x4FA ^ 0x48F] = 0xFFFFFB22 ^ 0x48F;
                    zl.o0000000O000[0xFBDF ^ 0xFB4A] = 0xFB49 ^ 0xFB4A;
                    zl.o0000000O000[0x8D93 ^ 0x8CA3] = 0xFFFF7348 ^ 0x8CA3;
                    zl.o0000000O000[0x2BEB ^ 0x2BCD] = 0x2BC4 ^ 0x2BCD;
                    zl.o0000000O000[0x3842 ^ 0x3836] = 0xFFFFC7E5 ^ 0x3836;
                    zl.o0000000O000[0x1563 ^ 0x15D5] = 0x15D5 ^ 0x15D5;
                    zl.o0000000O000[0xF15A ^ 0xF137] = 0xF134 ^ 0xF137;
                    zl.o0000000O000[0xE45F ^ 0xE574] = 0xE571 ^ 0xE574;
                    zl.o0000000O000[0x9101 ^ 0x9190] = 0x2762E7BE ^ 0x9190;
                    n3 = -1954058377;
                    continue block84;
                }
                case -1954058377: {
                    zl.o0000000O000[0x2E7E ^ 0x2E68] = 0x2E75 ^ 0x2E68;
                    n3 = -1900570369;
                    continue block84;
                }
                case -1900570369: {
                    zl.o0000000O000[0x65A0 ^ 0x6503] = 0x6516 ^ 0x6503;
                    zl.o0000000O000[0x5632 ^ 0x5759] = 0x3F68 ^ 0x5759;
                    zl.o0000000O000[0xC8F1 ^ 0xC9ED] = 0xC9F8 ^ 0xC9ED;
                    n3 = -1481318916;
                    continue block84;
                }
                case -1481318916: {
                    zl.o0000000O000[0x6360 ^ 0x6353] = 0x635A ^ 0x6353;
                    zl.o0000000O000[0x1D6 ^ 0x1CE] = 0xFFFFFE6F ^ 0x1CE;
                    zl.o0000000O000[0x4099 ^ 0x41C0] = 0x3664 ^ 0x41C0;
                    zl.o0000000O000[0x6EB6 ^ 0x6E5B] = 0x1745BE06 ^ 0x6E5B;
                    zl.o0000000O000[0x10680 ^ 0x107A3] = 0x107E2 ^ 0x107A3;
                    zl.o0000000O000[0xC6ED ^ 0xC78B] = 0xF025 ^ 0xC78B;
                    zl.o0000000O000[0x645B ^ 0x64CF] = 0x9FFF9B32 ^ 0x64CF;
                    zl.o0000000O000[0x9DC5 ^ 0x9C81] = 0x7305 ^ 0x9C81;
                    n3 = 20370594;
                    continue block84;
                }
                case 20370594: {
                    zl.o0000000O000[0xF5BA ^ 0xF5D2] = 0xFFFF0A2D ^ 0xF5D2;
                    zl.o0000000O000[0xA9E1 ^ 0xA9E3] = 0xA9F8 ^ 0xA9E3;
                    zl.o0000000O000[0xDE06 ^ 0xDF26] = 0xDF25 ^ 0xDF26;
                    zl.o0000000O000[0x5129 ^ 0x513C] = 0x513F ^ 0x513C;
                    zl.o0000000O000[0x82BE ^ 0x833D] = 0xFC19 ^ 0x833D;
                    zl.o0000000O000[0xD0FD ^ 0xD0DE] = 0xD0DB ^ 0xD0DE;
                    zl.o0000000O000[0x8794 ^ 0x86BC] = 0x86A7 ^ 0x86BC;
                    n3 = -1240577978;
                    continue block84;
                }
                case -1240577978: {
                    zl.o0000000O000[0xCFA5 ^ 0xCE80] = 0xFFFF355B ^ 0xCE80;
                    zl.o0000000O000[0x49BB ^ 0x49DE] = 0xFFFFB665 ^ 0x49DE;
                    zl.o0000000O000[0x6F27 ^ 0x6E0D] = 0xFFFF91AA ^ 0x6E0D;
                    zl.o0000000O000[0xB02C ^ 0xB0B1] = 0xB0BE ^ 0xB0B1;
                    zl.o0000000O000[0x240C ^ 0x24C9] = 0x24C9 ^ 0x24C9;
                    zl.o0000000O000[0x4272 ^ 0x434E] = 0x4359 ^ 0x434E;
                    zl.o0000000O000[0x547B ^ 0x550E] = 0x1837 ^ 0x550E;
                    zl.o0000000O000[0x10B79 ^ 0x10BD4] = 0xFFFEF417 ^ 0x10BD4;
                    zl.o0000000O000[0x661E ^ 0x66D7] = 0x66C8 ^ 0x66D7;
                    zl.o0000000O000[0xA869 ^ 0xA84E] = 0xA859 ^ 0xA84E;
                    zl.o0000000O000[0xA2F9 ^ 0xA253] = 0xA242 ^ 0xA253;
                    zl.o0000000O000[0xB05C ^ 0xB1DD] = 0xCE8F ^ 0xB1DD;
                    zl.o0000000O000[0xCA5 ^ 0xCBE] = 0xCB9 ^ 0xCBE;
                    zl.o0000000O000[0x51FB ^ 0x51D0] = 0xFFFFAE2F ^ 0x51D0;
                    zl.o0000000O000[0xBB87 ^ 0xBA0A] = 0x3FE4 ^ 0xBA0A;
                    zl.o0000000O000[0x256 ^ 0x307] = 0xC6E5 ^ 0x307;
                    zl.o0000000O000[0x2BAA ^ 0x2AFC] = 0x9468 ^ 0x2AFC;
                    n3 = -267459701;
                    continue block84;
                }
                case -267459701: {
                    zl.o0000000O000[0xCD69 ^ 0xCDBA] = 0xB6DB96C2 ^ 0xCDBA;
                    zl.o0000000O000[0x10520 ^ 0x10561] = 0x10578 ^ 0x10561;
                    zl.o0000000O000[0x2BCD ^ 0x2AEA] = 0x2AEF ^ 0x2AEA;
                    zl.o0000000O000[0x89A2 ^ 0x89CB] = 0x800089CB ^ 0x89CB;
                    zl.o0000000O000[0xBBF8 ^ 0xBAAB] = 0x7F0E ^ 0xBAAB;
                    zl.o0000000O000[0xFF4C ^ 0xFE04] = 0x458F ^ 0xFE04;
                    zl.o0000000O000[0x9A99 ^ 0x9ABC] = 0x9A8F ^ 0x9ABC;
                    zl.o0000000O000[0xCAE0 ^ 0xCB89] = 0xA3C3 ^ 0xCB89;
                    zl.o0000000O000[0xB773 ^ 0xB78B] = 0xFFFF5FA5 ^ 0xB78B;
                    zl.o0000000O000[0xEB73 ^ 0xEA63] = 0xFFFF15E2 ^ 0xEA63;
                    n3 = 1063036067;
                    continue block84;
                }
                case 1063036067: {
                    zl.o0000000O000[0xCE62 ^ 0xCF3A] = 0x71AE ^ 0xCF3A;
                    zl.o0000000O000[0xBCF1 ^ 0xBDF1] = 0xFFFF4204 ^ 0xBDF1;
                    zl.o0000000O000[0xE4EF ^ 0xE58E] = 0x2B7C ^ 0xE58E;
                    zl.o0000000O000[0x15EA ^ 0x15C2] = 0x15FB ^ 0x15C2;
                    zl.o0000000O000[0xDF7C ^ 0xDEF6] = 0xFFFFAD93 ^ 0xDEF6;
                    zl.o0000000O000[0x802E ^ 0x815C] = 0x5260 ^ 0x815C;
                    zl.o0000000O000[0x3429 ^ 0x353E] = 0x352B ^ 0x353E;
                    n3 = 2026106548;
                    continue block84;
                }
                case 2026106548: {
                    zl.o0000000O000[0x1076C ^ 0x107EF] = 0x107BE ^ 0x107EF;
                    zl.o0000000O000[0x5588 ^ 0x55D2] = 0x55D5 ^ 0x55D2;
                    zl.o0000000O000[0xC008 ^ 0xC145] = 0x67B1 ^ 0xC145;
                    zl.o0000000O000[0x81C4 ^ 0x8141] = 0xC4ECCF84 ^ 0x8141;
                    zl.o0000000O000[0xE44D ^ 0xE408] = 0xE403 ^ 0xE408;
                    n3 = -1220004524;
                    continue block84;
                }
                case -1220004524: {
                    zl.o0000000O000[0xE2FB ^ 0xE250] = 0xFFFF1DAF ^ 0xE250;
                    zl.o0000000O000[0xFCDC ^ 0xFD5B] = 0xAF3D ^ 0xFD5B;
                    zl.o0000000O000[0x846A ^ 0x856C] = 0x8575 ^ 0x856C;
                    zl.o0000000O000[0xC10E ^ 0xC013] = 0xFFFF3FEC ^ 0xC013;
                    zl.o0000000O000[0xA7CC ^ 0xA644] = 0x2AB1 ^ 0xA644;
                    zl.o0000000O000[0xC0C8 ^ 0xC0AE] = 0xFFFF3F15 ^ 0xC0AE;
                    n3 = 485252674;
                    continue block84;
                }
                case 485252674: {
                    zl.o0000000O000[0x6BF8 ^ 0x6B81] = 0x6B80 ^ 0x6B81;
                    n3 = -925931038;
                    continue block84;
                }
                case -925931038: {
                    zl.o0000000O000[0x4DE ^ 0x40B] = 0xFFFFFBEA ^ 0x40B;
                    zl.o0000000O000[0x84D ^ 0x829] = 0x80A ^ 0x829;
                    zl.o0000000O000[0xD596 ^ 0xD5EA] = 0xFFFF2A63 ^ 0xD5EA;
                    n3 = 1554441033;
                    continue block84;
                }
                case 1554441033: {
                    zl.o0000000O000[0xBBCF ^ 0xBAB7] = 0xF783 ^ 0xBAB7;
                    zl.o0000000O000[0x2BFD ^ 0x2B6D] = 0x2B64 ^ 0x2B6D;
                    zl.o0000000O000[0xC64B ^ 0xC77F] = 0xFFFF38F6 ^ 0xC77F;
                    zl.o0000000O000[0xCA3B ^ 0xCA05] = 0xFFFF3EAA ^ 0xCA05;
                    zl.o0000000O000[0x78B3 ^ 0x79D6] = 0x4E77 ^ 0x79D6;
                    zl.o0000000O000[0xC594 ^ 0xC5EF] = 0xC596 ^ 0xC5EF;
                    zl.o0000000O000[0x800F ^ 0x818B] = 0xFEDC ^ 0x818B;
                    n3 = -1850458893;
                    continue block84;
                }
                case -1850458893: {
                    zl.o0000000O000[0xC23E ^ 0xC2BE] = 0xC2B1 ^ 0xC2BE;
                    zl.o0000000O000[0xC1D8 ^ 0xC0A9] = 0x1392 ^ 0xC0A9;
                    zl.o0000000O000[0xE027 ^ 0xE126] = 0xE116 ^ 0xE126;
                    zl.o0000000O000[0xB19A ^ 0xB089] = 0x56BF4F4D ^ 0xB089;
                    zl.o0000000O000[0x851B ^ 0x8575] = 0x8562 ^ 0x8575;
                    n3 = 648960905;
                    continue block84;
                }
                case 648960905: {
                    zl.o0000000O000[0xEA19 ^ 0xEA3D] = 0xD245EF38 ^ 0xEA3D;
                    n3 = 819163880;
                    continue block84;
                }
                case 819163880: {
                    zl.o0000000O000[0xD0D9 ^ 0xD1EC] = 0xFFFF2E0B ^ 0xD1EC;
                    zl.o0000000O000[0x230B ^ 0x2272] = 0x1270 ^ 0x2272;
                    zl.o0000000O000[0xAE74 ^ 0xAF7C] = 0xAF05 ^ 0xAF7C;
                    zl.o0000000O000[0xB52E ^ 0xB46D] = 0x5BF9 ^ 0xB46D;
                    zl.o0000000O000[0x158D ^ 0x1556] = 0x154F ^ 0x1556;
                    zl.o0000000O000[0x529B ^ 0x52A1] = 0xFFFFAD32 ^ 0x52A1;
                    zl.o0000000O000[0x224D ^ 0x2359] = 0xFFFFDCF2 ^ 0x2359;
                    zl.o0000000O000[0x947 ^ 0x9DD] = 0x9D8 ^ 0x9DD;
                    zl.o0000000O000[0xE0CD ^ 0xE072] = 0xFFFF1F8D ^ 0xE072;
                    zl.o0000000O000[0x9602 ^ 0x9749] = 0x9864 ^ 0x9749;
                    n3 = -1500459534;
                    continue block84;
                }
                case -1500459534: {
                    zl.o0000000O000[0x8BCA ^ 0x8AB6] = 0xBAB6 ^ 0x8AB6;
                    zl.o0000000O000[0x1C32 ^ 0x1D2B] = 0x11D63 ^ 0x1D2B;
                    zl.o0000000O000[0x9274 ^ 0x92A8] = 0xFFFF6D55 ^ 0x92A8;
                    n3 = -574812404;
                    continue block84;
                }
                case -574812404: {
                    zl.o0000000O000[0x5908 ^ 0x591C] = 0x590D ^ 0x591C;
                    zl.o0000000O000[0x3579 ^ 0x3411] = 0x3BF ^ 0x3411;
                    zl.o0000000O000[0x3B0B ^ 0x3B03] = 0xBEFBD4BC ^ 0x3B03;
                    zl.o0000000O000[0x2098 ^ 0x205A] = 0x2D9D ^ 0x205A;
                    zl.o0000000O000[0x6A9F ^ 0x6A3E] = 0x1E8A2D ^ 0x6A3E;
                    zl.o0000000O000[0x16A8 ^ 0x16B6] = 0x16B6 ^ 0x16B6;
                    zl.o0000000O000[0xB543 ^ 0xB563] = 0xB57A ^ 0xB563;
                    zl.o0000000O000[0xFE04 ^ 0xFEF6] = 0xFFFF0127 ^ 0xFEF6;
                    zl.o0000000O000[0x8B78 ^ 0x8B1A] = 0x18AC3215 ^ 0x8B1A;
                    n3 = -175751928;
                    continue block84;
                }
                case -175751928: {
                    zl.o0000000O000[0x53E5 ^ 0x5286] = 0xFFFF63E6 ^ 0x5286;
                    zl.o0000000O000[0xD863 ^ 0xD8F0] = 0xD8A7 ^ 0xD8F0;
                    zl.o0000000O000[0xC740 ^ 0xC7C8] = 0xFFFF3837 ^ 0xC7C8;
                    zl.o0000000O000[0xD17 ^ 0xDA9] = 0x9AC9 ^ 0xDA9;
                    zl.o0000000O000[0xA42 ^ 0xA5B] = 0x72D759E6 ^ 0xA5B;
                    zl.o0000000O000[0xE7F2 ^ 0xE6DC] = 0x5555B389 ^ 0xE6DC;
                    zl.o0000000O000[0xBF4B ^ 0xBE71] = 0xBE34 ^ 0xBE71;
                    zl.o0000000O000[0x59F4 ^ 0x58F0] = 0x33FFA705 ^ 0x58F0;
                    zl.o0000000O000[0x2782 ^ 0x2791] = 0x279E ^ 0x2791;
                    zl.o0000000O000[0x422C ^ 0x4225] = 0xFFFFBDFA ^ 0x4225;
                    zl.o0000000O000[0x23FE ^ 0x2283] = 0xA175 ^ 0x2283;
                    zl.o0000000O000[0x3A7C ^ 0x3AEE] = 0x3AE3 ^ 0x3AEE;
                    zl.o0000000O000[0x8FF4 ^ 0x8FDD] = 0x8FF5 ^ 0x8FDD;
                    zl.o0000000O000[0x2B0D ^ 0x2BAA] = 0x2BB6 ^ 0x2BAA;
                    n3 = 228714488;
                    continue block84;
                }
                case 228714488: {
                    zl.o0000000O000[0x1405 ^ 0x153E] = 0xFFFFEA83 ^ 0x153E;
                    n3 = 797986256;
                    continue block84;
                }
                case 797986256: {
                    zl.o0000000O000[0xDB81 ^ 0xDB67] = 0x325C8888 ^ 0xDB67;
                    zl.o0000000O000[0xDE1 ^ 0xD47] = 0xD62 ^ 0xD47;
                    zl.o0000000O000[0x898A ^ 0x890E] = 0x88B4 ^ 0x890E;
                    n3 = -350022756;
                    continue block84;
                }
                case -350022756: {
                    zl.o0000000O000[0x701 ^ 0x643] = 0x643 ^ 0x643;
                    zl.o0000000O000[0x4317 ^ 0x434B] = 0x2CBCA7E2 ^ 0x434B;
                    zl.o0000000O000[0x9304 ^ 0x9316] = 0xFFFF6C83 ^ 0x9316;
                    zl.o0000000O000[0x477C ^ 0x4744] = 0x4773 ^ 0x4744;
                    n3 = 2066518655;
                    continue block84;
                }
                case 2066518655: {
                    zl.o0000000O000[0xFF72 ^ 0xFF3B] = 0xFF3AFF77 ^ 0xFF3B;
                    zl.o0000000O000[0x10ABE ^ 0x10BF0] = 0x1AD08 ^ 0x10BF0;
                    zl.o0000000O000[0x631A ^ 0x623B] = 0xFFFF9DC4 ^ 0x623B;
                    zl.o0000000O000[0x119B ^ 0x10E4] = 0x9350 ^ 0x10E4;
                    zl.o0000000O000[0x1045D ^ 0x104C3] = 0x104D2 ^ 0x104C3;
                    zl.o0000000O000[0x5F56 ^ 0x5E3A] = 0x3676 ^ 0x5E3A;
                    n3 = 991764377;
                    continue block84;
                }
                case 991764377: {
                    zl.o0000000O000[0x31B5 ^ 0x3082] = 0xFFFFCF5F ^ 0x3082;
                    zl.o0000000O000[0xDEC0 ^ 0xDE14] = 0xDE1F ^ 0xDE14;
                    zl.o0000000O000[0xB413 ^ 0xB450] = 0xFFFF4BC7 ^ 0xB450;
                    zl.o0000000O000[0x62A6 ^ 0x62F2] = 0xF00062F2 ^ 0x62F2;
                    zl.o0000000O000[0xF84 ^ 0xF64] = 0xC28F534D ^ 0xF64;
                    zl.o0000000O000[0x5DF8 ^ 0x5D61] = 0x33336E52 ^ 0x5D61;
                    zl.o0000000O000[0x39BB ^ 0x396C] = 0x397D ^ 0x396C;
                    n3 = -756220072;
                    continue block84;
                }
                case -756220072: {
                    zl.o0000000O000[0x20B9 ^ 0x20C1] = 0x20DE ^ 0x20C1;
                    n3 = 871969156;
                    continue block84;
                }
                case 871969156: {
                    zl.o0000000O000[0x4559 ^ 0x456E] = 0x451F ^ 0x456E;
                    n3 = -1848478727;
                    continue block84;
                }
                case -1848478727: {
                    zl.o0000000O000[0xCD41 ^ 0xCDEE] = 0xFFFF3257 ^ 0xCDEE;
                    zl.o0000000O000[0xD6E6 ^ 0xD629] = 0xD622 ^ 0xD629;
                    n3 = 1721208626;
                    continue block84;
                }
                case 1721208626: {
                    zl.o0000000O000[0xD981 ^ 0xD99E] = 0x61F27D25 ^ 0xD99E;
                    zl.o0000000O000[0x5206 ^ 0x521B] = 0x526A ^ 0x521B;
                    zl.o0000000O000[0x318F ^ 0x30A2] = 0x30C5 ^ 0x30A2;
                    n3 = -1476224806;
                    continue block84;
                }
                case -1476224806: {
                    zl.o0000000O000[0x8607 ^ 0x86AB] = 0xFFFF79C9 ^ 0x86AB;
                    n3 = 261598202;
                    continue block84;
                }
                case 261598202: {
                    zl.o0000000O000[0x1345 ^ 0x1375] = 0x132C ^ 0x1375;
                    zl.o0000000O000[0xA804 ^ 0xA840] = 0xE4FFD807 ^ 0xA840;
                    zl.o0000000O000[0x1714 ^ 0x1746] = 0x174B ^ 0x1746;
                    zl.o0000000O000[0xA2C6 ^ 0xA2EC] = 0xFFFF5D3B ^ 0xA2EC;
                    zl.o0000000O000[0xA906 ^ 0xA9F1] = 0x2B1D0D90 ^ 0xA9F1;
                    zl.o0000000O000[0x2D53 ^ 0x2DAC] = 0x14D00CE1 ^ 0x2DAC;
                    zl.o0000000O000[0x356 ^ 0x25C] = 0xFFFFF1BB ^ 0x25C;
                    zl.o0000000O000[0x9FAC ^ 0x9F7A] = 0x9F75 ^ 0x9F7A;
                    zl.o0000000O000[0x4032 ^ 0x40D8] = 0xFFFF80D8 ^ 0x40D8;
                    zl.o0000000O000[0x559B ^ 0x5562] = 0xFFFFAAF7 ^ 0x5562;
                    zl.o0000000O000[0xE748 ^ 0xE6CD] = 0xE6CD ^ 0xE6CD;
                    n3 = -1959271729;
                    continue block84;
                }
                case -1959271729: {
                    zl.o0000000O000[0x9F14 ^ 0x9E63] = 0xFFFF2C92 ^ 0x9E63;
                    zl.o0000000O000[0xD536 ^ 0xD44C] = 0xE44C ^ 0xD44C;
                    zl.o0000000O000[0x2055 ^ 0x2138] = 0x568 ^ 0x2138;
                    n3 = 2083285750;
                    continue block84;
                }
                case 2083285750: {
                    zl.o0000000O000[0x7C39 ^ 0x7D6B] = 0xB887 ^ 0x7D6B;
                    zl.o0000000O000[0x60DC ^ 0x60B7] = 0x60E7 ^ 0x60B7;
                    zl.o0000000O000[0x492C ^ 0x49F5] = 0x123072A ^ 0x49F5;
                    zl.o0000000O000[0xF3FE ^ 0xF394] = 0x96F99C03 ^ 0xF394;
                    zl.o0000000O000[0x4591 ^ 0x4522] = 0x1CD813AB ^ 0x4522;
                    zl.o0000000O000[0x49FA ^ 0x49D6] = 0x7FFFB72E ^ 0x49D6;
                    zl.o0000000O000[0x7ED5 ^ 0x7E8E] = 0xFFFF8143 ^ 0x7E8E;
                    zl.o0000000O000[0xB43A ^ 0xB48B] = 0xA712686B ^ 0xB48B;
                    n3 = 1089013094;
                    continue block84;
                }
                case 1089013094: {
                    zl.o0000000O000[0x526D ^ 0x530A] = 0xFFFF9B72 ^ 0x530A;
                    zl.o0000000O000[0xDB62 ^ 0xDB01] = 0xFFFF24AC ^ 0xDB01;
                    zl.o0000000O000[0x4F8D ^ 0x4F37] = 0x4F36 ^ 0x4F37;
                    zl.o0000000O000[0xD3F7 ^ 0xD3FD] = 0xFFFF2C20 ^ 0xD3FD;
                    zl.o0000000O000[0xCA86 ^ 0xCB8B] = 0xFFFF3478 ^ 0xCB8B;
                    n3 = 718663400;
                    continue block84;
                }
                case 718663400: {
                    zl.o0000000O000[0xE6D7 ^ 0xE7BD] = 0x8FF1 ^ 0xE7BD;
                    zl.o0000000O000[0xCE38 ^ 0xCFB8] = 0x4C44 ^ 0xCFB8;
                    zl.o0000000O000[0x8A25 ^ 0x8B2C] = 0xFFFF74E1 ^ 0x8B2C;
                    zl.o0000000O000[0x5883 ^ 0x58C1] = 0xFFFFA718 ^ 0x58C1;
                    zl.o0000000O000[0xC7E1 ^ 0xC792] = 0x7C1376E ^ 0xC792;
                    zl.o0000000O000[0x1083B ^ 0x10834] = 0x1082F ^ 0x10834;
                    zl.o0000000O000[0xD7D4 ^ 0xD77C] = 0xD767 ^ 0xD77C;
                    zl.o0000000O000[0x10922 ^ 0x109C3] = 0xFFFEF628 ^ 0x109C3;
                    zl.o0000000O000[0x5AB4 ^ 0x5AEC] = 0x4723A819 ^ 0x5AEC;
                    n3 = 1558325842;
                    continue block84;
                }
                case 1558325842: {
                    zl.o0000000O000[0xE0EB ^ 0xE0EA] = 0xE0EF ^ 0xE0EA;
                    n3 = 716290486;
                    continue block84;
                }
                case 716290486: {
                    zl.o0000000O000[0xD24C ^ 0xD271] = 0xFFFF2DD4 ^ 0xD271;
                    zl.o0000000O000[0xDCD6 ^ 0xDCD5] = 0xFFFF233C ^ 0xDCD5;
                    zl.o0000000O000[0x39A9 ^ 0x3885] = 0x3916 ^ 0x3885;
                    n3 = -669755458;
                    continue block84;
                }
                case -669755458: {
                    zl.o0000000O000[0x303E ^ 0x3024] = 0xE2003024 ^ 0x3024;
                    zl.o0000000O000[0x44D9 ^ 0x4401] = 0xFFFFBBF8 ^ 0x4401;
                    zl.o0000000O000[0xB34B ^ 0xB202] = 0xBD46 ^ 0xB202;
                    zl.o0000000O000[0x23F5 ^ 0x227C] = 0xAE9D ^ 0x227C;
                    n3 = -418899526;
                    continue block84;
                }
                case -418899526: {
                    zl.o0000000O000[0x6093 ^ 0x6076] = 0xFFFF9F81 ^ 0x6076;
                    zl.o0000000O000[0xCEA0 ^ 0xCED2] = 0xCECD ^ 0xCED2;
                    zl.o0000000O000[0x94D0 ^ 0x9434] = 0x9431 ^ 0x9434;
                    zl.o0000000O000[0x6518 ^ 0x650F] = 0x650F ^ 0x650F;
                    n3 = -1168054473;
                    continue block84;
                }
                case -1168054473: {
                    zl.o0000000O000[0xDF26 ^ 0xDF14] = 0xDF03 ^ 0xDF14;
                    zl.o0000000O000[0xFA1C ^ 0xFAC2] = 0xFA89 ^ 0xFAC2;
                    zl.o0000000O000[0x5732 ^ 0x560C] = 0xF7FFA9F3 ^ 0x560C;
                    n3 = -601247150;
                    continue block84;
                }
                case -601247150: {
                    zl.o0000000O000[0xCA70 ^ 0xCA23] = 0xCA30 ^ 0xCA23;
                    zl.o0000000O000[0x1FFF ^ 0x1EA5] = 0x6900 ^ 0x1EA5;
                    zl.o0000000O000[0x9E82 ^ 0x9F87] = 0xFFFF6072 ^ 0x9F87;
                    zl.o0000000O000[0x1D08 ^ 0x1DF8] = 0xFFFFE20D ^ 0x1DF8;
                    zl.o0000000O000[0x204D ^ 0x20B7] = 0x87E697F8 ^ 0x20B7;
                    zl.o0000000O000[0x1029F ^ 0x102D0] = 0x4102D0 ^ 0x102D0;
                    zl.o0000000O000[0x5C18 ^ 0x5D46] = 0x8214 ^ 0x5D46;
                    zl.o0000000O000[0xFBB9 ^ 0xFB0B] = 0xFB54 ^ 0xFB0B;
                    zl.o0000000O000[0xDCF8 ^ 0xDC3E] = 0xDC97 ^ 0xDC3E;
                    n3 = -576012887;
                    continue block84;
                }
                case -576012887: {
                    zl.o0000000O000[0x1201 ^ 0x12E2] = 0x12F9 ^ 0x12E2;
                    zl.o0000000O000[0x93E7 ^ 0x92F2] = 0x24E63383 ^ 0x92F2;
                    zl.o0000000O000[0x102AD ^ 0x10245] = 0x1024E ^ 0x10245;
                    zl.o0000000O000[0x9876 ^ 0x9921] = 0xFFFFD808 ^ 0x9921;
                    zl.o0000000O000[0xCAF0 ^ 0xCBC8] = 0xC0EDB90C ^ 0xCBC8;
                    zl.o0000000O000[0x3894 ^ 0x38C1] = 0x389E ^ 0x38C1;
                    zl.o0000000O000[0xB93B ^ 0xB9E4] = 0xFFFF4709 ^ 0xB9E4;
                    n3 = 843440415;
                    continue block84;
                }
                case 843440415: {
                    zl.o0000000O000[0xE32D ^ 0xE3F7] = 0xE3F0 ^ 0xE3F7;
                    zl.o0000000O000[0x66BC ^ 0x668A] = 0x66F0 ^ 0x668A;
                    n3 = -1118721839;
                    continue block84;
                }
                case -1118721839: {
                    zl.o0000000O000[0x108F2 ^ 0x10836] = 0x16FD5 ^ 0x10836;
                    zl.o0000000O000[0x6BB8 ^ 0x6B5F] = 0x6B62 ^ 0x6B5F;
                    zl.o0000000O000[0x558D ^ 0x548A] = 0x548D ^ 0x548A;
                    zl.o0000000O000[0x51AD ^ 0x5127] = 0xA5127 ^ 0x5127;
                    zl.o0000000O000[0xF8EE ^ 0xF8E8] = 0xF8E8 ^ 0xF8E8;
                    zl.o0000000O000[0xE6C5 ^ 0xE789] = 0xE8C4 ^ 0xE789;
                    zl.o0000000O000[0x76F7 ^ 0x7636] = 0x7631 ^ 0x7636;
                    zl.o0000000O000[0xB069 ^ 0xB097] = 0xFFFF4F1A ^ 0xB097;
                    zl.o0000000O000[0x104AB ^ 0x105A4] = 0x204184A4 ^ 0x105A4;
                    zl.o0000000O000[0xE4A4 ^ 0xE44A] = 0xE453 ^ 0xE44A;
                    n3 = -175875426;
                    continue block84;
                }
                case -175875426: {
                    zl.o0000000O000[0x255 ^ 0x244] = 0x95DD1 ^ 0x244;
                    zl.o0000000O000[0x5D7A ^ 0x5DB9] = 0x8EBF ^ 0x5DB9;
                    n3 = 210429411;
                    continue block84;
                }
                case 210429411: {
                    zl.o0000000O000[0xF26A ^ 0xF226] = 0xF237 ^ 0xF226;
                    zl.o0000000O000[0xF35 ^ 0xE24] = 0xE27 ^ 0xE24;
                    zl.o0000000O000[0xE8DE ^ 0xE8D0] = 0xE8D3 ^ 0xE8D0;
                    zl.o0000000O000[0xD30D ^ 0xD282] = 0x576C ^ 0xD282;
                    n3 = 531767564;
                    continue block84;
                }
                case 531767564: {
                    zl.o0000000O000[0xD83D ^ 0xD83D] = 0x4800D842 ^ 0xD83D;
                    n3 = 1383886658;
                    continue block84;
                }
                case 1383886658: {
                    zl.o0000000O000[0xF0CF ^ 0xF1AD] = 0x3F57 ^ 0xF1AD;
                    zl.o0000000O000[0x4D28 ^ 0x4DA6] = 0x4DB1 ^ 0x4DA6;
                    zl.o0000000O000[0xEC5A ^ 0xED78] = 0xED58 ^ 0xED78;
                    zl.o0000000O000[0x490B ^ 0x49B7] = 0xFFFFB648 ^ 0x49B7;
                    zl.o0000000O000[0x6D58 ^ 0x6DFA] = 0xD794581F ^ 0x6DFA;
                    zl.o0000000O000[0xA7D5 ^ 0xA783] = 0xA78A ^ 0xA783;
                    zl.o0000000O000[0x504E ^ 0x5009] = 0x504E ^ 0x5009;
                    zl.o0000000O000[0xDA64 ^ 0xDA91] = 0xDA8E ^ 0xDA91;
                    zl.o0000000O000[0x5FB2 ^ 0x5F93] = 0x5F94 ^ 0x5F93;
                    zl.o0000000O000[0xAA58 ^ 0xAAEC] = 0xAAEC ^ 0xAAEC;
                    zl.o0000000O000[0x4DE0 ^ 0x4DED] = 0x4DF0 ^ 0x4DED;
                    n3 = -641419104;
                    continue block84;
                }
                case -641419104: {
                    zl.o0000000O000[0x736B ^ 0x7384] = 0x7383 ^ 0x7384;
                    zl.o0000000O000[0xACE5 ^ 0xACAD] = 0xFFFF536A ^ 0xACAD;
                    zl.o0000000O000[0x926B ^ 0x931D] = 0xDE29 ^ 0x931D;
                    zl.o0000000O000[0x9DB4 ^ 0x9D1A] = 0x9D6F ^ 0x9D1A;
                    zl.o0000000O000[0x350 ^ 0x274] = 0xFFFFFD8B ^ 0x274;
                    zl.o0000000O000[0xF8EC ^ 0xF80E] = 0xFAEE ^ 0xF80E;
                    zl.o0000000O000[0x88DB ^ 0x899E] = 0x321E ^ 0x899E;
                    n3 = -230410565;
                    continue block84;
                }
                case -230410565: {
                    zl.o0000000O000[0xBE2D ^ 0xBF32] = 0xBF2F ^ 0xBF32;
                    n3 = -2005101273;
                    continue block84;
                }
                case -2005101273: {
                    zl.o0000000O000[0x9F61 ^ 0x9F3C] = 0x71FF60F5 ^ 0x9F3C;
                    n3 = 455099948;
                    continue block84;
                }
                case 455099948: {
                    zl.o0000000O000[0x33B8 ^ 0x333A] = 0xFFFFCC9F ^ 0x333A;
                    zl.o0000000O000[0xA4F9 ^ 0xA424] = 0xA46D ^ 0xA424;
                    zl.o0000000O000[0xC14F ^ 0xC1D4] = 0xC1C5 ^ 0xC1D4;
                    zl.o0000000O000[0xBDB4 ^ 0xBCE8] = 0xCB4D ^ 0xBCE8;
                    zl.o0000000O000[0xCC00 ^ 0xCD03] = 0xCD52 ^ 0xCD03;
                    zl.o0000000O000[0x51D5 ^ 0x50B5] = 0x8FE7 ^ 0x50B5;
                    zl.o0000000O000[0x10871 ^ 0x10948] = 0x1091D ^ 0x10948;
                    n3 = 2052193638;
                    continue block84;
                }
                case 2052193638: {
                    zl.o0000000O000[0x587 ^ 0x491] = 0x49A ^ 0x491;
                    zl.o0000000O000[0x103DF ^ 0x102B0] = 0xFFFED96E ^ 0x102B0;
                    zl.o0000000O000[0x10899 ^ 0x10995] = 0x8AF9A61E ^ 0x10995;
                    zl.o0000000O000[0xFD87 ^ 0xFDDE] = 0xFFFF0215 ^ 0xFDDE;
                    zl.o0000000O000[0xC98B ^ 0xC99B] = 0xC99E ^ 0xC99B;
                    n3 = -110131267;
                    continue block84;
                }
                case -110131267: {
                    zl.o0000000O000[0x859B ^ 0x8520] = 0xFFFF7ADF ^ 0x8520;
                    zl.o0000000O000[0x26A8 ^ 0x26D8] = 0x26C1 ^ 0x26D8;
                    zl.o0000000O000[0x1369 ^ 0x13D1] = 0x6755 ^ 0x13D1;
                    zl.o0000000O000[0xC9C1 ^ 0xC9F8] = 0xFFFF3649 ^ 0xC9F8;
                    zl.o0000000O000[0x8FB2 ^ 0x8FB6] = 0x8FBB ^ 0x8FB6;
                    n3 = 161871402;
                    continue block84;
                }
                case 161871402: {
                    zl.o0000000O000[0x103AB ^ 0x102D8] = 0xFFFE2E31 ^ 0x102D8;
                    zl.o0000000O000[0x98C5 ^ 0x98C0] = 0x98D3 ^ 0x98C0;
                    zl.o0000000O000[0xC9E4 ^ 0xC919] = 0xFFFF3686 ^ 0xC919;
                    zl.o0000000O000[0xC416 ^ 0xC543] = 0x7BD3 ^ 0xC543;
                    zl.o0000000O000[0x9EB1 ^ 0x9FAF] = 0xFFFF6150 ^ 0x9FAF;
                    n3 = -2020348178;
                    continue block84;
                }
                case -2020348178: {
                    zl.o0000000O000[0x3CCC ^ 0x3DC2] = 0xFFFFC253 ^ 0x3DC2;
                    zl.o0000000O000[0x81EB ^ 0x81A0] = 0x81AF ^ 0x81A0;
                    zl.o0000000O000[0x2649 ^ 0x26DF] = 0x26C2 ^ 0x26DF;
                    zl.o0000000O000[0x451F ^ 0x4551] = 0xFFFFBADC ^ 0x4551;
                    n3 = -1137070983;
                    continue block84;
                }
                case -1137070983: {
                    zl.o0000000O000[0x50E1 ^ 0x5010] = 0x2F7C503E ^ 0x5010;
                    n3 = -1498312127;
                    continue block84;
                }
                case -1498312127: {
                    zl.o0000000O000[0xA5E9 ^ 0xA5A3] = 0xA5EE ^ 0xA5A3;
                    n3 = -1159360218;
                    continue block84;
                }
                case -1159360218: {
                    zl.o0000000O000[0x72B3 ^ 0x7287] = 0xBEFB9D38 ^ 0x7287;
                    zl.o0000000O000[0x5A5B ^ 0x5B0F] = 0x9EE3 ^ 0x5B0F;
                    zl.o0000000O000[0x9953 ^ 0x9815] = 0x239E ^ 0x9815;
                    zl.o0000000O000[0xFCCA ^ 0xFC07] = 0xFC06 ^ 0xFC07;
                    zl.o0000000O000[0x5082 ^ 0x5199] = 0x5192 ^ 0x5199;
                    zl.o0000000O000[0xC672 ^ 0xC6F3] = 0xC65F ^ 0xC6F3;
                    zl.o0000000O000[0x297F ^ 0x2901] = 0x5F750E0C ^ 0x2901;
                    zl.o0000000O000[0x4CAD ^ 0x4C3A] = 0x4C23 ^ 0x4C3A;
                    zl.o0000000O000[0x7F99 ^ 0x7FAC] = 0x7FDF ^ 0x7FAC;
                    zl.o0000000O000[0xE165 ^ 0xE13A] = 0xE123 ^ 0xE13A;
                    zl.o0000000O000[0x10AE8 ^ 0x10A48] = 0x10A49 ^ 0x10A48;
                    zl.o0000000O000[0x670C ^ 0x6607] = 0x667C ^ 0x6607;
                    zl.o0000000O000[0xFFCB ^ 0xFF9B] = 0xFF8C ^ 0xFF9B;
                    n3 = 929738916;
                    continue block84;
                }
                case 929738916: {
                    zl.o0000000O000[0xD8FA ^ 0xD9CB] = 0xD9DA ^ 0xD9CB;
                    n3 = 547400041;
                    continue block84;
                }
                case 547400041: {
                    zl.o0000000O000[0x27A3 ^ 0x2706] = 0xFFFFD8FD ^ 0x2706;
                    zl.o0000000O000[0x465F ^ 0x460E] = 0x4607 ^ 0x460E;
                    zl.o0000000O000[0x5333 ^ 0x53CF] = 0x2FC228CE ^ 0x53CF;
                    n3 = 486319820;
                    continue block84;
                }
                case 486319820: {
                    zl.o0000000O000[0x5313 ^ 0x53E7] = 0x53EA ^ 0x53E7;
                    zl.o0000000O000[0x3855 ^ 0x3905] = 0x9FFD ^ 0x3905;
                    n3 = 608355686;
                    continue block84;
                }
                case 608355686: {
                    zl.o0000000O000[0x5838 ^ 0x58B4] = 0x58BB ^ 0x58B4;
                    zl.o0000000O000[0x436F ^ 0x4220] = 0xE492 ^ 0x4220;
                    n3 = 106121489;
                    continue block84;
                }
                case 106121489: {
                    zl.o0000000O000[0xC3B2 ^ 0xC2F2] = 0xC2E9 ^ 0xC2F2;
                    zl.o0000000O000[0x8249 ^ 0x8266] = 0xFFFF7DB3 ^ 0x8266;
                    zl.o0000000O000[0xFC5A ^ 0xFC61] = 0xFC1B ^ 0xFC61;
                    zl.o0000000O000[0x5D44 ^ 0x5C34] = 0x7867 ^ 0x5C34;
                    zl.o0000000O000[0xDDF9 ^ 0xDCCA] = 0xDC94 ^ 0xDCCA;
                    n3 = 1024520145;
                    continue block84;
                }
                case 1024520145: {
                    zl.o0000000O000[0x67ED ^ 0x67AD] = 0x67B6 ^ 0x67AD;
                    zl.o0000000O000[0xE5F ^ 0xF1E] = 0xF1F ^ 0xF1E;
                    zl.o0000000O000[0x12D3 ^ 0x1220] = 0x1233 ^ 0x1220;
                    zl.o0000000O000[0x10E29 ^ 0x10E6F] = 0x10E7A ^ 0x10E6F;
                    zl.o0000000O000[0xA57A ^ 0xA516] = 0xA50B ^ 0xA516;
                    zl.o0000000O000[0xF4E7 ^ 0xF4FB] = 0xF4E2 ^ 0xF4FB;
                    zl.o0000000O000[0xBBB3 ^ 0xBA38] = 0x36D9 ^ 0xBA38;
                    zl.o0000000O000[0x7F35 ^ 0x7E13] = 0xFFFF81C8 ^ 0x7E13;
                    n3 = 165970073;
                    continue block84;
                }
                case 165970073: {
                    zl.o0000000O000[0x9F1C ^ 0x9FD7] = 0x9FD7 ^ 0x9FD7;
                    zl.o0000000O000[0x5969 ^ 0x59F6] = 0x59F2 ^ 0x59F6;
                    return;
                }
                default: {
                    zl.o0000000O000[0x32C0 ^ 0x3277] = 0x3277 ^ 0x3277;
                    zl.o0000000O000[0x1653 ^ 0x1624] = 0x7FFFE9F1 ^ 0x1624;
                    zl.o0000000O000[0x9C24 ^ 0x9C15] = 0x9C15 ^ 0x9C15;
                    zl.o0000000O000[0x2794 ^ 0x2724] = 0x2735 ^ 0x2724;
                    zl.o0000000O000[0x6572 ^ 0x6470] = 0xFFFF9B8F ^ 0x6470;
                    n3 = 163447197;
                    continue block84;
                }
                case 163447197: {
                    zl.o0000000O000[0xFAD0 ^ 0xFA01] = 0xFA0E ^ 0xFA01;
                    n3 = 1344113971;
                    continue block84;
                }
                case 1344113971: {
                    zl.o0000000O000[0x53B7 ^ 0x532B] = 0x5324 ^ 0x532B;
                    zl.o0000000O000[0x1014B ^ 0x1007D] = 0x10066 ^ 0x1007D;
                    zl.o0000000O000[0x2DA8 ^ 0x2D62] = 0xFFFFD29D ^ 0x2D62;
                    zl.o0000000O000[0xC11E ^ 0xC023] = 0xC02A ^ 0xC023;
                    zl.o0000000O000[0x6628 ^ 0x66DE] = 0x66DF ^ 0x66DE;
                    zl.o0000000O000[0xAF3C ^ 0xAF95] = 0xAF9A ^ 0xAF95;
                    n3 = 630660638;
                    continue block84;
                }
                case 630660638: {
                    zl.o0000000O000[0x104CB ^ 0x104BA] = 0x104BD ^ 0x104BA;
                    n3 = 1204926611;
                    continue block84;
                }
                case 1204926611: {
                    zl.o0000000O000[0x2B6F ^ 0x2A34] = 0x5DE5 ^ 0x2A34;
                    n3 = -412260766;
                    continue block84;
                }
                case -412260766: {
                    zl.o0000000O000[0x4D8A ^ 0x4D03] = 0xFFFFB2B6 ^ 0x4D03;
                    zl.o0000000O000[0x1E73 ^ 0x1F2E] = 0xC07C ^ 0x1F2E;
                    n3 = 1498005060;
                    continue block84;
                }
                case 1498005060: {
                    zl.o0000000O000[0x6C38 ^ 0x6D22] = 0xFFFF9295 ^ 0x6D22;
                    zl.o0000000O000[0xDA4 ^ 0xDC5] = 0xFFFFF27C ^ 0xDC5;
                    zl.o0000000O000[0x768 ^ 0x61C] = 0xD520 ^ 0x61C;
                    zl.o0000000O000[0x25CF ^ 0x25B9] = 0x2598 ^ 0x25B9;
                    zl.o0000000O000[0xF1A1 ^ 0xF15A] = 0xF101 ^ 0xF15A;
                    zl.o0000000O000[0x88B ^ 0x843] = 0x866 ^ 0x843;
                    zl.o0000000O000[0x39BC ^ 0x3957] = 0x395E ^ 0x3957;
                    n3 = -100670484;
                    continue block84;
                }
                case -100670484: {
                    zl.o0000000O000[0xBA4B ^ 0xBBC9] = 0xC49E ^ 0xBBC9;
                    zl.o0000000O000[0x41EF ^ 0x4160] = 0x4177 ^ 0x4160;
                    n3 = 2068239709;
                    continue block84;
                }
                case 2068239709: {
                    zl.o0000000O000[0x4274 ^ 0x42BA] = 0x42AF ^ 0x42BA;
                    zl.o0000000O000[0xDD76 ^ 0xDC12] = 0x12E8 ^ 0xDC12;
                    zl.o0000000O000[0x59D ^ 0x520] = 0xFFFFFADF ^ 0x520;
                    n3 = -2053904293;
                    continue block84;
                }
                case -2053904293: {
                    zl.o0000000O000[0x9CA9 ^ 0x9C0D] = 0x9C06 ^ 0x9C0D;
                    zl.o0000000O000[0x10368 ^ 0x103E3] = 0x103F2 ^ 0x103E3;
                    n3 = 891916193;
                    continue block84;
                }
                case 891916193: {
                    zl.o0000000O000[0x18 ^ 0x13] = 0x30 ^ 0x13;
                    zl.o0000000O000[0xCF80 ^ 0xCFE0] = 0xA0FD93BF ^ 0xCFE0;
                    zl.o0000000O000[0x12FA ^ 0x1262] = 0xFFFFED9D ^ 0x1262;
                    zl.o0000000O000[0x6809 ^ 0x6836] = 0x6833 ^ 0x6836;
                    zl.o0000000O000[0x193C ^ 0x19D0] = 0x19C7 ^ 0x19D0;
                    zl.o0000000O000[0x944C ^ 0x9513] = 0x4A66 ^ 0x9513;
                    n3 = -1143151434;
                    continue block84;
                }
                case -1143151434: {
                    zl.o0000000O000[0x3E69 ^ 0x3EA9] = 0x3EA0 ^ 0x3EA9;
                    zl.o0000000O000[0xDB78 ^ 0xDB35] = 0xDB60 ^ 0xDB35;
                    zl.o0000000O000[0x61A3 ^ 0x60E4] = 0xFFFF24EB ^ 0x60E4;
                    zl.o0000000O000[0xA6B8 ^ 0xA6EF] = 0xA6F8 ^ 0xA6EF;
                    zl.o0000000O000[0x50EC ^ 0x50EB] = 0xFFFFA70A ^ 0x50EB;
                    zl.o0000000O000[0x31FE ^ 0x30EC] = 0x30F1 ^ 0x30EC;
                    zl.o0000000O000[0x48D1 ^ 0x485C] = 0x4855 ^ 0x485C;
                    zl.o0000000O000[0x4F91 ^ 0x4FEB] = 0x4FB6 ^ 0x4FEB;
                    zl.o0000000O000[0x710 ^ 0x639] = 0x2B256294 ^ 0x639;
                    zl.o0000000O000[0xC3FD ^ 0xC392] = 0xC39B ^ 0xC392;
                    zl.o0000000O000[0xBFFB ^ 0xBF3C] = 0xBF07 ^ 0xBF3C;
                    zl.o0000000O000[0x80B ^ 0x941] = 0x60C ^ 0x941;
                    zl.o0000000O000[0xEA63 ^ 0xEBE5] = 0xB9A3 ^ 0xEBE5;
                    zl.o0000000O000[0x939F ^ 0x92E4] = 0xA2E8 ^ 0x92E4;
                    zl.o0000000O000[0x2590 ^ 0x24BF] = 0x2A4AA ^ 0x24BF;
                    zl.o0000000O000[0x9F1E ^ 0x9E60] = 0x1D9C ^ 0x9E60;
                    zl.o0000000O000[0x6397 ^ 0x632E] = 0x6321 ^ 0x632E;
                    zl.o0000000O000[0xD7B ^ 0xDB7] = 0xDA8 ^ 0xDB7;
                    zl.o0000000O000[0x6780 ^ 0x6750] = 0xFE751 ^ 0x6750;
                    zl.o0000000O000[0xB45E ^ 0xB439] = 0xFFFF4BC6 ^ 0xB439;
                    zl.o0000000O000[0x8F0E ^ 0x8F02] = 0xFFFF70FD ^ 0x8F02;
                    zl.o0000000O000[0xE17C ^ 0xE140] = 0xFFFF1EBF ^ 0xE140;
                    n3 = -1685948247;
                    continue block84;
                }
                case -1685948247: {
                    zl.o0000000O000[0x107B9 ^ 0x107E7] = 0x107E0 ^ 0x107E7;
                    zl.o0000000O000[0xFD43 ^ 0xFDC4] = 0xFDC5 ^ 0xFDC4;
                    n3 = -473635557;
                    continue block84;
                }
                case -473635557: 
            }
            zl.o0000000O000[0x9CF5 ^ 0x9C27] = 0x9C36 ^ 0x9C27;
            zl.o0000000O000[0x9EF6 ^ 0x9F7A] = 0x1A97 ^ 0x9F7A;
            zl.o0000000O000[0xBA3 ^ 0xA9C] = 0xA99 ^ 0xA9C;
            n3 = 985665336;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }
}

