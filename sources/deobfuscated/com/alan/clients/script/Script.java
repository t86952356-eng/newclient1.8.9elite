/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.io.FileUtils
 */
package com.alan.clients.script;

import com.alan.clients.script.util.ScriptHandler;
import java.io.File;
import java.nio.charset.Charset;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import lombok.Generated;
import org.apache.commons.io.FileUtils;
import rise.Client;

public final class Script {
    private final String name;
    private final String author;
    private final String version;
    private final String description;
    private String code;
    private final File sourceFile;
    private ScriptEngine engine;
    private ScriptHandler apiHandler;
    private boolean loaded;

    public Script(String string, String string2, String string3, String string4, String string5) {
        this(string, string2, string3, string4, string5, null);
    }

    public Script(String string, String string2, String string3, String string4, File file) {
        this(string, string2, string3, string4, null, file);
    }

    public Script(String string, String string2, String string3, String string4, String string5, File file) {
        this.name = string;
        this.author = string2;
        this.version = string3;
        this.description = string4;
        this.code = string5;
        this.sourceFile = file;
    }

    public void load() {
        try {
            if (this.loaded) {
                this.unload();
            }
            if (this.sourceFile != null) {
                this.code = FileUtils.readFileToString((File)this.sourceFile, (Charset)null);
            }
            if (this.code == null) {
                throw new ScriptException("Empty script");
            }
            this.engine = Client.a.l().createEngine();
            this.apiHandler = new ScriptHandler();
            this.engine.put("script", this.apiHandler);
            this.engine.eval(this.code);
            this.call("onLoad", new Object[0]);
            this.loaded = true;
        }
        catch (ScriptException scriptException) {
            throw scriptException;
        }
        catch (Exception exception) {
            throw new ScriptException(exception);
        }
    }

    public void unload() {
        try {
            this.call("onUnload", new Object[0]);
        }
        catch (Exception exception) {
            throw new ScriptException(exception);
        }
        finally {
            Client.a.v().pi();
            this.engine = null;
            this.apiHandler = null;
            this.loaded = false;
        }
    }

    public void reload() {
        if (this.loaded) {
            this.unload();
        }
        this.load();
    }

    private void call(String string, Object ... objectArray) {
        this.apiHandler.call(string, objectArray);
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getAuthor() {
        return this.author;
    }

    @Generated
    public String getVersion() {
        return this.version;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public String getCode() {
        return this.code;
    }

    @Generated
    public File getSourceFile() {
        return this.sourceFile;
    }

    @Generated
    public ScriptEngine getEngine() {
        return this.engine;
    }

    @Generated
    public ScriptHandler getApiHandler() {
        return this.apiHandler;
    }

    @Generated
    public boolean isLoaded() {
        return this.loaded;
    }

    @Generated
    public void setCode(String string) {
        this.code = string;
    }

    @Generated
    public void setEngine(ScriptEngine scriptEngine) {
        this.engine = scriptEngine;
    }

    @Generated
    public void setApiHandler(ScriptHandler scriptHandler) {
        this.apiHandler = scriptHandler;
    }

    @Generated
    public void setLoaded(boolean bl2) {
        this.loaded = bl2;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Script)) {
            return false;
        }
        Script script = (Script)object;
        if (this.isLoaded() != script.isLoaded()) {
            return false;
        }
        String string = this.getName();
        String string2 = script.getName();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.getAuthor();
        String string4 = script.getAuthor();
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return false;
        }
        String string5 = this.getVersion();
        String string6 = script.getVersion();
        if (string5 == null ? string6 != null : !string5.equals(string6)) {
            return false;
        }
        String string7 = this.getDescription();
        String string8 = script.getDescription();
        if (string7 == null ? string8 != null : !string7.equals(string8)) {
            return false;
        }
        String string9 = this.getCode();
        String string10 = script.getCode();
        if (string9 == null ? string10 != null : !string9.equals(string10)) {
            return false;
        }
        File file = this.getSourceFile();
        File file2 = script.getSourceFile();
        if (file == null ? file2 != null : !((Object)file).equals(file2)) {
            return false;
        }
        ScriptEngine scriptEngine = this.getEngine();
        ScriptEngine scriptEngine2 = script.getEngine();
        if (scriptEngine == null ? scriptEngine2 != null : !scriptEngine.equals(scriptEngine2)) {
            return false;
        }
        ScriptHandler scriptHandler = this.getApiHandler();
        ScriptHandler scriptHandler2 = script.getApiHandler();
        return !(scriptHandler == null ? scriptHandler2 != null : !scriptHandler.equals(scriptHandler2));
    }

    @Generated
    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + (this.isLoaded() ? 79 : 97);
        String string = this.getName();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.getAuthor();
        n3 = n3 * 59 + (string2 == null ? 43 : string2.hashCode());
        String string3 = this.getVersion();
        n3 = n3 * 59 + (string3 == null ? 43 : string3.hashCode());
        String string4 = this.getDescription();
        n3 = n3 * 59 + (string4 == null ? 43 : string4.hashCode());
        String string5 = this.getCode();
        n3 = n3 * 59 + (string5 == null ? 43 : string5.hashCode());
        File file = this.getSourceFile();
        n3 = n3 * 59 + (file == null ? 43 : ((Object)file).hashCode());
        ScriptEngine scriptEngine = this.getEngine();
        n3 = n3 * 59 + (scriptEngine == null ? 43 : scriptEngine.hashCode());
        ScriptHandler scriptHandler = this.getApiHandler();
        n3 = n3 * 59 + (scriptHandler == null ? 43 : scriptHandler.hashCode());
        return n3;
    }

    @Generated
    public String toString() {
        return "Script(name=" + this.getName() + ", author=" + this.getAuthor() + ", version=" + this.getVersion() + ", description=" + this.getDescription() + ", code=" + this.getCode() + ", sourceFile=" + String.valueOf(this.getSourceFile()) + ", engine=" + String.valueOf(this.getEngine()) + ", apiHandler=" + String.valueOf(this.getApiHandler()) + ", loaded=" + this.isLoaded() + ")";
    }
}

