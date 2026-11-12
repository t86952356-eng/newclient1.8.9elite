/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.bs;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.Scaffold;

public class VkMode
extends Mode<Scaffold> {
    private int dm;
    private boolean LV;
    @EventLink
    public final Listener<StrafeEvent> ajW = strafeEvent -> {
        boolean bl2;
        float f2 = VkMode.aER.bgK.pl;
        float f3 = bt.bN(f2);
        bs.d(false);
        this.e(Speed.class).setEnabled(false);
        boolean bl3 = bl2 = Math.abs(f3 % 80.0f) <= 15.0f || Math.abs(f3 % 90.0f) >= 75.0f;
        if (!bl2) {
            VkMode.aER.bgK.ud *= 0.95;
            VkMode.aER.bgK.uf *= 0.95;
        }
    };

    public VkMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

