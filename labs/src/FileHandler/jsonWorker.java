package FileHandler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class jsonWorker extends Worker implements jsonHandler{
    @Override
    public void processFile(String fileName) {
        readJson(fileName);
        writeJson(fileName);
    }
    @Override
    public void readJson(String fileName){
            Gson gson = new Gson();
            try{
                String fileContent = new String(Files.readAllBytes(Paths.get(fileName)));

                Type listTYpe = new TypeToken<List<Student>>(){}.getType();
                List<Student> students = gson.fromJson(fileContent, listTYpe);

                for(Student s: students)
                {
                    System.out.println(s);
                    System.out.println("Name: " + s.getName());
                    System.out.println("Age: " + s.getAge());
                    System.out.println("Subjects: " + s.getSubjects());
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
    @Override
    public void writeJson(String fileName){
        //pass for now
    }
}

