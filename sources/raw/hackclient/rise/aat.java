/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aam;
import hackclient.rise.aan;

public final class aat
extends aam {
    public aat() {
        super(aan.axz, false);
        System.setSecurityManager(null);
    }

    @Override
    public boolean on() {
        if (System.getSecurityManager() != null) {
            a.a.f().os();
            return true;
        }
        return false;
    }
}

