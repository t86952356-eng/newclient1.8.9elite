/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.player;

import hackclient.rise.aik;
import hackclient.rise.aks;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.potion.a;
import net.minecraft.util.b;
import net.minecraft.util.cf;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.player.fastbreak.name"}, description="module.player.fastbreak.description", category=Category.PLAYER)
public final class FastBreak
extends Module {
    public final ModeValue adh = new ModeValue("Mode", this).a(new Mode[]{new aks("Percentage")}).a(new Mode[]{new aks("Ticks")}).co("Ticks");
    public final NumberValue adi = new NumberValue("Speed", this, (Number)50, (Number)0, (Number)100, (Number)1, () -> ((Mode)this.adh.wD()).getName().equals("Ticks"));
    public final NumberValue adj = new NumberValue("Ticks", this, (Number)1, (Number)1, (Number)100, (Number)1, () -> ((Mode)this.adh.wD()).getName().equals("Percentage"));
    public final BooleanValue adk = new BooleanValue("Ignore Mining Fatigue", (Module)this, (Boolean)false);
    public final BooleanValue adl = new BooleanValue("Equal Air/Ground Dig", (Module)this, (Boolean)true);
    @EventLink
    public final Listener<PreUpdateEvent> adm = preUpdateEvent -> {
        if (((Boolean)this.adk.wD()).booleanValue()) {
            FastBreak.aER.bgK.eL(a.dgz.getId());
        }
        FastBreak.aER.bgu.bDz = 0;
        double d2 = 0.0;
        switch (((Mode)this.adh.wD()).getName()) {
            case "Percentage": {
                d2 = ((Number)this.adi.wD()).doubleValue() / 100.0;
                if (FastBreak.aER.bgK.tR == 1 && ((Boolean)this.adl.wD()).booleanValue()) {
                    FastBreak.aER.bgu.bDx /= 5.0f;
                    d2 = 0.8f;
                }
                if (aik.p(0.0, FastBreak.aER.bgK.ue, 0.0) == Blocks.cLc || FastBreak.aER.bgK.aO || !((Boolean)this.adl.wD()).booleanValue()) break;
                FastBreak.aER.bgu.bDx *= 5.0f;
                d2 -= (double)0.8f;
                break;
            }
            case "Ticks": {
                if (FastBreak.aER.bhc == null || FastBreak.aER.bhc.dzu != cf.dzy) break;
                b b2 = FastBreak.aER.bhc.dg();
                Block block = aik.u(b2);
                float f2 = block.a(FastBreak.aER.bgK, FastBreak.aER.bgF, b2);
                d2 = f2 * (float)((Number)this.adj.wD()).intValue();
                if (FastBreak.aER.bgK.tR == 1 && ((Boolean)this.adl.wD()).booleanValue()) {
                    FastBreak.aER.bgu.bDx /= 5.0f;
                    d2 = 0.81f;
                }
                if (aik.p(0.0, FastBreak.aER.bgK.ue, 0.0) == Blocks.cLc || FastBreak.aER.bgK.aO || !((Boolean)this.adl.wD()).booleanValue()) break;
                FastBreak.aER.bgu.bDx *= 5.0f;
                d2 -= (double)0.81f;
            }
        }
        if ((double)FastBreak.aER.bgu.bDx > 1.0 - d2 && FastBreak.aER.bgu.bDx < 0.99f) {
            FastBreak.aER.bgu.bDx = 0.99f;
        }
    };

    @Generated
    public NumberValue jV() {
        return this.adi;
    }
}

