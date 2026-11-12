/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.openjdk.nashorn.api.scripting.JSObject
 *  org.openjdk.nashorn.internal.runtime.Undefined
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.RenderAPI;
import com.alan.clients.script.api.wrapper.ScriptHandlerWrapper;
import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.a;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akl;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.akr;
import hackclient.rise.aks;
import hackclient.rise.di;
import hackclient.rise.gi;
import java.awt.Color;
import java.util.function.Function;
import org.openjdk.nashorn.api.scripting.JSObject;
import org.openjdk.nashorn.internal.runtime.Undefined;

public final class ScriptModule
extends ScriptHandlerWrapper<gi> {
    private final Function<di, Boolean> eventListenerFunction = di2 -> {
        ScriptEvent<? extends di> scriptEvent;
        if (!a.a.t().aP().contains(this.wrapped)) {
            return true;
        }
        if (((gi)this.wrapped).isEnabled() && (scriptEvent = di2.cG()) != null) {
            this.call(scriptEvent.getHandlerName(), scriptEvent);
        }
        return false;
    };

    public ScriptModule(gi gi2, boolean bl2) {
        super(gi2);
        if (bl2) {
            a.a.e().a(this.eventListenerFunction);
        }
    }

    public ScriptModule(gi gi2) {
        super(gi2);
    }

    public void unregister() {
        if (((gi)this.wrapped).isEnabled()) {
            ((gi)this.wrapped).setEnabled(false);
        }
        ((gi)this.wrapped).getValues().clear();
        a.a.g().e((gi)this.wrapped);
        a.a.v().pi();
    }

    public String getName() {
        return ((gi)this.wrapped).getName();
    }

    public String getCategory() {
        return ((gi)this.wrapped).getModuleInfo().category().getName();
    }

    public String getDescription() {
        return ((gi)this.wrapped).getModuleInfo().description();
    }

    public boolean isEnabled() {
        return ((gi)this.wrapped).isEnabled();
    }

    public void toggle() {
        ((gi)this.wrapped).toggle();
    }

    public void setEnabled(boolean bl2) {
        ((gi)this.wrapped).setEnabled(bl2);
    }

    public String getTag() {
        return !((gi)this.wrapped).getValues().isEmpty() && ((gi)this.wrapped).getValues().get(0) instanceof akp ? ((akg)((akp)((gi)this.wrapped).getValues().get(0)).wD()).getName() : null;
    }

    @Override
    public void handle(String string, JSObject jSObject) {
        super.handle(string, jSObject);
    }

    @Override
    public void call(String string, Object ... objectArray) {
        super.call(string, objectArray);
    }

    public void registerSetting(String string, String string2, Object object2, Object ... objectArray) {
        switch (string.toLowerCase()) {
            case "string": {
                new akr(string2, (gi)this.wrapped, (String)object2);
                break;
            }
            case "number": {
                new akq(string2, (gi)this.wrapped, (Number)object2, (Number)objectArray[0], (Number)objectArray[1], objectArray.length >= 3 ? (Number)((Number)objectArray[2]) : (Number)1);
                break;
            }
            case "boundsnumber": {
                new akj(string2, (gi)this.wrapped, (Number)object2, (Number)objectArray[0], (Number)objectArray[1], (Number)objectArray[2], (Number)objectArray[3]);
                break;
            }
            case "boolean": {
                new aki(string2, (gi)this.wrapped, (Boolean)object2);
                break;
            }
            case "mode": {
                akp akp2 = new akp(string2, (gi)this.wrapped);
                for (Object object3 : objectArray) {
                    akp2.a(new akg[]{new aks((String)object3)});
                }
                akp2.co((String)object2);
                break;
            }
            case "color": {
                int[] nArray;
                JSObject jSObject;
                Color color = Color.WHITE;
                if (object2 instanceof JSObject && (jSObject = (JSObject)object2).isArray() && (nArray = jSObject.values().stream().map(object -> object instanceof Number ? ((Number)object).intValue() : 255).mapToInt(Integer::intValue).toArray()).length >= 3) {
                    color = RenderAPI.intArrayToColor(nArray);
                }
                new akl(string2, (gi)this.wrapped, color);
                break;
            }
        }
    }

    public Object getSetting(String string) {
        try {
            akh akh3 = ((gi)this.wrapped).getAllValues().stream().filter(akh2 -> akh2.getName().equalsIgnoreCase(string)).findFirst().get();
            if (akh3 instanceof akl) {
                int[] nArray = new int[4];
                Color color = (Color)((akl)akh3).wD();
                nArray[0] = color.getRed();
                nArray[1] = color.getGreen();
                nArray[2] = color.getBlue();
                nArray[3] = color.getAlpha();
                return nArray;
            }
            if (akh3 instanceof akq) {
                return ((Number)((akq)akh3).wD()).doubleValue();
            }
            if (akh3 instanceof akj) {
                double[] dArray = new double[]{((Number)((akj)akh3).wD()).doubleValue(), ((akj)akh3).wP().doubleValue()};
                return dArray;
            }
            if (akh3 instanceof aki || akh3 instanceof akr) {
                return akh3.wD();
            }
            if (akh3 instanceof akp) {
                return ((akg)((akp)akh3).wD()).getName();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return Undefined.getUndefined();
    }

    public void setSetting(String string, Object object) {
        try {
            akh akh3 = ((gi)this.wrapped).getAllValues().stream().filter(akh2 -> akh2.getName().equalsIgnoreCase(string)).findFirst().get();
            if (akh3 instanceof akl) {
                int[] nArray = (int[])object;
                ((akl)akh3).n(new Color(nArray[0], nArray[1], nArray[2], nArray[3]));
            } else if (akh3 instanceof akq) {
                ((akq)akh3).n((Number)object);
            } else if (akh3 instanceof akj) {
                Number[] numberArray = (Number[])object;
                ((akj)akh3).n(numberArray[0]);
                ((akj)akh3).a(numberArray[1]);
            } else if (akh3 instanceof aki) {
                ((aki)akh3).c((boolean)((Boolean)object));
            } else if (akh3 instanceof akp) {
                ((akp)akh3).cp((String)object);
            } else if (akh3 instanceof akr) {
                ((akr)akh3).n((String)object);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void setSettingVisibility(String string, boolean bl2) {
        try {
            akh akh3 = ((gi)this.wrapped).getValues().stream().filter(akh2 -> akh2.getName().equalsIgnoreCase(string)).findFirst().get();
            akh3.a(() -> !bl2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

