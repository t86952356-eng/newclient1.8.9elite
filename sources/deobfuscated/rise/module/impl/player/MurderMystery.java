/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.fg;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.entity.player.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@ModuleInfo(aliases={"module.other.murdermystery.name"}, description="module.other.murdermystery.description", category=Category.PLAYER)
public class MurderMystery
extends Module {
    public static /* synthetic */ String Oo0o00000O00;
    @EventLink
    public /* synthetic */ Listener<PacketReceiveEvent> Vs;
    public /* synthetic */ BooleanValue Vp;
    public static /* synthetic */ String[] ooo00oo0Ooo0;
    public static /* synthetic */ Object[] q0oOOoOo0O00O;
    public static /* synthetic */ String q0OOOoo00o0;
    public /* synthetic */ Set<Integer> Vr;
    @EventLink
    public /* synthetic */ Listener<PreMotionEvent> Vt;
    public static /* synthetic */ String[] o0o000o0O0o0;
    public static /* synthetic */ Object O0OoOO0OOOOO;
    private static /* synthetic */ int[] oOo00Oo0OOo0;
    @EventLink
    public /* synthetic */ Listener<fg> Vu;
    public static /* synthetic */ String o0Oo000O0oO;
    public /* synthetic */ a Vq;
    public static /* synthetic */ Object[] oO00O0OO0ooO;
    public /* synthetic */ BooleanValue Vo;
    private static /* synthetic */ int oo000o00Oo00;
    private static /* synthetic */ boolean o0000000O000;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public MurderMystery() {
        BooleanValue booleanValue;
        int n2 = -1011624304;
        if (n2 != n2) {
        }
        int n3 = oOo00Oo0OOo0[5];
        int n4 = n3 << oOo00Oo0OOo0[6] | n3 >>> oOo00Oo0OOo0[7];
        int n5 = (n4 << oOo00Oo0OOo0[8] | n4 >>> oOo00Oo0OOo0[9]) ^ oOo00Oo0OOo0[10];
        booleanValue((String)oO00O0OO0ooO[(oOo00Oo0OOo0[0] * oOo00Oo0OOo0[1] ^ oOo00Oo0OOo0[2]) * oOo00Oo0OOo0[3] - oOo00Oo0OOo0[4]], (Module)this, (Boolean)((n5 >>> oOo00Oo0OOo0[11] | n5 << oOo00Oo0OOo0[12]) != 0));
        this.Vo = booleanValue;
        int n6 = oOo00Oo0OOo0[13] * oOo00Oo0OOo0[14];
        int n7 = oOo00Oo0OOo0[19];
        int n8 = (n7 << oOo00Oo0OOo0[20] | n7 >>> oOo00Oo0OOo0[21]) * oOo00Oo0OOo0[22];
        this.Vp = new BooleanValue((String)oO00O0OO0ooO[((n6 >>> oOo00Oo0OOo0[15] | n6 << oOo00Oo0OOo0[16]) + oOo00Oo0OOo0[17]) * oOo00Oo0OOo0[18]], (Module)this, (Boolean)(((n8 << oOo00Oo0OOo0[23] | n8 >>> oOo00Oo0OOo0[24]) ^ oOo00Oo0OOo0[25]) != 0));
        this.Vr = new HashSet<Integer>();
        this.Vs = this::c;
        this.Vt = this::f;
        this.Vu = fg2 -> {
            this.Vq = null;
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = 1318197361;
        if (n2 != n2) {
            throw null;
        }
        oOo00Oo0OOo0 = new int[0x8A5 ^ 0x935];
        int n3 = 1892436085;
        block95: while (true) {
            switch (n3) {
                case -1058993297: {
                    MurderMystery.oOo00Oo0OOo0[0x1BE2 ^ 0x1B2C] = 0x1B27 ^ 0x1B2C;
                    MurderMystery.oOo00Oo0OOo0[0xB6CB ^ 0xB6CD] = 0xB6D0 ^ 0xB6CD;
                    n3 = -1067119268;
                    continue block95;
                }
                case -1067119268: {
                    MurderMystery.oOo00Oo0OOo0[0x4062 ^ 0x40F4] = 0xFFFFBF0B ^ 0x40F4;
                    MurderMystery.oOo00Oo0OOo0[0x34FA ^ 0x3582] = 0x8C11 ^ 0x3582;
                    n3 = 1464352927;
                    continue block95;
                }
                case 1464352927: {
                    MurderMystery.oOo00Oo0OOo0[0xB976 ^ 0xB8FD] = 0x3E34 ^ 0xB8FD;
                    MurderMystery.oOo00Oo0OOo0[0x16DB ^ 0x17E6] = 0xFFFF95C1 ^ 0x17E6;
                    MurderMystery.oOo00Oo0OOo0[0x4BF9 ^ 0x4B05] = 0xEBC2 ^ 0x4B05;
                    n3 = 224120259;
                    continue block95;
                }
                case 224120259: {
                    MurderMystery.oOo00Oo0OOo0[0x3FA3 ^ 0x3FD7] = 0xFFFFC028 ^ 0x3FD7;
                    n3 = -1931803567;
                    continue block95;
                }
                case -1931803567: {
                    MurderMystery.oOo00Oo0OOo0[0x30E1 ^ 0x30F7] = 0xFFFFCF24 ^ 0x30F7;
                    MurderMystery.oOo00Oo0OOo0[0xC284 ^ 0xC391] = 0x9DF1 ^ 0xC391;
                    n3 = 1248200031;
                    continue block95;
                }
                case 1248200031: {
                    MurderMystery.oOo00Oo0OOo0[0xB748 ^ 0xB7FD] = 0xFFFF4858 ^ 0xB7FD;
                    MurderMystery.oOo00Oo0OOo0[0xEB0C ^ 0xEBC5] = 0xFFFF1468 ^ 0xEBC5;
                    MurderMystery.oOo00Oo0OOo0[0xAA8 ^ 0xA11] = 0xA18 ^ 0xA11;
                    MurderMystery.oOo00Oo0OOo0[0xAB8B ^ 0xABD6] = 0xFFFF541E ^ 0xABD6;
                    MurderMystery.oOo00Oo0OOo0[0xDD70 ^ 0xDD83] = 0x6322 ^ 0xDD83;
                    MurderMystery.oOo00Oo0OOo0[0x6F4B ^ 0x6F12] = 0x7713 ^ 0x6F12;
                    MurderMystery.oOo00Oo0OOo0[0xDDE1 ^ 0xDD3C] = 0xDD3C ^ 0xDD3C;
                    n3 = 80812018;
                    continue block95;
                }
                case 80812018: {
                    MurderMystery.oOo00Oo0OOo0[0xFA04 ^ 0xFA82] = 0xFA9F ^ 0xFA82;
                    MurderMystery.oOo00Oo0OOo0[0x50E ^ 0x5F0] = 0xA569 ^ 0x5F0;
                    MurderMystery.oOo00Oo0OOo0[0x1065B ^ 0x1067F] = 0xFFFEF980 ^ 0x1067F;
                    MurderMystery.oOo00Oo0OOo0[0x412A ^ 0x4044] = 0x170D ^ 0x4044;
                    MurderMystery.oOo00Oo0OOo0[0x722A ^ 0x735B] = 0x5A8B ^ 0x735B;
                    MurderMystery.oOo00Oo0OOo0[0x74EA ^ 0x7476] = 0x2CBC9002 ^ 0x7476;
                    MurderMystery.oOo00Oo0OOo0[0x3B24 ^ 0x3A08] = 0x58DE ^ 0x3A08;
                    MurderMystery.oOo00Oo0OOo0[0x8128 ^ 0x819A] = 0x8189 ^ 0x819A;
                    MurderMystery.oOo00Oo0OOo0[0x8AE8 ^ 0x8A7B] = 0x8A68 ^ 0x8A7B;
                    MurderMystery.oOo00Oo0OOo0[0x10026 ^ 0x10153] = 0xFFFEF81A ^ 0x10153;
                    MurderMystery.oOo00Oo0OOo0[0x5B9C ^ 0x5A83] = 0xCA2A ^ 0x5A83;
                    MurderMystery.oOo00Oo0OOo0[0x4E83 ^ 0x4E53] = 0x4E48 ^ 0x4E53;
                    MurderMystery.oOo00Oo0OOo0[0xB37 ^ 0xB48] = 0xB4D ^ 0xB48;
                    MurderMystery.oOo00Oo0OOo0[0x677B ^ 0x67BD] = 0x6790 ^ 0x67BD;
                    MurderMystery.oOo00Oo0OOo0[0xC88A ^ 0xC802] = 0xC845 ^ 0xC802;
                    n3 = -262145315;
                    continue block95;
                }
                case -262145315: {
                    MurderMystery.oOo00Oo0OOo0[0x1DEE ^ 0x1CBC] = 0x5858 ^ 0x1CBC;
                    MurderMystery.oOo00Oo0OOo0[0x487A ^ 0x487D] = 0x487E ^ 0x487D;
                    MurderMystery.oOo00Oo0OOo0[0xC476 ^ 0xC423] = 0xC42E ^ 0xC423;
                    MurderMystery.oOo00Oo0OOo0[0xAB16 ^ 0xABCE] = 0xABD5 ^ 0xABCE;
                    MurderMystery.oOo00Oo0OOo0[0x10878 ^ 0x10907] = 0x1D8E5 ^ 0x10907;
                    MurderMystery.oOo00Oo0OOo0[0x1067 ^ 0x1101] = 0xBE3F ^ 0x1101;
                    MurderMystery.oOo00Oo0OOo0[0x2B88 ^ 0x2BBE] = 0xFFFFD417 ^ 0x2BBE;
                    n3 = -1801858043;
                    continue block95;
                }
                case -1801858043: {
                    MurderMystery.oOo00Oo0OOo0[0xE9F9 ^ 0xE9D4] = 0xFFFF162B ^ 0xE9D4;
                    MurderMystery.oOo00Oo0OOo0[0x2990 ^ 0x28A5] = 0xFFFF0A17 ^ 0x28A5;
                    n3 = 1487967048;
                    continue block95;
                }
                case 1487967048: {
                    MurderMystery.oOo00Oo0OOo0[0x612C ^ 0x61E4] = 0x61F1 ^ 0x61E4;
                    MurderMystery.oOo00Oo0OOo0[0x504C ^ 0x50D9] = 0x50D8 ^ 0x50D9;
                    MurderMystery.oOo00Oo0OOo0[0x68A5 ^ 0x69F2] = 0x80A7 ^ 0x69F2;
                    MurderMystery.oOo00Oo0OOo0[0xA29B ^ 0xA210] = 0xA22F ^ 0xA210;
                    MurderMystery.oOo00Oo0OOo0[0x486F ^ 0x486E] = 0x87E6FF21 ^ 0x486E;
                    MurderMystery.oOo00Oo0OOo0[0x7447 ^ 0x74AF] = 0x59D1 ^ 0x74AF;
                    n3 = 1064750435;
                    continue block95;
                }
                case 1064750435: {
                    MurderMystery.oOo00Oo0OOo0[0xEB8E ^ 0xEBE3] = 0xEBE8 ^ 0xEBE3;
                    MurderMystery.oOo00Oo0OOo0[0x2710 ^ 0x279D] = 0x27F6 ^ 0x279D;
                    n3 = -1908800227;
                    continue block95;
                }
                case -1908800227: {
                    MurderMystery.oOo00Oo0OOo0[0x9C28 ^ 0x9D3C] = 0xC353 ^ 0x9D3C;
                    MurderMystery.oOo00Oo0OOo0[0x216 ^ 0x22D] = 0x228 ^ 0x22D;
                    MurderMystery.oOo00Oo0OOo0[0x267 ^ 0x203] = 0xFFFFFDC2 ^ 0x203;
                    MurderMystery.oOo00Oo0OOo0[0x8440 ^ 0x8412] = 0xFFE80439 ^ 0x8412;
                    MurderMystery.oOo00Oo0OOo0[0xA9D4 ^ 0xA8AA] = 0x556F ^ 0xA8AA;
                    MurderMystery.oOo00Oo0OOo0[0xBB00 ^ 0xBBAE] = 0xBB9F ^ 0xBBAE;
                    MurderMystery.oOo00Oo0OOo0[0xAAF3 ^ 0xAA8F] = 0xAA92 ^ 0xAA8F;
                    MurderMystery.oOo00Oo0OOo0[0x2954 ^ 0x2813] = 0xE774 ^ 0x2813;
                    MurderMystery.oOo00Oo0OOo0[0xBC38 ^ 0xBC87] = 0x86BC07 ^ 0xBC87;
                    MurderMystery.oOo00Oo0OOo0[0xD67B ^ 0xD6DE] = 0x914CCD73 ^ 0xD6DE;
                    MurderMystery.oOo00Oo0OOo0[0x83A6 ^ 0x82AD] = 0x927F ^ 0x82AD;
                    MurderMystery.oOo00Oo0OOo0[0x6FE0 ^ 0x6FB7] = 0x6FB3 ^ 0x6FB7;
                    MurderMystery.oOo00Oo0OOo0[0x7AE5 ^ 0x7AC3] = 0x41328DE ^ 0x7AC3;
                    MurderMystery.oOo00Oo0OOo0[0x3B0C ^ 0x3BCB] = 0x3BC0 ^ 0x3BCB;
                    n3 = -1957569808;
                    continue block95;
                }
                case -1957569808: {
                    MurderMystery.oOo00Oo0OOo0[0x7684 ^ 0x7639] = 0x763E ^ 0x7639;
                    n3 = 1465364278;
                    continue block95;
                }
                case 1465364278: {
                    MurderMystery.oOo00Oo0OOo0[0xA942 ^ 0xA9A9] = 0x84D1 ^ 0xA9A9;
                    MurderMystery.oOo00Oo0OOo0[0x1008E ^ 0x101D8] = 0x15011 ^ 0x101D8;
                    n3 = -1440226207;
                    continue block95;
                }
                case -1440226207: {
                    MurderMystery.oOo00Oo0OOo0[0x1A3C ^ 0x1B16] = 0xC02 ^ 0x1B16;
                    MurderMystery.oOo00Oo0OOo0[0xA300 ^ 0xA220] = 0xA220 ^ 0xA220;
                    MurderMystery.oOo00Oo0OOo0[0x1571 ^ 0x15F0] = 0x15E5 ^ 0x15F0;
                    MurderMystery.oOo00Oo0OOo0[0xFAFA ^ 0xFBA6] = 0x4679 ^ 0xFBA6;
                    n3 = 2017826821;
                    continue block95;
                }
                case 2017826821: {
                    MurderMystery.oOo00Oo0OOo0[0x99EA ^ 0x990F] = 0xE431 ^ 0x990F;
                    MurderMystery.oOo00Oo0OOo0[0x77DF ^ 0x76EB] = 0xABDE ^ 0x76EB;
                    MurderMystery.oOo00Oo0OOo0[0x7262 ^ 0x7240] = 0xFFFF8D8C ^ 0x7240;
                    MurderMystery.oOo00Oo0OOo0[0xB66C ^ 0xB625] = 0xFFFF49B0 ^ 0xB625;
                    MurderMystery.oOo00Oo0OOo0[0x2CE0 ^ 0x2CCF] = 0xFFFFD35C ^ 0x2CCF;
                    MurderMystery.oOo00Oo0OOo0[0xD9B2 ^ 0xD8B8] = 0xC83E ^ 0xD8B8;
                    MurderMystery.oOo00Oo0OOo0[0xB218 ^ 0xB32A] = 0x6C6C ^ 0xB32A;
                    MurderMystery.oOo00Oo0OOo0[0xC4BA ^ 0xC41D] = 0xC416 ^ 0xC41D;
                    MurderMystery.oOo00Oo0OOo0[0x5DBB ^ 0x5DDC] = 0x5DDC ^ 0x5DDC;
                    MurderMystery.oOo00Oo0OOo0[0x9176 ^ 0x9136] = 0x7FF6EE3 ^ 0x9136;
                    MurderMystery.oOo00Oo0OOo0[0x1A88 ^ 0x1B0E] = 0xD35B ^ 0x1B0E;
                    MurderMystery.oOo00Oo0OOo0[0x69B2 ^ 0x6998] = 0xFFFF967D ^ 0x6998;
                    n3 = 290912961;
                    continue block95;
                }
                case 290912961: {
                    MurderMystery.oOo00Oo0OOo0[0x3190 ^ 0x313F] = 0xFFFFCEE0 ^ 0x313F;
                    n3 = 1173412535;
                    continue block95;
                }
                case 1173412535: {
                    MurderMystery.oOo00Oo0OOo0[0x4955 ^ 0x4939] = 0x4930 ^ 0x4939;
                    MurderMystery.oOo00Oo0OOo0[0x64C1 ^ 0x6587] = 0xB7E4 ^ 0x6587;
                    MurderMystery.oOo00Oo0OOo0[0x5232 ^ 0x5310] = 0xBAD6 ^ 0x5310;
                    MurderMystery.oOo00Oo0OOo0[0xD193 ^ 0xD1FD] = 0xD1F8 ^ 0xD1FD;
                    MurderMystery.oOo00Oo0OOo0[0x974D ^ 0x9606] = 0x4601 ^ 0x9606;
                    MurderMystery.oOo00Oo0OOo0[0x5E79 ^ 0x5E34] = 0x5E0F ^ 0x5E34;
                    MurderMystery.oOo00Oo0OOo0[0x32FD ^ 0x3257] = 0x324C ^ 0x3257;
                    MurderMystery.oOo00Oo0OOo0[0xA70B ^ 0xA7FD] = 0x2972 ^ 0xA7FD;
                    MurderMystery.oOo00Oo0OOo0[0xEE19 ^ 0xEF9A] = 0x27DF ^ 0xEF9A;
                    n3 = 1930848565;
                    continue block95;
                }
                case 1930848565: {
                    MurderMystery.oOo00Oo0OOo0[0x8433 ^ 0x8488] = 0x5D488 ^ 0x8488;
                    MurderMystery.oOo00Oo0OOo0[0x2EE8 ^ 0x2EDC] = 0x2E97 ^ 0x2EDC;
                    n3 = -1596463300;
                    continue block95;
                }
                case -1596463300: {
                    MurderMystery.oOo00Oo0OOo0[0xC098 ^ 0xC1B3] = 0xA377 ^ 0xC1B3;
                    MurderMystery.oOo00Oo0OOo0[0x85CD ^ 0x84D5] = 0x5A3B ^ 0x84D5;
                    MurderMystery.oOo00Oo0OOo0[0xFEE4 ^ 0xFFA8] = 0x2FB8 ^ 0xFFA8;
                    MurderMystery.oOo00Oo0OOo0[0x10D16 ^ 0x10D94] = 0x10D9F ^ 0x10D94;
                    n3 = -1153484493;
                    continue block95;
                }
                case -1153484493: {
                    MurderMystery.oOo00Oo0OOo0[0x65F0 ^ 0x6522] = 0x653D ^ 0x6522;
                    MurderMystery.oOo00Oo0OOo0[0x108BC ^ 0x108C7] = 0x108C4 ^ 0x108C7;
                    MurderMystery.oOo00Oo0OOo0[0xFF6E ^ 0xFF6B] = 0x6CFEB ^ 0xFF6B;
                    MurderMystery.oOo00Oo0OOo0[0xA423 ^ 0xA547] = 0xA79 ^ 0xA547;
                    MurderMystery.oOo00Oo0OOo0[0xDC40 ^ 0xDC54] = 0xDC4F ^ 0xDC54;
                    MurderMystery.oOo00Oo0OOo0[0xCC7E ^ 0xCCD8] = 0xFC2D1518 ^ 0xCCD8;
                    MurderMystery.oOo00Oo0OOo0[0xB54 ^ 0xBE2] = 0xFFFFF477 ^ 0xBE2;
                    MurderMystery.oOo00Oo0OOo0[0x7B43 ^ 0x7BC3] = 0xFC007BC3 ^ 0x7BC3;
                    MurderMystery.oOo00Oo0OOo0[0xDAB7 ^ 0xDA7A] = 0xDA6F ^ 0xDA7A;
                    MurderMystery.oOo00Oo0OOo0[0x2FA ^ 0x265] = 0x213E265 ^ 0x265;
                    MurderMystery.oOo00Oo0OOo0[0xED09 ^ 0xEC88] = 0xFFFFC2FF ^ 0xEC88;
                    MurderMystery.oOo00Oo0OOo0[0x5F45 ^ 0x5FAF] = 0xFFFF8D45 ^ 0x5FAF;
                    MurderMystery.oOo00Oo0OOo0[0x67FD ^ 0x672A] = 0x672F ^ 0x672A;
                    MurderMystery.oOo00Oo0OOo0[0x54B5 ^ 0x55EC] = 0xBCA6 ^ 0x55EC;
                    MurderMystery.oOo00Oo0OOo0[0xE289 ^ 0xE3B1] = 0xEA66 ^ 0xE3B1;
                    MurderMystery.oOo00Oo0OOo0[0x9C53 ^ 0x9D62] = 0xFFFFBDEB ^ 0x9D62;
                    MurderMystery.oOo00Oo0OOo0[0x587 ^ 0x569] = 0xFFFF3E1D ^ 0x569;
                    MurderMystery.oOo00Oo0OOo0[0x59EB ^ 0x5864] = 0xB00B ^ 0x5864;
                    MurderMystery.oOo00Oo0OOo0[0x2C68 ^ 0x2CC4] = 0xFFFFD33B ^ 0x2CC4;
                    MurderMystery.oOo00Oo0OOo0[0x6BE8 ^ 0x6B23] = 0xFFFF94DC ^ 0x6B23;
                    MurderMystery.oOo00Oo0OOo0[0x4E4F ^ 0x4EC5] = 0x4EFB ^ 0x4EC5;
                    n3 = -1279291378;
                    continue block95;
                }
                case -1279291378: {
                    MurderMystery.oOo00Oo0OOo0[0xD5F0 ^ 0xD4FF] = 0x1D0AE ^ 0xD4FF;
                    n3 = -461574233;
                    continue block95;
                }
                case -461574233: {
                    MurderMystery.oOo00Oo0OOo0[0xEA98 ^ 0xEAB4] = 0xFFFF1503 ^ 0xEAB4;
                    MurderMystery.oOo00Oo0OOo0[0x73B3 ^ 0x738B] = 0x738E ^ 0x738B;
                    MurderMystery.oOo00Oo0OOo0[0x9EE0 ^ 0x9E67] = 0x23E589C7 ^ 0x9E67;
                    MurderMystery.oOo00Oo0OOo0[0xAB27 ^ 0xAB44] = 0xFFFF54BB ^ 0xAB44;
                    MurderMystery.oOo00Oo0OOo0[0xA19F ^ 0xA15B] = 0xA14A ^ 0xA15B;
                    n3 = -1972943138;
                    continue block95;
                }
                case -1972943138: {
                    MurderMystery.oOo00Oo0OOo0[0x98C7 ^ 0x99AA] = 0xFFFF315D ^ 0x99AA;
                    MurderMystery.oOo00Oo0OOo0[0x4925 ^ 0x48A7] = 0x9941 ^ 0x48A7;
                    MurderMystery.oOo00Oo0OOo0[0x82AC ^ 0x8255] = 0xA892 ^ 0x8255;
                    MurderMystery.oOo00Oo0OOo0[0x2108 ^ 0x2191] = 0x21CA ^ 0x2191;
                    MurderMystery.oOo00Oo0OOo0[0xF804 ^ 0xF97E] = 0x40ED ^ 0xF97E;
                    MurderMystery.oOo00Oo0OOo0[0x7ECA ^ 0x7FD3] = 0xA130 ^ 0x7FD3;
                    n3 = 747361745;
                    continue block95;
                }
                case 747361745: {
                    MurderMystery.oOo00Oo0OOo0[0xB6FB ^ 0xB665] = 0xB602 ^ 0xB665;
                    MurderMystery.oOo00Oo0OOo0[0xA3D5 ^ 0xA38B] = 0xFFFF5C74 ^ 0xA38B;
                    MurderMystery.oOo00Oo0OOo0[0x3984 ^ 0x38C6] = 0xD7AE ^ 0x38C6;
                    MurderMystery.oOo00Oo0OOo0[0x661 ^ 0x6DD] = 0x6C4 ^ 0x6DD;
                    MurderMystery.oOo00Oo0OOo0[0x7B38 ^ 0x7BE9] = 0x7BEC ^ 0x7BE9;
                    MurderMystery.oOo00Oo0OOo0[0xEB0E ^ 0xEBC4] = 0xEBE5 ^ 0xEBC4;
                    MurderMystery.oOo00Oo0OOo0[0x78BD ^ 0x7848] = 0xF6E1 ^ 0x7848;
                    MurderMystery.oOo00Oo0OOo0[0x1116 ^ 0x1115] = 0x5051410 ^ 0x1115;
                    n3 = 1715907144;
                    continue block95;
                }
                case 1715907144: {
                    MurderMystery.oOo00Oo0OOo0[0x7DDB ^ 0x7CEB] = 0xA3AD ^ 0x7CEB;
                    MurderMystery.oOo00Oo0OOo0[0x7E01 ^ 0x7F0F] = 0xFFFE84EC ^ 0x7F0F;
                    MurderMystery.oOo00Oo0OOo0[0xE228 ^ 0xE2B2] = 0xE2AD ^ 0xE2B2;
                    MurderMystery.oOo00Oo0OOo0[0x1D24 ^ 0x1C79] = 0xFFFF5E30 ^ 0x1C79;
                    MurderMystery.oOo00Oo0OOo0[0xBDA0 ^ 0xBD9F] = 0xBD94 ^ 0xBD9F;
                    MurderMystery.oOo00Oo0OOo0[0x81D4 ^ 0x81DA] = 0x5F75A6D7 ^ 0x81DA;
                    n3 = 1222093540;
                    continue block95;
                }
                case 1222093540: {
                    MurderMystery.oOo00Oo0OOo0[0xD154 ^ 0xD055] = 0x554B ^ 0xD055;
                    MurderMystery.oOo00Oo0OOo0[0x30D6 ^ 0x30EA] = 0xFFFFCF55 ^ 0x30EA;
                    MurderMystery.oOo00Oo0OOo0[0x379B ^ 0x36FE] = 0xFFFF667D ^ 0x36FE;
                    MurderMystery.oOo00Oo0OOo0[0x1890 ^ 0x189D] = 0xDE8018A6 ^ 0x189D;
                    MurderMystery.oOo00Oo0OOo0[0x8D02 ^ 0x8C1C] = 0xFFFFE36C ^ 0x8C1C;
                    MurderMystery.oOo00Oo0OOo0[0x3CB6 ^ 0x3C15] = 0x3C04 ^ 0x3C15;
                    MurderMystery.oOo00Oo0OOo0[0x9E40 ^ 0x9F6E] = 0xFDB8 ^ 0x9F6E;
                    MurderMystery.oOo00Oo0OOo0[0xE351 ^ 0xE272] = 0xF8A8 ^ 0xE272;
                    MurderMystery.oOo00Oo0OOo0[0x75F6 ^ 0x74C1] = 0x7D00 ^ 0x74C1;
                    n3 = -298782318;
                    continue block95;
                }
                case -298782318: {
                    MurderMystery.oOo00Oo0OOo0[0x4BCB ^ 0x4BB9] = 0x4BB9 ^ 0x4BB9;
                    n3 = -1491349208;
                    continue block95;
                }
                case -1491349208: {
                    MurderMystery.oOo00Oo0OOo0[0xD393 ^ 0xD34C] = 0xEB5D ^ 0xD34C;
                    MurderMystery.oOo00Oo0OOo0[0x8C34 ^ 0x8C65] = 0x8C48 ^ 0x8C65;
                    MurderMystery.oOo00Oo0OOo0[0x88DC ^ 0x89F5] = 0x9EFF ^ 0x89F5;
                    MurderMystery.oOo00Oo0OOo0[0x9662 ^ 0x9666] = 0xFFFF69BF ^ 0x9666;
                    MurderMystery.oOo00Oo0OOo0[0x9E14 ^ 0x9E48] = 0x9E5F ^ 0x9E48;
                    MurderMystery.oOo00Oo0OOo0[0x13D2 ^ 0x133D] = 0xD7E0 ^ 0x133D;
                    MurderMystery.oOo00Oo0OOo0[0x6C97 ^ 0x6DA4] = 0xB093 ^ 0x6DA4;
                    n3 = -162835831;
                    continue block95;
                }
                case -162835831: {
                    MurderMystery.oOo00Oo0OOo0[0xFBAA ^ 0xFBB0] = 0xF815E6EC ^ 0xFBB0;
                    MurderMystery.oOo00Oo0OOo0[0x3BE9 ^ 0x3B7D] = 0x3B62 ^ 0x3B7D;
                    MurderMystery.oOo00Oo0OOo0[0x4DD1 ^ 0x4CCD] = 0xDC60 ^ 0x4CCD;
                    n3 = -220591242;
                    continue block95;
                }
                case -220591242: {
                    MurderMystery.oOo00Oo0OOo0[0xB809 ^ 0xB80B] = 0xB822 ^ 0xB80B;
                    n3 = -2039467104;
                    continue block95;
                }
                case -2039467104: {
                    MurderMystery.oOo00Oo0OOo0[0xAE1C ^ 0xAF33] = 0x707A ^ 0xAF33;
                    MurderMystery.oOo00Oo0OOo0[0x1ECE ^ 0x1EF3] = 0xFFFFE14C ^ 0x1EF3;
                    MurderMystery.oOo00Oo0OOo0[0xC2A1 ^ 0xC280] = 0xDA6CCBE5 ^ 0xC280;
                    MurderMystery.oOo00Oo0OOo0[0x4315 ^ 0x4269] = 0xBFAC ^ 0x4269;
                    MurderMystery.oOo00Oo0OOo0[0xA01E ^ 0xA06E] = 0x66 ^ 0xA06E;
                    MurderMystery.oOo00Oo0OOo0[0x5E0B ^ 0x5EC8] = 0x5EC7 ^ 0x5EC8;
                    MurderMystery.oOo00Oo0OOo0[0x16F0 ^ 0x1782] = 0x3E74 ^ 0x1782;
                    MurderMystery.oOo00Oo0OOo0[0xA851 ^ 0xA932] = 0x602 ^ 0xA932;
                    n3 = -1920149601;
                    continue block95;
                }
                case -1920149601: {
                    MurderMystery.oOo00Oo0OOo0[0x456F ^ 0x4567] = 0x4570 ^ 0x4567;
                    MurderMystery.oOo00Oo0OOo0[0x10763 ^ 0x1077E] = 0xFFFEF8E1 ^ 0x1077E;
                    MurderMystery.oOo00Oo0OOo0[0x5942 ^ 0x5846] = 0xD6C7 ^ 0x5846;
                    n3 = -801121022;
                    continue block95;
                }
                case -801121022: {
                    MurderMystery.oOo00Oo0OOo0[0x7102 ^ 0x703D] = 0x9F53 ^ 0x703D;
                    MurderMystery.oOo00Oo0OOo0[0xCC21 ^ 0xCC0F] = 0xCC7F ^ 0xCC0F;
                    MurderMystery.oOo00Oo0OOo0[0xE57E ^ 0xE53B] = 0xFFFF1AD7 ^ 0xE53B;
                    n3 = -1753506635;
                    continue block95;
                }
                case -1753506635: {
                    MurderMystery.oOo00Oo0OOo0[0x8E07 ^ 0x8F26] = 0x66C0 ^ 0x8F26;
                    n3 = -1301576508;
                    continue block95;
                }
                case -1301576508: {
                    MurderMystery.oOo00Oo0OOo0[0x10093 ^ 0x10073] = 0x1CE98 ^ 0x10073;
                    MurderMystery.oOo00Oo0OOo0[0x10AB6 ^ 0x10A4E] = 0x12083 ^ 0x10A4E;
                    MurderMystery.oOo00Oo0OOo0[0x774E ^ 0x7604] = 0xB966 ^ 0x7604;
                    MurderMystery.oOo00Oo0OOo0[0x96FD ^ 0x962B] = 0x131CA ^ 0x962B;
                    MurderMystery.oOo00Oo0OOo0[0xB233 ^ 0xB376] = 0x6173 ^ 0xB376;
                    MurderMystery.oOo00Oo0OOo0[0x3088 ^ 0x31B4] = 0x4C34 ^ 0x31B4;
                    MurderMystery.oOo00Oo0OOo0[0x43C ^ 0x4B3] = 0x4BE ^ 0x4B3;
                    MurderMystery.oOo00Oo0OOo0[0x4A2A ^ 0x4A61] = 0x4A42 ^ 0x4A61;
                    MurderMystery.oOo00Oo0OOo0[0x2731 ^ 0x2720] = 0xFFFFD8D3 ^ 0x2720;
                    MurderMystery.oOo00Oo0OOo0[0xBD66 ^ 0xBC07] = 0xC6A ^ 0xBC07;
                    MurderMystery.oOo00Oo0OOo0[0x28DE ^ 0x2849] = 0x28EB ^ 0x2849;
                    MurderMystery.oOo00Oo0OOo0[0x5255 ^ 0x52C4] = 0xD8FDDD1D ^ 0x52C4;
                    MurderMystery.oOo00Oo0OOo0[0x10201 ^ 0x102E2] = 0x1CC09 ^ 0x102E2;
                    MurderMystery.oOo00Oo0OOo0[0x1912 ^ 0x19E6] = 0x9746 ^ 0x19E6;
                    MurderMystery.oOo00Oo0OOo0[0x3BD6 ^ 0x3B05] = 0x3B04 ^ 0x3B05;
                    n3 = -1771882626;
                    continue block95;
                }
                case -1771882626: {
                    MurderMystery.oOo00Oo0OOo0[0xEAD5 ^ 0xEA17] = 0xEA54 ^ 0xEA17;
                    MurderMystery.oOo00Oo0OOo0[0x10750 ^ 0x1074F] = 0xFFFEF8B0 ^ 0x1074F;
                    MurderMystery.oOo00Oo0OOo0[0xB031 ^ 0xB05E] = 0xFFFF4FA1 ^ 0xB05E;
                    MurderMystery.oOo00Oo0OOo0[0x1067A ^ 0x10693] = 0x12BEB ^ 0x10693;
                    MurderMystery.oOo00Oo0OOo0[0xDE9D ^ 0xDE79] = 0xA34C ^ 0xDE79;
                    MurderMystery.oOo00Oo0OOo0[0x8E4C ^ 0x8E6F] = 0x8E6E ^ 0x8E6F;
                    MurderMystery.oOo00Oo0OOo0[0xF542 ^ 0xF4CA] = 0x5358 ^ 0xF4CA;
                    n3 = 77151205;
                    continue block95;
                }
                case 77151205: {
                    MurderMystery.oOo00Oo0OOo0[0xB35B ^ 0xB3C6] = 0xB3F3 ^ 0xB3C6;
                    return;
                }
                default: {
                    MurderMystery.oOo00Oo0OOo0[0x10846 ^ 0x10931] = 0x1B0B3 ^ 0x10931;
                    MurderMystery.oOo00Oo0OOo0[0x9E2C ^ 0x9F17] = 0xE29B ^ 0x9F17;
                    MurderMystery.oOo00Oo0OOo0[0x6700 ^ 0x6616] = 0x3864 ^ 0x6616;
                    MurderMystery.oOo00Oo0OOo0[0x17CF ^ 0x17B6] = 0x745D0DCE ^ 0x17B6;
                    MurderMystery.oOo00Oo0OOo0[0xBF1C ^ 0xBF77] = 0xBF70 ^ 0xBF77;
                    n3 = 587439020;
                    continue block95;
                }
                case 587439020: {
                    MurderMystery.oOo00Oo0OOo0[0x875F ^ 0x8634] = 0xD17C ^ 0x8634;
                    MurderMystery.oOo00Oo0OOo0[0x3C83 ^ 0x3C8F] = 0x3C8A ^ 0x3C8F;
                    MurderMystery.oOo00Oo0OOo0[0xDDED ^ 0xDD44] = 0xFFFF22BB ^ 0xDD44;
                    MurderMystery.oOo00Oo0OOo0[0x89F6 ^ 0x88A9] = 0x388E ^ 0x88A9;
                    MurderMystery.oOo00Oo0OOo0[0xD21B ^ 0xD2C1] = 0xD2DE ^ 0xD2C1;
                    MurderMystery.oOo00Oo0OOo0[0x5CCF ^ 0x5C95] = 0xFFFFA36A ^ 0x5C95;
                    MurderMystery.oOo00Oo0OOo0[0x8065 ^ 0x803E] = 0x8037 ^ 0x803E;
                    MurderMystery.oOo00Oo0OOo0[0x3559 ^ 0x35A3] = 0xFFFFE089 ^ 0x35A3;
                    n3 = -1642888512;
                    continue block95;
                }
                case -1642888512: {
                    MurderMystery.oOo00Oo0OOo0[0x7C9B ^ 0x7C92] = 0x7C9B ^ 0x7C92;
                    MurderMystery.oOo00Oo0OOo0[0xB127 ^ 0xB0AB] = 0x367A ^ 0xB0AB;
                    MurderMystery.oOo00Oo0OOo0[0xA8C8 ^ 0xA98C] = 0x7BEF ^ 0xA98C;
                    n3 = -1839083125;
                    continue block95;
                }
                case -1839083125: {
                    MurderMystery.oOo00Oo0OOo0[0xBE01 ^ 0xBE42] = 0xBE59 ^ 0xBE42;
                    MurderMystery.oOo00Oo0OOo0[0x9B5A ^ 0x9B7D] = 0x9B48 ^ 0x9B7D;
                    MurderMystery.oOo00Oo0OOo0[0x9965 ^ 0x9862] = 0x16E1 ^ 0x9862;
                    MurderMystery.oOo00Oo0OOo0[0x9408 ^ 0x957E] = 0x93E4 ^ 0x957E;
                    MurderMystery.oOo00Oo0OOo0[0x7099 ^ 0x719B] = 0xFFFF0B28 ^ 0x719B;
                    MurderMystery.oOo00Oo0OOo0[0xF97A ^ 0xF9C9] = 0xF9C4 ^ 0xF9C9;
                    n3 = -1015819587;
                    continue block95;
                }
                case -1015819587: {
                    MurderMystery.oOo00Oo0OOo0[0x3D86 ^ 0x3D89] = 0x3D9E ^ 0x3D89;
                    MurderMystery.oOo00Oo0OOo0[0xB72E ^ 0xB7AB] = 0xB7A8 ^ 0xB7AB;
                    MurderMystery.oOo00Oo0OOo0[0xE24F ^ 0xE314] = 0x5ECC ^ 0xE314;
                    MurderMystery.oOo00Oo0OOo0[0xA79B ^ 0xA6D3] = 0x69B1 ^ 0xA6D3;
                    n3 = -743917342;
                    continue block95;
                }
                case -743917342: {
                    MurderMystery.oOo00Oo0OOo0[0x6065 ^ 0x610F] = 0x9490 ^ 0x610F;
                    MurderMystery.oOo00Oo0OOo0[0x3796 ^ 0x368D] = 0xE86E ^ 0x368D;
                    n3 = -651103007;
                    continue block95;
                }
                case -651103007: {
                    MurderMystery.oOo00Oo0OOo0[0xA5B3 ^ 0xA437] = 0x6C62 ^ 0xA437;
                    MurderMystery.oOo00Oo0OOo0[0x34AC ^ 0x34B9] = 0x34BC ^ 0x34B9;
                    MurderMystery.oOo00Oo0OOo0[0xC9C2 ^ 0xC8D1] = 0x5CBC ^ 0xC8D1;
                    n3 = -1600548240;
                    continue block95;
                }
                case -1600548240: {
                    MurderMystery.oOo00Oo0OOo0[0xE0CB ^ 0xE094] = 0xFFFF1F5D ^ 0xE094;
                    MurderMystery.oOo00Oo0OOo0[0xCE3E ^ 0xCF51] = 0xE6B8 ^ 0xCF51;
                    MurderMystery.oOo00Oo0OOo0[0x9543 ^ 0x9530] = 0x61FF6AEB ^ 0x9530;
                    n3 = 617880393;
                    continue block95;
                }
                case 617880393: {
                    MurderMystery.oOo00Oo0OOo0[0x3A7A ^ 0x3A48] = 0xFFFFC5B7 ^ 0x3A48;
                    n3 = -694392171;
                    continue block95;
                }
                case -694392171: {
                    MurderMystery.oOo00Oo0OOo0[0x7245 ^ 0x722F] = 0x7222 ^ 0x722F;
                    n3 = 1600865030;
                    continue block95;
                }
                case 1600865030: {
                    MurderMystery.oOo00Oo0OOo0[0xA6FA ^ 0xA693] = 0xA690 ^ 0xA693;
                    MurderMystery.oOo00Oo0OOo0[0xE8FB ^ 0xE899] = 0xFFFF1779 ^ 0xE899;
                    MurderMystery.oOo00Oo0OOo0[0xB12E ^ 0xB11D] = 0x58BF9491 ^ 0xB11D;
                    MurderMystery.oOo00Oo0OOo0[0x6496 ^ 0x65FF] = 0xFFFF6F97 ^ 0x65FF;
                    MurderMystery.oOo00Oo0OOo0[0x281D ^ 0x2851] = 0x5DDA86A ^ 0x2851;
                    n3 = -1661195680;
                    continue block95;
                }
                case -1661195680: {
                    MurderMystery.oOo00Oo0OOo0[0xCA36 ^ 0xCB42] = 0xCDD8 ^ 0xCB42;
                    MurderMystery.oOo00Oo0OOo0[0xB87B ^ 0xB978] = 0x3C66 ^ 0xB978;
                    MurderMystery.oOo00Oo0OOo0[0xCA82 ^ 0xCAFA] = 0x55559FAF ^ 0xCAFA;
                    MurderMystery.oOo00Oo0OOo0[0xBAFD ^ 0xBAEE] = 0xF4C94E47 ^ 0xBAEE;
                    MurderMystery.oOo00Oo0OOo0[0xA186 ^ 0xA15F] = 0x73EC0CBC ^ 0xA15F;
                    MurderMystery.oOo00Oo0OOo0[0x66AA ^ 0x6681] = 0x66C9 ^ 0x6681;
                    n3 = -494192484;
                    continue block95;
                }
                case -494192484: {
                    MurderMystery.oOo00Oo0OOo0[0xE245 ^ 0xE31F] = 0xA57 ^ 0xE31F;
                    MurderMystery.oOo00Oo0OOo0[0x54B3 ^ 0x545F] = 0x9081 ^ 0x545F;
                    MurderMystery.oOo00Oo0OOo0[0x4A ^ 0x104] = 0xD114 ^ 0x104;
                    MurderMystery.oOo00Oo0OOo0[0x8C44 ^ 0x8CC7] = 0x8DC7 ^ 0x8CC7;
                    MurderMystery.oOo00Oo0OOo0[0xC79B ^ 0xC783] = 0xC78C ^ 0xC783;
                    MurderMystery.oOo00Oo0OOo0[0xEBD ^ 0xE8C] = 0xE86 ^ 0xE8C;
                    n3 = 467869552;
                    continue block95;
                }
                case 467869552: {
                    MurderMystery.oOo00Oo0OOo0[0x465A ^ 0x466D] = 0x466D ^ 0x466D;
                    MurderMystery.oOo00Oo0OOo0[0x82FC ^ 0x83AD] = 0xFFFF38A7 ^ 0x83AD;
                    MurderMystery.oOo00Oo0OOo0[0xD6C8 ^ 0xD69B] = 0xD6B0 ^ 0xD69B;
                    MurderMystery.oOo00Oo0OOo0[0x390C ^ 0x39AC] = 0x39A5 ^ 0x39AC;
                    n3 = -465561611;
                    continue block95;
                }
                case -465561611: {
                    MurderMystery.oOo00Oo0OOo0[0x7969 ^ 0x7921] = 0xFFFF8658 ^ 0x7921;
                    MurderMystery.oOo00Oo0OOo0[0x4884 ^ 0x49CD] = 0xFFFF797A ^ 0x49CD;
                    MurderMystery.oOo00Oo0OOo0[0x8653 ^ 0x877E] = 0xE5C4 ^ 0x877E;
                    MurderMystery.oOo00Oo0OOo0[0x4C32 ^ 0x4C02] = 0xFFFFB3FD ^ 0x4C02;
                    n3 = -2014688706;
                    continue block95;
                }
                case -2014688706: {
                    MurderMystery.oOo00Oo0OOo0[0x8EAE ^ 0x8E3E] = 0x8E2D ^ 0x8E3E;
                    MurderMystery.oOo00Oo0OOo0[0xA9AF ^ 0xA96F] = 0xA960 ^ 0xA96F;
                    MurderMystery.oOo00Oo0OOo0[0xFFF7 ^ 0xFF32] = 0xFFFC8F1E ^ 0xFF32;
                    MurderMystery.oOo00Oo0OOo0[0x40FF ^ 0x41A1] = 0xFC7E ^ 0x41A1;
                    MurderMystery.oOo00Oo0OOo0[0xA13A ^ 0xA06A] = 0xE48E ^ 0xA06A;
                    MurderMystery.oOo00Oo0OOo0[0x7814 ^ 0x791C] = 0x69C0 ^ 0x791C;
                    MurderMystery.oOo00Oo0OOo0[0x8AA3 ^ 0x8BE0] = 0x599F ^ 0x8BE0;
                    MurderMystery.oOo00Oo0OOo0[0x60FF ^ 0x6186] = 0xFFFF2796 ^ 0x6186;
                    MurderMystery.oOo00Oo0OOo0[0x109A9 ^ 0x109B7] = 0x109BC ^ 0x109B7;
                    MurderMystery.oOo00Oo0OOo0[0x91BC ^ 0x90F3] = 0xD41D ^ 0x90F3;
                    n3 = -1415917829;
                    continue block95;
                }
                case -1415917829: {
                    MurderMystery.oOo00Oo0OOo0[0x6F9A ^ 0x6F4F] = 0x6F52 ^ 0x6F4F;
                    n3 = -881642454;
                    continue block95;
                }
                case -881642454: {
                    MurderMystery.oOo00Oo0OOo0[0x9E54 ^ 0x9F62] = 0x4257 ^ 0x9F62;
                    n3 = 1142970967;
                    continue block95;
                }
                case 1142970967: {
                    MurderMystery.oOo00Oo0OOo0[0xA83F ^ 0xA87D] = 0xFFFF579A ^ 0xA87D;
                    n3 = -1680286423;
                    continue block95;
                }
                case -1680286423: {
                    MurderMystery.oOo00Oo0OOo0[0xB1C0 ^ 0xB0E6] = 0xAA26 ^ 0xB0E6;
                    n3 = -2021731987;
                    continue block95;
                }
                case -2021731987: {
                    MurderMystery.oOo00Oo0OOo0[0xA3B8 ^ 0xA2A5] = 0x320C ^ 0xA2A5;
                    n3 = 1595019636;
                    continue block95;
                }
                case 1595019636: {
                    MurderMystery.oOo00Oo0OOo0[0xD3BE ^ 0xD3D6] = 0xD3D6 ^ 0xD3D6;
                    MurderMystery.oOo00Oo0OOo0[0x9345 ^ 0x93B8] = 0x3373 ^ 0x93B8;
                    MurderMystery.oOo00Oo0OOo0[0x25FF ^ 0x24ED] = 0xFFFF4F12 ^ 0x24ED;
                    MurderMystery.oOo00Oo0OOo0[0x8AC0 ^ 0x8AD0] = 0x8AD9 ^ 0x8AD0;
                    n3 = -222962108;
                    continue block95;
                }
                case -222962108: {
                    MurderMystery.oOo00Oo0OOo0[0x625C ^ 0x631D] = 0x8C49 ^ 0x631D;
                    MurderMystery.oOo00Oo0OOo0[0x4537 ^ 0x443E] = 0x54EC ^ 0x443E;
                    MurderMystery.oOo00Oo0OOo0[0x6804 ^ 0x6888] = 0x45666C41 ^ 0x6888;
                    MurderMystery.oOo00Oo0OOo0[0x90D4 ^ 0x91C4] = 0x5AC ^ 0x91C4;
                    n3 = 692180710;
                    continue block95;
                }
                case 692180710: {
                    MurderMystery.oOo00Oo0OOo0[0x93C1 ^ 0x936A] = 0x933B ^ 0x936A;
                    MurderMystery.oOo00Oo0OOo0[0x7E1A ^ 0x7EB2] = 0xFFFF810F ^ 0x7EB2;
                    MurderMystery.oOo00Oo0OOo0[0x5A4 ^ 0x480] = 0x1E40 ^ 0x480;
                    n3 = -1409474277;
                    continue block95;
                }
                case -1409474277: {
                    MurderMystery.oOo00Oo0OOo0[0x6028 ^ 0x617B] = 0x30B9 ^ 0x617B;
                    MurderMystery.oOo00Oo0OOo0[0x14D8 ^ 0x1580] = 0xFCC8 ^ 0x1580;
                    MurderMystery.oOo00Oo0OOo0[0x5C4F ^ 0x5C93] = 0x5C92 ^ 0x5C93;
                    MurderMystery.oOo00Oo0OOo0[0x6915 ^ 0x689F] = 0xCF0D ^ 0x689F;
                    MurderMystery.oOo00Oo0OOo0[0x403F ^ 0x4005] = 0x401E ^ 0x4005;
                    MurderMystery.oOo00Oo0OOo0[0x8322 ^ 0x8251] = 0x84DE ^ 0x8251;
                    MurderMystery.oOo00Oo0OOo0[0xC0E0 ^ 0xC1B5] = 0xFFFF6FFB ^ 0xC1B5;
                    MurderMystery.oOo00Oo0OOo0[0x4B10 ^ 0x4B0B] = 0xFFFFB486 ^ 0x4B0B;
                    n3 = -1678502760;
                    continue block95;
                }
                case -1678502760: {
                    MurderMystery.oOo00Oo0OOo0[0xFAC5 ^ 0xFB85] = 0x14ED ^ 0xFB85;
                    MurderMystery.oOo00Oo0OOo0[0x8BFC ^ 0x8BE5] = 0xFFFF7462 ^ 0x8BE5;
                    n3 = 1599261199;
                    continue block95;
                }
                case 1599261199: {
                    MurderMystery.oOo00Oo0OOo0[0x2DA0 ^ 0x2D6F] = 0x6D52F ^ 0x2D6F;
                    MurderMystery.oOo00Oo0OOo0[0x9E6B ^ 0x9E24] = 0x9E2B ^ 0x9E24;
                    MurderMystery.oOo00Oo0OOo0[0x109CB ^ 0x109D9] = 0x690799B0 ^ 0x109D9;
                    MurderMystery.oOo00Oo0OOo0[0xB4F6 ^ 0xB44C] = 0xB45B ^ 0xB44C;
                    MurderMystery.oOo00Oo0OOo0[0x96B3 ^ 0x962B] = 0xFFFF69D2 ^ 0x962B;
                    n3 = 956250575;
                    continue block95;
                }
                case 956250575: {
                    MurderMystery.oOo00Oo0OOo0[0x7DB0 ^ 0x7D3E] = 0xFFFF82C3 ^ 0x7D3E;
                    n3 = -1297035717;
                    continue block95;
                }
                case -1297035717: {
                    MurderMystery.oOo00Oo0OOo0[0x45F3 ^ 0x45B7] = 0x45B2 ^ 0x45B7;
                    n3 = -1935507714;
                    continue block95;
                }
                case -1935507714: {
                    MurderMystery.oOo00Oo0OOo0[0xF944 ^ 0xF97D] = 0xF966 ^ 0xF97D;
                    MurderMystery.oOo00Oo0OOo0[0x7B90 ^ 0x7B6B] = 0x51AC ^ 0x7B6B;
                    n3 = 1873781694;
                    continue block95;
                }
                case 1873781694: {
                    MurderMystery.oOo00Oo0OOo0[0x860D ^ 0x866D] = 0x8670 ^ 0x866D;
                    n3 = 1728939160;
                    continue block95;
                }
                case 1728939160: {
                    MurderMystery.oOo00Oo0OOo0[0x8EC1 ^ 0x8FF8] = 0x8668 ^ 0x8FF8;
                    MurderMystery.oOo00Oo0OOo0[0xCE09 ^ 0xCF65] = 0x982C ^ 0xCF65;
                    MurderMystery.oOo00Oo0OOo0[0x3B78 ^ 0x3B0E] = 0x3B17 ^ 0x3B0E;
                    MurderMystery.oOo00Oo0OOo0[0x418D ^ 0x41CB] = 0x41AA ^ 0x41CB;
                    MurderMystery.oOo00Oo0OOo0[0xDA79 ^ 0xDA2F] = 0xDA3C ^ 0xDA2F;
                    MurderMystery.oOo00Oo0OOo0[0xF5D2 ^ 0xF520] = 0x4B83 ^ 0xF520;
                    MurderMystery.oOo00Oo0OOo0[0x28BA ^ 0x284A] = 0x96E3 ^ 0x284A;
                    n3 = -1434520896;
                    continue block95;
                }
                case -1434520896: {
                    MurderMystery.oOo00Oo0OOo0[0xC0A8 ^ 0xC126] = 0x47F7 ^ 0xC126;
                    MurderMystery.oOo00Oo0OOo0[0xBBB5 ^ 0xBB05] = 0x45744FA ^ 0xBB05;
                    n3 = 1324266295;
                    continue block95;
                }
                case 1324266295: {
                    MurderMystery.oOo00Oo0OOo0[0x2BD6 ^ 0x2BAB] = 0xFFFFD430 ^ 0x2BAB;
                    MurderMystery.oOo00Oo0OOo0[0x16D4 ^ 0x16B5] = 0xFFFFE976 ^ 0x16B5;
                    MurderMystery.oOo00Oo0OOo0[0x37B2 ^ 0x3637] = 0xFFFF01B3 ^ 0x3637;
                    MurderMystery.oOo00Oo0OOo0[0xA796 ^ 0xA696] = 0x2389 ^ 0xA696;
                    MurderMystery.oOo00Oo0OOo0[0x4F2F ^ 0x4FC2] = 0x8B1F ^ 0x4FC2;
                    MurderMystery.oOo00Oo0OOo0[0x96F7 ^ 0x9629] = 0xAE28 ^ 0x9629;
                    MurderMystery.oOo00Oo0OOo0[0xBFF9 ^ 0xBF83] = 0xBF88 ^ 0xBF83;
                    MurderMystery.oOo00Oo0OOo0[0x29AA ^ 0x29AA] = 0xFFFDE7CB ^ 0x29AA;
                    MurderMystery.oOo00Oo0OOo0[0xBFB4 ^ 0xBEAE] = 0x6078 ^ 0xBEAE;
                    MurderMystery.oOo00Oo0OOo0[0xF88D ^ 0xF8F3] = 0xF8E8 ^ 0xF8F3;
                    n3 = -824225065;
                    continue block95;
                }
                case -824225065: {
                    MurderMystery.oOo00Oo0OOo0[0x901 ^ 0x87A] = 0xF5BC ^ 0x87A;
                    n3 = 2077234355;
                    continue block95;
                }
                case 2077234355: {
                    MurderMystery.oOo00Oo0OOo0[0x5C78 ^ 0x5C9A] = 0xFFFF6DB8 ^ 0x5C9A;
                    n3 = 1488321760;
                    continue block95;
                }
                case 1488321760: {
                    MurderMystery.oOo00Oo0OOo0[0x90BD ^ 0x91DD] = 0x21F3 ^ 0x91DD;
                    MurderMystery.oOo00Oo0OOo0[0x5280 ^ 0x52CA] = 0x52F5 ^ 0x52CA;
                    MurderMystery.oOo00Oo0OOo0[0x1900 ^ 0x1862] = 0xA84C ^ 0x1862;
                    MurderMystery.oOo00Oo0OOo0[0xF120 ^ 0xF1B2] = 0xFFFF0E4E ^ 0xF1B2;
                    MurderMystery.oOo00Oo0OOo0[0x71BC ^ 0x7170] = 0xFFFF768F ^ 0x7170;
                    n3 = 1673410036;
                    continue block95;
                }
                case 1673410036: {
                    MurderMystery.oOo00Oo0OOo0[0x5951 ^ 0x5874] = 0x4297 ^ 0x5874;
                    n3 = -541343145;
                    continue block95;
                }
                case -541343145: {
                    MurderMystery.oOo00Oo0OOo0[0x3DC6 ^ 0x3D20] = 0xFFFFBFC5 ^ 0x3D20;
                    MurderMystery.oOo00Oo0OOo0[0x2D3D ^ 0x2D48] = 0xC71C5C8F ^ 0x2D48;
                    MurderMystery.oOo00Oo0OOo0[0xFC8C ^ 0xFDD8] = 0xAC11 ^ 0xFDD8;
                    n3 = -663462501;
                    continue block95;
                }
                case -663462501: {
                    MurderMystery.oOo00Oo0OOo0[0x90C1 ^ 0x90A4] = 0x90A4 ^ 0x90A4;
                    n3 = 471522393;
                    continue block95;
                }
                case 471522393: {
                    MurderMystery.oOo00Oo0OOo0[0x435A ^ 0x425C] = 0xCCA8 ^ 0x425C;
                    n3 = 1971023887;
                    continue block95;
                }
                case 1971023887: {
                    MurderMystery.oOo00Oo0OOo0[0x656A ^ 0x65E3] = 0x65A0 ^ 0x65E3;
                    MurderMystery.oOo00Oo0OOo0[0xA369 ^ 0xA20E] = 0x5782 ^ 0xA20E;
                    n3 = 1281726186;
                    continue block95;
                }
                case 1281726186: {
                    MurderMystery.oOo00Oo0OOo0[0x4A83 ^ 0x4BFE] = 0xB636 ^ 0x4BFE;
                    MurderMystery.oOo00Oo0OOo0[0x40F ^ 0x4AE] = 0x4B9 ^ 0x4AE;
                    MurderMystery.oOo00Oo0OOo0[0xBD75 ^ 0xBD7E] = 0xBD65 ^ 0xBD7E;
                    n3 = -99147590;
                    continue block95;
                }
                case -99147590: {
                    MurderMystery.oOo00Oo0OOo0[0x417F ^ 0x4163] = 0xFFFFBE82 ^ 0x4163;
                    MurderMystery.oOo00Oo0OOo0[0x5467 ^ 0x5420] = 0x23026403 ^ 0x5420;
                    MurderMystery.oOo00Oo0OOo0[0x1158 ^ 0x11E9] = 0xFFFFEE16 ^ 0x11E9;
                    MurderMystery.oOo00Oo0OOo0[0x18A0 ^ 0x189E] = 0x188B ^ 0x189E;
                    MurderMystery.oOo00Oo0OOo0[0xBA3A ^ 0xBA7B] = 0xFFFF45AE ^ 0xBA7B;
                    MurderMystery.oOo00Oo0OOo0[0x1ED7 ^ 0x1E30] = 0x630E ^ 0x1E30;
                    n3 = 299475753;
                    continue block95;
                }
                case 299475753: {
                    MurderMystery.oOo00Oo0OOo0[0x1D81 ^ 0x1CBB] = 0x156C ^ 0x1CBB;
                    MurderMystery.oOo00Oo0OOo0[0x573A ^ 0x5637] = 0x15266 ^ 0x5637;
                    MurderMystery.oOo00Oo0OOo0[0xF97F ^ 0xF841] = 0x85C1 ^ 0xF841;
                    n3 = 2024718762;
                    continue block95;
                }
                case 2024718762: {
                    MurderMystery.oOo00Oo0OOo0[0xD24F ^ 0xD23E] = 0x1FF2 ^ 0xD23E;
                    MurderMystery.oOo00Oo0OOo0[0x109FA ^ 0x1097E] = 0x1097F ^ 0x1097E;
                    MurderMystery.oOo00Oo0OOo0[0xAABE ^ 0xAA25] = 0xAA24 ^ 0xAA25;
                    MurderMystery.oOo00Oo0OOo0[0x145 ^ 0x49] = 0x1041F ^ 0x49;
                    MurderMystery.oOo00Oo0OOo0[0x1B57 ^ 0x1A7F] = 0xD6B ^ 0x1A7F;
                    n3 = 235240835;
                    continue block95;
                }
                case 235240835: {
                    MurderMystery.oOo00Oo0OOo0[0x10DBB ^ 0x10C3B] = 0x1DDDD ^ 0x10C3B;
                    n3 = 928567002;
                    continue block95;
                }
                case 928567002: {
                    MurderMystery.oOo00Oo0OOo0[0x134E ^ 0x1300] = 0x1311 ^ 0x1300;
                    n3 = -622700168;
                    continue block95;
                }
                case -622700168: {
                    MurderMystery.oOo00Oo0OOo0[0x271D ^ 0x27A9] = 0x27C2 ^ 0x27A9;
                    MurderMystery.oOo00Oo0OOo0[0x2DC4 ^ 0x2C43] = 0x8BCA ^ 0x2C43;
                    MurderMystery.oOo00Oo0OOo0[0x9BC9 ^ 0x9B77] = 0xFCFC678A ^ 0x9B77;
                    MurderMystery.oOo00Oo0OOo0[0xE849 ^ 0xE95E] = 0xB73E ^ 0xE95E;
                    MurderMystery.oOo00Oo0OOo0[0xCBEC ^ 0xCA84] = 0x3F1B ^ 0xCA84;
                    MurderMystery.oOo00Oo0OOo0[0x4E2 ^ 0x41D] = 0xA4D6 ^ 0x41D;
                    MurderMystery.oOo00Oo0OOo0[0xC6EB ^ 0xC61C] = 0x48B5 ^ 0xC61C;
                    MurderMystery.oOo00Oo0OOo0[0x6B28 ^ 0x6A65] = 0xFFFF4585 ^ 0x6A65;
                    MurderMystery.oOo00Oo0OOo0[0x33E ^ 0x219] = 0x1514 ^ 0x219;
                    MurderMystery.oOo00Oo0OOo0[0xC56D ^ 0xC548] = 0xC28F9961 ^ 0xC548;
                    MurderMystery.oOo00Oo0OOo0[0x1E88 ^ 0x1E5C] = 0xDCFDD181 ^ 0x1E5C;
                    MurderMystery.oOo00Oo0OOo0[0xF763 ^ 0xF705] = 0xF705 ^ 0xF705;
                    n3 = 1642736440;
                    continue block95;
                }
                case 1642736440: {
                    MurderMystery.oOo00Oo0OOo0[0xC71C ^ 0xC7ED] = 0x794C ^ 0xC7ED;
                    n3 = 1838979472;
                    continue block95;
                }
                case 1838979472: {
                    MurderMystery.oOo00Oo0OOo0[0x6FE7 ^ 0x6FCF] = 0x6FD4 ^ 0x6FCF;
                    MurderMystery.oOo00Oo0OOo0[0x6FA7 ^ 0x6FF3] = 0x9882D6C2 ^ 0x6FF3;
                    MurderMystery.oOo00Oo0OOo0[0x799F ^ 0x79CF] = 0xC0D4BEB4 ^ 0x79CF;
                    MurderMystery.oOo00Oo0OOo0[0x6AC9 ^ 0x6B40] = 0xCC8B ^ 0x6B40;
                    n3 = 1258834030;
                    continue block95;
                }
                case 1258834030: {
                    MurderMystery.oOo00Oo0OOo0[0x39D5 ^ 0x39A2] = 0x39A5 ^ 0x39A2;
                    n3 = -1412899430;
                    continue block95;
                }
                case -1412899430: {
                    MurderMystery.oOo00Oo0OOo0[0x8BB3 ^ 0x8B9A] = 0x8B9F ^ 0x8B9A;
                    n3 = -762147565;
                    continue block95;
                }
                case -762147565: {
                    MurderMystery.oOo00Oo0OOo0[0xF16B ^ 0xF18A] = 0x3F61 ^ 0xF18A;
                    MurderMystery.oOo00Oo0OOo0[0xDFCB ^ 0xDF69] = 0xDF66 ^ 0xDF69;
                    n3 = -1533483859;
                    continue block95;
                }
                case -1533483859: {
                    MurderMystery.oOo00Oo0OOo0[0xDCA2 ^ 0xDC82] = 0xDF57 ^ 0xDC82;
                    MurderMystery.oOo00Oo0OOo0[0x9C8D ^ 0x9C3A] = 0xFFFF63C5 ^ 0x9C3A;
                    MurderMystery.oOo00Oo0OOo0[0x6E9E ^ 0x6FEE] = 0x4618 ^ 0x6FEE;
                    MurderMystery.oOo00Oo0OOo0[0x6EF4 ^ 0x6E59] = 0x6E4C ^ 0x6E59;
                    MurderMystery.oOo00Oo0OOo0[0xF04A ^ 0xF14F] = 0x7FCC ^ 0xF14F;
                    MurderMystery.oOo00Oo0OOo0[0xBAA7 ^ 0xBA03] = 0x61F21EB8 ^ 0xBA03;
                    MurderMystery.oOo00Oo0OOo0[0x5FA6 ^ 0x5F67] = 0x5F76 ^ 0x5F67;
                    MurderMystery.oOo00Oo0OOo0[0x2702 ^ 0x2708] = 0x276B ^ 0x2708;
                    MurderMystery.oOo00Oo0OOo0[0x100C3 ^ 0x1014E] = 0x187F2 ^ 0x1014E;
                    n3 = -1842626617;
                    continue block95;
                }
                case -1842626617: 
            }
            MurderMystery.oOo00Oo0OOo0[0xF1D9 ^ 0xF1EC] = 0xFFFF0E4F ^ 0xF1EC;
            MurderMystery.oOo00Oo0OOo0[0x221D ^ 0x230C] = 0xB761 ^ 0x230C;
            MurderMystery.oOo00Oo0OOo0[0x6C42 ^ 0x6C99] = 0x6C98 ^ 0x6C99;
            MurderMystery.oOo00Oo0OOo0[0xBC43 ^ 0xBC1B] = 0xBC1A ^ 0xBC1B;
            MurderMystery.oOo00Oo0OOo0[0x10D86 ^ 0x10D91] = 0x10D80 ^ 0x10D91;
            MurderMystery.oOo00Oo0OOo0[0x2B07 ^ 0x2BBF] = 0x2BAE ^ 0x2BBF;
            n3 = -1058993297;
        }
    }
}

