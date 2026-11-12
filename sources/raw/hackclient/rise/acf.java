/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abf;
import hackclient.rise.aca;
import hackclient.rise.aea;
import hackclient.rise.akb;

public final class acf
implements aca,
aea {
    @Override
    public void b(int n2, int n3, float f2) {
        abf abf2 = this.v();
        akb akb2 = new akb(abf2.ayt.x + 20.0f, abf2.ayt.y + 20.0f);
        akb akb3 = new akb(abf2.ayt.x + abf2.alQ.x / 2.0f, abf2.ayt.y + abf2.alQ.y - 14.0f);
        String string = "Start typing to search...";
    }
}

