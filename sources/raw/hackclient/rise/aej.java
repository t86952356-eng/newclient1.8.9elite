/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public class aej {
    public static Class<?>[] ba(String string) {
        try {
            Set<String> set = aej.a(Paths.get(aej.sn(), new String[0]).toFile());
            ArrayList arrayList = new ArrayList();
            for (String string2 : set) {
                try {
                    if (!string2.startsWith(string)) continue;
                    Class<?> clazz = Class.forName(string2);
                    arrayList.add(clazz);
                }
                catch (ClassNotFoundException | NoClassDefFoundError | UnsupportedClassVersionError throwable) {}
            }
            return arrayList.toArray(new Class[0]);
        }
        catch (Exception exception) {
            File file = aej.bb(string);
            if (!file.exists()) {
                throw new IllegalArgumentException("Could not get directory resource for package " + string);
            }
            return aej.b(string, file);
        }
    }

    public static Set<String> a(File file) {
        HashSet<String> hashSet = new HashSet<String>();
        try (JarFile jarFile = new JarFile(file);){
            Cloneable cloneable;
            Enumeration<JarEntry> enumeration = jarFile.entries();
            while (enumeration.hasMoreElements()) {
                cloneable = enumeration.nextElement();
                if (!((ZipEntry)cloneable).getName().endsWith(".class")) continue;
                String string = ((ZipEntry)cloneable).getName().replace("/", ".").replace(".class", "");
                hashSet.add(string);
            }
            cloneable = hashSet;
            return cloneable;
        }
    }

    private static Class<?>[] b(String string, File file) {
        ArrayList arrayList = new ArrayList();
        for (String string2 : Objects.requireNonNull(file.list())) {
            Object object;
            if (string2.endsWith(".class")) {
                object = aej.u(string, string2);
                try {
                    arrayList.add(Class.forName((String)object));
                }
                catch (ClassNotFoundException classNotFoundException) {
                    System.err.println("Error creating class " + (String)object);
                }
                continue;
            }
            if (string2.contains(".")) continue;
            object = string + (string.endsWith(".") ? "" : ".") + string2;
            arrayList.addAll(Arrays.asList(aej.b((String)object, aej.bb((String)object))));
        }
        return arrayList.toArray(new Class[0]);
    }

    public static String u(String string, String string2) {
        return string + "." + string2.replace(".class", "");
    }

    private static File bb(String string) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            throw new IllegalStateException("Can't get class loader.");
        }
        URL uRL = classLoader.getResource(string.replace('.', '/'));
        if (uRL == null) {
            throw new RuntimeException("Package " + string + " not found on classpath.");
        }
        return new File(uRL.getFile());
    }

    public static boolean bc(String string) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL uRL = classLoader.getResource(string.replace('.', '/'));
        return uRL != null;
    }

    public static String sn() {
        return new File(a.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath();
    }

    public static Field a(String string, Class<?> clazz) {
        try {
            Field field = clazz.getField(string);
            field.setAccessible(true);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            noSuchFieldException.printStackTrace();
            return null;
        }
    }

    public static void a(Class<?> clazz, String string, Object object) {
        Field field = clazz.getDeclaredField(string);
        field.setAccessible(true);
        Field field2 = Field.class.getDeclaredField("modifiers");
        field2.setAccessible(true);
        field2.setInt(field, field.getModifiers() & 0xFFFFFFEF);
        field.set(null, object);
    }

    public static Method b(String string, Class<?> clazz) {
        try {
            Method method = clazz.getMethod(string, new Class[0]);
            method.setAccessible(true);
            return method;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
            return null;
        }
    }
}

