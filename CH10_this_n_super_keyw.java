package Object_Oriented_programming;

// this keyword
class autom{
    int x;
    int y;
    public autom(){
        x = 21;
    }
    public autom(int x){
        System.out.println("I am a Object_Oriented_programming.autom class over loaded constructor " + x);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int met(int a , int b){
        System.out.println("I am a method from Object_Oriented_programming.autom class");
        int z = a + b;
        return z;
    }

    public int getX() {
        return x;
    }
}
// super keyword
class sup extends autom{ //using super keyword for accessing contructors
    public sup(){
        super(3);
        System.out.println("I am a Object_Oriented_programming.sup default constructor");
    }
    public sup(int x, int y){
        super(x);
        System.out.println("I am a Object_Oriented_programming.sup class overloaded constructor " + y);
    }
}

class AI{ //using super keyword for accessing methods
    public void Intelli(){
        System.out.println("Hello intellij idea");
    }
}
class ML extends AI{
    public void Intelli(){
        super.Intelli();
        System.out.println("intellij idea");
    }
    public void ML(){
        System.out.println("Hello ML");
    }
}


public class CH10_this_n_super_keyw {
    public static void main(String[] args) {
//        Object_Oriented_programming.sup ra = new Object_Oriented_programming.sup();
//        autom xr = new autom();
//        xr.setX(21);
//        System.out.println(xr.getX());
        ML cr = new ML();
        cr.Intelli();


    }
}
