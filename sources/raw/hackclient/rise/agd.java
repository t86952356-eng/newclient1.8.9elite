/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aft;
import hackclient.rise.afv;
import hackclient.rise.akg;
import hackclient.rise.aks;
import hackclient.rise.rx;
import java.io.File;
import java.nio.file.Files;

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
            rx rx2 = a.a.g().c(rx.class);
            String string = this.sZ().getName().replace(".txt", "");
            rx2.Vb.a(new akg[]{new aks(string)});
            rx2.Vc.put(string, Files.readAllLines(this.sZ().toPath()));
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

