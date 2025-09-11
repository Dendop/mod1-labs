package lab12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    private static String[] readCSV(String inFile) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(inFile));
        List<String> allLines = new ArrayList<String>();

        String line;
        while((line = br.readLine()) != null)
        {
            String[] lines = line.split(",");
            for(String s : lines)
            {
                allLines.add(s);
            }
        }
        br.close();

        return allLines.toArray(new String[0]);
    }

    public static void main(String[] args) throws IOException {
        String[] courses = readCSV("C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\resc\\course.txt");
        String[] trainers = readCSV("C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\resc\\trainer.txt");

        String newFilePath = "C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\resc\\trainersAndCourses.txt";

        BufferedWriter br  = new BufferedWriter(new FileWriter(newFilePath));

        for(String s : courses)
        {
            br.write(s);
            br.newLine();
        }
        for(String s : trainers){
            br.write(s);
            br.newLine();
        }
        br.close();

        BufferedReader jr = new BufferedReader(new FileReader(newFilePath));
        String each;
        while((each = jr.readLine()) != null)
        {
            System.out.println(each);
        }
        jr.close();

    }
}
