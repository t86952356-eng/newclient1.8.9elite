/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.step;

import hackclient.rise.ahn;
import hackclient.rise.fc;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Step;
import rise.value.BooleanValue;

public class MatrixMode
extends Mode<Step> {
    private final BooleanValue Sf = new BooleanValue("2 Block", (Mode<?>)this, (Boolean)true);
    private final BooleanValue Sg = new BooleanValue("Instant", (Mode<?>)this, (Boolean)true, this.Sf::wD);
    private int hV;
    private boolean Sh;
    @EventLink
    public final Listener<PreMotionEvent> Si = preMotionEvent -> {
        float f2 = MatrixMode.aER.bgK.cso = (Boolean)this.Sf.wD() != false ? 2.0f : 1.0f;
        if (this.Sh) {
            if (this.hV > 0 && MatrixMode.aER.bgK.aO || this.hV > 5) {
                this.hV = 0;
                this.Sh = false;
                return;
            }
            if (this.hV % 3 == 0) {
                preMotionEvent.setOnGround(true);
                MatrixMode.aER.bgK.jump();
            }
            ++this.hV;
        }
    };
    @EventLink
    public final Listener<fc> Sj = fc2 -> {
        if (fc2.da() > 1.0) {
            if (((Boolean)this.Sg.wD()).booleanValue()) {
                ahn.m(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX + 0.41999998688698, MatrixMode.aER.bgK.gY, false));
                ahn.m(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX + 0.7531999805212, MatrixMode.aER.bgK.gY, false));
                ahn.m(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX + 1.00133597911215, MatrixMode.aER.bgK.gY, true));
                ahn.m(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX + 1.42133596599913, MatrixMode.aER.bgK.gY, false));
                ahn.m(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX + 1.75453595963335, MatrixMode.aER.bgK.gY, false));
                ahn.m(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX + 2.0026719582243, MatrixMode.aER.bgK.gY, false));
                MatrixMode.aER.bgC.dAp = 0.14285715f;
            } else {
                this.Sh = true;
                this.hV = 0;
                MatrixMode.aER.bgK.setPosition(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX, MatrixMode.aER.bgK.gY);
            }
            return;
        }
        if (fc2.da() > (double)0.6f) {
            MatrixMode.aER.bgC.dAp = 0.33333f;
            ahn.m(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX + (double)0.42f, MatrixMode.aER.bgK.gY, false));
            ahn.m(new f(MatrixMode.aER.bgK.gW, MatrixMode.aER.bgK.gX + (double)0.42f, MatrixMode.aER.bgK.gY, true));
        }
    };

    public MatrixMode(String string, Step step) {
        super(string, step);
    }

    @Override
    public void onDisable() {
        MatrixMode.aER.bgK.cso = 0.6f;
    }
}

