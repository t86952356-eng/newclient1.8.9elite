package rise.local.config;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public final class ProfileDefaultsTest {
    public static void main(String[] args)throws Exception {
        Path root=Paths.get(args[0]);
        OnlineConfigRepository repository=new OnlineConfigRepository(root.resolve("catalog"));
        Path game=root.resolve("game"),profile=game.resolve("Rise/configs/latest.json");
        if(!ConfigRuntime.installDefaultProfile(game,repository))throw new AssertionError("Initial profile was not created");
        if(!Files.readString(profile).equals(repository.config("Hypixel1.8")))throw new AssertionError("Default config differs from the verified CAS snapshot");
        String custom="{\"custom\":true}";Files.writeString(profile,custom,StandardCharsets.UTF_8);
        if(ConfigRuntime.installDefaultProfile(game,repository))throw new AssertionError("Existing profile was replaced");
        if(!Files.readString(profile).equals(custom))throw new AssertionError("Existing profile was modified");
        System.out.println("Initial Hypixel 1.8 profile and preservation of existing settings passed.");
    }
}
