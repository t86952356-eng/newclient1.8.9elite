/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.util;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.util.c;

public class b
extends IOException {
    private final List<c> cnB = Lists.newArrayList();
    private final String cnC;

    public b(String string) {
        this.cnB.add(new c());
        this.cnC = string;
    }

    public b(String string, Throwable throwable) {
        super(throwable);
        this.cnB.add(new c());
        this.cnC = string;
    }

    public void dJ(String string) {
        this.cnB.get(0).dL(string);
    }

    public void dK(String string) {
        this.cnB.get((int)0).cnD = string;
        this.cnB.add(0, new c());
    }

    @Override
    public String getMessage() {
        return "Invalid " + this.cnB.get(this.cnB.size() - 1).toString() + ": " + this.cnC;
    }

    public static b a(Exception exception) {
        if (exception instanceof b) {
            return (b)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new b(string, exception);
    }
}

