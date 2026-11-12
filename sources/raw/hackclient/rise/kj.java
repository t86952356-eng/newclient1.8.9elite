/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.jg;
import net.minecraft.network.play.client.f;

public class kj
extends akg<jg> {
    private final akp yM = new akp("Direction", this).a(new akg[]{new aks("Up")}).a(new akg[]{new aks("Down")}).a(new akg[]{new aks("Horizontal")}).co("Up");
    private final akq yN = new akq("Delay", this, (Number)20, (Number)2, (Number)100, (Number)1);
    private final aki yO = new aki("Math Ground", (akg<?>)this, (Boolean)false);
    private final aki yP = new aki("Ground State", (akg<?>)this, (Boolean)false);
    @dm
    public final dk<ei> yQ = ei2 -> {
        if (kj.aER.bgK.aRg % ((Number)this.yN.wD()).intValue() == 0) {
            double d2 = ei2.getPosX();
            double d3 = ei2.getPosY();
            double d4 = ei2.getPosZ();
            switch (((akg)this.yM.wD()).getName()) {
                case "Up": {
                    d3 += ahj.l(1024.0, 2048.0);
                    break;
                }
                case "Down": {
                    d3 -= ahj.l(1024.0, 2048.0);
                    break;
                }
                case "Horizontal": {
                    d2 += ahj.l(1024.0, 2048.0);
                    d4 -= ahj.l(1024.0, 2048.0);
                }
            }
            if (((Boolean)this.yO.wD()).booleanValue()) {
                d3 = aii.roundToGround(d3);
            }
            ahn.m(new f(d2, d3, d4, (Boolean)this.yP.wD()));
        }
    };

    public kj(String string, jg jg2) {
        super(string, jg2);
    }
}

