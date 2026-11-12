import java.util.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;

public class VerifyBytecode {
    public static void main(String[] args) throws Exception {
        int classes=0,methods=0,natives=0,failures=0;
        try(ZipFile zip=new ZipFile(args[0])) {
            Enumeration<? extends ZipEntry> entries=zip.entries();
            while(entries.hasMoreElements()) {
                ZipEntry entry=entries.nextElement();if(!entry.getName().endsWith(".class"))continue;
                ClassNode type=new ClassNode();new ClassReader(zip.getInputStream(entry)).accept(type,ClassReader.SKIP_FRAMES);classes++;
                Set<String> signatures=new HashSet<>();
                for(MethodNode method:type.methods) {
                    if(!signatures.add(method.name+method.desc))throw new AssertionError("Duplicate method "+type.name+"."+method.name+method.desc);
                    if((method.access&Opcodes.ACC_NATIVE)!=0)natives++;
                    if(method.instructions.size()==0)continue;
                    try {new Analyzer<>(new BasicVerifier()).analyze(type.name,method);methods++;}
                    catch(Exception error){failures++;System.out.println(type.name+"."+method.name+method.desc+": "+error);}
                }
            }
        }
        System.out.println("Verified classes="+classes+" methods="+methods+" nativeDeclarations="+natives+" failures="+failures);
        if(failures!=0)System.exit(1);
    }
}
