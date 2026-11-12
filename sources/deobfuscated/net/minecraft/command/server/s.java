/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command.server;

import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.t;
import net.minecraft.world.ai;
import net.minecraft.world.r;

public class s
extends a {
    @Override
    public String RX() {
        return "save-all";
    }

    @Override
    public String c(aw aw2) {
        return "commands.save.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        MinecraftServer minecraftServer = MinecraftServer.afs();
        aw2.a(new t("commands.save.start", new Object[0]));
        if (minecraftServer.alE() != null) {
            minecraftServer.alE().ams();
        }
        try {
            boolean bl2;
            ai ai2;
            int n2;
            for (n2 = 0; n2 < minecraftServer.dkG.length; ++n2) {
                if (minecraftServer.dkG[n2] == null) continue;
                ai2 = minecraftServer.dkG[n2];
                bl2 = ai2.dEc;
                ai2.dEc = false;
                ai2.b(true, null);
                ai2.dEc = bl2;
            }
            if (stringArray.length > 0 && "flush".equals(stringArray[0])) {
                aw2.a(new t("commands.save.flushStart", new Object[0]));
                for (n2 = 0; n2 < minecraftServer.dkG.length; ++n2) {
                    if (minecraftServer.dkG[n2] == null) continue;
                    ai2 = minecraftServer.dkG[n2];
                    bl2 = ai2.dEc;
                    ai2.dEc = false;
                    ai2.awq();
                    ai2.dEc = bl2;
                }
                aw2.a(new t("commands.save.flushEnd", new Object[0]));
            }
        }
        catch (r r2) {
            s.a(aw2, (au)this, "commands.save.failed", r2.getMessage());
            return;
        }
        s.a(aw2, (au)this, "commands.save.success", new Object[0]);
    }
}

