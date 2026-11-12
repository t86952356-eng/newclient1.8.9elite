package rise.local.input;

import java.nio.file.*;
import java.io.File;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import java.lang.reflect.Field;

public final class RawMouseInput {
    private static final long FALLBACK=0x8000000080000000L;
    private static final boolean requested=Boolean.parseBoolean(System.getProperty("rise.rawMouse","true"));
    private static boolean initialized,available,capturing;
    private static long polls;
    private static Field fieldX,fieldY;
    private static native int nStart();
    private static native void nCapture(boolean value);
    private static native long nPoll();
    private static native boolean nRegistered();
    private static native void nStop();

    public static synchronized void initialize() {
        if(initialized)return;initialized=true;
        if(!requested||!System.getProperty("os.name","").toLowerCase().contains("win")) {System.out.println("[RawMouse] Disabled; using LWJGL input.");return;}
        boolean loaded=false;
        try {
            String path=System.getProperty("rise.native.directory",System.getProperty("java.library.path").split(java.util.regex.Pattern.quote(File.pathSeparator))[0]);
            System.load(Paths.get(path,"rise_raw_input.dll").toAbsolutePath().toString());
            loaded=true;
            int error=nStart();if(error!=0)throw new IllegalStateException("Windows error "+error);
            available=true;Runtime.getRuntime().addShutdownHook(new Thread(RawMouseInput::shutdown,"raw-mouse-shutdown"));
            System.out.println("[RawMouse] Windows Raw Input ready.");
        }catch(Throwable error){if(loaded)nStop();System.err.println("[RawMouse] Using LWJGL fallback: "+error.getMessage());}
    }
    public static void capture(boolean value) {
        initialize();if(!available)return;
        boolean active=value&&Display.isCreated()&&Display.isActive();
        if(active!=capturing){nCapture(active);capturing=active;}
    }
    public static void syncFocus() {
        if(!requested)return;
        capture(Mouse.isCreated()&&Mouse.isGrabbed());
    }
    public static void update(Object helper) {
        int legacyX=Mouse.getDX(),legacyY=Mouse.getDY();syncFocus();
        if(available&&capturing) {
            long delta=nPoll();if(delta!=FALLBACK){write(helper,(int)(delta>>32),(int)delta);if(polls++==0)System.out.println("[RawMouse] Camera is using raw relative motion.");return;}
        }
        write(helper,legacyX,legacyY);
    }
    private static void write(Object helper,int x,int y) {
        try {
            if(fieldX==null){fieldX=helper.getClass().getField("dzp");fieldY=helper.getClass().getField("dzq");}
            fieldX.setInt(helper,x);fieldY.setInt(helper,y);
        }catch(ReflectiveOperationException error){throw new IllegalStateException("Mouse input layout does not match this client.",error);}
    }
    public static boolean isAvailable(){initialize();return available;}
    public static boolean isRegistered(){return available&&nRegistered();}
    public static boolean isCapturing(){return capturing;}
    public static long polls(){return polls;}
    public static synchronized void shutdown(){if(available){available=false;capturing=false;nStop();}}
}
