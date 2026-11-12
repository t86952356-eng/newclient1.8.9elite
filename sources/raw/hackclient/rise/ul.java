/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tb;
import net.minecraft.network.play.client.f;

public class ul
extends akg<tb> {
    private final akq aip = new akq("Distance", this, (Number)5, (Number)0, (Number)10, (Number)1);
    @dm
    public final dk<ei> aiq = ei2 -> {
        if (ul.aER.bgK.csf > ((Number)this.aip.wD()).floatValue() && !aik.vw()) {
            ahn.m(new f());
        }
    };

    public ul(String string, tb tb2) {
        super(string, tb2);
    }
}

