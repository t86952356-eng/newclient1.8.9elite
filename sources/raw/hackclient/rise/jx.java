/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import hackclient.rise.jg;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.r;

public class jx
extends akg<jg> {
    private boolean xX = false;
    private boolean xY = false;
    private boolean xZ = false;
    @dm
    public final dk<fi> ya = fi2 -> {
        if (fi2.dq() instanceof n) {
            n n2 = (n)fi2.dq();
            if (n2.agb() == o.dbs) {
                if (this.xZ && this.xY) {
                    fi2.cF();
                    return;
                }
                this.xY = true;
                this.xZ = true;
            } else if (n2.agb() == o.dbt) {
                if (this.xZ && !this.xY) {
                    fi2.cF();
                    return;
                }
                this.xY = false;
                this.xZ = true;
            }
            return;
        }
        if (this.xX) {
            return;
        }
        if (fi2.dq() instanceof r || fi2.dq() instanceof q) {
            if (!this.xZ || !this.xY) {
                return;
            }
            fi2.cF();
            if (this.xY) {
                ahn.n(new n(jx.aER.bgK, o.dbt));
                this.xY = false;
                this.xZ = true;
            }
            this.xX = true;
            ahn.m(fi2.dq());
            this.xX = false;
            if (jx.aER.bgK.isSprinting() && !this.xY) {
                ahn.n(new n(jx.aER.bgK, o.dbs));
                this.xY = true;
                this.xZ = true;
            }
        }
    };

    public jx(String string, jg jg2) {
        super(string, jg2);
    }
}

