/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.cn;
import hackclient.rise.go;
import hackclient.rise.hb;
import java.awt.Color;
import net.minecraft.client.model.f;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;

public class cm
implements aea {
    public cn hP;
    public c by;
    public int hQ;
    public static go gj;
    public static hb hR;

    public cm(cn cn2) {
        this.hP = cn2;
        this.hQ = cm.aER.bgK.aRg;
    }

    public void co() {
    }

    public void cp() {
    }

    public void a(a a2, f f2) {
    }

    public void cq() {
        if (gj == null) {
            gj = this.e(go.class);
        }
        if (hR == null) {
            hR = this.e(hb.class);
        }
        this.by = cm.gj.jE != null ? cm.gj.jE : (cm.hR.jE != null ? cm.hR.jE : null);
    }

    public Color a(r r2) {
        Color color = this.hP.cr();
        if (r2 == null) {
            return color;
        }
        if (r2.cus > 0) {
            color = this.hP.cs();
        } else if (this.by == r2) {
            color = this.hP.ct();
        }
        return color;
    }
}

