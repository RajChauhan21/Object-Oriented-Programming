package Object_Oriented_programming;

class A {    //method overriding means when a particular method from a class is present in another class
    // exact same is known as method overriding. Note - Even arguments should be same otherwise it will be
    // termed as method overloading.
    public void Fr(int a){
        System.out.println("1st method from class Object_Oriented_programming" + a);
    }

}

class B extends A {
    @Override
    public void Fr(int a){
        super.Fr(7); // now along with sub class's method the super class's method will
        //also br executed
        System.out.println("Hello!" + a);

    }
}

public class CH10_method_overriding {
    public static void main(String[] args) {
        B b = new B(); // in M.O always the sub class's method will be executed neither super
        //class's. we can use super K/W to access both the methods present in super and sub classes
        A a = new A();
        b.Fr(21);

    }
}
