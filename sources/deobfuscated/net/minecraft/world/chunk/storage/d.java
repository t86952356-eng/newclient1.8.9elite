/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk.storage;

import java.io.File;
import net.minecraft.world.ac;
import net.minecraft.world.ad;
import net.minecraft.world.ae;
import net.minecraft.world.chunk.storage.a;
import net.minecraft.world.chunk.storage.h;
import net.minecraft.world.chunk.storage.l;
import net.minecraft.world.storage.n;
import net.minecraft.world.storage.o;

public class d
extends net.minecraft.world.storage.l {
    public d(File file, String string, boolean bl2) {
        super(file, string, bl2);
    }

    @Override
    public h b(ac ac2) {
        File file = this.azz();
        if (ac2 instanceof ae) {
            File file2 = new File(file, "DIM-1");
            file2.mkdirs();
            return new a(file2);
        }
        if (ac2 instanceof ad) {
            File file3 = new File(file, "DIM1");
            file3.mkdirs();
            return new a(file3);
        }
        return new a(file);
    }

    @Override
    public void a(o o2, net.minecraft.nbt.n n2) {
        o2.iP(19133);
        super.a(o2, n2);
    }

    @Override
    public void bf() {
        try {
            n.azI().azK();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        l.ayd();
    }
}

