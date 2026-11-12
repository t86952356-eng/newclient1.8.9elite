/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.pattern.BlockPattern$CacheLoader;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.db;
import net.minecraft.world.w;

public class BlockPattern {
    private final Predicate<BlockWorldState>[][][] bfJ;
    private final int bfK;
    private final int bfL;
    private final int bfM;

    public BlockPattern(Predicate<BlockWorldState>[][][] predicateArray) {
        this.bfJ = predicateArray;
        this.bfK = predicateArray.length;
        if (this.bfK > 0) {
            this.bfL = predicateArray[0].length;
            this.bfM = this.bfL > 0 ? predicateArray[0][0].length : 0;
        } else {
            this.bfL = 0;
            this.bfM = 0;
        }
    }

    public int Ac() {
        return this.bfL;
    }

    public int Ad() {
        return this.bfM;
    }

    private BlockPattern$PatternHelper a(b b2, ao ao2, ao ao3, LoadingCache<b, BlockWorldState> loadingCache) {
        for (int i2 = 0; i2 < this.bfM; ++i2) {
            for (int i3 = 0; i3 < this.bfL; ++i3) {
                for (int i4 = 0; i4 < this.bfK; ++i4) {
                    if (this.bfJ[i4][i3][i2].apply((Object)((BlockWorldState)loadingCache.getUnchecked((Object)BlockPattern.a(b2, ao2, ao3, i2, i3, i4))))) continue;
                    return null;
                }
            }
        }
        return new BlockPattern$PatternHelper(b2, ao2, ao3, loadingCache, this.bfM, this.bfL, this.bfK);
    }

    public BlockPattern$PatternHelper Y(w w2, b b2) {
        LoadingCache<b, BlockWorldState> loadingCache = BlockPattern.a(w2, false);
        int n2 = Math.max(Math.max(this.bfM, this.bfL), this.bfK);
        for (b b3 : b.b(b2, b2.C(n2 - 1, n2 - 1, n2 - 1))) {
            for (ao ao2 : ao.values()) {
                for (ao ao3 : ao.values()) {
                    BlockPattern$PatternHelper blockPattern$PatternHelper;
                    if (ao3 == ao2 || ao3 == ao2.asC() || (blockPattern$PatternHelper = this.a(b3, ao2, ao3, loadingCache)) == null) continue;
                    return blockPattern$PatternHelper;
                }
            }
        }
        return null;
    }

    public static LoadingCache<b, BlockWorldState> a(w w2, boolean bl2) {
        return CacheBuilder.newBuilder().build((CacheLoader)new BlockPattern$CacheLoader(w2, bl2));
    }

    protected static b a(b b2, ao ao2, ao ao3, int n2, int n3, int n4) {
        if (ao2 != ao3 && ao2 != ao3.asC()) {
            db db2 = new db(ao2.asH(), ao2.asI(), ao2.asJ());
            db db3 = new db(ao3.asH(), ao3.asI(), ao3.asJ());
            db db4 = db2.f(db3);
            return b2.C(db3.wt() * -n3 + db4.wt() * n2 + db2.wt() * n4, db3.wu() * -n3 + db4.wu() * n2 + db2.wu() * n4, db3.wx() * -n3 + db4.wx() * n2 + db2.wx() * n4);
        }
        throw new IllegalArgumentException("Invalid forwards & up combination");
    }
}

