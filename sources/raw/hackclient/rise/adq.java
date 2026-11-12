/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aap;
import hackclient.rise.adr;
import hackclient.rise.ads;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ait;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cz;
import net.minecraft.util.cm;
import rip.vantage.commons.util.time.a;

public class adq
extends bp {
    private final String aCU = "";
    private final String aCV = "";
    private final ArrayList<ads> aCW = new adr(this);
    private final a aCX = new a();
    private final int aCY = 0;
    private boolean yr = false;
    private final afj aCZ = new afj(afk.aHc, 3000L);

    @Override
    public void initGui() {
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        if (!this.yr) {
            this.yr = true;
            this.aCX.aX();
            this.aCZ.T(255.0);
            this.aCZ.aX();
        }
        this.aCZ.Q(0.0);
        cz cz2 = new cz(aER);
        ait.e(Color.WHITE);
        ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        ait.a(new cm("rise/images/splash.png"), (double)cz2.getScaledWidth() / 2.0 - 75.0, (double)cz2.getScaledHeight() / 2.0 - 25.0, 150.0, 50.0, new Color(255, 255, 255, (int)this.aCZ.sV()));
        if (this.aCX.T(4000L)) {
            aER.a(new aap());
        }
    }
}

