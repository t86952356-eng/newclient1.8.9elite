/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.openjdk.nashorn.api.scripting.JSObject
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.RiseAPI$1;
import com.alan.clients.script.api.RiseAPI$2;
import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.ScriptCommand;
import com.alan.clients.script.api.wrapper.impl.ScriptModule;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector2f;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector3d;
import com.alan.clients.script.util.ScriptModuleInfo;
import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.ahd;
import hackclient.rise.ahg;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.bl;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.bx;
import hackclient.rise.cb;
import hackclient.rise.cg;
import hackclient.rise.gi;
import hackclient.rise.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.script.ScriptException;
import net.minecraft.client.d;
import org.openjdk.nashorn.api.scripting.JSObject;

public class RiseAPI {
    private static final Map<gi, ScriptModule> SCRIPT_MODULE_MAP = new HashMap<gi, ScriptModule>();
    private static final Map<s, ScriptCommand> SCRIPT_COMMAND_MAP = new HashMap<s, ScriptCommand>();

    private static ScriptModule getModule(gi gi2) {
        SCRIPT_MODULE_MAP.putIfAbsent(gi2, new ScriptModule(gi2, true));
        return SCRIPT_MODULE_MAP.get(gi2);
    }

    private static ScriptCommand getCommand(s s2) {
        SCRIPT_COMMAND_MAP.putIfAbsent(s2, new ScriptCommand(s2));
        return SCRIPT_COMMAND_MAP.get(s2);
    }

    public ScriptModule registerModule(String string, String string2) {
        AtomicReference<Object> atomicReference = new AtomicReference<Object>(null);
        RiseAPI$1 riseAPI$1 = new RiseAPI$1(this, new ScriptModuleInfo(string, string2), atomicReference);
        atomicReference.set(RiseAPI.getModule(riseAPI$1));
        a.a.g().f(riseAPI$1);
        if (a.a.v() != null) {
            a.a.v().pi();
        }
        return atomicReference.get();
    }

    public ScriptModule[] getModules() {
        ArrayList<gi> arrayList = a.a.g().ef();
        ScriptModule[] scriptModuleArray = new ScriptModule[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            scriptModuleArray[i2] = new ScriptModule((gi)arrayList.get(i2));
        }
        return scriptModuleArray;
    }

    public ScriptModule getModule(String string) {
        return new ScriptModule((gi)a.a.g().q(string));
    }

    public void rotate(float f2, float f3, double d2) {
        bs.a(new akb(f2, f3), d2, cb.gG);
    }

    public float[] getRotations(int n2) {
        akb akb2 = aix.y(d.AZ().bgF.cn(n2));
        return new float[]{akb2.x, akb2.y};
    }

    public float[] getRotations(ScriptVector3d scriptVector3d) {
        akb akb2 = aix.d(new akd(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ()));
        return new float[]{akb2.x, akb2.y};
    }

    public ScriptCommand registerCommand(String string, String string2) {
        AtomicReference<Object> atomicReference = new AtomicReference<Object>(null);
        RiseAPI$2 riseAPI$2 = new RiseAPI$2(this, string2, new String[]{string}, atomicReference);
        atomicReference.set(RiseAPI.getCommand(riseAPI$2));
        a.a.i().aQ().add(riseAPI$2);
        return atomicReference.get();
    }

    public ScriptCommand[] getCommands() {
        List<s> list = a.a.i().aQ();
        ScriptCommand[] scriptCommandArray = new ScriptCommand[list.size()];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            scriptCommandArray[i2] = RiseAPI.getCommand(list.get(i2));
        }
        return scriptCommandArray;
    }

    public ScriptCommand getCommand(String string) {
        return RiseAPI.getCommand(a.a.i().b(string));
    }

    public void displayChat(String string) {
        afl.b(string, new Object[0]);
    }

    public void displayInfoNotification(String string, String string2) {
        cg.e(string, string2);
    }

    public void displayInfoNotification(String string, String string2, int n2) {
        cg.a(string, string2, n2);
    }

    public void pingspoof(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        bm.a(n2, bl2, bl3, bl4, bl5);
    }

    public void blink() {
        bm.blink();
    }

    public void dispatch() {
        bm.dispatch();
    }

    public void pingspoof(int n2) {
        bm.a(n2, true, false, false, false);
    }

    public String getRiseName() {
        return a.b;
    }

    public String getRiseVersion() {
        return "6";
    }

    public long getSystemMillis() {
        return System.currentTimeMillis();
    }

    public ScriptVector2f newVec2(float f2, float f3) {
        return new ScriptVector2f(f2, f3);
    }

    public ScriptVector3d newVec3(double d2, double d3, double d4) {
        return new ScriptVector3d(d2, d3, d4);
    }

    public int getFPS() {
        return d.BI();
    }

    public long getPing() {
        return bl.getPing();
    }

    public boolean isBot(int n2) {
        return a.a.x().a(d.AZ().bgF.cn(n2));
    }

    public boolean isFriend(String string) {
        return bx.isFriend(string);
    }

    public ScriptBlockPos newBlockPos(int n2, int n3, int n4) {
        afl.b("Please use world.newBlockPos(), instead of rise.newBlockPos().", new Object[0]);
        return null;
    }

    public void setName(String string) {
        a.b = string;
    }

    public void threadPool(JSObject jSObject) {
        if (!jSObject.isFunction()) {
            throw new ScriptException("Not a function!");
        }
        ahd.aNC.execute(() -> jSObject.call(null, new Object[0]));
    }

    public void thread(JSObject jSObject) {
        if (!jSObject.isFunction()) {
            throw new ScriptException("Not a function!");
        }
        new Thread(() -> jSObject.call(null, new Object[0])).start();
    }

    public String translate(String string) {
        return ahg.cf(string);
    }

    public String getLocale() {
        return a.a.d().uT();
    }
}

