/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.Unpooled
 */
package net.minecraft.server.management;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.e;
import net.minecraft.nbt.n;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.server.ae;
import net.minecraft.network.play.server.ag;
import net.minecraft.network.play.server.av;
import net.minecraft.network.play.server.bi;
import net.minecraft.network.play.server.bj;
import net.minecraft.network.play.server.bl;
import net.minecraft.network.play.server.br;
import net.minecraft.network.play.server.bs;
import net.minecraft.network.play.server.bu;
import net.minecraft.network.play.server.by;
import net.minecraft.network.play.server.bz;
import net.minecraft.network.play.server.c;
import net.minecraft.network.play.server.d;
import net.minecraft.network.play.server.f;
import net.minecraft.network.play.server.h;
import net.minecraft.network.r;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.k;
import net.minecraft.scoreboard.l;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.BanList;
import net.minecraft.server.management.IPBanEntry;
import net.minecraft.server.management.ItemInWorldManager;
import net.minecraft.server.management.PlayerManager;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.server.management.ServerConfigurationManager$1;
import net.minecraft.server.management.UserListBans;
import net.minecraft.server.management.UserListBansEntry;
import net.minecraft.server.management.UserListOps;
import net.minecraft.server.management.UserListOpsEntry;
import net.minecraft.server.management.UserListWhitelist;
import net.minecraft.server.management.UserListWhitelistEntry;
import net.minecraft.stats.o;
import net.minecraft.util.an;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.t;
import net.minecraft.world.ai;
import net.minecraft.world.ao;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ServerConfigurationManager {
    public static final File dmE = new File("banned-players.json");
    public static final File dmF = new File("banned-ips.json");
    public static final File dmG = new File("ops.json");
    public static final File dmH = new File("whitelist.json");
    private static final Logger dmI = LogManager.getLogger();
    private static final SimpleDateFormat dmJ = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    private final MinecraftServer dmK;
    private final List<e> dmL = Lists.newArrayList();
    private final Map<UUID, e> dmM = Maps.newHashMap();
    private final UserListBans dmN = new UserListBans(dmE);
    private final BanList dmO = new BanList(dmF);
    private final UserListOps dmP = new UserListOps(dmG);
    private final UserListWhitelist dmQ = new UserListWhitelist(dmH);
    private final Map<UUID, o> dmR = Maps.newHashMap();
    private net.minecraft.world.storage.b dmS;
    private boolean dmT;
    protected int daE;
    private int dmU;
    private ao bFi;
    private boolean dmV;
    private int dmW;

    public ServerConfigurationManager(MinecraftServer minecraftServer) {
        this.dmK = minecraftServer;
        this.dmN.co(false);
        this.dmO.co(false);
        this.daE = 8;
    }

    public void a(r r2, e e2) {
        GameProfile gameProfile = e2.Ie();
        PlayerProfileCache playerProfileCache = this.dmK.alS();
        GameProfile gameProfile2 = playerProfileCache.k(gameProfile.getId());
        String string = gameProfile2 == null ? gameProfile.getName() : gameProfile2.getName();
        playerProfileCache.f(gameProfile);
        n n2 = this.p(e2);
        e2.b(this.dmK.ha(e2.csP));
        e2.cIZ.e((ai)e2.baU);
        String string2 = "local";
        if (r2.afb() != null) {
            string2 = r2.afb().toString();
        }
        dmI.info(e2.xU() + "[" + string2 + "] logged in with entity id " + e2.getEntityId() + " at (" + e2.gW + ", " + e2.gX + ", " + e2.gY + ")");
        ai ai2 = this.dmK.ha(e2.csP);
        net.minecraft.world.storage.o o2 = ai2.avH();
        b b2 = ai2.avE();
        this.a(e2, null, ai2);
        net.minecraft.network.h h2 = new net.minecraft.network.h(this.dmK, r2, e2);
        h2.B(new net.minecraft.network.play.server.b(e2.getEntityId(), e2.cIZ.If(), o2.azv(), ai2.dDl.getDimensionId(), ai2.agm(), this.getMaxPlayers(), o2.awC(), ai2.Si().gw("reducedDebugInfo")));
        h2.B(new bs("MC|Brand", new ak(Unpooled.buffer()).eS(this.alZ().alg())));
        h2.B(new bu(o2.agm(), o2.isDifficultyLocked()));
        h2.B(new f(b2));
        h2.B(new bl(e2.cIt));
        h2.B(new net.minecraft.network.play.server.k(e2.cHV.cJE));
        e2.acv().apE();
        e2.acv().v(e2);
        this.a((k)ai2.SD(), e2);
        this.dmK.alU();
        t t2 = !e2.xU().equalsIgnoreCase(string) ? new t("multiplayer.player.joined.renamed", e2.xW(), string) : new t("multiplayer.player.joined", e2.xW());
        t2.arp().b(an.dvZ);
        this.m(t2);
        this.q(e2);
        h2.f(e2.gW, e2.gX, e2.gY, e2.pl, e2.pm);
        this.b(e2, ai2);
        if (this.dmK.alr().length() > 0) {
            e2.P(this.dmK.alr(), this.dmK.als());
        }
        Object object = e2.VL().iterator();
        while (object.hasNext()) {
            net.minecraft.potion.d d2 = object.next();
            h2.B(new ae(e2.getEntityId(), d2));
        }
        e2.aci();
        if (n2 != null && n2.C("Riding", 10) && (object = net.minecraft.entity.n.a(n2.eN("Riding"), (w)ai2)) != null) {
            ((net.minecraft.entity.c)object).crD = true;
            ai2.G((net.minecraft.entity.c)object);
            e2.D((net.minecraft.entity.c)object);
            ((net.minecraft.entity.c)object).crD = false;
        }
    }

    protected void a(k k2, e e2) {
        HashSet hashSet = Sets.newHashSet();
        for (net.minecraft.scoreboard.h object : k2.akE()) {
            e2.cIX.B(new br(object, 0));
        }
        for (int i2 = 0; i2 < 19; ++i2) {
            g g2 = k2.gY(i2);
            if (g2 == null || hashSet.contains(g2)) continue;
            for (aj aj2 : k2.g(g2)) {
                e2.cIX.B(aj2);
            }
            hashSet.add(g2);
        }
    }

    public void a(ai[] aiArray) {
        this.dmS = aiArray[0].avG().azy();
        aiArray[0].Sv().a(new ServerConfigurationManager$1(this));
    }

    public void a(e e2, ai ai2) {
        ai ai3 = e2.acr();
        if (ai2 != null) {
            ai2.awv().m(e2);
        }
        ai3.awv().k(e2);
        ai3.dEb.G((int)e2.gW >> 4, (int)e2.gY >> 4);
    }

    public int amo() {
        return PlayerManager.he(this.amz());
    }

    public n p(e e2) {
        n n2;
        n n3 = this.dmK.dkG[0].avH().azr();
        if (e2.xU().equals(this.dmK.alk()) && n3 != null) {
            e2.a(n3);
            n2 = n3;
            dmI.debug("loading single player");
        } else {
            n2 = this.dmS.P(e2);
        }
        return n2;
    }

    protected void j(e e2) {
        this.dmS.O(e2);
        o o2 = this.dmR.get(e2.Ul());
        if (o2 != null) {
            o2.apC();
        }
    }

    public void q(e e2) {
        this.dmL.add(e2);
        this.dmM.put(e2.Ul(), e2);
        this.H(new bi(bj.dey, e2));
        ai ai2 = this.dmK.ha(e2.csP);
        ai2.G(e2);
        this.a(e2, null);
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            e e3 = this.dmL.get(i2);
            e2.cIX.B(new bi(bj.dey, e3));
        }
    }

    public void r(e e2) {
        e2.acr().awv().n(e2);
    }

    public void s(e e2) {
        e2.a(net.minecraft.stats.n.dpG);
        this.j(e2);
        ai ai2 = e2.acr();
        if (e2.crC != null) {
            ai2.az(e2.crC);
            dmI.debug("removing player mount");
        }
        ai2.H(e2);
        ai2.awv().m(e2);
        this.dmL.remove(e2);
        UUID uUID = e2.Ul();
        e e3 = this.dmM.get(uUID);
        if (e3 == e2) {
            this.dmM.remove(uUID);
            this.dmR.remove(uUID);
        }
        this.H(new bi(bj.deC, e2));
    }

    public String a(SocketAddress socketAddress, GameProfile gameProfile) {
        if (this.dmN.o(gameProfile)) {
            UserListBansEntry userListBansEntry = (UserListBansEntry)this.dmN.r(gameProfile);
            String string = "You are banned from this server!\nReason: " + userListBansEntry.ame();
            if (userListBansEntry.amd() != null) {
                string = string + "\nYour ban will be removed on " + dmJ.format(userListBansEntry.amd());
            }
            return string;
        }
        if (!this.j(gameProfile)) {
            return "You are not white-listed on this server!";
        }
        if (this.dmO.b(socketAddress)) {
            IPBanEntry iPBanEntry = this.dmO.c(socketAddress);
            String string = "Your IP address is banned from this server!\nReason: " + iPBanEntry.ame();
            if (iPBanEntry.amd() != null) {
                string = string + "\nYour ban will be removed on " + dmJ.format(iPBanEntry.amd());
            }
            return string;
        }
        return this.dmL.size() >= this.daE && !this.n(gameProfile) ? "The server is full!" : null;
    }

    public e g(GameProfile gameProfile) {
        Object object;
        UUID uUID = a.e(gameProfile);
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            object = this.dmL.get(i2);
            if (!((net.minecraft.entity.c)object).Ul().equals(uUID)) continue;
            arrayList.add(object);
        }
        e e2 = this.dmM.get(gameProfile.getId());
        if (e2 != null && !arrayList.contains(e2)) {
            arrayList.add(e2);
        }
        for (e e3 : arrayList) {
            e3.cIX.eQ("You logged in from another location");
        }
        object = this.dmK.AT() ? new net.minecraft.world.demo.a(this.dmK.ha(0)) : new ItemInWorldManager(this.dmK.ha(0));
        return new e(this.dmK, this.dmK.ha(0), gameProfile, (ItemInWorldManager)object);
    }

    public e a(e e2, int n2, boolean bl2) {
        b b2;
        e2.acr().awu().c(e2);
        e2.acr().awu().ak(e2);
        e2.acr().awv().m(e2);
        this.dmL.remove(e2);
        this.dmK.ha(e2.csP).az(e2);
        b b3 = e2.abU();
        boolean bl3 = e2.abV();
        e2.csP = n2;
        ItemInWorldManager itemInWorldManager = this.dmK.AT() ? new net.minecraft.world.demo.a(this.dmK.ha(e2.csP)) : new ItemInWorldManager(this.dmK.ha(e2.csP));
        e e3 = new e(this.dmK, this.dmK.ha(e2.csP), e2.Ie(), itemInWorldManager);
        e3.cIX = e2.cIX;
        e3.b(e2, bl2);
        e3.eu(e2.getEntityId());
        e3.aa(e2);
        ai ai2 = this.dmK.ha(e2.csP);
        this.a(e3, e2, ai2);
        if (b3 != null) {
            b2 = a.c(this.dmK.ha(e2.csP), b3, bl3);
            if (b2 != null) {
                e3.b((double)((float)b2.wt() + 0.5f), (double)((float)b2.wu() + 0.1f), (double)((float)b2.wx() + 0.5f), 0.0f, 0.0f);
                e3.a(b3, bl3);
            } else {
                e3.cIX.B(new av(0, 0.0f));
            }
        }
        ai2.dEb.G((int)e3.gW >> 4, (int)e3.gY >> 4);
        while (!ai2.a((net.minecraft.entity.c)e3, e3.Us()).isEmpty() && e3.gX < 256.0) {
            e3.setPosition(e3.gW, e3.gX + 1.0, e3.gY);
        }
        e3.cIX.B(new h(e3.csP, e3.baU.agm(), e3.baU.avH().awC(), e3.cIZ.If()));
        b2 = ai2.avE();
        e3.cIX.f(e3.gW, e3.gX, e3.gY, e3.pl, e3.pm);
        e3.cIX.B(new f(b2));
        e3.cIX.B(new ag(e3.cIw, e3.cIv, e3.cIu));
        this.b(e3, ai2);
        ai2.awv().k(e3);
        ai2.G(e3);
        this.dmL.add(e3);
        this.dmM.put(e3.Ul(), e3);
        e3.aci();
        e3.aY(e3.getHealth());
        return e3;
    }

    public void a(e e2, int n2) {
        int n3 = e2.csP;
        ai ai2 = this.dmK.ha(e2.csP);
        e2.csP = n2;
        ai ai3 = this.dmK.ha(e2.csP);
        e2.cIX.B(new h(e2.csP, e2.baU.agm(), e2.baU.avH().awC(), e2.cIZ.If()));
        ai2.az(e2);
        e2.csb = false;
        this.a(e2, n3, ai2, ai3);
        this.a(e2, ai2);
        e2.cIX.f(e2.gW, e2.gX, e2.gY, e2.pl, e2.pm);
        e2.cIZ.e(ai3);
        this.b(e2, ai3);
        this.t(e2);
        for (net.minecraft.potion.d d2 : e2.VL()) {
            e2.cIX.B(new ae(e2.getEntityId(), d2));
        }
    }

    public void a(net.minecraft.entity.c c2, int n2, ai ai2, ai ai3) {
        double d2 = c2.gW;
        double d3 = c2.gY;
        double d4 = 8.0;
        float f2 = c2.pl;
        ai2.dDt.eY("moving");
        if (c2.csP == -1) {
            d2 = bt.ah(d2 / 8.0, ai3.Sv().axm() + 16.0, ai3.Sv().axo() - 16.0);
            d3 = bt.ah(d3 / 8.0, ai3.Sv().axn() + 16.0, ai3.Sv().axp() - 16.0);
            c2.b(d2, c2.gX, d3, c2.pl, c2.pm);
            if (c2.TS()) {
                ai2.d(c2, false);
            }
        } else if (c2.csP == 0) {
            d2 = bt.ah(d2 * 8.0, ai3.Sv().axm() + 16.0, ai3.Sv().axo() - 16.0);
            d3 = bt.ah(d3 * 8.0, ai3.Sv().axn() + 16.0, ai3.Sv().axp() - 16.0);
            c2.b(d2, c2.gX, d3, c2.pl, c2.pm);
            if (c2.TS()) {
                ai2.d(c2, false);
            }
        } else {
            b b2 = n2 == 1 ? ai3.avE() : ai3.awa();
            d2 = b2.wt();
            c2.gX = b2.wu();
            d3 = b2.wx();
            c2.b(d2, c2.gX, d3, 90.0f, 0.0f);
            if (c2.TS()) {
                ai2.d(c2, false);
            }
        }
        ai2.dDt.ajv();
        if (n2 != 1) {
            ai2.dDt.eY("placing");
            d2 = bt.F((int)d2, -29999872, 29999872);
            d3 = bt.F((int)d3, -29999872, 29999872);
            if (c2.TS()) {
                c2.b(d2, c2.gX, d3, c2.pl, c2.pm);
                ai3.aww().g(c2, f2);
                ai3.G(c2);
                ai3.d(c2, false);
            }
            ai2.dDt.ajv();
        }
        c2.b(ai3);
    }

    public void amc() {
        if (++this.dmW > 600) {
            this.H(new bi(bj.deA, this.dmL));
            this.dmW = 0;
        }
    }

    public void H(aj aj2) {
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            this.dmL.get((int)i2).cIX.B(aj2);
        }
    }

    public void a(aj aj2, int n2) {
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            e e2 = this.dmL.get(i2);
            if (e2.csP != n2) continue;
            e2.cIX.B(aj2);
        }
    }

    public void a(a a2, ba ba2) {
        l l2 = a2.Vw();
        if (l2 != null) {
            for (String string : l2.akr()) {
                e e2 = this.fG(string);
                if (e2 == null || e2 == a2) continue;
                e2.a(ba2);
            }
        }
    }

    public void b(a a2, ba ba2) {
        l l2 = a2.Vw();
        if (l2 == null) {
            this.m(ba2);
        } else {
            for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
                e e2 = this.dmL.get(i2);
                if (e2.Vw() == l2) continue;
                e2.a(ba2);
            }
        }
    }

    public String cl(boolean bl2) {
        Object object = "";
        ArrayList arrayList = Lists.newArrayList(this.dmL);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (i2 > 0) {
                object = (String)object + ", ";
            }
            object = (String)object + ((e)arrayList.get(i2)).xU();
            if (!bl2) continue;
            object = (String)object + " (" + ((e)arrayList.get(i2)).Ul().toString() + ")";
        }
        return object;
    }

    public String[] Sa() {
        String[] stringArray = new String[this.dmL.size()];
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            stringArray[i2] = this.dmL.get(i2).xU();
        }
        return stringArray;
    }

    public GameProfile[] amp() {
        GameProfile[] gameProfileArray = new GameProfile[this.dmL.size()];
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            gameProfileArray[i2] = this.dmL.get(i2).Ie();
        }
        return gameProfileArray;
    }

    public UserListBans amq() {
        return this.dmN;
    }

    public BanList amr() {
        return this.dmO;
    }

    public void h(GameProfile gameProfile) {
        this.dmP.a(new UserListOpsEntry(gameProfile, this.dmK.akR(), this.dmP.q(gameProfile)));
    }

    public void i(GameProfile gameProfile) {
        this.dmP.s(gameProfile);
    }

    public boolean j(GameProfile gameProfile) {
        return !this.dmT || this.dmP.u(gameProfile) || this.dmQ.u(gameProfile);
    }

    public boolean k(GameProfile gameProfile) {
        return this.dmP.u(gameProfile) || this.dmK.all() && this.dmK.dkG[0].avH().awD() && this.dmK.alk().equalsIgnoreCase(gameProfile.getName()) || this.dmV;
    }

    public e fG(String string) {
        for (e e2 : this.dmL) {
            if (!e2.xU().equalsIgnoreCase(string)) continue;
            return e2;
        }
        return null;
    }

    public void a(double d2, double d3, double d4, double d5, int n2, aj aj2) {
        this.a(null, d2, d3, d4, d5, n2, aj2);
    }

    public void a(a a2, double d2, double d3, double d4, double d5, int n2, aj aj2) {
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            double d6;
            double d7;
            double d8;
            e e2 = this.dmL.get(i2);
            if (e2 == a2 || e2.csP != n2 || !((d8 = d2 - e2.gW) * d8 + (d7 = d3 - e2.gX) * d7 + (d6 = d4 - e2.gY) * d6 < d5 * d5)) continue;
            e2.cIX.B(aj2);
        }
    }

    public void ams() {
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            this.j(this.dmL.get(i2));
        }
    }

    public void l(GameProfile gameProfile) {
        this.dmQ.a(new UserListWhitelistEntry(gameProfile));
    }

    public void m(GameProfile gameProfile) {
        this.dmQ.s(gameProfile);
    }

    public UserListWhitelist amt() {
        return this.dmQ;
    }

    public String[] amu() {
        return this.dmQ.amD();
    }

    public UserListOps amv() {
        return this.dmP;
    }

    public String[] amw() {
        return this.dmP.amD();
    }

    public void amx() {
    }

    public void b(e e2, ai ai2) {
        net.minecraft.world.border.c c2 = this.dmK.dkG[0].Sv();
        e2.cIX.B(new by(c2, bz.dfy));
        e2.cIX.B(new d(ai2.getTotalWorldTime(), ai2.getWorldTime(), ai2.Si().gw("doDaylightCycle")));
        if (ai2.avK()) {
            e2.cIX.B(new av(1, 0.0f));
            e2.cIX.B(new av(7, ai2.ca(1.0f)));
            e2.cIX.B(new av(8, ai2.bY(1.0f)));
        }
    }

    public void t(e e2) {
        e2.d(e2.cHX);
        e2.acq();
        e2.cIX.B(new net.minecraft.network.play.server.k(e2.cHV.cJE));
    }

    public int ale() {
        return this.dmL.size();
    }

    public int getMaxPlayers() {
        return this.daE;
    }

    public String[] amy() {
        return this.dmK.dkG[0].avG().azy().amy();
    }

    public void cm(boolean bl2) {
        this.dmT = bl2;
    }

    public List<e> fH(String string) {
        ArrayList arrayList = Lists.newArrayList();
        for (e e2 : this.dmL) {
            if (!e2.acs().equals(string)) continue;
            arrayList.add(e2);
        }
        return arrayList;
    }

    public int amz() {
        return this.dmU;
    }

    public MinecraftServer alZ() {
        return this.dmK;
    }

    public n alY() {
        return null;
    }

    public void a(ao ao2) {
        this.bFi = ao2;
    }

    private void a(e e2, e e3, w w2) {
        if (e3 != null) {
            e2.cIZ.a(e3.cIZ.If());
        } else if (this.bFi != null) {
            e2.cIZ.a(this.bFi);
        }
        e2.cIZ.b(w2.avH().If());
    }

    public void cn(boolean bl2) {
        this.dmV = bl2;
    }

    public void amA() {
        for (int i2 = 0; i2 < this.dmL.size(); ++i2) {
            this.dmL.get((int)i2).cIX.eQ("Server closed");
        }
    }

    public void b(ba ba2, boolean bl2) {
        this.dmK.a(ba2);
        byte by2 = (byte)(bl2 ? 1 : 0);
        this.H(new c(ba2, by2));
    }

    public void m(ba ba2) {
        this.b(ba2, true);
    }

    public o H(a a2) {
        o o2;
        UUID uUID = a2.Ul();
        o o3 = o2 = uUID == null ? null : this.dmR.get(uUID);
        if (o2 == null) {
            File file;
            File file2 = new File(this.dmK.ha(0).avG().azz(), "stats");
            File file3 = new File(file2, uUID.toString() + ".json");
            if (!file3.exists() && (file = new File(file2, a2.xU() + ".json")).exists() && file.isFile()) {
                file.renameTo(file3);
            }
            o2 = new o(this.dmK, file3);
            o2.apB();
            this.dmR.put(uUID, o2);
        }
        return o2;
    }

    public void hg(int n2) {
        this.dmU = n2;
        if (this.dmK.dkG != null) {
            for (ai ai2 : this.dmK.dkG) {
                if (ai2 == null) continue;
                ai2.awv().hd(n2);
            }
        }
    }

    public List<e> amB() {
        return this.dmL;
    }

    public e m(UUID uUID) {
        return this.dmM.get(uUID);
    }

    public boolean n(GameProfile gameProfile) {
        return false;
    }
}

