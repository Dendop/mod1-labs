package FileHandler;

public class Program {
    public static void main(String[] args){
        String thisFile = "C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\resc\\students.json";

        Worker w1 = WorkerFactory.createWorker("json");
        w1.processFile(thisFile);
    }
}
