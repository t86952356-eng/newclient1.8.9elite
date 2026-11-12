/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

import java.util.Set;
import net.minecraft.util.ao;

public class SetVisibility {
    private static final int bTO = ao.values().length;
    private long bTP;

    public void a(Set<ao> set) {
        for (ao ao2 : set) {
            for (ao ao3 : set) {
                this.a(ao2, ao3, true);
            }
        }
    }

    public void a(ao ao2, ao ao3, boolean bl2) {
        this.j(ao2.ordinal() + ao3.ordinal() * bTO, bl2);
        this.j(ao3.ordinal() + ao2.ordinal() * bTO, bl2);
    }

    public void aq(boolean bl2) {
        this.bTP = bl2 ? -1L : 0L;
    }

    public boolean b(ao ao2, ao ao3) {
        return this.dv(ao2.ordinal() + ao3.ordinal() * bTO);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ');
        for (ao ao2 : ao.values()) {
            stringBuilder.append(' ').append(ao2.toString().toUpperCase().charAt(0));
        }
        stringBuilder.append('\n');
        for (ao ao2 : ao.values()) {
            stringBuilder.append(ao2.toString().toUpperCase().charAt(0));
            for (ao ao3 : ao.values()) {
                if (ao2 == ao3) {
                    stringBuilder.append("  ");
                    continue;
                }
                boolean bl2 = this.b(ao2, ao3);
                stringBuilder.append(' ').append(bl2 ? (char)'Y' : 'n');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    private boolean dv(int n2) {
        return (this.bTP & (long)(1 << n2)) != 0L;
    }

    private void j(int n2, boolean bl2) {
        if (bl2) {
            this.dw(n2);
        } else {
            this.dx(n2);
        }
    }

    private void dw(int n2) {
        this.bTP |= (long)(1 << n2);
    }

    private void dx(int n2) {
        this.bTP &= (long)(~(1 << n2));
    }
}

