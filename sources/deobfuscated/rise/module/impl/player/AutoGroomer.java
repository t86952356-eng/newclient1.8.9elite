/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.fg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.network.play.client.b;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.other.autogroomer.name"}, description="Helps you groom people.", category=Category.PLAYER)
public final class AutoGroomer
extends Module {
    private final Random TH = new Random();
    private final char[] TI = new char[]{'\u26cd', '\u26cc', '\u26d7', '\u26d7', '\u26df'};
    private final List<Integer> TJ = new ArrayList<Integer>();
    private final List<String> TK = Arrays.asList("can I have some tittie pics?", "do you wanna be above or below?", "I am gonna be pounding you 24/7", "I am gonna send you something okay? no sharing :wink:", "I am fine below or above", "you are gonna be riding this dick all night", "oh I am creaming just looking at you", "I want to make you cum.", "my balls are gonna be dry tonight thanks to you", "I am gonna relieve you all night", "daddy is ready.", "you will be screaming my name tonight", "fly up here and you can have as much as you want", "lick it off like that, until I ram your mouth.", "daddy wants your mouth on all of this tonight", "I bet you like daddy pounding you so hard that your knees give out and drag your face forward as I literally pound you flat into the bed.", "I'm so hard rn", "I'm dripping", "Just wait until we get home", "I want to taste you", "I love how hard you can make me come", "Get your ass on that bed.", "Daddy's gonna eat that pussy tonight.", "Daddy's all bricked up now.");
    private final BooleanValue TL = new BooleanValue("Chat Bypass", (Module)this, (Boolean)false);
    private final BooleanValue TM = new BooleanValue("DM Messages", (Module)this, (Boolean)false);
    private final BooleanValue TN = new BooleanValue("Spam", (Module)this, (Boolean)false);
    @EventLink
    private final Listener<PreMotionEvent> TO = preMotionEvent -> {
        if (!((Boolean)this.TM.wD()).booleanValue() && AutoGroomer.aER.bgK.aRg % 69 == 0) {
            String string = this.TK.get(this.TH.nextInt(this.TK.size()));
            if (((Boolean)this.TL.wD()).booleanValue()) {
                StringBuilder stringBuilder = new StringBuilder(string.length() * 2);
                for (int i2 = 0; i2 < string.length(); ++i2) {
                    char c2 = string.charAt(i2);
                    char c3 = this.TI[this.TH.nextInt(this.TI.length)];
                    stringBuilder.append(c2).append(c3);
                }
                string = stringBuilder.toString();
            }
            AutoGroomer.aER.bgK.sendChatMessage(string);
            return;
        }
        if (((Boolean)this.TN.wD()).booleanValue() && AutoGroomer.aER.bgK.aRg % 20 != 0) {
            return;
        }
        for (a a2 : AutoGroomer.aER.bgF.dCY) {
            if (a2 == AutoGroomer.aER.bgK || a2.isInvisible() || Client.a.x().a(a2) || !(a2.T((c)AutoGroomer.aER.bgK) < 64.0) || this.TJ.contains(a2.getEntityId()) && !((Boolean)this.TN.wD()).booleanValue()) continue;
            String string = this.TK.get(this.TH.nextInt(this.TK.size()));
            if (((Boolean)this.TL.wD()).booleanValue()) {
                StringBuilder stringBuilder = new StringBuilder(string.length() * 2);
                for (int i3 = 0; i3 < string.length(); ++i3) {
                    char c4 = string.charAt(i3);
                    char c5 = this.TI[this.TH.nextInt(this.TI.length)];
                    stringBuilder.append(c4).append(c5);
                }
                string = stringBuilder.toString();
            }
            aER.AU().u(new b("/msg " + a2.xU() + " " + string));
            this.TJ.add(a2.getEntityId());
        }
    };
    @EventLink
    private final Listener<fg> TP = fg2 -> this.TJ.clear();

    @Override
    public void onDisable() {
        this.TJ.clear();
    }

    @Override
    public void onEnable() {
        this.TJ.clear();
    }
}

