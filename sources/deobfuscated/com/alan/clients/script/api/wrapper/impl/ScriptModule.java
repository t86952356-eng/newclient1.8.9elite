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
import hackclient.rise.akj;
import hackclient.rise.akl;
import hackclient.rise.akr;
import hackclient.rise.aks;
import hackclient.rise.di;
import java.awt.Color;
import java.util.function.Function;
import org.openjdk.nashorn.api.scripting.JSObject;
import org.openjdk.nashorn.internal.runtime.Undefined;
import rise.Client;
import rise.module.Mode;
import rise.module.Module;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;
import rise.value.Value;

public final class ScriptModule
extends ScriptHandlerWrapper<Module> {
    private final Function<di, Boolean> eventListenerFunction = di2 -> {
        ScriptEvent<? extends di> scriptEvent;
        if (!Client.a.t().aP().contains(this.wrapped)) {
            return true;
        }
        if (((Module)this.wrapped).isEnabled() && (scriptEvent = di2.cG()) != null) {
            this.call(scriptEvent.getHandlerName(), scriptEvent);
        }
        return false;
    };

    public ScriptModule(Module module, boolean bl2) {
        super(module);
        if (bl2) {
            Client.a.e().a(this.eventListenerFunction);
        }
    }

    public ScriptModule(Module module) {
        super(module);
    }

    public void unregister() {
        if (((Module)this.wrapped).isEnabled()) {
            ((Module)this.wrapped).setEnabled(false);
        }
        ((Module)this.wrapped).getValues().clear();
        Client.a.g().e((Module)this.wrapped);
        Client.a.v().pi();
    }

    public String getName() {
        return ((Module)this.wrapped).getName();
    }

    public String getCategory() {
        return ((Module)this.wrapped).getModuleInfo().category().getName();
    }

    public String getDescription() {
        return ((Module)this.wrapped).getModuleInfo().description();
    }

    public boolean isEnabled() {
        return ((Module)this.wrapped).isEnabled();
    }

    public void toggle() {
        ((Module)this.wrapped).toggle();
    }

    public void setEnabled(boolean bl2) {
        ((Module)this.wrapped).setEnabled(bl2);
    }

    public String getTag() {
        return !((Module)this.wrapped).getValues().isEmpty() && ((Module)this.wrapped).getValues().get(0) instanceof ModeValue ? ((Mode)((ModeValue)((Module)this.wrapped).getValues().get(0)).wD()).getName() : null;
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
                new akr(string2, (Module)this.wrapped, (String)object2);
                break;
            }
            case "number": {
                new NumberValue(string2, (Module)this.wrapped, (Number)object2, (Number)objectArray[0], (Number)objectArray[1], objectArray.length >= 3 ? (Number)((Number)objectArray[2]) : (Number)1);
                break;
            }
            case "boundsnumber": {
                new akj(string2, (Module)this.wrapped, (Number)object2, (Number)objectArray[0], (Number)objectArray[1], (Number)objectArray[2], (Number)objectArray[3]);
                break;
            }
            case "boolean": {
                new BooleanValue(string2, (Module)this.wrapped, (Boolean)object2);
                break;
            }
            case "mode": {
                ModeValue modeValue = new ModeValue(string2, (Module)this.wrapped);
                for (Object object3 : objectArray) {
                    modeValue.a(new Mode[]{new aks((String)object3)});
                }
                modeValue.co((String)object2);
                break;
            }
            case "color": {
                int[] nArray;
                JSObject jSObject;
                Color color = Color.WHITE;
                if (object2 instanceof JSObject && (jSObject = (JSObject)object2).isArray() && (nArray = jSObject.values().stream().map(object -> object instanceof Number ? ((Number)object).intValue() : 255).mapToInt(Integer::intValue).toArray()).length >= 3) {
                    color = RenderAPI.intArrayToColor(nArray);
                }
                new akl(string2, (Module)this.wrapped, color);
                break;
            }
        }
    }

    public Object getSetting(String string) {
        try {
            Value value2 = ((Module)this.wrapped).getAllValues().stream().filter(value -> value.getName().equalsIgnoreCase(string)).findFirst().get();
            if (value2 instanceof akl) {
                int[] nArray = new int[4];
                Color color = (Color)((akl)value2).wD();
                nArray[0] = color.getRed();
                nArray[1] = color.getGreen();
                nArray[2] = color.getBlue();
                nArray[3] = color.getAlpha();
                return nArray;
            }
            if (value2 instanceof NumberValue) {
                return ((Number)((NumberValue)value2).wD()).doubleValue();
            }
            if (value2 instanceof akj) {
                double[] dArray = new double[]{((Number)((akj)value2).wD()).doubleValue(), ((akj)value2).wP().doubleValue()};
                return dArray;
            }
            if (value2 instanceof BooleanValue || value2 instanceof akr) {
                return value2.wD();
            }
            if (value2 instanceof ModeValue) {
                return ((Mode)((ModeValue)value2).wD()).getName();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return Undefined.getUndefined();
    }

    public void setSetting(String string, Object object) {
        try {
            Value value2 = ((Module)this.wrapped).getAllValues().stream().filter(value -> value.getName().equalsIgnoreCase(string)).findFirst().get();
            if (value2 instanceof akl) {
                int[] nArray = (int[])object;
                ((akl)value2).n(new Color(nArray[0], nArray[1], nArray[2], nArray[3]));
            } else if (value2 instanceof NumberValue) {
                ((NumberValue)value2).n((Number)object);
            } else if (value2 instanceof akj) {
                Number[] numberArray = (Number[])object;
                ((akj)value2).n(numberArray[0]);
                ((akj)value2).a(numberArray[1]);
            } else if (value2 instanceof BooleanValue) {
                ((BooleanValue)value2).c((boolean)((Boolean)object));
            } else if (value2 instanceof ModeValue) {
                ((ModeValue)value2).cp((String)object);
            } else if (value2 instanceof akr) {
                ((akr)value2).n((String)object);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void setSettingVisibility(String string, boolean bl2) {
        try {
            Value value2 = ((Module)this.wrapped).getValues().stream().filter(value -> value.getName().equalsIgnoreCase(string)).findFirst().get();
            value2.a(() -> !bl2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

