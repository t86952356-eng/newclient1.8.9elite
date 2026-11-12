/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.afu;
import hackclient.rise.afv;
import hackclient.rise.afz;
import java.io.File;
import java.util.ArrayList;
import lombok.Generated;
import rip.vantage.commons.util.time.a;

public class aga
extends ArrayList<afz> {
    public static final File aIw = new File(afu.aIj, "configs");
    private afz aIx;
    private final a aIy = new a();

    public void init() {
        if (!aIw.exists()) {
            aIw.mkdir();
        }
        this.aIy.i(5000L);
        this.update();
    }

    public void tC() {
        File file = new File(aIw, "latest.json");
        afz afz2 = new afz(file, afv.aIl);
        afz2.tB();
        afz2.tt();
        this.aIx = afz2;
    }

    public afz bL(String string) {
        File file = new File(aIw, string + ".json");
        return new afz(file, afv.aIl);
    }

    public void d(String string, boolean bl2) {
        File file = new File(aIw, string + ".json");
        afz afz2 = this.bL(string);
        if (bl2) {
            afz2.tB();
        }
        if (afz2 == null) {
            afz2 = new afz(file, afv.aIl);
            this.add(afz2);
            System.out.println("Creating new config...");
        } else {
            System.out.println("Overwriting existing config...");
        }
        afz2.tu();
        System.out.println("Config saved to files.");
    }

    public boolean update() {
        this.clear();
        File[] fileArray = aIw.listFiles();
        if (fileArray == null) {
            return false;
        }
        for (File file : fileArray) {
            if (!file.getName().endsWith(".json")) continue;
            this.add(new afz(file, afv.aIl, file.getName().replace(".json", "")));
        }
        return true;
    }

    public boolean bM(String string) {
        afz afz2 = this.bL(string);
        if (afz2 == null) {
            return false;
        }
        this.remove(afz2);
        return afz2.sZ().delete();
    }

    public a nh() {
        return this.aIy;
    }

    @Generated
    public afz tD() {
        return this.aIx;
    }
}

