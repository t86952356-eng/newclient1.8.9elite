/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.eh;
import hackclient.rise.fd;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.value.BooleanValue;
import rise.value.NumberValue;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Grim2Mode
extends Mode<Speed> {
    public /* synthetic */ int Px;
    public static /* synthetic */ Object[] q0oOOoOo0O00O;
    @EventLink
    public /* synthetic */ Listener<StrafeEvent> PB;
    public /* synthetic */ boolean gD;
    public /* synthetic */ boolean Eo;
    @EventLink
    public /* synthetic */ Listener<JumpEvent> PA;
    @EventLink
    public /* synthetic */ Listener<PreMotionEvent> PD;
    public static /* synthetic */ Object[] oO00O0OO0ooO;
    public /* synthetic */ BooleanValue Py;
    public /* synthetic */ NumberValue Pz;
    @EventLink
    public /* synthetic */ Listener<eh> PC;
    public static /* synthetic */ Object O0OoOO0OOOOO;
    @EventLink
    public /* synthetic */ Listener<MoveInputEvent> PF;
    @EventLink
    public /* synthetic */ Listener<PostMotionEvent> PE;
    public /* synthetic */ int Ho;
    public static /* synthetic */ String Oo0o00000O00;
    public static /* synthetic */ String[] o0o000o0O0o0;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ String q0OOOoo00o0;
    public /* synthetic */ boolean Ga;
    public static /* synthetic */ String[] ooo00oo0Ooo0;
    @EventLink
    public /* synthetic */ Listener<PacketReceiveEvent> PG;
    private static /* synthetic */ int[] oOo00Oo0OOo0;
    @EventLink
    public /* synthetic */ Listener<fd> PH;
    private static /* synthetic */ int oo000o00Oo00;
    private static /* synthetic */ boolean o0000000O000;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = -2051212431;
        if (n2 != n2) {
            int cfr_ignored_0 = 0x2C & 1;
        }
        oOo00Oo0OOo0 = new int[0xD031 ^ 0xD1A1];
        Grim2Mode.oOo00Oo0OOo0[0x618F ^ 0x61BA] = 0x6197 ^ 0x61BA;
        Grim2Mode.oOo00Oo0OOo0[0xC0 ^ 0x1D4] = 0xFFFFFE5D ^ 0x1D4;
        Grim2Mode.oOo00Oo0OOo0[0x4B84 ^ 0x4AFC] = 0xBCA8 ^ 0x4AFC;
        Grim2Mode.oOo00Oo0OOo0[0x102FC ^ 0x1039B] = 0x1D3E1 ^ 0x1039B;
        Grim2Mode.oOo00Oo0OOo0[0x108D8 ^ 0x10820] = 0x10837 ^ 0x10820;
        Grim2Mode.oOo00Oo0OOo0[0x652C ^ 0x6532] = 0xA4FA2A97 ^ 0x6532;
        Grim2Mode.oOo00Oo0OOo0[0xD720 ^ 0xD768] = 0x2D020745 ^ 0xD768;
        Grim2Mode.oOo00Oo0OOo0[0xDB08 ^ 0xDB83] = 0xDB96 ^ 0xDB83;
        Grim2Mode.oOo00Oo0OOo0[0xF1F8 ^ 0xF139] = 0x38ED ^ 0xF139;
        Grim2Mode.oOo00Oo0OOo0[0xACBB ^ 0xAC8C] = 0xAC9D ^ 0xAC8C;
        Grim2Mode.oOo00Oo0OOo0[0xD67F ^ 0xD651] = 0xFFFF29EA ^ 0xD651;
        int n3 = -556742245;
        block89: while (true) {
            switch (n3) {
                case 579169724: {
                    Grim2Mode.oOo00Oo0OOo0[0x81AD ^ 0x819E] = 0x81B5 ^ 0x819E;
                    Grim2Mode.oOo00Oo0OOo0[0x378B ^ 0x3680] = 0x3683 ^ 0x3680;
                    Grim2Mode.oOo00Oo0OOo0[0x10F72 ^ 0x10E71] = 0xFFFEF1FE ^ 0x10E71;
                    Grim2Mode.oOo00Oo0OOo0[0xDD4E ^ 0xDC0E] = 0xFFFFE069 ^ 0xDC0E;
                    Grim2Mode.oOo00Oo0OOo0[0x301E ^ 0x3087] = 0xDA6C39E2 ^ 0x3087;
                    Grim2Mode.oOo00Oo0OOo0[0x1009F ^ 0x100CF] = 0x100C3 ^ 0x100CF;
                    Grim2Mode.oOo00Oo0OOo0[0xA52B ^ 0xA5CD] = 0xA5DC ^ 0xA5CD;
                    Grim2Mode.oOo00Oo0OOo0[0x5CDC ^ 0x5DAF] = 0x4E42 ^ 0x5DAF;
                    Grim2Mode.oOo00Oo0OOo0[0x8BAA ^ 0x8B60] = 0x8B37 ^ 0x8B60;
                    Grim2Mode.oOo00Oo0OOo0[0xEDC8 ^ 0xEDE7] = 0xEDCA ^ 0xEDE7;
                    Grim2Mode.oOo00Oo0OOo0[0xFD0C ^ 0xFD8B] = 0xFFFF026A ^ 0xFD8B;
                    Grim2Mode.oOo00Oo0OOo0[0x2F12 ^ 0x2F46] = 0x2F5D ^ 0x2F46;
                    Grim2Mode.oOo00Oo0OOo0[0xD9E9 ^ 0xD8AD] = 0xFFFF42FF ^ 0xD8AD;
                    Grim2Mode.oOo00Oo0OOo0[0x9F02 ^ 0x9F64] = 0xDFFF608F ^ 0x9F64;
                    Grim2Mode.oOo00Oo0OOo0[0x9163 ^ 0x9065] = 0xFFFF6F9A ^ 0x9065;
                    Grim2Mode.oOo00Oo0OOo0[0x1AA0 ^ 0x1AB0] = 0x1AE9 ^ 0x1AB0;
                    Grim2Mode.oOo00Oo0OOo0[0x65DD ^ 0x65A7] = 0x65B6 ^ 0x65A7;
                    Grim2Mode.oOo00Oo0OOo0[0xFA8F ^ 0xFACB] = 0x4104EA8A ^ 0xFACB;
                    Grim2Mode.oOo00Oo0OOo0[0xD109 ^ 0xD060] = 0x1A ^ 0xD060;
                    Grim2Mode.oOo00Oo0OOo0[0x3C0 ^ 0x337] = 0x33E ^ 0x337;
                    Grim2Mode.oOo00Oo0OOo0[0x2F7A ^ 0x2F96] = 0xD174A4D3 ^ 0x2F96;
                    Grim2Mode.oOo00Oo0OOo0[0xBE79 ^ 0xBEA2] = 0xBEB1 ^ 0xBEA2;
                    Grim2Mode.oOo00Oo0OOo0[0x98B2 ^ 0x98BC] = 0x98BF ^ 0x98BC;
                    n3 = -2104933079;
                    continue block89;
                }
                case -2104933079: {
                    Grim2Mode.oOo00Oo0OOo0[0x49C7 ^ 0x4892] = 0x7942 ^ 0x4892;
                    Grim2Mode.oOo00Oo0OOo0[0x10991 ^ 0x108A9] = 0x12721 ^ 0x108A9;
                    Grim2Mode.oOo00Oo0OOo0[0xF73A ^ 0xF77D] = 0xF77A ^ 0xF77D;
                    Grim2Mode.oOo00Oo0OOo0[0x3B85 ^ 0x3AA7] = 0x914C210A ^ 0x3AA7;
                    Grim2Mode.oOo00Oo0OOo0[0xF786 ^ 0xF6FB] = 0xA453 ^ 0xF6FB;
                    n3 = -1627985683;
                    continue block89;
                }
                case -1627985683: {
                    Grim2Mode.oOo00Oo0OOo0[0x3FAC ^ 0x3EE0] = 0x7A7A ^ 0x3EE0;
                    Grim2Mode.oOo00Oo0OOo0[0x1081C ^ 0x10923] = 0x1CAE0 ^ 0x10923;
                    n3 = -1005009899;
                    continue block89;
                }
                case -1005009899: {
                    Grim2Mode.oOo00Oo0OOo0[0xE6FB ^ 0xE6F4] = 0xE6E9 ^ 0xE6F4;
                    Grim2Mode.oOo00Oo0OOo0[0x6B8 ^ 0x7AA] = 0x7C5 ^ 0x7AA;
                    Grim2Mode.oOo00Oo0OOo0[0x3C59 ^ 0x3C13] = 0x3C0A ^ 0x3C13;
                    Grim2Mode.oOo00Oo0OOo0[0xED0 ^ 0xF8C] = 0xF7D1 ^ 0xF8C;
                    Grim2Mode.oOo00Oo0OOo0[0x6A8C ^ 0x6B88] = 0x6B9F ^ 0x6B88;
                    n3 = 1228029116;
                    continue block89;
                }
                case 1228029116: {
                    Grim2Mode.oOo00Oo0OOo0[0xE0C9 ^ 0xE1F7] = 0x2232 ^ 0xE1F7;
                    Grim2Mode.oOo00Oo0OOo0[0x39B1 ^ 0x39A0] = 0x39C5 ^ 0x39A0;
                    Grim2Mode.oOo00Oo0OOo0[0x42BD ^ 0x4262] = 0xFFFFBD9D ^ 0x4262;
                    n3 = 573201948;
                    continue block89;
                }
                case 573201948: {
                    Grim2Mode.oOo00Oo0OOo0[0x5268 ^ 0x52A5] = 0x52B2 ^ 0x52A5;
                    Grim2Mode.oOo00Oo0OOo0[0x11AE ^ 0x1138] = 0xFFFFEEC7 ^ 0x1138;
                    n3 = 1952209231;
                    continue block89;
                }
                case 1952209231: {
                    Grim2Mode.oOo00Oo0OOo0[0x77C9 ^ 0x7696] = 0x20C5 ^ 0x7696;
                    Grim2Mode.oOo00Oo0OOo0[0xE970 ^ 0xE9F4] = 0xE9E7 ^ 0xE9F4;
                    Grim2Mode.oOo00Oo0OOo0[0xFE8E ^ 0xFEC8] = 0xFED1 ^ 0xFEC8;
                    Grim2Mode.oOo00Oo0OOo0[0xB0D8 ^ 0xB03B] = 0xFFFF4FBE ^ 0xB03B;
                    Grim2Mode.oOo00Oo0OOo0[0x99C7 ^ 0x99EF] = 0x9994 ^ 0x99EF;
                    Grim2Mode.oOo00Oo0OOo0[0xBAE ^ 0xB18] = 0xB18 ^ 0xB18;
                    n3 = 1643747853;
                    continue block89;
                }
                case 1643747853: {
                    Grim2Mode.oOo00Oo0OOo0[0x7C8B ^ 0x7CC9] = 0x7C7D ^ 0x7CC9;
                    Grim2Mode.oOo00Oo0OOo0[0x754F ^ 0x74CA] = 0x4DBB ^ 0x74CA;
                    Grim2Mode.oOo00Oo0OOo0[0x2D1C ^ 0x2C4F] = 0x1D9F ^ 0x2C4F;
                    Grim2Mode.oOo00Oo0OOo0[0xAB83 ^ 0xAB10] = 0xAB19 ^ 0xAB10;
                    Grim2Mode.oOo00Oo0OOo0[0xF4CA ^ 0xF592] = 0xFFFFBCAC ^ 0xF592;
                    Grim2Mode.oOo00Oo0OOo0[0x10BA9 ^ 0x10AFB] = 0x13B2F ^ 0x10AFB;
                    Grim2Mode.oOo00Oo0OOo0[0xB5D4 ^ 0xB49B] = 0xB36 ^ 0xB49B;
                    n3 = -1228683097;
                    continue block89;
                }
                case -1228683097: {
                    Grim2Mode.oOo00Oo0OOo0[0x360E ^ 0x36FB] = 0xFFFF8904 ^ 0x36FB;
                    n3 = 42673011;
                    continue block89;
                }
                case 42673011: {
                    Grim2Mode.oOo00Oo0OOo0[0xF639 ^ 0xF665] = 0x47DCE792 ^ 0xF665;
                    Grim2Mode.oOo00Oo0OOo0[0xC7E0 ^ 0xC69A] = 0xF5BF ^ 0xC69A;
                    Grim2Mode.oOo00Oo0OOo0[0x1E9E ^ 0x1E16] = 0x6EB3FA45 ^ 0x1E16;
                    n3 = 1893362422;
                    continue block89;
                }
                case 1893362422: {
                    Grim2Mode.oOo00Oo0OOo0[0x1851 ^ 0x1820] = 0x1A1F40F1 ^ 0x1820;
                    Grim2Mode.oOo00Oo0OOo0[0xB162 ^ 0xB1A4] = 0xFFFF4E49 ^ 0xB1A4;
                    Grim2Mode.oOo00Oo0OOo0[0x161A ^ 0x163D] = 0xA7905C44 ^ 0x163D;
                    Grim2Mode.oOo00Oo0OOo0[0x8B80 ^ 0x8B71] = 0x8B20 ^ 0x8B71;
                    n3 = -1461262440;
                    continue block89;
                }
                case -1461262440: {
                    Grim2Mode.oOo00Oo0OOo0[0xDB81 ^ 0xDB33] = 0x69064B5A ^ 0xDB33;
                    n3 = 848878812;
                    continue block89;
                }
                case 848878812: {
                    Grim2Mode.oOo00Oo0OOo0[0x710F ^ 0x71A1] = 0x5095 ^ 0x71A1;
                    Grim2Mode.oOo00Oo0OOo0[0xFAE7 ^ 0xFBAA] = 0xBF0B ^ 0xFBAA;
                    Grim2Mode.oOo00Oo0OOo0[0x169D ^ 0x16D4] = 0x16D5 ^ 0x16D4;
                    Grim2Mode.oOo00Oo0OOo0[0x66FD ^ 0x666D] = 0x6672 ^ 0x666D;
                    Grim2Mode.oOo00Oo0OOo0[0x85CD ^ 0x84FA] = 0xAB1F ^ 0x84FA;
                    Grim2Mode.oOo00Oo0OOo0[0xF449 ^ 0xF525] = 0xFFFF2B50 ^ 0xF525;
                    Grim2Mode.oOo00Oo0OOo0[0x3741 ^ 0x3622] = 0x7947 ^ 0x3622;
                    n3 = 1801656814;
                    continue block89;
                }
                case 1801656814: {
                    Grim2Mode.oOo00Oo0OOo0[0x4867 ^ 0x4851] = 0x893CFB69 ^ 0x4851;
                    Grim2Mode.oOo00Oo0OOo0[0xFEFC ^ 0xFFD1] = 0xFF92 ^ 0xFFD1;
                    Grim2Mode.oOo00Oo0OOo0[0x1FB0 ^ 0x1E3D] = 0x65E3 ^ 0x1E3D;
                    Grim2Mode.oOo00Oo0OOo0[0x9013 ^ 0x905E] = 0x905E ^ 0x905E;
                    Grim2Mode.oOo00Oo0OOo0[0x5FF8 ^ 0x5E77] = 0x25C1 ^ 0x5E77;
                    n3 = -1214485961;
                    continue block89;
                }
                case -1214485961: {
                    Grim2Mode.oOo00Oo0OOo0[0x61BD ^ 0x6107] = 0xA9C2 ^ 0x6107;
                    Grim2Mode.oOo00Oo0OOo0[0xC002 ^ 0xC0E6] = 0xC0D3 ^ 0xC0E6;
                    Grim2Mode.oOo00Oo0OOo0[0x4694 ^ 0x4791] = 0x4798 ^ 0x4791;
                    Grim2Mode.oOo00Oo0OOo0[0x683 ^ 0x628] = 0xE85E8008 ^ 0x628;
                    Grim2Mode.oOo00Oo0OOo0[0x495C ^ 0x49BC] = 0xAD0E3429 ^ 0x49BC;
                    Grim2Mode.oOo00Oo0OOo0[0x5B9F ^ 0x5B11] = 0x205B11 ^ 0x5B11;
                    Grim2Mode.oOo00Oo0OOo0[0x27A9 ^ 0x27CE] = 0x27DB ^ 0x27CE;
                    Grim2Mode.oOo00Oo0OOo0[0xE338 ^ 0xE3E9] = 0xFFFF1C12 ^ 0xE3E9;
                    Grim2Mode.oOo00Oo0OOo0[0xBA2B ^ 0xBABA] = 0xBAA9 ^ 0xBABA;
                    Grim2Mode.oOo00Oo0OOo0[0x953E ^ 0x95F9] = 0x95E4 ^ 0x95F9;
                    Grim2Mode.oOo00Oo0OOo0[0x139D ^ 0x1288] = 0x1299 ^ 0x1288;
                    Grim2Mode.oOo00Oo0OOo0[0x10628 ^ 0x10668] = 0x7506561D ^ 0x10668;
                    Grim2Mode.oOo00Oo0OOo0[0x7FD4 ^ 0x7F97] = 0x7F9E ^ 0x7F97;
                    Grim2Mode.oOo00Oo0OOo0[0x7DD3 ^ 0x7D62] = 0x7D7D ^ 0x7D62;
                    Grim2Mode.oOo00Oo0OOo0[0x2CF3 ^ 0x2DCA] = 0x22F ^ 0x2DCA;
                    Grim2Mode.oOo00Oo0OOo0[0x438D ^ 0x4380] = 0x80004381 ^ 0x4380;
                    n3 = -41760748;
                    continue block89;
                }
                case -41760748: {
                    Grim2Mode.oOo00Oo0OOo0[0xE850 ^ 0xE9D6] = 0xD0A9 ^ 0xE9D6;
                    Grim2Mode.oOo00Oo0OOo0[0x566 ^ 0x5AE] = 0x5AD ^ 0x5AE;
                    Grim2Mode.oOo00Oo0OOo0[0x4B1 ^ 0x5A9] = 0xB9022310 ^ 0x5A9;
                    Grim2Mode.oOo00Oo0OOo0[0xFB3 ^ 0xEA8] = 0xEB9 ^ 0xEA8;
                    Grim2Mode.oOo00Oo0OOo0[0x6B7 ^ 0x65C] = 0xFFFFF9FF ^ 0x65C;
                    Grim2Mode.oOo00Oo0OOo0[0x30CB ^ 0x30E9] = 0x30E3 ^ 0x30E9;
                    Grim2Mode.oOo00Oo0OOo0[0x6A30 ^ 0x6B4C] = 0x5869 ^ 0x6B4C;
                    Grim2Mode.oOo00Oo0OOo0[0x1836 ^ 0x195B] = 0x38F5 ^ 0x195B;
                    Grim2Mode.oOo00Oo0OOo0[0xAC17 ^ 0xAD52] = 0xC8DD ^ 0xAD52;
                    Grim2Mode.oOo00Oo0OOo0[0x77BF ^ 0x77A8] = 0xFFFF8873 ^ 0x77A8;
                    n3 = 370613587;
                    continue block89;
                }
                case 370613587: {
                    Grim2Mode.oOo00Oo0OOo0[0x92AB ^ 0x9216] = 0x921A ^ 0x9216;
                    Grim2Mode.oOo00Oo0OOo0[0xAB73 ^ 0xABE7] = 0xABF0 ^ 0xABE7;
                    Grim2Mode.oOo00Oo0OOo0[0x2662 ^ 0x26B8] = 0xFFFFD913 ^ 0x26B8;
                    Grim2Mode.oOo00Oo0OOo0[0xF340 ^ 0xF34C] = 0xF34B ^ 0xF34C;
                    n3 = -327477535;
                    continue block89;
                }
                case -327477535: {
                    Grim2Mode.oOo00Oo0OOo0[0x4E98 ^ 0x4EA2] = 0xFFFFB117 ^ 0x4EA2;
                    Grim2Mode.oOo00Oo0OOo0[0x3552 ^ 0x35F3] = 0x35EA ^ 0x35F3;
                    Grim2Mode.oOo00Oo0OOo0[0x8BC1 ^ 0x8B64] = 0xFFFF74AC ^ 0x8B64;
                    Grim2Mode.oOo00Oo0OOo0[0x9BA3 ^ 0x9A9E] = 0x19AEA ^ 0x9A9E;
                    n3 = -528454088;
                    continue block89;
                }
                case -528454088: {
                    Grim2Mode.oOo00Oo0OOo0[0xA0C5 ^ 0xA06F] = 0xFFFF5FC2 ^ 0xA06F;
                    n3 = -334722742;
                    continue block89;
                }
                case -334722742: {
                    Grim2Mode.oOo00Oo0OOo0[0xB72C ^ 0xB79B] = 0xB79B ^ 0xB79B;
                    Grim2Mode.oOo00Oo0OOo0[0xDEE1 ^ 0xDEB7] = 0xDEE2 ^ 0xDEB7;
                    n3 = 325206594;
                    continue block89;
                }
                case 325206594: {
                    Grim2Mode.oOo00Oo0OOo0[0x4ACC ^ 0x4BB2] = 0x1911 ^ 0x4BB2;
                    Grim2Mode.oOo00Oo0OOo0[0x52A6 ^ 0x522B] = 0xFFFFADE0 ^ 0x522B;
                    Grim2Mode.oOo00Oo0OOo0[0xAE3B ^ 0xAE55] = 0xFFFF51AA ^ 0xAE55;
                    Grim2Mode.oOo00Oo0OOo0[0x42E5 ^ 0x42FA] = 0xFFFFBD15 ^ 0x42FA;
                    Grim2Mode.oOo00Oo0OOo0[0xD5A1 ^ 0xD4BE] = 0x242CBF ^ 0xD4BE;
                    Grim2Mode.oOo00Oo0OOo0[0x56CA ^ 0x563C] = 0xFFFFA9C3 ^ 0x563C;
                    n3 = 237643440;
                    continue block89;
                }
                case 237643440: {
                    Grim2Mode.oOo00Oo0OOo0[0xDF0 ^ 0xD5D] = 0xD1C ^ 0xD5D;
                    Grim2Mode.oOo00Oo0OOo0[0x3D5E ^ 0x3D6E] = 0x3D43 ^ 0x3D6E;
                    Grim2Mode.oOo00Oo0OOo0[0x2D2D ^ 0x2D2F] = 0x2D36 ^ 0x2D2F;
                    Grim2Mode.oOo00Oo0OOo0[0xEDC9 ^ 0xED69] = 0xED6E ^ 0xED69;
                    Grim2Mode.oOo00Oo0OOo0[0x6CB5 ^ 0x6DFF] = 0x2954 ^ 0x6DFF;
                    Grim2Mode.oOo00Oo0OOo0[0x5F78 ^ 0x5E09] = 0xB85E ^ 0x5E09;
                    Grim2Mode.oOo00Oo0OOo0[0xF01E ^ 0xF11F] = 0xF106 ^ 0xF11F;
                    n3 = -1132647675;
                    continue block89;
                }
                case -1132647675: {
                    Grim2Mode.oOo00Oo0OOo0[0xD0CB ^ 0xD0CF] = 0xD0D6 ^ 0xD0CF;
                    Grim2Mode.oOo00Oo0OOo0[0x7BAE ^ 0x7A81] = 0x7A81 ^ 0x7A81;
                    Grim2Mode.oOo00Oo0OOo0[0x7FB6 ^ 0x7FC6] = 0xFFFF8039 ^ 0x7FC6;
                    n3 = 1052663499;
                    continue block89;
                }
                case 1052663499: {
                    Grim2Mode.oOo00Oo0OOo0[0x3748 ^ 0x3748] = 0x50D7A308 ^ 0x3748;
                    n3 = 1664388329;
                    continue block89;
                }
                case 1664388329: {
                    Grim2Mode.oOo00Oo0OOo0[0xB29F ^ 0xB287] = 0xFFFF4D0A ^ 0xB287;
                    Grim2Mode.oOo00Oo0OOo0[0x79B1 ^ 0x79E0] = 0x79C3 ^ 0x79E0;
                    Grim2Mode.oOo00Oo0OOo0[0xD553 ^ 0xD580] = 0xD5E5 ^ 0xD580;
                    n3 = -352592217;
                    continue block89;
                }
                case -352592217: {
                    Grim2Mode.oOo00Oo0OOo0[0xE5BD ^ 0xE537] = 0xFFFF1AA4 ^ 0xE537;
                    Grim2Mode.oOo00Oo0OOo0[0x39BA ^ 0x38D2] = 0xE8A0 ^ 0x38D2;
                    Grim2Mode.oOo00Oo0OOo0[0xFD79 ^ 0xFD24] = 0xFD24 ^ 0xFD24;
                    Grim2Mode.oOo00Oo0OOo0[0x40DC ^ 0x4044] = 0xB0804044 ^ 0x4044;
                    n3 = 63161;
                    continue block89;
                }
                case 63161: {
                    Grim2Mode.oOo00Oo0OOo0[0x37C ^ 0x3B7] = 0xFAD409EF ^ 0x3B7;
                    Grim2Mode.oOo00Oo0OOo0[0x8ADB ^ 0x8AAD] = 0x8AB0 ^ 0x8AAD;
                    n3 = -1762596739;
                    continue block89;
                }
                case -1762596739: {
                    Grim2Mode.oOo00Oo0OOo0[0xB16F ^ 0xB005] = 0x91AC ^ 0xB005;
                    Grim2Mode.oOo00Oo0OOo0[0x4679 ^ 0x4672] = 0x466B ^ 0x4672;
                    Grim2Mode.oOo00Oo0OOo0[0x916F ^ 0x9196] = 0x30309196 ^ 0x9196;
                    Grim2Mode.oOo00Oo0OOo0[0x8A07 ^ 0x8A2A] = 0x8A6F ^ 0x8A2A;
                    Grim2Mode.oOo00Oo0OOo0[0x897E ^ 0x8957] = 0x46FD5010 ^ 0x8957;
                    Grim2Mode.oOo00Oo0OOo0[0x47BB ^ 0x4789] = 0xB6DB2A55 ^ 0x4789;
                    Grim2Mode.oOo00Oo0OOo0[0xF268 ^ 0xF2BA] = 0xFFFF0D41 ^ 0xF2BA;
                    Grim2Mode.oOo00Oo0OOo0[0x26F7 ^ 0x26B8] = 0xFFFFD947 ^ 0x26B8;
                    Grim2Mode.oOo00Oo0OOo0[0x6AA4 ^ 0x6A43] = 0x6A4C ^ 0x6A43;
                    Grim2Mode.oOo00Oo0OOo0[0x4129 ^ 0x4148] = 0x4151 ^ 0x4148;
                    Grim2Mode.oOo00Oo0OOo0[0x1EB0 ^ 0x1FB7] = 0x9FFFE076 ^ 0x1FB7;
                    Grim2Mode.oOo00Oo0OOo0[0xAC0D ^ 0xACBE] = 0xFFFF530D ^ 0xACBE;
                    Grim2Mode.oOo00Oo0OOo0[0x4A46 ^ 0x4A6C] = 0xFFFFB5E2 ^ 0x4A6C;
                    Grim2Mode.oOo00Oo0OOo0[0x2807 ^ 0x2905] = 0x2902 ^ 0x2905;
                    n3 = 1127010187;
                    continue block89;
                }
                case 1127010187: {
                    Grim2Mode.oOo00Oo0OOo0[0xBB6B ^ 0xBB55] = 0xBB5A ^ 0xBB55;
                    Grim2Mode.oOo00Oo0OOo0[0x8680 ^ 0x8695] = 0xFFFF796A ^ 0x8695;
                    Grim2Mode.oOo00Oo0OOo0[0x53F0 ^ 0x53AE] = 0x53D9 ^ 0x53AE;
                    Grim2Mode.oOo00Oo0OOo0[0xE034 ^ 0xE0EC] = 0xE0E5 ^ 0xE0EC;
                    Grim2Mode.oOo00Oo0OOo0[0xA856 ^ 0xA842] = 0xFFFF57D5 ^ 0xA842;
                    Grim2Mode.oOo00Oo0OOo0[0xAB92 ^ 0xAAA3] = 0xBB5 ^ 0xAAA3;
                    Grim2Mode.oOo00Oo0OOo0[0xDDFF ^ 0xDD0B] = 0xDD06 ^ 0xDD0B;
                    Grim2Mode.oOo00Oo0OOo0[0xB9B1 ^ 0xB891] = 0xB884 ^ 0xB891;
                    Grim2Mode.oOo00Oo0OOo0[0x90AA ^ 0x9199] = 0x9640 ^ 0x9199;
                    n3 = -1251749935;
                    continue block89;
                }
                case -1251749935: {
                    Grim2Mode.oOo00Oo0OOo0[0x9C4F ^ 0x9D5C] = 0xFFBF62D5 ^ 0x9D5C;
                    Grim2Mode.oOo00Oo0OOo0[0xC515 ^ 0xC5DA] = 0xC5CF ^ 0xC5DA;
                    Grim2Mode.oOo00Oo0OOo0[0x4148 ^ 0x4019] = 0xFFB4 ^ 0x4019;
                    Grim2Mode.oOo00Oo0OOo0[0xFAEF ^ 0xFBAE] = 0x386D ^ 0xFBAE;
                    return;
                }
                default: {
                    Grim2Mode.oOo00Oo0OOo0[0x2C1D ^ 0x2C22] = 0x3F03DC1D ^ 0x2C22;
                    Grim2Mode.oOo00Oo0OOo0[0x371C ^ 0x37E0] = 0x37F1 ^ 0x37E0;
                    n3 = -1113994277;
                    continue block89;
                }
                case -1113994277: {
                    Grim2Mode.oOo00Oo0OOo0[0x6D02 ^ 0x6D47] = 0x6D47 ^ 0x6D47;
                    Grim2Mode.oOo00Oo0OOo0[0x6FFC ^ 0x6F7C] = 0x6F03 ^ 0x6F7C;
                    Grim2Mode.oOo00Oo0OOo0[0x10AE5 ^ 0x10ABA] = 0x10AA1 ^ 0x10ABA;
                    Grim2Mode.oOo00Oo0OOo0[0x7609 ^ 0x7700] = 0x7703 ^ 0x7700;
                    Grim2Mode.oOo00Oo0OOo0[0x8CAE ^ 0x8DA1] = 0x8DB2 ^ 0x8DA1;
                    Grim2Mode.oOo00Oo0OOo0[0xFAFC ^ 0xFA03] = 0xA9416C34 ^ 0xFA03;
                    n3 = 540097280;
                    continue block89;
                }
                case 540097280: {
                    Grim2Mode.oOo00Oo0OOo0[0xDF0B ^ 0xDF7F] = 0xFFFF20A4 ^ 0xDF7F;
                    n3 = -262528288;
                    continue block89;
                }
                case -262528288: {
                    Grim2Mode.oOo00Oo0OOo0[0x4DDD ^ 0x4D8F] = 0x4D96 ^ 0x4D8F;
                    Grim2Mode.oOo00Oo0OOo0[0x7F2C ^ 0x7E06] = 0x7E0D ^ 0x7E06;
                    Grim2Mode.oOo00Oo0OOo0[0xF23F ^ 0xF309] = 0xDCE4 ^ 0xF309;
                    n3 = 1101056722;
                    continue block89;
                }
                case 1101056722: {
                    Grim2Mode.oOo00Oo0OOo0[0x16F2 ^ 0x161D] = 0x1616 ^ 0x161D;
                    n3 = 1613717768;
                    continue block89;
                }
                case 1613717768: {
                    Grim2Mode.oOo00Oo0OOo0[0x169A ^ 0x1784] = 0x179D ^ 0x1784;
                    n3 = 152428665;
                    continue block89;
                }
                case 152428665: {
                    Grim2Mode.oOo00Oo0OOo0[0x6516 ^ 0x644D] = 0x9C14 ^ 0x644D;
                    n3 = -452063234;
                    continue block89;
                }
                case -452063234: {
                    Grim2Mode.oOo00Oo0OOo0[0x816F ^ 0x815E] = 0x815D ^ 0x815E;
                    n3 = -712283198;
                    continue block89;
                }
                case -712283198: {
                    Grim2Mode.oOo00Oo0OOo0[0xD779 ^ 0xD7AC] = 0xFFF2807 ^ 0xD7AC;
                    Grim2Mode.oOo00Oo0OOo0[0xC2E0 ^ 0xC2CC] = 0xC29D ^ 0xC2CC;
                    n3 = 43339864;
                    continue block89;
                }
                case 43339864: {
                    Grim2Mode.oOo00Oo0OOo0[0x3455 ^ 0x354F] = 0x154F ^ 0x354F;
                    n3 = 754435078;
                    continue block89;
                }
                case 754435078: {
                    Grim2Mode.oOo00Oo0OOo0[0x3E7B ^ 0x3EDC] = 0x3EC1 ^ 0x3EDC;
                    Grim2Mode.oOo00Oo0OOo0[0xBAE3 ^ 0xBAB4] = 0xBAD7 ^ 0xBAB4;
                    Grim2Mode.oOo00Oo0OOo0[0xD7F7 ^ 0xD6D9] = 0xD6D8 ^ 0xD6D9;
                    Grim2Mode.oOo00Oo0OOo0[0x63BD ^ 0x6306] = 0xFFFF9CF9 ^ 0x6306;
                    Grim2Mode.oOo00Oo0OOo0[0x4E0F ^ 0x4E67] = 0x4E64 ^ 0x4E67;
                    n3 = -738761825;
                    continue block89;
                }
                case -738761825: {
                    Grim2Mode.oOo00Oo0OOo0[0x8B47 ^ 0x8A57] = 0xFFFF75A8 ^ 0x8A57;
                    Grim2Mode.oOo00Oo0OOo0[0x2B36 ^ 0x2A6C] = 0xD23B ^ 0x2A6C;
                    Grim2Mode.oOo00Oo0OOo0[0xAD5A ^ 0xADA4] = 0xADF7 ^ 0xADA4;
                    n3 = 256793623;
                    continue block89;
                }
                case 256793623: {
                    Grim2Mode.oOo00Oo0OOo0[0x313B ^ 0x31A9] = 0x31A4 ^ 0x31A9;
                    Grim2Mode.oOo00Oo0OOo0[0x781D ^ 0x7943] = 0x2F1D ^ 0x7943;
                    n3 = 223033595;
                    continue block89;
                }
                case 223033595: {
                    Grim2Mode.oOo00Oo0OOo0[0x6A ^ 0x15E] = 0xFFFFF943 ^ 0x15E;
                    Grim2Mode.oOo00Oo0OOo0[0xCE8E ^ 0xCF00] = 0xB4C1 ^ 0xCF00;
                    Grim2Mode.oOo00Oo0OOo0[0x101B0 ^ 0x10136] = 0x1010C ^ 0x10136;
                    Grim2Mode.oOo00Oo0OOo0[0x46C6 ^ 0x463C] = 0xFFFFB997 ^ 0x463C;
                    n3 = -1155333796;
                    continue block89;
                }
                case -1155333796: {
                    Grim2Mode.oOo00Oo0OOo0[0x7E2D ^ 0x7FAC] = 0xFD32 ^ 0x7FAC;
                    Grim2Mode.oOo00Oo0OOo0[0xDD1E ^ 0xDC07] = 0xFFFF23F8 ^ 0xDC07;
                    Grim2Mode.oOo00Oo0OOo0[0xC529 ^ 0xC45C] = 0x3210 ^ 0xC45C;
                    Grim2Mode.oOo00Oo0OOo0[0x7DDE ^ 0x7DB4] = 0xA1AF5508 ^ 0x7DB4;
                    Grim2Mode.oOo00Oo0OOo0[0xEC03 ^ 0xEC9F] = 0xECD8 ^ 0xEC9F;
                    Grim2Mode.oOo00Oo0OOo0[0xEB94 ^ 0xEAE6] = 0xEAE6 ^ 0xEAE6;
                    n3 = 2129158500;
                    continue block89;
                }
                case 2129158500: {
                    Grim2Mode.oOo00Oo0OOo0[0x134 ^ 0x110] = 0x169 ^ 0x110;
                    Grim2Mode.oOo00Oo0OOo0[0xC4BE ^ 0xC598] = 0xFFFF3A79 ^ 0xC598;
                    Grim2Mode.oOo00Oo0OOo0[0x293D ^ 0x29D3] = 0xFFFFD652 ^ 0x29D3;
                    Grim2Mode.oOo00Oo0OOo0[0x770E ^ 0x768E] = 0x242D ^ 0x768E;
                    Grim2Mode.oOo00Oo0OOo0[0x9468 ^ 0x9414] = 0x9414 ^ 0x9414;
                    Grim2Mode.oOo00Oo0OOo0[0xF2B ^ 0xF2E] = 0xF3D ^ 0xF2E;
                    Grim2Mode.oOo00Oo0OOo0[0x10CB6 ^ 0x10CB5] = 0x10CB2 ^ 0x10CB5;
                    Grim2Mode.oOo00Oo0OOo0[0x8FE9 ^ 0x8F01] = 0xFFFF7098 ^ 0x8F01;
                    Grim2Mode.oOo00Oo0OOo0[0xFF87 ^ 0xFF4E] = 0xFF39 ^ 0xFF4E;
                    Grim2Mode.oOo00Oo0OOo0[0xC1A ^ 0xC8F] = 0xCE6 ^ 0xC8F;
                    Grim2Mode.oOo00Oo0OOo0[0x194C ^ 0x19FC] = 0x19FD ^ 0x19FC;
                    Grim2Mode.oOo00Oo0OOo0[0x7C0D ^ 0x7C14] = 0x7C0F ^ 0x7C14;
                    n3 = -1392306959;
                    continue block89;
                }
                case -1392306959: {
                    Grim2Mode.oOo00Oo0OOo0[0x77E7 ^ 0x766C] = 0xFFFF0454 ^ 0x766C;
                    Grim2Mode.oOo00Oo0OOo0[0x47F2 ^ 0x46A5] = 0xF070 ^ 0x46A5;
                    n3 = 1015778552;
                    continue block89;
                }
                case 1015778552: {
                    Grim2Mode.oOo00Oo0OOo0[0x63D4 ^ 0x63AC] = 0x7E3AC ^ 0x63AC;
                    n3 = 650691857;
                    continue block89;
                }
                case 650691857: {
                    Grim2Mode.oOo00Oo0OOo0[0xCE5F ^ 0xCE3F] = 0xCE3A ^ 0xCE3F;
                    Grim2Mode.oOo00Oo0OOo0[0xD779 ^ 0xD7DF] = 0xD7DC ^ 0xD7DF;
                    Grim2Mode.oOo00Oo0OOo0[0xB7B3 ^ 0xB68F] = 0x1B6A4 ^ 0xB68F;
                    Grim2Mode.oOo00Oo0OOo0[0x7E42 ^ 0x7EFA] = 0xFFFF8105 ^ 0x7EFA;
                    Grim2Mode.oOo00Oo0OOo0[0x1F51 ^ 0x1F57] = 0x1F52 ^ 0x1F57;
                    Grim2Mode.oOo00Oo0OOo0[0x41B8 ^ 0x4031] = 0xCDEB ^ 0x4031;
                    Grim2Mode.oOo00Oo0OOo0[0xCDA ^ 0xCC8] = 0xC93 ^ 0xCC8;
                    Grim2Mode.oOo00Oo0OOo0[0x143F ^ 0x1471] = 0xFFFFEB8E ^ 0x1471;
                    Grim2Mode.oOo00Oo0OOo0[0x3B44 ^ 0x3B62] = 0x3BBE ^ 0x3B62;
                    n3 = -1816153765;
                    continue block89;
                }
                case -1816153765: {
                    Grim2Mode.oOo00Oo0OOo0[0x54FE ^ 0x559F] = 0x3CC ^ 0x559F;
                    Grim2Mode.oOo00Oo0OOo0[0x10922 ^ 0x109CF] = 0xD2FC261C ^ 0x109CF;
                    Grim2Mode.oOo00Oo0OOo0[0x12C7 ^ 0x13DB] = 0x13D4 ^ 0x13DB;
                    Grim2Mode.oOo00Oo0OOo0[0x2F6 ^ 0x20B] = 0xFFFFF2B8 ^ 0x20B;
                    n3 = -1833140928;
                    continue block89;
                }
                case -1833140928: {
                    Grim2Mode.oOo00Oo0OOo0[0x8772 ^ 0x860D] = 0xD4E3 ^ 0x860D;
                    Grim2Mode.oOo00Oo0OOo0[0x2A0F ^ 0x2A86] = 0xFFFE7514 ^ 0x2A86;
                    Grim2Mode.oOo00Oo0OOo0[0x11E6 ^ 0x11F5] = 0xFFFFEE64 ^ 0x11F5;
                    n3 = -703225166;
                    continue block89;
                }
                case -703225166: {
                    Grim2Mode.oOo00Oo0OOo0[0x84E3 ^ 0x84C0] = 0x84AD ^ 0x84C0;
                    n3 = -1077818292;
                    continue block89;
                }
                case -1077818292: {
                    Grim2Mode.oOo00Oo0OOo0[0x6778 ^ 0x6603] = 0x551F ^ 0x6603;
                    Grim2Mode.oOo00Oo0OOo0[0x4D15 ^ 0x4DF0] = 0x2FFCFDC0 ^ 0x4DF0;
                    Grim2Mode.oOo00Oo0OOo0[0x99FD ^ 0x99E1] = 0x99E8 ^ 0x99E1;
                    n3 = -1200174596;
                    continue block89;
                }
                case -1200174596: {
                    Grim2Mode.oOo00Oo0OOo0[0xA434 ^ 0xA44D] = 0xA442 ^ 0xA44D;
                    n3 = -1197170481;
                    continue block89;
                }
                case -1197170481: {
                    Grim2Mode.oOo00Oo0OOo0[0x9FD7 ^ 0x9F62] = 0x9F62 ^ 0x9F62;
                    Grim2Mode.oOo00Oo0OOo0[0x2FBD ^ 0x2E3A] = 0xFFFFE88E ^ 0x2E3A;
                    Grim2Mode.oOo00Oo0OOo0[0x3804 ^ 0x3857] = 0x4E8CA461 ^ 0x3857;
                    Grim2Mode.oOo00Oo0OOo0[0x6CF8 ^ 0x6DDC] = 0xFFFF9223 ^ 0x6DDC;
                    Grim2Mode.oOo00Oo0OOo0[0x10126 ^ 0x1007F] = 0x1B6AA ^ 0x1007F;
                    Grim2Mode.oOo00Oo0OOo0[0x4DBE ^ 0x4D69] = 0x4D7E ^ 0x4D69;
                    n3 = -1544848782;
                    continue block89;
                }
                case -1544848782: {
                    Grim2Mode.oOo00Oo0OOo0[0x1376 ^ 0x130B] = 0x1310 ^ 0x130B;
                    Grim2Mode.oOo00Oo0OOo0[0xFA42 ^ 0xFB61] = 0x8421F31C ^ 0xFB61;
                    Grim2Mode.oOo00Oo0OOo0[0x7163 ^ 0x715B] = 0xFFFF8EE8 ^ 0x715B;
                    Grim2Mode.oOo00Oo0OOo0[0x4267 ^ 0x42B9] = 0x42A6 ^ 0x42B9;
                    Grim2Mode.oOo00Oo0OOo0[0xFF4A ^ 0xFE04] = 0x41AA ^ 0xFE04;
                    Grim2Mode.oOo00Oo0OOo0[0x4DAC ^ 0x4DF7] = 0xFFFFB260 ^ 0x4DF7;
                    Grim2Mode.oOo00Oo0OOo0[0xEF3A ^ 0xEE3A] = 0xE010EE3A ^ 0xEE3A;
                    Grim2Mode.oOo00Oo0OOo0[0xEFEC ^ 0xEF30] = 0xEF3D ^ 0xEF30;
                    n3 = 107564635;
                    continue block89;
                }
                case 107564635: {
                    Grim2Mode.oOo00Oo0OOo0[0xE833 ^ 0xE82E] = 0xE839 ^ 0xE82E;
                    Grim2Mode.oOo00Oo0OOo0[0x5944 ^ 0x5986] = 0xF699 ^ 0x5986;
                    Grim2Mode.oOo00Oo0OOo0[0xDC92 ^ 0xDC78] = 0xDC45 ^ 0xDC78;
                    Grim2Mode.oOo00Oo0OOo0[0xF37A ^ 0xF240] = 0x1F23F ^ 0xF240;
                    Grim2Mode.oOo00Oo0OOo0[0x1685 ^ 0x166C] = 0xFFFFE9C7 ^ 0x166C;
                    Grim2Mode.oOo00Oo0OOo0[0xAF3E ^ 0xAF53] = 0xAF40 ^ 0xAF53;
                    n3 = 1010334940;
                    continue block89;
                }
                case 1010334940: {
                    Grim2Mode.oOo00Oo0OOo0[0xAD45 ^ 0xAC11] = 0x9D82 ^ 0xAC11;
                    Grim2Mode.oOo00Oo0OOo0[0x2939 ^ 0x28B3] = 0xA56D ^ 0x28B3;
                    Grim2Mode.oOo00Oo0OOo0[0x9550 ^ 0x951C] = 0xFFFF6AE3 ^ 0x951C;
                    Grim2Mode.oOo00Oo0OOo0[0x2F9C ^ 0x2FE3] = 0xE5E08953 ^ 0x2FE3;
                    Grim2Mode.oOo00Oo0OOo0[0x6C6E ^ 0x6C4E] = 0x6C51 ^ 0x6C4E;
                    Grim2Mode.oOo00Oo0OOo0[0x780D ^ 0x786F] = 0x7868 ^ 0x786F;
                    Grim2Mode.oOo00Oo0OOo0[0xBF17 ^ 0xBE67] = 0xFFFFA7D8 ^ 0xBE67;
                    Grim2Mode.oOo00Oo0OOo0[0x44E7 ^ 0x45CB] = 0xFFFFBA22 ^ 0x45CB;
                    Grim2Mode.oOo00Oo0OOo0[0x2BF0 ^ 0x2B4E] = 0x4DEC ^ 0x2B4E;
                    n3 = -1739638657;
                    continue block89;
                }
                case -1739638657: {
                    Grim2Mode.oOo00Oo0OOo0[0x1BA7 ^ 0x1B0F] = 0xFFFFE479 ^ 0x1B0F;
                    Grim2Mode.oOo00Oo0OOo0[0x9F36 ^ 0x9E7F] = 0x6695 ^ 0x9E7F;
                    Grim2Mode.oOo00Oo0OOo0[0xFB29 ^ 0xFB95] = 0xFB91 ^ 0xFB95;
                    Grim2Mode.oOo00Oo0OOo0[0xF1E6 ^ 0xF18F] = 0xF192 ^ 0xF18F;
                    Grim2Mode.oOo00Oo0OOo0[0xF397 ^ 0xF309] = 0xD8FD7CD0 ^ 0xF309;
                    Grim2Mode.oOo00Oo0OOo0[0xBEE5 ^ 0xBED1] = 0xBED6 ^ 0xBED1;
                    Grim2Mode.oOo00Oo0OOo0[0xF649 ^ 0xF72B] = 0xB84F ^ 0xF72B;
                    Grim2Mode.oOo00Oo0OOo0[0xA28F ^ 0xA2FC] = 0xA299 ^ 0xA2FC;
                    Grim2Mode.oOo00Oo0OOo0[0x7D91 ^ 0x7D41] = 0x7D4A ^ 0x7D41;
                    Grim2Mode.oOo00Oo0OOo0[0xB1FB ^ 0xB0EA] = 0x9CD49ECA ^ 0xB0EA;
                    Grim2Mode.oOo00Oo0OOo0[0x51FA ^ 0x51AF] = 0x51AA ^ 0x51AF;
                    n3 = 1475884826;
                    continue block89;
                }
                case 1475884826: {
                    Grim2Mode.oOo00Oo0OOo0[0xB93A ^ 0xB9EE] = 0xB989 ^ 0xB9EE;
                    Grim2Mode.oOo00Oo0OOo0[0xCA01 ^ 0xCAF1] = 0xA7B9AAA0 ^ 0xCAF1;
                    Grim2Mode.oOo00Oo0OOo0[0xF4A4 ^ 0xF5F4] = 0xFFFFB5C2 ^ 0xF5F4;
                    Grim2Mode.oOo00Oo0OOo0[0x997A ^ 0x9870] = 0x986D ^ 0x9870;
                    Grim2Mode.oOo00Oo0OOo0[0xEE11 ^ 0xEF7A] = 0xCED4 ^ 0xEF7A;
                    Grim2Mode.oOo00Oo0OOo0[0x20F7 ^ 0x20ED] = 0x20E8 ^ 0x20ED;
                    Grim2Mode.oOo00Oo0OOo0[0x8D5F ^ 0x8D3B] = 0xFFFF72C4 ^ 0x8D3B;
                    n3 = 666030094;
                    continue block89;
                }
                case 666030094: {
                    Grim2Mode.oOo00Oo0OOo0[0x554D ^ 0x553F] = 0xFFFFAACE ^ 0x553F;
                    Grim2Mode.oOo00Oo0OOo0[0x5BFE ^ 0x5A7A] = 0xD8F0 ^ 0x5A7A;
                    Grim2Mode.oOo00Oo0OOo0[0x10D13 ^ 0x10D2E] = 0xFFFEF2DF ^ 0x10D2E;
                    Grim2Mode.oOo00Oo0OOo0[0x10A6 ^ 0x1044] = 0x104F ^ 0x1044;
                    Grim2Mode.oOo00Oo0OOo0[0x8AF3 ^ 0x8AA9] = 0xFFFF7556 ^ 0x8AA9;
                    Grim2Mode.oOo00Oo0OOo0[0xC012 ^ 0xC17C] = 0x2724 ^ 0xC17C;
                    Grim2Mode.oOo00Oo0OOo0[0x5017 ^ 0x5136] = 0x513D ^ 0x5136;
                    n3 = 282430286;
                    continue block89;
                }
                case 282430286: {
                    Grim2Mode.oOo00Oo0OOo0[0xF6E5 ^ 0xF667] = 0xFFFF0998 ^ 0xF667;
                    Grim2Mode.oOo00Oo0OOo0[0x7EEB ^ 0x7EE3] = 0xFC007EAD ^ 0x7EE3;
                    Grim2Mode.oOo00Oo0OOo0[0xEB29 ^ 0xEBB4] = 0x3FE10A55 ^ 0xEBB4;
                    n3 = 1775221728;
                    continue block89;
                }
                case 1775221728: {
                    Grim2Mode.oOo00Oo0OOo0[0xD14B ^ 0xD0C7] = 0x5D19 ^ 0xD0C7;
                    n3 = 1252281045;
                    continue block89;
                }
                case 1252281045: {
                    Grim2Mode.oOo00Oo0OOo0[0x14D ^ 0x7D] = 0xA17B ^ 0x7D;
                    Grim2Mode.oOo00Oo0OOo0[0x7E5B ^ 0x7E37] = 0x7E30 ^ 0x7E37;
                    n3 = -1966390119;
                    continue block89;
                }
                case -1966390119: {
                    Grim2Mode.oOo00Oo0OOo0[0x59D7 ^ 0x589C] = 0x1C3D ^ 0x589C;
                    Grim2Mode.oOo00Oo0OOo0[0xAA21 ^ 0xAB45] = 0xFFFF1BD8 ^ 0xAB45;
                    Grim2Mode.oOo00Oo0OOo0[0x277B ^ 0x27BF] = 0x27BF ^ 0x27BF;
                    Grim2Mode.oOo00Oo0OOo0[0x4B7B ^ 0x4A26] = 0xB27F ^ 0x4A26;
                    n3 = -1521567803;
                    continue block89;
                }
                case -1521567803: {
                    Grim2Mode.oOo00Oo0OOo0[0xC0ED ^ 0xC1C6] = 0xC1D3 ^ 0xC1C6;
                    n3 = -698243702;
                    continue block89;
                }
                case -698243702: {
                    Grim2Mode.oOo00Oo0OOo0[0x3B93 ^ 0x3AF6] = 0x7593 ^ 0x3AF6;
                    Grim2Mode.oOo00Oo0OOo0[0x9352 ^ 0x9344] = 0x652267E5 ^ 0x9344;
                    n3 = -982884679;
                    continue block89;
                }
                case -982884679: {
                    Grim2Mode.oOo00Oo0OOo0[0x4070 ^ 0x4071] = 0x4076 ^ 0x4071;
                    n3 = 831919231;
                    continue block89;
                }
                case 831919231: {
                    Grim2Mode.oOo00Oo0OOo0[0xE653 ^ 0xE638] = 0xE621 ^ 0xE638;
                    Grim2Mode.oOo00Oo0OOo0[0xE327 ^ 0xE352] = 0xFFFF1C89 ^ 0xE352;
                    Grim2Mode.oOo00Oo0OOo0[0x10DFE ^ 0x10CB6] = 0x1F45C ^ 0x10CB6;
                    Grim2Mode.oOo00Oo0OOo0[0x29EC ^ 0x289B] = 0xDEC1 ^ 0x289B;
                    Grim2Mode.oOo00Oo0OOo0[0x1A62 ^ 0x1A49] = 0x1A68 ^ 0x1A49;
                    Grim2Mode.oOo00Oo0OOo0[0x8069 ^ 0x815B] = 0x868E ^ 0x815B;
                    n3 = -1176660616;
                    continue block89;
                }
                case -1176660616: {
                    Grim2Mode.oOo00Oo0OOo0[0x1394 ^ 0x13F1] = 0xFFFFEC66 ^ 0x13F1;
                    Grim2Mode.oOo00Oo0OOo0[0xCCFE ^ 0xCD76] = 0xF409 ^ 0xCD76;
                    Grim2Mode.oOo00Oo0OOo0[0xA622 ^ 0xA734] = 0xA73B ^ 0xA734;
                    Grim2Mode.oOo00Oo0OOo0[0xB226 ^ 0xB349] = 0x551E ^ 0xB349;
                    n3 = 1041719930;
                    continue block89;
                }
                case 1041719930: {
                    Grim2Mode.oOo00Oo0OOo0[0xDE2 ^ 0xD4D] = 0xFFFFF2B2 ^ 0xD4D;
                    Grim2Mode.oOo00Oo0OOo0[0xEE31 ^ 0xEE98] = 0xFFFF1151 ^ 0xEE98;
                    Grim2Mode.oOo00Oo0OOo0[0xA0A6 ^ 0xA1BB] = 0xA1BC ^ 0xA1BB;
                    Grim2Mode.oOo00Oo0OOo0[0xC227 ^ 0xC2DC] = 0xC2D3 ^ 0xC2DC;
                    Grim2Mode.oOo00Oo0OOo0[0x2662 ^ 0x261C] = 0x2619 ^ 0x261C;
                    Grim2Mode.oOo00Oo0OOo0[0xB981 ^ 0xB8BA] = 0x1B8CE ^ 0xB8BA;
                    Grim2Mode.oOo00Oo0OOo0[0xE95F ^ 0xE964] = 0xFFFF169B ^ 0xE964;
                    n3 = 1462392137;
                    continue block89;
                }
                case 1462392137: {
                    Grim2Mode.oOo00Oo0OOo0[0xEA43 ^ 0xEA62] = 0xEA63 ^ 0xEA62;
                    n3 = 1330941053;
                    continue block89;
                }
                case 1330941053: {
                    Grim2Mode.oOo00Oo0OOo0[0xD590 ^ 0xD555] = 0xF0D74160 ^ 0xD555;
                    Grim2Mode.oOo00Oo0OOo0[0xDCF4 ^ 0xDC77] = 0xFFFF2388 ^ 0xDC77;
                    Grim2Mode.oOo00Oo0OOo0[0x1127 ^ 0x1053] = 0x39E ^ 0x1053;
                    n3 = 1566483089;
                    continue block89;
                }
                case 1566483089: {
                    Grim2Mode.oOo00Oo0OOo0[0xDF00 ^ 0xDF59] = 0xDF14 ^ 0xDF59;
                    n3 = 1803431866;
                    continue block89;
                }
                case 1803431866: {
                    Grim2Mode.oOo00Oo0OOo0[0x6CF4 ^ 0x6DA2] = 0xDB72 ^ 0x6DA2;
                    n3 = 120851352;
                    continue block89;
                }
                case 120851352: {
                    Grim2Mode.oOo00Oo0OOo0[0xD696 ^ 0xD64B] = 0xD64A ^ 0xD64B;
                    Grim2Mode.oOo00Oo0OOo0[0x1A57 ^ 0x1B5B] = 0x26E9638E ^ 0x1B5B;
                    n3 = 366343515;
                    continue block89;
                }
                case 366343515: {
                    Grim2Mode.oOo00Oo0OOo0[0x7471 ^ 0x75F2] = 0xF710 ^ 0x75F2;
                    Grim2Mode.oOo00Oo0OOo0[0x838F ^ 0x834C] = 0x8879 ^ 0x834C;
                    Grim2Mode.oOo00Oo0OOo0[0xA14B ^ 0xA06E] = 0xA053 ^ 0xA06E;
                    Grim2Mode.oOo00Oo0OOo0[0x6372 ^ 0x6235] = 0x9ADF ^ 0x6235;
                    n3 = -1550119082;
                    continue block89;
                }
                case -1550119082: {
                    Grim2Mode.oOo00Oo0OOo0[0xB402 ^ 0xB4A6] = 0xB4A7 ^ 0xB4A6;
                    Grim2Mode.oOo00Oo0OOo0[0x5C91 ^ 0x5DE8] = 0x6ECD ^ 0x5DE8;
                    n3 = 856975984;
                    continue block89;
                }
                case 856975984: {
                    Grim2Mode.oOo00Oo0OOo0[0x74CD ^ 0x75F8] = 0x7221 ^ 0x75F8;
                    Grim2Mode.oOo00Oo0OOo0[0xC6EC ^ 0xC655] = 0xDC2A ^ 0xC655;
                    Grim2Mode.oOo00Oo0OOo0[0x20BA ^ 0x21F8] = 0x4475 ^ 0x21F8;
                    n3 = 1404926651;
                    continue block89;
                }
                case 1404926651: {
                    Grim2Mode.oOo00Oo0OOo0[0x23DB ^ 0x22BD] = 0xF2CE ^ 0x22BD;
                    n3 = 299601944;
                    continue block89;
                }
                case 299601944: {
                    Grim2Mode.oOo00Oo0OOo0[0x10BC2 ^ 0x10BC8] = 0xFFFEF437 ^ 0x10BC8;
                    n3 = 102181663;
                    continue block89;
                }
                case 102181663: {
                    Grim2Mode.oOo00Oo0OOo0[0xD9E5 ^ 0xD92B] = 0xD922 ^ 0xD92B;
                    Grim2Mode.oOo00Oo0OOo0[0x3A7 ^ 0x322] = 0x32F ^ 0x322;
                    Grim2Mode.oOo00Oo0OOo0[0x581B ^ 0x58C2] = 0xF6FCA43F ^ 0x58C2;
                    Grim2Mode.oOo00Oo0OOo0[0xA1D0 ^ 0xA1B3] = 0xFFFF5E26 ^ 0xA1B3;
                    Grim2Mode.oOo00Oo0OOo0[0xEE64 ^ 0xEE1F] = 0xFFFF11EE ^ 0xEE1F;
                    Grim2Mode.oOo00Oo0OOo0[0x1CBA ^ 0x1C20] = 0x1C29 ^ 0x1C20;
                    Grim2Mode.oOo00Oo0OOo0[0xDB7F ^ 0xDBD3] = 0xFDB1B42 ^ 0xDBD3;
                    Grim2Mode.oOo00Oo0OOo0[0x5ED8 ^ 0x5E93] = 0x5E94 ^ 0x5E93;
                    Grim2Mode.oOo00Oo0OOo0[0x6BE1 ^ 0x6B2D] = 0x6B4E ^ 0x6B2D;
                    Grim2Mode.oOo00Oo0OOo0[0x3888 ^ 0x39E8] = 0x6FA1 ^ 0x39E8;
                    n3 = 268484664;
                    continue block89;
                }
                case 268484664: {
                    Grim2Mode.oOo00Oo0OOo0[0xB2D9 ^ 0xB219] = 0xFFFF4DE6 ^ 0xB219;
                    Grim2Mode.oOo00Oo0OOo0[0x86B9 ^ 0x86BE] = 0x86A5 ^ 0x86BE;
                    n3 = 2637404;
                    continue block89;
                }
                case 2637404: {
                    Grim2Mode.oOo00Oo0OOo0[0x3825 ^ 0x38BE] = 0x38A9 ^ 0x38BE;
                    Grim2Mode.oOo00Oo0OOo0[0x567D ^ 0x569C] = 0x5689 ^ 0x569C;
                    Grim2Mode.oOo00Oo0OOo0[0x5601 ^ 0x563D] = 0xFFFFA9C2 ^ 0x563D;
                    Grim2Mode.oOo00Oo0OOo0[0x106B7 ^ 0x107BA] = 0xFFFEF845 ^ 0x107BA;
                    Grim2Mode.oOo00Oo0OOo0[0xCD47 ^ 0xCDE5] = 0xFFFF3214 ^ 0xCDE5;
                    n3 = 1797993944;
                    continue block89;
                }
                case 1797993944: {
                    Grim2Mode.oOo00Oo0OOo0[0x5894 ^ 0x5837] = 0x5833 ^ 0x5837;
                    n3 = 249210500;
                    continue block89;
                }
                case 249210500: {
                    Grim2Mode.oOo00Oo0OOo0[0xBFA9 ^ 0xBF1D] = 0xBF1D ^ 0xBF1D;
                    Grim2Mode.oOo00Oo0OOo0[0x165A ^ 0x1653] = 0xFFFFE9E2 ^ 0x1653;
                    Grim2Mode.oOo00Oo0OOo0[0xFE2D ^ 0xFF05] = 0xD02DF8D6 ^ 0xFF05;
                    n3 = 1478133911;
                    continue block89;
                }
                case 1478133911: {
                    Grim2Mode.oOo00Oo0OOo0[0x8401 ^ 0x8480] = 0xFFFF7B4F ^ 0x8480;
                    Grim2Mode.oOo00Oo0OOo0[0x3336 ^ 0x32B4] = 0xB03E ^ 0x32B4;
                    Grim2Mode.oOo00Oo0OOo0[0x71EE ^ 0x70A8] = 0x8842 ^ 0x70A8;
                    Grim2Mode.oOo00Oo0OOo0[0xD7E0 ^ 0xD6EE] = 0xD6E3 ^ 0xD6EE;
                    Grim2Mode.oOo00Oo0OOo0[0x66BB ^ 0x6648] = 0x665B ^ 0x6648;
                    Grim2Mode.oOo00Oo0OOo0[0x72FE ^ 0x7289] = 0x728A ^ 0x7289;
                    Grim2Mode.oOo00Oo0OOo0[0x212B ^ 0x2023] = 0x203E ^ 0x2023;
                    Grim2Mode.oOo00Oo0OOo0[0x6283 ^ 0x62DB] = 0xE8BA4C50 ^ 0x62DB;
                    Grim2Mode.oOo00Oo0OOo0[0x5093 ^ 0x51E5] = 0xA7B1 ^ 0x51E5;
                    Grim2Mode.oOo00Oo0OOo0[0xA5EB ^ 0xA5F0] = 0x7E80A5F1 ^ 0xA5F0;
                    Grim2Mode.oOo00Oo0OOo0[0x5FBE ^ 0x5F29] = 0xFFFFA0BE ^ 0x5F29;
                    Grim2Mode.oOo00Oo0OOo0[0x10618 ^ 0x10677] = 0xFFFEE9CD ^ 0x10677;
                    n3 = 787498897;
                    continue block89;
                }
                case 787498897: 
            }
            Grim2Mode.oOo00Oo0OOo0[0x64E7 ^ 0x6431] = 0x6464 ^ 0x6431;
            Grim2Mode.oOo00Oo0OOo0[0x10C7A ^ 0x10CF6] = 0x10CFD ^ 0x10CF6;
            Grim2Mode.oOo00Oo0OOo0[0x9211 ^ 0x928E] = 0x92F9 ^ 0x928E;
            Grim2Mode.oOo00Oo0OOo0[0x9CB6 ^ 0x9C8F] = 0x9CEE ^ 0x9C8F;
            Grim2Mode.oOo00Oo0OOo0[0x7D33 ^ 0x7D8C] = 0x7397 ^ 0x7D8C;
            Grim2Mode.oOo00Oo0OOo0[0x591A ^ 0x5833] = 0xFFFFA796 ^ 0x5833;
            Grim2Mode.oOo00Oo0OOo0[0x2EBA ^ 0x2EFB] = 0xD8FDA122 ^ 0x2EFB;
            Grim2Mode.oOo00Oo0OOo0[0x8308 ^ 0x832D] = 0xFFFF7CD2 ^ 0x832D;
            Grim2Mode.oOo00Oo0OOo0[0x9098 ^ 0x9017] = 0x9016 ^ 0x9017;
            Grim2Mode.oOo00Oo0OOo0[0xB7A8 ^ 0xB75A] = 0xFFFF48B9 ^ 0xB75A;
            Grim2Mode.oOo00Oo0OOo0[0x10197 ^ 0x10080] = 0x10FD7 ^ 0x10080;
            Grim2Mode.oOo00Oo0OOo0[0x1932 ^ 0x1815] = 0xFFFFE7EA ^ 0x1815;
            Grim2Mode.oOo00Oo0OOo0[0xD3C7 ^ 0xD284] = 0xB70B ^ 0xD284;
            n3 = 579169724;
        }
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    public Grim2Mode(String string, Speed speed) {
        int n2 = -721562673;
        if (n2 != n2) {
            throw null;
        }
        super(string, speed);
        String string2 = o0Oo000O0oO;
        if (string2 == null) {
            int n3 = oOo00Oo0OOo0[0];
            int n4 = n3 >>> oOo00Oo0OOo0[1] | n3 << oOo00Oo0OOo0[2];
            int n5 = (n4 << oOo00Oo0OOo0[3] | n4 >>> oOo00Oo0OOo0[4]) * oOo00Oo0OOo0[5];
            int n6 = oOo00Oo0OOo0[8] + oOo00Oo0OOo0[9] ^ oOo00Oo0OOo0[10];
            string2 = o0Oo000O0oO = (String)oO00O0OO0ooO[n5 >>> oOo00Oo0OOo0[6] | n5 << oOo00Oo0OOo0[7]] + (String)oO00O0OO0ooO[n6 >>> oOo00Oo0OOo0[11] | n6 << oOo00Oo0OOo0[12]];
        }
        int n7 = oOo00Oo0OOo0[13];
        this.Py = new BooleanValue(string2, (Mode<?>)this, (Boolean)(((n7 << oOo00Oo0OOo0[14] | n7 >>> oOo00Oo0OOo0[15]) + oOo00Oo0OOo0[16] - oOo00Oo0OOo0[17]) * oOo00Oo0OOo0[18]));
        int n8 = oOo00Oo0OOo0[22] * oOo00Oo0OOo0[23] * oOo00Oo0OOo0[24];
        int n9 = oOo00Oo0OOo0[27];
        int n10 = (n9 << oOo00Oo0OOo0[28] | n9 >>> oOo00Oo0OOo0[29]) * oOo00Oo0OOo0[30] + oOo00Oo0OOo0[31];
        this.Pz = new NumberValue((String)oO00O0OO0ooO[oOo00Oo0OOo0[19] - oOo00Oo0OOo0[20] ^ oOo00Oo0OOo0[21]], this, (Number)(-(n8 >>> oOo00Oo0OOo0[25] | n8 << oOo00Oo0OOo0[26])), (Number)(n10 << oOo00Oo0OOo0[32] | n10 >>> oOo00Oo0OOo0[33]), (Number)(oOo00Oo0OOo0[34] + oOo00Oo0OOo0[35] - oOo00Oo0OOo0[36] ^ oOo00Oo0OOo0[37]), (Number)Double.longBitsToDouble(0x2A1E94840399A6C8L ^ 0x154EF6C9D1680F34L));
        this.PA = jumpEvent -> {
            int n2 = 1055796015;
            if (n2 != n2) {
                oo000o00Oo00 = n2 = -1998574522;
            }
            int n3 = 142457098;
            block3: while (true) {
                switch (n3) {
                    default: {
                        if (Grim2Mode.aER.bgK.cuU) return;
                        n3 = -1321280505;
                        continue block3;
                    }
                    case -1321280505: 
                }
                break;
            }
            jumpEvent.cF();
        };
        this.PB = this::b;
        this.PC = eh2 -> {
            int n2 = -1152492084;
            if (n2 != n2) {
                int cfr_ignored_0 = 0x63 & 1;
            }
            this.Eo = this.Eo;
        };
        this.PD = preMotionEvent -> {
            int n2 = 1220677894;
            if (n2 != n2) {
                throw null;
            }
            int n3 = oOo00Oo0OOo0[130] - oOo00Oo0OOo0[131];
            this.gD = -(n3 >>> oOo00Oo0OOo0[132] | n3 << oOo00Oo0OOo0[133]);
        };
        this.PE = this::e;
        this.PF = moveInputEvent -> {
            int n2 = -2093444973;
            if (n2 != n2) {
                n2 = 53;
            }
            boolean bl2 = true;
            while (true) {
                if (!bl2 || (bl2 = false) || this.gD) {
                    int n3 = -oOo00Oo0OOo0[102] ^ oOo00Oo0OOo0[103];
                    moveInputEvent.setJump((n3 << oOo00Oo0OOo0[104] | n3 >>> oOo00Oo0OOo0[105]) != 0);
                }
                int n4 = -1852954609;
                switch (n4) {
                    case -1852954609: {
                        return;
                    }
                }
            }
        };
        this.PG = this::g;
        this.PH = fd2 -> {
            Grim2Mode.aER.bgC.dAp = 1.0f;
        };
    }

    /*
     * Unable to fully structure code
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }
}

