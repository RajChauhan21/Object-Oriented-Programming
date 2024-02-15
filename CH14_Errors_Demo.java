package Object_Oriented_programming;

import java.util.Scanner;

public class CH14_Errors_Demo {
    public static void main(String[] args) {
        //Syntax error
//        int a = 21 // missing semi-colon , It is an syntax error
//          c = 12; // c is not declared
//        System.out.println(a);

        //Logical error
        // Wap to print prime numbers from 1 to 10
//        System.out.println(2); // here program is running, but not doing what i need
//        for(int i = 1;i<5;i++){
//            System.out.println(2*i+1);
//        }

        //Runtime error
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = cr.nextInt(); // while running the program if user enters name(String)
        // instead of integer it throws an exception , which is runtime error
        System.out.println(a);


    }
}
