import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] options = {"rock","paper","scissors"};
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);


        //CreateRandom computer choice
        int randomNumber = rand.nextInt(3);
        String computerChoice = options[randomNumber];

        //get user choice
        System.out.println("Choose: 'rock','paper','scissors'");
        System.out.printf("Your choice: ");
        String userChoice = scan.nextLine();

//        switch (randomNumber)
//        {
//            case 0:
//                if(userChoice.equals("paper"))
//                {
//                    System.out.println("You won!");
//                }
//                else if(userChoice.equals("scissors"))
//                {
//                    System.out.println("You lost!");
//                }
//                else {
//                    System.out.println("Tie!");
//                }
//                break;
//            case 1:
//                if(userChoice.equals("rock"))
//                {
//                    System.out.println("You Lost!");
//                }
//                else if(userChoice.equals("scissors"))
//                {
//                    System.out.println("You Won!");
//                }
//                else {
//                    System.out.println("Tie!");
//                }
//                break;
//            case 2:
//                if(userChoice.equals("rock"))
//                {
//                    System.out.println("You won!");
//                }
//                else if(userChoice.equals("paper"))
//                {
//                    System.out.println("You Lost!");
//                }
//                else {
//                    System.out.println("Tie!");
//                }
//                break;
//
//            default:
//                System.out.println("Invalid input");
//                break;
//        }

        if(userChoice.equals(computerChoice))
        {
            System.out.println("Tie!");
        }
        else if(
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")))
        {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }
        //check the computer choice
        System.out.println("Computer choice: " + computerChoice);

    }
}