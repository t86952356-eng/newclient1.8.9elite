import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;

public class RemapClient {
    public static void main(String[] args) throws Exception {
        Map<String,String> names=new HashMap<>(),members=new HashMap<>();Map<String,List<String>> parents=new HashMap<>();
        for(String line:Files.readAllLines(Paths.get(args[1]))) {String[] p=line.split("\t");names.put(p[0],p[1]);}
        for(String line:Files.readAllLines(Paths.get(args[2]))) {String[] p=line.split("\t");members.put(p[0]+":"+p[1]+"."+p[2]+p[3],p[4]);}
        try(ZipFile input=new ZipFile(args[0]);ZipOutputStream output=new ZipOutputStream(Files.newOutputStream(Paths.get(args[3])))) {
            Enumeration<? extends ZipEntry> entries=input.entries();
            while(entries.hasMoreElements()) {
                ZipEntry entry=entries.nextElement();if(!entry.getName().endsWith(".class"))continue;
                ClassReader reader=new ClassReader(input.getInputStream(entry));List<String> relation=new ArrayList<>(Arrays.asList(reader.getInterfaces()));if(reader.getSuperName()!=null)relation.add(reader.getSuperName());parents.put(reader.getClassName(),relation);
            }
            Remapper mapper=new Remapper(Opcodes.ASM9) {
                public String map(String name) {return names.getOrDefault(name,name);}
                String member(String kind,String owner,String name,String descriptor,Set<String> visited) {
                    if(!visited.add(owner))return null;
                    String result=members.get(kind+":"+owner+"."+name+descriptor);if(result!=null)return result;
                    for(String parent:parents.getOrDefault(owner,Collections.emptyList())) {result=member(kind,parent,name,descriptor,visited);if(result!=null)return result;}
                    return null;
                }
                public String mapFieldName(String owner,String name,String descriptor) {String result=member("F",owner,name,descriptor,new HashSet<>());return result==null?name:result;}
                public String mapMethodName(String owner,String name,String descriptor) {String result=member("M",owner,name,descriptor,new HashSet<>());return result==null?name:result;}
                public String mapAnnotationAttributeName(String descriptor,String name) {
                    String prefix="M:"+Type.getType(descriptor).getInternalName()+"."+name+"()";
                    for(Map.Entry<String,String> entry:members.entrySet())if(entry.getKey().startsWith(prefix))return entry.getValue();
                    return name;
                }
            };
            entries=input.entries();int count=0;
            while(entries.hasMoreElements()) {
                ZipEntry entry=entries.nextElement();byte[] data=input.getInputStream(entry).readAllBytes();String name=entry.getName();
                if(name.endsWith(".class")) {
                    ClassReader reader=new ClassReader(data);ClassWriter writer=new ClassWriter(0);reader.accept(new ClassRemapper(writer,mapper),0);data=writer.toByteArray();name=mapper.map(reader.getClassName())+".class";count++;
                }
                output.putNextEntry(new ZipEntry(name));output.write(data);output.closeEntry();
            }
            System.out.println("Remapped "+count+" classes; semantic names "+names.size()+"; member names "+members.size());
        }
    }
}
