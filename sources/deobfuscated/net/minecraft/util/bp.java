/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bp
extends PrintStream {
    private static final Logger dyD = LogManager.getLogger();
    private final String dyE;

    public bp(String string, OutputStream outputStream) {
        super(outputStream);
        this.dyE = string;
    }

    @Override
    public void println(String string) {
        this.gj(string);
    }

    @Override
    public void println(Object object) {
        this.gj(String.valueOf(object));
    }

    private void gj(String string) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTraceElementArray[Math.min(3, stackTraceElementArray.length)];
        dyD.info("[{}]@.({}:{}): {}", new Object[]{this.dyE, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), string});
    }
}

