/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;
import rise.util.InstanceAccess;

public final class aju
implements InstanceAccess {
    private static int aRg;

    public static void L(boolean bl2) {
        if (aju.aER.bgK != null && aju.aER.bgK.aRg != aRg) {
            if (bl2) {
                aju.cn("rise.toggle.enable");
            } else {
                aju.cn("rise.toggle.disable");
            }
            aRg = aju.aER.bgK.aRg;
        }
    }

    public static void cn(String string) {
        aju.a(string, 1.0f, 1.0f);
    }

    public static void a(String string, float f2, float f3) {
        aju.aER.bgF.a(aju.aER.bgK.gW, aju.aER.bgK.gX, aju.aER.bgK.gY, string, f2, f3, false);
    }

    @Generated
    private aju() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

