/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  lombok.Generated
 */
package hackclient.rise;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.aih;
import hackclient.rise.aik;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akq;
import hackclient.rise.bb;
import hackclient.rise.bt;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.en;
import hackclient.rise.eq;
import hackclient.rise.fi;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.lx;
import hackclient.rise.tn;
import hackclient.rise.tt;
import hackclient.rise.tu;
import hackclient.rise.tv;
import hackclient.rise.tw;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.l;
import net.minecraft.init.Items;
import net.minecraft.item.aa;
import net.minecraft.item.ac;
import net.minecraft.item.af;
import net.minecraft.item.ai;
import net.minecraft.item.be;
import net.minecraft.item.bg;
import net.minecraft.item.bw;
import net.minecraft.item.by;
import net.minecraft.item.cn;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.d;
import net.minecraft.item.y;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.z;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;

@gl(aliases={"module.player.manager.name", "Manager"}, description="module.player.manager.description", category=gj.PLAYER)
public class tr
extends gi {
    private final akj adu = new akj("Delay", this, (Number)100, (Number)150, (Number)0, (Number)500, (Number)50);
    private final aki adv = new aki("Legit", (gi)this, (Boolean)false);
    private final aki adw = new aki("Drop Custom Items", (gi)this, (Boolean)false);
    private final aki adx = new aki("Use Custom Items", (gi)this, (Boolean)false);
    private final aki ady = new aki("Prioritize Splash Potions", (gi)this, (Boolean)false);
    private final akq adz = new akq("Block Limit", this, (Number)512, (Number)0, (Number)512, (Number)4);
    private final akq adA = new akq("Arrow Limit", this, (Number)128, (Number)0, (Number)512, (Number)4);
    private final akq adB = new akq("Bucket Limit", this, (Number)1, (Number)0, (Number)4, (Number)1);
    private final akq adC = new akq("Snowball/Egg Limit", this, (Number)16, (Number)0, (Number)64, (Number)1);
    private final akq adD = new akq("Ender Pearl Limit", this, (Number)16, (Number)0, (Number)64, (Number)1);
    private final akq adE = new akq("Sword Slot", this, (Number)1, (Number)0, (Number)9, (Number)1);
    private final akq adF = new akq("Second Sword Slot", this, (Number)2, (Number)0, (Number)9, (Number)1);
    private final akq adG = new akq("Pickaxe Slot", this, (Number)2, (Number)0, (Number)9, (Number)1);
    private final akq adH = new akq("Axe Slot", this, (Number)3, (Number)0, (Number)9, (Number)1);
    private final akq adI = new akq("Shovel Slot", this, (Number)4, (Number)0, (Number)9, (Number)1);
    private final akj adJ = new akj("Block Slot", this, (Number)5, (Number)5, (Number)0, (Number)9, (Number)1);
    private final akj adK = new akj("Potion Slot", this, (Number)6, (Number)6, (Number)0, (Number)9, (Number)1);
    private final akq adL = new akq("Bow Slot", this, (Number)7, (Number)0, (Number)9, (Number)1);
    private final akq adM = new akq("Rod Slot", this, (Number)8, (Number)0, (Number)9, (Number)1);
    private final akj adN = new akj("Food Slot", this, (Number)9, (Number)9, (Number)0, (Number)9, (Number)1);
    private static final int adO = 39;
    private static final int adP = 38;
    private static final int adQ = 37;
    private static final int adR = 36;
    private int adS = 0;
    private static final int adT = 0;
    private static final int adU = 8;
    private static final int adV = 9;
    private static final int adW = 35;
    private final rip.vantage.commons.util.time.a adZ = new rip.vantage.commons.util.time.a();
    private int aea;
    private int BV;
    private int aeb;
    private boolean aec;
    private boolean aed;
    private long aee;
    private boolean aef = false;
    private int aeg;
    private int aeh;
    private boolean aei = false;
    private int aej = 0;
    private int aek = 0;
    @dm(cH=2)
    public final dk<ei> ael = ei2 -> {
        if (tr.aER.bgK == null || tr.aER.bgF == null) {
            return;
        }
        if (tr.aER.bgK.aRg <= 40) {
            return;
        }
        if (this.s(4.5)) {
            this.adS = 10;
        } else if (this.adS > 0) {
            --this.adS;
        }
        if (this.aef && tr.aER.bgR == null && this.aed && !bb.a(false, false, false, false, true) && (this.adS == 0 || this.aeb >= 10)) {
            ahn.m(new net.minecraft.network.play.client.q(tr.aER.bgK.cHX.cSL));
            this.km();
            this.aef = false;
            this.aed = false;
        }
        this.aea = this.kk() ? 0 : ++this.aea;
        ++this.BV;
        ++this.aeb;
        if (((Boolean)this.adv.wD()).booleanValue() && !(tr.aER.bgR instanceof q)) {
            this.adZ.aX();
            this.u(false);
            return;
        }
        if (!this.adZ.T(this.aee) || this.aea < 10 || this.BV < 10 || this.aeb < 10 || this.e(tn.class).isEnabled()) {
            this.u(false);
            return;
        }
        if (this.kk()) {
            this.u(false);
            return;
        }
        if (!this.e(lx.class).isEnabled() && !(tr.aER.bgR instanceof q)) {
            this.u(false);
            return;
        }
        this.aec = false;
        tu tu2 = this.kg();
        boolean bl2 = this.a(tu2);
        if (!this.aei) {
            if (!bl2) {
                return;
            }
            this.ki();
            if (this.aej > 0) {
                --this.aej;
                return;
            }
        } else {
            if (!bl2) {
                this.u(true);
                return;
            }
            if (this.aej > 0) {
                --this.aej;
                return;
            }
        }
        if (this.kl()) {
            this.kf();
            return;
        }
        if (this.c(0, tu2.aeq)) {
            this.kf();
            return;
        }
        if (this.c(1, tu2.aer)) {
            this.kf();
            return;
        }
        if (this.c(2, tu2.aes)) {
            this.kf();
            return;
        }
        if (this.c(3, tu2.aet)) {
            this.kf();
            return;
        }
        if (this.d(tu2)) {
            this.kf();
            return;
        }
        if (this.e(tu2)) {
            this.kf();
            return;
        }
        if (this.f(tu2)) {
            this.kf();
            return;
        }
        if (this.g(tu2)) {
            this.kf();
            return;
        }
        if (this.b(this::h, ((Number)this.adz.wD()).intValue())) {
            this.kf();
            return;
        }
        if (this.b(this::i, ((Number)this.adA.wD()).intValue())) {
            this.kf();
            return;
        }
        if (this.b(this::j, ((Number)this.adB.wD()).intValue())) {
            this.kf();
            return;
        }
        if (this.b(this::k, ((Number)this.adC.wD()).intValue())) {
            this.kf();
            return;
        }
        if (this.b(this::l, ((Number)this.adD.wD()).intValue())) {
            this.kf();
            return;
        }
        int n2 = this.kh();
        if (n2 != -1 && this.f(n2, true)) {
            this.G(n2);
            this.kf();
            return;
        }
        int n3 = this.h(tu2);
        if (n3 != -1 && this.f(n3, true)) {
            this.G(n3);
            this.kf();
            return;
        }
        this.kf();
    };
    @dm
    public final dk<eq> aem = eq2 -> {
        this.BV = 0;
    };
    @dm
    public final dk<en> aen = en2 -> {
        if (this.kn() && this.aeg > 0) {
            this.aeh = Math.max(this.aeh, this.aeg + this.hk());
        }
        this.aeg = 0;
        if (this.kn() && this.aeh > 0) {
            tr.aER.bgK.setSprinting(false);
            --this.aeh;
        } else if (!this.kn()) {
            this.aeh = 0;
        }
    };
    @dm
    public final dk<fi> aeo = fi2 -> {
        k k2;
        if (fi2.dq() instanceof k && ((k2 = (k)fi2.dq()).ls() == null || k2.ls().bP() != Items.cQB)) {
            this.aeb = 0;
        }
    };

    public boolean jY() {
        return aER != null && tr.aER.bgK != null && tr.aER.bgF != null && this.adZ.T(this.aee) && this.aea >= 10 && this.BV >= 10 && this.aeb >= 10 && (this.kj() || tr.aER.bgR instanceof q);
    }

    public int jZ() {
        return ((Number)this.adz.wD()).intValue();
    }

    public int ka() {
        return ((Number)this.adA.wD()).intValue();
    }

    public int kb() {
        return ((Number)this.adB.wD()).intValue();
    }

    public int kc() {
        return ((Number)this.adC.wD()).intValue();
    }

    public int kd() {
        return ((Number)this.adD.wD()).intValue();
    }

    public boolean ke() {
        return (Boolean)this.adw.wD();
    }

    private boolean s(double d2) {
        if (tr.aER.bgK == null || tr.aER.bgF == null) {
            return false;
        }
        ce ce2 = tr.aER.bgK.b(d2, 1.0f);
        if (ce2 == null || ce2.dzu != cf.dzy) {
            return false;
        }
        b b2 = ce2.dg();
        Block block = tr.aER.bgF.L(b2).df();
        return block instanceof BlockChest || block instanceof BlockEnderChest || block instanceof BlockFurnace || block instanceof BlockWorkbench;
    }

    private void kf() {
        if (this.aec) {
            this.aek = 0;
        } else {
            ++this.aek;
            if (this.aek >= 2) {
                this.u(true);
            }
        }
    }

    @Override
    public void onDisable() {
        this.u(false);
        this.aeg = 0;
        this.aeh = 0;
    }

    private tu kg() {
        tu tu2 = new tu();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList5 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList6 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList7 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList8 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList9 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList10 = new ArrayList<Integer>();
        for (int i2 = 0; i2 <= 39; ++i2) {
            co co2 = tr.aER.bgK.cHV.fi(i2);
            if (co2 == null) continue;
            d d2 = co2.bP();
            if (!aih.v(co2)) {
                tu2.aeO.add(i2);
                continue;
            }
            if (d2 instanceof af) {
                tu2.aeB.add(new tv(i2, co2));
            }
            if (d2 instanceof by) {
                tu2.aeC.add(new tv(i2, co2));
            }
            if (d2 instanceof bg) {
                tu2.aeD.add(new tv(i2, co2));
            }
            if (d2 instanceof y) {
                switch (((y)d2).cVH) {
                    case 0: {
                        arrayList.add(i2);
                        break;
                    }
                    case 1: {
                        arrayList2.add(i2);
                        break;
                    }
                    case 2: {
                        arrayList3.add(i2);
                        break;
                    }
                    case 3: {
                        arrayList4.add(i2);
                    }
                }
                continue;
            }
            if (d2 instanceof cp) {
                arrayList5.add(i2);
                continue;
            }
            if (d2 instanceof bw) {
                arrayList6.add(i2);
                continue;
            }
            if (d2 instanceof ac) {
                arrayList7.add(i2);
                continue;
            }
            if (d2 instanceof cn) {
                arrayList8.add(i2);
                continue;
            }
            if (d2 instanceof ai) {
                arrayList9.add(i2);
                continue;
            }
            if (!(d2 instanceof be)) continue;
            arrayList10.add(i2);
        }
        tu2.aeq = this.a(arrayList, tu2.aeK, this::n);
        tu2.aer = this.a(arrayList2, tu2.aeL, this::n);
        tu2.aes = this.a(arrayList3, tu2.aeM, this::n);
        tu2.aet = this.a(arrayList4, tu2.aeN, this::n);
        this.a(arrayList5, tu2);
        tu2.aew = this.a(arrayList6, tu2.aeF, this::m);
        tu2.aex = this.a(arrayList7, tu2.aeG, this::m);
        tu2.aey = this.a(arrayList8, tu2.aeH, this::m);
        tu2.aez = this.a(arrayList9, tu2.aeI, this::l);
        tu2.aeA = this.b(arrayList10, tu2.aeJ);
        return tu2;
    }

    private int a(List<Integer> list, List<Integer> list2, tw tw2) {
        if (list.isEmpty()) {
            return -1;
        }
        int n2 = list.get(0);
        float f2 = tw2.score(tr.aER.bgK.cHV.fi(n2));
        for (int i2 = 1; i2 < list.size(); ++i2) {
            int n3 = list.get(i2);
            float f3 = tw2.score(tr.aER.bgK.cHV.fi(n3));
            if (f3 > f2) {
                list2.add(n2);
                n2 = n3;
                f2 = f3;
                continue;
            }
            list2.add(n3);
        }
        return n2;
    }

    private void a(List<Integer> list, tu tu2) {
        list.sort((n2, n3) -> Float.compare(this.k(tr.aER.bgK.cHV.fi((int)n3)), this.k(tr.aER.bgK.cHV.fi((int)n2))));
        if (list.isEmpty()) {
            return;
        }
        tu2.aeu = list.get(0);
        boolean bl2 = ((Number)this.adE.wD()).intValue() != 0 && ((Number)this.adF.wD()).intValue() != 0 && ((Number)this.adF.wD()).intValue() != ((Number)this.adE.wD()).intValue();
        int n4 = 1;
        if (bl2 && list.size() > 1) {
            tu2.aev = list.get(1);
            n4 = 2;
        }
        for (int i2 = n4; i2 < list.size(); ++i2) {
            tu2.aeE.add(list.get(i2));
        }
    }

    private int b(List<Integer> list, List<Integer> list2) {
        if (list.isEmpty()) {
            return -1;
        }
        int n2 = list.get(0);
        for (int i2 = 1; i2 < list.size(); ++i2) {
            list2.add(list.get(i2));
        }
        return n2;
    }

    private boolean a(tu tu2) {
        if (tr.aER.bgK.cHV.bO() != null) {
            return true;
        }
        if (this.b(0, tu2.aeq)) {
            return true;
        }
        if (this.b(1, tu2.aer)) {
            return true;
        }
        if (this.b(2, tu2.aes)) {
            return true;
        }
        if (this.b(3, tu2.aet)) {
            return true;
        }
        if (this.a(tu2.aeu, this.adE)) {
            return true;
        }
        if (this.a(tu2.aev, this.adF)) {
            return true;
        }
        if (!this.a(tu2, this.adG) && this.a(tu2.aew, this.adG)) {
            return true;
        }
        if (!this.a(tu2, this.adH) && this.a(tu2.aex, this.adH)) {
            return true;
        }
        if (!this.a(tu2, this.adI) && this.a(tu2.aey, this.adI)) {
            return true;
        }
        if (!this.a(tu2, this.adL) && this.a(tu2.aez, this.adL)) {
            return true;
        }
        int n2 = ((Number)this.adM.wD()).intValue();
        int n3 = ((Number)this.adL.wD()).intValue();
        if (!this.a(tu2, this.adM) && n2 != 0 && (n3 == 0 || n2 != n3 || tu2.aez == -1) && this.a(tu2.aeA, this.adM)) {
            return true;
        }
        if (this.a(tu2.aeB, this.adJ)) {
            return true;
        }
        if (this.b(tu2)) {
            return true;
        }
        if (this.c(tu2)) {
            return true;
        }
        if (this.a(this::h, ((Number)this.adz.wD()).intValue())) {
            return true;
        }
        if (this.a(this::i, ((Number)this.adA.wD()).intValue())) {
            return true;
        }
        if (this.a(this::j, ((Number)this.adB.wD()).intValue())) {
            return true;
        }
        if (this.a(this::k, ((Number)this.adC.wD()).intValue())) {
            return true;
        }
        if (this.a(this::l, ((Number)this.adD.wD()).intValue())) {
            return true;
        }
        if (this.kh() != -1) {
            return true;
        }
        return !tu2.aeE.isEmpty() || !tu2.aeF.isEmpty() || !tu2.aeG.isEmpty() || !tu2.aeH.isEmpty() || !tu2.aeI.isEmpty() || !tu2.aeJ.isEmpty() || !tu2.aeK.isEmpty() || !tu2.aeL.isEmpty() || !tu2.aeM.isEmpty() || !tu2.aeN.isEmpty();
    }

    private boolean b(int n2, int n3) {
        int n4;
        if (n3 == -1) {
            return false;
        }
        int n5 = this.E(n2);
        co co2 = tr.aER.bgK.cHV.fi(n5);
        co co3 = tr.aER.bgK.cHV.fi(n3);
        if (co3 == null || !(co3.bP() instanceof y)) {
            return false;
        }
        int n6 = this.n(co3);
        int n7 = n4 = co2 != null && co2.bP() instanceof y ? this.n(co2) : Integer.MIN_VALUE;
        if (n3 == n5) {
            return false;
        }
        return n6 > n4;
    }

    private boolean a(Integer n2, akq akq2) {
        if (((Number)akq2.wD()).intValue() == 0 || n2 == null || n2 == -1) {
            return false;
        }
        int n3 = ((Number)akq2.wD()).intValue() - 1;
        return !this.f((int)n2, n3);
    }

    private boolean a(tu tu2, akq akq2) {
        int n2 = ((Number)akq2.wD()).intValue();
        return n2 != 0 && (tu2.aeu != -1 && ((Number)this.adE.wD()).intValue() == n2 || tu2.aev != -1 && ((Number)this.adF.wD()).intValue() == n2);
    }

    private boolean a(List<tv> list, akj akj2) {
        int n2 = ((Number)akj2.wD()).intValue();
        int n3 = akj2.wP().intValue();
        if (n2 == 0 || n2 > n3) {
            return false;
        }
        if (list.isEmpty()) {
            return false;
        }
        list.sort(Comparator.comparingInt(tv2 -> -tv2.aeQ.cWZ));
        int n4 = n3 - n2 + 1;
        for (int i2 = 0; i2 < n4 && i2 < list.size(); ++i2) {
            int n5 = list.get((int)i2).aeP;
            int n6 = n2 - 1 + i2;
            if (this.f(n5, n6)) continue;
            return true;
        }
        return false;
    }

    private boolean b(tu tu2) {
        int n2 = ((Number)this.adK.wD()).intValue();
        int n3 = this.adK.wP().intValue();
        if (n2 == 0 || n2 > n3) {
            return false;
        }
        ArrayList<tv> arrayList = new ArrayList<tv>();
        for (tv tv4 : tu2.aeC) {
            List<net.minecraft.potion.d> list = ((by)tv4.aeQ.bP()).aH(tv4.aeQ);
            if (list == null || list.isEmpty()) continue;
            arrayList.add(tv4);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        arrayList.sort((tv2, tv3) -> {
            boolean bl2 = by.gb(tv2.aeQ.yc());
            boolean bl3 = by.gb(tv3.aeQ.yc());
            if (((Boolean)this.ady.wD()).booleanValue()) {
                if (bl2 && !bl3) {
                    return -1;
                }
                if (!bl2 && bl3) {
                    return 1;
                }
            }
            int n2 = aik.ax(((by)tv2.aeQ.bP()).aH(tv2.aeQ).get(0).aje());
            int n3 = aik.ax(((by)tv3.aeQ.bP()).aH(tv3.aeQ).get(0).aje());
            return Integer.compare(n3, n2);
        });
        int n4 = n3 - n2 + 1;
        for (int i2 = 0; i2 < n4 && i2 < arrayList.size(); ++i2) {
            int n5 = ((tv)arrayList.get((int)i2)).aeP;
            int n6 = n2 - 1 + i2;
            if (this.f(n5, n6)) continue;
            return true;
        }
        return false;
    }

    private boolean c(tu tu2) {
        int n2 = ((Number)this.adN.wD()).intValue();
        int n3 = this.adN.wP().intValue();
        if (n2 == 0 || n2 > n3) {
            return false;
        }
        if (tu2.aeD.isEmpty()) {
            return false;
        }
        tu2.aeD.sort((tv2, tv3) -> Float.compare(((bg)tv3.aeQ.bP()).aF(tv3.aeQ), ((bg)tv2.aeQ.bP()).aF(tv2.aeQ)));
        int n4 = n3 - n2 + 1;
        for (int i2 = 0; i2 < n4 && i2 < tu2.aeD.size(); ++i2) {
            int n5 = tu2.aeD.get((int)i2).aeP;
            int n6 = n2 - 1 + i2;
            if (this.f(n5, n6)) continue;
            return true;
        }
        return false;
    }

    private boolean a(tt tt2, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = tt2.gather(arrayList);
        return n3 > n2;
    }

    private boolean c(int n2, int n3) {
        int n4;
        if (n3 == -1) {
            return false;
        }
        int n5 = this.E(n2);
        co co2 = tr.aER.bgK.cHV.fi(n5);
        co co3 = tr.aER.bgK.cHV.fi(n3);
        if (co3 == null || !(co3.bP() instanceof y)) {
            return false;
        }
        int n6 = this.n(co3);
        int n7 = n4 = co2 != null && co2.bP() instanceof y ? this.n(co2) : Integer.MIN_VALUE;
        if (n3 == n5 || n6 <= n4) {
            return false;
        }
        int n8 = tr.aER.bgK.cHX.cSL;
        int n9 = this.I(n3);
        int n10 = this.F(n2);
        if (tr.aER.bgK.cHV.bO() != null) {
            return false;
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12)) {
            this.a(n8, n9, 0, 0);
            this.a(n8, n10, 0, 0);
            this.a(n8, n9, 0, 0);
        } else {
            this.a(n8, n9, 1, 1);
            this.a(n8, n10, 1, 1);
            this.a(n8, n9, 1, 1);
        }
        this.ko();
        return true;
    }

    private int E(int n2) {
        switch (n2) {
            case 0: {
                return 39;
            }
            case 1: {
                return 38;
            }
            case 2: {
                return 37;
            }
            case 3: {
                return 36;
            }
        }
        return 39;
    }

    private int F(int n2) {
        switch (n2) {
            case 0: {
                return 5;
            }
            case 1: {
                return 6;
            }
            case 2: {
                return 7;
            }
            case 3: {
                return 8;
            }
        }
        return 5;
    }

    private boolean d(tu tu2) {
        if (this.b((Integer)tu2.aeu, this.adE)) {
            return true;
        }
        if (this.b((Integer)tu2.aev, this.adF)) {
            return true;
        }
        if (!this.a(tu2, this.adG) && this.b((Integer)tu2.aew, this.adG)) {
            return true;
        }
        if (!this.a(tu2, this.adH) && this.b((Integer)tu2.aex, this.adH)) {
            return true;
        }
        if (!this.a(tu2, this.adI) && this.b((Integer)tu2.aey, this.adI)) {
            return true;
        }
        if (!this.a(tu2, this.adL) && this.b((Integer)tu2.aez, this.adL)) {
            return true;
        }
        int n2 = ((Number)this.adM.wD()).intValue();
        int n3 = ((Number)this.adL.wD()).intValue();
        return !this.a(tu2, this.adM) && n2 != 0 && (n3 == 0 || n2 != n3 || tu2.aez == -1) && this.b((Integer)tu2.aeA, this.adM);
    }

    private boolean e(tu tu2) {
        int n2 = ((Number)this.adJ.wD()).intValue();
        int n3 = this.adJ.wP().intValue();
        if (n2 == 0 || n2 > n3) {
            return false;
        }
        tu2.aeB.sort(Comparator.comparingInt(tv2 -> -tv2.aeQ.cWZ));
        int n4 = n3 - n2 + 1;
        for (int i2 = 0; i2 < n4 && i2 < tu2.aeB.size(); ++i2) {
            int n5 = tu2.aeB.get((int)i2).aeP;
            int n6 = n2 - 1 + i2;
            if (this.f(n5, n6) || !this.e(n5, false)) continue;
            this.e(n5, n6);
            return true;
        }
        return false;
    }

    private boolean f(tu tu2) {
        int n2 = ((Number)this.adK.wD()).intValue();
        int n3 = this.adK.wP().intValue();
        if (n2 == 0 || n2 > n3) {
            return false;
        }
        ArrayList<tv> arrayList = new ArrayList<tv>();
        for (tv tv4 : tu2.aeC) {
            List<net.minecraft.potion.d> list = ((by)tv4.aeQ.bP()).aH(tv4.aeQ);
            if (list == null || list.isEmpty()) continue;
            arrayList.add(tv4);
        }
        arrayList.sort((tv2, tv3) -> {
            boolean bl2 = by.gb(tv2.aeQ.yc());
            boolean bl3 = by.gb(tv3.aeQ.yc());
            if (((Boolean)this.ady.wD()).booleanValue()) {
                if (bl2 && !bl3) {
                    return -1;
                }
                if (!bl2 && bl3) {
                    return 1;
                }
            }
            int n2 = aik.ax(((by)tv2.aeQ.bP()).aH(tv2.aeQ).get(0).aje());
            int n3 = aik.ax(((by)tv3.aeQ.bP()).aH(tv3.aeQ).get(0).aje());
            return Integer.compare(n3, n2);
        });
        int n4 = n3 - n2 + 1;
        for (int i2 = 0; i2 < n4 && i2 < arrayList.size(); ++i2) {
            int n5 = ((tv)arrayList.get((int)i2)).aeP;
            int n6 = n2 - 1 + i2;
            if (this.f(n5, n6) || !this.e(n5, false)) continue;
            this.e(n5, n6);
            return true;
        }
        return false;
    }

    private boolean g(tu tu2) {
        int n2 = ((Number)this.adN.wD()).intValue();
        int n3 = this.adN.wP().intValue();
        if (n2 == 0 || n2 > n3) {
            return false;
        }
        tu2.aeD.sort((tv2, tv3) -> Float.compare(((bg)tv3.aeQ.bP()).aF(tv3.aeQ), ((bg)tv2.aeQ.bP()).aF(tv2.aeQ)));
        int n4 = n3 - n2 + 1;
        for (int i2 = 0; i2 < n4 && i2 < tu2.aeD.size(); ++i2) {
            int n5 = tu2.aeD.get((int)i2).aeP;
            int n6 = n2 - 1 + i2;
            if (this.f(n5, n6) || !this.e(n5, false)) continue;
            this.e(n5, n6);
            return true;
        }
        return false;
    }

    private boolean b(tt tt2, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = tt2.gather(arrayList);
        if (n3 <= n2) {
            return false;
        }
        int n4 = n3 - n2;
        for (int i2 = arrayList.size() - 1; i2 >= 0; --i2) {
            int n5 = (Integer)arrayList.get(i2);
            co co2 = tr.aER.bgK.cHV.fi(n5);
            if (co2 == null) continue;
            int n6 = co2.cWZ;
            if (!this.f(n5, true)) continue;
            if (n4 >= n6) {
                this.G(n5);
                return true;
            }
            int n7 = n6 - n4;
            this.d(n5, n7);
            return true;
        }
        return false;
    }

    private int kh() {
        for (int i2 = 0; i2 <= 39; ++i2) {
            co co2 = tr.aER.bgK.cHV.fi(i2);
            if (co2 == null || aih.v(co2)) continue;
            return i2;
        }
        return -1;
    }

    private int h(tu tu2) {
        for (int n2 : tu2.aeE) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeF) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeG) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeH) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeI) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeJ) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeK) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeL) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeM) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        for (int n2 : tu2.aeN) {
            if (!this.f(n2, true)) continue;
            return n2;
        }
        return -1;
    }

    private int h(List<Integer> list) {
        int n2 = 0;
        for (int i2 = 0; i2 <= 39; ++i2) {
            co co2 = tr.aER.bgK.cHV.fi(i2);
            if (co2 == null || !(co2.bP() instanceof af)) continue;
            list.add(i2);
            n2 += co2.cWZ;
        }
        return n2;
    }

    private int i(List<Integer> list) {
        int n2 = 0;
        for (int i2 = 0; i2 <= 39; ++i2) {
            co co2 = tr.aER.bgK.cHV.fi(i2);
            if (co2 == null || co2.bP() != Items.cPk) continue;
            list.add(i2);
            n2 += co2.cWZ;
        }
        return n2;
    }

    private int j(List<Integer> list) {
        int n2 = 0;
        for (int i2 = 0; i2 <= 39; ++i2) {
            d d2;
            co co2 = tr.aER.bgK.cHV.fi(i2);
            if (co2 == null || (d2 = co2.bP()) != Items.cQA && d2 != Items.cQB && d2 != Items.cQC && d2 != Items.cQK) continue;
            list.add(i2);
            n2 += co2.cWZ;
        }
        return n2;
    }

    private int k(List<Integer> list) {
        int n2 = 0;
        for (int i2 = 0; i2 <= 39; ++i2) {
            d d2;
            co co2 = tr.aER.bgK.cHV.fi(i2);
            if (co2 == null || (d2 = co2.bP()) != Items.cQH && d2 != Items.cQT) continue;
            list.add(i2);
            n2 += co2.cWZ;
        }
        return n2;
    }

    private int l(List<Integer> list) {
        int n2 = 0;
        for (int i2 = 0; i2 <= 39; ++i2) {
            co co2 = tr.aER.bgK.cHV.fi(i2);
            if (co2 == null || co2.bP() != Items.cRy) continue;
            list.add(i2);
            n2 += co2.cWZ;
        }
        return n2;
    }

    private void ki() {
        this.aek = 0;
        if (this.kk()) {
            return;
        }
        if (tr.aER.bgR instanceof q) {
            this.aei = true;
            this.aej = 0;
            return;
        }
        if (this.kj() && !this.aed && tr.aER.bgR == null && !bb.a(false, false, false, false, true)) {
            ahn.m(new z(net.minecraft.network.play.client.aa.dbR));
            this.km();
            this.aed = true;
            this.aei = true;
            this.aej = 1;
        }
    }

    private void u(boolean bl2) {
        if (!this.aei) {
            return;
        }
        if (this.aed) {
            if (bl2 && tr.aER.bgR == null && !bb.a(false, false, false, false, true)) {
                this.aed = false;
            } else {
                this.aef = true;
            }
        }
        this.aei = false;
        this.aej = 0;
        this.aek = 0;
    }

    private boolean kj() {
        boolean bl2 = this.e(lx.class).isEnabled();
        boolean bl3 = tr.aER.bgR == null;
        boolean bl4 = this.e(tn.class).isEnabled();
        return bl2 && bl3 && !bl4 && !tr.aER.aIY.chw.Re() && !tr.aER.aIY.chu.Re();
    }

    private boolean kk() {
        return tr.aER.bgR instanceof i && !(tr.aER.bgR instanceof q);
    }

    private boolean kl() {
        co co2 = tr.aER.bgK.cHV.bO();
        if (co2 == null) {
            return false;
        }
        int n2 = tr.aER.bgK.cHX.cSL;
        for (int i2 = 0; i2 <= 39; ++i2) {
            if (i2 == 36 || i2 == 37 || i2 == 38 || i2 == 39 || tr.aER.bgK.cHV.fi(i2) != null) continue;
            this.a(n2, this.I(i2), 0, 0);
            this.ko();
            return true;
        }
        this.a(n2, -999, 0, 0);
        this.ko();
        return true;
    }

    private void G(int n2) {
        if (!this.f(n2, true)) {
            return;
        }
        int n3 = tr.aER.bgK.cHX.cSL;
        int n4 = this.I(n2);
        this.a(n3, n4, 1, 4);
        this.ko();
    }

    private void d(int n2, int n3) {
        if (!this.f(n2, true) || n3 < 0) {
            return;
        }
        int n4 = tr.aER.bgK.cHX.cSL;
        int n5 = this.I(n2);
        this.a(n4, n5, 0, 0);
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a(n4, n5, 1, 0);
        }
        this.a(n4, -999, 0, 0);
        this.ko();
    }

    private void H(int n2) {
        if (!this.e(n2, false)) {
            return;
        }
        int n3 = tr.aER.bgK.cHX.cSL;
        int n4 = this.I(n2);
        this.a(n3, n4, 0, 1);
        this.ko();
    }

    private void e(int n2, int n3) {
        if (!this.e(n2, false) || n3 < 0 || n3 > 8) {
            return;
        }
        int n4 = tr.aER.bgK.cHX.cSL;
        int n5 = this.I(n2);
        this.a(n4, n5, n3, 2);
        this.ko();
    }

    private boolean b(Integer n2, akq akq2) {
        if (((Number)akq2.wD()).intValue() == 0 || n2 == null || n2 == -1) {
            return false;
        }
        int n3 = ((Number)akq2.wD()).intValue() - 1;
        if (this.f((int)n2, n3)) {
            return false;
        }
        if (!this.e((int)n2, false)) {
            return false;
        }
        this.e((int)n2, n3);
        return true;
    }

    private boolean f(int n2, int n3) {
        return n2 >= 0 && n2 <= 8 && n2 == n3;
    }

    private void a(int n2, int n3, int n4, int n5) {
        tr.aER.bgu.a(n2, n3, n4, n5, tr.aER.bgK);
        this.km();
    }

    private void km() {
        if (this.kn()) {
            ++this.aeg;
        }
    }

    private boolean kn() {
        lx lx2 = this.e(lx.class);
        return lx2 != null && lx2.isEnabled() && lx2.hj();
    }

    private int hk() {
        lx lx2 = this.e(lx.class);
        if (lx2 == null) {
            return 9;
        }
        return lx2.hk();
    }

    private void ko() {
        this.aee = Math.round(ahj.l(((Number)this.adu.wD()).intValue(), this.adu.wP().intValue()));
        this.adZ.aX();
        this.aec = true;
        this.aek = 0;
    }

    private boolean e(int n2, boolean bl2) {
        if (this.aec && this.aee > 0L) {
            return false;
        }
        boolean bl3 = bl2 ? !((Boolean)this.adw.wD()).booleanValue() : (Boolean)this.adx.wD() == false;
        return !bt.a(n2, bl3);
    }

    private boolean f(int n2, boolean bl2) {
        return this.e(n2, true);
    }

    private float k(co co2) {
        cp cp2 = (cp)co2.bP();
        int n2 = l.d(a.cqg.cqw, co2);
        int n3 = l.d(a.cqk.cqw, co2);
        return (float)((double)cp2.adI() + (double)n2 * 1.25 + (double)n3 * 2.5);
    }

    private float l(co co2) {
        return l.d(a.cqq.cqw, co2);
    }

    private float m(co co2) {
        float f2;
        d d2 = co2.bP();
        int n2 = l.d(a.cqm.cqw, co2);
        float f3 = f2 = n2 > 0 ? (float)(n2 * n2 + 1) : 0.0f;
        if (d2 instanceof bw) {
            return ((bw)d2).adY().adH() + f2;
        }
        if (d2 instanceof cn) {
            return ((cn)d2).adY().adH() + f2;
        }
        if (d2 instanceof ac) {
            return ((ac)d2).adY().adH() + f2;
        }
        return 0.0f;
    }

    private int n(co co2) {
        y y2 = (y)co2.bP();
        int n2 = y2.cVI;
        int n3 = switch (y2.adN()) {
            case aa.cVP -> 5;
            case aa.cVN -> 4;
            case aa.cVM -> 3;
            case aa.cVO -> 2;
            case aa.cVL -> 1;
            default -> 0;
        };
        int n4 = l.d(a.cpX.cqw, co2);
        int n5 = l.d(a.cqb.cqw, co2);
        int n6 = l.d(a.cpY.cqw, co2);
        int n7 = l.d(a.cqa.cqw, co2);
        int n8 = n2 * 100 + n3 * 10 + n4 * 6 + (n5 + n6 + n7) * 2;
        return n8;
    }

    private int I(int n2) {
        if (n2 >= 0 && n2 <= 8) {
            return 36 + n2;
        }
        if (n2 >= 9 && n2 <= 35) {
            return n2;
        }
        if (n2 == 39) {
            return 5;
        }
        if (n2 == 38) {
            return 6;
        }
        if (n2 == 37) {
            return 7;
        }
        if (n2 == 36) {
            return 8;
        }
        return n2;
    }

    @Generated
    public boolean kp() {
        return this.aec;
    }

    @Generated
    public boolean kq() {
        return this.aed;
    }
}

