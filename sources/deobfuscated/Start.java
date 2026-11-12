/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.Arrays;
import net.minecraft.client.main.Main;
import rise.Client;

public class Start {
    public static void main(String[] stringArray) {
        String string = System.getProperty("user.home", ".");
        String string2 = System.getenv("APPDATA");
        String string3 = string2 != null ? string2 : string;
        File file = new File(string3, ".minecraft/");
        boolean bl2 = !System.getProperty("os.name").toLowerCase().contains("mac");
        Main.main(Start.concat(new String[]{"--version", Client.b, "--accessToken", "0", bl2 ? "--gameDir" : "", bl2 ? new File(file, ".").getAbsolutePath() : "", "--assetsDir", bl2 ? new File(file, "assets/").getAbsolutePath() : "assets", "--assetIndex", "1.8", "--userProperties", "{}"}, stringArray));
    }

    public static <T> T[] concat(T[] TArray, T[] TArray2) {
        T[] TArray3 = Arrays.copyOf(TArray, TArray.length + TArray2.length);
        System.arraycopy(TArray2, 0, TArray3, TArray.length, TArray2.length);
        return TArray3;
    }
}

