/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aho;
import hackclient.rise.bn;
import java.util.Set;
import net.minecraft.network.aj;

final class br
extends aho {
    private final Set<bn> eu;

    private br(aj<?> aj2, Set<bn> set) {
        super(aj2);
        this.eu = set;
    }

    private boolean a(bn bn2) {
        return this.eu.remove(bn2);
    }

    private void c(long l2) {
        this.eu.removeIf(bn2 -> bn2.a(this.getTime(), l2));
    }

    private boolean b(bn bn2) {
        return this.eu.contains(bn2);
    }

    private boolean bt() {
        return this.eu.stream().anyMatch(bn::bd);
    }
}

