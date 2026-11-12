/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import net.optifine.expr.d;
import net.optifine.expr.l;
import net.optifine.expr.m;
import net.optifine.expr.o;

public class v {
    public static void main(String[] stringArray) {
        d d2 = new d(null);
        while (true) {
            try {
                while (true) {
                    l l2;
                    InputStreamReader inputStreamReader;
                    BufferedReader bufferedReader;
                    String string;
                    if ((string = (bufferedReader = new BufferedReader(inputStreamReader = new InputStreamReader(System.in))).readLine()).length() <= 0) {
                        return;
                    }
                    l l3 = d2.ih(string);
                    if (l3 instanceof o) {
                        l2 = (o)l3;
                        float f2 = l2.aCr();
                        System.out.println("" + f2);
                    }
                    if (!(l3 instanceof m)) continue;
                    l2 = (m)l3;
                    boolean bl2 = l2.aCt();
                    System.out.println("" + bl2);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                continue;
            }
            break;
        }
    }
}

