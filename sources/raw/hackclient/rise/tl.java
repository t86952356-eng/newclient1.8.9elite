/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.potion.a;
import net.minecraft.util.b;
import net.minecraft.util.cf;

@gl(aliases={"module.player.fastbreak.name"}, description="module.player.fastbreak.description", category=gj.PLAYER)
public final class tl
extends gi {
    public final akp adh = new akp("Mode", this).a(new akg[]{new aks("Percentage")}).a(new akg[]{new aks("Ticks")}).co("Ticks");
    public final akq adi = new akq("Speed", this, (Number)50, (Number)0, (Number)100, (Number)1, () -> ((akg)this.adh.wD()).getName().equals("Ticks"));
    public final akq adj = new akq("Ticks", this, (Number)1, (Number)1, (Number)100, (Number)1, () -> ((akg)this.adh.wD()).getName().equals("Percentage"));
    public final aki adk = new aki("Ignore Mining Fatigue", (gi)this, (Boolean)false);
    public final aki adl = new aki("Equal Air/Ground Dig", (gi)this, (Boolean)true);
    @dm
    public final dk<ej> adm = ej2 -> {
        if (((Boolean)this.adk.wD()).booleanValue()) {
            tl.aER.bgK.eL(a.dgz.getId());
        }
        tl.aER.bgu.bDz = 0;
        double d2 = 0.0;
        switch (((akg)this.adh.wD()).getName()) {
            case "Percentage": {
                d2 = ((Number)this.adi.wD()).doubleValue() / 100.0;
                if (tl.aER.bgK.tR == 1 && ((Boolean)this.adl.wD()).booleanValue()) {
                    tl.aER.bgu.bDx /= 5.0f;
                    d2 = 0.8f;
                }
                if (aik.p(0.0, tl.aER.bgK.ue, 0.0) == Blocks.cLc || tl.aER.bgK.aO || !((Boolean)this.adl.wD()).booleanValue()) break;
                tl.aER.bgu.bDx *= 5.0f;
                d2 -= (double)0.8f;
                break;
            }
            case "Ticks": {
                if (tl.aER.bhc == null || tl.aER.bhc.dzu != cf.dzy) break;
                b b2 = tl.aER.bhc.dg();
                Block block = aik.u(b2);
                float f2 = block.a(tl.aER.bgK, tl.aER.bgF, b2);
                d2 = f2 * (float)((Number)this.adj.wD()).intValue();
                if (tl.aER.bgK.tR == 1 && ((Boolean)this.adl.wD()).booleanValue()) {
                    tl.aER.bgu.bDx /= 5.0f;
                    d2 = 0.81f;
                }
                if (aik.p(0.0, tl.aER.bgK.ue, 0.0) == Blocks.cLc || tl.aER.bgK.aO || !((Boolean)this.adl.wD()).booleanValue()) break;
                tl.aER.bgu.bDx *= 5.0f;
                d2 -= (double)0.81f;
            }
        }
        if ((double)tl.aER.bgu.bDx > 1.0 - d2 && tl.aER.bgu.bDx < 0.99f) {
            tl.aER.bgu.bDx = 0.99f;
        }
    };

    @Generated
    public akq jV() {
        return this.adi;
    }
}

