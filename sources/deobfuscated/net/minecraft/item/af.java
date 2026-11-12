/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.viamcp.fixes.FixedSoundEngine;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class af
extends d {
    protected final Block cVW;

    public af(Block block) {
        this.cVW = block;
    }

    public af ew(String string) {
        super.eu(string);
        return this;
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() != 47 && !Minecraft.getMinecraft().isSingleplayer()) {
            return FixedSoundEngine.onItemUse(this, co2, a2, w2, b2.ag(0.5, 0.5, 0.5), ao2, f2, f3, f4);
        }
        return FixedSoundEngine.onItemUse(this, co2, a2, w2, b2, ao2, f2, f3, f4);
    }

    public static boolean a(w w2, net.minecraft.entity.player.a a2, b b2, co co2) {
        net.minecraft.tileentity.d d2;
        MinecraftServer minecraftServer = MinecraftServer.afs();
        if (minecraftServer == null) {
            return false;
        }
        if (co2.aej() && co2.aek().C("BlockEntityTag", 10) && (d2 = w2.K(b2)) != null) {
            if (!w2.dDw && d2.apV() && !minecraftServer.alE().k(a2.Ie())) {
                return false;
            }
            n n2 = new n();
            n n3 = (n)n2.aeG();
            d2.b(n2);
            n n4 = (n)co2.aek().eB("BlockEntityTag");
            n2.w(n4);
            n2.B("x", b2.wt());
            n2.B("y", b2.wu());
            n2.B("z", b2.wx());
            if (!n2.equals(n3)) {
                d2.a(n2);
                d2.Lw();
                return true;
            }
        }
        return false;
    }

    public boolean a(w w2, b b2, ao ao2, net.minecraft.entity.player.a a2, co co2) {
        Block block = w2.L(b2).df();
        if (block == Blocks.cMJ) {
            ao2 = ao.dwr;
        } else if (!block.a(w2, b2)) {
            b2 = b2.x(ao2);
        }
        return w2.a(this.cVW, b2, false, ao2, null, co2);
    }

    @Override
    public String ao(co co2) {
        return this.cVW.xB();
    }

    @Override
    public String xB() {
        return this.cVW.xB();
    }

    @Override
    public a adD() {
        return this.cVW.xG();
    }

    @Override
    public void b(d d2, a a2, List<co> list) {
        this.cVW.a(d2, a2, list);
    }

    public Block df() {
        return this.cVW;
    }

    @Override
    public /* synthetic */ d eu(String string) {
        return this.ew(string);
    }
}

