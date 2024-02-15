package Object_Oriented_programming;

interface bicycle{ //we can implement multiple interfaces in single class
    int a = 21;  // along with methods we can write properties also in the interface
    void applybrake(int decrement);
    void applyspeed(int increment);
}
interface customization{
     void wheeltype();
     void accesories();
}

class hero implements bicycle , customization { // here we have implemented multiple interfaces in single class
    void price(int n) {
        System.out.println("Price of the Object_Oriented_programming.bicycle is " + n);
    }


    public void applybrake(int decrement) {
        System.out.println("applying brakes..........." );
    }

    public void applyspeed(int increment) {
        System.out.println("Speeding up......." );
    }

   public void wheeltype(){
       System.out.println("spoke wheels with tubed tyres");
   }
    public void accesories(){
        System.out.println("bell,seat,mirrors,bottle stand");
    }
}



public class CH11_Interfaces {
    public static void main(String[] args) {
        hero cycle = new hero();
        cycle.applybrake(3);
        cycle.applyspeed(5);
//        System.out.println(cycle.a); // we can't modify the properties in the interface
//          cycle.a = 39; // so here we can't modify the properties , because they are final variable
        cycle.wheeltype();
        cycle.accesories();
        cycle.price(21000);
        System.out.println(cycle.a);

    }
}
