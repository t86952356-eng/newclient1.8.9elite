/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aeh;
import lombok.Generated;

public final class aeg {
    public static aeh sl() {
        String string = System.getProperty("os.name").toLowerCase();
        return string.contains("win") ? aeh.aEX : (string.contains("mac") ? aeh.aEY : (string.contains("solaris") ? aeh.aEW : (string.contains("sunos") ? aeh.aEW : (string.contains("linux") ? aeh.aEV : (string.contains("unix") ? aeh.aEV : aeh.aEZ)))));
    }

    @Generated
    private aeg() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

