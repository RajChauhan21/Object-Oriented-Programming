package Object_Oriented_programming;

public class CH14_Try_catch {
    public static void main(String[] args) {
        int z = 5000;
        int b = 0;
        //without try-catch
//        int c = z/b;
//        System.out.println(c);


//        with try-catch
        try {
            int c = z / b;
            System.out.println(c);
        }
        catch (Exception r) {
            System.out.println("Sorry unreachable value! ");
            System.out.println("Reason : " + r);
        }
    }
}
