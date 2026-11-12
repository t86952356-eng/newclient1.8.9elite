/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package hackclient.rise;

import hackclient.rise.adh;
import net.minecraft.client.gui.am;
import hackclient.rise.adw;
import hackclient.rise.ahm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.aq;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.resources.I18n;
import org.apache.commons.lang3.StringUtils;

public final class adv
extends adh {
    private final Pattern aDv = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
    private final Pattern aDw = Pattern.compile("([1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])");
    private final List<f> aDx = new ArrayList<f>();
    private ThreadPoolExecutor aDy = null;
    private boolean JE;
    private cq aDz;
    private cq aDA;
    private cq aDB;

    private void rJ() {
        Object object;
        String[] stringArray;
        Matcher matcher;
        ((c)this.buttonList.get((int)0)).displayString = "Stop";
        String[] stringArray2 = this.aDz.getText().split("-");
        if (!this.aDv.matcher(stringArray2[0]).matches()) {
            this.stop();
            return;
        }
        adw adw2 = new adw(stringArray2[0]);
        adw adw3 = new adw(stringArray2[0]);
        if (stringArray2.length > 1) {
            Matcher matcher2 = this.aDv.matcher(stringArray2[1]);
            if (matcher2.matches()) {
                adw3 = new adw(stringArray2[1]);
            } else {
                this.stop();
                return;
            }
        }
        if (!(matcher = this.aDw.matcher((stringArray = this.aDA.getText().split("-"))[0])).matches()) {
            this.stop();
            return;
        }
        int n2 = Integer.parseInt(stringArray[0]);
        int n3 = Integer.parseInt(stringArray[0]);
        if (stringArray.length > 1) {
            object = this.aDw.matcher(stringArray[1]);
            if (((Matcher)object).matches()) {
                n3 = Integer.parseInt(stringArray[1]);
            } else {
                this.stop();
                return;
            }
        }
        if (!StringUtils.isNumeric((CharSequence)(object = this.aDB.getText()))) {
            this.stop();
            return;
        }
        int n4 = Integer.parseInt((String)object);
        this.aDy = (ThreadPoolExecutor)Executors.newFixedThreadPool(n4);
        System.out.println("Started with " + n4 + " threads");
        this.aDx.clear();
        this.JE = false;
        this.a(adw.a(adw2, adw3), adw.b(adw2, adw3), Math.min(n2, n3), Math.max(n2, n3));
    }

    private void a(adw adw2, adw adw3, int n2, int n3) {
        adw adw4 = new adw(adw2.rK(), adw2.rL(), adw2.rM(), adw2.rN());
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = adw2.ai(i2); i3 <= adw3.ai(i2); ++i3) {
                adw4.l(i2, i3);
                adw adw5 = new adw(adw4.ai(0), adw4.ai(1), adw4.ai(2), adw4.ai(3));
                int n4 = n2;
                while (n4 <= n3) {
                    int n5 = n4++;
                    this.aDy.execute(() -> {
                        if (this.JE) {
                            return;
                        }
                        System.out.println("CHECKING " + String.valueOf(adw5) + ":" + n5);
                        f f2 = ahm.d(adw5.toString(), n5, 500);
                        if (f2 != null) {
                            this.aDx.add(f2);
                        }
                        if (adw5.toString().equals(adw3.toString()) && n5 == n3) {
                            this.stop();
                        }
                    });
                }
            }
        }
    }

    private void stop() {
        this.aDx.removeIf(f2 -> f2.bDI == null);
        System.out.println(this.aDx.size() + " servers found");
        for (f f3 : this.aDx) {
            aq.bpU = true;
            aq.bpH.HJ();
            aq.bpH.e(f3);
            aq.bpH.HK();
        }
        ((c)this.buttonList.get((int)0)).displayString = "Start";
        this.JE = true;
    }

    @Override
    public void updateScreen() {
        this.aDz.Gb();
        this.aDA.Gb();
        this.aDB.Gb();
    }

    @Override
    public void initGui() {
        int n2 = 20;
        this.aDz = new cq(0, this.fontRendererObj, this.width / 2 - 100, 56, 200, 20);
        this.aDz.bV(31);
        this.aDz.ag(true);
        this.aDz.bX("1.1.1.1-255.255.255.255");
        this.aDA = new cq(1, this.fontRendererObj, this.width / 2 - 100, 96, 200, 20);
        this.aDA.bV(11);
        this.aDA.bX("1-25565");
        this.aDB = new cq(2, this.fontRendererObj, this.width / 2 - 100, 136, 200, 20);
        this.aDB.bV(4);
        this.aDB.bX("128");
        this.buttonList.add(new c(0, this.width / 2 - 100, this.height / 4 + 96 + 12, "Start"));
        this.buttonList.add(new c(1, this.width / 2 - 100, this.height / 4 + 96 + 12 + 20 + 4, I18n.a("gui.done", new Object[0])));
        super.initGui();
    }

    @Override
    protected void actionPerformed(c c2) {
        switch (c2.id) {
            case 0: {
                switch (((c)this.buttonList.get((int)0)).displayString) {
                    case "Start": {
                        this.rJ();
                        break;
                    }
                    case "Stop": {
                        this.stop();
                    }
                }
                break;
            }
            case 1: {
                aER.a(new aq(new am()));
            }
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        this.aDz.f(c2, n2);
        this.aDA.f(c2, n2);
        this.aDB.f(c2, n2);
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        this.aDz.mouseClicked(n2, n3, n4);
        this.aDA.mouseClicked(n2, n3, n4);
        this.aDB.mouseClicked(n2, n3, n4);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawString(this.fontRendererObj, "IP Range", this.width / 2 - 100, 40, 0xA0A0A0);
        this.drawString(this.fontRendererObj, "Port Range", this.width / 2 - 100, 82, 0xA0A0A0);
        this.drawString(this.fontRendererObj, "Threads", this.width / 2 - 100, 122, 0xA0A0A0);
        this.aDz.Gf();
        this.aDA.Gf();
        this.aDB.Gf();
        super.drawScreen(n2, n3, f2);
    }
}

