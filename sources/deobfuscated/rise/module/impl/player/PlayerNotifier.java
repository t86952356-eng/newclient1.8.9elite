/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.afl;
import hackclient.rise.aik;
import java.util.ArrayList;
import net.minecraft.entity.r;
import net.minecraft.util.db;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.other.playernotifier.name"}, description="module.other.playernotifier.description", category=Category.PLAYER)
public final class PlayerNotifier
extends Module {
    private final NumberValue VH = new NumberValue("Notify Distance", this, (Number)35, (Number)10, (Number)50, (Number)1);
    private final BooleanValue VI = new BooleanValue("Notify Once", (Module)this, (Boolean)false);
    private db VJ = new db(0, 0, 0);
    private final String[] VK = new String[]{"\u00a7e", "\u00a76", "\u00a7c", "\u00a74"};
    private final ArrayList<r> VL = new ArrayList();
    @EventLink
    public final Listener<PreMotionEvent> VM = preMotionEvent -> {
        if (PlayerNotifier.aER.bgK.aRg % 25 != 0) {
            return;
        }
        aNC.execute(() -> {
            for (r r2 : PlayerNotifier.aER.bgF.dCY) {
                if (aik.D(r2) || Client.a.x().a(r2) || r2 == PlayerNotifier.aER.bgK) continue;
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
        this.VJ = new db(PlayerNotifier.aER.bgK.gW, PlayerNotifier.aER.bgK.gX, PlayerNotifier.aER.bgK.gY);
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

