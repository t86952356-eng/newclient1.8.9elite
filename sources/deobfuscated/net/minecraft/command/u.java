/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.command;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.command.a;
import net.minecraft.command.ad;
import net.minecraft.command.au;
import net.minecraft.command.av;
import net.minecraft.command.aw;
import net.minecraft.command.az;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.util.an;
import net.minecraft.util.b;
import net.minecraft.util.t;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class u
implements av {
    private static final Logger cnW = LogManager.getLogger();
    private final Map<String, au> cnX = Maps.newHashMap();
    private final Set<au> cnY = Sets.newHashSet();

    @Override
    public int i(aw aw2, String string) {
        if ((string = string.trim()).startsWith("/")) {
            string = string.substring(1);
        }
        String[] stringArray = string.split(" ");
        String string2 = stringArray[0];
        stringArray = u.i(stringArray);
        au au2 = this.cnX.get(string2);
        int n2 = this.a(au2, stringArray);
        int n3 = 0;
        if (au2 == null) {
            t t2 = new t("commands.generic.notFound", new Object[0]);
            t2.arp().b(an.dvX);
            aw2.a(t2);
        } else if (au2.a(aw2)) {
            if (n2 > -1) {
                List<c> list = az.c(aw2, stringArray[n2], c.class);
                String string3 = stringArray[n2];
                aw2.a(ad.coh, list.size());
                for (c c2 : list) {
                    stringArray[n2] = c2.Ul().toString();
                    if (!this.a(aw2, stringArray, au2, string)) continue;
                    ++n3;
                }
                stringArray[n2] = string3;
            } else {
                aw2.a(ad.coh, 1);
                if (this.a(aw2, stringArray, au2, string)) {
                    ++n3;
                }
            }
        } else {
            t t3 = new t("commands.generic.permission", new Object[0]);
            t3.arp().b(an.dvX);
            aw2.a(t3);
        }
        aw2.a(ad.cof, n3);
        return n3;
    }

    protected boolean a(aw aw2, String[] stringArray, au au2, String string) {
        try {
            au2.a(aw2, stringArray);
            return true;
        }
        catch (bo bo2) {
            t t2 = new t("commands.generic.usage", new t(bo2.getMessage(), bo2.Sc()));
            t2.arp().b(an.dvX);
            aw2.a(t2);
        }
        catch (n n2) {
            t t3 = new t(n2.getMessage(), n2.Sc());
            t3.arp().b(an.dvX);
            aw2.a(t3);
        }
        catch (Throwable throwable) {
            t t4 = new t("commands.generic.exception", new Object[0]);
            t4.arp().b(an.dvX);
            aw2.a(t4);
            cnW.warn("Couldn't process command: '" + string + "'");
        }
        return false;
    }

    public au b(au au2) {
        this.cnX.put(au2.RX(), au2);
        this.cnY.add(au2);
        for (String string : au2.RT()) {
            au au3 = this.cnX.get(string);
            if (au3 != null && au3.RX().equals(string)) continue;
            this.cnX.put(string, au2);
        }
        return au2;
    }

    private static String[] i(String[] stringArray) {
        String[] stringArray2 = new String[stringArray.length - 1];
        System.arraycopy(stringArray, 1, stringArray2, 0, stringArray.length - 1);
        return stringArray2;
    }

    @Override
    public List<String> a(aw aw2, String string, b b2) {
        au au2;
        String[] stringArray = string.split(" ", -1);
        String string2 = stringArray[0];
        if (stringArray.length == 1) {
            ArrayList arrayList = Lists.newArrayList();
            for (Map.Entry<String, au> entry : this.cnX.entrySet()) {
                if (!a.N(string2, entry.getKey()) || !entry.getValue().a(aw2)) continue;
                arrayList.add(entry.getKey());
            }
            return arrayList;
        }
        if (stringArray.length > 1 && (au2 = this.cnX.get(string2)) != null && au2.a(aw2)) {
            return au2.a(aw2, u.i(stringArray), b2);
        }
        return null;
    }

    @Override
    public List<au> d(aw aw2) {
        ArrayList arrayList = Lists.newArrayList();
        for (au au2 : this.cnY) {
            if (!au2.a(aw2)) continue;
            arrayList.add(au2);
        }
        return arrayList;
    }

    @Override
    public Map<String, au> Sk() {
        return this.cnX;
    }

    private int a(au au2, String[] stringArray) {
        if (au2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (!au2.d(stringArray, i2) || !az.dT(stringArray[i2])) continue;
            return i2;
        }
        return -1;
    }
}

