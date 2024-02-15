package Object_Oriented_programming;
//class thr extends Thread{
//    public thr(String name){ //calling a Thread class constructor which takes I/P as name.
//        super(name);
//    }
//    public void run(){
//        System.out.println("I am a method");
//    }
//}

class boxx extends Thread implements Runnable {
    public boxx(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am a method");
    }
}
public class CH13_Thread_constructors {
    public static void main(String[] args) {
//       thr a = new thr("Raj");
//       thr b = new thr("Ram");
//       a.start();
//       b.start();
//        System.out.println( "Name "+ a.getName());
//        System.out.println("Id " + a.getId());
//        System.out.println( "Name "+ b.getName());
//        System.out.println("Id " + b.getId());
        boxx cr = new boxx("Raj");
        Thread xr = new Thread(cr , "Ram");
        xr.start();
        System.out.println(cr.getName());
        System.out.println(xr.getName());
        System.out.println(cr.getId());
        System.out.println(xr.getId());
    }
}
