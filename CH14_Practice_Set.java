package Object_Oriented_programming;
import java.util.Scanner;
class Program extends Exception{
    @Override
    public String toString() {
        return "Maximum tries reached";
    }
    public String getMessage() {
        return "Stop now! Limits Reached ";
    }
}

public class CH14_Practice_Set {
    public static void que5() throws Exception{
        int[] crr = {3,45,21,98,21,10};
        int tries = 0;

        while (tries <= 5) {
            Scanner cr = new Scanner(System.in);
            if(tries==5){
                try{
                    throw new Program();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            }
            try {
                System.out.println("Enter the index of array : ");
                int num = cr.nextInt();
                System.out.println("Element on index " + num + " is " + crr[num]);
                tries++;
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                tries++;

            }
        }

    }
    public static void main(String[] args) {
        //Que 1 - wap to demonstrate syntax , logical and runtime errors
        // SYNTAX ERROR
//        int a = 10 //semi-colon is absent
//            d = 'r'; // variable 'd' is not declared

        // LOGICAL ERROR - print prime numbers from 1 to 10
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i * 2 + 1);
//        }
        // so here the output is 1,2,3,5,9 but 9 is not a prime number.hence this known as L.E

        //RUNTIME ERROR
//        Scanner xr = new Scanner(System.in);
//        int a = xr.nextInt();
//        System.out.println(a);
        // so here if user enters a string instead of int , it will be termed as R.E

       //wap that prints 'haha' during Arithmetic exception and 'hehe' during illegal
        //argument exception
//        try{
//            int b = 10 / 0;
//            System.out.println(b);
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("HAHA");
//        }
//        catch (IllegalArgumentException e)
//        {
//           / System.out.println("HEHE");
//        }

        //Que 3 - wap that allows user to keep accessing the array untill the valid index
        // is given , if max retries reaches 5 print error
//        int[] crr = {3,45,21,98,21,10};
//        int tries = 0;
//            while (tries <= 5) {
//                Scanner cr = new Scanner(System.in);
//                if(tries==5){
//                    try {
//                        throw new Program(); //Que 4 - add a custom exception when max
//                        //tries reached
//                    }
//                    catch (Exception e) {
////                        System.out.println(e.toString());
//                        break;
//                    }
//                }
//                try {
////                    System.out.println("Enter the index of array : ");
//                    int num = cr.nextInt();
////                    System.out.println("Element on index " + num + " is " + crr[num]);
//                    tries++;
//                }
//                catch (Exception e){
////                    System.out.println("Invalid index");
//                    tries++;
//                }
//            }

            //Que 5 - wrap a program of que 3 inside method which throws custom exception
        try{

            que5();
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }



    }
}
