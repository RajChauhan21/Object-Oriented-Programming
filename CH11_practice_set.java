package Object_Oriented_programming;
abstract class pen{ // Que 1 - create a abs class with methods write and pen as abs method
   abstract public void write();
   abstract public void refill();
}

class fountainpen extends pen{
    public void changenib(){
        System.out.println("Fountain pen's nib can't be changed");
    }
     public void write(){
         System.out.println("smooth writing....");
     }
     public void refill(){
         System.out.println("Refilling......");
     }
}

class monkey{
    public void jump(){
        System.out.println("Monkey is Jumping");
    }
    public void bite(){
        System.out.println("Monkey bites..");
    }
}

interface basicanimal{
    void eat();
    void sleep();
}

class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("Eating food");
    }
    public void sleep(){
        System.out.println("Sleeping..azz..azzzzzzzzzz");
    }
}

abstract class telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}

class smarttelephone extends telephone{
    public void wireless(){
        System.out.println("New Gen telephones will be wireless");
    }
     public void ring(){
         System.out.println("Ringing.......");
     }
     public void lift(){
         System.out.println("Lifting...the phone");
     }
     public void disconnect(){
         System.out.println("Call disconnected!");
     }
}

interface tvremote{
     void volumelow();
     void volumehigh();
     void channelforward();
     void channelbackward();
}

interface smarttvremote extends tvremote{
    public void connect();
    public void detect();
}
class tv implements tvremote{
    public void volumelow(){
        System.out.println("Decreasing volume");
    }
    public void volumehigh(){
        System.out.println("Increasing volume");
    }
    public void channelforward(){
        System.out.println(" Shifting forward the channel");
    }
    public void channelbackward(){
        System.out.println(" Shifting backward the channel");
    }
}
public class CH11_practice_set {
    public static void main(String[] args) {
        //Que 2
//        fountainpen cr = new fountainpen();
//        cr.write();
//        cr.refill();
//        cr.changenib();

        //Que 3
//        human hr = new human();
//        hr.jump();
//        hr.bite();
//        hr.eat();
//        hr.sleep();

        //Que 4
//        telephone xsr = new smarttelephone();
//        xsr.ring();
//        xsr.lift();
//        xsr.disconnect();

        //Que 5
//        basicanimal dr = new human(); //Human acting as basic animal
//        dr.eat();
//        dr.sleep();
//
//        human hr = new human();
//        hr.jump();
//        hr.bite();

        //Que 6-7
        tv vt = new tv();
        vt.volumelow();
        vt.volumehigh();
        vt.channelforward();
        vt.channelbackward();



    }
}
