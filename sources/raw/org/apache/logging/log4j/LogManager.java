/*
 * Decompiled with CFR 0.152.
 */
package org.apache.logging.log4j;

import org.apache.logging.log4j.LogManager$1;
import org.apache.logging.log4j.Logger;

public class LogManager {
    public static Logger getLogger() {
        return new LogManager$1();
    }
}

