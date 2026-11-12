/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.io.File;
import rise.Client;
import rise.util.InstanceAccess;

public class afu {
    public static final File aIj = new File(InstanceAccess.aER.bhf, Client.b);

    public void init() {
        if (!aIj.exists()) {
            aIj.mkdir();
        }
    }
}

