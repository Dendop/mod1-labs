package FileHandler;

public class WorkerFactory {
    public static Worker createWorker(String type){
        switch(type.toLowerCase()){
            case "csv": return new csvWorker();
            case "json": return new jsonWorker();
            default: throw new IllegalArgumentException("Not valid type");
        }
    }


}
