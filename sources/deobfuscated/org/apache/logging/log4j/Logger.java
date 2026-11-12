/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Level
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.message.Message
 */
package org.apache.logging.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;

public interface Logger {
    public void catching(Level var1, Throwable var2);

    public void catching(Throwable var1);

    public void debug(Marker var1, Message var2);

    public void debug(Marker var1, Message var2, Throwable var3);

    public void debug(Marker var1);

    public void debug(Marker var1, Throwable var2);

    public void debug(Marker var1, CharSequence var2);

    public void debug(Marker var1, CharSequence var2, Throwable var3);

    public void debug(Marker var1, Object var2);

    public void debug(Marker var1, Object var2, Throwable var3);

    public void debug(Marker var1, String var2);

    public void debug(Marker var1, String var2, Object ... var3);

    public void debug(Marker var1, String var2, Throwable var3);

    public void debug(Message var1);

    public void debug(Message var1, Throwable var2);

    public void debug(CharSequence var1);

    public void debug(CharSequence var1, Throwable var2);

    public void debug(Object var1);

    public void debug(Object var1, Throwable var2);

    public void debug(String var1);

    public void debug(String var1, Object ... var2);

    public void debug(String var1, Throwable var2);

    public void debug(Marker var1, String var2, Object var3);

    public void debug(Marker var1, String var2, Object var3, Object var4);

    public void debug(Marker var1, String var2, Object var3, Object var4, Object var5);

    public void debug(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6);

