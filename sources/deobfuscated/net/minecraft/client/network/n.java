/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.network;

import net.minecraft.network.play.server.bj;
import net.minecraft.network.play.server.cb;

class n {
    static final /* synthetic */ int[] bFf;
    static final /* synthetic */ int[] bFg;

    static {
        bFg = new int[bj.values().length];
        try {
            n.bFg[bj.dey.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n.bFg[bj.dez.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n.bFg[bj.deA.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n.bFg[bj.deB.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        bFf = new int[cb.values().length];
        try {
            n.bFf[cb.dfG.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n.bFf[cb.dfH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n.bFf[cb.dfK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

