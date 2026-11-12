/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.security.a;
import java.util.regex.Pattern;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.at;
import net.minecraft.network.play.server.c;
import net.minecraft.util.ba;

public final class aaz
extends a {
    private static final Pattern axQ = Pattern.compile(".*\\$\\{[^}]*}.*");

    public aaz() {
        super("Log4J RCE Check", "Someone attempted to utilize the Log4J exploit");
    }

    @Override
    public boolean k(aj<?> aj2) {
        if (aj2 instanceof at) {
            at at2 = (at)aj2;
            String string = at2.getSoundName();
            return axQ.matcher(string).matches();
        }
        if (aj2 instanceof c) {
            c c2 = (c)aj2;
            ba ba2 = c2.DM();
            return axQ.matcher(ba2.arq()).matches() || axQ.matcher(ba2.getFormattedText()).matches();
        }
        return false;
    }
}

