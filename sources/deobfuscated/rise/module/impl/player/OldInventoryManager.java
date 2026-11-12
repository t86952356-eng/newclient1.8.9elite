/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.player;

import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.aih;
import hackclient.rise.aik;
import hackclient.rise.akj;
import hackclient.rise.bt;
import hackclient.rise.en;
import hackclient.rise.tq;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import net.minecraft.block.BlockTNT;
import net.minecraft.client.gui.inventory.h;
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
import net.minecraft.util.ad;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.InventoryMove;
import rise.module.impl.player.Scaffold;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.player.oldmanager.name", "old manager"}, description="module.player.manager.description", category=Category.PLAYER)
public class OldInventoryManager
extends Module {
    private final akj afI = new akj("Delay", this, (Number)100, (Number)150, (Number)0, (Number)500, (Number)50);
    private final BooleanValue afJ = new BooleanValue("Legit", (Module)this, (Boolean)false);
    private final BooleanValue afK = new BooleanValue("Drop Custom Items", (Module)this, (Boolean)false);
    private final BooleanValue afL = new BooleanValue("Use Custom Items", (Module)this, (Boolean)false);
    private final BooleanValue afM = new BooleanValue("Prioritize Splash Potions", (Module)this, (Boolean)false);
    private final NumberValue afN = new NumberValue("Block Limit", this, (Number)512, (Number)0, (Number)512, (Number)4);
    private final NumberValue afO = new NumberValue("Arrow Limit", this, (Number)128, (Number)0, (Number)512, (Number)4);
    private final NumberValue afP = new NumberValue("Bucket Limit", this, (Number)1, (Number)0, (Number)4, (Number)1);
    private final NumberValue afQ = new NumberValue("Snowball/Egg Limit", this, (Number)16, (Number)0, (Number)64, (Number)1);
    private final NumberValue afR = new NumberValue("Ender Pearl Limit", this, (Number)16, (Number)0, (Number)64, (Number)1);
    private final NumberValue afS = new NumberValue("Fire Charge Limit", this, (Number)16, (Number)0, (Number)64, (Number)1);
    private final NumberValue afT = new NumberValue("TNT Limit", this, (Number)16, (Number)0, (Number)64, (Number)1);
    private final NumberValue afU = new NumberValue("Sword Slot", this, (Number)1, (Number)0, (Number)9, (Number)1);
    private final NumberValue afV = new NumberValue("Second Sword Slot", this, (Number)2, (Number)0, (Number)9, (Number)1);
    private final NumberValue afW = new NumberValue("Pickaxe Slot", this, (Number)2, (Number)0, (Number)9, (Number)1);
    private final NumberValue afX = new NumberValue("Axe Slot", this, (Number)3, (Number)0, (Number)9, (Number)1);
    private final NumberValue afY = new NumberValue("Shovel Slot", this, (Number)4, (Number)0, (Number)9, (Number)1);
    private final akj afZ = new akj("Block Slot", this, (Number)5, (Number)5, (Number)0, (Number)9, (Number)1);
    private final akj aga = new akj("Potion Slot", this, (Number)6, (Number)6, (Number)0, (Number)9, (Number)1);
    private final NumberValue agb = new NumberValue("Bow Slot", this, (Number)7, (Number)0, (Number)9, (Number)1);
    private final NumberValue agc = new NumberValue("Rod Slot", this, (Number)8, (Number)0, (Number)9, (Number)1);
    private final akj agd = new akj("Food Slot", this, (Number)9, (Number)9, (Number)0, (Number)9, (Number)1);
    private final int age = 4;
    private final int agf = 9;
    private final int agg = 4;
    private final int agh = 40;
    private final rip.vantage.commons.util.time.a agi = new rip.vantage.commons.util.time.a();
    private int aea;
    private int BV;
    private int aeb;
    private boolean aec;
    private boolean aed;
    private long aee;
    private int aeg;
    private int aeh;
    @EventLink(cH=1)
    public final Listener<PreMotionEvent> agj = preMotionEvent -> {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        boolean bl2;
        int n8;
        int n9;
        Object object;
        d d2;
        co co2;
        int n10;
        if (OldInventoryManager.aER.bgK.aRg <= 40) {
            return;
        }
        this.aea = OldInventoryManager.aER.bgR instanceof h ? 0 : ++this.aea;
        ++this.BV;
        ++this.aeb;
        if (((Boolean)this.afJ.wD()).booleanValue() && !(OldInventoryManager.aER.bgR instanceof q)) {
            this.agi.aX();
            return;
        }
        if (!this.agi.T(this.aee) || this.aea < 10 || this.BV < 10 || this.aeb < 10 || this.e(Scaffold.class).isEnabled()) {
            this.ku();
            return;
        }
        if (!this.e(InventoryMove.class).isEnabled() && !(OldInventoryManager.aER.bgR instanceof q)) {
            return;
        }
        this.aec = false;
        int n11 = -1;
        int n12 = -1;
        int n13 = -1;
        int n14 = -1;
        int n15 = -1;
        int n16 = -1;
        int n17 = -1;
        int n18 = -1;
        int n19 = -1;
        ArrayList<tq> arrayList = new ArrayList<tq>();
        ArrayList<tq> arrayList2 = new ArrayList<tq>();
        int n20 = -1;
        int n21 = -1;
        ArrayList<tq> arrayList3 = new ArrayList<tq>();
        int n22 = 0;
        int n23 = 0;
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        int n27 = 0;
        int n28 = 0;
        ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList5 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList6 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList7 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList8 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList9 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList10 = new ArrayList<Integer>();
        boolean bl3 = ((Number)this.afU.wD()).intValue() != 0 && ((Number)this.afV.wD()).intValue() != 0 && ((Number)this.afV.wD()).intValue() != ((Number)this.afU.wD()).intValue();
        for (n10 = 0; n10 < 40; ++n10) {
            co2 = OldInventoryManager.aER.bgK.cHV.fi(n10);
            if (co2 == null) continue;
            d2 = co2.bP();
            if (!aih.v(co2)) {
                this.J(n10);
            }
            if (d2 == Items.cPk) {
                n23 += co2.cWZ;
                arrayList5.add(n10);
            } else if (d2 == Items.cQA || d2 == Items.cQB) {
                n24 += co2.cWZ;
                arrayList6.add(n10);
            } else if (d2 == Items.cQH || d2 == Items.cQT) {
                n25 += co2.cWZ;
                arrayList7.add(n10);
            } else if (d2 == Items.cRy) {
                n26 += co2.cWZ;
                arrayList8.add(n10);
            } else if (d2 == Items.cRP) {
                n27 += co2.cWZ;
                arrayList9.add(n10);
            }
            if (d2 instanceof af && (object = ((af)d2).df()) instanceof BlockTNT) {
                n28 += co2.cWZ;
                arrayList10.add(n10);
            }
            if (d2 instanceof y) {
                object = (y)d2;
                n9 = this.n(co2);
                switch (((y)object).cVH) {
                    case 0: {
                        if (n11 != -1 && n9 <= this.n(OldInventoryManager.aER.bgK.cHV.fi(n11))) break;
                        n11 = n10;
                        break;
                    }
                    case 1: {
                        if (n12 != -1 && n9 <= this.n(OldInventoryManager.aER.bgK.cHV.fi(n12))) break;
                        n12 = n10;
                        break;
                    }
                    case 2: {
                        if (n13 != -1 && n9 <= this.n(OldInventoryManager.aER.bgK.cHV.fi(n13))) break;
                        n13 = n10;
                        break;
                    }
                    case 3: {
                        if (n14 != -1 && n9 <= this.n(OldInventoryManager.aER.bgK.cHV.fi(n14))) break;
                        n14 = n10;
                    }
                }
            }
            if (d2 instanceof cp && ((Number)this.afU.wD()).intValue() != 0) {
                if (n15 == -1) {
                    n15 = n10;
                } else if (this.o(co2) > this.o(OldInventoryManager.aER.bgK.cHV.fi(n15))) {
                    if (bl3) {
                        n16 = n15;
                    }
                    n15 = n10;
                } else if (bl3 && (n16 == -1 || this.o(co2) > this.o(OldInventoryManager.aER.bgK.cHV.fi(n16)))) {
                    n16 = n10;
                }
            }
            if (d2 instanceof bw) {
                if (n17 == -1) {
                    n17 = n10;
                } else if (this.q(co2) > this.q(OldInventoryManager.aER.bgK.cHV.fi(n17))) {
                    n17 = n10;
                }
                if (n10 != n17) {
                    this.J(n10);
                }
            }
            if (d2 instanceof ac) {
                if (n18 == -1) {
                    n18 = n10;
                } else if (this.q(co2) > this.q(OldInventoryManager.aER.bgK.cHV.fi(n18))) {
                    n18 = n10;
                }
                if (n10 != n18) {
                    this.J(n10);
                }
            }
            if (d2 instanceof cn) {
                if (n19 == -1) {
                    n19 = n10;
                } else if (this.q(co2) > this.q(OldInventoryManager.aER.bgK.cHV.fi(n19))) {
                    n19 = n10;
                }
                if (n10 != n19) {
                    this.J(n10);
                }
            }
            if (d2 instanceof af) {
                n22 += co2.cWZ;
                arrayList4.add(n10);
                arrayList.add(new tq(co2, n10));
            }
            if (d2 instanceof by) {
                arrayList2.add(new tq(co2, n10));
            }
            if (d2 instanceof ai) {
                if (n20 == -1) {
                    n20 = n10;
                } else if (this.p(co2) > this.p(OldInventoryManager.aER.bgK.cHV.fi(n20))) {
                    n20 = n10;
                }
                if (n10 != n20) {
                    this.J(n10);
                }
            }
            if (d2 instanceof bg && ((Number)this.agd.wD()).intValue() != 0) {
                arrayList3.add(new tq(co2, n10));
            }
            if (!(d2 instanceof be)) continue;
            if (n21 == -1) {
                n21 = n10;
            }
            if (n10 == n21) continue;
            this.J(n10);
        }
        for (n10 = 0; n10 < 40; ++n10) {
            co2 = OldInventoryManager.aER.bgK.cHV.fi(n10);
            if (co2 == null) continue;
            d2 = co2.bP();
            if (d2 instanceof y) {
                object = (y)d2;
                switch (((y)object).cVH) {
                    case 0: {
                        if (n10 == n11) break;
                        this.J(n10);
                        break;
                    }
                    case 1: {
                        if (n10 == n12) break;
                        this.J(n10);
                        break;
                    }
                    case 2: {
                        if (n10 == n13) break;
                        this.J(n10);
                        break;
                    }
                    case 3: {
                        if (n10 == n14) break;
                        this.J(n10);
                    }
                }
            }
            if (((Number)this.afU.wD()).intValue() == 0 || !(d2 instanceof cp) || n10 == n15 || bl3 && n10 == n16) continue;
            this.J(n10);
        }
        if (n11 != -1 && n11 != 39) {
            this.H(n11);
        }
        if (n12 != -1 && n12 != 38) {
            this.H(n12);
        }
        if (n13 != -1 && n13 != 37) {
            this.H(n13);
        }
        if (n14 != -1 && n14 != 36) {
            this.H(n14);
        }
        if (((Number)this.afZ.wD()).intValue() != 0 && this.afZ.wP().intValue() != 0) {
            n10 = Math.min(((Number)this.afZ.wD()).intValue(), this.afZ.wP().intValue());
            int n29 = Math.max(((Number)this.afZ.wD()).intValue(), this.afZ.wP().intValue());
            int n30 = n29 - n10 + 1;
            arrayList.sort(Comparator.comparingInt(tq::jX).reversed());
            for (int i2 = 0; i2 < n30 && arrayList.size() > i2; ++i2) {
                n9 = n10 - 1 + i2;
                n8 = ((tq)arrayList.get(i2)).jW();
                if (this.f(n8, n9)) continue;
                this.h(n8, n9);
            }
        }
        if (n22 > ((Number)this.afN.wD()).intValue()) {
            n10 = n22 - ((Number)this.afN.wD()).intValue();
            Iterator iterator = arrayList4.reversed().iterator();
            while (iterator.hasNext()) {
                int n31 = (Integer)iterator.next();
                if (n10 <= 0) break;
                co co3 = OldInventoryManager.aER.bgK.cHV.fi(n31);
                n9 = co3.cWZ;
                if (n10 >= n9) {
                    this.J(n31);
                    n10 -= n9;
                    continue;
                }
                this.g(n31, n9 - n10);
                n10 = 0;
            }
        }
        if (n23 > ((Number)this.afO.wD()).intValue()) {
            n10 = n23 - ((Number)this.afO.wD()).intValue();
            Iterator iterator = arrayList5.iterator();
            while (iterator.hasNext()) {
                int n32 = (Integer)iterator.next();
                if (n10 <= 0) break;
                co co4 = OldInventoryManager.aER.bgK.cHV.fi(n32);
                n9 = co4.cWZ;
                if (n10 >= n9) {
                    this.J(n32);
                    n10 -= n9;
                    continue;
                }
                this.g(n32, n9 - n10);
                n10 = 0;
            }
        }
        if (n24 > ((Number)this.afP.wD()).intValue()) {
            n10 = n24 - ((Number)this.afP.wD()).intValue();
            Iterator iterator = arrayList6.iterator();
            while (iterator.hasNext()) {
                int n33 = (Integer)iterator.next();
                if (n10 <= 0) break;
                co co5 = OldInventoryManager.aER.bgK.cHV.fi(n33);
                n9 = co5.cWZ;
                if (n10 >= n9) {
                    this.J(n33);
                    n10 -= n9;
                    continue;
                }
                this.g(n33, n9 - n10);
                n10 = 0;
            }
        }
        if (n25 > ((Number)this.afQ.wD()).intValue()) {
            n10 = n25 - ((Number)this.afQ.wD()).intValue();
            Iterator iterator = arrayList7.iterator();
            while (iterator.hasNext()) {
                int n34 = (Integer)iterator.next();
                if (n10 <= 0) break;
                co co6 = OldInventoryManager.aER.bgK.cHV.fi(n34);
                n9 = co6.cWZ;
                if (n10 >= n9) {
                    this.J(n34);
                    n10 -= n9;
                    continue;
                }
                this.g(n34, n9 - n10);
                n10 = 0;
            }
        }
        if (n26 > ((Number)this.afR.wD()).intValue()) {
            n10 = n26 - ((Number)this.afR.wD()).intValue();
            Iterator iterator = arrayList8.iterator();
            while (iterator.hasNext()) {
                int n35 = (Integer)iterator.next();
                if (n10 <= 0) break;
                co co7 = OldInventoryManager.aER.bgK.cHV.fi(n35);
                n9 = co7.cWZ;
                if (n10 >= n9) {
                    this.J(n35);
                    n10 -= n9;
                    continue;
                }
                this.g(n35, n9 - n10);
                n10 = 0;
            }
        }
        if (n27 > ((Number)this.afS.wD()).intValue()) {
            n10 = n27 - ((Number)this.afS.wD()).intValue();
            Iterator iterator = arrayList9.iterator();
            while (iterator.hasNext()) {
                int n36 = (Integer)iterator.next();
                if (n10 <= 0) break;
                co co8 = OldInventoryManager.aER.bgK.cHV.fi(n36);
                n9 = co8.cWZ;
                if (n10 >= n9) {
                    this.J(n36);
                    n10 -= n9;
                    continue;
                }
                this.g(n36, n9 - n10);
                n10 = 0;
            }
        }
        if (n28 > ((Number)this.afT.wD()).intValue()) {
            n10 = n28 - ((Number)this.afT.wD()).intValue();
            Iterator iterator = arrayList10.iterator();
            while (iterator.hasNext()) {
                int n37 = (Integer)iterator.next();
                if (n10 <= 0) break;
                co co9 = OldInventoryManager.aER.bgK.cHV.fi(n37);
                n9 = co9.cWZ;
                if (n10 >= n9) {
                    this.J(n37);
                    n10 -= n9;
                    continue;
                }
                this.g(n37, n9 - n10);
                n10 = 0;
            }
        }
        n10 = ((Number)this.afU.wD()).intValue() - 1;
        if (((Number)this.afU.wD()).intValue() != 0 && n15 != -1 && !this.f(n15, n10)) {
            this.h(n15, n10);
        }
        int n38 = ((Number)this.afV.wD()).intValue() - 1;
        if (bl3 && n16 != -1 && !this.f(n16, n38)) {
            this.h(n16, n38);
        }
        int n39 = ((Number)this.afW.wD()).intValue() - 1;
        if (!this.a(this.afW, n15, n16) && ((Number)this.afW.wD()).intValue() != 0 && n17 != -1 && !this.f(n17, n39)) {
            this.h(n17, n39);
        }
        int n40 = ((Number)this.afX.wD()).intValue() - 1;
        if (!this.a(this.afX, n15, n16) && ((Number)this.afX.wD()).intValue() != 0 && n18 != -1 && !this.f(n18, n40)) {
            this.h(n18, n40);
        }
        n9 = ((Number)this.afY.wD()).intValue() - 1;
        if (!this.a(this.afY, n15, n16) && ((Number)this.afY.wD()).intValue() != 0 && n19 != -1 && !this.f(n19, n9)) {
            this.h(n19, n9);
        }
        n8 = ((Number)this.agb.wD()).intValue() - 1;
        if (!this.a(this.agb, n15, n16) && ((Number)this.agb.wD()).intValue() != 0 && n20 != -1 && !this.f(n20, n8)) {
            this.h(n20, n8);
        }
        int n41 = ((Number)this.agc.wD()).intValue() - 1;
        boolean bl4 = bl2 = n20 != -1 && ((Number)this.agc.wD()).intValue() == ((Number)this.agb.wD()).intValue();
        if (!(this.a(this.agc, n15, n16) || ((Number)this.agc.wD()).intValue() == 0 || n21 == -1 || this.f(n21, n41) || bl2)) {
            this.h(n21, n41);
        }
        if (((Number)this.aga.wD()).intValue() != 0 && this.aga.wP().intValue() != 0) {
            n7 = Math.min(((Number)this.aga.wD()).intValue(), this.aga.wP().intValue());
            n6 = Math.max(((Number)this.aga.wD()).intValue(), this.aga.wP().intValue());
            n5 = n6 - n7 + 1;
            arrayList2.sort((tq2, tq3) -> {
                by by2 = (by)tq2.bO().bP();
                by by3 = (by)tq3.bO().bP();
                if (((Boolean)this.afM.wD()).booleanValue()) {
                    boolean bl2 = by.gb(tq2.bO().yc());
                    boolean bl3 = by.gb(tq3.bO().yc());
                    if (bl2 && !bl3) {
                        return -1;
                    }
                    if (!bl2 && bl3) {
                        return 1;
                    }
                }
                List<net.minecraft.potion.d> list = by2.aH(tq2.bO());
                List<net.minecraft.potion.d> list2 = by3.aH(tq3.bO());
                if (list.isEmpty() && list2.isEmpty()) {
                    return 0;
                }
                if (list.isEmpty()) {
                    return 1;
                }
                if (list2.isEmpty()) {
                    return -1;
                }
                return Integer.compare(aik.ax(by3.aH(tq3.bO()).get(0).aje()), aik.ax(by2.aH(tq2.bO()).get(0).aje()));
            });
            for (n4 = 0; n4 < n5 && arrayList2.size() > n4; ++n4) {
                n3 = n7 - 1 + n4;
                n2 = ((tq)arrayList2.get(n4)).jW();
                if (this.f(n2, n3)) continue;
                this.h(n2, n3);
            }
        }
        if (((Number)this.agd.wD()).intValue() != 0 && this.agd.wP().intValue() != 0) {
            n7 = Math.min(((Number)this.agd.wD()).intValue(), this.agd.wP().intValue());
            n6 = Math.max(((Number)this.agd.wD()).intValue(), this.agd.wP().intValue());
            n5 = n6 - n7 + 1;
            arrayList3.sort((tq2, tq3) -> {
                bg bg2 = (bg)tq2.bO().bP();
                bg bg3 = (bg)tq3.bO().bP();
                return Float.compare(bg3.aF(tq3.bO()), bg2.aF(tq2.bO()));
            });
            for (n4 = 0; n4 < n5 && arrayList3.size() > n4; ++n4) {
                n3 = n7 - 1 + n4;
                n2 = ((tq)arrayList3.get(n4)).jW();
                if (this.f(n2, n3)) continue;
                this.h(n2, n3);
            }
        }
        if (this.kv() && !this.aec) {
            this.ku();
        }
    };
    @EventLink
    public final Listener<AttackEvent> agk = attackEvent -> {
        this.BV = 0;
    };
    @EventLink
    public final Listener<en> agl = en2 -> {
        if (this.kn() && this.aeg > 0) {
            this.aeh = Math.max(this.aeh, this.hk());
        }
        this.aeg = 0;
        if (this.kn() && this.aeh > 0) {
            OldInventoryManager.aER.bgK.setSprinting(false);
            --this.aeh;
        } else if (!this.kn()) {
            this.aeh = 0;
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> agm = packetSendEvent -> {
        k k2;
        if (packetSendEvent.dq() instanceof k && ((k2 = (k)packetSendEvent.dq()).ls() == null || k2.ls().bP() != Items.cQB)) {
            this.aeb = 0;
        }
    };

    @Override
    public void onDisable() {
        if (this.kv()) {
            this.ku();
        }
        this.aeg = 0;
        this.aeh = 0;
    }

    private void kt() {
        if (!this.aed) {
            ahn.m(new z(net.minecraft.network.play.client.aa.dbR));
            this.aed = true;
            this.km();
        }
    }

    private void ku() {
        if (this.aed) {
            ahn.m(new net.minecraft.network.play.client.q(OldInventoryManager.aER.bgK.cHX.cSL));
            this.aed = false;
            this.km();
        }
    }

    private boolean kv() {
        boolean bl2 = this.e(InventoryMove.class).isEnabled();
        boolean bl3 = !(OldInventoryManager.aER.bgR instanceof q);
        boolean bl4 = this.e(Scaffold.class).isEnabled();
        return bl2 && bl3 && !bl4;
    }

    private void J(int n2) {
        if (!(this.aec && this.aee > 0L || bt.a(n2, (Boolean)this.afK.wD() == false))) {
            if (this.kv()) {
                this.kt();
            }
            OldInventoryManager.aER.bgu.a(OldInventoryManager.aER.bgK.cHX.cSL, this.I(n2), 1, 4, OldInventoryManager.aER.bgK);
            this.km();
            this.aee = Math.round(ahj.l(((Number)this.afI.wD()).intValue(), this.afI.wP().intValue()));
            this.agi.aX();
            this.aec = true;
        }
    }

    private void g(int n2, int n3) {
        if (!(this.aec && this.aee > 0L || bt.a(n2, (Boolean)this.afK.wD() == false))) {
            if (this.kv()) {
                this.kt();
            }
            OldInventoryManager.aER.bgu.a(OldInventoryManager.aER.bgK.cHX.cSL, this.I(n2), 0, 0, OldInventoryManager.aER.bgK);
            System.out.println(n3);
            for (int i2 = 0; i2 < n3; ++i2) {
                OldInventoryManager.aER.bgu.a(OldInventoryManager.aER.bgK.cHX.cSL, this.I(n2), 1, 0, OldInventoryManager.aER.bgK);
            }
            this.km();
            this.aee = Math.round(ahj.l(((Number)this.afI.wD()).intValue(), this.afI.wP().intValue()));
            this.agi.aX();
            this.aec = true;
        }
    }

    private void h(int n2, int n3) {
        if (!(this.aec && this.aee > 0L || bt.a(n2, (Boolean)this.afL.wD() == false))) {
            if (this.kv()) {
                this.kt();
            }
            if (n3 < 0 || n3 > 8) {
                return;
            }
            OldInventoryManager.aER.bgu.a(OldInventoryManager.aER.bgK.cHX.cSL, this.I(n2), n3, 2, OldInventoryManager.aER.bgK);
            this.km();
            this.aee = Math.round(ahj.l(((Number)this.afI.wD()).intValue(), this.afI.wP().intValue()));
            this.agi.aX();
            this.aec = true;
        }
    }

    private void H(int n2) {
        if (!(this.aec && this.aee > 0L || bt.a(n2, (Boolean)this.afL.wD() == false))) {
            if (this.kv()) {
                this.kt();
            }
            OldInventoryManager.aER.bgu.a(OldInventoryManager.aER.bgK.cHX.cSL, this.I(n2), 0, 1, OldInventoryManager.aER.bgK);
            this.km();
            this.aee = Math.round(ahj.l(((Number)this.afI.wD()).intValue(), this.afI.wP().intValue()));
            this.agi.aX();
            this.aec = true;
        }
    }

    private void km() {
        if (this.kn()) {
            ++this.aeg;
        }
    }

    private boolean kn() {
        InventoryMove inventoryMove = this.e(InventoryMove.class);
        return inventoryMove != null && inventoryMove.isEnabled() && inventoryMove.hj();
    }

    private int hk() {
        InventoryMove inventoryMove = this.e(InventoryMove.class);
        if (inventoryMove == null) {
            return 9;
        }
        return inventoryMove.hk();
    }

    public boolean jY() {
        return this.agi.T(this.aee) && this.aea >= 10 && this.BV >= 10 && this.aeb >= 10 && (this.kv() || OldInventoryManager.aER.bgR instanceof q);
    }

    private boolean a(NumberValue numberValue, int n2, int n3) {
        int n4 = ((Number)numberValue.wD()).intValue();
        return n4 != 0 && (n2 != -1 && ((Number)this.afU.wD()).intValue() == n4 || n3 != -1 && ((Number)this.afV.wD()).intValue() == n4);
    }

    private float o(co co2) {
        cp cp2 = (cp)co2.bP();
        int n2 = l.d(a.cqg.cqw, co2);
        int n3 = l.d(a.cqk.cqw, co2);
        return (float)((double)cp2.adI() + (double)n2 * 1.25 + (double)n3 * 2.5);
    }

    private float p(co co2) {
        ai ai2 = (ai)co2.bP();
        int n2 = l.d(a.cqg.cqw, co2);
        return n2;
    }

    private float q(co co2) {
        d d2 = co2.bP();
        int n2 = l.d(a.cqm.cqw, co2);
        switch (n2) {
            case 1: {
                n2 = 30;
                break;
            }
            case 2: {
                n2 = 69;
                break;
            }
            case 3: {
                n2 = 120;
                break;
            }
            case 4: {
                n2 = 186;
                break;
            }
            case 5: {
                n2 = 271;
                break;
            }
            default: {
                n2 = 0;
            }
        }
        if (d2 instanceof bw) {
            bw bw2 = (bw)d2;
            return bw2.adY().adH() + (float)n2;
        }
        if (d2 instanceof cn) {
            cn cn2 = (cn)d2;
            return cn2.adY().adH() + (float)n2;
        }
        if (d2 instanceof ac) {
            ac ac2 = (ac)d2;
            return ac2.adY().adH() + (float)n2;
        }
        return 0.0f;
    }

    private int n(co co2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return 0;
    }

    private int r(co co2) {
        y y2 = (y)co2.bP();
        return y2.cVI + l.a(new co[]{co2}, ad.dvl);
    }

    private boolean f(int n2, int n3) {
        return n3 >= 0 && n3 <= 8 && n2 >= 0 && n2 <= 8 && n2 == n3;
    }

    private int I(int n2) {
        if (n2 >= 0 && n2 <= 8) {
            return n2 + 36;
        }
        if (n2 >= 9 && n2 <= 35) {
            return n2;
        }
        if (n2 == 36) {
            return 8;
        }
        if (n2 == 37) {
            return 7;
        }
        if (n2 == 38) {
            return 6;
        }
        if (n2 == 39) {
            return 5;
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

