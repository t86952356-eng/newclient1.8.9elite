/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aeo;
import hackclient.rise.afe;
import hackclient.rise.aff;
import hackclient.rise.afu;
import hackclient.rise.afv;
import hackclient.rise.afw;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class afy {
    public static final File aIs = new File(afu.aIj, "alts");
    private final List<aeo> aIt = new ArrayList<aeo>();

    public void init() {
        if (!aIs.exists()) {
            aIs.mkdir();
        }
        aff.init();
        afe.init();
    }

    public afw ty() {
        return new afw(this.sZ(), afv.aIk);
    }

    public boolean tz() {
        return this.ty().tt();
    }

    public boolean update() {
        return this.ty().tu();
    }

    private File sZ() {
        return new File(aIs, "alts.json");
    }

    public List<aeo> tA() {
        return this.aIt;
    }
}

