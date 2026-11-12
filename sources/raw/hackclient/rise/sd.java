/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.aik;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.ArrayList;
import net.minecraft.entity.r;
import net.minecraft.util.db;

@gl(aliases={"module.other.playernotifier.name"}, description="module.other.playernotifier.description", category=gj.PLAYER)
public final class sd
extends gi {
    private final akq VH = new akq("Notify Distance", this, (Number)35, (Number)10, (Number)50, (Number)1);
    private final aki VI = new aki("Notify Once", (gi)this, (Boolean)false);
    private db VJ = new db(0, 0, 0);
    private final String[] VK = new String[]{"\u00a7e", "\u00a76", "\u00a7c", "\u00a74"};
    private final ArrayList<r> VL = new ArrayList();
    @dm
    public final dk<ei> VM = ei2 -> {
        if (sd.aER.bgK.aRg % 25 != 0) {
            return;
        }
        aNC.execute(() -> {
            for (r r2 : sd.aER.bgF.dCY) {
                if (aik.D(r2) || a.a.x().a(r2) || r2 == sd.aER.bgK) continue;
                int n2 = (int)r2.getDistance(this.VJ.wt(), this.VJ.wu(), this.VJ.wx());
                if (n2 < ((Number)this.VH.wD()).intValue()) {
                    if (!this.VL.contains(r2) || !((Boolean)this.VI.wD()).booleanValue()) {
                        afl.b(this.r(n2) + r2.xU() + " is " + n2 + " blocks away from your bed.", new Object[0]);
                    } else {
                        afl.b("Didn't display: " + r2.xU(), new Object[0]);
                    }
                    this.VL.add(r2);
                    continue;
                }
                this.VL.remove(r2);
            }
        });
    };

    @Override
    public void onEnable() {
        this.VJ = new db(sd.aER.bgK.gW, sd.aER.bgK.gX, sd.aER.bgK.gY);
    }

    public String r(double d2) {
        double d3 = ((Number)this.VH.wD()).intValue();
        if (d2 < 9.0) {
            return this.VK[this.VK.length - 1];
        }
        for (String string : this.VK) {
            if (!(d2 > (d3 /= 2.0))) continue;
            return string;
        }
        return this.VK[this.VK.length - 1];
    }
}

