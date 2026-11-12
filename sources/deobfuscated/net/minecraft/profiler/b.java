/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.profiler;

import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import net.minecraft.profiler.a;
import net.minecraft.profiler.c;

public class b {
    private final Map<String, Object> dhH = Maps.newHashMap();
    private final Map<String, Object> dhI = Maps.newHashMap();
    private final String dhJ = UUID.randomUUID().toString();
    private final URL dhK;
    private final a dhL;
    private final Timer dhM = new Timer("Snooper Timer", true);
    private final Object dhN = new Object();
    private final long dhO;
    private boolean czS;
    private int dhP;

    public b(String string, a a2, long l2) {
        try {
            this.dhK = new URL("http://snoop.minecraft.net/" + string + "?version=2");
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
        this.dhL = a2;
        this.dhO = l2;
    }

    public void ajl() {
        if (!this.czS) {
            this.czS = true;
            this.ajm();
            this.dhM.schedule((TimerTask)new c(this), 0L, 900000L);
        }
    }

    private void ajm() {
        this.ajn();
        this.c("snooper_token", this.dhJ);
        this.d("snooper_token", this.dhJ);
        this.d("os_name", System.getProperty("os.name"));
        this.d("os_version", System.getProperty("os.version"));
        this.d("os_architecture", System.getProperty("os.arch"));
        this.d("java_version", System.getProperty("java.version"));
        this.c("version", "1.8.9");
        this.dhL.b(this);
    }

    private void ajn() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n2 = 0;
        for (String string : list) {
            if (!string.startsWith("-X")) continue;
            this.c("jvm_arg[" + n2++ + "]", string);
        }
        this.c("jvm_args", n2);
    }

    public void ajo() {
        this.d("memory_total", Runtime.getRuntime().totalMemory());
        this.d("memory_max", Runtime.getRuntime().maxMemory());
        this.d("memory_free", Runtime.getRuntime().freeMemory());
        this.d("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.dhL.a(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(String string, Object object) {
        Object object2 = this.dhN;
        synchronized (object2) {
            this.dhI.put(string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d(String string, Object object) {
        Object object2 = this.dhN;
        synchronized (object2) {
            this.dhH.put(string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map<String, String> ajp() {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        Object object = this.dhN;
        synchronized (object) {
            this.ajo();
            for (Map.Entry<String, Object> entry : this.dhH.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            for (Map.Entry<String, Object> entry : this.dhI.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
    }

    public boolean ajq() {
        return this.czS;
    }

    public void ajr() {
        this.dhM.cancel();
    }

    public String ajs() {
        return this.dhJ;
    }

    public long ajt() {
        return this.dhO;
    }
}

