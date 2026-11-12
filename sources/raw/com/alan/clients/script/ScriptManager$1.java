/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script;

import com.alan.clients.script.ScriptManager;
import com.alan.clients.script.api.GameSettingsAPI;
import com.alan.clients.script.api.MinecraftAPI;
import com.alan.clients.script.api.MoveAPI;
import com.alan.clients.script.api.NetworkAPI;
import com.alan.clients.script.api.PacketAPI;
import com.alan.clients.script.api.PlayerAPI;
import com.alan.clients.script.api.RenderAPI;
import com.alan.clients.script.api.RiseAPI;
import com.alan.clients.script.api.WebAPI;
import com.alan.clients.script.api.WorldAPI;
import javax.script.SimpleBindings;

class ScriptManager$1
extends SimpleBindings {
    ScriptManager$1(ScriptManager scriptManager) {
        this.put("mc", (Object)new MinecraftAPI());
        this.put("rise", (Object)new RiseAPI());
        this.put("player", (Object)new PlayerAPI());
        this.put("world", (Object)new WorldAPI());
        this.put("network", (Object)new NetworkAPI());
        this.put("render", (Object)new RenderAPI());
        this.put("packet", (Object)new PacketAPI());
        this.put("input", (Object)new GameSettingsAPI());
        this.put("web", (Object)new WebAPI());
        this.put("move", (Object)new MoveAPI());
    }
}

