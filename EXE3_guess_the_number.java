package Object_Oriented_programming;

import java.util.Random;
import java.util.Scanner;

class game {
    int guess;
    int mynumber;
    int compnumber;
    public game(){
        Random rn = new Random();
         compnumber  = rn.nextInt(0,11);
    }
    public void takeuserinput(int n){
        mynumber = n;
    }

    public int iscorrect(){
        if(mynumber==compnumber){
            return 0;
        }
        else if (mynumber>compnumber) {
            return +1;
        }
        else {
            return -1;
        }
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess() {
        guess++;
    }
}




public class EXE3_guess_the_number {
    public static void main(String[] args) {
        /* create a class Object_Oriented_programming.game , which allows a user to play "Guess the Number"
        Object_Oriented_programming.game once , Object_Oriented_programming.game should have following methods:
        1. Constructor to generate random number
        2.takeuserinput() to take input from the user
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for no.of guesses
         */
           game cr = new game();
        Scanner num = new Scanner(System.in);
        boolean res = true;
        while (res==true){
            System.out.println("Enter your guess");
            int n = num.nextInt();
            cr.takeuserinput(n);
            cr.setGuess();
            if(cr.iscorrect()==0){
                System.out.println("Your guess is correct");
                cr.getGuess();
                break;

            }
            else if(cr.iscorrect()==+1){
                System.out.println("Enter Smaller number");
                cr.getGuess();
            }
            else if(cr.iscorrect()==-1){
                System.out.println("Enter larger number");
                cr.getGuess();
            }
            System.out.println("Your number of guesses were " + cr.getGuess());
        }
    }
}
