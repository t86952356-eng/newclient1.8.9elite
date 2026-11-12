/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.abj;
import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.aea;
import hackclient.rise.agn;
import hackclient.rise.ahf;
import hackclient.rise.ahg;
import hackclient.rise.ait;
import hackclient.rise.aiu;
import hackclient.rise.akb;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.client.gui.cz;
import org.lwjgl.opengl.GL11;

public class ach
implements aca,
aea {
    private final ArrayList<abj> aAA = new ArrayList();
    private final agn aAB = new agn();

    public ach() {
        for (ahf ahf2 : ahf.values()) {
            this.aAA.add(new abj(ahf2, ahg.a("language_local", ahf2), ahg.a("language_english", ahf2)));
        }
    }

    @Override
    public void b(int n2, int n3, float f2) {
        this.aAB.qN();
        akb akb2 = this.v().pm();
        akb akb3 = this.v().pn();
        double d2 = this.v().po().ayX;
        double d3 = 40.0;
        double d4 = (double)akb2.getX() + d2;
        double d5 = (double)akb2.getY() + 40.0;
        double d6 = (double)akb3.x - d2;
        double d7 = Math.max(0.0, (double)akb3.y - 40.0);
        GL11.glPushAttrib((int)524288);
        aiu.hQ();
        aiu.a(new cz(aER), d4, d5, d6, d7);
        for (int i2 = 0; i2 < this.aAA.size(); ++i2) {
            this.aAA.get(i2).G((double)((i2 + 1) * 46) + this.aAB.tT());
        }
        aiu.disable();
        GL11.glPopAttrib();
        ait.a((double)akb2.getX() + d2, akb2.getY(), (double)akb3.x - d2, 40.0, this.v().ayG, abz.aAa.ql(), true, true, false, false);
        gb.ks.a(16, gd.kG).d(ahg.cf("ui.language.text"), akb2.getX() + akb3.getX() - 20.0f, akb2.getY() + 20.0f, new Color(255, 255, 255, 128).getRGB());
        this.aAB.V(-2000.0);
    }

    @Override
    public void f(int n2, int n3, int n4) {
        for (abj abj2 : this.aAA) {
            abj2.j(n2, n3);
        }
    }
}

