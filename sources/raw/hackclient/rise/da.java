/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2
 *  com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocol.packet.PacketWrapperImpl
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9
 */
package hackclient.rise;

import com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2;
import com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocol.packet.PacketWrapperImpl;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.vialoadingbase.netty.handler.VLBViaDecodeHandler;
import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.am;
import hackclient.rise.bi;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.fe;
import hackclient.rise.fi;
import hackclient.rise.fj;
import hackclient.rise.go;
import hackclient.rise.jg;
import hackclient.rise.mh;
import hackclient.rise.ti;
import hackclient.rise.tn;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.io.Serializable;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import net.minecraft.client.d;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.r;

public final class da
extends am {
    private boolean iq = false;
    private boolean ir = false;
    private int is = 0;
    private static final int it = 1;
    private static boolean iu = false;
    private static long iv = 0L;
    private static final long iw = 2000L;
    @dm(cH=1)
    public final dk<fj> ix = fj2 -> {};
    @dm
    public final dk<fe> iy = fe2 -> {
        long l2;
        this.is = 0;
        String string = rip.vantage.network.core.a.aKQ().bX();
        if (string.equals("zaikoyano")) {
            // empty if block
        }
        if ("true".equals(System.getProperty("rise.lag.active"))) {
            // empty if block
        }
        if ((l2 = System.currentTimeMillis()) - iv > 2000L) {
            iu = da.cC();
            iv = l2;
        }
        if (iu) {
            // empty if block
        }
        if (!(Math.random() > 0.5) || this.iq) {
            // empty if block
        }
        if (da.aER.bgK.aRg < 10) {
            this.ir = false;
        }
        if (string == null || string.isBlank() || !Objects.equals(bi.dy, "35565") && !Objects.equals(bi.dx, "testnet.hypixel.net") && !a.a.s().od() || da.aER.bgK.aRg <= 100 || !this.e(go.class).isEnabled() && !this.e(mh.class).isEnabled() && !this.e(tn.class).isEnabled() || Math.random() < 0.001) {
            // empty if block
        }
        if (string == null || string.isBlank()) {
            // empty if block
        }
        if (this.ir) {
            // empty if block
        }
        if (string != null && !string.isBlank() || da.aER.bgK.aRg % 100 != 0 || !this.ir || this.e(mh.class).isEnabled() || da.aER.bgK.tR > 8) {
            // empty if block
        }
        if (Math.random() < 1.0E-5) {
            // empty if block
        }
    };
    @dm
    public final dk<fi> iz = fi2 -> {
        Object object;
        Object object2;
        aj<b> aj2;
        Object object3;
        UserConnection userConnection;
        String string = rip.vantage.network.core.a.aKQ().bX();
        if (ti.acw == null && !this.e(go.class).isEnabled()) {
            go.nS = false;
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
            if (aER.isSingleplayer()) {
                return;
            }
            userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            object3 = userConnection.getProtocolInfo();
            if (object3.getPipeline().contains(Protocol1_9To1_8.class)) {
                aj2 = PacketWrapper.create((PacketType)ServerboundPackets1_9.SWING, (UserConnection)userConnection);
                aj2.write((Type)Types.VAR_INT, 0);
                object2 = fi2.dq();
                if ((object2 instanceof m && string != null && !string.isBlank() || object2 instanceof m && Math.random() < 0.2) && !bm.enabled) {
                    fi2.cF();
                    aj2.sendToServer(Protocol1_9To1_8.class);
                    return;
                }
            } else {
                afl.b("\u00c2\u00a7cConnection does not contain Protocol1_8To1_9.", new Object[0]);
            }
            aj2 = fi2.dq();
            if (aj2 instanceof r && ((r)(object2 = (r)aj2)).getMode() < 5 && ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_18_2) && (!this.e(jg.class).gC() || da.aER.bgR instanceof h || da.aER.bgR instanceof q)) {
                object = Protocol1_19To1_18_2.class;
                ProtocolVersion protocolVersion = ViaLoadingBase.getInstance().getTargetVersion();
                PacketWrapperImpl packetWrapperImpl = (PacketWrapperImpl)PacketWrapper.create((PacketType)ServerboundPackets1_19.CONTAINER_CLICK, (UserConnection)userConnection);
                int n2 = ((r)object2).getWindowId();
                int n3 = ((r)object2).getSlotId();
                int n4 = ((r)object2).getUsedButton();
                int n5 = ((r)object2).getMode();
                if (n3 < -1 || n4 < 0 || n5 < 0 || n5 > 6) {
                    return;
                }
                if (object2 == null || object3 == null || userConnection == null) {
                    return;
                }
                fi2.setCancelled(true);
                int n6 = VLBViaDecodeHandler.stateId;
                if (n6 < 0) {
                    n6 = 0;
                }
                if (n3 == -1) {
                    n3 = -999;
                }
                if (n5 < 0 || n5 > 6) {
                    n5 = 0;
                }
                if (n4 < 0) {
                    n4 = 0;
                }
                boolean bl2 = false;
                packetWrapperImpl.write((Type)Types.BYTE, (Object)((byte)n2));
                packetWrapperImpl.write((Type)Types.VAR_INT, (Object)n6);
                packetWrapperImpl.write((Type)Types.SHORT, (Object)((short)n3));
                packetWrapperImpl.write((Type)Types.BYTE, (Object)((byte)n4));
                packetWrapperImpl.write((Type)Types.VAR_INT, (Object)n5);
                packetWrapperImpl.write((Type)Types.VAR_INT, (Object)0);
                StructuredItem structuredItem = new StructuredItem(0, 0, null);
                packetWrapperImpl.write(Types.ITEM1_13_2, (Object)structuredItem);
                if (object3.getPipeline().contains((Class)object)) {
                    packetWrapperImpl.sendToServer((Class)object);
                }
            }
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
            userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            object3 = fi2.dq();
            if (object3 instanceof i && (((i)(aj2 = (i)object3)).afW() == j.daZ || ((i)aj2).afW() == j.dbb)) {
                object2 = PacketWrapper.create((PacketType)ServerboundPackets1_17.PLAYER_ACTION, (UserConnection)userConnection);
                object = d.AZ().bgF;
                int n7 = d.AZ().bgF.Ho();
                object2.write((Type)Types.VAR_INT, (Object)((i)aj2).afW().ordinal());
                object2.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition(((i)aj2).yl().wt(), ((i)aj2).yl().wu(), ((i)aj2).yl().wx()));
                object2.write((Type)Types.UNSIGNED_BYTE, (Object)((short)((i)aj2).yx().OY()));
                object2.write((Type)Types.VAR_INT, (Object)n7);
            }
        }
    };
    @dm
    public final dk<dz> iA = dz2 -> {
        if (aii.enoughMovementForSprinting()) {
            // empty if block
        }
    };
    @dm(cH=1)
    public final dk<ei> iB = ei2 -> {
        if (!da.cB() || da.aER.bgK == null || da.aER.bgF != null) {
            // empty if block
        }
    };

    private static boolean cB() {
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean cC() {
        try {
            void thread;
            String string;
            String[] stringArray = new String[]{"cracked", "crack", "qreaj", "patcher", "discord.gg", "ws://127.0.0.1", "ws://localhost", "bypassed", "keygen", "CopeHarder", "premium bypass", "free version", "patched by", "nulled", "leaked", "cracker", "encryption key", "reis free", "billionare bypass", "cooking agent"};
            Window[] windowArray = Window.getWindows();
            if (windowArray != null && windowArray.length > 0) {
                for (Serializable serializable : windowArray) {
                    if (serializable == null) continue;
                    try {
                        String string2 = ((Component)serializable).getName();
                        if (string2 != null) {
                            string = string2.toLowerCase(Locale.ROOT);
                            for (String string3 : stringArray) {
                                if (!string.contains(string3.toLowerCase(Locale.ROOT))) continue;
                                return true;
                            }
                        }
                        if (serializable.getClass().getName().contains("Dialog") && da.a(((Container)serializable).getComponents(), stringArray)) {
                            afl.c("s", new Object[0]);
                            return true;
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
            }
            if (System.getProperty("crack.version") != null || System.getProperty("qreaj.loaded") != null || System.getProperty("bypass.enabled") != null) {
                afl.c("s", new Object[0]);
                return true;
            }
            Serializable[] serializableArray = Thread.currentThread().getStackTrace();
            Object object = serializableArray;
            int n2 = ((Serializable[])object).length;
            boolean n22 = false;
            while (thread < n2) {
                Serializable serializable = object[thread];
                string = ((StackTraceElement)serializable).getClassName().toLowerCase(Locale.ROOT);
                if ((string.contains("crack") || string.contains("qreaj") || string.contains("copeharder") || string.contains("bypass") || string.contains("agentthatcooks") || string.contains("cookingagent") || string.contains("riseagenttransformer") || string.contains("reisutil") || string.contains("cc.fish")) && !string.startsWith("com.alan.clients") && !string.startsWith("rip.vantage")) {
                    return true;
                }
                ++thread;
            }
            try {
                object = System.getProperty("sun.java.command", "");
                String string3 = System.getProperty("java.class.path", "");
                if (((String)object).contains("idea_rt.jar") || string3.contains("idea_rt.jar")) {
                    boolean bl2;
                    boolean bl3 = bl2 = System.getProperty("idea.config.path") != null || System.getProperty("idea.system.path") != null || System.getProperty("idea.plugins.path") != null;
                    if (!bl2) {
                        return true;
                    }
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                object = Thread.getAllStackTraces().keySet();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    Thread thread2 = (Thread)iterator.next();
                    String string4 = thread2.getName();
                    if (string4 == null || !string4.equals("agent")) continue;
                    return true;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                object = ManagementFactory.getRuntimeMXBean();
                List<String> list = object.getInputArguments();
                for (String string5 : list) {
                    boolean bl4;
                    if (!string5.startsWith("-javaagent:")) continue;
                    string = string5.substring("-javaagent:".length()).toLowerCase(Locale.ROOT);
                    if (string.contains("crack") || string.contains("patch") || string.contains("bypass")) {
                        return true;
                    }
                    if (!string.contains("idea_rt.jar") || (bl4 = System.getProperty("idea.config.path") != null || System.getProperty("idea.system.path") != null)) continue;
                    return true;
                }
            }
            catch (Throwable throwable) {}
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return false;
    }

    private static boolean a(Component[] componentArray, String[] stringArray) {
        if (componentArray == null || componentArray.length == 0) {
            return false;
        }
        try {
            for (Component component : componentArray) {
                Object object;
                if (component == null) continue;
                try {
                    object = component.getClass().getMethod("getText", new Class[0]);
                    String string = (String)((Method)object).invoke((Object)component, new Object[0]);
                    if (string != null) {
                        String string2 = string.toLowerCase(Locale.ROOT);
                        for (String string3 : stringArray) {
                            if (!string2.contains(string3.toLowerCase(Locale.ROOT))) continue;
                            return true;
                        }
                        if (string2.matches(".*ws://127\\.0\\.0\\.1.*") || string2.matches(".*ws://localhost.*")) {
                            return true;
                        }
                    }
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    // empty catch block
                }
                try {
                    if (!(component instanceof Container) || !da.a(((Container)(object = (Container)component)).getComponents(), stringArray)) continue;
                    return true;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return false;
    }
}

