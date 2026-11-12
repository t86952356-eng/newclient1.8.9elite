/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aap;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.cz;
import rip.vantage.commons.util.time.a;

public class adt
extends GuiScreen {
    private final afj aDd = new afj(afk.aHc, 1000L);
    private final a aDe = new a();

    @Override
    public void initGui() {
        this.aDd.aX();
        this.aDe.aX();
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        ait.d(0.0, 0.0, adt.aER.bgz, adt.aER.bgA, Color.BLACK);
        this.aDd.Q(this.aDe.aKM() > 4000L ? 0.0 : 255.0);
        cz cz2 = new cz(aER);
        gb.ks.a(24, gd.kG).c("Note: This is private prerelease software", (double)cz2.getScaledWidth() / 2.0, (double)cz2.getScaledHeight() / 2.0 - 70.0, ais.d(Color.WHITE, (int)this.aDd.sV()).getRGB());
        gb.ks.a(24, gd.kG).c("Features, interfaces and sequences are not final and can be expected to change at any time", (double)cz2.getScaledWidth() / 2.0, (double)cz2.getScaledHeight() / 2.0 - 50.0, ais.d(Color.WHITE, (int)this.aDd.sV()).getRGB());
        gb.ks.a(16, gd.kG).c("\u00a9 Rise Client 2022. All Rights Reserved", (double)cz2.getScaledWidth() / 2.0, (double)cz2.getScaledHeight() / 2.0 + 70.0, ais.d(Color.WHITE, (int)this.aDd.sV() / 2).getRGB());
        if (this.aDe.T(5000L)) {
            aER.a(new aap());
        }
    }
}

