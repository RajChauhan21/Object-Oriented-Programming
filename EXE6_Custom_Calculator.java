package Object_Oriented_programming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXE6_Custom_Calculator {
    public static void main(String[] args) {
        // create custom calculator with following operations:
        //1. Addition
        //2. Substraction
        //3. Multiplication
        //4. Division
        // Which throws following exceptions:
        //1. invalid input exception for eg -  8 & 9
        //2. cannot divide by zero exception
        //3. Max input exception if any of the input is greater than 100000 (input mismatch exception)
        //4.max multiplier reached exception - do not allow any multiplication value to be
        // Greater than 7000

        Scanner cr = new Scanner(System.in);



        char[] arr = {'+' , '-', '*' , '/'};

        try{
            System.out.println("Enter the first value");
            int a = cr.nextInt();
            System.out.println("Enter the second value");
            int b = cr.nextInt();
            System.out.println("0. +\n" +  "1. -\n" + "2. *\n" + "3. / \n" );
            System.out.println("Enter the index of the operation");
            int z = cr.nextInt();
            if(a<100000 || b<100000) {
                if (z == 0) {
                    System.out.println( "Addition of the values are : " + (a + b));
                }

                else if(z==1){
                    System.out.println("Substraction of the values are : "+  (a-b));
                }
                else if(z==2){
                System.out.println("Multiplication of the values are :" + (a*b));
            }
                else if(z==3){
                    System.out.println("Division of the values are :" + (a/b));
                }
                else{
                    throw new InputMismatchException("Unreachable value");
                }
            }
            else{
                throw new InputMismatchException("Unreachable value");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("The end");


    }
}
