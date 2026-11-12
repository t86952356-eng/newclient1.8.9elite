/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.afl;
import hackclient.rise.akd;
import hackclient.rise.bv;
import hackclient.rise.sh;
import java.util.HashMap;
import net.minecraft.client.entity.c;
import net.minecraft.entity.r;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;

@ModuleInfo(aliases={"Sampler (Dev)"}, description="module.other.antiafk.description", category=Category.PLAYER)
public final class SamplerDev
extends Module {
    private final HashMap<String, Vector2f> VY = new HashMap();
    private Vector2f Uz;
    @EventLink
    public final Listener<PreMotionEvent> VZ = preMotionEvent -> {
        r r2 = bv.e(6.0);
        c c2 = SamplerDev.aER.bgK;
        Vector2f vector2f = new Vector2f(c2.pl % 360.0f, c2.pm);
        if (r2 != null && this.Uz != null) {
            sh sh2 = new sh(new akd(r2.gW - c2.gW, r2.gX - c2.gX, r2.gY - c2.gY), new Vector2f(vector2f.getX(), vector2f.getY()));
            String string = sh2.hS();
            if (this.VY.containsKey(string)) {
                Vector2f vector2f2 = this.VY.get(sh2.hS());
                SamplerDev.aER.bgK.pl += vector2f2.getX();
                SamplerDev.aER.bgK.pm += vector2f2.getY();
                afl.b("Contained: " + string, new Object[0]);
                afl.b("Yaw: " + vector2f2.getX() + " Pitch: " + vector2f2.getY(), new Object[0]);
            } else {
                afl.b("None " + string, new Object[0]);
            }
        }
        this.Uz = new Vector2f(vector2f.getX(), vector2f.getY());
    };

    @Override
    public void onEnable() {
        if (SamplerDev.aER.aIY.chr.Re()) {
            this.VY.clear();
        }
    }
}

