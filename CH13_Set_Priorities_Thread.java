package Object_Oriented_programming;
class torq extends Thread{
    torq(String name){
        super(name);
    }
    public void run() {
        int a = 0;
        while (a<200){
            System.out.println("Hello" + this.getName());
            a++;
        }
    }
}
public class CH13_Set_Priorities_Thread {
    public static void main(String[] args) {
        torq a = new torq("Raj(Most important)");
        torq b = new torq("CR7");
        torq c = new torq("Mahindra");
        torq d = new torq("Ronin");
        torq e = new torq("MT-15");

         a.setPriority(Thread.MAX_PRIORITY);
         b.setPriority(Thread.MIN_PRIORITY);
         c.setPriority(Thread.MIN_PRIORITY);
         e.setPriority(Thread.MIN_PRIORITY);
         d.setPriority(Thread.NORM_PRIORITY);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}
