package Object_Oriented_programming;

abstract class R{ // by using the abstract class we can make more abstract classes as well as concrete classes
    public void ind(){ // note - we can't make the object of abstract classes
        System.out.println("I am a method");
    }
    abstract public void greet();
 }
 class S extends R{ // we can only extend one abstract class in the sub class , nor two
     @Override
     public void greet() { // now Object_Oriented_programming.S class became a concrete class as we have implemented the abstract method in it
         System.out.println("Congratulations");
     }
     public void car(){
         System.out.println("my car type is SUV");
     }
 }

 abstract class J extends R{ //so here we have declared a class as a abstract class because we have inherited
    //the abstract class Object_Oriented_programming.R.
    public void cream(){
        System.out.println("I love eating ice-creams");
    }

    public void snack(){
        System.out.println("Avoid unhealthy snacks");
    }

 }

 class F extends J{
     @Override
     public void greet() {
         System.out.println("Jai shree Ram");
     }
 }


public class CH11_Abstraction {
    public static void main(String[] args) {

//        Object_Oriented_programming.R r = new Object_Oriented_programming.R(); // we cant make object of the abstract class. hence it will give error
//          Object_Oriented_programming.S s = new Object_Oriented_programming.S();
//          s.ind(); // we can access the methods in the abstract classes from the it's child class
//          s.greet();
//          s.car();

//          Object_Oriented_programming.J j = new Object_Oriented_programming.J(); // now here also Object_Oriented_programming.J class is abstract class so we can't create object
//        Object_Oriented_programming.F f = new Object_Oriented_programming.F();
//        f.greet();
//        f.cream();
//        f.snack();
//
    }
}
