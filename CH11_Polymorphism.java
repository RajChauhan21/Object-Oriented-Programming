package Object_Oriented_programming;
// POLYMORPHISM MEANS ONE ENTITY MANY FORMS
interface gaming{
    void fifa24();
    void gta6();
}

interface movies{
    void race3();
    void wrathofvajra();
}

class laptop implements gaming , movies{
    public void specs(){
        System.out.println("AMD ryzen 9\n32gb Ram\n16gb Graphics\n");
    }
    public void fifa24(){
        System.out.println("Playing fifa24........");
    }
    public void gta6(){
        System.out.println("Rockstar games presents GTA 6........");
    }
    public void race3(){
        System.out.println("Race is over , I don't think so!");
    }
   public void wrathofvajra(){
       System.out.println("Best chinese martial arts movie");
   }

}
public class CH11_Polymorphism {
    public static void main(String[] args) {
        gaming cr = new laptop(); // here laptop will be used for only gaming ,
//        cr.fifa24();           // so laptop will act as a video game
//        cr.gta6();
//      cr.race3(); // if you try to watch movies instead playing game it will give error

        movies sr = new laptop(); //here laptop will be used for only for watching movies
//        sr.race3();               // so laptop will act as a video player
//        sr.wrathofvajra();
//        sr.fifa24(); // if you try to ply game instead watching movie it will give error

//        cr.specs(); // even we can't run class's methods , to run we have to create a class and object
                   // of that class and then we can call the methods of that class.
        laptop xr = new laptop();
        xr.specs();

    }

}
