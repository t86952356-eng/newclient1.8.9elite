/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aea;
import java.io.File;

public class afu {
    public static final File aIj = new File(aea.aER.bhf, a.b);

    public void init() {
        if (!aIj.exists()) {
            aIj.mkdir();
        }
    }
}

