/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fd;
import hackclient.rise.fs;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.util.bt;
import org.lwjgl.input.Keyboard;

@gl(aliases={"module.render.freelook.name"}, description="module.render.freelook.description", category=gj.RENDER)
public final class xc
extends gi {
    public aki aoi = new aki("Invert Pitch", (gi)this, (Boolean)false);
    private int aoj;
    public float aok;
    public float aol;
    public float Il;
    public float Im;
    @dm(cH=1)
    public final dk<fs> aom = fs2 -> {
        if (this.getKey() == 0 || !Keyboard.isKeyDown((int)this.getKey())) {
            this.setEnabled(false);
            return;
        }
        xc.aER.bhe.atu();
        float f2 = xc.aER.aIY.cgq * 0.6f + 0.2f;
        float f3 = (float)((double)(f2 * f2 * f2) * 1.5);
        this.Il += (float)xc.aER.bhe.dzp * f3;
        this.Im -= (float)xc.aER.bhe.dzq * f3;
        this.Im = bt.I(this.Im, -90.0f, 90.0f);
        xc.aER.aIY.chP = 1;
    };
    @dm(cH=1)
    public final dk<fd> aon = fd2 -> {
        this.aok = fd2.getYaw();
        this.aol = fd2.getPitch();
    };

    @Override
    public void onEnable() {
        this.aoj = xc.aER.aIY.chP;
        this.aok = this.Il = xc.aER.bgK.pl;
        this.aol = this.Im = xc.aER.bgK.pm;
        if (((Boolean)this.aoi.wD()).booleanValue()) {
            this.Im *= -1.0f;
        }
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public void onDisable() {
        xc.aER.bgK.pl = this.aok;
        xc.aER.bgK.pm = this.aol;
        xc.aER.aIY.chP = this.aoj;
    }
}

