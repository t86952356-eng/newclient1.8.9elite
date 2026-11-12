/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.eh;
import net.minecraft.network.play.client.e;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GrimMode
extends Mode<LongJump> {
    public /* synthetic */ int LA;
    public /* synthetic */ double Lu;
    public /* synthetic */ int Lz;
    @EventLink
    public /* synthetic */ Listener<PacketReceiveEvent> LD;
    public /* synthetic */ int hV;
    private static /* synthetic */ int[] q0OOOoo00o0;
    @EventLink
    public /* synthetic */ Listener<PacketSendEvent> LE;
    public /* synthetic */ int Lw;
    public /* synthetic */ int Lv;
    @EventLink
    public /* synthetic */ Listener<eh> LC;
    public /* synthetic */ int Ly;
    public /* synthetic */ int Lx;
    @EventLink
    public /* synthetic */ Listener<PreMotionEvent> LB;
    private static /* synthetic */ int Oo0o00000O00;
    private static /* synthetic */ boolean oO00O0OO0ooO;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void o0Oo000O0oO() {
        int n2 = -1651502640;
        if (n2 != n2) {
            n2 = 15;
        }
        int n3 = 1632337041;
        block30: while (true) {
            switch (n3) {
                case 1916776295: {
                    GrimMode.q0OOOoo00o0[0xEEF4 ^ 0xEE80] = 0xEE9D ^ 0xEE80;
                    GrimMode.q0OOOoo00o0[0x27FE ^ 0x27A7] = 0x27B0 ^ 0x27A7;
                    GrimMode.q0OOOoo00o0[0x5C93 ^ 0x5C11] = 0xFFFFA31E ^ 0x5C11;
                    n3 = -30800199;
                    continue block30;
                }
                case -30800199: {
                    GrimMode.q0OOOoo00o0[0xCAA0 ^ 0xCAE3] = 0xCAFA ^ 0xCAE3;
                    GrimMode.q0OOOoo00o0[0xB104 ^ 0xB174] = 0xB145 ^ 0xB174;
                    GrimMode.q0OOOoo00o0[0xEED5 ^ 0xEE51] = 0xEE52 ^ 0xEE51;
                    GrimMode.q0OOOoo00o0[0x2EA8 ^ 0x2EF0] = 0x2EF7 ^ 0x2EF0;
                    GrimMode.q0OOOoo00o0[0x105AF ^ 0x105F8] = 0x105E1 ^ 0x105F8;
                    GrimMode.q0OOOoo00o0[0xA475 ^ 0xA423] = 0xA423 ^ 0xA423;
                    GrimMode.q0OOOoo00o0[0x31D8 ^ 0x31D0] = 0x2B1D95B1 ^ 0x31D0;
                    GrimMode.q0OOOoo00o0[0xDC48 ^ 0xDC6C] = 0xFFFF2395 ^ 0xDC6C;
                    GrimMode.q0OOOoo00o0[0xA804 ^ 0xA810] = 0xA82F ^ 0xA810;
                    n3 = 1346783063;
                    continue block30;
                }
                case 1346783063: {
                    GrimMode.q0OOOoo00o0[0x7067 ^ 0x7047] = 0x7046 ^ 0x7047;
                    GrimMode.q0OOOoo00o0[0xADF5 ^ 0xADFE] = 0xADE1 ^ 0xADFE;
                    GrimMode.q0OOOoo00o0[0x1CC4 ^ 0x1CFC] = 0x1CA1 ^ 0x1CFC;
                    GrimMode.q0OOOoo00o0[0x146A ^ 0x142C] = 0xFFFFEBD2 ^ 0x142C;
                    GrimMode.q0OOOoo00o0[0xAFF6 ^ 0xAFF8] = 0xAFED ^ 0xAFF8;
                    n3 = -77214780;
                    continue block30;
                }
                case -77214780: {
                    GrimMode.q0OOOoo00o0[0x1DE6 ^ 0x1DF7] = 0xFFFFE208 ^ 0x1DF7;
                    GrimMode.q0OOOoo00o0[0x6793 ^ 0x6789] = 0x6792 ^ 0x6789;
                    GrimMode.q0OOOoo00o0[0x820B ^ 0x8228] = 0x6DB65945 ^ 0x8228;
                    GrimMode.q0OOOoo00o0[0x1B8F ^ 0x1BFA] = 0x1BD5 ^ 0x1BFA;
                    GrimMode.q0OOOoo00o0[0x9E61 ^ 0x9E5A] = 0x9E53 ^ 0x9E5A;
                    GrimMode.q0OOOoo00o0[0x6C54 ^ 0x6C69] = 0xFFFF9396 ^ 0x6C69;
                    GrimMode.q0OOOoo00o0[0x96B ^ 0x90C] = 0x7FFFF684 ^ 0x90C;
                    GrimMode.q0OOOoo00o0[0xD8E2 ^ 0xD862] = 0xFFFF279D ^ 0xD862;
                    n3 = -668747152;
                    continue block30;
                }
                case -668747152: {
                    return;
                }
                default: {
                    q0OOOoo00o0 = new int[0x93EB ^ 0x936D];
                    GrimMode.q0OOOoo00o0[0x97B6 ^ 0x9794] = 0x8AF8381F ^ 0x9794;
                    n3 = -553856246;
                    continue block30;
                }
                case -553856246: {
                    GrimMode.q0OOOoo00o0[0xC3B2 ^ 0xC3D3] = 0xC3C8 ^ 0xC3D3;
                    GrimMode.q0OOOoo00o0[0x57B7 ^ 0x5780] = 0x5787 ^ 0x5780;
                    GrimMode.q0OOOoo00o0[0x9E84 ^ 0x9ED5] = 0x9ED6 ^ 0x9ED5;
                    GrimMode.q0OOOoo00o0[0xDF66 ^ 0xDF09] = 0x6FD0346E ^ 0xDF09;
                    n3 = -681889304;
                    continue block30;
                }
                case -681889304: {
                    GrimMode.q0OOOoo00o0[0xFDD6 ^ 0xFDFC] = 0xC0FCF23D ^ 0xFDFC;
                    n3 = -921322731;
                    continue block30;
                }
                case -921322731: {
                    GrimMode.q0OOOoo00o0[0x1252 ^ 0x125D] = 0x1236 ^ 0x125D;
                    GrimMode.q0OOOoo00o0[0x7FF4 ^ 0x7FD5] = 0x7FF6 ^ 0x7FD5;
                    n3 = 116544065;
                    continue block30;
                }
                case 116544065: {
                    GrimMode.q0OOOoo00o0[0xA5B0 ^ 0xA5A3] = 0xFFFF5A4C ^ 0xA5A3;
                    GrimMode.q0OOOoo00o0[0x9620 ^ 0x9653] = 0x965E ^ 0x9653;
                    n3 = -731335725;
                    continue block30;
                }
                case -731335725: {
                    GrimMode.q0OOOoo00o0[0x5D2A ^ 0x5D4C] = 0xFFFFA283 ^ 0x5D4C;
                    GrimMode.q0OOOoo00o0[0x10E4A ^ 0x10E2F] = 0x381D0028 ^ 0x10E2F;
                    GrimMode.q0OOOoo00o0[0xB19B ^ 0xB1C0] = 0xFFFF7606 ^ 0xB1C0;
                    GrimMode.q0OOOoo00o0[0x10104 ^ 0x1016E] = 0x10177 ^ 0x1016E;
                    GrimMode.q0OOOoo00o0[0xE2CD ^ 0xE28A] = 0xE28B ^ 0xE28A;
                    GrimMode.q0OOOoo00o0[0xCE10 ^ 0xCE72] = 0xCE77 ^ 0xCE72;
                    GrimMode.q0OOOoo00o0[0xC760 ^ 0xC76D] = 0xC766 ^ 0xC76D;
                    GrimMode.q0OOOoo00o0[0x8CB1 ^ 0x8CE4] = 0xEB2F5257 ^ 0x8CE4;
                    n3 = 801299444;
                    continue block30;
                }
                case 801299444: {
                    GrimMode.q0OOOoo00o0[0x42F9 ^ 0x429A] = 0x42CD ^ 0x429A;
                    n3 = -1354751611;
                    continue block30;
                }
                case -1354751611: {
                    GrimMode.q0OOOoo00o0[0xB9EF ^ 0xB992] = 0xAB8B6D8D ^ 0xB992;
                    GrimMode.q0OOOoo00o0[0xC859 ^ 0xC8DC] = 0xC8C1 ^ 0xC8DC;
                    GrimMode.q0OOOoo00o0[0x153F ^ 0x1522] = 0x1571 ^ 0x1522;
                    n3 = 2093512705;
                    continue block30;
                }
                case 2093512705: {
                    GrimMode.q0OOOoo00o0[0x21C4 ^ 0x21F1] = 0x2182 ^ 0x21F1;
                    GrimMode.q0OOOoo00o0[0x9BA4 ^ 0x9BCF] = 0x9BC8 ^ 0x9BCF;
                    GrimMode.q0OOOoo00o0[0x9CEE ^ 0x9CA1] = 0xFFFF6340 ^ 0x9CA1;
                    GrimMode.q0OOOoo00o0[0x1A20 ^ 0x1A6B] = 0xFFFFE5CE ^ 0x1A6B;
                    n3 = -1370218307;
                    continue block30;
                }
                case -1370218307: {
                    GrimMode.q0OOOoo00o0[0x93F6 ^ 0x93DE] = 0x93DF ^ 0x93DE;
                    GrimMode.q0OOOoo00o0[0xD0ED ^ 0xD089] = 0x5E0AA3A9 ^ 0xD089;
                    GrimMode.q0OOOoo00o0[0xFF89 ^ 0xFFD7] = 0xFFC0 ^ 0xFFD7;
                    GrimMode.q0OOOoo00o0[0xB56A ^ 0xB56F] = 0xB56F ^ 0xB56F;
                    n3 = -863273518;
                    continue block30;
                }
                case -863273518: {
                    GrimMode.q0OOOoo00o0[0x8A25 ^ 0x8AA6] = 0xFFFF7509 ^ 0x8AA6;
                    GrimMode.q0OOOoo00o0[0x5E7C ^ 0x5E7B] = 0xFAFAA480 ^ 0x5E7B;
                    GrimMode.q0OOOoo00o0[0x5F1E ^ 0x5F31] = 0xFFFFA0D4 ^ 0x5F31;
                    GrimMode.q0OOOoo00o0[0x35C0 ^ 0x358A] = 0xFFFFCA75 ^ 0x358A;
                    GrimMode.q0OOOoo00o0[0x28E5 ^ 0x28F5] = 0x8D2884B6 ^ 0x28F5;
                    GrimMode.q0OOOoo00o0[0x2D9D ^ 0x2DD3] = 0xFFFFD22C ^ 0x2DD3;
                    n3 = 277948058;
                    continue block30;
                }
                case 277948058: {
                    GrimMode.q0OOOoo00o0[0xBE97 ^ 0xBEA4] = 0xBEEF ^ 0xBEA4;
                    n3 = -91832975;
                    continue block30;
                }
                case -91832975: {
                    GrimMode.q0OOOoo00o0[0x2A65 ^ 0x2A5C] = 0xFFFFD5E3 ^ 0x2A5C;
                    GrimMode.q0OOOoo00o0[0xE4EA ^ 0xE4FF] = 0xE4F4 ^ 0xE4FF;
                    GrimMode.q0OOOoo00o0[0x10759 ^ 0x10710] = 0x2FD3FA3E ^ 0x10710;
                    GrimMode.q0OOOoo00o0[0xADF8 ^ 0xAD8F] = 0xFFFF522A ^ 0xAD8F;
                    GrimMode.q0OOOoo00o0[0x2E46 ^ 0x2E3C] = 0xEA0E8ED6 ^ 0x2E3C;
                    GrimMode.q0OOOoo00o0[0xBA91 ^ 0xBADD] = 0xBA90 ^ 0xBADD;
                    GrimMode.q0OOOoo00o0[0x6859 ^ 0x684E] = 0xFFFF97B1 ^ 0x684E;
                    n3 = 786130448;
                    continue block30;
                }
                case 786130448: {
                    GrimMode.q0OOOoo00o0[0x78E3 ^ 0x7892] = 0x2596DC7A ^ 0x7892;
                    GrimMode.q0OOOoo00o0[0xD275 ^ 0xD20A] = 0xD207 ^ 0xD20A;
                    GrimMode.q0OOOoo00o0[0x1047A ^ 0x1044A] = 0xFFFEFBE7 ^ 0x1044A;
                    GrimMode.q0OOOoo00o0[0x5BB1 ^ 0x5B9C] = 0x5BA1 ^ 0x5B9C;
                    n3 = 816860658;
                    continue block30;
                }
                case 816860658: {
                    GrimMode.q0OOOoo00o0[0xFA7D ^ 0xFA47] = 0xFFFF05B8 ^ 0xFA47;
                    GrimMode.q0OOOoo00o0[0xBBEB ^ 0xBBEF] = 0xFFFF4410 ^ 0xBBEF;
                    GrimMode.q0OOOoo00o0[0x36EA ^ 0x36A7] = 0xFFFFC958 ^ 0x36A7;
                    GrimMode.q0OOOoo00o0[0x1A63 ^ 0x1A2B] = 0x1A34 ^ 0x1A2B;
                    GrimMode.q0OOOoo00o0[0xA182 ^ 0xA18B] = 0xA1E8 ^ 0xA18B;
                    GrimMode.q0OOOoo00o0[0xE357 ^ 0xE34E] = 0xFFF1DB4 ^ 0xE34E;
                    GrimMode.q0OOOoo00o0[0x4917 ^ 0x490C] = 0x4909 ^ 0x490C;
                    GrimMode.q0OOOoo00o0[0x18AD ^ 0x18BF] = 0x18BF ^ 0x18BF;
                    GrimMode.q0OOOoo00o0[0x1E26 ^ 0x1E08] = 0x96307C86 ^ 0x1E08;
                    n3 = -220971117;
                    continue block30;
                }
                case -220971117: {
                    GrimMode.q0OOOoo00o0[0xCB88 ^ 0xCB82] = 0xCB82 ^ 0xCB82;
                    GrimMode.q0OOOoo00o0[0xA804 ^ 0xA821] = 0xFFFF57E0 ^ 0xA821;
                    GrimMode.q0OOOoo00o0[0xCA53 ^ 0xCA12] = 0xFFFF35FB ^ 0xCA12;
                    GrimMode.q0OOOoo00o0[0xAA5D ^ 0xAA00] = 0xAA09 ^ 0xAA00;
                    GrimMode.q0OOOoo00o0[0x31D6 ^ 0x31E4] = 0x31F5 ^ 0x31E4;
                    GrimMode.q0OOOoo00o0[0xEDD7 ^ 0xEDAB] = 0xFFFF1254 ^ 0xEDAB;
                    GrimMode.q0OOOoo00o0[0x3DD2 ^ 0x3D88] = 0x3D81 ^ 0x3D88;
                    GrimMode.q0OOOoo00o0[0x824 ^ 0x83B] = 0xA33F1AB6 ^ 0x83B;
                    GrimMode.q0OOOoo00o0[0xEFBF ^ 0xEFEC] = 0xEF1B ^ 0xEFEC;
                    GrimMode.q0OOOoo00o0[0xAD0C ^ 0xAD61] = 0xAD76 ^ 0xAD61;
                    n3 = 899883654;
                    continue block30;
                }
                case 899883654: {
                    GrimMode.q0OOOoo00o0[0x4746 ^ 0x4761] = 0x4761 ^ 0x4761;
                    GrimMode.q0OOOoo00o0[0x2919 ^ 0x2975] = 0x297C ^ 0x2975;
                    GrimMode.q0OOOoo00o0[0x106B3 ^ 0x106E1] = 0x106FC ^ 0x106E1;
                    GrimMode.q0OOOoo00o0[0x464D ^ 0x4635] = 0xFFFFB990 ^ 0x4635;
                    GrimMode.q0OOOoo00o0[0xEB0C ^ 0xEB33] = 0xEB24 ^ 0xEB33;
                    n3 = -1427971170;
                    continue block30;
                }
                case -1427971170: {
                    GrimMode.q0OOOoo00o0[0xDB86 ^ 0xDB90] = 0xFFFF246F ^ 0xDB90;
                    n3 = -1499366333;
                    continue block30;
                }
                case -1499366333: {
                    GrimMode.q0OOOoo00o0[0x4586 ^ 0x45AA] = 0xFFFFBA55 ^ 0x45AA;
                    GrimMode.q0OOOoo00o0[0xF8D ^ 0xF8C] = 0xF8F ^ 0xF8C;
                    GrimMode.q0OOOoo00o0[0x6AA2 ^ 0x6ACB] = 0xFFFF9530 ^ 0x6ACB;
                    GrimMode.q0OOOoo00o0[0x7730 ^ 0x7704] = 0x6777 ^ 0x7704;
                    GrimMode.q0OOOoo00o0[0xC191 ^ 0xC191] = 0xC0B1 ^ 0xC191;
                    n3 = 1139380571;
                    continue block30;
                }
                case 1139380571: {
                    GrimMode.q0OOOoo00o0[0xF0C2 ^ 0xF0C4] = 0xFFF85E9D ^ 0xF0C4;
                    GrimMode.q0OOOoo00o0[0x41F6 ^ 0x419E] = 0xFFFFBE13 ^ 0x419E;
                    GrimMode.q0OOOoo00o0[0xF6FA ^ 0xF6BA] = 0x34BAD ^ 0xF6BA;
                    GrimMode.q0OOOoo00o0[0x75F9 ^ 0x7587] = 0x7594 ^ 0x7587;
                    GrimMode.q0OOOoo00o0[0xAE09 ^ 0xAE37] = 0xAE3E ^ 0xAE37;
                    GrimMode.q0OOOoo00o0[0x7CE3 ^ 0x7CE1] = 0x7CFC ^ 0x7CE1;
                    GrimMode.q0OOOoo00o0[0x843A ^ 0x8465] = 0xFFFF7BA6 ^ 0x8465;
                    GrimMode.q0OOOoo00o0[0x8AC3 ^ 0x8AB1] = 0x8AA2 ^ 0x8AB1;
                    GrimMode.q0OOOoo00o0[0xB375 ^ 0xB3F4] = 0xFFFF4C6B ^ 0xB3F4;
                    GrimMode.q0OOOoo00o0[0x15DB ^ 0x1587] = 0xFFFFEA40 ^ 0x1587;
                    GrimMode.q0OOOoo00o0[0xE067 ^ 0xE051] = 0xE048 ^ 0xE051;
                    GrimMode.q0OOOoo00o0[0x115E ^ 0x1128] = 0xFFFFEE9D ^ 0x1128;
                    GrimMode.q0OOOoo00o0[0xEB6E ^ 0xEB2B] = 0xEB6A ^ 0xEB2B;
                    n3 = 1893045554;
                    continue block30;
                }
                case 1893045554: {
                    GrimMode.q0OOOoo00o0[0x842B ^ 0x846F] = 0x4F72465A ^ 0x846F;
                    GrimMode.q0OOOoo00o0[0xA2BD ^ 0xA2C4] = 0x69D09459 ^ 0xA2C4;
                    GrimMode.q0OOOoo00o0[0xAE47 ^ 0xAE27] = 0xB800AE24 ^ 0xAE27;
                    GrimMode.q0OOOoo00o0[0x8A19 ^ 0x8A3F] = 0x8A04 ^ 0x8A3F;
                    GrimMode.q0OOOoo00o0[0x93FE ^ 0x93FD] = 0xFFFF6C26 ^ 0x93FD;
                    GrimMode.q0OOOoo00o0[0x3453 ^ 0x343D] = 0x249A ^ 0x343D;
                    GrimMode.q0OOOoo00o0[0x3302 ^ 0x3352] = 0x3327 ^ 0x3352;
                    GrimMode.q0OOOoo00o0[0x9C4 ^ 0x986] = 0x981 ^ 0x986;
                    GrimMode.q0OOOoo00o0[0x10C84 ^ 0x10CFF] = 0x10CDC ^ 0x10CFF;
                    GrimMode.q0OOOoo00o0[0x8CDA ^ 0x8CD6] = 0x8CD7 ^ 0x8CD6;
                    GrimMode.q0OOOoo00o0[0xB35F ^ 0xB343] = 0x83CDFDD0 ^ 0xB343;
                    GrimMode.q0OOOoo00o0[0xF5AF ^ 0xF586] = 0xF599 ^ 0xF586;
                    n3 = 2037132339;
                    continue block30;
                }
                case 2037132339: {
                    GrimMode.q0OOOoo00o0[0x3847 ^ 0x385F] = 0x3814 ^ 0x385F;
                    n3 = -1110387919;
                    continue block30;
                }
                case -1110387919: {
                    GrimMode.q0OOOoo00o0[0x3560 ^ 0x354B] = 0xFFFFCAE9 ^ 0x354B;
                    n3 = 1834798299;
                    continue block30;
                }
                case 1834798299: 
            }
            GrimMode.q0OOOoo00o0[0xD991 ^ 0xD98F] = 0xFFFF2634 ^ 0xD98F;
            GrimMode.q0OOOoo00o0[0x588A ^ 0x58B6] = 0xFFFFA749 ^ 0x58B6;
            GrimMode.q0OOOoo00o0[0xC395 ^ 0xC3A4] = 0xC3AB ^ 0xC3A4;
            GrimMode.q0OOOoo00o0[0x5C4B ^ 0x5C1F] = 0xFFFFA3E0 ^ 0x5C1F;
            n3 = 1916776295;
        }
    }

    static {
        GrimMode.o0Oo000O0oO();
    }

    /*
     * Enabled aggressive block sorting
     */
    public GrimMode(String string, LongJump longJump) {
        int n2 = -1582347382;
        if (n2 != n2) {
            n2 = 16;
        }
        super(string, longJump);
        this.LB = this::a;
        this.LC = this::a;
        this.LD = this::a;
        this.LE = packetSendEvent -> {
            int n2 = -424007087;
            if (n2 != n2) {
                int cfr_ignored_0 = 0x2F & 1;
            }
            int n3 = 440924527;
            while (true) {
                switch (n3) {
                    case -457151575: {
                        packetSendEvent.cF();
                        return;
                    }
                    default: {
                        if (!(packetSendEvent.dq() instanceof e)) return;
                        break;
                    }
                    case 333361068: 
                }
                if (this.Lz != (q0OOOoo00o0[20] + q0OOOoo00o0[21] ^ q0OOOoo00o0[22] ^ q0OOOoo00o0[23] ^ q0OOOoo00o0[24])) return;
                int n4 = q0OOOoo00o0[25];
                this.Lz = (n4 >>> q0OOOoo00o0[26] | n4 << q0OOOoo00o0[27]) * q0OOOoo00o0[28] ^ q0OOOoo00o0[29];
                n3 = -457151575;
            }
        };
    }
}

