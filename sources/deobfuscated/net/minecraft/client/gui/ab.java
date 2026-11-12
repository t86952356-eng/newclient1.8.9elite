/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.client.gui;

import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ac;
import net.minecraft.client.gui.ad;
import net.minecraft.client.gui.ai;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.j;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.d;
import org.apache.commons.lang3.ArrayUtils;

public class ab
extends ai {
    private final j bnX;
    private final Minecraft bnY;
    private final aj[] bnZ;
    private int boa = 0;

    public ab(j j2, Minecraft minecraft) {
        super(minecraft, j2.width, j2.height, 63, j2.height - 32, 20);
        this.bnX = j2;
        this.bnY = minecraft;
        Object[] objectArray = (d[])ArrayUtils.clone((Object[])minecraft.aIY.chL);
        this.bnZ = new aj[objectArray.length + d.Rd().size()];
        Arrays.sort(objectArray);
        int n2 = 0;
        String string = null;
        for (Object object : objectArray) {
            int n3;
            String string2 = ((d)object).Rf();
            if (!string2.equals(string)) {
                string = string2;
                this.bnZ[n2++] = new ac(this, string2);
            }
            if ((n3 = minecraft.fontRendererObj.bQ(I18n.a(((d)object).Ri(), new Object[0]))) > this.boa) {
                this.boa = n3;
            }
            this.bnZ[n2++] = new ad(this, (d)object);
        }
    }

    @Override
    protected int getSize() {
        return this.bnZ.length;
    }

    @Override
    public aj bB(int n2) {
        return this.bnZ[n2];
    }

    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + 15;
    }

    @Override
    public int getListWidth() {
        return super.getListWidth() + 32;
    }
}

