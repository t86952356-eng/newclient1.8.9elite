/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.d;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cq;
import net.minecraft.network.play.client.x;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cf;
import net.minecraft.util.s;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class f
extends bp {
    private String bkR = "";
    private int bkS = -1;
    private boolean bkT;
    private boolean bkU;
    private int bkV;
    private final List<String> bkW = Lists.newArrayList();
    protected cq bkX;
    private String bkY = "";
    private static final d bkZ = d.AZ();

    public f() {
    }

    public f(String string) {
        this.bkY = string;
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.bkS = f.bkZ.bha.Ey().ET().size();
        this.bkX = new cq(0, this.fontRendererObj, 4, this.height - 12, this.width - 4, 12);
        this.bkX.bV(100);
        this.bkX.af(false);
        this.bkX.ag(true);
        this.bkX.bX(this.bkY);
        this.bkX.ah(false);
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
        f.bkZ.bha.Ey().EU();
    }

    @Override
    public void updateScreen() {
        this.bkX.Gb();
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        super.keyTyped(c2, n2);
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        int n2 = Mouse.getEventDWheel();
        if (n2 != 0) {
            if (n2 > 1) {
                n2 = 1;
            }
            if (n2 < -1) {
                n2 = -1;
            }
            if (!f.isShiftKeyDown()) {
                n2 *= 2;
            }
            f.bkZ.bha.Ey().scroll(n2);
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
    }

    @Override
    protected void setText(String string, boolean bl2) {
        if (bl2) {
            this.bkX.bX(string);
        } else {
            this.bkX.cT(string);
        }
    }

    public void DU() {
        if (this.bkT) {
            this.bkX.bR(this.bkX.a(-1, this.bkX.Gh(), false) - this.bkX.Gh());
            if (this.bkV >= this.bkW.size()) {
                this.bkV = 0;
            }
        } else {
            int n2 = this.bkX.a(-1, this.bkX.Gh(), false);
            this.bkW.clear();
            this.bkV = 0;
            String string = this.bkX.getText().substring(n2).toLowerCase();
            String string2 = this.bkX.getText().substring(0, this.bkX.Gh());
            this.J(string2, string);
            if (this.bkW.isEmpty()) {
                return;
            }
            this.bkT = true;
            this.bkX.bR(n2 - this.bkX.Gh());
        }
        if (this.bkW.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string2 : this.bkW) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string2);
            }
            f.bkZ.bha.Ey().a(new s(stringBuilder.toString()), 1);
        }
        this.bkX.cT(this.bkW.get(this.bkV++));
    }

    private void J(String string, String string2) {
        if (!string.startsWith(".") && string.length() >= 1) {
            b b2 = null;
            if (f.bkZ.bhc != null) {
                if (f.bkZ.bhc.dzu == cf.dzy) {
                    b2 = f.bkZ.bhc.dg();
                }
            }
            f.bkZ.bgK.bkd.u(new x(string, b2));
            this.bkU = true;
        }
    }

    public void bz(int n2) {
        int n3 = this.bkS + n2;
        int n4 = f.bkZ.bha.Ey().ET().size();
        if ((n3 = bt.F(n3, 0, n4)) != this.bkS) {
            if (n3 == n4) {
                this.bkS = n4;
                this.bkX.bX(this.bkR);
            } else {
                if (this.bkS == n4) {
                    this.bkR = this.bkX.getText();
                }
                this.bkX.bX(f.bkZ.bha.Ey().ET().get(n3));
                this.bkS = n3;
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        super.drawScreen(n2, n3, f2);
    }

    public void h(String[] stringArray) {
        if (this.bkU) {
            this.bkT = false;
            this.bkW.clear();
            for (String string : stringArray) {
                if (string.length() <= 0) continue;
                this.bkW.add(string);
            }
            String string = this.bkX.getText().substring(this.bkX.a(-1, this.bkX.Gh(), false));
            String string2 = StringUtils.getCommonPrefix((String[])stringArray);
            if (string2.length() > 0 && !string.equalsIgnoreCase(string2)) {
                this.bkX.bR(this.bkX.a(-1, this.bkX.Gh(), false) - this.bkX.Gh());
                this.bkX.cT(string2);
            } else if (this.bkW.size() > 0) {
                this.bkT = true;
                this.DU();
            }
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}

