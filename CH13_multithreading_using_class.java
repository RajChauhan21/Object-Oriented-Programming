package Object_Oriented_programming;
// CREATING THREAD BY EXTENDING THREAD CLASS
class thread1 extends Thread { // here both the output will be running together
// simultaneously
    public void run () {
        int a = 0;
        while(a<50){
    System.out.println("Cooking");
            a++;
    }
}
}

//class Thread2 extends Thread{
//    public void run() {
//        int a = 0;
//        while (a<1000) {
//            System.out.println("Chatting");
//            a++;
//        }
//
//    }
//}

// without threading - Here 'hello' will be executed first and then 'hi' will start to executing
//class thread1{
//    public void run(){
//        int a = 0;
//        while (a<100){
//            System.out.println("Hello!");
//            a++;
//        }
//    }
//}
//
//class background{
//    public void func(){
//        int a = 0;
//        while (a<100){
//            System.out.println("Hi!");
//            a++;
//        }
//    }
//}
public class CH13_multithreading_using_class {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();

        for(int i = 0;i<50;i++){
            System.out.println("Good morning");
        }

    }
}
