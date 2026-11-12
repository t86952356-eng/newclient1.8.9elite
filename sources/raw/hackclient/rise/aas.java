/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aam;
import hackclient.rise.aan;

public class aas
extends aam {
    public aas() {
        super(aan.axB, false);
    }

    @Override
    public boolean on() {
        Thread thread = a.a.f().ox();
        if (!thread.isAlive() || thread.isInterrupted()) {
            a.a.f().os();
            return true;
        }
        return false;
    }
}

