/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aca;
import hackclient.rise.aiu;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import net.minecraft.client.gui.cz;
import rise.Client;
import rise.util.InstanceAccess;
import rise.util.math.Vector2f;

public class acg
implements aca,
InstanceAccess {
    @Override
    public void b(int n2, int n3, float f2) {
        Vector2f vector2f = this.v().pm();
        Vector2f vector2f2 = this.v().pn();
        double d2 = this.v().po().ayX;
        gb.ks.a(32, gd.kG).a(Client.b, (double)vector2f.getX() + d2 + 20.0, vector2f.getY() + 20.0f, Color.WHITE.getRGB());
        gb.ks.a(16, gd.kG).a("6", (double)vector2f.getX() + d2 + 20.0 + (double)gb.ks.a(32, gd.kG).bQ(Client.b), vector2f.getY() + 18.0f, new Color(255, 255, 255, 100).getRGB());
        gb.ks.a(17, gd.kG).a("6.9.9", (double)vector2f.getX() + d2 + 20.0, vector2f.getY() + 50.0f, new Color(255, 255, 255, 164).getRGB());
        int n4 = 45;
        double d3 = (double)System.currentTimeMillis() / 1000.0 % 45.0 * 11.0;
        aiu.hQ();
        aiu.a(new cz(aER), (double)vector2f.getX() + d2, vector2f.getY() + 90.0f, vector2f2.getX(), vector2f2.getY() - 175.0f);
        gb.ks.a(17, gd.kG).a(acg.qJ(), (double)vector2f.getX() + d2 + 20.0, (double)(vector2f.getY() + 100.0f) - d3 + (double)(vector2f2.getY() - 175.0f), new Color(164, 164, 164, 64).getRGB());
        gb.ks.a(17, gd.kG).a(acg.qK(), (double)vector2f.getX() + d2 + 155.0, (double)(vector2f.getY() + 100.0f) - d3 + (double)(vector2f2.getY() - 175.0f), new Color(164, 164, 164, 64).getRGB());
        aiu.disable();
    }

    private static String qJ() {
        return "Rise 6 (riseclient.com)\n\nDesigned and built by Alan and Hazsi.\n\nAdditional Development\n  -> Nicklas, Tecnio, Patrick, Strikeless\n\nUI/UX Design\n  -> Hazsi, Alan\n\nRendering/OpenGL\n  -> Patrick, Strikeless\n\nProtection and Obfuscation\n  -> Alan, NyanCatForEver\n\nScripting Documentation\n  -> Alice\n\nLocalization\n-> a cat (Romanian)\n-> Alice (Russian)\n-> Bx2 (Arabic)\n-> El Gatito Grande (Portuguese)\n-> days (Hebrew)\n-> Duits/Jess (Indonesian)\n-> fan87 (Chinese Traditional)\n-> Grekgamer13 (Greek)\n-> Jb (Austrian)\n-> kinja (Polish)\n-> I_only_die_twice (Swedish)\n\nSpecial Thanks\n  -> Auth and Error as contributing to development\n  -> Config and script makers\n  -> You, as a user of Rise. Thank you, on behalf of all of us!\n";
    }

    private static String qK() {
        return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-> im ray (Latvian)\n-> Novus (Spanish)\n-> Mongrall (Hungarian)\n-> MOON (Italian)\n-> Stimular (Czech)\n-> Tapludeforfair (French)\n-> toastedwaffles (Vietnamese)\n-> trollo (German)\n-> Velcola (Norwegian)\n-> whoistinywifi (Thai)\n-> YK_FCZ (Chinese Simplified)\n";
    }
}

