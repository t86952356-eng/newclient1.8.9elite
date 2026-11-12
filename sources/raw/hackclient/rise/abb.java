/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.security.a;
import hackclient.rise.ahn;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.ad;
import net.minecraft.network.play.client.ae;
import net.minecraft.network.play.server.ce;

public final class abb
extends a {
    public abb() {
        super("Resource Pack Check", "Server attempted to view files on the computer");
    }

    @Override
    public boolean k(aj<?> aj2) {
        if (aj2 instanceof ce) {
            ce ce2 = (ce)aj2;
            String string = ce2.getURL();
            String string2 = ce2.getHash();
            if (string.toLowerCase().startsWith("level://")) {
                return this.q(string, string2);
            }
        }
        return false;
    }

    private boolean q(String string, String string2) {
        try {
            URI uRI = new URI(string);
            String string3 = uRI.getScheme();
            boolean bl2 = "level".equals(string3);
            if (!("http".equals(string3) || "https".equals(string3) || bl2)) {
                throw new URISyntaxException(string, "Wrong protocol");
            }
            string = URLDecoder.decode(string.substring("level://".length()), StandardCharsets.UTF_8.toString());
            if (bl2 && (string.contains("..") || !string.endsWith("/resources.zip"))) {
                System.out.println("Server tried to access the path: " + string);
                throw new URISyntaxException(string, "Invalid levelstorage resource pack path");
            }
            return false;
        }
        catch (Exception exception) {
            ahn.n(new ad(string2, ae.dbY));
            return true;
        }
    }
}

