package java_object_oriented_programming.abstration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractFileReader
{
    private final Path filePath;

    protected AbstractFileReader(String filePath)
    {
        this.filePath = Path.of(filePath);
    }

    public Path getFilePath() {
        return filePath;
    }

    public List<String> readFile() throws IOException
    {
        return Files.lines(filePath)
                .map(this::parseLine)
                .collect(Collectors.toList());
    }

    protected abstract String parseLine(String line);
}
