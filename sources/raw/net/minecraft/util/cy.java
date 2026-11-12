/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import net.minecraft.util.cz;
import org.apache.logging.log4j.Logger;

public class cy {
    public static cz atP() {
        String string = System.getProperty("os.name").toLowerCase();
        return string.contains("win") ? cz.dAC : (string.contains("mac") ? cz.dAD : (string.contains("solaris") ? cz.dAB : (string.contains("sunos") ? cz.dAB : (string.contains("linux") ? cz.dAA : (string.contains("unix") ? cz.dAA : cz.dAE)))));
    }

    public static <V> V a(FutureTask<V> futureTask, Logger logger) {
        try {
            futureTask.run();
            return futureTask.get();
        }
        catch (ExecutionException executionException) {
            logger.fatal("Error executing task", (Throwable)executionException);
            if (executionException.getCause() instanceof OutOfMemoryError) {
                OutOfMemoryError outOfMemoryError = (OutOfMemoryError)executionException.getCause();
                throw outOfMemoryError;
            }
        }
        catch (InterruptedException interruptedException) {
            logger.fatal("Error executing task", (Throwable)interruptedException);
        }
        return null;
    }
}

