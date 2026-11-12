/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.gui;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.gui.cy;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.cm;
import net.minecraft.world.storage.f;

public class cx {
    private static final cm btW = new cm("textures/map/map_icons.png");
    private final TextureManager btX;
    private final Map<String, cy> btY = Maps.newHashMap();

    public cx(TextureManager textureManager) {
        this.btX = textureManager;
    }

    public void a(f f2) {
        this.b(f2).Gp();
    }

    public void a(f f2, boolean bl2) {
        this.b(f2).ai(bl2);
    }

    private cy b(f f2) {
        cy cy2 = this.btY.get(f2.dDT);
        if (cy2 == null) {
            cy2 = new cy(this, f2);
            this.btY.put(f2.dDT, cy2);
        }
        return cy2;
    }

    public void Go() {
        for (cy cy2 : this.btY.values()) {
            this.btX.l(cy2.bub);
        }
        this.btY.clear();
    }
}

