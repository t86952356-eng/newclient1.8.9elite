/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.abf;
import hackclient.rise.afu;
import hackclient.rise.afv;
import hackclient.rise.agb;
import java.io.File;
import java.util.ArrayList;

public class agc
extends ArrayList<agb> {
    public static final File aIB = new File(afu.aIj, "data");

    public void init() {
        a.a.a(new abf());
        if (!aIB.exists()) {
            aIB.mkdir();
        }
        this.update();
    }

    public agb e(String string, boolean bl2) {
        File file = new File(aIB, string + ".json");
        agb agb2 = new agb(file, afv.aIl);
        if (bl2) {
            agb2.tE();
        }
        return agb2;
    }

    public agb bN(String string) {
        File file = new File(aIB, string + ".json");
        agb agb2 = new agb(file, afv.aIl);
        agb2.tE();
        return agb2;
    }

    public void bO(String string) {
        File file = new File(aIB, string + ".json");
        agb agb2 = this.bN(string);
        if (agb2 == null) {
            agb2 = new agb(file, afv.aIl);
            this.add(agb2);
            System.out.println("Creating new config...");
        } else {
            System.out.println("Overwriting existing config...");
        }
        agb2.tu();
        System.out.println("Config saved to files.");
    }

    public boolean update() {
        this.clear();
        File[] fileArray = aIB.listFiles();
        if (fileArray == null) {
            return false;
        }
        for (File file : fileArray) {
            if (!file.getName().endsWith(".json")) continue;
            this.add(new agb(file, afv.aIl));
        }
        return true;
    }

    public boolean bM(String string) {
        agb agb2 = this.bN(string);
        if (agb2 == null) {
            return false;
        }
        this.remove(agb2);
        return agb2.sZ().delete();
    }
}

