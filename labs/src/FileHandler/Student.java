package FileHandler;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> subjects;

    // Getters & setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public List<String> getSubjects() { return subjects; }
    public void setSubjects(List<String> subjects) { this.subjects = subjects; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", subjects=" + subjects + "}";
    }
}
