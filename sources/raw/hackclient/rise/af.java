/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.script.Script;
import com.alan.clients.script.ScriptManager;
import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.afv;
import hackclient.rise.afz;
import hackclient.rise.s;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class af
extends s {
    public af() {
        super("command.script.description", "script", "scripts", "js");
    }

    @Override
    public void execute(String[] stringArray) {
        Script script;
        if (stringArray.length < 2) {
            this.error("Valid actions are load, reload, unload, disablesecurity, folder and enablesecurity");
            return;
        }
        String string = stringArray[1].toLowerCase(Locale.getDefault());
        ScriptManager scriptManager = a.a.l();
        if (stringArray.length > 3) {
            script = scriptManager.getScript(stringArray[2]);
            if (script == null) {
                afl.b("command.script.notfound", stringArray[2]);
                return;
            }
        } else {
            script = null;
        }
        try {
            switch (string) {
                case "load": {
                    if (script == null) {
                        scriptManager.loadScripts();
                        break;
                    }
                    script.load();
                    break;
                }
                case "reload": {
                    a.a.l().reloadScripts();
                    a.a.v().ayB = new ConcurrentLinkedQueue();
                    break;
                }
                case "unload": {
                    if (script == null) {
                        scriptManager.unloadScripts();
                        break;
                    }
                    script.unload();
                    break;
                }
                case "disablesecurity": {
                    scriptManager.setSecurityMeasures(false);
                    afl.b("command.script.disablesecurity", new Object[0]);
                    return;
                }
                case "enablesecurity": {
                    scriptManager.setSecurityMeasures(true);
                    afl.b("command.script.enablesecurity", new Object[0]);
                    return;
                }
                case "download": 
                case "install": {
                    new Thread(() -> {
                        try {
                            String string;
                            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("http://165.22.2.247/getscript?id=" + stringArray[2]).openConnection();
                            httpURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
                            httpURLConnection.addRequestProperty("rise", ">astolfo");
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            ArrayList<String> arrayList = new ArrayList<String>();
                            while ((string = bufferedReader.readLine()) != null) {
                                arrayList.add(string);
                            }
                            afz afz2 = new afz(new File(String.valueOf(ScriptManager.SCRIPT_DIRECTORY) + File.separator + stringArray[2] + ".js"), afv.aIl, stringArray[2]);
                            afz2.a(String.valueOf(ScriptManager.SCRIPT_DIRECTORY) + File.separator + stringArray[2] + ".js", arrayList);
                            afl.b("Installed the Script!", new Object[0]);
                            afl.b("Use .script reload, to reload scripts", new Object[0]);
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }).start();
                    return;
                }
                case "folder": {
                    try {
                        Desktop desktop = Desktop.getDesktop();
                        File file = new File(String.valueOf(ScriptManager.SCRIPT_DIRECTORY));
                        desktop.open(file);
                        afl.b("command.script.folder", new Object[0]);
                    }
                    catch (IOException | IllegalArgumentException exception) {
                        afl.b("command.script.notfoundfolder", new Object[0]);
                    }
                    return;
                }
                default: {
                    afl.b("command.script.unknownaction", "Valid actions are load, reload, unload, disablesecurity and enablesecurity");
                    return;
                }
            }
            afl.b("Successfully " + string + "ed " + (String)(script == null ? "all scripts" : "\"" + script.getName() + "\"") + ".", new Object[0]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            afl.b("Failed to " + string + " a script. Stacktrace printed.", new Object[0]);
        }
    }
}

