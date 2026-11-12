/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package rise.module.impl.render;

import hackclient.rise.fd;
import net.minecraft.util.bt;
import org.lwjgl.input.Keyboard;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.render.freelook.name"}, description="module.render.freelook.description", category=Category.RENDER)
public final class FreeLook
extends Module {
    public BooleanValue aoi = new BooleanValue("Invert Pitch", (Module)this, (Boolean)false);
    private int aoj;
    public float aok;
    public float aol;
    public float Il;
    public float Im;
    @EventLink(cH=1)
    public final Listener<Render2DEvent> aom = render2DEvent -> {
        if (this.getKey() == 0 || !Keyboard.isKeyDown((int)this.getKey())) {
            this.setEnabled(false);
            return;
        }
        FreeLook.aER.bhe.atu();
        float f2 = FreeLook.aER.aIY.cgq * 0.6f + 0.2f;
        float f3 = (float)((double)(f2 * f2 * f2) * 1.5);
        this.Il += (float)FreeLook.aER.bhe.dzp * f3;
        this.Im -= (float)FreeLook.aER.bhe.dzq * f3;
        this.Im = bt.I(this.Im, -90.0f, 90.0f);
        FreeLook.aER.aIY.chP = 1;
    };
    @EventLink(cH=1)
    public final Listener<fd> aon = fd2 -> {
        this.aok = fd2.getYaw();
        this.aol = fd2.getPitch();
    };

    @Override
    public void onEnable() {
        this.aoj = FreeLook.aER.aIY.chP;
        this.aok = this.Il = FreeLook.aER.bgK.pl;
        this.aol = this.Im = FreeLook.aER.bgK.pm;
        if (((Boolean)this.aoi.wD()).booleanValue()) {
            this.Im *= -1.0f;
        }
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public void onDisable() {
        FreeLook.aER.bgK.pl = this.aok;
        FreeLook.aER.bgK.pm = this.aol;
        FreeLook.aER.aIY.chP = this.aoj;
    }
}

