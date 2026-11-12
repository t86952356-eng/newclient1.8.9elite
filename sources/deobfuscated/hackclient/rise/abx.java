/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import net.minecraft.util.cm;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.math.Vector2d;
import rise.value.Value;

public class abx
extends ValueComponent {
    private final cm azY = new cm("rise/icons/click.png");

    public abx(Value<?> value) {
        super(value);
    }

    @Override
    public void a(Vector2d vector2d, int n2, int n3, float f2) {
        this.jy = 0.0;
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        return false;
    }

    @Override
    public void pP() {
    }

    @Override
    public void ci() {
    }

    @Override
    public void b(char c2, int n2) {
    }
}

