/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.afv;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import lombok.Generated;

public abstract class aft
implements aea {
    private final File aIh;
    private final afv aIi;

    public abstract boolean tt();

    public abstract boolean tu();

    public void a(String string, ArrayList<String> arrayList) {
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(string, "UTF-8");
        }
        catch (FileNotFoundException | UnsupportedEncodingException iOException) {
            throw new RuntimeException(iOException);
        }
        for (String string2 : arrayList) {
            printWriter.println(string2);
        }
        printWriter.close();
    }

    public ArrayList<String> tv() {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(this.sZ());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException(fileNotFoundException);
        }
        return arrayList;
    }

    @Generated
    public File sZ() {
        return this.aIh;
    }

    @Generated
    public afv tw() {
        return this.aIi;
    }

    @Generated
    public aft(File file, afv afv2) {
        this.aIh = file;
        this.aIi = afv2;
    }
}

