package Object_Oriented_programming;

import java.util.Scanner;
// Exception class are used to make our custom exceptions using it's class methods
class CRX extends Exception{
    @Override
    public String toString() {
        return "Invalid input";
    }
    public String getMessage() {
        return "Unreachable input";
    }
}
public class CH14_Exception_class {
    public static void main(String[] args) throws CRX {
        Scanner cr = new Scanner(System.in);
        int a = cr.nextInt();
        if(a<100){
            try{
//                throw new ArrayIndexOutOfBoundsException("Array out of bound");
//                throw new CRX(); // for writing custom exceptions
                throw new  ArithmeticException("It is an exception"); // for built-in exception
            }
            catch (Exception e){
////                System.out.println(e.getMessage());
                System.out.println(e); //executes ToString() method
                e.printStackTrace(); // The first line of output contains the result of the toString() method
//                //  for this object , so the output of ToString is also printed
                 }
        }
        else{
            System.out.println(a);
        }











    }
}
