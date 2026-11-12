import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;

public final class CleanBytecode implements Opcodes {
    static final Object UNKNOWN = new Object(), NIL = new Object();
    static final Map<String, Object[]> TABLES = new HashMap<>();
    static long folds, promotions, routes;
    static final Map<String,String[]> HIERARCHY=new HashMap<>();
    static String[] hierarchy(String name) {
        return HIERARCHY.computeIfAbsent(name,key->{
            try(java.io.InputStream stream=CleanBytecode.class.getClassLoader().getResourceAsStream(key+".class")) {
                if(stream==null)return new String[]{"java/lang/Object"};
                ClassReader reader=new ClassReader(stream);String[] interfaces=reader.getInterfaces();String[] result=new String[interfaces.length+1];result[0]=reader.getSuperName();System.arraycopy(interfaces,0,result,1,interfaces.length);return result;
            } catch(Exception ignored){return new String[]{"java/lang/Object"};}
        });
    }
    static boolean assignable(String parent,String child,Set<String> seen) {
        if(parent.equals(child)||parent.equals("java/lang/Object"))return true;
        if(!seen.add(child))return false;
        for(String next:hierarchy(child))if(next!=null&&assignable(parent,next,seen))return true;
        return false;
    }
    static final class Writer extends ClassWriter {
        Writer(){super(COMPUTE_FRAMES|COMPUTE_MAXS);}
        protected String getCommonSuperClass(String a,String b) {
            if(assignable(a,b,new HashSet<>()))return a;
            if(assignable(b,a,new HashSet<>()))return b;
            if(a.startsWith("[")||b.startsWith("["))return "java/lang/Object";
            String candidate=hierarchy(a)[0];
            while(candidate!=null&&!assignable(candidate,b,new HashSet<>()))candidate=hierarchy(candidate)[0];
            return candidate==null?"java/lang/Object":candidate;
        }
    }
    static final class Provenance extends SourceInterpreter {
        Provenance() { super(ASM9); }
        public SourceValue copyOperation(AbstractInsnNode node,SourceValue value) {
            int op=node.getOpcode();
            return op>=DUP&&op<=SWAP?value:super.copyOperation(node,value);
        }
    }

    static final class V extends BasicValue {
        final Object value;
        final AbstractInsnNode start;
        V(Type type, Object value, AbstractInsnNode start) { super(type); this.value = value; this.start = start; }
        public boolean equals(Object other) {
            return other instanceof V && Objects.equals(getType(), ((V)other).getType()) && Objects.equals(value, ((V)other).value);
        }
        public int hashCode() { return Objects.hash(getType(), value); }
    }

