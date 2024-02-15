package Object_Oriented_programming;
class exception extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }
    public String getMessage() {
        return "value of radius cannot be negative";
    }
}
public class CH14_Throw_vs_Throws {
    // Throws K/W is a kind of warning to the user that the following method can throw an exception
    public static int add(int a , int b) throws ArithmeticException{
        return a/b;
    }

    public static double area(int r) throws Exception {
        if(r<0) {
            throw new exception();
        }
        return Math.PI*r*r;
    }

    public void num() throws Exception {
        for(int i = 0;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws Exception {
//         for(int i = 0;i<=10;i++){ // here exception is handled by JVM
//             System.out.println(i);
//             Thread.sleep(1000);
//         }
        try{ // Here exception is handled by user
            for(int i = 1;i<=10;i++){
                System.out.println(i/0);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Catch Masala");




//        try{
//            int c = add(10 , 0);
//        }
//        catch (Exception e){
//            System.out.println("Exception");
//            e.printStackTrace();
//        }

//        try{
//            double cr = area(-1);
//            System.out.println("Area :" + cr);
//        }
//        catch (Exception e){
//            e.getMessage();
//            e.printStackTrace();
//        }



    }
}
