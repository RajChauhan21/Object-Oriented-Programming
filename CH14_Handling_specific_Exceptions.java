package Object_Oriented_programming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CH14_Handling_specific_Exceptions {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 12;
        arr[1] = 18;
        arr[2] = 28;
        Scanner vl = new Scanner(System.in);
        System.out.println("Enter the index of the array");
        int index = vl.nextInt();
        System.out.println("Enter the number you want to divide by the index");
        int num = vl.nextInt();
        try{
            System.out.println("Index of the array is " + index);
            System.out.println("Value after dividing the elements is " + arr[index]/num);
        }
        // multiple catch block - It is used when there is multiple execeptions in program
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other Exception occured");
            System.out.println(e);
        }


    }
}
