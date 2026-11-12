/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.mg;
import org.lwjgl.input.Keyboard;

public class px
extends akg<mg> {
    @dm
    public final dk<ei> Pi = ei2 -> px.aER.aIY.chr.ay(true);

    public px(String string, mg mg2) {
        super(string, mg2);
    }

    @Override
    public void onDisable() {
        px.aER.aIY.chr.ay(Keyboard.isKeyDown((int)px.aER.aIY.chr.cO()));
    }
}

