/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net.minecraft.command.server;

import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.command.ab;
import net.minecraft.command.ad;
import net.minecraft.command.av;
import net.minecraft.command.aw;
import net.minecraft.command.server.f;
import net.minecraft.command.server.g;
import net.minecraft.crash.a;
import net.minecraft.crash.i;
import net.minecraft.nbt.n;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.util.cl;
import net.minecraft.util.s;
import net.minecraft.world.w;

public abstract class e
implements aw {
    private static final SimpleDateFormat coS = new SimpleDateFormat("HH:mm:ss");
    private int coT;
    private boolean coU = true;
    private ba coV = null;
    private String coW = "";
    private String coX = "@";
    private final ab coY = new ab();

    public int Sw() {
        return this.coT;
    }

    public ba Sx() {
        return this.coV;
    }

    public void h(n n2) {
        n2.R("Command", this.coW);
        n2.B("SuccessCount", this.coT);
        n2.R("CustomName", this.coX);
        n2.o("TrackOutput", this.coU);
        if (this.coV != null && this.coU) {
            n2.R("LastOutput", bb.q(this.coV));
        }
        this.coY.g(n2);
    }

    public void i(n n2) {
        this.coW = n2.eK("Command");
        this.coT = n2.eG("SuccessCount");
        if (n2.C("CustomName", 8)) {
            this.coX = n2.eK("CustomName");
        }
        if (n2.C("TrackOutput", 1)) {
            this.coU = n2.eO("TrackOutput");
        }
        if (n2.C("LastOutput", 8) && this.coU) {
            this.coV = bb.gi(n2.eK("LastOutput"));
        }
        this.coY.f(n2);
    }

    @Override
    public boolean c(int n2, String string) {
        return n2 <= 2;
    }

    public void dW(String string) {
        this.coW = string;
        this.coT = 0;
    }

    public String Sy() {
        return this.coW;
    }

    public void h(w w2) {
        MinecraftServer minecraftServer;
        if (w2.dDw) {
            this.coT = 0;
        }
        if ((minecraftServer = MinecraftServer.afs()) != null && minecraftServer.alh() && minecraftServer.alA()) {
            av av2 = minecraftServer.ali();
            try {
                this.coV = null;
                this.coT = av2.i(this, this.coW);
            }
            catch (Throwable throwable) {
                a a2 = a.a(throwable, "Executing command block");
                i i2 = a2.dY("Command to be executed");
                i2.a("Command", new f(this));
                i2.a("Name", new g(this));
                throw new cl(a2);
            }
        } else {
            this.coT = 0;
        }
    }

    @Override
    public String xU() {
        return this.coX;
    }

    @Override
    public ba xW() {
        return new s(this.xU());
    }

    public void setName(String string) {
        this.coX = string;
    }

    @Override
    public void a(ba ba2) {
        if (this.coU && this.Se() != null && !this.Se().dDw) {
            this.coV = new s("[" + coS.format(new Date()) + "] ").n(ba2);
            this.Sz();
        }
    }

    @Override
    public boolean Sg() {
        MinecraftServer minecraftServer = MinecraftServer.afs();
        return minecraftServer == null || !minecraftServer.alh() || minecraftServer.dkG[0].Si().gw("commandBlockOutput");
    }

    @Override
    public void a(ad ad2, int n2) {
        this.coY.a(this, ad2, n2);
    }

    public abstract void Sz();

    public abstract int SA();

    public abstract void b(ByteBuf var1);

    public void h(ba ba2) {
        this.coV = ba2;
    }

    public void aA(boolean bl2) {
        this.coU = bl2;
    }

    public boolean SB() {
        return this.coU;
    }

    public boolean m(net.minecraft.entity.player.a a2) {
        if (!a2.cIt.cJM) {
            return false;
        }
        if (a2.Se().dDw) {
            a2.a(this);
        }
        return true;
    }

    public ab SC() {
        return this.coY;
    }
}

