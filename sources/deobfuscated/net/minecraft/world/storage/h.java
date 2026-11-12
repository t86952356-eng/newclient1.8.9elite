/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.world.storage;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import net.minecraft.nbt.a;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.y;
import net.minecraft.world.ah;
import net.minecraft.world.storage.d;

public class h {
    private final d dTu;
    protected Map<String, ah> dTv = Maps.newHashMap();
    private final List<ah> dTw = Lists.newArrayList();
    private final Map<String, Short> dTx = Maps.newHashMap();

    public h(d d2) {
        this.dTu = d2;
        this.azC();
    }

    public ah e(Class<? extends ah> clazz, String string) {
        ah ah2;
        block7: {
            ah2 = this.dTv.get(string);
            if (ah2 != null) {
                return ah2;
            }
            if (this.dTu != null) {
                try {
                    File file = this.dTu.gO(string);
                    if (file == null || !file.exists()) break block7;
                    try {
                        ah2 = clazz.getConstructor(String.class).newInstance(string);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Failed to instantiate " + clazz.toString(), exception);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    n n2 = a.f(fileInputStream);
                    fileInputStream.close();
                    ah2.a(n2.eN("data"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (ah2 != null) {
            this.dTv.put(string, ah2);
            this.dTw.add(ah2);
        }
        return ah2;
    }

    public void b(String string, ah ah2) {
        if (this.dTv.containsKey(string)) {
            this.dTw.remove(this.dTv.remove(string));
        }
        this.dTv.put(string, ah2);
        this.dTw.add(ah2);
    }

    public void azB() {
        for (int i2 = 0; i2 < this.dTw.size(); ++i2) {
            ah ah2 = this.dTw.get(i2);
            if (!ah2.awh()) continue;
            this.a(ah2);
            ah2.cu(false);
        }
    }

    private void a(ah ah2) {
        if (this.dTu != null) {
            try {
                File file = this.dTu.gO(ah2.dDT);
                if (file != null) {
                    n n2 = new n();
                    ah2.b(n2);
                    n n3 = new n();
                    n3.b("data", n2);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    a.a(n3, fileOutputStream);
                    fileOutputStream.close();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void azC() {
        try {
            this.dTx.clear();
            if (this.dTu == null) {
                return;
            }
            File file = this.dTu.gO("idcounts");
            if (file != null && file.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                n n2 = a.a(dataInputStream);
                dataInputStream.close();
                for (String string : n2.aeQ()) {
                    g g2 = n2.eB(string);
                    if (!(g2 instanceof y)) continue;
                    y y2 = (y)g2;
                    short s2 = y2.aeL();
                    this.dTx.put(string, s2);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int gA(String string) {
        Short s2 = this.dTx.get(string);
        s2 = s2 == null ? Short.valueOf((short)0) : Short.valueOf((short)(s2 + 1));
        this.dTx.put(string, s2);
        if (this.dTu == null) {
            return s2.shortValue();
        }
        try {
            File file = this.dTu.gO("idcounts");
            if (file != null) {
                n n2 = new n();
                for (String string2 : this.dTx.keySet()) {
                    short s3 = this.dTx.get(string2);
                    n2.a(string2, s3);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
                a.a(n2, (DataOutput)dataOutputStream);
                dataOutputStream.close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return s2.shortValue();
    }
}

