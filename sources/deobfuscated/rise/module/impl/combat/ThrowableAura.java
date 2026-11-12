/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

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
import net.minecraft.entity.r;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@ModuleInfo(aliases={"module.combat.throwableaura.name"}, description="module.combat.throwableaura.description", category=Category.COMBAT)
public class ThrowableAura
extends Module {
    public /* synthetic */ BooleanValue qy;
    @EventLink
    public /* synthetic */ Listener<PreUpdateEvent> qK;
    public /* synthetic */ BooleanValue qA;
    private static /* synthetic */ int[] ooo00oo0Ooo0;
    public /* synthetic */ BooleanValue qD;
    public /* synthetic */ BooleanValue qB;
    public /* synthetic */ NumberValue qu;
    public /* synthetic */ int qI;
    public static /* synthetic */ String[] q0oOOoOo0O00O;
    public static /* synthetic */ Object[] Oo0o00000O00;
    public /* synthetic */ boolean qJ;
    public /* synthetic */ NumberValue qv;
    public /* synthetic */ BooleanValue qz;
    public /* synthetic */ BooleanValue qx;
    public /* synthetic */ BooleanValue qE;
    public /* synthetic */ r jE;
    public static /* synthetic */ String[] O0OoOO0OOOOO;
    public /* synthetic */ BooleanValue qG;
    public static /* synthetic */ String o0Oo000O0oO;
    public /* synthetic */ NumberValue qw;
    public static /* synthetic */ Object oO00O0OO0ooO;
    public static /* synthetic */ Object[] q0OOOoo00o0;
    public /* synthetic */ NumberValue qs;
    public /* synthetic */ int qH;
    public /* synthetic */ BooleanValue qF;
    public /* synthetic */ NumberValue qt;
    public /* synthetic */ BooleanValue qC;
    private static /* synthetic */ int o0o000o0O0o0;
    private static /* synthetic */ boolean oOo00Oo0OOo0;

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
        int n2 = -929654379;
        if (n2 != n2) {
            throw new TypeNotPresentException();
        }
        ooo00oo0Ooo0 = new int[0xA7DB ^ 0xA64B];
        ThrowableAura.ooo00oo0Ooo0[0xEA22 ^ 0xEA80] = 0xEA87 ^ 0xEA80;
        ThrowableAura.ooo00oo0Ooo0[0x9289 ^ 0x92D9] = 0x9298 ^ 0x92D9;
        int n3 = 1163864678;
        block99: while (true) {
            switch (n3) {
                case -1119435462: {
                    ThrowableAura.ooo00oo0Ooo0[0xF0AD ^ 0xF001] = 0xF038 ^ 0xF001;
                    ThrowableAura.ooo00oo0Ooo0[0x8C62 ^ 0x8D27] = 0x8D34 ^ 0x8D27;
                    ThrowableAura.ooo00oo0Ooo0[0xD96C ^ 0xD9E2] = 0xD9F3 ^ 0xD9E2;
                    n3 = 661054275;
                    continue block99;
                }
                case 661054275: {
                    ThrowableAura.ooo00oo0Ooo0[0xA37B ^ 0xA3BE] = 0xA3B7 ^ 0xA3BE;
                    ThrowableAura.ooo00oo0Ooo0[0x104B5 ^ 0x10534] = 0x10534 ^ 0x10534;
                    ThrowableAura.ooo00oo0Ooo0[0xACB8 ^ 0xAC4B] = 0xAC50 ^ 0xAC4B;
                    ThrowableAura.ooo00oo0Ooo0[0xCECE ^ 0xCFFD] = 0xFFFF3060 ^ 0xCFFD;
                    ThrowableAura.ooo00oo0Ooo0[0xEA25 ^ 0xEB2A] = 0xEB5C ^ 0xEB2A;
                    ThrowableAura.ooo00oo0Ooo0[0x257C ^ 0x2557] = 0xFFF0AAA8 ^ 0x2557;
                    ThrowableAura.ooo00oo0Ooo0[0xE089 ^ 0xE076] = 0x4F207484 ^ 0xE076;
                    ThrowableAura.ooo00oo0Ooo0[0xB9E ^ 0xB19] = 0xB19 ^ 0xB19;
                    ThrowableAura.ooo00oo0Ooo0[0x6F5F ^ 0x6F12] = 0x914C74BF ^ 0x6F12;
                    n3 = 507491703;
                    continue block99;
                }
                case 507491703: {
                    ThrowableAura.ooo00oo0Ooo0[0xF107 ^ 0xF1B4] = 0x5555A4E0 ^ 0xF1B4;
                    ThrowableAura.ooo00oo0Ooo0[0xF250 ^ 0xF236] = 0xFFFF0D8F ^ 0xF236;
                    ThrowableAura.ooo00oo0Ooo0[0x81C3 ^ 0x817C] = 0x817D ^ 0x817C;
                    ThrowableAura.ooo00oo0Ooo0[0xA473 ^ 0xA487] = 0xA4F2 ^ 0xA487;
                    ThrowableAura.ooo00oo0Ooo0[0xFEE ^ 0xF08] = 0xFFFFF09D ^ 0xF08;
                    ThrowableAura.ooo00oo0Ooo0[0x4E76 ^ 0x4E1B] = 0xFFFFB1E4 ^ 0x4E1B;
                    n3 = -371441597;
                    continue block99;
                }
                case -371441597: {
                    ThrowableAura.ooo00oo0Ooo0[0xD0EE ^ 0xD09E] = 0xFFFF2F61 ^ 0xD09E;
                    ThrowableAura.ooo00oo0Ooo0[0xF26E ^ 0xF356] = 0xF35F ^ 0xF356;
                    ThrowableAura.ooo00oo0Ooo0[0xE5FA ^ 0xE4FF] = 0xE4FF ^ 0xE4FF;
                    n3 = 1342997291;
                    continue block99;
                }
                case 1342997291: {
                    ThrowableAura.ooo00oo0Ooo0[0xF521 ^ 0xF5DC] = 0xF5D9 ^ 0xF5DC;
                    ThrowableAura.ooo00oo0Ooo0[0x105B9 ^ 0x10574] = 0x1057B ^ 0x10574;
                    n3 = -1114884501;
                    continue block99;
                }
                case -1114884501: {
                    ThrowableAura.ooo00oo0Ooo0[0xE06A ^ 0xE100] = 0xE11D ^ 0xE100;
                    ThrowableAura.ooo00oo0Ooo0[0x10310 ^ 0x10332] = 0x10333 ^ 0x10332;
                    ThrowableAura.ooo00oo0Ooo0[0x10F2 ^ 0x1085] = 0x108C ^ 0x1085;
                    n3 = -1636969276;
                    continue block99;
                }
                case -1636969276: {
                    ThrowableAura.ooo00oo0Ooo0[0xE65F ^ 0xE66E] = 0xE673 ^ 0xE66E;
                    ThrowableAura.ooo00oo0Ooo0[0x7600 ^ 0x7688] = 0xFFFF891B ^ 0x7688;
                    ThrowableAura.ooo00oo0Ooo0[0x8E14 ^ 0x8F3C] = 0xFFFF70EF ^ 0x8F3C;
                    ThrowableAura.ooo00oo0Ooo0[0x4A15 ^ 0x4AB8] = 0x4AAD ^ 0x4AB8;
                    ThrowableAura.ooo00oo0Ooo0[0x3A01 ^ 0x3AF3] = 0x3AF6 ^ 0x3AF3;
                    ThrowableAura.ooo00oo0Ooo0[0xCEB5 ^ 0xCE5A] = 0xCE5A ^ 0xCE5A;
                    n3 = -83840608;
                    continue block99;
                }
                case -83840608: {
                    ThrowableAura.ooo00oo0Ooo0[0x594 ^ 0x4D2] = 0x4DF ^ 0x4D2;
                    n3 = 2061316083;
                    continue block99;
                }
                case 2061316083: {
                    ThrowableAura.ooo00oo0Ooo0[0xE5F9 ^ 0xE4A5] = 0xE4B0 ^ 0xE4A5;
                    ThrowableAura.ooo00oo0Ooo0[0xDD50 ^ 0xDC3D] = 0xDC5A ^ 0xDC3D;
                    ThrowableAura.ooo00oo0Ooo0[0x5872 ^ 0x5919] = 0x591A ^ 0x5919;
                    ThrowableAura.ooo00oo0Ooo0[0x100EB ^ 0x10074] = 0x97B52599 ^ 0x10074;
                    ThrowableAura.ooo00oo0Ooo0[0xB692 ^ 0xB7F5] = 0xFFFF4802 ^ 0xB7F5;
                    n3 = 2052498167;
                    continue block99;
                }
                case 2052498167: {
                    ThrowableAura.ooo00oo0Ooo0[0x960C ^ 0x9690] = 0xC0FC9951 ^ 0x9690;
                    ThrowableAura.ooo00oo0Ooo0[0xE0DF ^ 0xE1CD] = 0xE1B7 ^ 0xE1CD;
                    ThrowableAura.ooo00oo0Ooo0[0xCB13 ^ 0xCB04] = 0xCB4D ^ 0xCB04;
                    n3 = 713150280;
                    continue block99;
                }
                case 713150280: {
                    ThrowableAura.ooo00oo0Ooo0[0x36A2 ^ 0x3698] = 0x3689 ^ 0x3698;
                    ThrowableAura.ooo00oo0Ooo0[0xAE1F ^ 0xAE27] = 0xFFFF51D8 ^ 0xAE27;
                    ThrowableAura.ooo00oo0Ooo0[0xD4F ^ 0xD48] = 0xD49 ^ 0xD48;
                    ThrowableAura.ooo00oo0Ooo0[0x1ABD ^ 0x1BB4] = 0xB08D26E6 ^ 0x1BB4;
                    ThrowableAura.ooo00oo0Ooo0[0xC8DC ^ 0xC849] = 0xD343D31E ^ 0xC849;
                    ThrowableAura.ooo00oo0Ooo0[0xFA92 ^ 0xFA46] = 0x40A584F3 ^ 0xFA46;
                    n3 = -746367402;
                    continue block99;
                }
                case -746367402: {
                    ThrowableAura.ooo00oo0Ooo0[0x524B ^ 0x531D] = 0x5308 ^ 0x531D;
                    n3 = -938465375;
                    continue block99;
                }
                case -938465375: {
                    ThrowableAura.ooo00oo0Ooo0[0x4FAC ^ 0x4F21] = 0xFFFFB096 ^ 0x4F21;
                    ThrowableAura.ooo00oo0Ooo0[0xA5C4 ^ 0xA532] = 0xA532 ^ 0xA532;
                    n3 = -1313025049;
                    continue block99;
                }
                case -1313025049: {
                    ThrowableAura.ooo00oo0Ooo0[0x9F6F ^ 0x9F33] = 0x1020DFB2 ^ 0x9F33;
                    n3 = -980232057;
                    continue block99;
                }
                case -980232057: {
                    ThrowableAura.ooo00oo0Ooo0[0x85AE ^ 0x84D2] = 0x84C9 ^ 0x84D2;
                    ThrowableAura.ooo00oo0Ooo0[0x965F ^ 0x961B] = 0x9604 ^ 0x961B;
                    n3 = 527222032;
                    continue block99;
                }
                case 527222032: {
                    ThrowableAura.ooo00oo0Ooo0[0x1EAA ^ 0x1EB1] = 0xFFFFE106 ^ 0x1EB1;
                    ThrowableAura.ooo00oo0Ooo0[0xDD1B ^ 0xDC9F] = 0xDC96 ^ 0xDC9F;
                    ThrowableAura.ooo00oo0Ooo0[0xE43B ^ 0xE4C3] = 0xE4FC ^ 0xE4C3;
                    ThrowableAura.ooo00oo0Ooo0[0x8689 ^ 0x87A5] = 0xFFFF5DBF ^ 0x87A5;
                    ThrowableAura.ooo00oo0Ooo0[0xF403 ^ 0xF528] = 0xFFFF0AA5 ^ 0xF528;
                    ThrowableAura.ooo00oo0Ooo0[0x45E5 ^ 0x45AE] = 0xFFFFBA47 ^ 0x45AE;
                    ThrowableAura.ooo00oo0Ooo0[0x52CF ^ 0x5398] = 0xFFFFAC09 ^ 0x5398;
                    n3 = -310614606;
                    continue block99;
                }
                case -310614606: {
                    ThrowableAura.ooo00oo0Ooo0[0x8507 ^ 0x8512] = 0xFFFF7AE9 ^ 0x8512;
                    ThrowableAura.ooo00oo0Ooo0[0x604C ^ 0x60DD] = 0xFFFF9F56 ^ 0x60DD;
                    ThrowableAura.ooo00oo0Ooo0[0xC6CD ^ 0xC7DC] = 0xFFFF3823 ^ 0xC7DC;
                    ThrowableAura.ooo00oo0Ooo0[0x5FE0 ^ 0x5FA3] = 0x5FA2 ^ 0x5FA3;
                    ThrowableAura.ooo00oo0Ooo0[0xC9C5 ^ 0xC910] = 0x37110 ^ 0xC910;
                    ThrowableAura.ooo00oo0Ooo0[0x284F ^ 0x2821] = 0xFFFFD7CF ^ 0x2821;
                    n3 = 1183825482;
                    continue block99;
                }
                case 1183825482: {
                    ThrowableAura.ooo00oo0Ooo0[0x638B ^ 0x638A] = 0xFFFF9C43 ^ 0x638A;
                    ThrowableAura.ooo00oo0Ooo0[0x9566 ^ 0x95BA] = 0xFFFF6A75 ^ 0x95BA;
                    ThrowableAura.ooo00oo0Ooo0[0x3371 ^ 0x3350] = 0x334F ^ 0x3350;
                    n3 = -1663296092;
                    continue block99;
                }
                case -1663296092: {
                    ThrowableAura.ooo00oo0Ooo0[0xB109 ^ 0xB1C8] = 0xB1DF ^ 0xB1C8;
                    ThrowableAura.ooo00oo0Ooo0[0xA742 ^ 0xA7C4] = 0xFFFF583B ^ 0xA7C4;
                    ThrowableAura.ooo00oo0Ooo0[0xCEDB ^ 0xCEC1] = 0xEECE ^ 0xCEC1;
                    ThrowableAura.ooo00oo0Ooo0[0x733 ^ 0x7F7] = 0x7E0 ^ 0x7F7;
                    ThrowableAura.ooo00oo0Ooo0[0x9424 ^ 0x9462] = 0x9479 ^ 0x9462;
                    n3 = -1104456568;
                    continue block99;
                }
                case -1104456568: {
                    ThrowableAura.ooo00oo0Ooo0[0x86A0 ^ 0x8639] = 0xFFFF79BD ^ 0x8639;
                    n3 = 1382983401;
                    continue block99;
                }
                case 1382983401: {
                    ThrowableAura.ooo00oo0Ooo0[0xCFA8 ^ 0xCFF2] = 0xCFD3 ^ 0xCFF2;
                    n3 = -778669850;
                    continue block99;
                }
                case -778669850: {
                    ThrowableAura.ooo00oo0Ooo0[0x1C12 ^ 0x1D94] = 0xFFFFE26B ^ 0x1D94;
                    ThrowableAura.ooo00oo0Ooo0[0x9696 ^ 0x97C8] = 0x97E1 ^ 0x97C8;
                    ThrowableAura.ooo00oo0Ooo0[0xAD39 ^ 0xAC4B] = 0xAC4A ^ 0xAC4B;
                    n3 = 958300742;
                    continue block99;
                }
                case 958300742: {
                    ThrowableAura.ooo00oo0Ooo0[0x44FC ^ 0x4437] = 0x4452 ^ 0x4437;
                    n3 = 1257933126;
                    continue block99;
                }
                case 1257933126: {
                    ThrowableAura.ooo00oo0Ooo0[0xA6D ^ 0xB3E] = 0xB27 ^ 0xB3E;
                    ThrowableAura.ooo00oo0Ooo0[0xB071 ^ 0xB03B] = 0xB06A ^ 0xB03B;
                    ThrowableAura.ooo00oo0Ooo0[0x9053 ^ 0x9034] = 0xFFFF6F9F ^ 0x9034;
                    ThrowableAura.ooo00oo0Ooo0[0x3103 ^ 0x3067] = 0x307E ^ 0x3067;
                    ThrowableAura.ooo00oo0Ooo0[0x4872 ^ 0x49F5] = 0x4E9C ^ 0x49F5;
                    n3 = -157780073;
                    continue block99;
                }
                case -157780073: {
                    ThrowableAura.ooo00oo0Ooo0[0x21A4 ^ 0x20EA] = 0xFFFC20EA ^ 0x20EA;
                    ThrowableAura.ooo00oo0Ooo0[0x3CE9 ^ 0x3D6B] = 0x3D6D ^ 0x3D6B;
                    n3 = 1153332418;
                    continue block99;
                }
                case 1153332418: {
                    ThrowableAura.ooo00oo0Ooo0[0xAF37 ^ 0xAFAF] = 0xE5E00880 ^ 0xAFAF;
                    ThrowableAura.ooo00oo0Ooo0[0x9247 ^ 0x92E3] = 0x92A7 ^ 0x92E3;
                    ThrowableAura.ooo00oo0Ooo0[0xF9F5 ^ 0xF9C2] = 0xFFFD863C ^ 0xF9C2;
                    ThrowableAura.ooo00oo0Ooo0[0xB2F3 ^ 0xB38E] = 0xFFFF4C71 ^ 0xB38E;
                    n3 = -119031281;
                    continue block99;
                }
                case -119031281: {
                    ThrowableAura.ooo00oo0Ooo0[0x4D62 ^ 0x4C22] = 0x4C3D ^ 0x4C22;
                    ThrowableAura.ooo00oo0Ooo0[0x9439 ^ 0x942A] = 0x943F ^ 0x942A;
                    ThrowableAura.ooo00oo0Ooo0[0x76B9 ^ 0x7618] = 0x7601 ^ 0x7618;
                    ThrowableAura.ooo00oo0Ooo0[0x3FA4 ^ 0x3F5F] = 0xFFFFC0EA ^ 0x3F5F;
                    ThrowableAura.ooo00oo0Ooo0[0x3989 ^ 0x38B6] = 0x38B7 ^ 0x38B6;
                    ThrowableAura.ooo00oo0Ooo0[0x254B ^ 0x255B] = 0x6EB3C108 ^ 0x255B;
                    n3 = 1240997332;
                    continue block99;
                }
                case 1240997332: {
                    ThrowableAura.ooo00oo0Ooo0[0xA5A3 ^ 0xA54F] = 0xA526 ^ 0xA54F;
                    ThrowableAura.ooo00oo0Ooo0[0xCE12 ^ 0xCED8] = 0xCEDB ^ 0xCED8;
                    ThrowableAura.ooo00oo0Ooo0[0xFAA4 ^ 0xFAFC] = 0xFAE6 ^ 0xFAFC;
                    ThrowableAura.ooo00oo0Ooo0[0xE125 ^ 0xE158] = 0xFFFF1EA7 ^ 0xE158;
                    n3 = -1764535223;
                    continue block99;
                }
                case -1764535223: {
                    ThrowableAura.ooo00oo0Ooo0[0x22B ^ 0x22F] = 0x218 ^ 0x22F;
                    n3 = -17808813;
                    continue block99;
                }
                case -17808813: {
                    ThrowableAura.ooo00oo0Ooo0[0x63D6 ^ 0x62D6] = 0x62E1 ^ 0x62D6;
                    ThrowableAura.ooo00oo0Ooo0[0x619D ^ 0x61E8] = 0x286BABF3 ^ 0x61E8;
                    n3 = 1486011580;
                    continue block99;
                }
                case 1486011580: {
                    ThrowableAura.ooo00oo0Ooo0[0x10648 ^ 0x10675] = 0xFFFEF98A ^ 0x10675;
                    ThrowableAura.ooo00oo0Ooo0[0x430A ^ 0x424E] = 0xFFEBDDB1 ^ 0x424E;
                    n3 = 367852902;
                    continue block99;
                }
                case 367852902: {
                    ThrowableAura.ooo00oo0Ooo0[0xC981 ^ 0xC98E] = 0xC99B ^ 0xC98E;
                    ThrowableAura.ooo00oo0Ooo0[0x2802 ^ 0x2988] = 0x434A ^ 0x2988;
                    ThrowableAura.ooo00oo0Ooo0[0xC5C7 ^ 0xC4FD] = 0xC48C ^ 0xC4FD;
                    ThrowableAura.ooo00oo0Ooo0[0xA18B ^ 0xA1B0] = 0xA1BF ^ 0xA1B0;
                    ThrowableAura.ooo00oo0Ooo0[0xEB80 ^ 0xEB01] = 0xFFFF14E9 ^ 0xEB01;
                    ThrowableAura.ooo00oo0Ooo0[0xF967 ^ 0xF992] = 0xFFFF0645 ^ 0xF992;
                    ThrowableAura.ooo00oo0Ooo0[0x8366 ^ 0x8271] = 0xFFFF7D8E ^ 0x8271;
                    ThrowableAura.ooo00oo0Ooo0[0x10D97 ^ 0x10CEE] = 0xFFFEF311 ^ 0x10CEE;
                    n3 = -1317935385;
                    continue block99;
                }
                case -1317935385: {
                    ThrowableAura.ooo00oo0Ooo0[0x8226 ^ 0x835E] = 0xFFFF7CA1 ^ 0x835E;
                    ThrowableAura.ooo00oo0Ooo0[0xA003 ^ 0xA0CD] = 0xFFFF5F69 ^ 0xA0CD;
                    ThrowableAura.ooo00oo0Ooo0[0xA988 ^ 0xA808] = 0xA808 ^ 0xA808;
                    ThrowableAura.ooo00oo0Ooo0[0x106DE ^ 0x10644] = 0xFFFEF9F1 ^ 0x10644;
                    n3 = 1310886424;
                    continue block99;
                }
                case 1310886424: {
                    ThrowableAura.ooo00oo0Ooo0[0x530C ^ 0x5240] = 0x524F ^ 0x5240;
                    ThrowableAura.ooo00oo0Ooo0[0x9C60 ^ 0x9D6E] = 0xFFFF6281 ^ 0x9D6E;
                    ThrowableAura.ooo00oo0Ooo0[0xEC54 ^ 0xEC5F] = 0xEC5E ^ 0xEC5F;
                    ThrowableAura.ooo00oo0Ooo0[0x828C ^ 0x839F] = 0x83E6 ^ 0x839F;
                    ThrowableAura.ooo00oo0Ooo0[0xFD40 ^ 0xFD4D] = 0xAFF02B2 ^ 0xFD4D;
                    ThrowableAura.ooo00oo0Ooo0[0xA2C9 ^ 0xA22C] = 0x9800A205 ^ 0xA22C;
                    ThrowableAura.ooo00oo0Ooo0[0xBD9B ^ 0xBD52] = 0xBD4F ^ 0xBD52;
                    ThrowableAura.ooo00oo0Ooo0[0xAD58 ^ 0xAC46] = 0xAC5B ^ 0xAC46;
                    n3 = 1077514633;
                    continue block99;
                }
                case 1077514633: {
                    ThrowableAura.ooo00oo0Ooo0[0x75E ^ 0x7CA] = 0x171E4 ^ 0x7CA;
                    ThrowableAura.ooo00oo0Ooo0[0x77D0 ^ 0x7799] = 0x77CC ^ 0x7799;
                    ThrowableAura.ooo00oo0Ooo0[0xB594 ^ 0xB521] = 0xFFFF4AA4 ^ 0xB521;
                    n3 = 1328914766;
                    continue block99;
                }
                case 1328914766: {
                    ThrowableAura.ooo00oo0Ooo0[0x31D ^ 0x32D] = 0x32E ^ 0x32D;
                    ThrowableAura.ooo00oo0Ooo0[0xCA60 ^ 0xCA59] = 0xFFFF35A6 ^ 0xCA59;
                    ThrowableAura.ooo00oo0Ooo0[0x2FA1 ^ 0x2EBE] = 0x7FFFD15D ^ 0x2EBE;
                    n3 = -16713978;
                    continue block99;
                }
                case -16713978: {
                    ThrowableAura.ooo00oo0Ooo0[0x270D ^ 0x27B0] = 0x27B0 ^ 0x27B0;
                    ThrowableAura.ooo00oo0Ooo0[0x6BF8 ^ 0x6B80] = 0x6B97 ^ 0x6B80;
                    ThrowableAura.ooo00oo0Ooo0[0x9DA9 ^ 0x9D0A] = 0x9D13 ^ 0x9D0A;
                    n3 = 1766037898;
                    continue block99;
                }
                case 1766037898: {
                    ThrowableAura.ooo00oo0Ooo0[0x7CBC ^ 0x7C21] = 0x7C21 ^ 0x7C21;
                    ThrowableAura.ooo00oo0Ooo0[0xBDD3 ^ 0xBDA1] = 0x7A6FF04B ^ 0xBDA1;
                    n3 = 1104999607;
                    continue block99;
                }
                case 1104999607: {
                    ThrowableAura.ooo00oo0Ooo0[0x1ED9 ^ 0x1E97] = 0x1E9E ^ 0x1E97;
                    ThrowableAura.ooo00oo0Ooo0[0x5460 ^ 0x557C] = 0xFFFFAAD5 ^ 0x557C;
                    ThrowableAura.ooo00oo0Ooo0[0xE5F1 ^ 0xE5EC] = 0xE58F ^ 0xE5EC;
                    ThrowableAura.ooo00oo0Ooo0[0x2D52 ^ 0x2DA8] = 0x2DE3 ^ 0x2DA8;
                    ThrowableAura.ooo00oo0Ooo0[0xD271 ^ 0xD26F] = 0x1949D45 ^ 0xD26F;
                    n3 = -95765942;
                    continue block99;
                }
                case -95765942: {
                    ThrowableAura.ooo00oo0Ooo0[0xC8B ^ 0xC08] = 0xC33 ^ 0xC08;
                    ThrowableAura.ooo00oo0Ooo0[0xCBC2 ^ 0xCB5C] = 0xC4EC8599 ^ 0xCB5C;
                    n3 = -51313791;
                    continue block99;
                }
                case -51313791: {
                    ThrowableAura.ooo00oo0Ooo0[0xA5A3 ^ 0xA54A] = 0xA551 ^ 0xA54A;
                    n3 = 440188425;
                    continue block99;
                }
                case 440188425: {
                    ThrowableAura.ooo00oo0Ooo0[0x599F ^ 0x5926] = 0x5925 ^ 0x5926;
                    ThrowableAura.ooo00oo0Ooo0[0xCEC0 ^ 0xCE60] = 0xCE60 ^ 0xCE60;
                    n3 = 1593761833;
                    continue block99;
                }
                case 1593761833: {
                    ThrowableAura.ooo00oo0Ooo0[0xB125 ^ 0xB01E] = 0xFFFF4FE1 ^ 0xB01E;
                    ThrowableAura.ooo00oo0Ooo0[0xB1DC ^ 0xB132] = 0xFFFF4EED ^ 0xB132;
                    ThrowableAura.ooo00oo0Ooo0[0xE0B1 ^ 0xE1BC] = 0xDB19BF33 ^ 0xE1BC;
                    n3 = 155390102;
                    continue block99;
                }
                case 155390102: {
                    ThrowableAura.ooo00oo0Ooo0[0xFAC3 ^ 0xFBAB] = 0xFFFF047A ^ 0xFBAB;
                    ThrowableAura.ooo00oo0Ooo0[0x685 ^ 0x68F] = 0x690 ^ 0x68F;
                    n3 = -1543932073;
                    continue block99;
                }
                case -1543932073: {
                    ThrowableAura.ooo00oo0Ooo0[0x9A3C ^ 0x9A5C] = 0x9A39 ^ 0x9A5C;
                    ThrowableAura.ooo00oo0Ooo0[0x9F3 ^ 0x945] = 0xFFFFF692 ^ 0x945;
                    ThrowableAura.ooo00oo0Ooo0[0x749A ^ 0x747A] = 0xFF9E746B ^ 0x747A;
                    n3 = 128023407;
                    continue block99;
                }
                case 128023407: {
                    ThrowableAura.ooo00oo0Ooo0[0xE1C9 ^ 0xE0A7] = 0xE0B0 ^ 0xE0A7;
                    ThrowableAura.ooo00oo0Ooo0[0x25D2 ^ 0x248B] = 0x248A ^ 0x248B;
                    ThrowableAura.ooo00oo0Ooo0[0xD60 ^ 0xD5C] = 0xD5E ^ 0xD5C;
                    ThrowableAura.ooo00oo0Ooo0[0x27F6 ^ 0x27D0] = 0xFFFFD85D ^ 0x27D0;
                    ThrowableAura.ooo00oo0Ooo0[0xF691 ^ 0xF7A4] = 0xF7B7 ^ 0xF7A4;
                    ThrowableAura.ooo00oo0Ooo0[0xEDA8 ^ 0xED3F] = 0x286B2724 ^ 0xED3F;
                    n3 = 2008265312;
                    continue block99;
                }
                case 2008265312: {
                    ThrowableAura.ooo00oo0Ooo0[0x6DCE ^ 0x6CFF] = 0x6CF6 ^ 0x6CFF;
                    n3 = -675207343;
                    continue block99;
                }
                case -675207343: {
                    ThrowableAura.ooo00oo0Ooo0[0xA864 ^ 0xA817] = 0xA852 ^ 0xA817;
                    ThrowableAura.ooo00oo0Ooo0[0x88A1 ^ 0x88FF] = 0x88FC ^ 0x88FF;
                    ThrowableAura.ooo00oo0Ooo0[0xA620 ^ 0xA7AC] = 0xA7AD ^ 0xA7AC;
                    ThrowableAura.ooo00oo0Ooo0[0xFA5B ^ 0xFAEF] = 0xFFFF0510 ^ 0xFAEF;
                    ThrowableAura.ooo00oo0Ooo0[0x7264 ^ 0x7342] = 0x7324 ^ 0x7342;
                    ThrowableAura.ooo00oo0Ooo0[0xA8C5 ^ 0xA875] = 0xA878 ^ 0xA875;
                    ThrowableAura.ooo00oo0Ooo0[0xAD7F ^ 0xAC2B] = 0xAC2C ^ 0xAC2B;
                    ThrowableAura.ooo00oo0Ooo0[0xFF0 ^ 0xF7B] = 0x168F57 ^ 0xF7B;
                    ThrowableAura.ooo00oo0Ooo0[0x38FF ^ 0x3993] = 0x3BA6BD3A ^ 0x3993;
                    ThrowableAura.ooo00oo0Ooo0[0xFFF ^ 0xF83] = 0xFFFFF07C ^ 0xF83;
                    ThrowableAura.ooo00oo0Ooo0[0x4960 ^ 0x486C] = 0xFFFFB0CD ^ 0x486C;
                    ThrowableAura.ooo00oo0Ooo0[0x9BE4 ^ 0x9B3D] = 0xB1A16EB7 ^ 0x9B3D;
                    ThrowableAura.ooo00oo0Ooo0[0xDEB5 ^ 0xDEEE] = 0xFFEFC67D ^ 0xDEEE;
                    ThrowableAura.ooo00oo0Ooo0[0xFB0B ^ 0xFA7F] = 0xFA54 ^ 0xFA7F;
                    n3 = -957349442;
                    continue block99;
                }
                case -957349442: {
                    ThrowableAura.ooo00oo0Ooo0[0x28B6 ^ 0x28E4] = 0x9E0D73A1 ^ 0x28E4;
                    ThrowableAura.ooo00oo0Ooo0[0x39D ^ 0x2CD] = 0x2C0 ^ 0x2CD;
                    ThrowableAura.ooo00oo0Ooo0[0x9134 ^ 0x9174] = 0x916F ^ 0x9174;
                    ThrowableAura.ooo00oo0Ooo0[0x5FC5 ^ 0x5E82] = 0xFFFFA151 ^ 0x5E82;
                    ThrowableAura.ooo00oo0Ooo0[0x798A ^ 0x7957] = 0x7945 ^ 0x7957;
                    n3 = -358146777;
                    continue block99;
                }
                case -358146777: {
                    ThrowableAura.ooo00oo0Ooo0[0xA191 ^ 0xA0D0] = 0xA0E9 ^ 0xA0D0;
                    ThrowableAura.ooo00oo0Ooo0[0x78F8 ^ 0x78D2] = 0x3D70DB05 ^ 0x78D2;
                    ThrowableAura.ooo00oo0Ooo0[0xA26 ^ 0xA77] = 0x89D896BE ^ 0xA77;
                    ThrowableAura.ooo00oo0Ooo0[0x761F ^ 0x7689] = 0xFFFF8976 ^ 0x7689;
                    n3 = -726708286;
                    continue block99;
                }
                case -726708286: {
                    ThrowableAura.ooo00oo0Ooo0[0xE76A ^ 0xE609] = 0xE61C ^ 0xE609;
                    ThrowableAura.ooo00oo0Ooo0[0x1E0B ^ 0x1E62] = 0xF11116D ^ 0x1E62;
                    ThrowableAura.ooo00oo0Ooo0[0x5BD0 ^ 0x5BF4] = 0x5BE3 ^ 0x5BF4;
                    ThrowableAura.ooo00oo0Ooo0[0x257F ^ 0x2467] = 0x244A ^ 0x2467;
                    n3 = 504891825;
                    continue block99;
                }
                case 504891825: {
                    ThrowableAura.ooo00oo0Ooo0[0xD80C ^ 0xD90F] = 0xD91E ^ 0xD90F;
                    ThrowableAura.ooo00oo0Ooo0[0x2CCB ^ 0x2C96] = 0x45D158CB ^ 0x2C96;
                    ThrowableAura.ooo00oo0Ooo0[0x80BC ^ 0x81E9] = 0x81E2 ^ 0x81E9;
                    ThrowableAura.ooo00oo0Ooo0[0xBAF2 ^ 0xBBA8] = 0xBBB7 ^ 0xBBA8;
                    ThrowableAura.ooo00oo0Ooo0[0x7E4F ^ 0x7E60] = 0x7E0B ^ 0x7E60;
                    ThrowableAura.ooo00oo0Ooo0[0x88F7 ^ 0x886C] = 0x885D ^ 0x886C;
                    ThrowableAura.ooo00oo0Ooo0[0x9C96 ^ 0x9C75] = 0x9C7A ^ 0x9C75;
                    n3 = -1575462891;
                    continue block99;
                }
                case -1575462891: {
                    ThrowableAura.ooo00oo0Ooo0[0xA43A ^ 0xA408] = 0x16C1C964 ^ 0xA408;
                    ThrowableAura.ooo00oo0Ooo0[0xD42F ^ 0xD4F4] = 0x83CD9A67 ^ 0xD4F4;
                    ThrowableAura.ooo00oo0Ooo0[0x5598 ^ 0x559A] = 0x5591 ^ 0x559A;
                    ThrowableAura.ooo00oo0Ooo0[0x63E4 ^ 0x63DA] = 0xFFFF9C45 ^ 0x63DA;
                    n3 = 606884998;
                    continue block99;
                }
                case 606884998: {
                    ThrowableAura.ooo00oo0Ooo0[0x1650 ^ 0x162F] = 0xFFFFE9D0 ^ 0x162F;
                    ThrowableAura.ooo00oo0Ooo0[0x466F ^ 0x4642] = 0x4649 ^ 0x4642;
                    ThrowableAura.ooo00oo0Ooo0[0xFEAA ^ 0xFE23] = 0xFE32 ^ 0xFE23;
                    ThrowableAura.ooo00oo0Ooo0[0x731E ^ 0x7293] = 0x7293 ^ 0x7293;
                    ThrowableAura.ooo00oo0Ooo0[0x162D ^ 0x16CC] = 0x16DD ^ 0x16CC;
                    ThrowableAura.ooo00oo0Ooo0[0xAE2 ^ 0xA9C] = 0xFFFFF563 ^ 0xA9C;
                    ThrowableAura.ooo00oo0Ooo0[0x5250 ^ 0x534B] = 0x535E ^ 0x534B;
                    ThrowableAura.ooo00oo0Ooo0[0xD07B ^ 0xD08B] = 0xFFFF2F74 ^ 0xD08B;
                    n3 = -1601810222;
                    continue block99;
                }
                case -1601810222: {
                    ThrowableAura.ooo00oo0Ooo0[0x2E5A ^ 0x2F02] = 0xFFFFD0FD ^ 0x2F02;
                    ThrowableAura.ooo00oo0Ooo0[0x2592 ^ 0x24F2] = 0xFFFFDB0D ^ 0x24F2;
                    ThrowableAura.ooo00oo0Ooo0[0x71A3 ^ 0x70F2] = 0x762D ^ 0x70F2;
                    ThrowableAura.ooo00oo0Ooo0[0x3C7C ^ 0x3CBE] = 0x3CBD ^ 0x3CBE;
                    n3 = 251309542;
                    continue block99;
                }
                case 251309542: {
                    ThrowableAura.ooo00oo0Ooo0[0x10AA6 ^ 0x10A90] = 0xFFFEF56F ^ 0x10A90;
                    ThrowableAura.ooo00oo0Ooo0[0xA632 ^ 0xA62A] = 0xA639 ^ 0xA62A;
                    n3 = -1219615180;
                    continue block99;
                }
                case -1219615180: {
                    ThrowableAura.ooo00oo0Ooo0[0xD803 ^ 0xD841] = 0x1000D89F ^ 0xD841;
                    n3 = 2082532559;
                    continue block99;
                }
                case 2082532559: {
                    ThrowableAura.ooo00oo0Ooo0[0x9F62 ^ 0x9FD8] = 0x9FC5 ^ 0x9FD8;
                    ThrowableAura.ooo00oo0Ooo0[0x2D0 ^ 0x267] = 0x5B05B23C ^ 0x267;
                    ThrowableAura.ooo00oo0Ooo0[0x3B67 ^ 0x3B53] = 0x3B5A ^ 0x3B53;
                    ThrowableAura.ooo00oo0Ooo0[0x76C5 ^ 0x76BE] = 0xFFFF8941 ^ 0x76BE;
                    ThrowableAura.ooo00oo0Ooo0[0xEB33 ^ 0xEBA1] = 0xFFFF142C ^ 0xEBA1;
                    n3 = -736280966;
                    continue block99;
                }
                case -736280966: {
                    ThrowableAura.ooo00oo0Ooo0[0xA5D3 ^ 0xA561] = 0xFFFF5A9E ^ 0xA561;
                    ThrowableAura.ooo00oo0Ooo0[0x53FE ^ 0x5358] = 0x5319 ^ 0x5358;
                    n3 = 1931621726;
                    continue block99;
                }
                case 1931621726: {
                    ThrowableAura.ooo00oo0Ooo0[0xDEE4 ^ 0xDFCD] = 0xDFD2 ^ 0xDFCD;
                    return;
                }
                default: {
                    ThrowableAura.ooo00oo0Ooo0[0xB3C6 ^ 0xB381] = 0xB384 ^ 0xB381;
                    ThrowableAura.ooo00oo0Ooo0[0x25BA ^ 0x2497] = 0x3F2B1C12 ^ 0x2497;
                    n3 = 896646237;
                    continue block99;
                }
                case 896646237: {
                    ThrowableAura.ooo00oo0Ooo0[0x45E9 ^ 0x45BC] = 0x45B3 ^ 0x45BC;
                    n3 = 831453724;
                    continue block99;
                }
                case 831453724: {
                    ThrowableAura.ooo00oo0Ooo0[0x57F8 ^ 0x57F4] = 0x5F02F455 ^ 0x57F4;
                    ThrowableAura.ooo00oo0Ooo0[0xB1B3 ^ 0xB131] = 0xB112 ^ 0xB131;
                    n3 = -1525024850;
                    continue block99;
                }
                case -1525024850: {
                    ThrowableAura.ooo00oo0Ooo0[0xBB ^ 0x135] = 0xFFFF8FCA ^ 0x135;
                    n3 = -1462542873;
                    continue block99;
                }
                case -1462542873: {
                    ThrowableAura.ooo00oo0Ooo0[0x6685 ^ 0x6652] = 0x6659 ^ 0x6652;
                    ThrowableAura.ooo00oo0Ooo0[0xD42C ^ 0xD46D] = 0xFFFF2B92 ^ 0xD46D;
                    ThrowableAura.ooo00oo0Ooo0[0xA1ED ^ 0xA1EE] = 0xA1FB ^ 0xA1EE;
                    n3 = -1357413932;
                    continue block99;
                }
                case -1357413932: {
                    ThrowableAura.ooo00oo0Ooo0[0xB23 ^ 0xA41] = 0xA4A ^ 0xA41;
                    ThrowableAura.ooo00oo0Ooo0[0x978B ^ 0x96FC] = 0x96FC ^ 0x96FC;
                    ThrowableAura.ooo00oo0Ooo0[0x9AB3 ^ 0x9AFC] = 0xFFFF653F ^ 0x9AFC;
                    n3 = 1365756287;
                    continue block99;
                }
                case 1365756287: {
                    ThrowableAura.ooo00oo0Ooo0[0x97EF ^ 0x96B0] = 0x96E1 ^ 0x96B0;
                    ThrowableAura.ooo00oo0Ooo0[0x98ED ^ 0x99A7] = 0xFFFF667A ^ 0x99A7;
                    ThrowableAura.ooo00oo0Ooo0[0xD6DB ^ 0xD6B4] = 0xD691 ^ 0xD6B4;
                    n3 = -1015881141;
                    continue block99;
                }
                case -1015881141: {
                    ThrowableAura.ooo00oo0Ooo0[0x3A65 ^ 0x3A29] = 0x2AED ^ 0x3A29;
                    ThrowableAura.ooo00oo0Ooo0[0x776A ^ 0x77C5] = 0xFFFF883A ^ 0x77C5;
                    ThrowableAura.ooo00oo0Ooo0[0x2606 ^ 0x2650] = 0xFFFFD9F5 ^ 0x2650;
                    n3 = 295893323;
                    continue block99;
                }
                case 295893323: {
                    ThrowableAura.ooo00oo0Ooo0[0x8E6A ^ 0x8E09] = 0xFFFF71F6 ^ 0x8E09;
                    ThrowableAura.ooo00oo0Ooo0[0x18F0 ^ 0x18F6] = 0x18E9 ^ 0x18F6;
                    ThrowableAura.ooo00oo0Ooo0[0xD0EF ^ 0xD06B] = 0xD064 ^ 0xD06B;
                    ThrowableAura.ooo00oo0Ooo0[0xF60B ^ 0xF703] = 0xF708 ^ 0xF703;
                    ThrowableAura.ooo00oo0Ooo0[0xFF3B ^ 0xFFBE] = 0xFFAF ^ 0xFFBE;
                    ThrowableAura.ooo00oo0Ooo0[0x8E54 ^ 0x8EAD] = 0xFFFF7152 ^ 0x8EAD;
                    n3 = 1231964213;
                    continue block99;
                }
                case 1231964213: {
                    ThrowableAura.ooo00oo0Ooo0[0x3267 ^ 0x32B8] = 0xFFFFCD03 ^ 0x32B8;
                    ThrowableAura.ooo00oo0Ooo0[0xB190 ^ 0xB094] = 0x492422DD ^ 0xB094;
                    ThrowableAura.ooo00oo0Ooo0[0x8789 ^ 0x86AC] = 0xFFFF7903 ^ 0x86AC;
                    ThrowableAura.ooo00oo0Ooo0[0xEB10 ^ 0xEA09] = 0xA56A40A3 ^ 0xEA09;
                    ThrowableAura.ooo00oo0Ooo0[0xE9F4 ^ 0xE9FD] = 0x8000E849 ^ 0xE9FD;
                    ThrowableAura.ooo00oo0Ooo0[0x61AC ^ 0x6104] = 0x611F ^ 0x6104;
                    n3 = 770829068;
                    continue block99;
                }
                case 770829068: {
                    ThrowableAura.ooo00oo0Ooo0[0xE9BF ^ 0xE8AF] = 0xE8D8 ^ 0xE8AF;
                    ThrowableAura.ooo00oo0Ooo0[0x8ECE ^ 0x8FFE] = 0x317F735E ^ 0x8FFE;
                    ThrowableAura.ooo00oo0Ooo0[0x17FB ^ 0x1793] = 0xEB2FC920 ^ 0x1793;
                    n3 = 1205924731;
                    continue block99;
                }
                case 1205924731: {
                    ThrowableAura.ooo00oo0Ooo0[0xDC88 ^ 0xDD8A] = 0xDD9B ^ 0xDD8A;
                    ThrowableAura.ooo00oo0Ooo0[0x1A0D ^ 0x1A2D] = 0x1A76 ^ 0x1A2D;
                    ThrowableAura.ooo00oo0Ooo0[0x1EE ^ 0xF4] = 0xFF ^ 0xF4;
                    n3 = 2068479196;
                    continue block99;
                }
                case 2068479196: {
                    ThrowableAura.ooo00oo0Ooo0[0x27E1 ^ 0x27F7] = 0x1C7BE ^ 0x27F7;
                    ThrowableAura.ooo00oo0Ooo0[0x5B3B ^ 0x5B9C] = 0x5B99 ^ 0x5B9C;
                    ThrowableAura.ooo00oo0Ooo0[0x10B73 ^ 0x10A5C] = 0xFFFEF5C9 ^ 0x10A5C;
                    ThrowableAura.ooo00oo0Ooo0[0xCC1A ^ 0xCD3E] = 0xCD1D ^ 0xCD3E;
                    ThrowableAura.ooo00oo0Ooo0[0xDB75 ^ 0xDA3D] = 0xFFFF25AC ^ 0xDA3D;
                    ThrowableAura.ooo00oo0Ooo0[0xE7E7 ^ 0xE7E2] = 0xFFFF180D ^ 0xE7E2;
                    ThrowableAura.ooo00oo0Ooo0[0x7815 ^ 0x797C] = 0x795B ^ 0x797C;
                    ThrowableAura.ooo00oo0Ooo0[0xCF26 ^ 0xCF47] = 0xFFFF3094 ^ 0xCF47;
                    ThrowableAura.ooo00oo0Ooo0[0x93DA ^ 0x92DD] = 0x92C8 ^ 0x92DD;
                    n3 = 104498747;
                    continue block99;
                }
                case 104498747: {
                    ThrowableAura.ooo00oo0Ooo0[0x2803 ^ 0x2962] = 0x2962 ^ 0x2962;
                    ThrowableAura.ooo00oo0Ooo0[0x43EE ^ 0x42CE] = 0x42D5 ^ 0x42CE;
                    ThrowableAura.ooo00oo0Ooo0[0x38E6 ^ 0x38F4] = 0xFF1FC70B ^ 0x38F4;
                    ThrowableAura.ooo00oo0Ooo0[0x105FF ^ 0x105CA] = 0x105E7 ^ 0x105CA;
                    ThrowableAura.ooo00oo0Ooo0[0x5BE6 ^ 0x5B3E] = 0x5B49 ^ 0x5B3E;
                    ThrowableAura.ooo00oo0Ooo0[0xF7E8 ^ 0xF692] = 0xF572 ^ 0xF692;
                    ThrowableAura.ooo00oo0Ooo0[0x85D2 ^ 0x8541] = 0xFFFF7ABE ^ 0x8541;
                    n3 = 1017278352;
                    continue block99;
                }
                case 1017278352: {
                    ThrowableAura.ooo00oo0Ooo0[0xE6B1 ^ 0xE600] = 0xE613 ^ 0xE600;
                    ThrowableAura.ooo00oo0Ooo0[0xC527 ^ 0xC59B] = 0xC5DC ^ 0xC59B;
                    ThrowableAura.ooo00oo0Ooo0[0xC65B ^ 0xC76D] = 0x586F72EA ^ 0xC76D;
                    ThrowableAura.ooo00oo0Ooo0[0x6D5B ^ 0x6C3E] = 0x6C39 ^ 0x6C3E;
                    n3 = -1288123415;
                    continue block99;
                }
                case -1288123415: {
                    ThrowableAura.ooo00oo0Ooo0[0x3BE7 ^ 0x3B77] = 0x5B058B2C ^ 0x3B77;
                    ThrowableAura.ooo00oo0Ooo0[0x158E ^ 0x15EB] = 0x8D8D9823 ^ 0x15EB;
                    ThrowableAura.ooo00oo0Ooo0[0xEC0B ^ 0xECC7] = 0xECD6 ^ 0xECC7;
                    ThrowableAura.ooo00oo0Ooo0[0x67CC ^ 0x66EE] = 0x66F7 ^ 0x66EE;
                    ThrowableAura.ooo00oo0Ooo0[0x6167 ^ 0x61DC] = 0x61A9 ^ 0x61DC;
                    ThrowableAura.ooo00oo0Ooo0[0x10826 ^ 0x109AF] = 0xFFFEF650 ^ 0x109AF;
                    ThrowableAura.ooo00oo0Ooo0[0xE565 ^ 0xE5C0] = 0xFFFF1A3B ^ 0xE5C0;
                    ThrowableAura.ooo00oo0Ooo0[0x27EA ^ 0x26E0] = 0x2699 ^ 0x26E0;
                    ThrowableAura.ooo00oo0Ooo0[0x39D0 ^ 0x3938] = 0x393D ^ 0x3938;
                    ThrowableAura.ooo00oo0Ooo0[0x183A ^ 0x18DE] = 0x18CF ^ 0x18DE;
                    ThrowableAura.ooo00oo0Ooo0[0xA1A1 ^ 0xA0FA] = 0xA0F1 ^ 0xA0FA;
                    n3 = -699005997;
                    continue block99;
                }
                case -699005997: {
                    ThrowableAura.ooo00oo0Ooo0[0x5EF3 ^ 0x5E29] = 0xFFFFA1D6 ^ 0x5E29;
                    n3 = -2145729789;
                    continue block99;
                }
                case -2145729789: {
                    ThrowableAura.ooo00oo0Ooo0[0x802D ^ 0x8079] = 0x8010 ^ 0x8079;
                    ThrowableAura.ooo00oo0Ooo0[0xDFFF ^ 0xDE8E] = 0xDE8A ^ 0xDE8E;
                    n3 = 1524562252;
                    continue block99;
                }
                case 1524562252: {
                    ThrowableAura.ooo00oo0Ooo0[0x1870 ^ 0x19F3] = 0x19F9 ^ 0x19F3;
                    ThrowableAura.ooo00oo0Ooo0[0xF980 ^ 0xF92B] = 0xFFFF06E8 ^ 0xF92B;
                    ThrowableAura.ooo00oo0Ooo0[0xD0F8 ^ 0xD1D6] = 0xD1E1 ^ 0xD1D6;
                    n3 = -1000421204;
                    continue block99;
                }
                case -1000421204: {
                    ThrowableAura.ooo00oo0Ooo0[0xE8BA ^ 0xE879] = 0xE864 ^ 0xE879;
                    ThrowableAura.ooo00oo0Ooo0[0xC793 ^ 0xC743] = 0xC710 ^ 0xC743;
                    ThrowableAura.ooo00oo0Ooo0[0x163C ^ 0x16F3] = 0x16FA ^ 0x16F3;
                    ThrowableAura.ooo00oo0Ooo0[0x1E50 ^ 0x1E7E] = 0x5B05AE25 ^ 0x1E7E;
                    ThrowableAura.ooo00oo0Ooo0[0x3A2B ^ 0x3A03] = 0x8C75F42A ^ 0x3A03;
                    ThrowableAura.ooo00oo0Ooo0[0x9CCD ^ 0x9C41] = 0xFFFF63DA ^ 0x9C41;
                    ThrowableAura.ooo00oo0Ooo0[0x3778 ^ 0x3793] = 0xFFFFCE07 ^ 0x3793;
                    n3 = 905923174;
                    continue block99;
                }
                case 905923174: {
                    ThrowableAura.ooo00oo0Ooo0[0xAD53 ^ 0xAD5B] = 0xFFFF52A4 ^ 0xAD5B;
                    ThrowableAura.ooo00oo0Ooo0[0xBBAF ^ 0xBB17] = 0x5C644E37 ^ 0xBB17;
                    ThrowableAura.ooo00oo0Ooo0[0x955B ^ 0x952A] = 0xFFFF6AED ^ 0x952A;
                    ThrowableAura.ooo00oo0Ooo0[0xA5C9 ^ 0xA51F] = 0xA50A ^ 0xA51F;
                    ThrowableAura.ooo00oo0Ooo0[0x6649 ^ 0x6702] = 0x6723 ^ 0x6702;
                    ThrowableAura.ooo00oo0Ooo0[0xB7DE ^ 0xB7F7] = 0xFFFF4878 ^ 0xB7F7;
                    ThrowableAura.ooo00oo0Ooo0[0x4157 ^ 0x41A9] = 0x41B2 ^ 0x41A9;
                    ThrowableAura.ooo00oo0Ooo0[0x7D3C ^ 0x7D92] = 0x7D99 ^ 0x7D92;
                    ThrowableAura.ooo00oo0Ooo0[0x89B4 ^ 0x891D] = 0x432D54F ^ 0x891D;
                    ThrowableAura.ooo00oo0Ooo0[0xECB0 ^ 0xEC41] = 0xF5F2336C ^ 0xEC41;
                    ThrowableAura.ooo00oo0Ooo0[0xFFAB ^ 0xFE8A] = 0xFE8F ^ 0xFE8A;
                    ThrowableAura.ooo00oo0Ooo0[0x4656 ^ 0x470B] = 0x4773 ^ 0x470B;
                    ThrowableAura.ooo00oo0Ooo0[0xB7A2 ^ 0xB762] = 0xB76B ^ 0xB762;
                    ThrowableAura.ooo00oo0Ooo0[0xBEB3 ^ 0xBEAA] = 0xBEA7 ^ 0xBEAA;
                    ThrowableAura.ooo00oo0Ooo0[0x23AA ^ 0x2356] = 0x8D288F15 ^ 0x2356;
                    ThrowableAura.ooo00oo0Ooo0[0xC573 ^ 0xC524] = 0xFFFF3A91 ^ 0xC524;
                    ThrowableAura.ooo00oo0Ooo0[0x9369 ^ 0x93A1] = 0x93AA ^ 0x93A1;
                    ThrowableAura.ooo00oo0Ooo0[0x2925 ^ 0x2856] = 0x82FA2381 ^ 0x2856;
                    ThrowableAura.ooo00oo0Ooo0[0x4477 ^ 0x449D] = 0xFFFFBB70 ^ 0x449D;
                    ThrowableAura.ooo00oo0Ooo0[0xBBC5 ^ 0xBB45] = 0xC1F0C75A ^ 0xBB45;
                    n3 = 1623583352;
                    continue block99;
                }
                case 1623583352: {
                    ThrowableAura.ooo00oo0Ooo0[0x14F1 ^ 0x14D6] = 0xFFFFEB7D ^ 0x14D6;
                    n3 = 1340950892;
                    continue block99;
                }
                case 1340950892: {
                    ThrowableAura.ooo00oo0Ooo0[0x37CF ^ 0x3647] = 0xFFFFC9B8 ^ 0x3647;
                    ThrowableAura.ooo00oo0Ooo0[0x5ECF ^ 0x5E28] = 0x5E6B ^ 0x5E28;
                    ThrowableAura.ooo00oo0Ooo0[0x92A1 ^ 0x92CD] = 0xFFFF6D22 ^ 0x92CD;
                    ThrowableAura.ooo00oo0Ooo0[0xA6D5 ^ 0xA6F0] = 0xA6E9 ^ 0xA6F0;
                    ThrowableAura.ooo00oo0Ooo0[0xDA8 ^ 0xCDD] = 0xCF0 ^ 0xCDD;
                    ThrowableAura.ooo00oo0Ooo0[0xD9A3 ^ 0xD8EE] = 0xD8FF ^ 0xD8EE;
                    n3 = -1768231928;
                    continue block99;
                }
                case -1768231928: {
                    ThrowableAura.ooo00oo0Ooo0[0xDD13 ^ 0xDC5A] = 0xFFFF23A7 ^ 0xDC5A;
                    ThrowableAura.ooo00oo0Ooo0[0x13A8 ^ 0x13E0] = 0xC0C0D322 ^ 0x13E0;
                    n3 = 352340106;
                    continue block99;
                }
                case 352340106: {
                    ThrowableAura.ooo00oo0Ooo0[0x87E3 ^ 0x8788] = 0x8799 ^ 0x8788;
                    ThrowableAura.ooo00oo0Ooo0[0x7BE2 ^ 0x7BEC] = 0x7BE7 ^ 0x7BEC;
                    n3 = -2104666631;
                    continue block99;
                }
                case -2104666631: {
                    ThrowableAura.ooo00oo0Ooo0[0xB003 ^ 0xB17D] = 0xB17D ^ 0xB17D;
                    ThrowableAura.ooo00oo0Ooo0[0xAC14 ^ 0xAD91] = 0xAD96 ^ 0xAD91;
                    ThrowableAura.ooo00oo0Ooo0[0x36FA ^ 0x363C] = 0x194363C ^ 0x363C;
                    ThrowableAura.ooo00oo0Ooo0[0x1091B ^ 0x10806] = 0x10214887 ^ 0x10806;
                    ThrowableAura.ooo00oo0Ooo0[0xC5CC ^ 0xC5A8] = 0xC59D ^ 0xC5A8;
                    ThrowableAura.ooo00oo0Ooo0[0x10230 ^ 0x1022C] = 0x2B2F41F7 ^ 0x1022C;
                    ThrowableAura.ooo00oo0Ooo0[0x301D ^ 0x3124] = 0x3133 ^ 0x3124;
                    ThrowableAura.ooo00oo0Ooo0[0xD511 ^ 0xD45E] = 0xD44D ^ 0xD45E;
                    ThrowableAura.ooo00oo0Ooo0[0x835D ^ 0x83D2] = 0x83DD ^ 0x83D2;
                    ThrowableAura.ooo00oo0Ooo0[0xD1E0 ^ 0xD131] = 0xFFFF2ECE ^ 0xD131;
                    n3 = 471843655;
                    continue block99;
                }
                case 471843655: {
                    ThrowableAura.ooo00oo0Ooo0[0xC75 ^ 0xD13] = 0x5CC0E060 ^ 0xD13;
                    ThrowableAura.ooo00oo0Ooo0[0x4C1C ^ 0x4C68] = 0x4C4D ^ 0x4C68;
                    ThrowableAura.ooo00oo0Ooo0[0xA600 ^ 0xA70B] = 0xFFFF58E8 ^ 0xA70B;
                    ThrowableAura.ooo00oo0Ooo0[0x524A ^ 0x5213] = 0x521E ^ 0x5213;
                    ThrowableAura.ooo00oo0Ooo0[0xFE69 ^ 0xFF3B] = 0xFF04 ^ 0xFF3B;
                    ThrowableAura.ooo00oo0Ooo0[0xF368 ^ 0xF33B] = 0xF37A ^ 0xF33B;
                    n3 = -313073873;
                    continue block99;
                }
                case -313073873: {
                    ThrowableAura.ooo00oo0Ooo0[0x5C72 ^ 0x5C6D] = 0xFFFFA3AA ^ 0x5C6D;
                    ThrowableAura.ooo00oo0Ooo0[0x63A1 ^ 0x62A0] = 0xFFFF9D5F ^ 0x62A0;
                    n3 = 1360822128;
                    continue block99;
                }
                case 1360822128: {
                    ThrowableAura.ooo00oo0Ooo0[0x5DAE ^ 0x5DD7] = 0x5DC2 ^ 0x5DD7;
                    n3 = 1210213780;
                    continue block99;
                }
                case 1210213780: {
                    ThrowableAura.ooo00oo0Ooo0[0x6FC9 ^ 0x6F24] = 0x73ECC2C7 ^ 0x6F24;
                    ThrowableAura.ooo00oo0Ooo0[0x7789 ^ 0x7757] = 0xFFFF88FE ^ 0x7757;
                    n3 = -2054359807;
                    continue block99;
                }
                case -2054359807: {
                    ThrowableAura.ooo00oo0Ooo0[0x446 ^ 0x553] = 0x542 ^ 0x553;
                    ThrowableAura.ooo00oo0Ooo0[0x2BE9 ^ 0x2A92] = 0x2A97 ^ 0x2A92;
                    ThrowableAura.ooo00oo0Ooo0[0x77C ^ 0x706] = 0x70D ^ 0x706;
                    ThrowableAura.ooo00oo0Ooo0[0x3873 ^ 0x3947] = 0x394A ^ 0x3947;
                    n3 = -458883021;
                    continue block99;
                }
                case -458883021: {
                    ThrowableAura.ooo00oo0Ooo0[0xC7B2 ^ 0xC698] = 0xC699 ^ 0xC698;
                    ThrowableAura.ooo00oo0Ooo0[0x1D3D ^ 0x1CB2] = 0x1CB5 ^ 0x1CB2;
                    ThrowableAura.ooo00oo0Ooo0[0x2171 ^ 0x2171] = 0x99B9B813 ^ 0x2171;
                    ThrowableAura.ooo00oo0Ooo0[0xAA89 ^ 0xAAE3] = 0xAAEC ^ 0xAAE3;
                    ThrowableAura.ooo00oo0Ooo0[0x13BB ^ 0x134C] = 0x130B ^ 0x134C;
                    ThrowableAura.ooo00oo0Ooo0[0x8D85 ^ 0x8CF3] = 0x5B053CA8 ^ 0x8CF3;
                    ThrowableAura.ooo00oo0Ooo0[0x4D95 ^ 0x4DA6] = 0x4DB1 ^ 0x4DA6;
                    ThrowableAura.ooo00oo0Ooo0[0x3BED ^ 0x3BA8] = 0xFFFFC439 ^ 0x3BA8;
                    ThrowableAura.ooo00oo0Ooo0[0x5374 ^ 0x53FE] = 0x53F1 ^ 0x53FE;
                    ThrowableAura.ooo00oo0Ooo0[0xC370 ^ 0xC3B7] = 0xC3A2 ^ 0xC3B7;
                    ThrowableAura.ooo00oo0Ooo0[0x3CB3 ^ 0x3C19] = 0xFFFFC3E6 ^ 0x3C19;
                    n3 = -1198650447;
                    continue block99;
                }
                case -1198650447: {
                    ThrowableAura.ooo00oo0Ooo0[0x6009 ^ 0x611F] = 0x6132 ^ 0x611F;
                    ThrowableAura.ooo00oo0Ooo0[0x107DA ^ 0x107F9] = 0x8591B61E ^ 0x107F9;
                    ThrowableAura.ooo00oo0Ooo0[0xA3C2 ^ 0xA3A0] = 0xA3BB ^ 0xA3A0;
                    ThrowableAura.ooo00oo0Ooo0[0xB93B ^ 0xB94D] = 0xB94D ^ 0xB94D;
                    ThrowableAura.ooo00oo0Ooo0[0x5D37 ^ 0x5D1B] = 0x5D0E ^ 0x5D1B;
                    ThrowableAura.ooo00oo0Ooo0[0xEA3F ^ 0xEB02] = 0xFB82D5DC ^ 0xEB02;
                    ThrowableAura.ooo00oo0Ooo0[0x987D ^ 0x98AE] = 0x98BB ^ 0x98AE;
                    ThrowableAura.ooo00oo0Ooo0[0xB357 ^ 0xB228] = 0xB228 ^ 0xB228;
                    ThrowableAura.ooo00oo0Ooo0[0xDE99 ^ 0xDE8D] = 0xDE86 ^ 0xDE8D;
                    n3 = -249603926;
                    continue block99;
                }
                case -249603926: {
                    ThrowableAura.ooo00oo0Ooo0[0xE89A ^ 0xE848] = 0xFFFF17C0 ^ 0xE848;
                    ThrowableAura.ooo00oo0Ooo0[0x2AE6 ^ 0x2BC1] = 0xFFFFD43E ^ 0x2BC1;
                    n3 = -776819561;
                    continue block99;
                }
                case -776819561: {
                    ThrowableAura.ooo00oo0Ooo0[0x9991 ^ 0x992F] = 0x9930 ^ 0x992F;
                    ThrowableAura.ooo00oo0Ooo0[0x33C8 ^ 0x32F4] = 0x3295 ^ 0x32F4;
                    n3 = -1347832025;
                    continue block99;
                }
                case -1347832025: {
                    ThrowableAura.ooo00oo0Ooo0[0x2C88 ^ 0x2DCA] = 0x2DCB ^ 0x2DCA;
                    ThrowableAura.ooo00oo0Ooo0[0xD289 ^ 0xD3E6] = 0xD3EF ^ 0xD3E6;
                    ThrowableAura.ooo00oo0Ooo0[0xDC5E ^ 0xDC01] = 0xDC1C ^ 0xDC01;
                    n3 = 1417418334;
                    continue block99;
                }
                case 1417418334: {
                    ThrowableAura.ooo00oo0Ooo0[0x1BCD ^ 0x1A8E] = 0x1A91 ^ 0x1A8E;
                    ThrowableAura.ooo00oo0Ooo0[0x6B77 ^ 0x6A40] = 0xACF2F4E3 ^ 0x6A40;
                    ThrowableAura.ooo00oo0Ooo0[0x6E7B ^ 0x6F0B] = 0x781927BA ^ 0x6F0B;
                    ThrowableAura.ooo00oo0Ooo0[0xF74D ^ 0xF673] = 0xFFFF098C ^ 0xF673;
                    ThrowableAura.ooo00oo0Ooo0[0x8946 ^ 0x8874] = 0x8863 ^ 0x8874;
                    ThrowableAura.ooo00oo0Ooo0[0xB4E6 ^ 0xB404] = 0x1A1FECD5 ^ 0xB404;
                    ThrowableAura.ooo00oo0Ooo0[0x3C84 ^ 0x3D0F] = 0x3D00 ^ 0x3D0F;
                    n3 = 1019857808;
                    continue block99;
                }
                case 1019857808: 
            }
            ThrowableAura.ooo00oo0Ooo0[0xF81D ^ 0xF91B] = 0x97B4DCF6 ^ 0xF91B;
            ThrowableAura.ooo00oo0Ooo0[0xE9B9 ^ 0xE8AD] = 0xE8A2 ^ 0xE8AD;
            ThrowableAura.ooo00oo0Ooo0[0x92C1 ^ 0x93E2] = 0x93E5 ^ 0x93E2;
            ThrowableAura.ooo00oo0Ooo0[0xD1C9 ^ 0xD1F6] = 0xD1F3 ^ 0xD1F6;
            ThrowableAura.ooo00oo0Ooo0[0x96A9 ^ 0x96B8] = 0xFFFF6979 ^ 0x96B8;
            n3 = -1119435462;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }

    /*
     * Enabled aggressive block sorting
     */
    public ThrowableAura() {
        BooleanValue booleanValue;
        int n2 = 286028854;
        if (n2 != n2) {
            throw null;
        }
        int n3 = ooo00oo0Ooo0[0] - ooo00oo0Ooo0[1];
        this.qs = new NumberValue((String)q0OOOoo00o0[(n3 << ooo00oo0Ooo0[2] | n3 >>> ooo00oo0Ooo0[3]) * ooo00oo0Ooo0[4]], this, (Number)Double.longBitsToDouble(0xC9F4F637B07F6B60L ^ 0x89D4F637B07F6B60L), (Number)1.0, (Number)Double.longBitsToDouble(0x869F280F29AC226CL ^ 0xC6B1280F29AC226CL), (Number)Double.longBitsToDouble(0x7608C6E3E62F2141L ^ 0x49B15F7A7FB6B8DBL));
        int n4 = ooo00oo0Ooo0[5];
        this.qt = new NumberValue((String)q0OOOoo00o0[(n4 << ooo00oo0Ooo0[6] | n4 >>> ooo00oo0Ooo0[7]) ^ ooo00oo0Ooo0[8]], this, (Number)Double.longBitsToDouble(0xBF6A8BB081F04966L ^ 0xFF728BB081F04966L), (Number)1.0, (Number)Double.longBitsToDouble(0xEC2537736FEE045AL ^ 0xAC0D37736FEE045AL), (Number)Double.longBitsToDouble(0xABABA330278839D1L ^ 0x94123AA9BE11A04BL));
        int n5 = ooo00oo0Ooo0[9];
        this.qu = new NumberValue((String)q0OOOoo00o0[(n5 >>> ooo00oo0Ooo0[10] | n5 << ooo00oo0Ooo0[11]) * ooo00oo0Ooo0[12]], this, (Number)Double.longBitsToDouble(0x7CD2FF1E574CAC4FL ^ 0x3CDAFF1E574CAC4FL), (Number)1.0, (Number)Double.longBitsToDouble(0x97C170673B751AABL ^ 0xD7E570673B751AABL), (Number)Double.longBitsToDouble(0xF5016AE58179A041L ^ 0xCAB8F37C18E039DBL));
        int n6 = ooo00oo0Ooo0[13];
        this.qv = new NumberValue((String)q0OOOoo00o0[-((n6 << ooo00oo0Ooo0[14] | n6 >>> ooo00oo0Ooo0[15]) * ooo00oo0Ooo0[16]) - ooo00oo0Ooo0[17]], this, (Number)Double.longBitsToDouble(0x6BA232CC214FAD76L ^ 0x2BB632CC214FAD76L), (Number)0.0, (Number)Double.longBitsToDouble(0x52E51D46471D4399L ^ 0x12BC1D46471D4399L), (Number)1.0);
        int n7 = ooo00oo0Ooo0[18];
        this.qw = new NumberValue((String)q0OOOoo00o0[-(n7 >>> ooo00oo0Ooo0[19] | n7 << ooo00oo0Ooo0[20]) - ooo00oo0Ooo0[21]], this, (Number)Double.longBitsToDouble(0x5B8CC2B68C5D76CDL ^ 0x1BEA42B68C5D76CDL), (Number)Double.longBitsToDouble(0xFC8EF3187DC1696BL ^ 0xBCB0F3187DC1696BL), (Number)Double.longBitsToDouble(0xC54A1CEC34D0B466L ^ 0x853C9CEC34D0B466L), (Number)1.0);
        String string = o0Oo000O0oO;
        if (string == null) {
            int n8 = ooo00oo0Ooo0[22] ^ ooo00oo0Ooo0[23];
            string = o0Oo000O0oO = (String)q0OOOoo00o0[n8 << ooo00oo0Ooo0[24] | n8 >>> ooo00oo0Ooo0[25]] + (String)q0OOOoo00o0[-(ooo00oo0Ooo0[26] + ooo00oo0Ooo0[27]) * ooo00oo0Ooo0[28] + ooo00oo0Ooo0[29]];
        }
        int n9 = ooo00oo0Ooo0[30] * ooo00oo0Ooo0[31] * ooo00oo0Ooo0[32];
        this.qx = new BooleanValue(string, (Module)this, (Boolean)((n9 << ooo00oo0Ooo0[33] | n9 >>> ooo00oo0Ooo0[34]) != 0));
        this.qy = new BooleanValue((String)q0OOOoo00o0[(ooo00oo0Ooo0[35] + ooo00oo0Ooo0[36] + ooo00oo0Ooo0[37]) * ooo00oo0Ooo0[38] - ooo00oo0Ooo0[39]], (Module)this, (Boolean)(ooo00oo0Ooo0[40] * ooo00oo0Ooo0[41] * ooo00oo0Ooo0[42]));
        int n10 = ooo00oo0Ooo0[43];
        int n11 = (n10 << ooo00oo0Ooo0[44] | n10 >>> ooo00oo0Ooo0[45]) * ooo00oo0Ooo0[46] ^ ooo00oo0Ooo0[47];
        int n12 = ooo00oo0Ooo0[50];
        this.qz = new BooleanValue((String)q0OOOoo00o0[n11 >>> ooo00oo0Ooo0[48] | n11 << ooo00oo0Ooo0[49]], (Module)this, (Boolean)(((n12 << ooo00oo0Ooo0[51] | n12 >>> ooo00oo0Ooo0[52]) * ooo00oo0Ooo0[53] ^ ooo00oo0Ooo0[54]) != 0));
        int n13 = -(ooo00oo0Ooo0[55] ^ ooo00oo0Ooo0[56]) ^ ooo00oo0Ooo0[57];
        booleanValue((String)q0OOOoo00o0[n13 << ooo00oo0Ooo0[58] | n13 >>> ooo00oo0Ooo0[59]], (Module)this, (Boolean)((-ooo00oo0Ooo0[60] ^ ooo00oo0Ooo0[61]) != 0));
        this.qA = booleanValue;
        int n14 = ooo00oo0Ooo0[62];
        int n15 = ooo00oo0Ooo0[66];
        int n16 = (n15 >>> ooo00oo0Ooo0[67] | n15 << ooo00oo0Ooo0[68]) + ooo00oo0Ooo0[69];
        this.qB = new BooleanValue((String)q0OOOoo00o0[(n14 >>> ooo00oo0Ooo0[63] | n14 << ooo00oo0Ooo0[64]) ^ ooo00oo0Ooo0[65]], (Module)this, (Boolean)((n16 >>> ooo00oo0Ooo0[70] | n16 << ooo00oo0Ooo0[71]) != 0));
        this.qC = new BooleanValue((String)q0OOOoo00o0[-(ooo00oo0Ooo0[72] * ooo00oo0Ooo0[73] - ooo00oo0Ooo0[74]) ^ ooo00oo0Ooo0[75]], (Module)this, (Boolean)(((ooo00oo0Ooo0[76] * ooo00oo0Ooo0[77] ^ ooo00oo0Ooo0[78]) + ooo00oo0Ooo0[79] ^ ooo00oo0Ooo0[80]) != 0));
        this.qD = new BooleanValue((String)q0OOOoo00o0[ooo00oo0Ooo0[81] * ooo00oo0Ooo0[82] * ooo00oo0Ooo0[83] ^ ooo00oo0Ooo0[84]], (Module)this, (Boolean)((ooo00oo0Ooo0[85] + ooo00oo0Ooo0[86] ^ ooo00oo0Ooo0[87]) != 0));
        int n17 = ooo00oo0Ooo0[91] * ooo00oo0Ooo0[92] * ooo00oo0Ooo0[93];
        this.qE = new BooleanValue((String)q0OOOoo00o0[ooo00oo0Ooo0[88] + ooo00oo0Ooo0[89] - ooo00oo0Ooo0[90]], (Module)this, (Boolean)((n17 >>> ooo00oo0Ooo0[94] | n17 << ooo00oo0Ooo0[95]) + ooo00oo0Ooo0[96]));
        this.qF = new BooleanValue((String)q0OOOoo00o0[(ooo00oo0Ooo0[97] ^ ooo00oo0Ooo0[98] ^ ooo00oo0Ooo0[99]) - ooo00oo0Ooo0[100]], (Module)this, (Boolean)((ooo00oo0Ooo0[101] ^ ooo00oo0Ooo0[102]) * ooo00oo0Ooo0[103] * ooo00oo0Ooo0[104]));
        int n18 = ooo00oo0Ooo0[105];
        this.qG = new BooleanValue((String)q0OOOoo00o0[(n18 << ooo00oo0Ooo0[106] | n18 >>> ooo00oo0Ooo0[107]) * ooo00oo0Ooo0[108] ^ ooo00oo0Ooo0[109]], (Module)this, (Boolean)((-(ooo00oo0Ooo0[110] - ooo00oo0Ooo0[111]) ^ ooo00oo0Ooo0[112]) - ooo00oo0Ooo0[113]));
        this.qI = (ooo00oo0Ooo0[114] * ooo00oo0Ooo0[115] - ooo00oo0Ooo0[116]) * ooo00oo0Ooo0[117];
        this.qK = this::b;
    }
}

