package Object_Oriented_programming;

import java.util.Scanner;

public class CH14_NesteadTry_Catch {
    public static void main(String[] args) {
        //  WE USE NESTEAD TRY CATCH FOR , IF WE WANT TO CONTINUE THE TRY AFTER HANDLING THE
        // EXCEPTION
//        Quick Quiz - wap that allows user to access an array untill he enters the valid
        // array index
        int[] arr = new int[3];
        arr[0] = 12;
        arr[1] = 18;
        arr[2] = 28;
        Scanner cr = new Scanner(System.in);
        boolean xr = true;
        while (xr) {
            System.out.println("Enter index of the array");
            int index = cr.nextInt();
            try {
                System.out.println("Welcome in Nestead try catch");

                try {
                    System.out.println("Value of the entered index is " + arr[index]);
                    xr = false;
                }

                catch (IndexOutOfBoundsException e) {
                    System.out.println("IndexOutOfBoundsException");
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("Some error occurred");
            }
        }
        System.out.println("Exited from loop");

    }
}
