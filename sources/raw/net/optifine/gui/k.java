/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 */
package net.optifine.gui;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import hackclient.rise.agg;
import java.math.BigInteger;
import java.net.URI;
import java.util.Random;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.src.a;
import net.optifine.aw;
import net.optifine.gui.b;
import net.optifine.gui.l;

public class k
extends l {
    private final bp ejZ;
    private String aAJ;
    private String jc;
    private long eka;
    private String ekb;
    private b ekc;
    private final agg ekd;

    public k(bp bp2) {
        this.ekd = a.AZ().fontRendererObj;
        this.ejZ = bp2;
    }

    @Override
    public void initGui() {
        int n2 = 0;
        this.aAJ = I18n.a("of.options.capeOF.title", new Object[0]);
        this.buttonList.add(new b(210, this.width / 2 - 155, this.height / 6 + 24 * ((n2 += 2) >> 1), 150, 20, I18n.a("of.options.capeOF.openEditor", new Object[0])));
        this.buttonList.add(new b(220, this.width / 2 - 155 + 160, this.height / 6 + 24 * (n2 >> 1), 150, 20, I18n.a("of.options.capeOF.reloadCape", new Object[0])));
        this.ekc = new b(230, this.width / 2 - 100, this.height / 6 + 24 * ((n2 += 6) >> 1), 200, 20, I18n.a("of.options.capeOF.copyEditorLink", new Object[0]));
        this.ekc.visible = this.ekb != null;
        this.buttonList.add(this.ekc);
        this.buttonList.add(new b(200, this.width / 2 - 100, this.height / 6 + 24 * ((n2 += 4) >> 1), I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 200) {
                aER.a(this.ejZ);
            }
            if (c2.id == 210) {
                try {
                    String string = aER.Bl().afK().getName();
                    String string2 = aER.Bl().afK().getId().toString().replace("-", "");
                    String string3 = aER.Bl().atE();
                    Random random = new Random();
                    Random random2 = new Random(System.identityHashCode(new Object()));
                    BigInteger bigInteger = new BigInteger(128, random);
                    BigInteger bigInteger2 = new BigInteger(128, random2);
                    BigInteger bigInteger3 = bigInteger.xor(bigInteger2);
                    String string4 = bigInteger3.toString(16);
                    aER.BA().joinServer(aER.Bl().afK(), string3, string4);
                    String string5 = "https://optifine.net/capeChange?u=" + string2 + "&n=" + string + "&s=" + string4;
                    boolean bl2 = a.a(new URI(string5));
                    if (bl2) {
                        this.e(aw.cf("of.message.capeOF.openEditor"), 10000L);
                    } else {
                        this.e(aw.cf("of.message.capeOF.openEditorError"), 10000L);
                        this.il(string5);
                    }
                }
                catch (InvalidCredentialsException invalidCredentialsException) {
                    a.X(I18n.a("of.message.capeOF.error1", new Object[0]), I18n.a("of.message.capeOF.error2", invalidCredentialsException.getMessage()));
                    a.warn("Mojang authentication failed");
                    a.warn(((Object)((Object)invalidCredentialsException)).getClass().getName() + ": " + invalidCredentialsException.getMessage());
                }
                catch (Exception exception) {
                    a.warn("Error opening OptiFine cape link");
                    a.warn(exception.getClass().getName() + ": " + exception.getMessage());
                }
            }
            if (c2.id == 220) {
                this.e(aw.cf("of.message.capeOF.reloadCape"), 15000L);
                if (k.aER.bgK != null) {
                    long l2 = 15000L;
                    long l3 = System.currentTimeMillis() + 15000L;
                    k.aER.bgK.m(l3);
                }
            }
            if (c2.id == 230 && this.ekb != null) {
                k.setClipboardString(this.ekb);
            }
        }
    }

    private void e(String string, long l2) {
        this.jc = string;
        this.eka = System.currentTimeMillis() + l2;
        this.il(null);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.ekd, this.aAJ, this.width / 2, 20, 0xFFFFFF);
        if (this.jc != null) {
            this.drawCenteredString(this.ekd, this.jc, this.width / 2, this.height / 6 + 60, 0xFFFFFF);
            if (System.currentTimeMillis() > this.eka) {
                this.jc = null;
                this.il(null);
            }
        }
        super.drawScreen(n2, n3, f2);
    }

    public void il(String string) {
        this.ekb = string;
        this.ekc.visible = string != null;
    }
}

