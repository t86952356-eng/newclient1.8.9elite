/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahd;
import hackclient.rise.zg;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.ChatInputEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.util.InstanceAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class wm
implements ahd,
InstanceAccess {
    @EventLink
    public /* synthetic */ Listener<PreMotionEvent> awg;
    public /* synthetic */ String awd;
    public /* synthetic */ a awc;
    public /* synthetic */ List<zg> avZ;
    public static /* synthetic */ boolean avX;
    public /* synthetic */ Set<String> awb;
    public static /* synthetic */ long avY;
    private static /* synthetic */ int[] q0OOOoo00o0;
    public /* synthetic */ boolean awf;
    @EventLink
    public /* synthetic */ Listener<PacketSendEvent> awi;
    public /* synthetic */ List<zg> awa;
    @EventLink
    public /* synthetic */ Listener<ChatInputEvent> awh;
    public /* synthetic */ long awe;
    private static /* synthetic */ int Oo0o00000O00;
    private static /* synthetic */ boolean oO00O0OO0ooO;

    /*
     * Enabled aggressive block sorting
     */
    public wm() {
        int n2 = -2136404096;
        if (n2 != n2) {
        }
        this.avZ = new ArrayList<zg>();
        this.awa = new ArrayList<zg>();
        this.awb = ConcurrentHashMap.newKeySet();
        this.awc = new a();
        this.awd = "";
        this.awg = this::f;
        this.awh = chatInputEvent -> {
            int n2 = -98001239;
            if (n2 != n2) {
                throw null;
            }
            if (!this.nX()) {
                return;
            }
            this.au(chatInputEvent.getMessage());
        };
        this.awi = this::h;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n2 = 1014536205;
        if (n2 != n2) {
            throw new InterruptedException();
        }
        wm.o0Oo000O0oO();
        avY = 750L;
        int n3 = q0OOOoo00o0[48];
        avX = (n3 << q0OOOoo00o0[49] | n3 >>> q0OOOoo00o0[50]) ^ q0OOOoo00o0[51];
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void o0Oo000O0oO() {
        int n2 = 2049559463;
        if (n2 != n2) {
            int cfr_ignored_0 = 0x59 & 1;
        }
        int n3 = -1252427067;
        block12: while (true) {
            switch (n3) {
                case -1366816210: {
                    wm.q0OOOoo00o0[0x81AD ^ 0x81B2] = 0x81A1 ^ 0x81B2;
                    wm.q0OOOoo00o0[0xA60A ^ 0xA61B] = 0xA618 ^ 0xA61B;
                    wm.q0OOOoo00o0[0xF7E5 ^ 0xF7D5] = 0xFFFF082A ^ 0xF7D5;
                    wm.q0OOOoo00o0[0x3E3B ^ 0x3E13] = 0xFFFFC1C6 ^ 0x3E13;
                    n3 = 643081293;
                    continue block12;
                }
                case 643081293: {
                    wm.q0OOOoo00o0[0xC356 ^ 0xC350] = 0xFFFF3CFB ^ 0xC350;
                    wm.q0OOOoo00o0[0xA227 ^ 0xA239] = 0xA217 ^ 0xA239;
                    wm.q0OOOoo00o0[0xE33F ^ 0xE31F] = 0xE302 ^ 0xE31F;
                    wm.q0OOOoo00o0[0xDCF ^ 0xDCA] = 0xDCB ^ 0xDCA;
                    wm.q0OOOoo00o0[0x15E4 ^ 0x15CA] = 0xFFFFEA3B ^ 0x15CA;
                    n3 = -402538343;
                    continue block12;
                }
                case -402538343: {
                    wm.q0OOOoo00o0[0xCE9D ^ 0xCE90] = 0xFFFF310D ^ 0xCE90;
                    wm.q0OOOoo00o0[0x4426 ^ 0x4404] = 0xB823AA0D ^ 0x4404;
                    wm.q0OOOoo00o0[0x6B4D ^ 0x6B6A] = 0x6B09 ^ 0x6B6A;
                    wm.q0OOOoo00o0[0xD194 ^ 0xD1BB] = 0xD1E0 ^ 0xD1BB;
                    wm.q0OOOoo00o0[0x8046 ^ 0x8041] = 0x12008041 ^ 0x8041;
                    wm.q0OOOoo00o0[0xBDE7 ^ 0xBDCA] = 0x1111ACDF ^ 0xBDCA;
                    n3 = -458666838;
                    continue block12;
                }
                case -458666838: {
                    wm.q0OOOoo00o0[0xA1F4 ^ 0xA1ED] = 0xA1E4 ^ 0xA1ED;
                    wm.q0OOOoo00o0[0xF691 ^ 0xF6B2] = 0xF6FB ^ 0xF6B2;
                    wm.q0OOOoo00o0[0x558F ^ 0x55AA] = 0x55C8 ^ 0x55AA;
                    wm.q0OOOoo00o0[0x1224 ^ 0x1202] = 0xFFFFEDFD ^ 0x1202;
                    wm.q0OOOoo00o0[0xD7A ^ 0xD69] = 0xD76 ^ 0xD69;
                    wm.q0OOOoo00o0[0xE347 ^ 0xE375] = 0xE368 ^ 0xE375;
                    wm.q0OOOoo00o0[0x18E6 ^ 0x18C2] = 0xFFFFE745 ^ 0x18C2;
                    wm.q0OOOoo00o0[0x100F4 ^ 0x100F4] = 0xFFFEAB74 ^ 0x100F4;
                    wm.q0OOOoo00o0[0xEF0F ^ 0xEF24] = 0xFFFF10BF ^ 0xEF24;
                    wm.q0OOOoo00o0[0x2CC3 ^ 0x2CCA] = 0x2CDD ^ 0x2CCA;
                    n3 = -2076846388;
                    continue block12;
                }
                case -2076846388: {
                    wm.q0OOOoo00o0[0x10892 ^ 0x1089D] = 0x109B9 ^ 0x1089D;
                    wm.q0OOOoo00o0[0x79B1 ^ 0x7982] = 0xFFFF867D ^ 0x7982;
                    wm.q0OOOoo00o0[0xAEE5 ^ 0xAEFD] = 0xAEEA ^ 0xAEFD;
                    wm.q0OOOoo00o0[0xF69D ^ 0xF68F] = 0xF68E ^ 0xF68F;
                    wm.q0OOOoo00o0[0x7939 ^ 0x7925] = 0x797A ^ 0x7925;
                    wm.q0OOOoo00o0[0xAD39 ^ 0xAD2E] = 0xAD45 ^ 0xAD2E;
                    wm.q0OOOoo00o0[0xF3C0 ^ 0xF3CE] = 0xEEEE1D21 ^ 0xF3CE;
                    n3 = -368060041;
                    continue block12;
                }
                case -368060041: {
                    wm.q0OOOoo00o0[0x9ECC ^ 0x9EC8] = 0x9ED7 ^ 0x9EC8;
                    wm.q0OOOoo00o0[0xCF8E ^ 0xCF9B] = 0xD236 ^ 0xCF9B;
                    wm.q0OOOoo00o0[0xBD70 ^ 0xBD41] = 0xBD42 ^ 0xBD41;
                    wm.q0OOOoo00o0[0x14AA ^ 0x1486] = 0x14F7 ^ 0x1486;
                    wm.q0OOOoo00o0[0x53BE ^ 0x53BC] = 0x53BB ^ 0x53BC;
                    wm.q0OOOoo00o0[0x1CC0 ^ 0x1CDB] = 0x1C9C ^ 0x1CDB;
                    wm.q0OOOoo00o0[0xB51B ^ 0xB532] = 0xFFFF4A8B ^ 0xB532;
                    wm.q0OOOoo00o0[0x9FED ^ 0x9FC7] = 0xFFFF6058 ^ 0x9FC7;
                    wm.q0OOOoo00o0[0x817C ^ 0x8170] = 0x813F ^ 0x8170;
                    wm.q0OOOoo00o0[0x15DE ^ 0x15D5] = 0xC9B2793F ^ 0x15D5;
                    wm.q0OOOoo00o0[0x436 ^ 0x42B] = 0x412 ^ 0x42B;
                    wm.q0OOOoo00o0[0xB6AD ^ 0xB6AC] = 0xFFFF492D ^ 0xB6AC;
                    n3 = 337418657;
                    continue block12;
                }
                case 337418657: {
                    wm.q0OOOoo00o0[0xB0E2 ^ 0xB0E8] = 0xB0CB ^ 0xB0E8;
                    wm.q0OOOoo00o0[0x93A3 ^ 0x93B7] = 0x93FE ^ 0x93B7;
                    wm.q0OOOoo00o0[0x87BB ^ 0x87B8] = 0x87A1 ^ 0x87B8;
                    wm.q0OOOoo00o0[0x53B4 ^ 0x53A4] = 0x53B9 ^ 0x53A4;
                    n3 = -629310749;
                    continue block12;
                }
                case -629310749: {
                    return;
                }
                default: {
                    q0OOOoo00o0 = new int[0xBB51 ^ 0xBB65];
                    wm.q0OOOoo00o0[0xE23D ^ 0xE22B] = 0xE3274B5C ^ 0xE22B;
                    n3 = -775747597;
                    continue block12;
                }
                case -775747597: {
                    wm.q0OOOoo00o0[0x3666 ^ 0x366E] = 0x3667 ^ 0x366E;
                    n3 = 532338679;
                    continue block12;
                }
                case 532338679: 
            }
            wm.q0OOOoo00o0[0x651 ^ 0x64B] = 0xC473606B ^ 0x64B;
            wm.q0OOOoo00o0[0xF6D6 ^ 0xF6F7] = 0xFFFF2D19 ^ 0xF6F7;
            n3 = -1366816210;
        }
    }
}

