/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.afm;
import hackclient.rise.afz;
import hackclient.rise.ahg;
import hackclient.rise.s;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import net.minecraft.event.a;
import net.minecraft.event.b;
import net.minecraft.event.d;
import rip.vantage.commons.packet.impl.client.community.c;
import rise.config.ConfigManager;

public final class x
extends s {
    public x() {
        super("command.config.description", "config", "configs", "cfg", "settings", "c");
    }

    @Override
    public void execute(String[] stringArray) {
        ConfigManager configManager = this.sd().p();
        String string = stringArray[1].toLowerCase();
        block1 : switch (stringArray.length) {
            case 3: {
                String string2 = stringArray[2];
                switch (string) {
                    case "load": {
                        configManager.update();
                        afz afz3 = configManager.bL(string2);
                        if (afz3 != null) {
                            CompletableFuture.runAsync(() -> {
                                if (afz3.tt()) {
                                    afl.b("command.config.loaded", string2);
                                    if (!string2.equalsIgnoreCase("latest")) {
                                        afl.b("command.config.accident", new Object[0]);
                                    }
                                    try {
                                        afm.sY().bD(string2);
                                    }
                                    catch (Throwable throwable) {}
                                } else {
                                    rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new c(string2).aJz());
                                }
                            });
                            break block1;
                        }
                        rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new c(string2).aJz());
                        break block1;
                    }
                    case "save": 
                    case "create": {
                        if (string2.equalsIgnoreCase("latest")) {
                            afl.b("command.config.reserved", new Object[0]);
                            return;
                        }
                        CompletableFuture.runAsync(() -> {
                            configManager.d(string2, false);
                            afl.b("command.config.saved", new Object[0]);
                            afl.b("command.config.reminder", new Object[0]);
                        });
                        break block1;
                    }
                }
                afl.b("command.config.usage", new Object[0]);
                break;
            }
            case 2: {
                switch (string) {
                    case "list": {
                        afl.b("command.config.selectload", new Object[0]);
                        configManager.update();
                        configManager.forEach(afz2 -> {
                            String string = afz2.sZ().getName().replace(".json", "");
                            String string2 = ".config load " + string;
                            String string3 = this.rP().rX().toString();
                            net.minecraft.util.s s2 = new net.minecraft.util.s(string3 + "> " + string);
                            net.minecraft.util.s s3 = new net.minecraft.util.s(String.format(ahg.cf("command.config.loadhover"), string));
                            s2.arp().a(new a(b.cKK, string2)).a(new net.minecraft.event.c(d.cKU, s3));
                            x.aER.bgK.a(s2);
                        });
                        break block1;
                    }
                    case "folder": {
                        try {
                            Desktop desktop = Desktop.getDesktop();
                            File file = new File(String.valueOf(ConfigManager.aIw));
                            desktop.open(file);
                            afl.b("command.config.folder", new Object[0]);
                        }
                        catch (IOException | IllegalArgumentException exception) {
                            afl.b("command.config.notfound", new Object[0]);
                        }
                        break block1;
                    }
                }
                afl.b("command.config.actions", new Object[0]);
                break;
            }
            default: {
                afl.b("command.config.actions", new Object[0]);
            }
        }
    }
}

