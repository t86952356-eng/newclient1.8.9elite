/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server.network;

final class NetHandlerLoginServer$LoginState
extends Enum<NetHandlerLoginServer$LoginState> {
    public static final /* enum */ NetHandlerLoginServer$LoginState dnz = new NetHandlerLoginServer$LoginState();
    public static final /* enum */ NetHandlerLoginServer$LoginState dnA = new NetHandlerLoginServer$LoginState();
    public static final /* enum */ NetHandlerLoginServer$LoginState dnB = new NetHandlerLoginServer$LoginState();
    public static final /* enum */ NetHandlerLoginServer$LoginState dnC = new NetHandlerLoginServer$LoginState();
    public static final /* enum */ NetHandlerLoginServer$LoginState dnD = new NetHandlerLoginServer$LoginState();
    public static final /* enum */ NetHandlerLoginServer$LoginState dnE = new NetHandlerLoginServer$LoginState();
    private static final /* synthetic */ NetHandlerLoginServer$LoginState[] dnF;

    public static NetHandlerLoginServer$LoginState[] values() {
        return (NetHandlerLoginServer$LoginState[])dnF.clone();
    }

    public static NetHandlerLoginServer$LoginState valueOf(String string) {
        return Enum.valueOf(NetHandlerLoginServer$LoginState.class, string);
    }

    private static /* synthetic */ NetHandlerLoginServer$LoginState[] amL() {
        return new NetHandlerLoginServer$LoginState[]{dnz, dnA, dnB, dnC, dnD, dnE};
    }

    static {
        dnF = NetHandlerLoginServer$LoginState.amL();
    }
}

