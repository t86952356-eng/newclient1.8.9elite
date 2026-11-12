/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afu;
import hackclient.rise.afv;
import hackclient.rise.agd;
import java.io.File;
import java.util.ArrayList;

public final class age
extends ArrayList<agd> {
    public static final File aIC = new File(afu.aIj, "insults");

    public void init() {
        if (!aIC.exists()) {
            aIC.mkdir();
        }
    }

    public agd bP(String string) {
        for (agd agd2 : this) {
            if (!agd2.sZ().getName().equalsIgnoreCase(string + ".txt")) continue;
            return agd2;
        }
        return null;
    }

    public void bO(String string) {
        File file = new File(aIC, string + ".txt");
        agd agd2 = this.bP(string);
        if (agd2 == null) {
            agd2 = new agd(file, afv.aIm);
            this.add(agd2);
            System.out.println("Creating new ..");
        } else {
            System.out.println("Overwriting existing ..");
        }
        agd2.tu();
        System.out.println("Insults saved to files.");
    }

    public boolean update() {
        this.clear();
        File[] fileArray = aIC.listFiles();
        if (fileArray == null) {
            return false;
        }
        for (File file : fileArray) {
            if (!file.getName().endsWith(".txt")) continue;
            this.add(new agd(file, afv.aIm));
        }
        return true;
    }

    public boolean bM(String string) {
        agd agd2 = this.bP(string);
        if (agd2 == null) {
            return false;
        }
        this.remove(agd2);
        return agd2.sZ().delete();
    }
}

