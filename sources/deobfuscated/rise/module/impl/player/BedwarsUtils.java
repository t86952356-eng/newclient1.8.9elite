/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.afl;
import hackclient.rise.fg;
import java.util.Collection;
import java.util.HashSet;
import net.minecraft.item.aa;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.y;
import net.minecraft.potion.a;
import net.minecraft.util.an;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.other.bwutils.name"}, description="module.other.bwutils.description", category=Category.PLAYER)
public final class BedwarsUtils
extends Module {
    private final Collection<net.minecraft.entity.player.a> TS = new HashSet<net.minecraft.entity.player.a>();
    private final Collection<net.minecraft.entity.player.a> TT = new HashSet<net.minecraft.entity.player.a>();
    private final Collection<net.minecraft.entity.player.a> TU = new HashSet<net.minecraft.entity.player.a>();
    private final Collection<net.minecraft.entity.player.a> TV = new HashSet<net.minecraft.entity.player.a>();
    private final Collection<net.minecraft.entity.player.a> TW = new HashSet<net.minecraft.entity.player.a>();
    private final Collection<net.minecraft.entity.player.a> TX = new HashSet<net.minecraft.entity.player.a>();
    private final Collection<net.minecraft.entity.player.a> TY = new HashSet<net.minecraft.entity.player.a>();
    private final BooleanValue TZ = new BooleanValue("Sword Reveal", (Module)this, (Boolean)true);
    private final BooleanValue Ua = new BooleanValue("Include Stone", (Module)this, (Boolean)false, () -> (Boolean)this.TZ.wD() == false);
    private final BooleanValue Ub = new BooleanValue("Armor Reveal", (Module)this, (Boolean)true);
    private final BooleanValue Uc = new BooleanValue("Invisible Check", (Module)this, (Boolean)true);
    private final BooleanValue Ud = new BooleanValue("Invisibility Status", (Module)this, (Boolean)false);
    private boolean Ue = false;
    @EventLink
    private final Listener<PreUpdateEvent> Uf = preUpdateEvent -> {
        for (net.minecraft.entity.player.a a2 : BedwarsUtils.aER.bgF.dCY) {
            block23: {
                Object object;
                block22: {
                    if (BedwarsUtils.aER.bgK != null) break block22;
                    if (BedwarsUtils.aER.bgF == null) break block23;
                }
                if (a2.Vk() != null) {
                    object = a2.Vk().bP();
                    if (((Boolean)this.TZ.wD()).booleanValue() && object instanceof cp) {
                        String string = ((cp)object).aex().toLowerCase();
                        if (string.contains("iron") && !this.TS.contains(a2)) {
                            this.TS.add(a2);
                            afl.b("Player " + String.valueOf((Object)an.dvX) + a2.xU() + String.valueOf((Object)an.dwa) + " has an " + String.valueOf((Object)an.dvW) + "Iron Sword", new Object[0]);
                        }
                        if (string.contains("emerald") && !this.TT.contains(a2)) {
                            this.TT.add(a2);
                            afl.b("Player " + String.valueOf((Object)an.dvX) + a2.xU() + String.valueOf((Object)an.dwa) + " has a " + String.valueOf((Object)an.dvW) + "Diamond Sword", new Object[0]);
                        }
                        if (string.contains("stone") && !this.TU.contains(a2)) {
                            this.TU.add(a2);
                            if (((Boolean)this.Ua.wD()).booleanValue()) {
                                afl.b("Player " + String.valueOf((Object)an.dvX) + a2.xU() + String.valueOf((Object)an.dwa) + " has a " + String.valueOf((Object)an.dvW) + "Stone Sword", new Object[0]);
                            }
                        }
                        if (string.contains("wood")) {
                            this.TU.remove(a2);
                            this.TS.remove(a2);
                            this.TT.remove(a2);
                        }
                    }
                }
                if (((Boolean)this.Ub.wD()).booleanValue() && (object = a2.eH(1)) != null && ((co)object).bP() instanceof y) {
                    if (((y)((co)object).bP()).adN().equals((Object)aa.cVM) && !this.TW.contains(a2)) {
                        this.TW.add(a2);
                        afl.b("Player " + String.valueOf((Object)an.dvX) + a2.xU() + String.valueOf((Object)an.dwa) + " has " + String.valueOf((Object)an.dvY) + "Chain Armor", new Object[0]);
                    }
                    if (((y)((co)object).bP()).adN().equals((Object)aa.cVN) && !this.TX.contains(a2)) {
                        this.TX.add(a2);
                        afl.b("Player " + String.valueOf((Object)an.dvX) + a2.xU() + String.valueOf((Object)an.dwa) + " has " + String.valueOf((Object)an.dvY) + "Iron Armor", new Object[0]);
                    }
                    if (((y)((co)object).bP()).adN().equals((Object)aa.cVP) && !this.TV.contains(a2)) {
                        this.TV.add(a2);
                        afl.b("Player " + String.valueOf((Object)an.dvX) + a2.xU() + String.valueOf((Object)an.dwa) + " has " + String.valueOf((Object)an.dvY) + "Diamond Armor", new Object[0]);
                    }
                    if (((y)((co)object).bP()).adN().equals((Object)aa.cVL)) {
                        this.TV.remove(a2);
                        this.TX.remove(a2);
                        this.TW.remove(a2);
                    }
                }
                if (((Boolean)this.Uc.wD()).booleanValue()) {
                    if (a2.b(a.dgJ) != null) {
                        if (!this.TY.contains(a2)) {
                            this.TY.add(a2);
                            afl.b("Player " + String.valueOf((Object)an.dvX) + a2.xU() + String.valueOf((Object)an.dwa) + " is now " + String.valueOf((Object)an.dvR) + "Invisible", new Object[0]);
                        }
                    } else if (this.TY.contains(a2)) {
                        this.TY.remove(a2);
                        afl.b("Player " + String.valueOf((Object)an.dvX) + a2.xU() + String.valueOf((Object)an.dwa) + " is now " + String.valueOf((Object)an.dvR) + "Visible", new Object[0]);
                    }
                }
                if (((Boolean)this.Ud.wD()).booleanValue()) {
                    if (BedwarsUtils.aER.bgK.b(a.dgJ) == null) continue;
                    this.Ue = true;
                    if (BedwarsUtils.aER.bgK.aRg % 200 != 0) continue;
                    afl.b("Your Invisibility" + String.valueOf((Object)an.dvX) + " expires " + String.valueOf((Object)an.dwh) + "in " + String.valueOf((Object)an.dvX) + BedwarsUtils.aER.bgK.b(a.dgJ).getDuration() / 20 + String.valueOf((Object)an.dwh) + " second(s)", new Object[0]);
                    continue;
                }
                if (!this.Ue) continue;
                afl.b("Invisibility" + String.valueOf((Object)an.dvX) + " Expired", new Object[0]);
                this.Ue = false;
                continue;
            }
            this.TT.clear();
            this.TS.clear();
            this.TU.clear();
            this.TV.clear();
            this.TX.clear();
            this.TW.clear();
            this.TY.clear();
        }
    };
    @EventLink
    private final Listener<fg> Ug = fg2 -> {
        this.TT.clear();
        this.TS.clear();
        this.TU.clear();
        this.TW.clear();
        this.TX.clear();
        this.TV.clear();
        this.TY.clear();
    };
}

