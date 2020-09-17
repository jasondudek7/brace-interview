package ai.brace;

import ai.brace.pojo.Book;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BookLoader {

    public static Book load(String file) {
        Gson gson = new Gson();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(getPathForResource(file).toFile()));
            return gson.fromJson(bufferedReader, Book.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static Path getPathForResource(final String path)
    {
        try
        {
            return Paths.get(ClassLoader.getSystemResource(path).toURI());
        }
        catch (URISyntaxException e)
        {
            throw new RuntimeException(e);
        }
    }
}
