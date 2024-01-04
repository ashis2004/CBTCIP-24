//.....Creating the number guessing game in java.....

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class Game{
    public static void main(String[] args) {
        
    }
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("\nGuess the number:");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.printf("\n\nCongratulations!!, you guessed it right, it was %d\nYou guessed it in %d attempts..",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
    
    String input1(){
        Scanner scc=new Scanner(System.in);
        String s=scc.nextLine();
        if(s.equals("yes"))
            System.out.println(" press enter");
        else
            System.out.println("Thanks for playing!!");
        return s;
    }
    

}


public class GuessTheNumber
{
    public static void main(String[] args) {
        System.out.println(".............Welcome! to number guessing game.........");
        Game g= new Game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b=g.isCorrectNumber();
        }
        System.out.println("\n\n\n...Do you want to play again...\n yes or no");
        g.input1();
    }
}