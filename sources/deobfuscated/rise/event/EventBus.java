/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event;

import hackclient.rise.dn;
import hackclient.rise.dp;
import hackclient.rise.er;
import hackclient.rise.fa;
import hackclient.rise.fb;
import hackclient.rise.fg;
import hackclient.rise.fu;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import lombok.Generated;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.GameEvent;
import rise.event.impl.PacketSendEvent;
import rise.util.InstanceAccess;

public final class EventBus<Event>
implements InstanceAccess,
dn<Event> {
    private final Map<Type, List<dp<Event>>> iV;
    private final Map<Type, List<Listener<Event>>> iW;
    private final ConcurrentLinkedQueue<Function<Event, Boolean>> iX = new ConcurrentLinkedQueue();
    private static final MethodHandles.Lookup iY = MethodHandles.lookup();

    public EventBus() {
        this.iV = new HashMap<Type, List<dp<Event>>>();
        this.iW = new HashMap<Type, List<Listener<Event>>>();
    }

    @Override
    public void b(Object object) {
        try {
            for (Field field : object.getClass().getDeclaredFields()) {
                EventLink eventLink = field.getAnnotation(EventLink.class);
                if (eventLink == null) continue;
                Type type = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                try {
                    List<Object> list;
                    Listener listener = (Listener)iY.unreflectGetter(field).invokeWithArguments(object);
                    byte by2 = eventLink.cH();
                    dp dp4 = new dp(object, listener, by2);
                    if (this.iV.containsKey(type)) {
                        list = this.iV.get(type);
                        list.add(dp4);
                        list.sort((dp2, dp3) -> dp3.jb - dp2.jb);
                        continue;
                    }
                    list = new ArrayList(1);
                    list.add(dp4);
                    this.iV.put(type, list);
                }
                catch (Throwable throwable) {
                    return;
                }
            }
            this.cI();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void cI() {
        Map<Type, List<dp<Event>>> map = this.iV;
        Map<Type, List<Listener<Event>>> map2 = this.iW;
        for (Type type : map.keySet()) {
            List<dp<Event>> list = map.get(type);
            int n2 = list.size();
            ArrayList arrayList = new ArrayList(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add(list.get((int)i2).ja);
            }
            map2.put(type, arrayList);
        }
    }

    @Override
    public void c(Object object) {
        for (List<dp<Event>> list : this.iV.values()) {
            list.removeIf(dp2 -> dp2.iZ == object);
        }
        this.cI();
    }

    @Override
    public void d(Event Event2) {
        try {
            if (!(EventBus.aER.bgF != null && aER.AU() != null && (EventBus.aER.AU().bEQ || Event2 instanceof PacketSendEvent) || Event2 instanceof er || Event2 instanceof fu || Event2 instanceof fb || Event2 instanceof GameEvent || Event2 instanceof fg || Event2 instanceof fa)) {
                return;
            }
            List list = this.iW.getOrDefault(Event2.getClass(), Collections.emptyList());
            int n2 = 0;
            int n3 = list.size();
            while (n2 < n3) {
                ((Listener)list.get(n2++)).call(Event2);
            }
            if (!this.iX.isEmpty()) {
                this.iX.removeIf(function -> (Boolean)function.apply(Event2));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(Function<Event, Boolean> function) {
        this.iX.add(function);
    }

    public void a(Event Event2, Object ... objectArray) {
        try {
            System.out.println(objectArray.getClass().getDeclaredFields().length);
            for (Field field : objectArray.getClass().getDeclaredFields()) {
                EventLink eventLink = field.getAnnotation(EventLink.class);
                if (eventLink == null) continue;
                Type type = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Listener listener = (Listener)iY.unreflectGetter(field).invokeWithArguments(objectArray);
                System.out.println("Name: " + type.getTypeName());
                System.out.println("Event: " + Event2.getClass().getSimpleName());
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Generated
    public Map<Type, List<dp<Event>>> cJ() {
        return this.iV;
    }

    @Generated
    public Map<Type, List<Listener<Event>>> cK() {
        return this.iW;
    }
}

