/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 */
package net.minecraft.nbt;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.util.regex.Pattern;
import net.minecraft.nbt.c;
import net.minecraft.nbt.g;
import net.minecraft.nbt.l;
import net.minecraft.nbt.q;
import net.minecraft.nbt.s;
import net.minecraft.nbt.t;
import net.minecraft.nbt.u;
import net.minecraft.nbt.w;
import net.minecraft.nbt.y;
import net.minecraft.nbt.z;

class f
extends c {
    private static final Pattern cXP = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[d|D]");
    private static final Pattern cXQ = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[f|F]");
    private static final Pattern cXR = Pattern.compile("[-+]?[0-9]+[b|B]");
    private static final Pattern cXS = Pattern.compile("[-+]?[0-9]+[l|L]");
    private static final Pattern cXT = Pattern.compile("[-+]?[0-9]+[s|S]");
    private static final Pattern cXU = Pattern.compile("[-+]?[0-9]+");
    private static final Pattern cXV = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");
    private static final Splitter cXW = Splitter.on((char)',').omitEmptyStrings();
    protected String cXX;

    public f(String string, String string2) {
        this.cXM = string;
        this.cXX = string2;
    }

    @Override
    public g aeE() {
        try {
            if (cXP.matcher(this.cXX).matches()) {
                return new q(Double.parseDouble(this.cXX.substring(0, this.cXX.length() - 1)));
            }
            if (cXQ.matcher(this.cXX).matches()) {
                return new s(Float.parseFloat(this.cXX.substring(0, this.cXX.length() - 1)));
            }
            if (cXR.matcher(this.cXX).matches()) {
                return new l(Byte.parseByte(this.cXX.substring(0, this.cXX.length() - 1)));
            }
            if (cXS.matcher(this.cXX).matches()) {
                return new w(Long.parseLong(this.cXX.substring(0, this.cXX.length() - 1)));
            }
            if (cXT.matcher(this.cXX).matches()) {
                return new y(Short.parseShort(this.cXX.substring(0, this.cXX.length() - 1)));
            }
            if (cXU.matcher(this.cXX).matches()) {
                return new t(Integer.parseInt(this.cXX));
            }
            if (cXV.matcher(this.cXX).matches()) {
                return new q(Double.parseDouble(this.cXX));
            }
            if (this.cXX.equalsIgnoreCase("true") || this.cXX.equalsIgnoreCase("false")) {
                return new l((byte)(Boolean.parseBoolean(this.cXX) ? 1 : 0));
            }
        }
        catch (NumberFormatException numberFormatException) {
            this.cXX = this.cXX.replaceAll("\\\\\"", "\"");
            return new z(this.cXX);
        }
        if (this.cXX.startsWith("[") && this.cXX.endsWith("]")) {
            String string = this.cXX.substring(1, this.cXX.length() - 1);
            String[] stringArray = (String[])Iterables.toArray((Iterable)cXW.split((CharSequence)string), String.class);
            try {
                int[] nArray = new int[stringArray.length];
                for (int i2 = 0; i2 < stringArray.length; ++i2) {
                    nArray[i2] = Integer.parseInt(stringArray[i2].trim());
                }
                return new u(nArray);
            }
            catch (NumberFormatException numberFormatException) {
                return new z(this.cXX);
            }
        }
        if (this.cXX.startsWith("\"") && this.cXX.endsWith("\"")) {
            this.cXX = this.cXX.substring(1, this.cXX.length() - 1);
        }
        this.cXX = this.cXX.replaceAll("\\\\\"", "\"");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < this.cXX.length(); ++i3) {
            if (i3 < this.cXX.length() - 1 && this.cXX.charAt(i3) == '\\' && this.cXX.charAt(i3 + 1) == '\\') {
                stringBuilder.append('\\');
                ++i3;
                continue;
            }
            stringBuilder.append(this.cXX.charAt(i3));
        }
        return new z(stringBuilder.toString());
    }
}

