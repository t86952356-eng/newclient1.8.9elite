/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.storage;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.world.storage.e;

public class n
implements Runnable {
    private static final n dTO = new n();
    private final List<e> dTP = Collections.synchronizedList(Lists.newArrayList());
    private volatile long dTQ;
    private volatile long dTR;
    private volatile boolean dTS;

    private n() {
        Thread thread = new Thread(this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }

    public static n azI() {
        return dTO;
    }

    @Override
    public void run() {
        while (true) {
            this.azJ();
        }
    }

    private void azJ() {
        for (int i2 = 0; i2 < this.dTP.size(); ++i2) {
            e e2 = this.dTP.get(i2);
            boolean bl2 = e2.axR();
            if (!bl2) {
                this.dTP.remove(i2--);
                ++this.dTR;
            }
            try {
                Thread.sleep(this.dTS ? 0L : 10L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (this.dTP.isEmpty()) {
            try {
                Thread.sleep(25L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    public void a(e e2) {
        if (!this.dTP.contains(e2)) {
            ++this.dTQ;
            this.dTP.add(e2);
        }
    }

    public void azK() {
        this.dTS = true;
        while (this.dTQ != this.dTR) {
            Thread.sleep(10L);
        }
        this.dTS = false;
    }
}

