/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fc;
import hackclient.rise.mj;
import net.minecraft.network.play.client.f;

public class qs
extends akg<mj> {
    private final aki Sf = new aki("2 Block", (akg<?>)this, (Boolean)true);
    private final aki Sg = new aki("Instant", (akg<?>)this, (Boolean)true, this.Sf::wD);
    private int hV;
    private boolean Sh;
    @dm
    public final dk<ei> Si = ei2 -> {
        float f2 = qs.aER.bgK.cso = (Boolean)this.Sf.wD() != false ? 2.0f : 1.0f;
        if (this.Sh) {
            if (this.hV > 0 && qs.aER.bgK.aO || this.hV > 5) {
                this.hV = 0;
                this.Sh = false;
                return;
            }
            if (this.hV % 3 == 0) {
                ei2.setOnGround(true);
                qs.aER.bgK.jump();
            }
            ++this.hV;
        }
    };
    @dm
    public final dk<fc> Sj = fc2 -> {
        if (fc2.da() > 1.0) {
            if (((Boolean)this.Sg.wD()).booleanValue()) {
                ahn.m(new f(qs.aER.bgK.gW, qs.aER.bgK.gX + 0.41999998688698, qs.aER.bgK.gY, false));
                ahn.m(new f(qs.aER.bgK.gW, qs.aER.bgK.gX + 0.7531999805212, qs.aER.bgK.gY, false));
                ahn.m(new f(qs.aER.bgK.gW, qs.aER.bgK.gX + 1.00133597911215, qs.aER.bgK.gY, true));
                ahn.m(new f(qs.aER.bgK.gW, qs.aER.bgK.gX + 1.42133596599913, qs.aER.bgK.gY, false));
                ahn.m(new f(qs.aER.bgK.gW, qs.aER.bgK.gX + 1.75453595963335, qs.aER.bgK.gY, false));
                ahn.m(new f(qs.aER.bgK.gW, qs.aER.bgK.gX + 2.0026719582243, qs.aER.bgK.gY, false));
                qs.aER.bgC.dAp = 0.14285715f;
            } else {
                this.Sh = true;
                this.hV = 0;
                qs.aER.bgK.setPosition(qs.aER.bgK.gW, qs.aER.bgK.gX, qs.aER.bgK.gY);
            }
            return;
        }
        if (fc2.da() > (double)0.6f) {
            qs.aER.bgC.dAp = 0.33333f;
            ahn.m(new f(qs.aER.bgK.gW, qs.aER.bgK.gX + (double)0.42f, qs.aER.bgK.gY, false));
            ahn.m(new f(qs.aER.bgK.gW, qs.aER.bgK.gX + (double)0.42f, qs.aER.bgK.gY, true));
        }
    };

    public qs(String string, mj mj2) {
        super(string, mj2);
    }

    @Override
    public void onDisable() {
        qs.aER.bgK.cso = 0.6f;
    }
}

