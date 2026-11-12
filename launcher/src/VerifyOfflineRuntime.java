import java.lang.reflect.*;

public final class VerifyOfflineRuntime {
    public static void main(String[] args)throws Exception {
        Class<?> logging=Class.forName("org.apache.logging.log4j.LogManager");
        String loggingSource=logging.getProtectionDomain().getCodeSource().getLocation().toString();
        if(!loggingSource.endsWith("/client-restored.jar"))throw new AssertionError("Client logging was shadowed by "+loggingSource);
        if(logging.getMethod("getLogger").invoke(null)==null)throw new AssertionError("Client logger did not initialize");
        System.out.println("Client logger precedence passed.");
        if(System.getProperty("rise.native.directory")!=null) {
            NativeRuntime.prepare();
            Class<?> audio=Class.forName("org.lwjgl.openal.AL");audio.getMethod("create").invoke(null);
            if(!Boolean.TRUE.equals(audio.getMethod("isCreated").invoke(null)))throw new AssertionError("OpenAL did not initialize");
            audio.getMethod("destroy").invoke(null);
            Class<?> decryptor=Class.forName("com.alan.clients.security.NativeDecryptor");decryptor.getMethod("oA").invoke(null);
            if(!Boolean.TRUE.equals(decryptor.getMethod("isLoaded").invoke(null)))throw new AssertionError(decryptor.getMethod("oB").invoke(null));
            try(var font=VerifyOfflineRuntime.class.getResourceAsStream("/Inter.ttf")) {
                if(!java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT,font).getFamily().contains("Inter"))throw new AssertionError("Inter font missing");
            }
            System.out.println("Bundled audio, native decryptor and Inter font passed.");
            if(!rise.local.input.RawMouseInput.isAvailable()||!rise.local.input.RawMouseInput.isRegistered())throw new AssertionError("Bundled raw input receiver failed");
            rise.local.input.RawMouseInput.shutdown();System.out.println("Bundled Windows Raw Input receiver passed.");
        }
        Class<?> core=Class.forName("rip.vantage.network.core.a");
        Object instance=core.getMethod("aKQ").invoke(null);
        Object connection=core.getMethod("aKZ").invoke(instance);
        Class<?> handler=connection.getClass();
        if(handler.getField("eSp").get(null)==null)throw new AssertionError("Missing shared timer");
        core.getMethod("kk",String.class).invoke(instance,"aurorq3");
        if(!"aurorq3".equals(core.getMethod("bX").invoke(instance)))throw new AssertionError("Profile name was lost");
        for(String status:new String[]{"Singleplayer","Main menu","Multiplayer"}) {
            Class<?> packet=Class.forName("rip.vantage.commons.packet.impl.client.community.f");
            Object update=packet.getConstructor(String.class).newInstance(status);
            String message=(String)packet.getMethod("aJz").invoke(update);
            handler.getMethod("sendMessage",String.class).invoke(connection,message);
        }
        System.out.println("Runtime linkage and world/menu status updates passed.");
    }
}
