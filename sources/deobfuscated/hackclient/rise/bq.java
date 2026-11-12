/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nl.hidden.Hidden0
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.er;
import hackclient.rise.fg;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import nl.Loader;
import nl.hidden.Hidden0;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bq
extends am {
    public /* synthetic */ IntBuffer fN;
    public /* synthetic */ String fH;
    public static /* synthetic */ Object[] 0OOOoo00o0;
    public static /* synthetic */ int fF;
    public /* synthetic */ int[] fO;
    public /* synthetic */ long fI;
    public /* synthetic */ int fJ;
    public /* synthetic */ List<byte[]> fL;
    public /* synthetic */ BufferedImage fP;
    public static /* synthetic */ String[] 0oOOoOo0O00O;
    public static /* synthetic */ Object oO00O0OO0ooO;
    public static /* synthetic */ Object[] Oo0o00000O00;
    public /* synthetic */ int fK;
    public static /* synthetic */ String o0Oo000O0oO;
    @EventLink
    public /* synthetic */ Listener<Render2DEvent> fS;
    public volatile /* synthetic */ boolean eF;
    public /* synthetic */ int fb;
    private static /* synthetic */ int[] ooo00oo0Ooo0;
    public static /* synthetic */ float fE;
    @EventLink
    public /* synthetic */ Listener<fg> fT;
    public /* synthetic */ String eZ;
    public static /* synthetic */ int fD;
    @EventLink
    public /* synthetic */ Listener<er> fR;
    public static /* synthetic */ int fC;
    public static /* synthetic */ int fB;
    public /* synthetic */ String fc;
    public /* synthetic */ long fa;
    public /* synthetic */ BufferedImage fQ;
    public static /* synthetic */ int fG;
    public static /* synthetic */ String[] O0OoOO0OOOOO;
    public /* synthetic */ List<Integer> fM;
    private static /* synthetic */ int o0o000o0O0o0;
    private static /* synthetic */ boolean oOo00Oo0OOo0;

    static {
        Loader.registerNativesForClass(3, bq.class);
        Hidden0.special_clinit_3_20(bq.class);
    }

    public static /* bridge */ native strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1);

    /*
     * Enabled aggressive block sorting
     */
    public bq() {
        int n2 = 1715163381;
        if (n2 != n2) {
        }
        this.fL = new ArrayList<byte[]>();
        this.fM = new ArrayList<Integer>();
        this.fR = this::b;
        this.fS = this::a;
        this.fT = this::b;
    }

    public static /* bridge */ native strictfp /* synthetic */ String h(String var0);

    private static native /* synthetic */ void 0OOOoo00o0();
}

