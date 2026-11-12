/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.targetinfo;

import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.bf;
import java.awt.Color;
import net.minecraft.client.entity.a;
import net.minecraft.entity.c;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Mode;
import rise.module.impl.player.HealthBypass;
import rise.module.impl.render.TargetInfo;
import rise.util.math.Vector2d;

public class WurstMode
extends Mode<TargetInfo> {
    private TargetInfo auR;
    @EventLink
    public final Listener<Render2DEvent> avW = render2DEvent -> {
        boolean bl2;
        if (this.auR == null) {
            this.auR = this.e(TargetInfo.class);
        }
        c c2 = this.auR.by;
        boolean bl3 = bl2 = !this.auR.aqz || this.auR.rG.T(1000L);
        if (c2 == null || bl2) {
            return;
        }
        String string = c2.xU();
        String string2 = bf.c(string, string);
        double d2 = this.auR.aqy.x;
        double d3 = this.auR.aqy.y;
        ait.d(d2, d3, 185.0, 34.0, ais.d(Color.WHITE, 100));
        WurstMode.aER.fontRendererObj.a("Name: " + string2, d2 + 4.0, d3 + 4.0, Color.BLACK.getRGB());
        this.auR.aqw.aHP = new Vector2d(185.0, 50.0);
        a a2 = (a)c2;
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f2 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        double d4 = Math.min(!this.auR.aqz ? 0.0 : ahj.a(f2, 1), (double)a2.getMaxHealth());
        ait.d(d2 + 4.0, d3 + 16.0, 177.0 * (d4 / (double)a2.getMaxHealth()), 10.0, Color.ORANGE);
    };

    public WurstMode(String string, TargetInfo targetInfo) {
        super(string, targetInfo);
    }
}

