import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class BuildOfflinePatch implements Opcodes {
    static final String CORE="rip/vantage/network/core/a";
    static final String HANDLER="rip/vantage/network/handler/c";
    static final String CONFIG="rise/local/config/ConfigRuntime";
    static final String RAW_MOUSE="rise/local/input/RawMouseInput";
    static final Set<String> DISABLED=Collections.emptySet();
    static void reset(MethodNode method) {
        method.access&=~(ACC_NATIVE|ACC_ABSTRACT);method.instructions.clear();method.tryCatchBlocks.clear();
        if(method.localVariables!=null)method.localVariables.clear();
        method.visibleLocalVariableAnnotations=null;method.invisibleLocalVariableAnnotations=null;
        method.maxStack=32;method.maxLocals=16;
    }
    static void defaults(MethodNode method) {
        reset(method);Type result=Type.getReturnType(method.desc);
        switch(result.getSort()) {
            case Type.VOID:method.instructions.add(new InsnNode(RETURN));break;
            case Type.LONG:method.instructions.add(new InsnNode(LCONST_0));method.instructions.add(new InsnNode(LRETURN));break;
            case Type.FLOAT:method.instructions.add(new InsnNode(FCONST_0));method.instructions.add(new InsnNode(FRETURN));break;
            case Type.DOUBLE:method.instructions.add(new InsnNode(DCONST_0));method.instructions.add(new InsnNode(DRETURN));break;
            case Type.OBJECT:case Type.ARRAY:
                if(result.equals(Type.getType(String.class)))method.instructions.add(new LdcInsnNode(""));else method.instructions.add(new InsnNode(ACONST_NULL));
                method.instructions.add(new InsnNode(ARETURN));break;
            default:method.instructions.add(new InsnNode(ICONST_0));method.instructions.add(new InsnNode(IRETURN));
        }
    }
    static void objectConstructor(MethodNode method) {
        reset(method);method.instructions.add(new VarInsnNode(ALOAD,0));
        method.instructions.add(new MethodInsnNode(INVOKESPECIAL,"java/lang/Object","<init>","()V",false));
    }
    static void initialize(InsnList instructions,ClassNode owner,String field,String type) {
        FieldNode target=owner.fields.stream().filter(value->value.name.equals(field)).findFirst().orElseThrow();
        boolean statik=(target.access&ACC_STATIC)!=0;
        if(!statik)instructions.add(new VarInsnNode(ALOAD,0));
        instructions.add(new TypeInsnNode(NEW,type));instructions.add(new InsnNode(DUP));
        instructions.add(new MethodInsnNode(INVOKESPECIAL,type,"<init>","()V",false));instructions.add(new FieldInsnNode(statik?PUTSTATIC:PUTFIELD,owner.name,field,"L"+type+";"));
    }
    static void fieldReturn(MethodNode method,String owner,String field,String descriptor,boolean statik) {
        reset(method);if(!statik)method.instructions.add(new VarInsnNode(ALOAD,0));
        method.instructions.add(new FieldInsnNode(statik?GETSTATIC:GETFIELD,owner,field,descriptor));method.instructions.add(new InsnNode(ARETURN));
    }
    static void stubNetwork(ClassNode type) {
        for(MethodNode method:type.methods) {
            if(type.name.equals("rip/vantage/network/handler/b")&&(method.desc.equals("(Lrip/vantage/commons/packet/impl/server/protection/f;)V")||method.name.equals("q"))) {
                for(AbstractInsnNode node:method.instructions.toArray()) {
                    if(node instanceof FieldInsnNode field&&field.owner.startsWith("hackclient/rise/")&&field.desc.equals("Ljava/util/concurrent/Executor;")){field.owner=CONFIG;field.name="MAIN_THREAD";}
                    if(node instanceof MethodInsnNode call&&call.owner.equals("rip/vantage/util/a")) {
                        if(call.name.equals("n")&&call.desc.equals("(Lhackclient/rise/gi;)[Ljava/lang/String;")){call.owner=CONFIG;call.name="moduleAliases";call.desc="(Ljava/lang/Object;)[Ljava/lang/String;";}
                        else if(call.name.equals("a")&&(call.desc.equals("(Ljava/lang/Runnable;)V")||call.desc.equals("(Lrip/vantage/util/c;)V"))){call.owner=CONFIG;call.name="onMainThread";call.desc="(Ljava/lang/Runnable;)V";}
                    }
                    if(node instanceof InvokeDynamicInsnNode dynamic&&dynamic.desc.endsWith("Lrip/vantage/util/c;"))dynamic.desc=dynamic.desc.substring(0,dynamic.desc.length()-"Lrip/vantage/util/c;".length())+"Ljava/lang/Runnable;";
                    if(node instanceof MethodInsnNode call&&call.owner.equals("java/lang/String")&&call.name.equals("contains")) {
                        call.setOpcode(INVOKESTATIC);call.owner=CONFIG;call.name="containsDelimiter";call.desc="(Ljava/lang/String;Ljava/lang/CharSequence;)Z";
                    }
                    if(node instanceof MethodInsnNode call&&call.owner.equals("java/lang/String")&&call.name.equals("split")&&call.desc.equals("(Ljava/lang/String;)[Ljava/lang/String;")) {
                        call.setOpcode(INVOKESTATIC);call.owner=CONFIG;call.name="splitConfig";call.desc="(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;";
                    }
                }
                continue;
            }
            if(type.name.equals(HANDLER)&&method.name.equals("sendMessage")) {
                reset(method);method.instructions.add(new VarInsnNode(ALOAD,1));method.instructions.add(new MethodInsnNode(INVOKESTATIC,CONFIG,"sendMessage","(Ljava/lang/String;)V",false));method.instructions.add(new InsnNode(RETURN));continue;
            }
            if(method.name.equals("<init>")) {
                objectConstructor(method);
                if(type.name.equals(CORE)) {
                    initialize(method.instructions,type,"eSg","rip/vantage/commons/util/time/a");
                    initialize(method.instructions,type,"ddr",HANDLER);
                    initialize(method.instructions,type,"eSe","rip/vantage/network/handler/b");
                    method.instructions.add(new VarInsnNode(ALOAD,0));method.instructions.add(new InsnNode(ICONST_1));method.instructions.add(new FieldInsnNode(PUTFIELD,CORE,"eSf","Z"));
                    method.instructions.add(new VarInsnNode(ALOAD,0));method.instructions.add(new LdcInsnNode("rise.offline.username"));method.instructions.add(new LdcInsnNode("User"));
                    method.instructions.add(new MethodInsnNode(INVOKESTATIC,"java/lang/System","getProperty","(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",false));
                    method.instructions.add(new FieldInsnNode(PUTFIELD,CORE,"aCU","Ljava/lang/String;"));
                } else {
                    String field=type.name.equals(HANDLER)?"eSp":"eSm";
                    initialize(method.instructions,type,field,"rip/vantage/commons/util/time/a");
                }
                method.instructions.add(new InsnNode(RETURN));
            } else if(method.name.equals("<clinit>")&&type.name.equals(CORE)) {
                reset(method);method.instructions.add(new TypeInsnNode(NEW,CORE));method.instructions.add(new InsnNode(DUP));
                method.instructions.add(new MethodInsnNode(INVOKESPECIAL,CORE,"<init>","()V",false));
                method.instructions.add(new FieldInsnNode(PUTSTATIC,CORE,"eSc","L"+CORE+";"));method.instructions.add(new InsnNode(RETURN));
            } else if(type.name.equals(CORE)&&method.name.equals("aKQ"))fieldReturn(method,CORE,"eSc","L"+CORE+";",true);
            else if(type.name.equals(CORE)&&method.name.equals("aKZ"))fieldReturn(method,CORE,"ddr","L"+HANDLER+";",false);
            else if(type.name.equals(CORE)&&method.name.equals("aKY"))fieldReturn(method,CORE,"eSe","Lrip/vantage/network/handler/b;",false);
            else if(type.name.equals(CORE)&&method.name.equals("bX"))fieldReturn(method,CORE,"aCU","Ljava/lang/String;",false);
            else if(type.name.equals(CORE)&&method.name.equals("aLa"))fieldReturn(method,CORE,"eSg","Lrip/vantage/commons/util/time/a;",false);
            else if(type.name.equals(CORE)&&method.name.equals("kk")) {
                reset(method);method.instructions.add(new VarInsnNode(ALOAD,0));method.instructions.add(new VarInsnNode(ALOAD,1));
                method.instructions.add(new FieldInsnNode(PUTFIELD,CORE,"aCU","Ljava/lang/String;"));method.instructions.add(new InsnNode(RETURN));
            }
            else if(type.name.equals(CORE)&&method.name.equals("f")) {
                reset(method);method.instructions.add(new VarInsnNode(ALOAD,0));method.instructions.add(new VarInsnNode(ALOAD,1));
                method.instructions.add(new FieldInsnNode(PUTFIELD,CORE,"eSg","Lrip/vantage/commons/util/time/a;"));method.instructions.add(new InsnNode(RETURN));
            }
            else defaults(method);
        }
    }
    static AbstractInsnNode previous(AbstractInsnNode node) { do{node=node.getPrevious();}while(node!=null&&node.getOpcode()<0);return node; }
    static AbstractInsnNode next(AbstractInsnNode node) { do{node=node.getNext();}while(node!=null&&node.getOpcode()<0);return node; }
    static boolean patch(ClassNode type) {
        boolean changed=false;
        if(type.name.equals(CORE)||type.name.equals(HANDLER)||type.name.equals("rip/vantage/network/handler/b")){stubNetwork(type);return true;}
        for(MethodNode method:type.methods) {
            if(type.name.equals("net/minecraft/util/cb")) {
                if(method.name.equals("atu")) {
                    reset(method);method.instructions.add(new VarInsnNode(ALOAD,0));method.instructions.add(new MethodInsnNode(INVOKESTATIC,RAW_MOUSE,"update","(Ljava/lang/Object;)V",false));method.instructions.add(new InsnNode(RETURN));changed=true;
                }
                if(method.name.equals("ats")||method.name.equals("att")) {
                    InsnList hook=new InsnList();hook.add(new InsnNode(method.name.equals("ats")?ICONST_1:ICONST_0));hook.add(new MethodInsnNode(INVOKESTATIC,RAW_MOUSE,"capture","(Z)V",false));
                    if(method.name.equals("att"))method.instructions.insert(hook);
                    else for(AbstractInsnNode node:method.instructions.toArray())if(node.getOpcode()==RETURN){method.instructions.insertBefore(node,hook);break;}
                    changed=true;
                }
            }
            if(type.name.equals("net/minecraft/client/renderer/EntityRenderer")&&method.name.equals("a")&&method.desc.equals("(FJ)V")) {
                method.instructions.insert(new MethodInsnNode(INVOKESTATIC,RAW_MOUSE,"syncFocus","()V",false));changed=true;
            }
            if(type.name.equals("hackclient/rise/afz")&&method.name.equals("tt")) {
                reset(method);method.instructions.add(new VarInsnNode(ALOAD,0));method.instructions.add(new MethodInsnNode(INVOKESTATIC,CONFIG,"loadFile","(Ljava/lang/Object;)Z",false));method.instructions.add(new InsnNode(IRETURN));changed=true;
            }
            if(type.name.equals("hackclient/rise/acd")&&method.name.equals("qy")) {
                reset(method);method.instructions.add(new MethodInsnNode(INVOKESTATIC,CONFIG,"featuredTuples","()Ljava/util/ArrayList;",false));method.instructions.add(new InsnNode(ARETURN));changed=true;
            }
            if(type.name.equals("hackclient/rise/aao")&&Arrays.asList("init","a","or","os","ou").contains(method.name)) {defaults(method);changed=true;}
            if(type.name.equals("hackclient/rise/abs")&&method.name.equals("<init>")){objectConstructor(method);method.instructions.add(new InsnNode(RETURN));changed=true;}
            if(type.name.equals("hackclient/rise/abs")&&method.name.equals("<clinit>")){defaults(method);changed=true;}
            for(AbstractInsnNode node:method.instructions.toArray()) {
                if(type.name.equals("hackclient/rise/acd")&&node instanceof MethodInsnNode call&&call.owner.equals("hackclient/rise/aef")&&call.name.equals("aY")){call.owner=CONFIG;call.name="fetchUrl";changed=true;}
                if(type.name.equals("hackclient/rise/adq")&&node instanceof TypeInsnNode&&((TypeInsnNode)node).desc.equals("hackclient/rise/aap")) {
                    ((TypeInsnNode)node).desc="hackclient/rise/adu";
                    if(node.getOpcode()==NEW)method.instructions.insertBefore(node,new MethodInsnNode(INVOKESTATIC,CONFIG,"restoreProfile","()V",false));changed=true;
                }
                if(type.name.equals("hackclient/rise/adq")&&node instanceof MethodInsnNode&&((MethodInsnNode)node).owner.equals("hackclient/rise/aap")){((MethodInsnNode)node).owner="hackclient/rise/adu";if(((MethodInsnNode)node).name.equals("<init>"))method.instructions.insert(node,new MethodInsnNode(INVOKESTATIC,"OfflineBootstrap","clientReady","()V",false));changed=true;}
                if(type.name.equals("hackclient/rise/al")&&node instanceof TypeInsnNode&&node.getOpcode()==NEW&&DISABLED.contains(((TypeInsnNode)node).desc)) {
                    AbstractInsnNode load=previous(node),dup=next(node),ctor=next(dup),register=next(ctor);
                    if(load instanceof VarInsnNode&&load.getOpcode()==ALOAD&&dup.getOpcode()==DUP&&ctor instanceof MethodInsnNode&&register instanceof MethodInsnNode&&((MethodInsnNode)register).name.equals("a")) {
                        method.instructions.remove(load);method.instructions.remove(node);method.instructions.remove(dup);method.instructions.remove(ctor);method.instructions.remove(register);changed=true;
                    }
                }
            }
        }
        return changed;
    }
    public static void main(String[] args)throws Exception {
        int count=0;List<String> names=new ArrayList<>();
        try(ZipFile input=new ZipFile(args[0]);JarOutputStream output=new JarOutputStream(Files.newOutputStream(Paths.get(args[1])))) {
            Enumeration<? extends ZipEntry> graph=input.entries();
            while(graph.hasMoreElements()) {
                ZipEntry entry=graph.nextElement();if(!entry.getName().endsWith(".class"))continue;
                ClassReader reader=new ClassReader(input.getInputStream(entry));String[] interfaces=reader.getInterfaces();String[] relation=new String[interfaces.length+1];relation[0]=reader.getSuperName();System.arraycopy(interfaces,0,relation,1,interfaces.length);CleanBytecode.HIERARCHY.put(reader.getClassName(),relation);
            }
            graph=input.entries();while(graph.hasMoreElements()) {
                ZipEntry entry=graph.nextElement();if(!entry.getName().endsWith(".class"))continue;
                ClassNode type=new ClassNode();new ClassReader(input.getInputStream(entry)).accept(type,ClassReader.SKIP_FRAMES);
                if(!patch(type))continue;
                ClassWriter writer=new CleanBytecode.Writer();type.accept(writer);output.putNextEntry(new JarEntry(entry.getName()));output.write(writer.toByteArray());output.closeEntry();names.add(type.name);count++;
            }
        }
        Files.write(Paths.get(args[2]),names);System.out.println("Offline classes patched: "+count+" "+names);
    }
}
