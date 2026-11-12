/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketAbilities;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketAnimation;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketBlockAction;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketBlockBreakAnim;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketBlockChange;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketBlockPlacement;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketCamera;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketChangeGameState;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketChat;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketChatMessage;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketChunkData;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketClickWindow;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketClientSettings;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketClientStatus;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketCloseWindow;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketCollectItem;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketCombatEvent;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketCreativeAction;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketCustomPayload;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketDestroyEntities;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketDigging;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketDisconnect;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketDisplayScoreboard;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEffect;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEnchantItem;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntity;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityAction;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityAttach;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityEffect;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityEquipment;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityHeadLook;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityMetadata;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityProperties;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityStatus;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketEntityTeleport;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketExplosion;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketFactory$ScriptPacketGeneric;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketHeldItem;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketInput;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketJoinGame;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketKeepAlive;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketLook;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketMapChunkBulk;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketMaps;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketMultiBlockChange;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketOpenWindow;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketParticles;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketPlayer;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketPlayerListHeaderFooter;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketPlayerListItem;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketPlayerPosLook;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketPosLook;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketPosition;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketRemoveEntityEffect;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketResourcePackSend;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketResourcePackStatus;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketRespawn;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketScoreboardObjective;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerAbilities;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerAnimation;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerCloseWindow;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerCustomPayload;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerDifficulty;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerHeldItem;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerKeepAlive;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerTabComplete;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerTransaction;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketServerUpdateSign;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSetCompressionLevel;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSetExperience;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSetSlot;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSignEditorOpen;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSoundEffect;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSpawnGlobalEntity;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSpawnMob;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSpawnObject;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSpawnPainting;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSpawnPlayer;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSpawnPosition;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSpawnXPOrb;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketSpectate;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketStatistics;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketTabComplete;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketTeams;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketTimeUpdate;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketTitle;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketTransaction;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketUpdateEntityNBT;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketUpdateHealth;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketUpdateScore;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketUpdateSign;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketUpdateTileEntity;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketUseBed;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketUseEntity;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketVelocity;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketWindowItems;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketWindowProperty;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacketWorldBorder;
import net.minecraft.network.play.client.a;
import net.minecraft.network.play.client.b;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.l;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.p;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.r;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.client.t;
import net.minecraft.network.play.client.u;
import net.minecraft.network.play.client.v;
import net.minecraft.network.play.client.w;
import net.minecraft.network.play.client.x;
import net.minecraft.network.play.client.y;
import net.minecraft.network.play.client.z;
import net.minecraft.network.play.server.aa;
import net.minecraft.network.play.server.ab;
import net.minecraft.network.play.server.ac;
import net.minecraft.network.play.server.ad;
import net.minecraft.network.play.server.ae;
import net.minecraft.network.play.server.af;
import net.minecraft.network.play.server.ag;
import net.minecraft.network.play.server.ah;
import net.minecraft.network.play.server.aj;
import net.minecraft.network.play.server.al;
import net.minecraft.network.play.server.an;
import net.minecraft.network.play.server.ao;
import net.minecraft.network.play.server.ap;
import net.minecraft.network.play.server.aq;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.as;
import net.minecraft.network.play.server.at;
import net.minecraft.network.play.server.au;
import net.minecraft.network.play.server.av;
import net.minecraft.network.play.server.aw;
import net.minecraft.network.play.server.ax;
import net.minecraft.network.play.server.ay;
import net.minecraft.network.play.server.az;
import net.minecraft.network.play.server.ba;
import net.minecraft.network.play.server.bb;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.bd;
import net.minecraft.network.play.server.be;
import net.minecraft.network.play.server.bf;
import net.minecraft.network.play.server.bg;
import net.minecraft.network.play.server.bh;
import net.minecraft.network.play.server.bi;
import net.minecraft.network.play.server.bl;
import net.minecraft.network.play.server.bm;
import net.minecraft.network.play.server.bn;
import net.minecraft.network.play.server.bo;
import net.minecraft.network.play.server.bq;
import net.minecraft.network.play.server.br;
import net.minecraft.network.play.server.bs;
import net.minecraft.network.play.server.bt;
import net.minecraft.network.play.server.bu;
import net.minecraft.network.play.server.bv;
import net.minecraft.network.play.server.bx;
import net.minecraft.network.play.server.by;
import net.minecraft.network.play.server.ca;
import net.minecraft.network.play.server.cc;
import net.minecraft.network.play.server.cd;
import net.minecraft.network.play.server.ce;
import net.minecraft.network.play.server.cf;
import net.minecraft.network.play.server.d;
import net.minecraft.network.play.server.o;

