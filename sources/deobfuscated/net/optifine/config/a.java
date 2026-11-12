/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.bg;
import net.minecraft.util.cm;
import net.optifine.config.b;
import net.optifine.config.c;
import net.optifine.config.f;
import net.optifine.config.j;
import net.optifine.config.l;
import net.optifine.config.n;
import net.optifine.config.o;
import net.optifine.config.p;
import net.optifine.config.q;
import net.optifine.i;
import net.optifine.util.k;

public class a {
    private String eeU = null;
    public static final p[] eeV = new p[0];
    public static final net.minecraft.item.b[] eeW = new net.minecraft.item.b[0];
    private static final f<Enum> eeX = new b();
    private static final f<net.minecraft.item.b> eeY = new c();

    public a(String string) {
        this.eeU = string;
    }

    public String gQ(String string) {
        int n2;
        String string2 = string;
        int n3 = string.lastIndexOf(47);
        if (n3 >= 0) {
            string2 = string.substring(n3 + 1);
        }
        if ((n2 = string2.lastIndexOf(46)) >= 0) {
            string2 = string2.substring(0, n2);
        }
        return string2;
    }

    public String gR(String string) {
        int n2 = string.lastIndexOf(47);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    public j[] hJ(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<j> arrayList = new ArrayList<j>();
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            j[] jArray = this.hK(string2);
            if (jArray == null) continue;
            arrayList.addAll(Arrays.asList(jArray));
        }
        j[] jArray = arrayList.toArray(new j[arrayList.size()]);
        return jArray;
    }

    public IBlockState a(String string, IBlockState iBlockState) {
        j[] jArray = this.hK(string);
        if (jArray == null) {
            return iBlockState;
        }
        if (jArray.length != 1) {
            return iBlockState;
        }
        j j2 = jArray[0];
        int n2 = j2.zW();
        Block block = Block.aK(n2);
        return block.xM();
    }

