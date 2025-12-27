package javaio;

import java.io.IOException;
import java.nio.file.*;

public class FileOperation {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("tempDir");

        if (Files.notExists(path)) {
            Files.createDirectory(path);
        }

        Path file = Paths.get("tempDir/sample.txt");

        if (Files.notExists(file)) {
            Files.createFile(file);
        }

        Files.list(path).forEach(System.out::println);

        Files.deleteIfExists(file);
        Files.deleteIfExists(path);
    }
}

