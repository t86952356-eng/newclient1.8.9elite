/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.render;

import hackclient.rise.akl;
import hackclient.rise.wf;
import java.awt.Color;
import lombok.Generated;
import net.minecraft.network.play.server.av;
import net.minecraft.network.play.server.d;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.render.ambience.name"}, description="module.render.ambience.description", category=Category.RENDER)
public final class Ambience
extends Module {
    private final NumberValue alm = new NumberValue("Time", this, (Number)0, (Number)0, (Number)22999, (Number)1);
    private final NumberValue aln = new NumberValue("Time Speed", this, (Number)0, (Number)0, (Number)20, (Number)1);
    private final ModeValue alo = new wf(this, "Weather", this);
    public final akl alp = new akl("Snow Color", (Module)this, Color.WHITE, () -> !((Mode)this.alo.wD()).getName().equals("Heavy Snow") && !((Mode)this.alo.wD()).getName().equals("Light Snow"));
    @EventLink
    public final Listener<Render3DEvent> alq = render3DEvent -> Ambience.aER.bgF.o((long)((Number)this.alm.wD()).intValue() + System.currentTimeMillis() * (long)((Number)this.aln.wD()).intValue());
    @EventLink
    public final Listener<PreMotionEvent> alr = preMotionEvent -> {
        if (Ambience.aER.bgK.aRg % 20 == 0) {
            switch (((Mode)this.alo.wD()).getName()) {
                case "Clear": {
                    Ambience.aER.bgF.cb(0.0f);
                    Ambience.aER.bgF.avH().iS(Integer.MAX_VALUE);
                    Ambience.aER.bgF.avH().iR(0);
                    Ambience.aER.bgF.avH().iQ(0);
                    Ambience.aER.bgF.avH().cG(false);
                    Ambience.aER.bgF.avH().cF(false);
                    break;
                }
                case "Nether Particles": 
                case "Light Snow": 
                case "Heavy Snow": 
                case "Rain": {
                    Ambience.aER.bgF.cb(1.0f);
                    Ambience.aER.bgF.avH().iS(0);
                    Ambience.aER.bgF.avH().iR(Integer.MAX_VALUE);
                    Ambience.aER.bgF.avH().iQ(Integer.MAX_VALUE);
                    Ambience.aER.bgF.avH().cG(true);
                    Ambience.aER.bgF.avH().cF(false);
                }
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> als = packetReceiveEvent -> {
        av av2;
        if (packetReceiveEvent.dq() instanceof d) {
            packetReceiveEvent.cF();
        } else if (packetReceiveEvent.dq() instanceof av && !((Mode)this.alo.wD()).getName().equals("Unchanged") && ((av2 = (av)packetReceiveEvent.dq()).getGameState() == 1 || av2.getGameState() == 2)) {
            packetReceiveEvent.cF();
        }
    };

    @Override
    public void onDisable() {
        Ambience.aER.bgF.cb(0.0f);
        Ambience.aER.bgF.avH().iS(Integer.MAX_VALUE);
        Ambience.aER.bgF.avH().iR(0);
        Ambience.aER.bgF.avH().iQ(0);
        Ambience.aER.bgF.avH().cG(false);
        Ambience.aER.bgF.avH().cF(false);
    }

    public float a(b b2, j j2) {
        if (this.isEnabled()) {
            switch (((Mode)this.alo.wD()).getName()) {
                case "Nether Particles": 
                case "Light Snow": 
                case "Heavy Snow": {
                    return 0.1f;
                }
                case "Rain": {
                    return 0.2f;
                }
            }
        }
        return j2.bi(b2);
    }

    public boolean kW() {
        String string = ((Mode)this.alo.wD()).getName();
        return this.isEnabled() && string.equals("Light Snow") || string.equals("Heavy Snow") || string.equals("Nether Particles");
    }

    @Generated
    public NumberValue kX() {
        return this.alm;
    }

    @Generated
    public NumberValue jV() {
        return this.aln;
    }

    @Generated
    public ModeValue kY() {
        return this.alo;
    }

    @Generated
    public akl kZ() {
        return this.alp;
    }

    @Generated
    public Listener<Render3DEvent> la() {
        return this.alq;
    }

    @Generated
    public Listener<PreMotionEvent> lb() {
        return this.alr;
    }

    @Generated
    public Listener<PacketReceiveEvent> lc() {
        return this.als;
    }
}

