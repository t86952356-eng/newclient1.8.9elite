/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.sun.tools.attach.VirtualMachine;
import hackclient.rise.aam;
import hackclient.rise.aan;
import java.util.Arrays;

public final class aau
extends aam {
    private static final String[] axI = new String[]{"dump", "packetlog", "logger", "recaf", "jbyte", "bytecode", "decompile", "log"};

    public aau() {
        super(aan.axB, false);
    }

    @Override
    public boolean on() {
        return VirtualMachine.list().stream().anyMatch(virtualMachineDescriptor -> {
            String string = virtualMachineDescriptor.displayName().toLowerCase().trim();
            return Arrays.stream(axI).anyMatch(string::contains);
        });
    }
}

