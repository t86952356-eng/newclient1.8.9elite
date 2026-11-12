/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.shader;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.f;

public final class g
extends Enum<g> {
    public static final /* enum */ g cmK = new g("vertex", ".vsh", OpenGlHelper.bMF);
    public static final /* enum */ g cmL = new g("fragment", ".fsh", OpenGlHelper.bMG);
    private final String cmM;
    private final String cmN;
    private final int cmO;
    private final Map<String, f> cmP = Maps.newHashMap();
    private static final /* synthetic */ g[] cmQ;

    public static g[] values() {
        return (g[])cmQ.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private g(String string2, String string3, int n3) {
        this.cmM = string2;
        this.cmN = string3;
        this.cmO = n3;
    }

    public String RA() {
        return this.cmM;
    }

    protected String RB() {
        return this.cmN;
    }

    protected int RC() {
        return this.cmO;
    }

    protected Map<String, f> RD() {
        return this.cmP;
    }

    private static /* synthetic */ g[] RE() {
        return new g[]{cmK, cmL};
    }

    static {
        cmQ = g.RE();
    }
}

