/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.ahg;
import hackclient.rise.ahn;
import lombok.Generated;
import net.minecraft.network.play.client.b;
import net.minecraft.util.s;
import rise.Client;
import rise.util.InstanceAccess;

public final class afl
implements InstanceAccess {
    public static void b(Object object, Object ... objectArray) {
        if (afl.aER.bgK != null) {
            String string = String.format(ahg.cf(object.toString()), objectArray);
            afl.aER.bgK.a(new s(afl.getPrefix() + string));
            System.out.println(object);
        }
    }

    public static void c(Object object, Object ... objectArray) {
    }

    public static void d(Object object, Object ... objectArray) {
        if (afl.aER.bgK != null) {
            String string = objectArray == null || objectArray.length == 0 ? object.toString() : String.format(object.toString(), objectArray);
            afl.aER.bgK.a(new s(string));
        }
    }

    public static void i(Object object) {
        if (afl.aER.bgK != null) {
            ahn.m(new b(object.toString()));
        }
    }

    public static String getPrefix() {
        return Client.b + " \u00bb ";
    }

    @Generated
    private afl() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

