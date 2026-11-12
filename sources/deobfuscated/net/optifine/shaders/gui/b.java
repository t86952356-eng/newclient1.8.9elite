/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.gui;

import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.a;
import net.optifine.shaders.gui.f;

public class b
extends c {
    private a eIe = null;

    public b(a a2, int n2, int n3, int n4, int n5) {
        super(a2.ordinal(), n2, n3, n4, n5, b.c(a2));
        this.eIe = a2;
    }

    public a aIs() {
        return this.eIe;
    }

    private static String c(a a2) {
        String string = I18n.a(a2.acf(), new Object[0]) + ": ";
        switch (a2) {
            case eFE: {
                return string + f.kn(ah.eDi);
            }
            case eFF: {
                return string + f.cS(ah.eDe);
            }
            case eFG: {
                return string + f.cS(ah.eDf);
            }
            case eFH: {
                return string + f.cl(ah.eCV);
            }
            case eFI: {
                return string + f.cl(ah.eCW);
            }
            case eFJ: {
                return string + f.cm(ah.eCU);
            }
            case eFK: {
                return string + f.cS(ah.eCT);
            }
            case eFL: {
                return string + ah.eDh.aHu();
            }
            case eFM: {
                return string + ah.eDg.aHu();
            }
            case eFP: {
                return string + f.cS(ah.eDd);
            }
            case eFO: {
                return string + f.cS(ah.eCS);
            }
        }
        return string + ah.b(a2);
    }

    public void aIt() {
        this.displayString = b.c(this.eIe);
    }
}