public class ScriptPacketFactory {
    public static ScriptPacket<?> wrap(net.minecraft.network.aj<?> aj2) {
        if (aj2 == null) {
            return null;
        }
        if (aj2 instanceof a) {
            return new ScriptPacketKeepAlive((a)aj2);
        }
        if (aj2 instanceof b) {
            return new ScriptPacketChatMessage((b)aj2);
        }
        if (aj2 instanceof c) {
            return new ScriptPacketUseEntity((c)aj2);
        }
        if (aj2 instanceof h) {
            return new ScriptPacketPosLook((h)aj2);
        }
        if (aj2 instanceof g) {
            return new ScriptPacketLook((g)aj2);
        }
        if (aj2 instanceof f) {
            return new ScriptPacketPosition((f)aj2);
        }
        if (aj2 instanceof e) {
            return new ScriptPacketPlayer((e)aj2);
        }
        if (aj2 instanceof i) {
            return new ScriptPacketDigging((i)aj2);
        }
        if (aj2 instanceof k) {
            return new ScriptPacketBlockPlacement((k)aj2);
        }
        if (aj2 instanceof l) {
            return new ScriptPacketHeldItem((l)aj2);
        }
        if (aj2 instanceof m) {
            return new ScriptPacketAnimation((m)aj2);
        }
        if (aj2 instanceof n) {
            return new ScriptPacketEntityAction((n)aj2);
        }
        if (aj2 instanceof p) {
            return new ScriptPacketInput((p)aj2);
        }
        if (aj2 instanceof q) {
            return new ScriptPacketCloseWindow((q)aj2);
        }
        if (aj2 instanceof r) {
            return new ScriptPacketClickWindow((r)aj2);
        }
        if (aj2 instanceof s) {
            return new ScriptPacketTransaction((s)aj2);
        }
        if (aj2 instanceof t) {
            return new ScriptPacketCreativeAction((t)aj2);
        }
        if (aj2 instanceof u) {
            return new ScriptPacketEnchantItem((u)aj2);
        }
        if (aj2 instanceof v) {
            return new ScriptPacketUpdateSign((v)aj2);
        }
        if (aj2 instanceof w) {
            return new ScriptPacketAbilities((w)aj2);
        }
        if (aj2 instanceof x) {
            return new ScriptPacketTabComplete((x)aj2);
        }
        if (aj2 instanceof y) {
            return new ScriptPacketClientSettings((y)aj2);
        }
        if (aj2 instanceof z) {
            return new ScriptPacketClientStatus((z)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.client.ab) {
            return new ScriptPacketCustomPayload((net.minecraft.network.play.client.ab)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.client.ac) {
            return new ScriptPacketSpectate((net.minecraft.network.play.client.ac)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.client.ad) {
            return new ScriptPacketResourcePackStatus((net.minecraft.network.play.client.ad)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.a) {
            return new ScriptPacketServerKeepAlive((net.minecraft.network.play.server.a)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.b) {
            return new ScriptPacketJoinGame((net.minecraft.network.play.server.b)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.c) {
            return new ScriptPacketChat((net.minecraft.network.play.server.c)aj2);
        }
        if (aj2 instanceof d) {
            return new ScriptPacketTimeUpdate((d)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.e) {
            return new ScriptPacketEntityEquipment((net.minecraft.network.play.server.e)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.f) {
            return new ScriptPacketSpawnPosition((net.minecraft.network.play.server.f)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.g) {
            return new ScriptPacketUpdateHealth((net.minecraft.network.play.server.g)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.h) {
            return new ScriptPacketRespawn((net.minecraft.network.play.server.h)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.i) {
            return new ScriptPacketPlayerPosLook((net.minecraft.network.play.server.i)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.k) {
            return new ScriptPacketServerHeldItem((net.minecraft.network.play.server.k)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.l) {
            return new ScriptPacketUseBed((net.minecraft.network.play.server.l)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.m) {
            return new ScriptPacketServerAnimation((net.minecraft.network.play.server.m)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.n) {
            return new ScriptPacketSpawnPlayer((net.minecraft.network.play.server.n)aj2);
        }
        if (aj2 instanceof o) {
            return new ScriptPacketCollectItem((o)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.p) {
            return new ScriptPacketSpawnObject((net.minecraft.network.play.server.p)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.q) {
            return new ScriptPacketSpawnMob((net.minecraft.network.play.server.q)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.r) {
            return new ScriptPacketSpawnPainting((net.minecraft.network.play.server.r)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.s) {
            return new ScriptPacketSpawnXPOrb((net.minecraft.network.play.server.s)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.t) {
            return new ScriptPacketVelocity((net.minecraft.network.play.server.t)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.u) {
            return new ScriptPacketDestroyEntities((net.minecraft.network.play.server.u)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.v) {
            return new ScriptPacketEntity((net.minecraft.network.play.server.v)aj2);
        }
        if (aj2 instanceof net.minecraft.network.play.server.z) {
            return new ScriptPacketEntityTeleport((net.minecraft.network.play.server.z)aj2);
        }
        if (aj2 instanceof aa) {
            return new ScriptPacketEntityHeadLook((aa)aj2);
        }
        if (aj2 instanceof ab) {
            return new ScriptPacketEntityStatus((ab)aj2);
        }
        if (aj2 instanceof ac) {
            return new ScriptPacketEntityAttach((ac)aj2);
        }
        if (aj2 instanceof ad) {
            return new ScriptPacketEntityMetadata((ad)aj2);
        }
        if (aj2 instanceof ae) {
            return new ScriptPacketEntityEffect((ae)aj2);
        }
        if (aj2 instanceof af) {
            return new ScriptPacketRemoveEntityEffect((af)aj2);
        }
        if (aj2 instanceof ag) {
            return new ScriptPacketSetExperience((ag)aj2);
        }
        if (aj2 instanceof ah) {
            return new ScriptPacketEntityProperties((ah)aj2);
        }
        if (aj2 instanceof aj) {
            return new ScriptPacketChunkData((aj)aj2);
        }
        if (aj2 instanceof al) {
            return new ScriptPacketMultiBlockChange((al)aj2);
        }
        if (aj2 instanceof an) {
            return new ScriptPacketBlockChange((an)aj2);
        }
        if (aj2 instanceof ao) {
            return new ScriptPacketBlockAction((ao)aj2);
        }
        if (aj2 instanceof ap) {
            return new ScriptPacketBlockBreakAnim((ap)aj2);
        }
        if (aj2 instanceof aq) {
            return new ScriptPacketMapChunkBulk((aq)aj2);
        }
        if (aj2 instanceof ar) {
            return new ScriptPacketExplosion((ar)aj2);
        }
        if (aj2 instanceof as) {
            return new ScriptPacketEffect((as)aj2);
        }
        if (aj2 instanceof at) {
            return new ScriptPacketSoundEffect((at)aj2);
        }
        if (aj2 instanceof au) {
            return new ScriptPacketParticles((au)aj2);
        }
        if (aj2 instanceof av) {
            return new ScriptPacketChangeGameState((av)aj2);
        }
        if (aj2 instanceof aw) {
            return new ScriptPacketSpawnGlobalEntity((aw)aj2);
        }
        if (aj2 instanceof ax) {
            return new ScriptPacketOpenWindow((ax)aj2);
        }
        if (aj2 instanceof ay) {
            return new ScriptPacketServerCloseWindow((ay)aj2);
        }
        if (aj2 instanceof az) {
            return new ScriptPacketSetSlot((az)aj2);
        }
        if (aj2 instanceof ba) {
            return new ScriptPacketWindowItems((ba)aj2);
        }
        if (aj2 instanceof bb) {
            return new ScriptPacketWindowProperty((bb)aj2);
        }
        if (aj2 instanceof bc) {
            return new ScriptPacketServerTransaction((bc)aj2);
        }
        if (aj2 instanceof bd) {
            return new ScriptPacketServerUpdateSign((bd)aj2);
        }
        if (aj2 instanceof be) {
            return new ScriptPacketMaps((be)aj2);
        }
        if (aj2 instanceof bf) {
            return new ScriptPacketUpdateTileEntity((bf)aj2);
        }
        if (aj2 instanceof bg) {
            return new ScriptPacketSignEditorOpen((bg)aj2);
        }
        if (aj2 instanceof bh) {
            return new ScriptPacketStatistics((bh)aj2);
        }
        if (aj2 instanceof bi) {
            return new ScriptPacketPlayerListItem((bi)aj2);
        }
        if (aj2 instanceof bl) {
            return new ScriptPacketServerAbilities((bl)aj2);
        }
        if (aj2 instanceof bm) {
            return new ScriptPacketServerTabComplete((bm)aj2);
        }
        if (aj2 instanceof bn) {
            return new ScriptPacketScoreboardObjective((bn)aj2);
        }
        if (aj2 instanceof bo) {
            return new ScriptPacketUpdateScore((bo)aj2);
        }
        if (aj2 instanceof bq) {
            return new ScriptPacketDisplayScoreboard((bq)aj2);
        }
        if (aj2 instanceof br) {
            return new ScriptPacketTeams((br)aj2);
        }
        if (aj2 instanceof bs) {
            return new ScriptPacketServerCustomPayload((bs)aj2);
        }
        if (aj2 instanceof bt) {
            return new ScriptPacketDisconnect((bt)aj2);
        }
        if (aj2 instanceof bu) {
            return new ScriptPacketServerDifficulty((bu)aj2);
        }
        if (aj2 instanceof bv) {
            return new ScriptPacketCombatEvent((bv)aj2);
        }
        if (aj2 instanceof bx) {
            return new ScriptPacketCamera((bx)aj2);
        }
        if (aj2 instanceof by) {
            return new ScriptPacketWorldBorder((by)aj2);
        }
        if (aj2 instanceof ca) {
            return new ScriptPacketTitle((ca)aj2);
        }
        if (aj2 instanceof cc) {
            return new ScriptPacketSetCompressionLevel((cc)aj2);
        }
        if (aj2 instanceof cd) {
            return new ScriptPacketPlayerListHeaderFooter((cd)aj2);
        }
        if (aj2 instanceof ce) {
            return new ScriptPacketResourcePackSend((ce)aj2);
        }
        if (aj2 instanceof cf) {
            return new ScriptPacketUpdateEntityNBT((cf)aj2);
        }
        return new ScriptPacketFactory$ScriptPacketGeneric(aj2);
    }
}

