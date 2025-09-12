package Threadpractice;

public class Worker implements Runnable {
    public String label;
    public Worker(String label){
        this.label = label;
    }
    @Override
    public void run(){
        long sum = 0;
        for(int i = 0; i < 100_000_000; i++){
            sum += i;
        }
        System.out.println("Worker " + this.label + " finished task");
    }

}
