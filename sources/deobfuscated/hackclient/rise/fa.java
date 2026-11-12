/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.di;
import lombok.Generated;

public final class fa
implements di {
    public String ip;
    public int port;

    @Generated
    public String getIp() {
        return this.ip;
    }

    @Generated
    public int getPort() {
        return this.port;
    }

    @Generated
    public fa(String string, int n2) {
        this.ip = string;
        this.port = n2;
    }
}

