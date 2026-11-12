/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomUtils
 */
package rise.module.impl.player;

import hackclient.rise.aik;
import hackclient.rise.akr;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.fg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import org.apache.commons.lang3.RandomUtils;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.other.insults.name"}, description="module.other.insults.description", category=Category.PLAYER)
public final class Insults
extends Module {
    public final ModeValue Vb = new ModeValue("Mode", this).a(new Mode[]{new aks("Default")}).a(new Mode[]{new aks("Watchdog")}).a(new Mode[]{new aks("WhatsApp")}).a(new Mode[]{new aks("CSGO")}).a(new Mode[]{new aks("NerdyAss")}).co("Default");
    public final Map<String, List<String>> Vc = new HashMap<String, List<String>>();
    private final akr Vd = new akr("Prefix", (Module)this, "");
    private final NumberValue Ve = new NumberValue("Delay", this, (Number)0, (Number)0, (Number)50, (Number)1);
    private final BooleanValue Vf = new BooleanValue("Randomizer", (Module)this, (Boolean)false);
    private final String[] Vg = new String[]{"Wow! My combo is Rise'n!", "Why would someone as bad as you not use Rise 6.0?", "Here's your ticket to spectator from Rise 6.0!", "I see you're a pay to lose player, huh?", "Do you need some PvP advice? Well Rise 6.0 is all you need.", "Hey! Wise up, don't waste another day without Rise.", "You didn't even stand a chance against Rise.", "We regret to inform you that your free trial of life has unfortunately expired.", "RISE against other cheaters by getting Rise!", "You can pay for that loss by getting Rise.", "Remember to use hand sanitizer to get rid of bacteria like you!", "Hey, try not to drown in your own salt.", "Having problems with forgetting to left click? Rise 6.0 can fix it!", "Come on, is that all you have against Rise 6.0?", "Rise up today by getting Rise 6.0!", "Get Rise, you need it.", "how about you rise up to heaven by ending it", "Did you know Watchdog has banned 6346 players in the last 7 days."};
    private final String[] Vh = new String[]{"Add me on WhatsApp "};
    private final String Vi = "LOL %s GOT SNIPED BY NERDYASS ON YOUTUBE";
    private final String[] Vj = new String[]{"Missed %s due to correction", "Missed %s due to spread", "Missed %s due to prediction error", "Missed %s due to invalid backtrack", "Missed %s due to ?", "Shot at head, and missed head, but hit anyways because of spread (lol)", "Missed %s due to resolver"};
    private a Vk;
    private int hV;
    @EventLink
    public final Listener<PreMotionEvent> Vl = preMotionEvent -> {
        if (this.Vk != null && !Insults.aER.bgF.dCY.contains(this.Vk)) {
            if ((double)this.hV >= (double)((Number)this.Ve.wD()).intValue() + Math.random() * 2.0 && !bb.aW()) {
                Object object = "";
                switch (((Mode)this.Vb.wD()).getName()) {
                    case "Default": {
                        object = this.Vg[RandomUtils.nextInt((int)0, (int)this.Vg.length)];
                        break;
                    }
                    case "Watchdog": {
                        object = "[STAFF] [WATCHDOG] %s reeled in.";
                        break;
                    }
                    case "WhatsApp": {
                        object = this.Vh[RandomUtils.nextInt((int)0, (int)this.Vh.length)];
                        break;
                    }
                    case "CSGO": {
                        object = this.Vj[RandomUtils.nextInt((int)0, (int)this.Vj.length)];
                        break;
                    }
                    case "NerdyAss": {
                        object = "LOL %s GOT SNIPED BY NERDYASS ON YOUTUBE";
                    }
                }
                object = String.format((String)object, aik.g(this.Vk));
                if (!((String)this.Vd.wD()).isEmpty()) {
                    object = (String)this.Vd.wD() + " " + (String)object;
                }
                String string = new Random().ints(97, 123).limit(10L).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
                if (((Boolean)this.Vf.wD()).booleanValue()) {
                    Insults.aER.bgK.sendChatMessage((String)object + " " + string);
                } else {
                    Insults.aER.bgK.sendChatMessage((String)object);
                }
                this.Vk = null;
            }
            ++this.hV;
        }
    };
    @EventLink
    public final Listener<AttackEvent> Vm = attackEvent -> {
        r r2 = attackEvent.dc();
        if (r2 instanceof a) {
            this.Vk = (a)r2;
            this.hV = 0;
        }
    };
    @EventLink
    public final Listener<fg> Vn = fg2 -> {
        this.Vk = null;
        this.hV = 0;
    };
}

