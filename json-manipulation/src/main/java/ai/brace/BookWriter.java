package ai.brace;

import ai.brace.pojo.Book;
import com.google.gson.Gson;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BookWriter {

    public static void write(String file, Book book) {
        Gson gson = new Gson();
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(getPathForResource("json-manipulation/src/main/resources/").toAbsolutePath().toString()+"/"+file));
            bufferedWriter.write(gson.toJson(book));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Path getPathForResource(final String path)
    {
        try
        {
            return Path.of(path);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