    static final class Constants extends Interpreter<V> {
        final BasicInterpreter basic = new BasicInterpreter();
        Constants() { super(ASM9); }
        V wrap(BasicValue value) { return value == null ? null : new V(value.getType(), UNKNOWN, null); }
        V known(Type type, Object value, AbstractInsnNode start) { return new V(type, value, start); }
        public V newValue(Type type) { return wrap(basic.newValue(type)); }
        public V newOperation(AbstractInsnNode n) throws AnalyzerException {
            BasicValue type = basic.newOperation(n);
            int op = n.getOpcode();
            Object value = UNKNOWN;
            if (op == ACONST_NULL) value = NIL;
            else if (op >= ICONST_M1 && op <= ICONST_5) value = op - ICONST_0;
            else if (op == LCONST_0 || op == LCONST_1) value = (long)(op - LCONST_0);
            else if (op >= FCONST_0 && op <= FCONST_2) value = (float)(op - FCONST_0);
            else if (op == DCONST_0 || op == DCONST_1) value = (double)(op - DCONST_0);
            else if (n instanceof IntInsnNode) value = ((IntInsnNode)n).operand;
            else if (n instanceof LdcInsnNode) {
                Object literal = ((LdcInsnNode)n).cst;
                if (literal instanceof Number || literal instanceof String) value = literal;
            } else if (op == GETSTATIC) {
                FieldInsnNode f = (FieldInsnNode)n;
                value = TABLES.getOrDefault(f.owner + "." + f.name, null);
                if (value == null) value = UNKNOWN;
            }
            return known(type.getType(), value, n);
        }
        public V copyOperation(AbstractInsnNode n, V value) { return known(value.getType(), value.value, n); }
        public V unaryOperation(AbstractInsnNode n, V a) throws AnalyzerException {
            BasicValue type = basic.unaryOperation(n, a);
            if (type == null) return null;
            Object result = UNKNOWN;
            if (a.value != UNKNOWN) {
                try {
                    switch (n.getOpcode()) {
                        case CHECKCAST: result = a.value; break;
                        case ARRAYLENGTH: if (a.value instanceof Object[]) result = ((Object[])a.value).length; break;
                        case INEG: result = -((Number)a.value).intValue(); break;
                        case LNEG: result = -((Number)a.value).longValue(); break;
                        case FNEG: result = -((Number)a.value).floatValue(); break;
                        case DNEG: result = -((Number)a.value).doubleValue(); break;
                        case I2L: case F2L: case D2L: result = ((Number)a.value).longValue(); break;
                        case I2F: case L2F: case D2F: result = ((Number)a.value).floatValue(); break;
                        case I2D: case L2D: case F2D: result = ((Number)a.value).doubleValue(); break;
                        case L2I: case F2I: case D2I: result = ((Number)a.value).intValue(); break;
                        case I2B: result = (int)(byte)((Number)a.value).intValue(); break;
                        case I2C: result = (int)(char)((Number)a.value).intValue(); break;
                        case I2S: result = (int)(short)((Number)a.value).intValue(); break;
                    }
                } catch (RuntimeException ignored) { }
            }
            return known(type.getType(), result, a.start);
        }
        public V binaryOperation(AbstractInsnNode n, V a, V b) throws AnalyzerException {
            BasicValue type = basic.binaryOperation(n, a, b);
            if (type == null) return null;
            Object result = UNKNOWN;
            if (a.value != UNKNOWN && b.value != UNKNOWN) {
                try {
                    if (n.getOpcode() >= IALOAD && n.getOpcode() <= SALOAD && a.value instanceof Object[]) {
                        Object item = ((Object[])a.value)[((Number)b.value).intValue()];
                        result = item == null ? NIL : item;
                    } else if (a.value instanceof Number && b.value instanceof Number) {
                        Number x = (Number)a.value, y = (Number)b.value;
                        switch (n.getOpcode()) {
                            case IADD: result=x.intValue()+y.intValue(); break; case LADD: result=x.longValue()+y.longValue(); break;
                            case ISUB: result=x.intValue()-y.intValue(); break; case LSUB: result=x.longValue()-y.longValue(); break;
                            case IMUL: result=x.intValue()*y.intValue(); break; case LMUL: result=x.longValue()*y.longValue(); break;
                            case IDIV: result=x.intValue()/y.intValue(); break; case LDIV: result=x.longValue()/y.longValue(); break;
                            case IREM: result=x.intValue()%y.intValue(); break; case LREM: result=x.longValue()%y.longValue(); break;
                            case ISHL: result=x.intValue()<<y.intValue(); break; case LSHL: result=x.longValue()<<y.intValue(); break;
                            case ISHR: result=x.intValue()>>y.intValue(); break; case LSHR: result=x.longValue()>>y.intValue(); break;
                            case IUSHR: result=x.intValue()>>>y.intValue(); break; case LUSHR: result=x.longValue()>>>y.intValue(); break;
                            case IAND: result=x.intValue()&y.intValue(); break; case LAND: result=x.longValue()&y.longValue(); break;
                            case IOR: result=x.intValue()|y.intValue(); break; case LOR: result=x.longValue()|y.longValue(); break;
                            case IXOR: result=x.intValue()^y.intValue(); break; case LXOR: result=x.longValue()^y.longValue(); break;
                            case LCMP: result=Long.compare(x.longValue(),y.longValue()); break;
                        }
                    }
                } catch (RuntimeException ignored) { }
            }
            return known(type.getType(), result, a.start);
        }
        public V ternaryOperation(AbstractInsnNode n,V a,V b,V d) { return null; }
        public V naryOperation(AbstractInsnNode n,List<? extends V> values) throws AnalyzerException {
            List<BasicValue> types = new ArrayList<>(values);
            BasicValue type = basic.naryOperation(n, types);
            if (type == null) return null;
            Object result = UNKNOWN;
            if (n instanceof MethodInsnNode && !values.isEmpty() && values.stream().noneMatch(v -> v.value == UNKNOWN)) {
                MethodInsnNode call=(MethodInsnNode)n;
                Object a=values.get(0).value;
                try {
                    if (call.owner.matches("java/lang/(Integer|Long|Double|Float|Boolean|Short|Byte|Character)")) {
                        if (call.name.equals("valueOf") && values.size()==1) result=a;
                        else if (call.name.equals("intValue")) result=((Number)a).intValue();
                        else if (call.name.equals("longValue")) result=((Number)a).longValue();
                        else if (call.name.equals("doubleValue")) result=((Number)a).doubleValue();
                        else if (call.name.equals("floatValue")) result=((Number)a).floatValue();
                    } else if (call.owner.equals("java/lang/String") && a instanceof String) {
                        if (call.name.equals("concat")) result=((String)a).concat((String)values.get(1).value);
                        if (call.name.equals("replace") && values.size()==3 && values.get(1).value instanceof String)
                            result=((String)a).replace((String)values.get(1).value,(String)values.get(2).value);
                        if (call.name.equals("length")) result=((String)a).length();
                    }
                } catch (RuntimeException ignored) { }
            }
            return known(type.getType(),result,values.isEmpty()?null:values.get(0).start);
        }
        public void returnOperation(AbstractInsnNode n,V value,V expected) { }
        public V merge(V a,V b) { return a.equals(b) ? known(a.getType(),a.value,null) : wrap(basic.merge(a,b)); }
    }

