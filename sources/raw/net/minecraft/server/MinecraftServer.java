/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.server;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.OutputStream;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import net.minecraft.command.ad;
import net.minecraft.command.av;
import net.minecraft.command.aw;
import net.minecraft.command.bm;
import net.minecraft.crash.a;
import net.minecraft.network.ar;
import net.minecraft.server.MinecraftServer$1;
import net.minecraft.server.MinecraftServer$2;
import net.minecraft.server.MinecraftServer$3;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.bh;
import net.minecraft.util.bi;
import net.minecraft.util.bt;
import net.minecraft.util.cl;
import net.minecraft.util.cy;
import net.minecraft.util.da;
import net.minecraft.util.s;
import net.minecraft.world.ab;
import net.minecraft.world.ai;
import net.minecraft.world.al;
import net.minecraft.world.an;
import net.minecraft.world.ao;
import net.minecraft.world.ap;
import net.minecraft.world.f;
import net.minecraft.world.r;
import net.minecraft.world.storage.c;
import net.minecraft.world.storage.d;
import net.minecraft.world.storage.o;
import net.minecraft.world.w;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MinecraftServer
implements Runnable,
aw,
net.minecraft.profiler.a,
bh {
    private static final Logger dku = LogManager.getLogger();
    public static final File dkv = new File("usercache.json");
    private static MinecraftServer bEB;
    private final c dkw;
    private final net.minecraft.profiler.b dkx = new net.minecraft.profiler.b("server", this, MinecraftServer.alN());
    private final File dky;
    private final List<bi> dkz = Lists.newArrayList();
    protected final av dkA;
    public final net.minecraft.profiler.d dkB = new net.minecraft.profiler.d();
    private final net.minecraft.network.ab dkC;
    private final net.minecraft.network.ao dkD = new net.minecraft.network.ao();
    private final Random dkE = new Random();
    private final int dkF = -1;
    public ai[] dkG;
    private ServerConfigurationManager dkH;
    private boolean dkI = true;
    private boolean dkJ;
    private int qH;
    protected final Proxy dkK;
    public String dkL;
    public int dkM;
    private boolean dkN;
    private boolean dkO;
    private boolean dkP;
    private boolean dkQ;
    private boolean dkR;
    private String bEc;
    private int dkS;
    private int dkT = 0;
    public final long[] dkU = new long[100];
    public long[][] dkV;
    private KeyPair dkW;
    private String dkX;
    private String dkY;
    private String dkZ;
    private boolean bht;
    private boolean dla;
    private boolean dlb;
    private String dlc = "";
    private String dld = "";
    private boolean dle;
    private long dlf;
    private String dlg;
    private boolean dlh;
    private boolean dli;
    private final YggdrasilAuthenticationService dlj;
    private final MinecraftSessionService dlk;
    private long dll = 0L;
    private final GameProfileRepository dlm;
    private final PlayerProfileCache dln;
    protected final Queue<FutureTask<?>> dlo = Queues.newArrayDeque();
    private Thread dlp;
    private long dlq = MinecraftServer.alN();

    public MinecraftServer(Proxy proxy, File file) {
        this.dkK = proxy;
        bEB = this;
        this.dky = null;
        this.dkC = null;
        this.dln = new PlayerProfileCache(this, file);
        this.dkA = null;
        this.dkw = null;
        this.dlj = new YggdrasilAuthenticationService(proxy, UUID.randomUUID().toString());
        this.dlk = this.dlj.createMinecraftSessionService();
        this.dlm = this.dlj.createProfileRepository();
    }

    public MinecraftServer(File file, Proxy proxy, File file2) {
        this.dkK = proxy;
        bEB = this;
        this.dky = file;
        this.dkC = new net.minecraft.network.ab(this);
        this.dln = new PlayerProfileCache(this, file2);
        this.dkA = this.akM();
        this.dkw = new net.minecraft.world.chunk.storage.b(file);
        this.dlj = new YggdrasilAuthenticationService(proxy, UUID.randomUUID().toString());
        this.dlk = this.dlj.createMinecraftSessionService();
        this.dlm = this.dlj.createProfileRepository();
    }

    protected bm akM() {
        return new bm();
    }

    protected abstract boolean akN();

    protected void fw(String string) {
        if (this.alp().gG(string)) {
            dku.info("Converting map!");
            this.fx("menu.convertingLevel");
            this.alp().b(string, new MinecraftServer$1(this));
        }
    }

    protected synchronized void fx(String string) {
        this.dlg = string;
    }

    public synchronized String akO() {
        return this.dlg;
    }

    protected void a(String string, String string2, long l2, ap ap2, String string3) {
        an an2;
        this.fw(string);
        this.fx("menu.loadingLevel");
        this.dkG = new ai[3];
        this.dkV = new long[this.dkG.length][100];
        d d2 = this.dkw.q(string, true);
        this.a(this.alm(), d2);
        o o2 = d2.azx();
        if (o2 == null) {
            if (this.AT()) {
                an2 = net.minecraft.world.demo.b.dKe;
            } else {
                an2 = new an(l2, this.If(), this.akQ(), this.ajU(), ap2);
                an2.gB(string3);
                if (this.dla) {
                    an2.awx();
                }
            }
            o2 = new o(an2, string2);
        } else {
            o2.fC(string2);
            an2 = new an(o2);
        }
        for (int i2 = 0; i2 < this.dkG.length; ++i2) {
            int n2 = 0;
            if (i2 == 1) {
                n2 = -1;
            }
            if (i2 == 2) {
                n2 = 1;
            }
            if (i2 == 0) {
                this.dkG[i2] = this.AT() ? (ai)new net.minecraft.world.demo.b(this, d2, o2, n2, this.dkB).avo() : (ai)new ai(this, d2, o2, n2, this.dkB).avo();
                this.dkG[i2].a(an2);
            } else {
                this.dkG[i2] = (ai)new al(this, d2, n2, this.dkG[0], this.dkB).avo();
            }
            this.dkG[i2].a(new ab(this, this.dkG[i2]));
            if (this.all()) continue;
            this.dkG[i2].avH().a(this.If());
        }
        this.dkH.a(this.dkG);
        this.b(this.agm());
        this.akP();
    }

    protected void akP() {
        int n2 = 16;
        int n3 = 4;
        int n4 = 192;
        int n5 = 625;
        int n6 = 0;
        this.fx("menu.generatingTerrain");
        boolean bl2 = false;
        dku.info("Preparing start region for level 0");
        ai ai2 = this.dkG[0];
        b b2 = ai2.avE();
        long l2 = MinecraftServer.alN();
        for (int i2 = -192; i2 <= 192 && this.akV(); i2 += 16) {
            for (int i3 = -192; i3 <= 192 && this.akV(); i3 += 16) {
                long l3 = MinecraftServer.alN();
                if (l3 - l2 > 1000L) {
                    this.F("Preparing spawn area", n6 * 100 / 625);
                    l2 = l3;
                }
                ++n6;
                ai2.dEb.G(b2.wt() + i2 >> 4, b2.wx() + i3 >> 4);
            }
        }
        this.akU();
    }

    protected void a(String string, d d2) {
        File file = new File(d2.azz(), "resources.zip");
        if (file.isFile()) {
            this.U("level://" + string + "/" + file.getName(), "");
        }
    }

    public abstract boolean akQ();

    public abstract ao If();

    public abstract f agm();

    public abstract boolean ajU();

    public abstract int akR();

    public abstract boolean akS();

    public abstract boolean akT();

    protected void F(String string, int n2) {
        this.dkL = string;
        this.dkM = n2;
        dku.info(string + ": " + n2 + "%");
    }

    protected void akU() {
        this.dkL = null;
        this.dkM = 0;
    }

    protected void cd(boolean bl2) {
        if (!this.dlb) {
            for (ai ai2 : this.dkG) {
                if (ai2 == null) continue;
                if (!bl2) {
                    dku.info("Saving chunks for level '" + ai2.avH().aln() + "'/" + ai2.dDl.getDimensionName());
                }
                try {
                    ai2.b(true, null);
                }
                catch (r r2) {
                    dku.warn(r2.getMessage());
                }
            }
        }
    }

    public void stopServer() {
        if (!this.dlb) {
            dku.info("Stopping server");
            if (this.alF() != null) {
                this.alF().afq();
            }
            if (this.dkH != null) {
                dku.info("Saving players");
                this.dkH.ams();
                this.dkH.amA();
            }
            if (this.dkG != null) {
                dku.info("Saving worlds");
                this.cd(false);
                for (int i2 = 0; i2 < this.dkG.length; ++i2) {
                    ai ai2 = this.dkG[i2];
                    ai2.bf();
                }
            }
            if (this.dkx.ajq()) {
                this.dkx.ajr();
            }
        }
    }

    public boolean akV() {
        return this.dkI;
    }

    public void akW() {
        this.dkI = false;
    }

    protected void akX() {
        bEB = this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            if (this.akN()) {
                this.dlq = MinecraftServer.alN();
                long l2 = 0L;
                this.dkD.k(new s(this.bEc));
                this.dkD.a(new net.minecraft.network.ap("1.8.9", 47));
                this.a(this.dkD);
                while (this.dkI) {
                    long l3 = MinecraftServer.alN();
                    long l4 = l3 - this.dlq;
                    if (l4 > 2000L && this.dlq - this.dlf >= 15000L) {
                        dku.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[]{l4, l4 / 50L});
                        l4 = 2000L;
                        this.dlf = this.dlq;
                    }
                    if (l4 < 0L) {
                        dku.warn("Time ran backwards! Did the system time change?");
                        l4 = 0L;
                    }
                    l2 += l4;
                    this.dlq = l3;
                    if (this.dkG[0].awk()) {
                        this.tick();
                        l2 = 0L;
                    } else {
                        while (l2 > 50L) {
                            l2 -= 50L;
                            this.tick();
                        }
                    }
                    Thread.sleep(Math.max(1L, 50L - l2));
                    this.dle = true;
                }
            } else {
                this.e(null);
            }
        }
        catch (Throwable throwable) {
            dku.error("Encountered an unexpected exception", throwable);
            a a2 = null;
            a2 = throwable instanceof cl ? this.f(((cl)throwable).atz()) : this.f(new a("Exception in server tick loop", throwable));
            File file = new File(new File(this.akY(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
            if (a2.g(file)) {
                dku.error("This crash report has been saved to: " + file.getAbsolutePath());
            } else {
                dku.error("We were unable to save this crash report to disk.");
            }
            this.e(a2);
        }
        finally {
            try {
                this.dkJ = true;
                this.stopServer();
            }
            catch (Throwable throwable) {
                dku.error("Exception stopping the server", throwable);
            }
            finally {
                this.akZ();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(net.minecraft.network.ao ao2) {
        File file = this.fy("server-icon.png");
        if (file.isFile()) {
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                ImageIO.write((RenderedImage)bufferedImage, "PNG", (OutputStream)new ByteBufOutputStream(byteBuf));
                ByteBuf byteBuf2 = Base64.encode((ByteBuf)byteBuf);
                ao2.eU("data:image/png;base64," + byteBuf2.toString(Charsets.UTF_8));
            }
            catch (Exception exception) {
                dku.error("Couldn't load server icon", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    public File akY() {
        return new File(".");
    }

    protected void e(a a2) {
    }

    protected void akZ() {
    }

    public void tick() {
        long l2 = System.nanoTime();
        ++this.qH;
        if (this.dlh) {
            this.dlh = false;
            this.dkB.dhU = true;
            this.dkB.aju();
        }
        this.dkB.eY("root");
        this.ala();
        if (l2 - this.dll >= 5000000000L) {
            this.dll = l2;
            this.dkD.a(new ar(this.getMaxPlayers(), this.ale()));
            GameProfile[] gameProfileArray = new GameProfile[Math.min(this.ale(), 12)];
            int n2 = bt.b(this.dkE, 0, this.ale() - gameProfileArray.length);
            for (int i2 = 0; i2 < gameProfileArray.length; ++i2) {
                gameProfileArray[i2] = this.dkH.amB().get(n2 + i2).Ie();
            }
            Collections.shuffle(Arrays.asList(gameProfileArray));
            this.dkD.afC().a(gameProfileArray);
        }
        if (this.qH % 900 == 0) {
            this.dkB.eY("save");
            this.dkH.ams();
            this.cd(true);
            this.dkB.ajv();
        }
        this.dkB.eY("tallying");
        this.dkU[this.qH % 100] = System.nanoTime() - l2;
        this.dkB.ajv();
        this.dkB.eY("snooper");
        if (!this.dkx.ajq() && this.qH > 100) {
            this.dkx.ajl();
        }
        if (this.qH % 6000 == 0) {
            this.dkx.ajo();
        }
        this.dkB.ajv();
        this.dkB.ajv();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ala() {
        int n2;
        this.dkB.eY("jobs");
        Queue<FutureTask<?>> queue = this.dlo;
        synchronized (queue) {
            while (!this.dlo.isEmpty()) {
                cy.a(this.dlo.poll(), dku);
            }
        }
        this.dkB.fa("levels");
        for (n2 = 0; n2 < this.dkG.length; ++n2) {
            long l2 = System.nanoTime();
            if (n2 == 0 || this.alb()) {
                ai ai2 = this.dkG[n2];
                this.dkB.eY(ai2.avH().aln());
                if (this.qH % 20 == 0) {
                    this.dkB.eY("timeSync");
                    this.dkH.a(new net.minecraft.network.play.server.d(ai2.getTotalWorldTime(), ai2.getWorldTime(), ai2.Si().gw("doDaylightCycle")), ai2.dDl.getDimensionId());
                    this.dkB.ajv();
                }
                this.dkB.eY("tick");
                try {
                    ai2.tick();
                }
                catch (Throwable throwable) {
                    a a2 = a.a(throwable, "Exception ticking world");
                    ai2.d(a2);
                    throw new cl(a2);
                }
                try {
                    ai2.avu();
                }
                catch (Throwable throwable) {
                    a a3 = a.a(throwable, "Exception ticking world entities");
                    ai2.d(a3);
                    throw new cl(a3);
                }
                this.dkB.ajv();
                this.dkB.eY("tracker");
                ai2.awu().Wp();
                this.dkB.ajv();
                this.dkB.ajv();
            }
            this.dkV[n2][this.qH % 100] = System.nanoTime() - l2;
        }
        this.dkB.fa("connection");
        this.alF().afr();
        this.dkB.fa("players");
        this.dkH.amc();
        this.dkB.fa("tickables");
        for (n2 = 0; n2 < this.dkz.size(); ++n2) {
            this.dkz.get(n2).jA();
        }
        this.dkB.ajv();
    }

    public boolean alb() {
        return true;
    }

    public void alc() {
        this.dlp = new Thread(this, "Server thread");
        this.dlp.start();
    }

    public File fy(String string) {
        return new File(this.akY(), string);
    }

    public void fz(String string) {
        dku.warn(string);
    }

    public ai ha(int n2) {
        return n2 == -1 ? this.dkG[1] : (n2 == 1 ? this.dkG[2] : this.dkG[0]);
    }

    public String ald() {
        return "1.8.9";
    }

    public int ale() {
        return this.dkH.ale();
    }

    public int getMaxPlayers() {
        return this.dkH.getMaxPlayers();
    }

    public String[] Sa() {
        return this.dkH.Sa();
    }

    public GameProfile[] alf() {
        return this.dkH.amp();
    }

    public String alg() {
        return "vanilla";
    }

    public a f(a a2) {
        a2.SJ().a("Profiler Position", new MinecraftServer$2(this));
        if (this.dkH != null) {
            a2.SJ().a("Player Count", new MinecraftServer$3(this));
        }
        return a2;
    }

    public List<String> b(aw aw2, String string, b b2) {
        ArrayList arrayList = Lists.newArrayList();
        if (string.startsWith("/")) {
            boolean bl2 = !(string = string.substring(1)).contains(" ");
            List<String> list = this.dkA.a(aw2, string, b2);
            if (list != null) {
                for (String string2 : list) {
                    if (bl2) {
                        arrayList.add("/" + string2);
                        continue;
                    }
                    arrayList.add(string2);
                }
            }
            return arrayList;
        }
        String[] stringArray = string.split(" ", -1);
        String string3 = stringArray[stringArray.length - 1];
        for (String string4 : this.dkH.Sa()) {
            if (!net.minecraft.command.a.N(string3, string4)) continue;
            arrayList.add(string4);
        }
        return arrayList;
    }

    public static MinecraftServer afs() {
        return bEB;
    }

    public boolean alh() {
        return this.dky != null;
    }

    @Override
    public String xU() {
        return "Server";
    }

    @Override
    public void a(ba ba2) {
        dku.info(ba2.arq());
    }

    @Override
    public boolean c(int n2, String string) {
        return true;
    }

    public av ali() {
        return this.dkA;
    }

    public KeyPair alj() {
        return this.dkW;
    }

    public String alk() {
        return this.dkX;
    }

    public void fA(String string) {
        this.dkX = string;
    }

    public boolean all() {
        return this.dkX != null;
    }

    public String alm() {
        return this.dkY;
    }

    public void fB(String string) {
        this.dkY = string;
    }

    public void fC(String string) {
        this.dkZ = string;
    }

    public String aln() {
        return this.dkZ;
    }

    public void a(KeyPair keyPair) {
        this.dkW = keyPair;
    }

    public void b(f f2) {
        for (int i2 = 0; i2 < this.dkG.length; ++i2) {
            ai ai2 = this.dkG[i2];
            if (ai2 == null) continue;
            if (ai2.avH().azv()) {
                ai2.avH().c(f.dBU);
                ai2.j(true, true);
                continue;
            }
            if (this.all()) {
                ai2.avH().c(f2);
                ai2.j(ai2.agm() != f.dBR, true);
                continue;
            }
            ai2.avH().c(f2);
            ai2.j(this.alo(), this.dkO);
        }
    }

    protected boolean alo() {
        return true;
    }

    public boolean AT() {
        return this.bht;
    }

    public void ce(boolean bl2) {
        this.bht = bl2;
    }

    public void cf(boolean bl2) {
        this.dla = bl2;
    }

    public c alp() {
        return this.dkw;
    }

    public void alq() {
        this.dlb = true;
        this.alp().axV();
        for (int i2 = 0; i2 < this.dkG.length; ++i2) {
            ai ai2 = this.dkG[i2];
            if (ai2 == null) continue;
            ai2.bf();
        }
        this.alp().gM(this.dkG[0].avG().azA());
        this.akW();
    }

    public String alr() {
        return this.dlc;
    }

    public String als() {
        return this.dld;
    }

    public void U(String string, String string2) {
        this.dlc = string;
        this.dld = string2;
    }

    @Override
    public void a(net.minecraft.profiler.b b2) {
        b2.c("whitelist_enabled", false);
        b2.c("whitelist_count", 0);
        if (this.dkH != null) {
            b2.c("players_current", this.ale());
            b2.c("players_max", this.getMaxPlayers());
            b2.c("players_seen", this.dkH.amy().length);
        }
        b2.c("uses_auth", this.dkN);
        b2.c("gui_state", this.alH() ? "enabled" : "disabled");
        b2.c("run_time", (MinecraftServer.alN() - b2.ajt()) / 60L * 1000L);
        b2.c("avg_tick_ms", (int)(bt.a(this.dkU) * 1.0E-6));
        int n2 = 0;
        if (this.dkG != null) {
            for (int i2 = 0; i2 < this.dkG.length; ++i2) {
                if (this.dkG[i2] == null) continue;
                ai ai2 = this.dkG[i2];
                o o2 = ai2.avH();
                b2.c("world[" + n2 + "][dimension]", ai2.dDl.getDimensionId());
                b2.c("world[" + n2 + "][mode]", (Object)o2.If());
                b2.c("world[" + n2 + "][difficulty]", (Object)ai2.agm());
                b2.c("world[" + n2 + "][hardcore]", o2.azv());
                b2.c("world[" + n2 + "][generator_name]", o2.awC().awI());
                b2.c("world[" + n2 + "][generator_version]", o2.awC().awL());
                b2.c("world[" + n2 + "][height]", this.dkS);
                b2.c("world[" + n2 + "][chunks_loaded]", ai2.avF().Hn());
                ++n2;
            }
        }
        b2.c("worlds", n2);
    }

    @Override
    public void b(net.minecraft.profiler.b b2) {
        b2.d("singleplayer", this.all());
        b2.d("server_brand", this.alg());
        b2.d("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
        b2.d("dedicated", this.alt());
    }

    @Override
    public boolean Bd() {
        return true;
    }

    public abstract boolean alt();

    public boolean alu() {
        return this.dkN;
    }

    public void cg(boolean bl2) {
        this.dkN = bl2;
    }

    public boolean alv() {
        return this.dkO;
    }

    public void ch(boolean bl2) {
        this.dkO = bl2;
    }

    public boolean alw() {
        return this.dkP;
    }

    public abstract boolean alx();

    public void ci(boolean bl2) {
        this.dkP = bl2;
    }

    public boolean aly() {
        return this.dkQ;
    }

    public void cj(boolean bl2) {
        this.dkQ = bl2;
    }

    public boolean alz() {
        return this.dkR;
    }

    public void ck(boolean bl2) {
        this.dkR = bl2;
    }

    public abstract boolean alA();

    public String alB() {
        return this.bEc;
    }

    public void fD(String string) {
        this.bEc = string;
    }

    public int alC() {
        return this.dkS;
    }

    public void hb(int n2) {
        this.dkS = n2;
    }

    public boolean alD() {
        return this.dkJ;
    }

    public ServerConfigurationManager alE() {
        return this.dkH;
    }

    public void a(ServerConfigurationManager serverConfigurationManager) {
        this.dkH = serverConfigurationManager;
    }

    public void a(ao ao2) {
        for (int i2 = 0; i2 < this.dkG.length; ++i2) {
            MinecraftServer.afs().dkG[i2].avH().a(ao2);
        }
    }

    public net.minecraft.network.ab alF() {
        return this.dkC;
    }

    public boolean alG() {
        return this.dle;
    }

    public boolean alH() {
        return false;
    }

    public abstract String a(ao var1, boolean var2);

    public int alI() {
        return this.qH;
    }

    public void alJ() {
        this.dlh = true;
    }

    public net.minecraft.profiler.b Bi() {
        return this.dkx;
    }

    @Override
    public b yl() {
        return b.dtN;
    }

    @Override
    public da Sd() {
        return new da(0.0, 0.0, 0.0);
    }

    @Override
    public w Se() {
        return this.dkG[0];
    }

    @Override
    public net.minecraft.entity.c Sf() {
        return null;
    }

    public int alK() {
        return 16;
    }

    public boolean b(w w2, b b2, net.minecraft.entity.player.a a2) {
        return false;
    }

    public boolean alL() {
        return this.dli;
    }

    public Proxy alM() {
        return this.dkK;
    }

    public static long alN() {
        return System.currentTimeMillis();
    }

    public int alO() {
        return this.dkT;
    }

    public void hc(int n2) {
        this.dkT = n2;
    }

    @Override
    public ba xW() {
        return new s(this.xU());
    }

    public boolean alP() {
        return true;
    }

    public MinecraftSessionService alQ() {
        return this.dlk;
    }

    public GameProfileRepository alR() {
        return this.dlm;
    }

    public PlayerProfileCache alS() {
        return this.dln;
    }

    public net.minecraft.network.ao alT() {
        return this.dkD;
    }

    public void alU() {
        this.dll = 0L;
    }

    public net.minecraft.entity.c j(UUID uUID) {
        for (ai ai2 : this.dkG) {
            net.minecraft.entity.c c2;
            if (ai2 == null || (c2 = ai2.j(uUID)) == null) continue;
            return c2;
        }
        return null;
    }

    @Override
    public boolean Sg() {
        return MinecraftServer.afs().dkG[0].Si().gw("sendCommandFeedback");
    }

    @Override
    public void a(ad ad2, int n2) {
    }

    public int alV() {
        return 29999984;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public <V> ListenableFuture<V> b(Callable<V> callable) {
        Validate.notNull(callable);
        if (!this.BD() && !this.alD()) {
            ListenableFutureTask listenableFutureTask = ListenableFutureTask.create(callable);
            Queue<FutureTask<?>> queue = this.dlo;
            synchronized (queue) {
                this.dlo.add((FutureTask<?>)listenableFutureTask);
                return listenableFutureTask;
            }
        }
        try {
            return Futures.immediateFuture(callable.call());
        }
        catch (Exception exception) {
            return Futures.immediateFailedCheckedFuture((Exception)exception);
        }
    }

    @Override
    public ListenableFuture<Object> f(Runnable runnable) {
        Validate.notNull((Object)runnable);
        return this.b(Executors.callable(runnable));
    }

    @Override
    public boolean BD() {
        return Thread.currentThread() == this.dlp;
    }

    public int alW() {
        return 256;
    }
}

