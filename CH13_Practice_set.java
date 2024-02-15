package Object_Oriented_programming;
class zen extends Thread{
    public void run() {
//        for (int i = 0; i < 20; i++) {
            System.out.println("Good morning");
//        }
    }
}

class oracle extends Thread{
    public void run(){
        for(int i = 0;i<20;i++) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class CH13_Practice_set {
    public static void main(String[] args)  {
        //Que 1
        zen xr = new zen();
        oracle sr = new oracle();
//        xr.setPriority(3); //Que 3
//        sr.setPriority(10); //Que 3
//        System.out.println(xr.getPriority());// Que 3
//        System.out.println(sr.getPriority()); //Que 3
//        xr.start();
//        sr.start();

        //Que2  - add sleep(); in que 1 - 'welcome' thread to delay it's exeception 200ms
        // Que 3 - demonstrate getPriority() and setPriority() methods in java threads
        //Que 4 - how do you get state of the given thread in java
        //Que 5 - how do you get reference to the current thread in java
        System.out.println(sr.currentThread().getState());
        xr.start();


        }
}
