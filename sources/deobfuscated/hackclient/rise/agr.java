/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.Hashing
 *  com.google.common.io.ByteSource
 *  com.google.common.io.Files
 */
package hackclient.rise;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteSource;
import com.google.common.io.Files;
import hackclient.rise.aej;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class agr {
    public static String uo() {
        try {
            File file = new File(aej.sn());
            ByteSource byteSource = Files.asByteSource((File)file);
            HashCode hashCode = byteSource.hash(Hashing.md5());
            String string = hashCode.toString();
            return string;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new RuntimeException(uRISyntaxException);
        }
        return "";
    }
}

