/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomUtils
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.akr;
import hackclient.rise.aks;
import hackclient.rise.bb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.fg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import org.apache.commons.lang3.RandomUtils;

@gl(aliases={"module.other.insults.name"}, description="module.other.insults.description", category=gj.PLAYER)
public final class rx
extends gi {
    public final akp Vb = new akp("Mode", this).a(new akg[]{new aks("Default")}).a(new akg[]{new aks("Watchdog")}).a(new akg[]{new aks("WhatsApp")}).a(new akg[]{new aks("CSGO")}).a(new akg[]{new aks("NerdyAss")}).co("Default");
    public final Map<String, List<String>> Vc = new HashMap<String, List<String>>();
    private final akr Vd = new akr("Prefix", (gi)this, "");
    private final akq Ve = new akq("Delay", this, (Number)0, (Number)0, (Number)50, (Number)1);
    private final aki Vf = new aki("Randomizer", (gi)this, (Boolean)false);
    private final String[] Vg = new String[]{"Wow! My combo is Rise'n!", "Why would someone as bad as you not use Rise 6.0?", "Here's your ticket to spectator from Rise 6.0!", "I see you're a pay to lose player, huh?", "Do you need some PvP advice? Well Rise 6.0 is all you need.", "Hey! Wise up, don't waste another day without Rise.", "You didn't even stand a chance against Rise.", "We regret to inform you that your free trial of life has unfortunately expired.", "RISE against other cheaters by getting Rise!", "You can pay for that loss by getting Rise.", "Remember to use hand sanitizer to get rid of bacteria like you!", "Hey, try not to drown in your own salt.", "Having problems with forgetting to left click? Rise 6.0 can fix it!", "Come on, is that all you have against Rise 6.0?", "Rise up today by getting Rise 6.0!", "Get Rise, you need it.", "how about you rise up to heaven by ending it", "Did you know Watchdog has banned 6346 players in the last 7 days."};
    private final String[] Vh = new String[]{"Add me on WhatsApp "};
    private final String Vi = "LOL %s GOT SNIPED BY NERDYASS ON YOUTUBE";
    private final String[] Vj = new String[]{"Missed %s due to correction", "Missed %s due to spread", "Missed %s due to prediction error", "Missed %s due to invalid backtrack", "Missed %s due to ?", "Shot at head, and missed head, but hit anyways because of spread (lol)", "Missed %s due to resolver"};
    private a Vk;
    private int hV;
    @dm
    public final dk<ei> Vl = ei2 -> {
        if (this.Vk != null && !rx.aER.bgF.dCY.contains(this.Vk)) {
            if ((double)this.hV >= (double)((Number)this.Ve.wD()).intValue() + Math.random() * 2.0 && !bb.aW()) {
                Object object = "";
                switch (((akg)this.Vb.wD()).getName()) {
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
                    rx.aER.bgK.sendChatMessage((String)object + " " + string);
                } else {
                    rx.aER.bgK.sendChatMessage((String)object);
                }
                this.Vk = null;
            }
            ++this.hV;
        }
    };
    @dm
    public final dk<eq> Vm = eq2 -> {
        r r2 = eq2.dc();
        if (r2 instanceof a) {
            this.Vk = (a)r2;
            this.hV = 0;
        }
    };
    @dm
    public final dk<fg> Vn = fg2 -> {
        this.Vk = null;
        this.hV = 0;
    };
}

