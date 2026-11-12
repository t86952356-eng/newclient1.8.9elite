/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.agf;
import hackclient.rise.agm;
import hackclient.rise.ago;
import hackclient.rise.aka;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import lombok.Generated;
import net.minecraft.client.d;
import net.minecraft.util.l;
import org.lwjgl.input.Keyboard;
import rip.vantage.commons.util.time.a;

public class agp {
    public String Yg = "";
    public boolean azF;
    public int aJV;
    public aka aqy;
    public float width;
    public agf lq;
    public Color anq;
    public ago aJW;
    public String aJX;
    public boolean aJY;
    private int aJZ;
    private int aKa = Short.MAX_VALUE;
    private String aKb = agp.uc();
    private double gW;
    private double aKc;
    private double aKd;
    private float aKe;
    private float aKf;
    public a aKg = new a();

    public agp(aka aka2, agf agf2, Color color, ago ago2, String string, float f2, boolean bl2) {
        this.aqy = aka2;
        this.lq = agf2;
        this.anq = color;
        this.aJW = ago2;
        this.aJX = string;
        this.width = f2;
        this.aJY = bl2;
    }

    public agp(aka aka2, agf agf2, Color color, ago ago2, String string, float f2) {
        this(aka2, agf2, color, ago2, string, f2, false);
    }

    public agp(aka aka2, agf agf2, Color color, ago ago2, String string, float f2, String string2) {
        this(aka2, agf2, color, ago2, string, f2, false);
        this.aKb = string2;
    }

    public void pZ() {
        String string;
        String string2;
        this.aKg.aX();
        Keyboard.enableRepeatEvents((boolean)true);
        this.aJV = Math.max(0, Math.min(this.aJV, this.Yg.length()));
        this.aKf = (float)this.aqy.y;
        boolean bl2 = this.isEmpty();
        String string3 = bl2 ? this.aJX : (string2 = this.aJY ? "*".repeat(this.Yg.length()) : this.Yg);
        if (bl2) {
            this.aJZ = 0;
            string = string2;
        } else {
            this.aJZ = this.bV(string2);
            string = string2.substring(this.aJZ);
            while ((float)this.lq.bQ(string) > this.width && !string.isEmpty()) {
                string = string.substring(0, string.length() - 1);
            }
        }
        float f2 = this.lq.bQ(string);
        double d2 = System.currentTimeMillis();
        double d3 = Math.min(Math.abs(d2 - this.aKd), 500.0);
        this.aKd = d2;
        switch (this.aJW) {
            case aJT: {
                int n2 = 20;
                int n3 = 0;
                while ((double)n3 < d3) {
                    this.gW = (this.gW * 19.0 + (this.aqy.x - (double)(f2 / 2.0f))) / 20.0;
                    ++n3;
                }
                break;
            }
            default: {
                this.gW = this.aqy.x;
            }
        }
        if (bl2) {
            this.lq.a(string, this.gW, this.aqy.y, new Color(this.anq.getRed(), this.anq.getBlue(), this.anq.getGreen(), (int)((float)this.anq.getAlpha() * (this.azF ? 0.3f : 0.2f))).hashCode());
        } else {
            this.lq.a(string, this.gW, this.aqy.y, this.anq.hashCode());
        }
        if (this.azF) {
            String string4 = this.c(string2, this.aJZ, this.aJV);
            float f3 = this.lq.bQ(string4);
            this.aKe = (float)(this.gW + (double)f3);
            int n4 = 20;
            int n5 = 0;
            while ((double)n5 < d3) {
                this.aKc = (this.aKc * 19.0 + (double)(f3 - 2.0f)) / 20.0;
                ++n5;
            }
            (this.lq == d.AZ().fontRendererObj ? gb.ks.a(18, gd.kG) : this.lq).a("|", (float)(this.gW + this.aKc + 1.0), this.aqy.y - 1.0, new Color(this.anq.getRed(), this.anq.getBlue(), this.anq.getGreen(), this.anq.getAlpha() == 0 ? 0 : (int)((Math.sin((double)System.currentTimeMillis() / 150.0) + 1.0) / 2.0 * 255.0)).hashCode());
        }
    }

