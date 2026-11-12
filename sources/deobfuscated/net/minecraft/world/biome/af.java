/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.l;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.feature.aj;
import net.minecraft.world.gen.feature.t;
import net.minecraft.world.gen.feature.u;
import net.minecraft.world.w;

public class af
extends j {
    private final boolean dIa;
    private final u dIb = new u();
    private final t dIc = new t(4);

    public af(int n2, boolean bl2) {
        super(n2);
        this.dIa = bl2;
        if (bl2) {
            this.dGZ = Blocks.cML.xM();
        }
        this.dHj.clear();
    }

    @Override
    public void a(w w2, Random random, b b2) {
        if (this.dIa) {
            int n2;
            int n3;
            int n4;
            for (n4 = 0; n4 < 3; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                this.dIb.b(w2, random, w2.aQ(b2.C(n3, 0, n2)));
            }
            for (n4 = 0; n4 < 2; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                this.dIc.b(w2, random, w2.aQ(b2.C(n3, 0, n2)));
            }
        }
        super.a(w2, random, b2);
    }

    @Override
    public a j(Random random) {
        return new aj(false);
    }

    @Override
    protected j in(int n2) {
        j j2 = new af(n2, true).s(0xD2FFFF, true).gE(this.dGX + " Spikes").awV().B(0.0f, 0.5f).a(new l(this.dHc + 0.1f, this.dHd + 0.1f));
        j2.dHc = this.dHc + 0.3f;
        j2.dHd = this.dHd + 0.4f;
        return j2;
    }
}

