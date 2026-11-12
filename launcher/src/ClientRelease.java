import java.io.InputStream;
import java.util.Properties;

public final class ClientRelease {
    private static final Properties metadata = new Properties();
    static {
        try (InputStream input = ClientRelease.class.getResourceAsStream("/client-release.properties")) {
            if (input != null) metadata.load(input);
        } catch (Exception error) { throw new ExceptionInInitializerError(error); }
    }
    public static final String VERSION = metadata.getProperty("version", "Unknown");
    public static final String LAUNCHER = metadata.getProperty("launcher", "2.6");
    private ClientRelease() { }
}
