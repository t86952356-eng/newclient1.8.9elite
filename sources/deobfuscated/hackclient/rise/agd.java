/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aft;
import hackclient.rise.afv;
import hackclient.rise.aks;
import java.io.File;
import java.nio.file.Files;
import rise.Client;
import rise.module.Mode;
import rise.module.impl.player.Insults;

public final class agd
extends aft {
    public agd(File file, afv afv2) {
        super(file, afv2);
    }

    @Override
    public boolean tt() {
        if (!(this.sZ().exists() && this.sZ().isFile() && this.sZ().canRead())) {
            return false;
        }
        try {
            Insults insults = Client.a.g().c(Insults.class);
            String string = this.sZ().getName().replace(".txt", "");
            insults.Vb.a(new Mode[]{new aks(string)});
            insults.Vc.put(string, Files.readAllLines(this.sZ().toPath()));
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean tu() {
        try {
            if (!this.sZ().exists()) {
                this.sZ().createNewFile();
            }
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
}

