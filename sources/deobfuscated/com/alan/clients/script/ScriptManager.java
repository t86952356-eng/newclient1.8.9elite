/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.io.FileUtils
 *  org.openjdk.nashorn.api.scripting.ClassFilter
 *  org.openjdk.nashorn.api.scripting.NashornScriptEngineFactory
 */
package com.alan.clients.script;

import com.alan.clients.script.Script;
import com.alan.clients.script.ScriptManager$1;
import com.alan.clients.script.util.ScriptClassFilter;
import hackclient.rise.afl;
import hackclient.rise.afu;
import hackclient.rise.cg;
import hackclient.rise.fg;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import lombok.Generated;
import org.apache.commons.io.FileUtils;
import org.openjdk.nashorn.api.scripting.ClassFilter;
import org.openjdk.nashorn.api.scripting.NashornScriptEngineFactory;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.util.InstanceAccess;

public final class ScriptManager
implements InstanceAccess {
    public static final File SCRIPT_DIRECTORY = new File(afu.aIj, "scripts");
    private static final FilenameFilter SCRIPT_FILE_FILTER = (file, string) -> string.toLowerCase(Locale.ENGLISH).endsWith(".js");
    private static final ClassFilter SCRIPT_CLASS_FILTER = new ScriptClassFilter();
    private NashornScriptEngineFactory engineFactory;
    private Bindings globalBindings;
    private boolean securityMeasures = true;
    private final List<Script> scripts = new ArrayList<Script>();
    @EventLink
    public final Listener<fg> onWorldChange = fg2 -> this.loadBindings();

    public void init() {
        this.unloadScripts();
        this.engineFactory = new NashornScriptEngineFactory();
        this.loadBindings();
        try {
            this.loadScripts();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        Client.a.e().b(this);
    }

    public Script getScript(String string) {
        return this.scripts.stream().filter(script -> script.getName().equalsIgnoreCase(string)).findAny().orElse(null);
    }

    public void loadScripts() {
        this.loadScriptFiles();
        this.scripts.removeIf(script -> {
            try {
                script.load();
                return false;
            }
            catch (ScriptException scriptException) {
                scriptException.printStackTrace();
                afl.d("", new Object[0]);
                afl.b("Syntax error!", new Object[0]);
                afl.d("", new Object[0]);
                afl.b(scriptException.getMessage(), new Object[0]);
                afl.d("", new Object[0]);
                return true;
            }
        });
    }

    public void loadBindings() {
        this.globalBindings = new ScriptManager$1(this);
    }

    public void reloadScripts() {
        System.out.println("Reloaded Scripts");
        this.unloadScripts();
        try {
            this.loadScriptFiles();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.scripts.removeIf(script -> {
            try {
                script.reload();
                return false;
            }
            catch (ScriptException scriptException) {
                scriptException.printStackTrace();
                afl.d("", new Object[0]);
                afl.b("Syntax error!", new Object[0]);
                afl.d("", new Object[0]);
                afl.b(scriptException.getMessage(), new Object[0]);
                afl.d("", new Object[0]);
                return true;
            }
        });
    }

    public void unloadScripts() {
        this.scripts.forEach(script -> {
            try {
                script.unload();
            }
            catch (ScriptException scriptException) {
                scriptException.printStackTrace();
                cg.e("Script \"" + script.getName() + "\" unloaded incorrectly", "More details have been printed in a stacktrace.");
            }
        });
        this.scripts.clear();
    }

    public void setSecurityMeasures(boolean bl2) {
        this.securityMeasures = bl2;
        this.init();
    }

    private void loadScriptFiles() {
        if (!SCRIPT_DIRECTORY.exists()) {
            SCRIPT_DIRECTORY.mkdirs();
        }
        for (File file : Objects.requireNonNull(SCRIPT_DIRECTORY.listFiles(SCRIPT_FILE_FILTER))) {
            if (!file.canRead()) continue;
            String string = this.getName(file);
            boolean bl2 = this.scripts.stream().anyMatch(script -> script.getName().equals(string));
            if (bl2) continue;
            Script script2 = this.parseScript(FileUtils.readFileToString((File)file, (Charset)null), file);
            this.scripts.add(script2);
        }
    }

    public ScriptEngine createEngine() {
        ScriptEngine scriptEngine = this.isSecurityMeasures() ? this.engineFactory.getScriptEngine(SCRIPT_CLASS_FILTER) : this.engineFactory.getScriptEngine();
        scriptEngine.setBindings(this.globalBindings, 200);
        return scriptEngine;
    }

    public Script parseScript(String string, File file) {
        String string2 = "Unknown author";
        String string3 = "Unknown version";
        String string4 = "No description provided";
        boolean bl2 = false;
        block12: for (String string5 : string.split("\n")) {
            if (!(string5 = string5.trim()).startsWith("//@")) continue;
            String string6 = string5.substring(3).trim();
            String string7 = string6.toLowerCase(Locale.ENGLISH).split(" ")[0];
            String string8 = string6.substring(string7.length()).trim();
            switch (string7) {
                case "author": {
                    string2 = string8;
                    continue block12;
                }
                case "version": {
                    string3 = string8;
                    continue block12;
                }
                case "description": {
                    string4 = string8;
                    continue block12;
                }
                case "nosecurity": {
                    bl2 = true;
                }
            }
        }
        if (bl2 && this.securityMeasures) {
            throw new IllegalStateException("Script requires no security measures!");
        }
        return new Script(this.getName(file), string2, string3, string4, string, file);
    }

    private String getName(File file) {
        return file.getName().replace(".js", "");
    }

    @Generated
    public NashornScriptEngineFactory getEngineFactory() {
        return this.engineFactory;
    }

    @Generated
    public Bindings getGlobalBindings() {
        return this.globalBindings;
    }

    @Generated
    public boolean isSecurityMeasures() {
        return this.securityMeasures;
    }

    @Generated
    public List<Script> getScripts() {
        return this.scripts;
    }

    @Generated
    public Listener<fg> getOnWorldChange() {
        return this.onWorldChange;
    }
}

