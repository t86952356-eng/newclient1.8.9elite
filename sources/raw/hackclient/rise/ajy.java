/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ajz;

public class ajy {
    private static final String aRl = System.getProperty("os.name").toLowerCase();

    public static ajz wq() {
        if (aRl.contains("win")) {
            return ajz.aRm;
        }
        if (aRl.contains("mac")) {
            return ajz.aRn;
        }
        if (aRl.contains("nix") || aRl.contains("nux") || aRl.contains("aix")) {
            return ajz.aRo;
        }
        System.exit(0);
        return null;
    }
}

