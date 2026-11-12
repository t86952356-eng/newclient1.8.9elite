/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.world.gen;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.bt;
import net.minecraft.world.gen.k;

public class j {
    private final List<k> dNp = Lists.newArrayList();
    private final Map<String, Map<String, String>> dNq = Maps.newHashMap();
    private int dNr;

    public int ayj() {
        return this.dNr;
    }

    public void iw(int n2) {
        this.dNr = n2;
    }

    public Map<String, Map<String, String>> ayk() {
        return this.dNq;
    }

    public List<k> ayl() {
        return this.dNp;
    }

    public void aym() {
        int n2 = 0;
        for (k k2 : this.dNp) {
            k2.ix(n2);
            n2 += k2.ayo();
        }
    }

    public String toString() {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(3);
        stringBuilder.append(";");
        for (n2 = 0; n2 < this.dNp.size(); ++n2) {
            if (n2 > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(this.dNp.get(n2).toString());
        }
        stringBuilder.append(";");
        stringBuilder.append(this.dNr);
        if (!this.dNq.isEmpty()) {
            stringBuilder.append(";");
            n2 = 0;
            for (Map.Entry<String, Map<String, String>> entry : this.dNq.entrySet()) {
                if (n2++ > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(entry.getKey().toLowerCase());
                Map<String, String> map = entry.getValue();
                if (map.isEmpty()) continue;
                stringBuilder.append("(");
                int n3 = 0;
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    if (n3++ > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append(entry2.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append(entry2.getValue());
                }
                stringBuilder.append(")");
            }
        } else {
            stringBuilder.append(";");
        }
        return stringBuilder.toString();
    }

    private static k b(int n2, String string, int n3) {
        Object object;
        String[] stringArray = n2 >= 3 ? string.split("\\*", 2) : string.split("x", 2);
        int n4 = 1;
        int n5 = 0;
        if (stringArray.length == 2) {
            try {
                n4 = Integer.parseInt(stringArray[0]);
                if (n3 + n4 >= 256) {
                    n4 = 256 - n3;
                }
                if (n4 < 0) {
                    n4 = 0;
                }
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        Block block = null;
        try {
            object = stringArray[stringArray.length - 1];
            if (n2 < 3) {
                stringArray = ((String)object).split(":", 2);
                if (stringArray.length > 1) {
                    n5 = Integer.parseInt(stringArray[1]);
                }
                block = Block.aK(Integer.parseInt(stringArray[0]));
            } else {
                stringArray = ((String)object).split(":", 3);
                Block block2 = block = stringArray.length > 1 ? Block.cq(stringArray[0] + ":" + stringArray[1]) : null;
                if (block != null) {
                    n5 = stringArray.length > 2 ? Integer.parseInt(stringArray[2]) : 0;
                } else {
                    block = Block.cq(stringArray[0]);
                    if (block != null) {
                        int n6 = n5 = stringArray.length > 1 ? Integer.parseInt(stringArray[1]) : 0;
                    }
                }
                if (block == null) {
                    return null;
                }
            }
            if (block == Blocks.cLc) {
                n5 = 0;
            }
            if (n5 < 0 || n5 > 15) {
                n5 = 0;
            }
        }
        catch (Throwable throwable) {
            return null;
        }
        object = new k(n2, n4, block, n5);
        ((k)object).ix(n3);
        return object;
    }

    private static List<k> f(int n2, String string) {
        if (string != null && string.length() >= 1) {
            ArrayList arrayList = Lists.newArrayList();
            String[] stringArray = string.split(",");
            int n3 = 0;
            for (String string2 : stringArray) {
                k k2 = j.b(n2, string2, n3);
                if (k2 == null) {
                    return null;
                }
                arrayList.add(k2);
                n3 += k2.ayo();
            }
            return arrayList;
        }
        return null;
    }

    public static j gJ(String string) {
        int n2;
        if (string == null) {
            return j.ayn();
        }
        String[] stringArray = string.split(";", -1);
        int n3 = n2 = stringArray.length == 1 ? 0 : bt.w(stringArray[0], 0);
        if (n2 >= 0 && n2 <= 3) {
            List<k> list;
            j j2 = new j();
            int n4 = stringArray.length == 1 ? 0 : 1;
            if ((list = j.f(n2, stringArray[n4++])) != null && !list.isEmpty()) {
                j2.ayl().addAll(list);
                j2.aym();
                int n5 = net.minecraft.world.biome.j.dGg.dHo;
                if (n2 > 0 && stringArray.length > n4) {
                    n5 = bt.w(stringArray[n4++], n5);
                }
                j2.iw(n5);
                if (n2 > 0 && stringArray.length > n4) {
                    String[] stringArray2;
                    for (String string2 : stringArray2 = stringArray[n4++].toLowerCase().split(",")) {
                        String[] stringArray3 = string2.split("\\(", 2);
                        HashMap hashMap = Maps.newHashMap();
                        if (stringArray3[0].length() <= 0) continue;
                        j2.ayk().put(stringArray3[0], hashMap);
                        if (stringArray3.length <= 1 || !stringArray3[1].endsWith(")") || stringArray3[1].length() <= 1) continue;
                        String[] stringArray4 = stringArray3[1].substring(0, stringArray3[1].length() - 1).split(" ");
                        for (int i2 = 0; i2 < stringArray4.length; ++i2) {
                            String[] stringArray5 = stringArray4[i2].split("=", 2);
                            if (stringArray5.length != 2) continue;
                            hashMap.put(stringArray5[0], stringArray5[1]);
                        }
                    }
                } else {
                    j2.ayk().put("village", Maps.newHashMap());
                }
                return j2;
            }
            return j.ayn();
        }
        return j.ayn();
    }

    public static j ayn() {
        j j2 = new j();
        j2.iw(net.minecraft.world.biome.j.dGg.dHo);
        j2.ayl().add(new k(1, Blocks.cLj));
        j2.ayl().add(new k(2, Blocks.cLf));
        j2.ayl().add(new k(1, Blocks.cLe));
        j2.aym();
        j2.ayk().put("village", Maps.newHashMap());
        return j2;
    }
}

