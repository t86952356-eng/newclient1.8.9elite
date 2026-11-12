/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
package net.minecraft.network.play.server;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.List;
import net.minecraft.entity.player.e;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.bj;
import net.minecraft.network.play.server.bk;
import net.minecraft.util.ba;
import net.minecraft.world.ao;

public class bi
implements aj<a> {
    private bj dew;
    private final List<bk> dex = Lists.newArrayList();

    public bi() {
    }

    public bi(bj bj2, e ... eArray) {
        this.dew = bj2;
        for (e e2 : eArray) {
            this.dex.add(new bk(this, e2.Ie(), e2.aW, e2.cIZ.If(), e2.acy()));
        }
    }

    public bi(bj bj2, Iterable<e> iterable) {
        this.dew = bj2;
        for (e e2 : iterable) {
            this.dex.add(new bk(this, e2.Ie(), e2.aW, e2.cIZ.If(), e2.acy()));
        }
    }

    @Override
    public void a(ak ak2) {
        this.dew = ak2.k(bj.class);
        int n2 = ak2.afw();
        for (int i2 = 0; i2 < n2; ++i2) {
            GameProfile gameProfile = null;
            int n3 = 0;
            ao ao2 = null;
            ba ba2 = null;
            switch (this.dew.ordinal()) {
                case 0: {
                    gameProfile = new GameProfile(ak2.afy(), ak2.gs(16));
                    int n4 = ak2.afw();
                    for (int i3 = 0; i3 < n4; ++i3) {
                        String string = ak2.gs(Short.MAX_VALUE);
                        String string2 = ak2.gs(Short.MAX_VALUE);
                        if (ak2.readBoolean()) {
                            gameProfile.getProperties().put((Object)string, (Object)new Property(string, string2, ak2.gs(Short.MAX_VALUE)));
                            continue;
                        }
                        gameProfile.getProperties().put((Object)string, (Object)new Property(string, string2));
                    }
                    ao2 = ao.ii(ak2.afw());
                    n3 = ak2.afw();
                    if (!ak2.readBoolean()) break;
                    ba2 = ak2.afv();
                    break;
                }
                case 1: {
                    gameProfile = new GameProfile(ak2.afy(), null);
                    ao2 = ao.ii(ak2.afw());
                    break;
                }
                case 2: {
                    gameProfile = new GameProfile(ak2.afy(), null);
                    n3 = ak2.afw();
                    break;
                }
                case 3: {
                    gameProfile = new GameProfile(ak2.afy(), null);
                    if (!ak2.readBoolean()) break;
                    ba2 = ak2.afv();
                    break;
                }
                case 4: {
                    gameProfile = new GameProfile(ak2.afy(), null);
                }
            }
            this.dex.add(new bk(this, gameProfile, n3, ao2, ba2));
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.b(this.dew);
        ak2.gr(this.dex.size());
        for (bk bk2 : this.dex) {
            switch (this.dew.ordinal()) {
                case 0: {
                    ak2.i(bk2.afK().getId());
                    ak2.eS(bk2.afK().getName());
                    ak2.gr(bk2.afK().getProperties().size());
                    for (Property property : bk2.afK().getProperties().values()) {
                        ak2.eS(property.getName());
                        ak2.eS(property.getValue());
                        if (property.hasSignature()) {
                            ak2.writeBoolean(true);
                            ak2.eS(property.getSignature());
                            continue;
                        }
                        ak2.writeBoolean(false);
                    }
                    ak2.gr(bk2.ahQ().awE());
                    ak2.gr(bk2.aG());
                    if (bk2.xW() == null) {
                        ak2.writeBoolean(false);
                        break;
                    }
                    ak2.writeBoolean(true);
                    ak2.j(bk2.xW());
                    break;
                }
                case 1: {
                    ak2.i(bk2.afK().getId());
                    ak2.gr(bk2.ahQ().awE());
                    break;
                }
                case 2: {
                    ak2.i(bk2.afK().getId());
                    ak2.gr(bk2.aG());
                    break;
                }
                case 3: {
                    ak2.i(bk2.afK().getId());
                    if (bk2.xW() == null) {
                        ak2.writeBoolean(false);
                        break;
                    }
                    ak2.writeBoolean(true);
                    ak2.j(bk2.xW());
                    break;
                }
                case 4: {
                    ak2.i(bk2.afK().getId());
                }
            }
        }
    }

    @Override
    public void a(a a2) {
        a2.b(this);
    }

    public List<bk> ahN() {
        return this.dex;
    }

    public bj ahO() {
        return this.dew;
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("action", (Object)this.dew).add("entries", this.dex).toString();
    }
}

