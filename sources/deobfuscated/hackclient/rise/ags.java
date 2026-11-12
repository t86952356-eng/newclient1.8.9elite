/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.Display
 */
package hackclient.rise;

import hackclient.rise.agt;
import hackclient.rise.agu;
import hackclient.rise.agw;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyEvent;
import java.awt.im.InputContext;
import java.text.AttributedCharacterIterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

public final class ags {
    private static final ags aKi = new ags();
    private volatile boolean Mq;
    private volatile boolean dj;
    private Component aKj;
    private InputContext aKk;
    private final Queue<String> aKl = new ConcurrentLinkedQueue<String>();
    private volatile String aKm = "";
    private volatile int aKn = 12;
    private volatile Frame aKo;
    private volatile Window aKp;

    public static ags up() {
        return aKi;
    }

    private ags() {
    }

    public void uq() {
        if (this.Mq) {
            return;
        }
        try {
            Canvas canvas = Display.getParent();
            if (canvas != null) {
                canvas.enableInputMethods(true);
                canvas.addInputMethodListener(new agt(this));
                this.aKj = canvas;
                this.aKk = canvas.getInputContext();
                this.Mq = true;
                return;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            EventQueue.invokeAndWait(() -> {
                Frame frame = new Frame();
                frame.setUndecorated(true);
                frame.setFocusableWindowState(false);
                frame.setAutoRequestFocus(false);
                frame.setType(Window.Type.UTILITY);
                frame.setLocation(-10000, -10000);
                frame.setSize(1, 1);
                frame.addNotify();
                Window window = new Window(frame);
                window.setFocusableWindowState(false);
                window.setAutoRequestFocus(false);
                window.setAlwaysOnTop(true);
                try {
                    window.setBackground(new Color(0, 0, 0, 0));
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                agu agu2 = new agu(this, window);
                agu2.setFocusable(false);
                agu2.enableInputMethods(true);
                agu2.setSize(1, 1);
                window.add(agu2);
                window.setSize(1, 1);
                window.addNotify();
                agu2.addNotify();
                agu2.addInputMethodListener(new agw(this));
                this.aKo = frame;
                this.aKp = window;
                this.aKj = agu2;
                this.aKk = agu2.getInputContext();
                this.Mq = true;
                window.setVisible(false);
            });
        }
        catch (Throwable throwable) {
            this.Mq = false;
            this.aKj = null;
            this.aKk = null;
            this.aKo = null;
            this.aKp = null;
        }
    }

    public void c(boolean bl2) {
        Window window;
        this.dj = bl2;
        if (!bl2) {
            this.aKm = "";
        }
        if (!this.Mq) {
            return;
        }
        Frame frame = this.aKo;
        if (frame != null || this.aKp != null) {
            // empty if block
        }
        if ((window = this.aKp) == null) {
            return;
        }
        try {
            EventQueue.invokeLater(() -> {
                try {
                    window.setVisible(bl2);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            });
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public boolean ur() {
        String string = this.aKm;
        return string != null && !string.isEmpty();
    }

    public String us() {
        return this.aKm == null ? "" : this.aKm;
    }

    public void g(int n2, int n3, int n4) {
        if (n4 > 0) {
            this.aKn = n4;
        }
        if (!this.Mq || !this.dj) {
            return;
        }
        Window window = this.aKp;
        if (window == null) {
            return;
        }
        int n5 = ags.uv() + n2;
        int n6 = ags.uw() + n3;
        try {
            EventQueue.invokeLater(() -> {
                try {
                    window.setLocation(n5, n6);
                    if (!window.isVisible()) {
                        window.setVisible(true);
                    }
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            });
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public void a(int n2, char c2) {
        if (!this.Mq || !this.dj) {
            return;
        }
        if (this.aKk == null || this.aKj == null) {
            return;
        }
        long l2 = System.currentTimeMillis();
        int n3 = ags.uu();
        int n4 = ags.b(n2, c2);
        KeyEvent keyEvent = new KeyEvent(this.aKj, 401, l2, n3, n4, '\uffff');
        this.aKk.dispatchEvent(keyEvent);
        if (c2 != '\u0000' && !Character.isISOControl(c2)) {
            KeyEvent keyEvent2 = new KeyEvent(this.aKj, 400, l2, n3, 0, c2);
            this.aKk.dispatchEvent(keyEvent2);
        }
    }

    public String ut() {
        String string;
        String string2 = this.aKl.poll();
        if (string2 == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        while ((string = this.aKl.poll()) != null) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    private void a(InputMethodEvent inputMethodEvent) {
        String string;
        AttributedCharacterIterator attributedCharacterIterator = inputMethodEvent.getText();
        int n2 = inputMethodEvent.getCommittedCharacterCount();
        if (attributedCharacterIterator == null) {
            this.aKm = "";
            return;
        }
        String string2 = ags.a(attributedCharacterIterator);
        if ((n2 = Math.max(0, Math.min(n2, string2.length()))) > 0 && !(string = string2.substring(0, n2)).isEmpty()) {
            this.aKl.add(string);
        }
        this.aKm = (string = string2.substring(n2)) == null ? "" : string;
    }

    private static String a(AttributedCharacterIterator attributedCharacterIterator) {
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = attributedCharacterIterator.first();
        while (c2 != '\uffff') {
            stringBuilder.append(c2);
            c2 = attributedCharacterIterator.next();
        }
        return stringBuilder.toString();
    }

    private static int uu() {
        int n2 = 0;
        if (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54)) {
            n2 |= 0x40;
        }
        if (Keyboard.isKeyDown((int)29) || Keyboard.isKeyDown((int)157)) {
            n2 |= 0x80;
        }
        if (Keyboard.isKeyDown((int)56) || Keyboard.isKeyDown((int)184)) {
            n2 |= 0x200;
        }
        if (Keyboard.isKeyDown((int)219) || Keyboard.isKeyDown((int)220)) {
            n2 |= 0x100;
        }
        return n2;
    }

    private static int b(int n2, char c2) {
        switch (n2) {
            case 14: {
                return 8;
            }
            case 28: {
                return 10;
            }
            case 15: {
                return 9;
            }
            case 57: {
                return 32;
            }
            case 203: {
                return 37;
            }
            case 205: {
                return 39;
            }
            case 200: {
                return 38;
            }
            case 208: {
                return 40;
            }
            case 1: {
                return 27;
            }
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            return 65 + (c2 - 65);
        }
        if (c2 >= 'a' && c2 <= 'z') {
            return 65 + (c2 - 97);
        }
        if (c2 >= '0' && c2 <= '9') {
            return 48 + (c2 - 48);
        }
        return 0;
    }

    private static int uv() {
        try {
            return Display.getX();
        }
        catch (Throwable throwable) {
            return 0;
        }
    }

    private static int uw() {
        try {
            return Display.getY();
        }
        catch (Throwable throwable) {
            return 0;
        }
    }
}

