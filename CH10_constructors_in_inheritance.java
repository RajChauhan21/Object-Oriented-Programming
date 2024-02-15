package Object_Oriented_programming;

class base1{
    public int q;
    public int r;
    public int s;
    base1(){
        System.out.println("I am a Object_Oriented_programming.base1 class constructor");
    }
    base1(int r){
        System.out.println("I am a overloaded Object_Oriented_programming.base1 class constructor " + r);
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}

class power extends base1{
    public int z;
    public power(){
        super(7); // If i want to call overloaded const(Object_Oriented_programming.base1) and default const(Object_Oriented_programming.power) , so 'super'
        // keyword will be used in default const(Object_Oriented_programming.power) in the Object_Oriented_programming.power class.
        System.out.println("I am Object_Oriented_programming.power class constructor");
    }
    public power(int r,int s){ // If I want to call both class overloaded const. 'super' keyword will be used
        // in the overloaded const.(Object_Oriented_programming.power) in the Object_Oriented_programming.power class
        super(r);
        System.out.println("I am a overloaded Object_Oriented_programming.power class constructor  " + s );
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

class power1 extends power{
    int a;
    public power1(){
        super(3,6);
        System.out.println("I am a child of Object_Oriented_programming.power class");
    }

    public power1(int r,int s,int a){
        super(r,s);
        System.out.println("I am a overloaded Object_Oriented_programming.power1 class constructor " + a);
    }
}

public class CH10_constructors_in_inheritance {
    public static void main(String[] args) {
//        Object_Oriented_programming.base1 mum = new Object_Oriented_programming.base1();
//        Object_Oriented_programming.power pr = new Object_Oriented_programming.power(8,21);
        power1 cr = new power1(1,2,3);



    }
}
