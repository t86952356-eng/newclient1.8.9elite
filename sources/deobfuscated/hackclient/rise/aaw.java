/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aam;
import hackclient.rise.aan;
import hackclient.rise.aeg;
import hackclient.rise.aeh;
import java.io.File;
import java.nio.file.Files;
import java.util.Locale;
import rise.Client;

public final class aaw
extends aam {
    private final File axK = new File((String)(aeg.sl() == aeh.aEX ? System.getenv("WinDir") + "\\System32\\drivers\\etc\\hosts" : "/etc/hosts"));

    public aaw() {
        super(aan.axy, false);
    }

    @Override
    public boolean on() {
        new Thread(() -> {
            try {
                while (true) {
                    if (!(this.axK.exists() && this.axK.canRead() && this.axK.isFile())) {
                        Client.a.f().os();
                    }
                    for (String string : Files.readAllLines(this.axK.toPath())) {
                        String string2 = string.toLowerCase(Locale.ENGLISH).trim();
                        if (!string2.contains("riseclient.com") && !string2.contains("vantage")) continue;
                        Client.a.f().os();
                    }
                    Thread.sleep(5000L);
                }
            }
            catch (Throwable throwable) {
                Client.a.f().os();
                return;
            }
        }).start();
        return false;
    }
}

