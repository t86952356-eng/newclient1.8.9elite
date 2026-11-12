/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.Callable;
import net.minecraft.client.multiplayer.e;

public class aij
implements Callable<Long> {
    private final SocketAddress aPu;

    public aij(String string) {
        e e2 = e.da(string);
        this.aPu = new InetSocketAddress(e2.HC(), e2.getPort());
    }

    public Long vu() {
        try {
            Socket socket = new Socket();
            long l2 = System.currentTimeMillis();
            socket.connect(this.aPu);
            socket.close();
            return System.currentTimeMillis() - l2;
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    @Override
    public /* synthetic */ Object call() {
        return this.vu();
    }
}

