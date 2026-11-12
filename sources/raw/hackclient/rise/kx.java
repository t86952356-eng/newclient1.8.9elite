/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dr;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.lm;
import hackclient.rise.ln;
import net.minecraft.client.d;
import net.minecraft.client.renderer.EntityRenderer;
import rip.vantage.commons.util.time.a;

@gl(aliases={"module.ghost.autoclicker.name"}, description="module.ghost.autoclicker.description", category=gj.GHOST)
public class kx
extends gi {
    private final akp AG = new akp("Mode", this).a(new akg[]{new ln("Normal", this)}).a(new akg[]{new lm("Drag Click Simulations", this)}).co("Normal");
    private final aki AH = new aki("Jitter", (gi)this, (Boolean)false);
    private final a AI = new a();
    private double AJ;
    private double AK;
    @dm
    public final dk<dr> AL = dr2 -> {
        this.AI.aX();
        this.AJ = (Math.random() - 0.5) * 4.0;
        this.AK = (Math.random() - 0.5) * 4.0;
    };
    @dm
    public final dk<ft> AM = ft2 -> {
        kx.aER.bgV = -1;
        if (!this.AI.T(100L) && ((Boolean)this.AH.wD()).booleanValue() && kx.aER.aIY.chw.Re()) {
            EntityRenderer.bJc = (float)((Math.random() - 0.5) * 400.0 / (double)d.BI() * this.AJ);
            EntityRenderer.bJd = (float)((Math.random() - 0.5) * 400.0 / (double)d.BI() * this.AK);
        }
    };
}

