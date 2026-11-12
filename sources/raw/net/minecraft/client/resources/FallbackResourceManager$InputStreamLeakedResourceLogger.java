/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.util.cm;

class FallbackResourceManager$InputStreamLeakedResourceLogger
extends InputStream {
    private final InputStream ccM;
    private final String ccN;
    private boolean ccO = false;

    public FallbackResourceManager$InputStreamLeakedResourceLogger(InputStream inputStream, cm cm2, String string) {
        this.ccM = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.ccN = "Leaked resource: '" + String.valueOf(cm2) + "' loaded from pack: '" + string + "'\n" + String.valueOf(byteArrayOutputStream);
    }

    @Override
    public void close() {
        this.ccM.close();
        this.ccO = true;
    }

    protected void finalize() {
        if (!this.ccO) {
            FallbackResourceManager.ccJ.warn(this.ccN);
        }
        super.finalize();
    }

    @Override
    public int read() {
        return this.ccM.read();
    }
}

