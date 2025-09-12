package lab15;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        String fullPath = "C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\lab15\\shared_file.txt";

        Thread w1 = new Thread(new Worker(1,fullPath,"I was here first!"));
        Thread w2 = new Thread(new Worker(2,fullPath,"I was here seconds!"));
        Thread w3 = new Thread(new Worker(3,fullPath,"I was here third!"));

        Thread w4 = new Thread(new Worker(4,fullPath,"I'll try to be faster!"));

//        System.out.println("First round not in order");
//        w1.start();
//        w2.start();
//        w3.start();
//        w4.start();

        //Even I have used "synchronized" method it doesnt mean
        // order w1->w2->w3->w4 if w3 finishes first yolo method it will
        //access writenicely first
        //TIP: synchronized doesnt mean 'follow this order'
        //if want to follow order I can use .join()
        System.out.println("In order");
        w1.start();
        w1.join();
        w2.start();
        w2.join();
        w3.start();
        w3.join();
        w4.start();

    }
}
