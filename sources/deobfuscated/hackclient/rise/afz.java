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
import hackclient.rise.aft;
import hackclient.rise.afv;
import hackclient.rise.ahg;
import hackclient.rise.akj;
import hackclient.rise.akl;
import hackclient.rise.akn;
import hackclient.rise.ako;
import hackclient.rise.akr;
import hackclient.rise.cg;
import hackclient.rise.ev;
import hackclient.rise.p;
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
import rip.vantage.network.core.a;
import rise.Client;
import rise.module.Mode;
import rise.module.Module;
import rise.module.impl.render.ClickGUI;
import rise.util.Language;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;
import rise.value.Value;

public class afz
extends aft
implements p {
    private static final SimpleDateFormat aIu = new SimpleDateFormat("dd.MM.yyyy");
    private boolean aIv;
    private String name;
    private int key;

    public afz(File file, afv afv2, String string) {
        super(file, afv2);
        this.name = string;
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
            if (Client.a.p().nh().T(1000L)) {
                a.aKQ().aKZ().sendMessage(new e(jsonObject.toString()).aJz());
                Client.a.p().nh().aX();
            }
        }
        catch (IOException iOException) {
            return false;
        }
        Client.a.e().d(new ev());
        if (this.name != null) {
            cg.e("Config", "Loaded " + this.name + " config");
        }
        return true;
    }

    private static void e(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        for (Module module : Client.a.g().ef()) {
            String string;
            if (module == null || module.getModuleInfo() == null || jsonObject.has(string = module.getModuleInfo().aliases()[0])) continue;
            String string2 = null;
            for (Language language : Language.values()) {
                String string3 = ahg.a(string, language);
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
        for (Module module : Client.a.g().ef()) {
            JsonObject jsonObject3 = new JsonObject();
            if (!(module instanceof ClickGUI)) {
                jsonObject3.addProperty("state", Boolean.valueOf(module.isEnabled()));
            }
            if (bl2) {
                jsonObject3.addProperty("keyCode", (Number)module.getKey());
            }
            for (Value<?> value : module.getAllValues()) {
                Object object;
                JsonObject jsonObject4 = new JsonObject();
                if (value instanceof ModeValue) {
                    object = (ModeValue)value;
                    if (((Value)object).wD() == null) continue;
                    jsonObject4.addProperty("value", ((Mode)((Value)object).wD()).getName());
                } else if (value instanceof BooleanValue) {
                    object = (BooleanValue)value;
                    jsonObject4.addProperty("value", (Boolean)((Value)object).wD());
                } else if (value instanceof NumberValue) {
                    object = (NumberValue)value;
                    jsonObject4.addProperty("value", (Number)((Number)((Value)object).wD()).doubleValue());
                } else if (value instanceof akr) {
                    object = (akr)value;
                    String string = (String)((Value)object).wD();
                    string = string.replace("%", "<percentsign>");
                    jsonObject4.addProperty("value", string);
                } else if (value instanceof akj) {
                    object = (akj)value;
                    jsonObject4.addProperty("first", (Number)((Number)((Value)object).wD()).doubleValue());
                    jsonObject4.addProperty("second", (Number)((akj)object).wP().doubleValue());
                } else if (value instanceof akl) {
                    object = (akl)value;
                    jsonObject4.addProperty("red", (Number)((Color)((Value)object).wD()).getRed());
                    jsonObject4.addProperty("green", (Number)((Color)((Value)object).wD()).getGreen());
                    jsonObject4.addProperty("blue", (Number)((Color)((Value)object).wD()).getBlue());
                    jsonObject4.addProperty("alpha", (Number)((Color)((Value)object).wD()).getAlpha());
                } else if (value instanceof akn) {
                    object = (akn)value;
                    jsonObject4.addProperty("positionX", (Number)((akn)object).aqy.x);
                    jsonObject4.addProperty("positionY", (Number)((akn)object).aqy.y);
                    jsonObject4.addProperty("scaleX", (Number)((akn)object).aHP.x);
                    jsonObject4.addProperty("scaleY", (Number)((akn)object).aHP.y);
                } else if (value instanceof ako) {
                    object = (ako)value;
                    if (((Value)object).wD() == null) continue;
                    jsonObject4.addProperty("value", ((Value)object).wD().toString());
                }
                object = value.wF() != null ? (value.wF() instanceof Module ? ((Module)value.wF()).getModuleInfo().aliases()[0] + " Module" : ((Mode)value.wF()).getName() + " Mode") : "Unknown";
                jsonObject3.add(value.getName() + " in " + (String)object, (JsonElement)jsonObject4);
            }
            jsonObject.add(module.getModuleInfo().aliases()[0], (JsonElement)jsonObject3);
        }
        jsonObject.addProperty("theme", Client.a.k().rP().name());
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
                jsonObject = (JsonObject)Client.a.A().fromJson((Reader)bufferedReader, JsonObject.class);
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
        return this.name;
    }

    @Override
    @Generated
    public void setKey(int n2) {
        this.key = n2;
    }
}

