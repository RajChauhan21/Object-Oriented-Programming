package Object_Oriented_programming;

public class CH14_Finally_Block {
    public static int divide(){
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        finally {
            System.out.println("The End");
        }
        return 0;
    }
    public static void main(String[] args) {
       // Finally block contains the code which is always executed whether the exception
        //is handled or not
//        System.out.println(divide());
        for(int i=4;i>=0;i--){

                try{
                    System.out.println(3/i);
                }
                catch (Exception e){
                    System.out.println("Reason : " + e);
                    e.printStackTrace();
                    break;
                }

                finally {
                    System.out.println("Loop terminated");
                }
        }

        try {
            int a = 10;
            int b = 2;
            System.out.println(a/b);
        }
        finally {
            System.out.println("The End");
        }
    }
}
