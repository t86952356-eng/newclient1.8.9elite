/*
 * Decompiled with CFR 0.152.
 */
package de.brownie.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

public class FileUtil {
    private static final Gson gson = new Gson();

    public static void downloadFile(String urlStr, File destination) throws IOException {
        FileUtil.downloadFile(urlStr, destination, null);
    }

    public static void downloadFile(String urlStr, File destination, ProgressCallback callback) throws IOException {
        System.out.println("Downloading " + urlStr + " to " + destination.getAbsolutePath() + "...");
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        long fileLength = connection.getContentLengthLong();
        try (BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
             FileOutputStream out = new FileOutputStream(destination);){
            int bytesRead;
            byte[] buffer = new byte[8192];
            long totalBytesRead = 0L;
            int lastPercent = -1;
            while ((bytesRead = ((InputStream)in).read(buffer)) != -1) {
                int percent;
                out.write(buffer, 0, bytesRead);
                if (fileLength <= 0L || callback == null || (percent = (int)((totalBytesRead += (long)bytesRead) * 100L / fileLength)) == lastPercent) continue;
                callback.onProgress(percent);
                lastPercent = percent;
            }
        }
        if (callback != null) {
            callback.onProgress(100);
        }
        System.out.println("Download complete.");
    }

    public static String getFileHash(File file) throws IOException {
        if (!file.exists()) {
            return "";
        }
        try (InputStream is = Files.newInputStream(file.toPath(), new OpenOption[0]);){
            String string = DigestUtils.sha1Hex(is);
            return string;
        }
    }

    public static String getFileSha256(File file) throws IOException {
        if (!file.exists()) {
            return "";
        }
        try (InputStream is = Files.newInputStream(file.toPath(), new OpenOption[0]);){
            String string = DigestUtils.sha256Hex(is);
            return string;
        }
    }

    public static String getGitLabFileHash(String projectId, String filePath) throws IOException {
        String urlStr = "https://gitlab.com/api/v4/projects/" + projectId + "/repository/files/" + URLEncoder.encode(filePath, "UTF-8") + "?ref=main";
        try {
            String hash;
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            if (connection.getResponseCode() == 200 && (hash = connection.getHeaderField("x-gitlab-content-sha256")) != null && !hash.isEmpty()) {
                return hash;
            }
            return null;
        }
        catch (IOException e) {
            return null;
        }
    }

    public static String getRemoteContent(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        try (InputStream in = connection.getInputStream();){
            String string = IOUtils.toString(in, StandardCharsets.UTF_8).trim();
            return string;
        }
    }

    public static Map<String, String> fetchManifest(String url) throws IOException {
        String content = FileUtil.getRemoteContent(url);
        Type mapType = new TypeToken<Map<String, String>>(){}.getType();
        return (Map)gson.fromJson(content, mapType);
    }

    public static void unzip(File zipFile, File destDir) throws IOException {
        FileUtil.unzip(zipFile, destDir, null);
    }

    public static void unzip(File zipFile, File destDir, ProgressCallback callback) throws IOException {
        System.out.println("Unzipping " + zipFile.getAbsolutePath() + " to " + destDir.getAbsolutePath() + "...");
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        long totalSize = 0L;
        try (ZipInputStream zis = new ZipInputStream(Files.newInputStream(zipFile.toPath(), new OpenOption[0]));){
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                totalSize += entry.getSize();
                zis.closeEntry();
            }
        }
        byte[] buffer = new byte[1024];
        long extractedSize = 0L;
        int lastPercent = -1;
        try (ZipInputStream zis = new ZipInputStream(Files.newInputStream(zipFile.toPath(), new OpenOption[0]));){
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                File newFile = FileUtil.newFile(destDir, zipEntry);
                if (zipEntry.isDirectory()) {
                    if (!newFile.isDirectory() && !newFile.mkdirs()) {
                        throw new IOException("Failed to create directory " + newFile);
                    }
                } else {
                    File parent = newFile.getParentFile();
                    if (!parent.isDirectory() && !parent.mkdirs()) {
                        throw new IOException("Failed to create directory " + parent);
                    }
                    try (FileOutputStream fos = new FileOutputStream(newFile);){
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            int percent;
                            fos.write(buffer, 0, len);
                            if (totalSize <= 0L || callback == null || (percent = (int)((extractedSize += (long)len) * 100L / totalSize)) == lastPercent) continue;
                            callback.onProgress(percent);
                            lastPercent = percent;
                        }
                    }
                }
                zipEntry = zis.getNextEntry();
            }
            zis.closeEntry();
        }
        if (callback != null) {
            callback.onProgress(100);
        }
        System.out.println("Unzip complete.");
    }

    private static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destinationDir, zipEntry.getName());
        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();
        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
        }
        return destFile;
    }

    public static interface ProgressCallback {
        public void onProgress(int var1);
    }
}

