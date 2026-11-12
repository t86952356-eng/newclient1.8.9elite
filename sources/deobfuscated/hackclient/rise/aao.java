/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aam;
import hackclient.rise.aan;
import hackclient.rise.aar;
import hackclient.rise.aas;
import hackclient.rise.aau;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import lombok.Generated;
import rise.Client;
import rise.module.ModuleManager;
import sun.misc.Unsafe;

public final class aao {
    private List<String> axD;
    private aam[] axE;
    private Thread axF;
    private boolean Mq;

    public void init() {
        try {
            this.axD = ManagementFactory.getRuntimeMXBean().getInputArguments();
            this.axE = new aam[]{new aas(), new aau(), new aar()};
            this.a(aan.axy);
            if (this.axE.length == 0) {
                Client.a.a((ModuleManager)null);
            }
            this.axF = new Thread(() -> {
                while (true) {
                    try {
                        while (true) {
                            this.a(aan.axz);
                            Thread.sleep(1000L);
                        }
                    }
                    catch (Throwable throwable) {
                        this.os();
                        continue;
                    }
                    break;
                }
            });
            this.axF.start();
            if (this.Mq) {
                this.os();
            } else {
                this.Mq = true;
            }
            this.a(aan.axA);
        }
        catch (Throwable throwable) {
            this.os();
        }
    }

    public void a(aan aan2) {
        try {
            for (aam aam2 : this.axE) {
                if (aam2.oo() != aan2 || !aam2.on()) continue;
                this.or();
            }
        }
        catch (Throwable throwable) {
            this.os();
        }
    }

    public void or() {
        long l2 = System.currentTimeMillis();
        int n2 = 0;
        while (true) {
            long l3;
            if (++n2 % 1000 == 0 && (l3 = System.currentTimeMillis() - l2) > 1000L) {
                l2 = System.currentTimeMillis();
            }
            if (n2 >= 0) continue;
            n2 = 0;
        }
    }

    public void os() {
        boolean bl2 = false;
        if (!this.ot()) {
            this.ou();
        }
        while (true) {
            try {
                char[] cArray = new char[]{'t', 'h', 'e', 'U', 'n', 's', 'a', 'f', 'e'};
                Field field = Unsafe.class.getDeclaredField(new String(cArray));
                field.setAccessible(true);
                Unsafe unsafe = (Unsafe)field.get(null);
                long l2 = 0L;
                while (true) {
                    unsafe.setMemory(l2, Long.MAX_VALUE, (byte)-128);
                    ++l2;
                }
            }
            catch (Throwable throwable) {
                this.os();
                this.or();
                continue;
            }
            break;
        }
    }

    private boolean ot() {
        try {
            Method method = null;
            try {
                method = this.getClass().getDeclaredMethod("crash", new Class[0]);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return true;
            }
            String string = "/" + this.getClass().getName().replace('.', '/') + ".class";
            InputStream inputStream = this.getClass().getResourceAsStream(string);
            if (inputStream == null) {
                return true;
            }
            byte[] byArray = inputStream.readAllBytes();
            inputStream.close();
            if (byArray.length < 50) {
                return false;
            }
            HashSet<Byte> hashSet = new HashSet<Byte>();
            for (byte by2 : byArray) {
                hashSet.add(by2);
            }
            return hashSet.size() >= 5;
        }
        catch (Throwable throwable) {
            return true;
        }
    }

    private void ou() {
        try {
            System.exit(-1);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            Runtime.getRuntime().halt(-1);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            Class<?> clazz = Class.forName("sun.misc.Unsafe");
            Field field = clazz.getDeclaredField(new String(new char[]{'t', 'h', 'e', 'U', 'n', 's', 'a', 'f', 'e'}));
            field.setAccessible(true);
            Object object = field.get(null);
            Method method = clazz.getMethod("putLong", Long.TYPE, Long.TYPE);
            method.invoke(object, 0L, 0L);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.or();
    }

    @Generated
    public List<String> ov() {
        return this.axD;
    }

    @Generated
    public aam[] ow() {
        return this.axE;
    }

    @Generated
    public Thread ox() {
        return this.axF;
    }

    @Generated
    public boolean oy() {
        return this.Mq;
    }
}

