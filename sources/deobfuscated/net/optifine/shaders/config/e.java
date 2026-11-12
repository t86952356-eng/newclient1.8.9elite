/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.src.a;
import net.optifine.expr.d;
import net.optifine.expr.f;
import net.optifine.expr.l;
import net.optifine.expr.m;
import net.optifine.expr.o;
import net.optifine.expr.q;
import net.optifine.expr.u;
import net.optifine.shaders.config.c;

public class e {
    private boolean dj = true;
    private final Deque<Boolean> eGb = new ArrayDeque<Boolean>();
    private final Deque<Boolean> eGc = new ArrayDeque<Boolean>();
    private final Map<String, String> eGd = new HashMap<String, String>();
    private static final Pattern eGe = Pattern.compile("\\s*#\\s*(\\w+)\\s*(.*)");
    private static final Pattern eGf = Pattern.compile("defined\\s+(\\w+)");
    private static final Pattern eGg = Pattern.compile("defined\\s*\\(\\s*(\\w+)\\s*\\)");
    private static final Pattern eGh = Pattern.compile("(\\w+)");
    private static final String eGi = "define";
    private static final String eGj = "undef";
    private static final String eGk = "ifdef";
    private static final String eGl = "ifndef";
    private static final String eGm = "if";
    private static final String eGn = "else";
    private static final String eGo = "elif";
    private static final String eGp = "endif";
    private static final List<String> eGq = Arrays.asList("define", "undef", "ifdef", "ifndef", "if", "else", "elif", "endif");

    public boolean jb(String string) {
        Matcher matcher = eGe.matcher(string);
        if (!matcher.matches()) {
            return this.dj;
        }
        String string2 = matcher.group(1);
        String string3 = matcher.group(2);
        int n2 = string3.indexOf("//");
        if (n2 >= 0) {
            string3 = string3.substring(0, n2);
        }
        boolean bl2 = this.dj;
        this.al(string2, string3);
        this.dj = !this.eGb.contains(Boolean.FALSE);
        return this.dj || bl2;
    }

    public static boolean jc(String string) {
        Matcher matcher = eGe.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        String string2 = matcher.group(1);
        return eGq.contains(string2);
    }

    private void al(String string, String string2) {
        String string3;
        StringTokenizer stringTokenizer = new StringTokenizer(string2, " \t");
        String string4 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
        String string5 = string3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken("").trim() : "";
        if (string.equals(eGi)) {
            this.eGd.put(string4, string3);
        } else if (string.equals(eGj)) {
            this.eGd.remove(string4);
        } else if (string.equals(eGk)) {
            boolean bl2 = this.eGd.containsKey(string4);
            this.eGb.add(bl2);
            this.eGc.add(bl2);
        } else if (string.equals(eGl)) {
            boolean bl3 = !this.eGd.containsKey(string4);
            this.eGb.add(bl3);
            this.eGc.add(bl3);
        } else if (string.equals(eGm)) {
            boolean bl4 = this.jd(string2);
            this.eGb.add(bl4);
            this.eGc.add(bl4);
        } else if (!this.eGb.isEmpty()) {
            if (string.equals(eGo)) {
                boolean bl5 = this.eGb.removeLast();
                boolean bl6 = this.eGc.removeLast();
                if (bl6) {
                    this.eGb.add(false);
                    this.eGc.add(bl6);
                } else {
                    boolean bl7 = this.jd(string2);
                    this.eGb.add(bl7);
                    this.eGc.add(bl7);
                }
            } else if (string.equals(eGn)) {
                boolean bl8 = this.eGb.removeLast();
                boolean bl9 = this.eGc.removeLast();
                boolean bl10 = !bl9;
                this.eGb.add(bl10);
                this.eGc.add(true);
            } else if (string.equals(eGp)) {
                this.eGb.removeLast();
                this.eGc.removeLast();
            }
        }
    }

    private boolean jd(String object) {
        int n2;
        Object object2;
        Object object3;
        Object object4;
        Matcher matcher = eGf.matcher((CharSequence)object);
        object = matcher.replaceAll("defined_$1");
        Matcher matcher2 = eGg.matcher((CharSequence)object);
        object = matcher2.replaceAll("defined_$1");
        boolean bl3 = false;
        int n3 = 0;
        block2: do {
            bl3 = false;
            object4 = eGh.matcher((CharSequence)object);
            while (((Matcher)object4).find()) {
                char c2;
                object3 = ((Matcher)object4).group();
                if (((String)object3).length() <= 0 || !Character.isLetter(c2 = ((String)object3).charAt(0)) && c2 != '_' || !this.eGd.containsKey(object3)) continue;
                object2 = this.eGd.get(object3);
                if (object2 == null) {
                    object2 = "1";
                }
                n2 = ((Matcher)object4).start();
                int bl2 = ((Matcher)object4).end();
                object = ((String)object).substring(0, n2) + " " + (String)object2 + " " + ((String)object).substring(bl2);
                bl3 = true;
                ++n3;
                continue block2;
            }
        } while (bl3 && n3 < 100);
        if (n3 >= 100) {
            a.warn("Too many iterations: " + n3 + ", when resolving: " + (String)object);
            return true;
        }
        try {
            object4 = new c(this.eGd);
            object3 = new d((q)object4);
            l l2 = ((d)object3).ih((String)object);
            if (l2.aCq() == f.ehQ) {
                object2 = (m)l2;
                n2 = object2.aCt() ? 1 : 0;
                return n2 != 0;
            }
            if (l2.aCq() == f.ehO) {
                object2 = (o)l2;
                float f2 = object2.aCr();
                boolean bl2 = f2 != 0.0f;
                return bl2;
            }
            throw new u("Not a boolean or float expression: " + String.valueOf((Object)l2.aCq()));
        }
        catch (u u2) {
            a.warn("Invalid macro expression: " + (String)object);
            a.warn("Error: " + u2.getMessage());
            return false;
        }
    }
}

