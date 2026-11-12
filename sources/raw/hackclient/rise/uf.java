/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.aih;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.be;
import hackclient.rise.bt;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.tr;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.init.Items;
import net.minecraft.inventory.b;
import net.minecraft.item.af;
import net.minecraft.item.ai;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.cq;
import net.minecraft.item.d;
import net.minecraft.item.y;
import rip.vantage.commons.util.time.a;

@gl(aliases={"module.player.stealer.name", "Stealer"}, description="module.player.stealer.description", category=gj.PLAYER)
public class uf
extends gi {
    private final akj ahQ = new akj("Delay", this, (Number)100, (Number)150, (Number)0, (Number)500, (Number)50);
    private final akj ahR = new akj("First Item Delay", this, (Number)0, (Number)0, (Number)0, (Number)500, (Number)50);
    private final aki ahS = new aki("Ignore Trash", (gi)this, (Boolean)true);
    private final aki ahT = new aki("Respect Manager Rules", (gi)this, (Boolean)true);
    private final aki ahU = new aki("Gui Detection", (gi)this, (Boolean)true);
    private final a ahV = new a();
    private long aee;
    private int ahW;
    private int ahX;
    private int ahY;
    private boolean fY;
    private boolean ahZ;
    @dm
    public final dk<ei> aia = ei2 -> {
        if (uf.aER.bgR instanceof h) {
            int n2;
            ++this.ahY;
            this.fY = false;
            net.minecraft.inventory.h h2 = (net.minecraft.inventory.h)uf.aER.bgK.cHY;
            if (this.ahY == 1 && !this.ahZ) {
                n2 = ((Number)this.ahR.wD()).intValue();
                int n3 = this.ahR.wP().intValue();
                if (n2 > 0 || n3 > 0) {
                    this.aee = Math.round(ahj.l(n2, n3));
                    this.ahV.aX();
                    this.ahZ = true;
                    return;
                }
                this.ahZ = true;
            }
            if (((Boolean)this.ahU.wD()).booleanValue() && be.aY() || !this.ahV.T(this.aee)) {
                return;
            }
            ++this.ahX;
            for (n2 = 0; n2 < h2.cSK.size(); ++n2) {
                co co2 = h2.adf().fi(n2);
                if (co2 == null || this.ahX <= 1 || ((Boolean)this.ahS.wD()).booleanValue() && !aih.v(co2) || ((Boolean)this.ahT.wD()).booleanValue() && this.s(co2)) continue;
                this.aee = Math.round(ahj.l(((Number)this.ahQ.wD()).intValue(), this.ahQ.wP().intValue()));
                uf.aER.bgu.a(h2.cSL, n2, 0, 1, uf.aER.bgK);
                this.ahV.aX();
                this.ahW = 0;
                if (this.aee <= 0L) continue;
                return;
            }
            ++this.ahW;
            if (this.ahW > 1 && (double)this.ahY > 2.0 + 2.0 * Math.random()) {
                uf.aER.bgK.Dq();
                this.fY = true;
            }
        } else {
            this.ahW = 0;
            this.ahY = 0;
            this.ahX = 0;
            this.ahZ = false;
        }
    };

    public boolean kM() {
        return this.fY;
    }

    private boolean s(co co2) {
        int n2;
        if (co2 == null || co2.bP() == null) {
            return true;
        }
        d d3 = co2.bP();
        tr tr2 = this.e(tr.class);
        b b2 = uf.aER.bgK.cHX;
        if (tr2 != null && bt.a(co2, true) && tr2.ke()) {
            return true;
        }
        if (!aih.v(co2)) {
            return true;
        }
        if (d3 instanceof cp) {
            return !aih.b(co2, b2);
        }
        if (d3 instanceof cq) {
            return !aih.b(co2, b2, aih.d((cq)d3));
        }
        if (d3 instanceof ai) {
            return !aih.c(co2, b2);
        }
        if (d3 instanceof y) {
            return !aih.a(co2, b2, ((y)d3).cVH);
        }
        if (d3 instanceof net.minecraft.item.be) {
            return this.a((d d2) -> d2 instanceof net.minecraft.item.be) >= 1;
        }
        int n3 = tr2 != null ? tr2.ka() : 128;
        int n4 = tr2 != null ? tr2.kb() : 1;
        int n5 = tr2 != null ? tr2.kc() : 16;
        int n6 = tr2 != null ? tr2.kd() : 16;
        int n7 = n2 = tr2 != null ? tr2.jZ() : 512;
        if (d3 == Items.cPk) {
            return this.a(Items.cPk) + co2.cWZ > n3;
        }
        if (d3 == Items.cRy) {
            return this.a(Items.cRy) + co2.cWZ > n6;
        }
        if (d3 == Items.cQA || d3 == Items.cQB || d3 == Items.cQC || d3 == Items.cQK) {
            int n8 = this.a(Items.cQA) + this.a(Items.cQB) + this.a(Items.cQC) + this.a(Items.cQK) + co2.cWZ;
            return n8 > n4;
        }
        if (d3 == Items.cQH || d3 == Items.cQT) {
            int n9 = this.a(Items.cQH) + this.a(Items.cQT) + co2.cWZ;
            return n9 > n5;
        }
        if (d3 instanceof af) {
            int n10 = this.a((d d2) -> d2 instanceof af) + co2.cWZ;
            return n10 > n2;
        }
        return false;
    }

    private int a(d d2) {
        int n2 = 0;
        for (int i2 = 0; i2 <= 39; ++i2) {
            co co2 = uf.aER.bgK.cHV.fi(i2);
            if (co2 == null || co2.bP() != d2) continue;
            n2 += co2.cWZ;
        }
        return n2;
    }

    private int a(Predicate<d> predicate) {
        int n2 = 0;
        for (int i2 = 0; i2 <= 39; ++i2) {
            co co2 = uf.aER.bgK.cHV.fi(i2);
            if (co2 == null || !predicate.test(co2.bP())) continue;
            n2 += co2.cWZ;
        }
        return n2;
    }

    @Generated
    public int kN() {
        return this.ahY;
    }
}

