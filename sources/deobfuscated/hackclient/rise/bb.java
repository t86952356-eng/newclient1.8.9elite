/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.l;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.r;
import net.minecraft.network.play.client.z;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;

public final class bb
extends am {
    private static boolean cI;
    private static boolean cJ;
    private static boolean cK;
    private static boolean cL;
    private static boolean cM;
    private static boolean cN;
    @EventLink(cH=4)
    public final Listener<PacketSendEvent> cO = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof l) {
            cI = true;
        } else if (aj2 instanceof m) {
            cK = true;
        } else if (aj2 instanceof c) {
            cJ = true;
        } else if (aj2 instanceof k) {
            cL = true;
        } else if (aj2 instanceof i) {
            cL = true;
            cN = true;
        } else if (aj2 instanceof r || aj2 instanceof z && ((z)aj2).agh() == aa.dbR || aj2 instanceof q) {
            cM = true;
        } else if (aj2 instanceof e) {
            bb.aX();
        }
    };

    public static boolean aW() {
        return bb.a(true, true, true, true, true, false);
    }

    public static boolean a(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        return bb.a(bl2, bl3, bl4, bl5, bl6, false);
    }

    public static boolean a(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        return cI && bl2 || cJ && bl3 || cK && bl4 || cL && bl5 || cM && bl6 || cN && bl7;
    }

    public static void aX() {
        cI = false;
        cK = false;
        cJ = false;
        cL = false;
        cM = false;
        cN = false;
    }
}

