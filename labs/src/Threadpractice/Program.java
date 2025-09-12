package Threadpractice;

public class Program {
    public static void main(String[] args){
        Thread w1 = new Thread(new Worker("one"));
        Thread w2 = new Thread(new Worker("two"));
        Thread w3 = new Thread(new Worker("three"));
        Thread w4 = new Thread(new Worker("four"));

        w4.start();
        w1.start();
        w3.start();
        w2.start();

    }
}
