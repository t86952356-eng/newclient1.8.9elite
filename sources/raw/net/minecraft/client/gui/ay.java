/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.gui;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.d;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.src.a;
import net.minecraft.util.an;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.util.cf;
import net.minecraft.util.db;
import net.minecraft.world.ap;
import net.minecraft.world.biome.aj;
import net.minecraft.world.l;
import net.optifine.bi;
import net.optifine.bm;
import net.optifine.reflect.g;
import net.optifine.util.ac;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class ay
extends b {
    private final d bqq;
    private final agg bqr;
    private String bqs = null;

    public ay(d d2) {
        this.bqq = d2;
        this.bqr = d2.fontRendererObj;
    }

    public void i(cz cz2) {
        this.bqq.bhw.eY("debug");
        GlStateManager.JV();
        this.Fc();
        this.j(cz2);
        GlStateManager.JW();
        if (this.bqq.aIY.chR) {
            this.Ff();
        }
        this.bqq.bhw.ajv();
    }

    private boolean Fb() {
        return this.bqq.bgK.acd() || this.bqq.aIY.cgJ;
    }

    protected void Fc() {
        List<String> list = this.Fd();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = list.get(i2);
            if (Strings.isNullOrEmpty((String)string)) continue;
            int n2 = agg.aIF;
            int n3 = this.bqr.bQ(string);
            int n4 = 2;
            int n5 = 2 + n2 * i2;
            ay.drawRect(1, n5 - 1, 2 + n3 + 1, n5 + n2 - 1, -1873784752);
            this.bqr.a(string, 2.0, (double)n5, 0xE0E0E0);
        }
    }

    protected void j(cz cz2) {
        List<String> list = this.Fe();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = list.get(i2);
            if (Strings.isNullOrEmpty((String)string)) continue;
            int n2 = agg.aIF;
            int n3 = this.bqr.bQ(string);
            int n4 = cz2.getScaledWidth() - 2 - n3;
            int n5 = 2 + n2 * i2;
            ay.drawRect(n4 - 1, n5 - 1, n4 + n3 + 1, n5 + n2 - 1, -1873784752);
            this.bqr.a(string, (double)n4, (double)n5, 0xE0E0E0);
        }
    }

    protected List<String> Fd() {
        Object object;
        AbstractStringBuilder abstractStringBuilder;
        net.minecraft.util.b b2 = new net.minecraft.util.b(this.bqq.BC().gW, this.bqq.BC().Us().dtI, this.bqq.BC().gY);
        if (this.bqq.bhQ != this.bqs) {
            abstractStringBuilder = new StringBuffer(this.bqq.bhQ);
            int n2 = a.aoV();
            int n3 = this.bqq.bhQ.indexOf(" fps ");
            if (n3 >= 0) {
                ((StringBuffer)abstractStringBuilder).insert(n3, "/" + n2);
            }
            if (a.api()) {
                ((StringBuffer)abstractStringBuilder).append(" sf");
            }
            if (a.aoE()) {
                ((StringBuffer)abstractStringBuilder).append(" fr");
            }
            if (a.aog()) {
                ((StringBuffer)abstractStringBuilder).append(" af");
            }
            if (a.aoi()) {
                ((StringBuffer)abstractStringBuilder).append(" aa");
            }
            if (a.apg()) {
                ((StringBuffer)abstractStringBuilder).append(" reg");
            }
            if (a.aoG()) {
                ((StringBuffer)abstractStringBuilder).append(" sh");
            }
            this.bqs = this.bqq.bhQ = ((StringBuffer)abstractStringBuilder).toString();
        }
        abstractStringBuilder = new StringBuilder();
        TextureMap textureMap = a.QB();
        ((StringBuilder)abstractStringBuilder).append(", A: ");
        if (bi.bd()) {
            ((StringBuilder)abstractStringBuilder).append(textureMap.OB() + bm.OB());
            ((StringBuilder)abstractStringBuilder).append("/");
        }
        ((StringBuilder)abstractStringBuilder).append(textureMap.OA() + bm.OA());
        String string = ((StringBuilder)abstractStringBuilder).toString();
        if (this.Fb()) {
            return Lists.newArrayList((Object[])new String[]{"Minecraft 1.8.9 (" + this.bqq.getVersion() + "/" + net.minecraft.client.b.An() + ")", this.bqq.bhQ, this.bqq.bgG.KK(), this.bqq.bgG.KL(), "P: " + this.bqq.bgN.Iu() + ". T: " + this.bqq.bgF.avv() + string, this.bqq.bgF.avw(), "", String.format("Chunk-relative: %d %d %d", b2.wt() & 0xF, b2.wu() & 0xF, b2.wx() & 0xF)});
        }
        c c2 = this.bqq.BC();
        ao ao2 = c2.Uq();
        String string2 = "Invalid";
        switch (ao2) {
            case dws: {
                string2 = "Towards negative Z";
                break;
            }
            case dwt: {
                string2 = "Towards positive Z";
                break;
            }
            case dwu: {
                string2 = "Towards negative X";
                break;
            }
            case dwv: {
                string2 = "Towards positive X";
            }
        }
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{"Minecraft 1.8.9 (" + this.bqq.getVersion() + "/" + net.minecraft.client.b.An() + ")", this.bqq.bhQ, this.bqq.bgG.KK(), this.bqq.bgG.KL(), "P: " + this.bqq.bgN.Iu() + ". T: " + this.bqq.bgF.avv() + string, this.bqq.bgF.avw(), "", String.format("XYZ: %.3f / %.5f / %.3f", this.bqq.BC().gW, this.bqq.BC().Us().dtI, this.bqq.BC().gY), String.format("Block: %d %d %d", b2.wt(), b2.wu(), b2.wx()), String.format("Chunk: %d %d %d in %d %d %d", b2.wt() & 0xF, b2.wu() & 0xF, b2.wx() & 0xF, b2.wt() >> 4, b2.wu() >> 4, b2.wx() >> 4), String.format("Facing: %s (%s) (%.1f / %.1f)", ao2, string2, Float.valueOf(bt.bN(c2.pl)), Float.valueOf(bt.bN(c2.pm)))});
        if (this.bqq.bgF != null && this.bqq.bgF.aJ(b2)) {
            net.minecraft.world.e e2;
            e e3;
            object = this.bqq.bgF.aK(b2);
            arrayList.add("Biome: " + ((net.minecraft.world.chunk.a)object).a((net.minecraft.util.b)b2, (aj)this.bqq.bgF.avp()).dGX);
            arrayList.add("Light: " + ((net.minecraft.world.chunk.a)object).g(b2, 0) + " (" + ((net.minecraft.world.chunk.a)object).b(net.minecraft.world.g.dBZ, b2) + " sky, " + ((net.minecraft.world.chunk.a)object).b(net.minecraft.world.g.dCa, b2) + " block)");
            net.minecraft.world.e e4 = this.bqq.bgF.bg(b2);
            if (this.bqq.Bf() && this.bqq.Bg() != null && (e3 = this.bqq.Bg().alE().m(this.bqq.bgK.Ul())) != null && (e2 = this.bqq.Bg().ad(e3.baU, new net.minecraft.util.b(e3))) != null) {
                e4 = e2;
            }
            arrayList.add(String.format("Local Difficulty: %.2f (Day %d)", Float.valueOf(e4.auXX()), this.bqq.bgF.getWorldTime() / 24000L));
        }
        if (this.bqq.bgT != null && this.bqq.bgT.Jc()) {
            arrayList.add("Shader: " + this.bqq.bgT.Jh().Rv());
        }
        if (this.bqq.bhc != null && this.bqq.bhc.dzu == cf.dzy && this.bqq.bhc.dg() != null) {
            object = this.bqq.bhc.dg();
            arrayList.add(String.format("Looking at: %d %d %d", ((db)object).wt(), ((db)object).wu(), ((db)object).wx()));
        }
        return arrayList;
    }

    protected List<String> Fe() {
        Object object;
        long l2 = Runtime.getRuntime().maxMemory();
        long l3 = Runtime.getRuntime().totalMemory();
        long l4 = Runtime.getRuntime().freeMemory();
        long l5 = l3 - l4;
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{String.format("Java: %s %dbit", System.getProperty("java.version"), this.bqq.Bv() ? 64 : 32), String.format("Mem: % 2d%% %03d/%03dMB", l5 * 100L / l2, ay.n(l5), ay.n(l2)), String.format("Allocated: % 2d%% %03dMB", l3 * 100L / l2, ay.n(l3)), "", String.format("CPU: %s", OpenGlHelper.Kz()), "", String.format("Display: %dx%d (%s)", Display.getWidth(), Display.getHeight(), GL11.glGetString((int)7936)), GL11.glGetString((int)7937), GL11.glGetString((int)7938)});
        long l6 = ac.aJr();
        long l7 = ac.aJs();
        String string = "Native: " + ay.n(l6) + "/" + ay.n(l7) + "MB";
        arrayList.add(4, string);
        if (g.enZ.aDA()) {
            object = g.g(g.eoc, new Object[0]);
            arrayList.add("");
            arrayList.addAll((Collection)g.g(object, g.enZ, false));
        }
        if (this.Fb()) {
            return arrayList;
        }
        if (this.bqq.bhc != null && this.bqq.bhc.dzu == cf.dzy && this.bqq.bhc.dg() != null) {
            object = this.bqq.bhc.dg();
            IBlockState iBlockState = this.bqq.bgF.L((net.minecraft.util.b)object);
            if (this.bqq.bgF.agn() != ap.dEI) {
                iBlockState = iBlockState.df().a(iBlockState, (l)this.bqq.bgF, (net.minecraft.util.b)object);
            }
            arrayList.add("");
            arrayList.add(String.valueOf(Block.aRV.y(iBlockState.df())));
            for (Map.Entry entry : iBlockState.zV().entrySet()) {
                Object object2 = ((Comparable)entry.getValue()).toString();
                if (entry.getValue() == Boolean.TRUE) {
                    object2 = String.valueOf((Object)an.dvV) + (String)object2;
                } else if (entry.getValue() == Boolean.FALSE) {
                    object2 = String.valueOf((Object)an.dvX) + (String)object2;
                }
                arrayList.add(((IProperty)entry.getKey()).getName() + ": " + (String)object2);
            }
        }
        return arrayList;
    }

    private void Ff() {
    }

    private int d(int n2, int n3, int n4, int n5) {
        return n2 < n4 ? this.f(-16711936, -256, (float)n2 / (float)n4) : this.f(-256, -65536, (float)(n2 - n4) / (float)(n5 - n4));
    }

    private int f(int n2, int n3, float f2) {
        int n4 = n2 >> 24 & 0xFF;
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n2 >> 8 & 0xFF;
        int n7 = n2 & 0xFF;
        int n8 = n3 >> 24 & 0xFF;
        int n9 = n3 >> 16 & 0xFF;
        int n10 = n3 >> 8 & 0xFF;
        int n11 = n3 & 0xFF;
        int n12 = bt.F((int)((float)n4 + (float)(n8 - n4) * f2), 0, 255);
        int n13 = bt.F((int)((float)n5 + (float)(n9 - n5) * f2), 0, 255);
        int n14 = bt.F((int)((float)n6 + (float)(n10 - n6) * f2), 0, 255);
        int n15 = bt.F((int)((float)n7 + (float)(n11 - n7) * f2), 0, 255);
        return n12 << 24 | n13 << 16 | n14 << 8 | n15;
    }

    private static long n(long l2) {
        return l2 / 1024L / 1024L;
    }
}

