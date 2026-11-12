/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import java.util.List;
import net.minecraft.realms.b;
import net.minecraft.realms.f;
import net.minecraft.realms.n;
import net.minecraft.util.ba;

public class a
extends n {
    private final String dim;
    private final ba din;
    private List<String> dio;
    private final n dip;
    private int diq;

    public a(n n2, String string, ba ba2) {
        this.dip = n2;
        this.dim = a.getLocalizedString(string);
        this.din = ba2;
    }

    @Override
    public void init() {
        b.bX(false);
        this.buttonsClear();
        this.dio = this.fontSplit(this.din.getFormattedText(), this.width() - 50);
        this.diq = this.dio.size() * this.fontLineHeight();
        this.buttonsAdd(a.newButton(0, this.width() / 2 - 100, this.height() / 2 + this.diq / 2 + this.fontLineHeight(), a.getLocalizedString("gui.back")));
    }

    @Override
    public void keyPressed(char c2, int n2) {
        if (n2 == 1) {
            b.a(this.dip);
        }
    }

    @Override
    public void buttonClicked(f f2) {
        if (f2.id() == 0) {
            b.a(this.dip);
        }
    }

    @Override
    public void render(int n2, int n3, float f2) {
        this.renderBackground();
        this.drawCenteredString(this.dim, this.width() / 2, this.height() / 2 - this.diq / 2 - this.fontLineHeight() * 2, 0xAAAAAA);
        int n4 = this.height() / 2 - this.diq / 2;
        if (this.dio != null) {
            for (String string : this.dio) {
                this.drawCenteredString(string, this.width() / 2, n4, 0xFFFFFF);
                n4 += this.fontLineHeight();
            }
        }
        super.render(n2, n3, f2);
    }
}