    public float ua() {
        return this.aKe;
    }

    public float ub() {
        return this.aKf;
    }

    private int bV(String string) {
        int n2;
        if ((float)this.lq.bQ(string) <= this.width) {
            return 0;
        }
        for (n2 = this.aJV; n2 > 0 && (float)this.lq.bQ(string.substring(n2 - 1, this.aJV)) < this.width; --n2) {
        }
        return n2;
    }

    private String c(String string, int n2, int n3) {
        n2 = Math.max(0, Math.min(n2, string.length()));
        n3 = Math.max(n2, Math.min(n3, string.length()));
        return string.substring(n2, n3);
    }

    public void d(int n2, int n3, int n4) {
        aka aka2 = this.nH();
        boolean bl2 = agm.c(aka2.x + (double)(this.aJW == ago.aJT ? -this.width / 2.0f : 0.0f), aka2.y, this.width, this.lq.tF(), n2, n3);
        boolean bl3 = this.azF = n4 == 0 && bl2;
        if (this.azF) {
            this.aJV = this.Yg.length();
        }
    }

    public void b(char c2, int n2) {
        boolean bl2;
        if (!this.azF || n2 == 28) {
            return;
        }
        this.aJV = Math.max(0, Math.min(this.aJV, this.Yg.length()));
        String string = String.valueOf(c2);
        boolean bl3 = bl2 = Keyboard.isKeyDown((int)29) || Keyboard.isKeyDown((int)157) || Keyboard.isKeyDown((int)219) || Keyboard.isKeyDown((int)220);
        if (n2 == 208 || n2 == 200) {
            return;
        }
        if (bl2 && n2 == 47) {
            try {
                String string2 = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                int n3 = this.Yg.length();
                this.r(string2, this.aJV);
                this.aJV += this.Yg.length() - n3;
            }
            catch (UnsupportedFlavorException | IOException exception) {
                // empty catch block
            }
            return;
        }
        if (bl2 && n2 == 46) {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.Yg), null);
            return;
        }
        if (n2 == 211 && !this.Yg.isEmpty()) {
            this.aq(this.aJV + 1);
            return;
        }
        if (n2 == 14 && !this.Yg.isEmpty()) {
            this.aq(this.aJV);
            --this.aJV;
            if (bl2) {
                while (this.aJV > 0) {
                    this.aq(this.aJV);
                    --this.aJV;
                }
            }
            return;
        }
        if (n2 == 205) {
            ++this.aJV;
            if (bl2) {
                this.aJV = this.Yg.length();
            }
            return;
        }
        if (n2 == 203) {
            --this.aJV;
            if (bl2) {
                this.aJV = 0;
            }
            return;
        }
        if (this.m(c2)) {
            int n4 = this.Yg.length();
            this.r(string, this.aJV);
            if (this.Yg.length() > n4) {
                ++this.aJV;
            }
        }
        this.aJV = Math.max(0, Math.min(this.aJV, this.Yg.length()));
    }

    public int bW(String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        this.aJV = Math.max(0, Math.min(this.aJV, this.Yg.length()));
        int n2 = this.Yg.length();
        this.r(string, this.aJV);
        int n3 = this.Yg.length() - n2;
        if (n3 > 0) {
            this.aJV = Math.max(0, Math.min(this.aJV + n3, this.Yg.length()));
        }
        return n3;
    }

    private boolean m(char c2) {
        if (c2 == '\u0000') {
            return false;
        }
        if (c2 == '\n' || c2 == '\r' || c2 == '\t') {
            return false;
        }
        if (this.aKb == null || this.aKb.isEmpty()) {
            return true;
        }
        return this.aKb.indexOf(c2) >= 0 || this.aKb.indexOf(Character.toLowerCase(c2)) >= 0;
    }

    private void r(String string, int n2) {
        int n3;
        if (string == null || string.isEmpty()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (n3 = 0; n3 < string.length(); ++n3) {
            char c2 = string.charAt(n3);
            if (!this.m(c2)) continue;
            stringBuilder.append(c2);
        }
        if (stringBuilder.length() == 0) {
            return;
        }
        if (this.Yg.length() + stringBuilder.length() > this.aKa) {
            return;
        }
        n3 = Math.max(0, Math.min(n2, this.Yg.length()));
        StringBuilder stringBuilder2 = new StringBuilder(this.Yg);
        stringBuilder2.insert(n3, stringBuilder);
        this.Yg = stringBuilder2.toString();
    }

    private void aq(int n2) {
        if (n2 <= 0 || n2 > this.Yg.length()) {
            return;
        }
        this.Yg = new StringBuilder(this.Yg).deleteCharAt(n2 - 1).toString();
    }

    public boolean isEmpty() {
        return this.Yg.trim().isEmpty();
    }

    private static String uc() {
        StringBuilder stringBuilder = new StringBuilder(4096);
        for (char c2 = '\u0000'; c2 < '\uffff'; c2 = (char)(c2 + '\u0001')) {
            if (!l.o(c2) && c2 != 32) continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    @Generated
    public String getText() {
        return this.Yg;
    }

    @Generated
    public boolean ud() {
        return this.azF;
    }

    @Generated
    public int ue() {
        return this.aJV;
    }

    @Generated
    public aka nH() {
        return this.aqy;
    }

    @Generated
    public float tN() {
        return this.width;
    }

    @Generated
    public agf eb() {
        return this.lq;
    }

    @Generated
    public Color nM() {
        return this.anq;
    }

    @Generated
    public ago uf() {
        return this.aJW;
    }

    @Generated
    public String ug() {
        return this.aJX;
    }

    @Generated
    public boolean uh() {
        return this.aJY;
    }

    @Generated
    public int ui() {
        return this.aJZ;
    }

    @Generated
    public int uj() {
        return this.aKa;
    }

    @Generated
    public String uk() {
        return this.aKb;
    }

    @Generated
    public double getPosX() {
        return this.gW;
    }

    @Generated
    public double ul() {
        return this.aKc;
    }

    @Generated
    public double um() {
        return this.aKd;
    }

    @Generated
    public a un() {
        return this.aKg;
    }

    @Generated
    public void bX(String string) {
        this.Yg = string;
    }

    @Generated
    public void I(boolean bl2) {
        this.azF = bl2;
    }

    @Generated
    public void ar(int n2) {
        this.aJV = n2;
    }

    @Generated
    public void h(aka aka2) {
        this.aqy = aka2;
    }

    @Generated
    public void z(float f2) {
        this.width = f2;
    }

    @Generated
    public void c(agf agf2) {
        this.lq = agf2;
    }

    @Generated
    public void b(Color color) {
        this.anq = color;
    }

    @Generated
    public void a(ago ago2) {
        this.aJW = ago2;
    }

    @Generated
    public void bY(String string) {
        this.aJX = string;
    }

    @Generated
    public void J(boolean bl2) {
        this.aJY = bl2;
    }

    @Generated
    public void as(int n2) {
        this.aJZ = n2;
    }

    @Generated
    public void at(int n2) {
        this.aKa = n2;
    }

    @Generated
    public void bZ(String string) {
        this.aKb = string;
    }

    @Generated
    public void setPosX(double d2) {
        this.gW = d2;
    }

    @Generated
    public void W(double d2) {
        this.aKc = d2;
    }

    @Generated
    public void X(double d2) {
        this.aKd = d2;
    }

    @Generated
    public void A(float f2) {
        this.aKe = f2;
    }

    @Generated
    public void B(float f2) {
        this.aKf = f2;
    }

    @Generated
    public void e(a a2) {
        this.aKg = a2;
    }
}

