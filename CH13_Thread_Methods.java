package Object_Oriented_programming;
class powers extends Thread{
    public void run(){
        for(int i = 0; i<50;i++){
            System.out.println("Orange");
//            try {
//                Thread.sleep(3000); // sleep() method is use to keep thread into
                      // temporarily waiting state
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

class flask extends Thread{
    public void run(){
       for(int i = 0; i < 50;i++){
           System.out.println("Red");
           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }


    }
}
public class CH13_Thread_Methods {
    public static void main(String[] args) {
        powers r = new powers();
        flask s = new flask();
        // now if i want to hold the s.start() method untill r.start() finishes it's execution
        // so i can use 'join' method
        r.start();
//        try {
//            s.join();
//        }catch (Exception e) {
//            System.out.println(e);
//        }
        s.start();
    }
}