    static AbstractInsnNode next(AbstractInsnNode n) { do { n=n.getNext(); } while(n!=null && n.getOpcode()<0); return n; }
    static AbstractInsnNode prev(AbstractInsnNode n) { do { n=n.getPrevious(); } while(n!=null && n.getOpcode()<0); return n; }
    static Integer integer(AbstractInsnNode n) {
        if(n==null)return null; int op=n.getOpcode();
        if(op>=ICONST_M1 && op<=ICONST_5)return op-ICONST_0;
        if(op==BIPUSH||op==SIPUSH)return ((IntInsnNode)n).operand;
        if(n instanceof LdcInsnNode && ((LdcInsnNode)n).cst instanceof Integer)return (Integer)((LdcInsnNode)n).cst;
        return null;
    }
    static InsnList push(V value) {
        InsnList out=new InsnList();
        if(value.value==NIL)out.add(new InsnNode(ACONST_NULL));
        else {
            out.add(new LdcInsnNode(value.value));
            if(value.getType()!=null && value.getType().getSort()==Type.OBJECT && value.value instanceof Number) {
                String owner=value.value instanceof Long?"Long":value.value instanceof Double?"Double":value.value instanceof Float?"Float":"Integer";
                String desc=value.value instanceof Long?"J":value.value instanceof Double?"D":value.value instanceof Float?"F":"I";
                out.add(new MethodInsnNode(INVOKESTATIC,"java/lang/"+owner,"valueOf","("+desc+")Ljava/lang/"+owner+";",false));
            }
        }
        return out;
    }
    static boolean scalar(Object value) { return value==NIL||value instanceof Number||value instanceof String; }
    static boolean inlineTables(MethodNode method) {
        boolean changed=false;
        for(AbstractInsnNode n:method.instructions.toArray())if(n.getOpcode()==GETSTATIC) {
            FieldInsnNode field=(FieldInsnNode)n;Object[] table=TABLES.get(field.owner+"."+field.name);
            AbstractInsnNode index=next(n),load=index==null?null:next(index);Integer key=integer(index);
            if(table==null||key==null||key<0||key>=table.length||table[key]==null||load==null||load.getOpcode()<IALOAD||load.getOpcode()>SALOAD)continue;
            Type type=load.getOpcode()==AALOAD?Type.getType(Object.class):load.getOpcode()==LALOAD?Type.LONG_TYPE:load.getOpcode()==DALOAD?Type.DOUBLE_TYPE:load.getOpcode()==FALOAD?Type.FLOAT_TYPE:Type.INT_TYPE;
            method.instructions.insertBefore(n,push(new V(type,table[key],n)));
            method.instructions.remove(n);method.instructions.remove(index);method.instructions.remove(load);folds++;changed=true;
        }
        return changed;
    }
    static boolean deadLocals(MethodNode method) {
        Set<Integer> used=new HashSet<>();boolean changed=false;
        for(AbstractInsnNode n:method.instructions.toArray()) {
            if(n instanceof VarInsnNode&&n.getOpcode()>=ILOAD&&n.getOpcode()<=ALOAD)used.add(((VarInsnNode)n).var);
            if(n instanceof IincInsnNode)used.add(((IincInsnNode)n).var);
        }
        for(AbstractInsnNode n:method.instructions.toArray())if(n instanceof VarInsnNode&&n.getOpcode()>=ISTORE&&n.getOpcode()<=ASTORE&&!used.contains(((VarInsnNode)n).var)) {
            method.instructions.set(n,new InsnNode(n.getOpcode()==LSTORE||n.getOpcode()==DSTORE?POP2:POP));changed=true;
        }
        for(AbstractInsnNode n:method.instructions.toArray())if(n.getOpcode()==POP||n.getOpcode()==POP2) {
            AbstractInsnNode p=prev(n);
            int size=producerSize(p);
            if(size==(n.getOpcode()==POP?1:2)) {
                method.instructions.remove(p);method.instructions.remove(n);changed=true;
            } else if(n.getOpcode()==POP2 && size==1 && producerSize(prev(p))==1) {
                AbstractInsnNode first=prev(p);method.instructions.remove(first);method.instructions.remove(p);method.instructions.remove(n);changed=true;
            }
        }
        return changed;
    }
    static int producerSize(AbstractInsnNode node) {
        if(node==null)return 0;
        int op=node.getOpcode();
        if(node instanceof LdcInsnNode)return ((LdcInsnNode)node).cst instanceof Long||((LdcInsnNode)node).cst instanceof Double?2:1;
        if(op==LCONST_0||op==LCONST_1||op==DCONST_0||op==DCONST_1||op==LLOAD||op==DLOAD)return 2;
        if(integer(node)!=null||op==ACONST_NULL||op==FCONST_0||op==FCONST_1||op==FCONST_2||op==ILOAD||op==FLOAD||op==ALOAD)return 1;
        return 0;
    }
    static boolean pure(AbstractInsnNode n) {
        int op=n.getOpcode(); if(op<0)return !(n instanceof LabelNode);
        if(n instanceof LdcInsnNode || (op>=ACONST_NULL&&op<=ALOAD))return true;
        if(n instanceof VarInsnNode)return op>=ILOAD&&op<=ALOAD;
        if(op>=IALOAD&&op<=SALOAD)return true;
        if(op>=IADD&&op<=DCMPG)return true;
        if(op==CHECKCAST||op==ARRAYLENGTH)return true;
        if(op==GETSTATIC) { FieldInsnNode f=(FieldInsnNode)n; return TABLES.containsKey(f.owner+"."+f.name); }
        if(n instanceof MethodInsnNode) {
            MethodInsnNode m=(MethodInsnNode)n;
            return m.owner.matches("java/lang/(Integer|Long|Double|Float|Boolean|Short|Byte|Character)")
                    || (m.owner.equals("java/lang/String") && Arrays.asList("replace","concat","length").contains(m.name));
        }
        return false;
    }
    static boolean foldRange(MethodNode method,AbstractInsnNode end,V value) {
        if(value==null||!scalar(value.value)||value.start==null||value.start==end)return false;
        AbstractInsnNode node=value.start;
        while(node!=end) { if(node==null||!pure(node))return false; node=node.getNext(); }
        if(!pure(end))return false;
        method.instructions.insertBefore(value.start,push(value));
        node=value.start;
        while(true) { AbstractInsnNode after=node.getNext();method.instructions.remove(node);if(node==end)break;node=after; }
        folds++;return true;
    }
    static boolean promote(String owner,MethodNode method) throws Exception {
        Frame<SourceValue>[] frames=new Analyzer<>(new Provenance()).analyze(owner,method);
        AbstractInsnNode[] nodes=method.instructions.toArray();Map<AbstractInsnNode,Integer> indexes=new IdentityHashMap<>();
        for(int i=0;i<nodes.length;i++)indexes.put(nodes[i],i);
        Map<Integer,VarInsnNode> allocations=new HashMap<>();Map<Integer,Integer> sizes=new HashMap<>();
        for(AbstractInsnNode n:nodes)if(n instanceof VarInsnNode && n.getOpcode()==ASTORE) {
            AbstractInsnNode array=prev(n),length=array==null?null:prev(array);Integer size=integer(length);
            if(array instanceof TypeInsnNode && array.getOpcode()==ANEWARRAY && ((TypeInsnNode)array).desc.equals("java/lang/Object") && size!=null && size>=1 && size<=512) {
                int local=((VarInsnNode)n).var;
                if(allocations.containsKey(local))sizes.remove(local);else { allocations.put(local,(VarInsnNode)n);sizes.put(local,size); }
            }
        }
        boolean changed=false;
        for(int local:new ArrayList<>(sizes.keySet())) {
            List<AbstractInsnNode[]> accesses=new ArrayList<>();Set<AbstractInsnNode> used=Collections.newSetFromMap(new IdentityHashMap<>());
            boolean valid=true;
            for(int i=0;i<nodes.length;i++) {
                AbstractInsnNode n=nodes[i];Frame<SourceValue> f=frames[i];
                if(f==null || (n.getOpcode()!=AALOAD&&n.getOpcode()!=AASTORE))continue;
                int k=f.getStackSize()-(n.getOpcode()==AALOAD?2:3);
                SourceValue array=f.getStack(k),index=f.getStack(k+1);
                if(array.insns.size()!=1||index.insns.size()!=1)continue;
                AbstractInsnNode a=array.insns.iterator().next(),b=index.insns.iterator().next();
                if(!(a instanceof VarInsnNode)||a.getOpcode()!=ALOAD||((VarInsnNode)a).var!=local)continue;
                Integer cell=integer(b);
                if(cell==null||cell<0||cell>=sizes.get(local)){valid=false;break;}
                accesses.add(new AbstractInsnNode[]{n,a,b});used.add(a);
            }
            for(AbstractInsnNode n:nodes)if(n instanceof VarInsnNode && ((VarInsnNode)n).var==local && n.getOpcode()==ALOAD && !used.contains(n))valid=false;
            if(!valid||accesses.isEmpty())continue;
            int first=method.maxLocals;method.maxLocals+=sizes.get(local);
            for(AbstractInsnNode[] access:accesses) {
                int cell=integer(access[2]);
                InsnList replacement=new InsnList();
                if(access[0].getOpcode()==AALOAD) {
                    replacement.add(new InsnNode(POP2));replacement.add(new VarInsnNode(ALOAD,first+cell));
                } else {
                    replacement.add(new VarInsnNode(ASTORE,first+cell));replacement.add(new InsnNode(POP2));
                }
                method.instructions.insertBefore(access[0],replacement);method.instructions.remove(access[0]);
            }
            VarInsnNode store=allocations.get(local);
            InsnList init=new InsnList();for(int i=0;i<sizes.get(local);i++){init.add(new InsnNode(ACONST_NULL));init.add(new VarInsnNode(ASTORE,first+i));}
            method.instructions.insert(store,init);
            promotions++;changed=true;
        }
        return changed;
    }
    static boolean unflatten(MethodNode method) {
        boolean changed=false;
        for(AbstractInsnNode n:method.instructions.toArray())if(n instanceof LookupSwitchInsnNode) {
            AbstractInsnNode selector=prev(n);if(!(selector instanceof VarInsnNode)||selector.getOpcode()!=ILOAD)continue;
            int local=((VarInsnNode)selector).var;boolean valid=true;List<VarInsnNode> stores=new ArrayList<>();
            for(AbstractInsnNode m:method.instructions.toArray())if(m instanceof VarInsnNode && ((VarInsnNode)m).var==local) {
                if(m==selector)continue;
                AbstractInsnNode after=next(m);
                if(m.getOpcode()!=ISTORE||integer(prev(m))==null||m.getPrevious()!=prev(m)|| !(after==selector || after instanceof JumpInsnNode && after.getOpcode()==GOTO && next(((JumpInsnNode)after).label)==selector)){valid=false;break;}
                stores.add((VarInsnNode)m);
            }
            if(!valid||stores.isEmpty())continue;
            LookupSwitchInsnNode sw=(LookupSwitchInsnNode)n;
            for(VarInsnNode store:stores) {
                AbstractInsnNode number=prev(store),after=next(store);int key=integer(number),index=sw.keys.indexOf(key);
                LabelNode target=index<0?sw.dflt:sw.labels.get(index);
                method.instructions.set(store,new JumpInsnNode(GOTO,target));method.instructions.remove(number);
                if(after!=selector)method.instructions.remove(after);
                routes++;changed=true;
            }
        }
        return changed;
    }
    static void unreachable(String owner,MethodNode method) throws Exception {
        Frame<BasicValue>[] frames=new Analyzer<>(new BasicInterpreter()).analyze(owner,method);
        AbstractInsnNode[] nodes=method.instructions.toArray();Set<LabelNode> dead=new HashSet<>();
        for(int i=0;i<nodes.length;i++)if(frames[i]==null){if(nodes[i] instanceof LabelNode)dead.add((LabelNode)nodes[i]);else if(nodes[i].getOpcode()>=0)method.instructions.remove(nodes[i]);}
        method.tryCatchBlocks.removeIf(t->dead.contains(t.handler));
    }
    static void clean(String owner,MethodNode method) throws Exception {
        if(method.instructions.size()==0)return;
        method.maxStack+=64;
        for(AbstractInsnNode n:method.instructions.toArray()) {
            if(n instanceof FrameNode)method.instructions.remove(n);
            if(n instanceof FieldInsnNode && n.getOpcode()==GETSTATIC && ((FieldInsnNode)n).name.equals("o0o000o0O0o0"))method.instructions.set(n,new InsnNode(ICONST_0));
        }
        inlineTables(method);
        promote(owner,method);
        for(int round=0;round<100;round++) {
            boolean changed=false;Constants interpreter=new Constants();Frame<V>[] frames=new Analyzer<>(interpreter).analyze(owner,method);
            AbstractInsnNode[] nodes=method.instructions.toArray();
            for(int i=nodes.length-1;i>=0;i--) {
                AbstractInsnNode n=nodes[i];Frame<V> f=frames[i];if(f==null)continue;
                int op=n.getOpcode();V value=null;
                if(n instanceof VarInsnNode && op>=ILOAD&&op<=ALOAD) {
                    value=f.getLocal(((VarInsnNode)n).var);
                    if(value!=null&&scalar(value.value)){method.instructions.insertBefore(n,push(value));method.instructions.remove(n);folds++;changed=true;}continue;
                }
                if(op>=IALOAD&&op<=SALOAD || op>=IADD&&op<=DCMPG) {
                    if(op==INEG||op==LNEG||op==FNEG||op==DNEG||op>=I2L&&op<=I2S)value=interpreter.unaryOperation(n,f.getStack(f.getStackSize()-1));
                    else if(f.getStackSize()>=2)value=interpreter.binaryOperation(n,f.getStack(f.getStackSize()-2),f.getStack(f.getStackSize()-1));
                } else if(op==CHECKCAST||op==ARRAYLENGTH)value=interpreter.unaryOperation(n,f.getStack(f.getStackSize()-1));
                else if(n instanceof MethodInsnNode) {
                    MethodInsnNode m=(MethodInsnNode)n;int args=Type.getArgumentTypes(m.desc).length+(op==INVOKESTATIC?0:1);
                    List<V> values=new ArrayList<>();for(int j=f.getStackSize()-args;j<f.getStackSize();j++)values.add(f.getStack(j));value=interpreter.naryOperation(n,values);
                }
                if(foldRange(method,n,value)){changed=true;break;}
            }
            changed|=deadLocals(method);
            changed|=unflatten(method);unreachable(owner,method);
            if(!changed)break;
        }
    }
    static void tables(Path path) throws Exception {
        Map<String,Map<Integer,Object>> entries=new HashMap<>();
        for(String line:Files.readAllLines(path,StandardCharsets.UTF_8)) {
            String[] p=line.split("\t");String s=new String(Base64.getDecoder().decode(p[4]),StandardCharsets.UTF_8);Object value;
            switch(p[3]){case "I":value=Integer.valueOf(s);break;case "J":value=Long.valueOf(s);break;case "D":value=Double.valueOf(s);break;case "F":value=Float.valueOf(s);break;default:value=s;}
            entries.computeIfAbsent(p[0]+"."+p[1],k->new HashMap<>()).put(Integer.parseInt(p[2]),value);
        }
        for(Map.Entry<String,Map<Integer,Object>> entry:entries.entrySet()) {
            int size=Collections.max(entry.getValue().keySet())+1;Object[] array=new Object[size];entry.getValue().forEach((i,v)->array[i]=v);TABLES.put(entry.getKey(),array);
        }
    }
    public static void main(String[] args) throws Exception {
        tables(Paths.get(args[1]));int count=0,failures=0;
        try(ZipFile input=new ZipFile(args[0]);ZipOutputStream output=new ZipOutputStream(Files.newOutputStream(Paths.get(args[2])))) {
            Enumeration<? extends ZipEntry> graph=input.entries();
            while(graph.hasMoreElements()) {
                ZipEntry entry=graph.nextElement();if(!entry.getName().endsWith(".class"))continue;
                ClassReader reader=new ClassReader(input.getInputStream(entry));String[] parents=reader.getInterfaces();String[] relation=new String[parents.length+1];relation[0]=reader.getSuperName();System.arraycopy(parents,0,relation,1,parents.length);HIERARCHY.put(reader.getClassName(),relation);
            }
            Enumeration<? extends ZipEntry> entries=input.entries();
            while(entries.hasMoreElements()) {
                ZipEntry entry=entries.nextElement();byte[] data=input.getInputStream(entry).readAllBytes();
                if(entry.getName().endsWith(".class")) {
                    byte[] readable=data.clone();readable[6]=0;readable[7]=61;
                    ClassNode type=new ClassNode();new ClassReader(readable).accept(type,ClassReader.SKIP_FRAMES);
                    if(type.fields.stream().anyMatch(f->f.name.equals("O0OoOO0OOOOO"))) {
                        for(MethodNode method:type.methods) {
                            MethodNode original=new MethodNode(method.access,method.name,method.desc,method.signature,method.exceptions.toArray(new String[0]));method.accept(original);
                            try { clean(type.name,method); } catch(Exception error) {
                                original.maxStack+=64;
                                inlineTables(original);
                                new Analyzer<>(new BasicInterpreter()).analyze(type.name,original);
                                int index=type.methods.indexOf(method);type.methods.set(index,original);failures++;System.out.println("Preserved "+type.name+"."+method.name+method.desc+": "+error);
                            }
                        }
                        ClassWriter writer=new Writer();type.accept(writer);data=writer.toByteArray();
                    }
                    count++;
                }
                output.putNextEntry(new ZipEntry(entry.getName()));output.write(data);output.closeEntry();
            }
        }
        System.out.println("Classes "+count+", folds "+folds+", arrays "+promotions+", routes "+routes+", preserved methods "+failures);
    }
}
