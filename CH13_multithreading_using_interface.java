package Object_Oriented_programming;
class turbo implements Runnable{
    public void run(){
        int a = 0;
        while (a<40){
            System.out.println("Range");
            a++;
        }
    }
}

class oilcool implements Runnable{
    public void run(){
        int a = 0;
        while (a<40){
            System.out.println("Rover");
            a++;
        }
    }
}
public class CH13_multithreading_using_interface {
    public static void main(String[] args) {
        turbo bullet = new turbo();
        Thread gun = new Thread(bullet);

        oilcool bullet1 = new oilcool();
        Thread gun1 = new Thread(bullet1);

        gun.start();
        gun1.start();



    }
}
