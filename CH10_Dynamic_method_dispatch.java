package Object_Oriented_programming;

class phone{
    public void soundq(){
        System.out.println("Sound quality is good");
    }
    public void on(){
        System.out.println("Turning on.........Nokia lumia ");
    }
    public void call(){
        System.out.println("Calling........");
    }
}

class sphone extends phone {
    public void brand() {
        System.out.println("Brand - Samsung");
    }

    public void on() {
        System.out.println("turning on..........Samsung A54");
    }

    public void ring() {
        System.out.println("Ringing......");


    }
}


    public class CH10_Dynamic_method_dispatch {
        public static void main(String[] args) {
//        Object_Oriented_programming.phone nokia = new Object_Oriented_programming.phone();
//        nokia.on();
//        nokia.soundq();

//        Object_Oriented_programming.sphone samsung = new Object_Oriented_programming.sphone();
//        samsung.brand();
//        samsung.on();

//        In  DMD below reference should be of super class and object should be of sub class
//        note : In below condition the methods of super class and those methods which are present
//        in both the classes , only those methods will execute.methods of subclass will not execute separately
            phone lava = new sphone(); //here always object will be executed instead of reference
            lava.on();

        }
    }

