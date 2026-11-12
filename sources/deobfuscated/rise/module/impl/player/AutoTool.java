/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ain;
import hackclient.rise.bu;
import hackclient.rise.et;
import hackclient.rise.eu;
import net.minecraft.util.b;
import net.minecraft.util.cf;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.player.Scaffold;

@ModuleInfo(aliases={"module.player.autotool.name"}, description="module.player.autotool.description", category=Category.PLAYER)
public class AutoTool
extends Module {
    private int abD;
    private b jI;
    @EventLink(cH=4)
    public final Listener<eu> abE = eu2 -> {
        if (this.e(Scaffold.class).isEnabled()) {
            return;
        }
        if (eu2.dj() != AutoTool.aER.bgK) {
            return;
        }
        if (AutoTool.aER.bgK.aa(eu2.dg()) > 49.0) {
            return;
        }
        if (!this.jz()) {
            return;
        }
        if (!eu2.dg().equals(AutoTool.aER.bhc.dg())) {
            return;
        }
        this.abD = 15;
        this.jI = eu2.dg();
        this.jA();
    };
    @EventLink
    public final Listener<et> abF = et2 -> {
        this.abD = 0;
        this.jI = null;
    };
    @EventLink
    public final Listener<PreUpdateEvent> abG = preUpdateEvent -> this.jA();

    private boolean jz() {
        return AutoTool.aER.bgu != null && (AutoTool.aER.bgu.bDA || AutoTool.aER.aIY.chw.Re()) && AutoTool.aER.bhc != null && AutoTool.aER.bhc.dzu == cf.dzy;
    }

    public void jA() {
        if (this.e(Scaffold.class).isEnabled()) {
            return;
        }
        if (!this.jz()) {
            this.abD = 0;
            return;
        }
        if (AutoTool.aER.bhc == null || this.abD <= 0 || this.jI == null) {
            return;
        }
        if (AutoTool.aER.bhc.dzu != cf.dzy || !this.jI.equals(AutoTool.aER.bhc.dg())) {
            this.abD = 0;
            return;
        }
        --this.abD;
        int n2 = ain.v(this.jI);
        if (n2 != -1) {
            this.d(bu.class);
            bu.setSlot(n2);
        }
    }
}

