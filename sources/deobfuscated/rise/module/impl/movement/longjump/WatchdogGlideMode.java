/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.aii;
import hackclient.rise.es;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.j;
import net.minecraft.network.aj;
import net.minecraft.potion.a;
import net.minecraft.util.b;
import net.minecraft.world.w;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class WatchdogGlideMode
extends Mode<LongJump> {
    @EventLink(cH=3)
    public /* synthetic */ Listener<PreMotionEvent> Mc;
    public /* synthetic */ List<aj<?>> LY;
    private static /* synthetic */ int[] 0OOOoo00o0;
    public /* synthetic */ int hV;
    @EventLink
    public /* synthetic */ Listener<es> Me;
    public /* synthetic */ int Ma;
    @EventLink
    public /* synthetic */ Listener<JumpEvent> Mf;
    public /* synthetic */ boolean Eo;
    @EventLink
    public /* synthetic */ Listener<StrafeEvent> Md;
    public /* synthetic */ boolean LZ;
    public /* synthetic */ double Mb;
    public /* synthetic */ double LL;
    public /* synthetic */ int ug;
    private static /* synthetic */ int Oo0o00000O00;
    private static /* synthetic */ boolean oO00O0OO0ooO;

    static {
        int n2 = 220659357;
        if (n2 != n2) {
            n2 = 67;
        }
        WatchdogGlideMode.o0Oo000O0oO();
        int n3 = 525628942;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void o0Oo000O0oO() {
        int n2 = 1251465537;
        if (n2 != n2) {
            Oo0o00000O00 = n2 = 561295534;
        }
        0OOOoo00o0 = new int[0x186D ^ 0x1855];
        WatchdogGlideMode.0OOOoo00o0[0x48D1 ^ 0x48CC] = 0x94E5516D ^ 0x48CC;
        WatchdogGlideMode.0OOOoo00o0[0x420A ^ 0x4238] = 0xFFFFBD97 ^ 0x4238;
        WatchdogGlideMode.0OOOoo00o0[0xFC1E ^ 0xFC0F] = 0xFC08 ^ 0xFC0F;
        int n3 = 1752917778;
        block17: while (true) {
            switch (n3) {
                case 1087041642: {
                    WatchdogGlideMode.0OOOoo00o0[0x6F4E ^ 0x6F5A] = 0xFFFF90D5 ^ 0x6F5A;
                    WatchdogGlideMode.0OOOoo00o0[0x3EE7 ^ 0x3EC0] = 0xFFFFC13F ^ 0x3EC0;
                    WatchdogGlideMode.0OOOoo00o0[0x10BAE ^ 0x10B9D] = 0xFFFEF462 ^ 0x10B9D;
                    WatchdogGlideMode.0OOOoo00o0[0x6646 ^ 0x6670] = 0xFFFF998F ^ 0x6670;
                    WatchdogGlideMode.0OOOoo00o0[0x2F89 ^ 0x2F82] = 0x2F81 ^ 0x2F82;
                    WatchdogGlideMode.0OOOoo00o0[0x779C ^ 0x77BC] = 0x77AF ^ 0x77BC;
                    n3 = 1616242468;
                    continue block17;
                }
                case 1616242468: {
                    WatchdogGlideMode.0OOOoo00o0[0x8D3B ^ 0x8D1F] = 0xFFFF72E0 ^ 0x8D1F;
                    WatchdogGlideMode.0OOOoo00o0[0x3296 ^ 0x328C] = 0xFFFFCD7F ^ 0x328C;
                    n3 = -366060807;
                    continue block17;
                }
                case -366060807: {
                    WatchdogGlideMode.0OOOoo00o0[0xB0A ^ 0xB0D] = 0xFFFFF4CB ^ 0xB0D;
                    n3 = 2011129338;
                    continue block17;
                }
                case 2011129338: {
                    WatchdogGlideMode.0OOOoo00o0[0x6799 ^ 0x67A9] = 0x67AA ^ 0x67A9;
                    WatchdogGlideMode.0OOOoo00o0[0x2987 ^ 0x2987] = 0xFF802987 ^ 0x2987;
                    n3 = -1428960358;
                    continue block17;
                }
                case -1428960358: {
                    WatchdogGlideMode.0OOOoo00o0[0x7E11 ^ 0x7E37] = 0x7E46 ^ 0x7E37;
                    WatchdogGlideMode.0OOOoo00o0[0xBB98 ^ 0xBB91] = 0x6000BB9F ^ 0xBB91;
                    n3 = 1662708338;
                    continue block17;
                }
                case 1662708338: {
                    WatchdogGlideMode.0OOOoo00o0[0x2DA7 ^ 0x2DAA] = 0x2DA5 ^ 0x2DAA;
                    WatchdogGlideMode.0OOOoo00o0[0xE4A1 ^ 0xE490] = 0xE48D ^ 0xE490;
                    WatchdogGlideMode.0OOOoo00o0[0x5B58 ^ 0x5B4D] = 0xF83FA4B2 ^ 0x5B4D;
                    WatchdogGlideMode.0OOOoo00o0[0x3963 ^ 0x3941] = 0xFFFFC6FC ^ 0x3941;
                    WatchdogGlideMode.0OOOoo00o0[0xE82E ^ 0xE807] = 0xE80C ^ 0xE807;
                    WatchdogGlideMode.0OOOoo00o0[0x77D0 ^ 0x77DF] = 0x260077DF ^ 0x77DF;
                    WatchdogGlideMode.0OOOoo00o0[0x352 ^ 0x37E] = 0x369 ^ 0x37E;
                    WatchdogGlideMode.0OOOoo00o0[0x7920 ^ 0x7939] = 0xFFFF86C6 ^ 0x7939;
                    WatchdogGlideMode.0OOOoo00o0[0xA9D4 ^ 0xA9C3] = 0xA9C8 ^ 0xA9C3;
                    n3 = -1951696208;
                    continue block17;
                }
                case -1951696208: {
                    WatchdogGlideMode.0OOOoo00o0[0xAEEB ^ 0xAEC1] = 0xFFFF753E ^ 0xAEC1;
                    WatchdogGlideMode.0OOOoo00o0[0x509E ^ 0x5082] = 0xFFFFAF7D ^ 0x5082;
                    n3 = 630404532;
                    continue block17;
                }
                case 630404532: {
                    return;
                }
                default: {
                    WatchdogGlideMode.0OOOoo00o0[0x2BA ^ 0x294] = 0x287 ^ 0x294;
                    n3 = 1741916955;
                    continue block17;
                }
                case 1741916955: {
                    WatchdogGlideMode.0OOOoo00o0[0x58BD ^ 0x5896] = 0xFFFFA769 ^ 0x5896;
                    WatchdogGlideMode.0OOOoo00o0[0xD241 ^ 0xD264] = 0xFFBF2DEA ^ 0xD264;
                    WatchdogGlideMode.0OOOoo00o0[0x3D63 ^ 0x3D6B] = 0x3D52 ^ 0x3D6B;
                    WatchdogGlideMode.0OOOoo00o0[0xA196 ^ 0xA180] = 0xA195 ^ 0xA180;
                    n3 = -637751569;
                    continue block17;
                }
                case -637751569: {
                    WatchdogGlideMode.0OOOoo00o0[0xC79D ^ 0xC786] = 0xFFFF3879 ^ 0xC786;
                    WatchdogGlideMode.0OOOoo00o0[0xCCE9 ^ 0xCCF1] = 0xCCCE ^ 0xCCF1;
                    WatchdogGlideMode.0OOOoo00o0[0x1E44 ^ 0x1E5A] = 0x40A560EF ^ 0x1E5A;
                    n3 = -466021351;
                    continue block17;
                }
                case -466021351: {
                    WatchdogGlideMode.0OOOoo00o0[0x1DFD ^ 0x1DEE] = 0xFFFFE211 ^ 0x1DEE;
                    n3 = 124646284;
                    continue block17;
                }
                case 124646284: {
                    WatchdogGlideMode.0OOOoo00o0[0xC748 ^ 0xC77F] = 0xFFFF3880 ^ 0xC77F;
                    WatchdogGlideMode.0OOOoo00o0[0xE7 ^ 0xD2] = 0xD1 ^ 0xD2;
                    WatchdogGlideMode.0OOOoo00o0[0xC1C1 ^ 0xC1C3] = 0xC1D8 ^ 0xC1C3;
                    WatchdogGlideMode.0OOOoo00o0[0x580D ^ 0x580C] = 0x5809 ^ 0x580C;
                    WatchdogGlideMode.0OOOoo00o0[0x1A38 ^ 0x1A1B] = 0x1A10 ^ 0x1A1B;
                    WatchdogGlideMode.0OOOoo00o0[0x3751 ^ 0x377C] = 0x3775 ^ 0x377C;
                    WatchdogGlideMode.0OOOoo00o0[0xD195 ^ 0xD19F] = 0xD182 ^ 0xD19F;
                    WatchdogGlideMode.0OOOoo00o0[0x9BF9 ^ 0x9BFF] = 0x9BEA ^ 0x9BFF;
                    WatchdogGlideMode.0OOOoo00o0[0x478A ^ 0x47A5] = 0x8194CCB2 ^ 0x47A5;
                    WatchdogGlideMode.0OOOoo00o0[0x45D6 ^ 0x45C9] = 0x45C4 ^ 0x45C9;
                    WatchdogGlideMode.0OOOoo00o0[0xB628 ^ 0xB62D] = 0xB626 ^ 0xB62D;
                    n3 = -278476214;
                    continue block17;
                }
                case -278476214: {
                    WatchdogGlideMode.0OOOoo00o0[0xDC6A ^ 0xDC78] = 0xDC61 ^ 0xDC78;
                    WatchdogGlideMode.0OOOoo00o0[0x1B19 ^ 0x1B2D] = 0x1B30 ^ 0x1B2D;
                    n3 = -988833558;
                    continue block17;
                }
                case -988833558: {
                    WatchdogGlideMode.0OOOoo00o0[0x8AC ^ 0x88D] = 0x8D6 ^ 0x88D;
                    WatchdogGlideMode.0OOOoo00o0[0x7376 ^ 0x7375] = 0x736C ^ 0x7375;
                    WatchdogGlideMode.0OOOoo00o0[0x3CA9 ^ 0x3CAD] = 0x3CAA ^ 0x3CAD;
                    n3 = 1754664659;
                    continue block17;
                }
                case 1754664659: 
            }
            WatchdogGlideMode.0OOOoo00o0[0x94D ^ 0x941] = 0xFFFFF6CE ^ 0x941;
            WatchdogGlideMode.0OOOoo00o0[0x3726 ^ 0x3728] = 0x11112639 ^ 0x3728;
            WatchdogGlideMode.0OOOoo00o0[0x7641 ^ 0x7669] = 0x767C ^ 0x7669;
            WatchdogGlideMode.0OOOoo00o0[0xC353 ^ 0xC343] = 0xC328 ^ 0xC343;
            n3 = 1087041642;
        }
    }

    public WatchdogGlideMode(String string, LongJump longJump) {
        int n2 = -1112930854;
        if (n2 != n2) {
            throw new ArithmeticException();
        }
        super(string, longJump);
        this.LY = new ArrayList();
        this.Mc = preMotionEvent -> {
            int n2 = 1930241879;
            if (n2 != n2) {
            }
            if (WatchdogGlideMode.aER.bgK.aO) {
                // empty if block
            }
            int n3 = -1900452492;
            block4: while (true) {
                switch (n3) {
                    default: {
                        int n4 = 0OOOoo00o0[42] ^ 0OOOoo00o0[43];
                        this.hV += (n4 << 0OOOoo00o0[44] | n4 >>> 0OOOoo00o0[45]) ^ 0OOOoo00o0[46];
                        int n5 = 0OOOoo00o0[47];
                        if (this.hV <= -((n5 >>> 0OOOoo00o0[48] | n5 << 0OOOoo00o0[49]) * 0OOOoo00o0[50])) break block4;
                        n3 = -147660777;
                        continue block4;
                    }
                    case -147660777: {
                        n3 = 1839743489;
                        continue block4;
                    }
                    case 1839743489: {
                        int n6 = 0OOOoo00o0[51];
                        this.hV = (n6 >>> 0OOOoo00o0[52] | n6 << 0OOOoo00o0[53]) ^ 0OOOoo00o0[54] ^ 0OOOoo00o0[55];
                    }
                }
                break;
            }
        };
        this.Md = WatchdogGlideMode::b;
        this.Me = es2 -> {
            int n2 = -829769902;
            if (n2 != n2) {
                int cfr_ignored_0 = 0x1D & 1;
            }
            Object[] objectArray = new Object[6];
            objectArray[2] = es2.df();
            int n3 = -2078580294;
            objectArray[1] = es2.dg();
            objectArray[3] = WatchdogGlideMode.aER.bgF;
            objectArray[0] = ((j)objectArray[3]).L((b)objectArray[1]);
            objectArray[4] = ((Block)objectArray[2]).a((w)((j)objectArray[3]), (b)objectArray[1], (IBlockState)objectArray[0]);
        };
        this.Mf = jumpEvent -> jumpEvent.setJumpMotion(0.42f);
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ void b(StrafeEvent var0) {
        block37: {
            block35: {
                block38: {
                    block40: {
                        block36: {
                            block39: {
                                var9_1 = 1467590893;
                                if (var9_1 == var9_1) break block39;
                                var9_1 = -1300618453;
                                break block39;
lbl5:
                                // 1 sources

                                while (true) {
                                    v0 = WatchdogGlideMode.0OOOoo00o0[15] * WatchdogGlideMode.0OOOoo00o0[16];
                                    if (WatchdogGlideMode.aER.bgK.b((a)a.dgw).dhk + -WatchdogGlideMode.0OOOoo00o0[13] * WatchdogGlideMode.0OOOoo00o0[14] == ((v0 << WatchdogGlideMode.0OOOoo00o0[17] | v0 >>> WatchdogGlideMode.0OOOoo00o0[18]) ^ WatchdogGlideMode.0OOOoo00o0[19] ^ WatchdogGlideMode.0OOOoo00o0[20])) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            aii.strafe(Double.longBitsToDouble(7633296104004596099L ^ 6212561498796501017L));
                                            var3_2 = -1865437852;
                                            break block35;
                                            break;
                                        }
                                    }
                                    while (true) {
                                        aii.strafe(Double.longBitsToDouble(6000911920717139432L ^ 7823486070127528183L));
lbl14:
                                        // 3 sources

                                        while (true) {
                                            WatchdogGlideMode.aER.bgK.jump();
                                            while (true) {
                                                aii.useDiagonalSpeed();
                                                break block36;
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            if ((var9_1 = -553529840) != var9_1) {
                                8 & 1;
                            }
                            if ((var9_1 = -827374665) != var9_1) break block40;
lbl24:
                            // 2 sources

                            while ((var9_1 = -1004515400) != var9_1) {
                                20 + 63;
                                break block37;
                            }
                            break block37;
                        }
                        if (!(WatchdogGlideMode.aER.bgK.ue <= 0.0)) ** GOTO lbl35
                        var3_2 = 994911526;
                        break block35;
lbl33:
                        // 1 sources

                        while (true) {
                            WatchdogGlideMode.aER.bgK.ue += Double.longBitsToDouble(4020611815409436398L ^ 599262181269478504L);
lbl35:
                            // 2 sources

                            if (!(WatchdogGlideMode.aER.bgK.ue < 0.0)) break block38;
                            break;
                        }
                    }
                    WatchdogGlideMode.Oo0o00000O00 = var9_1 = 315257586;
                    ** GOTO lbl24
                }
                v1 = WatchdogGlideMode.0OOOoo00o0[21];
                if (WatchdogGlideMode.aER.bgK.tR == ((v1 >>> WatchdogGlideMode.0OOOoo00o0[22] | v1 << WatchdogGlideMode.0OOOoo00o0[23]) ^ WatchdogGlideMode.0OOOoo00o0[24] ^ WatchdogGlideMode.0OOOoo00o0[25])) {
                    // empty if block
                }
                if (WatchdogGlideMode.aER.bgK.tR != (-(WatchdogGlideMode.0OOOoo00o0[26] ^ WatchdogGlideMode.0OOOoo00o0[27]) ^ WatchdogGlideMode.0OOOoo00o0[28])) ** GOTO lbl48
                var3_2 = -1595992690;
                break block35;
lbl46:
                // 1 sources

                while (true) {
                    WatchdogGlideMode.aER.bgK.ue += Double.longBitsToDouble(-1424582791313083524L ^ -3202629931915231183L);
lbl48:
                    // 3 sources

                    while (true) {
                        var3_2 = -1118291218;
                        break block35;
                        break;
                    }
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var3_2 = -912072649;
                    break block35;
                    break;
                }
lbl54:
                // 1 sources

                while (true) {
                    v2 = WatchdogGlideMode.0OOOoo00o0[29] * WatchdogGlideMode.0OOOoo00o0[30];
                    if (WatchdogGlideMode.aER.bgK.tR == (v2 << WatchdogGlideMode.0OOOoo00o0[31] | v2 >>> WatchdogGlideMode.0OOOoo00o0[32]) * WatchdogGlideMode.0OOOoo00o0[33] - WatchdogGlideMode.0OOOoo00o0[34]) {
                        WatchdogGlideMode.aER.bgK.ue += Double.longBitsToDouble(-3709776899951524353L ^ -922360630336391502L);
                    }
                    if (WatchdogGlideMode.aER.bgK.tR >= (-WatchdogGlideMode.0OOOoo00o0[35] ^ WatchdogGlideMode.0OOOoo00o0[36])) {
                        v3 = WatchdogGlideMode.0OOOoo00o0[37] ^ WatchdogGlideMode.0OOOoo00o0[38] ^ WatchdogGlideMode.0OOOoo00o0[39];
                        if (WatchdogGlideMode.aER.bgK.tR % (v3 >>> WatchdogGlideMode.0OOOoo00o0[40] | v3 << WatchdogGlideMode.0OOOoo00o0[41]) == 0) {
                            // empty if block
                        }
                    }
lbl62:
                    // 6 sources

                    return;
                }
            }
            block24: while (true) {
                switch (var3_2) {
                    case -1969896065: {
                        ** continue;
                    }
                    case -1865437852: {
                        ** GOTO lbl14
                    }
                    case 994911526: {
                        ** continue;
                    }
                    case -1595992690: {
                        ** continue;
                    }
                    case 1613856028: {
                        ** continue;
                    }
                    case -1118291218: {
                        ** continue;
                    }
                    case -912072649: {
                        ** continue;
                    }
                    case 851150121: {
                        ** continue;
                    }
lbl83:
                    // 2 sources

                    while (true) {
                        var5_3 = new long[3];
                        var5_3[2] = var6_4 = Double.doubleToRawLongBits(Double.longBitsToDouble(366947668257385382L ^ 4225673629289978005L));
                        if (WatchdogGlideMode.aER.bgK.aO) {
                            aii.strafe(aii.getAllowedHorizontalDistance() - Double.longBitsToDouble(-1920785653500162089L ^ -2736044722605431253L));
                            WatchdogGlideMode.aER.bgK.jump();
                        }
                        v4 = -WatchdogGlideMode.0OOOoo00o0[0];
                        v5 = v4 << WatchdogGlideMode.0OOOoo00o0[1] | v4 >>> WatchdogGlideMode.0OOOoo00o0[2];
                        v6 = v5 << WatchdogGlideMode.0OOOoo00o0[3] | v5 >>> WatchdogGlideMode.0OOOoo00o0[4];
                        if (WatchdogGlideMode.aER.bgK.tR != (v6 << WatchdogGlideMode.0OOOoo00o0[5] | v6 >>> WatchdogGlideMode.0OOOoo00o0[6])) ** continue;
                        if (WatchdogGlideMode.aER.bgK.a(a.dgw)) {
                            var3_2 = 916957961;
                            continue block24;
                        }
                        ** GOTO lbl102
                        break;
                    }
                    default: {
                        v7 = WatchdogGlideMode.0OOOoo00o0[9];
                        if (WatchdogGlideMode.aER.bgK.b((a)a.dgw).dhk + -(WatchdogGlideMode.0OOOoo00o0[7] ^ WatchdogGlideMode.0OOOoo00o0[8]) >= (v7 >>> WatchdogGlideMode.0OOOoo00o0[10] | v7 << WatchdogGlideMode.0OOOoo00o0[11]) + WatchdogGlideMode.0OOOoo00o0[12]) {
                            aii.strafe(Double.longBitsToDouble(754059474263919804L ^ 3866425257443316228L));
                            ** continue;
                        }
lbl102:
                        // 3 sources

                        if (!WatchdogGlideMode.aER.bgK.a(a.dgw)) ** continue;
                        var3_2 = 1133567330;
                        continue block24;
                    }
                    case 1133567330: {
                        var3_2 = -1100894846;
                        continue block24;
                    }
                    case -1100894846: 
                }
                break;
            }
            ** while (true)
        }
        if ((var9_1 = 9285959) == var9_1) ** GOTO lbl83
        var9_1 = 209315760;
        ** while (true)
    }
}

