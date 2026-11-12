/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.antivoid;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.AntiVoid;
import rise.value.NumberValue;

public class PacketMode
extends Mode<AntiVoid> {
    private final NumberValue aip = new NumberValue("Distance", this, (Number)5, (Number)0, (Number)10, (Number)1);
    @EventLink
    public final Listener<PreMotionEvent> aiq = preMotionEvent -> {
        if (PacketMode.aER.bgK.csf > ((Number)this.aip.wD()).floatValue() && !aik.vw()) {
            ahn.m(new f());
        }
    };

    public PacketMode(String string, AntiVoid antiVoid) {
        super(string, antiVoid);
    }
}

