/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  lombok.Generated
 */
package hackclient.rise;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import hackclient.rise.a;
import hackclient.rise.aft;
import hackclient.rise.afv;
import hackclient.rise.ahf;
import hackclient.rise.ahg;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akl;
import hackclient.rise.akn;
import hackclient.rise.ako;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.akr;
import hackclient.rise.cg;
import hackclient.rise.ev;
import hackclient.rise.gi;
import hackclient.rise.p;
import hackclient.rise.wy;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Generated;
import rip.vantage.commons.packet.impl.client.protection.e;

public class afz
extends aft
implements p {
    private static final SimpleDateFormat aIu = new SimpleDateFormat("dd.MM.yyyy");
    private boolean aIv;
    private String gK;
    private int key;

    public afz(File file, afv afv2, String string) {
        super(file, afv2);
        this.gK = string;
    }

    public afz(File file, afv afv2) {
        super(file, afv2);
    }

    @Override
    public boolean tt() {
        if (!this.sZ().exists()) {
            return false;
        }
        try {
            FileReader fileReader = new FileReader(this.sZ());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            JsonObject jsonObject = (JsonObject)this.A().fromJson((Reader)bufferedReader, JsonObject.class);
            bufferedReader.close();
            fileReader.close();
            if (jsonObject == null) {
                return false;
            }
            afz.e(jsonObject);
            if (a.a.p().nh().T(1000L)) {
                rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new e(jsonObject.toString()).aJz());
                a.a.p().nh().aX();
            }
        }
        catch (IOException iOException) {
            return false;
        }
        a.a.e().d(new ev());
        if (this.gK != null) {
            cg.e("Config", "Loaded " + this.gK + " config");
        }
        return true;
    }

    private static void e(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        for (gi gi2 : a.a.g().ef()) {
            String string;
            if (gi2 == null || gi2.getModuleInfo() == null || jsonObject.has(string = gi2.getModuleInfo().aliases()[0])) continue;
            String string2 = null;
            for (ahf ahf2 : ahf.values()) {
                String string3 = ahg.a(string, ahf2);
                if (string3 == null || string3.equals(string) || !jsonObject.has(string3)) continue;
                string2 = string3;
                break;
            }
            if (string2 == null) continue;
            jsonObject.add(string, jsonObject.get(string2));
            jsonObject.remove(string2);
        }
    }

    @Override
    public boolean tu() {
        try {
            this.sZ().createNewFile();
            JsonObject jsonObject = afz.b(this.aIv, true);
            FileWriter fileWriter = new FileWriter(this.sZ());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            this.A().toJson((JsonElement)jsonObject, (Appendable)bufferedWriter);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
        return true;
    }

    public static JsonObject b(boolean bl2, boolean bl3) {
        JsonObject jsonObject = new JsonObject();
        if (bl3) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("version", "6");
            jsonObject2.addProperty("creationDate", aIu.format(new Date()));
            jsonObject.add("Metadata", (JsonElement)jsonObject2);
        }
        for (gi gi2 : a.a.g().ef()) {
            JsonObject jsonObject3 = new JsonObject();
            if (!(gi2 instanceof wy)) {
                jsonObject3.addProperty("state", Boolean.valueOf(gi2.isEnabled()));
            }
            if (bl2) {
                jsonObject3.addProperty("keyCode", (Number)gi2.getKey());
            }
            for (akh<?> akh2 : gi2.getAllValues()) {
                Object object;
                JsonObject jsonObject4 = new JsonObject();
                if (akh2 instanceof akp) {
                    object = (akp)akh2;
                    if (((akh)object).wD() == null) continue;
                    jsonObject4.addProperty("value", ((akg)((akh)object).wD()).getName());
                } else if (akh2 instanceof aki) {
                    object = (aki)akh2;
                    jsonObject4.addProperty("value", (Boolean)((akh)object).wD());
                } else if (akh2 instanceof akq) {
                    object = (akq)akh2;
                    jsonObject4.addProperty("value", (Number)((Number)((akh)object).wD()).doubleValue());
                } else if (akh2 instanceof akr) {
                    object = (akr)akh2;
                    String string = (String)((akh)object).wD();
                    string = string.replace("%", "<percentsign>");
                    jsonObject4.addProperty("value", string);
                } else if (akh2 instanceof akj) {
                    object = (akj)akh2;
                    jsonObject4.addProperty("first", (Number)((Number)((akh)object).wD()).doubleValue());
                    jsonObject4.addProperty("second", (Number)((akj)object).wP().doubleValue());
                } else if (akh2 instanceof akl) {
                    object = (akl)akh2;
                    jsonObject4.addProperty("red", (Number)((Color)((akh)object).wD()).getRed());
                    jsonObject4.addProperty("green", (Number)((Color)((akh)object).wD()).getGreen());
                    jsonObject4.addProperty("blue", (Number)((Color)((akh)object).wD()).getBlue());
                    jsonObject4.addProperty("alpha", (Number)((Color)((akh)object).wD()).getAlpha());
                } else if (akh2 instanceof akn) {
                    object = (akn)akh2;
                    jsonObject4.addProperty("positionX", (Number)((akn)object).aqy.x);
                    jsonObject4.addProperty("positionY", (Number)((akn)object).aqy.y);
                    jsonObject4.addProperty("scaleX", (Number)((akn)object).aHP.x);
                    jsonObject4.addProperty("scaleY", (Number)((akn)object).aHP.y);
                } else if (akh2 instanceof ako) {
                    object = (ako)akh2;
                    if (((akh)object).wD() == null) continue;
                    jsonObject4.addProperty("value", ((akh)object).wD().toString());
                }
                object = akh2.wF() != null ? (akh2.wF() instanceof gi ? ((gi)akh2.wF()).getModuleInfo().aliases()[0] + " Module" : ((akg)akh2.wF()).getName() + " Mode") : "Unknown";
                jsonObject3.add(akh2.getName() + " in " + (String)object, (JsonElement)jsonObject4);
            }
            jsonObject.add(gi2.getModuleInfo().aliases()[0], (JsonElement)jsonObject3);
        }
        jsonObject.addProperty("theme", a.a.k().rP().name());
        return jsonObject;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static JsonObject d(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        try (FileReader fileReader = new FileReader(file);){
            JsonObject jsonObject;
            try (BufferedReader bufferedReader = new BufferedReader(fileReader);){
                jsonObject = (JsonObject)a.a.A().fromJson((Reader)bufferedReader, JsonObject.class);
            }
            return jsonObject;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public void tB() {
        this.aIv = true;
    }

    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public void onKey() {
        this.tt();
    }

    @Override
    public String[] getAliases() {
        return new String[]{this.getName()};
    }

    @Override
    public String getName() {
        return this.gK;
    }

    @Override
    @Generated
    public void setKey(int n2) {
        this.key = n2;
    }
}

