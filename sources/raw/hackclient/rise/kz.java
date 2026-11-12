/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akq;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.block.BlockAir;
import net.minecraft.item.af;

@gl(aliases={"module.ghost.legitscaffold.name", "Eagle"}, description="module.ghost.eagle.description", category=gj.GHOST)
public class kz
extends gi {
    private final akj AU = new akj("Length", this, (Number)1, (Number)1, (Number)1, (Number)4, (Number)1);
    private final akq AV = new akq("Sneak speed multiplier", this, (Number)0.3, (Number)0.2, (Number)1, (Number)0.05);
    private final aki AW = new aki("Only on ground", (gi)this, (Boolean)false);
    private final aki AX = new aki("Only when holding blocks", (gi)this, (Boolean)false);
    private final aki AY = new aki("Only when moving backwards", (gi)this, (Boolean)false);
    private final aki AZ = new aki("Only on Sneak", (gi)this, (Boolean)true);
    private boolean Ba;
    private int Bb;
    private int Bc;
    @dm
    public final dk<ei> Bd = ei2 -> {
        if (kz.aER.bgK.Vk() != null && !(kz.aER.bgK.Vk().bP() instanceof af) && ((Boolean)this.AX.wD()).booleanValue()) {
            if (this.Ba) {
                this.Ba = false;
            }
            return;
        }
        if (!(!kz.aER.bgK.aO && ((Boolean)this.AW.wD()).booleanValue() || !(aik.p(0.0, -1.0, 0.0) instanceof BlockAir) || kz.aER.aIY.chm.Re() && ((Boolean)this.AY.wD()).booleanValue())) {
            if (!this.Ba) {
                this.Ba = true;
            }
        } else if (this.Ba) {
            this.Ba = false;
        }
        if (this.Ba) {
            this.Bc = this.AU.wK().intValue();
            kz.aER.aIY.chs.ay(false);
        }
        this.Bb = this.Ba ? ++this.Bb : 0;
    };
    @dm
    public final dk<dz> Be = dz2 -> {
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            if (bu.bO().bP() instanceof af) {
                dz2.setSneak(this.Bc > 0 && (kz.aER.aIY.chr.Re() || (Boolean)this.AZ.wD() == false) || kz.aER.aIY.chr.Re() && (Boolean)this.AZ.wD() == false);
            }
        }
        --this.Bc;
        if (this.Bc > 0 && this.Bb <= 2) {
            dz2.setSneakSlowDownMultiplier(((Number)this.AV.wD()).doubleValue());
        }
    };

    @Override
    public void onDisable() {
        if (this.Ba) {
            this.Ba = false;
        }
    }
}

