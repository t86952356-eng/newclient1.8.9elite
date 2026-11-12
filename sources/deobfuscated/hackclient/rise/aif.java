/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aig;
import java.util.stream.IntStream;
import net.minecraft.client.Minecraft;
import net.minecraft.inventory.b;

public class aif {
    public static final int aON = 5;
    public static final int aOO = 9;
    public static final int aOP = 45;
    public static final int aOQ = 36;

    private aif() {
    }

    public static boolean a(b b2) {
        return IntStream.range(9, 45).allMatch(n2 -> b2.fM(n2).GJ());
    }

    public static void a(Minecraft minecraft, int n2, int n3, int n4, aig aig2) {
        minecraft.bgu.a(n2, n3, n4, aig2.ordinal(), minecraft.bgK);
    }
}

