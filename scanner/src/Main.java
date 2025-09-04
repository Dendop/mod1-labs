import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("What is the length of your array?: ");
        int users_length = scan.nextInt();
        int[] numbers = new int[users_length];
        for(int i = 0; i < users_length; i++)
        {
            System.out.printf("\nEnter the number  " + (i + 1) + ": ");
            int num = scan.nextInt();
            numbers[i] = num;
        }
        int max = uMaxNum.max_number(numbers);
        System.out.println("The maximum number is: " + max);
        System.out.printf("List of your numbers are: ");
        for (int x : numbers)
        {
            System.out.printf("%d,", x);
        }





    }
}