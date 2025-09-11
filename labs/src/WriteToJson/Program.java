package WriteToJson;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.Arrays;

public class Program {
    public static void main(String[] args){

        Gson gson = new Gson();

        int[] nos = {1,3,5,7,9};
        String res = gson.toJson(nos);
        System.out.println(res);

        String[] names = {"Bob", "Fred","Wilma"};
        res = gson.toJson(names);
        System.out.println(res);

        Student[] students = {
                new Student("Joe",21),
                new Student("Mark",31),
                new Student("Wilma",48)
        };
        res = gson.toJson(students);
        System.out.println(res);
        String somePath = "C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\resc\\";
        String fileName = "students.json";
        String fileC = somePath + fileName;

        try(FileWriter fw = new FileWriter(fileC)){
            gson.toJson(students,fw);
        }
        catch(Exception e){
            e.printStackTrace();
        }





    }
}
