/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.afl;
import lombok.Generated;
import rise.util.InstanceAccess;

public abstract class s
implements InstanceAccess {
    private final String description;
    private final String[] expressions;

    public s(String string, String ... stringArray) {
        this.description = string;
        this.expressions = stringArray;
    }

    public abstract void execute(String[] var1);

    protected final void error() {
        afl.b("\u00a7cInvalid command arguments.", new Object[0]);
    }

    protected final void error(String string) {
        this.error();
        afl.b("Correct Usage: " + string, new Object[0]);
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public String[] getExpressions() {
        return this.expressions;
    }
}

