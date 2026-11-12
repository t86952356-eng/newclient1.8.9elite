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
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;

class LogManager$1
implements Logger {
    LogManager$1() {
    }

    @Override
    public void error(String string) {
        System.out.println("Error: " + string);
    }

    @Override
    public void error(String string, Object ... objectArray) {
    }

    @Override
    public void error(String string, Throwable throwable) {
        System.out.println("Error: " + string + " with throwable: " + String.valueOf(throwable));
    }

    @Override
    public void error(Marker marker, String string, Object object) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void error(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void error(String string, Object object) {
    }

    @Override
    public void error(String string, Object object, Object object2) {
    }

    @Override
    public void error(String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void error(String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void error(String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void error(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void error(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void error(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void error(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void error(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void exit() {
    }

    @Override
    public <R> R exit(R r2) {
        return null;
    }

    @Override
    public void fatal(Marker marker, Message message) {
    }

    @Override
    public void fatal(Marker marker, Message message, Throwable throwable) {
    }

    @Override
    public void fatal(Marker marker, CharSequence charSequence) {
    }

    @Override
    public void fatal(Marker marker, CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void fatal(Marker marker, Object object) {
    }

    @Override
    public void fatal(Marker marker, Object object, Throwable throwable) {
    }

    @Override
    public void fatal(Marker marker, String string) {
    }

    @Override
    public void fatal(Marker marker, String string, Object ... objectArray) {
    }

    @Override
    public void fatal(Marker marker, String string, Throwable throwable) {
    }

    @Override
    public void fatal(Message message) {
    }

    @Override
    public void fatal(Message message, Throwable throwable) {
    }

    @Override
    public void fatal(CharSequence charSequence) {
    }

    @Override
    public void fatal(CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void fatal(Object object) {
    }

    @Override
    public void fatal(Object object, Throwable throwable) {
    }

    @Override
    public void warn(String string) {
        System.out.println("Warning: " + string);
    }

    @Override
    public void warn(String string, Object ... objectArray) {
    }

    @Override
    public void warn(String string, Throwable throwable) {
    }

    @Override
    public void warn(Marker marker, String string, Object object) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void warn(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void warn(String string, Object object) {
    }

    @Override
    public void warn(String string, Object object, Object object2) {
    }

    @Override
    public void warn(String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void warn(String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void warn(String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void warn(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void warn(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void warn(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void warn(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void warn(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void info(String string) {
        System.out.println("Info: " + string);
    }

    @Override
    public void info(String string, Object ... objectArray) {
    }

    @Override
    public void info(String string, Throwable throwable) {
        System.out.println("Info: " + string + " with throwable: " + String.valueOf(throwable));
    }

    @Override
    public void info(Marker marker, String string, Object object) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void info(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void info(String string, Object object) {
    }

    @Override
    public void info(String string, Object object, Object object2) {
    }

    @Override
    public void info(String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void info(String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void info(String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void info(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void info(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void info(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void info(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void info(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return false;
    }

    @Override
    public boolean isEnabled(Level level) {
        return false;
    }

    @Override
    public boolean isEnabled(Level level, Marker marker) {
        return false;
    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return false;
    }

    @Override
    public boolean isFatalEnabled() {
        return false;
    }

    @Override
    public boolean isFatalEnabled(Marker marker) {
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return false;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return false;
    }

    @Override
    public void log(Level level, Marker marker, Message message) {
    }

    @Override
    public void log(Level level, Marker marker, Message message, Throwable throwable) {
    }

    @Override
    public void log(Level level, Marker marker, CharSequence charSequence) {
    }

    @Override
    public void log(Level level, Marker marker, CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void log(Level level, Marker marker, Object object) {
    }

    @Override
    public void log(Level level, Marker marker, Object object, Throwable throwable) {
    }

    @Override
    public void log(Level level, Marker marker, String string) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object ... objectArray) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Throwable throwable) {
    }

    @Override
    public void log(Level level, Message message) {
    }

    @Override
    public void log(Level level, Message message, Throwable throwable) {
    }

    @Override
    public void log(Level level, CharSequence charSequence) {
    }

    @Override
    public void log(Level level, CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void log(Level level, Object object) {
    }

    @Override
    public void log(Level level, Object object, Throwable throwable) {
    }

    @Override
    public void catching(Level level, Throwable throwable) {
    }

    @Override
    public void catching(Throwable throwable) {
    }

    @Override
    public void debug(Marker marker, Message message) {
    }

    @Override
    public void debug(Marker marker, Message message, Throwable throwable) {
    }

    @Override
    public void debug(Marker marker) {
    }

    @Override
    public void debug(Marker marker, Throwable throwable) {
    }

    @Override
    public void debug(Marker marker, CharSequence charSequence) {
    }

    @Override
    public void debug(Marker marker, CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void debug(Marker marker, Object object) {
    }

    @Override
    public void debug(Marker marker, Object object, Throwable throwable) {
    }

    @Override
    public void debug(Marker marker, String string) {
    }

    @Override
    public void debug(Marker marker, String string, Object ... objectArray) {
    }

    @Override
    public void debug(Marker marker, String string, Throwable throwable) {
    }

    @Override
    public void debug(Message message) {
    }

    @Override
    public void debug(Message message, Throwable throwable) {
    }

    @Override
    public void debug(CharSequence charSequence) {
    }

    @Override
    public void debug(CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void debug(Object object) {
    }

    @Override
    public void debug(Object object, Throwable throwable) {
    }

    @Override
    public void debug(String string) {
        System.out.println("Debug: " + string);
    }

    @Override
    public void debug(String string, Object ... objectArray) {
    }

    @Override
    public void debug(String string, Throwable throwable) {
    }

    @Override
    public void debug(Marker marker, String string, Object object) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void debug(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void debug(String string, Object object) {
    }

    @Override
    public void debug(String string, Object object, Object object2) {
    }

    @Override
    public void debug(String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void debug(String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void debug(String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void debug(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void debug(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void debug(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void debug(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void debug(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void entry() {
    }

    @Override
    public void entry(Object ... objectArray) {
    }

    @Override
    public void error(Marker marker, Message message) {
    }

    @Override
    public void error(Marker marker, Message message, Throwable throwable) {
    }

    @Override
    public void error(Marker marker, CharSequence charSequence) {
    }

    @Override
    public void error(Marker marker, CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void error(Marker marker, Object object) {
    }

    @Override
    public void error(Marker marker, Object object, Throwable throwable) {
    }

    @Override
    public void error(Marker marker, String string) {
    }

    @Override
    public void error(Marker marker, String string, Object ... objectArray) {
    }

    @Override
    public void error(Marker marker, String string, Throwable throwable) {
    }

    @Override
    public void error(Message message) {
    }

    @Override
    public void error(Message message, Throwable throwable) {
    }

    @Override
    public void error(CharSequence charSequence) {
    }

    @Override
    public void error(CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void error(Object object) {
    }

    @Override
    public void error(Object object, Throwable throwable) {
    }

    @Override
    public void trace(String string) {
        System.out.println("Trace: " + string);
    }

    @Override
    public void trace(String string, Object ... objectArray) {
    }

    @Override
    public void trace(String string, Throwable throwable) {
    }

    @Override
    public void trace(Marker marker, String string, Object object) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void trace(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void trace(String string, Object object) {
    }

    @Override
    public void trace(String string, Object object, Object object2) {
    }

    @Override
    public void trace(String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void trace(String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void trace(String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void trace(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void trace(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void trace(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void trace(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void trace(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void warn(Marker marker, Message message) {
    }

    @Override
    public void warn(Marker marker, Message message, Throwable throwable) {
    }

    @Override
    public void warn(Marker marker, CharSequence charSequence) {
    }

    @Override
    public void warn(Marker marker, CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void warn(Marker marker, Object object) {
    }

    @Override
    public void warn(Marker marker, Object object, Throwable throwable) {
    }

    @Override
    public void warn(Marker marker, String string) {
    }

    @Override
    public void warn(Marker marker, String string, Object ... objectArray) {
    }

    @Override
    public void warn(Marker marker, String string, Throwable throwable) {
    }

    @Override
    public void warn(Message message) {
    }

    @Override
    public void warn(Message message, Throwable throwable) {
    }

    @Override
    public void warn(CharSequence charSequence) {
    }

    @Override
    public void warn(CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void warn(Object object) {
    }

    @Override
    public void warn(Object object, Throwable throwable) {
    }

    @Override
    public void fatal(String string) {
        System.out.println("Fatal: " + string);
    }

    @Override
    public void fatal(String string, Object ... objectArray) {
    }

    @Override
    public void fatal(String string, Throwable throwable) {
        System.out.println("Fatal: " + string + " with throwable: " + String.valueOf(throwable));
        throwable.printStackTrace();
    }

    @Override
    public void fatal(Marker marker, String string, Object object) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void fatal(Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void fatal(String string, Object object) {
    }

    @Override
    public void fatal(String string, Object object, Object object2) {
    }

    @Override
    public void fatal(String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void fatal(String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void fatal(String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void fatal(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void fatal(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void fatal(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void fatal(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void fatal(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void info(Marker marker, Message message) {
    }

    @Override
    public void info(Marker marker, Message message, Throwable throwable) {
    }

    @Override
    public void info(Marker marker, CharSequence charSequence) {
    }

    @Override
    public void info(Marker marker, CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void info(Marker marker, Object object) {
    }

    @Override
    public void info(Marker marker, Object object, Throwable throwable) {
    }

    @Override
    public void info(Marker marker, String string) {
    }

    @Override
    public void info(Marker marker, String string, Object ... objectArray) {
    }

    @Override
    public void info(Marker marker, String string, Throwable throwable) {
    }

    @Override
    public void info(Message message) {
    }

    @Override
    public void info(Message message, Throwable throwable) {
    }

    @Override
    public void info(CharSequence charSequence) {
    }

    @Override
    public void info(CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void info(Object object) {
    }

    @Override
    public void info(Object object, Throwable throwable) {
    }

    @Override
    public void log(Level level, String string) {
        System.out.println("Logging message: " + string + " with level: " + String.valueOf(level));
    }

    @Override
    public void log(Level level, String string, Object ... objectArray) {
    }

    @Override
    public void log(Level level, String string, Throwable throwable) {
        System.out.println("Logging message: " + string + " with level: " + String.valueOf(level) + " and throwable: " + String.valueOf(throwable));
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void log(Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void log(Level level, String string, Object object) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2, Object object3) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2, Object object3, Object object4) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
    }

    @Override
    public void log(Level level, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
    }

    @Override
    public void printf(Level level, Marker marker, String string, Object ... objectArray) {
    }

    @Override
    public void printf(Level level, String string, Object ... objectArray) {
    }

    @Override
    public <T extends Throwable> T throwing(Level level, T t2) {
        return null;
    }

    @Override
    public <T extends Throwable> T throwing(T t2) {
        return null;
    }

    @Override
    public void trace(Marker marker, Message message) {
    }

    @Override
    public void trace(Marker marker, Message message, Throwable throwable) {
    }

    @Override
    public void trace(Marker marker, CharSequence charSequence) {
    }

    @Override
    public void trace(Marker marker, CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void trace(Marker marker, Object object) {
    }

    @Override
    public void trace(Marker marker, Object object, Throwable throwable) {
    }

    @Override
    public void trace(Marker marker, String string) {
    }

    @Override
    public void trace(Marker marker, String string, Object ... objectArray) {
    }

    @Override
    public void trace(Marker marker, String string, Throwable throwable) {
    }

    @Override
    public void trace(Message message) {
    }

    @Override
    public void trace(Message message, Throwable throwable) {
    }

    @Override
    public void trace(CharSequence charSequence) {
    }

    @Override
    public void trace(CharSequence charSequence, Throwable throwable) {
    }

    @Override
    public void trace(Object object) {
    }

    @Override
    public void trace(Object object, Throwable throwable) {
    }
}

