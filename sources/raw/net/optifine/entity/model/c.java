/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.optifine.entity.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.model.ag;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.entity.model.anim.d;
import net.optifine.entity.model.b;
import net.optifine.entity.model.e;
import net.optifine.entity.model.f;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class c {
    private static boolean dj = false;
    private static Map<Class, Render> ege = null;
    private static Map<Class, TileEntitySpecialRenderer> egf = null;

    public static void jA() {
        Map<Class, Render> map = c.Nx();
        Map<Class, TileEntitySpecialRenderer> map2 = c.aCd();
        if (map == null) {
            a.warn("Entity render map not found, custom entity models are DISABLED.");
        } else if (map2 == null) {
            a.warn("Tile entity render map not found, custom entity models are DISABLED.");
        } else {
            dj = false;
            map.clear();
            map2.clear();
            map.putAll(ege);
            map2.putAll(egf);
            if (a.apd()) {
                cm[] cmArray = c.aCe();
                for (int i2 = 0; i2 < cmArray.length; ++i2) {
                    Class clazz;
                    cm cm2 = cmArray[i2];
                    a.fN("CustomEntityModel: " + cm2.atA());
                    g g2 = c.N(cm2);
                    if (g2 == null || (clazz = g2.Np()) == null) continue;
                    if (g2 instanceof Render) {
                        map.put(clazz, (Render)g2);
                    } else if (g2 instanceof TileEntitySpecialRenderer) {
                        map2.put(clazz, (TileEntitySpecialRenderer)g2);
                    } else {
                        a.warn("Unknown renderer type: " + g2.getClass().getName());
                    }
                    dj = true;
                }
            }
        }
    }

    private static Map<Class, Render> Nx() {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        Map<Class, Render> map = renderManager.Nx();
        if (map == null) {
            return null;
        }
        if (ege == null) {
            ege = new HashMap<Class, Render>(map);
        }
        return map;
    }

    private static Map<Class, TileEntitySpecialRenderer> aCd() {
        Map<Class, TileEntitySpecialRenderer> map = TileEntityRendererDispatcher.caV.caU;
        if (egf == null) {
            egf = new HashMap<Class, TileEntitySpecialRenderer>(map);
        }
        return map;
    }

    private static cm[] aCe() {
        String string = "optifine/cem/";
        String string2 = ".jem";
        ArrayList<cm> arrayList = new ArrayList<cm>();
        String[] stringArray = e.aCi();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string3 = stringArray[i2];
            String string4 = "optifine/cem/" + string3 + ".jem";
            cm cm2 = new cm(string4);
            if (!a.F(cm2)) continue;
            arrayList.add(cm2);
        }
        cm[] cmArray = arrayList.toArray(new cm[arrayList.size()]);
        return cmArray;
    }

    private static g N(cm cm2) {
        try {
            JsonObject jsonObject = b.M(cm2);
            g g2 = c.t(jsonObject, cm2.atA());
            return g2;
        }
        catch (IOException iOException) {
            a.error(iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
        catch (JsonParseException jsonParseException) {
            a.error(((Object)((Object)jsonParseException)).getClass().getName() + ": " + jsonParseException.getMessage());
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static g t(JsonObject jsonObject, String string) {
        net.optifine.entity.model.d d2 = b.s(jsonObject, string);
        String string2 = d2.getName();
        h h2 = e.hX(string2);
        c.a((Object)h2, "Entity not found: " + string2);
        Class clazz = h2.Np();
        c.a(clazz, "Entity class not found: " + string2);
        g g2 = c.a(h2, d2);
        if (g2 == null) {
            return null;
        }
        g2.f(clazz);
        return g2;
    }

    private static g a(h h2, net.optifine.entity.model.d d2) {
        net.minecraft.client.model.d d3;
        cm cm2 = d2.Hg();
        f[] fArray = d2.aCf();
        float f2 = d2.aCg();
        if (f2 < 0.0f) {
            f2 = h2.aCg();
        }
        if ((d3 = h2.aCn()) == null) {
            return null;
        }
        net.optifine.entity.model.anim.c c2 = new net.optifine.entity.model.anim.c(h2, d3, fArray);
        if (!c.a(h2, d3, fArray, c2)) {
            return null;
        }
        g g2 = h2.a(d3, f2);
        if (g2 == null) {
            throw new JsonParseException("Entity renderer is null, model: " + h2.getName() + ", adapter: " + h2.getClass().getName());
        }
        if (cm2 != null) {
            g2.i(cm2);
        }
        return g2;
    }

    private static boolean a(h h2, net.minecraft.client.model.d d2, f[] fArray, net.optifine.entity.model.anim.c c2) {
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            f f2 = fArray[i2];
            if (c.a(h2, d2, f2, c2)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(h h2, net.minecraft.client.model.d d2, f f2, net.optifine.entity.model.anim.c c2) {
        ag[] agArray;
        String string = f2.aCk();
        ag ag2 = h2.a(d2, string);
        if (ag2 == null) {
            a.warn("Model part not found: " + string + ", model: " + String.valueOf(d2));
            return false;
        }
        if (!f2.aCl()) {
            if (ag2.bBN != null) {
                ag2.bBN.clear();
            }
            if (ag2.bBU != null) {
                ag2.bBU.clear();
            }
            if (ag2.bBO != null) {
                agArray = h2.b(d2);
                Set set = Collections.newSetFromMap(new IdentityHashMap());
                set.addAll(Arrays.asList(agArray));
                List<ag> list = ag2.bBO;
                Iterator<ag> iterator = list.iterator();
                while (iterator.hasNext()) {
                    ag ag3 = iterator.next();
                    if (set.contains(ag3)) continue;
                    iterator.remove();
                }
            }
        }
        ag2.a(f2.aCj());
        agArray = f2.aCm();
        if (agArray != null) {
            c2.c(f2.aCj());
            c2.b(ag2);
            if (!agArray.a(c2)) {
                return false;
            }
            f2.aCj().a((d)agArray);
        }
        return true;
    }

    private static void a(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    public static boolean bd() {
        return dj;
    }
}

