/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;
import net.optifine.expr.u;
import net.optifine.expr.w;
import net.optifine.expr.y;

public class x {
    public static w[] ij(String string) {
        StringReader stringReader = new StringReader(string);
        PushbackReader pushbackReader = new PushbackReader(stringReader);
        ArrayList<w> arrayList = new ArrayList<w>();
        while (true) {
            int n2;
            if ((n2 = pushbackReader.read()) < 0) {
                w[] wArray = arrayList.toArray(new w[arrayList.size()]);
                return wArray;
            }
            char c2 = (char)n2;
            if (Character.isWhitespace(c2)) continue;
            y y2 = y.p(c2);
            if (y2 == null) {
                throw new u("Invalid character: '" + c2 + "', in: " + string);
            }
            w w2 = x.a(c2, y2, pushbackReader);
            arrayList.add(w2);
        }
    }

    private static w a(char c2, y y2, PushbackReader pushbackReader) {
        int n2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c2);
        while ((n2 = pushbackReader.read()) >= 0) {
            char c3 = (char)n2;
            if (!y2.q(c3)) {
                pushbackReader.unread(c3);
                break;
            }
            stringBuffer.append(c3);
        }
        return new w(y2, stringBuffer.toString());
    }
}

