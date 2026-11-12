/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalEventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.AttributeKey
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package net.minecraft.network;

import com.google.common.collect.Queues;
import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.AttributeKey;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.network.a;
import net.minecraft.network.aa;
import net.minecraft.network.aj;
import net.minecraft.network.f;
import net.minecraft.network.g;
import net.minecraft.network.s;
import net.minecraft.network.t;
import net.minecraft.network.u;
import net.minecraft.network.x;
import net.minecraft.network.y;
import net.minecraft.network.z;
import net.minecraft.util.ba;
import net.minecraft.util.bo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class r
extends SimpleChannelInboundHandler<aj> {
    public /* synthetic */ ReentrantReadWriteLock cZI;
    private static /* synthetic */ int[] o0O000O0O0O0;
    public static /* synthetic */ Object[] oo000o00Oo00;
    public static /* synthetic */ AttributeKey<a> cZC;
    public static /* synthetic */ Marker cZA;
    public static /* synthetic */ String[] oO000O00OO00;
    public static /* synthetic */ bo<LocalEventLoopGroup> cZF;
    public static /* synthetic */ String q0OOOoo00o0;
    public static /* synthetic */ bo<NioEventLoopGroup> cZD;
    public static /* synthetic */ String oO00O0OO0ooO;
    public static /* synthetic */ String[] ooO00oO0OoO0;
    public static /* synthetic */ String q0oOOoOo0O00O;
    public /* synthetic */ boolean cZN;
    public static /* synthetic */ bo<EpollEventLoopGroup> cZE;
    public /* synthetic */ boolean cZO;
    public static /* synthetic */ String ooo00oo0Ooo0;
    public /* synthetic */ SocketAddress cZK;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ UserConnection user;
    public /* synthetic */ boolean crS;
    public static /* synthetic */ Logger cZz;
    public static /* synthetic */ String O0OoOO0OOOOO;
    public /* synthetic */ Queue<aa> cZH;
    public /* synthetic */ ba cZM;
    public /* synthetic */ f cZG;
    public static /* synthetic */ String Oo0o00000O00;
    public static /* synthetic */ String o0o000o0O0o0;
    public /* synthetic */ Channel cZJ;
    public static /* synthetic */ Object o0000000O000;
    public static /* synthetic */ Object[] oOo00Oo0OOo0;
    public /* synthetic */ g cZL;
    public static /* synthetic */ Marker cZB;
    private static /* synthetic */ int oOO00OO0OOO0;
    private static /* synthetic */ boolean oooO0ooOOooO;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = -1090964230;
        if (n2 != n2) {
            oOO00OO0OOO0 = n2 = 1181831951;
        }
        o0O000O0O0O0 = new int[0xEB22 ^ 0xEAB2];
        r.o0O000O0O0O0[0xE5FF ^ 0xE5BF] = 0xE592 ^ 0xE5BF;
        r.o0O000O0O0O0[0x5C38 ^ 0x5D69] = 0x5D64 ^ 0x5D69;
        r.o0O000O0O0O0[0x3AA6 ^ 0x3A56] = 0x3A75 ^ 0x3A56;
        r.o0O000O0O0O0[0x1073D ^ 0x1065A] = 0x10655 ^ 0x1065A;
        int n3 = -1315150286;
        block86: while (true) {
            switch (n3) {
                case 924678480: {
                    r.o0O000O0O0O0[0x2DEA ^ 0x2D6B] = 0xFFFFD2E8 ^ 0x2D6B;
                    n3 = -217711618;
                    continue block86;
                }
                case -217711618: {
                    r.o0O000O0O0O0[0xFA14 ^ 0xFB47] = 0xFB58 ^ 0xFB47;
                    r.o0O000O0O0O0[0xE874 ^ 0xE8D9] = 0xE8D2 ^ 0xE8D9;
                    n3 = 1465820476;
                    continue block86;
                }
                case 1465820476: {
                    r.o0O000O0O0O0[0xC2FF ^ 0xC3D7] = 0xC3DA ^ 0xC3D7;
                    n3 = -364948990;
                    continue block86;
                }
                case -364948990: {
                    r.o0O000O0O0O0[0x3D20 ^ 0x3D0B] = 0x3D04 ^ 0x3D0B;
                    r.o0O000O0O0O0[0x228 ^ 0x23E] = 0x8DFBB0CD ^ 0x23E;
                    r.o0O000O0O0O0[0xEAB5 ^ 0xEA30] = 0xDB19B4BF ^ 0xEA30;
                    r.o0O000O0O0O0[0x9B30 ^ 0x9A0B] = 0x9A08 ^ 0x9A0B;
                    n3 = 2142812892;
                    continue block86;
                }
                case 2142812892: {
                    r.o0O000O0O0O0[0xF3F ^ 0xFCE] = 0xFA4 ^ 0xFCE;
                    r.o0O000O0O0O0[0xCE6D ^ 0xCEE9] = 0xFFFF3116 ^ 0xCEE9;
                    r.o0O000O0O0O0[0x8646 ^ 0x8694] = 0xFFFE7544 ^ 0x8694;
                    r.o0O000O0O0O0[0x812C ^ 0x8160] = 0x8165 ^ 0x8160;
                    n3 = -1558182065;
                    continue block86;
                }
                case -1558182065: {
                    r.o0O000O0O0O0[0xB63E ^ 0xB752] = 0x888F ^ 0xB752;
                    r.o0O000O0O0O0[0x579D ^ 0x56A4] = 0xFFFFA94B ^ 0x56A4;
                    n3 = -1852352121;
                    continue block86;
                }
                case -1852352121: {
                    r.o0O000O0O0O0[0x8D89 ^ 0x8C94] = 0x8CC2 ^ 0x8C94;
                    r.o0O000O0O0O0[0xA070 ^ 0xA049] = 0xA04E ^ 0xA049;
                    r.o0O000O0O0O0[0x32A6 ^ 0x3203] = 0x321A ^ 0x3203;
                    r.o0O000O0O0O0[0xDFBB ^ 0xDFF2] = 0xDF9F ^ 0xDFF2;
                    n3 = 403118795;
                    continue block86;
                }
                case 403118795: {
                    r.o0O000O0O0O0[0xBE21 ^ 0xBED3] = 0xBEB8 ^ 0xBED3;
                    r.o0O000O0O0O0[0x9692 ^ 0x9651] = 0xFFFF69C8 ^ 0x9651;
                    r.o0O000O0O0O0[0xEF9D ^ 0xEFFC] = 0xEFF5 ^ 0xEFFC;
                    r.o0O000O0O0O0[0xC2EB ^ 0xC2CD] = 0xC2BB ^ 0xC2CD;
                    r.o0O000O0O0O0[0xAFD7 ^ 0xAEE0] = 0x33339DD3 ^ 0xAEE0;
                    r.o0O000O0O0O0[0x61BB ^ 0x6154] = 0x6127 ^ 0x6154;
                    r.o0O000O0O0O0[0xB56E ^ 0xB5B8] = 0x3333868B ^ 0xB5B8;
                    n3 = 1830447459;
                    continue block86;
                }
                case 1830447459: {
                    r.o0O000O0O0O0[0x9C22 ^ 0x9C71] = 0xFFFF63E4 ^ 0x9C71;
                    r.o0O000O0O0O0[0x14C8 ^ 0x1406] = 0x1439 ^ 0x1406;
                    n3 = -1205048171;
                    continue block86;
                }
                case -1205048171: {
                    r.o0O000O0O0O0[0x21AC ^ 0x20DF] = 0xFFFFDF20 ^ 0x20DF;
                    n3 = 1051696495;
                    continue block86;
                }
                case 1051696495: {
                    r.o0O000O0O0O0[0x1068D ^ 0x10702] = 0x10703 ^ 0x10702;
                    r.o0O000O0O0O0[0xB9EA ^ 0xB921] = 0xB922 ^ 0xB921;
                    r.o0O000O0O0O0[0x7DFC ^ 0x7D86] = 0x7D99 ^ 0x7D86;
                    r.o0O000O0O0O0[0x10F6 ^ 0x1029] = 0x11110138 ^ 0x1029;
                    r.o0O000O0O0O0[0xC317 ^ 0xC3D6] = 0xC3FB ^ 0xC3D6;
                    r.o0O000O0O0O0[0xE863 ^ 0xE956] = 0xE95D ^ 0xE956;
                    r.o0O000O0O0O0[0xFB1 ^ 0xF4A] = 0xF3F ^ 0xF4A;
                    n3 = 406856430;
                    continue block86;
                }
                case 406856430: {
                    r.o0O000O0O0O0[0x7E2E ^ 0x7EFF] = 0xFFFF8100 ^ 0x7EFF;
                    r.o0O000O0O0O0[0x3D3D ^ 0x3DCA] = 0x3DCE ^ 0x3DCA;
                    r.o0O000O0O0O0[0xDE0E ^ 0xDF4A] = 0xDF35 ^ 0xDF4A;
                    n3 = 617675283;
                    continue block86;
                }
                case 617675283: {
                    r.o0O000O0O0O0[0x1318 ^ 0x1293] = 0x32C6F2E1 ^ 0x1293;
                    r.o0O000O0O0O0[0x2A64 ^ 0x2ACD] = 0x2ADC ^ 0x2ACD;
                    n3 = -867274135;
                    continue block86;
                }
                case -867274135: {
                    r.o0O000O0O0O0[0x87C3 ^ 0x8755] = 0xFFFF78AA ^ 0x8755;
                    r.o0O000O0O0O0[0x5C1B ^ 0x5C39] = 0x5C34 ^ 0x5C39;
                    n3 = -557813802;
                    continue block86;
                }
                case -557813802: {
                    r.o0O000O0O0O0[0x20D0 ^ 0x219C] = 0xFFFFDE1F ^ 0x219C;
                    r.o0O000O0O0O0[0xEDE2 ^ 0xEDFB] = 0xEDFB ^ 0xEDFB;
                    r.o0O000O0O0O0[0x34A0 ^ 0x34AE] = 0x1C71F3B3 ^ 0x34AE;
                    r.o0O000O0O0O0[0xDFE1 ^ 0xDFE5] = 0x1925E5 ^ 0xDFE5;
                    r.o0O000O0O0O0[0x2122 ^ 0x21EA] = 0x21E5 ^ 0x21EA;
                    r.o0O000O0O0O0[0x28AA ^ 0x28C1] = 0xFFFFD73E ^ 0x28C1;
                    r.o0O000O0O0O0[0xB713 ^ 0xB608] = 0xB61D ^ 0xB608;
                    r.o0O000O0O0O0[0x18C3 ^ 0x19DD] = 0xFFFFE650 ^ 0x19DD;
                    r.o0O000O0O0O0[0xC751 ^ 0xC6DB] = 0xFFFF3924 ^ 0xC6DB;
                    r.o0O000O0O0O0[0xC321 ^ 0xC33E] = 0xFFFF3CBD ^ 0xC33E;
                    r.o0O000O0O0O0[0xF7EB ^ 0xF6FA] = 0x4615 ^ 0xF6FA;
                    r.o0O000O0O0O0[0x8552 ^ 0x85B5] = 0x85BE ^ 0x85B5;
                    r.o0O000O0O0O0[0x5060 ^ 0x512F] = 0x76273268 ^ 0x512F;
                    r.o0O000O0O0O0[0x9F70 ^ 0x9FD3] = 0x9FDE ^ 0x9FD3;
                    r.o0O000O0O0O0[0xFAE5 ^ 0xFAD6] = 0xFAE7 ^ 0xFAD6;
                    n3 = 301415520;
                    continue block86;
                }
                case 301415520: {
                    r.o0O000O0O0O0[0xCF1A ^ 0xCFE5] = 0xFFFF3068 ^ 0xCFE5;
                    r.o0O000O0O0O0[0x4BE4 ^ 0x4BF0] = 0x6FD0A097 ^ 0x4BF0;
                    r.o0O000O0O0O0[0x83F6 ^ 0x834F] = 0xFFFF7CD6 ^ 0x834F;
                    r.o0O000O0O0O0[0xB27B ^ 0xB36C] = 0xB36C ^ 0xB36C;
                    n3 = 1669238636;
                    continue block86;
                }
                case 1669238636: {
                    r.o0O000O0O0O0[0x56BA ^ 0x578B] = 0xC7A5C94 ^ 0x578B;
                    r.o0O000O0O0O0[0x4D00 ^ 0x4C50] = 0xFFFFB399 ^ 0x4C50;
                    r.o0O000O0O0O0[0x6A59 ^ 0x6AB2] = 0x6ABF ^ 0x6AB2;
                    r.o0O000O0O0O0[0xFE00 ^ 0xFF21] = 0xFFFF00B0 ^ 0xFF21;
                    r.o0O000O0O0O0[0x42DD ^ 0x4200] = 0x425B ^ 0x4200;
                    r.o0O000O0O0O0[0xEFEB ^ 0xEF26] = 0xFFFF10ED ^ 0xEF26;
                    r.o0O000O0O0O0[0x1067A ^ 0x10696] = 0x106CB ^ 0x10696;
                    r.o0O000O0O0O0[0xB97B ^ 0xB9B4] = 0xFFFF464B ^ 0xB9B4;
                    r.o0O000O0O0O0[0x1D0B ^ 0x1D52] = 0xFFFFE2AD ^ 0x1D52;
                    n3 = 1916168632;
                    continue block86;
                }
                case 1916168632: {
                    r.o0O000O0O0O0[0xA66F ^ 0xA7E6] = 0x7507F793 ^ 0xA7E6;
                    r.o0O000O0O0O0[0xFB49 ^ 0xFBB3] = 0xFFFF041A ^ 0xFBB3;
                    r.o0O000O0O0O0[0x85CB ^ 0x8556] = 0x8551 ^ 0x8556;
                    n3 = 1713694854;
                    continue block86;
                }
                case 1713694854: {
                    r.o0O000O0O0O0[0x5A58 ^ 0x5A81] = 0xFFFFA57E ^ 0x5A81;
                    n3 = -293052379;
                    continue block86;
                }
                case -293052379: {
                    r.o0O000O0O0O0[0xD6D5 ^ 0xD671] = 0x259320EA ^ 0xD671;
                    r.o0O000O0O0O0[0xAEEB ^ 0xAECB] = 0xF0FA1C4 ^ 0xAECB;
                    r.o0O000O0O0O0[0xEA83 ^ 0xEA66] = 0xEA7F ^ 0xEA66;
                    r.o0O000O0O0O0[0xDFEA ^ 0xDFF4] = 0xDFE1 ^ 0xDFF4;
                    r.o0O000O0O0O0[0xA044 ^ 0xA132] = 0xA12D ^ 0xA132;
                    r.o0O000O0O0O0[0xA6CD ^ 0xA7DD] = 0xA7D9 ^ 0xA7DD;
                    return;
                }
                default: {
                    r.o0O000O0O0O0[0x20A ^ 0x203] = 0xFFFFFDEE ^ 0x203;
                    r.o0O000O0O0O0[0x538 ^ 0x58A] = 0x5F3 ^ 0x58A;
                    r.o0O000O0O0O0[0x99AE ^ 0x99A8] = 0x99A1 ^ 0x99A8;
                    r.o0O000O0O0O0[0xDAEF ^ 0xDA4D] = 0x89D84684 ^ 0xDA4D;
                    r.o0O000O0O0O0[0x76B7 ^ 0x76C0] = 0x87E6C18F ^ 0x76C0;
                    r.o0O000O0O0O0[0x5FCE ^ 0x5F56] = 0x5F5D ^ 0x5F56;
                    n3 = -528787883;
                    continue block86;
                }
                case -528787883: {
                    r.o0O000O0O0O0[0x1164 ^ 0x1153] = 0x113A ^ 0x1153;
                    r.o0O000O0O0O0[0x2A39 ^ 0x2BBB] = 0x2B94 ^ 0x2BBB;
                    r.o0O000O0O0O0[0xBD5E ^ 0xBC03] = 0xBC10 ^ 0xBC03;
                    r.o0O000O0O0O0[0xF5E6 ^ 0xF5FB] = 0x9E791259 ^ 0xF5FB;
                    r.o0O000O0O0O0[0x6C21 ^ 0x6C49] = 0xFFFF93B6 ^ 0x6C49;
                    r.o0O000O0O0O0[0x50A4 ^ 0x5023] = 0x7C32E14E ^ 0x5023;
                    r.o0O000O0O0O0[0x6F33 ^ 0x6F03] = 0xFFFF90FC ^ 0x6F03;
                    r.o0O000O0O0O0[0xBF99 ^ 0xBEBB] = 0xFFFF417E ^ 0xBEBB;
                    r.o0O000O0O0O0[0x8E29 ^ 0x8E56] = 0xB4FA6337 ^ 0x8E56;
                    r.o0O000O0O0O0[0x6DED ^ 0x6DCE] = 0x6DDD ^ 0x6DCE;
                    r.o0O000O0O0O0[0x5D37 ^ 0x5C32] = 0x5C32 ^ 0x5C32;
                    r.o0O000O0O0O0[0x3D22 ^ 0x3D23] = 0x3D30 ^ 0x3D23;
                    r.o0O000O0O0O0[0x8B5D ^ 0x8B1C] = 0x8B19 ^ 0x8B1C;
                    n3 = -1856910184;
                    continue block86;
                }
                case -1856910184: {
                    r.o0O000O0O0O0[0xD82 ^ 0xD99] = 0xD8A ^ 0xD99;
                    r.o0O000O0O0O0[0x83D7 ^ 0x83D4] = 0xFFFF7C2B ^ 0x83D4;
                    r.o0O000O0O0O0[0x3BAE ^ 0x3ACB] = 0xFFFFC566 ^ 0x3ACB;
                    r.o0O000O0O0O0[0x7162 ^ 0x7069] = 0xFFFF8F96 ^ 0x7069;
                    r.o0O000O0O0O0[0xE9A8 ^ 0xE980] = 0xE980 ^ 0xE980;
                    r.o0O000O0O0O0[0xD8BE ^ 0xD87E] = 0xD835 ^ 0xD87E;
                    r.o0O000O0O0O0[0xFB24 ^ 0xFB1C] = 0xFFFF04AF ^ 0xFB1C;
                    r.o0O000O0O0O0[0x6626 ^ 0x66C0] = 0x66C7 ^ 0x66C0;
                    n3 = -1040388698;
                    continue block86;
                }
                case -1040388698: {
                    r.o0O000O0O0O0[0x2296 ^ 0x23EC] = 0xDB197D63 ^ 0x23EC;
                    n3 = -559959892;
                    continue block86;
                }
                case -559959892: {
                    r.o0O000O0O0O0[0x27B1 ^ 0x26B3] = 0x26B6 ^ 0x26B3;
                    r.o0O000O0O0O0[0x4DAA ^ 0x4CD4] = 0x4CCF ^ 0x4CD4;
                    r.o0O000O0O0O0[0x4017 ^ 0x416B] = 0x4174 ^ 0x416B;
                    r.o0O000O0O0O0[0xF07A ^ 0xF11E] = 0x10F14D ^ 0xF11E;
                    r.o0O000O0O0O0[0xE250 ^ 0xE370] = 0xE344 ^ 0xE370;
                    r.o0O000O0O0O0[0x5503 ^ 0x55AD] = 0x55A0 ^ 0x55AD;
                    n3 = -362192867;
                    continue block86;
                }
                case -362192867: {
                    r.o0O000O0O0O0[0xC8CF ^ 0xC85B] = 0xC854 ^ 0xC85B;
                    r.o0O000O0O0O0[0xFCF5 ^ 0xFC77] = 0xFFFF03EA ^ 0xFC77;
                    r.o0O000O0O0O0[0x4503 ^ 0x456F] = 0x456F ^ 0x456F;
                    r.o0O000O0O0O0[0xFBAC ^ 0xFB60] = 0xFB7D ^ 0xFB60;
                    r.o0O000O0O0O0[0xBAD4 ^ 0xBAAC] = 0xFFFF4553 ^ 0xBAAC;
                    r.o0O000O0O0O0[0x307 ^ 0x316] = 0xFFFFFCE9 ^ 0x316;
                    r.o0O000O0O0O0[0x9C3F ^ 0x9D7F] = 0x9D10 ^ 0x9D7F;
                    r.o0O000O0O0O0[0x9CA ^ 0x882] = 0x8B7 ^ 0x882;
                    r.o0O000O0O0O0[0xBAAB ^ 0xBAD9] = 0xD8FD3500 ^ 0xBAD9;
                    r.o0O000O0O0O0[0xD66B ^ 0xD767] = 0xB968 ^ 0xD767;
                    n3 = -274346454;
                    continue block86;
                }
                case -274346454: {
                    r.o0O000O0O0O0[0xFC4 ^ 0xE93] = 0xE8E ^ 0xE93;
                    r.o0O000O0O0O0[0x4283 ^ 0x4395] = 0xE4D9 ^ 0x4395;
                    r.o0O000O0O0O0[0x44D2 ^ 0x44B6] = 0x44B9 ^ 0x44B6;
                    r.o0O000O0O0O0[0x2537 ^ 0x253F] = 0xFFFFDAAA ^ 0x253F;
                    n3 = -1668567192;
                    continue block86;
                }
                case -1668567192: {
                    r.o0O000O0O0O0[0x3817 ^ 0x384A] = 0x3851 ^ 0x384A;
                    r.o0O000O0O0O0[0xCE04 ^ 0xCE30] = 0xFFFF3187 ^ 0xCE30;
                    n3 = 4927605;
                    continue block86;
                }
                case 4927605: {
                    r.o0O000O0O0O0[0xCCC2 ^ 0xCC86] = 0xCCF5 ^ 0xCC86;
                    r.o0O000O0O0O0[0x9C4E ^ 0x9CC5] = 0xFFFF633A ^ 0x9CC5;
                    r.o0O000O0O0O0[0x45B5 ^ 0x44EE] = 0x44F5 ^ 0x44EE;
                    r.o0O000O0O0O0[0x3F88 ^ 0x3FED] = 0x3FE2 ^ 0x3FED;
                    r.o0O000O0O0O0[0x6E6A ^ 0x6E58] = 0x6FFD ^ 0x6E58;
                    r.o0O000O0O0O0[0xCAFB ^ 0xCA47] = 0xFFFF35D4 ^ 0xCA47;
                    r.o0O000O0O0O0[0x7F04 ^ 0x7FDE] = 0x7FC3 ^ 0x7FDE;
                    r.o0O000O0O0O0[0x8EE3 ^ 0x8E01] = 0xFFFF71FE ^ 0x8E01;
                    r.o0O000O0O0O0[0x4DAD ^ 0x4D3E] = 0x4D2F ^ 0x4D3E;
                    r.o0O000O0O0O0[0x8269 ^ 0x82B1] = 0x82A6 ^ 0x82B1;
                    n3 = 619017678;
                    continue block86;
                }
                case 619017678: {
                    r.o0O000O0O0O0[0xA0D2 ^ 0xA1D3] = 0xFFFF5EB6 ^ 0xA1D3;
                    r.o0O000O0O0O0[0xB13B ^ 0xB160] = 0xFFFF4EBF ^ 0xB160;
                    r.o0O000O0O0O0[0x328C ^ 0x3382] = 0x338F ^ 0x3382;
                    r.o0O000O0O0O0[0xAD61 ^ 0xADE7] = 0xADE7 ^ 0xADE7;
                    r.o0O000O0O0O0[0x10DA2 ^ 0x10DA5] = 0x75065DD0 ^ 0x10DA5;
                    r.o0O000O0O0O0[0xFDAA ^ 0xFDE0] = 0xFDE1 ^ 0xFDE0;
                    n3 = -1022069296;
                    continue block86;
                }
                case -1022069296: {
                    r.o0O000O0O0O0[0xA32E ^ 0xA221] = 0xA22D ^ 0xA221;
                    n3 = -1777662656;
                    continue block86;
                }
                case -1777662656: {
                    r.o0O000O0O0O0[0x4C48 ^ 0x4CA5] = 0x525D3273 ^ 0x4CA5;
                    r.o0O000O0O0O0[0xB07C ^ 0xB03E] = 0xB075 ^ 0xB03E;
                    r.o0O000O0O0O0[0xAD4F ^ 0xAC11] = 0xFFFF538E ^ 0xAC11;
                    r.o0O000O0O0O0[0xB904 ^ 0xB84A] = 0x3F034875 ^ 0xB84A;
                    r.o0O000O0O0O0[0x7A21 ^ 0x7A08] = 0xA7903071 ^ 0x7A08;
                    r.o0O000O0O0O0[0xE208 ^ 0xE2BD] = 0xFFFF1D66 ^ 0xE2BD;
                    r.o0O000O0O0O0[0x106AC ^ 0x107DE] = 0xFFFEF849 ^ 0x107DE;
                    r.o0O000O0O0O0[0x5D34 ^ 0x5D8B] = 0xFFFFA274 ^ 0x5D8B;
                    r.o0O000O0O0O0[0x70AE ^ 0x71CE] = 0xEFA8A816 ^ 0x71CE;
                    r.o0O000O0O0O0[0x819C ^ 0x8148] = 0x815F ^ 0x8148;
                    r.o0O000O0O0O0[0x109CE ^ 0x108B1] = 0x108B4 ^ 0x108B1;
                    r.o0O000O0O0O0[0x6CD2 ^ 0x6DEC] = 0x6DE3 ^ 0x6DEC;
                    r.o0O000O0O0O0[0xCFEC ^ 0xCFB0] = 0xCFB5 ^ 0xCFB0;
                    r.o0O000O0O0O0[0xC8A9 ^ 0xC8DC] = 0xC8CB ^ 0xC8DC;
                    r.o0O000O0O0O0[0x2BE1 ^ 0x2BDB] = 0x2BB4 ^ 0x2BDB;
                    r.o0O000O0O0O0[0x31EF ^ 0x315E] = 0xFFFFCEF1 ^ 0x315E;
                    r.o0O000O0O0O0[0xEAF4 ^ 0xEBF2] = 0xEBF2 ^ 0xEBF2;
                    r.o0O000O0O0O0[0x117C ^ 0x112E] = 0xC1F06D31 ^ 0x112E;
                    n3 = -652055307;
                    continue block86;
                }
                case -652055307: {
                    r.o0O000O0O0O0[0x4ADC ^ 0x4A82] = 0x4A87 ^ 0x4A82;
                    r.o0O000O0O0O0[0xF609 ^ 0xF677] = 0xFFFF09B2 ^ 0xF677;
                    r.o0O000O0O0O0[0x10CAD ^ 0x10C38] = 0x2D03C6E8 ^ 0x10C38;
                    r.o0O000O0O0O0[0xC47A ^ 0xC4D0] = 0xC4DF ^ 0xC4D0;
                    r.o0O000O0O0O0[0x940C ^ 0x94AD] = 0x94A4 ^ 0x94AD;
                    n3 = 1346585521;
                    continue block86;
                }
                case 1346585521: {
                    r.o0O000O0O0O0[0xDAF6 ^ 0xDA18] = 0xFFFF25D3 ^ 0xDA18;
                    n3 = -78703697;
                    continue block86;
                }
                case -78703697: {
                    r.o0O000O0O0O0[0x13CC ^ 0x1241] = 0x1238 ^ 0x1241;
                    n3 = -1554516430;
                    continue block86;
                }
                case -1554516430: {
                    r.o0O000O0O0O0[0xE8B ^ 0xE2B] = 0xE40 ^ 0xE2B;
                    r.o0O000O0O0O0[0x4882 ^ 0x48EC] = 0x48E3 ^ 0x48EC;
                    r.o0O000O0O0O0[0x9882 ^ 0x988D] = 0x98EE ^ 0x988D;
                    r.o0O000O0O0O0[0xA1EE ^ 0xA104] = 0xA117 ^ 0xA104;
                    r.o0O000O0O0O0[0x2C39 ^ 0x2CC5] = 0x61F28874 ^ 0x2CC5;
                    r.o0O000O0O0O0[0xBD5C ^ 0xBD63] = 0xBD18 ^ 0xBD63;
                    n3 = 315070554;
                    continue block86;
                }
                case 315070554: {
                    r.o0O000O0O0O0[0x7D82 ^ 0x7CD4] = 0xFFFF833F ^ 0x7CD4;
                    r.o0O000O0O0O0[0xCF01 ^ 0xCE80] = 0xFFFF312D ^ 0xCE80;
                    r.o0O000O0O0O0[0xF2FD ^ 0xF3A4] = 0x2E00F3A4 ^ 0xF3A4;
                    n3 = 382400085;
                    continue block86;
                }
                case 382400085: {
                    r.o0O000O0O0O0[0xF166 ^ 0xF023] = 0xFFFF0FBE ^ 0xF023;
                    r.o0O000O0O0O0[0x3288 ^ 0x3282] = 0x19FCD3F ^ 0x3282;
                    r.o0O000O0O0O0[0xC3 ^ 0x1AB] = 0x9D89D90B ^ 0x1AB;
                    r.o0O000O0O0O0[0xF689 ^ 0xF6C6] = 0xFFFF0979 ^ 0xF6C6;
                    r.o0O000O0O0O0[0x7ECF ^ 0x7E26] = 0x37130EFA ^ 0x7E26;
                    r.o0O000O0O0O0[0x9EBE ^ 0x9EF9] = 0xFFFF613E ^ 0x9EF9;
                    r.o0O000O0O0O0[0x4A06 ^ 0x4B6C] = 0x4B71 ^ 0x4B6C;
                    r.o0O000O0O0O0[0xDECB ^ 0xDE17] = 0x6666B878 ^ 0xDE17;
                    r.o0O000O0O0O0[0xBAA0 ^ 0xBA53] = 0x2400BA53 ^ 0xBA53;
                    n3 = 521788916;
                    continue block86;
                }
                case 521788916: {
                    r.o0O000O0O0O0[0x605F ^ 0x60D6] = 0x60D1 ^ 0x60D6;
                    n3 = 1094656229;
                    continue block86;
                }
                case 1094656229: {
                    r.o0O000O0O0O0[0xA767 ^ 0xA601] = 0xA610 ^ 0xA601;
                    r.o0O000O0O0O0[0x8385 ^ 0x8206] = 0xFFFF7DA9 ^ 0x8206;
                    n3 = -1658068040;
                    continue block86;
                }
                case -1658068040: {
                    r.o0O000O0O0O0[0xE247 ^ 0xE281] = 0xE294 ^ 0xE281;
                    r.o0O000O0O0O0[0x5F79 ^ 0x5F14] = 0x5F05 ^ 0x5F14;
                    n3 = -1434856724;
                    continue block86;
                }
                case -1434856724: {
                    r.o0O000O0O0O0[0xAD19 ^ 0xAD6A] = 0xAD61 ^ 0xAD6A;
                    r.o0O000O0O0O0[0xD79C ^ 0xD756] = 0xE000D756 ^ 0xD756;
                    n3 = -1374854094;
                    continue block86;
                }
                case -1374854094: {
                    r.o0O000O0O0O0[0x64B6 ^ 0x648A] = 0x64A1 ^ 0x648A;
                    r.o0O000O0O0O0[0xB1A ^ 0xBFE] = 0xB8E ^ 0xBFE;
                    r.o0O000O0O0O0[0x6C6D ^ 0x6C2B] = 0xFFFF93F2 ^ 0x6C2B;
                    r.o0O000O0O0O0[0xDD2B ^ 0xDDD2] = 0xFFFF226F ^ 0xDDD2;
                    r.o0O000O0O0O0[0x803C ^ 0x80D4] = 0x80C1 ^ 0x80D4;
                    n3 = 1497249696;
                    continue block86;
                }
                case 1497249696: {
                    r.o0O000O0O0O0[0xAC5E ^ 0xAC2F] = 0xCF3F53B8 ^ 0xAC2F;
                    r.o0O000O0O0O0[0x532A ^ 0x52A4] = 0xFFFFAD0F ^ 0x52A4;
                    r.o0O000O0O0O0[0xF37C ^ 0xF382] = 0xF3A3 ^ 0xF382;
                    r.o0O000O0O0O0[0xC55A ^ 0xC411] = 0xFFFF3BB2 ^ 0xC411;
                    r.o0O000O0O0O0[0x8774 ^ 0x8779] = 0x876C ^ 0x8779;
                    r.o0O000O0O0O0[0x7FB0 ^ 0x7F1C] = 0x7F09 ^ 0x7F1C;
                    r.o0O000O0O0O0[0x225C ^ 0x2329] = 0xFFFFDCD6 ^ 0x2329;
                    r.o0O000O0O0O0[0x2B69 ^ 0x2B73] = 0x2B7E ^ 0x2B73;
                    r.o0O000O0O0O0[0xB62B ^ 0xB6B7] = 0xB6AE ^ 0xB6B7;
                    n3 = 1820506345;
                    continue block86;
                }
                case 1820506345: {
                    r.o0O000O0O0O0[0x8C0C ^ 0x8D80] = 0xFFFF7253 ^ 0x8D80;
                    r.o0O000O0O0O0[0xAFA0 ^ 0xAFB8] = 0xFFFF5031 ^ 0xAFB8;
                    n3 = 1229231675;
                    continue block86;
                }
                case 1229231675: {
                    r.o0O000O0O0O0[0x5CC6 ^ 0x5DAF] = 0xFFFFA25C ^ 0x5DAF;
                    r.o0O000O0O0O0[0x7A ^ 0x31] = 0x2E ^ 0x31;
                    r.o0O000O0O0O0[0xC6A2 ^ 0xC656] = 0xEB2F18E5 ^ 0xC656;
                    r.o0O000O0O0O0[0xB45B ^ 0xB530] = 0xFFFF4ACD ^ 0xB530;
                    r.o0O000O0O0O0[0xE89B ^ 0xE8DE] = 0xC8B9C59C ^ 0xE8DE;
                    r.o0O000O0O0O0[0xE238 ^ 0xE359] = 0xE368 ^ 0xE359;
                    r.o0O000O0O0O0[0x91EF ^ 0x9144] = 0xFFFF6EAF ^ 0x9144;
                    r.o0O000O0O0O0[0x47FB ^ 0x46F1] = 0x9D17 ^ 0x46F1;
                    n3 = -72471552;
                    continue block86;
                }
                case -72471552: {
                    r.o0O000O0O0O0[0x869B ^ 0x87D2] = 0x87CB ^ 0x87D2;
                    r.o0O000O0O0O0[0x19EE ^ 0x18C3] = 0xFFFFE742 ^ 0x18C3;
                    r.o0O000O0O0O0[0xDED0 ^ 0xDE00] = 0xFFFF21E1 ^ 0xDE00;
                    r.o0O000O0O0O0[0xE4CF ^ 0xE40D] = 0xFFFF1BF2 ^ 0xE40D;
                    n3 = -1974991984;
                    continue block86;
                }
                case -1974991984: {
                    r.o0O000O0O0O0[0x108DC ^ 0x1084C] = 0xC0FD0813 ^ 0x1084C;
                    r.o0O000O0O0O0[0x9A1F ^ 0x9A22] = 0xFFFF65A9 ^ 0x9A22;
                    r.o0O000O0O0O0[0x9360 ^ 0x934A] = 0x935B ^ 0x934A;
                    r.o0O000O0O0O0[0x272E ^ 0x266D] = 0x46FDFF2A ^ 0x266D;
                    r.o0O000O0O0O0[0x3DEF ^ 0x3DFC] = 0xC972927 ^ 0x3DFC;
                    n3 = -1784969740;
                    continue block86;
                }
                case -1784969740: {
                    r.o0O000O0O0O0[0x1271 ^ 0x134C] = 0x135D ^ 0x134C;
                    n3 = 917083190;
                    continue block86;
                }
                case 917083190: {
                    r.o0O000O0O0O0[0x86BA ^ 0x8780] = 0xBA780 ^ 0x8780;
                    r.o0O000O0O0O0[0x2454 ^ 0x24FB] = 0x24E8 ^ 0x24FB;
                    r.o0O000O0O0O0[0xE277 ^ 0xE203] = 0xE216 ^ 0xE203;
                    r.o0O000O0O0O0[0x696E ^ 0x6908] = 0x691F ^ 0x6908;
                    r.o0O000O0O0O0[0x8C3A ^ 0x8D59] = 0xFFFF7288 ^ 0x8D59;
                    r.o0O000O0O0O0[0xDD17 ^ 0xDC33] = 0xFFFF23D6 ^ 0xDC33;
                    n3 = 1078818727;
                    continue block86;
                }
                case 1078818727: {
                    r.o0O000O0O0O0[0x757A ^ 0x75FA] = 0x75BB ^ 0x75FA;
                    n3 = 624953578;
                    continue block86;
                }
                case 624953578: {
                    r.o0O000O0O0O0[0x8351 ^ 0x83DE] = 0x83BB ^ 0x83DE;
                    r.o0O000O0O0O0[0xF501 ^ 0xF58C] = 0xF5C9 ^ 0xF58C;
                    n3 = -801317884;
                    continue block86;
                }
                case -801317884: {
                    r.o0O000O0O0O0[0x40F6 ^ 0x41A3] = 0x4148 ^ 0x41A3;
                    r.o0O000O0O0O0[0x10970 ^ 0x109D7] = 0xF5F709D7 ^ 0x109D7;
                    r.o0O000O0O0O0[0x105A7 ^ 0x105C7] = 0x298105C7 ^ 0x105C7;
                    r.o0O000O0O0O0[0xE1E7 ^ 0xE154] = 0xFFFF1EAB ^ 0xE154;
                    r.o0O000O0O0O0[0x1F80 ^ 0x1EC1] = 0x1FA8 ^ 0x1EC1;
                    r.o0O000O0O0O0[0xADA1 ^ 0xAC95] = 0xFFFF5316 ^ 0xAC95;
                    n3 = 75468354;
                    continue block86;
                }
                case 75468354: {
                    r.o0O000O0O0O0[0x8DC8 ^ 0x8C90] = 0x8C93 ^ 0x8C90;
                    n3 = -620779955;
                    continue block86;
                }
                case -620779955: {
                    r.o0O000O0O0O0[0xDF1 ^ 0xCB3] = 0xCC0 ^ 0xCB3;
                    r.o0O000O0O0O0[0x10BBA ^ 0x10A86] = 0x10A9B ^ 0x10A86;
                    r.o0O000O0O0O0[0xABF2 ^ 0xABD5] = 0xFFFF545C ^ 0xABD5;
                    n3 = -1727087830;
                    continue block86;
                }
                case -1727087830: {
                    r.o0O000O0O0O0[0x3C3A ^ 0x3C0C] = 0xE0A71360 ^ 0x3C0C;
                    r.o0O000O0O0O0[0x65F3 ^ 0x64EC] = 0x64D1 ^ 0x64EC;
                    r.o0O000O0O0O0[0xF433 ^ 0xF52B] = 0xC95F0AF7 ^ 0xF52B;
                    r.o0O000O0O0O0[0x5EB4 ^ 0x5FBD] = 0xFF8E ^ 0x5FBD;
                    r.o0O000O0O0O0[0xE8D2 ^ 0xE954] = 0xFFFF16FF ^ 0xE954;
                    r.o0O000O0O0O0[0xDF63 ^ 0xDFDD] = 0xFFFF2022 ^ 0xDFDD;
                    r.o0O000O0O0O0[0x10E77 ^ 0x10F2B] = 0x10F26 ^ 0x10F2B;
                    r.o0O000O0O0O0[0x5E7E ^ 0x5EE7] = 0x5EBC ^ 0x5EE7;
                    r.o0O000O0O0O0[0x17EC ^ 0x16E4] = 0x16E4 ^ 0x16E4;
                    r.o0O000O0O0O0[0xE727 ^ 0xE791] = 0xFFFF184A ^ 0xE791;
                    r.o0O000O0O0O0[0xF85D ^ 0xF977] = 0xEEEE1798 ^ 0xF977;
                    r.o0O000O0O0O0[0x437C ^ 0x423B] = 0xFFFFBDBE ^ 0x423B;
                    r.o0O000O0O0O0[0x9BB4 ^ 0x9B0C] = 0x9B19 ^ 0x9B0C;
                    r.o0O000O0O0O0[0x9F6D ^ 0x9F43] = 0x5AD62AED ^ 0x9F43;
                    r.o0O000O0O0O0[0x10ACD ^ 0x10A45] = 0x10A5C ^ 0x10A45;
                    r.o0O000O0O0O0[0x10478 ^ 0x1052A] = 0x26E87DFF ^ 0x1052A;
                    r.o0O000O0O0O0[0x320D ^ 0x3201] = 0x320A ^ 0x3201;
                    n3 = -1150980766;
                    continue block86;
                }
                case -1150980766: {
                    r.o0O000O0O0O0[0x1049B ^ 0x105EF] = 0x7FFEFA10 ^ 0x105EF;
                    r.o0O000O0O0O0[0xE4B9 ^ 0xE5BA] = 0x3333D689 ^ 0xE5BA;
                    r.o0O000O0O0O0[0x1A1D ^ 0x1A7A] = 0x1A73 ^ 0x1A7A;
                    r.o0O000O0O0O0[0xAFB2 ^ 0xAEA6] = 0xFFFF5159 ^ 0xAEA6;
                    r.o0O000O0O0O0[0x6975 ^ 0x6908] = 0x691B ^ 0x6908;
                    r.o0O000O0O0O0[0x27B6 ^ 0x27EC] = 0x9999BEF6 ^ 0x27EC;
                    r.o0O000O0O0O0[0x1DF9 ^ 0x1CCB] = 0xFFFFE334 ^ 0x1CCB;
                    r.o0O000O0O0O0[0xA8FD ^ 0xA9D8] = 0xFFFF5629 ^ 0xA9D8;
                    n3 = 209778655;
                    continue block86;
                }
                case 209778655: {
                    r.o0O000O0O0O0[0x8D8C ^ 0x8D12] = 0x8D0B ^ 0x8D12;
                    n3 = 1151328406;
                    continue block86;
                }
                case 1151328406: {
                    r.o0O000O0O0O0[0xD5D4 ^ 0xD4FD] = 0xD4EE ^ 0xD4FD;
                    r.o0O000O0O0O0[0x8420 ^ 0x84F7] = 0x400084E2 ^ 0x84F7;
                    r.o0O000O0O0O0[0xFBCB ^ 0xFBB2] = 0xFBB3 ^ 0xFBB2;
                    n3 = -184941407;
                    continue block86;
                }
                case -184941407: {
                    r.o0O000O0O0O0[0xFA88 ^ 0xFB91] = 0xFBF4 ^ 0xFB91;
                    r.o0O000O0O0O0[0xA112 ^ 0xA09A] = 0xCCCC6C57 ^ 0xA09A;
                    n3 = 754771236;
                    continue block86;
                }
                case 754771236: {
                    r.o0O000O0O0O0[0x6DC1 ^ 0x6CF7] = 0xFFFF93E7 ^ 0x6CF7;
                    r.o0O000O0O0O0[0xD2C0 ^ 0xD39F] = 0xFFFF2C32 ^ 0xD39F;
                    r.o0O000O0O0O0[0xE33E ^ 0xE329] = 0xFFFF1CA8 ^ 0xE329;
                    r.o0O000O0O0O0[0x8D7E ^ 0x8CFB] = 0xFFFF7320 ^ 0x8CFB;
                    r.o0O000O0O0O0[0x4711 ^ 0x4741] = 0xFFFFB8FE ^ 0x4741;
                    r.o0O000O0O0O0[0x73AC ^ 0x72E1] = 0x72A0 ^ 0x72E1;
                    r.o0O000O0O0O0[0x8273 ^ 0x824D] = 0x8206 ^ 0x824D;
                    r.o0O000O0O0O0[0x411F ^ 0x4180] = 0xFFFFBE13 ^ 0x4180;
                    r.o0O000O0O0O0[0x4076 ^ 0x40A8] = 0xFFFFBF0F ^ 0x40A8;
                    r.o0O000O0O0O0[0x813A ^ 0x8162] = 0xFFFF7E9D ^ 0x8162;
                    n3 = 1687215970;
                    continue block86;
                }
                case 1687215970: {
                    r.o0O000O0O0O0[0x7EBD ^ 0x7E7A] = 0xFFFF81C1 ^ 0x7E7A;
                    r.o0O000O0O0O0[0x56F5 ^ 0x57E6] = 0xFFFFA819 ^ 0x57E6;
                    r.o0O000O0O0O0[0x5EFE ^ 0x5E8E] = 0x5E83 ^ 0x5E8E;
                    r.o0O000O0O0O0[0x4D8C ^ 0x4DA8] = 0x4DBD ^ 0x4DA8;
                    n3 = -397834231;
                    continue block86;
                }
                case -397834231: {
                    r.o0O000O0O0O0[0x10E47 ^ 0x10E13] = 0xFFFEF1EC ^ 0x10E13;
                    r.o0O000O0O0O0[0xB048 ^ 0xB022] = 0xB027 ^ 0xB022;
                    r.o0O000O0O0O0[0x1FBC ^ 0x1F99] = 0x1F92 ^ 0x1F99;
                    r.o0O000O0O0O0[0xA161 ^ 0xA074] = 0xFFFF5F8B ^ 0xA074;
                    r.o0O000O0O0O0[0x5673 ^ 0x5622] = 0x57AE ^ 0x5622;
                    r.o0O000O0O0O0[0x3477 ^ 0x3482] = 0x349B ^ 0x3482;
                    r.o0O000O0O0O0[0x10AF9 ^ 0x10B84] = 0x10B85 ^ 0x10B84;
                    n3 = -624262815;
                    continue block86;
                }
                case -624262815: {
                    r.o0O000O0O0O0[0xDCF3 ^ 0xDCDE] = 0xDCD5 ^ 0xDCDE;
                    n3 = -492367558;
                    continue block86;
                }
                case -492367558: {
                    r.o0O000O0O0O0[0x79A8 ^ 0x79E5] = 0x79FE ^ 0x79E5;
                    r.o0O000O0O0O0[0x769F ^ 0x76AA] = 0xFA3F3143 ^ 0x76AA;
                    r.o0O000O0O0O0[0xBB49 ^ 0xBA53] = 0xFFFF45EA ^ 0xBA53;
                    r.o0O000O0O0O0[0x6844 ^ 0x68CA] = 0xFFFF973B ^ 0x68CA;
                    r.o0O000O0O0O0[0x9D64 ^ 0x9D71] = 0xFFFF62B2 ^ 0x9D71;
                    r.o0O000O0O0O0[0xE4B4 ^ 0xE5DB] = 0xE5CC ^ 0xE5DB;
                    r.o0O000O0O0O0[0xE3F8 ^ 0xE2D6] = 0xFFFF1D69 ^ 0xE2D6;
                    r.o0O000O0O0O0[0x85CC ^ 0x8498] = 0xFFFF7B67 ^ 0x8498;
                    r.o0O000O0O0O0[0x183A ^ 0x194B] = 0x1903 ^ 0x194B;
                    r.o0O000O0O0O0[0xE5E ^ 0xE71] = 0xE2C ^ 0xE71;
                    n3 = 1824615809;
                    continue block86;
                }
                case 1824615809: {
                    r.o0O000O0O0O0[0xDB6F ^ 0xDB8C] = 0xDBE1 ^ 0xDB8C;
                    r.o0O000O0O0O0[0x5FC2 ^ 0x5F78] = 0x5F1F ^ 0x5F78;
                    r.o0O000O0O0O0[0x5A4C ^ 0x5B35] = 0xBEFBB48A ^ 0x5B35;
                    n3 = -521347712;
                    continue block86;
                }
                case -521347712: {
                    r.o0O000O0O0O0[0x62E4 ^ 0x62B1] = 0x62E4 ^ 0x62B1;
                    r.o0O000O0O0O0[0xA527 ^ 0xA42A] = 0xA429 ^ 0xA42A;
                    r.o0O000O0O0O0[0x4458 ^ 0x4544] = 0x454F ^ 0x4544;
                    r.o0O000O0O0O0[0x87A9 ^ 0x8723] = 0x8723 ^ 0x8723;
                    r.o0O000O0O0O0[0xD09D ^ 0xD00A] = 0xD01F ^ 0xD00A;
                    r.o0O000O0O0O0[0xADA3 ^ 0xAD76] = 0xAD7F ^ 0xAD76;
                    r.o0O000O0O0O0[0xDF16 ^ 0xDFE0] = 0xDFE7 ^ 0xDFE0;
                    r.o0O000O0O0O0[0xEDA6 ^ 0xED1D] = 0xED60 ^ 0xED1D;
                    r.o0O000O0O0O0[0xED2D ^ 0xED26] = 0xFFFF129B ^ 0xED26;
                    r.o0O000O0O0O0[0x7530 ^ 0x75B3] = 0xFFFF8A23 ^ 0x75B3;
                    r.o0O000O0O0O0[0xCF7A ^ 0xCE20] = 0xCE25 ^ 0xCE20;
                    r.o0O000O0O0O0[0xF451 ^ 0xF551] = 0xFFFF0AAE ^ 0xF551;
                    n3 = 1740207699;
                    continue block86;
                }
                case 1740207699: {
                    r.o0O000O0O0O0[0x3AE6 ^ 0x3BE1] = 0x3BE1 ^ 0x3BE1;
                    r.o0O000O0O0O0[0xF52A ^ 0xF444] = 0xF467 ^ 0xF444;
                    n3 = -1312901953;
                    continue block86;
                }
                case -1312901953: {
                    r.o0O000O0O0O0[0x500A ^ 0x50D9] = 0x50F6 ^ 0x50D9;
                    r.o0O000O0O0O0[0xB16 ^ 0xA30] = 0xFFFFF5B7 ^ 0xA30;
                    n3 = -1409914346;
                    continue block86;
                }
                case -1409914346: {
                    r.o0O000O0O0O0[0x101F3 ^ 0x10168] = 0x1016F ^ 0x10168;
                    r.o0O000O0O0O0[0xB736 ^ 0xB632] = 0xB649 ^ 0xB632;
                    r.o0O000O0O0O0[0x39EC ^ 0x388E] = 0xFFFFC759 ^ 0x388E;
                    r.o0O000O0O0O0[0x110A ^ 0x11CF] = 0x11C4 ^ 0x11CF;
                    n3 = -1790828710;
                    continue block86;
                }
                case -1790828710: {
                    r.o0O000O0O0O0[0xF1B6 ^ 0xF1E1] = 0xF1E3 ^ 0xF1E1;
                    r.o0O000O0O0O0[0xFC11 ^ 0xFC3D] = 0xFC28 ^ 0xFC3D;
                    r.o0O000O0O0O0[0xD1C2 ^ 0xD0E9] = 0xFFFF2F54 ^ 0xD0E9;
                    n3 = -1760245311;
                    continue block86;
                }
                case -1760245311: {
                    r.o0O000O0O0O0[0x48A8 ^ 0x49EE] = 0x1D23283F ^ 0x49EE;
                    r.o0O000O0O0O0[0x621F ^ 0x620D] = 0x627A ^ 0x620D;
                    r.o0O000O0O0O0[0x6957 ^ 0x698C] = 0x698F ^ 0x698C;
                    r.o0O000O0O0O0[0x106E5 ^ 0x107DD] = 0xFFFEF822 ^ 0x107DD;
                    n3 = -2014592693;
                    continue block86;
                }
                case -2014592693: {
                    r.o0O000O0O0O0[0x91C3 ^ 0x9180] = 0x239E9CDB ^ 0x9180;
                    r.o0O000O0O0O0[0xFBCA ^ 0xFA4E] = 0xFFFF05B1 ^ 0xFA4E;
                    r.o0O000O0O0O0[0x4699 ^ 0x46FB] = 0x46EC ^ 0x46FB;
                    r.o0O000O0O0O0[0xB0BA ^ 0xB00A] = 0xB041 ^ 0xB00A;
                    r.o0O000O0O0O0[0xABB5 ^ 0xAB08] = 0xFFFF54A3 ^ 0xAB08;
                    r.o0O000O0O0O0[0xCB58 ^ 0xCA28] = 0xCA21 ^ 0xCA28;
                    r.o0O000O0O0O0[0xEE96 ^ 0xEEFF] = 0xEEE4 ^ 0xEEFF;
                    r.o0O000O0O0O0[0x2201 ^ 0x2290] = 0xFFFFDD31 ^ 0x2290;
                    r.o0O000O0O0O0[0xAC4D ^ 0xACE5] = 0xFFFF5328 ^ 0xACE5;
                    r.o0O000O0O0O0[0x809D ^ 0x8059] = 0x1C00867C ^ 0x8059;
                    r.o0O000O0O0O0[0x8F79 ^ 0x8F31] = 0xFFFF63E3 ^ 0x8F31;
                    r.o0O000O0O0O0[0xF8E8 ^ 0xF8D3] = 0xF8D5 ^ 0xF8D3;
                    r.o0O000O0O0O0[0xAEF9 ^ 0xAF81] = 0x3C5A1 ^ 0xAF81;
                    n3 = -1761433658;
                    continue block86;
                }
                case -1761433658: {
                    r.o0O000O0O0O0[0xE7BB ^ 0xE63C] = 0xF0B3 ^ 0xE63C;
                    r.o0O000O0O0O0[0x682E ^ 0x69AE] = 0xACB966C5 ^ 0x69AE;
                    n3 = 948490988;
                    continue block86;
                }
                case 948490988: {
                    r.o0O000O0O0O0[0x9946 ^ 0x9929] = 0x993A ^ 0x9929;
                    r.o0O000O0O0O0[0x17CE ^ 0x16E1] = 0x16EC ^ 0x16E1;
                    r.o0O000O0O0O0[0xB048 ^ 0xB01E] = 0xB001 ^ 0xB01E;
                    r.o0O000O0O0O0[0x8F6A ^ 0x8E11] = 0x8C11 ^ 0x8E11;
                    r.o0O000O0O0O0[0x31C7 ^ 0x31D7] = 0xFFFFCE16 ^ 0x31D7;
                    r.o0O000O0O0O0[0x603B ^ 0x611C] = 0xFFBE1EE3 ^ 0x611C;
                    n3 = -762011871;
                    continue block86;
                }
                case -762011871: {
                    r.o0O000O0O0O0[0x3B45 ^ 0x3B47] = 0x3B4A ^ 0x3B47;
                    r.o0O000O0O0O0[0xBB1C ^ 0xBA71] = 0xBA70 ^ 0xBA71;
                    r.o0O000O0O0O0[0x9B2E ^ 0x9B9A] = 0x9BE1 ^ 0x9B9A;
                    n3 = -1414850252;
                    continue block86;
                }
                case -1414850252: {
                    r.o0O000O0O0O0[0x102E6 ^ 0x10251] = 0x1025A ^ 0x10251;
                    r.o0O000O0O0O0[0x498C ^ 0x4990] = 0x410459D1 ^ 0x4990;
                    r.o0O000O0O0O0[0xCF58 ^ 0xCF5D] = 0xCF4A ^ 0xCF5D;
                    n3 = -222837999;
                    continue block86;
                }
                case -222837999: {
                    r.o0O000O0O0O0[0xC5E ^ 0xCC4] = 0x10CC4 ^ 0xCC4;
                    n3 = -1349191390;
                    continue block86;
                }
                case -1349191390: {
                    r.o0O000O0O0O0[0x25B ^ 0x368] = 0xFFFFFCDF ^ 0x368;
                    n3 = 1303237123;
                    continue block86;
                }
                case 1303237123: {
                    r.o0O000O0O0O0[0xEA15 ^ 0xEA63] = 0xEA6A ^ 0xEA63;
                    r.o0O000O0O0O0[0x1387 ^ 0x137F] = 0x137E ^ 0x137F;
                    n3 = -1979851580;
                    continue block86;
                }
                case -1979851580: {
                    r.o0O000O0O0O0[0x29E8 ^ 0x28D7] = 0xFFFFD70A ^ 0x28D7;
                    r.o0O000O0O0O0[0x291A ^ 0x2979] = 0xD4D1955C ^ 0x2979;
                    n3 = 1758521872;
                    continue block86;
                }
                case 1758521872: {
                    r.o0O000O0O0O0[0x7399 ^ 0x73D7] = 0x738A ^ 0x73D7;
                    r.o0O000O0O0O0[0xB056 ^ 0xB0AB] = 0xFFFF4F42 ^ 0xB0AB;
                    r.o0O000O0O0O0[0x7594 ^ 0x7594] = 0xFFF78A6B ^ 0x7594;
                    r.o0O000O0O0O0[0xA2F3 ^ 0xA3C3] = 0xA3D0 ^ 0xA3C3;
                    n3 = -355228744;
                    continue block86;
                }
                case -355228744: {
                    r.o0O000O0O0O0[0xFC97 ^ 0xFCEB] = 0xFCE6 ^ 0xFCEB;
                    r.o0O000O0O0O0[0x39DB ^ 0x38F8] = 0xFFFFC77B ^ 0x38F8;
                    n3 = 1627773832;
                    continue block86;
                }
                case 1627773832: {
                    r.o0O000O0O0O0[0x1767 ^ 0x1675] = 0x2825 ^ 0x1675;
                    r.o0O000O0O0O0[0xF1FA ^ 0xF11B] = 0xF169 ^ 0xF11B;
                    r.o0O000O0O0O0[0x6962 ^ 0x69F0] = 0xFFFF964F ^ 0x69F0;
                    r.o0O000O0O0O0[0xC9F2 ^ 0xC9C3] = 0xC9E0 ^ 0xC9C3;
                    n3 = 1907636423;
                    continue block86;
                }
                case 1907636423: 
            }
            r.o0O000O0O0O0[0x8F6D ^ 0x8F8D] = 0xFFFF706A ^ 0x8F8D;
            r.o0O000O0O0O0[0x3F27 ^ 0x3F78] = 0xFFFFC09B ^ 0x3F78;
            r.o0O000O0O0O0[0x10396 ^ 0x103ED] = 0xFFFEFC12 ^ 0x103ED;
            r.o0O000O0O0O0[0x6DA6 ^ 0x6CD1] = 0x6CD0 ^ 0x6CD1;
            r.o0O000O0O0O0[0xBC63 ^ 0xBD4F] = 0x3F00BD30 ^ 0xBD4F;
            r.o0O000O0O0O0[0x635A ^ 0x6393] = 0x6382 ^ 0x6393;
            r.o0O000O0O0O0[0x8E0 ^ 0x86C] = 0xA2C4DA28 ^ 0x86C;
            r.o0O000O0O0O0[0xF7F6 ^ 0xF750] = 0xFFFF08AF ^ 0xF750;
            r.o0O000O0O0O0[0x53E5 ^ 0x52AF] = 0xFFFFAD76 ^ 0x52AF;
            r.o0O000O0O0O0[0x9AD2 ^ 0x9AF3] = 0xFFFF6509 ^ 0x9AF3;
            n3 = 924678480;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        long l2;
        int n2 = 742247191;
        if (n2 != n2) {
            throw new NoSuchMethodException();
        }
        n2 = 1546173659;
        if (n2 != n2) {
            n2 = 23;
        }
        Object[] objectArray = new Object[22];
        long[] lArray = new long[22];
        r.q0OOOoo00o0();
        ooO00oO0OoO0 = new String[o0O000O0O0O0[247]];
        oO000O00OO00 = new String[o0O000O0O0O0[248]];
        oOo00Oo0OOo0 = new Object[-o0O000O0O0O0[249] - o0O000O0O0O0[250] - o0O000O0O0O0[251]];
        lArray[0] = l2 = 4683162517722807039L;
        long l3 = lArray[0];
        lArray[0] = l2 = l3 ^ ((long)((o0O000O0O0O0[252] + o0O000O0O0O0[253] ^ o0O000O0O0O0[254]) * o0O000O0O0O0[255] ^ o0O000O0O0O0[256]) ^ l3) & -1L >>> o0O000O0O0O0[257] * o0O000O0O0O0[258] * o0O000O0O0O0[259] - o0O000O0O0O0[260];
        String string = oO000O00OO00[o0O000O0O0O0[261]];
        if (string == null) {
            int n3 = o0O000O0O0O0[262];
            String string2 = ooO00oO0OoO0[o0O000O0O0O0[263]];
            if (string2 == null) {
                objectArray[3] = "\ua57f\u3580\u1183\ua185\u6d87\u3588\ubb6b\u3d6d\u976f\u6771\u9773\u9375\ud577\ucd79\u8d5b\u995d\u535f\ua161\uef63\u6d64\u0b66\ueb69\ua34b\u114c\u714e\udf51\u7152\u4755\u4557\uff58\u533b\uab3d\u713e\u2141\u7142\u6d44\u9547\u7348\u352b\u6f2c\u312f\u5d30\u2733\u1134\uff36\u4d38\uc51b\u631c\u791e\u4b20\u2522\ued25\u4726\u1d28\u470a\u450c\u530e\u8d0f\u3112\u8b13\uf717\u5b18\u8f19\u54fc\u22fe\uc700\u7701\u2b04\u2906\u2708\uceea\uccec\u68ed\uccf0\ud0f2\u8af4\ua4f6\u68f7\u50da\u8adc\u8ade\u12e0\uf6e2\u64e3\ua4e6\u80e8\u44e9\uf4cc\u0ece\u54cf\uf0d2\ue4d4\ub6d6\u60d8\u06ba\u02bc\u32bd\u3abf\u1ec1\uaac4\u3ac5\u9cc8\ucaaa\u78ac\ua8ae\u06b0\u2eb1\ubcb4\u1eb5\u0cb8\u049a\u609c\ue29e\u74a0\u64a2\ue6a4\u40a6\u00a7\u3c8a\u4c8c\ude8e\u9690\u4a92\u8c94\u9296\uea98\u667a\ud27b\ua47f\u7a81\uaa83\u7a85\u1687\u7489\uac6b\ua86d\u5c6f\u7271\ua273\uae75\u8077\uce79\u5c5b\ua05d\ue65f\ub461\ua463\uaa65\u3c67\ub469\ub64b\uaa4d\u0e4c\u1a4e\ua053\ue655\u5257\u0856\u6658\u683a\u243f\u103e\ubc43\u9245\u1444\u2449\u6648\u222d\u0e2c\u3031\u9e31\u9c33\u3637\u1636\u0838\u241d\u501c\u501e\u4420\uea25\u4624\ue229\u4a28\u940b\ue60f\u480e\u6210\u2412\u4e14\ue619\u4218\u95fb\ua9fc\u5dff\ucc00\ua602\u6405\u5e07\uba08\uafea\u75ed\ua1ee\ud5f0\ud5f2\u87f4\u7df6\ucdf8\u83da\u67dc\u2bde\u0be0\ucde2\u41e5\ubbe6\ub9e8\ua3ca\u65cc\u4fcf\ua5d0\ue3d2\u69d4\u5bd7\ue5d8\u2fba\u31bd\u5fbe\u33c1\ubfc2\uabc4\u2fc7\u1dc9\u37ab\ub3ac\uc7ae\u23b1\u9fb2\u21b5\ua7b6\u63b8\u4f9a\u179d\u199f\ue7a0\u39a2\u5fa4\ua3a6\uf9a8\ufb8a\u4b8c\u738e\u9b90\u3592\u1f94\u4196\u1f98\u437a\u197b\ub77d\u637f\u8781\u1f82\ub185\ubf87\u8589\u4d6a\ua16d\ucb6f\u7f71\u9f73\u9175\u8177\ud179\ua75b\u555d\ueb5f\u0360\u8d62\u6f64\u0566\u0f68\ub94b\u6f4c\u3d4f\u5751\ucd53\ue755\u6956\u6f59\u8d3a\u913d\u153e\u7740\u6342\u7544\ua749\ua92b\u692a\u292d\ub531\u0130\u1f33\u6334\u2137\ubd39\u1f1a\u0f1d\u351e\u2320\u3322\u4324\u3326\u2b28\u1f0a\u6b0c\u7f11\u3f10\u6d12\ue315\u5116\u5718\ud8fa\u8efc\u22fe\ud100\u8902\u5d07\u3306\u60eb\u4cea\u6eef\u5aee\u82f0\u62f5\uecf4\uacf6\ua6f8\uccda\u5edc\u64de\ub6e0\u9ce2\u76e4\u0ae6\ub2e8\u18ca\ufccc\u50d1\u00d0\u4ad5\u2cd4\u8cd6\ufcd8\u24bd\uc8bc\ua6be\uecc0\u66c2\uc6c4\u6ec6\ub0c8\u1aaa\ua4ac\u4cb1\u62b0\u4cb5\u00b4\uc8b6\u54b8\u3a9a\u489c\udc9e\uf6a0\u18a5\u68a4\uaca6\ue0a8\uda95\u908c\u608e\uf490\ue092\u2694\u5696\u8698\u2484\u947d\u887f\u8c81\ub083\u1885\uae87\u7a89\u686b\ud66d\ub26f\ua471\ua873\u8875\uda77\u4e79\u6664\u2c66\ue05f\ub661\uba63\u224e\u4867\u0852\ua64b\u6e56\u504f\u3c51\u103c\uf855\u4657\ud643\u2e3b\u6646\u2e3f\u5e2a\u6a2c\u0245\uba31\u8c32\u2a2b\uec2d\u0638\u141a\u021c\ud635\u1820\uda39\ue61b\uac27\u3828\udc21\uae0d\u820f\u6c10\ufa29\u5814\u100d\u6818\u6bfa\u39fc\uea15\u2a00\u5402\ua404\u6e07\ud608\ucdea\ub1ec\u23ee\u81f0\u63f3\ub5f4\ucff6\ud9f8\ua1da\u27dc\u4dde\u31e0\uc9e2\ubbe4\u6de7\udfe8\u4bcb\udfcc\u2fce\u0dd0\uf9d2\u65d4\ub1d6\uf1d8\ub7ba\u63bc\u63be\uabc0\u5bc3\u39c5\u93c6\u7bc8\ua7aa\u0bac\ucfae\u8db0\u25b3\uedb4\u59b6\uc9b8\u259b\udb9c\u579e\ueda0\u07a2\u8ba4\uf5a6\u67a8\u098b\u598c\u758e\ueb90\u8392\u7594\ue396\u5598\u6f7a\u177d\ub57e\u5780\ub182\u9187\u8f89\u916b\u836d\uaf6f\uc171\u6b73\ua575\u7377\u3178\ud95b\u735d\u875f\ud961\uef63\uc365\u6b66\u4b69\u6b4b\ue34d\u614e\u7950\u6d53\ub955\ubd4d\uab59\uf53b\u4b3d\ubd55\u7541\u4143\ucf45\uab3d\u3949\u1f2b\ua743\u212f\ua947\u4332\u3735\u2137\u2739\uc31b\u8d1c\u211f\ua337\ucf39\u1924\uf527\u6728\u150b\u6f0c\uad25\u8727\u2112\u8d14\u5516\ue119\u34fa\u68fc\u8315\ud100\u4b02\u7efb\ud106\u62ff\u82ea\u7b03\ub2ee\uc0f0\u4cf2\ua6f4\ud8f6\u66ef\u7eda\ua2dc\u84de\u7ee0\ua4e2\u82e4\ueae6\u52df\uf4ca\ucccc\ue0ce\u0cd0\ufad2\ub4d4\u2ed6\ub4d8\uf2ba\uaabc\ue2be\u64c0\ue2c2\ua6c4\u7ac6\u2ec8\u62aa\u36c3\uccae\u78b0\ub2b2\u64b4\u72b6\u4eaf\uce9a\u9c9c".toCharArray();
                lArray[5] = l2 = (long)o0O000O0O0O0[264];
                while ((int)lArray[5] < ((char[])objectArray[3]).length) {
                    char[] cArray = (char[])objectArray[3];
                    int n4 = (int)lArray[5];
                    char c2 = (char)((char)((char)((char)((char)((char)((char)(-cArray[n4]) + o0O000O0O0O0[265]) + o0O000O0O0O0[266]) ^ o0O000O0O0O0[267]) ^ o0O000O0O0O0[268]) + n4) + n4);
                    char c3 = (char)(c2 << o0O000O0O0O0[269] | c2 >>> o0O000O0O0O0[270]);
                    cArray[n4] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(c3 >>> o0O000O0O0O0[271] | c3 << o0O000O0O0O0[272]) ^ n4) + o0O000O0O0O0[273]) ^ o0O000O0O0O0[274]) ^ o0O000O0O0O0[275]) ^ o0O000O0O0O0[276]) - n4) ^ o0O000O0O0O0[277]) - o0O000O0O0O0[278]);
                    lArray[5] = l2 = (long)((int)lArray[5] + 1);
                }
                string2 = r.ooO00oO0OoO0[r.o0O000O0O0O0[279]] = new String((char[])objectArray[3]);
            }
            string = r.o0Oo000O0oO(n3, string2);
        }
        objectArray[10] = string.toCharArray();
        int n5 = o0O000O0O0O0[280] ^ o0O000O0O0O0[281] ^ o0O000O0O0O0[282];
        lArray[16] = l2 = 8302207512409218519L;
        long l4 = lArray[16];
        lArray[16] = l2 = l4 ^ ((long)(n5 >>> o0O000O0O0O0[283] | n5 << o0O000O0O0O0[284]) ^ l4) & -1L >>> o0O000O0O0O0[285] + o0O000O0O0O0[286] + o0O000O0O0O0[287];
        int n6 = -545913309;
        lArray[15] = l2 = -1703852887864857028L;
        long l5 = lArray[15];
        int n7 = o0O000O0O0O0[295];
        lArray[15] = l2 = l5 ^ ((long)(o0O000O0O0O0[288] + o0O000O0O0O0[289] ^ o0O000O0O0O0[290]) << ((-o0O000O0O0O0[291] ^ o0O000O0O0O0[292]) - o0O000O0O0O0[293] ^ o0O000O0O0O0[294]) ^ l5) & -1L << (n7 >>> o0O000O0O0O0[296] | n7 << o0O000O0O0O0[297]) * o0O000O0O0O0[298] - o0O000O0O0O0[299];
        while (true) {
            int n8 = (o0O000O0O0O0[300] + o0O000O0O0O0[301]) * o0O000O0O0O0[302];
            if ((int)(lArray[15] >>> (n8 << o0O000O0O0O0[303] | n8 >>> o0O000O0O0O0[304])) >= (int)lArray[16]) break;
            lArray[15] = l2 = lArray[15] + 0x100000000L;
            long l6 = lArray[0];
            int n9 = o0O000O0O0O0[314];
            int n10 = n9 << o0O000O0O0O0[315] | n9 >>> o0O000O0O0O0[316];
            lArray[0] = l2 = l6 ^ ((long)((char[])objectArray[10])[(int)(lArray[15] >>> (o0O000O0O0O0[305] ^ o0O000O0O0O0[306]) * o0O000O0O0O0[307] * o0O000O0O0O0[308] * o0O000O0O0O0[309])] << (o0O000O0O0O0[310] * o0O000O0O0O0[311] ^ o0O000O0O0O0[312] ^ o0O000O0O0O0[313]) ^ l6) & -1L << (n10 << o0O000O0O0O0[317] | n10 >>> o0O000O0O0O0[318]) + o0O000O0O0O0[319] - o0O000O0O0O0[320];
            lArray[15] = l2 = lArray[15] + 0x100000000L;
            long l7 = lArray[15];
            lArray[15] = l2 = l7 ^ ((long)((char[])objectArray[10])[(int)(lArray[15] >>> (o0O000O0O0O0[321] + o0O000O0O0O0[322]) * o0O000O0O0O0[323] + o0O000O0O0O0[324] + o0O000O0O0O0[325])] ^ l7) & -1L >>> o0O000O0O0O0[326] * o0O000O0O0O0[327] - o0O000O0O0O0[328] - o0O000O0O0O0[329] + o0O000O0O0O0[330];
            lArray[6] = l2 = -2138617481389199200L;
            long l8 = lArray[6];
            int n11 = -(o0O000O0O0O0[341] ^ o0O000O0O0O0[342]);
            lArray[6] = l2 = l8 ^ ((long)((int)(lArray[0] >>> -((o0O000O0O0O0[331] ^ o0O000O0O0O0[332]) * o0O000O0O0O0[333] * o0O000O0O0O0[334])) << (o0O000O0O0O0[335] + o0O000O0O0O0[336]) * o0O000O0O0O0[337] * o0O000O0O0O0[338] | (int)lArray[15]) << -(o0O000O0O0O0[339] ^ o0O000O0O0O0[340]) ^ l8) & -1L << (n11 << o0O000O0O0O0[343] | n11 >>> o0O000O0O0O0[344]);
            int n12 = o0O000O0O0O0[345];
            int n13 = n12 >>> o0O000O0O0O0[346] | n12 << o0O000O0O0O0[347];
            objectArray[19] = new char[(int)(lArray[6] >>> (n13 << o0O000O0O0O0[348] | n13 >>> o0O000O0O0O0[349]) + o0O000O0O0O0[350] - o0O000O0O0O0[351])];
            int n14 = -273331068;
            boolean bl2 = true;
            block11: while (true) {
                if (!bl2 || (bl2 = false) || !true) {
                    int n15 = o0O000O0O0O0[356] + o0O000O0O0O0[357];
                    if ((int)(lArray[16] >>> (n15 << o0O000O0O0O0[358] | n15 >>> o0O000O0O0O0[359])) >= (int)(lArray[6] >>> -(o0O000O0O0O0[360] * o0O000O0O0O0[361]))) break;
                    n14 = -171877477;
                }
                switch (n14) {
                    default: {
                        long l9 = lArray[16];
                        lArray[16] = l2 = l9 ^ (0L ^ l9) & -1L << (-o0O000O0O0O0[352] - o0O000O0O0O0[353] - o0O000O0O0O0[354]) * o0O000O0O0O0[355];
                        continue block11;
                    }
                    case -171877477: {
                        int n16 = o0O000O0O0O0[364] * o0O000O0O0O0[365] + o0O000O0O0O0[366];
                        ((char[])objectArray[19])[(int)(lArray[16] >>> r.o0O000O0O0O0[362] - r.o0O000O0O0O0[363])] = ((char[])objectArray[10])[(int)(lArray[15] >>> (n16 << o0O000O0O0O0[367] | n16 >>> o0O000O0O0O0[368])) + (int)(lArray[16] >>> (o0O000O0O0O0[369] ^ o0O000O0O0O0[370] ^ o0O000O0O0O0[371]))];
                        lArray[16] = l2 = lArray[16] + 0x100000000L;
                        continue block11;
                    }
                    case 742762573: 
                }
                break;
            }
            long l10 = lArray[0];
            int n17 = o0O000O0O0O0[372] ^ o0O000O0O0O0[373];
            lArray[0] = l2 = l10 ^ (l10 ^ l10 + (long)(n17 >>> o0O000O0O0O0[374] | n17 << o0O000O0O0O0[375])) & -1L >>> o0O000O0O0O0[376] * o0O000O0O0O0[377] * o0O000O0O0O0[378];
            r.oOo00Oo0OOo0[(int)lArray[0]] = new String((char[])objectArray[19]);
            int n18 = o0O000O0O0O0[379];
            int n19 = n18 >>> o0O000O0O0O0[380] | n18 << o0O000O0O0O0[381];
            long l11 = lArray[15];
            lArray[15] = l2 = l11 ^ ((long)((int)(lArray[15] >>> (n19 << o0O000O0O0O0[382] | n19 >>> o0O000O0O0O0[383])) + (int)(lArray[6] >>> o0O000O0O0O0[384] * o0O000O0O0O0[385] - o0O000O0O0O0[386])) << (o0O000O0O0O0[387] ^ o0O000O0O0O0[388] ^ o0O000O0O0O0[389] ^ o0O000O0O0O0[390]) ^ l11) & -1L << (o0O000O0O0O0[391] * o0O000O0O0O0[392] * o0O000O0O0O0[393] ^ o0O000O0O0O0[394]);
        }
        int n20 = 1362208305;
        block12: while (true) {
            switch (n20) {
                default: {
                    cZz = LogManager.getLogger();
                    int n21 = (o0O000O0O0O0[395] + o0O000O0O0O0[396]) * o0O000O0O0O0[397] + o0O000O0O0O0[398];
                    cZA = MarkerManager.getMarker((String)((String)oOo00Oo0OOo0[n21 >>> o0O000O0O0O0[399] | n21 << 31]));
                    cZB = MarkerManager.getMarker((String)((String)oOo00Oo0OOo0[(6 ^ 0x17) - -17]), (Marker)cZA);
                    n20 = 643874459;
                    continue block12;
                }
                case 643874459: {
                    cZC = AttributeKey.valueOf((String)((String)oOo00Oo0OOo0[(753664 >>> 15 | 753664 << 17) + -5]));
                    cZD = new s();
                    cZE = new t();
                    cZF = new u();
                    n20 = 1799458575;
                    continue block12;
                }
                case 1799458575: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public r(f f2) {
        int n2 = -746984363;
        if (n2 != n2) {
            n2 = 99;
        }
        this.cZH = Queues.newConcurrentLinkedQueue();
        this.cZI = new ReentrantReadWriteLock();
        this.cZG = f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ r a(InetAddress inetAddress, int n2, boolean bl2) {
        y y2;
        int n3 = 358088684;
        if (n3 != n3) {
        }
        Object[] objectArray = new Object[4];
        int n4 = -1115643403;
        r r2 = new r(f.cYR);
        if (Epoll.isAvailable() && bl2) {
            objectArray[0] = EpollSocketChannel.class;
            objectArray[1] = cZE;
        } else {
            objectArray[0] = NioSocketChannel.class;
            objectArray[1] = cZD;
        }
        y2(r2);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)((bo)objectArray[1]).wD())).handler((ChannelHandler)y2)).channel((Class)objectArray[0])).connect(inetAddress, n2).syncUninterruptibly();
        return r2;
    }

    public static String o0Oo000O0oO(int var0, String var1_1) {
        /* ANDROID/VANILLA PORT NOTE: original CFR body (GOTO-mangled) replaced by
           nl.StringDecryptor; identical algorithm, pure Java. */
        return nl.StringDecryptor.decrypt(var0, var1_1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* bridge */ strictfp /* synthetic */ r a(SocketAddress socketAddress) {
        int n2 = -145981374;
        if (n2 != n2) {
            n2 = -938712597;
        }
        r r2 = new r(f.cYR);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)cZF.wD())).handler((ChannelHandler)new z(r2))).channel(LocalChannel.class)).connect(socketAddress).syncUninterruptibly();
        return r2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ r a(InetAddress inetAddress, int n2, boolean bl2, int n3) {
        r r2;
        int n4 = 1524489404;
        if (n4 != n4) {
        }
        Object[] objectArray = new Object[4];
        int n5 = -22639116;
        r2(f.cYR);
        r r3 = r2;
        if (Epoll.isAvailable() && bl2) {
            objectArray[2] = EpollSocketChannel.class;
            objectArray[0] = cZE;
        } else {
            objectArray[2] = NioSocketChannel.class;
            objectArray[0] = cZD;
        }
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)((bo)objectArray[0]).wD())).handler((ChannelHandler)new x(n3, r3))).channel((Class)objectArray[2])).connect(inetAddress, n2).syncUninterruptibly();
        return r3;
    }
}