    public j[] hK(String string) {
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).length() <= 0) {
            return null;
        }
        String[] stringArray = net.minecraft.src.a.V(string, ":");
        String string2 = "minecraft";
        int n2 = 0;
        if (stringArray.length > 1 && this.n(stringArray)) {
            string2 = stringArray[0];
            n2 = 1;
        } else {
            string2 = "minecraft";
            n2 = 0;
        }
        String string3 = stringArray[n2];
        String[] stringArray2 = Arrays.copyOfRange(stringArray, n2 + 1, stringArray.length);
        Block[] blockArray = this.af(string2, string3);
        if (blockArray == null) {
            return null;
        }
        j[] jArray = new j[blockArray.length];
        for (int i2 = 0; i2 < blockArray.length; ++i2) {
            j j2;
            Block block = blockArray[i2];
            int n3 = Block.i(block);
            int[] nArray = null;
            if (stringArray2.length > 0 && (nArray = this.a(block, stringArray2)) == null) {
                return null;
            }
            jArray[i2] = j2 = new j(n3, nArray);
        }
        return jArray;
    }

    public boolean n(String[] stringArray) {
        if (stringArray.length < 2) {
            return false;
        }
        String string = stringArray[1];
        return string.length() >= 1 && !this.hL(string) && !string.contains("=");
    }

    public boolean hL(String string) {
        if (string == null) {
            return false;
        }
        if (string.length() < 1) {
            return false;
        }
        char c2 = string.charAt(0);
        return Character.isDigit(c2);
    }

    public Block[] af(String string, String string2) {
        if (this.hL(string2)) {
            int[] nArray = this.hO(string2);
            if (nArray == null) {
                return null;
            }
            Block[] blockArray = new Block[nArray.length];
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                int n2 = nArray[i2];
                Block block = Block.aK(n2);
                if (block == null) {
                    this.warn("Block not found for id: " + n2);
                    return null;
                }
                blockArray[i2] = block;
            }
            return blockArray;
        }
        String string3 = string + ":" + string2;
        Block block = Block.cq(string3);
        if (block == null) {
            this.warn("Block not found for name: " + string3);
            return null;
        }
        Block[] blockArray = new Block[]{block};
        return blockArray;
    }

    public int[] a(Block block, String[] stringArray) {
        Object object;
        if (stringArray.length <= 0) {
            return null;
        }
        String string = stringArray[0];
        if (this.hL(string)) {
            int[] nArray = this.hO(string);
            return nArray;
        }
        IBlockState iBlockState = block.xM();
        Collection<IProperty> collection = iBlockState.zU();
        HashMap<IProperty, List<Comparable>> hashMap = new HashMap<IProperty, List<Comparable>>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (string2.length() <= 0) continue;
            String[] stringArray2 = net.minecraft.src.a.V(string2, "=");
            if (stringArray2.length != 2) {
                this.warn("Invalid block property: " + string2);
                return null;
            }
            object = stringArray2[0];
            String string3 = stringArray2[1];
            IProperty iProperty = i.b((String)object, collection);
            if (iProperty == null) {
                this.warn("Property not found: " + (String)object + ", block: " + String.valueOf(block));
                return null;
            }
            ArrayList<Comparable> arrayList = (ArrayList<Comparable>)hashMap.get(object);
            if (arrayList == null) {
                arrayList = new ArrayList<Comparable>();
                hashMap.put(iProperty, arrayList);
            }
            String[] stringArray3 = net.minecraft.src.a.V(string3, ",");
            for (int i3 = 0; i3 < stringArray3.length; ++i3) {
                String string4 = stringArray3[i3];
                Comparable comparable = a.a(iProperty, string4);
                if (comparable == null) {
                    this.warn("Property value not found: " + string4 + ", property: " + (String)object + ", block: " + String.valueOf(block));
                    return null;
                }
                arrayList.add(comparable);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i4 = 0; i4 < 16; ++i4) {
            int n2 = i4;
            try {
                object = this.h(block, n2);
                if (!this.a((IBlockState)object, hashMap)) continue;
                arrayList.add(n2);
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (arrayList.size() == 16) {
            return null;
        }
        int[] nArray = new int[arrayList.size()];
        for (int i5 = 0; i5 < nArray.length; ++i5) {
            nArray[i5] = (Integer)arrayList.get(i5);
        }
        return nArray;
    }

    private IBlockState h(Block block, int n2) {
        try {
            IBlockState iBlockState = block.aM(n2);
            if (block == Blocks.cOH && n2 > 7) {
                IBlockState iBlockState2 = block.aM(n2 & 7);
                iBlockState = iBlockState.a(BlockDoublePlant.aUb, iBlockState2.b(BlockDoublePlant.aUb));
            }
            return iBlockState;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return block.xM();
        }
    }

    public static Comparable a(IProperty iProperty, String string) {
        Class clazz = iProperty.zM();
        Comparable comparable = a.d(string, clazz);
        if (comparable == null) {
            Collection collection = iProperty.zL();
            comparable = a.c(string, collection);
        }
        return comparable;
    }

    public static Comparable c(String string, Collection collection) {
        for (Object e2 : collection) {
            Comparable comparable = (Comparable)e2;
            if (!a.b(comparable).equals(string)) continue;
            return comparable;
        }
        return null;
    }

    private static Object b(Comparable comparable) {
        if (comparable instanceof bg) {
            bg bg2 = (bg)((Object)comparable);
            return bg2.getName();
        }
        return comparable.toString();
    }

    public static Comparable d(String string, Class clazz) {
        return clazz == String.class ? string : (Comparable)(clazz == Boolean.class ? (Comparable<Boolean>)Boolean.valueOf(string) : (Comparable<Boolean>)Double.valueOf(clazz == Float.class ? (double)Float.valueOf(string).floatValue() : (clazz == Double.class ? Double.valueOf(string) : (double)(clazz == Integer.class ? (long)Integer.valueOf(string).intValue() : (clazz == Long.class ? Long.valueOf(string) : null)))));
    }

    public boolean a(IBlockState iBlockState, Map<IProperty, List<Comparable>> map) {
        for (IProperty iProperty : map.keySet()) {
            List<Comparable> list = map.get(iProperty);
            Object t2 = iBlockState.b(iProperty);
            if (t2 == null) {
                return false;
            }
            if (list.contains(t2)) continue;
            return false;
        }
        return true;
    }

    public net.minecraft.world.biome.j[] hM(String string) {
        if (string == null) {
            return null;
        }
        string = string.trim();
        boolean bl2 = false;
        if (string.startsWith("!")) {
            bl2 = true;
            string = string.substring(1);
        }
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        ArrayList<net.minecraft.world.biome.j> arrayList = new ArrayList<net.minecraft.world.biome.j>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            net.minecraft.world.biome.j j2 = this.hN(string2);
            if (j2 == null) {
                this.warn("Biome not found: " + string2);
                continue;
            }
            arrayList.add(j2);
        }
        if (bl2) {
            ArrayList<net.minecraft.world.biome.j> arrayList2 = new ArrayList<net.minecraft.world.biome.j>(Arrays.asList(net.minecraft.world.biome.j.axg()));
            arrayList2.removeAll(arrayList);
            arrayList = arrayList2;
        }
        net.minecraft.world.biome.j[] jArray = arrayList.toArray(new net.minecraft.world.biome.j[arrayList.size()]);
        return jArray;
    }

    public net.minecraft.world.biome.j hN(String string) {
        if ((string = string.toLowerCase()).equals("nether")) {
            return net.minecraft.world.biome.j.dGn;
        }
        net.minecraft.world.biome.j[] jArray = net.minecraft.world.biome.j.axg();
        for (int i2 = 0; i2 < jArray.length; ++i2) {
            String string2;
            net.minecraft.world.biome.j j2 = jArray[i2];
            if (j2 == null || !(string2 = j2.dGX.replace(" ", "").toLowerCase()).equals(string)) continue;
            return j2;
        }
        return null;
    }

    public int x(String string, int n2) {
        if (string == null) {
            return n2;
        }
        int n3 = net.minecraft.src.a.x(string = string.trim(), -1);
        if (n3 < 0) {
            this.warn("Invalid number: " + string);
            return n2;
        }
        return n3;
    }

    public int[] hO(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String[] stringArray = net.minecraft.src.a.V(string, " ,");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (string2.contains("-")) {
                String[] stringArray2 = net.minecraft.src.a.V(string2, "-");
                if (stringArray2.length != 2) {
                    this.warn("Invalid interval: " + string2 + ", when parsing: " + string);
                    continue;
                }
                int n2 = net.minecraft.src.a.x(stringArray2[0], -1);
                int n3 = net.minecraft.src.a.x(stringArray2[1], -1);
                if (n2 >= 0 && n3 >= 0 && n2 <= n3) {
                    for (int i3 = n2; i3 <= n3; ++i3) {
                        arrayList.add(i3);
                    }
                    continue;
                }
                this.warn("Invalid interval: " + string2 + ", when parsing: " + string);
                continue;
            }
            int n4 = net.minecraft.src.a.x(string2, -1);
            if (n4 < 0) {
                this.warn("Invalid number: " + string2 + ", when parsing: " + string);
                continue;
            }
            arrayList.add(n4);
        }
        int[] nArray = new int[arrayList.size()];
        for (int i4 = 0; i4 < nArray.length; ++i4) {
            nArray[i4] = (Integer)arrayList.get(i4);
        }
        return nArray;
    }

    public boolean[] a(String string, boolean[] blArray) {
        if (string == null) {
            return blArray;
        }
        EnumSet<ao> enumSet = EnumSet.allOf(ao.class);
        String[] stringArray = net.minecraft.src.a.V(string, " ,");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (string2.equals("sides")) {
                enumSet.add(ao.dws);
                enumSet.add(ao.dwt);
                enumSet.add(ao.dwu);
                enumSet.add(ao.dwv);
                continue;
            }
            if (string2.equals("all")) {
                enumSet.addAll(Arrays.asList(ao.dwD));
                continue;
            }
            ao ao2 = this.hP(string2);
            if (ao2 == null) continue;
            enumSet.add(ao2);
        }
        boolean[] blArray2 = new boolean[ao.dwD.length];
        for (int i3 = 0; i3 < blArray2.length; ++i3) {
            blArray2[i3] = enumSet.contains(ao.dwD[i3]);
        }
        return blArray2;
    }

    public ao hP(String string) {
        if (!(string = string.toLowerCase()).equals("bottom") && !string.equals("down")) {
            if (!string.equals("top") && !string.equals("up")) {
                if (string.equals("north")) {
                    return ao.dws;
                }
                if (string.equals("south")) {
                    return ao.dwt;
                }
                if (string.equals("east")) {
                    return ao.dwv;
                }
                if (string.equals("west")) {
                    return ao.dwu;
                }
                net.minecraft.src.a.warn("Unknown face: " + string);
                return null;
            }
            return ao.dwr;
        }
        return ao.dwq;
    }

    public void fN(String string) {
        net.minecraft.src.a.fN(this.eeU + ": " + string);
    }

    public void warn(String string) {
        net.minecraft.src.a.warn(this.eeU + ": " + string);
    }

    public o hx(String string) {
        if (string == null) {
            return null;
        }
        o o2 = new o();
        String[] stringArray = net.minecraft.src.a.V(string, " ,");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            n n2 = this.hy(string2);
            if (n2 == null) {
                return null;
            }
            o2.a(n2);
        }
        return o2;
    }

    private n hy(String string) {
        if (string == null) {
            return null;
        }
        if (string.indexOf(45) >= 0) {
            String[] stringArray = net.minecraft.src.a.V(string, "-");
            if (stringArray.length != 2) {
                this.warn("Invalid range: " + string);
                return null;
            }
            int n2 = net.minecraft.src.a.x(stringArray[0], -1);
            int n3 = net.minecraft.src.a.x(stringArray[1], -1);
            if (n2 >= 0 && n3 >= 0) {
                return new n(n2, n3);
            }
            this.warn("Invalid range: " + string);
            return null;
        }
        int n4 = net.minecraft.src.a.x(string, -1);
        if (n4 < 0) {
            this.warn("Invalid integer: " + string);
            return null;
        }
        return new n(n4, n4);
    }

    public boolean p(String string, boolean bl2) {
        if (string == null) {
            return bl2;
        }
        String string2 = string.toLowerCase().trim();
        if (string2.equals("true")) {
            return true;
        }
        if (string2.equals("false")) {
            return false;
        }
        this.warn("Invalid boolean: " + string);
        return bl2;
    }

    public Boolean hQ(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.toLowerCase().trim();
        if (string2.equals("true")) {
            return Boolean.TRUE;
        }
        if (string2.equals("false")) {
            return Boolean.FALSE;
        }
        this.warn("Invalid boolean: " + string);
        return null;
    }

    public static int N(String string, int n2) {
        if (string == null) {
            return n2;
        }
        string = string.trim();
        try {
            int n3 = Integer.parseInt(string, 16) & 0xFFFFFF;
            return n3;
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public static int O(String string, int n2) {
        if (string == null) {
            return n2;
        }
        string = string.trim();
        try {
            int n3 = (int)(Long.parseLong(string, 16) & 0xFFFFFFFFFFFFFFFFL);
            return n3;
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public av a(String string, av av2) {
        if (string == null) {
            return av2;
        }
        string = string.toLowerCase().trim();
        av[] avArray = av.values();
        for (int i2 = 0; i2 < avArray.length; ++i2) {
            av av3 = avArray[i2];
            if (!string.equals(av3.name().toLowerCase())) continue;
            return av3;
        }
        return av2;
    }

    public <T> T a(String string, T[] TArray, f f2, String string2) {
        if (string == null) {
            return null;
        }
        String string3 = string.toLowerCase().trim();
        for (int i2 = 0; i2 < TArray.length; ++i2) {
            T t2 = TArray[i2];
            String string4 = f2.D(t2);
            if (string4 == null || !string4.toLowerCase().equals(string3)) continue;
            return t2;
        }
        this.warn("Invalid " + string2 + ": " + string);
        return null;
    }

    public <T> T[] a(String string, T[] TArray, f f2, String string2, T[] TArray2) {
        if (string == null) {
            return null;
        }
        string = string.toLowerCase().trim();
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        Object[] objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), stringArray.length);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string3 = stringArray[i2];
            T t2 = this.a(string3, TArray, f2, string2);
            if (t2 == null) {
                return TArray2;
            }
            objectArray[i2] = t2;
        }
        return objectArray;
    }

    public Enum a(String string, Enum[] enumArray, String string2) {
        return this.a(string, enumArray, eeX, string2);
    }

    public Enum[] a(String string, Enum[] enumArray, String string2, Enum[] enumArray2) {
        return this.a(string, enumArray, eeX, string2, enumArray2);
    }

    public net.minecraft.item.b[] a(String string, String string2, net.minecraft.item.b[] bArray) {
        return this.a(string, net.minecraft.item.b.values(), eeY, string2, bArray);
    }

    public q[] a(String string, String string2, q[] qArray) {
        return this.a(string, q.values(), eeX, string2, qArray);
    }

    public l ag(String string, String string2) {
        return string != null && string2 != null ? new l(string, string2) : null;
    }

    public p[] hR(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<p> arrayList = new ArrayList<p>();
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            p p2 = this.hS(string2);
            if (p2 == null) {
                this.warn("Invalid profession: " + string2);
                return eeV;
            }
            arrayList.add(p2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        p[] pArray = arrayList.toArray(new p[arrayList.size()]);
        return pArray;
    }

    private p hS(String string) {
        int n2;
        String[] stringArray = net.minecraft.src.a.V(string = string.toLowerCase(), ":");
        if (stringArray.length > 2) {
            return null;
        }
        String string2 = stringArray[0];
        String string3 = null;
        if (stringArray.length > 1) {
            string3 = stringArray[1];
        }
        if ((n2 = a.hT(string2)) < 0) {
            return null;
        }
        int[] nArray = null;
        if (string3 != null && (nArray = a.g(n2, string3)) == null) {
            return null;
        }
        return new p(n2, nArray);
    }

    private static int hT(String string) {
        int n2 = net.minecraft.src.a.x(string, -1);
        return n2 >= 0 ? n2 : (string.equals("farmer") ? 0 : (string.equals("librarian") ? 1 : (string.equals("priest") ? 2 : (string.equals("blacksmith") ? 3 : (string.equals("butcher") ? 4 : (string.equals("nitwit") ? 5 : -1))))));
    }

    private static int[] g(int n2, String string) {
        int n3;
        Object object;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        String[] stringArray = net.minecraft.src.a.V(string, ",");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            object = stringArray[i2];
            n3 = a.h(n2, (String)object);
            if (n3 < 0) {
                return null;
            }
            hashSet.add(n3);
        }
        Integer[] integerArray = hashSet.toArray(new Integer[hashSet.size()]);
        object = new int[integerArray.length];
        for (n3 = 0; n3 < ((Object)object).length; ++n3) {
            object[n3] = integerArray[n3];
        }
        return object;
    }

    private static int h(int n2, String string) {
        int n3 = net.minecraft.src.a.x(string, -1);
        if (n3 >= 0) {
            return n3;
        }
        if (n2 == 0) {
            if (string.equals("farmer")) {
                return 1;
            }
            if (string.equals("fisherman")) {
                return 2;
            }
            if (string.equals("shepherd")) {
                return 3;
            }
            if (string.equals("fletcher")) {
                return 4;
            }
        }
        if (n2 == 1) {
            if (string.equals("librarian")) {
                return 1;
            }
            if (string.equals("cartographer")) {
                return 2;
            }
        }
        if (n2 == 2 && string.equals("cleric")) {
            return 1;
        }
        if (n2 == 3) {
            if (string.equals("armor")) {
                return 1;
            }
            if (string.equals("weapon")) {
                return 2;
            }
            if (string.equals("tool")) {
                return 3;
            }
        }
        if (n2 == 4) {
            if (string.equals("butcher")) {
                return 1;
            }
            if (string.equals("leather")) {
                return 2;
            }
        }
        return n2 == 5 && string.equals("nitwit") ? 1 : -1;
    }

    public int[] hU(String string) {
        Object object;
        string = string.trim();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            object = stringArray[i2];
            cm cm2 = new cm((String)object);
            d d2 = d.cVi.w(cm2);
            if (d2 == null) {
                this.warn("Item not found: " + (String)object);
                continue;
            }
            int n2 = d.p(d2);
            if (n2 < 0) {
                this.warn("Item has no ID: " + String.valueOf(d2) + ", name: " + (String)object);
                continue;
            }
            treeSet.add(new Integer(n2));
        }
        Integer[] integerArray = treeSet.toArray(new Integer[treeSet.size()]);
        object = net.minecraft.src.a.a(integerArray);
        return object;
    }

    public int[] hV(String string) {
        Object object;
        string = string.trim();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            object = stringArray[i2];
            int n2 = k.ka((String)object);
            if (n2 < 0) {
                this.warn("Entity not found: " + (String)object);
                continue;
            }
            treeSet.add(new Integer(n2));
        }
        Integer[] integerArray = treeSet.toArray(new Integer[treeSet.size()]);
        object = net.minecraft.src.a.a(integerArray);
        return object;
    }
}

