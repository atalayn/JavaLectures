package src.com.lecture.homework;

import com.lecture.twelve.SuperMarket;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        System.out.println("Lets start playing, 0 means rock, 1 means paper, 2 means scissor.");


        int winCounter = 0;
        int loseCounter = 0;
        int tieCounter=0;

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        RockPaperScissorUtilities rockPaperScissorUtilities = new RockPaperScissorUtilities();

        for (int counter = 0; counter < 10; counter++) {

            int randomNumber = random.nextInt(3);

            System.out.println("Please enter your preference");

            int userNumber = scanner.nextInt();

            if (rockPaperScissorUtilities.result(userNumber, randomNumber) == "won") {
                System.out.println("You won");
                winCounter++;
            } else if (rockPaperScissorUtilities.result(userNumber, randomNumber) == "tie") {
                System.out.println("It is a tie");
                tieCounter++;
            } else if (rockPaperScissorUtilities.result(userNumber, randomNumber)=="lost"){
                System.out.println("You lost");
                loseCounter++;
            }else{
                System.out.println(userNumber+" is not a valid value.");
                counter--;
            }


        }

        System.out.println("You played 10 times "+"You won "+winCounter+" times. "+"You lost "+loseCounter+" times. You tie "+tieCounter+" times");


    }


}



