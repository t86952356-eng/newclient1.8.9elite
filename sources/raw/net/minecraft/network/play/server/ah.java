/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.ai;

public class ah
implements aj<a> {
    private int crw;
    private final List<ai> ddj = Lists.newArrayList();

    public ah() {
    }

    public ah(int n2, Collection<e> collection) {
        this.crw = n2;
        for (e e2 : collection) {
            this.ddj.add(new ai(this, e2.Xx().Xs(), e2.Xy(), e2.Xz()));
        }
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        int n2 = ak2.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = ak2.gs(64);
            double d2 = ak2.readDouble();
            ArrayList arrayList = Lists.newArrayList();
            int n3 = ak2.afw();
            for (int i3 = 0; i3 < n3; ++i3) {
                UUID uUID = ak2.afy();
                arrayList.add(new net.minecraft.entity.ai.attributes.a(uUID, "Unknown synced attribute modifier", ak2.readDouble(), ak2.readByte()));
            }
            this.ddj.add(new ai(this, string, d2, arrayList));
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        ak2.writeInt(this.ddj.size());
        for (ai ai2 : this.ddj) {
            ak2.eS(ai2.ahc());
            ak2.writeDouble(ai2.ahd());
            ak2.gr(ai2.ahe().size());
            for (net.minecraft.entity.ai.attributes.a a2 : ai2.ahe()) {
                ak2.i(a2.Xo());
                ak2.writeDouble(a2.Xq());
                ak2.writeByte(a2.Xp());
            }
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityId() {
        return this.crw;
    }

    public List<ai> ahb() {
        return this.ddj;
    }
}