    public void debug(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void debug(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void debug(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void debug(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void debug(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void debug(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12);

    public void debug(String var1, Object var2);

    public void debug(String var1, Object var2, Object var3);

    public void debug(String var1, Object var2, Object var3, Object var4);

    public void debug(String var1, Object var2, Object var3, Object var4, Object var5);

    public void debug(String var1, Object var2, Object var3, Object var4, Object var5, Object var6);

    public void debug(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void debug(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void debug(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void debug(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void debug(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    @Deprecated
    public void entry();

    @Deprecated
    public void entry(Object ... var1);

    public void error(Marker var1, Message var2);

    public void error(Marker var1, Message var2, Throwable var3);

    public void error(Marker var1, CharSequence var2);

    public void error(Marker var1, CharSequence var2, Throwable var3);

    public void error(Marker var1, Object var2);

    public void error(Marker var1, Object var2, Throwable var3);

    public void error(Marker var1, String var2);

    public void error(Marker var1, String var2, Object ... var3);

    public void error(Marker var1, String var2, Throwable var3);

    public void error(Message var1);

    public void error(Message var1, Throwable var2);

    public void error(CharSequence var1);

    public void error(CharSequence var1, Throwable var2);

    public void error(Object var1);

    public void error(Object var1, Throwable var2);

    public void error(String var1);

    public void error(String var1, Object ... var2);

    public void error(String var1, Throwable var2);

    public void error(Marker var1, String var2, Object var3);

    public void error(Marker var1, String var2, Object var3, Object var4);

    public void error(Marker var1, String var2, Object var3, Object var4, Object var5);

    public void error(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6);

    public void error(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void error(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void error(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void error(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void error(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void error(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12);

    public void error(String var1, Object var2);

    public void error(String var1, Object var2, Object var3);

    public void error(String var1, Object var2, Object var3, Object var4);

    public void error(String var1, Object var2, Object var3, Object var4, Object var5);

    public void error(String var1, Object var2, Object var3, Object var4, Object var5, Object var6);

    public void error(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void error(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void error(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void error(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void error(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    @Deprecated
    public void exit();

    @Deprecated
    public <R> R exit(R var1);

    public void fatal(Marker var1, Message var2);

    public void fatal(Marker var1, Message var2, Throwable var3);

    public void fatal(Marker var1, CharSequence var2);

    public void fatal(Marker var1, CharSequence var2, Throwable var3);

    public void fatal(Marker var1, Object var2);

    public void fatal(Marker var1, Object var2, Throwable var3);

    public void fatal(Marker var1, String var2);

    public void fatal(Marker var1, String var2, Object ... var3);

    public void fatal(Marker var1, String var2, Throwable var3);

    public void fatal(Message var1);

    public void fatal(Message var1, Throwable var2);

    public void fatal(CharSequence var1);

    public void fatal(CharSequence var1, Throwable var2);

    public void fatal(Object var1);

    public void fatal(Object var1, Throwable var2);

    public void fatal(String var1);

    public void fatal(String var1, Object ... var2);

    public void fatal(String var1, Throwable var2);

    public void fatal(Marker var1, String var2, Object var3);

    public void fatal(Marker var1, String var2, Object var3, Object var4);

    public void fatal(Marker var1, String var2, Object var3, Object var4, Object var5);

    public void fatal(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6);

    public void fatal(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void fatal(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void fatal(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void fatal(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void fatal(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void fatal(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12);

    public void fatal(String var1, Object var2);

    public void fatal(String var1, Object var2, Object var3);

    public void fatal(String var1, Object var2, Object var3, Object var4);

    public void fatal(String var1, Object var2, Object var3, Object var4, Object var5);

    public void fatal(String var1, Object var2, Object var3, Object var4, Object var5, Object var6);

    public void fatal(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void fatal(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void fatal(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void fatal(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void fatal(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void info(Marker var1, Message var2);

    public void info(Marker var1, Message var2, Throwable var3);

    public void info(Marker var1, CharSequence var2);

    public void info(Marker var1, CharSequence var2, Throwable var3);

    public void info(Marker var1, Object var2);

    public void info(Marker var1, Object var2, Throwable var3);

    public void info(Marker var1, String var2);

    public void info(Marker var1, String var2, Object ... var3);

    public void info(Marker var1, String var2, Throwable var3);

    public void info(Message var1);

    public void info(Message var1, Throwable var2);

    public void info(CharSequence var1);

    public void info(CharSequence var1, Throwable var2);

    public void info(Object var1);

    public void info(Object var1, Throwable var2);

    public void info(String var1);

    public void info(String var1, Object ... var2);

    public void info(String var1, Throwable var2);

    public void info(Marker var1, String var2, Object var3);

    public void info(Marker var1, String var2, Object var3, Object var4);

    public void info(Marker var1, String var2, Object var3, Object var4, Object var5);

    public void info(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6);

    public void info(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void info(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void info(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void info(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void info(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void info(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12);

    public void info(String var1, Object var2);

    public void info(String var1, Object var2, Object var3);

    public void info(String var1, Object var2, Object var3, Object var4);

    public void info(String var1, Object var2, Object var3, Object var4, Object var5);

    public void info(String var1, Object var2, Object var3, Object var4, Object var5, Object var6);

    public void info(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void info(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void info(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void info(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void info(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public boolean isDebugEnabled();

    public boolean isDebugEnabled(Marker var1);

    public boolean isEnabled(Level var1);

    public boolean isEnabled(Level var1, Marker var2);

    public boolean isErrorEnabled();

    public boolean isErrorEnabled(Marker var1);

    public boolean isFatalEnabled();

    public boolean isFatalEnabled(Marker var1);

    public boolean isInfoEnabled();

    public boolean isInfoEnabled(Marker var1);

    public boolean isTraceEnabled();

    public boolean isTraceEnabled(Marker var1);

    public boolean isWarnEnabled();

    public boolean isWarnEnabled(Marker var1);

    public void log(Level var1, Marker var2, Message var3);

    public void log(Level var1, Marker var2, Message var3, Throwable var4);

    public void log(Level var1, Marker var2, CharSequence var3);

    public void log(Level var1, Marker var2, CharSequence var3, Throwable var4);

    public void log(Level var1, Marker var2, Object var3);

    public void log(Level var1, Marker var2, Object var3, Throwable var4);

    public void log(Level var1, Marker var2, String var3);

    public void log(Level var1, Marker var2, String var3, Object ... var4);

    public void log(Level var1, Marker var2, String var3, Throwable var4);

    public void log(Level var1, Message var2);

    public void log(Level var1, Message var2, Throwable var3);

    public void log(Level var1, CharSequence var2);

    public void log(Level var1, CharSequence var2, Throwable var3);

    public void log(Level var1, Object var2);

    public void log(Level var1, Object var2, Throwable var3);

    public void log(Level var1, String var2);

    public void log(Level var1, String var2, Object ... var3);

    public void log(Level var1, String var2, Throwable var3);

    public void log(Level var1, Marker var2, String var3, Object var4);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5, Object var6);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5, Object var6, Object var7);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12);

    public void log(Level var1, Marker var2, String var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12, Object var13);

    public void log(Level var1, String var2, Object var3);

    public void log(Level var1, String var2, Object var3, Object var4);

    public void log(Level var1, String var2, Object var3, Object var4, Object var5);

    public void log(Level var1, String var2, Object var3, Object var4, Object var5, Object var6);

    public void log(Level var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void log(Level var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void log(Level var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void log(Level var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void log(Level var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void log(Level var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12);

    public void printf(Level var1, Marker var2, String var3, Object ... var4);

    public void printf(Level var1, String var2, Object ... var3);

    public <T extends Throwable> T throwing(Level var1, T var2);

    public <T extends Throwable> T throwing(T var1);

    public void trace(Marker var1, Message var2);

    public void trace(Marker var1, Message var2, Throwable var3);

    public void trace(Marker var1, CharSequence var2);

    public void trace(Marker var1, CharSequence var2, Throwable var3);

    public void trace(Marker var1, Object var2);

    public void trace(Marker var1, Object var2, Throwable var3);

    public void trace(Marker var1, String var2);

    public void trace(Marker var1, String var2, Object ... var3);

    public void trace(Marker var1, String var2, Throwable var3);

    public void trace(Message var1);

    public void trace(Message var1, Throwable var2);

    public void trace(CharSequence var1);

    public void trace(CharSequence var1, Throwable var2);

    public void trace(Object var1);

    public void trace(Object var1, Throwable var2);

    public void trace(String var1);

    public void trace(String var1, Object ... var2);

    public void trace(String var1, Throwable var2);

    public void trace(Marker var1, String var2, Object var3);

    public void trace(Marker var1, String var2, Object var3, Object var4);

    public void trace(Marker var1, String var2, Object var3, Object var4, Object var5);

    public void trace(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6);

    public void trace(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void trace(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void trace(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void trace(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void trace(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void trace(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12);

    public void trace(String var1, Object var2);

    public void trace(String var1, Object var2, Object var3);

    public void trace(String var1, Object var2, Object var3, Object var4);

    public void trace(String var1, Object var2, Object var3, Object var4, Object var5);

    public void trace(String var1, Object var2, Object var3, Object var4, Object var5, Object var6);

    public void trace(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void trace(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void trace(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void trace(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void trace(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void warn(Marker var1, Message var2);

    public void warn(Marker var1, Message var2, Throwable var3);

    public void warn(Marker var1, CharSequence var2);

    public void warn(Marker var1, CharSequence var2, Throwable var3);

    public void warn(Marker var1, Object var2);

    public void warn(Marker var1, Object var2, Throwable var3);

    public void warn(Marker var1, String var2);

    public void warn(Marker var1, String var2, Object ... var3);

    public void warn(Marker var1, String var2, Throwable var3);

    public void warn(Message var1);

    public void warn(Message var1, Throwable var2);

    public void warn(CharSequence var1);

    public void warn(CharSequence var1, Throwable var2);

    public void warn(Object var1);

    public void warn(Object var1, Throwable var2);

    public void warn(String var1);

    public void warn(String var1, Object ... var2);

    public void warn(String var1, Throwable var2);

    public void warn(Marker var1, String var2, Object var3);

    public void warn(Marker var1, String var2, Object var3, Object var4);

    public void warn(Marker var1, String var2, Object var3, Object var4, Object var5);

    public void warn(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6);

    public void warn(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void warn(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void warn(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void warn(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void warn(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    public void warn(Marker var1, String var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11, Object var12);

    public void warn(String var1, Object var2);

    public void warn(String var1, Object var2, Object var3);

    public void warn(String var1, Object var2, Object var3, Object var4);

    public void warn(String var1, Object var2, Object var3, Object var4, Object var5);

    public void warn(String var1, Object var2, Object var3, Object var4, Object var5, Object var6);

    public void warn(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7);

    public void warn(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8);

    public void warn(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9);

    public void warn(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10);

    public void warn(String var1, Object var2, Object var3, Object var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10, Object var11);

    default public void logMessage(Level level, Marker marker, String string, StackTraceElement stackTraceElement, Message message, Throwable throwable) {
    }
}

