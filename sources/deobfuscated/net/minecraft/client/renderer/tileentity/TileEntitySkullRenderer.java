/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.renderer.tileentity;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.am;
import net.minecraft.client.model.d;
import net.minecraft.client.model.v;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.entity.player.a;
import net.minecraft.tileentity.aj;
import net.minecraft.util.ao;
import net.minecraft.util.cm;

public class TileEntitySkullRenderer
extends TileEntitySpecialRenderer<aj> {
    private static final cm cbk = new cm("textures/entity/skeleton/skeleton.png");
    private static final cm cbl = new cm("textures/entity/skeleton/wither_skeleton.png");
    private static final cm cbm = new cm("textures/entity/zombie/zombie.png");
    private static final cm cbn = new cm("textures/entity/creeper/creeper.png");
    public static TileEntitySkullRenderer cbo;
    private final am cbp = new am(0, 0, 64, 32);
    private final am cbq = new v();

    @Override
    public void a(aj aj2, double d2, double d3, double d4, float f2, int n2) {
        ao ao2 = ao.hy(aj2.zg() & 7);
        this.a((float)d2, (float)d3, (float)d4, ao2, (float)(aj2.aqU() * 360) / 16.0f, aj2.aqT(), aj2.aqR(), n2);
    }

    @Override
    public void b(aj aj2, double d2, double d3, double d4, float f2, int n2) {
    }

    @Override
    public void a(TileEntityRendererDispatcher tileEntityRendererDispatcher) {
        super.a(tileEntityRendererDispatcher);
        cbo = this;
    }

    public void a(float f2, float f3, float f4, ao ao2, float f5, int n2, GameProfile gameProfile, int n3) {
        am am2 = this.cbp;
        if (n3 >= 0) {
            this.a(cbs[n3]);
            GlStateManager.cR(5890);
            GlStateManager.JV();
            GlStateManager.i(4.0f, 2.0f, 1.0f);
            GlStateManager.j(0.0625f, 0.0625f, 0.0625f);
            GlStateManager.cR(5888);
        } else {
            switch (n2) {
                default: {
                    this.a(cbk);
                    break;
                }
                case 1: {
                    this.a(cbl);
                    break;
                }
                case 2: {
                    this.a(cbm);
                    am2 = this.cbq;
                    break;
                }
                case 3: {
                    am2 = this.cbq;
                    cm cm2 = DefaultPlayerSkin.Pg();
                    if (gameProfile != null) {
                        Minecraft minecraft = Minecraft.getMinecraft();
                        Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = minecraft.BB().c(gameProfile);
                        if (map.containsKey(MinecraftProfileTexture.Type.SKIN)) {
                            cm2 = minecraft.BB().a(map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
                        } else {
                            UUID uUID = a.e(gameProfile);
                            cm2 = DefaultPlayerSkin.e(uUID);
                        }
                    }
                    this.a(cm2);
                    break;
                }
                case 4: {
                    this.a(cbn);
                }
            }
        }
        GlStateManager.JV();
        GlStateManager.JI();
        if (ao2 != ao.dwr) {
            switch (ao2) {
                case dws: {
                    GlStateManager.j(f2 + 0.5f, f3 + 0.25f, f4 + 0.74f);
                    break;
                }
                case dwt: {
                    GlStateManager.j(f2 + 0.5f, f3 + 0.25f, f4 + 0.26f);
                    f5 = 180.0f;
                    break;
                }
                case dwu: {
                    GlStateManager.j(f2 + 0.74f, f3 + 0.25f, f4 + 0.5f);
                    f5 = 270.0f;
                    break;
                }
                default: {
                    GlStateManager.j(f2 + 0.26f, f3 + 0.25f, f4 + 0.5f);
                    f5 = 90.0f;
                    break;
                }
            }
        } else {
            GlStateManager.j(f2 + 0.5f, f3, f4 + 0.5f);
        }
        float f6 = 0.0625f;
        GlStateManager.JS();
        GlStateManager.i(-1.0f, -1.0f, 1.0f);
        GlStateManager.tL();
        ((d)am2).a(null, 0.0f, 0.0f, 0.0f, f5, 0.0f, 0.0625f);
        GlStateManager.JW();
        if (n3 >= 0) {
            GlStateManager.cR(5890);
            GlStateManager.JW();
            GlStateManager.cR(5888);
        }
    }

    @Override
    public /* synthetic */ void a(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2, int n2) {
        this.b((aj)d2, d3, d4, d5, f2, n2);
    }

    @Override
    public /* synthetic */ void b(net.minecraft.tileentity.d d2, double d3, double d4, double d5, float f2, int n2) {
        this.a((aj)d2, d3, d4, d5, f2, n2);
    }
}

