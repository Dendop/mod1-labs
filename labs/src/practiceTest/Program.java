package practiceTest;

public class Program {
    public static void main(String[] args){
        long sum = 0;
        long startTime = System.nanoTime();

        for(long i = 0; i <= 100_000_000; i++){
            sum += i;
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Sum: " + sum);
        System.out.println("Elapsed time (ms): " + elapsedTime / 1_000_000);
    }
}
