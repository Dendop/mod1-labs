package lab15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Worker implements Runnable{
    private final int workerId;
    private final String fileName;
    private final String message;

    //had to implement this due to my synced method wasn't in order
    //each thread opens it's own Buffer writer
    private static final Object lock = new Object();

    public Worker(int workerId, String fileName, String message) {
        this.workerId = workerId;
        this.fileName = fileName;
        this.message = message;

    }


    @Override
    public void run(){
        //use .join() to follow order
//        yoloWrite(message);


        writeNicely(message);



    }
    private void yoloWrite(String message){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
            bw.write(message);
            bw.newLine();

            System.out.println("Worker "+ workerId +" is writing to file......");
            bw.flush(); //used flush due to other threads access
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    //added synchronized lock for keeping the order
    private void writeNicely(String message){
        synchronized(lock){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
                bw.write(message);
                bw.newLine();

                System.out.println("Worker "+ workerId +" is writing to file in order......");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
