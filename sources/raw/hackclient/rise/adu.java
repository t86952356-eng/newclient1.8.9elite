/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import hackclient.rise.a;
import hackclient.rise.adh;
import hackclient.rise.adk;
import hackclient.rise.adp;
import hackclient.rise.aee;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.client.gui.aq;
import net.minecraft.client.gui.au;
import net.minecraft.client.gui.ce;
import net.minecraft.client.gui.cz;

public final class adu
extends adh {
    private afj animation = new afj(afk.aHh, 600L);
    private adp aDq;
    private adp aDr;
    private adp aDs;
    private adp aDt;
    private adk[] menuButtons;
    private boolean aDu;

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        adk[] adkArray = this.menuButtons;
        if (adkArray == null || this.aDq == null) {
            return;
        }
        cz cz2 = adu.aER.jY;
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(() -> ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK));
        for (adk object2 : adkArray) {
            object2.c(n2, n3, f2);
        }
        agf agf2 = gb.ks.a(64, gd.kG);
        double d2 = this.aDq.getY() - (double)agf2.tF();
        this.animation.Q(d2);
        String string = this.aDu ? "Rice" : a.b;
        double d3 = this.animation.sV();
        Color color = ais.d(Color.WHITE, (int)(d3 / d2 * 200.0));
        this.b(gg.kV).c(() -> {
            agf2.c(string, (float)this.width / 2.0f, d3, color.getRGB());
            gb.ks.a(16, gd.kG).d("Made with <3 by Alan and The_Bi11iona1re", cz2.getScaledWidth() - 5, cz2.getScaledHeight() - 20, ais.d(aCD, 100).getRGB());
            gb.ks.a(12, gd.kG).d("\u00a9 Rise Client 2026. All Rights Reserved", cz2.getScaledWidth() - 5, cz2.getScaledHeight() - 10, ais.d(aCD, 100).getRGB());
            if (!System.getProperty("java.vm.vendor").toLowerCase().contains("oracle corporation")) {
                agf agf3 = gb.ks.a(32, gd.kH);
            }
        });
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        switch (n2) {
            case 203: {
                System.out.println("Reconnecting");
                rip.vantage.network.core.a.aKQ().aKX();
            }
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        if (this.menuButtons == null) {
            return;
        }
        if (n4 == 0) {
            for (adk adk2 : this.menuButtons) {
                if (!aee.a(adk2.getX(), adk2.getY(), adk2.pc(), adk2.da(), n2, n3)) continue;
                adk2.rC();
                break;
            }
        }
    }

    @Override
    public void initGui() {
        this.aDu = Math.random() > 0.98;
        int n2 = this.width / 2;
        int n3 = this.height / 2;
        int n4 = 180;
        int n5 = 24;
        int n6 = 6;
        int n7 = n2 - n4 / 2;
        int n8 = n3 - n5 / 2 - n6 / 2 - n5 / 2;
        this.aDq = new adp(n7, n8, n4, n5, () -> aER.a(new ce(this)), "Singleplayer");
        this.aDr = new adp(n7, n8 + n5 + n6, n4, n5, () -> aER.a(new aq(this)), "Multiplayer");
        this.aDs = new adp(n7 + n4 / 2 + n6 / 2, n8 + n5 * 2 + n6 * 2, n4 / 2 - n6 / 2, n5, () -> aER.a(new AccountManagerScreen(this)), "Alts");
        this.aDt = new adp(n7, n8 + n5 * 2 + n6 * 2, n4 / 2 - n6 / 2, n5, () -> aER.a(new au(this, adu.aER.aIY)), "Options");
        this.animation = new afj(afk.aHh, 600L);
        this.menuButtons = new adk[]{this.aDq, this.aDr, this.aDs, this.aDt};
    }
}

