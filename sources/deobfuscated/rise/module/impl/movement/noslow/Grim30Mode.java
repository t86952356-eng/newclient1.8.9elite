/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import hackclient.rise.ea;
import hackclient.rise.en;
import hackclient.rise.es;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;
import rise.value.BooleanValue;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Grim30Mode
extends Mode<NoSlow> {
    public static /* synthetic */ Object Oo0o00000O00;
    public static /* synthetic */ String[] oO00O0OO0ooO;
    @EventLink
    public /* synthetic */ Listener<en> Ni;
    @EventLink
    public /* synthetic */ Listener<MoveInputEvent> Nh;
    private static /* synthetic */ int[] O0OoOO0OOOOO;
    public /* synthetic */ BooleanValue Nd;
    @EventLink
    public /* synthetic */ Listener<es> Ne;
    @EventLink
    public /* synthetic */ Listener<SlowDownEvent> Nk;
    @EventLink
    public /* synthetic */ Listener<ea> Nj;
    public static /* synthetic */ Object[] o0Oo000O0oO;
    @EventLink
    public /* synthetic */ Listener<PreUpdateEvent> Nf;
    public static /* synthetic */ String[] q0oOOoOo0O00O;
    public static /* synthetic */ Object[] q0OOOoo00o0;
    public /* synthetic */ int hV;
    @EventLink
    public /* synthetic */ Listener<PacketSendEvent> Ng;
    private static /* synthetic */ int ooo00oo0Ooo0;
    private static /* synthetic */ boolean o0o000o0O0o0;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = 1567436135;
        if (n2 != n2) {
        }
        O0OoOO0OOOOO = new int[0x9C1 ^ 0x851];
        int n3 = 1306830056;
        block94: while (true) {
            switch (n3) {
                case -2056029079: {
                    Grim30Mode.O0OoOO0OOOOO[0xE9D0 ^ 0xE919] = 0xFFFE1181 ^ 0xE919;
                    Grim30Mode.O0OoOO0OOOOO[0x3E9 ^ 0x2A8] = 0xA7E8 ^ 0x2A8;
                    Grim30Mode.O0OoOO0OOOOO[0x146B ^ 0x14B4] = 0x1298 ^ 0x14B4;
                    Grim30Mode.O0OoOO0OOOOO[0xBE06 ^ 0xBF5E] = 0x4DE ^ 0xBF5E;
                    Grim30Mode.O0OoOO0OOOOO[0xBEA1 ^ 0xBE9D] = 0xBE88 ^ 0xBE9D;
                    Grim30Mode.O0OoOO0OOOOO[0x819D ^ 0x80B7] = 0x183AB ^ 0x80B7;
                    Grim30Mode.O0OoOO0OOOOO[0xB36C ^ 0xB3D7] = 0xB3C0 ^ 0xB3D7;
                    Grim30Mode.O0OoOO0OOOOO[0x5295 ^ 0x523F] = 0x5230 ^ 0x523F;
                    Grim30Mode.O0OoOO0OOOOO[0x2004 ^ 0x2148] = 0x7887 ^ 0x2148;
                    Grim30Mode.O0OoOO0OOOOO[0x10A98 ^ 0x10B9E] = 0x11F06 ^ 0x10B9E;
                    Grim30Mode.O0OoOO0OOOOO[0x10115 ^ 0x101E5] = 0x1E9CE ^ 0x101E5;
                    Grim30Mode.O0OoOO0OOOOO[0xCA1C ^ 0xCAB3] = 0xFFFF354C ^ 0xCAB3;
                    Grim30Mode.O0OoOO0OOOOO[0x2C5C ^ 0x2C01] = 0x2C52 ^ 0x2C01;
                    n3 = 1334590758;
                    continue block94;
                }
                case 1334590758: {
                    Grim30Mode.O0OoOO0OOOOO[0x10AC2 ^ 0x10AEB] = 0x10AE0 ^ 0x10AEB;
                    n3 = -254803659;
                    continue block94;
                }
                case -254803659: {
                    Grim30Mode.O0OoOO0OOOOO[0x2F5B ^ 0x2E15] = 0x29DB ^ 0x2E15;
                    n3 = -287683039;
                    continue block94;
                }
                case -287683039: {
                    Grim30Mode.O0OoOO0OOOOO[0xE64A ^ 0xE6D7] = 0x31937 ^ 0xE6D7;
                    n3 = 1675147472;
                    continue block94;
                }
                case 1675147472: {
                    Grim30Mode.O0OoOO0OOOOO[0xAB16 ^ 0xAA96] = 0xA450 ^ 0xAA96;
                    n3 = -885485037;
                    continue block94;
                }
                case -885485037: {
                    Grim30Mode.O0OoOO0OOOOO[0xF6C2 ^ 0xF601] = 0xF600 ^ 0xF601;
                    Grim30Mode.O0OoOO0OOOOO[0x6D8 ^ 0x643] = 0x65E ^ 0x643;
                    Grim30Mode.O0OoOO0OOOOO[0x100E2 ^ 0x100F3] = 0x902E146A ^ 0x100F3;
                    n3 = 154691012;
                    continue block94;
                }
                case 154691012: {
                    Grim30Mode.O0OoOO0OOOOO[0x5F56 ^ 0x5E6B] = 0x12CF ^ 0x5E6B;
                    Grim30Mode.O0OoOO0OOOOO[0x8206 ^ 0x8262] = 0xFFFF7DB7 ^ 0x8262;
                    n3 = -172164186;
                    continue block94;
                }
                case -172164186: {
                    Grim30Mode.O0OoOO0OOOOO[0xC563 ^ 0xC596] = 0x1FEA ^ 0xC596;
                    Grim30Mode.O0OoOO0OOOOO[0x2C30 ^ 0x2C1B] = 0x2B70 ^ 0x2C1B;
                    Grim30Mode.O0OoOO0OOOOO[0x79B9 ^ 0x79C0] = 0xFFFF8635 ^ 0x79C0;
                    n3 = 567049752;
                    continue block94;
                }
                case 567049752: {
                    Grim30Mode.O0OoOO0OOOOO[0x2311 ^ 0x2373] = 0x2366 ^ 0x2373;
                    Grim30Mode.O0OoOO0OOOOO[0xCED ^ 0xCAF] = 0xCB2 ^ 0xCAF;
                    Grim30Mode.O0OoOO0OOOOO[0x2ACA ^ 0x2BBA] = 0xEDFB ^ 0x2BBA;
                    Grim30Mode.O0OoOO0OOOOO[0x2DA ^ 0x3CA] = 0x3E4F ^ 0x3CA;
                    Grim30Mode.O0OoOO0OOOOO[0x6DB ^ 0x6CE] = 0x6C9 ^ 0x6CE;
                    Grim30Mode.O0OoOO0OOOOO[0xA72D ^ 0xA725] = 0xFFFF58DA ^ 0xA725;
                    Grim30Mode.O0OoOO0OOOOO[0x7FEF ^ 0x7F32] = 0xFFFF179F ^ 0x7F32;
                    Grim30Mode.O0OoOO0OOOOO[0x561A ^ 0x5659] = 0x5646 ^ 0x5659;
                    n3 = -960926685;
                    continue block94;
                }
                case -960926685: {
                    Grim30Mode.O0OoOO0OOOOO[0x3C49 ^ 0x3CDF] = 0x3CC4 ^ 0x3CDF;
                    Grim30Mode.O0OoOO0OOOOO[0xAF0D ^ 0xAE45] = 0x55E3 ^ 0xAE45;
                    Grim30Mode.O0OoOO0OOOOO[0xC58F ^ 0xC56A] = 0xA36 ^ 0xC56A;
                    Grim30Mode.O0OoOO0OOOOO[0xAF3C ^ 0xAFC0] = 0x184C ^ 0xAFC0;
                    Grim30Mode.O0OoOO0OOOOO[0x27D0 ^ 0x2710] = 0xFFFFD8EF ^ 0x2710;
                    n3 = -650942894;
                    continue block94;
                }
                case -650942894: {
                    Grim30Mode.O0OoOO0OOOOO[0xB82E ^ 0xB963] = 0xE094 ^ 0xB963;
                    Grim30Mode.O0OoOO0OOOOO[0x469F ^ 0x4671] = 0x2A3C ^ 0x4671;
                    Grim30Mode.O0OoOO0OOOOO[0xCCC4 ^ 0xCDE7] = 0x2BBF ^ 0xCDE7;
                    Grim30Mode.O0OoOO0OOOOO[0x4720 ^ 0x4631] = 0x7BBC ^ 0x4631;
                    Grim30Mode.O0OoOO0OOOOO[0x8B22 ^ 0x8BC9] = 0xE781 ^ 0x8BC9;
                    Grim30Mode.O0OoOO0OOOOO[0x38DC ^ 0x399B] = 0xC264 ^ 0x399B;
                    Grim30Mode.O0OoOO0OOOOO[0xD4A5 ^ 0xD4BA] = 0xD4D3 ^ 0xD4BA;
                    Grim30Mode.O0OoOO0OOOOO[0x7050 ^ 0x70FB] = 0x34DB ^ 0x70FB;
                    Grim30Mode.O0OoOO0OOOOO[0x6542 ^ 0x652C] = 0x6524 ^ 0x652C;
                    Grim30Mode.O0OoOO0OOOOO[0x46F9 ^ 0x46F5] = 0xFFFFB96E ^ 0x46F5;
                    Grim30Mode.O0OoOO0OOOOO[0x846 ^ 0x80F] = 0x684BD21C ^ 0x80F;
                    Grim30Mode.O0OoOO0OOOOO[0x6BD1 ^ 0x6AC6] = 0x7406 ^ 0x6AC6;
                    Grim30Mode.O0OoOO0OOOOO[0x105D6 ^ 0x105B3] = 0x2D2C289E ^ 0x105B3;
                    Grim30Mode.O0OoOO0OOOOO[0x2DD ^ 0x3B6] = 0x4D2E ^ 0x3B6;
                    Grim30Mode.O0OoOO0OOOOO[0x4C35 ^ 0x4C8B] = 0xFFFFB362 ^ 0x4C8B;
                    Grim30Mode.O0OoOO0OOOOO[0x3D31 ^ 0x3CB8] = 0x2595 ^ 0x3CB8;
                    n3 = 1501651893;
                    continue block94;
                }
                case 1501651893: {
                    Grim30Mode.O0OoOO0OOOOO[0x4427 ^ 0x4424] = 0x4437 ^ 0x4424;
                    n3 = 822799283;
                    continue block94;
                }
                case 822799283: {
                    Grim30Mode.O0OoOO0OOOOO[0x17A7 ^ 0x16DA] = 0xE129 ^ 0x16DA;
                    Grim30Mode.O0OoOO0OOOOO[0xCB97 ^ 0xCA95] = 0x554A ^ 0xCA95;
                    Grim30Mode.O0OoOO0OOOOO[0x2B91 ^ 0x2BF8] = 0x286BE1E3 ^ 0x2BF8;
                    Grim30Mode.O0OoOO0OOOOO[0x9187 ^ 0x91E8] = 0x91E9 ^ 0x91E8;
                    Grim30Mode.O0OoOO0OOOOO[0x105AB ^ 0x10547] = 0x1690A ^ 0x10547;
                    Grim30Mode.O0OoOO0OOOOO[0x2EDE ^ 0x2E13] = 0xFFFFB849 ^ 0x2E13;
                    Grim30Mode.O0OoOO0OOOOO[0x9621 ^ 0x96DC] = 0xFFFFDE91 ^ 0x96DC;
                    Grim30Mode.O0OoOO0OOOOO[0xBDF0 ^ 0xBDB8] = 0xBDB7 ^ 0xBDB8;
                    Grim30Mode.O0OoOO0OOOOO[0xA356 ^ 0xA310] = 0xFE50DCEF ^ 0xA310;
                    Grim30Mode.O0OoOO0OOOOO[0xC4E3 ^ 0xC566] = 0x87E5 ^ 0xC566;
                    n3 = 901298975;
                    continue block94;
                }
                case 901298975: {
                    Grim30Mode.O0OoOO0OOOOO[0xBAEA ^ 0xBA15] = 0x25C2 ^ 0xBA15;
                    Grim30Mode.O0OoOO0OOOOO[0x1745 ^ 0x1625] = 0xFFFF4537 ^ 0x1625;
                    Grim30Mode.O0OoOO0OOOOO[0xC428 ^ 0xC481] = 0xFFFF3B3C ^ 0xC481;
                    Grim30Mode.O0OoOO0OOOOO[0x5180 ^ 0x5114] = 0x511F ^ 0x5114;
                    Grim30Mode.O0OoOO0OOOOO[0xEEE0 ^ 0xEE9F] = 0xF116A ^ 0xEE9F;
                    Grim30Mode.O0OoOO0OOOOO[0x61DC ^ 0x618B] = 0xA93E ^ 0x618B;
                    n3 = -1451249615;
                    continue block94;
                }
                case -1451249615: {
                    Grim30Mode.O0OoOO0OOOOO[0x244B ^ 0x2481] = 0x123AF ^ 0x2481;
                    Grim30Mode.O0OoOO0OOOOO[0xBC6 ^ 0xB6B] = 0x33333858 ^ 0xB6B;
                    n3 = -874598365;
                    continue block94;
                }
                case -874598365: {
                    Grim30Mode.O0OoOO0OOOOO[0xE572 ^ 0xE44D] = 0x410D ^ 0xE44D;
                    Grim30Mode.O0OoOO0OOOOO[0x1058F ^ 0x105FE] = 0xFFFEFA01 ^ 0x105FE;
                    Grim30Mode.O0OoOO0OOOOO[0x7182 ^ 0x7150] = 0x3AE6 ^ 0x7150;
                    Grim30Mode.O0OoOO0OOOOO[0xCB6D ^ 0xCB1D] = 0xCB02 ^ 0xCB1D;
                    Grim30Mode.O0OoOO0OOOOO[0x7548 ^ 0x74C9] = 0x7A5D ^ 0x74C9;
                    n3 = -998633220;
                    continue block94;
                }
                case -998633220: {
                    Grim30Mode.O0OoOO0OOOOO[0x8636 ^ 0x87B2] = 0xC576 ^ 0x87B2;
                    Grim30Mode.O0OoOO0OOOOO[0xC85D ^ 0xC954] = 0x68E5 ^ 0xC954;
                    Grim30Mode.O0OoOO0OOOOO[0x4C16 ^ 0x4C8F] = 0xFFFFB370 ^ 0x4C8F;
                    Grim30Mode.O0OoOO0OOOOO[0x101B6 ^ 0x101E7] = 0x101E7 ^ 0x101E7;
                    Grim30Mode.O0OoOO0OOOOO[0xCAE5 ^ 0xCBB2] = 0x7026 ^ 0xCBB2;
                    Grim30Mode.O0OoOO0OOOOO[0xB621 ^ 0xB64D] = 0xB646 ^ 0xB64D;
                    Grim30Mode.O0OoOO0OOOOO[0xE66 ^ 0xE22] = 0xE33 ^ 0xE22;
                    n3 = 737150546;
                    continue block94;
                }
                case 737150546: {
                    Grim30Mode.O0OoOO0OOOOO[0x9AD6 ^ 0x9AF4] = 0x9AF1 ^ 0x9AF4;
                    n3 = 1085591918;
                    continue block94;
                }
                case 1085591918: {
                    Grim30Mode.O0OoOO0OOOOO[0x24B4 ^ 0x247A] = 0x4D9D ^ 0x247A;
                    Grim30Mode.O0OoOO0OOOOO[0xF33C ^ 0xF3D8] = 0x3C96 ^ 0xF3D8;
                    n3 = 12792601;
                    continue block94;
                }
                case 12792601: {
                    Grim30Mode.O0OoOO0OOOOO[0x7863 ^ 0x79E1] = 0x3B7F ^ 0x79E1;
                    Grim30Mode.O0OoOO0OOOOO[0x3FFF ^ 0x3FEB] = 0x3FF2 ^ 0x3FEB;
                    Grim30Mode.O0OoOO0OOOOO[0x3DF ^ 0x3C8] = 0x3DB ^ 0x3C8;
                    Grim30Mode.O0OoOO0OOOOO[0x6C30 ^ 0x6D4E] = 0x63CB ^ 0x6D4E;
                    Grim30Mode.O0OoOO0OOOOO[0xB08F ^ 0xB1C9] = 0x4A25 ^ 0xB1C9;
                    Grim30Mode.O0OoOO0OOOOO[0xD826 ^ 0xD94A] = 0xFFFF681A ^ 0xD94A;
                    Grim30Mode.O0OoOO0OOOOO[0xC66A ^ 0xC74F] = 0x2117 ^ 0xC74F;
                    Grim30Mode.O0OoOO0OOOOO[0x3BCC ^ 0x3BF9] = 0x3BF6 ^ 0x3BF9;
                    Grim30Mode.O0OoOO0OOOOO[0x987 ^ 0x9EA] = 0x987 ^ 0x9EA;
                    n3 = -909939572;
                    continue block94;
                }
                case -909939572: {
                    Grim30Mode.O0OoOO0OOOOO[0x252F ^ 0x243A] = 0xB541 ^ 0x243A;
                    Grim30Mode.O0OoOO0OOOOO[0x63E5 ^ 0x62ED] = 0xC37C ^ 0x62ED;
                    Grim30Mode.O0OoOO0OOOOO[0x179C ^ 0x1718] = 0xFFFFE891 ^ 0x1718;
                    n3 = 1364832571;
                    continue block94;
                }
                case 1364832571: {
                    Grim30Mode.O0OoOO0OOOOO[0xAAE ^ 0xBD7] = 0x5C22 ^ 0xBD7;
                    n3 = 1729608104;
                    continue block94;
                }
                case 1729608104: {
                    Grim30Mode.O0OoOO0OOOOO[0x7E1D ^ 0x7F04] = 0x61C4 ^ 0x7F04;
                    Grim30Mode.O0OoOO0OOOOO[0x36C1 ^ 0x364C] = 0x36CC ^ 0x364C;
                    Grim30Mode.O0OoOO0OOOOO[0x30F4 ^ 0x300E] = 0x83A9 ^ 0x300E;
                    Grim30Mode.O0OoOO0OOOOO[0xD168 ^ 0xD1BD] = 0xFFFFACFD ^ 0xD1BD;
                    Grim30Mode.O0OoOO0OOOOO[0x225A ^ 0x220F] = 0x4B0B ^ 0x220F;
                    n3 = -2010172375;
                    continue block94;
                }
                case -2010172375: {
                    Grim30Mode.O0OoOO0OOOOO[0x1AEC ^ 0x1A48] = 0x1A23 ^ 0x1A48;
                    Grim30Mode.O0OoOO0OOOOO[0x8A38 ^ 0x8BB3] = 0x8BB3 ^ 0x8BB3;
                    Grim30Mode.O0OoOO0OOOOO[0x10518 ^ 0x1051A] = 0x10509 ^ 0x1051A;
                    Grim30Mode.O0OoOO0OOOOO[0xB9A1 ^ 0xB953] = 0x5178 ^ 0xB953;
                    Grim30Mode.O0OoOO0OOOOO[0xAB33 ^ 0xABA9] = 0xFFFF5456 ^ 0xABA9;
                    n3 = -1461591164;
                    continue block94;
                }
                case -1461591164: {
                    Grim30Mode.O0OoOO0OOOOO[0x1335 ^ 0x1307] = 0x3EC0BD61 ^ 0x1307;
                    Grim30Mode.O0OoOO0OOOOO[0xE8B8 ^ 0xE8AE] = 0xE8A3 ^ 0xE8AE;
                    Grim30Mode.O0OoOO0OOOOO[0x7AEE ^ 0x7B8C] = 0xCC6 ^ 0x7B8C;
                    Grim30Mode.O0OoOO0OOOOO[0xCFF6 ^ 0xCF21] = 0xDF63 ^ 0xCF21;
                    Grim30Mode.O0OoOO0OOOOO[0x689A ^ 0x68F1] = 0x68E4 ^ 0x68F1;
                    Grim30Mode.O0OoOO0OOOOO[0x9DEC ^ 0x9DA2] = 0x9DA9 ^ 0x9DA2;
                    Grim30Mode.O0OoOO0OOOOO[0x2E6F ^ 0x2E09] = 0xFFFFD1A2 ^ 0x2E09;
                    Grim30Mode.O0OoOO0OOOOO[0xA6AC ^ 0xA634] = 0xFFFF59CA ^ 0xA634;
                    Grim30Mode.O0OoOO0OOOOO[0xCB54 ^ 0xCBF3] = 0xCBF4 ^ 0xCBF3;
                    Grim30Mode.O0OoOO0OOOOO[0xF508 ^ 0xF551] = 0xF551 ^ 0xF551;
                    Grim30Mode.O0OoOO0OOOOO[0xF9CD ^ 0xF9C0] = 0xF9FB ^ 0xF9C0;
                    Grim30Mode.O0OoOO0OOOOO[0x523C ^ 0x52C7] = 0xE544 ^ 0x52C7;
                    Grim30Mode.O0OoOO0OOOOO[0xC1C8 ^ 0xC148] = 0xFFFF3EBD ^ 0xC148;
                    Grim30Mode.O0OoOO0OOOOO[0xECEC ^ 0xEDD5] = 0x203E ^ 0xEDD5;
                    n3 = 1645920651;
                    continue block94;
                }
                case 1645920651: {
                    Grim30Mode.O0OoOO0OOOOO[0x3E0 ^ 0x2FB] = 0xB710 ^ 0x2FB;
                    Grim30Mode.O0OoOO0OOOOO[0x6617 ^ 0x672D] = 0x2B86 ^ 0x672D;
                    n3 = 673135222;
                    continue block94;
                }
                case 673135222: {
                    Grim30Mode.O0OoOO0OOOOO[0x102B8 ^ 0x1028E] = 0xFFFEFD5B ^ 0x1028E;
                    n3 = -1676369005;
                    continue block94;
                }
                case -1676369005: {
                    Grim30Mode.O0OoOO0OOOOO[0x59AF ^ 0x588B] = 0xFFFF4157 ^ 0x588B;
                    Grim30Mode.O0OoOO0OOOOO[0x2272 ^ 0x2239] = 0x2276 ^ 0x2239;
                    Grim30Mode.O0OoOO0OOOOO[0x10B63 ^ 0x10A2A] = 0x1F1D5 ^ 0x10A2A;
                    Grim30Mode.O0OoOO0OOOOO[0xDB6A ^ 0xDB8D] = 0xA127 ^ 0xDB8D;
                    Grim30Mode.O0OoOO0OOOOO[0xB562 ^ 0xB40B] = 0xC87F ^ 0xB40B;
                    Grim30Mode.O0OoOO0OOOOO[0x4962 ^ 0x494C] = 0xFFFFB653 ^ 0x494C;
                    Grim30Mode.O0OoOO0OOOOO[0x9C07 ^ 0x9D8B] = 0x9D8B ^ 0x9D8B;
                    n3 = -678136399;
                    continue block94;
                }
                case -678136399: {
                    Grim30Mode.O0OoOO0OOOOO[0x9D71 ^ 0x9D16] = 0x9D19 ^ 0x9D16;
                    Grim30Mode.O0OoOO0OOOOO[0xA3EA ^ 0xA2C7] = 0x1A1C5 ^ 0xA2C7;
                    Grim30Mode.O0OoOO0OOOOO[0xDC68 ^ 0xDC6F] = 0x75078C1A ^ 0xDC6F;
                    n3 = 2016860880;
                    continue block94;
                }
                case 2016860880: {
                    Grim30Mode.O0OoOO0OOOOO[0x1BD2 ^ 0x1AD5] = 0x1AD5 ^ 0x1AD5;
                    Grim30Mode.O0OoOO0OOOOO[0xF2EE ^ 0xF23D] = 0x70F8 ^ 0xF23D;
                    Grim30Mode.O0OoOO0OOOOO[0x9489 ^ 0x95A1] = 0x1024 ^ 0x95A1;
                    n3 = 923570228;
                    continue block94;
                }
                case 923570228: {
                    Grim30Mode.O0OoOO0OOOOO[0x1B67 ^ 0x1B2B] = 0x1B48 ^ 0x1B2B;
                    Grim30Mode.O0OoOO0OOOOO[0xDB6C ^ 0xDA19] = 0xBDE8 ^ 0xDA19;
                    Grim30Mode.O0OoOO0OOOOO[0x5F4F ^ 0x5E6D] = 0xB82D ^ 0x5E6D;
                    n3 = -1530541595;
                    continue block94;
                }
                case -1530541595: {
                    Grim30Mode.O0OoOO0OOOOO[0x7903 ^ 0x79D7] = 0xFB11 ^ 0x79D7;
                    Grim30Mode.O0OoOO0OOOOO[0x22F ^ 0x277] = 0xA64 ^ 0x277;
                    Grim30Mode.O0OoOO0OOOOO[0xE762 ^ 0xE71E] = 0xE71F ^ 0xE71E;
                    Grim30Mode.O0OoOO0OOOOO[0x19AC ^ 0x192E] = 0x193F ^ 0x192E;
                    Grim30Mode.O0OoOO0OOOOO[0xC941 ^ 0xC959] = 0xFFF0C94A ^ 0xC959;
                    n3 = -201383308;
                    continue block94;
                }
                case -201383308: {
                    Grim30Mode.O0OoOO0OOOOO[0x2378 ^ 0x2362] = 0x236F ^ 0x2362;
                    n3 = 1433719239;
                    continue block94;
                }
                case 1433719239: {
                    Grim30Mode.O0OoOO0OOOOO[0x10734 ^ 0x1066F] = 0x1F209 ^ 0x1066F;
                    Grim30Mode.O0OoOO0OOOOO[0x25B0 ^ 0x2512] = 0xE0545114 ^ 0x2512;
                    Grim30Mode.O0OoOO0OOOOO[0xDE1D ^ 0xDEEB] = 0x4C2 ^ 0xDEEB;
                    Grim30Mode.O0OoOO0OOOOO[0x928A ^ 0x93EF] = 0xE4BE ^ 0x93EF;
                    n3 = -464757022;
                    continue block94;
                }
                case -464757022: {
                    Grim30Mode.O0OoOO0OOOOO[0x5049 ^ 0x513B] = 0x36DE ^ 0x513B;
                    n3 = -850424675;
                    continue block94;
                }
                case -850424675: {
                    Grim30Mode.O0OoOO0OOOOO[0x21A9 ^ 0x20F5] = 0xD491 ^ 0x20F5;
                    Grim30Mode.O0OoOO0OOOOO[0x10337 ^ 0x10303] = 0x10312 ^ 0x10303;
                    Grim30Mode.O0OoOO0OOOOO[0x759B ^ 0x752D] = 0xFFFF8ABC ^ 0x752D;
                    Grim30Mode.O0OoOO0OOOOO[0xF715 ^ 0xF734] = 0xF72F ^ 0xF734;
                    Grim30Mode.O0OoOO0OOOOO[0xC241 ^ 0xC379] = 0xEEB ^ 0xC379;
                    Grim30Mode.O0OoOO0OOOOO[0xE7C6 ^ 0xE766] = 0xE775 ^ 0xE766;
                    n3 = -959285148;
                    continue block94;
                }
                case -959285148: {
                    Grim30Mode.O0OoOO0OOOOO[0x44 ^ 0x156] = 0x9026 ^ 0x156;
                    n3 = 1928295254;
                    continue block94;
                }
                case 1928295254: {
                    Grim30Mode.O0OoOO0OOOOO[0x12C9 ^ 0x122F] = 0xDD61 ^ 0x122F;
                    Grim30Mode.O0OoOO0OOOOO[0x6C2A ^ 0x6C7E] = 0x6C7D ^ 0x6C7E;
                    Grim30Mode.O0OoOO0OOOOO[0xEC96 ^ 0xEC5A] = 0x85BD ^ 0xEC5A;
                    Grim30Mode.O0OoOO0OOOOO[0x796 ^ 0x7A1] = 0xFFFFF82E ^ 0x7A1;
                    n3 = 872071656;
                    continue block94;
                }
                case 872071656: {
                    Grim30Mode.O0OoOO0OOOOO[0xE587 ^ 0xE522] = 0xE543 ^ 0xE522;
                    Grim30Mode.O0OoOO0OOOOO[0x3B7C ^ 0x3A36] = 0x63CD ^ 0x3A36;
                    Grim30Mode.O0OoOO0OOOOO[0xAE54 ^ 0xAF05] = 0xA8C2 ^ 0xAF05;
                    n3 = 1172622182;
                    continue block94;
                }
                case 1172622182: {
                    Grim30Mode.O0OoOO0OOOOO[0xE50C ^ 0xE5C3] = 0xAE73 ^ 0xE5C3;
                    n3 = -623138464;
                    continue block94;
                }
                case -623138464: {
                    Grim30Mode.O0OoOO0OOOOO[0xC9C6 ^ 0xC924] = 0xCF01 ^ 0xC924;
                    Grim30Mode.O0OoOO0OOOOO[0x3601 ^ 0x3700] = 0xFFFF5765 ^ 0x3700;
                    n3 = 1016382192;
                    continue block94;
                }
                case 1016382192: {
                    Grim30Mode.O0OoOO0OOOOO[0x749B ^ 0x75AD] = 0xB84C ^ 0x75AD;
                    Grim30Mode.O0OoOO0OOOOO[0x6DBE ^ 0x6D96] = 0x6D83 ^ 0x6D96;
                    Grim30Mode.O0OoOO0OOOOO[0x24C ^ 0x32B] = 0x7F5F ^ 0x32B;
                    Grim30Mode.O0OoOO0OOOOO[0xC3D7 ^ 0xC345] = 0xC4E2 ^ 0xC345;
                    n3 = -2136494413;
                    continue block94;
                }
                case -2136494413: {
                    Grim30Mode.O0OoOO0OOOOO[0xE545 ^ 0xE565] = 0xFFFF1AA5 ^ 0xE565;
                    Grim30Mode.O0OoOO0OOOOO[0xECBE ^ 0xED95] = 0x1EE97 ^ 0xED95;
                    Grim30Mode.O0OoOO0OOOOO[0x58EC ^ 0x589B] = 0x5888 ^ 0x589B;
                    Grim30Mode.O0OoOO0OOOOO[0xA022 ^ 0xA0FE] = 0x3790 ^ 0xA0FE;
                    n3 = -1955886257;
                    continue block94;
                }
                case -1955886257: {
                    Grim30Mode.O0OoOO0OOOOO[0x1044F ^ 0x104C6] = 0xFFFEFB39 ^ 0x104C6;
                    Grim30Mode.O0OoOO0OOOOO[0x7529 ^ 0x755A] = 0x9D89ADF5 ^ 0x755A;
                    Grim30Mode.O0OoOO0OOOOO[0xD4ED ^ 0xD433] = 0x435D ^ 0xD433;
                    Grim30Mode.O0OoOO0OOOOO[0x133E ^ 0x13FA] = 0x13FA ^ 0x13FA;
                    Grim30Mode.O0OoOO0OOOOO[0xE34A ^ 0xE3FF] = 0xFFFF1C1D ^ 0xE3FF;
                    Grim30Mode.O0OoOO0OOOOO[0xF38 ^ 0xE33] = 0x5071 ^ 0xE33;
                    Grim30Mode.O0OoOO0OOOOO[0xF5F5 ^ 0xF4E8] = 0x4103 ^ 0xF4E8;
                    Grim30Mode.O0OoOO0OOOOO[0x2923 ^ 0x29E8] = 0x400E ^ 0x29E8;
                    n3 = -232405309;
                    continue block94;
                }
                case -232405309: {
                    Grim30Mode.O0OoOO0OOOOO[0xC63 ^ 0xC2E] = 0xC3B ^ 0xC2E;
                    Grim30Mode.O0OoOO0OOOOO[0xCA32 ^ 0xCB5D] = 0xD75 ^ 0xCB5D;
                    n3 = -291645978;
                    continue block94;
                }
                case -291645978: {
                    Grim30Mode.O0OoOO0OOOOO[0xF3D7 ^ 0xF3C7] = 0xFFFF0C38 ^ 0xF3C7;
                    Grim30Mode.O0OoOO0OOOOO[0xA2E ^ 0xBA6] = 0xFFFFED55 ^ 0xBA6;
                    Grim30Mode.O0OoOO0OOOOO[0x2790 ^ 0x2746] = 0xA580 ^ 0x2746;
                    Grim30Mode.O0OoOO0OOOOO[0xE40D ^ 0xE52B] = 0x60C2 ^ 0xE52B;
                    n3 = -976667207;
                    continue block94;
                }
                case -976667207: {
                    Grim30Mode.O0OoOO0OOOOO[0x13CA ^ 0x13AB] = 0x13A4 ^ 0x13AB;
                    Grim30Mode.O0OoOO0OOOOO[0xDF85 ^ 0xDF09] = 0xDF26 ^ 0xDF09;
                    Grim30Mode.O0OoOO0OOOOO[0xBA24 ^ 0xBB42] = 0xC733 ^ 0xBB42;
                    Grim30Mode.O0OoOO0OOOOO[0x4D07 ^ 0x4C47] = 0xE914 ^ 0x4C47;
                    n3 = 994639089;
                    continue block94;
                }
                case 994639089: {
                    Grim30Mode.O0OoOO0OOOOO[0x7B0E ^ 0x7A3D] = 0xBB6C ^ 0x7A3D;
                    Grim30Mode.O0OoOO0OOOOO[0x36D8 ^ 0x36E0] = 0x36E4 ^ 0x36E0;
                    Grim30Mode.O0OoOO0OOOOO[0x3F3D ^ 0x3F91] = 0x2593C90A ^ 0x3F91;
                    Grim30Mode.O0OoOO0OOOOO[0x9B50 ^ 0x9B0B] = 0x9B6E ^ 0x9B0B;
                    n3 = 1318017534;
                    continue block94;
                }
                case 1318017534: {
                    Grim30Mode.O0OoOO0OOOOO[0x7F2E ^ 0x7E7C] = 0xAD60 ^ 0x7E7C;
                    Grim30Mode.O0OoOO0OOOOO[0xBDD0 ^ 0xBCD4] = 0xA84C ^ 0xBCD4;
                    Grim30Mode.O0OoOO0OOOOO[0x31F ^ 0x207] = 0x1CBB ^ 0x207;
                    n3 = 2099900967;
                    continue block94;
                }
                case 2099900967: {
                    Grim30Mode.O0OoOO0OOOOO[0xFF6F ^ 0xFF85] = 0x8521 ^ 0xFF85;
                    Grim30Mode.O0OoOO0OOOOO[0x94F0 ^ 0x95A0] = 0x920E ^ 0x95A0;
                    Grim30Mode.O0OoOO0OOOOO[0x32CC ^ 0x3388] = 0xFFFFEB9B ^ 0x3388;
                    n3 = -90495826;
                    continue block94;
                }
                case -90495826: {
                    Grim30Mode.O0OoOO0OOOOO[0x61ED ^ 0x619B] = 0xA8619B ^ 0x619B;
                    Grim30Mode.O0OoOO0OOOOO[0xFBDB ^ 0xFB0B] = 0xB0BD ^ 0xFB0B;
                    n3 = 1826740251;
                    continue block94;
                }
                case 1826740251: {
                    Grim30Mode.O0OoOO0OOOOO[0xF23D ^ 0xF2BB] = 0xCCCC3E76 ^ 0xF2BB;
                    n3 = 28172312;
                    continue block94;
                }
                case 28172312: {
                    Grim30Mode.O0OoOO0OOOOO[0x70A6 ^ 0x71BC] = 0xC454 ^ 0x71BC;
                    Grim30Mode.O0OoOO0OOOOO[0xB6B7 ^ 0xB670] = 0x1B154 ^ 0xB670;
                    Grim30Mode.O0OoOO0OOOOO[0xD33F ^ 0xD318] = 0xFFFF2CE7 ^ 0xD318;
                    Grim30Mode.O0OoOO0OOOOO[0xDA86 ^ 0xDB09] = 0xDB05 ^ 0xDB09;
                    Grim30Mode.O0OoOO0OOOOO[0xFD05 ^ 0xFD26] = 0xB94B699C ^ 0xFD26;
                    n3 = 284633047;
                    continue block94;
                }
                case 284633047: {
                    Grim30Mode.O0OoOO0OOOOO[0x3914 ^ 0x3929] = 0x3922 ^ 0x3929;
                    Grim30Mode.O0OoOO0OOOOO[0xA233 ^ 0xA220] = 0xFFFF5DA9 ^ 0xA220;
                    Grim30Mode.O0OoOO0OOOOO[0x23F9 ^ 0x2341] = 0x2A2F ^ 0x2341;
                    Grim30Mode.O0OoOO0OOOOO[0x9692 ^ 0x97B2] = 0xFFFF6975 ^ 0x97B2;
                    Grim30Mode.O0OoOO0OOOOO[0x1AF9 ^ 0x1BFA] = 0xF6E ^ 0x1BFA;
                    Grim30Mode.O0OoOO0OOOOO[0x436 ^ 0x48B] = 0xFFFFFB42 ^ 0x48B;
                    Grim30Mode.O0OoOO0OOOOO[0x10658 ^ 0x10658] = 0x10658 ^ 0x10658;
                    Grim30Mode.O0OoOO0OOOOO[0xF56 ^ 0xE13] = 0x2993 ^ 0xE13;
                    Grim30Mode.O0OoOO0OOOOO[0x35AE ^ 0x34D9] = 0x632C ^ 0x34D9;
                    Grim30Mode.O0OoOO0OOOOO[0xE811 ^ 0xE8F9] = 0x925D ^ 0xE8F9;
                    Grim30Mode.O0OoOO0OOOOO[0x58AC ^ 0x58FF] = 0x58F2 ^ 0x58FF;
                    Grim30Mode.O0OoOO0OOOOO[0xB2F1 ^ 0xB210] = 0xB42D ^ 0xB210;
                    Grim30Mode.O0OoOO0OOOOO[0x8510 ^ 0x8536] = 0xF208536 ^ 0x8536;
                    n3 = -87048807;
                    continue block94;
                }
                case -87048807: {
                    Grim30Mode.O0OoOO0OOOOO[0x280E ^ 0x2927] = 0xACD7 ^ 0x2927;
                    Grim30Mode.O0OoOO0OOOOO[0x1D12 ^ 0x1DA5] = 0xFFFFE236 ^ 0x1DA5;
                    Grim30Mode.O0OoOO0OOOOO[0xC4B2 ^ 0xC422] = 0xFFFF3BDD ^ 0xC422;
                    Grim30Mode.O0OoOO0OOOOO[0xF30A ^ 0xF314] = 0xFFFF0CEB ^ 0xF314;
                    Grim30Mode.O0OoOO0OOOOO[0xC833 ^ 0xC94B] = 0x9EE2 ^ 0xC94B;
                    n3 = 678665981;
                    continue block94;
                }
                case 678665981: {
                    Grim30Mode.O0OoOO0OOOOO[0x78EF ^ 0x781E] = 0x9064 ^ 0x781E;
                    Grim30Mode.O0OoOO0OOOOO[0x6E0D ^ 0x6F13] = 0x6E37 ^ 0x6F13;
                    Grim30Mode.O0OoOO0OOOOO[0x661 ^ 0x6A4] = 0x6154 ^ 0x6A4;
                    Grim30Mode.O0OoOO0OOOOO[0x3EC9 ^ 0x3FB2] = 0xC841 ^ 0x3FB2;
                    Grim30Mode.O0OoOO0OOOOO[0xE93C ^ 0xE962] = 0xE911 ^ 0xE962;
                    Grim30Mode.O0OoOO0OOOOO[0x828 ^ 0x817] = 0x828 ^ 0x817;
                    Grim30Mode.O0OoOO0OOOOO[0x5C4C ^ 0x5CC9] = 0xFFFFA350 ^ 0x5CC9;
                    Grim30Mode.O0OoOO0OOOOO[0x36F ^ 0x27B] = 0xFFFF6CFA ^ 0x27B;
                    Grim30Mode.O0OoOO0OOOOO[0xEEB0 ^ 0xEFA3] = 0x7ED8 ^ 0xEFA3;
                    Grim30Mode.O0OoOO0OOOOO[0xAABE ^ 0xAAE1] = 0xD7FF551E ^ 0xAAE1;
                    Grim30Mode.O0OoOO0OOOOO[0x20 ^ 0x19] = 0x18 ^ 0x19;
                    n3 = 618606941;
                    continue block94;
                }
                case 618606941: {
                    Grim30Mode.O0OoOO0OOOOO[0xA9CA ^ 0xA8C7] = 0xF685 ^ 0xA8C7;
                    Grim30Mode.O0OoOO0OOOOO[0x4B32 ^ 0x4B52] = 0x4B43 ^ 0x4B52;
                    n3 = 2053062330;
                    continue block94;
                }
                case 2053062330: {
                    Grim30Mode.O0OoOO0OOOOO[0x6972 ^ 0x68F5] = 0x71D8 ^ 0x68F5;
                    Grim30Mode.O0OoOO0OOOOO[0xD003 ^ 0xD046] = 0xD043 ^ 0xD046;
                    Grim30Mode.O0OoOO0OOOOO[0xD084 ^ 0xD0CE] = 0xFFFE2F1A ^ 0xD0CE;
                    Grim30Mode.O0OoOO0OOOOO[0xF124 ^ 0xF07A] = 0x5CF1 ^ 0xF07A;
                    Grim30Mode.O0OoOO0OOOOO[0x199B ^ 0x192B] = 0xFFFFE6D4 ^ 0x192B;
                    n3 = -140834850;
                    continue block94;
                }
                case -140834850: {
                    Grim30Mode.O0OoOO0OOOOO[0x8EB4 ^ 0x8FE7] = 0x5CF9 ^ 0x8FE7;
                    n3 = 1992703796;
                    continue block94;
                }
                case 1992703796: {
                    Grim30Mode.O0OoOO0OOOOO[0x392C ^ 0x3819] = 0xF948 ^ 0x3819;
                    n3 = -388916634;
                    continue block94;
                }
                case -388916634: {
                    Grim30Mode.O0OoOO0OOOOO[0x32CA ^ 0x3229] = 0xFD6C ^ 0x3229;
                    n3 = 1904040831;
                    continue block94;
                }
                case 1904040831: {
                    Grim30Mode.O0OoOO0OOOOO[0xECEA ^ 0xEC60] = 0xEC6F ^ 0xEC60;
                    n3 = -183355628;
                    continue block94;
                }
                case -183355628: {
                    Grim30Mode.O0OoOO0OOOOO[0xFF1E ^ 0xFE55] = 0xA7A2 ^ 0xFE55;
                    Grim30Mode.O0OoOO0OOOOO[0x7903 ^ 0x7889] = 0x7889 ^ 0x7889;
                    Grim30Mode.O0OoOO0OOOOO[0x9225 ^ 0x92FE] = 0x597 ^ 0x92FE;
                    n3 = 2009976255;
                    continue block94;
                }
                case 2009976255: {
                    Grim30Mode.O0OoOO0OOOOO[0xDA9D ^ 0xDA27] = 0xDA38 ^ 0xDA27;
                    Grim30Mode.O0OoOO0OOOOO[0x6830 ^ 0x6822] = 0x682B ^ 0x6822;
                    Grim30Mode.O0OoOO0OOOOO[0x7791 ^ 0x7725] = 0xFFFF88F8 ^ 0x7725;
                    Grim30Mode.O0OoOO0OOOOO[0x9C49 ^ 0x9C15] = 0x9C34 ^ 0x9C15;
                    Grim30Mode.O0OoOO0OOOOO[0xD273 ^ 0xD376] = 0xC7C5 ^ 0xD376;
                    Grim30Mode.O0OoOO0OOOOO[0xAE8D ^ 0xAEF9] = 0xFFFF5136 ^ 0xAEF9;
                    Grim30Mode.O0OoOO0OOOOO[0x416F ^ 0x4165] = 0xFFFFBE9A ^ 0x4165;
                    n3 = -814242691;
                    continue block94;
                }
                case -814242691: {
                    Grim30Mode.O0OoOO0OOOOO[0x5097 ^ 0x51C2] = 0x82DC ^ 0x51C2;
                    Grim30Mode.O0OoOO0OOOOO[0x9B22 ^ 0x9B81] = 0x9BC4 ^ 0x9B81;
                    Grim30Mode.O0OoOO0OOOOO[0xD31A ^ 0xD38B] = 0xFFFF2C74 ^ 0xD38B;
                    Grim30Mode.O0OoOO0OOOOO[0x2120 ^ 0x2012] = 0xE14D ^ 0x2012;
                    Grim30Mode.O0OoOO0OOOOO[0xFD82 ^ 0xFDCD] = 0xFDCD ^ 0xFDCD;
                    Grim30Mode.O0OoOO0OOOOO[0x3135 ^ 0x31CD] = 0x826A ^ 0x31CD;
                    Grim30Mode.O0OoOO0OOOOO[0x9FE7 ^ 0x9F8F] = 0xFFFF6000 ^ 0x9F8F;
                    Grim30Mode.O0OoOO0OOOOO[0x7874 ^ 0x795B] = 0x5504 ^ 0x795B;
                    Grim30Mode.O0OoOO0OOOOO[0x7ED6 ^ 0x7F8F] = 0xC41B ^ 0x7F8F;
                    Grim30Mode.O0OoOO0OOOOO[0x10C7 ^ 0x11B6] = 0xD79E ^ 0x11B6;
                    Grim30Mode.O0OoOO0OOOOO[0xC1E5 ^ 0xC190] = 0xFFFF3E63 ^ 0xC190;
                    Grim30Mode.O0OoOO0OOOOO[0x10DA9 ^ 0x10C8E] = 0x1897E ^ 0x10C8E;
                    Grim30Mode.O0OoOO0OOOOO[0x913C ^ 0x91B3] = 0x91B0 ^ 0x91B3;
                    Grim30Mode.O0OoOO0OOOOO[0x7039 ^ 0x7036] = 0x7060 ^ 0x7036;
                    Grim30Mode.O0OoOO0OOOOO[0x9DD ^ 0x8AB] = 0x5F56 ^ 0x8AB;
                    Grim30Mode.O0OoOO0OOOOO[0x859 ^ 0x818] = 0x81B ^ 0x818;
                    Grim30Mode.O0OoOO0OOOOO[0xFF6F ^ 0xFE54] = 0xB2F0 ^ 0xFE54;
                    n3 = 1857853683;
                    continue block94;
                }
                case 1857853683: {
                    Grim30Mode.O0OoOO0OOOOO[0x10BFA ^ 0x10B72] = 0xFFFEF48D ^ 0x10B72;
                    Grim30Mode.O0OoOO0OOOOO[0x4FDE ^ 0x4EC8] = 0x501F ^ 0x4EC8;
                    Grim30Mode.O0OoOO0OOOOO[0xEEB3 ^ 0xEEC9] = 0xE90E ^ 0xEEC9;
                    Grim30Mode.O0OoOO0OOOOO[0x357C ^ 0x344C] = 0x1852 ^ 0x344C;
                    n3 = -898943516;
                    continue block94;
                }
                case -898943516: {
                    Grim30Mode.O0OoOO0OOOOO[0x105FF ^ 0x10506] = 0xFFFE4926 ^ 0x10506;
                    Grim30Mode.O0OoOO0OOOOO[0x4996 ^ 0x4810] = 0x5122 ^ 0x4810;
                    Grim30Mode.O0OoOO0OOOOO[0x5BB9 ^ 0x5AFA] = 0x7D7A ^ 0x5AFA;
                    Grim30Mode.O0OoOO0OOOOO[0x986 ^ 0x91A] = 0x919 ^ 0x91A;
                    Grim30Mode.O0OoOO0OOOOO[0x930F ^ 0x922E] = 0x9316 ^ 0x922E;
                    Grim30Mode.O0OoOO0OOOOO[0x662B ^ 0x666C] = 0x667D ^ 0x666C;
                    Grim30Mode.O0OoOO0OOOOO[0x103D8 ^ 0x102B9] = 0x1AE33 ^ 0x102B9;
                    Grim30Mode.O0OoOO0OOOOO[0x8D21 ^ 0x8DB2] = 0x8DEB ^ 0x8DB2;
                    n3 = 623906842;
                    continue block94;
                }
                case 623906842: {
                    Grim30Mode.O0OoOO0OOOOO[0xEE ^ 3] = 0xFFFF93F9 ^ 3;
                    Grim30Mode.O0OoOO0OOOOO[0xA594 ^ 0xA54E] = 0xB50E ^ 0xA54E;
                    Grim30Mode.O0OoOO0OOOOO[0x5291 ^ 0x5223] = 0xFFFFAD9F ^ 0x5223;
                    n3 = -1159138240;
                    continue block94;
                }
                case -1159138240: {
                    Grim30Mode.O0OoOO0OOOOO[0x5A7 ^ 0x5A6] = 0x5AB ^ 0x5A6;
                    Grim30Mode.O0OoOO0OOOOO[0x347A ^ 0x34F9] = 0x3587 ^ 0x34F9;
                    Grim30Mode.O0OoOO0OOOOO[0x9C09 ^ 0x9D76] = 0x93E2 ^ 0x9D76;
                    n3 = -1049536645;
                    continue block94;
                }
                case -1049536645: {
                    Grim30Mode.O0OoOO0OOOOO[0xAE49 ^ 0xAF46] = 0x92CB ^ 0xAF46;
                    Grim30Mode.O0OoOO0OOOOO[0xA3F0 ^ 0xA27E] = 0xA27E ^ 0xA27E;
                    Grim30Mode.O0OoOO0OOOOO[0xD3D8 ^ 0xD3DD] = 0xFFFF2C01 ^ 0xD3DD;
                    Grim30Mode.O0OoOO0OOOOO[0x14B1 ^ 0x15AE] = 0x1496 ^ 0x15AE;
                    Grim30Mode.O0OoOO0OOOOO[0x10F2D ^ 0x10F17] = 0x2083A527 ^ 0x10F17;
                    Grim30Mode.O0OoOO0OOOOO[0xEE45 ^ 0xEE43] = 0xFFFF11BC ^ 0xEE43;
                    Grim30Mode.O0OoOO0OOOOO[0x6B0A ^ 0x6A60] = 0x24F8 ^ 0x6A60;
                    Grim30Mode.O0OoOO0OOOOO[0x3568 ^ 0x3414] = 0xC3C5 ^ 0x3414;
                    Grim30Mode.O0OoOO0OOOOO[0x7DD6 ^ 0x7D39] = 0x9516 ^ 0x7D39;
                    Grim30Mode.O0OoOO0OOOOO[0xA217 ^ 0xA224] = 0xD2FD8DF7 ^ 0xA224;
                    n3 = -1618556579;
                    continue block94;
                }
                case -1618556579: {
                    Grim30Mode.O0OoOO0OOOOO[0x6B35 ^ 0x6B1A] = 0xEEEE85F5 ^ 0x6B1A;
                    Grim30Mode.O0OoOO0OOOOO[0xF94 ^ 0xEE0] = 0xFFFF9696 ^ 0xEE0;
                    Grim30Mode.O0OoOO0OOOOO[0xE3A4 ^ 0xE288] = 0xFFFE1E36 ^ 0xE288;
                    Grim30Mode.O0OoOO0OOOOO[0x6477 ^ 0x64CB] = 0x6EB38098 ^ 0x64CB;
                    n3 = 1681772539;
                    continue block94;
                }
                case 1681772539: {
                    Grim30Mode.O0OoOO0OOOOO[0x311F ^ 0x304B] = 0xE36D ^ 0x304B;
                    Grim30Mode.O0OoOO0OOOOO[0x779C ^ 0x77E4] = 0x77E9 ^ 0x77E4;
                    Grim30Mode.O0OoOO0OOOOO[0xEBAF ^ 0xEB1C] = 0xFFFF14E3 ^ 0xEB1C;
                    Grim30Mode.O0OoOO0OOOOO[0x24FF ^ 0x24F1] = 0xFFFFDB34 ^ 0x24F1;
                    Grim30Mode.O0OoOO0OOOOO[0xEC1F ^ 0xECAE] = 0xECF7 ^ 0xECAE;
                    Grim30Mode.O0OoOO0OOOOO[0xA72 ^ 0xAD3] = 0xADE ^ 0xAD3;
                    n3 = 1160091297;
                    continue block94;
                }
                case 1160091297: {
                    Grim30Mode.O0OoOO0OOOOO[0xC7AD ^ 0xC753] = 0x70DF ^ 0xC753;
                    Grim30Mode.O0OoOO0OOOOO[0x6368 ^ 0x6373] = 0x6360 ^ 0x6373;
                    Grim30Mode.O0OoOO0OOOOO[0x5A59 ^ 0x5A98] = 0x5AA7 ^ 0x5A98;
                    Grim30Mode.O0OoOO0OOOOO[0x1508 ^ 0x15B7] = 0x1817 ^ 0x15B7;
                    Grim30Mode.O0OoOO0OOOOO[0x5E50 ^ 0x5EDB] = 0x5ECA ^ 0x5EDB;
                    n3 = -1970273684;
                    continue block94;
                }
                case -1970273684: {
                    Grim30Mode.O0OoOO0OOOOO[0x5A69 ^ 0x5A60] = 0xFFFFA5FA ^ 0x5A60;
                    Grim30Mode.O0OoOO0OOOOO[0x33CE ^ 0x3339] = 0x8093 ^ 0x3339;
                    Grim30Mode.O0OoOO0OOOOO[0x3624 ^ 0x37A9] = 0x37A8 ^ 0x37A9;
                    return;
                }
                default: {
                    Grim30Mode.O0OoOO0OOOOO[0x49E7 ^ 0x4913] = 0x933A ^ 0x4913;
                    Grim30Mode.O0OoOO0OOOOO[0x5A0F ^ 0x5B62] = 0x15FA ^ 0x5B62;
                    Grim30Mode.O0OoOO0OOOOO[0xF13F ^ 0xF134] = 0xFFFF0ECB ^ 0xF134;
                    n3 = -186713363;
                    continue block94;
                }
                case -186713363: {
                    Grim30Mode.O0OoOO0OOOOO[0x8C63 ^ 0x8D4D] = 0xA104 ^ 0x8D4D;
                    Grim30Mode.O0OoOO0OOOOO[0x657 ^ 0x70D] = 0xF37B ^ 0x70D;
                    Grim30Mode.O0OoOO0OOOOO[0x7CA3 ^ 0x7C36] = 0x7C23 ^ 0x7C36;
                    Grim30Mode.O0OoOO0OOOOO[0x10B37 ^ 0x10A0B] = 0x146BA ^ 0x10A0B;
                    Grim30Mode.O0OoOO0OOOOO[0x781C ^ 0x792B] = 0xB4C0 ^ 0x792B;
                    Grim30Mode.O0OoOO0OOOOO[0xE60A ^ 0xE6AC] = 0x60A9694B ^ 0xE6AC;
                    Grim30Mode.O0OoOO0OOOOO[0x10129 ^ 0x101B7] = 0xFFFEFE4C ^ 0x101B7;
                    Grim30Mode.O0OoOO0OOOOO[0x567F ^ 0x5663] = 0xD8FDD9D4 ^ 0x5663;
                    Grim30Mode.O0OoOO0OOOOO[0xF9B1 ^ 0xF960] = 0xFFFF4D49 ^ 0xF960;
                    Grim30Mode.O0OoOO0OOOOO[0xAFAA ^ 0xAFEA] = 0xA5A5094F ^ 0xAFEA;
                    Grim30Mode.O0OoOO0OOOOO[0x3FE3 ^ 0x3ED2] = 0x128D ^ 0x3ED2;
                    Grim30Mode.O0OoOO0OOOOO[0xF08B ^ 0xF0F0] = 0xF0D9 ^ 0xF0F0;
                    n3 = 33482045;
                    continue block94;
                }
                case 33482045: {
                    Grim30Mode.O0OoOO0OOOOO[0xADFF ^ 0xACA2] = 0x58C4 ^ 0xACA2;
                    Grim30Mode.O0OoOO0OOOOO[0x492F ^ 0x4914] = 0xFFFFB6D3 ^ 0x4914;
                    Grim30Mode.O0OoOO0OOOOO[0xA28B ^ 0xA381] = 0xFDC7 ^ 0xA381;
                    Grim30Mode.O0OoOO0OOOOO[0x6E67 ^ 0x6EA1] = 0x941 ^ 0x6EA1;
                    n3 = 517371258;
                    continue block94;
                }
                case 517371258: {
                    Grim30Mode.O0OoOO0OOOOO[0xD7F3 ^ 0xD7A9] = 0x6C9BF106 ^ 0xD7A9;
                    Grim30Mode.O0OoOO0OOOOO[0xB6F6 ^ 0xB62F] = 0xFFFF59D4 ^ 0xB62F;
                    n3 = -993330341;
                    continue block94;
                }
                case -993330341: {
                    Grim30Mode.O0OoOO0OOOOO[0x9CB9 ^ 0x9CEB] = 0x9CEB ^ 0x9CEB;
                    Grim30Mode.O0OoOO0OOOOO[0x456B ^ 0x45FC] = 0x45F9 ^ 0x45FC;
                    Grim30Mode.O0OoOO0OOOOO[0x7F1C ^ 0x7FC4] = 0x6F84 ^ 0x7FC4;
                    Grim30Mode.O0OoOO0OOOOO[0x1E3B ^ 0x1E26] = 0x1E4B ^ 0x1E26;
                    Grim30Mode.O0OoOO0OOOOO[0x311A ^ 0x3179] = 0x3172 ^ 0x3179;
                    Grim30Mode.O0OoOO0OOOOO[0x486E ^ 0x484A] = 0xFFFFB7DD ^ 0x484A;
                    Grim30Mode.O0OoOO0OOOOO[0x94DB ^ 0x95D7] = 0xCBFE ^ 0x95D7;
                    Grim30Mode.O0OoOO0OOOOO[0x4942 ^ 0x482C] = 0x8E09 ^ 0x482C;
                    n3 = -1952803417;
                    continue block94;
                }
                case -1952803417: {
                    Grim30Mode.O0OoOO0OOOOO[0x4D73 ^ 0x4C10] = 0x3B41 ^ 0x4C10;
                    Grim30Mode.O0OoOO0OOOOO[0x102B1 ^ 0x103E7] = 0x1B874 ^ 0x103E7;
                    Grim30Mode.O0OoOO0OOOOO[0x8382 ^ 0x83F0] = 0x83C1 ^ 0x83F0;
                    Grim30Mode.O0OoOO0OOOOO[0xB693 ^ 0xB6B9] = 0xFFFF493E ^ 0xB6B9;
                    Grim30Mode.O0OoOO0OOOOO[0xE1BB ^ 0xE152] = 0xFFFF644C ^ 0xE152;
                    Grim30Mode.O0OoOO0OOOOO[0xD327 ^ 0xD213] = 0x133E ^ 0xD213;
                    Grim30Mode.O0OoOO0OOOOO[0x25F7 ^ 0x259D] = 0x940995B8 ^ 0x259D;
                    n3 = -230083807;
                    continue block94;
                }
                case -230083807: {
                    Grim30Mode.O0OoOO0OOOOO[0x25EC ^ 0x25BC] = 0x25BC ^ 0x25BC;
                    Grim30Mode.O0OoOO0OOOOO[0xE9D4 ^ 0xE97C] = 0xE919 ^ 0xE97C;
                    n3 = -988847440;
                    continue block94;
                }
                case -988847440: {
                    Grim30Mode.O0OoOO0OOOOO[0x363A ^ 0x3765] = 0x9BEF ^ 0x3765;
                    Grim30Mode.O0OoOO0OOOOO[0x4357 ^ 0x4353] = 0x435E ^ 0x4353;
                    Grim30Mode.O0OoOO0OOOOO[0x8C67 ^ 0x8D0F] = 0xF132 ^ 0x8D0F;
                    n3 = -1911465662;
                    continue block94;
                }
                case -1911465662: {
                    Grim30Mode.O0OoOO0OOOOO[0x8629 ^ 0x86A8] = 0x86A7 ^ 0x86A8;
                    Grim30Mode.O0OoOO0OOOOO[0x5434 ^ 0x542D] = 0xFFFFABC0 ^ 0x542D;
                    Grim30Mode.O0OoOO0OOOOO[0x16AC ^ 0x16D2] = 0xEFDFA9AD ^ 0x16D2;
                    Grim30Mode.O0OoOO0OOOOO[0x6DA8 ^ 0x6CDB] = 0xB2A ^ 0x6CDB;
                    Grim30Mode.O0OoOO0OOOOO[0x2D65 ^ 0x2DEB] = 0x2DF6 ^ 0x2DEB;
                    Grim30Mode.O0OoOO0OOOOO[0xA9F9 ^ 0xA957] = 0xA92E ^ 0xA957;
                    n3 = 500722018;
                    continue block94;
                }
                case 500722018: {
                    Grim30Mode.O0OoOO0OOOOO[0xB6A8 ^ 0xB611] = 0xB610 ^ 0xB611;
                    n3 = -113677872;
                    continue block94;
                }
                case -113677872: {
                    Grim30Mode.O0OoOO0OOOOO[0x3D3F ^ 0x3D0E] = 0x3D0F ^ 0x3D0E;
                    Grim30Mode.O0OoOO0OOOOO[0x9B58 ^ 0x9A17] = 0x9DD0 ^ 0x9A17;
                    n3 = -1842254129;
                    continue block94;
                }
                case -1842254129: {
                    Grim30Mode.O0OoOO0OOOOO[0x1176 ^ 0x1196] = 0x17B3 ^ 0x1196;
                    n3 = 1033233740;
                    continue block94;
                }
                case 1033233740: {
                    Grim30Mode.O0OoOO0OOOOO[0x653E ^ 0x6568] = 0x5AEB ^ 0x6568;
                    Grim30Mode.O0OoOO0OOOOO[0xBD80 ^ 0xBDB0] = 0xBDAF ^ 0xBDB0;
                    Grim30Mode.O0OoOO0OOOOO[0xB26 ^ 0xA42] = 0x7D69 ^ 0xA42;
                    n3 = -763504449;
                    continue block94;
                }
                case -763504449: {
                    Grim30Mode.O0OoOO0OOOOO[0xE728 ^ 0xE6AB] = 0xA428 ^ 0xE6AB;
                    n3 = 2004941884;
                    continue block94;
                }
                case 2004941884: {
                    Grim30Mode.O0OoOO0OOOOO[0x79B5 ^ 0x78CF] = 0x8F29 ^ 0x78CF;
                    Grim30Mode.O0OoOO0OOOOO[0x10883 ^ 0x1084B] = 0xF65 ^ 0x1084B;
                    n3 = 446865740;
                    continue block94;
                }
                case 446865740: {
                    Grim30Mode.O0OoOO0OOOOO[0x4762 ^ 0x47A0] = 0x2593B13B ^ 0x47A0;
                    Grim30Mode.O0OoOO0OOOOO[0x755A ^ 0x7576] = 0xFFFF8A89 ^ 0x7576;
                    Grim30Mode.O0OoOO0OOOOO[0x9D66 ^ 0x9C66] = 0x3B9 ^ 0x9C66;
                    n3 = -1758880422;
                    continue block94;
                }
                case -1758880422: {
                    Grim30Mode.O0OoOO0OOOOO[0x5C11 ^ 0x5D2F] = 0xF87D ^ 0x5D2F;
                    Grim30Mode.O0OoOO0OOOOO[0x43D6 ^ 0x43E8] = 0x43FD ^ 0x43E8;
                    Grim30Mode.O0OoOO0OOOOO[0x1D34 ^ 0x1D49] = 0x1D56 ^ 0x1D49;
                    n3 = 1009827637;
                    continue block94;
                }
                case 1009827637: {
                    Grim30Mode.O0OoOO0OOOOO[0x1793 ^ 0x169D] = 0x2B0A ^ 0x169D;
                    Grim30Mode.O0OoOO0OOOOO[0xCFF ^ 0xC0C] = 0xD625 ^ 0xC0C;
                    Grim30Mode.O0OoOO0OOOOO[0x9CEE ^ 0x9DAC] = 0xBA2A ^ 0x9DAC;
                    Grim30Mode.O0OoOO0OOOOO[0x64EA ^ 0x646D] = 0xFFF89B92 ^ 0x646D;
                    n3 = -348971628;
                    continue block94;
                }
                case -348971628: 
            }
            Grim30Mode.O0OoOO0OOOOO[0xDB15 ^ 0xDB30] = 0xFFFF2487 ^ 0xDB30;
            Grim30Mode.O0OoOO0OOOOO[0x4909 ^ 0x4996] = 0x49B3 ^ 0x4996;
            Grim30Mode.O0OoOO0OOOOO[0x2EA9 ^ 0x2E84] = 0x2B1D8AE5 ^ 0x2E84;
            Grim30Mode.O0OoOO0OOOOO[0xAFD4 ^ 0xAEC8] = 0x1B59 ^ 0xAEC8;
            n3 = -2056029079;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        long l2;
        int n2 = 46216683;
        if (n2 != n2) {
        }
        if ((n2 = 595285111) != n2) {
        }
        Object[] objectArray = new Object[20];
        long[] lArray = new long[20];
        Grim30Mode.q0OOOoo00o0();
        q0oOOoOo0O00O = new String[O0OoOO0OOOOO[56]];
        oO00O0OO0ooO = new String[O0OoOO0OOOOO[57]];
        int n3 = O0OoOO0OOOOO[58] ^ O0OoOO0OOOOO[59];
        o0Oo000O0oO = new Object[((n3 << O0OoOO0OOOOO[60] | n3 >>> O0OoOO0OOOOO[61]) + O0OoOO0OOOOO[62]) * O0OoOO0OOOOO[63]];
        int n4 = O0OoOO0OOOOO[64];
        lArray[11] = l2 = 2850825122976755383L;
        int n5 = O0OoOO0OOOOO[70];
        long l3 = lArray[11];
        int n6 = -O0OoOO0OOOOO[74] ^ O0OoOO0OOOOO[75] ^ O0OoOO0OOOOO[76];
        lArray[11] = l2 = l3 ^ ((long)(((n4 >>> O0OoOO0OOOOO[65] | n4 << O0OoOO0OOOOO[66]) - O0OoOO0OOOOO[67]) * O0OoOO0OOOOO[68] - O0OoOO0OOOOO[69]) << -((n5 << O0OoOO0OOOOO[71] | n5 >>> O0OoOO0OOOOO[72]) * O0OoOO0OOOOO[73]) ^ l3) & -1L << (n6 << O0OoOO0OOOOO[77] | n6 >>> O0OoOO0OOOOO[78]);
        String string = oO00O0OO0ooO[O0OoOO0OOOOO[79]];
        if (string == null) {
            int n7 = O0OoOO0OOOOO[80];
            String string2 = q0oOOoOo0O00O[O0OoOO0OOOOO[81]];
            if (string2 == null) {
                objectArray[5] = "\u379c\u308c\u307c\u37a4\u36e4\u36a4\u374c\u3654\u3084\u36b4\u3704\u363c\u3834\u3824\u374c\u3644\u36fc\u363c\u3644\u365c\u362c\u3784\u37a4\u312c\u369c\u310c\u37cc\u36f4\u362c\u30ec\u38c4\u36f4\u37fc\u374c\u37dc\u36c4\u37bc\u36dc\u378c\u36c4\u37dc\u36b4\u3764\u315c".toCharArray();
                lArray[2] = l2 = (long)O0OoOO0OOOOO[82];
                while ((int)lArray[2] < ((char[])objectArray[5]).length) {
                    char[] cArray = (char[])objectArray[5];
                    int n8 = (int)lArray[2];
                    char c2 = cArray[n8];
                    cArray[n8] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(c2 << O0OoOO0OOOOO[83] | c2 >>> O0OoOO0OOOOO[84]) - n8) + O0OoOO0OOOOO[85]) ^ O0OoOO0OOOOO[86]) + n8) - O0OoOO0OOOOO[87]))) + n8) - n8) + O0OoOO0OOOOO[88]) ^ n8);
                    lArray[2] = l2 = (long)((int)lArray[2] + 1);
                }
                string2 = Grim30Mode.q0oOOoOo0O00O[Grim30Mode.O0OoOO0OOOOO[89]] = new String((char[])objectArray[5]);
            }
            string = Grim30Mode.o0Oo000O0oO(n7, string2);
        }
        objectArray[7] = string.toCharArray();
        lArray[0] = l2 = 2844853091393840732L;
        long l4 = lArray[0];
        int n9 = O0OoOO0OOOOO[95];
        int n10 = n9 << O0OoOO0OOOOO[96] | n9 >>> O0OoOO0OOOOO[97];
        lArray[0] = l2 = l4 ^ ((long)((O0OoOO0OOOOO[90] ^ O0OoOO0OOOOO[91]) * O0OoOO0OOOOO[92]) << -O0OoOO0OOOOO[93] + O0OoOO0OOOOO[94] ^ l4) & -1L << (n10 << O0OoOO0OOOOO[98] | n10 >>> O0OoOO0OOOOO[99]) - O0OoOO0OOOOO[100];
        lArray[13] = l2 = -2391655689517941159L;
        int n11 = O0OoOO0OOOOO[106];
        long l5 = lArray[13];
        int n12 = O0OoOO0OOOOO[110];
        lArray[13] = l2 = l5 ^ ((long)((O0OoOO0OOOOO[101] * O0OoOO0OOOOO[102] ^ O0OoOO0OOOOO[103]) * O0OoOO0OOOOO[104] * O0OoOO0OOOOO[105]) << (n11 >>> O0OoOO0OOOOO[107] | n11 << O0OoOO0OOOOO[108]) * O0OoOO0OOOOO[109] ^ l5) & -1L << ((n12 << O0OoOO0OOOOO[111] | n12 >>> O0OoOO0OOOOO[112]) ^ O0OoOO0OOOOO[113]) + O0OoOO0OOOOO[114];
        boolean bl2 = true;
        while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                if ((int)(lArray[6] >>> (O0OoOO0OOOOO[166] ^ O0OoOO0OOOOO[167]) * O0OoOO0OOOOO[168] * O0OoOO0OOOOO[169] * O0OoOO0OOOOO[170]) < (int)lArray[0]) {
                    ((char[])objectArray[10])[(int)(lArray[6] >>> Grim30Mode.O0OoOO0OOOOO[171] * Grim30Mode.O0OoOO0OOOOO[172] * Grim30Mode.O0OoOO0OOOOO[173])] = ((char[])objectArray[7])[(int)(lArray[13] >>> (O0OoOO0OOOOO[174] ^ O0OoOO0OOOOO[175] ^ O0OoOO0OOOOO[176] ^ O0OoOO0OOOOO[177])) + (int)(lArray[6] >>> (O0OoOO0OOOOO[178] ^ O0OoOO0OOOOO[179]) + O0OoOO0OOOOO[180])];
                    lArray[6] = l2 = lArray[6] + 0x100000000L;
                    continue;
                }
                lArray[11] = l2 = lArray[11] + 0x100000000L;
                Grim30Mode.o0Oo000O0oO[(int)(lArray[11] >>> -(Grim30Mode.O0OoOO0OOOOO[181] ^ Grim30Mode.O0OoOO0OOOOO[182] ^ Grim30Mode.O0OoOO0OOOOO[183]))] = new String((char[])objectArray[10]);
                int n13 = O0OoOO0OOOOO[184];
                long l6 = lArray[13];
                lArray[13] = l2 = l6 ^ ((long)((int)(lArray[13] >>> -((n13 >>> O0OoOO0OOOOO[185] | n13 << O0OoOO0OOOOO[186]) ^ O0OoOO0OOOOO[187]) * O0OoOO0OOOOO[188]) + (int)lArray[0]) << (O0OoOO0OOOOO[189] ^ O0OoOO0OOOOO[190]) ^ l6) & -1L << (O0OoOO0OOOOO[191] ^ O0OoOO0OOOOO[192] ^ O0OoOO0OOOOO[193]) * O0OoOO0OOOOO[194];
            }
            int n14 = O0OoOO0OOOOO[118];
            if ((int)(lArray[13] >>> (O0OoOO0OOOOO[115] ^ O0OoOO0OOOOO[116]) * O0OoOO0OOOOO[117]) >= (int)(lArray[0] >>> (n14 >>> O0OoOO0OOOOO[119] | n14 << O0OoOO0OOOOO[120]) - O0OoOO0OOOOO[121])) {
                return;
            }
            int n15 = O0OoOO0OOOOO[122] + O0OoOO0OOOOO[123];
            lArray[13] = l2 = lArray[13] + 0x100000000L;
            long l7 = lArray[13];
            int n16 = O0OoOO0OOOOO[127] - O0OoOO0OOOOO[128];
            lArray[13] = l2 = l7 ^ ((long)((char[])objectArray[7])[(int)(lArray[13] >>> (n15 << O0OoOO0OOOOO[124] | n15 >>> O0OoOO0OOOOO[125]) * O0OoOO0OOOOO[126])] ^ l7) & -1L >>> (n16 >>> O0OoOO0OOOOO[129] | n16 << O0OoOO0OOOOO[130]);
            lArray[13] = l2 = lArray[13] + 0x100000000L;
            long l8 = lArray[11];
            int n17 = O0OoOO0OOOOO[135] ^ O0OoOO0OOOOO[136] ^ O0OoOO0OOOOO[137];
            lArray[11] = l2 = l8 ^ ((long)((char[])objectArray[7])[(int)(lArray[13] >>> (O0OoOO0OOOOO[131] + O0OoOO0OOOOO[132] + O0OoOO0OOOOO[133]) * O0OoOO0OOOOO[134])] ^ l8) & -1L >>> (n17 >>> O0OoOO0OOOOO[138] | n17 << O0OoOO0OOOOO[139]) + O0OoOO0OOOOO[140];
            int n18 = O0OoOO0OOOOO[141];
            long l9 = lArray[0];
            int n19 = O0OoOO0OOOOO[146] + O0OoOO0OOOOO[147];
            int n20 = n19 >>> O0OoOO0OOOOO[148] | n19 << O0OoOO0OOOOO[149];
            lArray[0] = l2 = l9 ^ ((long)((int)lArray[13] << ((n18 << O0OoOO0OOOOO[142] | n18 >>> O0OoOO0OOOOO[143]) ^ O0OoOO0OOOOO[144] ^ O0OoOO0OOOOO[145]) | (int)lArray[11]) ^ l9) & -1L >>> (n20 >>> O0OoOO0OOOOO[150] | n20 << O0OoOO0OOOOO[151]);
            int n21 = 1319753477;
            objectArray[10] = new char[(int)lArray[0]];
            int n22 = O0OoOO0OOOOO[152] - O0OoOO0OOOOO[153] ^ O0OoOO0OOOOO[154];
            lArray[6] = l2 = 597799494567293701L;
            int n23 = O0OoOO0OOOOO[157] + O0OoOO0OOOOO[158] + O0OoOO0OOOOO[159];
            long l10 = lArray[6];
            lArray[6] = l2 = l10 ^ ((long)(n22 << O0OoOO0OOOOO[155] | n22 >>> O0OoOO0OOOOO[156]) << (n23 << O0OoOO0OOOOO[160] | n23 >>> O0OoOO0OOOOO[161]) ^ l10) & -1L << (O0OoOO0OOOOO[162] + O0OoOO0OOOOO[163] ^ O0OoOO0OOOOO[164]) * O0OoOO0OOOOO[165];
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ void e(ea var0) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Grim30Mode(String string, NoSlow noSlow) {
        BooleanValue booleanValue;
        int n2 = -1065370124;
        if (n2 != n2) {
            n2 = 45;
        }
        super(string, noSlow);
        int n3 = -(-O0OoOO0OOOOO[0]);
        int n4 = n3 >>> O0OoOO0OOOOO[1] | n3 << O0OoOO0OOOOO[2];
        booleanValue((String)o0Oo000O0oO[n4 >>> O0OoOO0OOOOO[3] | n4 << O0OoOO0OOOOO[4]], (Mode<?>)this, (Boolean)(-((O0OoOO0OOOOO[5] ^ O0OoOO0OOOOO[6]) * O0OoOO0OOOOO[7] ^ O0OoOO0OOOOO[8])));
        this.Nd = booleanValue;
        this.Ne = es2 -> {};
        this.Nf = this::c;
        this.Ng = this::c;
        this.Nh = moveInputEvent -> {
            int n2 = 244311911;
            if (n2 != n2) {
            }
            if (this.hV < (O0OoOO0OOOOO[43] ^ O0OoOO0OOOOO[44]) * O0OoOO0OOOOO[45]) return;
            int n3 = O0OoOO0OOOOO[46] * O0OoOO0OOOOO[47];
            if (this.hV <= -(n3 >>> O0OoOO0OOOOO[48] | n3 << O0OoOO0OOOOO[49])) return;
        };
        this.Ni = en2 -> {
            int n2 = -133533744;
            if (n2 != n2) {
            }
            if (!Grim30Mode.aER.bgK.isUsingItem()) return;
            if (!(Grim30Mode.aER.bgK.cuW > 0.0f)) return;
            int n3 = -1992952910;
            switch (n3) {
                case 311395337: {
                    return;
                }
            }
            int n4 = O0OoOO0OOOOO[38] ^ O0OoOO0OOOOO[39];
            Grim30Mode.aER.bgK.setSprinting(((n4 >>> O0OoOO0OOOOO[40] | n4 << O0OoOO0OOOOO[41]) ^ O0OoOO0OOOOO[42]) != 0);
        };
        this.Nj = Grim30Mode::e;
        this.Nk = this::c;
    }
}

