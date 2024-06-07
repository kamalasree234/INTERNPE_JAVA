import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsgame {
    public static void main(String[] args) {
        int playerscore = 0;
        int computerscore = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        Random Rand = new Random();
        Scanner name1 = new Scanner(System.in);
        System.out.println("                    ROCK PAPER SCISSORS GAME    ");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\n Enter your name:");
        String username =name1.nextLine();
        System.out.println("HELLO,"+username+"\n WELCOME TO ROCK PAPER SCISSORS GAME");
        System.out.println("\n LET'S START PLAYING!");
        boolean continuePlaying = true;
        while(continuePlaying){
            while (playerscore < 5 && computerscore < 5) {
            int computerchoice = 1 + Rand.nextInt(3);
       
        System.out.println("\nEnter 1 for Rock,\n 2 for paper ,\n 3 for scissors");
        int playerchoice = sc.nextInt();
        if(playerchoice == computerchoice){
            System.out.println("It's a tie.No points will be rewarded");
        }
        else if(playerchoice == 1){
            if(computerchoice == 2){
                System.out.println("You have selected Rock");
                System.out.println("Computer selected Paper");
                System.out.println("Sorry"+username+"You lost this round");
                computerscore++;
                System.out.println("Computer score is:"+computerscore);
                System.out.println(username+"score:"+playerscore);
            }
           else if(computerchoice == 3){
            System.out.println("You have selected Rock");
            System.out.println("Computer selected Scissors");
            System.out.println("Congratulations"+username+"You won this round");
            playerscore++;
            System.out.println("Computer score is:"+computerscore);
            System.out.println(username+"score:"+playerscore);
            }
        }
            else if(playerchoice == 2){
                if(computerchoice == 1){
                    System.out.println("You have selected Paper");
                System.out.println("Computer selected Rock");
                System.out.println("Congratulations"+username+"You won this round");
                playerscore++;
                System.out.println("Computer score is:"+computerscore);
                System.out.println(username+"score:"+playerscore);
                }
                else if(computerchoice == 3){
                    System.out.println("You have selected Paper");
               System.out.println("Computer selected Scissors");
                System.out.println("Sorry"+username+"You lost this round");
                computerscore++;
                System.out.println("Computer score is:"+computerscore);
                System.out.println(username+"score:"+playerscore);
                }
        }       
        else if(playerchoice == 3){
            if(computerchoice == 1){
                System.out.println("You have selected Scissors");
                System.out.println("Computer selected Rock");
                System.out.println("Sorry"+username+"You lost this round");
                computerscore++;
                System.out.println("Computer score is:"+computerscore);
                System.out.println(username+"score:"+playerscore);
            }
           else if(computerchoice == 2){
            System.out.println("You have selected Scissors");
                System.out.println("Computer selected Paper");
                System.out.println("Congratulations"+username+" You won this round");
                playerscore++;
                System.out.println("Computer score is:"+computerscore);
                System.out.println(username+"score:"+playerscore);
            }
        }
            if(playerscore == 5){
                System.out.println("Congratulations"+username+",on winning this game");
            }
            else if(computerscore == 5){
                System.out.println("I'm Sorry.But you have lost");
            }
         }
             System.out.println("\n Thank you for playing! Final scores - " + username + ": " + playerscore + ", Computer: " + computerscore);
            System.out.println("\nDo you want to continue playing? (yes/no)");
            String continueResponse = sc.next();
            if (continueResponse.equalsIgnoreCase("no")) {
                continuePlaying = false;
        } 
}
        System.out.println("\n Thankyou for playing!Goodbye!");
        sc.close();   
    }     
}
