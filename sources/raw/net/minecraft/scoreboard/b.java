/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.scoreboard;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.scoreboard.a;
import net.minecraft.scoreboard.c;
import net.minecraft.scoreboard.e;
import net.minecraft.scoreboard.f;
import net.minecraft.util.an;

public interface b {
    public static final Map<String, b> djp = Maps.newHashMap();
    public static final b djq = new e("dummy");
    public static final b djr = new e("trigger");
    public static final b djs = new e("deathCount");
    public static final b djt = new e("playerKillCount");
    public static final b dju = new e("totalKillCount");
    public static final b djv = new f("health");
    public static final b[] djw = new b[]{new a("teamkill.", an.dvL), new a("teamkill.", an.dvM), new a("teamkill.", an.dvN), new a("teamkill.", an.dvO), new a("teamkill.", an.dvP), new a("teamkill.", an.dvQ), new a("teamkill.", an.dvR), new a("teamkill.", an.dvS), new a("teamkill.", an.dvT), new a("teamkill.", an.dvU), new a("teamkill.", an.dvV), new a("teamkill.", an.dvW), new a("teamkill.", an.dvX), new a("teamkill.", an.dvY), new a("teamkill.", an.dvZ), new a("teamkill.", an.dwa)};
    public static final b[] djx = new b[]{new a("killedByTeam.", an.dvL), new a("killedByTeam.", an.dvM), new a("killedByTeam.", an.dvN), new a("killedByTeam.", an.dvO), new a("killedByTeam.", an.dvP), new a("killedByTeam.", an.dvQ), new a("killedByTeam.", an.dvR), new a("killedByTeam.", an.dvS), new a("killedByTeam.", an.dvT), new a("killedByTeam.", an.dvU), new a("killedByTeam.", an.dvV), new a("killedByTeam.", an.dvW), new a("killedByTeam.", an.dvX), new a("killedByTeam.", an.dvY), new a("killedByTeam.", an.dvZ), new a("killedByTeam.", an.dwa)};

    public String getName();

    public int H(List<net.minecraft.entity.player.a> var1);

    public boolean akh();

    public c aki();
}

