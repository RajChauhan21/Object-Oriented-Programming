package Object_Oriented_programming;

import java.util.Scanner;

class FZ{
    public void disp(){
        Scanner cr = new Scanner(System.in);
        String name = cr.next();
        System.out.println("Your name is " + name);

    }
}

class FS extends FZ{
//    default void pro(){ // so we can't access default method in subclass
//        System.out.println("Default method");
//    }
public int z = 21;
    protected void bro(){ // but we can access protected method in subclass
        System.out.println("Hey bro!");
    }
}

public class CH12_practice_set {
    public static void main(String[] args) {
        // Que1 -----> solved in vs code
        //Que 2
        FZ r = new FZ();
        r.disp();
        //Que 3 -----> solved in vs code
        //Que 4 - prove that you cannot access default property but can access protected property
         // this que is also solved in vs code
        FS x = new FS();
        x.bro();
        System.out.println(x.z);

    }
}
