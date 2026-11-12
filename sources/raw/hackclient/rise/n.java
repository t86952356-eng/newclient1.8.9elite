/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.m;
import java.util.UUID;
import net.minecraft.client.entity.b;

public final class n {
    public void b(b b2) {
        a.a.n().G().put(b2.Ul(), new m(b2));
    }

    public void a(UUID uUID) {
        a.a.n().G().remove(uUID);
    }
}

