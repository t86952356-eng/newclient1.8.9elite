/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.agu;
import java.awt.Rectangle;
import java.awt.font.TextHitInfo;
import java.awt.im.InputMethodRequests;
import java.text.AttributedCharacterIterator;

class agv
implements InputMethodRequests {
    final /* synthetic */ agu aKu;

    agv(agu agu2) {
        this.aKu = agu2;
    }

    public Rectangle a(TextHitInfo textHitInfo) {
        return new Rectangle(this.aKu.aKs.getX(), this.aKu.aKs.getY(), 1, Math.max(1, this.aKu.aKt.aKn));
    }

    public TextHitInfo n(int n2, int n3) {
        return null;
    }

    public int uz() {
        return 0;
    }

    public AttributedCharacterIterator a(int n2, int n3, AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    public int uA() {
        return 0;
    }

    public AttributedCharacterIterator a(AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    public AttributedCharacterIterator b(AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }
}

