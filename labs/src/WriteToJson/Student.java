package WriteToJson;

import java.util.ArrayList;

public class Student {
    String name;
    int age;
    ArrayList<String> subjects = new ArrayList<>();

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C#");
        subjects.add("Javascript");
    }
}
