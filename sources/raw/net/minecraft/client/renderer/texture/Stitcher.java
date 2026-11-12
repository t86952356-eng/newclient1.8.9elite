/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.renderer.texture;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.minecraft.client.renderer.StitcherException;
import net.minecraft.client.renderer.texture.Stitcher$Holder;
import net.minecraft.client.renderer.texture.Stitcher$Slot;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.bt;

public class Stitcher {
    private final int bYw;
    private final Set<Stitcher$Holder> bYx = Sets.newHashSetWithExpectedSize((int)256);
    private final List<Stitcher$Slot> bYy = Lists.newArrayListWithCapacity((int)256);
    private int bYz;
    private int bYA;
    private final int bYB;
    private final int bYC;
    private final boolean bYD;
    private final int bYE;

    public Stitcher(int n2, int n3, boolean bl2, int n4, int n5) {
        this.bYw = n5;
        this.bYB = n2;
        this.bYC = n3;
        this.bYD = bl2;
        this.bYE = n4;
    }

    public int NN() {
        return this.bYz;
    }

    public int NO() {
        return this.bYA;
    }

    public void e(TextureAtlasSprite textureAtlasSprite) {
        Stitcher$Holder stitcher$Holder = new Stitcher$Holder(textureAtlasSprite, this.bYw);
        if (this.bYE > 0) {
            stitcher$Holder.dC(this.bYE);
        }
        this.bYx.add(stitcher$Holder);
    }

    public void NP() {
        Object[] objectArray = this.bYx.toArray(new Stitcher$Holder[0]);
        Arrays.sort(objectArray);
        for (Object object : objectArray) {
            if (this.a((Stitcher$Holder)object)) continue;
            String string = String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", ((Stitcher$Holder)object).NR().Oc(), ((Stitcher$Holder)object).NR().NW(), ((Stitcher$Holder)object).NR().NX(), this.bYz, this.bYA, this.bYB, this.bYC);
            throw new StitcherException((Stitcher$Holder)object, string);
        }
        if (this.bYD) {
            this.bYz = bt.hO(this.bYz);
            this.bYA = bt.hO(this.bYA);
        }
    }

    public List<TextureAtlasSprite> NQ() {
        ArrayList arrayList = Lists.newArrayList();
        for (Stitcher$Slot object : this.bYy) {
            object.t(arrayList);
        }
        ArrayList arrayList2 = Lists.newArrayList();
        for (Stitcher$Slot stitcher$Slot : arrayList) {
            Stitcher$Holder stitcher$Holder = stitcher$Slot.NT();
            TextureAtlasSprite textureAtlasSprite = stitcher$Holder.NR();
            textureAtlasSprite.a(this.bYz, this.bYA, stitcher$Slot.NU(), stitcher$Slot.NV(), stitcher$Holder.NS());
            arrayList2.add(textureAtlasSprite);
        }
        return arrayList2;
    }

    private static int ad(int n2, int n3) {
        return (n2 >> n3) + ((n2 & (1 << n3) - 1) == 0 ? 0 : 1) << n3;
    }

    private boolean a(Stitcher$Holder stitcher$Holder) {
        for (int i2 = 0; i2 < this.bYy.size(); ++i2) {
            if (this.bYy.get(i2).d(stitcher$Holder)) {
                return true;
            }
            stitcher$Holder.jI();
            if (this.bYy.get(i2).d(stitcher$Holder)) {
                return true;
            }
            stitcher$Holder.jI();
        }
        return this.b(stitcher$Holder);
    }

    private boolean b(Stitcher$Holder stitcher$Holder) {
        Stitcher$Slot stitcher$Slot;
        boolean bl2;
        int n2;
        boolean bl3;
        int n3 = Math.min(stitcher$Holder.getWidth(), stitcher$Holder.getHeight());
        boolean bl4 = bl3 = this.bYz == 0 && this.bYA == 0;
        if (this.bYD) {
            boolean bl5;
            boolean bl6;
            n2 = bt.hO(this.bYz);
            var6_5 = bt.hO(this.bYA);
            int n4 = bt.hO(this.bYz + n3);
            int n5 = bt.hO(this.bYA + n3);
            boolean bl7 = n4 <= this.bYB;
            boolean bl8 = bl6 = n5 <= this.bYC;
            if (!bl7 && !bl6) {
                return false;
            }
            boolean bl9 = n2 != n4;
            boolean bl10 = bl5 = var6_5 != n5;
            bl2 = bl9 ^ bl5 ? !bl9 : bl7 && n2 <= var6_5;
        } else {
            n2 = this.bYz + n3 <= this.bYB ? 1 : 0;
            int n6 = var6_5 = this.bYA + n3 <= this.bYC ? 1 : 0;
            if (n2 == 0 && var6_5 == 0) {
                return false;
            }
            bl2 = n2 != 0 && (bl3 || this.bYz <= this.bYA);
        }
        n2 = Math.max(stitcher$Holder.getWidth(), stitcher$Holder.getHeight());
        if (bt.hO((!bl2 ? this.bYA : this.bYz) + n2) > (!bl2 ? this.bYC : this.bYB)) {
            return false;
        }
        if (bl2) {
            if (stitcher$Holder.getWidth() > stitcher$Holder.getHeight()) {
                stitcher$Holder.jI();
            }
            if (this.bYA == 0) {
                this.bYA = stitcher$Holder.getHeight();
            }
            stitcher$Slot = new Stitcher$Slot(this.bYz, 0, stitcher$Holder.getWidth(), this.bYA);
            this.bYz += stitcher$Holder.getWidth();
        } else {
            stitcher$Slot = new Stitcher$Slot(0, this.bYA, this.bYz, stitcher$Holder.getHeight());
            this.bYA += stitcher$Holder.getHeight();
        }
        stitcher$Slot.d(stitcher$Holder);
        this.bYy.add(stitcher$Slot);
        return true;
    }
}

