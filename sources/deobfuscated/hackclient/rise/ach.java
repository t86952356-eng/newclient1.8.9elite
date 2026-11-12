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
import hackclient.rise.agn;
import hackclient.rise.ahg;
import hackclient.rise.ait;
import hackclient.rise.aiu;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.client.gui.cz;
import org.lwjgl.opengl.GL11;
import rise.util.InstanceAccess;
import rise.util.Language;
import rise.util.math.Vector2f;

public class ach
implements aca,
InstanceAccess {
    private final ArrayList<abj> aAA = new ArrayList();
    private final agn aAB = new agn();

    public ach() {
        for (Language language : Language.values()) {
            this.aAA.add(new abj(language, ahg.a("language_local", language), ahg.a("language_english", language)));
        }
    }

    @Override
    public void b(int n2, int n3, float f2) {
        this.aAB.qN();
        Vector2f vector2f = this.v().pm();
        Vector2f vector2f2 = this.v().pn();
        double d2 = this.v().po().ayX;
        double d3 = 40.0;
        double d4 = (double)vector2f.getX() + d2;
        double d5 = (double)vector2f.getY() + 40.0;
        double d6 = (double)vector2f2.x - d2;
        double d7 = Math.max(0.0, (double)vector2f2.y - 40.0);
        GL11.glPushAttrib((int)524288);
        aiu.hQ();
        aiu.a(new cz(aER), d4, d5, d6, d7);
        for (int i2 = 0; i2 < this.aAA.size(); ++i2) {
            this.aAA.get(i2).G((double)((i2 + 1) * 46) + this.aAB.tT());
        }
        aiu.disable();
        GL11.glPopAttrib();
        ait.a((double)vector2f.getX() + d2, vector2f.getY(), (double)vector2f2.x - d2, 40.0, this.v().ayG, abz.aAa.ql(), true, true, false, false);
        gb.ks.a(16, gd.kG).d(ahg.cf("ui.language.text"), vector2f.getX() + vector2f2.getX() - 20.0f, vector2f.getY() + 20.0f, new Color(255, 255, 255, 128).getRGB());
        this.aAB.V(-2000.0);
    }

    @Override
    public void f(int n2, int n3, int n4) {
        for (abj abj2 : this.aAA) {
            abj2.j(n2, n3);
        }
    }
}

