/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.bb;
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
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.BooleanValue;
import rise.value.NumberValue;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BufferAbuseMode
extends Mode<Flight> {
    public /* synthetic */ NumberValue FE;
    @EventLink
    public /* synthetic */ Listener<MoveInputEvent> FI;
    public /* synthetic */ BooleanValue FF;
    @EventLink
    public /* synthetic */ Listener<StrafeEvent> FG;
    public static /* synthetic */ String[] oO00O0OO0ooO;
    @EventLink
    public /* synthetic */ Listener<PacketSendEvent> FJ;
    public static /* synthetic */ Object Oo0o00000O00;
    public static /* synthetic */ Object[] o0Oo000O0oO;
    @EventLink
    public /* synthetic */ Listener<PreMotionEvent> FH;
    public static /* synthetic */ String[] q0oOOoOo0O00O;
    public static /* synthetic */ Object[] q0OOOoo00o0;
    private static /* synthetic */ int[] O0OoOO0OOOOO;
    private static /* synthetic */ int ooo00oo0Ooo0;
    private static /* synthetic */ boolean o0o000o0O0o0;

    /*
     * Enabled aggressive block sorting
     */
    public BufferAbuseMode(String string, Flight flight) {
        int n2 = 197885843;
        if (n2 != n2) {
            n2 = 61;
        }
        super(string, flight);
        int n3 = -1490809133;
        block3: while (true) {
            switch (n3) {
                default: {
                    int n4 = O0OoOO0OOOOO[2];
                    int n5 = n4 >>> O0OoOO0OOOOO[3] | n4 << O0OoOO0OOOOO[4];
                    this.FE = new NumberValue((String)o0Oo000O0oO[-O0OoOO0OOOOO[0] ^ O0OoOO0OOOOO[1]], this, (Number)(n5 >>> O0OoOO0OOOOO[5] | n5 << O0OoOO0OOOOO[6]), (Number)Double.longBitsToDouble(0x5BDE9CFDC918FE09L ^ 0x6467056450816793L), (Number)Double.longBitsToDouble(0xFEA6ACF5E12FEE64L ^ 0xBE85ACF5E12FEE64L), (Number)Double.longBitsToDouble(0x759A9FCF07E5B5BFL ^ 0x4A2306569E7C2C25L));
                    int n6 = -O0OoOO0OOOOO[7] - O0OoOO0OOOOO[8];
                    int n7 = O0OoOO0OOOOO[12] ^ O0OoOO0OOOOO[13];
                    this.FF = new BooleanValue((String)o0Oo000O0oO[(n6 >>> O0OoOO0OOOOO[9] | n6 << O0OoOO0OOOOO[10]) * O0OoOO0OOOOO[11]], (Mode<?>)this, (Boolean)(((n7 >>> O0OoOO0OOOOO[14] | n7 << O0OoOO0OOOOO[15]) ^ O0OoOO0OOOOO[16]) != 0));
                    this.FG = strafeEvent -> {
                        long l2 = Float.floatToRawIntBits(((Number)this.FE.wD()).floatValue());
                        long[] lArray = new long[]{l2};
                        strafeEvent.setSpeed(Float.intBitsToFloat((int)lArray[0]));
                    };
                    this.FH = this::f;
                    this.FI = moveInputEvent -> {
                        int n2 = 727703440;
                        if (n2 != n2) {
                            n2 = 969832881;
                        }
                        int n3 = 1156056860;
                        moveInputEvent.setSneak((-O0OoOO0OOOOO[17] ^ O0OoOO0OOOOO[18]) != 0);
                    };
                    n3 = -1074972829;
                    continue block3;
                }
                case -1074972829: 
            }
            break;
        }
        this.FJ = packetSendEvent -> {
            int n2 = -425089306;
            if (n2 != n2) {
                throw new TypeNotPresentException();
            }
            Object[] objectArray = new Object[3];
            if (!((Boolean)this.FF.wD()).booleanValue()) {
                objectArray[2] = packetSendEvent.dq();
                if ((aj)objectArray[2] instanceof e) {
                    objectArray[1] = (e)((aj)objectArray[2]);
                    int n3 = -1270486173;
                    if (((e)objectArray[1]).isMoving()) return;
                    if (!bb.aW()) {
                        packetSendEvent.cF();
                    }
                }
            }
        };
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = -2130796716;
        if (n2 != n2) {
            n2 = 50;
        }
        O0OoOO0OOOOO = new int[0xB052 ^ 0xB1C2];
        BufferAbuseMode.O0OoOO0OOOOO[0xCC15 ^ 0xCC1D] = 0xCC32 ^ 0xCC1D;
        int n3 = -1202888512;
        block96: while (true) {
            switch (n3) {
                case 1641180046: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xB01B ^ 0xB016] = 0xFFFF4FE9 ^ 0xB016;
                    BufferAbuseMode.O0OoOO0OOOOO[0x17F4 ^ 0x16DA] = 0x7002 ^ 0x16DA;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7814 ^ 0x792C] = 0xA3A3 ^ 0x792C;
                    BufferAbuseMode.O0OoOO0OOOOO[0x698B ^ 0x68ED] = 0x68E5 ^ 0x68ED;
                    BufferAbuseMode.O0OoOO0OOOOO[0xACBC ^ 0xAC81] = 0x81812D03 ^ 0xAC81;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE2A6 ^ 0xE32F] = 0xE32F ^ 0xE32F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x563E ^ 0x5727] = 0xFFFF46F5 ^ 0x5727;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE97E ^ 0xE9C7] = 0x60F5 ^ 0xE9C7;
                    n3 = 1108536623;
                    continue block96;
                }
                case 1108536623: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x94CE ^ 0x9422] = 0x555 ^ 0x9422;
                    n3 = -600736420;
                    continue block96;
                }
                case -600736420: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xA7B8 ^ 0xA7D6] = 0xFFFF5837 ^ 0xA7D6;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB48F ^ 0xB4F6] = 0xB4A5 ^ 0xB4F6;
                    n3 = 1693450384;
                    continue block96;
                }
                case 1693450384: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x2A7D ^ 0x2A81] = 0x2FF3 ^ 0x2A81;
                    BufferAbuseMode.O0OoOO0OOOOO[0x191E ^ 0x19B5] = 0xE59D ^ 0x19B5;
                    n3 = 1194451031;
                    continue block96;
                }
                case 1194451031: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xF62 ^ 0xE44] = 0xC10F ^ 0xE44;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1775 ^ 0x17EC] = 0x11B93 ^ 0x17EC;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4102 ^ 0x4114] = 0xFFFFBEFF ^ 0x4114;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8F6C ^ 0x8FFB] = 0x7F8A ^ 0x8FFB;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8D84 ^ 0x8D39] = 0x7D90 ^ 0x8D39;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6C06 ^ 0x6C16] = 0x6C27 ^ 0x6C16;
                    BufferAbuseMode.O0OoOO0OOOOO[0x673A ^ 0x6739] = 0x6736 ^ 0x6739;
                    BufferAbuseMode.O0OoOO0OOOOO[0x49F7 ^ 0x49FB] = 0x9DFFB604 ^ 0x49FB;
                    BufferAbuseMode.O0OoOO0OOOOO[0x669 ^ 0x6A5] = 0xD501 ^ 0x6A5;
                    n3 = -1659438481;
                    continue block96;
                }
                case -1659438481: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x43C0 ^ 0x4382] = 0x43A3 ^ 0x4382;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1478 ^ 0x153C] = 0xC42C ^ 0x153C;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3C48 ^ 0x3CC2] = 0xFFFFCFFF ^ 0x3CC2;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD8F4 ^ 0xD880] = 0xD89B ^ 0xD880;
                    BufferAbuseMode.O0OoOO0OOOOO[0x28C0 ^ 0x280E] = 0xFBC9 ^ 0x280E;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6817 ^ 0x68E4] = 0x8856 ^ 0x68E4;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8FC0 ^ 0x8F44] = 0x8F43 ^ 0x8F44;
                    BufferAbuseMode.O0OoOO0OOOOO[0x100B4 ^ 0x100AF] = 0x100A0 ^ 0x100AF;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7471 ^ 0x7551] = 0x7282 ^ 0x7551;
                    n3 = -52103911;
                    continue block96;
                }
                case -52103911: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x7FB7 ^ 0x7F50] = 0xA627 ^ 0x7F50;
                    BufferAbuseMode.O0OoOO0OOOOO[0x31FE ^ 0x31D6] = 0xE7B0 ^ 0x31D6;
                    n3 = -752532353;
                    continue block96;
                }
                case -752532353: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x1CEF ^ 0x1CF8] = 0xFFFFE345 ^ 0x1CF8;
                    n3 = -643380578;
                    continue block96;
                }
                case -643380578: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x63D6 ^ 0x62D1] = 0x6208 ^ 0x62D1;
                    BufferAbuseMode.O0OoOO0OOOOO[0xCFB ^ 0xCD9] = 0x5F02AF78 ^ 0xCD9;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8C8 ^ 0x833] = 0xD49 ^ 0x833;
                    BufferAbuseMode.O0OoOO0OOOOO[0x970C ^ 0x9707] = 0x5CC07A74 ^ 0x9707;
                    n3 = 775864083;
                    continue block96;
                }
                case 775864083: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x47F7 ^ 0x46AA] = 0xFFFFB955 ^ 0x46AA;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4DB8 ^ 0x4D36] = 0xFFFFB293 ^ 0x4D36;
                    BufferAbuseMode.O0OoOO0OOOOO[0x83C2 ^ 0x828D] = 0x17DF ^ 0x828D;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6F33 ^ 0x6E4D] = 0x6E4D ^ 0x6E4D;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD2BF ^ 0xD2B1] = 0xD2A8 ^ 0xD2B1;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7044 ^ 0x7131] = 0xFFFF8EB5 ^ 0x7131;
                    BufferAbuseMode.O0OoOO0OOOOO[0x871A ^ 0x87DE] = 0xFB17 ^ 0x87DE;
                    n3 = 1025971536;
                    continue block96;
                }
                case 1025971536: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x7460 ^ 0x752A] = 0x7787 ^ 0x752A;
                    BufferAbuseMode.O0OoOO0OOOOO[0xEC81 ^ 0xEDF8] = 0xEDDF ^ 0xEDF8;
                    n3 = -718380392;
                    continue block96;
                }
                case -718380392: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x364 ^ 0x3FC] = 0x10F89 ^ 0x3FC;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF222 ^ 0xF322] = 0x1F5C ^ 0xF322;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6DA6 ^ 0x6CC4] = 0x6CC3 ^ 0x6CC4;
                    n3 = -1787855554;
                    continue block96;
                }
                case -1787855554: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xA040 ^ 0xA10E] = 0x1A8FC ^ 0xA10E;
                    BufferAbuseMode.O0OoOO0OOOOO[0x97AF ^ 0x969D] = 0xBF90 ^ 0x969D;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2CCF ^ 0x2CFF] = 0x2CF0 ^ 0x2CFF;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5492 ^ 0x55A3] = 0x7CE6 ^ 0x55A3;
                    BufferAbuseMode.O0OoOO0OOOOO[0x67C7 ^ 0x6765] = 0xFFFF38EC ^ 0x6765;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5A69 ^ 0x5B66] = 0xEC6C ^ 0x5B66;
                    BufferAbuseMode.O0OoOO0OOOOO[0xBB88 ^ 0xBBDD] = 0xBBDE ^ 0xBBDD;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF4A4 ^ 0xF444] = 0xF6F8 ^ 0xF444;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5E61 ^ 0x5E13] = 0xFFFFA1A8 ^ 0x5E13;
                    n3 = -431531643;
                    continue block96;
                }
                case -431531643: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xEF83 ^ 0xEFA8] = 0xFFFF1057 ^ 0xEFA8;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF60 ^ 0xFE7] = 0xFF0 ^ 0xFE7;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2415 ^ 0x2595] = 0x2592 ^ 0x2595;
                    n3 = 1425878493;
                    continue block96;
                }
                case 1425878493: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x1064C ^ 0x10719] = 0x1DF72 ^ 0x10719;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB105 ^ 0xB1ED] = 0x6885 ^ 0xB1ED;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAB81 ^ 0xABE6] = 0xABD7 ^ 0xABE6;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC0D6 ^ 0xC1E5] = 0xD2E9 ^ 0xC1E5;
                    BufferAbuseMode.O0OoOO0OOOOO[0xBB0 ^ 0xB2D] = 0x6F1A ^ 0xB2D;
                    BufferAbuseMode.O0OoOO0OOOOO[0x41B6 ^ 0x40DB] = 0x4083 ^ 0x40DB;
                    BufferAbuseMode.O0OoOO0OOOOO[0x46A1 ^ 0x46F7] = 0x46EA ^ 0x46F7;
                    BufferAbuseMode.O0OoOO0OOOOO[0x109DF ^ 0x108D6] = 0xFFFEF7BA ^ 0x108D6;
                    n3 = -436375600;
                    continue block96;
                }
                case -436375600: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xFB4 ^ 0xE33] = 0xF33 ^ 0xE33;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7528 ^ 0x7597] = 0x853E ^ 0x7597;
                    n3 = -1314481617;
                    continue block96;
                }
                case -1314481617: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xBFFE ^ 0xBEF0] = 0x43B6 ^ 0xBEF0;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2412 ^ 0x2465] = 0x246C ^ 0x2465;
                    n3 = 142904095;
                    continue block96;
                }
                case 142904095: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x9F05 ^ 0x9E06] = 0x125B ^ 0x9E06;
                    BufferAbuseMode.O0OoOO0OOOOO[0x10F2C ^ 0x10E05] = 0x1507A ^ 0x10E05;
                    n3 = -1087897778;
                    continue block96;
                }
                case -1087897778: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xE831 ^ 0xE872] = 0xE873 ^ 0xE872;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB92B ^ 0xB816] = 0x1789 ^ 0xB816;
                    BufferAbuseMode.O0OoOO0OOOOO[0xFA8 ^ 0xEF3] = 0xEF3 ^ 0xEF3;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAF46 ^ 0xAF7E] = 0xFFFF50B9 ^ 0xAF7E;
                    BufferAbuseMode.O0OoOO0OOOOO[0xDCDA ^ 0xDD8B] = 0xFFFFB711 ^ 0xDD8B;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE1BD ^ 0xE191] = 0xE191 ^ 0xE191;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC04E ^ 0xC064] = 0x3E41 ^ 0xC064;
                    n3 = 2052635806;
                    continue block96;
                }
                case 2052635806: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x7E8E ^ 0x7E92] = 0xBEFB912D ^ 0x7E92;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8451 ^ 0x852D] = 0x852C ^ 0x852D;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC75E ^ 0xC773] = 0x11C706 ^ 0xC773;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3A7A ^ 0x3B29] = 0xE334 ^ 0x3B29;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7F12 ^ 0x7F0A] = 0xFFFF809D ^ 0x7F0A;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE5BC ^ 0xE56D] = 0x1C93 ^ 0xE56D;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB1AE ^ 0xB0C1] = 0xB08A ^ 0xB0C1;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC57C ^ 0xC477] = 0x3920 ^ 0xC477;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2A1 ^ 0x280] = 0xFFFFFD7F ^ 0x280;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7158 ^ 0x7197] = 0xA23D ^ 0x7197;
                    BufferAbuseMode.O0OoOO0OOOOO[0x855D ^ 0x84DC] = 0x8499 ^ 0x84DC;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4D4D ^ 0x4D5E] = 0x4D5A ^ 0x4D5E;
                    BufferAbuseMode.O0OoOO0OOOOO[0x68E7 ^ 0x687C] = 0x16403 ^ 0x687C;
                    n3 = -818735929;
                    continue block96;
                }
                case -818735929: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xEF1B ^ 0xEE91] = 0x72AA ^ 0xEE91;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1018B ^ 0x100AE] = 0x1CFE2 ^ 0x100AE;
                    n3 = 98182505;
                    continue block96;
                }
                case 98182505: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xFFB4 ^ 0xFFFB] = 0xFFFF0004 ^ 0xFFFB;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9B99 ^ 0x9BDC] = 0xE6009BDC ^ 0x9BDC;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE214 ^ 0xE287] = 0x4D44 ^ 0xE287;
                    n3 = -1436371707;
                    continue block96;
                }
                case -1436371707: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x43AD ^ 0x439C] = 0x438D ^ 0x439C;
                    BufferAbuseMode.O0OoOO0OOOOO[0xDF7 ^ 0xDD4] = 0xDD4 ^ 0xDD4;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7C6E ^ 0x7D26] = 0x7F8B ^ 0x7D26;
                    n3 = -1598976755;
                    continue block96;
                }
                case -1598976755: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x95D7 ^ 0x9481] = 0x4C92 ^ 0x9481;
                    n3 = 33616865;
                    continue block96;
                }
                case 33616865: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x9721 ^ 0x9781] = 0x37DA ^ 0x9781;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5032 ^ 0x50AD] = 0x349A ^ 0x50AD;
                    BufferAbuseMode.O0OoOO0OOOOO[0xFB3 ^ 0xFD0] = 0xFFFFF04B ^ 0xFD0;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9812 ^ 0x9969] = 0x995A ^ 0x9969;
                    n3 = 1809377698;
                    continue block96;
                }
                case 1809377698: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x7FD7 ^ 0x7F8D] = Short.MAX_VALUE ^ 0x7F8D;
                    BufferAbuseMode.O0OoOO0OOOOO[0xBD9A ^ 0xBCD1] = 0x1B529 ^ 0xBCD1;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3A21 ^ 0x3B5E] = 0x3B06 ^ 0x3B5E;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9CF5 ^ 0x9C43] = 0xFFFF6209 ^ 0x9C43;
                    BufferAbuseMode.O0OoOO0OOOOO[0x244F ^ 0x2494] = 0x6ACD ^ 0x2494;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9C76 ^ 0x9C12] = 0x9C07 ^ 0x9C12;
                    BufferAbuseMode.O0OoOO0OOOOO[0x10602 ^ 0x1067A] = 0x1066D ^ 0x1067A;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC257 ^ 0xC2AE] = 0xFFFFADF4 ^ 0xC2AE;
                    n3 = -637472090;
                    continue block96;
                }
                case -637472090: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x6BB1 ^ 0x6BDD] = 0x6BC2 ^ 0x6BDD;
                    BufferAbuseMode.O0OoOO0OOOOO[0x502F ^ 0x50C6] = 0x89E4 ^ 0x50C6;
                    n3 = 1036792606;
                    continue block96;
                }
                case 1036792606: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x9BC5 ^ 0x9B91] = 0xFFFF646E ^ 0x9B91;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE099 ^ 0xE052] = 0x95FD ^ 0xE052;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5DEF ^ 0x5DA8] = 0x5DB1 ^ 0x5DA8;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7E6A ^ 0x7EBF] = 0xB117 ^ 0x7EBF;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC820 ^ 0xC86D] = 0xC866 ^ 0xC86D;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB0FF ^ 0xB1C6] = 0x6B72 ^ 0xB1C6;
                    BufferAbuseMode.O0OoOO0OOOOO[0x200C ^ 0x2079] = 0xFFFFDFB0 ^ 0x2079;
                    n3 = -233166285;
                    continue block96;
                }
                case -233166285: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x10B9B ^ 0x10BFD] = 0xFFFEF444 ^ 0x10BFD;
                    n3 = -624517785;
                    continue block96;
                }
                case -624517785: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x10881 ^ 0x1099F] = 0x13B16 ^ 0x1099F;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC400 ^ 0xC4D0] = 0x3D27 ^ 0xC4D0;
                    BufferAbuseMode.O0OoOO0OOOOO[0xBB8C ^ 0xBBC5] = 0xFFE2442C ^ 0xBBC5;
                    n3 = 993532085;
                    continue block96;
                }
                case 993532085: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x7053 ^ 0x70E4] = 0x7162 ^ 0x70E4;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2AC7 ^ 0x2A68] = 0x9950 ^ 0x2A68;
                    BufferAbuseMode.O0OoOO0OOOOO[0x194E ^ 0x199C] = 0xE017 ^ 0x199C;
                    BufferAbuseMode.O0OoOO0OOOOO[0xFCCF ^ 0xFD8D] = 0x32A ^ 0xFD8D;
                    n3 = 1203953956;
                    continue block96;
                }
                case 1203953956: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xE6DE ^ 0xE7EA] = 0xF4E7 ^ 0xE7EA;
                    BufferAbuseMode.O0OoOO0OOOOO[0xEF08 ^ 0xEE6B] = 0xEE62 ^ 0xEE6B;
                    BufferAbuseMode.O0OoOO0OOOOO[0x43D8 ^ 0x43D9] = 0x4386 ^ 0x43D9;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD406 ^ 0xD46B] = 0xD46A ^ 0xD46B;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE69A ^ 0xE7BE] = 0x28F5 ^ 0xE7BE;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7FB2 ^ 0x7F00] = 0xFFFFCBC5 ^ 0x7F00;
                    n3 = -1513614499;
                    continue block96;
                }
                case -1513614499: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xDAF7 ^ 0xDAF5] = 0x4DAF5 ^ 0xDAF5;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF1BF ^ 0xF080] = 0xE33 ^ 0xF080;
                    n3 = -1783521286;
                    continue block96;
                }
                case -1783521286: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xF624 ^ 0xF60A] = 0xFFFF09F5 ^ 0xF60A;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE8A3 ^ 0xE845] = 0x1775 ^ 0xE845;
                    BufferAbuseMode.O0OoOO0OOOOO[0xBC3A ^ 0xBDBC] = 0xBDA5 ^ 0xBDBC;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1ED2 ^ 0x1FC2] = 0xA8C5 ^ 0x1FC2;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9F30 ^ 0x9E79] = 0xFFFF6333 ^ 0x9E79;
                    BufferAbuseMode.O0OoOO0OOOOO[0x11B8 ^ 0x1166] = 0x5F2A ^ 0x1166;
                    n3 = -994161616;
                    continue block96;
                }
                case -994161616: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x10160 ^ 0x10167] = 0x120B5 ^ 0x10167;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8C7C ^ 0x8DF1] = 0xFFFF720E ^ 0x8DF1;
                    BufferAbuseMode.O0OoOO0OOOOO[0x104B4 ^ 0x105B6] = 0x1E9C8 ^ 0x105B6;
                    BufferAbuseMode.O0OoOO0OOOOO[0x167B ^ 0x1613] = 0xFFFFE552 ^ 0x1613;
                    n3 = 118097371;
                    continue block96;
                }
                case 118097371: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x2066 ^ 0x204F] = 0x29D2 ^ 0x204F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4D9 ^ 0x5C8] = 0xFFFF4D3D ^ 0x5C8;
                    n3 = -944970869;
                    continue block96;
                }
                case -944970869: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xD8AD ^ 0xD875] = 0xB935 ^ 0xD875;
                    n3 = -1950667193;
                    continue block96;
                }
                case -1950667193: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x199C ^ 0x197E] = 0x1BC2 ^ 0x197E;
                    BufferAbuseMode.O0OoOO0OOOOO[0x999C ^ 0x9917] = 0xBF5A185C ^ 0x9917;
                    BufferAbuseMode.O0OoOO0OOOOO[0x67AD ^ 0x6628] = 0xFFFF9984 ^ 0x6628;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2D85 ^ 0x2D73] = 0xCDC3 ^ 0x2D73;
                    n3 = 198636809;
                    continue block96;
                }
                case 198636809: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xFC4C ^ 0xFCA9] = 0xFFFFFC1C ^ 0xFCA9;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3899 ^ 0x39B8] = 0xFFFFC1E1 ^ 0x39B8;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2DC6 ^ 0x2DF9] = 0xFFFFD22E ^ 0x2DF9;
                    n3 = -956953129;
                    continue block96;
                }
                case -956953129: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xD057 ^ 0xD004] = 0xFFFF2FFF ^ 0xD004;
                    n3 = 1427750328;
                    continue block96;
                }
                case 1427750328: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x8B8F ^ 0x8AD0] = 0x8ADD ^ 0x8AD0;
                    n3 = -1550042958;
                    continue block96;
                }
                case -1550042958: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xD48F ^ 0xD428] = 0xD27F ^ 0xD428;
                    n3 = -81652114;
                    continue block96;
                }
                case -81652114: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x7E1 ^ 0x7A5] = 0x7BA ^ 0x7A5;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4499 ^ 0x4438] = 0xE468 ^ 0x4438;
                    BufferAbuseMode.O0OoOO0OOOOO[0x110E ^ 0x11CD] = 0xFEB6 ^ 0x11CD;
                    n3 = -464429005;
                    continue block96;
                }
                case -464429005: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x8A02 ^ 0x8ADD] = 0x8877 ^ 0x8ADD;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC74C ^ 0xC702] = 0x7302 ^ 0xC702;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9194 ^ 0x90E3] = 0x90D6 ^ 0x90E3;
                    BufferAbuseMode.O0OoOO0OOOOO[0x525D ^ 0x52DE] = 0x52D5 ^ 0x52DE;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE2E4 ^ 0xE205] = 0xFFFF1F68 ^ 0xE205;
                    n3 = 774988578;
                    continue block96;
                }
                case 774988578: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x7449 ^ 0x749F] = 0xBB17 ^ 0x749F;
                    n3 = -178706402;
                    continue block96;
                }
                case -178706402: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x99D1 ^ 0x9969] = 0x1056 ^ 0x9969;
                    n3 = -2125341164;
                    continue block96;
                }
                case -2125341164: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x2CFB ^ 0x2DCD] = 0x3EC0 ^ 0x2DCD;
                    n3 = -323741566;
                    continue block96;
                }
                case -323741566: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x4FEC ^ 0x4F7C] = 0x4F7D ^ 0x4F7C;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE769 ^ 0xE76D] = 0xE77C ^ 0xE76D;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD4BD ^ 0xD4CD] = 0xD48C ^ 0xD4CD;
                    n3 = 641549153;
                    continue block96;
                }
                case 641549153: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x4F5B ^ 0x4E60] = 0xE183 ^ 0x4E60;
                    n3 = -2057836738;
                    continue block96;
                }
                case -2057836738: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x45D6 ^ 0x45D3] = 0x45D0 ^ 0x45D3;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3577 ^ 0x353C] = 0x4F72F709 ^ 0x353C;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6169 ^ 0x600D] = 0x600C ^ 0x600D;
                    n3 = -968815641;
                    continue block96;
                }
                case -968815641: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x69B7 ^ 0x69EC] = 0xFFFF9613 ^ 0x69EC;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1BC ^ 0x134] = 0x10D ^ 0x134;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF601 ^ 0xF76A] = 0xF764 ^ 0xF76A;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD2D4 ^ 0xD3B4] = 0xFFFF2C4B ^ 0xD3B4;
                    n3 = 1720079285;
                    continue block96;
                }
                case 1720079285: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xD6E3 ^ 0xD6DF] = 0x1020965E ^ 0xD6DF;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7E8F ^ 0x7EF2] = 0x7EEB ^ 0x7EF2;
                    BufferAbuseMode.O0OoOO0OOOOO[0xBD14 ^ 0xBC15] = 0xFFFFAFAB ^ 0xBC15;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4D29 ^ 0x4C77] = 0x4C74 ^ 0x4C77;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4130 ^ 0x4181] = 0xA97 ^ 0x4181;
                    n3 = -454898201;
                    continue block96;
                }
                case -454898201: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x4364 ^ 0x4254] = 0x6B59 ^ 0x4254;
                    n3 = -77052611;
                    continue block96;
                }
                case -77052611: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x4485 ^ 0x44B6] = 0xFFFFBB69 ^ 0x44B6;
                    BufferAbuseMode.O0OoOO0OOOOO[0x39F2 ^ 0x39AB] = 0xFFFFC64E ^ 0x39AB;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4C07 ^ 0x4CBB] = 0xBC12 ^ 0x4CBB;
                    n3 = -458993780;
                    continue block96;
                }
                case -458993780: {
                    return;
                }
                default: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xED3 ^ 0xF8A] = 0xF8A ^ 0xF8A;
                    BufferAbuseMode.O0OoOO0OOOOO[0x56BC ^ 0x5606] = 0xDF04 ^ 0x5606;
                    n3 = -2049256105;
                    continue block96;
                }
                case -2049256105: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x1A75 ^ 0x1A9F] = 0xC3F7 ^ 0x1A9F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x93E ^ 0x84E] = 0x840 ^ 0x84E;
                    n3 = -1534734113;
                    continue block96;
                }
                case -1534734113: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xD974 ^ 0xD863] = 0x3618 ^ 0xD863;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF0C1 ^ 0xF0D3] = 0xFFFF0F2C ^ 0xF0D3;
                    n3 = 1085701459;
                    continue block96;
                }
                case 1085701459: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xB705 ^ 0xB7AB] = 0x483 ^ 0xB7AB;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF0C5 ^ 0xF02E] = 0x6159 ^ 0xF02E;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5E0F ^ 0x5E05] = 0x5E1C ^ 0x5E05;
                    BufferAbuseMode.O0OoOO0OOOOO[0xEF45 ^ 0xEF70] = 0xFFFF108F ^ 0xEF70;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4F3E ^ 0x4FA0] = 0xFFFFD402 ^ 0x4FA0;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE98B ^ 0xE984] = 0xE983 ^ 0xE984;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4CD5 ^ 0x4C18] = 0x9FB2 ^ 0x4C18;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1016D ^ 0x10108] = 0xFFFEFEFD ^ 0x10108;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5074 ^ 0x50B4] = 0xBFC7 ^ 0x50B4;
                    BufferAbuseMode.O0OoOO0OOOOO[0x837 ^ 0x882] = 0x904 ^ 0x882;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1943 ^ 0x19A0] = 0xE697 ^ 0x19A0;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2B9B ^ 0x2B0E] = 0xDB7F ^ 0x2B0E;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD09C ^ 0xD0A2] = 0xFFFF2F09 ^ 0xD0A2;
                    BufferAbuseMode.O0OoOO0OOOOO[0x85B9 ^ 0x85D3] = 0x2CBC617A ^ 0x85D3;
                    BufferAbuseMode.O0OoOO0OOOOO[0x19C8 ^ 0x193D] = 0xFFFF0610 ^ 0x193D;
                    BufferAbuseMode.O0OoOO0OOOOO[0x133F ^ 0x1367] = 0x133C ^ 0x1367;
                    n3 = -79963208;
                    continue block96;
                }
                case -79963208: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x5E2B ^ 0x5E63] = 0xFFFFA1CE ^ 0x5E63;
                    BufferAbuseMode.O0OoOO0OOOOO[0x79C ^ 0x7DD] = 0x782 ^ 0x7DD;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9F87 ^ 0x9FC1] = 0x9FC6 ^ 0x9FC1;
                    BufferAbuseMode.O0OoOO0OOOOO[0xCA5B ^ 0xCA8F] = 0xCA8F ^ 0xCA8F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x516E ^ 0x5076] = 0xBE17 ^ 0x5076;
                    n3 = -1416791145;
                    continue block96;
                }
                case -1416791145: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x93A0 ^ 0x9354] = 0x73E4 ^ 0x9354;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1019D ^ 0x10013] = 0xFFFEFFEC ^ 0x10013;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5A91 ^ 0x5BFF] = 0x5BF4 ^ 0x5BFF;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAB5A ^ 0xABC0] = 0xFFFE584C ^ 0xABC0;
                    BufferAbuseMode.O0OoOO0OOOOO[0xBE71 ^ 0xBEB9] = 0xCB14 ^ 0xBEB9;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5EED ^ 0x5EC8] = 0x5EC8 ^ 0x5EC8;
                    BufferAbuseMode.O0OoOO0OOOOO[0xEC2 ^ 0xF9E] = 0xFFFFF061 ^ 0xF9E;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC752 ^ 0xC63A] = 0xC639 ^ 0xC63A;
                    BufferAbuseMode.O0OoOO0OOOOO[0x18C ^ 0x1BB] = 0x1F47DDA9 ^ 0x1BB;
                    BufferAbuseMode.O0OoOO0OOOOO[0x43E ^ 0x498] = 0x2FF ^ 0x498;
                    n3 = -150499838;
                    continue block96;
                }
                case -150499838: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x2871 ^ 0x281A] = 0xFFFFD7F0 ^ 0x281A;
                    n3 = -1524492133;
                    continue block96;
                }
                case -1524492133: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xF2D7 ^ 0xF2F1] = 0xF2F1 ^ 0xF2F1;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8BD4 ^ 0x8AC6] = 0x3DC1 ^ 0x8AC6;
                    BufferAbuseMode.O0OoOO0OOOOO[0x880C ^ 0x8813] = 0x8824 ^ 0x8813;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB6E6 ^ 0xB68F] = 0xFFFF4950 ^ 0xB68F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5BCC ^ 0x5BEC] = 0xFFFFA833 ^ 0x5BEC;
                    n3 = -1879072775;
                    continue block96;
                }
                case -1879072775: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x1FBD ^ 0x1E96] = 0x7852 ^ 0x1E96;
                    BufferAbuseMode.O0OoOO0OOOOO[0xDC0 ^ 0xD42] = 0xD57 ^ 0xD42;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8945 ^ 0x8866] = 0x473F ^ 0x8866;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8D71 ^ 0x8DC1] = 0xC6D4 ^ 0x8DC1;
                    BufferAbuseMode.O0OoOO0OOOOO[0xCF2D ^ 0xCFE8] = 0xB320 ^ 0xCFE8;
                    BufferAbuseMode.O0OoOO0OOOOO[0xEBF3 ^ 0xEBC1] = 0xEBF6 ^ 0xEBC1;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8D94 ^ 0x8D7B] = 0x29AF ^ 0x8D7B;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE8D5 ^ 0xE899] = 0xE88C ^ 0xE899;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2787 ^ 0x26C0] = 0x247A ^ 0x26C0;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC42B ^ 0xC436] = 0xC472 ^ 0xC436;
                    BufferAbuseMode.O0OoOO0OOOOO[0x95AA ^ 0x95FA] = 0x95F3 ^ 0x95FA;
                    BufferAbuseMode.O0OoOO0OOOOO[0xA74B ^ 0xA62E] = 0xA63E ^ 0xA62E;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7D05 ^ 0x7D3F] = 0x7D34 ^ 0x7D3F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x492D ^ 0x49B1] = 0x2D83 ^ 0x49B1;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3A82 ^ 0x3A13] = 0x3A13 ^ 0x3A13;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4BDB ^ 0x4B56] = 0x2192A993 ^ 0x4B56;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD98D ^ 0xD892] = 0xDF42 ^ 0xD892;
                    n3 = 1091594316;
                    continue block96;
                }
                case 1091594316: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x6AE6 ^ 0x6A42] = 0x6C11 ^ 0x6A42;
                    n3 = -1929640738;
                    continue block96;
                }
                case -1929640738: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xAECA ^ 0xAEB6] = 0xAEB1 ^ 0xAEB6;
                    n3 = -1821446692;
                    continue block96;
                }
                case -1821446692: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xA421 ^ 0xA427] = 0xA43A ^ 0xA427;
                    BufferAbuseMode.O0OoOO0OOOOO[0xDB27 ^ 0xDB76] = 0xDB61 ^ 0xDB76;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF998 ^ 0xF9FA] = 0xF9FF ^ 0xF9FA;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7288 ^ 0x720D] = 0xC00720D ^ 0x720D;
                    n3 = 422262507;
                    continue block96;
                }
                case 422262507: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xBEF4 ^ 0xBF8C] = 0xBF83 ^ 0xBF8C;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5627 ^ 0x5659] = 0xFFFFA9A6 ^ 0x5659;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC168 ^ 0xC196] = 0xC4E4 ^ 0xC196;
                    BufferAbuseMode.O0OoOO0OOOOO[0x683B ^ 0x683B] = 0xFFFF979A ^ 0x683B;
                    BufferAbuseMode.O0OoOO0OOOOO[0xCA82 ^ 0xCA8B] = 0xCA8C ^ 0xCA8B;
                    BufferAbuseMode.O0OoOO0OOOOO[0xACF1 ^ 0xAD83] = 0xAD8A ^ 0xAD83;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7ED9 ^ 0x7FFE] = 0x21F1 ^ 0x7FFE;
                    BufferAbuseMode.O0OoOO0OOOOO[0x66AE ^ 0x6603] = 0xD53B ^ 0x6603;
                    BufferAbuseMode.O0OoOO0OOOOO[0xA999 ^ 0xA9BE] = 0xFFFF5641 ^ 0xA9BE;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1F94 ^ 0x1EB6] = 0x1965 ^ 0x1EB6;
                    BufferAbuseMode.O0OoOO0OOOOO[0x10487 ^ 0x104F1] = 0x4FCC1F32 ^ 0x104F1;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE6D3 ^ 0xE652] = 0xE661 ^ 0xE652;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD726 ^ 0xD7A6] = 0x1EF95 ^ 0xD7A6;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4EF ^ 0x5FB] = 0x5CA2 ^ 0x5FB;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9980 ^ 0x9802] = 0x980E ^ 0x9802;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF60F ^ 0xF6E1] = 0x6796 ^ 0xF6E1;
                    BufferAbuseMode.O0OoOO0OOOOO[0x25F4 ^ 0x24C8] = 0x8B22 ^ 0x24C8;
                    n3 = -575821518;
                    continue block96;
                }
                case -575821518: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x4D3B ^ 0x4C52] = 0xFFFFB392 ^ 0x4C52;
                    BufferAbuseMode.O0OoOO0OOOOO[0xBCCC ^ 0xBD47] = 0xDF2 ^ 0xBD47;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB323 ^ 0xB3B1] = 0x1C62 ^ 0xB3B1;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB471 ^ 0xB53D] = 0x1BCCF ^ 0xB53D;
                    n3 = 404200053;
                    continue block96;
                }
                case 404200053: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x3DA ^ 0x376] = 0xB049 ^ 0x376;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5239 ^ 0x52B6] = 0xFFFFAD75 ^ 0x52B6;
                    BufferAbuseMode.O0OoOO0OOOOO[0x109B8 ^ 0x10830] = 0x10832 ^ 0x10830;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9935 ^ 0x983F] = 0x98E2 ^ 0x983F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4013 ^ 0x410E] = 0xFFFF8C4F ^ 0x410E;
                    BufferAbuseMode.O0OoOO0OOOOO[0xA5AE ^ 0xA553] = 0xFFFF5FEF ^ 0xA553;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB1B6 ^ 0xB17C] = 0xFFFF3B30 ^ 0xB17C;
                    BufferAbuseMode.O0OoOO0OOOOO[0x901E ^ 0x907F] = 0x9064 ^ 0x907F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x710 ^ 0x701] = 0x700 ^ 0x701;
                    BufferAbuseMode.O0OoOO0OOOOO[0x95D3 ^ 0x94A2] = 0x94BD ^ 0x94A2;
                    n3 = 1311015642;
                    continue block96;
                }
                case 1311015642: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xA688 ^ 0xA691] = 0xA691 ^ 0xA691;
                    BufferAbuseMode.O0OoOO0OOOOO[0x53D4 ^ 0x5316] = 0xFFFF43C0 ^ 0x5316;
                    BufferAbuseMode.O0OoOO0OOOOO[0x10009 ^ 0x1011F] = 0x15846 ^ 0x1011F;
                    n3 = 2018493599;
                    continue block96;
                }
                case 2018493599: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xFDF9 ^ 0xFD82] = 0xFFFF0227 ^ 0xFD82;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB758 ^ 0xB7B5] = 0x26AB ^ 0xB7B5;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD62C ^ 0xD77B] = 0xD77B ^ 0xD77B;
                    BufferAbuseMode.O0OoOO0OOOOO[0xDDAE ^ 0xDC94] = 0x61B ^ 0xDC94;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4E69 ^ 0x4E91] = 0xDE39 ^ 0x4E91;
                    n3 = -1233967423;
                    continue block96;
                }
                case -1233967423: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xB2D6 ^ 0xB38E] = 0xB38E ^ 0xB38E;
                    n3 = 311402212;
                    continue block96;
                }
                case 311402212: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x1045C ^ 0x10540] = 0x137C9 ^ 0x10540;
                    n3 = 637995438;
                    continue block96;
                }
                case 637995438: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xBA ^ 0x195] = 0x2893 ^ 0x195;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAC66 ^ 0xACD2] = 0xAD52 ^ 0xACD2;
                    BufferAbuseMode.O0OoOO0OOOOO[0x7438 ^ 0x750F] = 0xAF90 ^ 0x750F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x976C ^ 0x9621] = 0x19F85 ^ 0x9621;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF3D9 ^ 0xF2D5] = 0xF93 ^ 0xF2D5;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAB9F ^ 0xAAB7] = 0xF4A0 ^ 0xAAB7;
                    BufferAbuseMode.O0OoOO0OOOOO[0x52B2 ^ 0x528B] = 0x529E ^ 0x528B;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1A9D ^ 0x1A6A] = 0x8ACE ^ 0x1A6A;
                    n3 = 2123491214;
                    continue block96;
                }
                case 2123491214: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x1052F ^ 0x10403] = 0x162DB ^ 0x10403;
                    BufferAbuseMode.O0OoOO0OOOOO[0x40A ^ 0x41E] = 0x41F ^ 0x41E;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF5B7 ^ 0xF5C6] = 0xFFFF00A3 ^ 0xF5C6;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAB26 ^ 0xAA22] = 0x2670 ^ 0xAA22;
                    BufferAbuseMode.O0OoOO0OOOOO[0xA051 ^ 0xA154] = 0xFFFFD29D ^ 0xA154;
                    BufferAbuseMode.O0OoOO0OOOOO[0xDEF5 ^ 0xDFC0] = 0xCCF0 ^ 0xDFC0;
                    n3 = 1800440009;
                    continue block96;
                }
                case 1800440009: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xFA9F ^ 0xFAEC] = 0xFAE9 ^ 0xFAEC;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD482 ^ 0xD444] = 0xA8D2 ^ 0xD444;
                    n3 = 620330600;
                    continue block96;
                }
                case 620330600: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xCF0E ^ 0xCF44] = 0xCF53 ^ 0xCF44;
                    n3 = -586040968;
                    continue block96;
                }
                case -586040968: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x8F52 ^ 0x8F4C] = 0x8F1F ^ 0x8F4C;
                    n3 = 345348730;
                    continue block96;
                }
                case 345348730: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x2858 ^ 0x2822] = 0x3079 ^ 0x2822;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6619 ^ 0x6714] = 0xFFFF65C9 ^ 0x6714;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3E92 ^ 0x3E4F] = 0x7001 ^ 0x3E4F;
                    n3 = 1063087255;
                    continue block96;
                }
                case 1063087255: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xD3CF ^ 0xD3EB] = 0xD3EB ^ 0xD3EB;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2BCE ^ 0x2B47] = 0xFFFFD4B8 ^ 0x2B47;
                    n3 = 387010078;
                    continue block96;
                }
                case 387010078: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x7BC4 ^ 0x7AA8] = 0x7AAD ^ 0x7AA8;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9DB1 ^ 0x9DEE] = 0x9DBD ^ 0x9DEE;
                    BufferAbuseMode.O0OoOO0OOOOO[0x649F ^ 0x6485] = 0x6494 ^ 0x6485;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD35B ^ 0xD20F] = 0xA1C ^ 0xD20F;
                    n3 = 198642179;
                    continue block96;
                }
                case 198642179: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x65B8 ^ 0x653E] = 0x6537 ^ 0x653E;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAA6D ^ 0xABEE] = 0xFFFF5462 ^ 0xABEE;
                    BufferAbuseMode.O0OoOO0OOOOO[0xCC11 ^ 0xCCF5] = 0x33C5 ^ 0xCCF5;
                    n3 = 1223202875;
                    continue block96;
                }
                case 1223202875: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xD567 ^ 0xD530] = 0xD5A6 ^ 0xD530;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6BEB ^ 0x6B8B] = 0x20006B88 ^ 0x6B8B;
                    BufferAbuseMode.O0OoOO0OOOOO[0x44F8 ^ 0x4577] = 0x4575 ^ 0x4577;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8D41 ^ 0x8C7F] = 0x2395 ^ 0x8C7F;
                    BufferAbuseMode.O0OoOO0OOOOO[0x42E1 ^ 0x43A0] = 0xFFFF42FF ^ 0x43A0;
                    BufferAbuseMode.O0OoOO0OOOOO[0x10709 ^ 0x107F9] = 0x1A333 ^ 0x107F9;
                    n3 = 1713696961;
                    continue block96;
                }
                case 1713696961: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x524E ^ 0x530B] = 0xFFFF7DEA ^ 0x530B;
                    BufferAbuseMode.O0OoOO0OOOOO[0x4690 ^ 0x466F] = 0xAA0C ^ 0x466F;
                    BufferAbuseMode.O0OoOO0OOOOO[0xDC7C ^ 0xDD3A] = 0xC2A ^ 0xDD3A;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3EAF ^ 0x3FDB] = 0x3FD9 ^ 0x3FDB;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF014 ^ 0xF0DD] = 0x8572 ^ 0xF0DD;
                    BufferAbuseMode.O0OoOO0OOOOO[0x39E7 ^ 0x395C] = 0xB06E ^ 0x395C;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1499 ^ 0x158C] = 0x4CE5 ^ 0x158C;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE3E ^ 0xF13] = 0xFFFF9678 ^ 0xF13;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD357 ^ 0xD361] = 0xFFFF2C9E ^ 0xD361;
                    n3 = -675974709;
                    continue block96;
                }
                case -675974709: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xCF32 ^ 0xCFBE] = 0xFFFF3041 ^ 0xCFBE;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6D5C ^ 0x6C2F] = 0x6C27 ^ 0x6C2F;
                    n3 = -199716193;
                    continue block96;
                }
                case -199716193: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x8D00 ^ 0x8C1A] = 0x627B ^ 0x8C1A;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAD3A ^ 0xAC40] = 0xAC46 ^ 0xAC40;
                    BufferAbuseMode.O0OoOO0OOOOO[0xA9A6 ^ 0xA8E6] = 0x5641 ^ 0xA8E6;
                    BufferAbuseMode.O0OoOO0OOOOO[0x93A ^ 0x8BE] = 0x8B3 ^ 0x8BE;
                    BufferAbuseMode.O0OoOO0OOOOO[0xA9E6 ^ 0xA86A] = 0x5781 ^ 0xA86A;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB6B5 ^ 0xB7E7] = 0x22AE ^ 0xB7E7;
                    BufferAbuseMode.O0OoOO0OOOOO[0x34DF ^ 0x34F0] = 0x3485 ^ 0x34F0;
                    BufferAbuseMode.O0OoOO0OOOOO[0x6004 ^ 0x60AD] = 0x9C85 ^ 0x60AD;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2B50 ^ 0x2A31] = 0x998B ^ 0x2A31;
                    n3 = -1606454790;
                    continue block96;
                }
                case -1606454790: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x95F2 ^ 0x959D] = 0xFFFF6A08 ^ 0x959D;
                    n3 = 1630215815;
                    continue block96;
                }
                case 1630215815: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x61B6 ^ 0x611C] = 0xFFFF62BA ^ 0x611C;
                    BufferAbuseMode.O0OoOO0OOOOO[0xD462 ^ 0xD477] = 0xFFFF2B36 ^ 0xD477;
                    n3 = -1224992616;
                    continue block96;
                }
                case -1224992616: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x5C38 ^ 0x5D62] = 0x5D63 ^ 0x5D62;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF7B ^ 0xE2B] = 0x9B62 ^ 0xE2B;
                    n3 = -1758759297;
                    continue block96;
                }
                case -1758759297: {
                    BufferAbuseMode.O0OoOO0OOOOO[0xAE86 ^ 0xAE47] = 0x413C ^ 0xAE47;
                    BufferAbuseMode.O0OoOO0OOOOO[0xAE34 ^ 0xAF27] = 0xF67B ^ 0xAF27;
                    BufferAbuseMode.O0OoOO0OOOOO[0xFAA4 ^ 0xFBD2] = 0xFBD8 ^ 0xFBD2;
                    n3 = 1075568164;
                    continue block96;
                }
                case 1075568164: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x1065 ^ 0x1094] = 0xFFFF4BA9 ^ 0x1094;
                    BufferAbuseMode.O0OoOO0OOOOO[0xEAEE ^ 0xEAAE] = 0xE0F8D4E1 ^ 0xEAAE;
                    BufferAbuseMode.O0OoOO0OOOOO[0x2362 ^ 0x23B5] = 0x42EC ^ 0x23B5;
                    n3 = 951268506;
                    continue block96;
                }
                case 951268506: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x10C ^ 0x17] = 0x328D ^ 0x17;
                    BufferAbuseMode.O0OoOO0OOOOO[0x8B91 ^ 0x8B42] = 0x72BC ^ 0x8B42;
                    BufferAbuseMode.O0OoOO0OOOOO[0xDE33 ^ 0xDEA5] = 0x2E9D ^ 0xDEA5;
                    BufferAbuseMode.O0OoOO0OOOOO[0xA61E ^ 0xA734] = 0xF923 ^ 0xA734;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5D0C ^ 0x5DF6] = 0xCD5E ^ 0x5DF6;
                    BufferAbuseMode.O0OoOO0OOOOO[0xE0E2 ^ 0xE03B] = 0x8168 ^ 0xE03B;
                    BufferAbuseMode.O0OoOO0OOOOO[0x3F59 ^ 0x3F04] = 0x3F55 ^ 0x3F04;
                    BufferAbuseMode.O0OoOO0OOOOO[0xC59B ^ 0xC4E6] = 0xC4E3 ^ 0xC4E6;
                    BufferAbuseMode.O0OoOO0OOOOO[0xA5CC ^ 0xA516] = 0xC456 ^ 0xA516;
                    BufferAbuseMode.O0OoOO0OOOOO[0x5949 ^ 0x5841] = 0x589C ^ 0x5841;
                    BufferAbuseMode.O0OoOO0OOOOO[0xF452 ^ 0xF554] = 0x7906 ^ 0xF554;
                    BufferAbuseMode.O0OoOO0OOOOO[0x1FBE ^ 0x1F2A] = 0xEF57 ^ 0x1F2A;
                    n3 = 516049562;
                    continue block96;
                }
                case 516049562: {
                    BufferAbuseMode.O0OoOO0OOOOO[0x3F94 ^ 0x3F53] = 0x439B ^ 0x3F53;
                    BufferAbuseMode.O0OoOO0OOOOO[0xB4A9 ^ 0xB475] = 0xFA39 ^ 0xB475;
                    BufferAbuseMode.O0OoOO0OOOOO[0x9268 ^ 0x9302] = 0x9306 ^ 0x9302;
                    BufferAbuseMode.O0OoOO0OOOOO[0xEFA8 ^ 0xEF9C] = 0xFFFF1023 ^ 0xEF9C;
                    n3 = -1163656235;
                    continue block96;
                }
                case -1163656235: 
            }
            BufferAbuseMode.O0OoOO0OOOOO[0xC370 ^ 0xC32C] = 0xFFFF3CD3 ^ 0xC32C;
            BufferAbuseMode.O0OoOO0OOOOO[0x10828 ^ 0x10896] = 0xFFFE07FA ^ 0x10896;
            BufferAbuseMode.O0OoOO0OOOOO[0xE43F ^ 0xE49C] = 0x44CC ^ 0xE49C;
            BufferAbuseMode.O0OoOO0OOOOO[0x1C53 ^ 0x1C0D] = 0xFFFFE3AE ^ 0x1C0D;
            BufferAbuseMode.O0OoOO0OOOOO[0x339A ^ 0x32D9] = 0xE3CF ^ 0x32D9;
            BufferAbuseMode.O0OoOO0OOOOO[0x6C42 ^ 0x6C10] = 0xD2FD43C3 ^ 0x6C10;
            BufferAbuseMode.O0OoOO0OOOOO[0x99F2 ^ 0x9895] = 0x989A ^ 0x9895;
            BufferAbuseMode.O0OoOO0OOOOO[0xE22D ^ 0xE216] = 0xE271 ^ 0xE216;
            BufferAbuseMode.O0OoOO0OOOOO[0x430D ^ 0x43A5] = 0xBF82 ^ 0x43A5;
            BufferAbuseMode.O0OoOO0OOOOO[0xF78F ^ 0xF77D] = 0x53B7 ^ 0xF77D;
            BufferAbuseMode.O0OoOO0OOOOO[0x2C36 ^ 0x2C93] = 0x2AC4 ^ 0x2C93;
            BufferAbuseMode.O0OoOO0OOOOO[0xAE68 ^ 0xAE17] = 0xAE46 ^ 0xAE17;
            BufferAbuseMode.O0OoOO0OOOOO[0x3B81 ^ 0x3B32] = 0x7024 ^ 0x3B32;
            n3 = 1641180046;
        }
    }
}

