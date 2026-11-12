/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.ahg;
import hackclient.rise.s;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public final class z
extends s {
    public z() {
        super("command.help.description", "help", "?");
    }

    @Override
    public void execute(String[] stringArray) {
        a.a.i().aQ().forEach(s2 -> afl.b(StringUtils.capitalize((String)s2.getExpressions()[0]) + " " + Arrays.toString(s2.getExpressions()) + " \u00a78\u00bb \u00a77" + ahg.cf(s2.getDescription()), new Object[0]));
    }
}

