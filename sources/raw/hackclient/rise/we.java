/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akl;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.wf;
import java.awt.Color;
import lombok.Generated;
import net.minecraft.network.play.server.av;
import net.minecraft.network.play.server.d;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;

@gl(aliases={"module.render.ambience.name"}, description="module.render.ambience.description", category=gj.RENDER)
public final class we
extends gi {
    private final akq alm = new akq("Time", this, (Number)0, (Number)0, (Number)22999, (Number)1);
    private final akq aln = new akq("Time Speed", this, (Number)0, (Number)0, (Number)20, (Number)1);
    private final akp alo = new wf(this, "Weather", this);
    public final akl alp = new akl("Snow Color", (gi)this, Color.WHITE, () -> !((akg)this.alo.wD()).getName().equals("Heavy Snow") && !((akg)this.alo.wD()).getName().equals("Light Snow"));
    @dm
    public final dk<ft> alq = ft2 -> we.aER.bgF.o((long)((Number)this.alm.wD()).intValue() + System.currentTimeMillis() * (long)((Number)this.aln.wD()).intValue());
    @dm
    public final dk<ei> alr = ei2 -> {
        if (we.aER.bgK.aRg % 20 == 0) {
            switch (((akg)this.alo.wD()).getName()) {
                case "Clear": {
                    we.aER.bgF.cb(0.0f);
                    we.aER.bgF.avH().iS(Integer.MAX_VALUE);
                    we.aER.bgF.avH().iR(0);
                    we.aER.bgF.avH().iQ(0);
                    we.aER.bgF.avH().cG(false);
                    we.aER.bgF.avH().cF(false);
                    break;
                }
                case "Nether Particles": 
                case "Light Snow": 
                case "Heavy Snow": 
                case "Rain": {
                    we.aER.bgF.cb(1.0f);
                    we.aER.bgF.avH().iS(0);
                    we.aER.bgF.avH().iR(Integer.MAX_VALUE);
                    we.aER.bgF.avH().iQ(Integer.MAX_VALUE);
                    we.aER.bgF.avH().cG(true);
                    we.aER.bgF.avH().cF(false);
                }
            }
        }
    };
    @dm
    public final dk<fh> als = fh2 -> {
        av av2;
        if (fh2.dq() instanceof d) {
            fh2.cF();
        } else if (fh2.dq() instanceof av && !((akg)this.alo.wD()).getName().equals("Unchanged") && ((av2 = (av)fh2.dq()).getGameState() == 1 || av2.getGameState() == 2)) {
            fh2.cF();
        }
    };

    @Override
    public void onDisable() {
        we.aER.bgF.cb(0.0f);
        we.aER.bgF.avH().iS(Integer.MAX_VALUE);
        we.aER.bgF.avH().iR(0);
        we.aER.bgF.avH().iQ(0);
        we.aER.bgF.avH().cG(false);
        we.aER.bgF.avH().cF(false);
    }

    public float a(b b2, j j2) {
        if (this.isEnabled()) {
            switch (((akg)this.alo.wD()).getName()) {
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
        String string = ((akg)this.alo.wD()).getName();
        return this.isEnabled() && string.equals("Light Snow") || string.equals("Heavy Snow") || string.equals("Nether Particles");
    }

    @Generated
    public akq kX() {
        return this.alm;
    }

    @Generated
    public akq jV() {
        return this.aln;
    }

    @Generated
    public akp kY() {
        return this.alo;
    }

    @Generated
    public akl kZ() {
        return this.alp;
    }

    @Generated
    public dk<ft> la() {
        return this.alq;
    }

    @Generated
    public dk<ei> lb() {
        return this.alr;
    }

    @Generated
    public dk<fh> lc() {
        return this.als;
    }
}

