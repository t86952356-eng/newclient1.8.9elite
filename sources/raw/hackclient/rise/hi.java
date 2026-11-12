/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aem;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fg;
import hackclient.rise.gn;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class hi
extends akg<gn> {
    private final Set<UUID> ri = new HashSet<UUID>();
    private final Set<UUID> rj = new HashSet<UUID>();
    private final Set<String> rk = new HashSet<String>();
    private final Map<String, Integer> rl = new HashMap<String, Integer>();
    @dm
    public final dk<ei> rm = ei2 -> {
        if (hi.aER.bgF == null || hi.aER.bgK == null) {
            return;
        }
        for (Object e2 : hi.aER.bgF.dCY) {
            net.minecraft.entity.player.a a2;
            if (!(e2 instanceof net.minecraft.entity.player.a) || (a2 = (net.minecraft.entity.player.a)e2) == hi.aER.bgK) continue;
            String string = a2.xU();
            this.rl.putIfAbsent(string, a2.getEntityId());
            if (this.rk.contains(string) && this.rl.get(string).intValue() != a2.getEntityId()) {
                a.a.x().b(this, a2);
                continue;
            }
            this.rk.add(string);
            if (a2.Ie() == null) {
                a.a.x().b(this, a2);
                continue;
            }
            UUID uUID = a2.Ie().getId();
            if (uUID == null) {
                a.a.x().b(this, a2);
                continue;
            }
            if (uUID.version() != 4) {
                a.a.x().b(this, a2);
                continue;
            }
            if (this.rj.contains(uUID)) {
                a.a.x().b(this, a2);
                continue;
            }
            if (this.ri.contains(uUID)) continue;
            this.ri.add(uUID);
            aem.a(uUID, bl2 -> {
                block4: {
                    block3: {
                        this.ri.remove(uUID);
                        if (bl2.booleanValue()) break block3;
                        this.rj.add(uUID);
                        if (hi.aER.bgF == null) break block4;
                        for (Object e2 : hi.aER.bgF.dCY) {
                            net.minecraft.entity.player.a a2;
                            if (!(e2 instanceof net.minecraft.entity.player.a) || (a2 = (net.minecraft.entity.player.a)e2).Ie() == null || !uUID.equals(a2.Ie().getId())) continue;
                            a.a.x().b(this, a2);
                        }
                        break block4;
                    }
                    if (hi.aER.bgF != null) {
                        for (Object e3 : hi.aER.bgF.dCY) {
                            net.minecraft.entity.player.a a3;
                            if (!(e3 instanceof net.minecraft.entity.player.a) || (a3 = (net.minecraft.entity.player.a)e3).Ie() == null || !uUID.equals(a3.Ie().getId())) continue;
                            a.a.x().c(this, a3);
                        }
                    }
                }
            });
        }
    };
    @dm
    public final dk<fg> rn = fg2 -> {
        a.a.x().a(this);
        this.ri.clear();
        this.rj.clear();
        this.rk.clear();
        this.rl.clear();
        aem.sr();
    };

    public hi(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
        this.ri.clear();
        this.rj.clear();
        this.rk.clear();
        this.rl.clear();
    }
}

