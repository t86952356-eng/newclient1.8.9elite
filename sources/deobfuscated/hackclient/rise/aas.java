/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aam;
import hackclient.rise.aan;
import rise.Client;

public class aas
extends aam {
    public aas() {
        super(aan.axB, false);
    }

    @Override
    public boolean on() {
        Thread thread = Client.a.f().ox();
        if (!thread.isAlive() || thread.isInterrupted()) {
            Client.a.f().os();
            return true;
        }
        return false;
    }
}

