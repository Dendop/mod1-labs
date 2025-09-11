package IO;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Program {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\resc\\example.txt");
        Files.writeString(p,"This is the first line");
        String all = Files.readString(p, StandardCharsets.UTF_8);
        System.out.println(all);

        Gson gson = new Gson();
        String json = gson.toJson("Hello World this is JSON");
        System.out.println(json);

    }
}
