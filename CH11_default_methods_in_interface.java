package Object_Oriented_programming;

interface gps{
    void location();
    void gps();
    private void accessimage(){
        System.out.println("images are saved in gallery you can access from there");
    }
    default void voiceassist(){ // if we want to add more methods in the existing interface after
        // implementing it we can use default method to add methods , there is no need to implement those methods
        // again in the class.
        accessimage(); // we can access private methods like this.
        System.out.println("You can also enable voice assist system");
    }
}
interface camera{
    void takingsnap();
    void modes();
    default void flashlight(){
        System.out.println("Click to on flashlight");
    }
}
interface mediaplayer{
    void playmusic();
    void addtoqueue();
    default void pp(){
        System.out.println("Play/Pause");
    }
}
class cellphone {
    public void call(String name) {
        System.out.println("Calling to...." + name);
    }

    public void recieving() {
        System.out.println("call from...");
    }

    public String[] contacts() {
        String[] contactlist = {"John", "Fox", "Bob"};
        return contactlist;
    }
}

    class smartphone1 extends cellphone implements gps,camera,mediaplayer{
        public void softwareupdate(){
            System.out.println("kindly install the latest security patch");
        }
      public void location(){
          System.out.println("Enter your pick-up and destination point");
        }
        public void gps(){
            System.out.println("Kindly on gps");
        }

        public void takingsnap(){
            System.out.println("Click on for taking the snap");
        }
        public void modes(){
            System.out.println("3 modes are provided in the camera");
        }
        public void  playmusic(){
            System.out.println("Select any music to play");
        }
        public void addtoqueue(){
            System.out.println("choose the music you want add in queue");
        }
//        public void voiceassist(){
//            System.out.println(" enabled voice assist system");
//        }
    }

public class CH11_default_methods_in_interface {
    public static void main(String[] args) {
        smartphone1 sp = new smartphone1();
//        sp.softwareupdate();
//        sp.location();
//        sp.gps();
//        sp.takingsnap();
//        sp.modes();
//        sp.playmusic();
//        sp.addtoqueue();
//        sp.voiceassist();
//        sp.pp();
//        sp.flashlight();
//        String[] arr = sp.contacts();
//        for(String contact:arr){
//            System.out.println(contact);
//        }
//        sp.accessimage(); // we can't access private methods from the class , so we
        // can access it from default methods by adding private method's variable in the default methods
//          sp.voiceassist();


    }
}
