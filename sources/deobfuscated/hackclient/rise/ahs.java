/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aht;
import hackclient.rise.ahu;
import hackclient.rise.ahv;
import hackclient.rise.ahw;
import hackclient.rise.aip;
import hackclient.rise.ais;
import hackclient.rise.ait;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.db;
import org.lwjgl.opengl.GL11;
import rip.vantage.commons.util.time.a;
import rise.util.InstanceAccess;

public class ahs
extends ArrayList<ahu>
implements InstanceAccess {
    public static int aOf = 100;
    public ahv aOg;
    public ahv aOh;
    private final aht aOi;
    private final aht aOj;
    public ahu aOk;
    public db aOl;
    public int aOm;
    private final boolean aOn;

    public ahs(ahv ahv2, boolean bl2) {
        this.aOg = new ahv((int)ahs.aER.bgK.gW, (int)ahs.aER.bgK.gX, (int)ahs.aER.bgK.gY);
        this.aOi = new aht(aOf, this.aOg);
        this.aOj = new aht(aOf, this.aOg);
        this.aOm = Integer.MAX_VALUE;
        this.aOh = ahv2;
        this.aOn = bl2;
        this.aOl = new db(Math.abs(this.aOg.wt() - ahv2.wt()), Math.abs(this.aOg.wu() - ahv2.wu()), Math.abs(this.aOg.wx() - ahv2.wx()));
    }

    public ahs(ahv ahv2) {
        this.aOg = new ahv((int)ahs.aER.bgK.gW, (int)ahs.aER.bgK.gX, (int)ahs.aER.bgK.gY);
        this.aOi = new aht(aOf, this.aOg);
        this.aOj = new aht(aOf, this.aOg);
        this.aOm = Integer.MAX_VALUE;
        this.aOh = ahv2;
        this.aOn = false;
        this.aOl = new db(Math.abs(this.aOg.wt() - ahv2.wt()), Math.abs(this.aOg.wu() - ahv2.wu()), Math.abs(this.aOg.wx() - ahv2.wx()));
    }

    public void run() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(() -> {
            a a2 = new a();
            while (this.aOk == null && !a2.T(this.aOn ? 15000L : 50L)) {
                this.vc();
                if (this.size() == 0) break;
                if (!this.aOn) continue;
                aip.k(200L);
            }
            if (this.aOk == null) {
                afl.b("Failed to find path.", new Object[0]);
            } else {
                afl.b("Took " + a2.aKM() + " ms.", new Object[0]);
            }
        });
    }

    private void vc() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    private ahu a(ahu ahu2, int n2, int n3, int n4) {
        ahu ahu3 = new ahu(ahu2);
        ahv ahv2 = (ahv)ahu3.get(ahu3.size() - 1);
        if (this.aOi.b(ahv2 = new ahv(ahv2.D(n2, n3, n4)))) {
            return null;
        }
        ahu3.add(ahv2);
        this.aOi.a(ahv2);
        return ahu3;
    }

    public void cj() {
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GL11.glDepthMask((boolean)false);
        ait.e(ais.d(this.rP().rQ(), 100));
        double d2 = 0.6;
        for (ahu object : new ArrayList<ahu>(this)) {
            if (object == null) continue;
            for (ahv ahv2 : object) {
                ait.g(new net.minecraft.util.a((double)ahv2.wt() + (1.0 - d2), (double)ahv2.wu() + (1.0 - d2), (double)ahv2.wx() + (1.0 - d2), (double)ahv2.wt() + d2, (double)ahv2.wu() + d2, (double)ahv2.wx() + d2));
            }
        }
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GL11.glDepthMask((boolean)true);
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
        if (this.aOk != null) {
            Object object = null;
            for (Object object2 : this.aOk) {
                if (object != null) {
                    ait.a((double)((db)object).wt() + 0.5, (double)((db)object).wu() + 0.5, (double)((db)object).wx() + 0.5, (double)((db)object2).wt() + 0.5, (double)((db)object2).wu() + 0.5, (double)((db)object2).wx() + 0.5, Color.WHITE, 1.0f);
                }
                object = object2;
            }
        }
    }
}

